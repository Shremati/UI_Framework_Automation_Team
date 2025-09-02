package org.dxc.copa.automation.common;

import com.aventstack.extentreports.Status;
import org.dxc.copa.automation.base.TestBase;
import org.dxc.copa.automation.stepDefinitions.Hook;
import org.dxc.copa.automation.util.ReportOrganizer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;

import java.io.IOException;
import java.nio.file.*;
import java.io.File;
import java.util.Map;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class ITestListenerImpl extends ExtentReportListener implements ITestListener {
    private static ExtentReports extent;
    ExtentReportListener test;
    TestBase testBase = new TestBase();

    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        testBase.initializeBaseVariables();

    }

    public void onTestSuccess(ITestResult result) {
        TestBase.quitDriver();
        TestBase.unload();
        System.out.println("PASS");
        ExtentReportListener.getExtent().log(Status.PASS, "Passed");

      /*  String ScenarioName = TestBase.mScenario.get(TestBase.getDriverID()).split("-")[0].trim();
        Path isMoved = null;
        try {
            isMoved = Files.move(Paths.get(TestBase.folderName + "\\" + ScenarioName + ".html"), Paths.get(TestBase.folderName + "\\PASSED\\" + ScenarioName + ".html"), REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (isMoved != null) {
            System.out.println(ScenarioName + ".feature moved successfully to PASS Folder");
        } else {
            System.out.println("Failed to move the file : " + ScenarioName);
        }*/
    }

    public void onTestFailure(ITestResult result) {
        TestBase.quitDriver();
        TestBase.unload();
        System.out.println("onTestFailure -- FAIL");
        ExtentReportListener.getExtent().log(Status.FAIL, "Failed");

        /*String ScenarioName = TestBase.mScenario.get(TestBase.getDriverID()).split("-")[0].trim();
        Path isMoved = null;
        try {
            isMoved = Files.move(Paths.get(TestBase.folderName + "\\" + ScenarioName + ".html"), Paths.get(TestBase.folderName + "\\FAILED\\" + ScenarioName + ".html"), REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (isMoved != null) {
            System.out.println(ScenarioName + ".feature moved successfully to FAILED Folder");
        } else {
            System.out.println("Failed to move the file : " + ScenarioName);
        }*/
    }

    public void onTestSkipped(ITestResult result) {
        TestBase.quitDriver();
        TestBase.unload();
        ExtentReportListener.getExtent().log(Status.SKIP, "Failed");
        System.out.println("SKIP");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext context) {
        System.out.println("Execution started...");
        extent = setUp();
      /*  File PASSED = new File(TestBase.folderName + "\\PASSED");

        File FAILED = new File(TestBase.folderName + "\\FAILED");

        if (!PASSED.exists()) {
            PASSED.mkdirs();
        }
        if (!FAILED.exists()) {
            FAILED.mkdirs();
        }*/

    }

    public void onFinish(ITestContext context) {
        System.out.println("Execution completed env...");
        extent.flush();
        System.out.println("Generated Report. . .");

        try {
            ReportOrganizer.segregateReports();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


}
