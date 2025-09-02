package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.testng.Assert;

import java.io.IOException;

import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;

public class MaeGUISteps extends StepManager
{
    ExtentTest logInfo = null;

    @Given("COPA GUI Application is launched in the browser")
    public void COPA_GUI_application_is_launched_in_the_browser() {
        System.out.println("Given - Launch COPA GUI Application");

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "COPA GUI Application is launched in the browser");
            maeGUI.navigateToCOPA_GUIUrl(logInfo);
            logInfo.pass("COPA GUI Application is launched in the browser");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to COPA GUI Application from iShares Page")
    public void i_navigate_to_GUI_application_from_ishares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to COPA GUI Application from iShares Page");
            maeGUI.navigateToGUIFromiShares(logInfo);
            logInfo.pass("I navigate to COPA GUI Application from iShares Page");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to iShares Page from COPA GUI Application")
    public void iNavigateToISharesPageFromCOPAGUIApplication() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to iShares Page from COPA GUI Application");
            maeGUI.navigateToiSharesFromGUI(logInfo);
            logInfo.pass("I navigate to iShares Page from COPA GUI Application");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I logout from COPA GUI application")
    public void i_logout_from_COPA_GUI_application() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I logout from COPA GUI application");
            maeGUI.logoutFromCOPA_GUIApplication(logInfo);
            logInfo.pass("I logout from COPA GUI application");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @Then("I enter valid credentials to log into COPA GUI application")
    public void i_enter_valid_credentials_to_log_into_COPA_GUI_application() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I enter valid credentials to log into COPA GUI application");
            maeGUI.logIntoGUIApplication(logInfo);
            logInfo.pass("I enter valid credentials to log into COPA GUI application");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @Then("I validate successful login")
    public void iValidateSuccessfulLogin() {
        System.out.println("Validate Login: ");

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate successful login");
            Assert.assertTrue(maeGUI.validateLogin(logInfo));
            logInfo.pass("Validated: Login is successful");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @Then("I get the build number")
    public void i_get_the_build_number() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I get the build number");
            maeGUI.getBuildNumber(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @Then("I navigate to home screen")
    public void i_navigate_to_home_screen() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to home screen");
            maeGUI.clickCopaLink(logInfo);
            logInfo.pass("I navigate to home screen");

        } catch (AssertionError | Exception e) {

             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the Sales Office and Currency {string} and {string}")
    public void i_change_the_sales_office_and_currency_and(String office, String currency)
    {

        try {

//            if ( globalConstants.guiTestEnv.equalsIgnoreCase("UATMinorRelease") &&
//                    (office.equalsIgnoreCase("PTY - City Ticket Office") || office.equalsIgnoreCase("PTY - ATO"))  )
//                office = "PTY ATO";
//            else if ( globalConstants.guiTestEnv.equalsIgnoreCase("UAT") )
//                office = "PTY CTO COSTA DEL ESTE";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the Sales Office and Currency ");
            maeGUI.changeOffice(office, currency, logInfo);
            logInfo.pass("I change the Sales Office to: " + office + " and Currency : " + currency);

        } catch (AssertionError | Exception e) {

             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on the Reservation section")
    public void i_click_on_the_reservation_section() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I click on the Reservation section");
            maeGUI.clickReservations(logInfo);
            logInfo.pass("I click on the Reservation section");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {

             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
        System.out.println("Click Reservation..");
    }



    @Then("I validate the iShares PNR created in the GUI order Page")
    public void page_should_display() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I validate the iShares PNR created in the order Page");
            maeGUI.validateOrder(logInfo);
            logInfo.pass("I validate the iShares PNR created in the order Page");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for the PNR created in Reservation Section")
    public void i_search_for_the_order_created_in_Reservation_section() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the PNR created in Reservation Section");
            maeGUI.clickReservations(logInfo);
            maeGUI.searchOrder(logInfo);
            logInfo.pass("I search for the PNR created in Reservation Section");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I close all the sales reports for COPA GUI {string} suite")
    public void i_close_all_the_sales_reports(String suite) {

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I close the agent sales reports for all POS");
            maeGUI.CloseSalesReports(suite, logInfo);
            logInfo.pass("All the agent reports are now closed");

        } catch (AssertionError | Exception e) {

             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I refresh the GUI page and check if the segments are flown")
    public void I_refresh_the_GUI_page() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I refresh the GUI page and check if the segments are flown");
            maeGUI.refreshTheGUIPage(logInfo);
            logInfo.pass("I refresh the GUI page and check if the segments are flown");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        }
        catch (Exception e) {
             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @When("I click on New Order for creating new PNR in GUI")
    public void i_click_on_new_order() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I click on New Order for creating new PNR in GUI");
            maeGUI.orderClickMenu();
            logInfo.pass("I click on New Order for creating new PNR in GUI");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
        System.out.println("I click on New Order");
    }

    @And("Select from and to City {string} and {string}")
    public void select_from_and_to_city_and(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "Select from and to City for 1st Segment");
            maeGUI.selectCities(origin, destination,logInfo);
            logInfo.pass("Selected origin city : " + origin + " and the destination city: " + destination+" for 1st Segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add segment from and to City {string} and {string}")
    public void select_from_and_to_city_and_2(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "Select from and to City for 2nd Segment");
            maeGUI.selectCitiesForSecondSegment(origin, destination,logInfo);
            logInfo.pass("Selected origin city : " + origin + " and the destination city: " + destination+" for 2nd segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add third segment from and to City {string} and {string}")
    public void select_third_segment_from_and_to_city_and_2(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "Select from and to City for 3rd Segment");
            maeGUI.selectCitiesForThirdSegment(origin, destination,logInfo);
            logInfo.pass("Selected origin city : " + origin + " and the destination city: " + destination+" for 3rd segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add fourth segment from and to City {string} and {string}")
    public void iAddFourthSegmentFromAndToCityAnd(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "Select from and to City for 4th Segment");
            maeGUI.selectCitiesForFourthSegment(origin, destination,logInfo);
            logInfo.pass("Selected origin city : " + origin + " and the destination city: " + destination+" for 4th segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Start Date {string} for one way booking")
    public void i_enter(String travelDate) throws Exception
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter date of departure for one way booking");
            maeGUI.bookOneWay(travelDate, logInfo);
            logInfo.pass("I enter date of departure for one way booking");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Start Date {string} and Return Date {string} for two way booking")
    public void i_enter_and(String startDate, String returnDate)
    {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter date of departure and date of arrival for two way booking");
            maeGUI.bookTwoWay(startDate, returnDate, logInfo);
            logInfo.pass("I enter date of departure and date of arrival for two way booking");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Start Date {string} for 2nd Segment")
    public void i_enter_startDate_for_2nd_Segment(String travelDate) throws Exception
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter date of departure for 2nd Segment");
            maeGUI.book2ndSegment(travelDate, logInfo);
            logInfo.pass("I enter date of departure for 2nd Segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Start Date {string} for 3rd Segment")
    public void i_enter_startDate_for_3rd_Segment(String travelDate) throws Exception
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter date of departure for 3rd Segment");
            maeGUI.book3rdSegment(travelDate, logInfo);
            logInfo.pass("I enter date of departure for 3rd Segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select class {string} for Origin flight")
    public void i_select_class_for_origin_flight(String cabin) throws ClassNotFoundException {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class for Origin flight");

            maeGUI.clickOriginFlight();
            if (cabin.equalsIgnoreCase("Economy")) {
                maeGUI.selectFullEconomy(logInfo);
            } else if (cabin.equalsIgnoreCase("Business")) {
                maeGUI.selectFullBusiness(logInfo);
            }   else if (cabin.equalsIgnoreCase("SelectADifferentFlight")) {
                maeGUI.selectFullEconomyForADifferentFlight(logInfo);
            }
            else {
                maeGUI.selectAnySeat();
            }
            logInfo.pass("I select " + cabin + " class for Origin flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select class {string} for Return flight")
    public void i_select_class_for_return_flight(String cabin) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class in other segment flights");
            maeGUI.selectAllFlights(cabin,logInfo);
            logInfo.pass("I select " + cabin + " class in other segment flights");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I select pricing option as best buy")
    public void i_select_pricing_option_as_best_buy() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option as Best Buy");
            maeGUI.clickPriceQuoteButton(logInfo);
            maeGUI.pricingOptionBestBuy(logInfo);
            logInfo.pass("I select pricing option as Best Buy");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("Select pricing option as best buy");
    }


    @And("I select pricing option Price as Booked")
    public void i_select_pricing_option_price_as_booked() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option as Price as Booked");
            maeGUI.clickPriceQuoteButton(logInfo);
            maeGUI.pricingOptionAsBooked(logInfo);
            logInfo.pass("I select pricing option Price as Booked");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I select pricing option as Economy Classic Flex")
    public void i_select_pricing_option_as_Economy_Flex() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option as Economy Classic Flex");
            maeGUI.clickPriceQuoteButton(logInfo);
            maeGUI.pricingOptionEconomyClassicFlex(logInfo);
            logInfo.pass("I select pricing option as Economy Classic Flex");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("Select pricing option as Economy Classic Flex");
    }


    @And("I select Adult passengers and search for flights")
    public void i_select_adult_passengers_and_search_for_flights() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter adults to travel");
            maeGUI.enterAdultNumber(logInfo);
            logInfo.pass("I enter adults to travel");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select child passengers")
    public void i_select_child_passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter children to travel");
            maeGUI.enterChildNumber(logInfo);
            logInfo.pass("I enter children to travel");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");


        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select infant with Seat passengers")
    public void i_select_infant_with_seat_passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select infant with Seat passengers");
            maeGUI.enterInfantWithSeatNumber(logInfo);
            logInfo.pass("I select infant with Seat passengers");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select infant without seat passengers")
    public void i_select_infant_without_seat_passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select infant without seat passengers");
            maeGUI.enterInfantWithoutSeatNumber(logInfo);
            logInfo.pass("I select infant without seat passengers");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select the Quote Options and click on Next")
    public void i_select_the_quote_options_and_click_on_next() throws InterruptedException {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the Quote Options and click on Next");
            maeGUI.checkQuoteOptions(logInfo);
            logInfo.pass("I select the Quote Options and click on Next");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I select the Quote Options and click on Next");
    }


    @And("I check class for Business Class availability")
    public void i_check_class_availability()
    {
        try
        {
            maeGUI.checkBusinessClass();
        }
        catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate the Price Quote and click on Next")
    public void i_validate_the_price_quote_and_click_on_next() throws InterruptedException {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the Price Quote and click on Next");
            maeGUI.clickOrderPriceQuoteNext(logInfo);
            logInfo.pass("I validate the Price Quote and click on Next");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select and delete the segment {string}")
    public void i_select_the_second_segment_and_delete_the_segment(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select and delete the segment");
            maeGUI.deleteSecondSegment(logInfo,SegmentNumber);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @Then("I enter required passenger details for COPA GUI")
    public void i_enter_required_passenger_details() throws Exception {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter required passenger details for COPA GUI");
            maeGUI.enterPassengerDetails(logInfo);
            logInfo.pass("I enter required passenger details for COPA GUI");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I enter required passenger details");
    }


    @And("I Click on Book and FileFare button")
    public void i_click_on_book_and_file_fare_button() throws InterruptedException {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Click on Book and FileFare button");
            maeGUI.clickBookAndFileFare(logInfo);
            logInfo.pass("I Click on Book and FileFare button");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I Click on Book and FileFare button");
    }


    @And("I Click on CheckOut button for payment")
    public void i_click_on_checkOut_button() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Click on CheckOut button for payment");
            maeGUI.clickCheckOutButton(logInfo);
            logInfo.pass("I Click on CheckOut button for payment");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I choose one mode of payment")
    public void i_choose_one_mode_of_payment() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I choose one mode of payment");
            maeGUI.oneModeOfPayment(logInfo);
            logInfo.pass("I choose one mode of payment");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I choose two mode of payments")
    public void i_choose_two_mode_of_payments() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I choose two mode of payments");
            maeGUI.twoModesOfPayment(logInfo);
            logInfo.pass("I choose two mode of payments");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I choose three mode of payments")
    public void i_choose_three_mode_of_payments() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I choose three mode of payments");
            maeGUI.threeModesOfPayment(logInfo);
            logInfo.pass("I choose three mode of payments");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I make the first payment by selecting the payment type as {string}")
    public void i_make_the_first_payment_by_selecting_the_payment_type_as(String paymentType) {
        try
        {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the first payment by selecting the payment type as "+paymentType);
            maeGUI.makeFirstPayment(paymentType, logInfo);
            logInfo.pass(paymentType+" Payment is successful");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I make the second payment by selecting the payment type as {string}")
    public void i_make_the_second_payment_by_selecting_the_payment_type_as(String paymentType) {
        try
        {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the second payment by selecting the payment type as "+paymentType);
            maeGUI.makeSecondPayment(paymentType, logInfo);
            logInfo.pass(paymentType+" Payment is successful");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I make the third payment by selecting the payment type as {string}")
    public void i_make_the_third_payment_by_selecting_the_payment_type_as(String paymentType) {
        try
        {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the third payment by selecting the payment type as "+paymentType);
            maeGUI.makeThirdPayment(paymentType, logInfo);
            logInfo.pass(paymentType+" Payment is successful");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the details in the email recipients page")
    public void i_enter_the_details_in_the_email_recipients_page() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the details in the email recipients page");
            maeGUI.setEmail(logInfo);
            logInfo.pass("I successfully enter the details in the email recipients page");
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }



    @And("I validate if the payment is successful")
    public void validate_if_the_payment_is_successful() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "Validate if the payment is successful");
            maeGUI.validatePayment(logInfo);
            logInfo.pass("Payment is successful");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @Then("I check the ticket in the Tickets tab")
    public void i_check_the_ticket_in_the_tickets_tab()
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I check the ticket in the Tickets tab");
            maeGUI.checkTicket(logInfo);
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I check the EMDs in EMD tab")
    public void i_check_the_emds_in_emd_tab()
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check the EMDs in EMD tab");
            maeGUI.checkEMD(logInfo);
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I click on Proceed to Check-In button")
    public void i_click_on_proceed_to_check_in_button() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Proceed to Check-In button");
            maeGUI.proceedToCheckin(logInfo);
            logInfo.pass("I click on Proceed to Check-In button");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I click on Proceed to Check-In button");
    }


    @And("I enter the details in Security Document Verification - ADC & APIS page")
    public void i_enter_the_details_in_security_document_verification_adc_apis_page() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the details in Security Document Verification - ADC & APIS page");
            maeGUI.enterSecurityDocumentDetails(logInfo);
            logInfo.pass("I enter the details in Security Document Verification - ADC & APIS page");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I enter the details in Security Document Verification");
    }

    @And("I navigate to Check-In page")
    public void i_navigate_to_check_in_page() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to Check-In page");
            maeGUI.menu_Checkin(logInfo);
            logInfo.pass("I navigate to Check-In page");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I navigate to Check-In page");

    }


    @And("I search the Order number in Checkin Page")
    public void i_search_the_order_number() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search the Order number");
            maeGUI.searchCheckinOrder(logInfo);
            logInfo.pass("I search the Order number");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @Then("I Validate APIS Complete and click on Done button")
    public void i_click_on_done_button() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "Validate APIS Complete & click on Done button");
            maeGUI.validateApis(logInfo);
            logInfo.pass("Validated the APIS Complete message");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
            maeGUI.clickDone(logInfo);
            logInfo.pass("I clicked on Done button");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I click on check-in for the passenger")
    public void i_on_check_in_for_the_passenger() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on check-in for the passenger");
            maeGUI.passengerCheckIn(logInfo);
            logInfo.pass("I click on check-in for the passenger");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @Then("I validate the confirmation dialog that passenger is Checked-in")
    public void i_validate_the_confirmation_dialog_that_passenger_is_checked_in() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the confirmation dialog that passenger is Checked-in");
            maeGUI.confirmCheckin(logInfo);
            logInfo.pass("I validate the confirmation dialog that passenger is Checked-in");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Start Date {string} for 4th Segment")
    public void iEnterStartDateForFourthSegment(String travelDate) throws Exception{
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter date of departure for 4th Segment");
            maeGUI.book4thSegment(travelDate, logInfo);
            logInfo.pass("I enter date of departure for 4th Segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I navigate back to previous tab in the browser {string}")
    public void iNavigateBackToPreviousTabInTheBrowser(String tabNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate back to previous tab in the browser");
            maeGUI.navigateToRequiredTab(logInfo,tabNum);
            logInfo.pass("I navigate back to previous tab in the browser");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I try to retrieve the pnr from Order and Summary screen")
    public void iTryToRetrieveThePnrInOrderAndSummaryScreen() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve pnr from Order and Summary screen");
            maeGUI.clickReservations(logInfo);
            maeGUI.searchOrderScreen(logInfo);
            maeGUI.clickSummary(logInfo);
            logInfo.pass("I try to retrieve pnr from Order and Summary screen");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click the order tab")
    public void iClickTheOrderTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve pnr from Order screen");
            maeGUI.clickReservations(logInfo);
            maeGUI.searchOrderScreen(logInfo);
            logInfo.pass("I try to retrieve pnr from Order screen");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I click the Tickets tab")
    public void iClickTheTicketsTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Ticket tab");
            maeGUI.clickTicketsTab(logInfo);
            logInfo.pass("I click the Ticket tab");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click the Passengers tab")
    public void iClickThePassengersTab() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Passengers tab");
            maeGUI.clickPassengersTab(logInfo);
            logInfo.pass("I click the Passengers tab");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I modify the INS passenger to Child passenger in passenger tab")
    public void iModifyTheINSPassengerToChildPassengerInPassengerTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to modify the INS passenger to Child passenger");
            maeGUI.updatePassengerInfoChild(logInfo);
            logInfo.pass("I try to modify the INS passenger to Child passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I add ARNK after to the itinerary {string}")
    public void iAddARNKAfterToTheItinerary(String segment) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add ARNK After to the itenary :"+segment);
            maeGUI.addingARNKAfter(logInfo,segment);
            logInfo.pass("I add ARNK After to the itenary :"+segment);
            
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I click the services Tab")
    public void iClickTheServicesTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Services tab");
            maeGUI.clickServicesTab(logInfo);
            logInfo.pass("I click the Services tab");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click BulkTicket option")
    public void iClickBulkTicketOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click BulkTicket option");
            maeGUI.clickBTOption(logInfo);
            logInfo.pass("I click BulkTicket option");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }


    }

    @And("I select the passenger from Ticket Tab")
    public void iSelectThePassengerFromTicketTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the passenger from Ticket Tab");
            maeGUI.selectPassengerFromTicketTab(logInfo);
            logInfo.pass("I select the passenger from Ticket Tab");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click the EMD subtab present in Tickets tab")
    public void iClickTheEMDSubtabPresentInTicketsTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the EMD subtab present in Tickets tab");
            maeGUI.selectEMDFromTicketsTab(logInfo);
            logInfo.pass("I click the EMD subtab present in Tickets tab");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I click the Tickets tab and try to click the Coupon number and verify the details")
    public void iClickTheTicketsTabAndTryToClickTheCouponNumberAndVerifyTheDetails() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Tickets tab and try to click the Coupon number and verify the details");
            maeGUI.clickCouponNumber(logInfo);
            logInfo.pass("I click the Tickets tab and try to click the Coupon number and verify the details");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I try to retrieve the pnr from Order Screen to check the {string} status")
    public void iTryToRetrieveThePnrFromOrderScreenToCheckTheStatus(String ticketStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve the pnr from Order Screen to check the "+ticketStatus +" status");
            maeGUI.searchOrderScreenToCheckStatus(logInfo,ticketStatus);
            logInfo.pass("I try to retrieve the pnr from Order Screen to check the "+ticketStatus +" status");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I edit passenger details")
    public void iEditPassengerDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I edit passenger details");
            maeGUI.editPassengerInfo(logInfo);
            logInfo.pass("I edit passenger details");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select the availability type as {string}")
    public void iSelectTheAvailabilityTypeAs(String availability) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the availability type as " + availability);
            maeGUI.selectAvailability(logInfo, availability);
            logInfo.pass("I select the availability type as " + availability);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I try to delete the OSI remark from the pnr {string}")
    public void iTryToDeleteTheOSIRemarkFromThePnr(String osiValue) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to delete the OSI remark from the pnr "+osiValue);
            maeGUI.deleteOSIRemark(logInfo,osiValue);
            logInfo.pass("I try to delete the OSI remark from the pnr "+osiValue);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I try to add the OSI remark as {string}")
    public void iTryToAddTheOSIRemarkAs(String osiRemarkText) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to add the OSI remark as "+osiRemarkText);
            maeGUI.addOSIRemark(logInfo,osiRemarkText);
            logInfo.pass("I try to add the OSI remark as "+osiRemarkText);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select the Quote Options and click on Next retrieving PNR from shares")
    public void iSelectTheQuoteOptionsAndClickOnNextRetrievingPNRFromShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the Quote Options and click on Next retrieving PNR from ishares");
            maeGUI.checkQuoteOptionsRetrievingPNRFromShares(logInfo);
            logInfo.pass("I select the Quote Options and click on Next retrieving PNR from ishares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
        System.out.println("I select the Quote Options and click on Next retrieving PNR from ishares");
    }

    @And("I try to retrieve the pnr from Order Screen to check the {string} status in ticket tab")
    public void iTryToRetrieveThePnrFromOrderScreenToCheckTheStatusInTicketTab(String ticketStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve the pnr from Order Screen to check the "+ticketStatus +" status in ticket tab");
            maeGUI.searchOrderScreenToCheckStatusInTicketTab(logInfo,ticketStatus);
            logInfo.pass("I try to retrieve the pnr from Order Screen to check the "+ticketStatus +" status in ticket tab");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click on File Fare button")
    public void iClickOnFileFareButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Click on FileFare button");
            maeGUI.clickFileFare(logInfo);
            logInfo.pass("I Click on FileFare button");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Book button")
    public void iClickOnBookButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Book button");
            maeGUI.clickBookButton(logInfo);
            logInfo.pass("I click on Book button");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click the order tab and enter ticket number")
    public void iClickTheOrderTabAndEnterTicketNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve pnr from Order screen using ticket number");
            maeGUI.clickReservations(logInfo);
            maeGUI.searchOrderScreenUsingTicketNumber(logInfo);
            logInfo.pass("I try to retrieve pnr from Order screen using ticket number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I select pricing option Price as Best Buy retrieving PNR from shares")
    public void iSelectPricingOptionPriceAsBestBuyRetrievingPNRFromShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option Price as Best buy retrieving PNR from shares");
            maeGUI.pricingOptionAsBestBuyRetrievePNRFromShares(logInfo);
            logInfo.pass("I select pricing option Price as Best buy retrieving PNR from shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I select pricing option Price as Booked retrieving PNR from shares")
    public void iSelectPricingOptionPriceAsBookedRetrievingPNRFromShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option Price as Booked retrieving PNR from shares");
            maeGUI.pricingOptionAsBookedRetrievePNRFromShares(logInfo);
            logInfo.pass("I select pricing option Price as Booked retrieving PNR from shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I select the reason code and select alternate flight on {string}")
    public void iSelectTheReasonCodeAndSelectAlternateFlightOn(String DeptDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the reason code and select alternate flight");
            maeGUI.selectAlternateFlight(logInfo, DeptDate);
            logInfo.pass("I selected alternate flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }



    @And("I change the date format for passenger DOB")
    public void iChangeTheDateFormatForPassengerDOB() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date format for passenger DOB");
            maeGUI.changeDateFormatForPaxDOB(logInfo);
            logInfo.pass("I change the date format for passenger DOB");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I try to retrieve the pnr after cancelling the segment {string}")
    public void iTryToRetrieveThePnrAfterCancellingTheSegment(String remainingSegments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve the pnr after cancelling the segment");
            maeGUI.searchOrderScreenToCheckRemainingSegementsAfterCancel(logInfo, remainingSegments);
            logInfo.pass("I try to retrieve the pnr after cancelling the segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I click on Book and FileFare button or File Fare button")
    public void iClickOnBookAndFileFareButtonOrFileFareButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Book and FileFare button or File Fare button");
            maeGUI.clickBookAndFileFareOrFileFare(logInfo);
            logInfo.pass("I click on Book and FileFare button or File Fare button");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I do the manual quote for each passenger")
    public void iDoTheManualQuoteForEachPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the manual quote for each passenger");
            maeGUI.addManualQuote(logInfo);
            logInfo.pass("I do the manual quote for each passenger");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to Order tab")
    public void iNavigateToOrderTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to Order tab");
            maeGUI.navigateToOrderTab(logInfo);
            logInfo.pass("I navigate to Order tab");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I select the Split Booking option from the DropDown for the required passenger {string}")
    public void iSelectTheSplitBookingOptionFromTheDropDownForTheRequiredPassenger(String num) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the Split Booking option from the DropDown");
            maeGUI.splitBookingOption(logInfo,num);
            logInfo.pass("I select the Split Booking option from the DropDown");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I try to retrieve the second pnr from search screen")
    public void iTryToRetrieveTheSecondPnrFromSearchScreen() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve the second pnr from search screen");
            maeGUI.searchForSecondPnr(logInfo);
            logInfo.pass("I try to retrieve the second pnr from search screen");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }

    }

    @And("I verify ADC and APIS details and click submit button {string}")
    public void iVerifyADCAndAPISDetailsAndClickSubmitButton(String Value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify ADC and APIS details and click submit button");
            maeGUI.verifyADCAndAPISClickSubmit(logInfo, Value);
            logInfo.pass("I verify ADC and APIS details and click submit button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I click offload button to uncheck the passenger")
    public void iClickOffloadButtonToUncheckThePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click offload button to uncheck the passenger");
            maeGUI.clickOffLoadButton(logInfo);
            logInfo.pass("I click offload button to uncheck the passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on book button after adding the segments")
    public void iClickOnBookButtonAfterAddingTheSegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on book button after adding the segments");
            maeGUI.clickBookButtonAfterAddingTheSegments(logInfo);
            logInfo.pass("I click on book button after adding the segments");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Start Date {string} for 5th Segment")
    public void iEnterStartDateForFifthSegment(String travelDate) throws Exception{
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter date of departure for 5th Segment");
            maeGUI.book5thSegment(travelDate, logInfo);
            logInfo.pass("I enter date of departure for 5th Segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add fifth segment from and to City {string} and {string}")
    public void iAddFifthSegmentFromAndToCityAnd(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "Select from and to City for 5th Segment");
            maeGUI.selectCitiesForFifthSegment(origin, destination,logInfo);
            logInfo.pass("Selected origin city : " + origin + " and the destination city: " + destination+" for 5th segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add an INF without seat passenger to the PNR")
    public void iAddAnINFWithoutSeatPassengerToThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add an INF without seat passenger to the PNR");
            maeGUI.addingINFWithoutSeatToThePNR(logInfo);
            logInfo.pass("I add an INF without seat passenger to the PNR");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add an INS passenger to the PNR")
    public void iAddAnINSPassengerToThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add an INS passenger to the PNR");
            maeGUI.addingINSToThePNR(logInfo);
            logInfo.pass("I add an INS passenger to the PNR");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Tools Menu in GUI application")
    public void I_click_on_Tools_Menu(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Tools Menu in GUI application");
            maeGUI.clickOnToolsMenuInGUIApplication(logInfo);
            logInfo.pass("I click on Tools Menu in GUI application");

        } catch(AssertionError | Exception exception){
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Order Tab to view the Itinerary Details")
    public void iClickOnOrderTabToViewTheItineraryDetails() {

        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Order Tab to view the Itinerary Details");
            maeGUI.clickOnOrderTab(logInfo);
            logInfo.pass("I click on Order Tab to view the Itinerary Details");

        } catch(AssertionError | Exception exception){
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I navigate to Gate section")
    public void iNavigateToGateSection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I click on Gate section");
            maeGUI.clickGate(logInfo);
            logInfo.pass("I click on Gate section");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select the flight actions as {string}")
    public void iSelectTheFlightActionsAs(String actionType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I select the flight actions as: "+actionType);
            maeGUI.clickFlightActions(logInfo);
            maeGUI.selectActionType(logInfo, actionType);
            logInfo.pass("I select the flight actions as: "+actionType);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I search the flight for the segment {string} in Gate section")
    public void iSearchTheFlightForTheSegment(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I search the flight for the given segment in Gate section");
            maeGUI.searchFlightInGate(logInfo, segmentIndex);
            logInfo.pass("I search the flight for the given segment in Gate section");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I try to retrieve the ticket number by selecting {string} option")
    public void iTryToRetrieveTheTicketNumberBySelectingOption(String pnrValueText) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve the ticket number by selecting "+pnrValueText+" option");
            maeGUI.selectValueFromPNRDropDown(logInfo,pnrValueText);
            logInfo.pass("I try to retrieve the ticket number by selecting "+pnrValueText+" option");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select the type for mass transfer as {string}")
    public void iSelectTheTypeForMassTransferAs(String transferType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I select the type for mass transfer");
            maeGUI.selectMassTransferType(logInfo, transferType);
            logInfo.pass("I select the type for mass transfer");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select the flight for outbound mass transfer")
    public void iSelectTheFlightForOutboundMassTransfer() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I select the flight for outbound mass transfer");
            maeGUI.selectTheFlightForOutboundMassTransfer(logInfo);
            logInfo.pass("I select the flight for outbound mass transfer");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select the reason code as {string} and select the flight for mass transfer for the segment {string}")
    public void iSelectTheReasonCodeAndSelectTheFlightForMassTransfer(String reasonCode, String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I select the reason code and select the flight for mass transfer");
            maeGUI.selectTheReasonCodeAndFlightForMassTransfer(logInfo, reasonCode,segmentIndex);
            logInfo.pass("I select the reason code and select the flight for mass transfer");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I pick the passengers manually from the list from the pnr created")
    public void iPickThePassengersManuallyFromTheListFromThePnrCreated() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I pick the passengers manually from the list from the pnr created");
            maeGUI.clickPickmanuallyfromlist(logInfo);
            maeGUI.selectThePNRForMassTransfer(logInfo);
            logInfo.pass("I pick the passengers manually from the list from the pnr created");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click the button {string} to accept or compensate")
    public void iClickTheButtonToAcceptOrCompensate(String buttonType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I click the button:" +buttonType);
            maeGUI.clickTheButtonToAcceptOrCompensate(logInfo,buttonType);
            logInfo.pass("I click the button:" +buttonType);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I select pricing option as Economy Classic")
    public void iSelectPricingOptionAsEconomyClassic() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option as Economy Classic");
            maeGUI.clickPriceQuoteButton(logInfo);
            maeGUI.pricingOptionAsEconomyClassic(logInfo);
            logInfo.pass("I select pricing option as Economy Classic");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I click add Baggage icon")
    public void iClickAddBaggageIcon() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click add Baggage icon");
            maeGUI.clickAddBaggageIcon(logInfo);
            logInfo.pass("I click add Baggage icon");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add standard baggage {string} and  {string}")
    public void iAddStandardBaggageAnd(String BaggageNo, String BaggageWeight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add standard baggage BaggageNo and  BaggageWeight");
            maeGUI.addBaggageCountAndWeight(BaggageNo,BaggageWeight,logInfo);
            logInfo.pass("I add standard baggage BaggageNo and  BaggageWeight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click add another baggage")
    public void iClickAddAnotherBaggage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click add another baggage");
            maeGUI.clickAddAnotherBaggage(logInfo);
            logInfo.pass("I click add another baggage");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Submit and Proceed to Pay")
    public void iClickOnSubmit() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Submit and Proceed to Pay");
            maeGUI.clickOnSubmitAndPay(logInfo);
            logInfo.pass("I click on Submit and Proceed to Pay");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I delete the standard baggage {string}")
    public void iDeleteTheStandardBaggage(String BaggageNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the standard baggage number");
            maeGUI.deleteTheBaggage(BaggageNo,logInfo);
            logInfo.pass("I delete the standard baggage number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I click on Submit and Continue")
    public void iClickOnSubmitAndContinue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Submit and Continue");
            maeGUI.clickOnSubmitAndContinue(logInfo);
            logInfo.pass("I click on Submit and Continue");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I select Sales Report and Agent Sales Report")
    public void iSelectSalesReportAndAgentSalesReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select Sales Report and Agent Sales Report");
            maeGUI.selectSalesReportAndAgentSaleReport(logInfo);
            logInfo.info("I select Sales Report and Agent Sales Report");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate EMD values in Agent Sales Report")
    public void iValidateEMDInAgentSalesReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate EMD value in Agent Sales Report");
            maeGUI.validateEMD(logInfo);
            logInfo.info("I validate EMD value in Agent Sales Report");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I click on Return to Check-In")
    public void iClickOnReturnToCheckIn() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Return to Check-In");
            maeGUI.clickOnReturnToCheckIn(logInfo);
            logInfo.pass("I click on Return to Check-In");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I click the Tickets tab and verify the Ticket Status as {string} and verify the EMD Coupon control status as {string}")
    public void iClickTheTicketsTabAndVerifyTheTicketStatusAsAndVerifyTheEMDCouponControlStatusAs(String ticketStatus, String couponControlStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Tickets tab and verify the Ticket Status as "+ticketStatus+ " and verify the EMD Coupon control status as "+couponControlStatus);
            maeGUI.clickTicketsTabAndVerifyDetails(logInfo,ticketStatus,couponControlStatus);
            logInfo.pass("I click the Tickets tab and verify the Ticket Status as "+ticketStatus+ " and verify the EMD Coupon control status as "+couponControlStatus);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter the details in Security Document Verification page")
    public void iEnterTheDetailsInSecurityDocumentVerificationPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the details in Security Document Verification page");
            maeGUI.enterSecurityDocumentDetailsAndByPass(logInfo);
            logInfo.pass("I enter the details in Security Document Verification page");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I verify the flight status is displayed as {string}")
    public void iVerifyTheFlightStatusIsDisplayedAs(String flightStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I verify the flight status is displayed as " + flightStatus);
            maeGUI.flightStatus(logInfo, flightStatus);
            logInfo.pass("I verify the flight status is displayed as " + flightStatus);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }

    }


    @And("I try to assign an agent {string}")
    public void iTryToAssignAnAgent(String actionType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I try to assign an agent");
            maeGUI.assignAgent(logInfo, actionType);
            logInfo.pass("I try to assign an agent");


        } catch (Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }

    }



    @And("I add a service {string} in cabin")
    public void i_add_a_service_in_cabin(String service) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add a service "+service+" in cabin");
            maeGUI.addAService(service, logInfo);
            logInfo.pass("I enroll connect mile to all the passengers");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I navigate to travel Compensation page")
    public void iNavigateToTravelCompensationPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to travel Compensation page");
            maeGUI.travelCompensation(logInfo);
            logInfo.pass("I navigate to travel Compensation page");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I navigate to travel Compensation page");
    }

    @And("I store all the flight numbers after flight search")
    public void iStoreAllTheFlightNumbersAfterFlightSearch() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I store all the flight numbers after flight search");
            maeGUI.storeAllFlightNumbers(logInfo);
            logInfo.pass("I store all the flight numbers after flight search");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I store all the flight numbers after flight search");
    }

    @And("I select passengers using flight numbers in Compensation model {string} and {string} and {string} and {string}")
    public void iSelectPassengersUsingFlightNumbersInCompensationModel(String origin, String travelDate, String paxType, String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers using flight numbers in Compensation model");
            maeGUI.selectPassengersFromCompensationPage(logInfo, origin, travelDate, paxType, index);
            logInfo.pass("I select passengers using flight numbers in Compensation model");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select passengers using flight numbers in Compensation model");
    }


    @And("I select compensation reason and select passenger {string}")
    public void iSelectCompensationReasonAndSelectPassenger(String reason) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select compensation reason and select passenger");
            maeGUI.selectPassengersSelectCompensationReason(logInfo, reason);
            logInfo.pass("I select compensation reason and select passenger");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select compensation reason and select passenger");
    }


    @And("I select passengers and issue compensation {string} and {string} and {string} and {string}")
    public void iSelectPassengersAndClickIssueCompensationButton(String Amount, String paxType, String reason, String traveldate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers and issue compensation");
            maeGUI.selectPassengersIssueCompensation(logInfo, Amount, paxType, reason, traveldate);
            logInfo.pass("I select passengers and issue compensation");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select passengers and issue compensation");
    }



    @And("I select passengers and click print button")
    public void iSelectPassengersAndClickPrintButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers and click print button");
            maeGUI.selectPassengersClickPrintButton(logInfo);
            logInfo.pass("I select passengers and click print button");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select the printer {string} and {string}")
    public void iSelectThePrinter(String printer, String printerStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the printer" + printer);
            maeGUI.selectPrinter(logInfo, printer, printerStatus);
            logInfo.pass("I select the printer - "+ printer);

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select the printer" +printer);
    }


    @And("I click search button in flight search availability")
    public void iClickSearchButtonInFlightSearchAvailability() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click search button in flight search availability");
            maeGUI.clickSearchButtonFlightAvailability(logInfo);
            logInfo.pass("I click search button in flight search availability");
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the date of travel for the four segments {string} {string} {string} and {string}")
    public void i_change_the_date_of_travel_for_four_segments_(String newDate1, String newDate2, String newDate3, String newDate4) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date of travel for the four segments");
            maeGUI.changeTheDateOfTravelForFourSeg(logInfo, newDate1, newDate2,newDate3,newDate4);
            logInfo.pass("I change the date of travel for the four segments");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform the Involuntary Reissue")
    public void i_want_to_quote_the_Involuntary_reissue() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the Involuntary Reissue");
            maeGUI.involuntaryReissue(logInfo);
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @Then("I click on Seat Icon from Services tab")
    public void i_click_on_seat_icon_from_services() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Seat Icon from Services tab");
            maeGUI.addSeatsFromServices(logInfo);
            logInfo.pass("I click on Seat Icon from Services tab");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I click on Seat Icon from Services tab and add Seats for Passengers");
    }


    @Then("I select Seat for all passengers")
    public void i_click_on_seat_icon_from_services_and_add_seats_for_all_passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select Seat for Passengers");
            maeGUI.SeatSelectionForAllPassengers(logInfo);
            logInfo.pass("I select Seat for Passengers");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I select Seat for Passengers");
    }


    @And("I click on pay button")
    public void i_click_on_pay_button() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on pay button");
            maeGUI.clickOnPayButton(logInfo);
            logInfo.pass("I click on pay button");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I select Seat for Passengers");
    }

    @And("I rebook All the Segments on New Date")
    public void iRebookAllTheSegmentsOnNewDate() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook All the Segments on New Date");
            maeGUI.rebookSegmentsOnNewDate(logInfo);
            logInfo.pass("I rebook All the Segments on New Date");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I Delete All the Old Segments")
    public void iDeleteAllTheOldSegments() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Delete All the Old Segments");
            maeGUI.deleteTheOldSegments(logInfo);
            logInfo.pass("I Delete All the Old Segments");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform Reissue For All Segments Booked on New Date")
    public void iPerformReissueForAllSegmentsBookedOnNewDate() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Reissue For All Segments Booked on New Date");
            maeGUI.reissueByBookingSegmentsOnNewDate(logInfo);
            logInfo.pass("I perform Reissue For All Segments Booked on New Date");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform voluntary manual refund")
    public void i_perform_voluntary_manual_refund() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform voluntary manual refund");
            maeGUI.voluntaryManualRefund(logInfo);
            logInfo.pass("I perform voluntary manual refund");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I modify the Adult passenger to INS passenger in passenger tab")
    public void iModifyTheAdultPassengerToINSPassengerInPassengerTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I modify the Adult passenger to INS passenger in passenger tab");
            maeGUI.updatePassengerInfoINS(logInfo);
            logInfo.pass("I modify the Adult passenger to INS passenger in passenger tab");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select the Special Passenger from dropdown present in checkinpage with type of passenger as {string}")
    public void iSelectTheSpecialPassengerFromDropdownPresentInCheckinpage(String typeOfSpecialPassenger) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the Special Passenger from dropdown present in checkinpage with type of passenger as "+typeOfSpecialPassenger);
            maeGUI.selectSpecialPassenger(logInfo, typeOfSpecialPassenger);
            logInfo.pass("I select the Special Passenger from dropdown present in checkinpage with type of passenger as "+typeOfSpecialPassenger);

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on check-in for the special passenger")
    public void i_on_check_in_for_the_special_passenger() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on check-in for the special passenger");
            maeGUI.specialPassengerCheckIn(logInfo);
            logInfo.pass("I click on check-in for the special passenger");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select pricing Book option")
    public void iSelectPricingBookOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing Book option");
            maeGUI.clickPriceBookButton(logInfo);
            logInfo.pass("I select pricing Book option");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I update FQTV number in checkin Page")
    public void iUpdateFQTVNumberInCheckinPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I update FQTV number in checkin Page");
            maeGUI.updateFFNumberInCheckinPage(logInfo);
            logInfo.pass("I update FQTV number in checkin Page");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the passenger type in GUI {string} to {string}")
    public void iChangeThePassengerTypeInGUITo(String paxType, String paxType1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the passenger type " +paxType +" to "+ paxType1);
            maeGUI.changePassengerTypeInPassengerTab(logInfo, paxType, paxType1);
            logInfo.pass("I change the passenger type " +paxType +" to "+ paxType1);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add the FF number in passenger tab")
    public void iAddTheFFNumberInPassengerTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the FF number in passenger tab");
            maeGUI.addFFNumberToFQTVPax(logInfo);
            logInfo.pass("I add the FF number in passenger tab");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I try to retrieve the 2nd pnr from Order Screen to check the {string} status in ticket tab")
    public void iTryToRetrieveThe2ndPnrFromOrderScreenToCheckTheStatusInTicketTab(String ticketStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve the pnr from Order Screen to check the "+ticketStatus +" status in ticket tab");
            maeGUI.search2ndPNROrderScreenToCheckStatusInTicketTab(logInfo,ticketStatus);
            logInfo.pass("I try to retrieve the pnr from Order Screen to check the "+ticketStatus +" status in ticket tab");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set the payment type as {string}")
    public void iSelectThePaymentType(String PaymentType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set the payment type as "+PaymentType);
            maeGUI.setPaymentType(logInfo,PaymentType);
            logInfo.pass("I set the payment type as "+PaymentType);
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I add baggage of type standard for all passengers with manual bag tag and the do payment")
    public void iAddBaggageOfTypeStandardForAllPassengersWithManualBagTagAndTheDoPayment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add baggage of type standard for all passengers with manual bag tag and the do payment");
            maeGUI.addStandardBaggageForAllPassengersWithManualBagTag(logInfo);
            logInfo.pass("I add baggage of type standard for all passengers with manual bag tag and the do payment");
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I click the Tickets tab and try to click the Coupon number and verify the details for Conjunctive segment")
    public void iClickTheTicketsTabAndTryToClickTheCouponNumberAndVerifyTheDetailsForConjunctiveSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Tickets tab and try to click the Coupon number and verify the details");
            maeGUI.clickCouponNumberForConjunctiveSegment(logInfo);
            logInfo.pass("I click the Tickets tab and try to click the Coupon number and verify the details");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I select any pricing option from the price list after retrieving PNR from shares")
    public void iSelectAnyPricingOptionFromThePriceListAfterRetrievingPNRFromShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select any pricing option from the price list");
            maeGUI.selectAlternativePricingOption(logInfo);
            logInfo.pass("I select any pricing option from the price list");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I select any pricing option from the price list")
    public void iSelectAnyPricingOptionFromThePriceList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select any pricing option from the price list");
            maeGUI.selectAlternatePriceOption(logInfo);
            logInfo.pass("I select any pricing option from the price list");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I select value from the Short Checkin dropdown")
    public void iSelectValueFromTheShortCheckinDropdown() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select value from the Short Checkin dropdown");
            maeGUI.selectShortCheckin(logInfo);
            logInfo.pass("I select value from the Short Checkin dropdown");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify StandBy List text is displayed onCheckin Page")
    public void iVerifyStandByListTextIsDisplayedOnCheckinPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify StandBy List text is displayed onCheckin Page");
            maeGUI.standByListText(logInfo);
            logInfo.pass("I verify StandBy List text is displayed onCheckin Page");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I add sixth segment from and to City {string} and {string}")
    public void iAddSixthSegmentFromAndToCityAnd(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "Select from and to City for 6th Segment");
            maeGUI.selectCitiesForSixthSegment(origin,destination,logInfo);
            logInfo.pass("Selected origin city : " + origin + " and the destination city: " + destination+" for 6th segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter Start Date {string} for 6th Segment")
    public void iEnterStartDateForSixthSegment(String travelDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter date of departure for 6th Segment");
            maeGUI.book6thSegment(travelDate,logInfo);
            logInfo.pass("I enter date of departure for 6th Segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I add the passenger details from Order Screen")
    public void iAddThePassengerDetailsFromOrderScreen() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the passenger details from Order Screen");
            maeGUI.addPaxDetail(logInfo);
            logInfo.pass("I add the passenger details from Order Screen");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }

    }


    @And("I click on FLIFO SEARCH under Tools menu")
    public void I_click_on_flifo_search_Menu(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on FLIFO SEARCH under Tools menu");
            maeGUI.clickOnToolsFlifoSearchMenu(logInfo);
            logInfo.pass("I click on FLIFO SEARCH under Tools menu");

        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, exception);
        }
    }


    @And("I perform flifo search with required details with Startdate as {string}")
    public void iPerformFlifoSearchWithRequiredDetailsWithStartdateAs(String date) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform flifo search with required details with Startdate as :" + date);
            maeGUI.enterDetailsFlifoSearch(logInfo, date);
            logInfo.pass("I perform flifo search with required details with Startdate as :" + date);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }

    }


    @And("I try to close the FLIFO search")
    public void iTryToCloseTheFLIFOSearch() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to close the FLIFO search");
            maeGUI.closeFLIFO(logInfo);
            logInfo.pass("I try to close the FLIFO search");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I verify the text present in the Delay row of the Destination column for a flight in FLIFO")
    public void iVerifyTheTextPresentInTheDelayRowOfTheDestinationColumnForAFlightInFLIFO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the status of the Destination for an flight in FLIFO");
            maeGUI.validateTextInDelayColumn(logInfo);
            logInfo.pass("I verify the status of the Destination for an flight in FLIFO");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }

    }


    @And("I click summary tab")
    public void iClickSummaryTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click summary tab");
            maeGUI.clickSummaryTab(logInfo);
            logInfo.pass("I click summary tab");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on View button and check the Ticket details")
    public void iClickOnViewButtonAndCheckTheTicketDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on View button and check the Ticket details");
            maeGUI.clickOnViewButtonAndCheckTheTicketDetails(logInfo);
            logInfo.pass("I click on View button and check the Ticket details");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I enroll connect mile to all the passengers")
    public void iEnrollConnectMileToAllThePassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enroll connect mile to all the passengers");
            maeGUI.enrollConnectMilesToAllThePassengers(logInfo);
            logInfo.pass("I enroll connect mile to all the passengers");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, exception);
        }
    }

    @And("I enter the FOID details of the passengers")
    public void i_enter_the_foid_details_of_the_passengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the FOID details of the passengers");
            maeGUI.enterFOIDDetails(logInfo);
            logInfo.pass("I enter the FOID details of the passengers");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform Voluntary Reissue after changing the date of travel")
    public void i_perform_to_do_voluntary_reissue_after_changing_the_date_of_travel() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue after changing the date of travel");
            maeGUI.voluntaryReissueAfterChangingDateOfTravel(logInfo);
            logInfo.pass("I perform voluntary reissue after changing the date of travel");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I make the payment of reissue by selecting the payment type as {string}")
    public void i_make_the_payment_of_reissue_by_selecting_the_payment_type_as(String paymentType) throws IOException {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I make the payment of reissue by selecting the payment type as " + paymentType);
            maeGUI.makeFirstPayment(paymentType, logInfo);
            logInfo.pass("I make the payment of reissue by selecting the payment type " + paymentType);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the booked ticket in Agent Sales Report")
    public void i_validate_the_booked_ticket_in_agent_sales_report() throws Exception {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the booked ticket in Agent Sales Report");
            maeGUI.validateTicketsInAgentSalesReport(logInfo);
            logInfo.pass("I validate the booked ticket in Agent Sales Report");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I send email in tickets tab")
    public void iSendEmailInTicketsTab() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I send email in tickets tab");
            maeGUI.sendEmail(logInfo);
            logInfo.pass("I send email in tickets tab");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }

    }

    @And("I search for the PNR created in Reservation Section and verify the cancelled {string} segments")
    public void iSearchForThePNRCreatedInReservationSectionAndVerifyTheCancelledSegments(String cancelledSegments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the PNR created in Reservation Section and verify the cancelled segment");
            maeGUI.searchForPNRAndVerifyCancelledSegment(logInfo, cancelledSegments);
            logInfo.pass("I search for the PNR created in Reservation Section and verify the cancelled segment");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I search for the PNR created in Reservation Section and validate the newly added passenger {string}")
    public void iSearchForThePNRCreatedInReservationSectionAndValidateTheNewlyAddedPassenger(String passengerType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the PNR created in Reservation Section and validate the newly added passenger");
            maeGUI.searchForPNRAndValidateNewlyAddedPax(logInfo, passengerType);
            logInfo.pass("I search for the PNR created in Reservation Section and validate the newly added passenger");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I search for the PNR created in Reservation Section and validate the status of the passenger {string}")
    public void iSearchForThePNRCreatedInReservationSectionAndValidateTheStatusOfThePassenger(String status) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the PNR created in Reservation Section and validate the status of the passenger");
            maeGUI.searchForPNRAndValidateStatusOfThePax(logInfo, status);
            logInfo.pass("I search for the PNR created in Reservation Section and validate the status of the passenger");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I search for the PNR created in Reservation Section and validate that the SSR is added {string}")
    public void iISearchForThePNRCreatedInReservationSectionAndValidateThatTheSSRIsAdded(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the PNR created in Reservation Section and validate that the SSR is added");
            maeGUI.searchForPNRAndValidateTheSSRAdded(logInfo, SSRType);
            logInfo.pass("I search for the PNR created in Reservation Section and validate that the SSR is added");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I add SSR {string} through Services tab in GUI")
    public void iAddSSRThroughServicesTabInGUI(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add SSR through Services tab in GUI");
            maeGUI.addASSRInGUI(logInfo, SSRType);
            logInfo.pass("I add SSR through Services tab in GUI");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I assign seats to the passengers in Services tab")
    public void iAssignSeatsToThePassengersInServicesTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign seats to the passengers in Services tab");
            maeGUI.assignSeatsToPassengersInServicesTab(logInfo);
            logInfo.pass("I assign seats to the passengers in Services tab");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I navigate to tickets tab and save the ticket numbers")
    public void iNavigateToTicketsTabAndSaveTheTicketNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to tickets tab and save the ticket numbers");
            maeGUI.navigateToTicketsTabAndSaveTicketNumbers(logInfo);
            logInfo.pass("I navigate to tickets tab and save the ticket numbers");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I search for the PNR created in Reservation Section and validate that the class of service is changed")
    public void iSearchForThePNRCreatedInReservationSectionAndValidateThatTheClassOfServiceIsChanged() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the PNR created in Reservation Section and validate that the class of service is changed");
            maeGUI.searchForPNRAndValidateChangedCOS(logInfo);
            logInfo.pass("I search for the PNR created in Reservation Section and validate that the class of service is changed");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I click on add the passenger details for the Group or Corporate PNR in orders tab in GUI")
    public void iClickOnAddThePassengerDetailsForTheGroupOrCorporatePNRInOrdersTabInGUI() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on add the passenger details for the Group or Corporate PNR in orders tab in GUI");
            maeGUI.clickOnAddPaxDetailsForTheGroupOrCorporatePNRInGUI(logInfo);
            logInfo.pass("I click on add the passenger details for the Group or Corporate PNR in orders tab in GUI");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I click on Add Name to Order button")
    public void iClickOnAddNameToOrderButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Add Name to Order button");
            maeGUI.clickAddNameToOrderButton(logInfo);
            logInfo.pass("I click on Add Name to Order button");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I retrieve the PNR in GUI after splitting the PNR")
    public void iRetrieveThePNRInGUIAfterSplittingThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the PNR in GUI after splitting the PNR");
            maeGUI.retrieveThePNRAfterSplittingThePNR(logInfo);
            logInfo.pass("I retrieve the PNR in GUI after splitting the PNR");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I capture the status of the flight at the origin in FLIFO in GUI")
    public void iCaptureTheStatusOfTheFlightAtTheOriginInFLIFOInGUI() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture the status of the flight at the origin in FLIFO in GUI");
            maeGUI.captureStatusOfTheFlightAtOriginInFlifoInGUI(logInfo);
            logInfo.pass("I capture the status of the flight at the origin in FLIFO in GUI");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the FLIFO details shown in GUI is matching with the ishares")
    public void iValidateTheFLIFODetailsShownInGUIIsMatchingWithTheIshares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the FLIFO details shown in GUI is matching with the ishares");
            maeGUI.validateFLIFODetailsShownInGUIIsMatchingWithIshares(logInfo);
            logInfo.pass("I validate the FLIFO details shown in GUI is matching with the ishares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on PAY button when the amount is zero in GUI")
    public void iClickOnPAYButtonWhenTheAmountIsZeroInGUI() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on PAY button when the amount is zero in GUI");
            maeGUI.clickPayButtonWhenTheAmountIsZero(logInfo);
            logInfo.pass("I click on PAY button when the amount is zero in GUI");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on the passenger arrow to validate that the seats are assigned in GUI")
    public void iClickOnThePassengerArrowToValidateThatTheSeatsAreAssigned() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on the passenger arrow to validate that the seats are assigned in GUI");
            maeGUI.clickOnThePaxArrowToValidateThatSeatsAreAssigned(logInfo);
            logInfo.pass("I click on the passenger arrow to validate that the seats are assigned in GUI");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the FLIFO ON-TIME status of the flight in the DELAY row in GUI")
    public void iValidateTheONTIMEStatusOfTheFlightInFLIFOInGUI() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the FLIFO ON-TIME status of the flight in the DELAY row in GUI");
            maeGUI.validateTheFLIFOONTIMEOfTheFlightInDelayRowInInGUI(logInfo);
            logInfo.pass("I validate the FLIFO ON-TIME status of the flight in the DELAY row in GUI");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the text present in the Delay row under the Origin column for a flight in FLIFO")
    public void iValidateTheTextPresentInTheDelayRowUnderTheOriginColumnForAFlightInFLIFO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the text present in the Delay row under the Origin column for a flight in FLIFO");
            maeGUI.validateTextInDelayColumnUnderOrigin(logInfo);
            logInfo.pass("I validate the text present in the Delay row under the Origin column for a flight in FLIFO");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }


    @And("I click on bag icon in checkin page for all passengers and select the type of baggage as standard and add bags and do payment")
    public void iClickOnBagIconInCheckinPageForAllPassengersAndSelectTheTypeOfBaggageAsStandardAndAddBagsAndDoPayment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on bag icon in checkin page, select the type of baggage as standard, add bags and do payment");
            maeGUI.addStandardBaggageForAllPassengers(logInfo);
            logInfo.pass("I click on bag icon in checkin page, select the type of baggage as standard, add bags and do payment");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I retrive the pnr after dividing the pnr")
    public void iRetriveThePnrAfterDividingThePnr() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrive the pnr after dividing the pnr");
            maeGUI.searchOrderScreenToCheckUpdatedPaxCountInPnr(logInfo);
            logInfo.pass("I retrive the pnr after dividing the pnr");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on seat icon from services tab")
    public void iClickOnSeatIconFromServicesTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on seat icon from services tab");
            maeGUI.clickaddSeatsButtonFromServicesTab(logInfo);
            logInfo.pass("I click on seat icon from services tab");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I select seats for passengers and add to order")
    public void iSelectSeatsForPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select Seat for Passengers from services tab and add to order");
            maeGUI.seatSelectionFromServicesTab(logInfo);
            logInfo.pass("I select Seat for Passengers from services tab and add to order");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I change segment date to new date {string}")
    public void iChangeSegmentDateToNewDate(String SegmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change segment date with new date");
            maeGUI.changeSegmentDateToNewDate(logInfo, SegmentNo);
            logInfo.pass("I change segment date with new date");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the Gate number for a flight in Gate section")
    public void iVerifyTheGateNumberForAFlightInGateSection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the Gate number for a flight");
            maeGUI.verifyGateNumber(logInfo);
            logInfo.pass("I verify the Gate number for a flight");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I search for the flight in Gate section with Destination as {string}")
    public void iSearchTheFlightInGateSectionWithDestinationAs(String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I search for the flight in Gate section with Destination as "+destination);
            maeGUI.searchFlightInGateWithDestination(logInfo, destination);
            logInfo.pass("I search for the flight in Gate section with Destination as "+destination);


        } catch (Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I verify the Gate number of the flight for DestinationCity in FLIFO")
    public void iVerifyTheGateNumberOfTheFlightForDestinationCityInFLIFO() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the Gate number of the flight for DestinationCity in FLIFO");
            maeGUI.verifyGateNumberInFLIFOForDestination(logInfo);
            logInfo.pass("I verify the Gate number of the flight for DestinationCity in FLIFO");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify the Status of the flight at the origin in FLIFO in GUI is {string}")
    public void iVerifyTheStatusOfTheFlightAtTheOriginInFLIFOInGUIIs(String flightStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the Status of the flight at the origin in FLIFO in GUI is "+flightStatus);
            maeGUI.verifyFlightStatusINFLIFO(logInfo,flightStatus);
            logInfo.pass("I verify the Status of the flight at the origin in FLIFO in GUI is "+flightStatus);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I try to click Unreconciled button")
    public void iTryToClickUnreconciledButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to click Unreconciled button");
            maeGUI.clickUnreconcileButton(logInfo);
            logInfo.pass("I try to click Unreconciled button");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify the flight is not assigned with any gate number for Origin or Destination {string}")
    public void iVerifyTheFlightIsNotAssignedWithAnyGateNumberForOriginOrDestination(String place) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the flight is not assigned with any gate number for "+place);
            maeGUI.verifyFlightIsNotAssigned(logInfo,place);
            logInfo.pass("I verify the flight is not assigned with any gate number for "+place);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }


    }


    @And("I try to click on Abort button and try to select {string} from popup")
    public void iTryToClickOnAbortButton(String button) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to click on Abort button");
            maeGUI.clickAbortButton(logInfo, button);
            logInfo.pass("I try to click on Abort button");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }


    }

    @And("I try to click on Reconcile button")
    public void iTryToClickOnReconcileButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to click on Reconcile button");
            maeGUI.clickReconcileButton(logInfo);
            logInfo.pass("I try to click on Reconcile button");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }


    }


    @And("I navigate to UnReconciled or Reconciled {string} subtab and check for the passengers with sequence number as {string}")
    public void iNavigateToUnReconciledReconciledSubtabAndCheckForThePassengersWithSequenceNumberAs(String subtab,String seqNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to UnReconciled or Reconciled "+subtab+" subtab and check for the passengers with sequence number as "+seqNo);
            maeGUI.reconciledOrUnReconciledSubTab(logInfo,subtab,seqNo);
            logInfo.pass("I navigate to UnReconciled or Reconciled "+subtab+" subtab and check for the passengers with sequence number as "+seqNo);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I try to retrieve the ticket number by selecting {string} option with sequence number as {string}")
    public void iTryToRetrieveTheTicketNumberBySelectingOptionWithSequenceNumberAs(String dropdownValue, String seqNum) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to retrieve the ticket number by selecting " + dropdownValue + " option with sequence number as "+seqNum);
            maeGUI.selectValueFromPNRDropDownForSequence(logInfo, dropdownValue,seqNum);
            logInfo.pass("I try to retrieve the ticket number by selecting " + dropdownValue + " option with sequence number as "+seqNum);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on Cancel or Reinitiate button {string} in Gate Screen")
    public void iClickOnCancelOrReinitiateButtonButtonInGateScreen(String button) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Cancel or Reinitiate button :" + button + " in Gate Screen");
            maeGUI.selectCancelOrReInitiateButtonInGatePage(logInfo,button);
            logInfo.pass("I click on Cancel or Re-initiate button :" + button + " in Gate Screen");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter Account code as {string}")
    public void iEnterAccountCodeAs(String accountCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Account code as :" + accountCode);
            maeGUI.toAddAccountCode(logInfo,accountCode);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I select Private Fares Only checkbox")
    public void iSelectPrivateFaresOnlyCheckbox() {


        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select Private Fares Only checkbox");
            maeGUI.selectCheckBoxPrivateFaresOnly(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }


    }


    @And("I validate the Price Quote and verify Account code {string} is displaying or not and click on Next")
    public void iValidateThePriceQuoteAndVerifyAccountCodeIsDisplayingOrNotAndClickOnNext(String accountCode) {

        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the Price Quote and verify Account code "+accountCode+" is displaying or not and click on Next");
            maeGUI.toCheckAccountCodeInFaresPage(logInfo, accountCode);

        }catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform Involuntary Reissue for specific segment {string} with Reason Code as {string} and Reissue Reason Code as {string}")
    public void iPerformInvoluntaryReissueForSpecificSegmentWithReasonCodeAndReissueReasonCodeAs(String segment,String reasonCode,String reissueReasonCode) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Involuntary Reissue for specific segment");
            maeGUI.inVoluntaryReissueForSpecificSegment(logInfo,segment,reasonCode,reissueReasonCode);
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform Voluntary Reissue by adding Account code as {string}")
    public void iPerformVoluntaryReissueByAddingAccountCodeAs(String accountCode) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue by adding Account number as "+accountCode);
            maeGUI.performVoluntaryReissueByAddingAccountNumber(logInfo,accountCode);
            logInfo.pass("I perform Voluntary Reissue by adding Account number as "+accountCode);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select class {string} for Origin flight for the newly added segments via availability")
    public void iSelectClassForOriginFlightForTheNewlyAddedSegmentsViaAvailability(String cabin) throws ClassNotFoundException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class for Origin flight");

            maeGUI.clickOriginFlight();
            if (cabin.equalsIgnoreCase("Economy")) {
                maeGUI.selectFullEconomyAvailability(logInfo);
            } else if (cabin.equalsIgnoreCase("Business")) {
                maeGUI.selectFullBusinessAvailability(logInfo);
            }

            logInfo.pass("I select " + cabin + " class for Origin flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click the Tickets tab and store the ticket number")
    public void iClickTheTicketsTabAndStoreTheTicketNumberForConjunctiveSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Tickets tab and store the ticket number");
            maeGUI.storeTicketNumberForConjunctiveSegments(logInfo);
            logInfo.pass("I click the Tickets tab and store the ticket number");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on Next button")
    public void iClickOnNextButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Next button");
            maeGUI.clickNextButton(logInfo);
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate Ticket and EMD values in Agent sales report and view tax details for conjuctive segment")
    public void iValidateTicketAndEMDValuesInAgentSalesReportAndViewTaxDetailsForConjunctiveSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate Ticket and EMD values in Agent sales report and view tax details");
            maeGUI.validateTicketAndEMDAndViewTaxDetailsForconjunctiveSegments(logInfo);
            logInfo.pass("I validate Ticket and EMD values in Agent sales report and view tax details");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I click on seat icon from services tab for required segment {string}")
    public void iClickOnSeatIconFromServicesTabForRequiredSegment(String segNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on seat icon from services tab for required segment :"+segNum);
            maeGUI.clickaddSeatsButtonFromServicesTabWithReqSegment(logInfo,segNum);
            logInfo.pass("I click on seat icon from services tab for required segment :"+segNum);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on pay button by selecting the required payment type {string}")
    public void iClickOnPayButtonBySelectingTheRequiredPaymentType(String paymentType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on pay button");
            maeGUI.clickPayButtonIfEnabled(logInfo,paymentType);
            logInfo.pass("I click on pay button");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I change the date of travel for the second segment {string}")
    public void iChangeTheDateOfTravelForTheSecondSegment(String newDate1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date of travel for the second segment");
            maeGUI.changeTheDateOfTravelForSecondSeg(logInfo, newDate1);
            logInfo.pass("I change the date of travel for the second segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select class {string} for Return flight for the newly added segments via availability")
    public void iSelectClassForReturnFlightForTheNewlyAddedSegmentsViaAvailability(String cabin) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class in other segment flights");
            maeGUI.selectAllFlightForAvailability(cabin,logInfo);
            logInfo.pass("I select " + cabin + " class in other segment flights");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I validate that the list of passengers is displayed in GATE module")
    public void iValidateThatTheListOfPassengersIsDisplayedInGATEModule() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate that the list of passengers is displayed in GATE module");
            maeGUI.validateThatTheListOfPaxIsDisplayedInGateModule(logInfo);
            logInfo.pass("I validate that the list of passengers is displayed in GATE module");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I RECONCILE a passenger in GATE module and validate the passenger in reconciled section")
    public void iReconcileAPassengerInGATEModuleAndValidateThePaxInReconciledSection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I reconcile a passenger in GATE module and validate the passenger in reconciled section");
            maeGUI.reconcileAPaxAndValidateThePaxInReconciledSection(logInfo);
            logInfo.pass("I reconcile a passenger in GATE module and validate the passenger in reconciled section");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on PNR hyperlink in checkin page")
    public void iClickOnPNRHyperlinkInCheckinPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on PNR hyperlink in checkin page");
            maeGUI.clickOnPNRHyperlink(logInfo);
            logInfo.pass("I click on PNR hyperlink in checkin page");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I navigate back to the previous page in GUI")
    public void iNavigateBackToThePreviousPageInGUI() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate back to the previous page in GUI");
            maeGUI.navigateBackToPreviousPage(logInfo);
            logInfo.pass("I navigate back to the previous page in GUI");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for the passenger in the all passengers list in GATE module")
    public void iSearchForThePassengerInTheAllPassengersListInGATEModule() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the passenger in the all passengers list in GATE module");
            maeGUI.searchByNameInGatePage(logInfo);
            logInfo.pass("I search for the passenger in the all passengers list in GATE module");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on the passenger name in GATE page and validate that the added SSR {string} is present")
    public void iClickOnThePassengerNameInGATEPageAndValidateThatTheSSRIsPresent(String SSRKeyword) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on the passenger name in GATE page and validate that the added SSR is present");
            maeGUI.clickOnPaxNameAndValidateThatSSRIsAdded(logInfo, SSRKeyword);
            logInfo.pass("I click on the passenger name in GATE page and validate that the added SSR is present");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on final report and validate the SSR added for the passenger")
    public void iClickOnFinalReportAndValidateTheSSRAddedForThePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on final report and validate the SSR added for the passenger");
            maeGUI.clickOnFinalReportAndValidateTheSSRAdded(logInfo);
            logInfo.pass("I click on final report and validate the SSR added for the passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on seats icon and assign seats to the passengers in CHECKIN page")
    public void iClickOnSeatsIconAndAssignSeatsToThePassengersInCHECKINPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on seats icon and assign seats to the passengers in CHECKIN page");
            maeGUI.clickOnSeatIconAndAddSeatsInCheckinPage(logInfo);
            logInfo.pass("I click on seats icon and assign seats to the passengers in CHECKIN page");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate that the flight is cancelled in FLIFO in GUI for {string}")
    public void iValidateThatTheFlightIsCancelledInFLIFOInGUI(String date) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate that the flight is cancelled in FLIFO in GUI");
            maeGUI.validateThatTheFlightIsCancelledInFLIFOInGUI(logInfo, date);
            logInfo.pass("I validate that the flight is cancelled in FLIFO in GUI");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for the PNR created in Reservation Section and validate that the date of travel is changed")
    public void iSearchForThePNRCreatedInReservationSectionAndValidateThatTheDateOfTravelIsChanged() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the PNR created in Reservation Section and validate that the date of travel is changed");
            maeGUI.retrievePNRAndValidateTheChangeInDateInGUI(logInfo);
            logInfo.pass("I search for the PNR created in Reservation Section and validate that the date of travel is changed");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I search for flight availability in Native shares from {string} to {string}")
    public void iSearchForFlightAvailabilityInNativeSharesFromToAnd(String Origin, String Destination) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight");
            isharesPage2.searchavailabilityInNativeShares(logInfo, Origin, Destination);
            logInfo.pass("I search for flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I select held seats to display the passenger list in Gate section")
    public void iSelectHeldSeatsToDisplayThePassengerListInGateSection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select held seats to display the passenger list in Gate section");
            maeGUI.selectheldSeatsToDisplayThePassengerList(logInfo);
            logInfo.pass("I select held seats to display the passenger list in Gate section");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I select {string} from the passenger list options")
    public void iSelectFromThePassengerListOptions(String passengerListType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the type of passenger from the passenger list as: "+passengerListType);
            maeGUI.selectPassengerTypeFromPassengerListInGate(logInfo,passengerListType);
            logInfo.pass("I select the type of passenger from the passenger list as: "+passengerListType);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I select the offpoint as {string} in Mass Transfer page")
    public void iSelectTheOffpointAsInMassTransferPage(String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the offpoint as: "+Destination);
            maeGUI.selectOffpointInMassTransferPage(logInfo,Destination);
            logInfo.pass("I select the offpoint as: "+Destination);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }

    }

    @And("I enter the FOID details for the passengers with document type as {string}")
    public void iEnterTheFOIDDetailsForThePassengersWithDocumentTypeAs(String documentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the FOID details of the passengers with document type as: "+documentType);
            maeGUI.enterFOIDDetailsWithSpecifiedDocumentType(logInfo,documentType);
            logInfo.pass("I enter the FOID details of the passengers with document type as: "+documentType);
        }
        catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }



    @And("I select class {string} for the first connecting segment flight")
    public void iSelectClassForConnectingSegmentFlightWithStartSegment(String cabin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class for Origin flight");

            if (cabin.equalsIgnoreCase("Economy")) {
                maeGUI.selectFullEconomyForConnectingFlight(logInfo);
            } else if (cabin.equalsIgnoreCase("Business")) {
                maeGUI.selectFullBusinessForConnectingFlight(logInfo);
            }
            logInfo.pass("I select " + cabin + " class for Origin flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I open flight for the segment {string} in native shares")
    public void iOpenFlightForTheSegmentInNativeShares(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open the flight in native shares");
            maeGUI.openFlightInNativeShares(logInfo,Integer.parseInt(segmentIndex));
            logInfo.pass("I open the flight in native shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate the error message on addition of baggage for domestic flights")
    public void iValidateTheErrorMessageOnAdditionOfBaggageForDomesticFlights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the error message on addition of baggage for domestic flights");
            maeGUI.validateTheErrorMessageOnAdditionOfBaggageForDomesticFlights(logInfo);
            logInfo.pass("I validate the error message on addition of baggage for domestic flights");
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }



    @And("I click the services Tab to validate the seats")
    public void iClickTheServicesTabToValidateTheSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Services tab to validate the seats");
            maeGUI.clickServicesTabToValidateSeats(logInfo);
            logInfo.pass("I click the Services tab and validate the seats assigned");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the date of travel for the first segment {string}")
    public void iChangeTheDateOfTravelForTheFirstSegment(String newDate1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date of travel for the first segment");
            maeGUI.changeTheDateOfTravelForFirstSeg(logInfo, newDate1);
            logInfo.pass("I change the date of travel for the first segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I navigate to Order tab to check the OSI remarks to validate the reason {string}")
    public void iNavigateToOrderTabToCheckTheOSIRemarksToValidateTheReason(String reason) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to Order tab to check the OSI remarks to validate the reason");
            maeGUI.clickReservations(logInfo);
            maeGUI.checkTheOSIRemarksToValidateTheReason(logInfo, reason);
            logInfo.pass("I navigate to Order tab to check the OSI remarks to validate the reason");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I check to the remarks from order tab and validate the remark type {string}")
    public void iCheckToTheRemarksFromOrderTab(String remarkType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check to the remarks from order tab");
            String remark ="";

            if (remarkType.equalsIgnoreCase("baggageTransfer")) {
                remark = "Baggage transfer - CBAG";
            }
            else if (remarkType.equalsIgnoreCase("InvoluntaryReissue")) {
                remark = "Involuntary Reissue - INVOL REISSUE";
            }


            maeGUI.clickReservations(logInfo);
            maeGUI.checkTheRemarksFromOderTab(logInfo,remarkType);
            logInfo.info(MarkupHelper.createLabel("The remarks from order tab is validated and "+remark+" is available", ExtentColor.GREEN));
            logInfo.pass("I check to the remarks from order tab and validate the remarks");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select the flight for outbound mass transfer with outbound segment {string}")
    public void iSelectTheFlightForOutboundMassTransferWithOutboundSegment(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I select the flight for outbound mass transfer");
            maeGUI.selectTheFlightForOutboundMassTransferWithOutboundSegment(logInfo,segmentIndex);
            logInfo.pass("I select the flight for outbound mass transfer");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select pricing option as Economy Basic")
    public void iSelectPricingOptionAsEconomyBasic() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option as Economy Basic");
            maeGUI.clickPriceQuoteButton(logInfo);
            maeGUI.pricingOptionAsEconomyBasic(logInfo);
            logInfo.pass("I select pricing option as Economy Basic");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I search for the segment {string} in Check-In page")
    public void iSearchForTheSegmentInCheckInPage(String segmentIndex) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I search the flight for the given segment in Check-In page");
            maeGUI.searchFlightNumberInCheckInPage(logInfo, segmentIndex);
            logInfo.pass("I search the flight for the given segment in Check-In page");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I add standard baggage with Overweight for third bag {string} and  {string}")
    public void iAddStandardBaggageWithOverweightForThirdBagAnd(String BaggageNo, String BaggageWeight ) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add standard baggage with overweight, BaggageNo and  BaggageWeight");
            maeGUI.addStandardBaggageWithOverweightForThirdBag(BaggageNo,BaggageWeight,logInfo);
            logInfo.pass("I add standard baggage with overweight, BaggageNo and  BaggageWeight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I select pricing option as Economy full")
    public void iSelectPricingOptionAsEconomyFull() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option as Economy full");
            maeGUI.clickPriceQuoteButton(logInfo);
            maeGUI.pricingOptionAsEconomyFull(logInfo);
            logInfo.pass("I select pricing option as Economy full");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I add standard baggage with Overweight for second bag {string} and  {string}")
    public void iAddStandardBaggageWithOverweightForSecondBagAnd(String BaggageNo, String BaggageWeight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add standard baggage with overweight, BaggageNo and  BaggageWeight");
            maeGUI.addStandardBaggageWithOverweightForSecondBag(BaggageNo,BaggageWeight,logInfo);
            logInfo.pass("I add standard baggage with overweight, BaggageNo and  BaggageWeight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I click on Submit and Proceed to Pay with Foid details")
    public void iClickOnSubmitAndProceedToPayWithFoidDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Submit and Proceed to Pay");
            maeGUI.clickOnSubmitAndPayWithFoidDetails(logInfo);
            logInfo.pass("I click on Submit and Proceed to Pay");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Passport FOID details")
    public void iEnterPassportFOIDDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the FOID details of the passengers");
            maeGUI.enterFOIDDetailsOfPassport(logInfo);
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I add standard baggage with Overweight for fourth bag {string} and  {string}")
    public void iAddStandardBaggageWithOverweightForFourthBagAnd(String BaggageNo, String BaggageWeight ) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add standard baggage with overweight, BaggageNo and  BaggageWeight");
            maeGUI.addStandardBaggageWithOverweightForFourthBag(BaggageNo,BaggageWeight,logInfo);
            logInfo.pass("I add standard baggage with overweight, BaggageNo and  BaggageWeight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I click on CheckOut button and Reissue for payment")
    public void iClickOnCheckOutButtonAndReissueForPayment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Click on CheckOut button and Reissue for payment");
            maeGUI.clickCheckOutButtonAndReissueForPayment(logInfo);
            logInfo.pass("I Click on CheckOut button and Reissue for payment");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I change first segment date {string}")
    public void iChangeFirstSegmentDate(String StartDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change first segment date");
            maeGUI.changeTheDateOfTravelForFirstSeg(logInfo,StartDate);
            logInfo.pass("I change first segment date");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I select pricing option as Business Promo")
    public void iSelectPricingOptionAsBusinessPromo() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option as Business Promo");
            maeGUI.clickPriceQuoteButton(logInfo);
            maeGUI.pricingOptionAsBusinessPromo(logInfo);
            logInfo.pass("I select pricing option as Business Promo");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on Ticket tab and check the {string} status")
    public void iClickOnTicketTabAndCheckTheStatus(String ticketStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Ticket tab and check the status "+ ticketStatus);
            maeGUI.ClickOnTicketTabAndCheckTheStatus(logInfo,ticketStatus);
            logInfo.pass("I click on Ticket tab and check the status "+ ticketStatus);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



//    -------------------------------

    @And("I select pricing option as {string}")
    public void iSelectPricingOptionAs(String pricingOption) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option as " +pricingOption);
            maeGUI.clickPriceQuoteButton(logInfo);
            maeGUI.selcetPricingOption(logInfo, pricingOption);
            logInfo.pass("I select pricing option as " +pricingOption);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I click the EMD subtab and view the EMD details")
    public void iClickTheEMDSubtabAndViewTheEMDDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the EMD subtab and view the EMD details");
            maeGUI.clickEMDAndViewEmDDetails(logInfo);
            logInfo.pass("I click the EMD subtab and view the EMD details");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I search the passenger in checkin page using flight number {string}")
    public void iSearchThePassengerInCheckinPageUsingFlightNumber(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search the passenger in checkin page using flight number");
            maeGUI.searchFlightInCheckinPage(logInfo, segmentIndex);
            logInfo.pass("I search the passenger in checkin page using flight number");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I search the passenger in checkin page using flight number");
    }


    @And("I select the passengers in checkin page using {string}")
    public void iSelectThePassengersInCheckinPageUsing(String searchType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the passengers in checkin page using "+ searchType);
            maeGUI.selcetPassengerInCheckinPage(logInfo,searchType);
            logInfo.pass("I select the passengers in checkin page using "+ searchType);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select sales report and select Agent sales report")
    public void iSelectSalesReportAndSelectAgentSalesReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select sales report and select Agent sales report");
            maeGUI.iSelectSalesReportAndClickAgentSaleReport(logInfo);
            logInfo.pass("I select sales report and select Agent sales report");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I validate Ticket and EMD values in Agent sales report and view tax details")
    public void iValidateTicketAndEMDValuesInAgentSalesReportAndViewTaxDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate Ticket and EMD values in Agent sales report and view tax details");
            maeGUI.validateTicketAndEMDAndViewTaxDetails(logInfo);
            logInfo.pass("I validate Ticket and EMD values in Agent sales report and view tax details");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I select ADC bypass and give the bypass reason {string}")
    public void iSelectADCBypassAndGiveTheBypassReason(String reason) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select ADC bypass and give the bypass reason - "+ reason);
            maeGUI.selectADCBypassGiveReason(logInfo, reason);
            logInfo.pass("I select ADC bypass and give the bypass reason - "+ reason);
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I add standard baggage with Overweight for fifth bag {string} and  {string}")
    public void iAddStandardBaggageWithOverweightForFifthBagAnd(String BaggageNo, String BaggageWeight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add standard baggage with overweight " +BaggageNo+" and "+ BaggageWeight);
            maeGUI.addStandardBaggageWithOverweightForFifth(BaggageNo,BaggageWeight,logInfo);
            logInfo.pass("I add standard baggage with overweight " +BaggageNo+" and "+ BaggageWeight);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I click the EMD subtab and view the baggage details in tickets tab")
    public void iClickTheEMDSubtabAndViewTheBaggageDetailsInTicketsTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the EMD subtab and view the baggage details in tickets tab");
            maeGUI.clickEMDAndViewBaggageDetails(logInfo);
            logInfo.pass("I click the EMD subtab and view the baggage details in tickets tab");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I validate EMD values and validate baggage details in Agent sales report")
    public void iValidateEMDValuesAndValidateBaggageDetailsInAgentSalesReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate EMD values and validate baggage details in Agent sales report");
            maeGUI.validateEMDAndBaggageDetailsInAgentSalesReport(logInfo);
            logInfo.pass("I validate EMD values and validate baggage details in Agent sales report");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select passengers using flight numbers in Compensation model {string}")
    public void iSelectPassengersUsingFlightNumbersInCompensationModel(String paxType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers using flight numbers in Compensation model");
            maeGUI.selectPassengersFromCompensationPageWithPaxType(logInfo, paxType);
            logInfo.pass("I select passengers using flight numbers in Compensation model");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select passengers using flight numbers in Compensation model");
    }


    @And("I enter Order Id and select compensation reason for the passenger {string} and {string}")
    public void iEnterOrderIdAndSelectCompensationReasonForThePassenger(String reason, String paxType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Order Id and select compensation reason for the passenger - " +reason);
            maeGUI.enterOrderIDAndSelectCompensationReason(logInfo, reason, paxType);
            logInfo.pass("I enter Order Id and select compensation reason for the passenger - " +reason);

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I enter Order Id and select compensation reason for the passenger - " +reason);
    }

    @And("I select required passengers and click the issue compensation button")
    public void iSelectRequiredPassengersAndClickTheIssueCompensationButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select required passengers and click the issue compensation button");
            maeGUI.selectRequiredPassengersAndClickIssueCompensationButton(logInfo);
            logInfo.pass("I select required passengers and click the issue compensation button");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select required passengers and click the issue compensation button");
    }

    @And("I select passengers click print button and click digital voucher button")
    public void iSelectPassengersClickPrintButtonAndClickDigitalVoucherButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers click print button and click digital voucher button");
            maeGUI.selectPassengersAndClickPrintAndDigitalVoucherButton(logInfo);
            logInfo.pass("I select passengers click print button and click digital voucher button");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select passengers click print button and click digital voucher button");
    }


    @And("I issue the compensation for selected passengers")
    public void iIssueTheCompensationForSelectedPassengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I issue the compensation for selected passengers");
            maeGUI.issuedCompensationForSelectedPassengers(logInfo);
            logInfo.pass("I issue the compensation for selected passengers");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I issue the compensation for selected passengers");
    }



    @And("I change the date of travel for the second connecting segment {string}")
    public void iChangeTheDateOfTravelForTheSecondConnectingSegment(String newDate1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date of travel for the second connecting segment");
            maeGUI.changeTheDateOfTravelForSecondConnectingSeg(logInfo,newDate1);
            logInfo.pass("I change the date of travel for the second connecting segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I change the date of travel for the first connecting segment {string}")
    public void iChangeTheDateOfTravelForTheFirstConnectingSegment(String newDate1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date of travel for the first connecting segment");
            maeGUI.changeTheDateOfTravelForFirstConnectingSeg(logInfo,newDate1);
            logInfo.pass("I change the date of travel for the first connecting segment");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I select class {string} for the second connecting segment flights")
    public void iSelectClassForTheSecondConnectingSegmentFlights(String cabin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class for Origin flight");

            if (cabin.equalsIgnoreCase("Economy")) {
                maeGUI.selectFullEconomyForSecondSegmentWithConnectingFlights(logInfo);
            } else if (cabin.equalsIgnoreCase("Business")) {
                maeGUI.selectFullBusinessForSecondSegmentWithConnectingFlight(logInfo);
            }
            logInfo.pass("I select " + cabin + " class for Origin flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I select specific class {string} for Origin flight and check the seats are available in {string} aswell")
    public void iSelectSpecificClassForOriginFlightAndCheckTheSeatsAreAvailableInAswell(String seatToBook, String seatToCheck) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class "+seatToBook+" for Origin flight and check the seats are available in "+seatToCheck+" aswell");

            maeGUI.clickOriginFlight();
            maeGUI.selectSpecificSeats(logInfo,seatToBook,seatToCheck);
            logInfo.pass("I select specific class "+seatToBook+" for Origin flight and check the seats are available in "+seatToCheck+" aswell");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I select specific class {string} for Return flight and check the seats are available in {string} aswell")
    public void iSelectSpecificClassForReturnFlightAndCheckTheSeatsAreAvailableInAswell(String seatToBook, String seatToCheck) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class "+seatToBook+" for Return flight and check the seats are available in "+seatToCheck+" aswell");
            maeGUI.selectSpecificSeatsForReturnFlight(logInfo,seatToBook,seatToCheck);
            logInfo.pass("I select specific class "+seatToBook+" for Return flight and check the seats are available in "+seatToCheck+" aswell");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I click on Quotes subtab and verify Account code {string} is displaying or not")
    public void iClickOnQuotesSubtabAndVerifyAccountCodeIsDisplayingOrNot(String accountCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Quotes subtab and verify Account code " + accountCode + " is displaying or not");
            maeGUI.toCheckAccountCodeInQuotesSubTab(logInfo,accountCode);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I select class {string} for second segment")
    public void iSelectClassForSecondSegment(String cabin) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class in other segment flights");
            maeGUI.selectFlightForSecondSegment(cabin, logInfo);
            logInfo.pass("I select " + cabin + " class in other segment flights");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I select class {string} for third segment with connecting flights")
    public void iSelectClassForThirdSegmentWithConnectingFlights(String cabin) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class for Origin flight");

            if (cabin.equalsIgnoreCase("Economy")) {
                maeGUI.selectFullEconomyForThirdSegmentWithConnectingFlights(logInfo);
            } else if (cabin.equalsIgnoreCase("Business")) {
                maeGUI.selectFullBusinessForThirdSegmentWithConnectingFlight(logInfo);
            }
            logInfo.pass("I select " + cabin + " class for Origin flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }



    @And("I select class {string} for Origin flight for the newly added segments via availability after the Connecting segments")
    public void iSelectClassForOriginFlightForTheNewlyAddedSegmentsViaAvailabilityAfterTheConnectingSegments(String cabin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class for Origin flight");

            maeGUI.clickOriginFlight();
            if (cabin.equalsIgnoreCase("Economy")) {
                maeGUI.selectFullEconomyAvailabilityAfterConnectingsegment(logInfo);
            } else if (cabin.equalsIgnoreCase("Business")) {
                maeGUI.selectFullBusinessAvailabilityAfterConnectingSegment(logInfo);
            }
            logInfo.pass("I select " + cabin + " class for Origin flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on Seat Icon from Checkin page")
    public void iClickOnSeatIconFromCheckinPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on seat icon from Checkin page");
            maeGUI.clickaddSeatsButtonFromCheckinPage(logInfo);
            logInfo.pass("I click on seat icon from Checkin page");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I select the seats from checkin page for passengers for the given segment {string}")
    public void iSelectTheSeatsFromCheckinPageForPassengers(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the seats from checkin page for passengers");
            maeGUI.seatSelectionFromCheckinPage(logInfo, Integer.parseInt(segmentIndex));
            logInfo.pass("I select the seats from checkin page for passengers");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on release and offload button release the {string} passengers")
    public void iClickOnReleaseAndOffloadButtoonReleaseThePassengers(String paxList) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on release and offload button release the passengers");
            maeGUI.clickReleaseOffLoadButton(logInfo, paxList);
            logInfo.pass("I click on release and offload button release the passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate if the held seats are released")
    public void iValidateIfTheHeldSeatsAreReleased() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate if the held seats are released");
            maeGUI.validateReleasedSeatsForHeldseatPax(logInfo);
            logInfo.pass("I validate if the held seats are released");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the SSR {string} for the segment {string} in native shares")
    public void iValidateTheSSRInNativeShares(String SSRType, String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the SSR in native shares");
            maeGUI.validateSSRInNativeShares(logInfo, SSRType, Integer.parseInt(segmentIndex));
            logInfo.pass("I validate the SSR in native shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select class {string} for the first thru flight")
    public void iSelectClassForTheFirstThruFlight(String cabin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class for Origin flight");

            if (cabin.equalsIgnoreCase("Economy")) {
                maeGUI.selectFullEconomyForThruFlight(logInfo);
            } else if (cabin.equalsIgnoreCase("Business")) {
                maeGUI.selectFullBusinessForThruFlight(logInfo);
            }
            logInfo.pass("I select " + cabin + " class for Origin flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the reason {string} and capture the OSI remarks in shares after retrieving the PNR from GUI")
    public void iValidateTheReasonAndCaptureTheOSIRemarksInSharesAfterRetrievingThePNRFromGUI(String reason) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the reason and capture the OSI remarks after retrieving the PNR from GUI");
            maeGUI.validateOSIRemarksInNativeShares(logInfo,reason);
            logInfo.pass("I retrieve pnr to check the OSI remarks to validate the reason");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @Then("I want to pay using residual emd")
    public void i_want_to_pay_using_residual_emd() {
        maeGUI.payUsingResidualEmd();
    }

    @And("I click on Order Availability")
    public void iClickOnOrderAvailability() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Order Availability");
            maeGUI.click_Availability();
            logInfo.pass("I click on Order Availability");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);

        }
    }


    @And("I perform the Involuntary Reissue for new segment")
    public void i_want_to_quote_the_Involuntary_reissue_for_new_segment() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the Involuntary Reissue for New Segment");
            maeGUI.involuntaryReissueNewSegment(logInfo);
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select Book from Actions Dropdown")
    public void i_select_book_from_actions_dropdown() {
       try {
           logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select Book from Actions Dropdown and Book");
           maeGUI.actionSelectBook(logInfo);
       } catch (AssertionError | Exception e) {

           ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
           Assert.fail("This step failed.. so stopping...");
       }
    }


    @And("I navigate to the User provisioning Tool page")
    public void iNavigateToTheUserProvisioningToolPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to the User provisioning Tool page");
            maeGUI.navigateToUserProvisioningToolPage(logInfo);
            logInfo.pass("I navigate to the User provisioning Tool page");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
        System.out.println("I navigate to the User provisioning Tool page");
    }


    @And("I enter User Id and click on search in user provisioning page")
    public void iEnterUserIdAndClickOnSearchInUserProvisioningPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter User Id and click on search in user provisioning page");
            maeGUI.enterUserIDAndClickOnSearchUserProvisioningToolPage(logInfo);
            logInfo.pass("I enter User Id and click on search in user provisioning page");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
        System.out.println("I enter User Id and click on search in user provisioning page");
    }


    @And("I select POS and set status of the iCoupon in User Provisioning tool page {string}")
    public void iSelectPOSAndSetStatusOfTheICouponInUserProvisioningToolPage(String iCouponStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select POS and set status of the iCoupon in User Provisioning tool pager - " +iCouponStatus);
            maeGUI.selectPOSAndSetICouponStatusInUserProvisioningPage(logInfo, iCouponStatus);
            logInfo.pass("I select POS and set status of the iCoupon in User Provisioning tool page - " +iCouponStatus);

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I select POS and set status of the iCoupon in User Provisioning tool page - " +iCouponStatus);
    }


    @And("I add free standard baggage for all the passenger {string}")
    public void iAddFreeStandardBaggageForAllThePassengerAnd(String BaggageWeight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add free standard baggage for all the passenger - "+BaggageWeight+"KG Weight");
            maeGUI.addFreeStandardBaggageForAllPax(BaggageWeight,logInfo);
            logInfo.pass("I add free standard baggage for all the passenger - "+BaggageWeight+"KG Weight");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select passengers using flight numbers in Compensation model {string} and {string}")
    public void iSelectPassengersUsingFlightNumbersInCompensationModelAnd(String paxType, String Index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers using flight numbers in Compensation model");
            maeGUI.selectPassengersFromCompensationPageWithPaxTypeAndIndex(logInfo, paxType, Index);
            logInfo.pass("I select passengers using flight numbers in Compensation model");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select passengers using flight numbers in Compensation model");
    }


    @And("I click on view icon and display the compensation additional details")
    public void iClickOnViewIconAndDisplayTheCompensationAdditionalDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on view icon and display the compensation additional details");
            maeGUI.clickOnViewAndDisplayCompensationAdditionalDetails(logInfo);
            logInfo.pass("I click on view icon and display the compensation additional details");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I click on view icon and display the compensation additional details");
    }


    @And("I select passenger and issue compensation")
    public void iSelectPassengerAndIssueCompensation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers and issue compensation");
            maeGUI.selectPaxAndIssueCompensation(logInfo);
            logInfo.pass("I select passengers and issue compensation");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select passengers and issue compensation");
    }


    @And("I select passenger and click on email button")
    public void iSelectPassengerAndClickOnEmailButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I selcet passengers and click on email button");
            maeGUI.selectPassengersClickOnEmailButton(logInfo);
            logInfo.pass("I selcet passengers and click on email button");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I selcet passengers and click on email button");
    }

    @And("I click the tickets tab and click ticket EMD tab verify the segment name status {string}")
    public void iClickTheTicketsTabAndClickTicketEMDTabVerifyTheSegmentNameStatus(String nameStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the tickets tab and click ticket EMD tab verify the segment name status - " +nameStatus);
            maeGUI.clickTicketsTabAndVerifyTheEMDSegmentNameStatus(logInfo, nameStatus);
            logInfo.pass("I click the tickets tab and click ticket EMD tab verify the segment name status - " +nameStatus);

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I click the tickets tab and click ticket EMD tab verify the segment name status - " +nameStatus);
    }

    @And("I select the passengers and click the issue compensation button and validate the error message")
    public void iSelectThePassengersAndClickTheIssueCompensationButtonAndValidateTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the passengers and click the issue compensation button and validate the error message");
            maeGUI.selectPassengersAndClickIssueCompensationButtonValidateErrorMessage(logInfo);
            logInfo.pass("I select the passengers and click the issue compensation button and validate the error message");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select the passengers and click the issue compensation button and validate the error message");
    }


    @And("I add catalog baggage {string} and {string} and {string}")
    public void iAddCatalogBaggageAndAnd(String BaggageType, String BaggageNo, String BaggageWeight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add catalog baggage "+BaggageType+" and "+BaggageNo+" and "+BaggageWeight+"KG");
            maeGUI.addCatalogBaggageCountAndWeight(BaggageType,BaggageNo,BaggageWeight,logInfo);
            logInfo.pass("I add catalog baggage "+BaggageType+" and "+BaggageNo+" and "+BaggageWeight+"KG");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Submit and verify the Error message after adding Baggage")
    public void iClickOnSubmitAndVerifyTheErrorMessageAfterAddingBaggage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Submit and verify the Error message after adding Baggage");
            maeGUI.clickOnSubmitAndVerifyErrorMessage(logInfo);
            logInfo.pass("I click on Submit and verify the Error message after adding Baggage");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I click on Submit and verify the Error message after adding Baggage");
    }


    @And("I enter the details in Security Document Verification page for double Nationality")
    public void iEnterTheDetailsInSecurityDocumentVerificationPageForDoubleNationality() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the details in Security Document Verification page for double Nationality");
            maeGUI.enterSecurityDocumentDetailsForDoubleNationality(logInfo);
            logInfo.pass("I enter the details in Security Document Verification page for double Nationality");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the class of seat {string} for the required segment {string}")
    public void iChangeTheClassOfSeatForTheRequiredSegment(String cos, String segment) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the class of seat to "+cos+" for the required segment "+segment);
            maeGUI.changeCOSForFirstSegment(logInfo,cos,segment);
            logInfo.pass("I change the class of seat to "+cos+" for the required segment "+segment);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I perform Voluntary Reissue with Pricing Option as {string}")
    public void iPerformVoluntaryReissueWithPricingOptionAs(String pricingOption) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue with Pricing Option as "+pricingOption);
            maeGUI.voluntaryReissueWithPricingOption(logInfo,pricingOption);
            logInfo.pass("I perform Voluntary Reissue with Pricing Option as "+pricingOption);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }



    @And("I change date of travel for second segment {string}")
    public void iChangeDateOfTravelForSecondSegment(String newDate1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date of travel for the second segment");
            maeGUI.changeDateOfTravelForSecondSeg(logInfo,newDate1);
            logInfo.pass("I change the date of travel for the second segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select specific class {string} for the first connecting segment flight and check the seats are available in {string} aswell")
    public void iSelectSpecificClassForTheFirstConnectingSegmentFlightAndCheckTheSeatsAreAvailableInAswell(String seatToBook, String seatToCheck) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class "+seatToBook+" for the first connecting segment flight and check the seats are available in "+seatToCheck+" aswell");
            maeGUI.selectSpecificClassForFirstConnectingSegment(logInfo,seatToBook,seatToCheck);
            logInfo.pass("I select specific class "+seatToBook+" for the first connecting segment flight and check the seats are available in "+seatToCheck+" aswell");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }


    }


    @And("I select specific class {string} for the second connecting segment flight and check the seats are available in {string} aswell")
    public void iSelectSpecificClassForTheSecondConnectingSegmentFlightAndCheckTheSeatsAreAvailableInAswell(String seatToBook, String seatToCheck) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class "+seatToBook+" for the second connecting segment flight and check the seats are available in "+seatToCheck+" aswell");
            maeGUI.selectSpecificClassForSecondConnectingSegment(logInfo,seatToBook,seatToCheck);
            logInfo.pass("I select specific class "+seatToBook+" for the second connecting segment flight and check the seats are available in "+seatToCheck+" aswell");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }



    @And("I perform flifo search with required details")
    public void iPerformFlifoSearchWithRequiredDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform flifo search with required details");
            maeGUI.enterDetailsFlifoSearchWithRequiredDetails(logInfo);
            logInfo.pass("I perform flifo search with required details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }


    @And("I verify the Gate number of the flight for OriginCity in FLIFO")
    public void iVerifyTheGateNumberOfTheFlightForOriginCity() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the Gate number of the flight for OriginCity in FLIFO");
            maeGUI.verifyGateNumberInFLIFO(logInfo);
            logInfo.pass("I verify the Gate number of the flight for OriginCity in FLIFO");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on bag icon in checkin page for {string} passenger and select the type of baggage as catalog {string} and add bags and do payment")
    public void iClickOnBagIconInCheckinPageForPassengerAndSelectTheTypeOfBaggageAsCatalogAndAddBagsAndDoPayment(String paxType, String catalogType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on bag icon in checkin page, select the type of baggage as catalog, add bags and do payment");
            maeGUI.addCatalogBaggageForAllPassengers(logInfo,paxType,catalogType);
            logInfo.pass("I click on bag icon in checkin page, select the type of baggage as catalog, add bags and do payment");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }


    }


    @And("I try to select or unselect the checkbox")
    public void iTryToSelectUnselectTheCheckbox() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to select or unselect the checkbox");
            maeGUI.selectOrUnSelect(logInfo);
            logInfo.pass("I try to select or unselect the checkbox");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I try to click baggage for required passenger {string}")
    public void iTryToClickBaggageForRequiredPassenger(String paxTypeDisplayedInUI) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to click baggage for required passenger "+paxTypeDisplayedInUI);
            maeGUI.clickBaggageIconForSpecificPax(logInfo,paxTypeDisplayedInUI);
            logInfo.pass("I try to click baggage for required passenger "+paxTypeDisplayedInUI);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I try to click submit and continue button")
    public void iTryToClickSubmitAndContinueButton() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to click submit and continue button");
            maeGUI.clickOnSubmitAndContinue(logInfo);
            logInfo.pass("I try to click submit and continue button");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }



    @And("I change date of travel for second connecting segment {string} after the first connecting segment booked")
    public void iChangeDateOfTravelForSecondConnectingSegmentAfterTheFirstConnectingSegmentBooked(String newDate1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date of travel for the second connecting segment");
            maeGUI.changDateForSecondConnectingSegment(logInfo,newDate1);
            logInfo.pass("I change the date of travel for the second connecting segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform Voluntary Reissue")
    public void iPerformVoluntaryReissue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue");
            maeGUI.voluntaryReissueAfterChangingDateOfTravel(logInfo);
            logInfo.pass("I perform Voluntary Reissue");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }


    }

    @And("I validate Ticket and EMD values in Agent sales report")
    public void iValidateTicketAndEMDValuesInAgentSalesReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate Ticket and EMD values in Agent sales report and view tax details");
            maeGUI.validateTicketAndEMDAndViewTaxDetailsForconjunctiveSegments(logInfo);
            logInfo.pass("I validate Ticket and EMD values in Agent sales report and view tax details");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }

    }

    @And("I select class {string} for second segment for the newly added segments via availability after the Connecting segments")
    public void iSelectClassForSecondSegmentForTheNewlyAddedSegmentsViaAvailabilityAfterTheConnectingSegments(String cabin) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class in other segment flights");
            maeGUI.selectFlightForSecondSegmentInAvailability(cabin,logInfo);
            logInfo.pass("I select " + cabin + " class in other segment flights");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I try to click and store the Quote ID from Voluntary Reissue options page")
    public void iTryToclickAndStoreTheQuoteIDFromVoluntaryReissueOptionsPage() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to click and store the Quote ID from Voluntary Reissue options page");
            maeGUI.toStoreQuoteID(logInfo);
            logInfo.pass("I try to click and store the Quote ID from Voluntary Reissue options page");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I try to click the {string} link from Order Page under Remarks sub tab to verify {string}")
    public void iTryToClickTheLinkFromOrderPageUnderRemarksSubTab(String link, String accountCode) {

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to click the " + link + " link from Order Page under Remarks sub tab");
            maeGUI.toValidateReissueLink(logInfo, link, accountCode);
            logInfo.pass("I try to click the " + link + " link from Order Page under Remarks sub tab");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I try to close the popup")
    public void iTryToCloseThePopup() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to close the popup");
            maeGUI.toclosePopUp(logInfo);
            logInfo.pass("I try to close the popup");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }



    @And("I select specific child passenger in checkin page using {string}")
    public void iSelectSpecificChildPassengerInCheckinPageUsing(String searchType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific child passenger in checkin page using "+ searchType);
            maeGUI.selectChildPax(logInfo,searchType);
            logInfo.pass("I select specific child passenger in checkin page using "+ searchType);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I try to update the passenger in Checkin Page {string}")
    public void iTryToUpdateThePassengerInCheckinPage(String paxtype) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to update the passenger in Checkin Page as "+paxtype);
            maeGUI.updatePassengerInCheckInPage(logInfo,paxtype);
            logInfo.pass("I try to update the passenger in Checkin Page as "+paxtype);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I try to add the Infant Without seat passenger from Order Screen")
    public void iTryToAddTheInfantWithoutSeatPassengerFromOrderScreen() {

        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to add the Infant Without seat passenger from Order Screen");
            maeGUI.addInfantWithoutSeatPassenger(logInfo);
            logInfo.pass("I try to add the Infant Without seat passenger from Order Screen");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I verify infant icon is displayed and passenger type is displayed as {string}")
    public void iVerifyInfantIconIsDisplayedAndPassengerTypeIsDisplayedAs(String paxType) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify infant icon is displayed and passenger type is displayed as "+paxType);
            maeGUI.toVerifyPaxIcon(logInfo,paxType);
            logInfo.pass("I verify infant icon is displayed and passenger type is displayed as "+paxType);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }


    }


    @And("I try to click on Back button")
    public void iTryToClickOnBackButton() {

        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to click on Back button");
            maeGUI.clickBackButton(logInfo);
            logInfo.pass("I try to click on Back button");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }



    @And("I click on the Boarding pass icon to print the Boarding pass")
    public void iClickOnTheBoardingPassIconToPrintTheBoardingPass() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on the Boarding pass icon to print the Boarding pass");
            maeGUI.printBoardingPassInCheckinPage(logInfo);
            logInfo.pass("I click on the Boarding pass icon to print the Boarding pass");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I click the Tickets tab and verify INF is present")
    public void iClickTheTicketsTabAndVerifyINFIsPresent() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Tickets tab and verify INF is present");
            maeGUI.verifyINFPassengerIsPresentInTicketsTab(logInfo);
            logInfo.pass("I click the Tickets tab and verify INF is present");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I click the EMD subtab and verify administrative fees")
    public void iClickTheEMDSubtabAndVerifyAdministrativeFees() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the EMD subtab and verify administrative fees");
            maeGUI.toVerifyAdministrativeFeesInEmdTab(logInfo);
            logInfo.pass("I click the EMD subtab and verify administrative fees");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I issue the compensation for selected passengers with amount {string} and {string}")
    public void iIssueTheCompensationForSelectedPassengersWithAmountAnd(String Amount, String reason) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers and issue compensation");
            maeGUI.IssueCompensationWithSpecificAmount(logInfo, Amount,reason);
            logInfo.pass("I select passengers and issue compensation");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I select passengers and view compensation details")
    public void iSelectPassengersAndViewCompensationDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers and view compensation details");
            maeGUI.selectPassengersClickViewCompensationDetails(logInfo);
            logInfo.pass("I select passengers and view compensation details");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I add advanced option {string}")
    public void iAddAdvancedOption(String optionType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add advanced option " +optionType);
            maeGUI.addAdvancedOption(logInfo,optionType);
            logInfo.pass("I add advanced option " +optionType);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform Voluntary Reissue with Pricing Option as {string} with an advanced option type  {string}")
    public void iPerformVoluntaryReissueWithPricingOptionAsWithAnAdvancedOptionType(String pricingOption, String optionType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue with Pricing Option as "+pricingOption+" with an advanced option type "+optionType);
            maeGUI.voluntaryReissueWithPricingOptionWithAnAdvancedOptionType(logInfo,pricingOption,optionType);
            logInfo.pass("I perform Voluntary Reissue with Pricing Option as "+pricingOption +" with an advanced option type "+optionType);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I select specific class {string} for Origin flight in Economy Class")
    public void iSelectSpecificClassForOriginFlightInEconomyClass(String cos) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class " + cos + " for Origin flight in Economy Class");
            maeGUI.clickOriginFlight();
            maeGUI.selectSpecificSeatInEconomyClass(logInfo, cos);
            logInfo.pass("I select specific class " + cos + " for Origin flight in Economy Class");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform Voluntary Reissue to validate Manual Reissue required error message")
    public void iPerformVoluntaryReissueToValidateManualReissueRequiredErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue to validate Manual Reissue required error message");
            maeGUI.ToValidateManualReissueRequiredErrorMessage(logInfo);
            logInfo.pass("I perform Voluntary Reissue to validate Manual Reissue required error message");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I add a service {string} in cabin for specific passenger {string}")
    public void iAddAServiceInCabinForSpecificPassenger(String service, String paxNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add a service " + service + " in cabin");
            maeGUI.addAServiceForSpecificPax(service, paxNo, logInfo);
            logInfo.pass("I add a service " + service + " in cabin");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on Quotes subtab")
    public void iClickOnQuotesSubtab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Quotes subtab");
            maeGUI.viewQuotesDetails(logInfo);
            logInfo.pass("I click on Quotes subtab");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I click on the Travel document")
    public void iClickOnTheTravelDocument() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on the Travel document");
            maeGUI.clickOnTravelDocument(logInfo);
            logInfo.pass("I click on the Travel document");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate if the SSR {string} added is displayed in the confirmation dialog")
    public void iValidateIfTheSSRAddedIsDisplayedInTheConfirmationDialog(String SSRKeyword) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate if the SSR added is displayed in the confirmation dialog");
            maeGUI.validateSSRInTheConfirmationDialog(logInfo, SSRKeyword);
            logInfo.pass("I validate if the SSR added is displayed in the confirmation dialog");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate if the added SSR {string} is available after checkin")
    public void iValidateIfTheAddedSSRIsAvailableAfterCheckin(String SSRValue) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate if the added SSR is available after checkin");
            maeGUI.validateSSRAfterCheckin(logInfo, SSRValue);
            logInfo.pass("I validate if the added SSR is available after checkin");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the names in the Icoupon")
    public void iValidateTheNamesInTheIcoupon() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the names in the Icoupon");
            maeGUI.validateNamesInICoupon(logInfo);
            logInfo.pass("I validate the names in the Icoupon");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate the amounts in the Icoupon with {string}")
    public void iValidateTheAmountsInTheIcoupon(String currency) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the amounts in the Icoupon");
            maeGUI.validateAmountInIcoupon(logInfo, currency);
            logInfo.pass("I validate the amounts in the Icoupon");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I search the flight for the segment {string} in Gate section with thru flight as origin")
    public void iSearchTheFlightForTheSegmentInGateSectionWithThruFlightAsOrigin(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I search the flight for the given segment in Gate section with thru flight as origin");
            maeGUI.searchFlightInGateWithThruFlightAsOrigin(logInfo, segmentIndex);
            logInfo.pass("I search the flight for the given segment in Gate section with thru flight as origin");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add SSR {string} through Services Tab for the passenger {string}")
    public void iAddSSRThroughServicesTabForThePassenger(String SSRType, String Passenger) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add SSR through Services tab in GUI");
            maeGUI.addASSRInGUIForSpecifiedPax(logInfo, SSRType, Passenger);
            logInfo.pass("I add SSR through Services tab in GUI");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select passengers using flight numbers in Compensation model {string} for the segment {string}")
    public void iSelectPassengersUsingFlightNumbersInCompensationModelForTheSegment(String paxType, String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers using flight numbers in Compensation model");
            maeGUI.selectPassengersFromCompensationPageWithPaxTypeForThegivenSegment(logInfo, paxType,segmentIndex);
            logInfo.pass("I select passengers using flight numbers in Compensation model");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate the Sequence number for the segment {string} in native shares")
    public void iValidateTheSequenceNumberForTheSegmentInNativeShares(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the Sequence number in native shares");
            maeGUI.validateSequenceNumberInNativeShares(logInfo, Integer.parseInt(segmentIndex));
            logInfo.pass("I validate the Sequence number in native shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I display the standby list for the segment {string} in native shares")
    public void iDisplayTheStandbyListForTheSegmentInNativeShares(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display the standby list in native shares");
            maeGUI.displayStandbyListInNativeShares(logInfo, Integer.parseInt(segmentIndex));
            logInfo.pass("I display the standby list in native shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on quotes subtab from tickets tab")
    public void iClickOnQuotesSubtabFromTicketsTab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on quotes subtab from tickets tab");
            maeGUI.clickOnQuotesSubtabFromTicketsTab(logInfo);
            logInfo.pass("I click on quotes subtab from tickets tab");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on the standby tab to display the passenger list")
    public void iClickOnTheStandbyTabToDisplayTheList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on the standby tab to display the passenger list");
            maeGUI.clickOnTheStandbyTabToDisplayTheList(logInfo);
            logInfo.pass(" click on the standby tab to display the passenger list");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I initiate standby to the passenger")
    public void iInitiateStandbyToThePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I initiate standby to the passenger");
            maeGUI.InitiateStandbyToThePassenger(logInfo);
            logInfo.pass("I initiate standby to the passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I validate if the passengers have been cleared")
    public void iValidateIfThePassengersHaveBeenCleared() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate if the passengers have been cleared");
            maeGUI.ValidateIfThePassengersHaveBeenCleared(logInfo);
            logInfo.pass("I validate if the passengers have been cleared");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I assign weight restriction for the class {string} with number of pax {string}")
    public void iAssignWeightRestrictionForTheClassWithNumberOfPax(String originClass, String paxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign weight restriction for the given class");
            maeGUI.AssignWeightRestriction(logInfo,originClass,paxCount);
            logInfo.pass("I assign weight restriction for the given class");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I unassign weight restriction for the class {string} with number of pax {string}")
    public void iUnassignWeightRestrictionForTheClassWithNumberOfPax(String originClass, String paxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I unassign weight restriction for the given class");
            maeGUI.UnassignWeightRestriction(logInfo,originClass,paxCount);
            logInfo.pass("I unassign weight restriction for the given class");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I click on the oversold tab to display the passenger list")
    public void iClickOnTheOversoldTabToDisplayThePassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on the oversold tab to display the passenger list");
            maeGUI.clickOnTheOversoldTabToDisplayTheList(logInfo);
            logInfo.pass("I click on the oversold tab to display the passenger list");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I validate if the passenger is added to the oversold list")
    public void iValidateIfThePassengerIsAddedToTheOversoldList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate if the passenger is added to the oversold list");
            maeGUI.validatePassengerInOversoldList(logInfo);
            logInfo.pass("I validate if the passenger is added to the oversold list");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I select class {string} for the first segment and {string} for the second segment in first connecting segment flight")
    public void iSelectClassForTheFirstSegmentAndForTheSecondSegmentInFirstConnectingSegmentFlight(String firstSegmentClass, String secondSegmentClass) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class for the first segment and second segment in first connecting segment flight");
            maeGUI.selectSpecificClassForSegmentsInFirstConnectingFlight(logInfo,firstSegmentClass,secondSegmentClass);
            logInfo.pass("I select specific class for the first segment and second segment in first connecting segment flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I select class {string} for the first segment and {string} for the second segment in second connecting segment flight")
    public void iSelectClassForTheFirstSegmentAndForTheSecondSegmentInSecondConnectingSegmentFlight(String firstSegmentClass, String secondSegmentClass) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class for the first segment and second segment in second connecting segment flight");
            maeGUI.selectSpecificClassForSegmentsInSecondConnectingFlight(logInfo,firstSegmentClass,secondSegmentClass);
            logInfo.pass("I select specific class for the first segment and second segment in second connecting segment flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select class {string} for Codeshare Origin flight")
    public void iSelectClassForCodeshareOriginFlight(String cabin)
            throws ClassNotFoundException {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class for Codeshare Origin flight");

            maeGUI.clickOriginFlight();
            if (cabin.equalsIgnoreCase("Economy")) {
//                    maeGUI.selectFullEconomy(logInfo);
                maeGUI.selectFullEconomyForCodeshare(logInfo);
            } else if (cabin.equalsIgnoreCase("Business")) {
                maeGUI.selectFullBusiness(logInfo);
            }   else if (cabin.equalsIgnoreCase("SelectADifferentFlight")) {
                maeGUI.selectFullEconomyForADifferentFlight(logInfo);
            }
            else {
                maeGUI.selectAnySeat();
            }
            logInfo.pass("I select " + cabin + " class for Codeshare Origin flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select class {string} for Codeshare Return flight")
    public void iSelectClassForCodeshareReturnFlight(String cabin) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class for Codeshare Return flight");
            maeGUI.selectAllCodeShareFlights(cabin,logInfo);
            logInfo.pass("I select " + cabin + " class for Codeshare Return flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I click the EMD Available for Print tab and click print button")
    public void iClickTheEMDAvailableForPrintTabAndClickPrintButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the EMD Available for Print tab and click print button");
            maeGUI.clickEMDAvailableTabAndClickPrint(logInfo);
            logInfo.pass("I click the EMD Available for Print tab and click print button");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I click the EMD Available for Print tab and click print button");
    }


    @And("I validate EMD values in Agent Sales Report and view tax details")
    public void iValidateEMDValuesInAgentSalesReportAndViewTaxDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate EMD values in Agent Sales Report and view tax details");
            maeGUI.validateEMDAndViewTaxDetails(logInfo);
            logInfo.pass("I validate EMD values in Agent Sales Report and view tax details");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I select flight by flight status in gate page {string} and {string} and {string}")
    public void iSelectFlightByFlightStatusInGatePage(String origin, String departureDate, String flightStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select flight by flight status in gate page - " +flightStatus);
            maeGUI.selectFlightWithStatusInGatePage(logInfo, origin, departureDate, flightStatus);
            logInfo.pass("I select flight by flight status in gate page - " +flightStatus);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I select flight by flight status in gate page - " +flightStatus);
    }


    @And("I select passengers and click the issue compensation button {string} and {string} and {string}")
    public void iSelectPassengersAndClickTheIssueCompensationButtonAndAnd(String paxType, String reason, String traveldate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers and click the issue compensation button");
            maeGUI.selectPassengersAndClickIssueCompensationButton(logInfo, paxType, reason, traveldate);
            logInfo.pass("I select passengers and click the issue compensation button");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select passengers and click the issue compensation button");
    }

    @And("I validate EMD ticket number in Agent sales report")
    public void iValidateEMDTicketNumberInAgentSalesReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate EMD ticket number in Agent sales report");
            maeGUI.validateEMDTicketNumber(logInfo);
            logInfo.pass("I validate EMD ticket number in Agent sales report");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
        System.out.println("I validate EMD ticket number in Agent sales report");
    }

    @And("I select passenger and click proceed to Checkin button")
    public void iSelectPassengerAndClickProceedToCheckinButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passenger and click proceed to Checkin button");
            maeGUI.selectPassengerAndProceedToCheckin(logInfo);
            logInfo.pass("I select passenger and click proceed to Checkin button");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I select passenger and click proceed to Checkin button");
    }


//    -----------------------------------------------

    @And("I click add Baggage icon for second passenger")
    public void iClickAddBaggageIconForSecondPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click add Baggage icon for second passenger");
            maeGUI.clickAddBaggageIconForSecondPassenger(logInfo);
            logInfo.pass("I click add Baggage icon for second passenger");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I click on Submit and Proceed to Pay after adding baggage")
    public void iClickOnSubmitAndProceedToPayAfterAddingBaggage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Submit and Proceed to Pay after adding baggage");
            maeGUI.clickOnSubmitAndPayAfterAddingBaggage(logInfo);
            logInfo.pass("I click on Submit and Proceed to Pay after adding baggage");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I perform Voluntary reissue with penalty and pricing option as {string} and {string} and {string}")
    public void iPerformVoluntaryReissueWithPenaltyAndPricingOptionAs(String pricingOption, String penalty, String taxCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary reissue with penalty and pricing option as "+pricingOption);
            maeGUI.voluntaryReissueWithPenaltyAndPricingOption(logInfo,pricingOption, penalty, taxCode);
            logInfo.pass("I perform Voluntary reissue with penalty and pricing option as "+pricingOption);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add OSI remarks in order tab {string}")
    public void iAddOSIRemarksInOrderTab(String osiRemarkText) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add OSI remarks in order tab "+osiRemarkText);
            maeGUI.addOSIRemarkInOrderTab(logInfo,osiRemarkText);
            logInfo.pass("I add OSI remarks in order tab "+osiRemarkText);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select the prefer upgrade to upgrade the passenger in checkin page")
    public void iSelectThePreferUpgradeToUpgradeThePassengerInCheckinPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the prefer upgrade to upgrade the passenger in checkin page");
            maeGUI.selectPreferUpgrade(logInfo);
            logInfo.pass("I select the prefer upgrade to upgrade the passenger in checkin page");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I select the Quote Options and click on Next retrieving PNR from Native shares")
    public void iSelectTheQuoteOptionsAndClickOnNextRetrievingPNRFromNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the Quote Options and click on Next retrieving PNR from Native shares");
            maeGUI.checkQuoteOptionsRetrievingPNRFromNativeShares(logInfo);
            logInfo.pass("I select the Quote Options and click on Next retrieving PNR from Native shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
        System.out.println("I select the Quote Options and click on Next retrieving PNR from Native shares");
    }


    @And("I select pricing option Price as Best Buy retrieving PNR from Native shares")
    public void iSelectPricingOptionPriceAsBestBuyRetrievingPNRFromNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select pricing option Price as Best buy retrieving PNR from Native shares");
            maeGUI.pricingOptionAsBestBuyRetrievePNRFromNativeShares(logInfo);
            logInfo.pass("I select pricing option Price as Best buy retrieving PNR from Native shares");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I change the class of seat {string} for required connecting segment {string}")
    public void iChangeTheClassOfSeatForRequiredConnectingSegment(String cos, String segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the class of seat to "+cos+" for required connecting segment");
            maeGUI.changeCOSForRequiredConnectingSegment(logInfo,cos,segment);
            logInfo.pass("I change the class of seat to "+cos+" for required connecting segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I make the second payment by selecting the required payment type {string}")
    public void iMakeTheSecondPaymentBySelectingTheRequiredPaymentType(String paymentType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on pay button");
            maeGUI.clickPayButtonIfEnabledForSecondPayment(logInfo,paymentType);
            logInfo.pass("I click on pay button");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I click status tab in gate page and check unreconciled pax status")
    public void iClickStatusTabInGatePageAndCheckUnreconciledPaxStatus() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click status tab in gate page and check unreconciled pax status");
            maeGUI.checkStatusOfUnreconciledPassengers(logInfo);
            logInfo.pass("I click status tab in gate page and check unreconciled pax status");
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I click status tab in gate page and check unreconciled pax status");
    }

    @And("I select passengers click print button and click continue printing button")
    public void iSelectPassengersClickPrintButtonAndClickContinuePrintingButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers click print button and click continue printing button");
            maeGUI.selectPassengersAndClickPrintAndClickContinuePrintingButton(logInfo);
            logInfo.pass("I select passengers click print button and click continue printing button");
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I select passengers click print button and click continue printing button");
    }


    @And("I click on view icon for both paper and Icoupon generated passengers to display compensation details")
    public void iClickOnViewIconForBothPaperAndIcouponGeneratedPassengersToDisplayCompensationDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on view icon for both paper and Icoupon generated passengers to display compensation details");
            maeGUI.clickOnViewAndDisplayCompensationDetailsForPaperAndIcouponPax(logInfo);
            logInfo.pass("I click on view icon for both paper and Icoupon generated passengers to display compensation details");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I click on view icon for both paper and Icoupon generated passengers to display compensation details");
    }


    @And("I select specific class {string} for Return flight")
    public void iSelectSpecificClassForReturnFlight(String cabin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + cabin + " class in other segment flights");
            maeGUI.selectAllFlightsForSpecificClass(logInfo, cabin);
            logInfo.pass("I select " + cabin + " class in other segment flights");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select a flight that already has assigned gate No {string} and {string} and {string} and {string}")
    public void iSelectAFlightThatAlreadyHasAssignedGateNoAndAndAnd(String origin, String departureDate, String gateNo, String time) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select flight already assigned gate No in gate page");
            maeGUI.selectFlightWithGateNoInGatePage(logInfo, origin, departureDate, gateNo, time);
            logInfo.pass("I select flight already assigned gate No in gate page");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
        System.out.println("I select flight already assigned gate No in gate page");
    }


    @And("I enter Start Date {string} to select flight on Monday and select the Return Date {string} for two way booking")
    public void iEnterStartDateToSelectFlightOnMondayAndSelectTheReturnDateForTwoWayBooking(String startDate, String returnDate) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter date to select flight on Monday and date of arrival for two way booking");
            maeGUI.bookFlightOnMonday(startDate, returnDate, logInfo);
            logInfo.pass("I enter date to select flight on Monday and date of arrival for two way booking");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I select Book from Actions Dropdown and give the segment numbers as {string}")
    public void iSelectBookFromActionsDropdownAndTheSegmentNumbersAs(String segments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " select Book from Actions Dropdown and give the segment numbers");
            maeGUI.actionsSelectBookWithSegments(logInfo, segments);
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select passengers generate digital voucher and view compensation details")
    public void iSelectPassengersGenerateDigitalVoucherAndViewCompensationDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select passengers generate digital voucher and view compensation details");
            maeGUI.selectPassengerGenerateDigitalVoucherAndViewCompensationDetails(logInfo);
            logInfo.pass("I select passengers generate digital voucher and view compensation details");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

        System.out.println("I select passengers generate digital voucher and view compensation details");
    }





    @And("I perform Voluntary Reissue by selecting specific segment {string} with Pricing Option as {string}")
    public void iPerformVoluntaryReissueBySelectingSpecificSegmentWithPricingOptionAs(String segment, String pricingOption) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue by selecting specific segment "+segment+" with Pricing option as "+pricingOption);
            maeGUI.performingReissueForSpecificSegment(logInfo,segment,pricingOption);
            logInfo.pass("I perform Voluntary Reissue by selecting specific segment "+segment+" with Pricing option as "+pricingOption);

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I add the details in the Passenger Reduction Type as {string} {string} and account code as {string}")
    public void iAddTheDetailsInThePassengerReductionTypeAsAndAccountCodeAs(String type1, String type2, String accountCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the details in the Passenger Reduction Type and account code as "+accountCode);
            maeGUI.addingAccountCodeAndAdvancedOption(logInfo,type1,type2,accountCode);
            logInfo.info("I add the details in the Passenger Reduction Type and account code as "+accountCode);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }



    @And("I perform Voluntary Reissue with Pricing option as {string} with an advanced option type {string} and Passenger Reduction Type as {string} {string} and panelty amount as {string}")
    public void iPerformVoluntaryReissueWithPricingOptionAsWithAnAdvancedOptionTypeAndPassengerReductionTypeAsAndPaneltyAmountAs(String pricingOption, String accountcode, String type1, String type2, String penaltyAmount) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue");
            maeGUI.performingVoluntaryReissueWithAccountCodeAndPassengerReduction(logInfo,pricingOption,accountcode,type1,type2,penaltyAmount);
            logInfo.info("I perform Voluntary Reissue");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }


    }

    @And("I validate the Tax Details in Agent Sales Report after changes")
    public void iValidateTheTaxDetailsInAgentSalesReportAfterChanges() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the Tax Details in Agent Sales Report after changes");
            maeGUI.taxDetailValidationAfterVoluntaryReissue(logInfo);
            logInfo.info("I validate the Tax Details in Agent Sales Report after changes");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add same firstname to {string} passenger")
    public void iAddSameFirstnameToPassenger(String paxCount) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add same firstname to " + paxCount + " passengers");
            isharesPage2.addSameFirstName(logInfo, paxCount);
            logInfo.pass("I add same firstname to " + paxCount + " passengers");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click the Tickets tab and try to verify the tax details after reissue")
    public void iClickTheTicketsTabAndTryToVerifyTheTaxDetailsAfterReissue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Tickets tab and try to verify the tax details after reissue");
            maeGUI.verifyTaxInTicketsTab(logInfo);
            logInfo.pass("I click the Tickets tab and try to verify the tax details after reissue");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform Voluntary reissue with penalty and pricing option as {string} and {string}")
    public void iPerformVoluntaryReissueWithPenaltyAndPricingOptionAsAnd(String pricingOption, String penalty) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary reissue with penalty and pricing option as "+pricingOption);
            maeGUI.voluntaryReissueWithPenalty(logInfo,pricingOption, penalty);
            logInfo.pass("I perform Voluntary reissue with penalty and pricing option as "+pricingOption);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click add Baggage icon for the specific pax {string}")
    public void iClickAddBaggageIconForTheSpecificPax(String PaxType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click add Baggage icon for the specific pax - "+ PaxType);
            maeGUI.clickAddBaggageIconForSpcificPax(logInfo, PaxType);
            logInfo.pass("I click add Baggage icon for the specific pax - "+ PaxType);
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I search the Order number in Travel compensation model")
    public void iSearchTheOrderNumberInTravelCompensationModel() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search the Order number in Travel compensation model");
            maeGUI.searchOrderNumberCompensation(logInfo);
            logInfo.pass("I search the Order number in Travel compensation model");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I select the Order number and click on continue button in compensation model")
    public void iSelectTheOrderNumberAndClickOnContinueButtonInCompensationModel() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select the Order number and click on continue button in compensation model");
            maeGUI.selectOrderNumberCompensationPage(logInfo);
            logInfo.pass("I select the Order number and click on continue button in compensation model");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform Voluntary Reissue with Circle trip and Pricing Option as {string}")
    public void iPerformVoluntaryReissueWithCircleTripAndPricingOptionAs(String pricingOption) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue with Circle trip and Pricing Option as "+pricingOption);
            maeGUI.voluntaryReissueWithCircleTripAndPricingOption(logInfo,pricingOption);
            logInfo.pass("I perform Voluntary Reissue with Circle trip and Pricing Option as "+pricingOption);
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select class {string} for Origin flight with departure time within {string} from current time")
    public void iSelectClassForOriginFlightWithDepartureTimeWithinFromCurrentTime(String originclass, String hours) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select " + originclass + " class for Origin flight with departure time within " + hours + " hours from now.");

            maeGUI.clickOriginFlight();
            if (originclass.equalsIgnoreCase("Economy")) {
                maeGUI.selectFullEconomyForFlightWithinGivenDuration(logInfo, (Integer.parseInt(hours) * 60));
            } else if (originclass.equalsIgnoreCase("Business")) {
                maeGUI.selectFullBusinessForFlightWithinGivenDuration(logInfo, (Integer.parseInt(hours) * 60));
            }
            logInfo.pass("I select " + originclass + " class for Origin flight with departure time within " + hours + " hours from now.");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on the accept button in checkin page to pay")
    public void iClickOnTheAcceptButtonInCheckinPageToPay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on the accept button in checkin page to pay");
            maeGUI.clickAcceptButtonToPayInCheckinPage(logInfo);
            logInfo.pass("I click on the accept button in checkin page to pay");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I check the flight status in gate model and delay the flight {string}")
    public void iCheckTheFlightStatusInGateModel(String flightStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check the flight status in gate model and delay the flight - " + flightStatus);
            maeGUI.checkFlightStatusInGateModelAndDelayTheFlight(logInfo, flightStatus);
            logInfo.pass("I check the flight status in gate model and delay the flight - " + flightStatus);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I change date of travel for third segment {string}")
    public void iChangeDateOfTravelForThirdSegment(String newDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date of travel for the third segment");
            maeGUI.changeDateOfTravelForThirdSeg(logInfo, newDate);
            logInfo.pass("I change the date of travel for the third segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I change date of travel for fourth segment {string}")
    public void iChangeDateOfTravelForFourthSegment(String newDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the date of travel for the fourth segment");
            maeGUI.changeDateOfTravelForFourthSeg(logInfo, newDate);
            logInfo.pass("I change the date of travel for the fourth segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Start Date {string} to select flight on {string}")
    public void iEnterStartDateToSelectFlightOn(String startDate, String dayToBook) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter date to select flight on a particular day");
//            maeGUI.bookFlightOnMonday(startDate, dayToBook, logInfo);
            maeGUI.bookFlightOnTheGivenDay(startDate, dayToBook, logInfo);
            logInfo.pass("I enter date to select flight on a particular day");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add SSR {string} with {string} through Services Tab for the passenger {string}")
    public void iAddSSRWithThroughServicesTabForThePassenger(String SSRType, String SSRDescription, String Passenger) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add SSR: " + SSRType + " through Services tab in GUI");
            maeGUI.addSSRWithThroughServicesTabForThePassenger(logInfo, SSRType, SSRDescription, Passenger);
            logInfo.pass("I add SSR: " + SSRType + " through Services tab in GUI");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the pnr in native shares")
    public void iRetrieveThePnrInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the pnr in native shares");
            isharesPage5.retrievePNRInNativeShares(logInfo);
            logInfo.pass("I retrieve the pnr in native shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the SSR {string} in native shares after PNR Retrieval")
    public void iValidateTheSSRInNativeSharesAfterPNRRetrieval(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the SSR " + SSR + " in native shares after PNR Retrieval");
            isharesPage5.validateTheSSRInNativeShares(logInfo, SSR);
            logInfo.pass("I validate the SSR " + SSR + " in native shares after PNR Retrieval");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I store the updated emd and ticket details and validate if payment is successful")
    public void iStoreTheExchangedEmdAndTicketDetailsAndValidateIfPaymentIsSuccessful() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I store the updated emd and ticket details and validate if payment is successful");
            maeGUI.storeEmdAndTicketDetailsAndValidatePayment(logInfo);
            logInfo.pass("Payment is successful");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate the EMD values in Agent Sales Report after changes")
    public void iValidateTheEMDValuesInAgentSalesReportAfterExchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate EMD value in Agent Sales Report");
//            maeGUI.validateEMD(logInfo);
            maeGUI.validateExchangedEMD(logInfo);
            logInfo.info("I validate EMD value in Agent Sales Report");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add SSR {string} through Services tab with {string}")
    public void iAddSSRThroughServicesTabWith(String SSRType, String SSRDescription) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add SSR through Services tab in GUI");
            maeGUI.addASSRWithOptionInGUI(logInfo, SSRType, SSRDescription);
            logInfo.pass("I add SSR through Services tab in GUI");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the EMD values in Agent Sales Report after SSR addition")
    public void iValidateTheEMDValuesInAgentSalesReportAfterSSRAddition() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate EMD value in Agent Sales Report After SSR Addition");
            maeGUI.validateSSREMD(logInfo);
            logInfo.info("I validate EMD value in Agent Sales Report After SSR Addition");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I click the services Tab to validate added SSR {string}")
    public void iClickTheServicesTabToValidateAddedSSR(String ssrType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the services Tab to validate added SSR");
            maeGUI.clickServicesTab(logInfo);
            maeGUI.ValidateSSR(logInfo, ssrType);
            logInfo.pass("I click the services Tab to validate added SSR");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the details in the email recipients page for FQTV passengers")
    public void iEnterTheDetailsInTheEmailRecipientsPageForFQTVPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the details in the email recipients page");
//            maeGUI.setEmail(logInfo);
            maeGUI.setEmailFQTV(logInfo);
            logInfo.pass("I successfully enter the details in the email recipients page");
        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I click on COPA GUI application login button")
    public void iClickOnCOPAGUIApplicationLoginButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I click on Login button in COPA GUI application");
//            maeGUI.logIntoGUIApplication(logInfo);
            maeGUI.clickLoginButtton(logInfo);
            logInfo.pass("I click on Login button in COPA GUI application");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter the alternate credentials {string} and {string} to log into COPA GUI application")
    public void iEnterTheAlternateCredentialsAndToLogIntoCOPAGUIApplication(String userName, String password) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I enter alternate valid credentials to log into COPA GUI application");
            maeGUI.alternateLogIntoGUIApplication(logInfo, userName, password);
            logInfo.pass("I enter alternate valid credentials to log into COPA GUI application");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate if the new user is not the controlling agent {string}")
    public void iValidateIfTheNewUserIsNotTheControllingAgent(String username) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "I try to assign an agent");
//            maeGUI.assignAgent(logInfo, actionType);
            maeGUI.validateIfTheNewUserIsNotTheControllingAgent(logInfo, username);
            logInfo.pass("I try to assign an agent");


        } catch (Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I click on off load button and validate the error message")
    public void iClickOnOffLoadButtonAndValidateTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on off load button and validate the error message");
//            maeGUI.clickOffLoadButton(logInfo);
            maeGUI.clickOffLoadButtonAndValidateErrorMsg(logInfo);
            logInfo.pass("I click on off load button and validate the error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I click on Submit and Proceed to Pay with Foid details if needed and Capture the Baggage EMD details")
    public void iClickOnSubmitAndProceedToPayWithFoidDetailsAndCaptureTheBaggageEMDDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Submit and Proceed to Pay and Capture the Baggage EMD details");
            maeGUI.clickOnSubmitAndPayWithFoidDetailsAndCaptureTheBaggageEMD(logInfo);
            logInfo.pass("I click on Submit and Proceed to Pay and Capture the Baggage EMD details");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the Baggage EMD values in Agent Sales Report")
    public void iValidateTheBaggageEMDValuesInAgentSalesReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the Baggage EMD values in Agent Sales Report");
            maeGUI.validateBaggageEMD(logInfo);
            logInfo.info("I validate the Baggage EMD values in Agent Sales Report");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click the services Tab to validate the seats and store the seat numbers")
    public void iSelectSeatForAllPassengersAndStoreTheSeatDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the Services tab to validate the seats");
            maeGUI.clickServicesTabToValidateSeatsAndStoreTheSeats(logInfo);
            logInfo.pass("I click the Services tab and validate the seats assigned");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I open the seat map to check if the held seats are released")
    public void iOpenTheSeatMapToCheckIfTheHeldSeatsAreReleased() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open the seat map to check if the held seats are released");
            maeGUI.validateReleasedSeats(logInfo);
            logInfo.pass("I open the seat map to check if the held seats are released");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select class {string} for the first segment and {string} for the second segment in first connecting segment codeshare flight")
    public void iSelectClassForTheFirstSegmentAndForTheSecondSegmentInFirstConnectingSegmentCodeshareFlight(String firstSegmentClass, String secondSegmentClass) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class for the first segment and second segment in first connecting segment codeshare flight");
            maeGUI.selectSpecificClassForSegmentsInFirstConnectingCodeshareFlight(logInfo, firstSegmentClass, secondSegmentClass);
            logInfo.pass("I select specific class for the first segment and second segment in first connecting segment codeshare flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I select class {string} for the first segment and {string} for the second segment in second connecting segment codeshare flight")
    public void iSelectClassForTheFirstSegmentAndForTheSecondSegmentInSecondConnectingSegmentCodeshareFlight(String firstSegmentClass, String secondSegmentClass) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select specific class for the first segment and second segment in second connecting segment codeshare flight");
            maeGUI.selectSpecificClassForSegmentsInSecondConnectingCodeshareFlight(logInfo, firstSegmentClass, secondSegmentClass);
            logInfo.pass("I select specific class for the first segment and second segment in second connecting segment codeshare flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I initiate boarding if boarding not initiated")
    public void iInitiateBoardingIfBoardingNotInitiated() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I initiate boarding if boarding not initiated");
            maeGUI.initiateBoarding(logInfo);
            logInfo.pass("I initiate boarding if boarding not initiated");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the passenger added into the Cabin STBY list in passenger details screen")
    public void iVerifyThePassengerAddedIntoTheCabinSTBYListInPassengerDetailsScreen() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the passenger added into the Cabin STBY list in passenger details screen");
            maeGUI.verifyThePassengerStatusInPassengerDetailsScreen(logInfo);
            logInfo.pass("I verify the passenger added into the Cabin STBY list in passenger details screen");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter the details in Security Document Verification page with all details")
    public void iEnterTheDetailsInSecurityDocumentVerificationPageWithAllDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the details in Security Document Verification page");
            maeGUI.enterSecurityDocumentDetailsWithAllDetails(logInfo);
            logInfo.pass("I enter the details in Security Document Verification page");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I add process and reason code in Quote Waiver page")
    public void iAddProcessAndReasonCodeInQuoteWaiverPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add process and reason code in Quote Waiver page");
            maeGUI.addProcessAndReasonCodeInQuoteWaiverPage(logInfo);
            logInfo.pass("I add process and reason code in Quote Waiver page");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform Voluntary Reissue with Pricing Option as {string} and pay as residual reissue")
    public void iPerformVoluntaryReissueWithPricingOptionAsAndPayAsResidualReissue(String pricingOption) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Voluntary Reissue with Pricing Option as " + pricingOption + " and pay as residual reissue");
            maeGUI.voluntaryReissueWithPricingOptionAndPayASResidualReissue(logInfo, pricingOption);
            logInfo.pass("I perform Voluntary Reissue with Pricing Option as " + pricingOption + "and pay as residual reissue");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on check-in for the passenger after adding baggage")
    public void iClickOnCheckInForThePassengerAfterAddingBaggage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on check-in for the passenger after adding baggage");
            maeGUI.passengerCheckInAfterAddingBaggage(logInfo);
            logInfo.pass("I click on check-in for the passenger after adding baggage");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I store the baggage count")
    public void iStoreTheBaggageCount() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I store the baggage count in Check-in page");
            maeGUI.storeBaggageCount(logInfo);
            logInfo.pass("I store the baggage count in Check-in page");
            logInfo.addScreenCaptureFromBase64String(getBase64(maeGUI.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I click and view the Tickets tab for residual emd refund")
    public void iClickAndViewTheTicketsTabForResidualEmdRefund() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click and view the Tickets tab for residual emd refund");
            maeGUI.clickTicketsTabForResidualEMDRefund(logInfo);
            logInfo.pass("I click and view the Tickets tab for residual emd refund");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I click and view the Tickets tab after refund")
    public void iClickAndViewTheTicketsTabAfterRefund() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click and view the Tickets tab after refund");
            maeGUI.clickTicketsTabAfterRefund(logInfo);
            logInfo.pass("I click and view the Tickets tab after refund");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform voluntary refund")
    public void iPerformVoluntaryRefund() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform voluntary refund");
            maeGUI.voluntaryRefund(logInfo);
            logInfo.pass("I perform voluntary refund");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

}






