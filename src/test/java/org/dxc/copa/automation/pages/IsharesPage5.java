package org.dxc.copa.automation.pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.apache.commons.io.IOUtils;
import org.dxc.copa.automation.base.Passenger;
import org.dxc.copa.automation.base.TestBase;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.dxc.copa.automation.common.GenericLib;
import org.dxc.copa.automation.constants.GlobalConstants;
import org.dxc.copa.automation.util.DateUtil;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;

public class IsharesPage5 extends TestBase {

    GlobalConstants globalConstants;
    GenericLib gl;
    IsharesPage5.IsharesPageObjects5 isharesPageObjects5;

    IsharesPage1 isharesPage1;
    IsharesPage2 isharesPage2;
    IsharesPage3 isharesPage3;
    IsharesPage4 isharesPage4;

    String saveAndRetrieve = "6P#ER";
    String ignoreAndRetrieve = "IR";
    String checkPnrHistory = "*EH";
    String checkTicketStatus = "*ET";
    String endAndretrieve = "ER";
    String baseUrlTPFSC ="http://uat-emd-ws-lbi.dxctravel.svcs.entsvcs.com:19701";
    String baseUrlTPFSB ="http://uat-emd-ws-lbi.dxctravel.svcs.entsvcs.com:19501";
    String emdGenerationUrl ="/AirlineSOA/IssueEMDService/21/08/IssueEMD.svc";
    String temp_requestPath = System.getProperty("user.dir")+"\\src\\test\\java\\org\\dxc\\copa\\automation\\common\\"+Thread.currentThread().getName()+"_temp_Request.xml";
    String temp_responsePath = System.getProperty("user.dir")+"\\src\\test\\java\\org\\dxc\\copa\\automation\\common\\"+Thread.currentThread().getName()+"_temp_Response.xml";

    public IsharesPage5() {
        globalConstants = new GlobalConstants();
        gl = new GenericLib(getDriver());
        isharesPageObjects5 = new IsharesPage5.IsharesPageObjects5();
        isharesPage1 = new IsharesPage1();
        isharesPage2 = new IsharesPage2();
        isharesPage3 = new IsharesPage3();
        isharesPage4 = new IsharesPage4();
        PageFactory.initElements(getDriver(), isharesPageObjects5);
    }

