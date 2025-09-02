package org.dxc.copa.automation.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.dxc.copa.automation.constants.GlobalConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.InetAddress;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class TestBase extends AbstractTestNGCucumberTests {

    public static ThreadLocal<WebDriver> driver = new java.lang.ThreadLocal<WebDriver>();
    public final static int TIMEOUT = 5;
    public final static int PAGE_LOAD_TIMEOUT = 300;
    GlobalConstants globalConstants;
    public static String excelFilePath=null;
    public static HashMap<Long, String> mOrderNumber = new HashMap<>();
    public static HashMap<Long, String[]> mFName = new HashMap<>();
    public static HashMap<Long, String[]> mLName = new HashMap<>();
    public static HashMap<Long, String[]> mDOB = new HashMap<>();
    public static HashMap<Long, String> mAreaCode = new HashMap<>();
    public static HashMap<Long, String> mFlightNumber = new HashMap<>();
    public static HashMap<Long, String> mOriginCity = new HashMap<>();
    public static HashMap<Long, String> mFlightDepartDate = new HashMap<>();

    public static HashMap<Long, String> mPNRNo1 = new HashMap<>();
    public static HashMap<Long,String> mText = new HashMap<>();

    public static HashMap<Long, String> mConnectingFlightNumber = new HashMap<>();
    public static HashMap<Long, String> mConnectingflightDepartureDate = new HashMap<>();
    public static HashMap<Long, String> mConnecteddestinationCity = new HashMap<>();
    public static HashMap<Long, String> mConnectedfromCity = new HashMap<>();
    public static HashMap<Long, String> mDestinationcity = new HashMap<>();

    public static HashMap<Long, String> mScenario = new HashMap<>();
    public static HashMap<Long, String> mTestStatus = new HashMap<>();
    public static HashMap<Long, String> mAltFlightNumber = new HashMap<>();
    public static HashMap<Long, Integer> mdrivercounter = new HashMap<>();
    public static HashMap<Long, HashMap<String, String> >mPaxName_PaxType = new HashMap<>();
    public static HashMap<String, String> mPaxName = new HashMap<>();
    public static HashMap<Long, List<String>> mPaxNameList = new HashMap<>();
    public static HashMap<Long,List<String>> FQTVFname = new HashMap<Long, List<String>>();
    public static HashMap<Long, List<String>> mTaxName = new HashMap<>();

    public static HashMap<Long,Boolean> misFQTV = new HashMap<Long,Boolean>() ;

    public static HashMap<Long,List<String>> mFFnumbers = new HashMap<>();

    public static HashMap<Long,List<String>> mFF_FirstNames = new HashMap<>();

    public static HashMap<Long,List<String>> mFF_LastNames = new HashMap<>();

    public static HashMap<Long,HashMap<String,String>> mFF_PaxType = new HashMap<>();
    public static HashMap<Long, String> mCOS = new HashMap<>();
    public static HashMap<Long, String> mPhoneNumber = new HashMap<>();
    public static HashMap<Long,String> mAirline1 = new HashMap<>();
    public static HashMap<Long,String> mAirline2 = new HashMap<>();
    public static HashMap<Long,String> mSharesDepartureTime = new HashMap<>();
    public static HashMap<Long,String> mSharesArrivalTime = new HashMap<>();

    public static HashMap<Long,ArrayList<Passenger>> mPassengers = new HashMap<>();
    public static HashMap<Long,ArrayList<Passenger>> mPassengersPNR2 = new HashMap<>();

    public static HashMap<Long,Integer> mGeneralQuoteCount = new HashMap<>();

    public static int x = 0;

    public String[] FName = null;
    public String[] LName = null;
    public String[] DOB = null;
    public String[] gender = null;
    public String[] PassengerName = null;
    public String[] PassengerLastName = null;

    public String current_window_address = null;

    public String url = null;

    public static String folderName = null;

    public static HashMap<Long, Integer> mAltrFlightDays = new HashMap<>();

    public static HashMap<Long,String> CurrentwindowID = new HashMap<>();
    public static HashMap<Long,Integer> mSharesStartDateSegOne = new HashMap<>();
    public static HashMap<Long,Integer> mSharesStartDateSegTwo = new HashMap<>();
    public static HashMap<Long,Integer> mSharesStartDateSegThree = new HashMap<>();
    public static HashMap<Long,Integer> mSharesStartDateSegFour = new HashMap<>();
    public static HashMap<Long,Integer> mSharesStartDateSegFive = new HashMap<>();
    public static HashMap<Long,Integer> mSharesStartDateSegSix = new HashMap<>();

    public static HashMap<Long,String[]> mPaxType = new HashMap<>();
    public static HashMap<Long, Boolean> mGroupPnr = new HashMap<>();

    public static HashMap<Long,Boolean> isNonRevenue= new HashMap<>();

    public static HashMap<Long, String> mEmd = new HashMap<>();
    public static List<String> infFName = new ArrayList<>();
    public static List<String> infLName = new ArrayList<>();
    public static List<String> infDOB = new ArrayList<>();
    public static HashMap<Long,List<String>> flightIndex = new HashMap<>();
    public static HashMap<Long,List<String>> mInfFName = new HashMap<>();
    public static HashMap<Long,List<String>> mInfLName = new HashMap<>();
    public static HashMap<Long,List<String>> mInfDOB = new HashMap<>();

    public static HashMap<Long,List<String>> mSTicketNumbers = new HashMap<>();
    public static HashMap<Long,Boolean> misSharesCase = new HashMap<>();
    public static HashMap<Long,Boolean> isRestored = new HashMap<>();

    public static HashMap<Long,HashMap<String,String>> NonRevenuePaxCode = new HashMap<>();

    public static HashMap<Long,String> flifoOriginModifiedTime = new HashMap<>();
    public static HashMap<Long,String> flifoOriginModifiedStatus = new HashMap<>();
    public static HashMap<Long,String[]> mSeatNumber = new HashMap<>();

    public static HashMap<Long,String> sharesLNIATA = new HashMap<>();

    public static List<String> cabin = new ArrayList<>();
    public static List<String> booked = new ArrayList<>();
    public static List<String> total = new ArrayList<>();

    public static int rowIndex;
    public static HashMap<Long, Integer> mrowIndex = new HashMap<Long, Integer>();


    public static HashMap<Long,String> mSegments = new HashMap<>();
    public static HashMap<Long,String> mOldFlightNumber = new HashMap<>();
    public static HashMap<Long,Integer> mOldFlightDate = new HashMap<>();

    public static HashMap<Long,String> mCurrentCommand =new HashMap<>();
    public static HashMap<Long,String> mPreviousCommand =new HashMap<>();
    public static HashMap<Long,String> mFailureDescription = new HashMap<>();
    public static HashMap<Long, String> mReportName = new HashMap<>();

    public String checkBusinessClass = "false";
    public static HashMap<Long, String> mCheckBusinessClass = new HashMap<>();
    public static HashMap<Long,List<String>> fleetNumber = new HashMap<>();

    public boolean isRefund = false;
    public static HashMap<Long, Boolean> mWantEmd = new HashMap<>();

    public static HashMap<Long,List<String>> mAdultTaxes=new HashMap<>();
    public static HashMap<Long,List<String>> mChildTaxes=new HashMap<>();
    public static HashMap<Long,List<String>> mINSTaxes=new HashMap<>();
    public static HashMap<Long,List<String>> mINFTaxes=new HashMap<>();


    @BeforeMethod
    @Parameters("browser")
    public void initSetup(String targetBrowser) throws Exception {
        globalConstants = new GlobalConstants();
        targetBrowser = globalConstants.browser;
        if (targetBrowser.equalsIgnoreCase("chrome")) {

            mdrivercounter.put(getDriverID(), ++x);
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);
            options.setBrowserVersion("121");
            options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
//            options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
            options.addArguments("--remote-allow-origins=*", "--window-size=1680,1050", "--disable-gpu",
                    "--disable-extensions", "--no-sandbox", "--incognito");

            driver.set(new ChromeDriver(options));

        } else if (targetBrowser.equalsIgnoreCase("edge")) {

            mdrivercounter.put(getDriverID(), ++x);
            EdgeOptions options = new EdgeOptions();
            options.setBrowserVersion("119");
            options.addArguments("--headless=new","--remote-allow-origins=*", "--window-size=1920,1080",
                    "--disable-gpu", "--disable-extensions", "--no-sandbox", "--incognito");
            driver.set(new EdgeDriver(options));

        } else if (targetBrowser.equalsIgnoreCase("firefox")) {
            mdrivercounter.put(getDriverID(), ++x);
            FirefoxOptions options = new FirefoxOptions();
            options.setBrowserVersion("116");
            options.addArguments("--remote-allow-origins=*");

            driver.set(new FirefoxDriver());
        } else if (targetBrowser.equalsIgnoreCase("headless")) {

            mdrivercounter.put(getDriverID(), ++x);
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);
            options.setBrowserVersion("121");
            options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
            options.addArguments("--headless", "--remote-allow-origins=*", "--window-size=1920,1075",
                    "--disable-gpu", "--disable-extensions", "--no-sandbox", "--incognito");
            driver.set(new ChromeDriver(options));
           /* options.addArguments(
                    "--verbose",
                    "--headless=new",
                    "--remote-allow-origins=*",
                    "--window-size=1920,1080",
                    "--disable-web-security",
                    "--ignore-certificate-errors",
                    "--allow-running-insecure-content",
                    "--allow-insecure-localhost",
                    "--disable-gpu",
                    "--disable-extensions",
                    "--no-sandbox", "--incognito"
            );*/

        } else if (targetBrowser.equalsIgnoreCase("selenium-grid")) {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setBrowserName("chrome"); // or "MicrosoftEdge" for Edge

            String hubUrl = "http://" + GlobalConstants.seleniumHubIP + ":4444/wd/hub";
            driver.set(new RemoteWebDriver(new URL(hubUrl), caps));

        }


        getDriver().manage().window().maximize();
       // getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
    }

    @Parameters("env")
    public void initURL(String targetURL) throws Exception {

        globalConstants = new GlobalConstants();
       /* if (targetURL.equalsIgnoreCase(globalConstants.SIT)) {
            url = globalConstants.SIT;

        } else if (targetURL.equalsIgnoreCase(globalConstants.UAT)) {
            url = globalConstants.UAT;
        }*/
    }


    public WebDriver getDriver() {
        return driver.get();
    }

    public static WebDriver getSharesDriver() {
        return driver.get();
    }
    public static void unload() {
        driver.remove();
    }

    public static long getDriverID() {
        return Thread.currentThread().getId();
    }



    public static void quitDriver() {
        WebDriver webDriver = driver.get();
        if (webDriver != null) {
            webDriver.quit(); // This is usually sufficient
            driver.remove();  // Clean up the ThreadLocal reference
        }
    }


    @AfterMethod
    public void tearDown() throws Exception {
        if (getDriver() != null) {
            getDriver().close();
            getDriver().quit();
            driver.remove();
        }
    }


    public void initializeBaseVariables() //Before every test case these variables will be initialized with these values
    {
        current_window_address = null;
        mScenario.put(getDriverID(), null);
        mTestStatus.put(getDriverID(), "Pass");
        mSTicketNumbers.put(getDriverID(),null);
        misSharesCase.put(getDriverID(),Boolean.FALSE);
        isRestored.put(getDriverID(),Boolean.FALSE);
        mGroupPnr.put(getDriverID(),Boolean.FALSE);
        isNonRevenue.put(getDriverID(),false);
        mrowIndex.put(getDriverID(),rowIndex++);
        mSegments.put(getDriverID(),"");
        flightIndex.put(getDriverID(),null);
        mCurrentCommand.put(getDriverID(),"First Command");
        mPreviousCommand.put(getDriverID(),"No Command");
        mFailureDescription.put(getDriverID(),"");
        sharesLNIATA.put(getDriverID(),"LNIATA not initialized");
        mWantEmd.put(getDriverID(), false);
        checkBusinessClass = "false";
        mEmd.put(getDriverID(), null);
        mCheckBusinessClass.put(getDriverID(), "false");
    }

}
