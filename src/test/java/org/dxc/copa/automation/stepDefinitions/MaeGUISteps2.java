package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @And("I click on check-in button for the passenger")
    public void iClickOnCheckInButtonForThePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on check-in button for the passenger");
            maeGUI_2.ClickOnCheck_inButtonForThePassenger(logInfo);
            logInfo.pass("I click on check-in button for the passenger");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I Select the Seat Map option from the menu")
    public void iSelectTheSeatMapOptionFromTheMenu() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Select the Seat Map option from the menu");
            maeGUI_2.SelectSeatMapOptionFromMenu(logInfo);
            logInfo.pass("I Select the Seat Map option from the menu");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I clear Any Previous Data from Seat Map option")
    public void iClearAnyPreviousDataFromSeatMapOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I clear Any Previous Data from Seat Map option");
            maeGUI_2.ClearPreviousDataFromSeatMapOption(logInfo);
            logInfo.pass("I clear Any Previous Data from Seat Map option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the mandatory fields with {string} {string} {string} {string} {string} {string} for Seat Map Option")
    public void iEnterTheMandatoryFieldsWith(String carrierCode, String flightnumber, String date, String From, String To, String Cos) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the mandatory fields with " + carrierCode + " " + flightnumber + " " + date + " " + From + " " + To + " " + Cos + " for Seat Map Option");
            maeGUI_2.EnterMandatoryFieldsInSeatMapOption(logInfo, carrierCode, flightnumber, date, From, To, Cos);
            logInfo.pass("I enter the mandatory fields with " + carrierCode + " " + flightnumber + " " + date + " " + From + " " + To + " " + Cos + " for Seat Map Option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Display button to view the Seat Map")
    public void iClickOnDisplayButtonToViewTheSeatMap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Display button to view the Seat Map");
            maeGUI_2.ClickOnDisplayButtonToViewSeatMap(logInfo);
            logInfo.pass("I click on Display button to view the Seat Map");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform actions on Advanced Display by clicking on checkboxes")
    public void iPerformActionsOnAdvancedDisplayByClickingOnCheckboxes() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform actions on Advanced Display by clicking on checkboxes");
            maeGUI_2.ActionsOnAdvancedDisplayByClickingOnCheckboxes(logInfo);
            logInfo.pass("I perform actions on Advanced Display by clicking on checkboxes");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I search flight by {string} {string} and {string} in gate page")
    public void iSearchFlightByAndInGatePage(String flightnumber, String from, String date) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search flight by " + flightnumber + " " + from + " and " + date + " in gate page");
            maeGUI_2.SearchFlightInGatePage(logInfo, flightnumber, from, date);
            logInfo.pass("I search flight by " + flightnumber + " " + from + " and " + date + " in gate page");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on eTKT Not Sync tab in Gate - All passenger list screen")
    public void iClickOnETKTNotSyncTabInGateAllPassengerListScreen() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on eTKT Not Sync tab in Gate - All passenger list screen");
            maeGUI_2.ClickOnETKTNotSyncTabInGateAllPassengerListScreen(logInfo);
            logInfo.pass("I click on eTKT Not Sync tab in Gate - All passenger list screen");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Submit and Proceed to Pay using Waiver Option as {string} and {string}")
    public void iClickOnSubmitAndProceedToPayUsingWaiverOptionAsAnd(String process, String reasonCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Submit and Proceed to Pay using Waiver Option as " + process + " and " + reasonCode + " ");
            maeGUI_2.ClickOnSubmitAndPayUsingWaiverOption(logInfo, process, reasonCode);
            logInfo.pass("I click on Submit and Proceed to Pay using Waiver Option as " + process + " and " + reasonCode + " ");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on remarks link in order page")
    public void iClickOnRemarksLinkInOrderPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on remarks link in order page");
            maeGUI_2.ClickOnRemarksLinkInOrderPage(logInfo);
            logInfo.pass("I click on remarks link in order page");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to Flifo Search Tab option")
    public void iNavigateToFlifoSearchOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to Flifo Search option");
            maeGUI_2.NavigateToFlifoSearchOption();
            logInfo.pass("I navigate to Flifo Search option");
        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I click on Flifo Tab");

    }

    @And("I enter the mandatory fields with {string} {string} and {string} in Flifo Search Option")
    public void iEnterTheMandatoryFieldsWithAndInFlifoSearchTabOption(String arg0, String arg1, String arg2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the mandatory fields with " + arg0 + " " + arg1 + " and " + arg2 + " in Flifo Search Option");
            maeGUI_2.EnterMandatoryFieldsInFlifoSearchOption(logInfo, arg0, arg1, arg2);
            logInfo.pass("I enter the mandatory fields with " + arg0 + " " + arg1 + " and " + arg2 + " in Flifo Search Option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on search button in Flifo Search option")
    public void iClickOnSearchButtonInFlifoSearchOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on search button in Flifo Search option");
            maeGUI_2.ClickOnSearchButtonInFlifoSearchOption(logInfo);
            logInfo.pass("I click on search button in Flifo Search option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I check the UTC time checkbox in Flifo Search option")
    public void iCheckTheUTCTimeCheckboxInFlifoSearchOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check the UTC time checkbox in Flifo Search option");
            maeGUI_2.CheckUTCTimeCheckboxInFlifoSearchOption(logInfo);
            logInfo.pass("I check the UTC time checkbox in Flifo Search option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I click on search icon in flifo search option")
    public void iClickOnSearchIconInFlifoSearchOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on search icon in flifo search option");
            maeGUI_2.ClickOnSearchIconInFlifoSearchOption();
            logInfo.pass("I click on search icon in flifo search option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify flight details and click on close button in Flifo Search option")
    public void iVerifyFlightDetailsAndClickOnCloseButtonInFlifoSearchOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify flight details and click on close button in Flifo Search option");
            maeGUI_2.VerifyFlightDetailsAndClickOnCloseButtonInFlifoSearchOption(logInfo);
            logInfo.pass("I verify flight details and click on close button in Flifo Search option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Fee Service & Other Charges under Tools menu")
    public void iClickOnFeeServiceOtherChargesUnderToolsMenu() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Fee Service & Other Charges under Tools menu");
            maeGUI_2.ClickOnFeeServiceOtherChargesUnderToolsMenu(logInfo);
            logInfo.pass("I click on Fee Service & Other Charges under Tools menu");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select Mileage Auxiliary Display option under Fee Service & Other Charges")
    public void iSelectMileageAuxiliaryDisplayOptionUnderFeeServiceOtherCharges() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select Mileage Auxiliary Display option under Fee Service & Other Charges");
            maeGUI_2.SelectMileageAuxiliaryDisplayOptionUnderFeeServiceOtherCharges(logInfo);
            logInfo.pass("I select Mileage Auxiliary Display option under Fee Service & Other Charges");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the mandatory fields with {string} and {string} and {string} and {string} for Mileage Auxiliary Display Option")
    public void iEnterTheMandatoryFieldsWithAndAndAndForMileageAuxiliaryDisplayOption(String arg0, String arg1, String arg2, String arg3) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the mandatory fields with " + arg0 + " and " + arg1 + " and " + arg2 + " and " + arg3 + " for Mileage Auxiliary Display Option");
            maeGUI_2.EnterMandatoryFieldsForMileageAuxiliaryDisplayOption(logInfo, arg0, arg1, arg2, arg3);
            logInfo.pass("I enter the mandatory fields with " + arg0 + " and " + arg1 + " and " + arg2 + " and " + arg3 + " for Mileage Auxiliary Display Option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Search button to view available Distance Information and Further additional Information")
    public void iClickOnSearchButtonToViewAvailableDistanceInformationAndFurtherAdditionalInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Search button to view available Distance Information and Further additional Information");
            maeGUI_2.ClickOnSearchButtonToViewAvailableDistanceInformationAndFurtherAdditionalInformation(logInfo);
            logInfo.pass("I click on Search button to view available Distance Information and Further additional Information");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on cancel to exit from the functionality")
    public void iClickOnCancelToExitFromTheFunctionality() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on cancel to exit from the functionality");
            maeGUI_2.ClickOnCancelToExitFromTheFunctionality(logInfo);
            logInfo.pass("I click on cancel to exit from the functionality");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Customer Search under Tools menu")
    public void iClickOnCustomerSearchUnderToolsMenu() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Customer Search under Tools menu");
            maeGUI_2.ClickOnCustomerSearchUnderToolsMenu(logInfo);
            logInfo.pass("I click on Customer Search under Tools menu");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the {string} and click on search in Frequent Flyer Program Details")
    public void iEnterTheAndClickOnSearchInFrequentFlyerProgramDetails(String ffprogram) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the " + ffprogram + " and click on search in Frequent Flyer Program Details");
            maeGUI_2.EnterFrequentFlyerProgramDetails(logInfo, ffprogram);
            logInfo.pass("I enter the " + ffprogram + " and click on search in Frequent Flyer Program Details");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Cancel button to exit from the functionality")
    public void iClickOnCancelButtonToExitFromTheFunctionality() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Cancel button to exit from the functionality");
            maeGUI_2.ClickOnCancelButtonToExitFromTheFunctionality(logInfo);
            logInfo.pass("I click on Cancel button to exit from the functionality");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter {string} command to display outbound connection in Native Shares")
    public void iEnterCommandToDisplayOutboundConnectionInNativeShares(String arg0) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter " + arg0 + " command to display outbound connection in Native Shares");
            maeGUI_2.EnterCommandToDisplayOutboundConnectionInNativeShares(logInfo, arg0);
            logInfo.pass("I enter " + arg0 + " command to display outbound connection in Native Shares");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to SSR Inventory Database option under Tools menu")
    public void iNavigateToSSRInventoryDatabaseOptionUnderToolsMenu() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to SSR Inventory Database option under Tools menu");
            maeGUI_2.NavigateToSSRInventoryDatabaseOptionUnderToolsMenu(logInfo);
            logInfo.pass("I navigate to SSR Inventory Database option under Tools menu");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the mandatory fields with {string} {string} {string} {string} and {string} in SSR Inventory Database option")
    public void iEnterTheMandatoryFieldsWithAndInSSRInventoryDatabaseOption(String arg0, String arg1, String arg2, String arg3, String arg4) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the mandatory fields with " + arg0 + " " + arg1 + " " + arg2 + " " + arg3 + " and " + arg4 + " in SSR Inventory Database option");
            maeGUI_2.EnterMandatoryFieldsInSSRInventoryDatabaseOption(logInfo, arg0, arg1, arg2, arg3, arg4);
            logInfo.pass("I enter the mandatory fields with " + arg0 + " " + arg1 + " " + arg2 + " " + arg3 + " and " + arg4 + " in SSR Inventory Database option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify SSR details and click on cancel button in SSR Inventory Database option")
    public void iVerifySSRDetailsAndClickOnCancelButtonInSSRInventoryDatabaseOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify SSR details and click on cancel button in SSR Inventory Database option");
            maeGUI_2.VerifySSRDetailsAndClickOnCancelButtonInSSRInventoryDatabaseOption(logInfo);
            logInfo.pass("I verify SSR details and click on cancel button in SSR Inventory Database option");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on OKAY button in the confirmation popup")
    public void iClickOnOKAYButtonInTheConfirmationPopup() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on OKAY button in the confirmation popup");
            maeGUI_2.iClickOnOKAYButtonInTheConfirmationPopup(logInfo);
            logInfo.pass("I click on OKAY button in the confirmation popup");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter SSRDetails command to display outbound connection in Native Shares with {string} and {string}")
    public void iEnterSSRDetailsCommandToDisplayOutboundConnectionInNativeSharesWithAnd(String flightNumber, String traveldate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSRDetails command to display outbound connection in Native Shares with " + flightNumber + "" + "and" + traveldate + "");
            maeGUI_2.EnterCommandToDisplayOutboundConnectionInNativeShares(logInfo, flightNumber, traveldate);
            logInfo.pass("I enter SSRDetails command to display outbound connection in Native Shares with " + flightNumber + "" + "and" + traveldate + "");
        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the mandatory fields with {string} {string} {string} {string} in SSR Inventory Database option")
    public void iEnterTheMandatoryFieldsWithInSSRInventoryDatabaseOption(String flight_number, String from, String to, String travel_date) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the mandatory fields with " + flight_number + " " + from + " " + to + " and " + travel_date + " in SSR Inventory Database option");
            maeGUI_2.EnterMandatoryFieldsInSSRInventoryDatabaseOption(logInfo, flight_number, from, to, travel_date);
            logInfo.pass("I  enter the mandatory fields with " + flight_number + " " + from + " " + to + " and " + travel_date + " in SSR Inventory Database option");
        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate the passenger in All passenger list in gate module by PNR")
    public void iValidateThePassengerInAllPassengerListInGateModuleByPNR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the passenger in All passenger list in gate module by PNR");
            maeGUI_2.ValidateThePassengerInAllPassengerListInGateModuleByPNR(logInfo);
            logInfo.pass("I validate the passenger in All passenger list in gate module by PNR");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for the smart search with {string}")
    public void iSearchForTheSmartSearchWith(String smartsearch) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the smart search with " + smartsearch + "");
            maeGUI_2.SearchForTheSmartSearchWith(logInfo, smartsearch);
            logInfo.pass("I search for the smart search with " + smartsearch + "");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I open flight in native shares using the updated date")
    public void iOpenFlightInNativeSharesUsingTheUpdatedDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open flight in native shares using the updated date");
            maeGUI_2.OpenFlightInNativeSharesUsingTheUpdatedDate(logInfo);
            logInfo.pass("I open flight in native shares using the updated date");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I create a PNR in NATIVE SHARES for {string} adult passengers ans {string} child passengers using {string} to {string} and {string}")
    public void iCreateAPNRInNATIVESHARESForAdultPassengersAnsChildPassengersUsingToAnd(String adtcount, String chdcount, String origin, String destination, String dateoftravel) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I create a PNR in NATIVE SHARES for " + adtcount + " adult passengers ans " + chdcount + " child passengers using " + origin + " to " + destination + " and " + dateoftravel + "");
            maeGUI_2.CreateAPNRInNATIVESHARESForAdultPassengersAnsChildPassengersUsingToAnd(logInfo, adtcount, chdcount, origin, destination, dateoftravel);
            logInfo.pass("I create a PNR in NATIVE SHARES for " + adtcount + " adult passengers ans " + chdcount + " child passengers using " + origin + " to " + destination + " and " + dateoftravel + "");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select pricing option Price as booked after retrieving PNR from shares")
    public void iSelectPricingOptionPriceAsBookedAfterRetrievingPNRFromShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option Price as booked after retrieving PNR from shares");
            maeGUI_2.pricingOptionPriceAsBookedNew(logInfo);
            logInfo.pass("I select pricing option Price as booked after retrieving PNR from shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform Involuntary Refund for specific segment {string} with Reason Code as {string} and Refund Reason Code as {string}")
    public void iPerformInvoluntaryRefundForSpecificSegmentWithReasonCodeAndRefundReasonCodeAs(String segment, String reasonCode, String refundReasonCode) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Involuntary Refund for specific segment");
            maeGUI_2.inVoluntaryRefundForSpecificSegment(logInfo, segment, reasonCode, refundReasonCode);
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I change the class of seat {string} for the multiple segment {string}")
    public void iChangeTheClassOfSeatForThemultipleSegment(String cos, String segment) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the class of seat to " + cos + " for the multiple segment " + segment);
            maeGUI_2.changeCOSForMultipleSegment(logInfo, cos, segment);
            logInfo.pass("I change the class of seat to " + cos + " for the multiple segment " + segment);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform Involuntary Reissue for multiple segments {string} with Reason Code as {string} and Reissue Reason Code as {string}")
    public void iPerformInvoluntaryReissueForMultipleSegmentsWithReasonCodeAsAndReissueReasonCodeAs(String segment, String reasonCode, String reissueReasonCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Involuntary Reissue for multiple segment");
            maeGUI_2.inVoluntaryReissueFormultipleSegment(logInfo, segment, reasonCode, reissueReasonCode);
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I make the payment using Dinners Club with instalment option as {string}")
    public void iMakeThePaymentUsingDinnersClubWithInstalmentOptionAs(String arg0) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the payment using Dinners Club with instalment option as " + arg0);
            maeGUI_2.makePaymentUsingDinnersClubWithInstalmentOptionAs(logInfo, arg0);
            logInfo.pass("I make the payment using Dinners Club with instalment option as " + arg0);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I choose two modes of payment where the first payment is {int}% and the second payment is {int}%")
    public void iChooseTwoModesOfPaymentWhereTheFirstPaymentIsAndTheSecondPaymentIs(int arg0, int arg1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I choose two modes of payment where the first payment is {int}% and the second payment is {int}%");
            maeGUI_2.ChooseTwoModesOfPaymentWith20And80Split(logInfo);
            logInfo.pass("I choose two modes of payment where the first payment is {int}% and the second payment is {int}%");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the details in the email recipients page for both passengers")
    public void iEnterTheDetailsInTheEmailRecipientsPageForBothPassengers() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the details in the email recipients page for both passengers");
            maeGUI_2.SetEmailforTwoPassengers(logInfo);
            logInfo.pass("I enter the details in the email recipients page for both passengers");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        }

    @And("I check the ticket deatils and History in Native shares")
    public void iCheckTheTicketDeatilsAndHistoryInNativeShares() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check the ticket deatils and History in Native shares");
            maeGUI_2.TicketDeatilsAndHistoryInNativeShares(logInfo);
            logInfo.pass("I check the ticket deatils and History in Native shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }


    }
    }


















