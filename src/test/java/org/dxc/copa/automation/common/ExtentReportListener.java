package org.dxc.copa.automation.common;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.dxc.copa.automation.base.TestBase;
import org.dxc.copa.automation.constants.GlobalConstants;
import org.dxc.copa.automation.pages.IsharesPage1;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.dxc.copa.automation.base.TestBase.*;


public class ExtentReportListener {

    static GlobalConstants globalConstants = new GlobalConstants();
    public static ExtentTest test=null;
    public static ExtentReports summaryReport; // Summary report
    private static ExtentHtmlReporter summaryHtmlReporter;
    private static final ThreadLocal<ExtentReports> scenarioReports = new ThreadLocal<>();
    private static final ThreadLocal<ExtentTest> scenarioTest = new ThreadLocal<>();

    private static final Map<String, String> individualReportPaths = new HashMap<>();
    static String reportsFolder=null;

    // Initialize the summary report
    public static void initSummaryReport() {
        TestBase.folderName = "COPA_" + (new SimpleDateFormat("yyyyMMdd-HHmmss")).format(new Date());
        reportsFolder=TestBase.folderName;
        summaryHtmlReporter = new ExtentHtmlReporter(reportsFolder+"\\summary-report.html");
        summaryReport = new ExtentReports();
        summaryReport.attachReporter(summaryHtmlReporter);
    }
    public static ExtentReports setUp()
    {
        TestBase.folderName = "COPA_" + (new SimpleDateFormat("yyyyMMdd-HHmmss")).format(new Date());
        reportsFolder=TestBase.folderName;
        String reportLocation = System.getProperty("user.dir") + "\\" + reportsFolder + "\\SummaryReport.html";
        summaryHtmlReporter = new ExtentHtmlReporter(reportLocation);
        summaryHtmlReporter.loadXMLConfig(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\extent-config.xml");

        summaryHtmlReporter.start();

        summaryReport = new ExtentReports();
        summaryReport.attachReporter(summaryHtmlReporter);
        summaryReport.setSystemInfo("Application", "COPA Airlines - iSHARES");
        summaryReport.setSystemInfo("Operating System", System.getProperty("os.name"));
        summaryReport.setSystemInfo("User Name", System.getProperty("user.name"));
        summaryReport.setSystemInfo("Environment", globalConstants.testEnv);

        if(globalConstants.testEnv.equalsIgnoreCase("sharesD3URL"))
            summaryReport.setSystemInfo("URL: ", globalConstants.sharesD3URL);
        else if(globalConstants.testEnv.equalsIgnoreCase("sharesCURL"))
            summaryReport.setSystemInfo("URL: ", globalConstants.sharesCURL);
        else if(globalConstants.testEnv.equalsIgnoreCase("VP1SHCURL"))
            summaryReport.setSystemInfo("URL: ", globalConstants.VP1SHCURL);
        else if(globalConstants.testEnv.equalsIgnoreCase("sharesURL"))
            summaryReport.setSystemInfo("URL: ", globalConstants.sharesURL);
        else
            summaryReport.setSystemInfo("URL: ", globalConstants.testEnvURL);

        summaryReport.setSystemInfo("Build #: ", globalConstants.buildNo);
        summaryReport.setSystemInfo("Release #: ", globalConstants.releaseNo);


        System.out.println("System Info. set in Extent Report");
        return summaryReport;
    }

    // Initialize individual report for each scenario
    public static synchronized void initScenarioReport(String scenarioName) {
        String scenario = mScenario.get(getDriverID());
        if(scenario.equalsIgnoreCase(scenarioName)) {
            String reportPath = reportsFolder + "\\" + scenarioName + ".html";
            mReportName.put(getDriverID(),scenarioName);
            ExtentHtmlReporter scenarioHtmlReporter = new ExtentHtmlReporter(reportPath);

            ExtentReports scenarioReport = new ExtentReports();
            scenarioReport.attachReporter(scenarioHtmlReporter);

            scenarioReports.set(scenarioReport);

            // Save the report path for later reference
            individualReportPaths.put(scenarioName, reportPath);
        }
    }

    // Get scenario ExtentReports instance
    public static synchronized ExtentReports getScenarioReport() {
        return scenarioReports.get();
    }

    // Set scenario ExtentTest instance
    public static synchronized void setScenarioTest(ExtentTest test) {
        scenarioTest.set(test);
    }

    public static synchronized ExtentTest getScenarioTest() {
        return scenarioTest.get();
    }
    // Get scenario ExtentTest instance
    public static synchronized ExtentTest getExtent() {
        return scenarioTest.get();
    }

    // Add logs for summary report
    public static synchronized ExtentTest createTestForSummary(String scenarioName) {
        return summaryReport.createTest(scenarioName);
    }

    // Flush summary report
    public synchronized static void flushSummaryReport() {
        if (summaryReport != null) {
            summaryReport.flush();
        }
    }

    // Flush individual scenario report
    public synchronized static void flushScenarioReport() {
        if (scenarioReports.get() != null) {
            scenarioReports.get().flush();
        }
    }

    // Retrieve all individual report paths
    public static Map<String, String> getIndividualReportPaths() {
        return individualReportPaths;
    }

    public static synchronized void testStepHandle(String teststatus, WebDriver driver, ExtentTest extenttest, Throwable throwable) {
        switch (teststatus) {

            case "FAIL":
                extenttest.fail(MarkupHelper.createLabel("Test Step is Failed : ", ExtentColor.RED));
                extenttest.error(throwable.fillInStackTrace());

                extenttest.addScreenCaptureFromBase64String(getBase64(driver));

                TestBase.mTestStatus.put(TestBase.getDriverID(),"Fail");

                if(TestBase.misSharesCase.get(TestBase.getDriverID())==Boolean.TRUE &&
                        TestBase.isRestored.get(TestBase.getDriverID())==Boolean.FALSE)
                {
                    GenericLib gl = new GenericLib();
                    List<WebElement> logoff = TestBase.getSharesDriver().findElements(By.xpath("//a[@id='LogOffIn']"));
                    if(gl.existElement(logoff)){
                        logoff.get(0).click();
                    }
                    System.out.println("I restore back "+ IsharesPage1.mCredentialUsed.get(TestBase.getDriverID()));
                    IsharesPage1.restoreCredential();
                    TestBase.isRestored.put(TestBase.getDriverID(),Boolean.TRUE);
                }

                if (driver != null) {
                    TestBase.quitDriver();
                }
                break;

            case "PASS":
                extenttest.pass(MarkupHelper.createLabel("Test Step is Passed : ", ExtentColor.GREEN));
                IsharesPage1.restoreCredential();
                break;

            default:
                break;
        }
    }

    public static synchronized String getBase64(WebDriver driver) {    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);}

    public static String captureScreenShot(WebDriver driver) throws IOException {
        String concat = ".";
        String dest = null;
        try {
            TakesScreenshot screen = (TakesScreenshot) driver;
            File src = screen.getScreenshotAs(OutputType.FILE);
            dest = "./" + TestBase.folderName + "/screenshots/" + getcurrentdateandtime() + ".png";
            //System.getProperty("user.dir")+"\\target\\screenshots\\" + getcurrentdateandtime() + ".png";
            File target = new File(dest);
            FileUtils.copyFile(src, target);


        } catch (Exception e) {
            System.out.println(e);
        }
        return concat + dest;
    }

    private static String getcurrentdateandtime() {
        String str = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
            Date date = new Date();
            str = dateFormat.format(date);
            str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
        } catch (Exception e) {
        }
        return str;
    }

}