package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.testng.Assert;

import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;

public class IsharesSteps2 extends StepManager {

    ExtentTest logInfo = null;
    private Hook hook = new Hook();


    @And("I create the passengers data")
    public void I_create_the_passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I create the passengers data");
            System.out.println("I create the passengers data");
            isharesPage2.createPassengers();
            logInfo.pass("I create the passengers data");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add {string} adult passengers")
    public void I_select_adult_passengers(String adtCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add adult passengers");
            System.out.println("I add adult passengers");
            isharesPage2.addAdultPassengers(adtCount);
            logInfo.pass("I add adult passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add {string} child passengers")
    public void I_select_child_passengers(String chdCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add child passengers");
            System.out.println("I add child passengers");
            isharesPage2.addChildPassengers(chdCount);
            logInfo.pass("I add child passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add {string} infant with seat passengers")
    public void I_select_infant_with_seat_passengers(String insCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add infant with seat passengers");
            System.out.println("I add infant with seat passengers");
            isharesPage2.addInfantWithSeatPassengers(insCount);
            logInfo.pass("I add infant with seat passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add {string} infant without seat passengers")
    public void I_select_infant_without_seat_passengers(String infCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add infant without seat passengers");
            System.out.println("I add infant without seat passengers");
            isharesPage2.addInfantWithoutSeatPassengers(infCount);
            logInfo.pass("I add infant without seat passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I want to display all the passengers")
    public void I_display_all_passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I want to display all the passengers");
            isharesPage2.displayAllPax(logInfo);
            logInfo.pass("I want to display all the passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I enter LOGC CMRE command for logging in")
    public void i_enter_LOGC_CMRE() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LOGC CMRE command for logging in");
            isharesPage2.enter_LOGC_CMRE(logInfo);
            logInfo.pass("I enter LOGC CMRE command for logging in");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter BSIA command for signing in")
    public void i_enter_BSIA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSIA command for signing in");
            isharesPage2.enter_BSIA(logInfo);
            logInfo.pass("I enter BSIA command for signing in");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }


    @And("I enter BSO command for sign out")
    public void i_enter_BSO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSO command for sign out");
            isharesPage2.enter_BSO(logInfo);
            logInfo.pass("I enter BSO command for sign out");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter phone details for the passengers")
    public void i_enter_phone_details_for_the_passengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter phone details for the passengers");
            isharesPage2.enter_phone_details(logInfo);
            logInfo.pass("I enter phone details for the passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6P command to save the transaction")
    public void i_enter_6P_command_to_save_the_transaction() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6P command to save the transaction");
            isharesPage2.enter_6P(logInfo);
            logInfo.pass("I save transaction");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7T command for the ticketing command")
    public void i_enter_7T_command_for_the_ticketing_command() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7T/ command for the ticketing command");
            isharesPage2.enter_7T(logInfo);
            logInfo.pass("I enter 7T/ command for the ticketing command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ER command to save and retrieve")
    public void I_enter_ER_command_to_save_and_retrieve() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ER command to save and retrieve");
            isharesPage2.enter_ER(logInfo);
            logInfo.pass("I save and retrieve the pnr");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|FL command to display the final list of passengers in sequence")
    public void i_enter_6LD_FL_command_to_display_the_final_list_of_passengers_in_sequence() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|FL command to display the final list of passengers in sequence");
            isharesPage2.displayOfFinalList(logInfo);
            logInfo.pass("I enter 6:LD_|FL command to display the final list of passengers in sequence");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ALLETOS command to display the tickets that are out of sync")
    public void i_enter_6LD_ALL_ETOS_command_to_display_the_tickets_that_are_out_of_sync() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ALL/ETOS command to display the tickets that are out of sync");
            isharesPage2.displayTKTOutOfSyncList(logInfo);
            logInfo.pass("I enter 6:LD_|ALL/ETOS command to display the tickets that are out of sync");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter W* command to check lniata of the session")
    public void i_enter_W_to_check_lniata_of_the_session() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter W* command to check lniata of the session");
            isharesPage2.enter_W_Check_Lniata(logInfo);
            logInfo.pass("I enter W* command to check lniata of the session");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set the POS to {string}")
    public void i_set_the_POS_to(String pos) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change POS to " + pos);
            isharesPage2.setPos(logInfo, pos);
            logInfo.pass("I change POS to" + pos);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter passenger details")
    public void i_enter_passenger_details() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            isharesPage2.enter_passenger_Details(logInfo);
            logInfo.pass("I enter passenger details");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LD_|MSG command to display the added messages")
    public void i_enter_6LD_MSG_command_to_display_the_added_messages() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|MSG command to display the added messages");
            isharesPage2.displayTheMessage(logInfo);
            logInfo.pass("I enter 6:LD_|MSG command to display the added messages");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*B_ command to display the boarding summary")
    public void i_enter_6B_command_to_display_the_boarding_summary() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*B_ command to display the boarding summary");
            isharesPage2.displayBoardingSummary(logInfo);
            logInfo.pass("I enter 6:*B_ command to display the boarding summary");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*W_ command to display the denied boarding worksheet entries")
    public void i_enter_6W_command_to_display_the_denied_boarding_worksheet_entries() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*W_ command to display the denied boarding worksheet entries");
            isharesPage2.displayBoardingDeniedEntries(logInfo);
            logInfo.pass("I enter 6:*W_ command to display the denied boarding worksheet entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I check for multiple phone number commands")
    public void i_check_for_phonenumbers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check for multiple phone number commands");
            isharesPage2.checkPhoneNumbers(logInfo);
            logInfo.pass("I check for multiple phone number commands");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of redemption for first segment from {string} to {string}")
    public void iSearchForFlightAvailabilityOfRedemptionForFirstSegmentFromTo(String origin, String destination ) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for redemption from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityOfRedemptionForForFirstSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for redemption from " + origin + " to " + destination);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I search for flight availability from {string} to {string}")
    public void i_search_for_flight_availability(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForFirstSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability from " + origin + " to " + destination);
            System.out.println("I search for flight availability from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PR_STATUS command for displaying reconcile status")
    public void iEnter6PRSTATUSCommandForDisplayingReconcileStatus() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR_STATUS command for displaying reconcile status");
            isharesPage2.displayReconcileStatus(logInfo);
            logInfo.pass("I enter 6:PR_STATUS command for displaying reconcile status");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_UNS command for displaying UnReconciled List")
    public void iEnter6LDUNSCommandForDisplayingUnReconciledList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_UNS command for displaying UnReconciled List");
            isharesPage2.displayUnReconciledList(logInfo);
            logInfo.pass("I enter 6:LD_UNS command for displaying UnReconciled List");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_REAC command for displaying Reconciled List")
    public void iEnter6LDREACCommandForDisplayingReconciledList() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_REAC command for displaying Reconciled List");
            isharesPage2.displayReconciledList(logInfo);
            logInfo.pass("I enter 6:LD_REAC command for displaying Reconciled List");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_UNAP command for displaying UNAP List")
    public void iEnter6LDUNAPCommandForDisplayingUNAPList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_UNAP command for displaying UNAP List");
            isharesPage2.displayUNAPList(logInfo);
            logInfo.pass("I enter 6:LD_UNAP command for displaying UNAP List");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6CS command for displaying non smoking section")
    public void iEnter6CSCommandForDisplayingNonSmokingSection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6CS command for displaying non smoking section");
            isharesPage2.displayNonSmokingSection(logInfo);
            logInfo.pass("I enter 6CS command for displaying non smoking section");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*H_N command for displaying go shows history")
    public void iEnter6HNCommandForDisplayingGoShowsHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*H_N command for displaying go shows history");
            isharesPage2.displayGoShowsHistory(logInfo);
            logInfo.pass("I enter 6:*H_N command for displaying go shows history");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*H_F command for displaying force sell history")
    public void iEnter6HFCommandForDisplayingForceSellHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*H_F command for displaying force sell history");
            isharesPage2.displayForceSellHistory(logInfo);
            logInfo.pass("I enter 6:*H_F command for displaying force sell history");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*H command for specific pax history")
    public void iEnter6HCommandForSpecificPaxHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*H command for specific pax history");
            isharesPage2.displaySpecificPaxHistory(logInfo);
            logInfo.pass("I enter 6:*H command for specific pax history");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*H_Lniata command for displaying agent sinein history")
    public void iEnter6HLniataCommandForDisplayingAgentSineinHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:H_Lniata command for displaying agent sinein history");
            isharesPage2.displayHistoryAgentSineIn(logInfo);
            logInfo.pass("I enter 6:H_Lniata command for displaying agent sinein history");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LR command for displaying internal unseated list")
    public void iEnter6LRCommandForDisplayingInternalUnseatedList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6LR command for displaying internal unseated list");
            isharesPage2.displayInternalUnseatedList(logInfo);
            logInfo.pass("I enter 6LR command for displaying internal unseated list");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:H_10 command for displaying seated history of specific passenger")
    public void iEnter6HCommandForDisplayingSeatedHistoryOfSpecificPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6H_10 command for displaying seated history of specific passenger");
            isharesPage2.displaySeatedHistoryForSpecific(logInfo);
            logInfo.pass("I enter 6H_10 command for displaying seated history of specific passenger");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CLR command for displaying restriction table")
    public void iEnter6CLRCommandForDisplayingRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CLR command for displaying restriction table");
            isharesPage2.displayRestrictionTable(logInfo);
            logInfo.pass("I enter 6:CLR command for displaying restriction table");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ALL command for displaying all passenger list")
    public void iEnterLDALLCommandForDisplayingAllPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ALL command for displaying all passenger list");
            isharesPage2.allPassengersList(logInfo);
            logInfo.pass("I enter 6:LD_|ALL command for displaying all passenger list");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter check in command for alternate check in with invalid date")
    public void iEnterCheckInCommandForAlternateCheckInWithInvalidDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter check in command for alternate check in with invalid date");
            isharesPage2.alternateCheckinWithInValidDate(logInfo);
            logInfo.pass("I enter check in command for alternate check in with invalid date");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*H_$REAC.A command for displaying history item")
    public void iEnterH$REACACommandForDisplayingHistoryItem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*H_$REAC.A command for displaying history item");
            isharesPage2.displayHistoryItems(logInfo);
            logInfo.pass("I enter 6:*H_$REAC.A command for displaying history item");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-*H1 command for displaying specific history PCH table")
    public void iEnterKTH1CommandForDisplayingSpecificHistoryPCHTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-*H1 command for displaying specific history PCH table");
            isharesPage2.displaySpecificHistoryPCHTable(logInfo);
            logInfo.pass("I enter K-T-*H1 command for displaying specific history PCH table");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-*H command for displaying seated assign history")
    public void iEnterKHCommandForDisplayingSeatedAssignHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-*H command for displaying seated assign history");
            isharesPage2.displaySeatedAssignHistory(logInfo);
            logInfo.pass("I enter K-*H command for displaying seated assign history");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-*C command for displaying seated pax")
    public void iEnterKCCommandForDisplayingSeatedPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-*C command for displaying seated pax");
            isharesPage2.displaySeatedPax(logInfo);
            logInfo.pass("I enter K-*C command for displaying seated pax");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PICS*/UA/S#IB command for displaying inbound")
    public void iEnterPICSUASIBCommandForDisplayingInbound() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PICS*/UA/S#IB command for displaying inbound");
            isharesPage2.displayInbound(logInfo);
            logInfo.pass("I enter PICS*/UA/S#IB command for displaying inbound");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|CHD command for displaying child pax")
    public void iEnterLDCHDCommandForDisplayingChildPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|CHD command for displaying child pax");
            isharesPage2.displayChild(logInfo);
            logInfo.pass("I enter 6:LD_|CHD command for displaying child pax");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of Shares PNR for origin city {string}")
    public void checkin_of_Shares_PNR(String origincty) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");
            isharesPage2.sharesCheckin(logInfo, origincty);
            logInfo.pass("I do the checkin of passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I set total baggage count {string}")
    public void i_set_total_baggage_count(String BaggageCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set baggage count to " + BaggageCount);
            isharesPage2.setBaggageCount(BaggageCount);
            logInfo.pass("I set baggage count to " + BaggageCount);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set baggage weight {string}")
    public void i_set_baggage_weight(String BaggageWeight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set baggage weight to " + BaggageWeight);
            isharesPage2.setBaggageWeight(BaggageWeight);
            logInfo.pass("I set baggage weight to " + BaggageWeight);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do checkin for Shares PNR with baggage for check in type {string}")
    public void i_do_the_checkin_of_shares_pnr_with_baggage_for_check_in_type(String CheckinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for Shares PNR");
            isharesPage2.sharesCheckinTypes(logInfo, CheckinType);
            logInfo.pass("I do the checkin of passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I do checkin for Shares PNR with baggage with specific origin for check in type {string}")
    public void i_do_the_checkin_of_shares_pnr_with_baggage_with_specific_origin_check_in_type(String CheckinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for Shares PNR with baggage with specific origin for check in type");
            isharesPage2.sharesCheckinTypesForSpecificOrigin(logInfo, CheckinType);
            logInfo.pass("I do checkin for Shares PNR with baggage with specific origin for check in type");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter *R command to display all the phone details entered")
    public void i_enter_R_QC_command_to_display_all_the_phone_details_entered() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *R command to display all the phone details entered");
            isharesPage2.displayPhoneDetails(logInfo);
            logInfo.pass("I enter *R command to display all the phone details entered");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QC command to display the count of PNR queue")
    public void i_enter_6_QC_command_to_display_the_count_of_PNR_queue() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QC command to display the count of PNR queue");
            isharesPage2.displayCountOfPNRQueue(logInfo);
            logInfo.pass("I enter QC command to display the count of PNR queue");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I set Class Of Service to {string}")
    public void i_set_Class_Of_Service(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set cos to " + COS);
            isharesPage2.setCOS(COS);
            logInfo.pass("I set cos to " + COS);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LAUTO_ command to display the current month auto list history")
    public void i_enter_6_LAUTO_command_to_display_the_current_month_auto_list_history() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LAUTO_ command to display the current month auto list history");
            isharesPage2.autoListHistoryCurrentMonth(logInfo);
            logInfo.pass("I enter 6:LAUTO_ command to display the current month auto list history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LAUTO_ command to display the previous month auto list history")
    public void i_enter_6_LAUTO_command_to_display_the_previous_month_auto_list_history() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LAUTO_ command to display the previous month auto list history");
            isharesPage2.autoListHistoryPreviousMonth(logInfo);
            logInfo.pass("I enter 6:LAUTO_ command to display the previous month auto list history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:BTAG_|ALL command to display all the bag tag numbers")
    public void i_enter_6_BTAG_ALL_command_to_display_all_the_bag_tag_numbers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:BTAG_|ALL command to display all the bag tag numbers");
            isharesPage2.displayBagTagNumbers(logInfo);
            logInfo.pass("I enter 6:BTAG_|ALL command to display all the bag tag numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CGS_ command to display the active remarks and verify the error")
    public void i_enter_6_CGS_command_to_display_the_active_remarks_and_verify_the_error() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CGS_ command to display the active remarks and verify the error");
            isharesPage2.displayActiveRemarksVerifyError(logInfo);
            logInfo.pass("I enter 6:CGS_ command to display the active remarks and verify the error");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:XP_XS command to display all the SSR and OSI remarks")
    public void i_enter_6_XP_XS_command_to_display_all_the_SSR_and_OSI_remarks() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:XP_XS command to display all the SSR and OSI remarks");
            isharesPage2.displaySSRAndOSIRemarks(logInfo);
            logInfo.pass("I enter 6:XP_XS command to display all the SSR and OSI remarks");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:XP_XS@_ command to modify the SSR and OSI remarks")
    public void i_enter_6_XP_XS_command_to_modify_the_SSR_and_OSI_remarks() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:XP_XS@_ command to modify the SSR and OSI remarks");
            isharesPage2.displayModifiedOSISSRRemarks(logInfo);
            logInfo.pass("I enter 6:XP_XS@_ command to modify the SSR and OSI remarks");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:XP_XS@_ command to display error using invalid fact number")
    public void i_enter_6_XP_XS_command_to_display_error_using_invalid_fact_number() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:XP_XS@_ command to display error using invalid fact number");
            isharesPage2.displayErrorUsingInvalidFactNumber(logInfo);
            logInfo.pass("I enter 6:XP_XS@_ command to display error using invalid fact number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:XP_XS@_ command to display error using invalid SSR")
    public void i_enter_6_XP_XS_command_to_display_error_using_invalid_SSR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:XP_XS@_ command to display error using invalid SSR");
            isharesPage2.displayErrorUsingInvalidSSR(logInfo);
            logInfo.pass("I enter 6:XP_XS@_ command to display error using invalid SSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADA* command to display the attribute table")
    public void i_enter_PADA_command_to_display_the_attribute_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADA* command to display the attribute table");
            isharesPage2.displayAttributeTable(logInfo);
            logInfo.pass("I enter PADA* command to display the attribute table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAP* command to display the seating code table")
    public void i_enter_PAP_command_to_display_the_seating_code_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAP* command to display the seating code table");
            isharesPage2.displaySeatingCodeTable(logInfo);
            logInfo.pass("I enter PAP* command to display the seating code table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAU* command to display the table items in ACI class upgrade table")
    public void i_enter_PAU_command_to_display_the_table_items_in_ACI_class_upgrade_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAU* command to display the table items in ACI class upgrade table");
            isharesPage2.displayACIUpgradeTable(logInfo);
            logInfo.pass("I enter PAU* command to display the table items in ACI class upgrade table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAG* command to display the group zone table")
    public void i_enter_PAG_command_to_display_the_group_zone_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAG* command to display the group zone table");
            isharesPage2.displayGroupZoneTable(logInfo);
            logInfo.pass("I enter PAG* command to display the group zone table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CK_ command to display the space available")
    public void i_enter_6CK_command_to_display_the_space_available() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CK_ command to display the space available");
            isharesPage2.displaySpaceAvailable(logInfo);
            logInfo.pass("I enter 6:CK_ command to display the space available");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_SL command to display standby list")
    public void i_enter_6LD_SL_command_to_display_standby_list() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_SL command to display standby list");
            isharesPage2.displayStandByList(logInfo);
            logInfo.pass("I enter 6:LD_SL command to display standby list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_SB command to display standby list for NRPS passenger")
    public void i_enter_6LD_SB_command_to_display_standby_list_for_NRPS_passenger() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_SB command to display standby list for NRPS passenger");
            isharesPage2.displayStandByListNRPS(logInfo);
            logInfo.pass("I enter 6:LD_SB command to display standby list for NRPS passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_TB command to display the FQTV list")
    public void i_enter_6LD_TB_command_to_display_the_FQTV_list() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_TB command to display the FQTV list");
            isharesPage2.displayFQTVList(logInfo);
            logInfo.pass("I enter 6:LD_TB command to display the FQTV list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|BUMP command to display the non-revenue standby bump list")
    public void i_enter_6LD_Bump_command_to_display_the_non_revenue_standby_bump_list() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|BUMP command to display the non-revenue standby bump list");
            isharesPage2.displayNRStandbyBumpList(logInfo);
            logInfo.pass("I enter 6:LD_|BUMP command to display the non-revenue standby bump list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ command to display the class of service")
    public void i_enter_6LD_command_to_display_the_class_of_service() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_ command to display the class of service");
            isharesPage2.displayClassOfService(logInfo);
            logInfo.pass("I enter 6:LD_ command to display the class of service");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*N_ command to display the non-revenue location seat map")
    public void i_enter_6_N_command_to_display_the_non_revenue_location_seat_map() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*N_ command to display the non-revenue location seat map");
            isharesPage2.displayNRLocationSeatMap(logInfo);
            logInfo.pass("I enter 6:*N_ command to display the non-revenue location seat map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|MT command to display the mass transfer entries")
    public void i_enter_6_LD_MT_command_to_display_the_mass_transfer_entries() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|MT command to display the mass transfer entries");
            isharesPage2.displayMassTransferEntries(logInfo);
            logInfo.pass("I enter 6:LD_|MT command to display the mass transfer entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CV_X1 command to initiate pre-flight close variance check sequence")
    public void i_enter_6_CV_X1_command_to_initiate_pre_flight_close_variance_check_sequence() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CV_X1 command to initiate pre-flight close variance check sequence");
            isharesPage2.initiatePreFlightClose(logInfo);
            logInfo.pass("I enter 6:CV_X1 command to initiate pre-flight close variance check sequence");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-*ALL command to display prime PCH table")
    public void i_enter_KT_T_ALL_command_to_display_prime_PCH_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-*ALL command to display prime PCH table");
            isharesPage2.displayPrimePCHTable(logInfo);
            logInfo.pass("I enter K-T-*ALL command to display prime PCH table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-*CM command to display PCH table")
    public void i_enter_K_T_CM_command_to_display_PCH_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-*CM command to display PCH table");
            isharesPage2.displayPCHTable(logInfo);
            logInfo.pass("I enter K-T-*CM command to display PCH table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-*HIS command to display the history of updates in PCH table")
    public void i_enter_K_T_HIS_command_to_display_the_history_of_updates_in_PCH_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-*HIS command to display the history of updates in PCH table");
            isharesPage2.displayHistoryOfUpdatesInPCHTable(logInfo);
            logInfo.pass("I enter K-T-*HIS command to display the history of updates in PCH table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-INITSPAD command to do the initialization of scratch pad")
    public void i_enter_K_T_INITSPAD_command_to_do_the_initialization_of_scratch_pad() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-INITSPAD command to do the initializaion of scratch pad");
            isharesPage2.initializationOfScratchPad(logInfo);
            logInfo.pass("I enter K-T-INITSPAD command to do the initialization of scratch pad");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-*SPAD command to display scratch pad")
    public void i_enter_K_T_SPAD_command_to_display_scratch_pad() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-*SPAD command to display scratch pad");
            isharesPage2.displayScratchPad(logInfo);
            logInfo.pass("I enter K-T-*SPAD command to display scratch pad");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZH_ command to display PNIS")
    public void i_enter_6_ZH_command_to_display_PNIS() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to display PNIS");
            isharesPage2.displayPNIS(logInfo);
            logInfo.pass("I enter 6:ZH_ command to display PNIS");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZH_ command to display PNIS after deleting the passenger")
    public void i_enter_6_ZH_command_to_display_PNIS_after_deleting_the_passenger() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to display PNIS after deleting the passenger");
            isharesPage2.displayPNISAfterDeletingPax(logInfo);
            logInfo.pass("I enter 6:ZH_ command to display PNIS after deleting the passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:FCB_ command to verify flight closure breakdown")
    public void i_enter_6_FCB_command_to_verify_flight_closure_breakdown() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:FCB_ command to verify flight closure breakdown");
            isharesPage2.flightClosureBreakdown(logInfo);
            logInfo.pass("I enter 6:FCB_ command to verify flight closure breakdown");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I have done auto fare quote for all the passengers in the PNR with {string}")
    public void iHaveDoneAutoFareQuoteForThePnr(String paymentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done auto fare quote for all the passengers in the PNR with " + paymentType);
            isharesPage2.addAutoFareQuoteforPNR(logInfo, paymentType);
            logInfo.pass(MarkupHelper.createLabel("I have done auto fare quote for all the passengers in the PNR with " + paymentType, ExtentColor.GREEN));

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I set PNR Type to {string}")
    public void iSetPNRType(String pnrType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set PNR Type to " + pnrType);
            isharesPage2.setpnrType(pnrType);
            logInfo.pass("I set PNR Type to " + pnrType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:Z*_ command to display SSR in hexadecimal")
    public void i_enter_6_Z_command_to_display_SSR_in_hexadecimal() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:Z*_ command to display SSR in hexadecimal");
            isharesPage2.displaySSRInHexadecimal(logInfo);
            logInfo.pass("I enter 6:Z*_ command to display SSR in hexadecimal");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZB_ command to display standby record")
    public void i_enter_6_ZB_command_to_display_standby_record() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZB_ command to display standby record");
            isharesPage2.displayStandByRecord(logInfo);
            logInfo.pass("I enter 6:ZB_ command to display standby record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_CRW command to display crew passengers")
    public void i_enter_6_LD_CRW_command_to_display_crew_passengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_CRW command to display crew passengers");
            isharesPage2.displayCrewPax(logInfo);
            logInfo.pass("I enter 6:LD_CRW command to display crew passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *AP1 command to display APIS of the crew passengers")
    public void i_enter_AP1_command_to_display_APIS_of_the_crew_passengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *AP1 command to display APIS of the crew passengers");
            isharesPage2.displayCrewPaxAPIS(logInfo);
            logInfo.pass("I enter *AP1 command to display APIS of the crew passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for first segment from {string} to {string} with different flight")
    public void i_search_for_flight_availability_special_pnr_different_flight(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for first segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSpecialPNRDifferentFlight(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of special pnr for first segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for first segment from {string} to {string} for waitlist pax")
    public void iSearchForFlightAvailabilityForFirstSegmentFromToForWaitlistPax(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for first segment for waitlist pax");
            isharesPage2.searchFlightAvailabilityForFirstSegForWaitlistPax(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for first segment for waitlist pax");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:C*_ command to display inbound connects")
    public void i_enter_6C_command_to_display_inbound_connects() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C*_ command to display inbound connects");
            isharesPage2.displayInboundConnects(logInfo);
            logInfo.pass("I enter 6:C*_ command to display inbound connects");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*H_ command to display the flight history")
    public void i_enter_6H_command_to_display_the_flight_history() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*H_ command to display the flight history");
            isharesPage2.displayFlightHistory(logInfo);
            logInfo.pass("I enter 6:*H_ command to display the flight history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_$PR1|U command to do checkin re-entry with upgrade code")
    public void i_enter_6_PR_1_U_command_to_do_checkin_re_entry_upgrade_code() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_$PR1|U command to do checkin re-entry with upgrade code");
            isharesPage2.checkInReentryWithUpgrade(logInfo);
            logInfo.pass("I enter 6_$PR1|U command to do checkin re-entry with upgrade code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZR_RECREATE command to perform recreation of seat selection")
    public void i_enter_6_ZR_RECREATE_command_to_perform_recreation_of_seat_selection() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZR_RECREATE command to perform recreation of seat selection");
            isharesPage2.performRecreationOfSeatSelection(logInfo);
            logInfo.pass("I enter 6:ZR_RECREATE command to perform recreation of seat selection");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_CRW command to display the crew record name list")
    public void i_enter_6_LD_command_to_display_the_crew_record_name_list() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_CRW command to display the crew record name list");
            isharesPage2.crewRecordNameList(logInfo);
            logInfo.pass("I enter 6:LD_CRW command to display the crew record name list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET_ command to display all the tickets in the PNR")
    public void i_enter_ET_command_to_display_all_the_tickets_in_the_PNR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_ command to display all the tickets in the PNR");
            isharesPage2.displayTickets(logInfo);
            logInfo.pass("I enter *ET_ command to display all the tickets in the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ALL_ET command to display all the e-ticketed passengers")
    public void i_enter_6_LD_ALL_ET_command_to_display_all_the_e_ticketed_passengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ALL/ET command to display all the e-ticketed passengers");
            isharesPage2.displayTicketedPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|ALL/ET command to display all the e-ticketed passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:SS_SET_ command to display TSSR")
    public void i_enter_C_SS_SET_command_to_display_TSSR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:SS_SET_ command to display TSSR");
            isharesPage2.displayTSSR(logInfo);
            logInfo.pass("I enter C:SS_SET_ command to display TSSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD|ALL_ETD command to display e-ticketed passengers to final destination")
    public void i_enter_6_LD_ALL_ETD_command_to_display_e_ticketed_passengers_to_final_destination() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD|ALL_ETD command to display e-ticketed passengers to final destination");
            isharesPage2.displayETKTPaxToFinalDestination(logInfo);
            logInfo.pass("I enter 6:LD|ALL_ETD command to display e-ticketed passengers to final destination");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|INF command to display INF passengers in ACI name list")
    public void i_enter_6_LD_INF_command_to_display_INF_passengers_in_ACI_name_list() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|INF command to display INF passengers in ACI name list");
            isharesPage2.displayINF(logInfo);
            logInfo.pass("I enter 6:LD_|INF command to display INF passengers in ACI name list");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|UMNR command to display UMNR in ACI name list")
    public void i_enter_6_LD_UMNR_command_to_display_UMNR_in_ACI_name_list() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|INF command to display UMNR in ACI name list");
            isharesPage2.displayUMNR(logInfo);
            logInfo.pass("I enter 6:LD_|INF command to display UMNR in ACI name list");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set startdate to {string} for Segment {string}")
    public void i_set_start_date(String Startdate, String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set start date to " + Startdate);
            isharesPage2.setStartDate(index, Startdate);
            logInfo.pass("I set start date to " + Startdate);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I set Airline to {string} for Segment {string}")
    public void i_set_airline(String Airline, String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set airline to " + Airline);
            isharesPage2.setAirline(SegmentNumber, Airline);
            logInfo.pass("I set COS to " + Airline);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for first segment for today from {string} to {string}")
    public void iSearchForFlightAvailabilityOfSpecialPnrForFirstSegmentForTodayFromTo(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for first segment for today from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSpecialPNRForToday(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of special pnr for first segment for today from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I search for flight availability for second segment from {string} to {string}")
    public void i_search_for_flight_availability_second_segment(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for second segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSecondSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for second segment from " + origin + " to " + destination);
            System.out.println("I search for flight availability for second segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for third segment from {string} to {string}")
    public void i_search_for_flight_availability_third_segment(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for third segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForThirdSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for third segment from " + origin + " to " + destination);
            System.out.println("I search for flight availability for third segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for fourth segment from {string} to {string}")
    public void i_search_for_flight_availability_fourth_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for fourth segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForFourthSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for fourth segment from " + origin + " to " + destination);
            System.out.println("I search for flight availability for fourth segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for fifth segment from {string} to {string}")
    public void i_search_for_flight_availability_fifth_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for fifth segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForFifthSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for fifth segment from " + origin + " to " + destination);
            System.out.println("I search for flight availability for fifth segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for sixth segment from {string} to {string}")
    public void i_search_for_flight_availability_sixth_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for sixth segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSixthSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for sixth segment from " + origin + " to " + destination);
            System.out.println("I search for flight availability for sixth segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for first segment from {string} to {string}")
    public void i_search_for_flight_availability_special_pnr_first_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for first segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSpecialPNR(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of special pnr for first segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for second segment from {string} to {string}")
    public void i_search_for_flight_availability_special_pnr_second_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for second segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSpecialPNRForSecondSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of special pnr for second segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for third segment from {string} to {string}")
    public void i_search_for_flight_availability_special_pnr_third_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for third segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSpecialPNRForThirdSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of special pnr for third segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for fourth segment from {string} to {string}")
    public void i_search_for_flight_availability_special_pnr_fourth_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for fourth segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSpecialPNRForFourthSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of special pnr for fourth segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add Group name to the PNR")
    public void i_add_group_name() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Group name to the PNR");
            isharesPage2.addGroupName(logInfo);
            logInfo.pass("I add Group name to the PNR");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I run the Agent action during manual entry")
    public void i_run_the_agent_action_during_manual_entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the Agent action during manual entry");
            isharesPage2.addAgentActionDuringManualEntry(logInfo);
            logInfo.pass("I run the Agent action during manual entry");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *R command to display the PNR details")
    public void I_enter_R_command_to_display_the_PNR_details() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *R command to display the PNR details");
            isharesPage2.enter_R(logInfo);
            logInfo.pass("I enter *R command to display the PNR details");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the OSI Fact SHARES entries")
    public void I_Run_the_OSI_Fact_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the OSI Fact SHARES entries");
            isharesPage2.osi_Fact_SHARES_Entries(logInfo);
            logInfo.pass("I run the OSI Fact SHARES entries");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KIS command for {string} and {string}")
    public void I_enter_KIS_command(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KIS command for " + origin + " and " + destination);
            isharesPage2.enterKIS(origin, destination, logInfo);
            logInfo.pass("I enter KIS command for " + origin + " and " + destination);

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set the POS to {string} for TAR")
    public void i_set_the_POS_for_TAR(String pos) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change POS to " + pos + " for TAR");
            isharesPage2.setPosForTAR(logInfo, pos);
            logInfo.pass("I change POS to " + pos + " for TAR");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter wrong commands D1@AA_BB and D8*9*12 for divide party action")
    public void i_enter_wrong_commands_for_divide_party_action() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter wrong commands D1@AA_BB and D8*9*12 for divide party action");
            isharesPage2.enterWrongCmdsForDividePartyAction(logInfo);
            logInfo.pass("I enter wrong commands D1@AA_BB and D8*9*12 for divide party action");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter wrong commands for segment number and arrival time")
    public void I_enter_wrong_commands_for_segment_number_and_arrival_time() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter wrong commands for segment number and arrival time");
            isharesPage2.enterWrongCmdsForArrivalTimeAndSegNo(logInfo);
            logInfo.pass("I enter wrong commands for segment number and arrival time");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN command to display a Range of Items")
    public void i_enter_KN_display_range_of_items() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN command to display a Range of Items");
            isharesPage2.displayRangeOfItems(logInfo);
            logInfo.pass("I enter KN command to display a Range of Items");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN command to display all items for a flight")
    public void i_enter_KN_display_all_items_of_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN command to display all items for a flight");
            isharesPage2.displayAllItemsOfFlight(logInfo);
            logInfo.pass("I enter KN command to display all items for a flight");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 8TL0 command to run the no Check-In time limit")
    public void i_enter_8TL0_run_no_checkin_time_limit() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 8TL0 command to run the no Check-In time limit");
            isharesPage2.runNoCheckinTimeLimit(logInfo);
            logInfo.pass("I enter 8TL0 command to run the no Check-In time limit");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7T_IA*12345678*TEX command to display the Time Limit defined for portion")
    public void i_enter_7T_TEX_display_time_limit_defined_for_portion() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7T_IA*12345678*TEX command to display the Time Limit defined for portion");
            isharesPage2.displayTimeLimitForPortion(logInfo);
            logInfo.pass("I enter 7T_IA*12345678*TEX command to display the Time Limit defined for portion");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7T_TC*016211519235671*TEXT command to display the Time Limit defined for portion")
    public void i_enter_7T_TEXT_display_time_limit_defined_for_portion() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7T_TC*016211519235671*TEXT command to display the Time Limit defined for portion");
            isharesPage2.display7T_TEXTEntrie(logInfo);
            logInfo.pass("I enter 7T_TC*016211519235671*TEXT command to display the Time Limit defined for portion");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_PD command to display the PD agent")
    public void i_enter_6_PD_display_pd_segment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_PD command to display the PD agent");
            isharesPage2.displayPDSegment(logInfo);
            logInfo.pass("I enter 6_PD command to display the PD agent");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set Destination city {string}")
    public void i_set_Destination_city(String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set Destination city to " + Destination);
            isharesPage2.setDestinationCity(Destination);
            logInfo.pass("I set Destination city to " + Destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set origin city {string}")
    public void i_set_origin_city(String OriginCity) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set origin city to " + OriginCity);
            isharesPage2.setOriginCity(OriginCity);
            logInfo.pass("I set origin city to " + OriginCity);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set Destination city {string} for segment {string}")
    public void i_set_Destination_city_for_sepcific_segment(String DestinationCity, String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set Destination city to " + DestinationCity + " for segmentIndex " + segmentIndex);
            isharesPage2.setDestinationCityForSpecificSegment(DestinationCity, segmentIndex);
            logInfo.pass("I set Destination city to " + DestinationCity + " for segmentIndex " + segmentIndex);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set origin city {string} for segment {string}")
    public void i_set_origin_city_for_sepcific_segment(String OriginCity, String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set origin city to " + OriginCity + " for segmentIndex " + segmentIndex);
            isharesPage2.setOriginCityForSpecificSegment(OriginCity, segmentIndex);
            logInfo.pass("I set origin city to " + OriginCity + " for segmentIndex " + segmentIndex);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST command to check the entire TEC Record with the item added at the end with carrier code {string}")
    public void i_check_enter_TEC_record(String CarrierCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST command to check the entire TEC Record with the item added at the end");
            isharesPage2.displayTECRecord(logInfo, CarrierCode);
            logInfo.pass("I enter Q*COHOST command to check the entire TEC Record with the item added at the end");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter SSR command for ssr type {string}")
    public void i_enter_SSR_command(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR command for ssr type " + SSRType);
            isharesPage2.addSSR(logInfo, SSRType);
            logInfo.pass("I enter SSR command for ssr type " + SSRType);

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *R command to display SSRs")
    public void i_enter_R_QC_command_to_display_ssr() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *R command to display ssr");
            isharesPage2.displaySSRDetails(logInfo);
            logInfo.pass("I enter *R command to display ssr");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command *FLTNUM_DATEORG-FNAME for numbered name list SHARES entries")
    public void I_run_the_numbered_name_list_SHARES_entries() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command *FLTNUM/DATEORG-FNAME for numbered name list SHARES entries");
            isharesPage2.addNumberedNameListCommand(logInfo);
            logInfo.pass("I enter command *FLTNUM/DATEORG-FNAME for numbered name list SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter RATS* command to get the LNIATA, POS and other details")
    public void I_enter_RATS_command_to_get_the_LNIATA_POS_and_other_details() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter RATS* command to get the LNIATA, POS and other details");
            isharesPage2.enter_RATS(logInfo);
            logInfo.pass("I enter RATS* command to get the LNIATA, POS and other details");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTA_LAX_6666SJ_GS*Q*_ to add an AQP monitored agent sine to CST shares entries")
    public void I_enter_BTA_LAX_6666SJ_GSQ_to_add_an_AQP_monitored_agent_sine_to_CST_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTA/LAX/6666SJ/GS*Q*_ to add an AQP monitored agent sine to CST shares entries");
            isharesPage2.addAQPMonitoredAgentSine(logInfo);
            logInfo.pass("I enter BTA/LAX/6666SJ/GS*Q*_ to add an AQP monitored agent sine to CST shares entries");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ * AUC command for nightly seat allocation or AUC update run status display")
    public void I_enter_KJ_AUC_command_for_nightly_seat_allocation_or_AUC_update_run_status_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ * AUC command for nightly seat allocation or AUC update run status display");
            isharesPage2.AUCUpdateRunStatusDisplay(logInfo);
            logInfo.pass("I enter KJ * AUC command for nightly seat allocation or AUC update run status display");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MCT* command to display the MCT record for airport codes {string} {string}")
    public void I_enter_MCT_command_to_display_the_MCT_record_for_airport_codes(String airportCode1, String airportCode2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MCT* command to display the MCT record for airport codes");
            isharesPage2.displayMCTRecord(logInfo, airportCode1, airportCode2);
            logInfo.pass("I enter MCT* command to display the MCT record for airport codes");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter the commands to display the PNR queue")
    public void I_enter_R_commands_to_display_the_PNR_queue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the commands to display the PNR queue");
            isharesPage2.displayPNRQueue(logInfo);
            logInfo.pass("I enter the commands to display the PNR queue");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the commands to display minimum connect times for {string}")
    public void I_enter_the_commands_to_display_minimum_connect_times_for(String airportCity) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the commands to display minimum connect times");
            isharesPage2.displayMinimumConnectTimes(logInfo, airportCity);
            logInfo.pass("I enter the commands to display minimum connect times");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I rebook the segment {string} with the new class of service")
    public void I_rebook_the_segment_with_the_new_class_of_service(String segmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook the segment with the new class of service");
            isharesPage2.rebookTheSegmentWithNewCOS(logInfo, segmentNumber);
            logInfo.pass("I rebook the segment with the new class of service");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ACK command to display OA record locator confirmation")
    public void I_enter_ACK_command_to_display_OA_record_locator_confirmation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ACK command to display OA record locator confirmation");
            isharesPage2.displayOARecordLocatorConfirmation(logInfo);
            logInfo.pass("I enter *ACK command to display OA record locator confirmation");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter VIF_ command to display the legs and booking compartments")
    public void I_enter_VIF_command_to_display_the_legs_and_booking_compartments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIF_ command to display the legs and booking compartments");
            isharesPage2.displayLegsAndBookingCompartments(logInfo);
            logInfo.pass("I enter VIF_ command to display the legs and booking compartments");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter TTY message to generate pnr for system {string}")
    public void i_enter_TTY_message_to_generate_basic_airline_segment(String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage2.TTYMessageBasicAirlinePnr(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add {string} NRSA passengers")
    public void I_select_NRSA(String NRSACount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add NRSA passengers");
            System.out.println("I add NRSA passengers");
            isharesPage2.addNRSA(NRSACount);
            logInfo.pass("I add NRSA passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I add {string} NRPS passengers")
    public void I_select_NRPS(String NRSACount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add NRPS passengers");
            isharesPage2.addNRPS(NRSACount);
            System.out.println("I add NRPS passengers");
            logInfo.pass("I add NRPS passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add {string} frequent flyer passengers")
    public void iAddFrequentFlyerPassengers(String noOfFQTVPax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + noOfFQTVPax + " frequent flyer passengers");
            isharesPage2.addFQTV(noOfFQTVPax);
            logInfo.pass("I add " + noOfFQTVPax + " frequent flyer passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I first change the status code of {string} to UN and then to RR")
    public void i_first_change_the_status_code_of_segment_to_UN_and_then_to_RR(String segmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I first change the status code of " + segmentNumber + "to UN and then to RR");
            isharesPage2.changeStatusToUNAndToRR(logInfo, segmentNumber);
            logInfo.pass("I first change the status code of " + segmentNumber + " to UN and then to RR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I first change the status code of {string} to UN and then to WL in negative scenario")
    public void i_first_change_the_status_code_of_segment_to_UN_and_then_to_WL(String segmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I first change the status code of " + segmentNumber + "then to WL in negative scenario");
            isharesPage2.changeStatusToUNAndToWLNegativeScenario(logInfo, segmentNumber);
            logInfo.pass("I first change the status code of " + segmentNumber + "then to WL in negative scenario");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter *H for showing History")
    public void i_enter_H_for_history() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *H for showing History");
            isharesPage2.enter_HForHistory(logInfo);
            logInfo.pass("I enter *H for showing History");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter invalid entry {string}")
    public void i_enter_H_for_history(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid entry " + entry);
            isharesPage2.enterInvalidEntry(entry, logInfo);
            logInfo.pass("I enter invalid entry " + entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I run the 7T_ commands to obtain ticket by different means")
    public void I_run_the_7T_commands_to_obtain_ticket_by_different_means() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the 7T_ commands to obtain ticket by different means");
            isharesPage2.obtainTicketByDifferentMeans(logInfo);
            logInfo.pass("I run the 7T_ commands to obtain ticket by different means");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }

    }

    @And("I enter KJ RECALC_ command to re-calculate seat allocations")
    public void I_enter_KJ_RECALC_command_to_recalculate_seat_allocations() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ RECALC_ command to re-calculate seat allocations");
            isharesPage2.recalculateSeatAllocations(logInfo);
            logInfo.pass("I enter KJ RECALC_ command to re-calculate seat allocations");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }

    }

    @And("I change the status codes of the two segments {string} and {string} to UN and RR respectively")
    public void I_change_the_status_codes_of_the_two_segments_and_to_UN_and_RR_respectively(String segmentNumber1, String segmentNumber2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the status codes of the two segments to UN and RR respectively");
            isharesPage2.changeStatusForTwoSegmentsToUNAndToRR(logInfo, segmentNumber1, segmentNumber2);
            logInfo.pass("I change the status codes of the two segments to UN and RR respectively");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }

    }

    @And("I enter MCA_ command to add minimum connect time")
    public void I_enter_MCA_command_to_add_minimum_connect_time() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MCA_ command to add minimum connect time");
            isharesPage2.addMinimumConnectTime(logInfo);
            logInfo.pass("I enter MCA_ command to add minimum connect time");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate pnr for system {string} with arrival and departure time")
    public void i_enter_TTY_message_to_generate_basic_airline_segment_Arrival_departure(String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment with arrival and departure time");
            isharesPage2.TTYMessageBasicAirlinePnrArrivalDepart(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate basic airline segment with arrival and departure time");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter QC command to Count a pnr Queue")
    public void I_enter_QC_Command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter QC command to Count a pnr Queue");
            isharesPage2.enter_QC_Command(logInfo);
            System.out.println(" I enter QC command to Count a pnr Queue");
            logInfo.pass(" I enter QC command to Count a pnr Queue");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter KN command to display all items for a specific date")
    public void I_enter_KN_Command_Display_all_items_specific_date() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN command to display all items for a specific date");
            isharesPage2.enter_KN_Command(logInfo);
            System.out.println("I enter KN command to display all items for a specific date");
            logInfo.pass("I enter KN command to display all items for a specific date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter MCS command to add or modify standard minimum connect time")
    public void I_enter_MCS_Command_to_add_standard_connect_time() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MCS command to add or modify standard minimum connect time");
            isharesPage2.enter_MCS_Command(logInfo);
            System.out.println("I enter MCS command to add or modify standard minimum connect time");
            logInfo.pass("I enter MCS command to add or modify standard minimum connect time");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter BSIB0003MD_RC-KIWI1703 command to change duty code to RC")
    public void I_change_duty_code_RC() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSIB0003MD_RC-KIWI1703 command to change duty code to RC");
            isharesPage2.changeDutyCode(logInfo);
            System.out.println("I enter BSIB0003MD_RC-KIWI1703 command to change duty code to RC");
            logInfo.pass("I enter BSIB0003MD_RC-KIWI1703 command to change duty code to RC");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter VIM command to display the inventory history")
    public void i_enter_vim_command_to_display_inventory_history() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIM command to display the inventory history");
            System.out.println("I enter VIM command to display the inventory history");
            isharesPage2.displayInventoryHistory(logInfo);
            logInfo.pass("I enter VIM command to display the inventory history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I check for multiple downline time limit")
    public void i_check_multiple_downline_time_limit() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check for multiple downline time limit");
            isharesPage2.displayMultipleTimeLimit(logInfo);
            System.out.println("I check for multiple downline time limitry");
            logInfo.pass("I check for multiple downline time limit");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*NLAB*RESTORE_ABORT to abort shell pnr entries")
    public void i_abort_shell_pnr_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*NLAB*RESTORE_ABORT to abort shell pnr entries");
            isharesPage2.abortShellPnrENtries(logInfo);
            System.out.println("I enter OCM*NLAB*RESTORE_ABORT to abort shell pnr entries");
            logInfo.pass("I enter OCM*NLAB*RESTORE_ABORT to abort shell pnr entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 0CAR entrie to run car rental entries")
    public void i_run_car_rental_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0CAR entrie to run car rental entries");
            isharesPage2.runCarRentalEntrie(logInfo);
            System.out.println("I enter 0CAR entry to run car rental entries");
            logInfo.pass("I enter 0CAR entry to run car rental entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I check flight status for status type {string}")
    public void I_check_flight_status_for_onTime(String StatusType) {

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check flight status for status type " + StatusType);
            isharesPage2.checkFlightStatus(logInfo, StatusType);
            System.out.println("I check flight status for status type " + StatusType);
            logInfo.pass("I check flight status for status type " + StatusType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter queue related agent entry for {string}")
    public void I_enter_queue_related_agent_entry(String market) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter queue related agent entry for" + market);
            isharesPage2.queueRelatedAgentEntry(logInfo, market);
            logInfo.pass("I enter queue related agent entry for" + market);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter Q*COHOST-D_ command to delete TEC Record with the item added at the end with carrier code {string}")
    public void i_delete_TEC_record(String CarrierCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST-D_ command to delete TEC Record with the item added at the end with carrier code " + CarrierCode);
            isharesPage2.deleteTECRecord(logInfo, CarrierCode);
            logInfo.pass("I enter Q*COHOST-D_ command to delete TEC Record with the item added at the end with carrier code " + CarrierCode);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command Q_ to display from queue from market {string} for queue number {string}")
    public void i_enter_command_Q_to_display_from_market(String market, String queueNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command Q_ to display from queue from market " + market + " for " + queueNo);
            isharesPage2.enterQ_ToRetrievePNRFromQueue(logInfo, market, queueNo);
            logInfo.pass("I enter command Q_ to display from queue from market " + market + " for " + queueNo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I rebook the segment {string} with the new Date")
    public void I_rebook_the_segment_with_the_new_Date(String date) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook the segment with the new Date");
            isharesPage2.rebookTheSegmentWithNewDate(logInfo, date);
            logInfo.pass("I rebook the segment with the new Date");
        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command CEC_ to decode city name from code{string}")
    public void i_enter_command_CEC_to_decode_city_name_from_code(String code) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter command CEC_ to decode city name " + code);
            isharesPage2.enterCEC_ToDecodeCityName(logInfo, code);
            logInfo.pass("I enter command CEC_ to decode city name " + code);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter auxilliary service for service indentifier {string} for action code {string} for pax no {string} with {string} for segment {string}")
    public void i_enter_command_CEC_to_decode_city_name_from_code(String serviceIdentifier, String actionCode, String passengerNumber, String additionalInfo, String segmentNo) {
        try {
            String details = "I enter auxilliary service for service indentifier " + serviceIdentifier + " for action code " + actionCode + " for pax no " + passengerNumber + " with " + additionalInfo;
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), details);
            isharesPage2.addAuxilliaryService(logInfo, serviceIdentifier, actionCode, passengerNumber, additionalInfo, segmentNo);
            logInfo.pass(details);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PBR_ command to run the passenger boarding recap")
    public void i_enter_PBR_command_to_run_passenger_boarding_recap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBR_ command to run the passenger boarding recap");
            System.out.println("I enter PBR_ command to run the passenger boarding recap");
            isharesPage2.enterPBR_ToRunPassengerBoardingRecap(logInfo);
            logInfo.pass("I enter PBR_ command to display run the passenger boarding recap");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CEC_ command to run ENCODE AIRPORT SHARES entries for {string}")
    public void I_enter_CEC_command_to_run_ENCODE_AIRPORT_SHARES_entries(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CEC_ command to run ENCODE AIRPORT SHARES entries");
            isharesPage2.enterCEC_EncodeAirportEntries(logInfo, city);
            logInfo.pass("I enter CEC_ command to run ENCODE AIRPORT SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIBE command for teletype address")
    public void I_enter_PIBE_command_for_teletype_address() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIBE command for teletype address");
            isharesPage2.enterPIBE(logInfo);
            logInfo.pass("I enter PIBE command for teletype address");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *RMK and *FON for displaying remark items and get wrong response")
    public void I_enter_RMK_FON_for_displaying_remark_items() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *RMK and *FON for displaying remark items and get wrong response");
            isharesPage2.displayRemarkItems(logInfo);
            logInfo.pass("I enter *RMK and *FON for displaying remark items and get wrong response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KDP command to display local time")
    public void I_enter_KDP_command_to_display_local_time() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KDP command to display local time");
            isharesPage2.enterKDPToDisplayLocalTime(logInfo);
            logInfo.pass("I enter KDP command to display local time");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KDP_ command to display local time for market {string}")
    public void I_enter_KDP_command_to_display_local_time_for_market(String market) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KDP_ command to display local time for market" + market);
            isharesPage2.enterKDPToDisplayLocalTime(logInfo, market);
            logInfo.pass("I enter KDP_ command to display local time for market" + market);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KDP_ command to display {string} time for {string}")
    public void I_enter_KDP_command_to_display_format_time_for_specific_time(String timeFormat, String time) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KDP_ command to display " + timeFormat + " time for " + time);
            isharesPage2.enterKDPToDisplayLocalTime(logInfo, timeFormat, time);
            logInfo.pass("I enter KDP_ command to display " + timeFormat + " time for " + time);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to perform modify flight {string} for system type {string}")
    public void I_check_flight_status_for_onTime(String FlightModificationType, String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to perform modify flight " + FlightModificationType + "for system type" + SystemType);
            isharesPage2.TTYMessageToModifyFlight(logInfo, FlightModificationType, SystemType);
            System.out.println("I enter TTY message to perform modify flight " + FlightModificationType + "for system type" + SystemType);
            logInfo.pass("I enter TTY message to perform modify flight " + FlightModificationType + "for system type" + SystemType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter KL to the display selectivity record maintenance")
    public void I_enter_KL_to_display_selectivity_record_maintenance() {

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KL to the display selectivity record maintenance");
            isharesPage2.displaySelectivityRecord(logInfo);
            System.out.println("I enter KL to the display selectivity record maintenance");
            logInfo.pass("I enter KL to the display selectivity record maintenance");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter KN command to display all items containing some part of a date Range")
    public void I_enter_KN_ToDisplay_iteam_in_range() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN command to display all items containing some part of a date Range");
            isharesPage2.displayItemsInRange(logInfo);
            System.out.println("I enter KN command to display all items containing some part of a date Range");
            logInfo.pass("I enter KN command to display all items containing some part of a date Range");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter LD command to display alphabetized expanded special function name")
    public void I_enter_LD_command_display_alphabetized_expanded() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to display alphabetized expanded special function name");
            isharesPage2.displayAlphabetizedExpandedSpecial(logInfo);
            System.out.println("I enter LD command to display alphabetized expanded special function name");
            logInfo.pass("I enter LD command to display alphabetized expanded special function name");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 2N command to perform agent entry elements for flight progress information")
    public void I_enter_2N_command_to_perform_agent_entry_elemets_for_flight_progress() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2N command to perform agent entry elements for flight progress information");
            System.out.println("I enter 2N command to perform agent entry elements for flight progress information");

            isharesPage2.displayAgentEntryElementsForFlightProgressInformation(logInfo);
            logInfo.pass("I enter 2N command to perform agent entry elements for flight progress information");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 2N command to perform agent entry elements for airport cancellation")
    public void I_enter_2N_command_to_perform_agent_entry_elemets_for_airport_cancellation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2N command to perform agent entry elements for airport cancellation");
            System.out.println("I enter 2N command to perform agent entry elements for flight progress information");

            isharesPage2.displayAgentEntryElementsForAirportCancellation(logInfo);
            logInfo.pass("I enter 2N command to perform agent entry elements for airport cancellation");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter 2P command to perform agent entry elements for flight progress information")
    public void I_enter_2P_command_to_peform_agent_entry_elemts_for_flight_progress() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform agent entry elements for flight progress information");
            System.out.println("I enter 2P command to perform agent entry elements for flight progress information");

            isharesPage2.displayAgentEntryForFlightProgressInformation(logInfo);
            logInfo.pass("I enter 2P command to perform agent entry elements for flight progress information");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I open the flight for first segment")
    public void i_Open_Flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open the flight for first segment");
            isharesPage2.openFlight(logInfo);
            logInfo.pass("I open flight for first segment");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }


    @Then("I rebook the Segment in a new Class of Service and new date for segment number {string}")
    public void rebookSegmentWithNewCOSAndDate(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook the Segment in a new Class of Service and new date for segment number " + SegmentNumber);
            isharesPage2.rebookWithNewCOSAndNewDate(logInfo, SegmentNumber);
            logInfo.pass("I rebook the Segment in a new Class of Service and new date for segment number " + SegmentNumber);

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @Then("I enter KT command to Printout All System Schedules")
    public void enter_KT_to_prinout_all_system_schedules() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT command to Printout All System Schedules");
            isharesPage2.enterKTPrintoutAllSchedules(logInfo);
            logInfo.pass("I enter KT command to Printout All System Schedules");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 0HTL command to run hotel entries")
    public void i_run_htl_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0HTL command to run hotel entries");
            System.out.println("I enter 0HTL command to run hotel entries");
            isharesPage2.runHTLEntrie(logInfo);
            logInfo.pass("I enter 0HTL command to run hotel entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MCX_DELETE command to delete minimum connect times")
    public void i_enter_MCX_to_delete_connect_times() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MCX_DELETE command to delete minimum connect times");
            System.out.println("I enter MCX_DELETE command to delete minimum connect times");
            isharesPage2.deleteMinimumConnectTimes(logInfo);
            logInfo.pass("I enter MCX_DELETE command to delete minimum connect times");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBT_S command to display passenger boarding totals summary")
    public void i_enter_PBT_S_to_display_passenger_summary() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBT_S command to display passenger boarding totals summary");
            System.out.println("I enter PBT_S command to display passenger boarding totals summary");
            isharesPage2.displayPassenegrBoardingSummary(logInfo);
            logInfo.pass("I enter PBT_S command to display passenger boarding totals summary");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN_DFT command to display profile control default record")
    public void i_enter_KN_DFT_to_display_profile_control_record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN*DFT command to display profile control default record");
            System.out.println("I enter KN*DFT command to display profile control default record ");
            isharesPage2.displayProfileControlDefaultRecord(logInfo);
            logInfo.pass("I enter KN*DFT command to display profile control default record ");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN command to display all items of date Range")
    public void I_enter_KN_ToDisplay_iteam_in_date_range() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN command to display all items of date Range");
            System.out.println("I enter KN command to display all items of date Range");

            isharesPage2.displayItemsInRangeofDates(logInfo);
            logInfo.pass("I enter KN command to display all items of date Range");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter LD command to check TEDA pnr")
    public void I_enter_LD_command_to_check_TEDA_pnr() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to check TEDA pnr");
            System.out.println("I enter LD command to check TEDA pnr");

            isharesPage2.displayItemsInRangeofDates(logInfo);
            logInfo.pass("I enter LD command to check TEDA pnr");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 2R command for flifo restricted conditions")
    public void I_enter_2R_command_for_flifo_restricted_conditions() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2R command for flifo restricted conditions");
            System.out.println("I enter 2R command for flifo restricted conditions");

            isharesPage2.flifoFlightRestrict(logInfo);
            logInfo.pass("I enter 2R command for flifo restricted conditions");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 2X command to cancel air return")
    public void I_enter_2X_command_to_cancel_air_return() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2X command to cancel air return");
            System.out.println("I enter 2X command to cancel air return");

            isharesPage2.cancelAirReturn(logInfo);
            logInfo.pass("I enter 2X command to cancel air return");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 2P command to perform agent entry format to enter or update the air return events")
    public void I_enter_2P_command_to_peform_agent_entry_update_air_return_events() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform agent entry format to enter or update the air return events");
            System.out.println("I enter 2P command to perform agent entry format to enter or update the air return events");

            isharesPage2.updateAirEntryEvents(logInfo);
            logInfo.pass("I enter 2P command to perform agent entry format to enter or update the air return events");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter PBI command to display Passenger Boarding Information")
    public void i_enter_PBT_S_to_display_Passenger_Boarding_Information() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBI command to display Passenger Boarding Information");
            System.out.println("I enter PBI command to display Passenger Boarding Information");
            isharesPage2.displayPassenegrBoardingInformation(logInfo);
            logInfo.pass("I enter PBI command to display Passenger Boarding Information");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I delete the segment {string} and check if there are more segments to delete {string}")
    public void I_delete_the_segment_and_check_if_there_are_more_segments_to_delete(String segment, String moreToDelete) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the segment and check if there are more segments to delete");
            System.out.println("I delete the segment and check if there are more segments to delete");
            isharesPage2.deleteSegments(logInfo, segment, moreToDelete);
            logInfo.pass("I delete the segment and check if there are more segments to delete");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BSIB command for signing in")
    public void i_enter_BSIB() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSIB command for signing in");
            isharesPage2.enter_BSIA(logInfo);
            logInfo.pass("I enter BSIB command for signing in");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter LD command to display users of gate return and air return event")
    public void I_enter_LD_command_to_display_users_of_gate_return() {

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to display users of gate return and air return event");

            isharesPage2.enter_LD_Command_to_display_gate_and_air_events(logInfo);
            logInfo.pass("I enter LD command to display users of gate return and air return event");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I retrieve the pnr")
    public void I_retrieve_pnr() {

        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the pnr");
            isharesPage2.retrievePnr(logInfo);
            logInfo.pass("I retrieve the pnr");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter B_CM command for signing in CM airline")
    public void i_enter_BS_CM() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BS_CM command for signing in CM airline");
            isharesPage2.enter_B_CM(logInfo);
            logInfo.pass("I enter BS_CM command for signing in CM airline");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter B_UA command for signing in UA airline")
    public void i_enter_BS_UA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BS_UA command for signing in UA airline");
            isharesPage2.enter_B_UA(logInfo);
            logInfo.pass("I enter BS_UA command for signing in UA airline");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2D command to run agent entry for decision messages")
    public void i_enter_2D_to_run_descision_messages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2D command to run agent entry for decision messages");
            isharesPage2.displayAgentEntryForDescisionMessage(logInfo);
            logInfo.pass("I enter 2D command to run agent entry for decision messages");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I rearrange the segments {string} with out pnr")
    public void iRearrangeTheTegments(String RearrangeSegNo) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rearrange the segments");

            isharesPage2.reArrangeSegmentsWithoutPnr(logInfo, RearrangeSegNo);
            logInfo.pass("I rearrange the segments");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 8TL30 command to run the no Check-In time limit")
    public void i_enter_8TL30_run_no_checkin_time_limit() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 8TL30 command to run the no Check-In time limit");
            isharesPage2.enter8TL30Command(logInfo);
            logInfo.pass("I enter 8TL30 command to run the no Check-In time limit");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter $- command to check teda fares entries")
    public void iEnter$CommandToCheckTedaFaresEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $- command to check teda fares entries");
            isharesPage2.enter_$_teda_fares_entries(logInfo);
            logInfo.pass("I enter $- command to check teda fares entries");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7T_ command to run the ticketed pnr")
    public void iEnter7T_OKCommandToRunTheTicketedPnr() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7T_ command to run the ticketed pnr");
            isharesPage2.enter_7T_Ticket_pnr(logInfo);
            logInfo.pass("I enter 7T_ command to run the ticketed pnr");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C_ON command")
    public void iEnterC_ON() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enterC_ON command");
            isharesPage2.i_enter_C_OFF(logInfo);
            logInfo.pass("I enterC_ON command");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VM command to run the mass modify segment")
    public void iEnterVMCommandToRunTheMassModifySegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VM command to run the mass modify segment");
            isharesPage2.i_enter_VM_to_run_mass_modifications(logInfo);
            logInfo.pass("I enter VM command to run the mass modify segment");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add SU duty code")
    public void I_add_SU_duty_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add SU duty code");

            isharesPage2.changeSuDutyCode(logInfo);
            logInfo.pass("I add SU duty code");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PXI command to run database build entry")
    public void iEnterPXICommandToRunDatabaseBuildEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PXI command to run database build entry");

            isharesPage2.enter_PXI_to_run_database_build_entry(logInfo);
            logInfo.pass("I enter PXI command to run database build entry");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BSO_20 command to get invalid response")
    public void iEnterBSO_CommandToGetInvalidResponse() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSO_20 command to get invalid response");

            isharesPage2.enter_BSO_20(logInfo);
            logInfo.pass("I enter BSO_20 command to get invalid response");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter multiple special name elements")
    public void iEnter_multiple_special_names() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter multiple special name elements");

            isharesPage2.enterMultipleSpecialNames(logInfo);
            logInfo.pass("I enter multiple special name elements");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ City Queue for items deleted through schedule change")
    public void iEnterKJCityQueueForItemsDeletedThroughScheduleChange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter multiple special name elements");

            isharesPage2.enterKJ_displayDeletedItems(logInfo);
            logInfo.pass("I enter multiple special name elements");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add an entry to the segment profile control default record")
    public void I_add_an_entry_to_the_segment_profile_control_default_record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add an entry to the segment profile control default record");
            System.out.println("I add an entry to the segment profile control default record");
            isharesPage2.addEntryToSegProfileCtrlRecord(logInfo);
            logInfo.pass("I add an entry to the segment profile control default record");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to interchange the non-existing segment numbers and validate the error response")
    public void I_enter_command_to_interchange_the_non_existing_segment_numbers_and_validate_the_error_response() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to interchange the non-existing segment numbers and validate the error response");
            System.out.println("I enter command to interchange the non-existing segment numbers and validate the error response");
            isharesPage2.interchangeNonExistingSegNumbers(logInfo);
            logInfo.pass("I enter command to interchange the non-existing segment numbers and validate the error response");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ * VALID command to display the seat allocation profile item validation status")
    public void I_enter_KJ_VALID_command_to_display_the_seat_allocation_profile_item_validation_status() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ * VALID command to display the seat allocation profile item validation status");
            isharesPage2.seatAllocProfileItemValidation(logInfo);
            logInfo.pass("I enter KJ * VALID command to display the seat allocation profile item validation status");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QC_ALL command to display the PNR queue for different cities")
    public void I_enter_QC_ALL_command_to_display_the_PNR_queue_for_different_cities() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QC_ALL command to display the PNR queue for different cities");
            isharesPage2.displayPNRQueueForDifferentCities(logInfo);
            logInfo.pass("I enter QC_ALL command to display the PNR queue for different cities");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QEP command to place the PNR in the queue at index {string}")
    public void I_enter_QEP_command_to_place_the_PNR_in_the_queue(String indexNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QEP command to place the PNR in the queue");
            isharesPage2.placePNRInTheQueue(logInfo, indexNumber);
            logInfo.pass("I enter QEP command to place the PNR in the queue");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QC_ALL command to display the PNRs in the queue")
    public void I_enter_QC_ALL_command_to_display_the_PNRs_in_the_queue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QC_ALL command to display the PNRs in the queue");
            isharesPage2.displayThePNRsInTheQueue(logInfo);
            logInfo.pass("I enter QC_ALL command to display the PNRs in the queue");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QEM command to add a message to the general message queue and I validate the added message")
    public void I_enter_QEM_command_to_add_a_message_to_the_general_message_queue_and_I_validate_the_added_message() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QEM command to add a message to the general message queue and I validate the added message");
            isharesPage2.addMessageToGeneralMsgQueue(logInfo);
            logInfo.pass("I enter QEM command to add a message to the general message queue and I validate the added message");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QES command to add a message to the supervisory message queue and I validate the added message")
    public void I_enter_QES_command_to_add_a_message_to_the_supervisory_message_queue_and_I_validate_the_added_message() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QES command to add a message to the supervisory message queue and I validate the added message");
            isharesPage2.addMessageToSupervisoryMsgQueue(logInfo);
            logInfo.pass("I enter QES command to add a message to the supervisory message queue and I validate the added message");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter *QH command to check the queue history")
    public void I_enter_QH_command_to_check_the_queue_history() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *QH command to check the queue history");
            isharesPage2.displayQueueHistory(logInfo);
            logInfo.pass("I enter *QH command to check the queue history");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the PNR details using flight number, date of travel and passenger name")
    public void I_retrieve_the_PNR_details_using_flight_number_date_of_travel_and_passenger_name() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the PNR details using flight number, date of travel and passenger name");
            isharesPage2.retrievePNRDetails(logInfo);
            logInfo.pass("I retrieve the PNR details using flight number, date of travel and passenger name");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT command to show IATA City Code Address table for city {string}")
    public void I_enter_PIAT_command_to_show_IATA_CIty_Code_Address_table_for_city(String market) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT command to show IATA CIty Code Address table for " + market);
            isharesPage2.enterPIATToSowAddressTable(logInfo, market);
            logInfo.pass("I enter PIAT command to show IATA CIty Code Address table for " + market);


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run maintenance entries add_delete_update")
    public void I_run_maintenance_entries_add_delete_update() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run maintenance entries add_delete_update");
            isharesPage2.runMaintenanceEntries(logInfo);
            logInfo.pass("I run maintenance entries add_delete_update");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add same surname to {string} passengers")
    public void I_add_same_surname_to_passengers(String paxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add same surname to " + paxCount + " passengers");
            isharesPage2.addSameSurnameToPax(logInfo, paxCount);
            logInfo.pass("I add same surname to " + paxCount + " passengers");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter passenger details with same surname")
    public void I_enter_passenger_details_for_same_surname_pax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details with same surname");
            isharesPage2.enterPassengerDetailsForSameSurnamePax(logInfo);
            System.out.println("I enter passenger details with same surname");
            logInfo.pass("I enter passenger details with same surname");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command LD_ to display function name list by class of service")
    public void i_enter_command_LD_to_display_function_name_list_by_class_of_service() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command LD_ to display function name list by class of service");
            isharesPage2.displayFunctionNameListByClass(logInfo);
            System.out.println("I enter command LD_ to display function name list by class of service");
            logInfo.pass("I enter command LD_ to display function name list by class of service");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command CEC_year to add sri shares entries{string}")
    public void i_enter_command_CEC_year_to_add_sri_shares_entries(String year) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command CEC_year to add sri shares entries" + year);
            isharesPage2.addSRISharesEntries(logInfo, year);
            System.out.println("I enter command CEC_year to add sri shares entries");
            logInfo.pass("I enter command CEC_year to add sri shares entries" + year);


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command KSSES to display extra section flights")
    public void i_enter_command_KSSES_to_display_extra_section_flights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command KSSES to display extra section flights");
            isharesPage2.displayExtraSectionFlights(logInfo);
            System.out.println("I enter command KSSES to display extra section flights");
            logInfo.pass("I enter command KSSES to display extra section flights");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command VC_ to create detail inventory record")
    public void i_enter_command_VC_to_create_detail_inventory_record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter command VC_ to create detail inventory record");
            isharesPage2.createDetailInventoryRecord(logInfo);
            System.out.println("I enter command VC_ to create detail inventory record");
            logInfo.pass("I enter command VC_ to create detail inventory record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command CEC_delete to delete sri shares entries")
    public void i_enter_command_CEC_delete_to_delete_sri_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command CEC_delete to delete sri shares entries");
            isharesPage2.deleteSRISharesEntries(logInfo);
            System.out.println("I enter command CEC_delete to delete sri shares entries");
            logInfo.pass("I enter command CEC_delete to delete sri shares entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CET_ command to run ENCODE Country Code SHARES entries for {string}")
    public void I_enter_CET_command_to_run_ENCODE_Counrty_Code_SHARES_entries(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CET_ command to run ENCODE Country Code SHARES entries");
            isharesPage2.enterCET_EncodeCountryCode(logInfo, city);
            logInfo.pass("I enter CET_ command to run ENCODE Country Code SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KE*WKG to check working list")
    public void I_enter_KE_WKG_to_check_working_list() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KE*WKG to check working list");
            isharesPage2.enter_KE_WKG_Working_list(logInfo);
            logInfo.pass("I enter KE*WKG to check working list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KE*RDY to check ready list")
    public void I_enter_KE_RDY_to_check_ready_list() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KE*RDY to check ready list");
            isharesPage2.enter_KE_RDY_Ready_list(logInfo);
            logInfo.pass("I enter KE*RDY to check ready list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KS_FCT to display schedule facts entries")
    public void I_enter_KS_FCT_display_schedule_facts_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KS_FCT to display schedule facts entries");
            isharesPage2.enter_KS_FCT(logInfo);
            logInfo.pass("I enter KS_FCT to display schedule facts entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KSFCT_ALL_ALL to display schedule facts entries")
    public void I_enter_KSFCT_ALL_ALL_display_all_schedule_facts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KSFCT/ALL/ALL to display schedule facts entries");
            isharesPage2.enter_KSFCT_ALL_ALL(logInfo);
            logInfo.pass("I enter KSFCT/ALL/ALL to display schedule facts entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter .T command to run schedule fact entry")
    public void I_enter_T_schedule_facts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter .T command to run schedule fact entry");
            isharesPage2.enter_T_schedule_facts(logInfo);
            logInfo.pass("I enter .T command to run schedule fact entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN*S command to display flight list")
    public void iEnterKNSCommandToDisplayFlightList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN*S command to display flight list");
            isharesPage2.enter_KN_S(logInfo);
            logInfo.pass("I enter KN*S command to display flight list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN_S_A command to add flight date range and display flight list")
    public void iEnterKN_S_ACommandToaddRange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN_S_A command to add flight date range and display flight list");
            isharesPage2.enter_KN_S_A(logInfo);
            logInfo.pass("I enter KN_S_A command to add flight date range and display flight list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KK command to display valid output for reconciliation")
    public void iEnterKKCommandToDisplayValidOutputForReconciliation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KK command to display valid output for reconciliation");
            isharesPage2.enter_KK_display_valid_output(logInfo);
            logInfo.pass("I enter KK command to display valid output for reconciliation");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter multiple ABS Retrieve Deal commands and validated valid response")
    public void iEnterMultipleABSRetrieveDealCommandsAndValidatedValidResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter multiple ABS Retrieve Deal commands and validated valid response");
            isharesPage2.multipleABSCmd(logInfo);
            logInfo.pass("I enter multiple ABS Retrieve Deal commands and validated valid response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 8TL615P command to run the no Check-In time limit")
    public void iEnterMultipleTLCommandToRunTheNoCheckInTimeLimit() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 8TL615P command to run the no Check-In time limit");
            isharesPage2.multiple8TLCmds(logInfo);
            logInfo.pass("I enter 8TL615P command to run the no Check-In time limit");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN_DUPFLT command to duplicate a segment profile control record")
    public void iEnterKN_DUPFLTCommandToDuplicateASegmentProfileControlRecord() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN_DUPFLT command to duplicate a segment profile control record");
            isharesPage2.KN_DUPFLTToDuplicateSegmentProfileControlRecord(logInfo);
            logInfo.pass("I enter KN_DUPFLT command to duplicate a segment profile control record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ * QCTY_VALID command to display the queue city for validation messages")
    public void iEnterKJQCTY_VALIDCommandToDisplayTheQueueCityForValidationMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ * QCTY_VALID command to display the queue city for validation messages");
            isharesPage2.KJQCTY_VALID_Display_QueueCity_Validation_Messages(logInfo);
            logInfo.pass("I enter KJ * QCTY_VALID command to display the queue city for validation messages");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter JA command to display using social security number {string}")
    public void i_enter_JA_command_display_social_security_number(String FFnumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter JA command to display using social security number " + FFnumber);
            isharesPage2.displaySocialSecurityNumber(logInfo, FFnumber);
            System.out.println("I enter JA command to display using social security number " + FFnumber);
            logInfo.pass("I enter JA command to display using social security number " + FFnumber);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change COS to {string} for the segment {string}")
    public void iChangeCOSToForTheSegment(String COS, String SegmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change COS to " + COS + " for the segment " + SegmentNo);
            System.out.println("I change COS to " + COS + " for the segment " + SegmentNo);
            isharesPage2.changeCOS(logInfo, COS, SegmentNo);
            logInfo.pass("I change COS to " + COS + " for the segment " + SegmentNo);


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QCM command to display queue list for the origin")
    public void iEnterQCMCommandToDisplayQueueListForTheOrigin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QCM command to display queue list for the origin");
            System.out.println("I enter QCM command to display queue list for the origin");
            isharesPage2.checkQueueList(logInfo);
            logInfo.pass("I enter QCM command to display queue list for the origin");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add queue to queue list using command QEM and validate updated queue count using QCM_Last command")
    public void iAddQueueToQueueListUsingCommandQEMAndValidateUpdatedQueueCountUsingQCMCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add queue to queue list using command QEM and validate updated queue count using QCM_Last command");
            System.out.println("I add queue to queue list using command QEM and validate updated queue count using QCM_Last command");
            isharesPage2.addQueueToQueueList(logInfo);
            logInfo.pass("I add queue to queue list using command QEM and validate updated queue count using QCM_Last command");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A command to check availabilty and checked hidden flight data using A*0 command")
    public void iEnterACommandToCheckAvailabiltyAndCheckedHiddenFlightDataUsingACommand() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A command to check availability and checked hidden flight data using A*0 command");
            isharesPage2.checkAvailabilityWithHiddenData(logInfo);
            System.out.println("I enter A command to check availability and checked hidden flight data using A*0 command");
            logInfo.pass("I enter A command to check availability and checked hidden flight data using A*0 command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter RC command to display agent start display command")
    public void iEnterRCCommandToDisplayAgentStartDisplayCommandForOrigin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter RC command to display agent start display command for origin ");
            isharesPage2.displayAgentStartDisplayReport(logInfo);
            logInfo.pass("I enter RC command to display agent start display command for origin ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KL entry to display Prioritization for Airline code")
    public void I_enterKL_entry_to_display_priotitization_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KL entry to display Prioritization for Airline code");
            isharesPage2.KL_EntryToDisplayPrioritizationCode(logInfo);
            logInfo.pass("I enter KL entry to display Prioritization for Airline code");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A* command to display more flights in the availability")
    public void I_enter_A_command_to_display_more_flights_in_the_availability() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A* command to display more flights in the availability");
            isharesPage2.enter_A_ForMoreFltAvailability(logInfo);
            logInfo.pass("I enter A* command to display more flights in the availability");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add the passenger name, phone details and save and retrieve the PNR using one command")
    public void I_add_the_passenger_name_phone_details_and_save_and_retrieve_the_PNR_using_one_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the passenger name, phone details and save and retrieve the PNR using one command");
            isharesPage2.addPaxNamePhoneDetails(logInfo);
            logInfo.pass("I add the passenger name, phone details and save and retrieve the PNR using one command");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *RMK, *FON, *SSR and *OSI for displaying remark items and I validate error response")
    public void I_enter_RMK_FON_SSR_OSI_for_displaying_remark_items_and_I_validate_error_response() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *RMK, *FON, *SSR and *OSI for displaying remark items and I validate error response");
            isharesPage2.displayRemarkItemsAndValidateError(logInfo);
            logInfo.pass("I enter *RMK, *FON, *SSR and *OSI for displaying remark items and I validate error response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QB* command to display the queue table")
    public void I_enter_QB_command_to_display_the_queue_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QB* command to display the queue table");
            isharesPage2.displayQueueTable(logInfo);
            logInfo.pass("I enter QB* command to display the queue table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QB_ command to initiate the transfer of the PNR queue from {string} to {string} for a specific date")
    public void I_enter_QB_command_to_initiate_the_transfer_of_the_PNR_queue_from_to_for_a_specific_date(String city1, String city2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QB_ command to initiate the transfer of the PNR queue from one city to another for a specific date");
            isharesPage2.transferPNRQueueForSpecificDate(logInfo, city1, city2);
            logInfo.pass("I enter QB_ command to initiate the transfer of the PNR queue from one city to another for a specific date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QB_ command to initiate the transfer of the PNR queue from {string} to {string} for a date range")
    public void I_enter_QB_command_to_initiate_the_transfer_of_the_PNR_queue_from_to_for_a_date_range(String city1, String city2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QB_ command to initiate the transfer of the PNR queue from one city to another for a date range");
            isharesPage2.transferPNRQueueForADateRange(logInfo, city1, city2);
            logInfo.pass("I enter QB_ command to initiate the transfer of the PNR queue from one city to another for a date range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QAT_ command to transfer the PNR queue from {string} to {string} and from a particular queue number")
    public void I_enter_QAT_command_to_transfer_the_PNR_queue_from_to_for_and_from_a_particular_queue_number(String city1, String city2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QAT_ command to transfer the PNR queue from one city to another from a particular queue number");
            isharesPage2.transferPNRQFromAParticularQNumber(logInfo, city1, city2);
            logInfo.pass("I enter QAT_ command to transfer the PNR queue from one city to another and from a particular queue number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QAT_ command to transfer the PNR queue from {string} from a particular queue number to another queue number")
    public void I_enter_QAT_command_to_transfer_the_PNR_queue_from_a_particular_queue_number_to_another_queue_number(String city1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QAT_ command to transfer the PNR queue from a particular queue number to another queue number");
            isharesPage2.transferPNRQFromAndToAParticularQNumber(logInfo, city1);
            logInfo.pass("I enter QAT_ command to transfer the PNR queue from a particular queue number to another queue number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QAT_ command to transfer the group or corporate PNR queue from {string} to {string} for a date range")
    public void I_enter_QAT_command_to_transfer_the_group_or_corporate_PNR_queue_from_to_for_a_date_range(String city1, String city2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QAT_ command to transfer the group or corporate PNR queue from one city to another for a date range");
            isharesPage2.transferGrpOrCorporatePNRQueue(logInfo, city1, city2);
            logInfo.pass("I enter QAT_ command to transfer the group or corporate PNR queue from one city to another for a date range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter QA_ABORT command to abort the on-going PNR queue transfer")
    public void I_enter_QA_ABORT_command_to_abort_the_on_going_queue_transfer() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QA/ABORT command to abort the on-going PNR queue transfer");
            isharesPage2.abortTheOnGoingQueueTransfer(logInfo);
            logInfo.pass("I enter QA/ABORT command to abort the on-going PNR queue transfer");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter D_ command to divide the PNR using the number of passengers to divide {string}")
    public void I_enter_D_command_to_divide_the_PNR_using_the_number_of_passengers_to_divide(String noOfPaxToDivide) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter D_ command to divide the PNR using the number of passengers to divide");
            isharesPage2.dividePNRUsingPaxNumberToDivide(logInfo, noOfPaxToDivide);
            logInfo.pass("I enter D_ command to divide the PNR using the number of passengers to divide");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the history in O & D SHARES entries for flight {string} and market {string}")
    public void I_run_the_history_in_O_and_D_SHARES_entries(String flight, String market) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the history in O & D SHARES entries");
            isharesPage2.runHistoryOAndDShares(logInfo, flight, market);
            logInfo.pass("I run the history in O & D SHARES entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I first change the status code of {string} to UN and then to XK for {string}")
    public void i_first_change_the_status_code_of_segment_to_UN_and_then_to_XK(String segmentNumber1, String segmentNumber2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I first change the status code of " + segmentNumber1 + " to UN and then to XK for " + segmentNumber2);
            isharesPage2.changeStatusToUNAndToXK(logInfo, segmentNumber1, segmentNumber2);
            logInfo.pass("I first change the status code of " + segmentNumber1 + " to UN and then to XK for " + segmentNumber2);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter *R command to get NO NAMES as response")
    public void I_enter_R_command_to_get_No_Names() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *R command to get NO NAMES as response");
            isharesPage2.enter_R_No_Names(logInfo);
            logInfo.pass("I enter *R command to get NO NAMES as response");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change segment status for segment {string} to status {string}")
    public void I_enter_R_command_to_get_No_Names(String segmentNumber, String segmentStatus) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change segment status for segment " + segmentNumber + " to status " + segmentStatus);
            isharesPage2.changeStatusOfSegment(logInfo, segmentNumber, segmentStatus);
            logInfo.pass("I change segment status for segment " + segmentNumber + " to status " + segmentStatus);

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command QSD_ to run Queue file maintenance for {string}")
    public void i_enter_command_QSD_to_run_Queue_file_maintenance_for(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command QSD_ to run Queue file maintenance for");
            System.out.println("I enter command QSD_ to run Queue file maintenance for");
            isharesPage2.runQueueFileMaintenance(logInfo, city);
            logInfo.pass("I enter command QSD_ to run Queue file maintenance for" + city);


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VILA_ command to display AVS leg section SHARES entries")
    public void i_enter_VILA_command_to_display_AVS_leg_section_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VILA_ command to display AVS leg section SHARES entries");
            System.out.println("I enter VILA_ command to display AVS leg section SHARES entries");
            isharesPage2.displayAVSLegSectionEntries(logInfo);
            logInfo.pass("I enter VILA_ command to display AVS leg section SHARES entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD_ command to display consolidated Flight name list {string}")
    public void i_enter_LD_command_to_display_consolidated_flight_name_list(String connectingCity) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD_ command to display consolidated Flight name list");
            System.out.println("I enter LD_ command to display consolidated Flight name list " + connectingCity);
            isharesPage2.displayConsolidatedFlightNameList(logInfo, connectingCity);
            logInfo.pass("I enter LD_ command to display consolidated Flight name list");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML_JSA command to display Leg Header SHARES entries for set Number of Jumpseats Authorized{string}")
    public void i_enter_VML_JSA_command_to_display_Leg_Header_SHARES_entries_for_set_Number_of_Jumpseats_Authorized(String setNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter VML_JSA command to display Leg Header SHARES entries for set Number of Jumpseats Authorized");
            System.out.println("I enter VML_JSA command to display Leg Header SHARES entries for set Number of Jumpseats Authorized " + setNumber);
            isharesPage2.displayLegHeaderSharesEntriesForSetNumber(logInfo, setNumber);
            logInfo.pass("I enter VML_JSA command to display Leg Header SHARES entries for set Number of Jumpseats Authorized");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML_ON command to turn ON Leg Header SHARES entries in Transformed SHARES{string}")
    public void i_enter_VML_ON_command_to_trun_ON_Leg_Header_SHARES_entries_in_Transformed_SHARES(String indicator) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter VML_ON command to turn ON Leg Header SHARES entries in Transformed SHARES");
            System.out.println("I enter VML_ON command to turn ON Leg Header SHARES entries in Transformed SHARES " + indicator);
            isharesPage2.turnONLegHeaderEntriesinTransformedShares(logInfo, indicator);
            logInfo.pass("I enter VML_ON command to turn ON Leg Header SHARES entries in Transformed SHARES");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML_OFF command to turn OFF Leg Header SHARES entries in Transformed SHARES{string}")
    public void i_enter_VML_OFF_command_to_turn_OFF_Leg_Header_SHARES_entries_in_Transformed_SHARES(String indicator) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter VML_OFF command to turn OFF Leg Header SHARES entries in Transformed SHARES");
            System.out.println("I enter VML_OFF command to turn OFF Leg Header SHARES entries in Transformed SHARES " + indicator);
            isharesPage2.turnOFFLegHeaderEntriesinTransformedShares(logInfo, indicator);
            logInfo.pass("I enter VML_OFF command to turn OFF Leg Header SHARES entries in Transformed SHARES");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter XK_ command to Reduce number in party for Airline Space SHARES entries{string}")
    public void i_enter_XK_command_to_Reduce_number_in_party_for_Airline_space_SHARES_entries(String segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter XK_ command to Reduce number in party for Airline Space SHARES entries");
            System.out.println("I enter XK_ command to Reduce number in party for Airline Space SHARES entries " + segment);
            isharesPage2.reduceNumberInParty(logInfo, segment);
            logInfo.pass("I enter XK_ command to Reduce number in party for Airline Space SHARES entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ_QCTY to display City Queue for items deleted through schedule change")
    public void i_EnterKJ_QCTY_to_display_CityQueueForItemsDeletedThroughScheduleChange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ_QCTY to display City Queue for items deleted through schedule change ");
            isharesPage2.enterKJ_QCTYdisplayCityforDeletedItems(logInfo);
            logInfo.pass("I enter KJ_QCTY to display City Queue for items deleted through schedule change");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VGARA command to retrive account master records")
    public void I_enter_VGARA_command_to_retrieve_account_masterrecords() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VGARA command to retrive account master records");
            isharesPage2.retriveAccountMasterRecords(logInfo);
            logInfo.pass("I enter VGARA command to retrieve account master records");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I run the partial marriage cancellation commands")
    public void I_run_the_partial_marriage_cancellation_commands() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the partial marriage cancellation commands");
            isharesPage2.partialMarriageCancellation(logInfo);
            logInfo.pass("I run the partial marriage cancellation commands");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter VG_ command to display Declining an allocation request CAR and INC")
    public void I_enter_VG_command_to_display_Declining_an_allocation_request_CAR_and_INC() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VG_ command to display Declining an allocation request CAR and INC");
            isharesPage2.DeclininganAllocationRequestCarandInc(logInfo);
            logInfo.pass("I enter VG_ command to display Declining an allocation request CAR and INC");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the commands to retrieve account master records")
    public void I_enter_the_commands_to_retrieve_account_master_records() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the commands to retreive account master records");
            isharesPage2.retrieveFirstWorkRecordPending(logInfo);
            logInfo.pass("I enter the commands to retrieve account master records");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*R reverse command")
    public void I_enter_A_Reverse_command() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*R command to display the reverse available ");
            isharesPage2.reverseAvailability(logInfo);
            logInfo.pass("I enter A*R command to see reverse availability");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter VIA command to modify the availability remarks")
    public void I_enter_VIA_command_to_modify_the_availability_remarks() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIA command to modify the availability remarks");
            isharesPage2.displayModifyAvailability(logInfo);
            logInfo.pass("I enter VIA command to modify the availability remarks");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter VIE command to modify the availability remarks")
    public void I_enter_VIE_command_to_modify_the_availability_remarks() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIA command to modify the availability remarks");
            isharesPage2.displayFullRecordForInspectionPurpose(logInfo);
            logInfo.pass("I enter VIE command to modify the availability remarks");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I search for a specific flight {string} and book it for segment {string}")
    public void I_search_for_a_specific_flight_and_book_it(String flight, String segmentIndex) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for a specific flight and book it for segment index " + segmentIndex);
            isharesPage2.bookSpecificFlightforSingleSegment(logInfo, flight, segmentIndex);
            logInfo.pass("I search for a specific flight and book it for segment index " + segmentIndex);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I search for flight availability between {string} and {string} with new command")
    public void I_search_for_flight_availability_between_origin_and_destination(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability between " + origin + " and " + destination + " with new command");
            isharesPage2.srchFlightAvailability(logInfo, origin, destination);
            logInfo.pass("I search for flight availability between " + origin + " and " + destination + " with new command");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I book the flight from row number {string} by providing the segment status {string}")
    public void I_book_a_flight_by_providing_the_segment_status(String row, String status) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I book the flight from row number " + row + " by providing the segment status as " + status);
            isharesPage2.enterCommandtoBookFlight(logInfo, status, row);
            logInfo.pass("I book the flight from row number " + row + " by providing the segment status as " + status);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 2_ command to get the information of flight {string} for a particular date")
    public void i_enter_2_command_to_get_the_information_of_flight_for_a_particular_date(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to get the information of flight " + flight + " for a particular date");
            isharesPage2.getFLIFOForAParticularDate(logInfo, flight);
            logInfo.pass("I enter 2_ command to get the information of flight " + flight + " for a particular date");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBI Entry for CM FLIFO IN PBI")
    public void i_Enter_PBI_Entry_for_CM_FLIFO_IN_PBI() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBI Entry for CM FLIFO IN PBI");
            isharesPage2.Enter_PBI_Entry_for_CM_FLIFO_IN_PBI(logInfo);
            logInfo.pass("I enter PBI Entry for CM FLIFO IN PBI");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBI Entry for Run the PBI Manifest Display for users of Gate Return and Air Return Events in FLIFO")
    public void i_enter_PBI_Entry_for_Run_the_PBI_Manifest_Display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBI Entry for Run the PBI Manifest Display for users of Gate Return and Air Return Events in FLIFO");
            isharesPage2.Enter_PBI_Entry_for_CM_FLIFO_IN_PBI(logInfo);
            logInfo.pass("I enter PBI Entry for Run the PBI Manifest Display for users of Gate Return and Air Return Events in FLIFO");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the command time increment factor commands")
    public void i_enter_command_time_increment_factor_commands() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the command time increment factor commands");
            isharesPage2.Run_the_command_time_increment_factor_commands(logInfo);
            logInfo.pass("I run the command time increment factor commands");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Flag Stop Restrictions SHARES entry {string}")
    public void i_enter_Flag_Stop_Restrictions_SHARES_entry(String newOrigin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Flag Stop Restrictions SHARES entry");
            isharesPage2.flag_Stop_Restrictions_SHARES_entry(logInfo, newOrigin);
            logInfo.pass("I enter Flag Stop Restrictions SHARES entry");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for Market Segment Display for A")
    public void iEnterCommandForMarketSegmentDisplayForA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Market Segment Display for A");
            isharesPage2.getDisplayMarketSegment(logInfo);
            logInfo.pass("I enter command for Market Segment Display for A");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for HEADER DISP shares entries")
    public void iEnterCommandForHEADERDISPSharesEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for HEADER DISP shares entries");
            isharesPage2.getHeaderDispSharesEntries(logInfo);
            logInfo.pass("I enter command for HEADER DISP shares entries");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for Modify Leg or Class AVS Notification")
    public void iEnterCommandForModifyLegOrClassAVSNotification() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Modify Leg or Class AVS Notification");
            isharesPage2.getDisplayModifiedClassLegOrAVSNotification(logInfo);
            logInfo.pass("I enter command for Modify Leg or Class AVS Notification");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_*Z command to get the information of a particular flight")
    public void i_enter_2_to_get_the_information_of_a_particular_flight_with_end_z() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_*Z command to get the information of a particular flight");
            isharesPage2.getFLIFOEndWithZ(logInfo);
            logInfo.pass("I enter 2_*Z command to get the information of a particular flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_*H command to get the information of a particular flight")
    public void i_enter_2_to_get_the_information_of_a_particular_flight_with_end_h() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_*H command to get the information of a particular flight");
            isharesPage2.getFLIFOEndWithH(logInfo);
            logInfo.pass("I enter 2_*H command to get the information of a particular flight");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the Bundle Long Sell for Married Segment")
    public void Bundle_Long_Sell_for_Married_Segment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the Bundle Long Sell for Married Segment");
            isharesPage2.BundleLongSellforMarriedSegment(logInfo);
            logInfo.pass("I run the Bundle Long Sell for Married Segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter SCH QUEUE Table Shares entries")
    public void I_enter_SCH_QUEUE_Table_Shares_entries() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SCH QUEUE Table Shares entries");
            isharesPage2.verifySCHQueueTable(logInfo);
            logInfo.pass("I enter SCH QUEUE Table Shares entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter VIL command to run the inventory display")
    public void I_enter_VIL_command_to_run_the_inventory_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIL command to run the inventory display");
            isharesPage2.inventoryDisplay(logInfo);
            logInfo.pass("I enter VIL command to run the inventory display");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I divide the pnr for passenger index {string}")
    public void iDivideThePnrForPassengerIndex(String PaxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I divide the pnr for passenger index " + PaxIndex);
            isharesPage2.dividePnr(logInfo, PaxIndex);
            logInfo.pass("I divide the pnr for passenger index " + PaxIndex);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $_ command to divide the ticketed pnr for passenger index {string}")
    public void iEnter$_CommandToDivideTheTicketedPnr(String TotalPaxToDivide) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_ command to divide the ticketed pnr ");
            isharesPage2.dividePnrAfterTicketing(logInfo, TotalPaxToDivide);
            logInfo.pass("I enter $_ command to divide the ticketed pnr");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter XI command to delete all the segments in the pnr")
    public void i_Enter_X_CommandToDeleteAllTheSegmentsInThePnr() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter XI command to delete all the segments in the pnr");
            isharesPage2.deletAllSegments(logInfo);
            logInfo.pass("I enter XI command to delete all the segments in the pnr");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate and save the ticket number")
    public void iValidateAndSaveTheTicketNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate and save the ticket number");
            isharesPage2.enterET1ForETKTUpdates(logInfo);
            logInfo.pass("I validate and save the ticket number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter *ET_ command for specific airline {string}")
    public void iEnterET_CommandForSpecificAirlineAndForSegmentNumber(String Airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_ command for specific airline ");

            isharesPage2.enterET_Command(logInfo, Airline);
            logInfo.pass("I enter *ET_ command for specific airline " + Airline);


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter manual farequote command for adult to display releasing locked fare Quotes using command FR and *FW")
    public void iEnterManualFarequoteCommandForAdultToDisplayReleasingLockedFareQuotesUsingCommandFRAndFW() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_ command to divide the ticketed pnr ");
            isharesPage2.displayReleasingFareQuote(logInfo);
            logInfo.pass("I enter $_ command to divide the ticketed pnr");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN command to diaplay numeric value for the MAX and MIN")
    public void iEnterKNCommandToDiaplayNumericValueForTheMAXAndMIN() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_ command to divide the ticketed pnr ");
            isharesPage2.displayMinAndMax(logInfo);
            logInfo.pass("I enter $_ command to divide the ticketed pnr");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN_A_DFT command to add flight date range and display flight list")
    public void iEnterenter_KN_A_DFTCommandToaddRange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN_A_DFT command to add flight date range and display flight list");
            isharesPage2.enter_KN_A_DFT(logInfo);
            logInfo.pass("I enter KN_A_DFT command to add flight date range and display flight list");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ_QCTY_EXCEPT_SAP command to display the queue city for validation messages")
    public void iEnterKJ_QCTY_EXCEPT_SAPCommandToDisplayTheQueueCityForValidationMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ_QCTY_EXCEPT_SAP command to display the queue city for validation messages");
            isharesPage2.KJ_QCTY_EXCEPT_SAP_Display_QueueCity_Validation_Messages(logInfo);
            logInfo.pass("I enter KJ_QCTY_EXCEPT_SAP command to display the queue city for validation messages");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD_ command to display expanded special function name list")
    public void iEnterLD_CommandToDisplayExpandedSpecialFunctionNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD_ command to display expanded special function name list");
            isharesPage2.displayExpandedSpecialFunctionNameList(logInfo);
            logInfo.pass("I enter LD_ command to display expanded special function name list");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KXD command to display invalid response for extra section")
    public void iEnterKXDCommandToDisplayInvalidResponseForExtraSection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KXD command to display invalid response for extra section");
            isharesPage2.enterKXDCommand(logInfo);
            logInfo.pass("I enter KXD command to display invalid response for extra section");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ_QCTY_EXCEPT command to display the queue city for validation messages")
    public void iEnterKJ_QCTY_EXCEPTCommandToDisplayTheQueueCityForValidationMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ_QCTY_EXCEPT command to display the queue city for validation messages");
            isharesPage2.KJ_QCTY_EXCEPT_Display_QueueCity_Validation_Messages(logInfo);
            logInfo.pass("I enter KJ_QCTY_EXCEPT command to display the queue city for validation messages");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PM command to add beverage and meal ordering")
    public void iEnterPMCommandToAddBeverageAndMealOrdering() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PM command to add beverage and meal ordering");
            isharesPage2.enter_PM_commands(logInfo);
            logInfo.pass("I enter PM command to add beverage and meal ordering");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for the availability for flights from {string} to {string} in different format")
    public void iSearchForTheAvailabilityForFlightsFromToInDifferentFormat(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability from " + origin + " to " + destination + "in different format");
            isharesPage2.searchFlightAvailabilityDifferentFormat(logInfo, origin, destination);
            logInfo.pass("I search for flight availability from " + origin + " to " + destination + "in different format");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD command to display reverse direct access")
    public void iEnterLDCommandToDisplayReverseDirectAccess() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to display reverse direct access");
            isharesPage2.displayReverseDirectAccess(logInfo);
            logInfo.pass("I enter LD command to display reverse direct access");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter L* command")
    public void iEnterLCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter L* command");
            isharesPage2.enterLCommand(logInfo);
            logInfo.pass("I enter L* command");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET command to display all the tickets in the PNR")
    public void i_enter_ETCommand_to_display_all_the_tickets_in_the_PNR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET command to display all the tickets in the PNR");
            isharesPage2.displayTicketsInPnr(logInfo);
            logInfo.pass("I enter *ET command to display all the tickets in the PNR");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNL command to display passenger name list")
    public void iEnterPNLCommandToDisplayPassengerNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNL command to display passenger name list");
            isharesPage2.enterPNLCommand(logInfo);
            logInfo.pass("I enter PNL command to display passenger name list");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBT command")
    public void iEnterPBTCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBT command");
            isharesPage2.enterPBTCommand(logInfo);
            logInfo.pass("I enter PBT");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIH command")
    public void iEnterVIHCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIH command");
            isharesPage2.enterVIHCommand(logInfo);
            logInfo.pass("I enter VIH");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNX command")
    public void iEnterPNXCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNX command");
            isharesPage2.enterPNXCommand(logInfo);
            logInfo.pass("I enter PNX");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter multiple KMN commands forbBatching AVS for host flights")
    public void iEnterMultipleKMNCommandsForbBatchingAVSForHostFlights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter multiple KMN commands forbBatching AVS for host flights");
            isharesPage2.enter_KMN_commands(logInfo);
            logInfo.pass("I enter multiple KMN commands forbBatching AVS for host flights");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBT_D command to display passenger Board totals segments detail")
    public void iEnterPBT_DCommandToDisplayPassengerBoardTotalsSegmentsDetail() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBT_D command to display passenger Board totals segments detail");
            isharesPage2.enterPBT_DCommand(logInfo);
            logInfo.pass("I enter PBT_D command to display passenger Board totals segments detail");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBC command to display passenger inbound connect count")
    public void iEnterPBCCommandToDisplayPassengerInboundConnectCount() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBC command to display passenger inbound connect count");
            isharesPage2.enterPBCCommand(logInfo);
            logInfo.pass("I enter PBC command to display passenger inbound connect count");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIBER_LGW01 command for teletype address")
    public void I_enter_PIBER_LGW01_command_for_teletype_address() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIBER_LGW01 command for teletype address");
            isharesPage2.enterPIBE(logInfo);
            logInfo.pass("I enter PIBER_LGW01 command for teletype address");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVN command to display source items change replace")
    public void iEnterMVNCommandToDisplaySourceItemsChangeReplace() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVN command to display source items change replace");
            isharesPage2.enterMVN(logInfo);
            logInfo.pass("I enter MVN command to display source items change replace");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PMB_B command to display beverage ordering")
    public void iEnterPMB_BCommandToDisplayBeverageOrdering() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PMB_B command to display beverage ordering");
            isharesPage2.enterPMB_B(logInfo);
            logInfo.pass("I enter PMB_B command to display beverage ordering");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBI_O command to display PBI without SSR")
    public void iEnterPBICommandToDisplayPBIWithoutSSR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBI command to display PBI without SSR");
            isharesPage2.enterPBI_O(logInfo);
            logInfo.pass("I enter PBI command to display PBI without SSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PMO command to display Preliminary Meal Count")
    public void iEnterPMOCommandToDisplayPreliminaryMealCount() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PMO command to display Preliminary Meal Count");
            isharesPage2.enter_PMO_command(logInfo);
            logInfo.pass("I enter PMO command to display Preliminary Meal Count");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBI_U command to display PBI without unticketed passenger")
    public void iEnterPBI_UCommandToDisplayPBIWithoutUnticketedPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBI command to display PBI without SSR");
            isharesPage2.enterPBI_U(logInfo);
            logInfo.pass("I enter PBI command to display PBI without SSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter VMR_ command to modify inventory remarks")
    public void i_enter_VMR_command_to_modify_inventory_remarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMR_ command to modify inventory remarks");
            isharesPage2.modifyInventoryRemarks(logInfo);
            logInfo.pass("I enter VMR_ command to modify inventory remarks");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD_ command to display consolidated flight name list")
    public void i_enter_LD_command_to_display_consolidated_flight_name_list() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD_ command to display consolidated flight name list");
            isharesPage2.displayConsolidatedFlightNameList(logInfo);
            logInfo.pass("I enter LD_ command to display consolidated flight name list");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VGACTIVE and VGI_ commands to run the ABS assembly control record maintenance")
    public void I_enter_VGACTIVE_and_VGI_commands_to_run_the_ABS_assembly_control_record_maintenance() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VGACTIVE and VGI_ commands to run the ABS assembly control record maintenance");
            isharesPage2.assemblyControlRecordMaintenance(logInfo);
            logInfo.pass("I enter VGACTIVE and VGI_ commands to run the ABS assembly control record maintenance");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VBS_ command to display block space inventory history")
    public void I_enter_VBS_command_to_display_block_space_inventory_history() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VBS_ command to display block space inventory history");
            isharesPage2.displayBlockSpaceInventoryHistory(logInfo);
            logInfo.pass("I enter VBS_ command to display block space inventory history");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIS_ command to display the CM segments")
    public void I_enter_VIS_command_to_display_the_CM_segments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIS_ command to display the CM segments");
            isharesPage2.displayTheCMSegments(logInfo);
            logInfo.pass("I enter VIS_ command to display the CM segments");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 2F_ and 2D_ commands as replacement rules for forecast and decision messages")
    public void I_enter_2F_and_2D_commands_as_replacement_rules_for_forecast_and_decision_messages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2F_ and 2D_ commands as replacement rules for forecast and decision messages");
            isharesPage2.replacementRulesForForecastAndDecisionMsgs(logInfo);
            logInfo.pass("I enter 2F_ and 2D_ commands as replacement rules for forecast and decision messages");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_*H command to get the FLIFO history")
    public void i_enter_2_H_command_to_get_FLIFO_history() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_*H command to get the FLIFO history");
            isharesPage2.getFLIFOHistory(logInfo);
            logInfo.pass("I enter 2_*H command to get the FLIFO history");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QCS_ and QS_ commands for the TTR supervisory queue")
    public void I_enter_QCS_and_QS_commands_for_the_TTR_supervisory_queue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QCS_ and QS_ commands for the TTR supervisory queue");
            isharesPage2.TTRSupervisoryQueue(logInfo);
            logInfo.pass("I enter QCS_ and QS_ commands for the TTR supervisory queue");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN * H_ to display segment profile control history items")
    public void I_enter_KN_H_to_display_segment_profile_control_history_items() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN * H_ to display segment profile control history items");
            isharesPage2.displaySegmentProfileCtrlHistory(logInfo);
            logInfo.pass("I enter KN * H_ to display segment profile control history items");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN * H DFT command to display profile control default record history")
    public void i_enter_KN_H_DFT_to_display_profile_control_record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN * H DFT command to display profile control default record history");
            isharesPage2.displayProfileCtrlDefaultRecordHistory(logInfo);
            System.out.println("I enter KN * H DFT command to display profile control default record history");
            logInfo.pass("I enter KN * H DFT command to display profile control default record history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_ command to get the FLIFO for a specific date and origin")
    public void I_enter_2_command_to_get_the_FLIFO_for_a_specific_date_and_origin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to get the FLIFO for a specific date and origin");
            isharesPage2.getFLIFOForAParticularDateAndOrigin(logInfo);
            System.out.println("I enter 2_ command to get the FLIFO for a specific date and origin");
            logInfo.pass("I enter 2_ command to get the FLIFO for a specific date and origin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_ command to get the FLIFO for a specific date, origin and destination")
    public void I_enter_2_command_to_get_the_FLIFO_for_a_specific_date_origin_and_destination() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to get the FLIFO for a specific date, origin and destination");
            isharesPage2.getFLIFOForParticularDateOriginAndDestination(logInfo);
            System.out.println("I enter 2_ command to get the FLIFO for a specific date, origin and destination");
            logInfo.pass("I enter 2_ command to get the FLIFO for a specific date, origin and destination");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KIS_ command to do redetermination in selectivity record")
    public void I_enter_KIS_command_to_do_redetermination_in_selectivity_record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KIS_ command to do redetermination in selectivity record");
            isharesPage2.redeterminationInSelectivityRecord(logInfo);
            System.out.println("I enter KIS_ command to do redetermination in selectivity record");
            logInfo.pass("I enter KIS_ command to do redetermination in selectivity record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN_F_ command to split the frequency range")
    public void I_enter_KN_F_command_to_split_the_frequency_range() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN_F_ command to split the frequency range");
            isharesPage2.splitFrequencyRange(logInfo);
            System.out.println("I enter KN_F_ command to split the frequency range");
            logInfo.pass("I enter KN_F_ command to split the frequency range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN_DUPFLT command to duplicate a segment profile control record of one flight with another flight")
    public void iEnterKN_DUPFLTCommandToDuplicateASegmentProfileControlRecordOfOneFlightWithAnotherFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN_DUPFLT command to duplicate a segment profile control record of one flight with another flight");
            isharesPage2.duplicateSegProfileCtrlRecordOfOneFltToAnother(logInfo);
            logInfo.pass("I enter KN_DUPFLT command to duplicate a segment profile control record of one flight with another flight");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter B_ commands to sign in to the partner systems")
    public void I_enter_B_commands_to_sign_in_to_the_partner_systems() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter B_ commands to sign in to the partner systems");
            isharesPage2.signInToPartnerSystems(logInfo);
            logInfo.pass("I enter B_ commands to sign in to the partner systems");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2F_ command to run the forecast messages")
    public void I_enter_2F_command_to_run_the_forecast_messages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2F_ command to run the forecast messages");
            isharesPage2.forecastMessage(logInfo);
            logInfo.pass("I enter 2F_ command to run the forecast messages");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 2D_ command to do agent entry to place a decision message")
    public void I_enter_2D_command_to_do_agent_entry_to_place_a_decision_message() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2D_ command to do agent entry to place a decision message");
            isharesPage2.getDescisionMessage(logInfo);
            logInfo.pass("I enter 2D_ command to do agent entry to place a decision message");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add the SU duty code for the POS used")
    public void I_add_the_SU_duty_code_for_the_POS_used() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the SU duty code for the POS used");
            isharesPage2.addSUDutyCode(logInfo);
            logInfo.pass("I add the SU duty code for the POS used");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZZGLO_ and ZUGLO_ commands to check and add the LNIATA to the globals display")
    public void I_enter_ZZGLO_and_ZUGLO_commands_to_check_and_add_the_LNIATA_to_the_globals_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZZGLO_ and ZUGLO_ commands to check and add the LNIATA to the globals display");
            isharesPage2.checkAndAddLNIATAToGlobalsDisplay(logInfo);
            logInfo.pass("I enter ZZGLO_ and ZUGLO_ commands to check and add the LNIATA to the globals display");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTD_ and BP_ commands to display both the EPR list for a particular city and details of one employee respectively")
    public void I_enter_BTD_and_BP_commands_to_display_both_the_EPR_list_for_a_particular_city_and_details_of_one_employee_respectively() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTD_ and BP_ commands to display both the EPR list for a particular city and details of one employee respectively");
            isharesPage2.displayERPAndDetailsOfOneEmployee(logInfo);
            logInfo.pass("I enter BTD_ and BP_ commands to display both the EPR list for a particular city and details of one employee respectively");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BP_ command to display EPR of an individual employee for the POS used")
    public void I_enter_BP_command_to_display_EPR_of_an_individual_employee_for_the_POS_used() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BP_ command to display EPR of an individual employee for the POS used");
            isharesPage2.displayERPOfOneEmployee(logInfo);
            logInfo.pass("I enter BP_ command to display EPR of an individual employee for the POS used");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BP* command to display all the employee's EPR for the POS used")
    public void I_enter_BP_command_to_display_all_the_employees_EPR_for_the_POS_used() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BP* command to display all the employee's EPR for the POS used");
            isharesPage2.displayERPOfAllTheEmployees(logInfo);
            logInfo.pass("I enter BP* command to display all the employee's EPR for the POS used");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BP_ command to display all the employee's EPR for a specific city {string}")
    public void I_enter_BP_command_to_display_all_the_employees_EPR_for_a_specific_city(String cityCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BP_ command to display all the employee's EPR for a specific city");
            isharesPage2.displayERPOfAllTheEmployeesForACity(logInfo, cityCode);
            logInfo.pass("I enter BP_ command to display all the employee's EPR for a specific city");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTPACT_COPA command to activate the sine in table")
    public void I_enter_BTPACT_COPA_command_to_activate_the_sine_in_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTPACT/COPA command to activate the sine in table");
            isharesPage2.activateSineInTable(logInfo);
            logInfo.pass("I enter BTPACT/COPA command to activate the sine in table");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTMP_ command to take an index from the sine table to store all the messages")
    public void I_enter_BTMP_command_to_take_an_index_from_the_sine_table_to_store_all_the_messages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTMP_ command to take an index from the sine table to store all the messages");
            isharesPage2.takeAnIndexToStoreAllTheMessages(logInfo);
            logInfo.pass("I enter BTMP_ command to take an index from the sine table to store all the messages");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTM*_ command to display all the messages present within an index")
    public void I_enter_BTM_command_to_display_all_the_messages_present_within_an_index() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTM*_ command to display all the messages present within an index");
            isharesPage2.displayAllTheMessagesWithinAnIndex(logInfo);
            logInfo.pass("I enter BTM*_ command to display all the messages present within an index");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTMD_ command to delete a message from a particular index in the table")
    public void I_enter_BTMD_command_to_delete_a_message_from_a_particular_index_in_the_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTMD_ command to delete a message from a particular index in the table");
            isharesPage2.deleteAMessageAtAnIndex(logInfo);
            logInfo.pass("I enter BTMD_ command to delete a message from a particular index in the table");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTMA_ command to add a message into a particular index in the table")
    public void I_enter_BTMA_command_to_add_a_message_into_a_particular_index_in_the_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTMA_ command to add a message into a particular index in the table");
            isharesPage2.addAMessageIntoAnIndex(logInfo);
            logInfo.pass("I enter BTMA_ command to add a message into a particular index in the table");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTPDAC_COPA command to deactivate the sine in table")
    public void I_enter_BTPDAC_COPA_command_to_deactivate_the_sine_in_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTPDAC/COPA command to deactivate the sine in table");
            isharesPage2.deactivateSineInTable(logInfo);
            logInfo.pass("I enter BTPDAC/COPA command to deactivate the sine in table");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_ command to get the information of a particular flight")
    public void i_enter_2_to_get_the_information_of_a_particular_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to get the information of a particular flight");
            isharesPage2.getFLIFO(logInfo);
            logInfo.pass("I enter 2_ command to get the information of a particular flight");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_ command to get the information of a flight for a particular date")
    public void i_enter_2_command_to_get_the_information_of_a_flight_for_a_particular_date() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to get the information of a flight for a particular date");
            isharesPage2.getFLIFOForAParticularDate(logInfo);
            logInfo.pass("I enter 2_ command to get the information of a flight for a particular date");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VILS entry to display Leg AND Booking Compartment")
    public void I_enter_VILS_entry_to_display_Leg_and_Booking_Compartment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter VILS entry to display Leg AND Booking Compartment");
            isharesPage2.LegsAndBookingCompartments(logInfo);
            logInfo.pass("I enter VILS entry to display Leg AND Booking Compartment");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of Leg AND Booking Compartment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter VIM Entry to display Inventory History")
    public void I_enter_VIM_Entry_to_display_Inventory_History() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter VIM Entry to display Inventory History");
            isharesPage2.displayInventoryHistory(logInfo);
            logInfo.pass("I enter VIM Entry to display Inventory History");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of VIM entry to display Inventory History");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML  Entry to add text to leg")
    public void I_enter_VML_Entry_to_add_text_to_leg() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter VML  Entry to add text to leg");
            isharesPage2.entrytoaddtexttoleg(logInfo);
            logInfo.pass("I enter VML  Entry to add text to leg");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of VML entry to add text to leg");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter T-ET command to make the Segments CM used")
    public void I_enter_T_ET_command_to_make_the_Segments_CM_used() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter T-ET command to make the Segments CM used");
            isharesPage2.commandToMakeTheSegmentsCMUsed(logInfo);
            logInfo.pass("I enter T-ET command to make the Segments CM used");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of T-ET command to make the Segments CM used");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter *FW display details CM Stored fare Infant Tkt")
    public void I_enter_FW_display_CM_Stored_fare_Infant_Tkt() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter *FW display details CM Stored fare Infant Tkt");
            isharesPage2.fwDisplayCMStoredFareInfantTkt(logInfo);
            logInfo.pass("I enter *FW display details CM Stored fare Infant Tkt");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture *FW display details CM Stored fare Infant Tkt");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter KL entry to change the Prioritization Code Assignment")
    public void I_enterKL_entry_to_change_priotitization_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KL entry to display Prioritization for Airline code");
            isharesPage2.KL_EntryToChangePrioritizationCode(logInfo);
            logInfo.pass("I enter KL entry to display Prioritization for Airline code");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter X command for partial marriage cancellation for segment {string}")
    public void I_enter_X_command_for_partial_marriage_cancellation(String segmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X command for partial marriage cancellation");
            isharesPage2.enterX_ForPartialMarriageCancellation(logInfo, segmentNo);
            logInfo.pass("I enter X command for partial marriage cancellation");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-* to display SHARES entries with PSC selection option {string}")
    public void ienterKtodisplaySHARESentrieswithPSCselectionoption(String passServiceCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-* to display SHARES entries with PSC selection option");

            isharesPage2.displayEntriesWithPSCSelection(logInfo, passServiceCode);
            logInfo.pass("I enter K-* to display SHARES entries with PSC selection option");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command KXD_ to display extra section SHARES Entries")
    public void i_enter_command_KXD_to_display_extra_section_SHARES_Entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command KXD_ to display extra section SHARES Entries");
            System.out.println("I enter command KXD_ to display extra section SHARES Entries");
            isharesPage2.displayExtraSectionSharesEntries(logInfo);
            logInfo.pass("I enter command KXD_ to display extra section SHARES Entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VILS_ command to run Leg Segment display for inspection purpose")
    public void i_enter_VILS_command_to_run_Leg_Segmant_display_for_inspection_purpose() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VILS_ command to run Leg Segment display for inspection purpose");
            System.out.println("I enter VILS_ command to run Leg Segment display for inspection purpose");
            isharesPage2.runLegSegmentDisplayForInspection(logInfo);
            logInfo.pass("I enter VILS_ command to run Leg Segment display for inspection purpose");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMM* command to display summary status for all entries in Transformed SHARES")
    public void i_enter_VMM_command_to_display_summary_status_for_all_entries_in_Transformed_SHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMM* command to display summary status for all entries in Transformed SHARES");
            System.out.println("I enter VMM* command to display summary status for all entries in Transformed SHARES");
            isharesPage2.displaySummaryStatusForAllEntries(logInfo);
            logInfo.pass("I enter VMM* command to display summary status for all entries in Transformed SHARES");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMM_PAUSE command to pause an entry in inventory record SHARES entries {string}")
    public void i_enter_VMM_PAUSE_command_to_pause_an_entry_in_inventory_record_SHARES_entries(String entryNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter VMM_PAUSE command to pause an entry in inventory record SHARES entries");
            System.out.println("I enter VMM_PAUSE command to pause an entry in inventory record SHARES entries" + entryNo);
            isharesPage2.pauseAnEntryInInventoryRecord(logInfo, entryNo);
            logInfo.pass("I enter VMM_PAUSE command to pause an entry in inventory record SHARES entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMM_RESTART command to restart an entry in inventory record SHARES entries {string}")
    public void i_enter_VMM_RESTART_command_to_restart_an_entry_in_inventory_record_SHARES_entries(String entryNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter VMM_RESTART command to restart an entry in inventory record SHARES entries");
            System.out.println("I enter VMM_RESTART command to restart an entry in inventory record SHARES entries" + entryNo);
            isharesPage2.restartAnEntryInInventoryRecord(logInfo, entryNo);
            logInfo.pass("I enter VMM_RESTART command to restart an entry in inventory record SHARES entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBT command to display total passenger boarding SHARES entries")
    public void i_enter_PBT_to_display_total_passenger_boarding_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBT command to display total passenger boarding SHARES entries");
            System.out.println("I enter PBT command to display total passenger boarding SHARES entries");
            isharesPage2.displayTotalPassenegrBoarding(logInfo);
            logInfo.pass("I enter PBT command to display total passenger boarding SHARES entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIEM command to display full record for modification purpose")
    public void i_enter_VIEM_command_to_display_full_record_for_modification_purpose() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIEM command to display full record for modification purpose");
            System.out.println("I enter VIEM command to display full record for modification purpose");
            isharesPage2.displayFullRecordForModificationPurpose(logInfo);
            logInfo.pass("I enter VIEM command to display full record for modification purpose");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //      PNL461/08NOVSJO
    @And("I enter PNL_ command to display passenger name list")
    public void i_enter_PNL_command_to_display_passenger_name_list() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNL_ command to display passenger name list");
            isharesPage2.displayPassengerNameList(logInfo);
            logInfo.pass("I enter PNL_ command to display passenger name list");
            System.out.println("I enter PNL_ command to display passenger name list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //      PDC473/09JANLAX
    @And("I enter PDC_ command to display post departure completion entries")
    public void i_enter_PDC_command_to_display_post_departure_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter PDC_ command to display post departure completion entries");
            isharesPage2.displayPostDepartureEntries(logInfo);
            logInfo.pass("I enter PDC_ command to display post departure completion entries");
            System.out.println("I enter PDC_ command to display post departure completion entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PDX command to run post Departure cancellations{string}{string}{string}")
    public void i_enter_PDX_command_to_run_post_Departure_cancellations(String noShowCode, String overSoldCode, String misConnectCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PDX command to run post Departure cancellations");
            isharesPage2.enterPDXtoRunPostDepartureCancellations(logInfo, noShowCode, overSoldCode, misConnectCode);
            logInfo.pass("I enter PDX command to run post Departure cancellations");
            System.out.println("I enter PDX command to run post Departure cancellations");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET for displaying coupon of ticket")
    public void I_enter_commands_for_displaying_coupon_of_ticket() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for displaying coupon of ticket");
            isharesPage2.enterET1ForETKTUpdates(logInfo);
            logInfo.pass("I enter command for displaying coupon of ticket");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter COHOST TABLE SHARES entries")
    public void i_enter_cohost_TABLE_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter COHOST TABLE SHARES entries");
            isharesPage2.enter_COHOST_TABLE_SHARES_entries(logInfo);
            logInfo.pass("I enter COHOST TABLE SHARES entries");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the modify avail RMKS SHARES entries in transformed SHARES")
    public void i_modify_SHARES_entries_in_transformed_SHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the modify avail RMKS SHARES entries in transformed SHARES");
            isharesPage2.Modify_avail_rkms_SHARES_entries_in_transformed_SHARES(logInfo);
            logInfo.pass("I run the modify avail RMKS SHARES entries in transformed SHARES");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the queue command to verify the queue messages or remarks for POS1")
    public void i_run_the_queue_command_to_verify_the_queue_messages_for_POS1() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the queue command to verify the queue messages or remarks for POS1");
            isharesPage2.run_the_queue_command_to_verify_the_queue_messages_or_remarks(logInfo);
            logInfo.pass("I run the queue command to verify the queue messages or remarks for POS1");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the queue commands to verify the queue messages or remarks for POS2")
    public void i_run_the_queue_command_to_verify_the_queue_messages_for_POS2() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the queue commands to verify the queue messages or remarks for POS2");
            isharesPage2.run_the_queue_command_to_verify_the_queue_messages_or_remarks(logInfo);
            logInfo.pass("I run the queue commands to verify the queue messages or remarks for POS2");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter long cell command")
    public void i_enter_long_cell_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long cell command");
            isharesPage2.Run_long_cell_command(logInfo);
            logInfo.pass("I enter long cell command");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KSWLCFRM_ command to transfer waitlist pax to extra section flight")
    public void I_enter_KSWLCFRM_command_to_transfer_waitlist_pax_to_extra_section_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KSWLCFRM_ command to transfer waitlist pax to extra section flight");
            isharesPage2.transferWaitlistPaxToExtraSectionFlight(logInfo);
            logInfo.pass("I enter KSWLCFRM_ command to transfer waitlist pax to extra section flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EH command to display the ETKT history")
    public void I_enter_EH_Command_to_display_the_ETKT_history() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH command to display the ETKT history");
            isharesPage2.displayETKTHistory(logInfo);
            logInfo.pass("I enter *EH command to display the ETKT history");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the name of the passenger in the index {string} to a different name")
    public void I_change_the_name_of_the_passenger_in_the_index_to_a_different_name(String index) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the name of the passenger to a different name");
            isharesPage2.changeThePassengerName(logInfo, index);
            logInfo.pass("I change the name of the passenger to a different name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the checkin command for go-show PNR again and validate the error")
    public void iEnterTheCheckinCommandForGoShowPNRAgainAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the checkin command for go-show PNR again and validate the error");
            isharesPage2.checkinOfGoShowPNRAgainAndValidateTheError(logInfo);
            logInfo.pass("I enter the checkin command for go-show PNR again and validate the error");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter -_@ command to delete the passenger in the {string} from the PNR")
    public void I_enter_command_to_delete_the_passenger_in_the_from_the_PNR(String paxPositionInThePNR) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter -_@ command to delete the passenger from the PNR");
            isharesPage2.deleteAPassengerFromThePNR(logInfo, paxPositionInThePNR);
            logInfo.pass("I enter -_@ command to delete the passenger from the PNR");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VGBP command to display pending file")
    public void I_enter_VGBP_Command_to_display_pending_file() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VGBP command to display pending file");
            isharesPage2.displayPendingFile(logInfo);
            logInfo.pass("I enter VGBP command to display pending file");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter X commands to delete segments {string}")
    public void i_Enter_X_Commands_To_Delete_the_Segments(String SegmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X commands to delete segments" + SegmentIndex);
            isharesPage2.deleteSpecificSegment(logInfo, SegmentIndex);
            logInfo.pass("I enter X commands to delete segments " + SegmentIndex);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET-DOC command to display the passenger receipts")
    public void iEnterETDOCCommandToDisplayThePassengerReceipts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET-DOC command to display the passenger receipts");
            isharesPage2.displayPassengerReceipts(logInfo);
            logInfo.pass("I enter *ET-DOC command to display the passenger receipts");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I store the flight number and date of the first flight")
    public void LI_store_the_flight_number_and_date_of_the_first_flight() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I store the flight number and date of the first flight");
            isharesPage2.storeFirstFlightDetails(logInfo);
            logInfo.pass("I store the flight number and date of the first flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*.F_ command to adjust ETKT change in itinerary using flight details")
    public void I_enter_T_ET_F_command_to_adjust_ETKT_change_in_itinerary_using_flight_details() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*.F_ command to adjust ETKT change in itinerary using flight details");
            isharesPage2.involuntaryTicketAdjustment(logInfo);
            logInfo.pass("I enter T-ET*.F_ command to adjust ETKT change in itinerary using flight details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the shares commands to check the Availability")
    public void I_run_the_shares_commands_to_check_the_Availability() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I run the shares commands to check the Availability");
            isharesPage2.sharesCommandsToCheckTheAvailability(logInfo);
            logInfo.pass("I run the shares commands to check the Availability");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture shares commands to check the Availability");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I need display Origin and Destination of inventory leg and Modify entry")
    public void I_need_display_Origin_and_Destination_of_inventory_leg_and_Modify_entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I need display Origin and Destination of inventory leg and Modify entry");
            isharesPage2.displayOriginAndDestinationOfInventoryLegAndModifyEntry(logInfo);
            logInfo.pass("I need display Origin and Destination of inventory leg and Modify entry");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @Then("I remove the coupon status")
    public void I_remove_the_coupon_status() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove the coupon status");
            isharesPage2.removeTheCouponStatus(logInfo);
            logInfo.pass("I remove the coupon status");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I run the codeshare flifo display command")
    public void I_run_the_codeshare_flifo_display_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the codeshare flifo display command");
            isharesPage2.codeshareFlifoDispalyCommand(logInfo);
            logInfo.pass("I run the codeshare flifo display command");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to display a profile model {string}")
    public void i_enter_KJ_command_to_display_a_profile_model(String modelName) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to display a profile model");
            System.out.println("I enter KJ command to display a profile model");
            isharesPage2.displayProfileModel(logInfo, modelName);
            logInfo.pass("I enter KJ command to display a profile model");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to cancel items in a profile model {string} for the range {string}")
    public void i_enter_KJ_command_to_cancel_items_in_a_profile_model(String modelName, String rangeStepItem) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to cancel items in a profile model " + modelName + "for the range " + rangeStepItem);
            System.out.println("I enter KJ command to cancel items in a profile model" + modelName + "for the range " + rangeStepItem);
            isharesPage2.cancelItemsinProfileModel(logInfo, modelName, rangeStepItem);
            logInfo.pass("I enter KJ command to cancel items in a profile model " + modelName + "for the range " + rangeStepItem);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJMA command to change remark field for the profile model {string} and {string} and {string}")
    public void i_enter_KJMA_command_to_change_remark_field_for_the_profile_model(String modelName, String keyword, String description) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJMA command to change remark field for the profile model");
            System.out.println("I enter KJMA command to change remark field for the profile model");
            isharesPage2.changeRemarkFieldinProfileModel(logInfo, modelName, keyword, description);
            logInfo.pass("I enter KJMA command to change remark field for the profile model");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJMA command to add AUC parameters to A Newly Created Profile Model {string} and {string} and {string}")
    public void i_enter_KJMA_command_to_add_AUC_parameter_to_Newly_created_Profile_Model(String modelName, String increaseParameter, String decreaseParameter) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJMA command to add AUC parameters to A Newly Created Profile Model");
            System.out.println("I enter KJMA command to add AUC parameters to A Newly Created Profile Model");
            isharesPage2.addAUCParameterInProfileModel(logInfo, modelName, increaseParameter, decreaseParameter);
            logInfo.pass("I enter KJMA command to add AUC parameters to A Newly Created Profile Model");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //KN A 360 / 1NOV88-22JUL89 / 15 / PTYLAX / Q / PRO 5

    @And("I Add an Item to A Segment Profile Control Record for {string} and {string} and {string}")
    public void i_Add_an_Item_to_A_Segment_Profile_Control_Record(String frequency, String profileKeyword, String tableNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Add an Item to A Segment Profile Control Record");
            System.out.println("I Add an Item to A Segment Profile Control Record");
            isharesPage2.addItemToSegmentProfileControlRecord(logInfo, frequency, profileKeyword, tableNumber);
            logInfo.pass("I Add an Item to A Segment Profile Control Record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //KN A 360 / 1MAR24-10AUG29 / 15 / PTYLAX / L / MIN 40 / ZMN 5
    @And("I Add an Item to A Segment Profile Control Record with Designated level for {string} and {string} and {string} and {string}")
    public void i_Add_an_Item_to_A_Segment_Profile_Control_Record_with_Designated_level(String frequency, String designatedLevel, String profileKeyword, String tableNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Add an Item to A Segment Profile Control Record with Designated level");
            System.out.println("I Add an Item to A Segment Profile Control Record with Designated level");
            isharesPage2.addItemToSegmentProfileControlRecordWithDesignatedlevel(logInfo, frequency, designatedLevel, profileKeyword, tableNumber);
            logInfo.pass("I Add an Item to A Segment Profile Control Record with Designated level");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //    KN C 360 / 1 / PRO3
    @And("I Change an Item in A Segment Profile Control Record for {string} and {string} and {string}")
    public void i_Change_an_Item_in_A_Segment_Profile_Control_Record(String itemNumber, String profileKeyword, String tableNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Change an Item in A Segment Profile Control Record for");
            System.out.println("I Change an Item in A Segment Profile Control Record for");
            isharesPage2.changeAnItemInSegmentProfileControlRecord(logInfo, itemNumber, profileKeyword, tableNumber);
            logInfo.pass("I Change an Item in A Segment Profile Control Record for");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //KN X 360 / 1
    @And("I Cancel an Item from A Segment Profile Control Record for {string}")
    public void i_Cancel_an_Item_from_A_Segment_Profile_Control_Record(String itemNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Cancel an Item from A Segment Profile Control Record");
            System.out.println("I Cancel an Item from A Segment Profile Control Record");
            isharesPage2.cancelAnItemFromSegmentProfileControlRecord(logInfo, itemNumber);
            logInfo.pass("I Cancel an Item from A Segment Profile Control Record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //KND360/1/02NOV88
    @And("I run date range split SHARES entries {string}")
    public void i_run_range_date_split_SHARES_entries(String itemNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run date range split SHARES entries");
            System.out.println("I run date range split SHARES entries");
            isharesPage2.runDateRangeSplit(logInfo, itemNumber);
            logInfo.pass("I run date range split SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DM_ command to mark the ETKT coupon as unused")
    public void iEnterDM_CommandToMarkTheETKTCouponAsUnused() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DM_ command to mark the ETKT coupon as unused");
            isharesPage2.getMarkETKTAsUnused(logInfo);
            logInfo.pass("I enter 6:DM_ command to mark the ETKT coupon as unused");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIL_ command to display the legs and booking compartments")
    public void iEnterVIL_CommandToDisplayTheLegsAndBookingCompartments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIL_ command to display the legs and booking compartments");
            isharesPage2.getDisplayLegsandBookingCompartments(logInfo);
            logInfo.pass("I enter VIL_ command to display the legs and booking compartments");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command #*FLTNO DATE ORGINCITY LNAME FNAME to  Retrieval in SHARE Entries")
    public void iEnterCommandFLTNODATEORGINCITYLNAMEFNAMEToRetrievalInSHAREEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command #*FLTNO DATE ORGINCITY LNAME FNAME to  Retrieval in SHARE Entries");
            isharesPage2.getRetrivalInfoUsingSegmentDateName(logInfo);
            logInfo.pass("I enter command #*FLTNO DATE ORGINCITY LNAME FNAME to  Retrieval in SHARE Entries");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMF_ command to display full record for modification purpose")
    public void iEnterVMF_CommandToDisplayFullRecordForModificationPurpose() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMF_ command to display full record for modification purpose");
            isharesPage2.getDisplayModifiedFactInfo(logInfo);
            logInfo.pass("I enter VMF_ command to display full record for modification purpose");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate pnr with long address for system type {string}")
    public void iEnterTTYMessageToGeneratePnrForSystemWithLongAddress(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate pnr with long address");
            isharesPage2.TTYMessageBasicAirlinePnrWithLongAddress(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate pnr with long address");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ETPRINT command to print the ticket number")
    public void iEnterTETPRINTCommandToEnterPrintTheTicketNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETPRINT command to print the ticket number");
            isharesPage2.enterET_PrintToPrintTicket(logInfo);
            logInfo.pass("I enter T-ETPRINT command to print the ticket number");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A command to display availability")
    public void iEnterACommandToDisplayAvailability() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A command to display availability");
            isharesPage2.enterA_CheckAvailability(logInfo);
            logInfo.pass("I enter A command to display availability");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EC_ command to retrieve credit card for {string}")
    public void iEnterEC_CommandToRetrieveCreditCardFor(String PaymentType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EC_ command to retrieve credit card for " + PaymentType);
            isharesPage2.enterEC_RetrieveCreditCard(logInfo, PaymentType);
            logInfo.pass("I enter *EC_ command to retrieve credit card for " + PaymentType);


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change status of segments {string} to status type {string}")
    public void I_change_all_the_segments_status_to_CMUSED_for_the_passengers(String noOfSegments, String statusType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change status of segments " + noOfSegments + "to status type " + statusType);
            isharesPage2.changeSegmentsStatus(logInfo, noOfSegments, statusType);
            logInfo.pass("I change status of segments " + noOfSegments + "to status type " + statusType);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I check segment status for status type {string}")
    public void iCheckSegmentStatusForStatusType(String statusType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I check segment status for status type " + statusType);
            isharesPage2.verifySegmentStatus(logInfo, statusType);
            logInfo.pass("I check segment status for status type " + statusType);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I end and retrieve the pnr")
    public void iSaveAndRetrieveTheTransaction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I end and retrieve the transaction");
            System.out.println("I end and retrieve the transaction");
            isharesPage2.setEndAndretrieve();

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LS_R command to do fare quote for segment {string}")
    public void iEnterLS_RCommandToDoFareQuote(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LS_R command to do fare quote for segment " + SegmentNumber);
            System.out.println("I enter LS_R command to do fare quote for segment " + SegmentNumber);
            isharesPage2.enterLA_RCmdForFareQuote(logInfo, SegmentNumber);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter *FQ command before doing fare quote")
    public void iEnterFQCommandBeforeDoingFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FQ command before doing fare quote");
            System.out.println("I enter *FQ command before doing fare quote");
            isharesPage2.enterFQCommandBeforeFareQuote(logInfo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter IR command to save and retrieve")
    public void I_enter_IR_command_to_save_and_retrieve() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter IR command to save and retrieve");
            isharesPage2.enter_IR(logInfo);
            logInfo.pass("I ignore and retrieve the pnr");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter *FQ command after doing fare quote")
    public void iEnterFQCommandAfterDoingFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FQ command after doing fare quote");
            System.out.println("I enter *FQ command before doing fare quote");
            isharesPage2.enterFQCommandAfterFareQuote(logInfo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_OUBC0450 command to add item to ticket control record and enter T_HMTA command")
    public void iEnterT_OUBCCommandToAddItemToTicketControlRecord() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_OUBC0450 command to add item to ticket control record and enter T_HMTA command");
            isharesPage2.commandToAddItemToTicketControlRecord(logInfo);
            logInfo.pass("I enter T_OUBC0450 command to add item to ticket control record and enter T_HMTA command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *H for showing History for each passenger")
    public void iEnterHForShowingHistoryForEachPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *H for showing History for each passenger");
            isharesPage2.displayHistoryForSpecificPax(logInfo);
            logInfo.pass("I enter *H for showing History for each passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for the availability for flights for segment {string}")
    public void searchAvailabilityFlightsForSegment(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for the availability for flights for segment");
            isharesPage2.availabilityForFlightsDifferentFormat(logInfo, SegmentNumber);
            logInfo.pass("I search for the availability for flights for segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EV command to display ETKT records")
    public void iEnterEVCommandToDisplayETKTRecords() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EV command to display ETKT records");
            isharesPage2.evCommandToDisplayETKTRecords(logInfo);
            logInfo.pass("I enter *EV command to display ETKT records");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *FW command before doing fare quote")
    public void iEnterFWCommandBeforeDoingFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FW command before doing fare quote");
            isharesPage2.enterFWCommand(logInfo);
            logInfo.pass("I enter *FW command before doing fare quote");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*CS_ command to check codeshare flight")
    public void iEnterACS_CommandToCheckCodeshareFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*CS_ command to check codeshare flight");
            isharesPage2.enterA_CSCommand(logInfo);
            logInfo.pass("I enter A*CS_ command to check codeshare flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *F command to display fare quote")
    public void iEnterFCommandToDisplayFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *F command to display fare quote");
            isharesPage2.enterFCommand(logInfo);
            logInfo.pass("I enter *F command to display fare quote");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBIC command to run bording point city code")
    public void iEnterPBICCommandToRunBordingPointCityCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBIC command to run bording point city code");
            isharesPage2.enterPIBC(logInfo);
            logInfo.pass("I enter PBIC command to run bording point city code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIX command to display Segment Class Seats Availability")
    public void iEnterVIXCommandToDisplaySegmentClassSeatsAvailablity() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIX command to display Segment Class Seats Availablity");
            isharesPage2.enterVIXCommand(logInfo);
            logInfo.pass("I enter VIX command to display Segment Class Seats Availablity");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIT command to display meal information")
    public void iEnterVITCommandToMealInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIT command to display meal information");
            isharesPage2.enterVITCommand(logInfo);
            logInfo.pass("I enter VIT command to display meal information");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIR command to display Inventory Remarks Display")
    public void iEnterVIRCommandToDisplayInventoryRemarksDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIR command to display Inventory Remarks Display");
            isharesPage2.enterVIRCommand(logInfo);
            logInfo.pass("I enter VIR command to display Inventory Remarks Display");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VISM command to display Segment Display for Inspection Purpose")
    public void iEnterVISMCommandToDisplaySegmentDisplayForInspectionPurpose() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VISM command to display Segment Display for Inspection Purpose");
            isharesPage2.enterVISMCommand(logInfo);
            logInfo.pass("I enter VISM command to display Segment Display for Inspection Purpose");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter auto farequote command for adult to display releasing locked fare Quotes using command *FW")
    public void iEnterAutoFarequoteCommandForAdultToDisplayReleasingLockedFareQuotesUsingCommandFRAndFW() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter auto farequote command for adult to display releasing locked fare Quotes using command *FW");
            isharesPage2.displayReleasingAutoFareQuote(logInfo);
            logInfo.pass("I enter auto fare quote command for adult to display releasing locked fare Quotes using command *FW");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability using departure time")
    public void I_search_for_flight_availability_using_departure_time() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability using departure time");
            isharesPage2.displayReleasingAutoFareQuote(logInfo);
            logInfo.pass("I search for flight availability using departure time");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability from {string} to {string} at departure time {string}")
    public void i_search_for_flight_availability_at_given_departure_time(String origin, String destination, String departureTime) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability from " + origin + " to " + destination + " at departure time " + departureTime);
            isharesPage2.searchFlightAvailabilityForFirstSegWithDepartureTime(logInfo, origin, destination, departureTime);
            logInfo.pass("I search for flight availability from " + origin + " to " + destination + " at departure time " + departureTime);


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }


    @And("I enter VM command to run the mass modifications for ALL")
    public void I_enter_VM_command_to_run_the_mass_modifications_for_ALL() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VM command to run the mass modifications for ALL");
            isharesPage2.i_enter_VM_to_run_mass_modifications(logInfo);
            logInfo.pass("I enter VM command to run the mass modifications for ALL");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter C:OFF for disconnecting from an Active TAR")
    public void I_enter_COFF_for_disconnecting_an_Active_TAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:OFF for disconnecting from an Active TAR");
            isharesPage2.enter_COFF_disconnectToAnActiveTAR(logInfo);
            logInfo.pass("I enter C:OFF for disconnecting from an Active TAR");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:ON command to reconnect to an active TAR")
    public void iEnterCONCommandToReconnectToAnActiveTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:ON command to reconnect to an active TAR");
            isharesPage2.enter_CON_reconnectToAnActiveTAR(logInfo);
            logInfo.pass("I enter C:ON command to reconnect to an active TAR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:I command to initialize the agent TAR")
    public void iEnterCICommandToInitializeTheAgentTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:I command to initialize the agent TAR");
            isharesPage2.initializeTheAgentTAR(logInfo);
            logInfo.pass("I enter C:I command to initialize the agent TAR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter CD command to display Master TAR")
    public void I_enter_CD_To_display_Master_TAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CD to display Master TAR");
            isharesPage2.enter_CD_To_Display_Master_TAR(logInfo);
            logInfo.pass("I enter CD to display Master TAR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CD$ to display cash and check transactions")
    public void I_enter_CD$_to_display_cash_and_check_transactions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CD$ to dislay cash and check transactions");
            isharesPage2.enter_CD$_To_Display_CashCheck_Transactions(logInfo);
            logInfo.pass("I enter CD$ to dislay cash and check transactions");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CD$USD to display cash transactions")
    public void I_CD$USD_to_dislay_cash_transactions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CD$USD to display cash transactions");
            isharesPage2.enter_CD$USD_To_Display_Cash_Transactions(logInfo);
            logInfo.pass("I enter CD$USD to display cash transactions");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CD$CK To display check transactions")
    public void I_enter_CD$CK_To_Dislay_Check_Transactions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CD$CK To Dislay Check Transactions");
            isharesPage2.enter_CD$CK_To_Display_Check_Transactions(logInfo);
            logInfo.pass("I enter CD$CK To Dislay Check Transactions");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CD$XX to display multiple forms of payment")
    public void I_enter_CD$XX_to_display_multiple_forms_of_payment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CD$XX to display multiple forms of payment");
            isharesPage2.enter_CD$XX_To_Display_Multiple_Forms_Of_Payment(logInfo);
            logInfo.pass("I enter CD$XX to display multiple forms of payment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT for 3rd party billing update entries for POS {string}")
    public void I_enter_PIAT_for_3rd_party_billing(String POS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT for 3rd party billing update entries");
            isharesPage2.thirdPartyBillingUpdateEntries(logInfo, POS);
            logInfo.pass("I enter PIAT for 3rd party billing update entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PIAT for showing IATA address table")
    public void I_enter_PIAT_for_showing_IATA_address_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT for showing IATA address table");
            isharesPage2.enterPIATToShowAddressTable(logInfo);
            logInfo.pass("I enter PIAT for showing IATA address table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT for showing IATA address table using market {string}")
    public void I_enter_PIAT_for_showing_IATA_address_table_using_market(String market) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT for showing IATA address table using market " + market);
            isharesPage2.enterPIATToSowAddressTableUsingMarket(logInfo, market);
            logInfo.pass("I enter PIAT for showing IATA address table using market " + market);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT for showing IATA address table using market {string} and flight no {string}")
    public void I_enter_PIAT_for_showing_IATA_address_table_using_market_and_flight(String market, String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT for showing IATA address table using market " + market + "and flight " + flight);
            isharesPage2.enterPIATToSowAddressTableUsingMarketAndFlight(logInfo, market, flight);
            logInfo.pass("I enter PIAT for showing IATA address table using market " + market + "and flight " + flight);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2P command to check Flight Progress Information")
    public void I_enter_2P_command_to_check_flight_progress_information() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to check Flight Progress Information");
            isharesPage2.checkFlightProgressInformation(logInfo);
            logInfo.pass("I enter 2P command to check Flight Progress Information");
            System.out.println("I enter 2P command to check Flight Progress Information");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A command for subsequent class level search")
    public void i_enter_A_command_for_subsequent_class_level_search() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A command for subsequent class level search");
            isharesPage2.checkSubsequentClassLevelSearch(logInfo);
            System.out.println("I enter A command for subsequent class level search");
            logInfo.pass("I enter A command for subsequent class level search");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for later entry {string}")
    public void i_search_for_later_entry(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for later entry");
            isharesPage2.searchLaterEntry(logInfo, entry);
            System.out.println("I search for later entry");
            logInfo.pass("I search for later entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMML command for Mass Modify Leg Header entry")
    public void i_enter_VMML_command_for_mass_modify_leg_header_entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMML command for Mass Modify Leg Header entry");
            isharesPage2.enterVMMLCommandforMassModifyLegEntry(logInfo);
            logInfo.pass("I enter VMML command for Mass Modify Leg Header entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter rebook command to Rebook class of service for segment1 {string}")
    public void I_enter_rebook_command_segment1(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter rebook command to Rebook class of service for" + SegmentNumber);
            System.out.println("I enter rebook command to Rebook class of service for" + SegmentNumber);
            isharesPage2.rebook_command_to_Rebook_class_of_service_1(logInfo, SegmentNumber);
            logInfo.pass("I enter rebook command to Rebook class of service for" + SegmentNumber);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }

    @And("I enter rebook command to Rebook class of service for segment3 {string}")
    public void I_enter_rebook_command_segment3(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter rebook command to Rebook class of service for" + SegmentNumber);
            System.out.println("I enter rebook command to Rebook class of service for" + SegmentNumber);
            isharesPage2.rebook_command_to_Rebook_class_of_service_3(logInfo, SegmentNumber);
            logInfo.pass("I enter rebook command to Rebook class of service for" + SegmentNumber);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter restrict customer Option SHARES entries")
    public void i_enter_restrict_customer_Option() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter restrict customer Option SHARES entries");
            isharesPage2.enter_restrict_customer_Option(logInfo);
            logInfo.pass("I enter restrict customer Option SHARES entries");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter flight Information command for City Or Segments")
    public void i_enter_flight_Information_for_City_Or_Segments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter flight Information for City Or Segments");
            isharesPage2.flight_Information_for_City_Or_Segments(logInfo);
            logInfo.pass("I enter flight Information for City Or Segments");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Host and OA Commuter Table entry")
    public void I_enter_Host_and_OA_Commuter_Table_entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Host and OA Commuter Table entry");
            isharesPage2.enterHostAndOACommuterTableEntry(logInfo);
            logInfo.pass("I enter Host and OA Commuter Table entry");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_EQP*_  to display Equipment Type Code Table Entries")
    public void iEnterTEQP_ToDisplayEquipmentTypeCodeTableEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_EQP*_  to display Equipment Type Code Table Entries");
            isharesPage2.getDisplayEquipementEntries(logInfo);
            logInfo.pass("I enter T_EQP*_  to display Equipment Type Code Table Entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I PAR*ATB and T_HMTA_ command to display Diagnostic Print with specific entry")
    public void iPARATBAndT_HMTA_CommandToDisplayDiagnosticPrintWithSpecificEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I PAR*ATB and T_HMTA_ command to display Diagnostic Print with specific entry");
            isharesPage2.getDisplayPrinterAttributeTableAndSpecificLniata(logInfo);
            logInfo.pass("I enter T_HMTA_ command to display Diagnostic Print with specific entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 5$_ command for Card identification verification with {string}, {string}and {string}")
    public void iEnter$_CommandForCardIdentificationVerificationWithAnd(String CardNumber, String ExpiryDate, String Cid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5$_ command for Card identification verification with {string}, {string}and {string}");
            isharesPage2.getDisplayMaskedCreditcard(logInfo, CardNumber, ExpiryDate, Cid);
            logInfo.pass("I enter 5$_ command for Card identification verification with {string}, {string}and {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_CUR command to display entire Local Currency and individual station Local Currency Code Table for POS {string}")
    public void iEnterT_CURCommandToDisplayEntireLocalCurrencyAndIndividualStationLocalCurrencyCodeTableForPOS(String POS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_CUR command to display entire Local Currency and individual station Local Currency Code Table for POS {string}");
            isharesPage2.getDisplayLocalCurrencyTable(logInfo, POS);
            logInfo.pass("I enter T_CUR command to display entire Local Currency and individual station Local Currency Code Table for POS {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to pay by Visa and Cash")
    public void i_enter_command_to_pay_by_Visa_and_Cash() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to pay by Visa and Cash");
            System.out.println("I enter command to pay by Visa and Cash");
            isharesPage2.payByVisaAndCash(logInfo);
            logInfo.pass("I enter command to pay by Visa and Cash");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET command to make the Ticket status VOID for the {string}")
    public void I_enter_T_ET_command_to_make_the_Ticket_status_VOID(String paxNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter T-ET command to make the Ticket status VOID");
            isharesPage2.commandToMakeTheTicketVoid(logInfo, paxNo);
            logInfo.pass("I enter T-ET command to make the Ticket status VOID");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of T-ET command to make the Ticket status VOID");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter XI command to Cancel the Itinerary")
    public void I_enter_XI_command_to_Cancel_the_Itinerary() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter XI command to Cancel the Itinerary");
            isharesPage2.commandToCancelItinerary(logInfo);
            logInfo.pass("I enter XI command to Cancel the ItineraryD");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of XI command to Cancel the Itinerary");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EB command to display past date Unflown flights for {string}")
    public void I_enter_EB_command_to_display_past_date_Unflown_flights(String noOfDays) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter *EB command to display past date Unflown flights");
            isharesPage2.displayPastDateUnflownFlights(logInfo, noOfDays);
            logInfo.pass("I enter *EB command to display past date Unflown flights");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of *EB command to display past date Unflown flights");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ED command to display past date Unflown segments List By Date range for {string} to {string}")
    public void I_enter_ED_command_to_display_past_date_Unflown_sgments_List_By_Date_range(String startDays, String endDays) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter *ED command to display past date Unflown segments List By Date range");
            isharesPage2.displayPastDateUnflownSegmentsForDateRange(logInfo, startDays, endDays);
            logInfo.pass("I enter *ED command to display past date Unflown segments List By Date range");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of *ED command to display past date Unflown segments List By Date range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I display CRS ETKT SHARES entries in Transformed SHARES for {string}")
    public void idisplayCRSETKTSHARESentriesInTransformedSHARESfor(String seqNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display CRS ETKT SHARES entries in Transformed SHARES for");
            System.out.println("I display CRS ETKT SHARES entries in Transformed SHARES for" + seqNo);
            isharesPage2.displayCRSETKTSharesEntries(logInfo, seqNo);
            logInfo.pass("I display CRS ETKT SHARES entries in Transformed SHARES for");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMM_ABORT command to abortan entry in inventory record SHARES entries {string}")
    public void i_enter_VMM_ABORT_command_to_abort_an_entry_in_inventory_record_SHARES_entries(String entryNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMM_ABORT command to abort an entry in inventory record SHARES entries");
            System.out.println("I enter VMM_ABORT command to abort an entry in inventory record SHARES entries" + entryNo);
            isharesPage2.abortAnEntryInInventoryRecord(logInfo, entryNo);
            logInfo.pass("I enter VMM_ABORT command to abort an entry in inventory record SHARES entries");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EP command to display phone number")
    public void iEnterEPCommandToDisplayPhoneNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EP command to display phone number");
            isharesPage2.enterEPCommandToDisplayPhoneNumber(logInfo);
            logInfo.pass("I enter *EP command to display phone number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter multiple BTP commands to display agent queue productivity")
    public void iEnterMultipleBTPCommandsToDisplayAgentQueueProductivity() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter multiple BTP commands to display agent queue productivity");
            isharesPage2.BTPCommandsToDisplayAgentQueueProductivity(logInfo);
            logInfo.pass("I enter multiple BTP commands to display agent queue productivity");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DT command to run ETKT PNIS status indicator")
    public void iEnterDTCommandToRunETKTPNISStatusIndicator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DT command to run ETKT PNIS status indicator");
            isharesPage2.DTCmdToRunETKTPNISStatusIndicator(logInfo);
            logInfo.pass("I enter 6:DT command to run ETKT PNIS status indicator");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:CHSSR_ should display SSR Crew Report List {string}")
    public void iEnter6CHSSR_ShouldDisplaySSRCrewReportList(String OriginCity)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CHSSR_ should display SSR Crew Report List" + OriginCity);
            isharesPage2.displaySSRCrewReportList(logInfo, OriginCity);
            logInfo.pass("I enter 6:CHSSR_ should display SSR Crew Report List" + OriginCity);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I modify the segment {string} for modification type {string}")
    public void iRebookTheSegment(String SegmentNumber, String rebookType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I modify the segment " + rebookType);
            System.out.println("I modify the segment");
            isharesPage2.cancelOrDeleteSegment(logInfo, SegmentNumber, rebookType);
            logInfo.pass("I modify the segment");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I save the changes of pnr after modifying the segment")
    public void iMakeAdjustOnETKTIrregularExchange() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save the changes of pnr after modifying the segment");
            isharesPage2.saveAfterModifyingSegment(logInfo);
            logInfo.pass("I save the changes of pnr after modifying the segment");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I make adjust ETKT coupon {string} Irregular Exchange Reaccomodation")
    public void iMakeAdjustETKTIrregularExchange(String AdjustType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make adjust ETKT coupon " + AdjustType + " Irregular Exchange Reaccomodation");
            isharesPage2.adjustSegmentIrregularExchange(logInfo, AdjustType);
            logInfo.pass("I make adjust ETKT coupon " + AdjustType + " Irregular Exchange Reaccomodation");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I initiate agent report and reestablish link from TAR to CRT")
    public void Initiate_agent_report_and_reestablish_link_from_TAR_to_CRT_for() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I initiate ticket agent report and reestablish link from TAR to CRT");
            isharesPage2.initiateTARAndRestablishLink(logInfo);
            logInfo.pass("I initiate ticket agent report and reestablish link from TAR to CRT");
            System.out.println("I Initiate agent report and reestablish link from TAR to CRT");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter T-ETREFUND command to refund the tkt for refund type {string}")
    public void iEnterTETREFUNDCommandToRefundTheTktForRefundType(String RefundType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETREFUND command to refund the tkt for refund type " + RefundType);
            isharesPage2.refundTkt(logInfo, RefundType);
            logInfo.pass("I enter T-ETREFUND command to refund the tkt for refund type " + RefundType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add remarks {string}")
    public void iAddRemarks(String remarkType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + remarkType + " remarks");

            isharesPage2.addRemarks(logInfo, remarkType);
            logInfo.pass("I add remarks to the PNR");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }

    @And("I enter C:A command to display uneven exchange additional collection")
    public void iEnterCACommandToDisplayUnevenExchangeAdditionalCollection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to display uneven exchange additional collection");

            isharesPage2.enterCAToDisplayUnevenExchangeAdditionalCollection(logInfo);
            logInfo.pass("I enter C:A command to display uneven exchange additional collection");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter A command to display availability for availability request by day of week")
    public void iEnterACommandToDisplayAvailabilityForAvailabilityRequestByDayOfWeek() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A command to display availability for availability request by day of week");

            isharesPage2.displayAvailabilityForAvailabilityRequestByDayOfWeek(logInfo);
            logInfo.pass("I enter A command to display availability for availability request by day of week");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter C:A_ command to add small package shipment to the TAR")
    public void iEnterCA_CommandToAddSmallPackageShipmentToTheTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A_ command to add small package shipment to the TAR");
            isharesPage2.addSmallPackageShipmentToTAR(logInfo);
            logInfo.pass("I enter C:A_ command to add small package shipment to the TAR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter C:A_ command to issue out for collection tickets")
    public void iEnterCA_CommandToIssueOutForCollectionTickets() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A_ command to issue out for collection tickets");
            isharesPage2.issueOutForCollectionTickets(logInfo);
            logInfo.pass("I enter C:A_ command to issue out for collection tickets");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I assign the shipment and open the flight")
    public void iAssignTheShipmentAndOpenTheFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign the shipment and open the flight");
            isharesPage2.openFlight(logInfo);
            logInfo.pass("I assign the shipment and open the flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I capture the base fare after the payment")
    public void iCaptureTheBaseFareAfterThePayment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture the base fare after the payment");
            isharesPage2.captureTheBaseFare(logInfo);
            logInfo.pass("I capture the base fare after the payment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7@_ command to add a ticketing remark")
    public void iEnter7CommandToAddATicketingRemark() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7@_ command to add a ticketing remark");
            isharesPage2.addingTicketingRemark(logInfo);
            logInfo.pass("I enter 7@_ command to add a ticketing remark");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7@ command to delete the ticketing remark")
    public void iEnter7CommandToDeleteTheTicketingRemark() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7@ command to delete the ticketing remark");
            isharesPage2.deleteTicketingRemark(logInfo);
            logInfo.pass("I enter 7@ command to delete the ticketing remark");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A_R command to check redemption availability")
    public void iEnterA_RCommandToCheckRedemptionAvailability() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A_R command to check redemption availability");
            isharesPage2.checkRedemptionAvailability(logInfo);
            logInfo.pass("I enter A_R command to check redemption availability");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:C2_ command to change the amount")
    public void iEnterCC2CommandToChangeTheAmount() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:C2_ command to change the amount");
            isharesPage2.changeTheAmount(logInfo);
            logInfo.pass("I enter C:C2_ command to change the amount");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I capture the total fare after the payment")
    public void iCaptureTheTotalFareAfterThePayment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture the total fare after the payment");
            isharesPage2.captureTheTotalFare(logInfo);
            logInfo.pass("I capture the total fare after the payment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the manual fare quote for all the passengers using payment mode {string}")
    public void i_do_the_manual_fare_quote_for_all_the_pax(String paymentMode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the manual fare quote for all the passengers");
            isharesPage2.addManualFareQuote(logInfo, paymentMode);
            logInfo.pass(MarkupHelper.createLabel("I do the manual fare quote for all the passengers in the PNR with " + paymentMode, ExtentColor.GREEN));

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the manual fare quote for same surname passengers and other passengers using payment mode {string}")
    public void i_do_the_manual_fare_quote_for_same_surname_pax(String paymentMode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the manual fare quote for same surname passengers and other passengers using payment mode "+paymentMode);
            isharesPage2.addManualFareQuoteForSameSurnamePax(logInfo, paymentMode);
            logInfo.pass(MarkupHelper.createLabel("I do the manual fare quote for same surname passengers and other passengers using payment mode "+paymentMode, ExtentColor.GREEN));

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter .1XK cancel command to cancel class of service for segment1 {string}")
    public void I_enter_cancel_command_segment1(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter .1XK cancel command to cancel class of service for segment1" + SegmentNumber);
            isharesPage2.cancel_command_to_cancel_segment_1(logInfo, SegmentNumber);
            System.out.println("I enter .1XK cancel command to cancel class of service for segment1" + SegmentNumber);
            logInfo.pass("I enter .1XK cancel command to cancel class of service for segment1" + SegmentNumber);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }

    @And("I enter VMML command for Mass Modify Leg Header entry {string}")
    public void i_enter_VMML_command_for_mass_modify_leg_header_entry(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMML command for Mass Modify Leg Header entry");
            isharesPage2.enterVMMLCommandforMassModifyLegEntry(logInfo, entry);
            logInfo.pass("I enter VMML command for Mass Modify Leg Header entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I run the entry to Display Detail Status {string}")
    public void i_run_entry_to_display_detail_status(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the entry to Display Detail Status");
            isharesPage2.displayDetailStatusOfEntry(logInfo, entry);
            System.out.println("I run the entry to Display Detail Status");
            logInfo.pass("I run the entry to Display Detail Status");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter multiple commands to display availability for new space RQ type")
    public void iEnterMultipleCommandsToDisplayAvailabilityForNewSpaceRQType() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter multiple commands to display availability for new space RQ type");
            isharesPage2.displayAvailabilityForNewSpaceRQType(logInfo);
            logInfo.pass("I enter multiple commands to display availability for new space RQ type");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I display new space RQ type")
    public void iDisplayNewSpaceRQType() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display new space RQ type");
            isharesPage2.displayNewSpaceRQType(logInfo);
            logInfo.pass("I display new space RQ type");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I turn off AQQ for the flight")
    public void I_turn_off_AQQ_for_the_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I turn off AQQ for the flight");
            isharesPage2.turnOffAQQForFlight(logInfo);
            logInfo.pass("I turn off AQQ for the flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter L_ command to display special function name list")
    public void iEnterL_CommandToDisplaySpecialFunctionNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter L_ command to display special function name list");
            isharesPage2.displaySpecialFunctionNameList(logInfo);
            logInfo.pass("I enter L_ command to display special function name list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T.A_ command to add an OA item to the TROT table")
    public void iEnterTA_CommandToAddAnOAItemToTheTROTTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T.A_ command to add an OA item to the TROT table");
            isharesPage2.addOAItemToTROTTable(logInfo);
            logInfo.pass("I enter T.A_ command to add an OA item to the TROT table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter G_ command to add, display, modify, delete the entries from the quickpath table in direct reference system")
    public void iEnterG_CommandToAddDisplayModifyDeleteTheEntriesFromTheQuickpathTableInDirectReferenceSystem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter G_ command to add, display, modify, delete the entries from the quickpath table in direct reference system");
            isharesPage2.quickpathTableEntries(logInfo);
            logInfo.pass("I enter G_ command to add, display, modify, delete the entries from the quickpath table in direct reference system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET_SECURITY for action {string}")
    public void i_enter_tetSecurity(String action) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_SECURITY for action " + action);
            isharesPage2.etktSecurityActionOK(logInfo, action);
            logInfo.pass("I enter T-ET_SECURITY for action " + action);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET_SECURITY for re-action {string}")
    public void i_enter_TETSecurity_for_reaction(String action) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_SECURITY for re-action " + action);
            isharesPage2.etktSecurityReaction(logInfo, action);
            logInfo.pass("I enter T-ET_SECURITY for re-action " + action);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ETRESCRS1S command to display ETKT restriction table")
    public void iEnterTETRESCRSCommandToDisplayETKTRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETRESCRS1S command to display ETKT restriction table");

            isharesPage2.displayETRESCRSRestrictionTable(logInfo);
            logInfo.pass("I enter T-ETRESCRS1S command to display ETKT restriction table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);

        }
    }

    @And("I enter T-ETRES50 command to display ETKT restriction table")
    public void iEnterTETRES50CommandToDisplayETKTRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETRES50 command to display ETKT restriction table");

            isharesPage2.displayETRES50RestrictionTable(logInfo);
            logInfo.pass("I enter T-ETRES50 command to display ETKT restriction table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter T-ETRESA command to display ETKT restriction table")
    public void iEnterTETRESACommandToDisplayETKTRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETRESA command to display ETKT restriction table");

            isharesPage2.displayETRESARestrictionTable(logInfo);
            logInfo.pass("I enter T-ETRESA command to display ETKT restriction table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter T-ETRESD command to display ETKT restriction table")
    public void iEnterTETRESDCommandToDisplayETKTRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETRESD command to display ETKT restriction table");

            isharesPage2.displayETRESDRestrictionTable(logInfo);
            logInfo.pass("I enter T-ETRESD command to display ETKT restriction table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter T-ETARC command to display ETKT restriction table")
    public void iEnterTETARCCommandToDisplayETKTRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETARC command to display ETKT restriction table");

            isharesPage2.displayETARCRestrictionTable(logInfo);
            logInfo.pass("I enter T-ETARC command to display ETKT restriction table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter to Display VIEWCC rules")
    public void I_enter_to_Display_VIEWCC_rules() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter to Display VIEWCC rules");
            isharesPage2.enterToDisplayVIEWCCRules(logInfo);
            logInfo.pass("I enter to Display VIEWCC rules");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter F*AT command to display Auto Priced details")
    public void I_enter_FAT_command_to_display_Auto_Priced_details() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter F*AT command to display Auto Priced details");
            isharesPage2.enterFATCommandToDisplayAutoPriceDetails(logInfo);
            logInfo.pass("I enter F*AT command to display Auto Priced details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *FH Command to display Fare History")
    public void I_enter_FH_Command_to_display_Fare_History() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FH Command to display Fare History");
            isharesPage2.enterFHCommandToDisplayHistory(logInfo);
            logInfo.pass("I enter *FH Command to display Fare History");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FF2 to display Fare details")
    public void i_enter_FF2_to_display_Fare_deatils() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FF2 to display Fare details");
            isharesPage2.enterFF2ToDisplayFareDetails(logInfo);
            logInfo.pass("I enter FF2 to display Fare details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add and remove commuter code {string} to commuter carrier code table")
    public void i_enter_command_to_add_and_remove_commuter_code(String itemCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add and remove commuter code to commuter carrier code table");
            isharesPage2.enter_command_to_add_and_remove_commuter_code(logInfo, itemCode);
            logInfo.pass("I enter command to add and remove commuter code to commuter carrier code table");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter full table display SHARES entries command")
    public void i_enter_full_table_display_SHARES_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter full table display SHARES entries command");
            isharesPage2.enter_full_table_display_SHARES_command(logInfo);
            logInfo.pass("I enter full table display SHARES entries command");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter baggage rules display command by ETKT sequence number")
    public void i_enter_baggage_rules_display_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter baggage rules display command by ETKT sequence number");
            isharesPage2.enter_baggage_rules_display_command(logInfo);
            logInfo.pass("I enter baggage rules display command by ETKT sequence number");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PXI2PRLniata Database control entries command")
    public void i_enter_PXI2PRLniata_Database_control_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PXI2PRLniata Database control entries command");
            isharesPage2.enter_PXI2PRLniata_Database_control_entries_command(logInfo);
            logInfo.pass("I enter PXI2PRLniata Database control entries command");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PXC command to run database build entry")
    public void i_enter_PXC_to_run_database_build_entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PXC command to run database build entry");
            isharesPage2.enter_PXC_to_run_database_build_entry(logInfo);
            logInfo.pass("I enter PXC command to run database build entry");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PXCPRLniata command to run to set restrictions")
    public void i_enter_PXCPRLniata_Database_control_entries_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PXCPRLniata command to run to set restrictions");
            isharesPage2.enter_PXCPRLniata_Database_control_entries_command(logInfo);
            logInfo.pass("I enter PXCPRLniata command to run to set restrictions");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PXU command to run database build entry")
    public void i_enter_PXU_to_run_database_build_entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PXU command to run database build entry");
            isharesPage2.enter_PXU_to_run_database_build_entry(logInfo);
            logInfo.pass("I enter PXU command to run database build entry");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PXBFlight Database control entries command")
    public void i_enter_PXBFlight_Database_control_entries_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PXBFlight Database control entries command");
            isharesPage2.enter_PXBFlight_Database_control_entries_command(logInfo);
            logInfo.pass("I enter PXBFlight Database control entries command");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PXDFlight Database control entries command")
    public void i_enter_PXDFlight_Database_control_entries_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PXDFlight Database control entries command");
            isharesPage2.enter_PXDFlight_Database_control_entries_command(logInfo);
            logInfo.pass("I enter PXDFlight Database control entries command");


        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability {string} to {string} to choose a different flight")
    public void i_search_for_flight_availability_for_special_PNR_for_different_flight_and_choose_a_different_flight(String Origin, String Destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for different flight");
            isharesPage2.searchFlightAvailabilityForDifferentFlight(logInfo, Origin, Destination);
            logInfo.pass("I search for flight availability for different flight");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do reissue using T-$UE with uneven exchange {string} and {string}")
    public void iMakeUnEvenExchangeReissue(String segSequence, String RefundType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make uneven exchange reissue");

            isharesPage2.unEvenExchange(logInfo, segSequence, RefundType);
            logInfo.pass("I make uneven exchange reissue");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }

    @And("I enter T-ETRES command to display ETKT restriction table")
    public void iEnterTETRESCommandToDisplayETKTRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETRES/* command to display ETKT restriction table");

            isharesPage2.displayETRESRestrictionTable(logInfo);
            logInfo.pass("I enter T-ETRES/* command to display ETKT restriction table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter T-ET_ command to do involuntary ticket adjustment")
    public void iEnterTET_CommandToDoInvoluntaryTicketAdjustment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_ command to do involuntary ticket adjustment");

            isharesPage2.doInvolunatryAdjustment(logInfo);
            logInfo.pass("I enter T-ET_ command to do involuntary ticket adjustment");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I do reissue using T-$EE with even exchange {string} and {string}")
    public void iMakeEvenExchangeReissue(String segSequence, String ExchangeType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make even exchange reissue");

            isharesPage2.evenExchange(logInfo, segSequence, ExchangeType);
            logInfo.pass("I make even exchange reissue");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }

    @And("I enter C:A command to run even exchange")
    public void iEnterCACommandForEvenExchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to run even exchange");

            isharesPage2.enterToRunEvenExchanges(logInfo);
            logInfo.pass("I enter C:A command to run even exchange");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter C:A command to run multiple forms of payment")
    public void iEnterCACommandToRunMultipleFormsOfPayment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to run even exchange");

            isharesPage2.enterCACommandToRunMultipleFormsOfPayment(logInfo);
            logInfo.pass("I enter C:A command to run even exchange");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter K-T-PARTNER command to display partner application table")
    public void iEnterKTPARTNERCommandToDisplayPartnerApplicationTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to display partner application table");

            isharesPage2.enterKTPARTNERCommandToDisplayPartnerApplicationTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER command to display partner application table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter T-ETARC command to display rules")
    public void iEnterTETARCCommandToDisplayRules() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETARC command to display rules");

            isharesPage2.enterTETARCCommandToDisplayRules(logInfo);
            logInfo.pass("I enter T-ETARC command to display rules");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter TCRCTRZZ command to display printer")
    public void iEnterTCRCTRZZCommandToDisplayPrinter() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETARC command to display rules");

            isharesPage2.enterTCRCTRZZCommandToDisplayPrinter(logInfo);
            logInfo.pass("I enter T-ETARC command to display rules");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter T-ETARC command to add item to ARC table")
    public void iEnterTETARCCommandToAddItemToARCTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETARC command to display rules");

            isharesPage2.enterTETARCCommandToAddItemToARCTable(logInfo);
            logInfo.pass("I enter T-ETARC command to display rules");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }

    @And("I enter T-ETARC command to delete rule from table")
    public void iEnterTETARCCommandToDeleteRuleFromTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETARC command to display rules");

            isharesPage2.enterTETARCCommandToDeleteRuleFromTable(logInfo);
            logInfo.pass("I enter T-ETARC command to display rules");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter T-ETMAP command to add LGA to the common city table")
    public void iEnterTETMAPCommandToAddLGAToTheCommonCityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETMAP command to add LGA to the common city table");

            isharesPage2.displayLGAToTheCommonCityTable(logInfo);
            logInfo.pass("I enter T-ETMAP command to add LGA to the common city table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter K-T-PARTNER command to display CM Alliance Partner Table")
    public void iEnterKTPARTNERCommandToDisplayCMAlliancePartnerTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to display CM Alliance Partner Table");
            isharesPage2.displayCMAlliancePartnerTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER command to display CM Alliance Partner Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }


    }

    @And("I enter K-T-PARTNER_ command to replace CarrierCode in Alliance Partner Table")
    public void iEnterKTPARTNER_CommandToReplaceCarrierCodeInAlliancePartnerTable() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_ command to replace CarrierCode in Alliance Partner Table");
            isharesPage2.getDisplayReplacedCarriercode_AlliancePartnerTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER_ command to replace CarrierCode in Alliance Partner Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*SECURITY_ to Display security table items for LNIATA starting with ‘6000’")
    public void iEnterTETSECURITY_ToDisplaySecurityTableItemsForLNIATAStartingWith() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*SECURITY_ to Display security table items for LNIATA starting with ‘6000’");
            isharesPage2.displaySecurityTable(logInfo);
            logInfo.pass("I enter T-ET*SECURITY_ to Display security table items for LNIATA starting with ‘6000’");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter C:R_A_ command to add a remark to the TAR")
    public void iEnterCR_A_CommandToAddARemarkToTheTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:R_A_ command to add a remark to the TAR");
            isharesPage2.addARemarkToTheTAR(logInfo);
            logInfo.pass("I enter C:R_A_ command to add a remark to the TAR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:R_D command to display the remarks in the TAR")
    public void iEnterCR_DCommandToDisplayTheRemarksInTheTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:R_D command to display the remarks in the TAR");
            isharesPage2.displayRemarksInTheTAR(logInfo);
            logInfo.pass("I enter C:R_D command to display the remarks in the TAR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:A_*EB_ command to add excess baggage tickets or special service tickets")
    public void iEnterCA_EB_CommandToAddExcessBaggageTicketsOrSpecialServiceTickets() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A_*EB_ command to add excess baggage tickets or special service tickets");
            isharesPage2.addExcessBaggageTickets(logInfo);
            logInfo.pass("I enter C:A_*EB_ command to add excess baggage tickets or special service tickets");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LA$R|P_ command to get the best buy fare quote for the passengers for specific segments {string}")
    public void iEnterLA$RP_CommandToGetTheBestBuyFareQuoteForThePassengersForTheSegments(String segments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$R|P_ command to get the best buy fare quote for the passengers for specific segments");
            isharesPage2.bestBuyForSpecificSegments(logInfo, segments);
            logInfo.pass("I enter LA$R|P_ command to get the best buy fare quote for the passengers for specific segments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:A_ command to add ticket numbers to the TAR for ticket booklets issued in conjunction with another booklet")
    public void iEnterCA_CommandToAddTicketNumbersToTheTARForTicketBookletsIssuedInConjunctionWithAnotherBooklet() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A_ command to add ticket numbers to the TAR for ticket booklets issued in conjunction with another booklet");
            isharesPage2.addTktNumbersToTARConjunctionTickets(logInfo);
            logInfo.pass("I enter C:A_ command to add ticket numbers to the TAR for ticket booklets issued in conjunction with another booklet");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:SS_ commands to link, display, add remarks to the TSSR as the cashier or supervisor entries")
    public void iEnterCSS_CommandsToLinkDisplayAddRemarksToTheTSSRAsTheCashierOrSupervisorEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:SS_ commands to link, display, add remarks to the TSSR as the cashier or supervisor entries");
            isharesPage2.cashierOrSupervisorEntriesToTSSR(logInfo);
            logInfo.pass("I enter C:SS_ commands to link, display, add remarks to the TSSR as the cashier or supervisor entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D command to get the TAR ACO display entries")
    public void iEnterCDCommandToGetTheTARACODisplayEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D command to get the TAR ACO display entries");
            isharesPage2.Enter_C_D(logInfo);
            logInfo.pass("I enter C:D command to get the TAR ACO display entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:A_ command to add small package shipment to the TAR and I use all the taxes in the PNR")
    public void iEnterCA_CommandToAddSmallPackageShipmentToTheTARAndIUseAllTheTaxesInThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A_ command to add small package shipment to the TAR and I use all the taxes in the PNR");
            isharesPage2.addSmallPackageShipmentToTARAndUseAllTaxes(logInfo);
            logInfo.pass("I enter C:A_ command to add small package shipment to the TAR and I use all the taxes in the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I capture all the taxes in the PNR")
    public void iCaptureAllTheTaxesInThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture all the taxes in the PNR");
            isharesPage2.captureTheTaxValues(logInfo);
            logInfo.pass("I capture all the taxes in the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the appswitch display command {string}")
    public void i_run_appswitch_display_command(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the appswitch display command");
            isharesPage2.appSwitchDisplayCommand(logInfo, entry);
            logInfo.pass("I run the appswitch display command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMS command to run the inventory display {string}")
    public void I_enter_VMS_command_to_run_the_inventory_display(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIL command to run the inventory display");
            isharesPage2.inventoryDisplay(logInfo, entry);
            logInfo.pass("I enter VIL command to run the inventory display");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ should display Standby list passengers with {string}")
    public void iEnterLD_ShouldDisplayHereWithDetailsWith(String OriginCity) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_ should display Standby list passengers with {string}");
            isharesPage2.displayStandbyList(logInfo, OriginCity);
            logInfo.pass("I enter 6:LD_ should display Standby list passengers with {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6_KT*  command to do mass transfer")
    public void iEnter_KTCommandToDoMassTransfer() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_KT*  command to do mass transfer");
            isharesPage2.getDisplayMassTransfer(logInfo);
            logInfo.pass("I enter 6_KT*  command to do mass transfer");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LD_ should display Standby list passengers with different flight{string}")
    public void iEnterLD_ShouldDisplayStandbyListPassengersWithDifferentFlight(String OriginCity) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_ should display Standby list passengers with different flight{string}");
            isharesPage2.displayStandbyListforDifferentFlight(logInfo, OriginCity);
            logInfo.pass("I enter 6:LD_ should display Standby list passengers with different flight{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MX command for class connection exception for Airport {string}")
    public void I_enter_MX_command_for_class_connection_exception_for_Airport(String AirportCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MX command for class connection exception for Airport " + AirportCode);
            isharesPage2.enterCommandMX_(logInfo, AirportCode);
            logInfo.pass("I enter MX command for class connection exception for Airport " + AirportCode);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command KT_*ALL for displaying prime PCH table data for all carriers and all tiers")
    public void I_enter_command_KT_for_displaying_prime_PCH_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command KT_*ALL for displaying prime PCH table data for all carriers and all tiers");
            isharesPage2.enterCommandKT_ALL(logInfo);
            logInfo.pass("I enter command KT_*ALL for displaying prime PCH table data for all carriers and all tiers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify display table Shares entries")
    public void I_verify_display_table_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify display table Shares entries");
            isharesPage2.verifyDisplayTableSharesEntries(logInfo);
            logInfo.pass("I verify display table Shares entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter send response of display to a printer SHARES entry")
    public void i_enter_send_response_of_display_to_a_printer_SHARES_entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter send response of display to a printer SHARES entry");
            isharesPage2.enter_send_response_of_display_to_a_printer_SHARES_entry(logInfo);
            logInfo.pass("I enter send response of display to a printer SHARES entry");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Partial Table Displays in Negotiated Fare Access Table")
    public void I_enter_partial_table_display_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Partial Table Displays in Negotiated Fare Access Table");
            isharesPage2.enter_partial_table_display_command(logInfo);
            logInfo.pass("I enter Partial Table Displays in Negotiated Fare Access Table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter display all commuter carriers from the Interline Partner Commuter Carrier Code table")
    public void I_enter_display_all_commuter_carriers_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter display all commuter carriers from the Interline Partner Commuter Carrier Code table");
            isharesPage2.display_all_commuter_carriers(logInfo);
            logInfo.pass("I enter display all commuter carriers from the Interline Partner Commuter Carrier Code table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-F_ command to verify force sell check-in with Gate Bag Option Entry")
    public void iEnterF_CommandToVerifyForceSellCheckInWithGateBagOptionEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-F_ command to verify force sell check-in with Gate Bag Option Entry");
            isharesPage2.verifyForceSellCheckin_GateBagOptionEntry(logInfo);
            logInfo.pass("I enter 6-F_ command to verify force sell check-in with Gate Bag Option Entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMR_ command to modify inventory remarks {string}")
    public void iEnterVMR_CommandToModifyInventoryRemarks(String Remarks) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMR_ command to modify inventory remarks {string}");
            isharesPage2.displaymodifiedInventoryRemarks(logInfo, Remarks);
            logInfo.pass("I enter VMR_ command to modify inventory remarks {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TESL command to display List Terminal emulation table")
    public void iEnterTESLCommandToDisplayListTerminalEmulationTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TESL command to display List Terminal emulation table");
            isharesPage2.displayListEmulationTable(logInfo);
            logInfo.pass("I enter TESL command to display List Terminal emulation table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter T_E* to display ETKT table")
    public void iEnterT_EToDisplayETKTTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_E* to display ETKT table");
            isharesPage2.enterT_EToDisplayETKTTable(logInfo);
            logInfo.pass("I enter T_E* to display ETKT table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_EA command to add flights from 130 to 139 to table with effective and discontinue dates")
    public void iEnterT_EACommandToAddFlightsFromToToTableWithEffectiveAndDiscontinueDates() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_EA command to add flights from 130 to 139 to table with effective and discontinue dates");
            isharesPage2.enterT_EACommand(logInfo);
            logInfo.pass("I enter T_EA command to add flights from 130 to 139 to table with effective and discontinue dates");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_EX command to delete flight range")
    public void iEnterTEXCommandToDeleteFlightRange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_EX command to delete flight range");
            isharesPage2.enterT_EXCommand(logInfo);
            logInfo.pass("I enter T_EX command to delete flight range");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*CRS command display ETKT CRS table")
    public void iEnterTETCRSCommandDisplayETKTCRSTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*CRS command display ETKT CRS table");
            isharesPage2.enterT_ET_CRSCommand(logInfo);
            logInfo.pass("I enter T-ET*CRS command display ETKT CRS table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LA_R command to do best buy fare quote")
    public void iEnterLA_RCommandForBestBuy() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA_R command to do best buy fare quote");
            System.out.println("I enter LA_R command to do best buy fare quote");
            isharesPage2.enterLA_RCmdForBestBuy(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*CRS_1A command display 1A from CRS table")
    public void iEnterTETCRS_ACommandDisplayAFromCRSTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*CRS_1A command display 1A from CRS table");
            isharesPage2.enterT_ET_CRS_IACommand(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*CRS_1S command display 1S from CRS table")
    public void iEnterTETCRS_SCommandDisplayAFromCRSTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*CRS_1S command display 1S from CRS table");
            isharesPage2.enterT_ET_CRS_1SCommand(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET_CRS_DELETE command to delete item from CRS table")
    public void iEnterTETCRSDELETECommandToDeleteItemFromCRSTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_CRS_DELETE command to delete item from CRS table");
            isharesPage2.enterT_ET_CRSCommandDeleteFromCRSTable(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*CRS_1S command to add 1S from CRS table")
    public void iEnterTETCRS_SCommandToAddSFromCRSTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*CRS_1S command to add 1S from CRS table");
            isharesPage2.enterTETCRS_SCommandToAddSFromCRSTable(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*_L to perform involuntary ticket adjustment for segment {string}")
    public void iEnterTET_LToPerformInvoluntaryTicketAdjustment(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*_L to perform involuntary ticket adjustment");
            isharesPage2.performInvolunatryAdjustment(logInfo, SegmentNumber);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET_S command to do involuntary ticket adjustment")
    public void iEnterTET_SCommandToDoInvoluntaryTicketAdjustment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_S command to do involuntary ticket adjustment");

            isharesPage2.doInvolunatryAdjustment(logInfo);
            logInfo.pass("I enter T-ET_S command to do involuntary ticket adjustment");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*SECURITY to display ETKT Security Table")
    public void I_enter_TETSECURITY_to_display_ETKT_Security_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "And I enter T-ET*SECURITY to display ETKT Security Table");
            isharesPage2.enter_TETSECURITY_to_display_ETKT_Security_Table(logInfo);
            logInfo.pass("I enter T-ET*SECURITY to display ETKT Security Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-ET_SECURITY_ISSUEALL to issue ETKTs with any form of payment")
    public void I_enter_TETSECURITY_ISSUEALL_to_issue_ETKTs_with_any_form_of_payment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "And I enter T-ET/SECURITY/FE*/TBM/*/*/ISSUEALL to issue ETKTs with any form of payment");
            isharesPage2.enter_TETSECURITY_ISSUEALL_to_issue_ETKTs_with_any_form_of_payment(logInfo);
            logInfo.pass("I enter T-ET/SECURITY/FE*/TBM/*/*/ISSUEALL to issue ETKTs with any form of payment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-ET_SECURITY_DETACH to add security rule that allows an agent with terminal 020112")
    public void I_enter_TETSECURITY_to_add_security_rule_that_allows_an_agent_with_terminal() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "And I enter T-ET/SECURITY/020112/EWR/*/*/DETACH to add security rule that allows an agent with terminal 020112");
            isharesPage2.enter_TETSECURITY_to_add_security_rule_that_allows_an_agent_with_terminal(logInfo);
            logInfo.pass("I enter T-ET/SECURITY/020112/EWR/*/*/DETACH to add security rule that allows an agent with terminal 020112");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-ET*SECURITY_L02 to display security table items for Line 2 from ETKT")
    public void I_enter_TETSECURITY_L02_to_display_security_table_items_for_Line2_from_ETKT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*SECURITY/L02 to display security table items for Line 2 from ETKT");
            isharesPage2.enter_TETSECURITY_L02_to_display_security_table_items_for_Line2_from_ETKT(logInfo);
            logInfo.pass("I enter T-ET*SECURITY/L02 to display security table items for Line 2 from ETKT");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ETRAC to display Display exception Table for specific ARC")
    public void I_enter_TETSECURITY_L02_to_display_exception_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETRAC to display Display exception Table for specific ARC");
            isharesPage2.enterT_ETRACCommandToDisplayPrinter(logInfo);
            logInfo.pass("I enter T-ETRAC to display Display exception Table for specific ARC");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter GEX and GMX command to display Error Messages for DRS Security Profile System entries")
    public void iEnterGEXAndGMXCommandToDisplayErrorMessagesForDRSSecurityProfileSystemEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter GEX and GMX command to display Error Messages for DRS Security Profile System entries");
            isharesPage2.enterGEXAndGMXCommand(logInfo);
            logInfo.pass("I enter GEX and GMX command to display Error Messages for DRS Security Profile System entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter GMA command to display error messages for Word processing Functions with invalid parameters")
    public void iEnterGMACommandToDisplayErrorMessagesForWordProcessingFunctionsWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter GMA command to display error messages for Word processing Functions with invalid parameters");
            isharesPage2.enterGMACommandToDisplayError(logInfo);
            logInfo.pass("I enter GMA command to display error messages for Word processing Functions with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter XA command to display Error Messages for space Available Listings entries")
    public void iEnterXACommandToDisplayErrorMessagesForSpaceAvailableListingsEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter XA command to display Error Messages for space Available Listings entries");
            isharesPage2.enterXACommand(logInfo);
            logInfo.pass("I enter XA command to display Error Messages for space Available Listings entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I assign a shipment of different equipment and verify {string} of pending ship assignment")
    public void I_assign_a_shipment_of_different_equipment_and_verify_of_pending_ship_assignment_entries(String status) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign a shipment of different equipment and verify");

            isharesPage2.assignShipmentOfDifferentEquipment(logInfo, status);
            logInfo.pass("I assign a shipment of different equipment and verify");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter 7TAM command to display Error Messages for Ticketing Information entries")
    public void iEnterTAMCommandToDisplayErrorMessagesForTicketingInformationEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7TAM command to display Error Messages for Ticketing Information entries");

            isharesPage2.enterTAMCommand(logInfo);
            logInfo.pass("I enter 7TAM command to display Error Messages for Ticketing Information entries");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter -2@ command to display Error Messages for Modification of Passenger Data entries")
    public void iEnterCommandToDisplayErrorMessagesForModificationOfPassengerDataEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter -2@ command to display Error Messages for Modification of Passenger Data entries");

            isharesPage2.enterCommandToDisplayErrorMessagesForModificationOfPassengerDataEntries(logInfo);
            logInfo.pass("I enter -2@ command to display Error Messages for Modification of Passenger Data entries");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LD_APIS command for displaying APIS List")
    public void iEnter6LDAPISCommandForDisplayingAPISList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_APIS command for displaying APIS List");
            isharesPage2.displayAPISList(logInfo);
            logInfo.pass("I enter 6:LD_APIS command for displaying APIS List");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add ARNK segment in the pnr")
    public void iAddARNKSegment() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add ARNK segment");
            isharesPage2.addARNK(logInfo);
            logInfo.pass("I add ARNK segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I book the flight with {string} for booking type {string}")
    public void iBookTheFlight(String FlightIndex, String bookingType) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I book the flight for Segment " + FlightIndex + "for booking type " + bookingType);
            isharesPage2.bookTheFlight(logInfo, FlightIndex, bookingType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter KJ command to display Error Messages for Inventory Seat Allocation Modification entries")
    public void iEnterKJCommandToDisplayErrorMessagesForInventorySeatAllocationModificationEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to display Error Messages for Inventory Seat Allocation Modification entries");
            isharesPage2.enterKJCommand(logInfo);
            logInfo.pass("I enter KJ command to display Error Messages for Inventory Seat Allocation Modification entries");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*_ command ARC_CDS Sequence Number Range Table")
    public void iEnterTET_CommandARC_CDSSequenceNumberRangeTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*_ command ARC_CDS Sequence Number Range Table");
            isharesPage2.displayARC_CDSSequenceNumberRangeTable(logInfo);
            logInfo.pass("I enter T-ET*_ command ARC_CDS Sequence Number Range Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter invalid passenger name and validate the error message")
    public void iEnterInvalidPassengerNameAndValidateTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid passenger name and validate the error message");
            isharesPage2.enterInvalidPassengerName(logInfo);
            logInfo.pass("I enter invalid passenger name and validate the error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A command for {string} and validate the error message")
    public void iEnterACommandForAndValidateTheErrorMessage(String errorType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A command and validate the error message");
            isharesPage2.enter6_A_andValidateError(logInfo, errorType);
            logInfo.pass("I enter 6:A command and validate the error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OTURCMNN1_ and OSURCMNN1_ commands to obtain auxiliary services")
    public void iEnterOTURCMNN_AndOSURCMNN_CommandsToObtainAuxiliaryServices() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OTURCMNN1_ and OSURCMNN1_ commands to obtain auxiliary services");
            isharesPage2.obtainAuxiliaryServices(logInfo);
            logInfo.pass("I enter OTURCMNN1_ and OSURCMNN1_ commands to obtain auxiliary services");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 5TKT*_ command to add remark field to the PNR")
    public void iEnter5TKT_CommandToAddRemarkFieldToThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5TKT*_ command to add remark field to the PNR");
            isharesPage2.addRemarkFieldToThePNR(logInfo);
            logInfo.pass("I enter 5TKT*_ command to add remark field to the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LA$R#N_ command to do the fare quote for a particular passenger {string}")
    public void iEnterLA$RN_CommandToDoTheFareQuoteForAParticularPassenger(String paxNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$R#N_ command to do the fare quote for a particular passenger");
            isharesPage2.fareQuoteForAParticularPassenger(logInfo, paxNumber);
            logInfo.pass("I enter LA$R#N_ command to do the fare quote for a particular passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I make the payment using the payment type {string}")
    public void iMakeThePaymentUsingThePaymentType(String paymentType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the payment");
            isharesPage2.makePayment(logInfo, paymentType);
            logInfo.pass("I make the payment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 31@ command to delete a SSR from the PNR")
    public void iEnterCommandToDeleteASSRFromThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 31@ command to delete a SSR from the PNR");
            isharesPage2.deleteSSR(logInfo);
            logInfo.pass("I enter 31@ command to delete a SSR from the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_PF* command to display negotiated fare user access table")
    public void iEnterT_PFCommandToDisplayNegotiatedFareUserAccessTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T/PF* command to display negotiated fare user access table");
            isharesPage2.displayNegotiatedFareUserAccessTable(logInfo);
            logInfo.pass("I enter T/PF* command to display negotiated fare user access table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*COMMUTER_OA command to display interline partner commuter carrier code for a particular interline partner airline")
    public void iEnterTETCOMMUTER_OACommandToDisplayInterlinePartnerCommuterCarrierCodeForAParticularInterlinePartnerAirline() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*COMMUTER/OA command to display interline partner commuter carrier code for a particular interline partner airline");
            isharesPage2.displayInterlinePartnerCommuterCarrierCode(logInfo);
            logInfo.pass("I enter T-ET*COMMUTER/OA command to display interline partner commuter carrier code for a particular interline partner airline");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T|$DSP|ALL command to Display Credit Card Company Table")
    public void iEnterT$DSPALLCommandToDisplayCreditCardCompanyTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T|$DSP|ALL command to Display Credit Card Company Table");
            isharesPage2.displayCreditCardCompanyTable(logInfo);
            logInfo.pass("I enter T|$DSP|ALL command to Display Credit Card Company Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T|$DSP|cc command to Display Credit Card Company Item {string}")
    public void iEnterT$DSPCcCommandToDisplayCreditCardCompanyItem(String Item) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T|$DSP|cc command to Display Credit Card Company Item {string}");
            isharesPage2.displayCreditCardCompanyItem(logInfo, Item);
            logInfo.pass("I enter T|$DSP|cc command to Display Credit Card Company Item {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T|$ADD_ command to Add Credit Card Company Item {string}")
    public void iEnterT$ADD_CommandToAddCreditCardCompanyItem(String Item) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T|$ADD_ command to Add Credit Card Company Item {string}");
            isharesPage2.addCreditCardCompanyItem(logInfo, Item);
            logInfo.pass("I enter T|$ADD_ command to Add Credit Card Company Item {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter T|$DEL|_ command to Delete Credit Card Company Item{string}")
    public void iEnterT$DEL_CommandToDeleteCreditCardCompanyItem(String Item) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T|$DEL|_ command to Delete Credit Card Company Item{string}");
            isharesPage2.deleteCreditCardCompanyItem(logInfo, Item);
            logInfo.pass("I enter T|$DEL|_ command to Delete Credit Card Company Item{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter  T-ET|SECURITY|_ command to display VIEWCC rules for specific LNIATA ,city code{string}, duty code, business id")
    public void iEnterTETSECURITY_CommandToDisplayVIEWCCRulesForSpecificLNIATACityCodeDutyCodeBusinessId(String cityCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter  T-ET|SECURITY|_ command to display VIEWCC rules for specific LNIATA ,city code{string}, duty code, business id");
            isharesPage2.enterToDisplayVIEWCCRulesForparticularLNIATA(logInfo, cityCode);
            logInfo.pass("I enter  T-ET|SECURITY|_ command to display VIEWCC rules for specific LNIATA ,city code{string}, duty code, business id");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter to check for Redemption FAF availability from {string} to {string}")
    public void I_enter_to_check_for_redemption_FAF_availability(String OriginCity, String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter to check for Redemption FAF availability");
            isharesPage2.forRedemptionFAFAvailability(logInfo, OriginCity, Destination);
            logInfo.pass("I enter to check for Redemption FAF availability");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter reduce in party $4N command for second segment {string}")
    public void I_enter_reduce_in_party_command_segment2(String Segmentno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter reduce in party $4N command for second segment " + Segmentno);
            isharesPage2.reduce_in_party_command(logInfo, Segmentno);
            logInfo.pass("I enter reduce in party $4N command for second segment " + Segmentno);

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter reduce in party $4N command for third segment {string}")
    public void I_enter_reduce_in_party_command_segment3(String Segmentno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter reduce in party $4N command for second segment " + Segmentno);
            isharesPage2.reduce_in_party_command(logInfo, Segmentno);
            logInfo.pass("I enter reduce in party $4N command for second segment " + Segmentno);

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for obtaining OA space by bundled")
    public void I_enter_obtaining_OA_space_by_bundled_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for obtaining OA space by bundled");
            isharesPage2.obtaining_OA_space_by_bundled(logInfo);
            logInfo.pass("I enter command for obtaining OA space by bundled");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter By AAA & Duty Code entry")
    public void I_enter_By_AAA_duty_code_entry_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter By AAA & Duty Code entry");
            isharesPage2.enter_By_AAA_duty_code_entry_command(logInfo);
            logInfo.pass("I enter By AAA & Duty Code entry");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAPM command to modify the seating table")
    public void i_enter_PAPI_command_to_modify_the_seating_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAPI command to initialize the seating table modification");
            isharesPage2.modifySeatingTable(logInfo);
            logInfo.pass("I enter PAPI command to initialize the seating table modification");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAPI command to initialize the seating table modification")
    public void i_enter_PAPI_command_to_initialize_the_seating_table_modification() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAPI command to initialize the seating table modification");
            isharesPage2.initializeSeatingTableModification(logInfo);
            logInfo.pass("I enter PAPI command to initialize the seating table modification");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A command to display availability for First Available Flight Entry For CM Marketing Flights From {string} To {string}")
    public void iEnterACommandToDisplayAvailabilityForFirstAvailableFlightEntryForCmMarketingFlights(String Origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A command to display availability for First Available Flight Entry For CM Marketing Flights");
            isharesPage2.displayFirstAvailableFlightEntryForCmMarketingFlights(logInfo, Origin, destination);
            logInfo.pass("I enter A command to display availability for First Available Flight Entry For CM Marketing Flights");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter CI command to initialize the agent TAR")
    public void i_enter_CI_command_to_initialize_the_agent_TAR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CI command to initialize the agent TAR");
            isharesPage2.enter_CI(logInfo);
            logInfo.pass("I enter CI command to initialize the agent TAR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIBM command to display the IATA PNL board point master table for {string}")
    public void i_enter_PIBM_command_to_display_the_IATA_PNL_board_point_master_table_for(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIBM command to display the IATA PNL board point master table for" + city);
            isharesPage2.enterPIBMCommandToDisplayIataPnlBoardPointMasterTable(logInfo, city);
            System.out.println("I enter PIBM command to display the IATA PNL board point master table for" + city);
            logInfo.pass("I enter PIBM command to display the IATA PNL board point master table for" + city);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIBC command to display IATA PNL Board Point or City Code Table")
    public void i_enter_PIBC_command_to_display_IATA_PNL_Board_Point_or_City_Code_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIBC command to display IATA PNL Board Point or City Code Table");
            isharesPage2.enterPIBCCommandToDisplayIataPnlBoardPointTable(logInfo);
            System.out.println("I enter PIBC command to display IATA PNL Board Point or City Code Table");
            logInfo.pass("I enter PIBC command to display IATA PNL Board Point or City Code Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIFM command to display the IATA PNL Flight Master Table for {string}")
    public void i_enter_PIFM_command_to_display_the_IATA_PNL_Flight_Master_Table(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIFM command to display the IATA PNL Flight Master Table for" + city);
            isharesPage2.enterPIFMCommandToDisplayIataPnlFlightMasterTable(logInfo, city);
            System.out.println("I enter PIFM command to display the IATA PNL Flight Master Table for" + city);
            logInfo.pass("I enter PIFM command to display the IATA PNL Flight Master Table for" + city);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIMC command to display Master Configuration Table Directory entries")
    public void i_enter_PIMC_command_to_display_Master_Configuration_Table_Directory_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIMC command to display Master Configuration Table Directory entries");
            isharesPage2.enterPIMCCommandToDisplayMasterConfigurationTable(logInfo);
            System.out.println("I enter PIMC command to display Master Configuration Table Directory entries");
            logInfo.pass("I enter PIMC command to display Master Configuration Table Directory entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to pay by VisaCard")
    public void i_enter_command_to_pay_by_VisaCard() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to pay by VisaCard");
            System.out.println("I enter command to pay by VisaCard");
            isharesPage2.payByVisa(logInfo);
            logInfo.pass("I enter command to pay by VisaCard");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ALL command for displaying all passenger list")
    public void iEnterLDALLCommandForDisplayingPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_ALL command for displaying all passenger list");
            isharesPage2.PassengersList(logInfo);
            logInfo.pass("I enter 6:LD_ALL command for displaying all passenger list");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KIX command to Remove a Flight SHARES entries in Transformed SHARES for {string}")
    public void I_enter_KIX_command_to_Remove_a_Flight_SHARES_entries_in_Transformed_SHARES_for(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter KIX command to Remove a Flight SHARES entries in Transformed SHARES for");
            isharesPage2.removeAflightSharesEntries(logInfo, city);
            logInfo.pass("I enter KIX command to Remove a Flight SHARES entries in Transformed SHARES for" + city);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter command to pay by Cash")
    public void i_enter_command_to_pay_by_Cash() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to pay by Cash");
            System.out.println("I enter command to pay by Cash");
            isharesPage2.payByCash(logInfo);
            logInfo.pass("I enter command to pay by Cash");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *AP command to display APIS details for the {string}")
    public void I_enter_AP_Command_to_display_APIS_details_for_the(String paxNo) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *AP command to display APIS details for the paxNo "+paxNo);
            isharesPage2.displayApis(logInfo, paxNo);
            logInfo.pass("I enter *AP command to display APIS details for the paxNo "+paxNo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_A command to assign the seats")
    public void I_enter_6_A_Command_to_assign_the_seats() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_A command to assign the seats");
            isharesPage2.assignSeats(logInfo);
            logInfo.pass("I enter 6_A command to assign the seats");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-* command to display the seatmap")
    public void I_enter_Command_to_display_the_seatmap() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-* command to display the seatmap");
            isharesPage2.displaySeatMap(logInfo);
            logInfo.pass("I enter 6-* command to display the seatmap");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter *EH_FOP command to display the Variuos ETKT history")
    public void I_enter_EH_FOP_Command_to_display_the_Various_ETKT_history() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH_FOP command to display the Variuos ETKT history");
            isharesPage2.displayVariousETKTHistory(logInfo);
            logInfo.pass("I enter *EH_FOP command to display the Variuos ETKT history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIM command to display the inventory history {string}")
    public void i_enter_vim_command_to_display_inventory_history(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIM command to display the inventory history");
            System.out.println("I enter VIM command to display the inventory history");
            isharesPage2.displayInventoryHistory_New(logInfo, entry);
            logInfo.pass("I enter VIM command to display the inventory history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter command for Modify Leg or Booking Compartment {string}")
    public void I_enter_command_for_Modify_leg_or_booking(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIL command to run the inventory display");
            isharesPage2.modifyLegOrBooking(logInfo, entry);
            logInfo.pass("I enter VIL command to run the inventory display");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter to check for FAF availability for default departure city with {string}")
    public void I_enter_to_check_for_FAF_availability_for_default_departure_city(String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter to check for FAF availability for default departure city");
            isharesPage2.availabilityForDefaulfDepartureCity(logInfo, destination);
            logInfo.pass("I enter to check for FAF availability for default departure city");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VD command to display error response modifying inventory default value table with invalid parameters")
    public void iEnterVDCommandToDisplayErrorResponseModifyingInventoryDefaultValueTableWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VD command to display error response modifying inventory default value table with invalid parameters");
            isharesPage2.enterVDCommand(logInfo);
            logInfo.pass("I enter VD command to display error response modifying inventory default value table with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I display error messages for obtaining flight information")
    public void iDisplayErrorMessagesForObtainingFlightInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display error messages for obtaining flight information");
            isharesPage2.displayErrorMessagesForObtainingFlightInformation(logInfo);
            logInfo.pass("I display error messages for obtaining flight information");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to display error for Booking Compartment Profile Tables")
    public void iEnterKJCommandToDisplayErrorForBookingCompartmentProfileTables() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VD command to display error response modifying inventory default value table with invalid parameters");
            isharesPage2.enterKJCommandToDisplayErrorForBookingCompartmentProfileTables(logInfo);
            logInfo.pass("I enter KJ command to display error for Booking Compartment Profile Tables");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add remarks to the PNR for remark type {string}")
    public void iAddRemarksToThePNRForRemarkType(String RemarkType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add remarks to the PNR for remark type " + RemarkType);
            isharesPage2.addRemarkToPnr(logInfo, RemarkType);
            logInfo.pass("I add remarks to the PNR for remark type " + RemarkType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ER Command")
    public void I_enter_ER_command() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ER command");
            isharesPage2.enter_ERCommand(logInfo);
            logInfo.pass("I enter ER command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to display invalid response")
    public void iEnterTTYMessageToDisplayInvalidResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to display invalid response");
            isharesPage2.invalidTTYMessage(logInfo);
            logInfo.pass("I enter TTY message to display invalid response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command 2_ to show all the assigned fleet numbers for flight {string}")
    public void i_enter_2_command_to_show_all_assigned_fleet_nos(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command 2_ to show all the assigned fleet numbers for flight " + flight);
            isharesPage2.showAssignedFleetNos(logInfo, flight);
            logInfo.pass("I enter command 2_ to show all the assigned fleet numbers for flight " + flight);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-* to show Passenger Service Code Table")
    public void i_enter_K_to_show_passenger_service_code_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-* to show Passenger Service Code Table");
            isharesPage2.enterK_commandToShowPSCTable(logInfo);
            logInfo.pass("I enter K-* to show Passenger Service Code Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add SSR {string} using passenger name and other itinerary details")
    public void i_add_SSR_using_itinerary_details(String ssr) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add SSR " + ssr + " using passenger name and other itinerary details");
            isharesPage2.addSSRUsingItineraryDetails(logInfo, ssr);
            logInfo.pass("I add SSR " + ssr + " using passenger name and other itinerary details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-E* to show PSC Exception Table for SSR {string}")
    public void i_add_K_E_to_show_PSC_exception_table(String ssr) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-E*/_ to show PSC Exception Table for SSR " + ssr);
            isharesPage2.showPSCExceptionTableForSSR(logInfo, ssr);
            logInfo.pass("I enter K-E*/_ to show PSC Exception Table for SSR " + ssr);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MD for more display")
    public void i_enter_MD_for_more_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MD for more display");
            isharesPage2.enterMDForMoreDisplay(logInfo);
            logInfo.pass("I enter MD for more display");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6: command for entry {string} for showing SEATS ASSIGNED")
    public void ienter6_Command(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6: command for entry " + entry);
            isharesPage2.enter6_Entry(logInfo, entry);
            logInfo.pass("I enter 6: command for entry " + entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-* to show premium customer handling PCH table")
    public void i_K_T_to_show_premium_customer_handling_PCH_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-* to show premium customer handling PCH table");
            isharesPage2.enterK_T_For_PCH_Table(logInfo);
            logInfo.pass("I enter K-T-* to show premium customer handling PCH table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN*FlightNumber_Date for displaying all items of a flight")
    public void i_enter_KN_FlightNumber_to_display_all_Items() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN*FlightNumber/Date for displaying all items of a flight");
            isharesPage2.enterKN_ToDisplayAllItemsForFlight(logInfo);
            logInfo.pass("I enter KN*FlightNumber/Date for displaying all items of a flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN*FlightNumber_DateRange for displaying all items of a flight in Date Range")
    public void i_enter_KN_FlightNumber_to_display_all_Items_in_Date_range() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN*FlightNumber/DateRange for displaying all items of a flight in Date Range");
            isharesPage2.displayTEDApnr(logInfo);
            logInfo.pass("I enter KN*FlightNumber/DateRange for displaying all items of a flight in Date Range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:A command to perform ASA")
    public void I_enter_6A_command_to_perform_ASA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A command to perform ASA");
            isharesPage2.enter6ACommand_to_PerformASA(logInfo);
            logInfo.pass("I enter 6:A command to perform ASA");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9PTY_ command to add the phone number in  an incorrect format")
    public void I_enter_9PTY_command_to_add_the_phone_number_in_an_incorrect_format() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9PTY_ command to add the phone number in  an incorrect format");
            isharesPage2.enterPhoneDetails_Incorrectformat(logInfo);
            logInfo.pass("I enter 9PTY_ command to add the phone number in  an incorrect format");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKD_ command to run the marketing item default values with time increment factor and market record")
    public void I_enter_MKD_command_to_run_the_marketing_item_default_values_with_time_increment_factor_and_market_record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKD_ command to run the marketing item default values with time increment factor and market record");
            isharesPage2.runTheMarketingItemDefaultValues(logInfo);
            logInfo.pass("I enter MKD_ command to run the marketing item default values with time increment factor and market record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the itinerary reorder function for {string}")
    public void iRunTheItineraryReorderFunction(String ReorderSegNo) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the itinerary reorder function");
            isharesPage2.itineraryReorder(logInfo, ReorderSegNo);
            logInfo.pass("I run the itinerary reorder function");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:A command to Run Document Numbers and Check Digit Verification")
    public void iEnterCACommandToRunDocumentNumbersAndCheckDigitVerification() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to Run Document Numbers and Check Digit Verification");
            isharesPage2.enterCAToRunDocumentNumbersAndCheckDigitVerification(logInfo);
            logInfo.pass("I enter C:A command to Run Document Numbers and Check Digit Verification");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter PM command to Perform Preliminary Meal Ordering request for a specific flight")
    public void iEnterPMCommandToPerformPreliminaryMealOrderingRequestforAspecificflight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PM command to Perform Preliminary Meal Ordering request for a specific flight");
            isharesPage2.PerformPreliminaryMealOrdering(logInfo);
            logInfo.pass("I enter PM command to Perform Preliminary Meal Ordering request for a specific flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PMX command to cancel the meal service")
    public void iEnterPMXCommandTocancelTheMealService() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PMX command to cancel the meal service");
            isharesPage2.cancelTheMealService(logInfo);
            logInfo.pass("I enter PMX command to cancel the meal service");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_ETDOC command to check the documents")
    public void I_enter_T_ETDOC_command_to_check_the_documents() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_ETDOC command to check the documents");
            isharesPage2.checkTheDocuments(logInfo);
            logInfo.pass("I enter T_ETDOC command to check the documents");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIB Board point Master Table Display with invalid parameters")
    public void I_enter_PIB_Board_point_Master_Table_Display_invalid_parameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIB Board point Master Table Display with invalid parameters");
            isharesPage2.PIB_Board_point_Master_Table_Display_invalid_parameters(logInfo);
            logInfo.pass("I enter PIB Board point Master Table Display with invalid parameters");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNL Flight Detail Information Display with invalid parameters")
    public void I_enter_PNL_Flight_Detail_Info_Display_with_invalid_parameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNL Flight Detail Information Display with invalid parameters");
            isharesPage2.PNL_Flight_Detail_Info_Display_with_invalid_parameters(logInfo);
            logInfo.pass("I enter PNL Flight Detail Information Display with invalid parameters");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for Agent Constructed Connection")
    public void I_enter_Agent_Constructed_Connection_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Agent Constructed Connection");
            isharesPage2.Agent_Constructed_Connection_SHARES_entries(logInfo);
            logInfo.pass("I enter command for Agent Constructed Connection");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run the Two Hours minimum Check-In users SHARES entries in Transformed SHARES")
    public void I_enter_command_to_Run_the_Two_Hours_minimum_Check_In_users_SHARES_entries_in_Transformed_SHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run the Two Hours minimum Check-In users SHARES entries in Transformed SHARES");
            isharesPage2.runTheTwoHoursMinimumCHeckIn(logInfo);
            logInfo.pass("I enter command to Run the Two Hours minimum Check-In users SHARES entries in Transformed SHARES");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter to display final meal count")
    public void I_enter_to_display_final_meal_count() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter to display final meal count");
            isharesPage2.toDisplayFinalMealCount(logInfo);
            logInfo.pass("I enter to display final meal count");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I display flight availability using different types of search commands {string} for segment index {string}")
    public void I_display_flight_availability_using_different_types_of_search_commands(String commandType, String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display flight availability using different types of search commands " + commandType + " for segment " + (segmentIndex + 1));
            isharesPage2.differentTypesOfFlightAvailabilitySearch(logInfo, commandType, segmentIndex);
            logInfo.pass("I display flight availability using different types of search commands " + commandType + " for segment " + (segmentIndex + 1));

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:MT_ command to perform mass transfer based on class of service")
    public void iEnter6MT_CommandToPerformMassTransferBasedOnClassOfService() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:MT_ command to perform mass transfer based on class of service");
            isharesPage2.performMassTransferBasedOnCOS(logInfo);
            logInfo.pass("I enter 6:MT_ command to perform mass transfer based on class of service");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:A_ command to assign seats for a particular segment {string}")
    public void iEnterA_CommandToAssignSeatsForAParticularSegment(String segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_ command to assign seats for a particular segment");
            isharesPage2.assignSeatsForParticularSegment(logInfo, segment);
            logInfo.pass("I enter 6:A_ command to assign seats for a particular segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the PNR after performing checkin")
    public void iRetrieveThePNRAfterPerformingCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the PNR after performing checkin");
            isharesPage2.retrievePNRAfterCheckin(logInfo);
            logInfo.pass("I retrieve the PNR after performing checkin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-*AVIH command to display passenger service code selection")
    public void iEnterKAVIHCommandToDisplayPassengerServiceCodeSelection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-*AVIH command to display passenger service code selection");
            isharesPage2.displayPassengerServiceCodeSelection(logInfo);
            logInfo.pass("I enter K-*AVIH command to display passenger service code selection");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 0A command to add ARNK")
    public void iEnter0ACommandToAddARNK() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0A command to add ARNK");
            isharesPage2.addARNKSegment(logInfo);
            logInfo.pass("I enter 0A command to add ARNK");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A_ command to perform ASA for {string}")
    public void iEnter6A_CommandToPerformASAFor(String assignType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_ command to perform ASA");
            isharesPage2.performDifferentTypesOfASA(logInfo, assignType);
            logInfo.pass("I enter 6:A_ command to perform ASA");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command for segment entry with departure time {string}")
    public void i_enter_command_for_segment_entry_with_departure_time(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for segment entry with departure time ");
            isharesPage2.segEntryDepartureTime(logInfo, entry);
            logInfo.pass("I enter command for segment entry with departure time ");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter the PD command to change service in shares {string}")
    public void i_enter_pd_command_to_change_service(String cos) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the PD command to change service in shares");
            isharesPage2.changeServicePD(logInfo, cos);
            logInfo.pass("I enter the PD command to change service in shares " + cos);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter the command to open the flight segment shares")
    public void i_enter_command_to_open_flight_segment_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the command to open the flight segment shares");
            System.out.println("I enter the command to open the flight segment shares");
            isharesPage2.openFlightSegmentShares(logInfo);
            logInfo.pass("I enter the command to open the flight segment shares");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }


    @And("I enter .T1 command to check invalid CTY_AIRLINE code")
    public void i_enter_T1_command_to_check_invalid_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter .T1 command to check invalid CTY_AIRLINE code");
            isharesPage2.enter_T1_command_to_check_invalid_code(logInfo);
            logInfo.pass("I enter .T1 command to check invalid CTY_AIRLINE code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OA Segment modification command during PNR creation")
    public void i_enter_OA_Segments_and_Modify_the_OA_Segment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OA Segment modification command during PNR creation");
            isharesPage2.Creation_of_PNR_OA_Segments_and_Modify_the_OA_Segment(logInfo);
            logInfo.pass("I enter OA Segment modification command during PNR creation");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter .T2 command to check segment")
    public void i_enter_T2_command_Segment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter .T2 command to check segment");
            isharesPage2.enter_T2_command_Segment(logInfo);
            logInfo.pass("I enter .T2 command to check segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OA Segment modification command during PNR creation_NN1")
    public void i_enter_OA_Segments_and_Modify_the_OA_Segment_NN1() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OA Segment modification command during PNR creation");
            isharesPage2.Creation_of_PNR_OA_Segments_and_Modify_the_OA_Segment(logInfo);
            logInfo.pass("I enter OA Segment modification command during PNR creation");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter .T command to check segment")
    public void i_enter_T_command_Segment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter .T command to check segment");
            isharesPage2.enter_T_command_Segment(logInfo);
            logInfo.pass("I enter .T command to check segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter commend to check invalid segment no with service class {string}")
    public void i_enter_commend_to_check_invalid_segment_no(String serviceclass) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter commend to check invalid segment no with service class " + serviceclass);
            isharesPage2.commend_to_check_invalid_segment_no(logInfo, serviceclass);
            logInfo.pass("I enter commend to check invalid segment no with service class " + serviceclass);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter invalid same segment date")
    public void i_enter_enter_invalid_same_segment_date() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid same segment date");
            isharesPage2.enter_inavalid_same_segment_date(logInfo);
            logInfo.pass("I enter invalid same segment date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_PF command to display the Authority Table SHARES entries")
    public void i_enter_commend_to_display_Authority_Tables_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_PF command to display the Authority Table SHARES entries");
            isharesPage2.commend_to_display_Authority_Tables_SHARES_entries(logInfo);
            logInfo.pass("I enter T_PF command to display the Authority Table SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ABS All Display entry")
    public void I_enter_ABS_All_Display_entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ABS All Display entry");
            isharesPage2.enterABSAllDisplayEntry(logInfo);
            logInfo.pass("I enter ABS All Display entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Inventory Display entries")
    public void I_enter_Inventory_Display_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Inventory Display entries");
            isharesPage2.enterInventoryDisplayEntry(logInfo);
            logInfo.pass("I enter Inventory Display entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Delete Item's in The Segment Profile Control")
    public void I_Delete_Items_in_The_Segment_Profile_Control() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Delete Items in The Segment Profile Control");
            isharesPage2.deleteItemsinSegmentProfileControl(logInfo);
            logInfo.pass("I Delete Items in The Segment Profile Control");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter *EH* command to display the ETKT history")
    public void I_Enter_command_for_ETKT_History() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter command for ETKT History");
            isharesPage2.enterCommandforETKTHistory(logInfo);
            logInfo.pass("I Enter command for ETKT History");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter decode flight number")
    public void enter_decode_flight_number() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter decode flight number");
            isharesPage2.enter_DecodeFlightnumber(logInfo);
            logInfo.pass("I enter decode flight number");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter encode flight number")
    public void enter_encode_flight_number() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter encode flight number");
            isharesPage2.enterCENCM_EncodeFlightnumber(logInfo);
            logInfo.pass("I enter encode flight number");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*SECURITY|VIEWCADR command to Display VIEWCADR items")
    public void iEnterTETSECURITYVIEWCADRCommandToDisplayVIEWCADRItems() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*SECURITY|VIEWCADR command to Display VIEWCADR items");
            isharesPage2.displayViewCADRItems(logInfo);
            logInfo.pass("I enter T-ET*SECURITY|VIEWCADR command to Display VIEWCADR items");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the message Queues entries")
    public void enter_message_Queues_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the message Queues entries");
            isharesPage2.enterMessageQueueEntries(logInfo);
            logInfo.pass("I enter the message Queues entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter user control entities")
    public void enter_user_control_entities() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter user control entities");
            isharesPage2.enter_PXI_to_run_database_build_entry(logInfo);
            logInfo.pass("I enter user control entities");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*SECURITY@ command to display the actions which are not allowed in Etkt Security Table")
    public void iEnterTETSECURITYCommandToDisplayTheActionsWhichAreNotAllowedInEtktSecurityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*SECURITY@ command to display the actions which are not allowed in Etkt Security Table");
            isharesPage2.displayTheActionsNotAllowedINetktSecurityTable(logInfo);
            logInfo.pass("I enter T-ET*SECURITY@ command to display the actions which are not allowed in Etkt Security Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter KR|OAC|*|_ command with Host{string} for Display by Flight or Flight Range entries")
    public void iEnterKROAC_WithHostForDisplayByFlightOrFlightRangeEntries(String Host) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR|OAC|*|_ command with Host{string} for Display by Flight or Flight Range entries");
            isharesPage2.displayFlightDetailsWithHost(logInfo, Host);
            logInfo.pass("I enter KR|OAC|*|_ command with Host{string} for Display by Flight or Flight Range entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter VDD command to display Inventory Default value Table")
    public void iEnterVDDCommandToDisplayInventoryDefaultValueTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VDD commantd to display Inventory Default value Table");
            isharesPage2.displayInventoryDefaultValueTable(logInfo);
            logInfo.pass("I enter VDD commantd to display Inventory Default value Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter VDM_ command to display Modify Inventory value Table")
    public void iEnterVDM_CommandToDisplayModifyInventoryDefaultValueTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VDM_ command to display Modify Inventory value Table");
            isharesPage2.displayInventoryModifiedValueTable(logInfo);
            logInfo.pass("I enter VDM_ command to display Modify Inventory value Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VDM_ command to display Modify Inventory value Table with citycode{string}")
    public void iEnterVDM_CommandToDisplayModifyInventoryValueTableWithCitycode(String cityCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VDM_ command to display Modify Inventory value Table with citycode{string}");
            isharesPage2.displayInventoryModifiedValueTablewithcitycode(logInfo, cityCode);
            logInfo.pass("I enter VDM_ command to display Modify Inventory value Table with citycode{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_citycode_01|KN*TL1 command to verify List the Flight Numbers of Segment Profile Control Records entries with citycode{string}")
    public void iEnterT_citycode_KNTLCommandToVerifyListTheFlightNumbersOfSegmentProfileControlRecordsEntriesWithCitycode(String cityCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_citycode_01|KN*TL1 command to verify List the Flight Numbers of Segment Profile Control Records entries with citycode{string}");
            isharesPage2.toVerifyListTheFlightNumbersOFSegmentProfileRecordswithcitycode(logInfo, cityCode);
            logInfo.pass("I enter T_citycode_01|KN*TL1 command to verify List the Flight Numbers of Segment Profile Control Records entries with citycode{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter KDEI|* command to display DEI PROTOCOL TABLE")
    public void iEnterKDEICommandToDisplayDEIPROTOCOLTABLE() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KDEI|* command to display DEI PROTOCOL TABLE");
            isharesPage2.displayDEIProtocolTable(logInfo);
            logInfo.pass("I enter KDEI|* command to display DEI PROTOCOL TABLE");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KDEI|AD_ to verify DEI item number{string}")
    public void iEnterKDEIAD_ToVerifyDEIItemNumber(String ItemNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KDEI|AD_ to verify DEI item number{string}");
            isharesPage2.toVerifyDEIItemNumber(logInfo, ItemNo);
            logInfo.pass("I enter KDEI|AD_ to verify DEI item number{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }


    }

    @And("I enter  T-ET|SECURITY|_ command to display VIEWCADR authorization for specific LNIATA SHARES entries in Transformed SHARES with city code{string}")
    public void iEnterTETSECURITY_CommandToDisplayVIEWCADRAuthorizationForSpecificLNIATASHARESEntriesInTransformedSHARES(String cityCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter  T-ET|SECURITY|_ command to display VIEWCADR authorization for specific LNIATA SHARES entries in Tranformed SHARES with city code{string}");
            isharesPage2.enterToDisplayVIEWCADRAuthorizationForparticularLNIATA(logInfo, cityCode);
            logInfo.pass("I enter  T-ET|SECURITY|_ command to display VIEWCADR authorization for specific LNIATA SHARES entries in Tranformed SHARES with city code{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }


    }

    @And("I enter PIMC command for PNL Master Configuration Table Display with invalid parameters")
    public void iEnterPIMCCommandForPNLMasterConfigurationTableDisplayWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIMC command for PNL Master Configuration Table Display with invalid parameters");
            isharesPage2.enterPIMCCommand(logInfo);
            logInfo.pass("I enter PIMC command for PNL Master Configuration Table Display with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIBZ command for IATA PNL Board Point City Code Table Display with invalid parameters")
    public void iEnterPIBZCommandForIATAPNLBoardPointCityCodeTableDisplayWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIBZ command for IATA PNL Board Point City Code Table Display with invalid parameters");
            isharesPage2.enterPIBZCommand(logInfo);
            logInfo.pass("I enter PIBZ command for IATA PNL Board Point City Code Table Display with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OS command for BSM Generation entries with invalid parameters")
    public void iEnterOSCommandForBSMGenerationEntriesWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OS command for BSM Generation entries with invalid parameters");
            isharesPage2.enterOSCommand(logInfo);
            logInfo.pass("I enter OS command for BSM Generation entries with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIFM to display PNL Flight Master Table Display with invalid parameters")
    public void iEnterPIFMToDisplayPNLFlightMasterTableDisplayWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIFM to display PNL Flight Master Table Display with invalid parameters");
            isharesPage2.enterPIFMCommand(logInfo);
            logInfo.pass("I enter PIFM to display PNL Flight Master Table Display with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIB to display IATA PNL Error Notification Teletype Address Table Display with invalid parameters")
    public void iEnterPIBToDisplayIATAPNLErrorNotificationTeletypeAddressTableDisplayWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIB to display IATA PNL Error Notification Teletype Address Table Display with invalid parameters");
            isharesPage2.enterPIBCommand(logInfo);
            logInfo.pass("I enter PIB to display IATA PNL Error Notification Teletype Address Table Display with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PIAT to display IATA City Code Address Table display entries with invalid parameters")
    public void iEnterPIATToDisplayIATACityCodeAddressTableDisplayEntriesWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT to display IATA City Code Address Table display entries with invalid parameters");
            isharesPage2.enterPIATCommand(logInfo);
            logInfo.pass("I enter PIAT to display IATA City Code Address Table display entries with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIA command to display and modification of Inbound IATA Messages Table  with invalid parameters")
    public void iEnterPIACommandToDisplayAndModificationOfInboundIATAMessagesTableWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIA command to display and modification of Inbound IATA Messages Table  with invalid parameters");
            isharesPage2.enterPIACommand(logInfo);
            logInfo.pass("I enter PIA command to display and modification of Inbound IATA Messages Table  with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KC command to display Marketing Codeshare Reaccommodation with invalid parameters")
    public void iEnterKCCommandToDisplayMarketingCodeshareReaccommodationWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KC command to display Marketing Codeshare Reaccommodation with invalid parameters");
            isharesPage2.enterKCCommand(logInfo);
            logInfo.pass("I enter KC command to display Marketing Codeshare Reaccommodation with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZUDFM commands")
    public void iEnterZUDFMCommands() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZUDFM commands");
            isharesPage2.enterZUDFMCommand(logInfo);
            logInfo.pass("I enter ZUDFM commands");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OTHER AIRLINE SPACE SHARES entry {string}")
    public void iEnterOTHERAIRLINESPACESHARESEntry(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OTHER AIRLINE SPACE SHARES entry");
            isharesPage2.enterOTHERAIRLINESPACESHARESEntry(logInfo, Entry);
            logInfo.pass("I enter OTHER AIRLINE SPACE SHARES entry ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate APIS details in PNR")
    public void validateAPISdata() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate APIS details in PNR");

            isharesPage2.validateAPISData(logInfo);
            logInfo.pass("I validate APIS details in PNR");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter *AP command to display APIS details of all the passengers")
    public void validateAdvancePaxInfo() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *AP command to display APIS details of all the passengers");
            isharesPage2.advancePaxInfo(logInfo);
            logInfo.pass("I enter *AP command to display APIS details of all the passengers");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter PNBS* command to display error message for Operational Services Guide with invalid parameters")
    public void iEnterPNBSCommandToDisplayErrorMessageForOperationalServicesGuideWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBS* command to display error message for Operational Services Guide with invalid parameters");

            isharesPage2.enterPNBSCommand(logInfo);
            logInfo.pass("I enter PNBS* command to display error message for Operational Services Guide with invalid parameters");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-CQA command to assign baggage printer")
    public void iAssignBaggagePrinter() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CQA command to assign baggage printer");
            isharesPage2.BaggagePrinter(logInfo);
            logInfo.pass("I enter 6-CQA command to assign baggage printer");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter PNB command to display PNR Black List with invalid parameters")
    public void iEnterPNBCommandToDisplayPNRBlackListWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBS* command to display error message for Operational Services Guide with invalid parameters");

            isharesPage2.enterPNBCommand(logInfo);
            logInfo.pass("I enter PNBS* command to display error message for Operational Services Guide with invalid parameters");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PX command to display error message for User Control Display entries with invalid parameters")
    public void iEnterPXCommandToDisplayErrorMessageForUserControlDisplayEntriesWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PX command to display error message for User Control Display entries with invalid parameters");

            isharesPage2.enterPXCommand(logInfo);
            logInfo.pass("I enter PX command to display error message for User Control Display entries with invalid parameters");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIBMU command to display IATA PNL Board Point Master Table")
    public void enterPIBMUCommandToDisplayIataPnlBoardPointMasterTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIBMU command to display IATA PNL Board Point Master Table");

            isharesPage2.enterPIBMUCommandToDisplayIataPnlBoardPointMasterTable(logInfo);
            logInfo.pass("I enter PIBMU command to display IATA PNL Board Point Master Table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|CI command for displaying checked-in List")
    public void iEnterLD_CICommandForDisplayingCheckedInList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|CI command for displaying checked-in List");

            isharesPage2.displayCheckedInList(logInfo);
            logInfo.pass("I enter 6:LD_|CI command for displaying checked-in List");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|AF command for displaying alternate flight List")
    public void iEnterLD_AFCommandForDisplayingAlternateFlightList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|AF command for displaying alternate flight List");

            isharesPage2.displayAlternateFlightList(logInfo);
            logInfo.pass("I enter 6:LD_|AF command for displaying alternate flight List");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ABP command for displaying Advanced boarding pax List")
    public void iEnterLD_ABPCommandForDisplayingAlternateFlightList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ABP command for displaying Advanced boarding pax List");

            isharesPage2.displayAdvanceBoardingPaxList(logInfo);
            logInfo.pass("I enter 6:LD_|ABP command for displaying Advanced boarding pax List");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|AS command for displaying Advanced seat passenger List")
    public void displayAdvancedSeatPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|AS command for Advanced seat passenger List");

            isharesPage2.displayAdvancedSeatPassengerList(logInfo);
            logInfo.pass("I enter 6:LD_|AS command for Advanced seat passenger List");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBIC command to run boarding point city Table display")
    public void iEnterPBICCommandToRunBoardingPointCityTableDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBIC command to run boarding point city Table display");
            isharesPage2.enterPIBCCommand(logInfo);
            logInfo.pass("I enter PBIC command to run boarding point city Table display");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST command to display error for Queues Service Functions with invalid parameters")
    public void iEnterQCOHOSTCommandToDisplayErrorForQueuesServiceFunctionsWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST command to display error for Queues Service Functions with invalid parameters");
            isharesPage2.enterQCOHOSTCommand(logInfo);
            logInfo.pass("I enter Q*COHOST command to display error for Queues Service Functions with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QG commands to display error for AQP monitored agent with invalid parameters")
    public void iEnterQGCommandsToDisplayErrorForAQPMonitoredAgentWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QG commands to display error for AQP monitored agent with invalid parameters");
            isharesPage2.enterQGCommands(logInfo);
            logInfo.pass("I enter QG commands to display error for AQP monitored agent with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CC commands to display error for Mathematical Operations with invalid parameters")
    public void iEnterCCCommandsToDisplayErrorForMathematicalOperationsWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CC commands to display error for Mathematical Operations with invalid parameters");
            isharesPage2.enterInvalidEntryForMathematicalOperations(logInfo);
            logInfo.pass("I enter CC commands to display error for Mathematical Operations with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate pnr with ASC for system type {string}")
    public void iEnterTTYMessageToGeneratePnrASCForSystemWithLongAddress(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate pnr with ASC for system type");
            isharesPage2.TTYMessageBasicAirlinePnrWithASC(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate pnr with ASC for system type");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate pnr for system {string} and message {string}")
    public void i_enter_TTY_message_to_generate_basic_airline_segment_messagetype(String SystemType, String messageType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage2.TTYMessageBasicAirlinePnrbyMessageType(logInfo, SystemType, messageType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter MV commands to display error message for O and D Inventory Control invalid parameters")
    public void iEnterMVCommandsToDisplayErrorMessageForOAndDInventoryControlInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV commands to display error message for O and D Inventory Control invalid parameters");
            isharesPage2.enterMVCommands(logInfo);
            logInfo.pass("I enter MV commands to display error message for O and D Inventory Control invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-* command to display the seatmap of type {string}")
    public void I_enter_Command_to_display_the_seatmap(String SeatMaptype) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-* command to display the seatmap " + SeatMaptype);
            isharesPage2.displaySeatMap(logInfo, SeatMaptype);
            logInfo.pass("I enter 6-* command to display the seatmap " + SeatMaptype);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform mass transfer")
    public void iPerformMassTransfer() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform mass transfer");
            isharesPage2.performMassTransfer(logInfo);
            logInfo.pass("I perform mass transfer");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Time Conversion entries with invalid parameters of KDP")
    public void I_enter_run_time_Conversion_entries_with_invalid_parameters_of_KDP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Time Conversion entries with invalid parameters of KDP");
            isharesPage2.invalidParametersOfKDP(logInfo);
            logInfo.pass("I enter Run Time Conversion entries with invalid parameters of KDP");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Reset Claim Pending Status using the Below Entry 6CLAIM RESET")
    public void I_enter_Reset_Claim_Pending_Status_using_the_Below_Entry_6_CLAIM_RESET() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Reset Claim Pending Status using the Below Entry 6CLAIM RESET");
            isharesPage2.pendingStatusUsingTheBelowEntry6CLAIMRESET(logInfo);
            logInfo.pass("I enter Reset Claim Pending Status using the Below Entry 6CLAIM RESET");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Passenger record entries with invalid parameters")
    public void I_enter_Passenger_record_entries_with_invalid_parameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Passenger record entries with invalid parameters");
            isharesPage2.recordEntriesWithInvalidParameters(logInfo);
            logInfo.pass("I enter Passenger record entries with invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter to Perform Expanded IATA City Code Address Table")
    public void I_enter_to_Perform_Expanded_IATA_City_code_Address_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter to Perform Expanded IATA City Code Address Table");
            isharesPage2.performExpandedIATACityCodeAddressTable(logInfo);
            logInfo.pass("I enter to Perform Expanded IATA City Code Address Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Master Configuration Table Directory will be Displayed successfully")
    public void I_enter_Master_Configuration_Table_Directory_will_be_Displayed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Master Configuration Table Directory will be Displayed successfully");
            isharesPage2.tableDirectoryWillBeDisplayedSuccessfully(logInfo);
            logInfo.pass("I enter Master Configuration Table Directory will be Displayed successfully");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform standby process for non revenue pax")
    public void IPerformStandbyProcessforNonRevenuePax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform standby process for non revenue pax");
            isharesPage2.standByProcessForNRPax(logInfo);
            logInfo.pass("I perform standby process for non revenue pax");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-*_ command to display PCH table for the airline {string}")
    public void iEnterKT_CommandToDisplayPCHTableForTheAirline(String airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-*_ command to display PCH table for the airline");
            isharesPage2.displayPCHTable(logInfo, airline);
            logInfo.pass("I enter K-T-*_ command to display PCH table for the airline");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of group pnr for first segment from {string} to {string}")
    public void i_search_for_flight_availability_group_pnr_first_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of group pnr for first segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForGroupPNR(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of group pnr for first segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the manual stored fare quote command for {string}")
    public void iRunTheManualStoredFareQuoteCommandFor(String entryType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the manual stored fare quote command " + entryType);
            isharesPage2.manualStoredFareData(logInfo, entryType);
            logInfo.pass("I run the manual stored fare quote command " + entryType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$- command {string}")
    public void displayAutoFareQuote(String FareQuoteType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$- command" );
            isharesPage2.displayAutoFareQuote(logInfo,FareQuoteType);
            logInfo.pass("I enter $-$- command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of Shares PNR for origin city {string} with ESTA")
    public void iDoTheCheckinOfSharesPNRForOriginCityWithESTA(String Origin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR with ESTA");
            isharesPage2.sharesCheckinESTA(logInfo, Origin);
            logInfo.pass("I do the checkin of passengers with ESTA");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the voluntary grade of Shares PNR {string}")
    public void iDoTheVoluntaryGradeOfSharesPNR(String GradeType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the voluntary grade of Shares PNR " +GradeType);
            isharesPage2.doTheVoluntaryGradeOfSharesPNR(logInfo, GradeType);
            logInfo.pass("I do the voluntary grade of Shares PNR "+GradeType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I checked for unique pnr")
    public void iCheckedForUniquePnr() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I checked for unique pnr" );
            isharesPage2.GenerateUniquePnr(logInfo);
            logInfo.pass("I checked for unique pnr");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of Shares PNR for origin city {string} for Multi Initial Pax")
    public void iDoTheCheckinOfSharesPNRForOriginCityForMultiInitialPax(String originCity)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of multi initial passengers");
            isharesPage2.sharesCheckinMultiInitial(logInfo, originCity);
            logInfo.pass("I do the checkin of multi initial passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do checkin for Shares PNR with baggage for check in type {string} for multi inital")
    public void i_do_the_checkin_of_shares_pnr_with_baggage_for_check_in_type_For_multiInital(String CheckinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for Shares PNR");
            isharesPage2.sharesCheckinWithaBaggageMultiInitial(logInfo, CheckinType);
            logInfo.pass("I do the checkin of passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I add the general remarks")
    public void iAddTheGeneralRemarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the general remarks");
            isharesPage2.generalRemarks(logInfo);
            logInfo.pass("I add the general remarks");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I run the general remarks SHARES entries")
    public void iRunTheGeneralRemarksSHARESEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the general remarks SHARES entries");
            isharesPage2.runGeneralRemarks(logInfo);
            logInfo.pass("I run the general remarks SHARES entries");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the un-checkin of Shares PNR for origin city {string} for UNASSIGNED SEATS")
    public void checkin_of_Shares_PNR_fr_Unassigned_Seats(String origincty) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR for UNASSIGNED SEATS");
            isharesPage2.sharesCheckinForUnassignedSeats(logInfo, origincty);
            logInfo.pass("I do the checkin of passengers for UNASSIGNED SEATS");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change COS to {string} for the segment {string} with 6P")
    public void iChangeCOSToForTheSegmentwith6P(String COS, String SegmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change COS to " + COS + " for the segment " + SegmentNo + "with 6P");
            isharesPage2.changeCOSwith6P(logInfo, COS, SegmentNo);
            logInfo.pass("I change COS to " + COS + " for the segment " + SegmentNo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LG_ command to display list")
    public void iEnterLGCommandToDisplayList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LG command to display list");
            isharesPage2.enterLG_Command(logInfo);
            logInfo.pass("I enter LG command to display list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:XP command to add SSR and OSI remarks in PNR with {string}")
    public void iEnterXPCommandToAddSSRandOSIRemarksInPNRWith(String Remark) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:XP command to add SSR and OSI remarks in PNR");
            isharesPage2.addSSRandOSIRemarksinPNR(logInfo,Remark);
            logInfo.pass("I enter 6:XP command to add SSR and OSI remarks in PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter MKE* command to display Market Maintainance entry Control Record")
    public void iEnterMKEcommandtodisplayMarketMaintainanceentryControlRecord() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKE* command to display Market Maintainance entry Control Record");

            isharesPage2.displayMarketmaintainanceEntryControlRecord(logInfo);
            logInfo.pass("I enter MKE* command to display Market Maintainance entry Control Record");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I Run Order Options SHARES entries in Tranformed SHARES for SSR type{string}")
    public void i_enter_command_to_Run_Order_Options(String SSR) {
        try
        {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Run Order Options SHARES entries in Tranformed SHARES for SSR type "+SSR);
            isharesPage2.command_to_Run_Order_Options(logInfo,SSR);
            logInfo.pass("I Run Order Options SHARES entries in Tranformed SHARES for SSR type "+SSR);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, e);
        }
    }

    @And("I enter 6:CH_ should display Crew Report List {string}")
    public void iEnter6CH_ShouldDisplayCrewReportList(String OriginCity)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CH_ should display Crew Report List" + OriginCity);
            isharesPage2.displayCrewReportList(logInfo, OriginCity);
            logInfo.pass("I enter 6:CH_ should display Crew Report List" + OriginCity);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I do the checkin of Shares PNR for origin city {string} and Destination {string}")
    public void iDoTheCheckinOfSharesPNRForOriginCityAndDestination(String Origin, String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");
            isharesPage2.sharesCheckinOriginDestination(logInfo, Origin, Destination);
            logInfo.pass("I do the checkin of passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I set a CheckinType as {string}")
    public void i_set_a_CheckinType_as(String CheckinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set CheckinType as " + CheckinType);
            isharesPage2.setCheckinType(CheckinType);
            logInfo.pass("I set a CheckinType as " + CheckinType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter frequent flyer passengers firstname and surname")
    public void i_enter_fequentflyerpassenger_details1() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter frequent flyer passengers firstname and surname");
            isharesPage2.enter_frequentflyer_Details(logInfo);
            logInfo.pass("frequent flyer passengers firstname and surname");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of shares PNR for origin city by adding FQTV number {string}")
    public void checkin_of_shares_PNR_by_adding_FQTV_number(String origincty) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of shares PNR for origin city by adding FQTV number");
            isharesPage2.sharesCheckinByAddingFQTVNumber(logInfo, origincty);
            logInfo.pass("I do the checkin of shares PNR for origin city by adding FQTV number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I do checkin for required passenger {string} for origin {string}")
    public void i_do_checkin_for_required_passenger(String passenger,String origin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for required passenger");
            isharesPage2.checkinForSpecificPassenger(logInfo,passenger,origin);
            logInfo.pass("I do checkin for required passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.assertTrue(false, "This step failed.. so stopping...");
        }
    }
    @And("I do checkin for Upgrade of the passenger with checkin type as {string} with Baggage")
    public void i_do_checkin_for_required_passenger_with_Baggage(String checkinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for for Upgrade of the passenger");
            isharesPage2.checkinWithUpgradeCommand(logInfo,checkinType);
            logInfo.pass("I do checkin for Upgrade of the passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.assertTrue(false, "This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD-SL command to display standby list")
    public void i_enter_6LDSL_command_to_display_standby_list() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_SL command to display standby list");
            isharesPage2.displayStandByList(logInfo);
            logInfo.pass("I enter 6:LD_SL command to display standby list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I do the checkin by adding message of Enhanced Entry\\(Without the text) from similar name list of Shares PNR for origin city {string}")
    public void checkin_of_Shares_PNR_By_Adding_Message(String origincty) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");
            isharesPage2.sharesCheckinByAddingMessage(logInfo, origincty);
            logInfo.pass("I do the checkin of passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I try to enter 6:R|I1 command to add an infant after checkin for Multi Initial Pax")
    public void iTryToAddInfantAfterCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to enter 6:R|I1 command to add an infant after checkin for Multi Initial Pax");
            isharesPage2.addingInfantDuringCheckin(logInfo);
            logInfo.pass("I try to enter 6:R|I1 command to add an infant after checkin for Multi Initial Pax");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I do checkin for required passenger {string} for origin {string} with undelivered message")
    public void iDoCheckinForRequiredPassengerForOriginWithUndeliveredMessage(String passenger, String origin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for required passenger with undelivered message");
            isharesPage2.checkinForSpecificPassengerWithUndeliveredMessages(logInfo,passenger,origin);
            logInfo.pass("I do checkin for required passenger with undelivered message");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LDV_ command with the sequence number for {string} pnr")
    public void iEnterLDV_CommandWithTheSequenceNumberForPnr(String pnrNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LDV_ command with the sequence number");
            isharesPage2.addVolunteerStatusAfterCheckin_LDV(logInfo,pnrNo);
            logInfo.pass("I enter 6:LDV_ command with the sequence number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to delete a SSR from the PNR with {string}")
    public void iEnterCommandToDeleteASSRFromThePNRwithParam(String param) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 31@ command to delete a SSR from the PNR");
            isharesPage2.deleteSSRwithParam(logInfo, param);
            logInfo.pass("I enter 31@ command to delete a SSR from the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for fifth segment from {string} to {string}")
    public void i_search_for_flight_availability_special_pnr_fifth_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for fifth segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSpecialPNRForFifthSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of special pnr for fifth segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do checkin for Shares PNR with baggage for check in type {string} with specific seat number {string} for Economy class")
    public void iDoCheckinForSharesPNRWithBaggageForCheckInTypeWithSpecificSeatNumberForEconomyClass(String CheckinType, String typeOfSeat) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for Shares PNR with baggage for check in type {string} with specific seat number {string} for Economy class");
            isharesPage2.sharesCheckinTypesWithSpecificSeat(logInfo, CheckinType, typeOfSeat);
            logInfo.pass("I do checkin for Shares PNR with baggage for check in type {string} with specific seat number {string} for Economy class");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability in Native shares of special pnr for first segment from {string} to {string} and {string}")
    public void iSearchForFlightAvailabilityInNativeSharesOfSpecialPnrForFirstSegmentFromToAnd(String Origin, String Destination, String departureDate) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability in Native shares of special pnr for first segment from"+Origin+" to "+Destination);
            isharesPage2.searchavailabilitySpecialPNRNativeShares(logInfo, Origin, Destination,departureDate);
            logInfo.pass("I search for flight availability in Native shares of special pnr for first segment from"+Origin+" to "+Destination);


        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I search for flight availability in Native shares of special pnr for second segment from {string} to {string} and {string}")
    public void iSearchForFlightAvailabilityInNativeSharesOfSpecialPnrForSecondSegmentFromToAnd(String Origin, String Destination, String departureDate) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability in Native shares of special pnr for second segment from"+Origin+" to "+Destination);
            isharesPage2.searchavailabilitySpecialPNRNativeSharesSecondSeg(logInfo, Origin, Destination,departureDate);
            logInfo.pass("I search for flight availability in Native shares of special pnr for second segment from"+Origin+" to "+Destination);


        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I search for flight availability in Native shares of special pnr for third segment from {string} to {string} and {string}")
    public void iSearchForFlightAvailabilityInNativeSharesOfSpecialPnrForThirdSegmentFromToAnd(String Origin, String Destination, String departureDate) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability in Native shares of special pnr for third segment from"+Origin+" to "+Destination);
            isharesPage2.searchavailabilitySpecialPNRNativeSharesThirdSeg(logInfo, Origin, Destination,departureDate);
            logInfo.pass("I search for flight availability in Native shares of special pnr for third segment from"+Origin+" to "+Destination);


        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I search for flight availability in Native shares of special pnr for fourth segment from {string} to {string} and {string}")
    public void iSearchForFlightAvailabilityInNativeSharesOfSpecialPnrForFourthSegmentFromToAnd(String Origin, String Destination, String departureDate) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability in Native shares of special pnr for fourth segment from"+Origin+" to "+Destination);
            isharesPage2.searchavailabilitySpecialPNRNativeSharesFourthSeg(logInfo, Origin, Destination,departureDate);
            logInfo.pass("I search for flight availability in Native shares of special pnr for fourth segment from"+Origin+" to "+Destination);


        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I search for flight availability in Native shares of special pnr for fifth segment from {string} to {string} and {string}")
    public void iSearchForFlightAvailabilityInNativeSharesOfSpecialPnrForFifthSegmentFromToAnd(String Origin, String Destination, String departureDate) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability in Native shares of special pnr for fifth segment from"+Origin+" to "+Destination);
            isharesPage2.searchavailabilitySpecialPNRNativeSharesFifthSeg(logInfo, Origin, Destination,departureDate);
            logInfo.pass("I search for flight availability in Native shares of special pnr for fifth segment from"+Origin+" to "+Destination);


        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }


    @And("I enter SSR command for SSR type {string} for Segment {string}")
    public void i_enter_SSR_command_for_Specific_Segment(String SSRType,String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR command for SSR type " + SSRType + " for Segment "+segmentIndex);
            isharesPage2.addSSRForSpecificSegment(logInfo, SSRType,Integer.parseInt(segmentIndex));
            logInfo.pass("I enter SSR command for SSR type " + SSRType + " for Segment "+segmentIndex);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability for today from {string} to {string}")
    public void iSearchForFlightAvailabilityForTodayFromTo(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for today from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForToday(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for today from " + origin + " to " + destination);
            System.out.println("I search for flight availability for today from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for Back Date flight availability from {string} to {string}")
    public void i_search_for_Back_date_flight_availability(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for Back Date flight availability from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForBackDateForFirstSeg(logInfo, origin, destination);
            logInfo.pass("I search for Back Date flight availability from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for seventh segment from {string} to {string}")
    public void i_search_for_flight_availability_seventh_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for seventh segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSeventhSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for seventh segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability for eighth segment from {string} to {string}")
    public void i_search_for_flight_availability_eighth_segment(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for eighth segment from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForEighthhSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for eighth segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KEA_ command to add SSR to PSC Exception Table")
    public void I_enter_KEA_command_to_add_SSR_to_PSC_Exception_Table(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KEA_ command to add SSR to PSC Exception Table");
            isharesPage2.enterKEACommandToAddSSRExceptionTable(logInfo);
            logInfo.pass("I enter KEA_ command to add SSR to PSC Exception Table");

        } catch(AssertionError | Exception exception){
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set Airline to {string} for Married Segment")
    public void iSetAirlineToForMarriedSegment(String Airline) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set airline to " + Airline +" for Married Segment");
            isharesPage2.setAirlineForMarriedSegment(Airline);
            logInfo.pass("I set COS to " + Airline + " for Married Segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for married Segment flights from {string} to {string}")
    public void iSearchForFlightAvailabilityForMarriedSegments(String OriginCity, String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for married Segment flights from "+OriginCity+" to "+Destination);
            isharesPage2.SearchForFlightAvailabilityForSelectingTheMarriedSegment(logInfo,OriginCity,Destination);
            logInfo.pass("I search for flight availability for married Segment flights from "+OriginCity+" to "+Destination);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for married Segment flights from {string} to {string}")
    public void iSearchForFlightAvailabilityOfSpecialPnrForMarriedSegments(String OriginCity, String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for married Segment flights from "+OriginCity+" to "+Destination);
            isharesPage2.SearchForFlightAvailabilitySpecialPNRForSelectingTheMarriedSegment(logInfo,OriginCity,Destination);
            logInfo.pass("I search for flight availability of special pnr for married Segment flights from "+OriginCity+" to "+Destination);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I store the flight number and date of the second segment flight")
    public void LI_store_the_flight_number_and_date_of_the_second_segment_flight() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I store the flight number and date of the second segment flight");
            isharesPage2.storeSecondSegFlightDetails(logInfo);
            logInfo.pass("I store the flight number and date of the second segment flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the passenger details in Native shares")
    public void iEnterThePassengerDetailsInNativeShares() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details in Native shares");
            isharesPage2.enterPassengerDetailsInNativeShares(logInfo);
            logInfo.pass("I enter passenger details in Native shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add Group name to the PNR in Native shares")
    public void iAddGroupNameToThePNRInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Group name to the PNR in Native shares");
            isharesPage2.addGroupNameInNativeShares(logInfo);
            logInfo.pass("I add Group name to the PNR in Native shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I search for flight availability of special pnr for first segment from {string} to {string} for waitlist pax")
    public void iSearchForFlightAvailabilityOfSpecialPnrForFirstSegmentFromToForWaitlistPax(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for first segment for waitlist pax");
            isharesPage2.searchFlightAvailabilityForFirstSegForSpecialWaitlistPax(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for first segment for waitlist pax");

        } catch (AssertionError | Exception exception) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I do checkin of Shares PNR for origin city {string} for required segment {string}")
    public void iDoCheckinOfSharesPNRForOriginCityForRequiredSegment(String origin, String segNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");
            isharesPage2.checkinForSpecificSegment(logInfo,origin,segNum);
            logInfo.pass("I do the checkin of passengers");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I do the checkin of shares PNR for origin city {string} for multi initial pax and for checkin type {string}")
    public void iDoTheCheckinOfSharesPNRForOriginCityForMultiInitialPaxAndForCheckinType(String origin, String checkinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of shares PNR for multi initial pax and for checkin type "+checkinType);
            isharesPage2.sharesCheckinMultiInitialForCheckinTypes(logInfo, origin, checkinType);
            logInfo.pass("I do the checkin of shares PNR for multi initial pax and for checkin type "+checkinType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add same surname Corporate pax to {string} passengers")
    public void I_add_same_surname_Corporate_pax_to_passengers(String paxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add same surname Corporate pax to " + paxCount + " passengers");
            isharesPage2.addSameSurnameCorporateToPax(logInfo, paxCount);
            logInfo.pass("I add same surname Corporate pax to " + paxCount + " passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter passenger details with same surname for all passenger")
    public void I_enter_passenger_details_for_same_surname_all_pax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details with same surname for all passenger");
            isharesPage2.enterAllPassengerDetailsForSameSurnamePax(logInfo);
            System.out.println("I enter passenger details with same surname for all passenger");
            logInfo.pass("I enter passenger details with same surname for all passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform mass transfer with {string}")
    public void iPerformMassTransferwithstatus(String status) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform mass transfer with "+status);
            isharesPage2.performMassTransferwithstatus(logInfo, status);
            logInfo.pass("I perform mass transfer with "+status);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add same surname Group pax to {string} passengers")
    public void I_add_same_surname_Group_pax_to_passengers(String paxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add same surname Group pax to " + paxCount + " passengers");
            isharesPage2.addSameSurnameGroupToPax(logInfo, paxCount);
            logInfo.pass("I add same surname Group pax to " + paxCount + " passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter rebook command to Rebook class of service for segment1 {string} without 6PER")
    public void I_enter_rebook_command_segment1_without6PER(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter rebook command to Rebook class of service for" + SegmentNumber);
            System.out.println("I enter rebook command to Rebook class of service for" + SegmentNumber);
            isharesPage2.rebook_command_to_Rebook_class_of_service_1_without6PER(logInfo, SegmentNumber);
            logInfo.pass("I enter rebook command to Rebook class of service for" + SegmentNumber);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }

    @And("I do the checkin of Shares PNR for origin city {string} for only single passenger")
    public void checkin_of_Shares_PNR_for_single_passenger(String origincty) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");
            isharesPage2.sharesCheckinForOnlySinglePassenger(logInfo, origincty);
            logInfo.pass("I do the checkin of passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter command to pay by Amex")
    public void i_enter_command_to_pay_by_Amex() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to pay by Amex");
            System.out.println("I enter command to pay by Amex");
            isharesPage2.payBYAmex(logInfo);
            logInfo.pass("I enter command to pay by Amex");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do checkin for Shares PNR with baggage for check in type {string} for required segment {string}")
    public void iDoCheckinForSharesPNRWithBaggageForCheckInTypeForRequiredSegment(String CheckinType, String SegNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for Shares PNR with baggage for check in type"+ CheckinType +"for required segment"+ SegNo);
            isharesPage2.sharesCheckinTypesForSpecificSegment(logInfo, CheckinType, SegNo);
            logInfo.pass("I do checkin for Shares PNR with baggage for check in type"+ CheckinType +"for required segment"+ SegNo);

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I search for flight availability {string} to {string} for segment to choose a different flight")
    public void iSearchForFlightAvailabilityToForSegmentToChooseADifferentFlight(String Origin, String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability" +Origin+ "to" + Destination + " for segment to choose a different flight");
            isharesPage2.searchFlightAvailabilityForSegmentWithDifferentFlight(logInfo, Origin, Destination);
            logInfo.pass("I search for flight availability" +Origin+ "to" + Destination + " for segment to choose a different flight");
            System.out.println("I search for flight availability" +Origin+ "to" + Destination + " for segment to choose a different flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of Shares PNR for origin city {string} and {string} with alternate flight")
    public void iDoTheCheckinOfSharesPNRForOriginCityWithAlternateFlight(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");
            isharesPage2.sharesCheckinwithAlternateFlight(logInfo, origin, destination);
            logInfo.pass("I do the checkin of passengers with alternate flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


   /* @And("I enter 2P command to perform IN flifo operation without message")
    public void iEnterPCommandToPerformINFlifoOperationWithoutMessage() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform IN flifo operation without message");
            isharesPage2.toUpdateInTimeForFLIFO(logInfo);
            logInfo.pass("I enter 2P command to perform IN flifo operation without message");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }*/

    @And("I do the checkin of Shares PNR for origin city {string} and Destination {string} and {string}")
    public void iDoTheCheckinOfSharesPNRForOriginCityAndDestinationAnd(String origin, String destination, String segNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR");
            isharesPage2.checkinForSpecificSegmentWithDestination(logInfo,origin,destination,segNum);
            logInfo.pass("I do the checkin of passengers");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I remove SSR {string} from the PSC Exception Table")
    public void iRemoveSSRFromThePSCExceptionTable(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove SSR " + SSRType + " from the PSC Exception Table");
            isharesPage2.removeSSRFromPSCExceptionTable(logInfo, SSRType);
            logInfo.pass("I remove SSR " + SSRType + " from the PSC Exception Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for second segment on same day from {string} to {string}")
    public void iSearchForFlightAvailabilityOfSpecialPnrForSecondSegmentOnSameDayFromTo(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for second segment on same day from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSpecialPNRForSecondSegOnSameDay(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of special pnr for second segment on same day from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for second segment on same day from {string} to {string}")
    public void iSearchForFlightAvailabilityForSecondSegmentOnSameDayFromTo(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for second segment on same day from " + origin + " to " + destination);
            isharesPage2.searchFlightAvailabilityForSecondSegOnSameDate(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for second segment on same day from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I have done auto fare quote for non revenue pax with out payment")
    public void I_enter_quote_for_non_revenue_pax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done auto fare quote for non revenue pax with out payment");
            isharesPage2.fareQuoteForNonRevenuePaxWithoutPayment(logInfo);
            System.out.println("I have done auto fare quote for non revenue pax with out payment");
            logInfo.pass("I have done auto fare quote for non revenue pax with out payment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I do the checkin of Shares PNR for the second time after modifying the PNR for origin city {string}")
    public void iDoTheCheckinOfSharesPNRForTheSecondTimeAfterModifyingThePNRForOriginCity(String origin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR for the second time after modifying the PNR for origin city " + origin);
            isharesPage2.sharesCheckinSecondTimeAfterPNRModification(logInfo, origin);
            logInfo.pass("I do the checkin of Shares PNR for the second time after modifying the PNR for origin city " + origin);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I do short checkin for Shares PNR with baggage for check in type {string}")
    public void iDoShortCheckinForSharesPNRWithBaggageForCheckInType(String CheckinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do short checkin for Shares PNR");
            isharesPage2.sharesShortCheckinTypes(logInfo, CheckinType);
            logInfo.pass("I do the short checkin of passengers");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for second married Segment flights from {string} to {string}")
    public void iSearchForFlightAvailabilityForSecondMarriedSegmentFlightsFromTo(String OriginCity, String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for second married Segment flights from "+OriginCity+" to "+Destination);
            isharesPage2.SearchForFlightAvailabilityForSelectingTheSecondMarriedSegment(logInfo,OriginCity,Destination);
            logInfo.pass("I search for flight availability for second married Segment flights from "+OriginCity+" to "+Destination);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for first married segment flights from {string} to {string}")
    public void iSearchForFlightAvailabilityForFirstMarriedSegmentFlightsFromTo(String OriginCity, String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for married Segment flights from "+OriginCity+" to "+Destination);
            isharesPage2.SearchForFlightAvailabilityForSelectingTheFirstMarriedSegment(logInfo,OriginCity,Destination);
            logInfo.pass("I search for flight availability for married Segment flights from "+OriginCity+" to "+Destination);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I add {string} senior adult passengers")
    public void iAddSeniorAdultPassengers(String seniorAdtCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add adult passengers");
            System.out.println("I add senior adult passengers");
            isharesPage2.addSeniorAdultPassengers(seniorAdtCount);
            logInfo.pass("I add senior adult passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


}














