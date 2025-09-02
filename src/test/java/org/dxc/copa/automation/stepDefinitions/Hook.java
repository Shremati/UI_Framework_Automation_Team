package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.dxc.copa.automation.base.TestBase;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.dxc.copa.automation.common.ITestListenerImpl;


public class Hook extends TestBase{

    ExtentTest test=null;
    static String scenarioName=null;
    ITestListenerImpl iTestListenerimpl = new ITestListenerImpl();

    @Before
    public synchronized void beforeScenario(Scenario scenario) {
        //scenarioName=getScenarioName(scenario.getName());
        mScenario.put(getDriverID(), getScenarioName(scenario.getName()));

        ExtentReportListener.initScenarioReport(getScenarioName(scenario.getName()));

        test = ExtentReportListener.getScenarioReport().createTest(scenario.getName());
        ExtentReportListener.setScenarioTest(test);
        test = ExtentReportListener.getExtent().createNode(String.valueOf(Scenario.class), "");

    }

    @After
    public synchronized void afterScenario(Scenario scenario) {


        if (scenario.isFailed()) {

            if(mReportName.get(getDriverID()).equalsIgnoreCase(getScenarioName(scenario.getName())))
            {
                ExtentReportListener.createTestForSummary(getScenarioName(scenario.getName())).fail("Scenario failed -> "+mFailureDescription.get(getDriverID()));
            }

        }
        else {
            if(mReportName.get(getDriverID()).equalsIgnoreCase(getScenarioName(scenario.getName()))) {
                ExtentReportListener.createTestForSummary(getScenarioName(scenario.getName())).pass("Scenario passed");
            }
        }

        ExtentReportListener.flushScenarioReport();

      /*  if(!mPassengers.isEmpty())
            mPassengers.get(getDriverID()).clear();*/

        TestBase.quitDriver();

        System.gc();
    }
    public static synchronized String getScenarioName(String scenarioName)
    {
        int delimiterIndex = scenarioName.indexOf(" - ");

        // Extract the substring before the delimiter
        String result = scenarioName.substring(0, delimiterIndex);
        return result;
    }

}
