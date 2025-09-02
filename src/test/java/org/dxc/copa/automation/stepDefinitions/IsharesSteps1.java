package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;

public class IsharesSteps1 extends StepManager {

    ExtentTest logInfo = null;

    @And("I navigate to Shares Application")
    public void i_navigate_to_Shares_application() {
        System.out.println("Given - Launch Application");

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "Application is launched in the browser");
            isharesPage1.sharesnavigateUrl();
            logInfo.pass("Shares Application is launched in the browser");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter valid shares credentials")
    public void i_enter_valid_shares_credentials() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I enter valid credentials to login to ishares");
            isharesPage1.shareslogin(logInfo);
            logInfo.pass("I enter valid credentials");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
        System.out.println("User logged in with valid credentials..");
    }

    @And("I click on the shares Login Button")
    public void i_click_on_the_shares_login_button() {
        System.out.println("Click shares Login Button");

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on the Login Button");
            isharesPage1.sharesloginSubmit();
            logInfo.pass("I click on the Login Button");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I click on terminal emulation")
    public void iClickOnTerminalEmulation() {
        System.out.println("Validate Login: ");

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on terminal emulation");
            isharesPage1.clickTerminalEmulator(logInfo);
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @Then("I enter login and sign in commands area")
    public void i_enter_login_and_sign_in_commands_area() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I log and sign in to the script");

            isharesPage1.logAndSignIn(logInfo);

            logInfo.pass("I log and sign in to the script");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }


    }

    @And("I change the POS to {string}")
    public void i_change_the_POS_to(String pos) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change POS");
            isharesPage1.changePos(logInfo,pos);
            logInfo.pass("I change POS to" +pos);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add SU duty code for POS {string}")
    public void I_add_SU_duty_code_for_POS(String pos) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add SU duty code for POS");
            isharesPage1.changeSuDutyCode(logInfo,pos);
            logInfo.pass("I add SU duty code for POS " +pos);
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }


    }

    @Then("I Assign Controlling Agent {string} in ishares")
    public void iAssignControllingAgentInIshares(String Origincity) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Assign Controlling Agent in ishares");
            isharesPage1.assignContollingAgent(logInfo,Origincity);
            logInfo.pass("I Assign Controlling Agent in ishares");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }
    @Then("I restrict flight {string} for date {string} from origin {string}")
    public void iRestrictFlightForDateFromOrigin(String FlightNo, String date,String Origincity) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I restrict the flight");
            isharesPage1.restrictFlight(logInfo,FlightNo,date,Origincity);
            logInfo.pass("I restrict the flight");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I switch back to default copa window")
    public void iSwitchBackToDefaultCopaWindow(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I switch back to COPA application tab");
            isharesPage1.navigateToCOPA(logInfo);
            logInfo.pass("Switching to COPA tab");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I search for flight availability {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_flight_availability(String Origin,String Destination,String date,String Totalpax,String COS, String Airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailability(logInfo,Origin,Destination,date,Totalpax,COS,Airline);
            logInfo.pass("I search for flight availability first segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }



    @And("I add second segment {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_second_flight_availability(String Origin,String Destination,String date,String Totalpax,String COS, String Airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for second segment");
            isharesPage1.searchavailabilityForSegTwo(logInfo,Origin,Destination,date,Totalpax,COS,Airline);
            logInfo.pass("I search for flight availability second segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add third segment {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_third_flight_availbility(String Origin,String Destination,String date,String Totalpax,String COS, String Airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for third segment");
            isharesPage1.searchavailabilityForSegThree(logInfo,Origin,Destination,date,Totalpax,COS,Airline);
            logInfo.pass("I search for flight availability third segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add fourth segment {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_fourth_flight_availbility(String Origin,String Destination,String date,String Totalpax,String COS, String Airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for fourth segment");
            isharesPage1.searchavailabilityForSegFour(logInfo,Origin,Destination,date,Totalpax,COS,Airline);
            logInfo.pass("I search for flight availability fourth segment fourth segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I search for flight availability for special PNR type {string} {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_flight_availability_for_special_PNR(String PnrType,String Origin,String Destination,String date,String Totalpax,String COS,String airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilitySpecialPnr(logInfo,PnrType,Origin,Destination,date,Totalpax,COS,airline);
            logInfo.pass("I search for flight availability");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I search for return flight availability for special PNR type {string} {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_return_flight_availability_for_special_PNR(String PNRType,String Origin,String Destination,String date,String Totalpax,String COS,String airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for return flight availability");
            isharesPage1.searchavailabilityreturnSpecialPnr(logInfo,PNRType,Origin,Destination,date,Totalpax,COS,airline);
            logInfo.pass("I search return for flight availability");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I search for third flight availability for special PNR type {string} {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_third_flight_availability_for_special_PNR(String PNRType,String Origin,String Destination,String date,String Totalpax,String COS,String airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for third flight availability");
            isharesPage1.searchavailabilityThirdSegSpecialPnr(logInfo,PNRType,Origin,Destination,date,Totalpax,COS,airline);
            logInfo.pass("I search third for flight availability");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details {string} {string} {string} and {string} {string}")
    public void i_enter_passenger_details(String paxtype1,String paxtype2,String paxtype3,String paxtype4,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[4];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;
            paxlist[3]=paxtype4;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details for single pax {string}")
    public void i_enter_passenger_details_for_single_pax(String paxtype1) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");
            String[] paxlist = new String[1];
            paxlist[0]=paxtype1;
            isharesPage1.enterPassengerDetails(logInfo,paxlist);
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details for single pax {string} {string}")
    public void i_enter_passenger_details_for_single_pax(String paxtype1,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[1];
            paxlist[0]=paxtype1;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }else{
                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter passenger details for group PNR for 10pax {string}")
    public void iEnterPassengerDetailsForGroupPNRFor8pax(String paxtype1) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[10]; //Here we are taking all adults so taking only one pax type from feature
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype1;
            paxlist[2]=paxtype1;
            paxlist[3]=paxtype1;
            paxlist[4]=paxtype1;
            paxlist[5]=paxtype1;
            paxlist[6]=paxtype1;
            paxlist[7]=paxtype1;
            paxlist[8]=paxtype1;
            paxlist[9]=paxtype1;

            isharesPage1.enterPassengerDetails(logInfo,paxlist);
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details for group PNR for 9pax {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailsForGroupPNRFor8pax(String paxtype1,String PaxType2,String PaxType3,String PaxType4,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[9];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype1;
            paxlist[2]=paxtype1;
            paxlist[3]=PaxType2;
            paxlist[4]=PaxType2;
            paxlist[5]=PaxType3;
            paxlist[6]=PaxType3;
            paxlist[7]=PaxType4;
            paxlist[8]=PaxType4;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger detail for single pax {string} {string}")
    public void iEnterPassengerDetailForSinglePax(String paxtype1,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[1];
            paxlist[0]=paxtype1;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details for two passengers {string} {string} {string}")
    public void iEnterPassengerDetailFortwoPax(String paxtype1,String paxtype2,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[2];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter passenger details for five passengers {string} {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailForFivePax(String paxtype1,String paxtype2,String paxtype3,String paxtype4,String paxtype5,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[5];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;
            paxlist[3]=paxtype4;
            paxlist[4]=paxtype5;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter passenger details for three passengers {string} {string} {string} {string}")
    public void iEnterPassengerDetailForThreePax(String paxtype1,String paxtype2,String paxtype3,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[3];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details for six passengers {string} {string} {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailForSixPax(String paxtype1,String paxtype2,String paxtype3,String paxtype4,String paxtype5,String paxtype6,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[6];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;
            paxlist[3]=paxtype4;
            paxlist[4]=paxtype5;
            paxlist[5]=paxtype6;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter phone details to all pax")
    public void i_enter_phone_details_to_all_pax(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter phone details");
            System.out.println("I enter phone details");

            isharesPage1.enterPhoneDetails(logInfo);
            logInfo.pass("I enter phone details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I save the transaction")
    public void i_save_the_transaction(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save transaction");
            System.out.println("I save transaction");

            isharesPage1.saveTransaction(logInfo);
            logInfo.pass("I save transaction");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I have given ticketing command")
    public void i_have_given_ticketing_command(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I given ticketing command");
            System.out.println("I given ticketing command");

            isharesPage1.ticketCommand(logInfo);
            logInfo.pass("I given ticketing command");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I save and retrieve the pnr {string} to {string}")
    public void i_save_and_retrieve_the_pnr(String origin, String destination){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save and retrieve the pnr");
            System.out.println("I save and retrieve the pnr");

            isharesPage1.saveAndRetrieve(logInfo,origin,destination);
            logInfo.pass("I save and retrieve the pnr");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I capture order id and captured in variable")
    public void iCaptureOrderIdAndCapturedInVariable(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture order id and captured in variable");
            System.out.println("I capture order id and captured in variable");

            isharesPage1.captureOrderIdToVariable(logInfo);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I rollback captured order id and captured in variable")
    public void iRollbackCaptureOrderIdAndCapturedInVariable(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rollback captured order id and captured in variable");
            System.out.println("I rollback captured order id and captured in variable");

            isharesPage1.rollBackCaptureOrderIdToVariable(logInfo);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I navigate to native shares and search for availability {string} and {string} after 340 days {string}")
    public void iNavigateToNativeSharesAndSearchForAvailabilityAfter340Days(String origin, String destination,String date){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to native shares and search for availability");
            isharesPage1.searchAvailabilityNativeShares(logInfo,origin,destination,date);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate no flights displayed after 340 days in native shares")
    public void iValidateNoFlightsDisplayedAfter340DaysInNativeShares(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate no flights displayed after 340 days in native shares");
            isharesPage1.ValidateErrorMessageNativeShares();
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I click on Cancel button in native shares")
    public void iClickOnCancelButtonInNativeShares(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Cancel button in native shares");
            isharesPage1.cancelNativeShares(logInfo);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I add Group name to the PNR {string}")
    public void iAddGroupNameToThePNR(String totalpax){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Group name to the PNR");
            isharesPage1.addGroupname(logInfo,totalpax);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I open copa application in other window to retrieve PNR")
    public void iOpenCopaApplicationInOtherWindowToRetrievePNR(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open copa application in other window to retrieve PNR");
            isharesPage1.openNewCopaWindow(logInfo);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @When("I enter valid credentials shares")
    public void i_enter_valid_credentials_shares() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I enter valid credentials");
            isharesPage1.login();
            logInfo.pass("I enter valid credentials");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
        System.out.println("User logged in with valid credentials..");
    }

    @When("I click native shares to retrieve PNR and validated")
    public void iClickNativeSharesToRetrievePNR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I click native shares to retrieve PNR");
            isharesPage1.retrievePNRNativeShares(logInfo);
            logInfo.pass("I click native shares to retrieve PNR");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter specific passenger details {string} {string} for FQTV pax {string} {string}")
    public void i_enter_specific_passenger_details(String Fname,String Lname,String FFPax,String FFnumber) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            isharesPage1.enterSpecificPassengerDetails(logInfo,Fname,Lname,FFPax,FFnumber);
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I select flifo search in checkin page entered flight details {string} and {string}")
    public void iSelectFlifoSearchInCheckinPageEnteredFlightDetails(String origin,String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select flifo search in checkin page entered flight details");

            isharesPage1.flifoSearch(logInfo,origin,destination);
            logInfo.pass("I select flifo search in checkin page entered flight details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I select flifo search in checkin page entered flight details")
    public void iSelectFlifoSearchInCheckinPageEnteredFlightDetails() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select flifo search in checkin page entered flight details");

            isharesPage1.flifoSearch(logInfo);
            logInfo.pass("I select flifo search in checkin page entered flight details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I navigate to native shares and search for flifo")
    public void iNavigateToNativeSharesAndSearchForFlifo() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I flifo search in native shares");

            isharesPage1.flifoSearchNativeShares(logInfo);
            logInfo.pass("I select flifo search in checkin page entered flight details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I have done fare quote for the pnr totalpax for paymentType {string}")
    public void iHaveDoneFareQuoteForThePnr(String paymentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done fare quote for the pnr");

            isharesPage1.addAutoFareQuote(logInfo,paymentType);
            logInfo.pass("I have done fare quote for the pnr");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I have done manual fare quote for the pnr totalpax {string}")
    public void iHaveDoneManuaFareQuoteForThePnr(String PaymentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done manual fare quote for the pnr");
            isharesPage1.addManualFareQuote(logInfo,PaymentType);
            logInfo.pass("I have done fare quote for the pnr");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make the payment in ishares by selecting the payment type as {string}")
    public void iMakeThePaymentInIsharesBySelectingThePaymentTypeAs(String PaymentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the payment in ishares by selecting the payment type" +PaymentType);

            isharesPage1.makePayment(logInfo,PaymentType);
            logInfo.pass("I make the payment in ishares by selecting the payment type as " +PaymentType);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make first segment as flown")
    public void iMakeFirstSegmentAsFlown() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make first segment as flown");

            isharesPage1.makeSegmentFlown(logInfo);
            logInfo.pass("I make first segment as flown");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I do the checkin of Shares PNR from {string} for {string} pax")
    public void checkin_of_Shares_PNR(String origincty,String paxcount) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");

            isharesPage1.sharesCheckin(logInfo,paxcount,origincty);
            logInfo.pass("I do the checkin of passengers");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I do the checkin of Shares PNR from {string} for {string} pax for multiple items")
    public void checkin_of_Shares_PNR_Multiple_Items(String origincty,String paxcount) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR for multiple items");

            isharesPage1.sharesCheckinFQTV(logInfo,paxcount,origincty);
            logInfo.pass("I do the checkin of passengers");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I do the checkin of Shares PNR with baggage from {string} for {string} pax with totalbags {string} of weight {string} and {string}")
    public void checkin_of_Shares_PNR_With_Baggage(String origincty,String paxcount,String totalBag,String Weight,String checkinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");

            isharesPage1.sharesCheckinTypes(logInfo,paxcount,origincty,totalBag,Weight,checkinType);
            logInfo.pass("I do the checkin of passengers");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I do check for the passenegrs with same names from {string} for {string}")
    public void checkin_of_Shares_PNR_With_Baggage(String origincity,String paxcount) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");

            isharesPage1.checkinPaxWithSameName(logInfo,origincity,paxcount);
            logInfo.pass("I do the checkin of passengers");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Given("Shares Application is launched in the browser")
    public void application_is_launched_in_the_browser() {
        System.out.println("Given - Launch Shares Application");

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "Shares Application is launched in the browser");
            isharesPage1.navigateUrl(logInfo);
            logInfo.pass("Shares Application is launched in the browser");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the PNR to validate APIS data")
    public void validateAPISdata() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve PNR to validate APIS data");

            isharesPage1.validateAPISData(logInfo);
            logInfo.pass("I validate APIS DATA");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate advanced passenger information for {string} pax")
    public void validateAdvancePaxInfo(String paxcount) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate advanced passenger information  of all the pax");

            isharesPage1.advancePaxInfo(logInfo,paxcount);
            logInfo.pass("I have validated advanced passenger information  of all the pax");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I logout from Shares application")
    public void logoutSHares() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I logout from Shares application");
            isharesPage1.logoutSHares(logInfo);
            logInfo.pass("I logout from Shares application");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate and save the ticket number for segment {string} and pax {string}")
    public void iValidateAndSaveTheTicketNumber(String totalSegments,String totalPax) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate and save the ticket number");

            isharesPage1.retrieveAndSaveTicket(logInfo,totalSegments,totalPax);
            logInfo.pass("I validate and save the ticket number");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make reissue with even exchange for connecting seg {string} and {string} and totalpax {string} from {string} to {string} on {string} {string} {string}")
    public void iMakeEvenExchangeReissue(String segSequence,String TotalSeg, String TotalPax, String origin,String destination,String date,String COS,String airline) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make even exchange reissue");

            isharesPage1.evenExchange(logInfo,segSequence,TotalSeg,TotalPax,origin,destination,date,COS,airline);
            logInfo.pass("I make even exchange reissue");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make reissue with even exchange for connecting seg {string}")
    public void iMakeEvenExchangeReissue(String segSequence) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make even exchange reissue");

            isharesPage1.evenExchange(logInfo,segSequence);
            logInfo.pass("I make even exchange reissue");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make reissue with uneven exchange {string} and {string}")
    public void iMakeUnEvenExchangeReissue(String segSequence,String RefundType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make uneven exchange reissue");

            isharesPage1.unEvenExchange(logInfo,segSequence,RefundType);
            logInfo.pass("I make uneven exchange reissue");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make adjust on ETKT coupon {string} for segment {string}")
    public void iMakeAdjustOnETKT(String AdjustType,String SegSequence) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make adjust on ETKT coupon " + AdjustType);

            isharesPage1.adjustSegment(logInfo,AdjustType,SegSequence);
            logInfo.pass("I make adjust on ETKT coupon " + AdjustType);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make adjust on ETKT coupon via {string} Irregular Exchange Reaccomodation {string}")
    public void iMakeAdjustOnETKTIrregularExchange(String AdjustType,String Destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I make adjust on ETKT coupon Irregular Exchange Reaccomodation " + AdjustType);

            isharesPage1.adjustSegmentIrregularExchange(logInfo,AdjustType,Destination);
            logInfo.pass(" I make adjust on ETKT coupon Irregular Exchange Reaccomodation " + AdjustType);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I manual quote the fare for the pax")
    public void I_manual_quote_the_fare_for_the_pax(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I manual quote the fare for the pax");
            isharesPage1.manualQuote(logInfo);
            logInfo.pass("I manual quote the fare for the pax");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I change the status of the segments to {string} {string} and totalpax {string}")
    public void iChangeTheStatusOfTheSegments(String totalseg, String totalpax, String status){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the status of the segments");
            isharesPage1.changeSegStatus(logInfo,totalseg,totalpax,status);
            logInfo.pass("I change the status of the segments");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I check the status of the segments {string} in GUI")
    public void iCheckTheStatusOfTheSegments(String status){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check the status of the segments");
            isharesPage1.validateSegStatusInGUI(logInfo,status);
            logInfo.pass("I check the status of the segments");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I navigate to native shares and retrieve the PNR to check status {string}")
    public void iNnavigateToNativeSharesAndRetrieveThePNRToCheckHistory(String status){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to native shares and retrieve the PNR to check history");
            isharesPage1.retrievePNRNativeShares(logInfo,status);
            logInfo.pass("I navigate to native shares and retrieve the PNR to check status");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I display the list of passengers {string}")
    public void iDisplayTheListOfPassengers(String POS){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display the list of passengers");
            isharesPage1.displayPaxInList(logInfo,POS);
            logInfo.pass("I display the list of passengers");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I assign baggage printer")
    public void iAssignBaggagePrinter(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign baggage printer");
            isharesPage1.BaggagePrinter(logInfo);
            logInfo.pass("I assign baggage printer");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I replace the seat after check in")
    public void iReplaceTheSeatAfterCheckIn(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I replace the seat after check in");
            isharesPage1.changeTheSeatAfterCheckIn(logInfo);
            logInfo.pass("I replace the seat after check in");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I perform PNIS validation")
    public void iPerformPNISValidation(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform PNIS Validation");
            isharesPage1.verifyPNIS(logInfo);
            logInfo.pass("I perform PNIS Validation");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter passenger details multiple surnames for two pax {string} and {string} for {string}")
    public void i_enter_passenger_details_multiple_surnames(String paxtype1,String paxtype2,String CheckinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");
            String[] paxlist = new String[2];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;

            if(CheckinType.contains("Shares")) {
                isharesPage1.enterMultiSurnamesPassengerDetails_Shares(logInfo, paxlist);
            }
            logInfo.pass("I enter passenger details");
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I ignore the transaction")
    public void iIgnoreTheTransaction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I ignore the transaction");
            System.out.println("I ignore the transaction");
            isharesPage1.ignoreTRNS(logInfo);
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I modified baggage details for checked in pax for weight {string} totalbag {string}")
    public void iModifiedBaggageDetailsForCheckedInPax(String weight,String TotalBags) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I modified baggage details for checked in pax");
            System.out.println("I modified baggage details for checked in pax");
            isharesPage1.modifyBaggageDetails(logInfo,weight,TotalBags);
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I end and retrive the pnr")
    public void iSaveAndRetriveTheTransaction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I  end and retrive the transaction");
            System.out.println("I end and retrive the transaction");
            isharesPage1.setEndAndretrieve();
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }


    /**********************/

    @And("I enter passenger details multiple surnames {string} {string} {string} and {string} for {string}")
    public void i_enter_passenger_details_multiple_surnames(String paxtype1,String paxtype2,String paxtype3,String paxtype4,String CheckinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");
            String[] paxlist = new String[4];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;
            paxlist[3]=paxtype4;
            if(CheckinType.contains("Shares")) {
                isharesPage1.enterMultiSurnamesPassengerDetails_Shares(logInfo, paxlist);
            }
            logInfo.pass("I enter passenger details");
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Tools Menu")
    public void I_click_on_Tools_Menu(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Tools Menu");
            isharesPage1.clickOnToolsMenu(logInfo);
            logInfo.pass("I click on Tools Menu");
            

        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I click on Native Shares")
    public void I_click_on_Native_Shares(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Native Shares");
            isharesPage1.clickonNativeShares(logInfo);
            logInfo.pass("I save the details and display the PNR");
            

        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I click on Text Area to pass the commands")
    public void I_click_on_Text_Area_to_pass_the_commands(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Text Area to pass the commands");
            isharesPage1.nativeSharesTextArea(logInfo);
            logInfo.pass("I click on Text Area to pass the commands");
            

        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I search for flights from {string} to {string} on {string} for {string} in {string} through NativeShares for {string} flights")

    public void I_search_for_flights_from_Origin_to_Destination_on_DepartureDate_for_NoofPax_in_ClassOfService_through_NativeShares_for_flights(String Origin, String Destination, String DepartureDate, String NoofPax, String ClassOfService, String Airline){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight");
            isharesPage1.searchavailabilityNativeShares(logInfo, Origin, Destination, DepartureDate, NoofPax, ClassOfService, Airline);
            logInfo.pass("I search for flight");
            

        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter the passenger details for {string}")
    public void I_enter_the_passenger_details_for(String PaxType1){

        try{
            String paxtype[] = new String[1];
            paxtype[0] = PaxType1;

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the passenger details");
            isharesPage1.enterPassengerDetailsNativeShares(logInfo, paxtype);
            logInfo.pass("I enter the passenger details");
            

        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter the passenger phone details for {string}")
    public void I_enter_the_passenger_phone_details_for(String POS){

        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the passenger phone details");
            isharesPage1.phoneDetailsNativeShares(logInfo, POS);
            logInfo.pass("I enter the passenger details");
            

        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I save the details of the passenger")
    public void I_save_the_details_of_the_passenger(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save the details of the passenger");
            isharesPage1.saveDetailsNativeShares(logInfo);
            isharesPage1.saveGivenDetailsNativeShares(logInfo);
            logInfo.pass("I save the details");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I end and retrieve the PNR in Native shares")
    public void I_end_and_retrieve_the_PNR_in_Native_shares(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I end and retrieve the PNR");
            isharesPage1.endAndRetrieveInNativeShares(logInfo);
            logInfo.pass("I end and retrieve the PNR in Native shares");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I search for specific flight from {string} to {string} on {string} for {string} in {string} for {string} flights")
    public void And_I_search_for_specific_flight_from_Origin_to_Destination_on_DepartureDate_for_NoofPax_in_ClassOfService_for_Airline_flights(String Origin, String Destination, String DepartureDate, String NoofPax, String ClassOfService, String Airline){

        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check for the availability of flight");
            String index = "1";
            int Index = Integer.parseInt(index);
            isharesPage1.searchavailabilityForSpecificFlight(logInfo, Origin, Destination, DepartureDate, NoofPax, ClassOfService, Airline, Index);
            logInfo.pass("I search for specific flights from " + Origin + "to " + Destination + "on " + DepartureDate + "for " + NoofPax + "in " + ClassOfService);
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I do the checkin of Shares PNR from {string} for {string} pax for multiple segments")
    public void checkin_of_Shares_PNR_for_multiple_segments(String origincty,String paxcount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR for multiple segments");
            isharesPage1.sharesCheckinMultipleSegments(logInfo,paxcount,origincty);
            logInfo.pass("I do the checkin of passengers for multiple segments");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @Then("I restrict flight for date {string} from origin {string}")
    public void iRestrictFlightForDateFromOrigin(String date,String Origincity) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I restrict the flight");
            isharesPage1.restrictFlight1(logInfo,date,Origincity);
            logInfo.pass("I restrict the flight");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I do reconciliation of the flight {string}")
    public void I_do_reconciliation_of_the_flight(String POS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do reconciliation of the flight");
            isharesPage1.reconciliationOfFlight(logInfo, POS);
            logInfo.pass("I do reconciliation of the flight");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I check the unreconciliation status {string}")
    public void I_check_the_unreconciliation_status(String POS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check the unreconciliation status");
            isharesPage1.unReconciliationStatus(logInfo, POS);
            logInfo.pass("I check the unreconciliation status");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I check the inbound connections {string}")
    public void I_check_the_inbound_connections(String POS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check the inbound connections");
            isharesPage1.checkInboundConnections(logInfo, POS);
            logInfo.pass("I check the inbound connections");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I close the flight {string}")
    public void I_close_the_flight(String POS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I close the flight");
            isharesPage1.closeTheFlight(logInfo, POS);
            logInfo.pass("I close the flight");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run Post departure process on the flight for {string}")
    public void I_run_Post_departure_process_on_the_flight_for(String POS){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run Post departure process on the flight");
            isharesPage1.postDepartureProcess(logInfo, POS);
            logInfo.pass("I run Post departure process on the flight");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I validate the coupon control status")
    public void I_validate_the_coupon_control_status() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the coupon control status");
            isharesPage1.validateCouponControlStatus(logInfo);
            logInfo.pass("I validate the coupon control status");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I remove the seat after check in")
    public void iRemoveTheSeatAfterCheckIn(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove the seat after check in");
            isharesPage1.removeTheSeatAfterCheckIn(logInfo);
            logInfo.pass("I remove the seat after check in");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I turn on AQQ")
    public void I_turn_on_AQQ() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I turn on AQQ");
            isharesPage1.turnOnAQQ(logInfo);
            logInfo.pass("I turn on AQQ");
            

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }
    @And("I turn off AQQ")
    public void I_turn_off_AQQ() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I turn off AQQ");
            isharesPage1.turnOffAQQ(logInfo);
            logInfo.pass("I turn off AQQ");
            

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I do the checkin of Shares PNR with baggage for specific origin from {string} for {string} pax with totalbags {string} of weight {string} and {string}")
    public void checkin_of_Shares_PNR_With_Baggage_for_Specific_Origin(String origincty, String paxcount, String totalBag, String Weight, String checkinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");

            isharesPage1.sharesCheckinTypesForSpecificOrigin(logInfo, paxcount, origincty, totalBag, Weight, checkinType);
            logInfo.pass("I do the checkin of passengers");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @Then("I check the status of the flight to bypass and restricted the flight for {string}")
    public void iCheckTheStatusOfTheFlightToBypass(String startDate) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check the status of the flight to bypass");

            isharesPage1.checkStatusOfTheFlight(logInfo,startDate);
            logInfo.pass("I check the status of the flight to bypass");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }


    }


    @Then("I check inbound connections of the flight")
    public void iCheckInboundConnectionsOfTheFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check inbound connections of the flight");
            isharesPage1.checkInboundFlights(logInfo);
            logInfo.pass("I check inbound connections of the flight");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I bypass the flight")
    public void iBypassTheFlight() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I bypass the flight");

            isharesPage1.iByPassTheFlights(logInfo);
            logInfo.pass("I bypass the flight");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I cancel the flight")
    public void iCancelTheFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I cancel the flight");
            isharesPage1.cancelFlight(logInfo);
            logInfo.pass("I cancel the flight");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I retrieve the pnr in ishares and validate apis data")
    public void iRetrieveThePnrInIsharesAndValidateApisData() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the pnr in ishares and validate apis data");
            isharesPage1.retrievePNR(logInfo);
            logInfo.pass("I retrieve the pnr in ishares and validate apis data");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @Then("I delete the APIS details from Ishares for {string}")
    public void iDeleteTheAPISDetailsFromIshares(String POS) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the APIS details from Ishares");
            isharesPage1.DeleteAPIS(logInfo,POS);
            logInfo.pass("I delete the APIS details from Ishares");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }


    @Then("I open connecting segment flight for {string}")
    public void iOpenConnectionSegmentFlight(String POS) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open connecting segment flight");
            isharesPage1.openConnectingFlight(logInfo,POS);
            logInfo.pass("I open connecting segment flight");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I validate the Native Shares page")
    public void I_validate_the_Native_Shares_page() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the Native Shares page");
            isharesPage1.nativeisharesPageValidation(logInfo);
            logInfo.pass("I validate the Native Shares page");
            

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I search for flights from {string} to {string} on {string} through NativeShares")

    public void I_search_for_flights_from_Origin_to_Destination_on_DepartureDate_through_NativeShares(String Origin, String Destination, String DepartureDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight");
            isharesPage1.flightSearchNativeShares(logInfo, Origin, Destination, DepartureDate);
            logInfo.pass("I search for flight");
            

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I retrieve the PNR in iShares")
    public void I_retrieve_the_PNR_in_iShares() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the PNR in iShares");

            isharesPage1.retrievePNRInShares(logInfo);
            logInfo.pass("I retrieve the PNR in iShares");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the coupon status of AV flight through shares")
    public void I_change_the_coupon_status_of_AV_flight_through_shares() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the coupon status of AV flight through shares");

            isharesPage1.changeCouponStatusOfAVFltThroughShares(logInfo);
            logInfo.pass("I change the coupon status of AV flight through shares");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I open the flight")
    public void iOpenFlight() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open the flight");
            isharesPage1.openFlight(logInfo);
            logInfo.pass("I open flight");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I do held seat for the passenger on {string} for {string}")
    public void I_do_held_seat_for_the_passenger(String departureDate, String POS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do held seat for the passenger");

            isharesPage1.heldSeat(logInfo, departureDate, POS);
            logInfo.pass("I do held seat for the passenger");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate the coupon control status post departure")
    public void i_validate_the_coupon_control_status_post_departure() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the coupon control status post departure");
            isharesPage1.couponControlStatusPostDeparture(logInfo);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the coupon control status post departure");
    }

    @And("I validate the coupon control OPEN status for AV flight in native shares")
    public void i_validate_the_coupon_control_open_status_for_AV_flight_in_native_shares() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the coupon control OPEN status for AV flight");
            isharesPage1.couponControlOpenStatusAVFlightNativeShares(logInfo);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the coupon control OPEN status for AV flight");
    }

    @And("I validate the visa information is displayed in destination location")
    public void iValidateTheVisaInformationIsDisplayedInDestinationLocation() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the visa information is displayed in destination location");
            isharesPage1.validateVisaInDestinationLocation(logInfo);
            
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the coupon control OPEN status for AV flight");
    }

    @And("I enter passenger details for two non revenue passengers {string} {string} {string} {string}")
    public void iEnterPassengerDetailsForTwoNonRevenuePassenger(String PaxType1, String PaxType2,String PaxCode1, String PaxCode2) throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details for two NRPS passenger");

            String paxtype[] = new String[2];
            paxtype[0] = PaxType1;
            paxtype[1] = PaxType2;


            String paxCode[] = new String[2];
            paxCode[0] = PaxCode1;
            paxCode[1] = PaxCode2;

            isharesPage1.enterPassengerDetailsNRPS(logInfo,paxtype,paxCode);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }

    }

    @And("I validate the coupon control OPEN status for AV flight in ticket tab")
    public void i_validate_the_coupon_control_open_status_for_AV_flight_in_ticket_tab() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the coupon control OPEN status for AV flight");
            isharesPage1.couponControlOpenStatusAVFlightTicketTab(logInfo);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the coupon control OPEN status for AV flight");
    }

    @And("I validate the coupon status of the post departed flight in tickets tab")
    public void i_validate_the_coupon_control_status_of_post_departed_flight_in_tickets_tab() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the coupon status of the post departed flight in tickets tab");
            isharesPage1.couponControlStatusPostDepartedFlightTicketsTab(logInfo);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the coupon status of the post departed flight in tickets tab");
    }

    @And("I read the flight information from excel {string}")
    public void iReadTheFlightInformationFromExcel(String TotalRowCount) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I read the flight information from excel");
            isharesPage1.readFlightData(TotalRowCount);
            logInfo.pass("I read the flight information from excel");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I open all the flights provided in the excel")
    public void iOpenAllTheFlightsProvidedInTheExcel() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open all the flights provided in the excel");
            isharesPage1.openingFlightsFromExcelData(logInfo);
            logInfo.pass("I open all the flights provided in the excel");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I read the flight information from excel sheet 2 {string}")
    public void iReadTheFlightInformationFromExcelSheet2(String TotalRowCount) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I read the flight information from excel sheet2");
            isharesPage1.readFlightData2(TotalRowCount);
            logInfo.pass("I read the flight information from excel sheet 2");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I read city {string} and country info on timatic in native shares")
    public void iReadCityAndCountryInfoOnTimaticInNativeShares(String cityLocation) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I read city and country info on timatic in native shares");
            isharesPage1.showTimatic(logInfo,cityLocation);
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter passenger details for single non revenue passenger {string} {string}")
    public void iEnterPassengerDetailsForNonRevenuePassenger(String PaxType1,String PaxCode1) throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details for non revenue passenger");

            String paxtype[] = new String[1];
            paxtype[0] = PaxType1;

            String paxCode[] = new String[1];
            paxCode[0] = PaxCode1;

            isharesPage1.enterPassengerDetailsNRPS(logInfo,paxtype,paxCode);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }

    }

    @And("I enter passenger details for four non revenue passenger {string} {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailsForFourNonRevenuePassenger(String PaxType1,String PaxType2,String PaxType3,String PaxType4,String PaxCode1,String PaxCode2) throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details for two non revenue passenger");

            String paxtype[] = new String[4];
            paxtype[0] = PaxType1;
            paxtype[1] = PaxType2;
            paxtype[2] = PaxType3;
            paxtype[3] = PaxType4;

            String paxCode[] = new String[2];
            paxCode[0] = PaxCode1;
            paxCode[1] = PaxCode2;

            isharesPage1.enterPassengerDetailsNRPS(logInfo,paxtype,paxCode);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }

    }

    @And("I validate the visa information is displayed in destination location for Seaman passport type")
    public void iValidateTheVisaInformationIsDisplayedInDestinationLocationSeaman() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the visa information is displayed in destination location for seaman passport type");
            isharesPage1.validateVisaInDestinationLocationSeaman(logInfo);
            
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the visa information is displayed in destination location for Seaman passport type");
    }

    @And("I validate the timatic information in Native shares")
    public void iValidateTheCurrencyInformationInNativeShares() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the timatic information is displayed in destination location for seaman passport type");
            isharesPage1.validateTimaticInfoNativeShares(logInfo);
            logInfo.pass("I enter command");
            
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the timatic information in Native shares");
    }

    @And("I change first segment status to CM USED")
    public void iChangeFirstSegmentStatusToCMUSED() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change frist segment status to CM USED");
            isharesPage1.changeSegStatusCMUSED(logInfo);
            logInfo.pass("I change first segment status to CM USED");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the SSR command in Native Shares for {string} for date {string}")
    public void I_run_the_SSR_command_in_Native_Shares_for_date(String SSRType, String startDate){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the SSR command in Native Shares");
            isharesPage1.runSSRCmdInNativeShares(logInfo, SSRType, startDate);
            logInfo.pass("I run the SSR command in Native Shares");
            

        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I make second segment as flown")
    public void iMakeSecondSegmentAsFlown() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make second segment as flown");
            isharesPage1.makeSecondSegmentFlown(logInfo);
            logInfo.pass("I make second segment as flown");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I make third segment as flown")
    public void iMakeThirdSegmentAsFlown() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make third segment as flown");

            isharesPage1.makeThirdSegmentFlown(logInfo);
            logInfo.pass("I make third segment as flown");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate the details shown in Native Shares")
    public void I_validate_the_details_shown_in_Native_Shares(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the details shown in Native Shares");
            isharesPage1.nativeSharesResponseSSR(logInfo);
            logInfo.pass("I validate the details shown in Native Shares");
            

        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I change second segment status to VOIDED")
    public void iChangeSecondSegmentStatusToVOIDED() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change second segment status to VOIDED");
            isharesPage1.changeSecondSegStatusVOIDED(logInfo);
            logInfo.pass("I change second segment status to VOIDED");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the coupon control VOID status in ticket tab")
    public void i_validate_the_coupon_control_VOID_status_in_ticket_tab() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the coupon control VOID status in ticket tab");
            isharesPage1.couponControlVoidStatusTicketTab(logInfo);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the coupon control VOID status in ticket tab");
    }

    @And("I give commands to add FQTR number to passengers")
    public void igiveCommandsToAddFQTRNumberToPassengers(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I give commands to add FQTR number to passengers");
            System.out.println("I give commands to add FQTR number to passengers");

            isharesPage1.addingFQTRNumbersToPassengers(logInfo);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I validate the presence of Inf SSR")
    public void I_validate_the_presence_of_Inf_SSR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the presence of Inf SSR");

            isharesPage1.validateThePresenceOfInfSSR(logInfo);
            logInfo.pass("I validate the presence of Inf SSR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate CM USED status in Native Shares")
    public void validateCMUSEDstatusInNativeShares() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate CM USED status in Native Shares");
            isharesPage1.validateCMUsedStatusInNativeShares(logInfo);
            logInfo.pass("I validate CM USED status in Native Shares");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

   /* @And("I validate CM USED status in tickets tab")
    public void i_validate_CM_USED_status_in_tickets_tab() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate CM USED status in tickets tab");
            paymentPage.validateCMUSEDInTicketsTab(logInfo);
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", paymentPage.getDriver(), logInfo, e);
            logInfo.addScreenCaptureFromPath(captureScreenShot(paymentPage.getDriver()));
        }
        System.out.println("I validate CM USED status in tickets tab");
    }*/

    @And("I do reconciliation of the flight {string} with seat on {string}")
    public void I_do_reconciliation_of_the_flight_with_seat(String POS, String StartDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do reconciliation of the flight");
            isharesPage1.reconciliationOfFlightWithSeat(logInfo, POS, StartDate);
            logInfo.pass("I do reconciliation of the flight");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter passenger details for four passengers {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailFortwoPax(String paxtype1,String paxtype2,String paxtype3,String paxtype4,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[4];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;
            paxlist[3]=paxtype4;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details multiple surnames for three pax {string} {string} and {string} for {string}")
    public void i_enter_passenger_details_multiple_Three_surnames(String paxtype1,String paxtype2,String paxtype3,String CheckinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");
            String[] paxlist = new String[3];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;

            if(CheckinType.contains("Shares")) {
                isharesPage1.enterMultiSurnamesPassengerDetails_Shares(logInfo, paxlist);
            }
            else{
                isharesPage1.enterPassengerDetailsMultiSurname(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I sent mail to all the passengers through Ishares {string}")
    public void iSentMailToAllThePassengersThroughIshares(String totalPax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I sent mail to all the passengers through Ishares");
            isharesPage1.sendMailToAllPax(logInfo,totalPax);
            logInfo.pass("I sent mail to all the passengers through Ishares");
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @When("I click native shares and changed depart time on {string} for flight {string} modified time in minutes {string}")
    public void iClickNativeSharesAndChangedDepartTime(String StartDate,String FLightNo,String DelayTime) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I click native shares and changed depart time");
            isharesPage1.modifyFlightStartTime(logInfo,StartDate,FLightNo,DelayTime);
            logInfo.pass("I click native shares and changed depart time");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I close flifo search")
    public void iCloseFlifoSearch() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I close flifo search");

            isharesPage1.closeFlifoSearch();
            logInfo.pass("I close flifo search");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @When("I validated modified flight time and status")
    public void iValidatedModifiedFlightTimeAndStatus() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I validated modified flight time");
            isharesPage1.ModifiedFlightTimeAndStatus(logInfo);
            logInfo.pass("I validated modified flight time");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @When("I validated flight time and status")
    public void iValidatedModifiedFlightStatus() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I validated modified flight status");
            isharesPage1.validateFlightTimeAndStatus(logInfo);
            logInfo.pass("I validated modified flight status");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @When("I changed Flight status to {string} on {string}")
    public void iChangedFlightStatus(String FlightStatus,String StartDate) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I changed Flight status to" + FlightStatus);
            isharesPage1.changeFlightStatus(logInfo,FlightStatus,StartDate);
            logInfo.pass("I validated modified flight status");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @When("I validate flight status {string} in flifo")
    public void iValidateFlightStatus(String FlightStatus) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I validate Flight status to " + FlightStatus);
            isharesPage1.validateFlightStatus(logInfo,FlightStatus);
            logInfo.pass("I validated modified flight status");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @When("I activate LINIATA to create new flight {string} {string}")
    public void iActivateLINIATAtoCreateNewFlight(String FlightNo,String flightNumber) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I activate LINIATA to create new flight");
            isharesPage1.setUpToCreateFlight(logInfo,FlightNo,flightNumber);
            logInfo.pass("I activate LINIATA to create new flight");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @When("I create new dupe flight {string} {string} {string}")
    public void iCreateNewDupeFlight(String FlightNo,String BookDate,String EndDate) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I activate LINIATA to create new flight");
            isharesPage1.selectFrequencyToCreateFlight(logInfo,FlightNo,BookDate,EndDate);
            logInfo.pass("I activate LINIATA to create new flight");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @When("I remove flight from working reaccommodation index list {string}")
    public void iCreateNewDupeFlight(String FlightNo) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove flight from working reaccommodation index list");
            isharesPage1.removeFlightFromIndexList(logInfo,FlightNo);
            logInfo.pass("I remove flight from working reaccommodation index list" + FlightNo);
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate the visa information is displayed in destination location for Normal passport type")
    public void iValidateTheVisaInfoIsDisplayedInDestLocationNormalPassport() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the visa information is displayed in destination location for normal passport type");
            isharesPage1.validateVisaInDestinationLocationNormal(logInfo);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the visa information is displayed in destination location for normal passport type");
    }

    @And("I validate the visa information is displayed in destination location for Seaman passport type for two destinations")
    public void iValidateTheVisaInfoIsDisplayedInDestLocationSeamanFortwoDest() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the visa information is displayed in destination location for seaman passport type");
            isharesPage1.validateVisaInDestinationLocationSeamanForTwoDestinationLocation(logInfo);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the visa information is displayed in destination location for Seaman passport type");
    }


    @And("I enter commands to delete segments through shares")
    public void i_delete_segments_through_shares(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete segments through shares");
            isharesPage1.deleteSegmentsThroughIshares(logInfo);
            logInfo.pass("I delete segments through shares");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate the SSR details is added to the PNR through Native Shares")
    public void IValidateSSRDetailsInNativeShares() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the SSR details is added to the PNR through Native Shares");
            isharesPage1.validateSSRIsAddedInNativeShares(logInfo);
            logInfo.pass("I validate the SSR details is added to the PNR through Native Shares");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter passenger details for group PNR for 2pax {string}")
    public void iEnterPassengerDetailsForGroupPNRFor2pax(String paxtype1) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[2]; //Here we are taking all adults so taking only one pax type from feature
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype1;

            isharesPage1.enterPassengerDetails(logInfo,paxlist);
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I change all the segments status to {string} for the passengers {string} {string}")
    public void I_change_all_the_segments_status_to_CMUSED_for_the_passengers(String statusType,String noOfPax, String noOfSegments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change all the segments status to " + statusType + " for all the passengers");
            isharesPage1.changeSegmentsToCMUSEDForAllPax(logInfo,statusType, noOfPax, noOfSegments);
            logInfo.pass("I change all the segments status to " + statusType + "  for all the passengers");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate Segment status {string}")
    public void IValidateSegmentStatus(String statusType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate Segment status " + statusType);
            isharesPage1.verifySegmentStatus(logInfo,statusType);
            logInfo.pass("I validate Segment status");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I verify the PNR in iShares for invol")
    public void I_verify_the_PNR_in_iShares_for_Invol() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the PNR in iShares for invol");

            isharesPage1.verifyInvolInShares(logInfo);
            logInfo.pass("I verify the PNR in iShares for invol");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate passenger score {string} in Native Shares")
    public void validatePaxScoreInNativeShares(String ValidateText) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate passenger score in Native Shares");
            isharesPage1.validatePaxScoreInNativeShares(logInfo,ValidateText);
            logInfo.pass("I validate passenger score in Native Shares");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate the coupon control VOID status in iShares")
    public void i_validate_the_coupon_control_VOID_status_in_ishares() throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the coupon control VOID status in iShares");
            isharesPage1.couponControlVoidStatusIshares(logInfo);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }
        System.out.println("I validate the coupon control VOID status in iShares");
    }

    @And("I enter passenger details for group PNR for 11 pax {string}")
    public void iEnterPassengerDetailsForGroupPNRFor11pax(String paxtype1) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[11]; //Here we are taking all adults so taking only one pax type from feature
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype1;
            paxlist[2]=paxtype1;
            paxlist[3]=paxtype1;
            paxlist[4]=paxtype1;
            paxlist[5]=paxtype1;
            paxlist[6]=paxtype1;
            paxlist[7]=paxtype1;
            paxlist[8]=paxtype1;
            paxlist[9]=paxtype1;
            paxlist[10]=paxtype1;

            isharesPage1.enterPassengerDetails(logInfo,paxlist);
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I check for the LNIATA Code")
    public void iCheckForTheLNIATACode() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check for the LNIATA Code");
            isharesPage1.captureLnata(logInfo);
            logInfo.pass("I check for the LNIATA Code");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform ASA to all passengers for specific segments {string} or all segments {string}")
    public void iPerformASAToAllPassengers(String totalSegments,String AssignType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform ASA to all passengers");
            isharesPage1.performASA(logInfo,totalSegments,AssignType);
            logInfo.pass("I perform ASA to all passengers");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add ARNK segment")
    public void iAddARNKSegment() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add ARNK segment");
            isharesPage1.addARNK(logInfo);
            logInfo.pass("I add ARNK segment");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform change ASA to all passengers for specific segments {string} or all segments {string}")
    public void iPerformChangeASAToAllPassengers(String totalSegments,String AssignType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform change ASA to all passengers");
            isharesPage1.changeASA(logInfo,totalSegments,AssignType);
            logInfo.pass("I perform change ASA to all passengers");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform return availability Command")
    public void iPerformReturnAvailabilityAommand() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform return availability command");

            isharesPage1.searchReturnAvailability(logInfo);
            logInfo.pass("I perform return availability command");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details for group PNR for 6pax {string}")
    public void iEnterPassengerDetailsForGroupPNRFor6pax(String paxtype1) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[6]; //Here we are taking all adults so taking only one pax type from feature
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype1;
            paxlist[2]=paxtype1;
            paxlist[3]=paxtype1;
            paxlist[4]=paxtype1;
            paxlist[5]=paxtype1;

            isharesPage1.enterPassengerDetails(logInfo,paxlist);
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add Corporate name to the PNR {string}")
    public void iAddCorporateNameToThePNR(String totalpax){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Corporate name to the PNR");
            isharesPage1.addCorporateBooking(logInfo,totalpax);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add auxiliary segment {string}")
    public void iAddAuxiliarySegment(String SegmentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add auxiliary segment" + SegmentType);
            isharesPage1.addAuxilarySegment(logInfo, SegmentType);
            logInfo.pass("I add auxiliary segment" + SegmentType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details for eight passengers {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailForEightPax(String paxtype1,String paxtype2,String paxtype3,String paxtype4,String paxtype5,String paxtype6,String paxtype7,String paxtype8,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[8];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;
            paxlist[3]=paxtype4;
            paxlist[4]=paxtype5;
            paxlist[5]=paxtype6;
            paxlist[6]=paxtype7;
            paxlist[7]=paxtype8;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter passenger details for nine passengers {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailForNinePax(String paxtype1,String paxtype2,String paxtype3,String paxtype4,String paxtype5,String paxtype6,String paxtype7,String paxtype8,String paxtype9,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[9];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;
            paxlist[3]=paxtype4;
            paxlist[4]=paxtype5;
            paxlist[5]=paxtype6;
            paxlist[6]=paxtype7;
            paxlist[7]=paxtype8;
            paxlist[8]=paxtype9;


            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add SSR through shares for {string} and for the {string}")
    public void i_add_SSR_through_shares(String name, String COS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + name + " SSR through shares");
            isharesPage1.addSSRthroughShares(logInfo, name, COS);
            logInfo.pass("I add " + name +" SSR through shares");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I have done manual fare quote for the payment {string}")
    public void iHaveDoneManuaFareQuoteForThePayment(String PaymentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done manual fare quote for the pnr");

            isharesPage1.addManualFareQuote(logInfo,PaymentType);
            logInfo.pass("I have done fare quote for the pnr");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }
    @And("I search for flight availability for third segment for special PNR type {string} {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_third_segment_flight_availability_for_special_PNR(String PNRType,String Origin,String Destination,String date,String Totalpax,String COS,String airline){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilityForThirdSegSpecialPnr(logInfo,PNRType,Origin,Destination,date,Totalpax,COS,airline);
            logInfo.pass("I search for flight availability");
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability for fourth segment for special PNR type {string} {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_fourth_segment_flight_availability_for_special_PNR(String PNRType,String Origin,String Destination,String date,String Totalpax,String COS,String airline){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilityForFourthSegSpecialPnr(logInfo,PNRType,Origin,Destination,date,Totalpax,COS,airline);
            logInfo.pass("I search for flight availability");
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability for fifth segment for special PNR type {string} {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_fifth_segment_flight_availability_for_special_PNR(String PNRType,String Origin,String Destination,String date,String Totalpax,String COS,String airline){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilityForFifthSegSpecialPnr(logInfo,PNRType,Origin,Destination,date,Totalpax,COS,airline);
            logInfo.pass("I search for flight availability");
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I divide the pnr for pax {string}")
    public void i_divide_the_pax_for_pax(String TotalPaxToDivide) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I divide the pnr");
            isharesPage1.dividePnr(logInfo, TotalPaxToDivide);
            logInfo.pass("I divide the pnr");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I reduce the pnr for pax {string}")
    public void i_reduce_the_pax_for_pax(String PaxPositionToReduce) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I reduce the pnr");
            isharesPage1.reducePnr(logInfo, PaxPositionToReduce);
            logInfo.pass("I reduce the pnr");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter other contact details contact numbers and email entry {string}")
    public void iEnterOtherContactDetailsContactNumbersAndEmailEntry(String OriginCity){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter other contact details contact numbers and email entry");

            isharesPage1.enterOtherPaxDetails(logInfo,OriginCity);
            logInfo.pass("I enter other contact details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I rebook the segment {string} for pax {string}")
    public void iRebookTheSegment(String SegmentNumber,String rebookType){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook the segment" + rebookType);
            System.out.println("I rebook the segment");

            isharesPage1.rebookSegment(logInfo,SegmentNumber,rebookType);
            logInfo.pass("I rebook the segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add remarks to the PNR {string}")
    public void iAddRemarksToThePNR(String remarkType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " +remarkType +" remarks to the PNR");

            isharesPage1.addRemarkToPnr(logInfo,remarkType);
            logInfo.pass("I add remarks to the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I {string} remarks for board point for text {string}")
    public void iAddRemarksForBoardPoint(String remarkType,String remarkText) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I " +remarkType +" for board point");

            isharesPage1.RemarkToBoardPoint(logInfo,remarkType,remarkText);
            logInfo.pass("I " +remarkType +" for board point");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I rearrange the segments {string}")
    public void iRearrangeTheTegments(String RearrangeSegNo) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rearrange the segments");

            isharesPage1.reArrangeSegments(logInfo,RearrangeSegNo);
            logInfo.pass("I add remarks to the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate passenger details for specific entry {string}")
    public void iValidatePassengerDetailsForSpecificEntry(String ValidationType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate passenger details for specific entry" + ValidationType);

            isharesPage1.validatepaxDetails(logInfo,ValidationType);
            logInfo.pass("I validate passenger details for specific entry" +ValidationType);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I save and retrieve the pnr")
    public void i_save_and_retrieve_the_pnr() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save and retrieve the pnr");
            System.out.println("I save and retrieve the pnr");
            isharesPage1.saveAndRetrieve(logInfo);
            logInfo.pass("I save and retrieve the pnr");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I delete the two segments from the PNR")
    public void IDeleteTheTwoSegmentsFromThePNR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the two segments from the PNR");
            isharesPage1.deletingTheFirstTwoSegments(logInfo);
            logInfo.pass("I delete the two segments from the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I save the transaction and retrieve the PNR")
    public void I_save_the_transaction_and_retrieve_the_PNR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save the transaction and retrieve the PNR");
            isharesPage1.saveAndRetrieveThePNR(logInfo);
            logInfo.pass("I save the transaction and retrieve the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I change the name of the passenger for {string}")
    public void I_change_the_name_of_the_passenger_for(String PassengerType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the name of the passenger");

            isharesPage1.changeThePaxName(logInfo, PassengerType);
            logInfo.pass("I change the name of the passenger");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

        @And("I verify the passenger receipt for all the pax")
        public void iVerifyThePassengerReceiptForAllThePax() {

            try {
                logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the passenger receipt for all the pax");

                isharesPage1.verifyPaxReceiptPrint(logInfo);
                logInfo.pass("I verify the passenger receipt for all the pax");
                

            } catch (AssertionError | Exception e) {
                Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            }

    }
    @And("I verify Year of issuance in ticket number")
    public void iVerifyYearOfIssuanceInTicketNumber() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify Year of issuance in ticket number");

            isharesPage1.verifyYearInTicket(logInfo);
            logInfo.pass("I verify Year of issuance in ticket number");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform ASA to specific passenger {string} for specific segments {string} or all segments {string}")
    public void iPerformASATospecificPassenger(String totalpax,String totalSegments,String AssignType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform ASA to all passengers");
            isharesPage1.performASAForSpecificPax(logInfo,totalpax,totalSegments,AssignType);
            logInfo.pass("I perform ASA to all passengers");
            

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details for ten passengers {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailFortenPax(String paxtype1,String paxtype2,String paxtype3,String paxtype4,String paxtype5,String paxtype6,String paxtype7,String paxtype8,String paxtype9,String paxtype10,String CheckinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[9];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;
            paxlist[3]=paxtype4;
            paxlist[4]=paxtype5;
            paxlist[5]=paxtype6;
            paxlist[6]=paxtype7;
            paxlist[7]=paxtype8;
            paxlist[8]=paxtype9;
            paxlist[9]=paxtype10;

            if(CheckinType.contains("Shares")){
                isharesPage1.enterPassengerDetails_SharesCheckin(logInfo,paxlist);
            }
            else {

                isharesPage1.enterPassengerDetails(logInfo,paxlist);
            }

            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details multiple surnames for four pax {string} {string} {string} and {string} for {string}")
    public void i_enter_passenger_details_multiple_surnames_for_four_pax(String paxtype1,String paxtype2,String paxtype3,String paxtype4,String CheckinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");
            String[] paxlist = new String[4];
            paxlist[0]=paxtype1;
            paxlist[1]=paxtype2;
            paxlist[2]=paxtype3;
            paxlist[3]=paxtype4;
            if(CheckinType.contains("Shares")) {
                isharesPage1.enterMultiSurnamesPassengerDetails_Shares(logInfo, paxlist);
            }
            logInfo.pass("I enter passenger details");
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I check PNR for ETKT Eligibility")
    public void iCheckPNRForETKTEligibility() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check PNR for ETKT Eligibility");

            isharesPage1.verifyETKTEligibility(logInfo);
            logInfo.pass("I check PNR for ETKT Eligibility");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify creation of PNR and perform displaying current work file detailed work file item")
    public void iVerifyCreationOfPNRAndPerformDisplayingCurrentWorkFileDetailedWorkFileItem() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify creation of PNR and perform displaying current work file detailed work file item");

            isharesPage1.verifyWorkDetailFile(logInfo);
            logInfo.pass("I verify creation of PNR and perform displaying current work file detailed work file item");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform lowest available fare with rebook response {string}")
    public void iPerformLowestAvailableFareWithRebookResponse(String PaymentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform lowest available fare with rebook response");

            isharesPage1.performFareWithRebook(logInfo,PaymentType);
            logInfo.pass("I perform lowest available fare with rebook response");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add multiple item remark to the PNR {string}")
    public void iAddMultipleItemRemarkToThePNR(String RemarkType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add multiple item remark to the PNR  " + RemarkType);

            isharesPage1.addMultipleItemRemark(logInfo, RemarkType);
            logInfo.pass("I add multiple item remark to the PNR ");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I perform queue placement of ACI for COS {string}")
    public void iPerformQueuePlacementOfACI(String COS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add multiple item remark to the PNR " + COS);
            isharesPage1.queuePlacementForACI(logInfo, COS);
            logInfo.pass("I add multiple item remark to the PNR ");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I display the list of passengers for display type {string}")
    public void iDisplayTheListOfPassengersForDisplayType(String DisplayList) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display the list of passengers for display type");

            isharesPage1.listDisplay(logInfo,DisplayList);
            logInfo.pass("I display " + DisplayList);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }
    @And("I add message to the passenger")
    public void iAddMessageToThePassenger() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add message to the passenger");
            isharesPage1.addMessageToPax(logInfo);
            logInfo.pass("I add message to the passenger");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add message to the multiple passengers")
    public void iAddMessageToTheMultiplePassenger() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add message to the multiple passenger");

            isharesPage1.addMessageToMultiplePax(logInfo);
            logInfo.pass("I add message to the multiple passenger");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I change message to the multiple passengers")
    public void ichangeMessageToTheMultiplePassenger() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change message to the multiple passenger");

            isharesPage1.changeMessageToMultiplePax(logInfo);
            logInfo.pass("I change message to the multiple passenger");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I assign boarding pass printer")
    public void iAssignBordingPassPrinter(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign boarding pass printer");
            isharesPage1.boardingPassPrinter(logInfo);
            logInfo.pass("I assign boarding pass printer");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }


    @And("I print the boarding pass for all the passengers for {string}")
    public void iPrintBordingPass(String BoardingType){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I print the boarding pass for all the passengers");
            isharesPage1.printBoardingPass(logInfo,BoardingType);
            logInfo.pass("I print the boarding pass for all the passengers");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }


    @And("I print the boarding pass for unchecked in passengers for {string}")
    public void iPrintBordingPassForUncheckedInPax(String BoardingType){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I print the boarding pass for unchecked in passengers");
            isharesPage1.printBoardingPassForUncheckedInPax(logInfo);
            logInfo.pass("I print the boarding pass for unchecked in passengers");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }


    @And("I enter Frequent Flyer Details details {string} other passengers")
    public void i_enter_frequent_flyer_details_for_passengers(String otherPax,DataTable table) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Frequent Flyer Details details");

            System.out.println("I enter FF details into the Hashmap");
            List<String> FFnumber = new ArrayList<>();
            List<String> Fname = new ArrayList<>();
            List<String> Lname = new ArrayList<>();
            HashMap<String,String> Paxtype = new HashMap<>();
            List<Map<String, String>> rows = table.asMaps();
            for (Map<String, String> columns : rows) //each row has 2 maps
            {
                FFnumber.add(columns.get("FFNumber"));
                Fname.add(columns.get("FirstName"));
                Lname.add(columns.get("LastName"));
                Paxtype.put(columns.get("FirstName"),"Adult");
            }

            isharesPage1.AddFFNumbers(FFnumber,Fname,Lname,Paxtype,otherPax,logInfo);
            logInfo.pass("I enter passenger details");
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I {string} Onward Connecting Segment for HK Segment {string} to {string} {string} {string}")
    public void iPrintBordingPassForUncheckedInPax(String Type, String Origin,String Destination,String COS, String Airline){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I " + Type + " Onward Connecting Segment for HK Segment");
            isharesPage1.addOnwardSegment(logInfo,Type, Origin, Destination, COS,  Airline);
            logInfo.pass("I " + Type + "  Onward Connecting Segment for HK Segment");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I add booking code to the ASA table for {string} and {string}")
    public void iPrintBordingPassForUncheckedInPax(String TotalPax, String COS){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add booking code to the ASA table");
           isharesPage1.addBookingCodeToASATable(logInfo,TotalPax, COS);
            logInfo.pass("I add booking code to the ASA table");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I add item to ACI upgrade table")
    public void iAddItemToACIUpgradeTable(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add item to ACI upgrade table");
            isharesPage1.addItemToACITable(logInfo);
            logInfo.pass("I add item to ACI upgrade table");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I change the name of adult passenger {string} {string} {string} {string}")
    public void I_change_the_name_of_one_passenger(String paxType, String FName, String LName, String FFNumber) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the name of adult passenger");
            isharesPage1.changeNameOfThePax(logInfo, paxType, FName, LName, FFNumber);
            logInfo.pass("I change the name of adult passenger");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I book a segment using name space request with {string} for destination {string}")
    public void I_book_a_segment_using_name_space_request_with(String COS, String destination){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I book a segment using name space request");
            System.out.println("I book a segment using name space request");

            isharesPage1.bookASegmentUsingNameSpace(logInfo,COS,destination);
            logInfo.pass("I book a segment using name space request");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I display the ETKT PNR using {string} on {string} for {string}")
    public void I_display_the_ETKT_PNR_using(String SpecificIteneraryDetails, String departureDate, String FQTVNumber) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display the ETKT PNR");
            isharesPage1.displayTheETKTPNR(logInfo, SpecificIteneraryDetails, departureDate, FQTVNumber);
            logInfo.pass("I display the ETKT PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter passenger details for five non revenue passenger {string} {string} {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailsForFiveNonRevenuePassenger(String PaxType1,String PaxType2,String PaxType3,String PaxType4,String PaxType5,String PaxCode1,String PaxCode2) throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details for five non revenue passenger");

            String paxtype[] = new String[5];
            paxtype[0] = PaxType1;
            paxtype[1] = PaxType2;
            paxtype[2] = PaxType3;
            paxtype[3] = PaxType4;
            paxtype[4] = PaxType5;

            String paxCode[] = new String[2];
            paxCode[0] = PaxCode1;
            paxCode[1] = PaxCode2;

            isharesPage1.enterPassengerDetailsNRPS(logInfo,paxtype,paxCode);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }

    }

    @And("I enter passenger details for three non revenue passenger {string} {string} {string} {string} {string}")
    public void iEnterPassengerDetailsForFiveNonRevenuePassenger(String PaxType1,String PaxType2,String PaxType3,String PaxCode1,String PaxCode2) throws IOException {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details for three non revenue passenger");

            String paxtype[] = new String[3];
            paxtype[0] = PaxType1;
            paxtype[1] = PaxType2;
            paxtype[2] = PaxType3;

            String paxCode[] = new String[2];
            paxCode[0] = PaxCode1;
            paxCode[1] = PaxCode2;

            isharesPage1.enterPassengerDetailsNRPS(logInfo, paxtype, paxCode);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
            
        }

    }

    @And("I do the pricing for the pnr")
    public void iSelectTheSegmentsAndDoThePricingForThoseSegments(DataTable table) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the pricing for the specific requirements");

            int i = 0;
            String pricingType = null;
            String paymentType = null;
            List<String> values = new ArrayList<>();
            List<List<String>> rows = table.asLists(String.class);
            for (List<String> columns : rows)
            {
                if(i==1)
                {
                    pricingType = columns.get(1);
                    System.out.println("Pricing Type: " + pricingType);
                }
                else if (i==0)
                {
                    paymentType = columns.get(1);
                    System.out.println("Payment Type: " + paymentType);
                }

                else
                {
                    values.add(columns.get(1));
                    System.out.println("Values: " + values);
                }

                i++;
            }

            if(pricingType.equalsIgnoreCase("Segments"))
            {
                isharesPage1.selectingTheSegmentsToDoPricing(logInfo, values.get(0), values.get(1), values.get(2), paymentType);
            }
            else if(pricingType.equalsIgnoreCase("WithoutTax"))
            {
                isharesPage1.PricingWithoutTax(logInfo, paymentType);
            }
            else if(pricingType.equalsIgnoreCase("Passengers"))
            {
                isharesPage1.PricingForParticularPassengers(logInfo, values.get(0), values.get(1), values.get(2), paymentType);
            }

            logInfo.pass("I do pricing for the specific requirements");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify the ticketing remarks")
    public void I_verify_the_ticketing_remarks(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the ticketing remarks");
            System.out.println("I verify the ticketing remarks");

            isharesPage1.verifyTheTicketingRemarks(logInfo);
            logInfo.pass("I verify the ticketing remarks");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I initiate ticket agent report and reestablish link from TAR to CRT")
    public void I_initiate_ticket_agent_report_and_reestablish_link_from_TAR_to_CRT(){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "initiate ticket agent report and reestablish link from TAR to CRT");
            System.out.println("initiate ticket agent report and reestablish link from TAR to CRT");

            isharesPage1.initiateTARAndReestablishLink(logInfo);
            logInfo.pass("initiate ticket agent report and reestablish link from TAR to CRT");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I request for seat map as {string} type for {string}")
    public void I_request_for_seat_map_as_type_for(String seatMapType, String COS){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I request for a particular seat map type");
            System.out.println("I request for a particular seat map type");

            isharesPage1.requestForSeatMap(logInfo, seatMapType, COS);
            logInfo.pass("I request for a particular seat map type");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add fifth segment {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_fifth_flight_availbility(String Origin,String Destination,String date,String Totalpax,String COS, String Airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilityForSegFive(logInfo,Origin,Destination,date,Totalpax,COS,Airline);
            logInfo.pass("I search for flight availability fifth segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add sixth segment {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_sixth_flight_availbility(String Origin,String Destination,String date,String Totalpax,String COS, String Airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilityForSegSix(logInfo,Origin,Destination,date,Totalpax,COS,Airline);
            logInfo.pass("I search for flight availability sixth segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I perform the task of restrict connect checkin")
    public void I_perform_the_task_of_restrict_connect_checkin(){

        try {
            String task = "RestrictConnectCheckin";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the task of restrict connect checkin");
            System.out.println("I perform the task of restrict connect checkin");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the task of restrict connect checkin");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    } 


    @And("I perform the task of make the passenger volunteer")
    public void I_perform_the_task_of_make_the_passenger_volunteer(){

        try {
            String task = "MakeThePassengerVolunteer";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the task of make the passenger volunteer");
            System.out.println("I perform the task of make the passenger volunteer");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the task of make the passenger volunteer");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I perform the task of restore connect checkin")
    public void I_perform_the_task_of_restore_connect_checkin() {

        try {
            String task = "RestoreConnectCheckin";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the task of restore connect checkin");
            System.out.println("I perform the task of restore connect checkin");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the task of restore connect checkin");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform the action of cancelling the default flight number entries")
    public void I_perform_the_action_of_cancelling_the_default_flight_number_entries() {

        try {
            String task = "CancelDefaultFlight";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the action of cancelling the default flight number entries");
            System.out.println("I perform the action of cancelling the default flight number entries");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the action of cancelling the default flight number entries");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform the task of identifying the non revenue no meal passenger entries")
    public void I_perform_the_task_of_identifying_the_non_revenue_no_meal_passenger_entries() {

        try {
            String task = "IdentifyNRNoMealPax";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the task of identifying the non revenue no meal passenger entries");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the task of identifying the non revenue no meal passenger entries");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I display the flight maintenance status entries")
    public void I_display_the_flight_maintenance_status_entries() {

        try {
            String task = "DisplayFltMaintenanceStatusEntries";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display the flight maintenance status entries");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I display the flight maintenance status entries");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I do the mass transfer for all the passengers")
    public void I_do_the_mass_transfer_for_all_the_passengers() {
        try {
            String task = "MassTransfer";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the mass transfer for all the passengers");
            System.out.println("I do the mass transfer for all the passengers");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I store details of the first segment flight and date")
    public void I_store_details_of_the_first_segment_flight_and_date() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I store details of the first segment flight and date");
            System.out.println("I store details of the first segment flight and date");
            isharesPage1.storeFirstSegFlightDetails(logInfo);
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform held seat assignment to the passengers and verify the same")
    public void I_perform_held_seat_assignment_to_the_passengers_and_verify_the_same() {
        try {
            String task = "HeldSeatAssignment";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform held seat assignment to the passengers and verify the same");
            System.out.println("I perform held seat assignment to the passengers and verify the same");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform check in re-entry for downgrade seats to a new {string} and verify the same")
    public void I_perform_check_in_re_entry_for_downgrade_seats_to_a_new_and_verify_the_same(String COS2) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform check in re-entry for downgrade seats and verify the same");
            isharesPage1.downgradeSeat(logInfo, COS2);
            logInfo.pass("I perform check in re-entry for downgrade seats and verify the same");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I transfer standby passengers to the new flight on the same date and same board and off points")
    public void I_transfer_standby_passengers_to_the_new_flight_on_the_same_date_and_same_board_and_off_points() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I transfer standby passengers to the new flight on the same date and same board and off points");
            isharesPage1.transferStandbyPaxToNewFlight(logInfo);
            logInfo.pass("I transfer standby passengers to the new flight on the same date and same board and off points");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I search for flight availability for special PNR type for a different flight {string} {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_flight_availability_for_special_PNR_for_different_flight(String PnrType,String Origin,String Destination,String date,String Totalpax,String COS,String airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilitySpecialPnrTakingDifferentFlt(logInfo,PnrType,Origin,Destination,date,Totalpax,COS,airline);
            logInfo.pass("I search for flight availability");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform passenger space protection by passenger name and verify the same")
    public void I_perform_passenger_space_protection_by_passenger_name_and_verify_the_same() {
        try {
            String task = "PassengerSpaceProtection";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform passenger space protection by passenger name and verify the same");
            System.out.println("I perform passenger space protection by passenger name and verify the same");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform voluntary denied boarding passengers after check-in process and verify the {string} message")
    public void I_perform_voluntary_denied_boarding_passengers_after_check_in_process_and_verify_the_same(String messageToVerify) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform voluntary denied boarding passengers after check-in process and verify the same");
            System.out.println("I perform voluntary denied boarding passengers after check-in process and verify the same");
            isharesPage1.voluntaryDeniedBoardingPassengers(logInfo, messageToVerify);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability {string} to {string} on {string} {string} {string} {string} and choose a different flight")
    public void i_search_for_flight_availability_for_special_PNR_for_different_flight_and_choose_a_different_flight(String Origin,String Destination,String date,String Totalpax,String COS,String airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilityTakingDifferentFlt(logInfo,Origin,Destination,date,Totalpax,COS,airline);
            logInfo.pass("I search for flight availability");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform voluntary denied boarding passengers after check-in process for no fare exclusive option and verify the same")
    public void I_perform_voluntary_denied_boarding_passengers_after_check_in_process_for_exclusive_option() {
        try {
            String task = "VolDeniedBoardingForExclusiveOption";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform voluntary denied boarding passengers after check-in process for no fare exclusive option and verify the same");
            System.out.println("I perform voluntary denied boarding passengers after check-in process for no fare exclusive option and verify the same");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform adding active remarks {string} for the {string} and verify the same")
    public void I_perform_adding_active_remarks_for_the_and_verify_the_same(String remarks, String specificInfo) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform adding active remarks and verify the same");

            isharesPage1.addingActiveRemarks(logInfo, remarks, specificInfo);
            logInfo.pass("I perform adding active remarks and verify the same");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform addition of OSI remark to the PNR")
    public void I_perform_addition_of_OSI_remark_to_the_PNR() {

        try {
            String task = "AddOSIRemark";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform addition of OSI remark to the PNR");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform addition of OSI remark to the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform addition of OSI remark to the PNR by specifying the pax name")
    public void I_perform_addition_of_OSI_remark_to_the_PNR_by_specifying_the_pax_name() {

        try {
            String task = "AddOSIRemarkWithPaxName";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform addition of OSI remark to the PNR by specifying the pax name");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform addition of OSI remark to the PNR by specifying the pax name");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform modification of baggage using invalid flight number and verify the error message")
    public void I_perform_modification_of_baggage_using_invalid_flight_number_and_verify_the_error_message() {
        try {
            String task = "ModificationOfBagInvalidFltNumber";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform modification of baggage using invalid flight number and verify the error message");
            System.out.println("I perform modification of baggage using invalid flight number and verify the error message");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform test print of a baggage tag")
    public void I_perform_test_print_of_a_baggage_tag() {
        try {
            String task = "I perform test print of a baggage tag";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I_perform_test_print_of_a_baggage_tag");
            System.out.println("I_perform_test_print_of_a_baggage_tag");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I_perform_test_print_of_a_baggage_tag");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I perform addition of minimum entry for SSR codes used with the {string} format to a PNR")
    public void I_perform_addition_of_minimum_entry_for_SSR_codes_used_with_the_format_to_a_PNR(String formatType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform addition of minimum entry for SSR codes");
            System.out.println("I perform addition of minimum entry for SSR codes");
            isharesPage1.addMinimumEntryForSSRCodes(logInfo, formatType);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform addition of extended format for SSR codes used with the automated format to a PNR")
    public void I_perform_addition_of_extended_format_for_SSR_codes_used_with_the_automated_format_to_a_PNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform addition of extended format for SSR codes used with the automated format to a PNR");
            System.out.println("I perform addition of extended format for SSR codes used with the automated format to a PNR");
            isharesPage1.addExtendedFormatForSSRCodes(logInfo);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I display the list of SSRs with tags")
    public void iDisplayTheListOfSSRsWithTags() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display the list of SSRs with tags");

            isharesPage1.displaySSRsWithTags(logInfo);
            logInfo.pass("I display the list of SSRs with tags");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I rebook the segment {string} for origin {string} and destination {string} for special pax")
    public void i_save_and_retrieve_the_pnr(String SegmentNumber,String origin, String destination){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook the segment");
            System.out.println("I rebook the segment");

            isharesPage1.rebookSegment(logInfo,SegmentNumber,origin,destination);
            logInfo.pass("I rebook the segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add Crew member {string}")
    public void i_add_Crew_member(String CrewType){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Crew member " + CrewType);
            System.out.println("I add Crew member " + CrewType);

            isharesPage1.addCrewMember(logInfo,CrewType);
            logInfo.pass("I add Crew member");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I delete Crew member {string}")
    public void i_delete_Crew_member(String CrewType){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete Crew member " + CrewType);
            System.out.println("I delete Crew member " + CrewType);

            isharesPage1.deleteCrewMember(logInfo,CrewType);
            logInfo.pass("I delete Crew member");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I check if flight is open")
    public void i_check_if_flight_is_open() throws IOException {

        boolean flightStatus = isharesPage1.checkIfFlightOpen(logInfo, 0);

        Assert.assertTrue(flightStatus, "flight is not open");

    }

    @And("I retrieve Go Show PNR in iShares")
    public void I_retrieve_Go_Show_PNR_in_iShares() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve Go Show PNR in iShares");

            isharesPage1.retrieveGoShowPNRInShares(logInfo);
            logInfo.pass("I retrieve Go Show PNR in iShares");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add the passenger to voluntary oversold list")
    public void I_add_the_passenger_to_voluntary_oversold_list() {

        try {
            String task = "AddPaxToVoluntaryOversoldList";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the passenger to voluntary oversold list");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I add the passenger to voluntary oversold list");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I remove the passenger from voluntary oversold list")
    public void I_remove_the_passenger_from_voluntary_oversold_list() {

        try {
            String task = "RemovePaxFromVoluntaryOversoldList";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove the passenger from voluntary oversold list");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I remove the passenger from voluntary oversold list");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I divide the PNR using ACI entry")
    public void I_divide_the_PNR_using_ACI_entry() {

        try {
            String task = "DivideThePNR";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I divide the PNR using ACI entry");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I divide the PNR using ACI entry");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify display of formatted FDR using ACI entry")
    public void I_verify_display_for_formatted_FDR_using_ACI_entry() {
        try {

            String task = "VerifyDisplayOfFormattedFDR";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify display for formatted FDR using ACI entry");
            System.out.println("I verify display for formatted FDR using ACI entry");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform displaying of PNIS items using ACI entry")
    public void I_perform_displaying_of_PNIS_items_using_ACI_entry() {

        try {
            String task = "DisplayOfPNISItems";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform displaying of PNIS items using ACI entry");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform displaying of PNIS items using ACI entry");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform recreation of the SSR in advance period and verify the same")
    public void I_perform_recreation_of_the_SSR_in_advance_period_and_verify_the_same() {
        try {
            String task = "RecreationOfSSR";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform recreation of the SSR in advance period and verify the same");
            System.out.println("I perform recreation of the SSR in advance period and verify the same");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of shares PNR for a marketing flight by adding {string} of weight {string} and validate the error")
    public void checkin_of_shares_PNR_for_a_marketing_flight_and_validate_the_error(String noOfBags, String baggageWeight) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of shares PNR for a marketing flight and validate the error");

            isharesPage1.marketingFlightCheckin(logInfo, noOfBags, baggageWeight);
            logInfo.pass("I do the checkin of shares PNR for a marketing flight and validate the error");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform cancel misconnect passengers from inbound CM flight")
    public void I_perform_cancel_misconnect_passengers_from_inbound_CM_flight() {

        try {
            String task = "CancelMisconnect";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform cancel misconnect passengers from inbound CM flight");
            System.out.println("I perform cancel misconnect passengers from inbound CM flight");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform cancel misconnect passengers from inbound CM flight");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform changing automatic seat selection process using the command to {string}")
    public void I_perform_changing_automatic_seat_selection_process_using_the_command_to(String action) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform changing automatic seat selection process");
            System.out.println("I perform changing automatic seat selection process");

            isharesPage1.terminateAutomaticSeatSelection(logInfo, action);
            logInfo.pass("I perform changing automatic seat selection process");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the seat map summary")
    public void I_verify_the_seat_map_summary() {

        try {
            String task = "VerifySeatMapSummary";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the seat map summary");
            System.out.println("I verify the seat map summary");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I verify the seat map summary");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the PNR and save the connecting flight number")
    public void i_retrieve_the_PNR_and_save_the_connecting_flight_number() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the PNR and save the connecting flight number");
            System.out.println("I retrieve the PNR and save the connecting flight number");

            isharesPage1.saveConnectingFltNumber(logInfo);
            logInfo.pass("I retrieve the PNR and save the connecting flight number");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform release of specific held seat")
    public void I_perform_release_of_specific_held_seat() {

        try {
            String task = "ReleaseSpecificHeldSeat";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform release of specific held seat");
            System.out.println("I perform release of specific held seat");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform release of specific held seat");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform enabling immediate seating for standbys in all compartments")
    public void I_perform_enabling_immediate_seating_for_standbys_in_all_compartments() {

        try {
            String task = "EnablingImmediateStandby";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform enabling immediate seating for standbys in all compartments");
            System.out.println("I perform enabling immediate seating for standbys in all compartments");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform enabling immediate seating for standbys in all compartments");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the name of all the passengers")
    public void I_change_the_name_of_all_the_passengers(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the name of all the passengers");
            isharesPage1.changeNameOfAllThePassengers(logInfo);
            logInfo.pass("I change the name of all the passengers");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of Shares PNR for the crew passenger {string}")
    public void I_do_the_checkin_of_Shares_PNR_for_the_crew_passenger(String paxcount) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR for the crew passenger");
            isharesPage1.sharesCheckinForCrewPassenger(logInfo,paxcount);
            logInfo.pass("I do the checkin of Shares PNR for the crew passenger");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform enabling immediate seating for standbys in specified {string} compartment")
    public void I_perform_enabling_immediate_seating_for_standbys_in_specified_compartment(String COS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform enabling immediate seating for standbys in specified compartments");
            System.out.println("I perform enabling immediate seating for standbys in specified compartments");

            isharesPage1.enablingImmediateStandbySpecifiedComptmt(logInfo, COS);
            logInfo.pass("I perform enabling immediate seating for standbys in all compartments");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I put the flight in manual mode")
    public void I_put_the_flight_in_manual_mode() {

        try {
            String task = "PutFlightToManualMode";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I put the flight in manual mode");
            System.out.println("I put the flight in manual mode");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I put the flight in manual mode");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform restrict simultaneous checkin")
    public void I_perform_restrict_simultaneous_checkin() {

        try {
            String task = "RestrictSimultaneousCheckin";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform restrict simultaneous checkin");
            System.out.println("I perform restrict simultaneous checkin");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform restrict simultaneous checkin");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform the task of ticketing remarks with Restrictions")
    public void I_perform_the_task_of_ticketing_remarks_with_restrictions(){

        try {
            String task = "TicketingRemarksWithRestrictions";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the task of ticketing remarks with Restrictions");
            System.out.println("I perform the task of ticketing remarks with Restrictions");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the task of ticketing remarks with Restrictions");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I search for flight availability {string} to {string} on {string} {string} {string} and check for the classes {string} {string} for PNRType {string}")
    public void i_search_for_flight_availability_and_check_for_the_classes_for_PNRType(String Origin, String Destination, String date, String Totalpax, String Airline, String COS2, String COS1, String PNRType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilityTwoDifferentClasses(logInfo, Origin, Destination, date, Totalpax, Airline, COS2, COS1, PNRType);
            logInfo.pass("I search for flight availability first segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I delete the crew name from the crew record")
    public void I_delete_the_crew_name_from_the_crew_record() {

        try {
            String task = "DeleteCrewNameFromCrewRecord";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the crew name from the crew record");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I delete the crew name from the crew record");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform PNIS validation for the crew passenger")
    public void iPerformPNISValidationForTheCrewPassenger(){
        try{
            String task = "VerifyPNISForCrewPassenger";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform PNIS validation for the crew passenger");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform PNIS validation for the crew passenger");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I verify the flight history")
    public void I_verify_the_flight_history() {

        try {
            String task = "VerifyFlightHistory";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the flight history");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I verify the flight history");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the Last four digits of Credit card number {string} are un-masked under ticketing history")
    public void I_verify_the_last_four_digits_of_Credit_card_number_are_un_masked_under_ticketing_history(String PaymentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the Last four digits of Credit card number are un-masked under ticketing history");

            isharesPage1.unMaskedUnderTicketingHistory(logInfo, PaymentType);
            logInfo.pass("I verify the Last four digits of Credit card number are un-masked under ticketing history");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the appswitch {string} for the {string} entry")
    public void I_verify_the_appswitch_for_the_entry(String appSwitch, String entry) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the appswitch for the entry");

            isharesPage1.verifyAppswitchEntries(logInfo, appSwitch, entry);
            logInfo.pass("I verify the appswitch for the entry");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add LANATA to LANATA table and verified")
    public void I_add_LANATA_to_LANATA_table_and_verified() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add LANATA to LANATA table and verified");

            isharesPage1.addLANATA(logInfo);
            logInfo.pass("I add LANATA to LANATA table and verified");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform Activating the LNIATA as a Permanent set and verified")
    public void I_perform_Activating_the_LNIATA_as_a_Permanent_set_and_verified() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Activating the LNIATA as a Permanent set and verified");

            isharesPage1.activateLANATA(logInfo);
            logInfo.pass("I perform Activating the LNIATA as a Permanent set and verified");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform the task of adding form of payment using remarks entry")
    public void I_perform_the_task_of_adding_form_of_payment_using_remarks_entry(){

        try {
            String task = "AddingFOPUsingRemarks";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the task of adding form of payment using remarks entry");
            System.out.println("I perform the task of adding form of payment using remarks entry");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the task of adding form of payment using remarks entry");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform the availability displayed for previous day")
    public void I_perform_the_availability_displayed_for_previous_day(){

        try {
            String task = "AvailForPrevDay";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the availability displayed for previous day");
            System.out.println("I perform the availability displayed for previous day");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the availability displayed for previous day");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform the availability displayed for next day")
    public void I_perform_the_availability_displayed_for_next_day(){

        try {
            String task = "AvailForNextDay";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the availability displayed for next day");
            System.out.println("I perform the availability displayed for next day");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the availability displayed for next day");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify the default FOP {string} after ticketing the PNR")
    public void I_verify_the_default_FOP_after_ticketing_the_PNR(String PaymentType){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the default FOP after ticketing the PNR");
            System.out.println("I verify the default FOP after ticketing the PNR");

            isharesPage1.displayDefauldFOP(logInfo, PaymentType);
            logInfo.pass("I verify the default FOP after ticketing the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform flight availability from {string} to {string} on {string}")
    public void I_perform_flight_availability(String Origin,String Destination,String Date){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform flight availability");
            System.out.println("I perform flight availability");

            isharesPage1.flightAvailability(logInfo, Origin,Destination,Date);
            logInfo.pass("I perform flight availability");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify the ticket number by retrieving the PNR")
    public void iVerifyTheTicketNumber() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the ticket number by retrieving the PNR");

            isharesPage1.verifyTheTicketNumber(logInfo);
            logInfo.pass("I verify the ticket number by retrieving the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform lowest available fare with rebook response verify error message")
    public void iPerformLowestAvailableFareWithRebookResponseVerifyErrorMessage() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform lowest available fare with rebook response verify error message");

            isharesPage1.performFareWithRebookVerifyError(logInfo);
            logInfo.pass("I perform lowest available fare with rebook response verify error message");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I initiate ticket agent report and reestablish link from TAR to CRT for {string}")
    public void I_initiate_ticket_agent_report_and_reestablish_link_from_TAR_to_CRT_for(String POS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I initiate ticket agent report and reestablish link from TAR to CRT");
            System.out.println("initiate ticket agent report and reestablish link from TAR to CRT");

            isharesPage1.initiateTARAndReestablishLink(logInfo, POS);
            logInfo.pass("I initiate ticket agent report and reestablish link from TAR to CRT");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform elective Standby Clearance with Voluntary Grade Change")
    public void I_perform_elective_Standby_Clearance_with_Voluntary_Grade_Change(){

        try {
            String task = "ElectiveStandbyClearance";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform elective Standby Clearance with Voluntary Grade Change");
            System.out.println("I perform elective Standby Clearance with Voluntary Grade Change");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform elective Standby Clearance with Voluntary Grade Change");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I validate day of week in PNR segment")
    public void I_validate_day_of_week_in_PNR_segment(){

        try {
            String task = "ValidateDayOfWeek";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate day of week in PNR segment");
            System.out.println("I validate day of week in PNR segment");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I validate day of week in PNR segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify seat is after changing the Itinerary")
    public void I_verify_seat_is_after_hanging_the_Itinerary(){

        try {
            String task = "ValidateSeatAfterModifySegment";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify seat is after changing the Itinerary");
            System.out.println("I verify seat is after changing the Itinerary");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I verify seat is after changing the Itinerary");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform voluntary upgrade change for the pax for COS {string}")
    public void iPerformVolUpGrade(String COS){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perfrom voluntary upgrade change for the pax");
            isharesPage1.volUpgradeForPaxAfterCheckin(logInfo,COS);
            logInfo.pass("I perfrom voluntary upgrade change for the pax");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I perform Uncheckin the baggage")
    public void I_perform_Uncheckin_the_baggage() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Uncheckin the baggage");

            isharesPage1.performUnCheckinBaggage(logInfo);
            logInfo.pass("I perform Uncheckin the baggage");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I modify TRUSTED DATA as NO in APIS for all Passengers")
    public void I_modify_TRUSTED_DATA_as_NO_in_APIS_for_all_Passengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I modify TRUSTED DATA as NO in APIS for all Passengers");

            isharesPage1.modifyAPISToNo(logInfo);
            logInfo.pass("I modify TRUSTED DATA as NO in APIS for all Passengers");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate advanced passenger information for trusted data as NO for {string} pax")
    public void validateAdvancePaxInfotrstedDataNo(String paxcount) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate advanced passenger information for trusted data as NO");

            isharesPage1.advancePaxInfoNoTrusted(logInfo,paxcount);
            logInfo.pass("I have validated advanced passenger information for trusted data as NO");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform held seat assignment for the passengers")
    public void heldSeatAssignment() {

        try {
            String task = "HeldSeatAssignForAllPax";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform held seat assignment for the passengers");
            System.out.println("I perform the task of restrict connect checkin");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform held seat assignment for the passengers");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make passenger voluntary Denied")
    public void MakeThePassengerVolunteer() {

        try {
            String task = "MakeThePassengerVolunteer";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make passenger voluntary Denied");
            System.out.println("I make passenger voluntary");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I make passenger voluntary Denied");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter particular passenger details with existing data {string}")
    public void enterparticularDetails(String paxcount) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter particular passenger details with exsisting data");

            isharesPage1.enterparticularDetails(logInfo,paxcount);
            logInfo.pass("I enter particular passenger details with exsisting data");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make passenger In voluntary Denied")
    public void MakeThePassengerInVolunteer() {

        try {
            String task = "MakeThePassengerInVolunteer";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make passenger in voluntary Denied");
            System.out.println("I make passenger In voluntary Denied");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I make passenger in voluntary Denied");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I Perform activation of a terminal from Semi-Permanent Data modification")
    public void ActivateTerminalData() {

        try {
            String task = "ActivateTerminalData";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Perform activation of a terminal from Semi-Permanent Data modification");
            System.out.println("I Perform activation of a terminal from Semi-Permanent Data modification");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I Perform activation of a terminal from Semi-Permanent Data modification");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I Perform deactivation of a terminal from Semi-Permanent Data modification")
    public void DeactivateTerminalData() {

        try {
            String task = "DeactivateTerminalData";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Perform de activation of a terminal from Semi-Permanent Data modification");
            System.out.println("I Perform de activation of a terminal from Semi-Permanent Data modification");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I Perform de activation of a terminal from Semi-Permanent Data modification");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform attribute table  modification")
    public void ModifyAttributeTable() {

        try {
            String task = "ModifyAttributeTable";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform attribute table  modification");
            System.out.println("I perform attribute table  modification");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform attribute table  modification");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform deletion of Alliance record")
    public void DeletionOfAllianceRecord() {

        try {
            String task = "DeletionOfAllianceRecord";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform deletion of Alliance record");
            System.out.println("I perform deletion of Alliance record");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform deletion of Alliance record");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform Alternate Checkin on Different Dates")
    public void AlternateCheckin() {

        try {
            String task = "AlternateCheckinWithInValidDate";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Alternate Checkin on Different Dates");
            System.out.println("I perform Alternate Checkin on Different Dates");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform Alternate Checkin on Different Dates");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perfrom crew check-in along with jump seat rider")
    public void performCrewCheckinWithjumpSeat() {

        try {
            String task = "PerformCrewCheckinWithjumpSeat";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perfrom crew check-in along with jump seat rider");
            System.out.println("I perfrom crew check-in along with jump seat rider");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perfrom crew check-in along with jump seat rider");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I modify the booking compartment")
    public void I_modify_the_booking_compartment() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I modify the booking compartment");
            isharesPage1.modifyTheBookingCompartment(logInfo);
            logInfo.pass("I modify the booking compartment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the child SSR in the PNR")
    public void I_verify_the_child_SSR_in_the_PNR() {

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the child SSR in the PNR");
            isharesPage1.verifyTheChildSSR(logInfo);
            logInfo.pass("I verify the child SSR in the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the codeshare table entries")
    public void I_run_the_codeshare_table_entries() {

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the codeshare table entries commands");
            isharesPage1.runCodeshareTableEntriesCommands(logInfo);
            logInfo.pass("I run the codeshare table entries commands");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify that the segment is deleted")
    public void I_verify_that_the_segment_is_deleted() {

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify that the segment is deleted");
            isharesPage1.verifyTheSegmentIsDeleted(logInfo);
            logInfo.pass("I verify that the segment is deleted");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for OA flight availability {string} to {string} on {string} {string} {string} {string}")
    public void i_search_for_flight_availability_and_check_for_OA_class_availability(String Origin,String Destination,String date,String Totalpax,String COS, String Airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.checkClassesOA(logInfo,Origin,Destination,date,Totalpax,COS,Airline);
            logInfo.pass("I search for flight availability first segment");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I change entries by changing the {string}")
    public void I_change_entries_by_changing_the(String changeType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the entries");

            isharesPage1.changingEntries(logInfo, changeType);
            logInfo.pass("I change the entries");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("And I search for double availability of flights from {string} to {string} to {string} on {string} {string} {string}")
    public void i_search_for_double_availability_of_flights_from_to_to_on(String Origin, String Destination1, String Destination2, String date, String Totalpax, String COS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for double availability of flights");
            isharesPage1.searchDoubleAvailability(logInfo, Origin, Destination1, Destination2, date, Totalpax, COS);
            logInfo.pass("I search for double availability of flights");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter passenger details for group PNR for 5pax {string} {string}")
    public void iEnterPassengerDetailsForGroupPNRFor5pax(String paxtype1, String paxtype2) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            System.out.println("I enter passenger details");

            String[] paxlist = new String[5]; //Here we are taking all adults so taking only one pax type from feature
            paxlist[0] = paxtype1;
            paxlist[1] = paxtype1;
            paxlist[2] = paxtype1;
            paxlist[3] = paxtype2;
            paxlist[4] = paxtype2;

            isharesPage1.enterPassengerDetails(logInfo, paxlist);
            logInfo.pass("I enter passenger details");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I perform changing segment status code to {string} for the {string}")
    public void I_perform_changing_segment_status_code_to_for_the(String StatusCode, String segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform changing segment status code to " + StatusCode);
            isharesPage1.changingTheSegmentStatusCode(logInfo, StatusCode, segment);
            logInfo.pass("I perform changing segment status code");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I place the PNR in the queue and display the PNR from the queue")
    public void I_place_the_PNR_in_the_queue_and_display_the_PNR_from_the_queue() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I place the PNR in the queue and display the PNR from the queue");
            System.out.println("I place the PNR in the queue and display the PNR from the queue");

            isharesPage1.placeAndDisplayPNRFromQueue(logInfo);
            logInfo.pass("I place the PNR in the queue and display the PNR from the queue");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I add fone field to the PNR")
    public void I_add_fone_field_to_the_PNR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add fone field to the PNR");
            System.out.println("I add fone field to the PNR");

            isharesPage1.addFoneField(logInfo);
            logInfo.pass("I add fone field to the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I delete the {string} passenger from the PNR")
    public void I_delete_the_first_passenger_from_the_PNR(String paxNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the passenger from the PNR");
            isharesPage1.deletePassengerFromThePNR(logInfo, paxNumber);
            logInfo.pass("I delete the passenger from the PNR");
            

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I perform PNIS validation for a OA flight")
    public void I_perform_PNIS_validation_for_a_OA_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform PNIS validation for a OA flight");
            isharesPage1.PNISValidationForOAFlight(logInfo);
            logInfo.pass("I perform PNIS validation for a OA flight");
            

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I make the flight as default")
    public void I_make_the_flight_as_default() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the flight as default");

            isharesPage1.makeFlightAsDefault(logInfo);
            logInfo.pass("I make the flight as default");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify the add undelivered message with flight number")
    public void I_verify_the_add_undelivered_message_with_flight_number() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the add undelivered message with flight number");

            isharesPage1.verifyMsgWithFlightNumber(logInfo);
            logInfo.pass("I verify the add undelivered message with flight number");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify the add undelivered message without flight number")
    public void I_verify_the_add_undelivered_message_without_flight_number() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the add undelivered message without flight number");

            isharesPage1.verifyMsgWithoutFlightNumber(logInfo);
            logInfo.pass("I verify the add undelivered message without flight number");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add message to the passenger without flight number")
    public void iAddMessageToThePassengerWithoutFlightNumber() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add message to the passenger without flight number");

            isharesPage1.addMessageToPaxWithoutFlightNumber(logInfo);
            logInfo.pass("I add message to the passenger without flight number");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I perform involuntary upgrade of the passenger to {string}")
    public void I_perform_involuntary_upgrade_of_the_passenger_to(String COS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform involuntary upgrade of the passenger");

            isharesPage1.involuntaryUpgradeOfThePassenger(logInfo, COS);
            logInfo.pass("I perform involuntary upgrade of the passenger");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I assign a shipment of different equipment and verify {string} of pending ship assignment entries for {string} for {string}")
    public void I_assign_a_shipment_of_different_equipment_and_verify_of_pending_ship_assignment_entries(String status, String airline, String date) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign a shipment of different equipment and verify pending ship assignment entries");

            isharesPage1.assignShipmentOfDifferentEquipment(logInfo, status, airline, date);
            logInfo.pass("I assign a shipment of different equipment and verify pending ship assignment entries");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I close the established link and display TAR")
    public void I_close_the_established_link_and_display_TAR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I close the established link and display TAR");
            System.out.println("initiate ticket agent report and reestablish link from TAR to CRT");

            isharesPage1.closeTheEstablishedLinkAndDisplayTAR(logInfo);
            logInfo.pass("initiate ticket agent report and reestablish link from TAR to CRT and display TAR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify SSR restriction is not listed in PSC Exception table {string}")
    public void Verify_SSR_Restriction_In_PSC_Table(String SSRType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify SSR restriction is not listed in PSC Exception table");
            System.out.println("I verify SSR restriction is not listed in PSC Exception table");

            isharesPage1.VerifySSRRestrictionInPSCTable(logInfo,SSRType);
            logInfo.pass("I verify SSR restriction is not listed in PSC Exception table");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I do modify the group zone table for type {string}")
    public void ModifyGroupZoneTable(String ModifyType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do " + ModifyType + " the group zone table for type ");
            System.out.println("I do " + ModifyType + " the group zone table for type ");

            isharesPage1.ModifyGroupZoneTable(logInfo,ModifyType);
            logInfo.pass("I do " + ModifyType + " the group zone table for type ");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I assign Seat for {string} with specific seat for COS {string}")
    public void iReplaceTheSeatAfterCheckInWithSpecificSeat(String AssignSeatType, String COS){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign Seat for " + AssignSeatType + " with specific seat for COS" + COS);
            isharesPage1.AssignSeatAfterCheckin(logInfo,AssignSeatType,COS);
            logInfo.pass("I assign Seat for " + AssignSeatType + " with specific seat for COS" + COS);
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I assign the ghost seat in with specific seat for COS {string}")
    public void iAssignTheGhostSeatAfterCheckInWithSpecificSeat( String COS){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign the ghost seat in with specific seat for COS");
            isharesPage1.AssignGhostSeat(logInfo,COS);
            logInfo.pass("I assign the ghost seat in with specific seat for COS");
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I replace the seat with specific seat for COS {string}")
    public void iReplaceTheSeatWithSpecificSeat(String COS){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I replace the seat with specific seat for COS" + COS);
            isharesPage1.ReplaceSeat(logInfo,COS);
            logInfo.pass("I replace the seat with specific seat for COS" + COS);
            

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I perform Retrieval of a Passenger Record")
    public void I_perform_Retrieval_of_Pax_Record(){

        try {
            String task = "RetrievalOfPaxRecord";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Retrieval of a Passenger Record");
            System.out.println("I perform Retrieval of a Passenger Record");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform Retrieval of a Passenger Record");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I create GDS pnr using TTY message for pnr type {string} total segments {string} {string}")
    public void CreateGDSPnr(String PnrType, String TotalSegments, String SSRType){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I create GDS pnr using TTY message");
            System.out.println("I create GDS pnr using TTY message");

            isharesPage1.CreateGDSPnr(logInfo, PnrType, TotalSegments, SSRType);
            logInfo.pass("I create GDS pnr using TTY message");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I verify the cancellation of remarks for boarding point or flight entries")
    public void I_verify_the_cancellation_of_remarks_for_boarding_point_or_flight_entries() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the cancellation of remarks for boarding point or flight entries");

            isharesPage1.verifyTheCancellationOfRemarks(logInfo);
            logInfo.pass("I verify the cancellation of remarks for boarding point or flight entries");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform passenger name list display boarding at any point for all destinations for the flight")
    public void I_perform_passenger_name_list_display_boarding_at_any_point_for_all_destinations_for_the_flight() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform passenger name list display boarding at any point for all destinations for the flight");

            isharesPage1.passengerNameListDisplay(logInfo);
            logInfo.pass("I perform passenger name list display boarding at any point for all destinations for the flight");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the details like name destination and record locator in reverse booking order list and perform list redisplay")
    public void I_verify_the_details_like_name_destination_and_record_locator_in_reverse_booking_order_list_and_perform_list_redisplay() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the details like name destination and record locator in reverse booking order list and perform list redisplay");

            isharesPage1.reverseBookingOrderList(logInfo);
            logInfo.pass("I verify the details like name destination and record locator in reverse booking order list and perform list redisplay");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I reject the mass transfer")
    public void I_reject_the_mass_transfer() {
        try {
            String task = "RejectMassTransfer";

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I reject the mass transfer");
            System.out.println("I reject the mass transfer");
            isharesPage1.performTheSpecifiedTask(logInfo, task);
            
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform the action of {string} in the control table")
    public void I_perform_the_action_of_in_the_control_table(String action) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the actions in the control table");

            isharesPage1.performAnActionInTheControlTable(logInfo, action);
            logInfo.pass("I perform the actions in the control table");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform adding time limit to the PNR and verify that it is added to the PNR")
    public void I_perform_adding_time_limit_to_the_PNR_and_verify_that_it_is_added_to_the_PNR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform adding time limit to the PNR and verify that it is added to the PNR");

            isharesPage1.addTimeLimitToThePNR(logInfo);
            logInfo.pass("I perform adding time limit to the PNR and verify that it is added to the PNR");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for second segment {string} to {string} on {string} {string} {string} {string} and choose a different flight")
    public void i_search_for_flight_availability_for_second_segment_for_different_flight_and_choose_a_different_flight(String Origin,String Destination,String date,String Totalpax,String COS,String airline){

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage1.searchavailabilityTakingDifferentFltSecondSegment(logInfo,Origin,Destination,date,Totalpax,COS,airline);
            logInfo.pass("I search for flight availability");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I modify the OA segment time")
    public void I_modify_the_OA_segment_time() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I modify the OA segment time");

            isharesPage1.modifyOASegmentTime(logInfo);
            logInfo.pass("I modify the OA segment time");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I check if partner carrier {string} is listed in the partner control table")
    public void I_check_if_partner_carrier_is_listed_in_the_partner_control_table(String airline) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check if partner carrier is listed in the partner control table");

            isharesPage1.checkingTheCarrierInPartnerCtrlTable(logInfo, airline);
            logInfo.pass("I check if partner carrier is listed in the partner control table");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the seats are assigned to the PNR history")
    public void I_verify_the_seats_are_assigned_to_the_PNR_history() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the seats are assigned to the PNR history");

            isharesPage1.verifySeatsAssignedToPNRHistory(logInfo);
            logInfo.pass("I verify the seats are assigned to the PNR history");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform the status of flight after changing the arrival time")
    public void CheckFlightStatusAfterModification(){

        try {
            String task = "CheckFlightStatusAfterModification";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the status of flight after changing the arrival time");
            System.out.println("I perform the status of flight after changing the arrival time");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the status of flight after changing the arrival time");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform the status of flight")
    public void CheckFlightStatus(){

        try {
            String task = "CheckFlightStatus";
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform the status of flight");
            System.out.println("I perform the status of flight");

            isharesPage1.performTheSpecifiedTask(logInfo, task);
            logInfo.pass("I perform the status of flight");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I delete the APIS details from Ishares")
    public void iDeleteTheAPISDetailsFromIshares() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the APIS details from Ishares");
            isharesPage1.DeleteAPIS(logInfo);
            logInfo.pass("I delete the APIS details from Ishares");
            
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I perform collecting and storing of APIS data for crew members and jump seat riders")
    public void I_perform_collecting_and_storing_of_APIS_data_for_crew_members_and_jump_seat_riders(){

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform collecting and storing of APIS data for crew members and jump seat riders");
            System.out.println("I perform collecting and storing of APIS data for crew members and jump seat riders");

            isharesPage1.collectAndStoreAPISForCrewPaxJSRiders(logInfo);
            logInfo.pass("I perform collecting and storing of APIS data for crew members and jump seat riders");
            

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
        }

    }


}



