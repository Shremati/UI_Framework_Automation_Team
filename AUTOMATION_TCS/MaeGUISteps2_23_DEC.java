package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.java.en.And;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.testng.Assert;

import static org.apache.poi.sl.draw.geom.GuideIf.Op.cos;
import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;

public class MaeGUISteps2 extends StepManager {


    ExtentTest logInfo = null;

    @And("I want to print Hello World in the Console")
    public void i_want_to_print_Hello_world_in_the_console() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I want to print Hello World in the Console");
            maeGUI_2.printHelloWorld();
            logInfo.pass("I want to print Hello World in the Console");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I want to print Hello World2 in the Console")
    public void iWantToPrintHelloWorldInTheConsole() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I want to print Hello World2 in the Console");
            maeGUI.navigateToGUIFromiShares(logInfo);
            logInfo.pass("I want to print Hello World2 in the Console");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform voluntary refund using CreditCard override option")
    public void iPerformVoluntaryRefundUsingCreditCardOverrideOption() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform voluntary refund using CreditCard override option");
            maeGUI_2.voluntaryRefundUsingCreditCardOverrideOption(logInfo);
            logInfo.pass("I perform voluntary refund using CreditCard override option");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI_2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I Verify Baggage allowance information for All Segments along with Price Quote")
    public void iVerifyBaggageAllowanceInformationForAllSegmentsAlongWithPriceQuote() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify Baggage allowance information for All Segments along with Price Quote");
            maeGUI_2.BaggageAllowanceInformationForAllSegmentsAlongWithPriceQuote(logInfo);
            logInfo.pass("I Verify Baggage allowance information for All Segments along with Price Quote");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI_2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select specific class {string} for Return flight in Economy Class")
    public void iSelectSpecificClassForReturnFlightInEconomyClass(String cos) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class " + cos + " for Return flight in Economy Class");
            maeGUI_2.SelectSpecificSeatInEconomyClassReturnFlight(logInfo, cos);
            logInfo.pass("I select specific class " + cos + " for Return flight in Economy Class");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select pricing option as best buy after clicking back button")
    public void iSelectPricingOptionAsBestBuyAfterClickingBackButton() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option as Best Buy");
            maeGUI.pricingOptionBestBuy(logInfo);
            logInfo.pass("I select pricing option as Best Buy");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("Select pricing option as best buy");
    }

    @And("I click on Biosecurity Chatbot in GUI application")
    public void iClickOnBiosecurityChatbotInGUIApplication() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Biosecurity Chatbot in GUI application");
            maeGUI_2.ClickOnBiosecurityChatbotInGUIApplication(logInfo);
            logInfo.pass("I click on Biosecurity Chatbot in GUI application");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter the {string} in the Chatbot")
    public void iEnterTheInTheChatbot(String arg0) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the " + arg0 + " in the Chatbot");
            maeGUI_2.EnterTextInChatbot(logInfo, arg0);
            logInfo.pass("I enter the " + arg0 + " in the Chatbot");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
}