    public void generateTicketDocumentNos(ExtentTest logInfo)
    {
        try {

            ArrayList<Passenger> passengers = mPassengers.get(getDriverID());
            BufferedWriter writer ;

            gl.logCommand(logInfo, "*"+passengers.get(0).getPnr());
            gl.sendCmdValidateResponse("*"+passengers.get(0).getPnr(), passengers.get(0).getPnr(), logInfo);

            String[] responseAsRows = isharesPageObjects5.SHARES_RESPONSE.getText().split("\n");
            String dateOfIssue="";
            String departureTime="";
            String arrivalTime="";

            String dutyCodeRegex = "\\sPR\\b";
            String agentLoginRegex = "\\sSH\\b";

            Pattern dutyCodePattern = Pattern.compile(dutyCodeRegex);
            Pattern agentLoginPattern = Pattern.compile(agentLoginRegex);

            for(String row : responseAsRows)
            {
                Matcher matcher1 = dutyCodePattern.matcher(row);
                Matcher matcher2 = agentLoginPattern.matcher(row);

                if(matcher1.find() && matcher2.find())
                {
                   int index = row.lastIndexOf("SH")+3;
                   dateOfIssue=row.substring(index,index+5);
                }

                if(row.contains(passengers.get(0).getSegmentFlight(0)))
                {
                   String[] flightTimes =row.substring(31).replace("\n","").trim().split("\\s+");
                   departureTime=flightTimes[0]!=null?flightTimes[0].replaceAll("[A-Z]",""):"NotFound";
                   arrivalTime=flightTimes[1]!=null?flightTimes[1].replaceAll("[A-Z]",""):"NotFound";
                   break;
                }
            }

            if(!departureTime.equalsIgnoreCase("NotFound") && !arrivalTime.equalsIgnoreCase("NotFound"))
            {
                departureTime=String.format("%4s", departureTime).replace(' ', '0');
                arrivalTime=String.format("%4s", arrivalTime).replace(' ', '0');

                departureTime = gl.plusDaysFromTodayYYYYMMdd(passengers.get(0).getSegmentDate(0))+"T"+
                        departureTime.substring(0, 2)+":"+departureTime.substring(2, 4)
                        +":00";
                arrivalTime = gl.plusDaysFromTodayYYYYMMdd(passengers.get(0).getSegmentDate(0))+"T"+
                        arrivalTime.substring(0, 2)+":"+arrivalTime.substring(2, 4)
                        +":00";
            }


            String formattedInput = dateOfIssue.substring(0, 3) +
                    dateOfIssue.substring(3).toLowerCase(Locale.ENGLISH);
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("ddMMM", Locale.ENGLISH);
            MonthDay monthDay = MonthDay.parse(formattedInput, inputFormatter);
            LocalDate date = monthDay.atYear(LocalDate.now().getYear());
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDateOfIssue = date.format(outputFormatter);


            for(Passenger passenger: passengers)
            {

                UpdatePayload(passenger,formattedDateOfIssue,departureTime,arrivalTime);

                FileInputStream fileInputStream = new FileInputStream(temp_requestPath);
                String SOAPRequest= IOUtils.toString(fileInputStream, StandardCharsets.UTF_8);
                SOAPRequest = SOAPRequest.substring(SOAPRequest.indexOf('>') + 1);
                fileInputStream.close();
                logInfo.info(MarkupHelper.createCodeBlock("SOAP Request: "+SOAPRequest, CodeLanguage.XML));

                Response response;
                if(globalConstants.testEnv.equalsIgnoreCase("sharesCURL"))
                     response = gl.sendPostRequest(baseUrlTPFSC,emdGenerationUrl);
                else
                     response = gl.sendPostRequest(baseUrlTPFSB,emdGenerationUrl);

                logInfo.info(MarkupHelper.createCodeBlock("SOAP Response: "+response.asPrettyString(), CodeLanguage.XML));

                writer = new BufferedWriter(new FileWriter(temp_responsePath));
                writer.write(response.asPrettyString());
                writer.close();

                String ticketDocumentNumber="tktDocNo_notFound";
                if(gl.GetTagTextatIndex("Error",temp_responsePath,0)!=null &&
                        gl.GetTagTextatIndex("Error",temp_responsePath,0).contains("NO MATCH FOUND"))
                    ticketDocumentNumber = gl.GetTagTextatIndex("Error",temp_responsePath,0);
                else if(gl.GetTagTextatIndex("Warning",temp_responsePath,0)!=null &&
                        gl.GetTagTextatIndex("Warning",temp_responsePath,0).contains("Ticket not found"))
                    ticketDocumentNumber = gl.GetTagTextatIndex("Warning",temp_responsePath,0);
                else if(gl.GetAttributeValueatIndex("TicketNumber","TicketDocumentNbr",temp_responsePath,0)!=null) {
                    ticketDocumentNumber = gl.GetAttributeValueatIndex("TicketNumber", "TicketDocumentNbr", temp_responsePath, 0);
                    passenger.setTicketDocumentNumber(ticketDocumentNumber);
                }

                logInfo.info(MarkupHelper.createLabel("The Ticket Document Number for pax: "+passenger.getFullName()
                        +" is: "+ticketDocumentNumber, ExtentColor.BLACK));
                System.out.println("Ticket Document Number: "+ticketDocumentNumber);
            }

        } catch (Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        finally {

            File requestFile = new File(temp_requestPath);

            if (requestFile.exists()) {
                boolean deleted= requestFile.delete();
                System.out.println("Request file "+Thread.currentThread().getName()+" deleted: " +deleted );

            } else {
                System.out.println("Request file not found: "+Thread.currentThread().getName());
            }

            File responseFile = new File(temp_responsePath);

            if (responseFile.exists()) {
                boolean deleted = responseFile.delete();
                System.out.println("Response file "+Thread.currentThread().getName()+" deleted: " +deleted );
            } else {
                System.out.println("Response file not found: "+Thread.currentThread().getName());
            }
        }
    }

    public void UpdatePayload(Passenger pax,String dateOfIssue,String departureDate,String arrivalDate) throws IOException, ParserConfigurationException, SAXException, TransformerException
    {

        String filepath1 =".\\src\\test\\resources\\xmlFiles\\generateDocNumber.xml";
        
        gl.updateAttributeValueatIndex("BookingTicketingRefID","ID",pax.getPnr(),filepath1,0);
        gl.updateAttributeValueatIndex("Name","Code",pax.getPaxType(),temp_requestPath, 0);

        gl.updateAttributeValueatIndex("DepartureAirport","LocationCode",pax.getSegmentOriginCity(0),temp_requestPath, 0);
        gl.updateAttributeValueatIndex("ArrivalAirport","LocationCode",pax.getSegmentDestinationCity(0),temp_requestPath, 0);

        gl.SetTagtextatIndex("GivenName",pax.getlName(),temp_requestPath,0);
        gl.SetTagtextatIndex("Surname",pax.getfName(),temp_requestPath,0);

        gl.updateAttributeValueatIndex("TicketDocument","TicketDocumentNbr",pax.getTicketNumber().substring(0,pax.getTicketNumber().length()-1),temp_requestPath, 0);
        gl.updateAttributeValueatIndex("CouponInfo","InConnectionDocNbr",pax.getTicketNumber().substring(0,pax.getTicketNumber().length()-1),temp_requestPath, 0);
        gl.updateAttributeValueatIndex("TicketDocument","DateOfIssue",dateOfIssue,temp_requestPath, 0);
        gl.updateAttributeValueatIndex("SoldAirlineInfo","DepartureDateTime",departureDate,temp_requestPath, 0);
        gl.updateAttributeValueatIndex("SoldAirlineInfo","ArrivalDateTime",arrivalDate,temp_requestPath, 0);
        gl.updateAttributeValueatIndex("SoldAirlineInfo","FlightNumber",pax.getSegmentFlight(0),temp_requestPath, 0);
        gl.updateAttributeValueatIndex("TicketDocument","TicketDocumentNbr",pax.getTicketNumber().substring(0,pax.getTicketNumber().length()-1),temp_requestPath, 1);
    }

    public void paxinfodisplay(ExtentTest logInfo) {
        try {
            gl.ignoreTRNS(logInfo);

//              	6:LD711/11JULPTY-PAX/TEST/ONE
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String date = gl.sharesFormatDateFromGUI(pax.getSegmentDate(0));

            String paxList = "6:LD" + pax.getSegmentFlight(0) + "/" + date + pax.getSegmentOriginCity(0) + "-PAX"+"/"+ pax.getlName()+"/"+pax.getfName() ;
            gl.logCommand(logInfo, paxList);
            gl.sendCmdValidateResponse(paxList, pax.getPnr(),pax.getfName(), pax.getlName(), logInfo);
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void toUpdateTimeForFLIFOInNativeShares(ExtentTest logInfo) {

        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String flightNo = pax.getSegmentFlight(0);
            String startDate = gl.sharesFormatDateFromGUI(pax.getSegmentDate(0));
            String originCity = pax.getSegmentOriginCity(0);

            String checkQueueList = "2P" + flightNo + " / " + startDate + " RR " + originCity + " " + pax.getDepartureFlightTimeAfterChanging() + "P";
            sendCmdToNativeSharesValidateResponsetoGetDetailsOfFlight(checkQueueList, "*", logInfo);
            Thread.sleep(5000);
            logInfo.info("And i enter "+checkQueueList+" command");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            checkQueueList = "2P" + flightNo + "/" + startDate + " ETD " + originCity + " " + pax.getDepartureFlightTimeAfterChanging() + "P";
            sendCmdToNativeSharesValidateResponsetoGetDetailsOfFlight(checkQueueList, "*", logInfo);
            logInfo.info("And i enter "+checkQueueList+" command");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public void toGetDetailsOfFlightInNativeShares(ExtentTest logInfo) {
        try{

            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String checkQueueList = "2" + pax.getSegmentFlight(0);
            String expectedText="GTD  "+pax.getGateNumber();
            logInfo.info("And I enter "+checkQueueList+" command");
            sendCmdToNativeSharesValidateResponsetoGetDetailsOfFlight(checkQueueList,expectedText,"GTD",logInfo);
            String response = isharesPageObjects5.NATIVE_SHARES_RESPONSE_VALIDATE_FLIGHT_DETAILS_RESPONSE.getText();
            int time=0;
            String[] res=response.split("\n");
            for(String s1: res) {
                if(s1.contains("SKED")) {
                    String[] var = s1.split(" ");
                    for (String s : var) {
                        if (!s.isEmpty()) {
                            if (!(s.equals("ORIG") || s.equals("SKED") || s.equals(pax.getSegmentOriginCity(0)))) {
                                String segment = s.trim();
                                String value = segment.substring(0, segment.length() - 1);
                                time = Integer.parseInt(value) + 10;
                                String str = String.valueOf(time);
                                String x = str.substring(str.length() - 2);
                                int z = Integer.parseInt(x);
                                int y = 58;
                                if (z > y) {
                                    time = time - 42;
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
            }
            pax.setDepartureFlightTimeAfterChanging(time);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    public void deleteReverseCodeshareTable(ExtentTest logInfo, String carrier) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            //        Q*CODESHARE$D/P.XY
            String command = "Q*CODESHARE$D/P." + carrier;
            gl.logCommand(logInfo, command);
            gl.sendCmdValidateResponse(command, "ITEM DELETED","ITEM NOT FOUND", logInfo);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void enterOUTCommandINNativeShares(ExtentTest logInfo) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String flightNo = pax.getSegmentFlight(0);
            String startDate = gl.sharesFormatDateFromGUI(pax.getSegmentDate(0));
            String originCity = pax.getSegmentOriginCity(0);

            String checkQueueList = "2P" + flightNo + "/" + startDate + " OUT " + originCity + " " + pax.getArrivalFlightTimeAfterChanging() + "P";
            isharesPage2.sendCmdToNativeSharesValidateResponse(checkQueueList, "*", logInfo);
            Thread.sleep(5000);
            logInfo.info("And i enter "+checkQueueList+" command");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void assignGateNumberForArrivalOrDepartureInNativeShares(ExtentTest logInfo, String gateNo, String time) {
        try{
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String flightNo = pax.getSegmentFlight(0);

            if(time.equalsIgnoreCase("DepartureTime")){
                String checkQueueList = "6-FM3@"+ flightNo+ "GTD"+gateNo;
                logInfo.info("And I enter "+checkQueueList+ " command");
                isharesPage2.sendCmdToNativeSharesValidateResponse(checkQueueList,gateNo,"CHECK-IN DETAILS",logInfo);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                pax.setDepartureFlightGateNumber(gateNo);
            }

            else if(time.equalsIgnoreCase("ArrivalTime")){
                String checkQueueList = "6-FM3@"+ flightNo+ "GTA"+gateNo;
                logInfo.info("And I enter "+checkQueueList+ " command");
                isharesPage2.sendCmdToNativeSharesValidateResponse(checkQueueList,gateNo,"CHECK-IN DETAILS",logInfo);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                pax.setArrivalFlightGateNumber(gateNo);
            }

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void retrievePNRInNativeSharesAndValidateSSRIsAdded(ExtentTest logInfo, String SSR) {
        try {
            isharesPageObjects5.NATIVE_SHARES_CLEAR_ALL.click();
            gl.waitProgress();

            Passenger pax= mPassengers.get(getDriverID()).get(0);
            gl.logCommand(logInfo,"*" + pax.getPnr());

            String command = "*" + pax.getPnr();
            isharesPage2.sendCmdToNativeSharesValidateResponse(command);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String xpathSSR =String.format( "//div[@ng-repeat='nativeData in nativeShareData.data track by $index']/pre[contains(text(), '%s')]",SSR);
            List<WebElement> SSR_ELEMENT = driver.get().findElements(By.xpath(xpathSSR));
            String xpathlines ="//div[@ng-repeat='nativeData in nativeShareData.data track by $index']";
            List<WebElement> ALL_LINES = driver.get().findElements(By.xpath(xpathlines));
            for(int i=0;i<ALL_LINES.size();i++)
            {
                WebElement lines = ALL_LINES.get(i);
                if(i==ALL_LINES.size()/2) {
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    gl.scrollToWebElement(lines);
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }

                if(i==ALL_LINES.size()-1) {
                    gl.scrollToWebElement(lines);
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }
            }

            if (gl.existElement(SSR_ELEMENT)) {
                for (WebElement element : SSR_ELEMENT) {
                    String line = element.getText();
                    gl.scrollToWebElement(element);

                    logInfo.info(MarkupHelper.createLabel("The added SSR is available and the line is: " + line, ExtentColor.GREEN));
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }
            }
            else {
                Assert.fail("The Added SSR is not available in the PNR");
            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void addFQTV_Gold(String FQTVCount) throws IOException, ParseException {
//    NOTE: LIMIT OF ADDING FQTV PAX IS 5

        int fqtvCount = Integer.parseInt(FQTVCount);

        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(".\\src\\test\\resources\\jsonfiles\\frequentFlyer_Gold_Details.json");
        Object obj = jsonParser.parse(reader);

        JSONArray fqtvList = (JSONArray) obj;

        ArrayList<String> Gender = new ArrayList<>();
        Gender.add("Male");
        Gender.add("Female");
        Random random = new Random();

        Faker faker = new Faker(new Locale("en-US"));
        Passenger pax;

        for (int i = 0; i < fqtvCount; i++) {
            JSONObject fqtvPassenger = (JSONObject) fqtvList.get(i); // Fetching ith JSON Object From the JSON List in JSON FIle
            JSONObject fqtvPAX = (JSONObject) fqtvPassenger.get("FrequentFlyer"); //Name of the JSON OBJECT in the LIST

            pax = new Passenger();

            pax.setfName(((String) fqtvPAX.get("firstName")).toUpperCase());

            pax.setlName(((String) fqtvPAX.get("surName")).toUpperCase());

            String phoneNumber = faker.phoneNumber().cellPhone().replaceAll("[^a-zA-Z0-9]", "");
            phoneNumber = phoneNumber.substring(3);
            pax.setPhoneNumber(phoneNumber);

            pax.setFFNumber((String) fqtvPAX.get("FFNumber"));
            pax.setDOB(gl.generateDateOfBirthNew("ADT"));
            pax.setEmail("testone@testone.com");
            pax.setGender(Gender.get(random.nextInt(Gender.size())));
            pax.setCountryCode("US");
            pax.setAreaCode("123");
            pax.setDocNumber(faker.regexify("[A-Z]{2}[0-9]{6}"));
            pax.setPaxType("FQTV");

            mPassengers.get(getDriverID()).add(pax);
        }
    }

    public void changePaxStatusFromHKNToVOLForAdultPassengers(ExtentTest logInfo) {
        try {
            ArrayList<Passenger> passengers = mPassengers.get(getDriverID());

//               6:DV.DI413/06MARPTY-BB/DEMO/TEST

            String command = "6:DV.DI" + passengers.get(0).getSegmentFlight(0) + "/" + gl.sharesFormatDateFromGUI(passengers.get(0).getSegmentDate(0))
                    + passengers.get(0).getSegmentOriginCity(0) + "-" + passengers.get(0).getfName()+"/"+passengers.get(0).getlName();


            gl.logCommand(logInfo, command);
            gl.sendCmdValidateResponse(command, "PASSENGER STATUS CHANGED FROM HKN TO VOL", "GENERAL  INFORMATION", logInfo);

            if (isharesPageObjects5.SHARES_RESPONSE.getText().contains("GENERAL  INFORMATION")) {

                for (int j = 0; j < passengers.size(); j++) {

                    String ADCInfo = isharesPageObjects5.SHARES_RESPONSE.getText();
                    String completedADCInfo = "";

                    for (int i = 1; i < ADCInfo.split("\n").length - 1; i++) {
                        completedADCInfo = completedADCInfo + ADCInfo.split("\n")[i] + "\n";
                    }
                    completedADCInfo = completedADCInfo.substring(1, completedADCInfo.length() - 1);

                    isharesPageObjects5.FORMSIZE_DROPDOWN.click();
                    isharesPageObjects5.FORMSIZE_SELECT24.click();

                    gl.logCommand(logInfo, completedADCInfo);
                    System.out.println("BaseCommand " + completedADCInfo);
                    gl.copyCmdToClipboardAndPaste(completedADCInfo, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                    isharesPageObjects5.SEND_ISHARES.click();
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }

                String response = isharesPageObjects5.SHARES_RESPONSE.getText();
                gl.logResponse(logInfo, response);
                Assert.assertTrue(response.contains("PASSENGER STATUS CHANGED FROM HKN TO VOL"));

            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }



    public void enterMultiListCommandForMultipleItemsForSpecialGradeType(ExtentTest logInfo,String response,String PNR,Passenger pax,String GradeType)
    {
        try
        {
            //Capturing ID for the PNR
            int index = response.indexOf(PNR);
            String indexVal = response.substring((index - 27), (index - 24)).trim();

            if (GradeType.equalsIgnoreCase("GI")) {
                //6:LGI-203.Y
                String MultiListCmd = "6:LGI-" + indexVal + "." + pax.getCOS() + "\n" + "B0";
                gl.logCommand(logInfo, MultiListCmd);
                gl.copyCmdToClipboardAndPaste(MultiListCmd, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);
            } else if (GradeType.equalsIgnoreCase("GV")) {
                String MultiListCmd = "6:LGV-" + indexVal + ".M" + "\n" + "B0";
                gl.logCommand(logInfo, MultiListCmd);
                gl.copyCmdToClipboardAndPaste(MultiListCmd, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);
            } else if (GradeType.equalsIgnoreCase("R")) {
                String MultiListCmd = "6:LGV-" + indexVal + ".M" + "\n" + "B0";
                gl.logCommand(logInfo, MultiListCmd);
                gl.copyCmdToClipboardAndPaste(MultiListCmd, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);
            } else if (GradeType.equalsIgnoreCase("SX")) {
                String MultiListCmd = "6:LSX-" + indexVal + "\n" + "B0";
                gl.logCommand(logInfo, MultiListCmd);
                gl.copyCmdToClipboardAndPaste(MultiListCmd, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);
            }

            isharesPageObjects5.SEND_ISHARES.click();
            gl.waitForProfileLoad();
            gl.logResponse(logInfo,isharesPageObjects5.SHARES_RESPONSE.getText());
            gl.scrollPageDown();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void enterMultiListCommand(ExtentTest logInfo,String response,String PNR,String BagCount)
    {
        try
        {
            //Capturing ID for the PNR
            int index = response.indexOf(PNR);
            String indexVal = response.substring((index - 27), (index - 24)).trim();

            String MultiListCmd = "6:LK-" + indexVal + "\n" + BagCount; // Selected pax with ID
            gl.logCommand(logInfo, MultiListCmd);
            gl.copyCmdToClipboardAndPaste(MultiListCmd, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

            isharesPageObjects5.SEND_ISHARES.click();
            gl.waitForProfileLoad();
            gl.logResponse(logInfo,isharesPageObjects5.SHARES_RESPONSE.getText());
            gl.scrollPageDown();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void addAPISDetailsSameSurname(ExtentTest logInfo,int i)
    {
        try
        {
            isharesPageObjects5.FORMSIZE_DROPDOWN.click();
            isharesPageObjects5.FORMSIZE_SELECT24.click();

            //**** PRIMARY DOCUMENT DETAILS*****
            String IncompleteADCInfo;
            if(globalConstants.testEnv.equalsIgnoreCase("sharesCURL") || globalConstants.testEnv.equalsIgnoreCase("sharesD3URL"))
                IncompleteADCInfo = isharesPageObjects5.SHARES_RESPONSE.getText();
            else
                IncompleteADCInfo = isharesPageObjects5.INPUT_TEXT_AREA_ROWS24.getText();

            System.out.println(IncompleteADCInfo);

            String CompleteADCInfo = isharesPage2.add_PrimaryADC(IncompleteADCInfo, i);
            System.out.println(CompleteADCInfo);

            while (!isharesPage2.validatePrimaryADCMultiInitial(CompleteADCInfo, logInfo,i))  //to check Primary details are entered properly or not
            {
                CompleteADCInfo = isharesPage2.reformPrimaryADC(i);

            }

            gl.waitForProfileLoad();
            logInfo.pass("Primary Document Details entered for "+mPassengers.get(getDriverID()).get(i).getFullName());

//                   **** SECONDARY DOCUMENT DETAILS  ****

            if (isharesPageObjects5.SHARES_RESPONSE.getText().contains("DOCTYPE: P-PASSPORT")
                    || isharesPageObjects5.SHARES_RESPONSE.getText().contains("DOCUMENT INFORMATION"))
            {
                String IncompleteDoctypeInfo_Adult;
                if (globalConstants.testEnv.equalsIgnoreCase("sharesCURL") || globalConstants.testEnv.equalsIgnoreCase("sharesD3URL"))
                    IncompleteDoctypeInfo_Adult = isharesPageObjects5.SHARES_RESPONSE.getText();
                else
                    IncompleteDoctypeInfo_Adult = isharesPageObjects5.INPUT_TEXT_AREA_ROWS24.getText();

                System.out.println("IncompleteDoctypeInfo_Adult : \n" + IncompleteDoctypeInfo_Adult + "\n");
                String CompleteDoctypeInfo_Adult = isharesPage2.add_SecondaryADC(IncompleteDoctypeInfo_Adult);
                System.out.println("CompleteDoctypeInfo_Adult : \n" + CompleteDoctypeInfo_Adult + "\n");

                while (!isharesPage2.validateSecondaryADCMultiInitial(CompleteDoctypeInfo_Adult, logInfo,i)) {
                    CompleteDoctypeInfo_Adult = isharesPage2.reformSecondaryADC();
                }

                logInfo.pass("Secondary Document Details entered for :" +mPassengers.get(getDriverID()).get(i).getFullName());
            }

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void doTheVoluntaryGradeOfSharesPNRMultiInitial(ExtentTest logInfo, String GradeType) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String origin = pax.getSegmentOriginCity(0);
            boolean repeatTrns;
            gl.ignoreTRNS(logInfo);
            repeatTrns = true;

            //                ***** Entering Base command *****
            while (repeatTrns) {

                if (GradeType.equalsIgnoreCase("GI")) {
                    gl.logCommand(logInfo, isharesPage2.addGICmd(origin, 0));
                    gl.copyCmdToClipboardAndPaste(isharesPage2.addGICmd(origin, 0), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                } else if (GradeType.equalsIgnoreCase("GV")) {
                    gl.logCommand(logInfo, isharesPage2.addGVCmd(origin, 0));
                    gl.copyCmdToClipboardAndPaste(isharesPage2.addGVCmd(origin, 0), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                } else if (GradeType.equalsIgnoreCase("SX")) {
                    gl.logCommand(logInfo, isharesPage2.addSXCmd(origin, 0));
                    gl.copyCmdToClipboardAndPaste(isharesPage2.addSXCmd(origin, 0), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);
                }

                isharesPageObjects5.SEND_ISHARES.click();
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                String response = isharesPageObjects5.SHARES_RESPONSE.getText();
                gl.logResponse(logInfo, response);

                if (response.contains("NOT OPEN")) {
                    isharesPage2.openFlight(logInfo, pax.getSegmentFlight(0), gl.sharesFormatDateFromGUI(pax.getSegmentDate(0)), origin);
                    gl.ignoreTRNS(logInfo);
                } else if (response.contains("PASSENGER DISPLAY") || response.contains("UNABLE TO RETRIEVE FDR-CHK DATA BASE")) {
                    Assert.fail();
                } else {
                    repeatTrns = false;
                }
            }

            //***********Multiple item error*************//
            String response = isharesPageObjects5.SHARES_RESPONSE.getText();

            if (response.contains("MULTIPLE ITEMS"))
            {

                //Capturing ID for the PNR
                if(pax.getPnr()!=null)
                {
                    enterMultiListCommandForMultipleItemsForSpecialGradeType(logInfo,response,pax.getPnr(),pax,GradeType);
                    for (int i = 0; i < mPassengers.get(getDriverID()).size(); i++)
                        addAPISDetailsSameSurname(logInfo,i);

                    Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"),"Checkin Unsuccessful");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }

                if(pax.getPnr2()!=null)
                {
                    if (GradeType.equalsIgnoreCase("GI")) {
                        gl.logCommand(logInfo, isharesPage2.addGICmd(origin, 0));
                        gl.copyCmdToClipboardAndPaste(isharesPage2.addGICmd(origin, 0), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                    } else if (GradeType.equalsIgnoreCase("GV")) {
                        gl.logCommand(logInfo, isharesPage2.addGVCmd(origin, 0));
                        gl.copyCmdToClipboardAndPaste(isharesPage2.addGVCmd(origin, 0), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                    } else if (GradeType.equalsIgnoreCase("SX")) {
                        gl.logCommand(logInfo, isharesPage2.addSXCmd(origin, 0));
                        gl.copyCmdToClipboardAndPaste(isharesPage2.addSXCmd(origin, 0), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);
                    }

                    isharesPageObjects5.SEND_ISHARES.click();
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    response = isharesPageObjects5.SHARES_RESPONSE.getText();
                    gl.logResponse(logInfo, response);

                    enterMultiListCommandForMultipleItemsForSpecialGradeType(logInfo,response,pax.getPnr2(),pax,GradeType);
                    for (int i = 0; i < mPassengers.get(getDriverID()).size(); i++)
                        addAPISDetailsSameSurname(logInfo,i);
                    Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"),"Checkin Unsuccessful");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                }

            }
            else{
                for (int i = 0; i < mPassengers.get(getDriverID()).size(); i++)
                    addAPISDetailsSameSurname(logInfo,i);
                Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"), "Checkin Unsuccessful");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            }

            mText.put(getDriverID(), isharesPageObjects5.SHARES_RESPONSE.getText());
            isharesPageObjects5.FORMSIZE_DROPDOWN.click();
            isharesPageObjects5.FORMSIZE_SELECT1.click();
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public void doTheVoluntaryGradeOfMultipleSharesPNRForNormalPax(ExtentTest logInfo, String GradeType) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String origin = pax.getSegmentOriginCity(0);
            boolean repeatTrns;
            gl.ignoreTRNS(logInfo);


            for (int i = 0; i < mPassengers.get(getDriverID()).size(); i++) {

                repeatTrns = true;

                //                ***** Entering Base command *****
                while (repeatTrns) {

                    if (GradeType.equalsIgnoreCase("GI")) {
                        gl.logCommand(logInfo, isharesPage2.addGICmd(origin, i));
                        gl.copyCmdToClipboardAndPaste(isharesPage2.addGICmd(origin, i), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                    } else if (GradeType.equalsIgnoreCase("GV")) {
                        gl.logCommand(logInfo, isharesPage2.addGVCmd(origin, i));
                        gl.copyCmdToClipboardAndPaste(isharesPage2.addGVCmd(origin, i), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                    } else if (GradeType.equalsIgnoreCase("SX")) {
                        gl.logCommand(logInfo, isharesPage2.addSXCmd(origin, i));
                        gl.copyCmdToClipboardAndPaste(isharesPage2.addSXCmd(origin, i), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);
                    }

                    isharesPageObjects5.SEND_ISHARES.click();
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    String response = isharesPageObjects5.SHARES_RESPONSE.getText();
                    gl.logResponse(logInfo, response);

                    if (response.contains("NOT OPEN")) {
                        isharesPage2.openFlight(logInfo, pax.getSegmentFlight(0), gl.sharesFormatDateFromGUI(pax.getSegmentDate(0)), origin);
                        gl.ignoreTRNS(logInfo);
                    } else if (response.contains("PASSENGER DISPLAY") || response.contains("UNABLE TO RETRIEVE FDR-CHK DATA BASE")) {
                        Assert.fail();
                    } else {
                        repeatTrns = false;
                    }
                }

                //***********Multiple item error*************//
                String response = isharesPageObjects5.SHARES_RESPONSE.getText();

                if (response.contains("MULTIPLE ITEMS"))
                {

                    //Capturing ID for the PNR
                    if(pax.getPnr()!=null)
                    {
                        enterMultiListCommandForMultipleItemsForSpecialGradeType(logInfo,response,pax.getPnr(),pax,GradeType);

                        if(isharesPageObjects5.SHARES_RESPONSE.getText().contains("INVALID DELIMITER"))
                            enterMultiListCommandForMultipleItemsForSpecialGradeType(logInfo,response,pax.getPnr(),pax,GradeType);

                        if(isharesPageObjects5.SHARES_RESPONSE.getText().contains("GENERAL  INFORMATION"))
                        {
                            isharesPage4.addAPISDetails(logInfo,i);
                            Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"),"Checkin Unsuccessful");
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                        }
                        else if (isharesPageObjects5.SHARES_RESPONSE.getText().contains("PAX ALREADY CHECKED IN"))
                            logInfo.info(MarkupHelper.createLabel("PAX ALREADY CHECKED IN", ExtentColor.PURPLE));

                    }

                    if(pax.getPnr2()!=null)
                    {
                        if (GradeType.equalsIgnoreCase("GI")) {
                            gl.logCommand(logInfo, isharesPage2.addGICmd(origin, 0));
                            gl.copyCmdToClipboardAndPaste(isharesPage2.addGICmd(origin, 0), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                        } else if (GradeType.equalsIgnoreCase("GV")) {
                            gl.logCommand(logInfo, isharesPage2.addGVCmd(origin, 0));
                            gl.copyCmdToClipboardAndPaste(isharesPage2.addGVCmd(origin, 0), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                        } else if (GradeType.equalsIgnoreCase("SX")) {
                            gl.logCommand(logInfo, isharesPage2.addSXCmd(origin, 0));
                            gl.copyCmdToClipboardAndPaste(isharesPage2.addSXCmd(origin, 0), isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);
                        }

                        isharesPageObjects5.SEND_ISHARES.click();
                        gl.waitForProfileLoad();
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                        response = isharesPageObjects5.SHARES_RESPONSE.getText();
                        gl.logResponse(logInfo, response);

                        enterMultiListCommandForMultipleItemsForSpecialGradeType(logInfo,response,pax.getPnr2(),pax,GradeType);

                        if(isharesPageObjects5.SHARES_RESPONSE.getText().contains("INVALID DELIMITER"))
                            enterMultiListCommandForMultipleItemsForSpecialGradeType(logInfo,response,pax.getPnr2(),pax,GradeType);

                        if(isharesPageObjects5.SHARES_RESPONSE.getText().contains("GENERAL  INFORMATION"))
                        {
                            isharesPage4.addAPISDetails(logInfo,i);
                            Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"),"Checkin Unsuccessful");
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                        }
                        else if (isharesPageObjects5.SHARES_RESPONSE.getText().contains("PAX ALREADY CHECKED IN"))
                            logInfo.info(MarkupHelper.createLabel("PAX ALREADY CHECKED IN", ExtentColor.PURPLE));
                    }

                }
            }

            mText.put(getDriverID(), isharesPageObjects5.SHARES_RESPONSE.getText());
            isharesPageObjects5.FORMSIZE_DROPDOWN.click();
            isharesPageObjects5.FORMSIZE_SELECT1.click();

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void performInvoluntaryDeniedBoardingPaxAfterCheckinProcessForAllPaxMultiInitial(ExtentTest logInfo) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String date = gl.sharesFormatDateFromGUI(pax.getSegmentDate(0));
            int[] paxIDs = new int[2];
            boolean repeatTrns;
            String response;

            gl.ignoreTRNS(logInfo);


            repeatTrns = true;

//                6:DV358/10OCTPTY-PERT/NBSDEPP
            for (int a = 0; a < 2; a++)
            {
                while (repeatTrns) {
//
                    String cmd = "6:DV" + pax.getSegmentFlight(0) + "/" + date + pax.getSegmentOriginCity(0) + "-"
                            + mPassengers.get(getDriverID()).get(0).getfName() + "/" + mPassengers.get(getDriverID()).get(0).getlName();
                    gl.logCommand(logInfo, cmd);

                    gl.sendCmdValidateResponse(cmd, "NOT OPEN", "MULTIPLE ITEMS", logInfo);
                    response = isharesPageObjects5.SHARES_RESPONSE.getText();

                    if (response.contains("NOT OPEN")) {
                        isharesPage2.openFlight(logInfo, mPassengers.get(getDriverID()).get(0).getSegmentFlight(0),
                                gl.sharesFormatDateFromGUI(mPassengers.get(getDriverID()).get(0).getSegmentDate(0)), pax.getSegmentOriginCity(0));
                        gl.ignoreTRNS(logInfo);
                    } else if (response.contains("MULTIPLE ITEMS")) {
                        paxIDs = isharesPage4.getPaxIDs(response, 0);
                        repeatTrns = false;
                    } else {
                        repeatTrns = false;
                    }
                }

//                   6:LDV-137
                String command = "6:LDV-" + paxIDs[a];
                gl.logCommand(logInfo, command);
                gl.sendCmdValidateResponse(command, logInfo);
                response = isharesPageObjects5.SHARES_RESPONSE.getText();
                Assert.assertTrue(response.contains("ALREADY ON VOL OVERSOLD LIST") || response.contains("PSGR ADDED TO VOL OVERSOLD LIST")
                        || response.contains("GENERAL  INFORMATION"));


                if (isharesPageObjects5.SHARES_RESPONSE.getText().contains("GENERAL  INFORMATION")) {

                    String ADCInfo = isharesPageObjects5.SHARES_RESPONSE.getText();
                    String completedADCInfo = "";
                    for (int j = 1; j < ADCInfo.split("\n").length - 1; j++) {
                        completedADCInfo = completedADCInfo + ADCInfo.split("\n")[j] + "\n";
                    }
                    completedADCInfo = completedADCInfo.substring(1, completedADCInfo.length() - 1);

                    isharesPageObjects5.FORMSIZE_DROPDOWN.click();
                    isharesPageObjects5.FORMSIZE_SELECT24.click();

                    gl.logCommand(logInfo, completedADCInfo);
                    System.out.println("BaseCommand " + completedADCInfo);
                    gl.copyCmdToClipboardAndPaste(completedADCInfo, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                    isharesPageObjects5.SEND_ISHARES.click();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                    response = isharesPageObjects5.SHARES_RESPONSE.getText();
                    gl.logResponse(logInfo, response);
                    Assert.assertTrue(response.contains("PSGR ADDED TO VOL OVERSOLD LIST"));
                }
            }

            isharesPageObjects5.FORMSIZE_DROPDOWN.click();
            isharesPageObjects5.FORMSIZE_SELECT1.click();

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void searchFlightAvailabilityWithoutBookSeg(ExtentTest logInfo, String Origin, String Destination) {
        String command;

        try {
            //A PTYLAX 10NOV-CM

            String airline = mPassengers.get(getDriverID()).get(0).getAirline(0);

            int departuredate = mPassengers.get(getDriverID()).get(0).getSegmentDate(0);
            String DateFormatted = gl.plusDaysFromTodayNew(departuredate);
            LocalDateTime departureDate = DateUtil.formatToLocalDateTime(DateFormatted, "10:10");
            String departureDateFormatted = DateUtil.formatDateToSharesDateFormat(departureDate.toLocalDate());

            gl.waitForProfileLoad();
            for (int i = 0; i < mPassengers.get(getDriverID()).size(); i++) {
                mPassengers.get(getDriverID()).get(i).setSegmentOriginCity(0, Origin);
                mPassengers.get(getDriverID()).get(i).setSegmentDestinationCity(0, Destination);
                mPassengers.get(getDriverID()).get(i).setSegmentDate(0, departuredate);
            }

            if (airline.equalsIgnoreCase("CM")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted;
            } else if (airline.equalsIgnoreCase("UA")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted + "-" + "UA";
            }
            else if (airline.equalsIgnoreCase("AA")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted + "-" + "AA";
            } else if (airline.equalsIgnoreCase("DL")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted + "-" + "DL";
            }
            else if (airline.equalsIgnoreCase("Redemption")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted + "/" + "R";
            }
            else if (airline.equalsIgnoreCase("AM")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted + "-" + "AM";
            }
            else if (airline.equalsIgnoreCase("TK")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted;
            }else if (airline.equalsIgnoreCase("IB")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted + "-" + "IB";
            }else if (airline.equalsIgnoreCase("G3")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted + "-" + "G3";
            }  else if (airline.equalsIgnoreCase("BA")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted + "-" + "BA";
            } else if (airline.equalsIgnoreCase("LH")) {
                command = "A " + Origin + Destination + " " + departureDateFormatted + "-" + "LH";
            } else {
                command = "A " + Origin + Destination + " " + departureDateFormatted;
            }

            gl.logCommand(logInfo, command);
            gl.sendCmdValidateResponse(command, logInfo);

            gl.waitForProfileLoad();

            String response = isharesPageObjects5.SHARES_RESPONSE.getText();
            gl.checkForErrors(command,response,logInfo);

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sharesCheckinMultiInitial_MultiplePNRs(ExtentTest logInfo, String origin) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            boolean repeatTrns;
            gl.ignoreTRNS(logInfo);
            repeatTrns = true;
            String BagCount="";
            String baseCmd="";

            //                ***** Entering Base command *****
            while (repeatTrns) {

                baseCmd=isharesPage2.addCheckinCmd(origin, 0);
                gl.logCommand(logInfo,baseCmd );
                gl.copyCmdToClipboardAndPaste(baseCmd, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                int BaggageInfo = baseCmd.indexOf("\n") + 1;
                BagCount = baseCmd.substring(BaggageInfo);

                isharesPageObjects5.SEND_ISHARES.click();
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                String response = isharesPageObjects5.SHARES_RESPONSE.getText();
                gl.logResponse(logInfo, response);

                if (response.contains("NOT OPEN")) {
                    isharesPage2.openFlight(logInfo, pax.getSegmentFlight(0), gl.sharesFormatDateFromGUI(pax.getSegmentDate(0)), origin);
                    gl.ignoreTRNS(logInfo);
                } else if (response.contains("PASSENGER DISPLAY") || response.contains("UNABLE TO RETRIEVE FDR-CHK DATA BASE")) {
                    Assert.fail();
                } else {
                    repeatTrns = false;
                }
            }

            //***********Multiple item error*************//
            String response = isharesPageObjects5.SHARES_RESPONSE.getText();

            if (response.contains("MULTIPLE ITEMS"))
            {

                //Capturing ID for the PNR
                if(pax.getPnr()!=null)
                {
                    enterMultiListCommand(logInfo,response,pax.getPnr(),BagCount);
                    for (int i = 0; i < mPassengers.get(getDriverID()).size(); i++)
                        addAPISDetailsSameSurname(logInfo,i);

                    Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"),"Checkin Unsuccessful");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }

                if(pax.getPnr2()!=null)
                {
                    gl.logCommand(logInfo,baseCmd );
                    gl.copyCmdToClipboardAndPaste(baseCmd, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                    isharesPageObjects5.SEND_ISHARES.click();
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    response = isharesPageObjects5.SHARES_RESPONSE.getText();
                    gl.logResponse(logInfo, response);

                    enterMultiListCommand(logInfo,response,pax.getPnr2(),BagCount);
                    for (int i = 0; i < mPassengers.get(getDriverID()).size(); i++)
                        addAPISDetailsSameSurname(logInfo,i);
                    Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"),"Checkin Unsuccessful");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                }

            }
            else{
                for (int i = 0; i < mPassengers.get(getDriverID()).size(); i++)
                    addAPISDetailsSameSurname(logInfo,i);
                Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"), "Checkin Unsuccessful");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            }

            mText.put(getDriverID(), isharesPageObjects5.SHARES_RESPONSE.getText());
            isharesPageObjects5.FORMSIZE_DROPDOWN.click();
            isharesPageObjects5.FORMSIZE_SELECT1.click();
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sharesGOSHOW_PNR_CheckinForMultiplePNRs(ExtentTest logInfo,String checkinType) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String origin = pax.getSegmentOriginCity(0);
            boolean repeatTrns;
            String baseCmd="";
            String BagCount = "";

            for (int i = 0; i < mPassengers.get(getDriverID()).size(); i++) {

                repeatTrns = true;

                //                ***** Entering Base command *****
                while (repeatTrns) {

                    if(checkinType.equalsIgnoreCase("NET"))
                        baseCmd=isharesPage2.addCheckinCmd_GOSHOW_PNR_NET(origin, i);
                    else if(checkinType.equalsIgnoreCase("FET"))
                        baseCmd=isharesPage2.addCheckinCmd_GOSHOW_PNR_FET(origin, i);

                    gl.logCommand(logInfo, baseCmd);
                    gl.copyCmdToClipboardAndPaste(baseCmd, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                    int BaggageInfo = baseCmd.indexOf("\n") + 1;
                    BagCount = baseCmd.substring(BaggageInfo);
                    System.out.println(BagCount + "BagCount");

                    isharesPageObjects5.SEND_ISHARES.click();
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    String response = isharesPageObjects5.SHARES_RESPONSE.getText();
                    gl.logResponse(logInfo, response);

                    if (response.contains("NOT OPEN")) {
                        isharesPage2.openFlight(logInfo, pax.getSegmentFlight(0), gl.sharesFormatDateFromGUI(pax.getSegmentDate(0)), origin);
                        gl.ignoreTRNS(logInfo);
                    } else if (response.contains("PASSENGER DISPLAY") || response.contains("UNABLE TO RETRIEVE FDR-CHK DATA BASE")) {
                        Assert.fail();
                    } else {
                        repeatTrns = false;
                    }
                }

                //***********Multiple item error*************//
                String response = isharesPageObjects5.SHARES_RESPONSE.getText();

                if (response.contains("MULTIPLE ITEMS"))
                {

                    //Capturing ID for the PNR
                    if(pax.getPnr()!=null)
                    {
                        enterMultiListCommand(logInfo,response,pax.getPnr(),BagCount);

                        if(isharesPageObjects5.SHARES_RESPONSE.getText().contains("GENERAL  INFORMATION"))
                        {
                            isharesPage4.addAPISDetails(logInfo,i);
                            Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"),"Checkin Unsuccessful");
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                        }

                    }

                    if(pax.getPnr2()!=null)
                    {
                        gl.logCommand(logInfo, baseCmd);
                        gl.copyCmdToClipboardAndPaste(baseCmd, isharesPageObjects5.FORMSIZE_SELECT2_TEXTAREA);

                        isharesPageObjects5.SEND_ISHARES.click();
                        gl.waitForProfileLoad();
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                        response = isharesPageObjects5.SHARES_RESPONSE.getText();
                        gl.logResponse(logInfo, response);

                        enterMultiListCommand(logInfo,response,pax.getPnr2(),BagCount);

                        if(isharesPageObjects5.SHARES_RESPONSE.getText().contains("GENERAL  INFORMATION"))
                        {
                            isharesPage4.addAPISDetails(logInfo,i);
                            Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"),"Checkin Unsuccessful");
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                        }
                    }
                }
                else
                {
                    isharesPage4.addAPISDetails(logInfo,i);
                    Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains("SEATS ASSIGNED"),"Checkin Unsuccessful");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }
            }


            mText.put(getDriverID(), isharesPageObjects5.SHARES_RESPONSE.getText());
            isharesPageObjects5.FORMSIZE_DROPDOWN.click();
            isharesPageObjects5.FORMSIZE_SELECT1.click();
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void addPresidentialFQTV(ExtentTest logInfo, String FQTVCount) {
        try {
            int fqtvCount = Integer.parseInt(FQTVCount);

            JSONParser jsonParser = new JSONParser();
            FileReader reader = new FileReader(".\\src\\test\\resources\\jsonfiles\\presidentialFrequentFlyerDetails.json");
            Object obj = jsonParser.parse(reader);

            JSONArray fqtvList = (JSONArray) obj;

            ArrayList<String> Gender = new ArrayList<>();
            Gender.add("Male");
            Gender.add("Female");
            Random random = new Random();

            Faker faker = new Faker(new Locale("en-US"));
            Passenger pax;

            for (int i = 0; i < fqtvCount; i++) {
                JSONObject fqtvPassenger = (JSONObject) fqtvList.get(i); // Fetching ith JSON Object From the JSON List in JSON FIle
                JSONObject fqtvPAX = (JSONObject) fqtvPassenger.get("FrequentFlyer"); //Name of the JSON OBJECT in the LIST

                pax = new Passenger();

                pax.setlName(((String) fqtvPAX.get("firstName")).toUpperCase());

                pax.setfName(((String) fqtvPAX.get("surName")).toUpperCase());

                String phoneNumber = faker.phoneNumber().cellPhone().replaceAll("[^a-zA-Z0-9]", "");
                phoneNumber = phoneNumber.substring(3);
                pax.setPhoneNumber(phoneNumber);

                pax.setFFNumber((String) fqtvPAX.get("FFNumber"));
                pax.setDOB(gl.generateDateOfBirthNew("ADT"));
                pax.setEmail("testone@testone.com");
                pax.setGender(Gender.get(random.nextInt(Gender.size())));
                pax.setCountryCode("US");
                pax.setAreaCode("800");
                pax.setDocNumber(faker.regexify("[A-Z]{2}[0-9]{6}"));
                pax.setPaxType("FQTV");

                mPassengers.get(getDriverID()).add(pax);
            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void addPlatinumFQTV(ExtentTest logInfo, String FQTVCount) {
        try {
            int fqtvCount = Integer.parseInt(FQTVCount);

            JSONParser jsonParser = new JSONParser();
            FileReader reader = new FileReader(".\\src\\test\\resources\\jsonfiles\\platinumFrequentFlyerDetails.json");
            Object obj = jsonParser.parse(reader);

            JSONArray fqtvList = (JSONArray) obj;

            ArrayList<String> Gender = new ArrayList<>();
            Gender.add("Male");
            Gender.add("Female");
            Random random = new Random();

            Faker faker = new Faker(new Locale("en-US"));
            Passenger pax;

            for (int i = 0; i < fqtvCount; i++) {
                JSONObject fqtvPassenger = (JSONObject) fqtvList.get(i); // Fetching ith JSON Object From the JSON List in JSON FIle
                JSONObject fqtvPAX = (JSONObject) fqtvPassenger.get("FrequentFlyer"); //Name of the JSON OBJECT in the LIST

                pax = new Passenger();

                pax.setfName(((String) fqtvPAX.get("firstName")).toUpperCase());

                pax.setlName(((String) fqtvPAX.get("surName")).toUpperCase());

                String phoneNumber = faker.phoneNumber().cellPhone().replaceAll("[^a-zA-Z0-9]", "");
                phoneNumber = phoneNumber.substring(3);
                pax.setPhoneNumber(phoneNumber);

                pax.setFFNumber((String) fqtvPAX.get("FFNumber"));
                pax.setDOB(gl.generateDateOfBirthNew("ADT"));
                pax.setEmail("testone@testone.com");
                pax.setGender(Gender.get(random.nextInt(Gender.size())));
                pax.setCountryCode("US");
                pax.setAreaCode("800");
                pax.setDocNumber(faker.regexify("[A-Z]{2}[0-9]{6}"));
                pax.setPaxType("FQTV");

                mPassengers.get(getDriverID()).add(pax);
            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void addSilverFQTV(String FQTVCount) throws IOException, ParseException {

//    NOTE: LIMIT OF ADDING FQTV PAX IS 5

        int fqtvCount = Integer.parseInt(FQTVCount);

        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(".\\src\\test\\resources\\jsonfiles\\frequentFlyerDetailsSilver.json");
        Object obj = jsonParser.parse(reader);

        JSONArray fqtvList = (JSONArray) obj;

        ArrayList<String> Gender = new ArrayList<>();
        Gender.add("Male");
        Gender.add("Female");
        Random random = new Random();

        Faker faker = new Faker(new Locale("en-US"));
        Passenger pax;

        for (int i = 0; i < fqtvCount; i++) {
            JSONObject fqtvPassenger = (JSONObject) fqtvList.get(i); // Fetching ith JSON Object From the JSON List in JSON FIle
            JSONObject fqtvPAX = (JSONObject) fqtvPassenger.get("FrequentFlyer"); //Name of the JSON OBJECT in the LIST

            pax = new Passenger();

            pax.setfName(((String) fqtvPAX.get("firstName")).toUpperCase());

            pax.setlName(((String) fqtvPAX.get("surName")).toUpperCase());

            String phoneNumber = faker.phoneNumber().cellPhone().replaceAll("[^a-zA-Z0-9]", "");
            phoneNumber = phoneNumber.substring(3);
            pax.setPhoneNumber(phoneNumber);

            pax.setFFNumber((String) fqtvPAX.get("FFNumber"));
            pax.setDOB(gl.generateDateOfBirthNew("ADT"));
            pax.setEmail("testone@testone.com");
            pax.setGender(Gender.get(random.nextInt(Gender.size())));
            pax.setCountryCode("US");
            pax.setAreaCode("123");
            pax.setDocNumber(faker.regexify("[A-Z]{2}[0-9]{6}"));
            pax.setPaxType("FQTV");

            mPassengers.get(getDriverID()).add(pax);
        }
    }

    public void changeSpecificSegmentStatusToCMUSED(ExtentTest logInfo, String segNumber) {
        try {

            ArrayList<Passenger> pax = mPassengers.get(getDriverID());
            for (int i = 1; i <= pax.size(); i++) {

                String Command= "T-ET/STATUS/USED/" + (i) + "." +segNumber+ "*";
                gl.logCommand(logInfo, Command);
                gl.sendCmdValidateResponse(Command, "-OK-", logInfo);
                logInfo.pass("I change the segment " + segNumber + " to CM USED");
            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void storeSegmentDetails(ExtentTest logInfo, String segno, String index) {
        try {
//              	6:LD711/11JULPTY-PAX/TEST/ONE
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String flightNo = pax.getSegmentFlight(Integer.parseInt(segno)-1);
            Integer flightDate = pax.getSegmentDate(Integer.parseInt(segno)-1);
            String Origin = pax.getSegmentOriginCity(Integer.parseInt(segno)-1);
            String Destination = pax.getSegmentDestinationCity(Integer.parseInt(segno)-1);

            pax.setOldFlightNos((Integer.parseInt(index)), flightNo);
            pax.setOldFlightDates((Integer.parseInt(index)),flightDate);
            pax.setOldFlightOrigin((Integer.parseInt(index)),Origin);
            pax.setOldFlightDestination((Integer.parseInt(index)),Destination);


        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }
    public void displayInvalidentry(ExtentTest logInfo, String type) {
        try {
//                 *R
            String displayCmd = "";
            if (type.equals("payment")) {
                displayCmd = "T-$|ET";
                gl.logCommand(logInfo, displayCmd);
                gl.sendCmdValidateResponse(displayCmd, "NO PNR IN AAA", logInfo);
            } else {
                displayCmd = "*" + type;
                gl.logCommand(logInfo, displayCmd);
                gl.sendCmdValidateResponse(displayCmd, "INVLD ENT", logInfo);
            }
            logInfo.pass("I display the Invalid entry");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }



    public void enterEMD_SSR_Command(ExtentTest logInfo)
    {
        try
        {
            ArrayList<Passenger> passengers = mPassengers.get(getDriverID());

            gl.logCommand(logInfo, "*EMD/SSR");
            gl.sendCmdValidateResponse("*EMD/SSR", logInfo);

            for(Passenger passenger:passengers)
            {
                Assert.assertTrue(isharesPageObjects5.SHARES_RESPONSE.getText().contains(passenger.getTicketDocumentNumber()) ||
                        isharesPageObjects5.SHARES_RESPONSE.getText().contains("SSR"),
                        "TicketDocumentNumber of Passenger: "+passenger.getFullName()+" could not be found.");
            }
        }
        catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public void assignGateNumberInNativeShares(ExtentTest logInfo, String gateNo) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String flightNo = pax.getSegmentFlight(0);
            String startDate = gl.sharesFormatDateFromGUI(pax.getSegmentDate(0));
            String originCity = pax.getSegmentOriginCity(0);

            String checkQueueList = "6-FM3 / " + startDate + originCity + "@" + flightNo + "GTD" + gateNo;
            logInfo.info("And I enter " + checkQueueList + " command");
            isharesPage2.sendCmdToNativeSharesValidateResponse(checkQueueList, "CHECK-IN DETAILS", logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            pax.setDepartureFlightGateNumber(gateNo);
            pax.setGateNumber(gateNo);


        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    public void ToDisplayOutboudConnectionListInNativeShares(ExtentTest logInfo) {
        try {

            isharesPageObjects5.NATIVE_SHARES_CLEAR_ALL.click();
            gl.waitProgress();
            Passenger pax= mPassengers.get(getDriverID()).get(0);
            String ignorecommand = "I";
            isharesPage4.sendCmdToNativeSharesValidateResponse(ignorecommand,logInfo);

            String FlightNo = pax.getSegmentFlight(0);
            String PNR = pax.getPnr();
            gl.waitProgress();

            //6-LD264#OC
            String command = "6-LD"+FlightNo+"#OC";
            gl.logCommand(logInfo,command);
            isharesPage2.sendCmdToNativeSharesValidateResponse(command,PNR,logInfo);
            logInfo.pass("I validate PNR " +PNR);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


        } catch (Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }



    public void retrievePNRInNativeSharesAndValidateAllSSRIsAdded(ExtentTest logInfo) {
        try {
            isharesPageObjects5.NATIVE_SHARES_CLEAR_ALL.click();
            gl.waitProgress();

            Passenger pax= mPassengers.get(getDriverID()).get(0);
            gl.logCommand(logInfo,"*" + pax.getPnr());

            String command = "*" + pax.getPnr();
            isharesPage2.sendCmdToNativeSharesValidateResponse(command);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String xpathSSR =String.format( "//div[@ng-repeat='nativeData in nativeShareData.data track by $index']/pre[contains(text(), '%s')]","SSR");
            List<WebElement> SSR_ELEMENT = driver.get().findElements(By.xpath(xpathSSR));
            String xpathlines ="//div[@ng-repeat='nativeData in nativeShareData.data track by $index']";
            List<WebElement> ALL_LINES = driver.get().findElements(By.xpath(xpathlines));
            for(int i=0;i<ALL_LINES.size();i++)
            {
                WebElement lines = ALL_LINES.get(i);
                if(i==ALL_LINES.size()/2) {
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    gl.scrollToWebElement(lines);
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }

                if(i==ALL_LINES.size()-1) {
                    gl.scrollToWebElement(lines);
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }
            }

            if (gl.existElement(SSR_ELEMENT)) {
                for (WebElement element : SSR_ELEMENT) {
                    String line = element.getText();
                    gl.scrollToWebElement(element);

                    logInfo.info(MarkupHelper.createLabel("The added SSR is available and the line is: " + line, ExtentColor.GREEN));
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }
            }
            else {
                Assert.fail("The Added SSR is not available in the PNR");
            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void retrievePNRInNativeShares(ExtentTest logInfo) {
        try {

            logInfo.info(MarkupHelper.createLabel("I Retrieve the PNR in Native Shares ", ExtentColor.GREEN));
            isharesPageObjects5.NATIVE_SHARES_CLEAR_ALL.click();
            gl.waitProgress();

            Passenger pax= mPassengers.get(getDriverID()).get(0);


            gl.logCommand(logInfo,"*" + pax.getPnr());

            String command = "*" + pax.getPnr();
            isharesPage2.sendCmdToNativeSharesValidateResponse(command);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            String response3 = isharesPageObjects5.NATIVE_SHARES_RESPONSE_VALIDATE_LINE2.getText();
            String PNR = response3.substring(0, 6);
            System.out.println("PNR created : " + PNR);
            org.junit.Assert.assertTrue(response3.contains(PNR));
            pax.setPnr(pax.getPnr());
            gl.waitForProfileLoad();
            String xpathlines ="//div[@ng-repeat='nativeData in nativeShareData.data track by $index']";
            List<WebElement> ALL_LINES = driver.get().findElements(By.xpath(xpathlines));
            for(int i=0;i<ALL_LINES.size();i++)
            {
                WebElement lines = ALL_LINES.get(i);
                if(i==ALL_LINES.size()/2) {
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    gl.scrollToWebElement(lines);
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }

                if(i==ALL_LINES.size()-1) {
                    gl.scrollToWebElement(lines);
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }
            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void enter6LDCommandForStandByListPaxInNativeShares(ExtentTest logInfo) {
        try {


//              	6:LD0360/08AUGPTY#SB
            isharesPageObjects5.NATIVE_SHARES_CLEAR_ALL.click();
            gl.waitProgress();

            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String date = gl.sharesFormatDateFromGUI(pax.getSegmentDate(0));

            String displayStandbyList = "6:LD" + pax.getSegmentFlight(0) + "/" + date + pax.getSegmentOriginCity(0) + "|SB" ;
            gl.logCommand(logInfo,displayStandbyList);
            isharesPage2.sendCmdToNativeSharesValidateResponse(displayStandbyList, "STAND-BYS", logInfo);
            String PNR = pax.getPnr();
            String xpath = String.format("//div[@ng-repeat='nativeData in nativeShareData.data track by $index']//pre[contains(text(), '%s')]",PNR);
            WebElement line = driver.get().findElement(By.xpath(xpath));
            gl.scrollToWebElement(line);

            logInfo.info(MarkupHelper.createLabel("The passenger is available in the standby list. " , ExtentColor.GREEN));
            logInfo.info(MarkupHelper.createLabel(line.getText() , ExtentColor.GREEN));
            logInfo.pass("I display standby list for passengers");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public void cancelTheFlightInNativeShares(ExtentTest logInfo) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String flightNo = pax.getSegmentFlight(0);
            String startDate = gl.sharesFormatDateFromGUI(pax.getSegmentDate(0));
            String originCity = pax.getSegmentOriginCity(0);

            // 2N472/20MAR#PTY/FX
            String checkQueueList = "2N" + flightNo + "/" + startDate + "|" + originCity + "/FX";
            isharesPage2.sendCmdToNativeSharesValidateResponse(checkQueueList, "*", logInfo);

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }



    public void addFQTV_Airlines(String FQTVCount, String airlines) throws IOException, ParseException {

//    NOTE: LIMIT OF ADDING FQTV PAX IS 5

        int fqtvCount = Integer.parseInt(FQTVCount);

        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(".\\src\\test\\resources\\jsonfiles\\frequentFlyerDetails"+airlines+".json");
        Object obj = jsonParser.parse(reader);

        JSONArray fqtvList = (JSONArray) obj;

        ArrayList<String> Gender = new ArrayList<>();
        Gender.add("Male");
        Gender.add("Female");
        Random random = new Random();

        Faker faker = new Faker(new Locale("en-US"));
        Passenger pax;

        for (int i = 0; i < fqtvCount; i++) {
            JSONObject fqtvPassenger = (JSONObject) fqtvList.get(i); // Fetching ith JSON Object From the JSON List in JSON FIle
            JSONObject fqtvPAX = (JSONObject) fqtvPassenger.get("FrequentFlyer"); //Name of the JSON OBJECT in the LIST

            pax = new Passenger();

            pax.setfName(((String) fqtvPAX.get("firstName")).toUpperCase());

            pax.setlName(((String) fqtvPAX.get("surName")).toUpperCase());

            String phoneNumber = faker.phoneNumber().cellPhone().replaceAll("[^a-zA-Z0-9]", "");
            phoneNumber = phoneNumber.substring(3);
            pax.setPhoneNumber(phoneNumber);

            pax.setFFNumber((String) fqtvPAX.get("FFNumber"));
            pax.setDOB(gl.generateDateOfBirthNew("ADT"));
            pax.setEmail("testone@testone.com");
            pax.setGender(Gender.get(random.nextInt(Gender.size())));
            pax.setCountryCode("US");
            pax.setAreaCode("123");
            pax.setDocNumber(faker.regexify("[A-Z]{2}[0-9]{6}"));
            pax.setPaxType("FQTV");

            mPassengers.get(getDriverID()).add(pax);
        }
    }


    public void iEnterKECommandToruntheIBPRSC(ExtentTest logInfo) {
        try {
            //KENGPR/STATUS
            String command = "KENGPR/STATUS";
            gl.logCommand(logInfo, command);
            gl.sendCmdValidateResponse(command, "NGPR PROCESS STATUS DISPLAY", logInfo);
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Enter_T_$EI_ET_Command_To_Adjust_2_2_Irregular_Exchange_Reaccommodation(ExtentTest logInfo) {
        try {
            Passenger pax = mPassengers.get(getDriverID()).get(0);


            // T-$EI/S1#106PTYMGA17APR/361MGAGUA17APR#ET
            String command = "T-$EI/S2#"+pax.getAirline(0)+"-"+pax.getOldFlightNos(0) + pax.getOldFlightOrigin(0) + pax.getOldFlightDestination(0) + gl.sharesFormatDateFromGUI(pax.getOldFlightDates(0))
                    + "/" + pax.getAirline(1)+"-"+pax.getOldFlightNos(1) + pax.getOldFlightOrigin(1)+ pax.getSegmentDestinationCity(1) + gl.sharesFormatDateFromGUI(pax.getSegmentDate(1)) + "#IE#ET";

            gl.logCommand(logInfo, command);
            gl.sendCmdValidateResponse(command, "OK", logInfo);
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public void Run_long_cell_command_for_multiLeg_flight(ExtentTest logInfo) {
        try {

            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String date = gl.sharesFormatDateFromGUI(pax.getSegmentDate(0));
            int count = mPassengers.get(getDriverID()).size();

            //0CM391Y12AUGPTYGUANN1
            String checkQueueList = "0CM" + "391" + pax.getCOS() + date + "PTYGUA" + "NN"+ count;
            gl.logCommand(logInfo, checkQueueList);
            gl.sendCmdValidateResponse(checkQueueList, pax.getSegmentOriginCity(0) + pax.getSegmentDestinationCity(0), "DUPLICATE LEG", "ETKT ELIGIBLE", logInfo);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }



    public void childPaxinfodisplayForAllSeg(ExtentTest logInfo) {
        try {
            gl.ignoreTRNS(logInfo);

            // ArrayList<Passenger> pax= mPassengers.get(getDriverID());
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            String date = gl.sharesFormatDateFromGUI(pax.getSegmentDate(0));
            for(int i=0; i<pax.getTotalSegments(); i++){

                String paxList = "6:LD" + pax.getSegmentFlight(i) + "/" + gl.sharesFormatDateFromGUI(pax.getSegmentDate(i)) + pax.getSegmentOriginCity(i) +"|CHD";
                gl.logCommand(logInfo, paxList);
                gl.sendCmdValidateResponse1(paxList, pax.getPnr(),pax.getfName(), pax.getlName(), logInfo);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            }

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }



    public void enterEHCommandInNativeShares(ExtentTest logInfo) {
        try {

            String command = "*EH";
            gl.logCommand(logInfo, command);
            isharesPage2.sendCmdToNativeSharesValidateResponse(command, "FP", logInfo);

            String Response = isharesPageObjects5.NATIVE_SHARES_RESPONSE_VALIDATE_LINE3.getText();

            for(Passenger pax:mPassengers.get(getDriverID()))
            {
                if(pax.getPaxType().equalsIgnoreCase("INF"))
                {
                    if(Response.contains(pax.getAccompaniedPaxDetails().getfName()+"/"+pax.getAccompaniedPaxDetails().getlName()))
                        break;
                }
                else
                {
                    if(Response.contains(pax.getfName())||Response.contains(pax.getlName()))
                        break;
                }
            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public void sendCmdToNativeSharesValidateResponsetoGetDetailsOfFlight(String command, String validateText,ExtentTest logInfo){
        isharesPageObjects5.COMMAND_TEXTAREA.click();
        isharesPageObjects5.COMMAND_TEXTAREA.sendKeys(command);
        gl.waitProgress();
        gl.waitForProfileLoad();

        if(gl.existElement(isharesPageObjects5.SHARES_SUBMIT_BUTTON))
            gl.clickButton(isharesPageObjects5.SHARES_SUBMIT_BUTTONS);
        else
            gl.clickButton(isharesPageObjects5.SHARES_SUBMIT_BUTTON_1);
        gl.waitProgress();

        String response = isharesPageObjects5.NATIVE_SHARES_RESPONSE_VALIDATE_FLIGHT_DETAILS_RESPONSE.getText();
        gl.logResponse(logInfo,response);
        org.junit.Assert.assertTrue(response.contains(validateText));

    }

    public void sendCmdToNativeSharesValidateResponsetoGetDetailsOfFlight(String command, String validateText,String validateText1,ExtentTest logInfo){

        isharesPageObjects5.COMMAND_TEXTAREA.click();
        isharesPageObjects5.COMMAND_TEXTAREA.sendKeys(command);
        gl.waitForProfileLoad();

        gl.clickButton(isharesPageObjects5.SHARES_SUBMIT_BUTTON_1);
        gl.waitProgress();

        String response = isharesPageObjects5.NATIVE_SHARES_RESPONSE_VALIDATE_FLIGHT_DETAILS_RESPONSE.getText();
        gl.logResponse(logInfo,response);
        org.junit.Assert.assertTrue(response.contains(validateText)||response.contains(validateText1));

    }



    public void validateTheSSRInNativeShares(ExtentTest logInfo, String SSR) {
        try {
            String xpathSSR =String.format( "//div[@ng-repeat='nativeData in nativeShareData.data track by $index']/pre[contains(text(), '%s')]",SSR);
            List<WebElement> SSR_ELEMENT = driver.get().findElements(By.xpath(xpathSSR));

            if (gl.existElement(SSR_ELEMENT)) {
                for (WebElement element : SSR_ELEMENT) {
                    String line = element.getText();
                    gl.scrollToWebElement(element);

                    logInfo.info(MarkupHelper.createLabel("The added SSR is available and the line is: " + line, ExtentColor.GREEN));
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }
            }
            else {
                Assert.fail("The Added SSR is not available in the PNR");
            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }




    static class IsharesPageObjects5 {

        @FindBy(xpath = "//input[@id='ID']")
        public WebElement USERID;

        @FindBy(xpath = "//input[@name='Password']")
        public WebElement PASSWORD;

        @FindBy(xpath = "//input[@value='Login']")
        public WebElement LOGIN_BUTTON;

        @FindBy(xpath = "//span[text()='USER profile not found']")
        public WebElement USERPROFILEERROR_TEXT;

        @FindBy(xpath = "//pre[text()='Welcome to TPFSB, a SHARES B Test System.']")
        public List<WebElement> VALIDATE_SHARES_PAGE;

        @FindBy(xpath = "//a[text()='Terminal Emulation']")
        public WebElement TERMINAL_EMULATION_LINK;

        @FindBy(xpath = "//*[text()='Contact']")
        public WebElement CONTACT_BUTTON;

        @FindBy(xpath = "//*[text()='Help']")
        public WebElement HELP_BUTTON;

        @FindBy(xpath = "//a[text()='i-SHARES Administrator']")
        public WebElement ISHAREADMINISTRATOR_LINK;

        @FindBy(xpath = "//input[@name='action' or @type='reset']")
        public List<WebElement> ADMINISTRATORHEADERFIELDS_TEXT;

        @FindBy(xpath = "//fieldset//legend[text() and text()!='']")
        public List<WebElement> ADMINISTRATORSECTIONFIELDS_TEXT;

        @FindBy(xpath = "//*[text()='Change Password']")
        public WebElement CHANGEPASSWORD_BUTTON;

        @FindBy(xpath = "//*[text()='System Administrator ']")
        public WebElement SYSTEMADMINISTRATOR_TEXT;

        @FindBy(xpath = "//*[text()='Account Information:']")
        public WebElement ACCOUNTINFORMATION_TEXT;

        @FindBy(xpath = "//input[@type='text']")
        public WebElement COMMAND_INPUTAREA_ISHARES;

        @FindBy(xpath = "//input[@value='Send']")
        public WebElement SEND_ISHARES;

        @FindBy(xpath = "//pre[@id='content-wrap']")
        public WebElement SHARES_RESPONSE;

        @FindBy(xpath = "//div[text()='Native SHARES']")
        public WebElement NATIVE_SHARES_ICON;

        @FindBy(xpath = "//textarea[@ng-model='nativeShares.model.command']")
        public WebElement COMMAND_TEXTAREA;

        @FindBy(xpath = "(//button[contains(text(),'Submit')])[2]")
        public List<WebElement> SHARES_SUBMIT_BUTTON;

        @FindBy(xpath = "//button[contains(text(),'Submit')]")
        public WebElement SHARES_SUBMIT_BUTTON_1;

        @FindBy(xpath = "//pre[text()='INVLD DATE/BRD/OFF']")
        public List<WebElement> UNAVAILABILITY_ERROR_NATIVESHARES;

        @FindBy(xpath = "//button[@translate='pssgui.cancel' and @ng-click='nativeShares.closeNativeDialog()']")
        public WebElement CANCEL_BUTTON;

        @FindBy(xpath = "//input[@name='USER']")
        public WebElement userID;

        @FindBy(xpath = "//input[@name='PASSWORD']")
        public WebElement password;

        @FindBy(xpath = "//toggle-content[@class='ng-scope']//div[1]/pre")
        public WebElement NATIVE_SHARE_RESPONSE_PNR;

        @FindBy(xpath = "//toggle-content[@class='ng-scope']//div[3]/pre")
        public WebElement NATIVE_SHARE_RESPONSE_SEGONE_STATUS;

        @FindBy(xpath = "//toggle-content[@class='ng-scope']//div[3]/pre")
        public WebElement NATIVE_SHARE_RESPONSE_SEGTWO_STATUS;

        @FindBy(xpath = "(//div[text()='Flifo Search'])")
        public WebElement FLIFO_SEARCH;

        @FindBy(xpath = "//input[@name='Flight']")
        public WebElement FLIFO_FLIGHT_NUMBER;

        @FindBy(xpath = "(//input[@name='origin'])")
        public WebElement FLIFO_ORIGIN_CITY;

        @FindBy(xpath = "(//input[@name='destination'])")
        public WebElement FLIFO_DESTINATION_CITY;

        @FindBy(xpath = "(//input[@class='md-datepicker-input'])")
        public WebElement FLIFO_DATE;

        @FindBy(xpath = "(//i[@ng-click='flightSearch.form.$valid && flightSearch.stateChange()'])")
        public WebElement FLIFO_SEARCH_ICON;

        @FindBy(xpath = "(//td[@class='ng-binding'])[2]")
        public WebElement FLIFO_DESTINATION_TIME;

        @FindBy(xpath = "//button[text()='Close']")
        public WebElement FLIFO_CLOSE;

        @FindBy(xpath = "//select[@id='Type']")
        public WebElement FORMSIZE_DROPDOWN;

        @FindBy(xpath = "//select[@id='Type']//option[text()='2']")
        public WebElement FORMSIZE_SELECT2;

        @FindBy(xpath = "//textarea[@name='q']")
        public WebElement TEXTAREA;

        @FindBy(xpath = "(//form[@method='post'])//textarea")
        public WebElement FORMSIZE_SELECT2_TEXTAREA;

        @FindBy(xpath = "//select[@id='Type']//option[text()='1']")
        public WebElement FORMSIZE_SELECT1;

        @FindBy(xpath = "//select[@id='Type']//option[text()='24']")
        public WebElement FORMSIZE_SELECT24;

        @FindBy(xpath = "//select[@id='Type']//option[text()='12']")
        public WebElement FORMSIZE_SELECT12;

        @FindBy(xpath = "//textarea[@rows='24']")
        public WebElement INPUT_TEXT_AREA_ROWS24;

        @FindBy(xpath = "//textarea[@rows='2']")
        public WebElement INPUT_TEXT_AREA_ROWS2;

        @FindBy(xpath = "//textarea[@rows='9']")
        public WebElement INPUT_TEXT_AREA_ROWS9;

        @FindBy(xpath = "//a[@id='LogOffIn']")
        public WebElement LOGOUT_BUTTON;

        @FindBy(xpath = "//td[@class='st word-break ng-binding ng-scope']")
        public List<WebElement> TICKET_STATUS_GUI;

        @FindBy(xpath = "//td[@class='ng-binding'][2]")
        public WebElement NATIVE_SHARES_FLIFO;

        @FindBy(xpath = "//i[@class='icon-tools']")
        public WebElement TOOLS_MENU;

        @FindBy(xpath = "//div[text()='Native SHARES']")
        public WebElement NATIVE_SHARES;

        @FindBy(xpath = "//textarea[@ng-model='nativeShares.model.command']")
        public WebElement NATIVE_SHARES_TEXTAREA;

        @FindBy(xpath = "//button[text()='Submit']")
        public List<WebElement> NATIVE_SHARES_SUBMIT_BTN;

        @FindBy(xpath = "//toggle-content[@class='ng-scope']")
        public WebElement NATIVE_SHARES_RESPONSE_AREA;

        @FindBy(xpath = "(//span[@class='ng-binding'])[5]")
        public WebElement COUPON_CONTROL_STATUS;

        @FindBy(xpath = "(//td[@class='ng-binding'])[4]")
        public WebElement CANCEL_FLIGHT_DEPART_STATUS;

        @FindBy(xpath = "//div[text()='SHARES Function']")
        public WebElement VALIDATE_NATIVE_SHARES_PAGE;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[2]")
        public WebElement NATIVE_SHARES_RESPONSE_VALIDATE_LINE2;

        @FindBy(xpath = "//button[text()='Clear All']")
        public WebElement NATIVE_SHARES_CLEAR_ALL;

        @FindBy(xpath = "//pre[text()='ETKT ELIGIBLE']")
        public WebElement NATIVE_SHARES_ETKT_RESPONSE_VALIDATE;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[5]")
        public WebElement NATIVE_SHARES_CNTRL_STATUS_POST_DEPARTURE;

        @FindBy(xpath = "(//span[@ng-click='flightResult.onSelectCoupon(segment)'])[2]")
        public WebElement COUPON_CNTRL_STATUS_SEGTWO;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[6]")
        public WebElement COUPON_CNTRL_STATUS_AV_NATIVE_SHARES;

        @FindBy(xpath = "(//span[@ng-click='flightResult.onSelectCoupon(segment)'])[1]")
        public WebElement COUPON_CNTRL_STATUS_SEGONE;

        @FindBy(xpath = "//pre[text()='TEXT DISPLAY COMPLETE']")
        public WebElement DISPLAY_COUNTRY_CITY;

        @FindBy(xpath = "//pre[contains(text(),'- LOCAL CURRENCY  AFGHANI-AFN): IN BANKNOTES OR COINS UP TO')]")
        public WebElement CURRENCY_INFO_NATIVE_SHARES;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[7]")
        public WebElement GEOGRAPHICAL_INFO_NATIVE_SHARES;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[3]")
        public WebElement COUNTRY_INFO_NATIVE_SHARES;

        @FindBy(xpath = "//pre[@class='ng-binding']")
        public List<WebElement> NATIVE_SHARES_RESPONSE_TEXT;

        @FindBy(xpath = "//td[text()='VOIDED']")
        public List<WebElement> VOID_SEG_STATUS;

        @FindBy(xpath = "//toggle-content[@class='ng-scope']//pre")
        public List<WebElement> NATIVE_SHARES_COMPLETERESPONSE;

        @FindBy(xpath = "//span[@style='float: right; font-size: 12px;']")
        public WebElement LNIATA_CODE;

        @FindBy(xpath = "//div[@class='pssgui-bold ng-binding flex-40']")
        public WebElement FLIGHT_DEPART_TIME;

        @FindBy(xpath = "(//td[@class='ng-binding'])[1]")
        public WebElement FLIFO_ORIGIN_TIME;

        @FindBy(xpath = "(//td[@class='ng-binding'])[3]")
        public List<WebElement> FLIFO_FLIGHT_ORIGIN_CHANGED_TIME;

        @FindBy(xpath = "(//td[@class='ng-binding'])[7]")
        public WebElement FLIFO_FLIGHT_ORIGIN_STATUS;

        @FindBy(xpath = "(//div[@class='pssgui-bold ng-binding pssgui-design-status-critical flex'])")
        public WebElement FLIGHT_ORIGIN_CHANGED_TIME;

        @FindBy(xpath = "(//div[@class='pssgui-bold ng-binding flex'])[1]")
        public WebElement FLIGHT_ORIGIN_TIME;

        @FindBy(xpath = "(//div[@class='pssgui-design-status-good pssgui-design-page-title ng-binding flex-35'])")
        public WebElement FLIGHT_ORIGIN_STATUS;

        @FindBy(xpath = "(//td[@class='ng-binding'])[5]")
        public WebElement FLIFO_CANCELED_FLIGHT_ORIGIN_STATUS;

        @FindBy(xpath = "(//td[@class='ng-binding'])[1]")
        public WebElement FLIFO_CANCELED_FLIGHT_ORIGIN_TIME;

        @FindBy(xpath = "//i[@class='icon-refresh']")
        public WebElement FLIFO_REFRESH;

        @FindBy(xpath = "//select[@id='Type']//option[text()='4']")
        public WebElement FORMSIZE_SELECT4;

        @FindBy(xpath = "//span[contains(text(),'Add User')]")
        public WebElement MANAGE_USERS_ADD_USER;

        @FindBy(xpath = "//input[@value='Reset']")
        public WebElement RESET_BUTTON;

        @FindBy(xpath = "//input[@value='Login']")
        public List<WebElement> LOGIN_BUTTON_SHARES;

        @FindBy(xpath = "//div//toggle-content[@class='ng-scope']")
        public WebElement NATIVE_SHARES_RESPONSE_VALIDATE_LINE3;

        @FindBy(xpath = "(//button[contains(text(),'Submit')])[2]")
        public WebElement SHARES_SUBMIT_BUTTONS;

        @FindBy(xpath = "//div[@ng-repeat='nativeShareData in nativeShares.model.responseData track by $index']//div[contains(@class, 'toggle') and contains(@class, 'expand')]//div[contains(@class, 'togglediv-content')]")
        public WebElement NATIVE_SHARES_RESPONSE_VALIDATE_FLIGHT_DETAILS_RESPONSE;
    }
}
