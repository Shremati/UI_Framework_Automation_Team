package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.testng.Assert;

import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;

public class IsharesSteps4 extends StepManager {
    ExtentTest logInfo = null;


    @And("I validate shares application in the browser")
    public void iValidateSharesApplicationInTheBrowser() {
        System.out.println("I validate shares application in the browser");

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate shares application in the browser");
            isharesPage4.validateSharesApplication(logInfo);
            logInfo.pass("I validate shares application in the browser");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:BF command to verify error message for code share flights")
    public void enter_6BFcommand_verify_error_message_for_codeshare_flights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:* command to verify error message for code share flights");
            isharesPage4.enter_6BFcommand_verifyerrormessageforcodeshareflights(logInfo);
            logInfo.pass("I enter 6:C command to verify error message for code share flights");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:C command to verify error message for code share flights")
    public void enter_6Ccommand_verifyerrormessageforcodeshareflights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:* command to verify error message for code share flights");
            isharesPage4.enter_6Ccommand_verifyerrormessageforcodeshareflights(logInfo);
            logInfo.pass("I enter 6:C command to verify error message for code share flights");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:* command to verify error message for code share flights")
    public void enter_6command_verifyerrormessageforcodeshareflights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:* command to verify error message for code share flights");
            isharesPage4.enter_6command_verifyerrormessageforcodeshareflights(logInfo);
            logInfo.pass("I enter 6:* command to verify error message for code share flights");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE command to verify codeshare actions")
    public void enter_QCODESHARE_command_verifycodeshareactions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE command to verify codeshare actions");
            isharesPage4.enterQCODESHARE_verifycodeshareactions(logInfo);
            logInfo.pass("I enter Q*CODESHARE command to verify codeshare actions");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:C command to Run Flight In Manual Mode")
    public void enter_6C_RunFlightInManualMode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C command to Run Flight In Manual Mode");
            isharesPage4.enter6C_RunFlightInManualMode(logInfo);
            logInfo.pass("I enter 6:C command to Run Flight In Manual Mode");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Alternate Flight Check-In and Upgrade")
    public void enter_command_RunAlternateFlightCheckInandUpgrade() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Alternate Flight Check-In and Upgrade");
            isharesPage4.entercommand_RunAlternateFlightCheckInandUpgrade(logInfo);
            logInfo.pass("I enter command to Run Alternate Flight Check-In and Upgrade");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I Display ETKT history from exiting data")
    public void display_ETKThistoryfromexitingdata() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Display ETKT history from exiting data");
            isharesPage4.displayETKThistoryfromexistingdata(logInfo);
            logInfo.pass("I Display ETKT history from exiting data");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KA command to Display List of Schedules for a Flight Number")
    public void display_ListofSchedulesforFlightNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KA command to Display List of Schedules for a Flight Number");
            isharesPage4.enterKA_DisplayscheduleFlight(logInfo);
            logInfo.pass("I enter KA command to Display List of Schedules for a Flight Number");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM Book the PNR with NRSA meal")
    public void I_enter_OCM_Book_the_PNR_with_NRSA_meal() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM Book the PNR with NRSA meal");
            isharesPage4.enterOCMBookThePNRWithNRSAMeal(logInfo);
            logInfo.pass("I enter OCM Book the PNR with NRSA meal");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN Display Segment profile Step Table Index")
    public void I_enter_KN_Display_Segment_profile_Step_Table_Index() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN Display Segment profile Step Table Index");
            isharesPage4.enterKNDisplaySegmentProfileStepTableIndex(logInfo);
            logInfo.pass("I enter KN Display Segment profile Step Table Index");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2N Flifo entry for flight cancellation")
    public void I_enter_2N_flifo_entry_for_flight_cancellation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2N Flifo entry for flight cancellation");
            isharesPage4.enter2NFlifoEntryForFlightCancellation(logInfo);
            logInfo.pass("I enter 2N Flifo entry for flight cancellation");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML Entry From P C User")
    public void I_enter_VML_Entry_From_P_C_User() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML Entry From P C User");
            isharesPage4.enterVMLEntryFromPCUser(logInfo);
            logInfo.pass("I enter VML Entry From P C User");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K7 AVS recap entry for the flight")
    public void I_enter_K7_AVS_recap_entry_for_the_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K7 AVS recap entry for the flight");
            isharesPage4.enterK7AVSRecapENtryForTheFlight(logInfo);
            logInfo.pass("I enter K7 AVS recap entry for the flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML Check the host flight")
    public void I_enter_VML_check_the_Host_Flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML Check the host flight");
            isharesPage4.enterVMLCheckTheHostFlight(logInfo);
            logInfo.pass("I enter VML Check the host flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter inhibit the usage of identifier X which denotes the free flow text")
    public void I_enter_inhibit_the_usage_of_identifier_X_which_denotes_the_free_text() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter inhibit the usage of identifier X which denotes the free flow text");
            isharesPage4.enterInhibittheUsageOfIdentifierXWhichDenotesTheFreeFlow(logInfo);
            logInfo.pass("I enter inhibit the usage of identifier X which denotes the free flow text");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6LO")
    public void iEnter6LO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "i Enter 6LO");
            isharesPage4.iEnter6LO(logInfo);
            logInfo.pass("i Enter 6LO");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6H Command")
    public void iEnter6HCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6H Command");
            isharesPage4.iEnter6HCommand(logInfo);
            logInfo.pass("I enter 6H Command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6IF")
    public void iEnter6IF() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6IF");
            isharesPage4.iEnter6IF(logInfo);
            logInfo.pass("I Enter 6IF");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6CE CommandToAccept Reac")
    public void iEnter6CECommandToAcceptREAC() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6CE CommandToAccept Reac");
            isharesPage4.iEnter6CECommandToAcceptREAC(logInfo);
            logInfo.pass("I Enter 6CE CommandToAccept Reac");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6 command to verify EnhancedAlternateFlightCheckin")
    public void iEnter6PerformEnhancedAlternateFlightCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6 command to verify EnhancedAlternateFlightCheckin");
            isharesPage4.iEnter6PerformEnhancedAlternateFlightCheckin(logInfo);
            logInfo.pass("I Enter 6 command to verify EnhancedAlternateFlightCheckin");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter PM commands to verify Enhanced Meal ordering Entries")
    public void iEnterPMcommandstoverifyEnhancedMealorderingEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6 command to verify EnhancedAlternateFlightCheckin");
            isharesPage4.iVerifyEnhancedMealorderingEntries(logInfo);
            logInfo.pass("I Enter 6 command to verify EnhancedAlternateFlightCheckin");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6 PV command to verify VOLUNTARY DENIED BOARDING PASSENGERS are not identified")
    public void IEnter6PV_to_verify_VOLUNTARY_DENIED_BOARDING_PASSENGERS_arenotidentified() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6 PV command to verify VOLUNTARY DENIED BOARDING PASSENGERS are not identified");
            isharesPage4.IEnter6PVtoverifyVOLUNTARYDENIEDBOARDING_PASSENGERS_not_identified(logInfo);
            logInfo.pass("I Enter 6 PV command to verify VOLUNTARY DENIED BOARDING PASSENGERS are not identified");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6P command to verify Special passenger summary Display")
    public void IEnter6PcommandtoverifySpecialpassengersummaryDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6P command to verify Special passenger summary Display");
            isharesPage4.IEnter_6P_toverify_Special_passenger_summary_Display(logInfo);
            logInfo.pass("I Enter 6P command to verify Special passenger summary Display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6NF command to verify GOSHOWFORCESELL PNR are not created")
    public void IEnter6NFcommandtoverifyGOSHOWFORCESELLPNRnotcreated() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6NF command to verify GOSHOWFORCESELL PNR are not created");
            isharesPage4.IEnter6NFcommandtoverifyGOSHOWFORCESELLPNRnotcreated(logInfo);
            logInfo.pass("I Enter 6NF command to verify GOSHOWFORCESELL PNR are not created");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter EMD command to delete SSR ASVC item from PNR")
    public void enter_EMDSSR_displayEMDHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter EMD command to delete SSR ASVC item from PNR");
            isharesPage4.enterEMDSSR_displayEMDHistory(logInfo);
            logInfo.pass("I enter EMD command to delete SSR ASVC item from PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter EMD command to display the EMD History for {string}")
    public void enter_EMD_displayEMDHistory(String sequenceNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter EMD command to display the EMD History");
            isharesPage4.enterEMD_displayEMDHistory(logInfo, sequenceNum);
            logInfo.pass("I enter EMD command to display the EMD History");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter baggage Catalog display command by ETKT sequence number")
    public void i_enter_baggage_Catalog_display_command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter baggage Catalog display command by ETKT sequence number");
            isharesPage4.enter_baggage_Catalog_display_command(logInfo);
            logInfo.pass("I enter baggage Catalog display command by ETKT sequence number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 5$_ command for Card identification verification with {string}, {string}, {string}and {string}")
    public void iEnter$_CommandForCardIdentificationVerificationWithAnd(String CardType, String CardNumber, String ExpiryDate, String Cid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5$_ command for Card identification verification with {string}, {string}, {string}and {string}");
            isharesPage4.getDisplayMaskedCreditcard(logInfo, CardType, CardNumber, ExpiryDate, Cid);
            logInfo.pass("I enter 5$_ command for Card identification verification with {string}, {string}, {string}and {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE Display CM REV CODSHR TABLE HISTORY")
    public void I_enter_Q_Codeshare_display_cm_rev_codeshr_table_History() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE Display CM REV CODSHR TABLE HISTORY");
            isharesPage4.enterQCODESHAREADisplayCMReVCodshrTableHistory(logInfo);
            logInfo.pass("I enter Q*CODESHARE Display CM REV CODSHR TABLE HISTORY");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q* SYSTEM display history data from DJ file")
    public void I_enter_Q_System_display_history_data_from_DJ_file() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q* SYSTEM display history data from DJ file");
            isharesPage4.enterQSystemDisplayHistoryDataFromDJFile(logInfo);
            logInfo.pass("I enter Q* SYSTEM display history data from DJ file");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 0CM sell entry for SB status code")
    public void I_enter_0CM_Sell_entry_for_SB_status_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0CM sell entry for SB status code");
            isharesPage4.enter0CMSellEntryForSBStatusCode(logInfo);
            logInfo.pass("I enter 0CM sell entry for SB status code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKG  Action identifier for a Create request")
    public void I_enter_MKG_Action_identifier_for_a_Create_request() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKG  Action identifier for a Create request");
            isharesPage4.enterMKGActionIdentifierForaCreateRequest(logInfo);
            logInfo.pass("I enter MKG  Action identifier for a Create request");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTD with Origin City")
    public void I_enter_BTD_with_Origin_City() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTD with Origin City");
            isharesPage4.enterBTDWithOriginCity(logInfo);
            logInfo.pass("I enter BTD with Origin City");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BSIW is a User Option Entry")
    public void I_enter_BSIW_is_a_User_Option_Entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSIW is a User Option Entry");
            isharesPage4.enterBSIWIsaUserOptionEntry(logInfo);
            logInfo.pass("I enter BSIW is a User Option Entry");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q* Add Partner into Codeshare Table")
    public void I_enter_Q_Add_Partner_into_codeshare_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q* Add Partner into Codeshare Table");
            isharesPage4.enterQAddPartnerIntoCodeshareTable(logInfo);
            logInfo.pass("I enter Q* Add Partner into Codeshare Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for specific flight availability entries")
    public void iEnterCommandToVerifyErrorMessagesForSpecificFlightAvailabilityEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for specific flight availability entries");
            isharesPage4.ToVerifyErrorMessagesForSpecificFlightAvailability(logInfo);
            logInfo.pass("I enter command to verify error messages for specific flight availability entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for Display Extra Section entries")
    public void iEnterCommandToVerifyErrorMessagesForDisplayExtraSectionEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for Display Extra Section entries");
            isharesPage4.ToVerifyErrorMessagesForDisplayExtraSectionEntries(logInfo);
            logInfo.pass("I enter command to verify error messages for Display Extra Section entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for Best buy entries")
    public void iEnterCommandToVerifyErrorMessagesForBestBuyEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for Best buy entries");
            isharesPage4.ToVerifyErrorMessagesForBestBuyEntries(logInfo);
            logInfo.pass("I enter command to verify error messages for Best buy entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV_ commands to display error message for Market Table entries")
    public void iEnterMV_CommandsToDisplayErrorMessageForMarketTableEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV_ commands to display error message for Market Table entries");
            isharesPage4.ToDisplayErrorMessageForMarketTableEntries(logInfo);
            logInfo.pass("I enter MV_ commands to display error message for Market Table entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:APIS_CRW command to run the Manual APIS message generation for crew")
    public void iEnterAPIS_CRWCommandToRunTheManualAPISMessageGenerationForCrew() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:APIS_CRW command to run the Manual APIS message generation for crew");
            isharesPage4.toRunTheManualAPISMessageGenerationForCrew(logInfo);
            logInfo.pass("I enter 6:APIS_CRW command to run the Manual APIS message generation for crew");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:TM_ command to change the message at index {string} to {string}")
    public void iEnterTM_CommandToChangeTheMessageAtIndexTo(String index, String message) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM_ command to change the message at index");
            isharesPage4.changeTheMessage(logInfo, index, message);
            logInfo.pass("I enter 6:TM_ command to change the message at index");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LA|_ command to search the PNR database and select passengers with the requirements specified by search code {string}")
    public void iEnterLA_CommandToSearchThePNRDatabaseAndSelectPassengersWithTheRequirementsSpecifiedBySearchCode(String searchCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LA|_ command to search the PNR database and select passengers with the requirements specified by search code");
            isharesPage4.searchAndSelectPaxBasedOnSearchCodedRequirements(logInfo, searchCode);
            logInfo.pass("I enter 6:LA|_ command to search the PNR database and select passengers with the requirements specified by search code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LACDT_ command to run optional fields shares entries for time range {string} and {string} without flight number")
    public void iEnterLACDT_CommandToRunOptionalFieldsSharesEntriesForTimeRangeAndWithoutFlightNumber(String timeRange, String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command run optional fields shares entries for time range without flight number");
            isharesPage4.optionalFieldsforTimeRangeWithoutFlightNumber(logInfo, timeRange, SSR);
            logInfo.pass("I enter command to run optional fields shares entries for time range without flight number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PRN_ command to enter passenger sequence numbers {string}")
    public void iEnterPRN_CommandToEnterPassengerSequenceNumbers(String sequenceNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRN_ command to enter passenger sequence numbers");
            isharesPage4.enterPassengerSequenceNumber(logInfo, sequenceNumber);
            logInfo.pass("I enter 6:PRN_ command to enter passenger sequence numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PRN_|@_ command to cancel passenger sequence numbers {string}")
    public void iEnterPRN__CommandToCancelPassengerSequenceNumbers(String sequenceNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRN_|@_ command to cancel passenger sequence numbers");
            isharesPage4.cancelPassengerSequenceNumber(logInfo, sequenceNumber);
            logInfo.pass("I enter 6:PRN_|@_ command to cancel passenger sequence numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PR_.ABORT command to abort the passenger reconcile")
    public void iEnterPR_ABORTCommandToAbortThePassengerReconcile() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR_.ABORT command to abort the passenger reconcile");
            isharesPage4.abortPassengerReconcile(logInfo);
            logInfo.pass("I enter 6:PR_.ABORT command to abort the passenger reconcile");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PRS_|@_ command to cancel passenger seat numbers")
    public void iEnterPRS__CommandToCancelPassengerSeatNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRS_|@_ command to cancel passenger seat numbers");
            isharesPage4.cancelPassengerSeatNumber(logInfo);
            logInfo.pass("I enter 6:PRS_|@_ command to cancel passenger seat numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PRC_ command to complete passenger reconcile")
    public void iEnterPRC_CommandToCompletePassengerReconcile() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRC_ command to complete passenger reconcile");
            isharesPage4.completePassengerReconcile(logInfo);
            logInfo.pass("I enter 6:PRC_ command to complete passenger reconcile");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CF command to cancel default flight number")
    public void iEnterCFCommandToCancelDefaultFlightNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CF command to cancel default flight number");
            isharesPage4.cancelDefaultFlightNumber(logInfo);
            logInfo.pass("I enter 6:CF command to cancel default flight number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 5$_ command to run the ET Policing of PNR")
    public void iEnter$_CommandToRunTheETPolicingOfPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5$_ command to run the ET Policing of PNR");
            isharesPage4.runTheETPolicingOfPNR(logInfo);
            logInfo.pass("I enter 5$_ command to run the ET Policing of PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CT_ command to restrict simultaneous checkin")
    public void iEnterCT_CommandToRestrictSimultaneousCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CT_ command to restrict simultaneous checkin");
            isharesPage4.restrictingSimultaneousCheckin(logInfo);
            logInfo.pass("I enter 6:CT_ command to restrict simultaneous checkin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CT_|@ command to restore simultaneous checkin")
    public void iEnterCT_CommandToRestoreSimultaneousCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CT_|@ command to restore simultaneous checkin");
            isharesPage4.restoringSimultaneousCheckin(logInfo);
            logInfo.pass("I enter 6:CT_|@ command to restore simultaneous checkin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE A|P to Update both Old DB")
    public void I_enter_QCODESHARE_A_P_to_Update_both_old_DB() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE A|P to Update both Old DB");
            isharesPage4.enterQCODESHAREDPAPToUpdateBothOldDB(logInfo);
            logInfo.pass("I enter Q*CODESHARE A|P to Update both Old DB");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE old DB used for codeshare record processeing")
    public void I_enter_Q_CODESHARE_old_DB_used_for_codeshare_record_processeing() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE old DB used for codeshare record processeing");
            isharesPage4.enterQCODESHAREoldDBUsedForCodeshareRecordProcesseing(logInfo);
            logInfo.pass("I enter Q*CODESHARE old DB used for codeshare record processeing");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE A|P stop updating the old table")
    public void I_enter_Q_CODESHARE_A_P_stop_updating_the_old_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE A|P stop updating the old table");
            isharesPage4.enterQCODESHAREAPStopUpdatingTheOldTable(logInfo);
            logInfo.pass("I enter Q*CODESHARE A|P stop updating the old table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE D|P to Delete from table")
    public void I_enter_Q_CODESHARE_D_P_to_delete_from_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE D|P to Delete from table");
            isharesPage4.enterQCODESHAREDPToDeleteFromTable(logInfo);
            logInfo.pass("I enter Q*CODESHARE D|P to Delete from table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter COHOST To display co host table")
    public void I_enter_COHOST_to_display_co_host_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter COHOST To display co host table");
            isharesPage4.enterCOHOSTToDisplayCohostTable(logInfo);
            logInfo.pass("I enter COHOST To display co host table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM display Edifact association Control record")
    public void I_enter_OCM_display_edifact_association_control_record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM display Edifact association Control record");
            isharesPage4.enterOCMDsiplayEdifactAssociationControlRecord(logInfo);
            logInfo.pass("I enter OCM display Edifact association Control record");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST Teletype Cohost Parameters")
    public void I_enter_Q_COHOST_Teletype_cohost_parameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST Teletype Cohost Parameters");
            isharesPage4.enterQCOHOSTTeletypeCohostParameters(logInfo);
            logInfo.pass("I enter Q*COHOST Teletype Cohost Parameters");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST CHANGE THE PNR SYNC option No")
    public void I_enter_Q_COHOST_Change_The_PNR_SYNC_Option_NO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST CHANGE THE PNR SYNC option No");
            isharesPage4.enterQCOHOSTChangethePNRSYNCOptionNo(logInfo);
            logInfo.pass("I enter Q*COHOST CHANGE THE PNR SYNC option No");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST CHANGE THE PNR SYNC option YES")
    public void I_enter_Q_COHOST_Change_The_PNR_SYNC_Option_Yes() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST CHANGE THE PNR SYNC option YES");
            isharesPage4.enterQCOHOSTChangethePNRSYNCOptionYes(logInfo);
            logInfo.pass("I enter Q*COHOST CHANGE THE PNR SYNC option YES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST KEC Display the PSC table with carrier option")
    public void I_enter_Q_COHOST_KEC_Display_the_PSC_table_with_carrier_option() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST KEC Display the PSC table with carrier option");
            isharesPage4.enterCOHOSTKECDisplayThePSCTableWithCarrierOption(logInfo);
            logInfo.pass("I enter Q*COHOST KEC Display the PSC table with carrier option");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*LINK Add entry for carrier")
    public void I_enter_Q_LINK_Add_entry_for_carrier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*LINK Add entry for carrier");
            isharesPage4.enterQLINKAddEntryForCarrier(logInfo);
            logInfo.pass("I enter Q*LINK Add entry for carrier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*LINK Seamless Partner control")
    public void I_enter_Q_LINK_seamless_partner_control() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*LINK Seamless Partner control");
            isharesPage4.enterQLINKSeamlessPartnerControl(logInfo);
            logInfo.pass("I enter Q*LINK Seamless Partner control");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNBIA Try adding the inhouse code")
    public void I_enter_PNBIA_try_adding_the_inhouse_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBIA Try adding the inhouse code");
            isharesPage4.enterPNIBATryAddingTheInhouseCode(logInfo);
            logInfo.pass("I enter PNBIA Try adding the inhouse code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNBIA Linata  expanded the inhouse in code")
    public void I_enter_PNBIA_linata_Expanded_the_inhouse_in_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBIA Linata  expanded the inhouse in code");
            isharesPage4.enterPNBIALinataExpandedTheInhouseInCode(logInfo);
            logInfo.pass("I enter PNBIA Linata  expanded the inhouse in code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T.* entries matching the time range")
    public void I_enter_T_entries_matcing_the_time_range() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T.* entries matching the time range");
            isharesPage4.enterTEntriesMatcingTheTimeRange(logInfo);
            logInfo.pass("I enter T.* entries matching the time range");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KUR ablt to display Teletype reject stat table")
    public void I_enter_KUR_ablt_to_display_teletype_reject_stat_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KUR ablt to display Teletype reject stat table");
            isharesPage4.enterKURAbltToDisplayTeletypeRejectStatTable(logInfo);
            logInfo.pass("I enter KUR ablt to display Teletype reject stat table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIPC to Display the inventory detail")
    public void I_enter_VIPC_to_display_the_inventory_deatil() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIPC to Display the inventory detail");
            isharesPage4.enterVIPCToDisplayTheInventoryDetail(logInfo);
            logInfo.pass("I enter VIPC to Display the inventory detail");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-* Display industry SSR")
    public void I_enter_K_Display_industry_SSR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-* Display industry SSR");
            isharesPage4.enterKDisplayIndustrySSR(logInfo);
            logInfo.pass("I enter K-* Display industry SSR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Sequential SHARES steps to execute the flow")
    public void I_enter_Sequential_shares_steps_to_Execute_the_flow() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Sequential SHARES steps to execute the flow");
            isharesPage4.enterSequentialSharesStepsToExecuteTheFlow(logInfo);
            logInfo.pass("I enter Sequential SHARES steps to execute the flow");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the bundled long sell segment with SS action code")
    public void I_enter_the_bundled_long_sell_segment_with_ss_action_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the bundled long sell segment with SS action code");
            isharesPage4.enterTheBundleLongSellSegmentWithSSActionCode(logInfo);
            logInfo.pass("I enter the bundled long sell segment with SS action code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM* display CCT table")
    public void I_enter_OCM_display_CCT_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM* display CCT table");
            isharesPage4.enterOCMDisplayCCTTable(logInfo);
            logInfo.pass("I enter OCM* display CCT table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR display CCT table")
    public void I_enter_KR_display_CCT_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR display CCT table");
            isharesPage4.enterKRDisplayCCTTable(logInfo);
            logInfo.pass("I enter KR display CCT table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST to update cohost table with FV action code")
    public void I_enter_Q_COHOST_to_update_cohost_table_with_FV_action_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST to update cohost table with FV action code");
            isharesPage4.enterQCOHOSTToupdateCohostTableWithFVActionCode(logInfo);
            logInfo.pass("I enter Q*COHOST to update cohost table with FV action code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST update cohost table with XR action code")
    public void I_enter_Q_COHOST_Upadate_Cohost_table_with_XR_action_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST update cohost table with XR action code");
            isharesPage4.enterQCOHOSTToupdateCohostTableWithXRctionCode(logInfo);
            logInfo.pass("I enter Q*COHOST update cohost table with XR action code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST update cohost table with SR action code")
    public void I_enter_Q_COHOST_update_cohost_table_with_SR_action_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST update cohost table with SR action code");
            isharesPage4.enterQCOHOSTUpdateCohostTableWithSRActionCode(logInfo);
            logInfo.pass("I enter Q*COHOST update cohost table with SR action code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-CQA command to Change ACI AAA Profile Information")
    public void enter_6CQA_ChangeACIAAAProfileInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CQA command to Clear and Reinitiate ACI AAA Profile Information");
            isharesPage4.enter6CQA_ChangeACIAAAProfileInformation(logInfo);
            logInfo.pass("I enter 6-CQA command to Clear and Reinitiate ACI AAA Profile Information");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KTCRC command to Display Inventory Ready to Process List")
    public void enter_KTCRC_DisplayInventoryReadytoProcessList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KTCRC command to Display Inventory Ready to Process List");
            isharesPage4.enterKTCRC_DisplayInventoryReadytoProcessList(logInfo);
            logInfo.pass("I enter KTCRC command to Display Inventory Ready to Process List");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNB command to display PNR Black List user")
    public void enter_PNB_displayPNRBlackListUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNB command to display PNR Black List user");
            isharesPage4.enterPNB_displayPNRBlackListUser(logInfo);
            logInfo.pass("I enter PNB command to display PNR Black List user");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Clear Inoperative SHARES")
    public void command_ClearInoperativeSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Clear Inoperative SHARES");
            isharesPage4.commandClearInoperativeSHARES(logInfo);
            logInfo.pass("I enter command to Clear Inoperative SHARES");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I Run Process Through Passenger")
    public void run_ProcessThroughPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Run Process Through Passenger");
            isharesPage4.runProcessThroughPassenger(logInfo);
            logInfo.pass("I Run Process Through Passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add Auxiliary service to PNR")
    public void add_Auxiliaryservice() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Auxiliary service to PNR");
            isharesPage4.addAuxiliaryservice(logInfo);
            logInfo.pass("I add Auxiliary service to PNR");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify PSEUDO CITY TABLE USER with {string}")
    public void verify_PSEUDOCITYTABLEUSER(String status) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Auxiliary service to PNR");
            isharesPage4.verifyPSEUDOCITYTABLEUSER(logInfo, status);
            logInfo.pass("I add Auxiliary service to PNR");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to verify ARNK segment for system {string}")
    public void i_enter_TTY_message_to_verify_ARNK_airline_segment(String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage4.TTYMessageVerifyARNKSegment(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to verify PDM GDS PNR for system {string}")
    public void i_enter_TTY_message_to_verify_PDMGDS_PNR(String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage4.TTYMessageVerifyPDMGDSPNR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to verify NMC GDS PNR for system {string}")
    public void i_enter_TTY_message_to_verify_NMCGDS_PNR(String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage4.TTYMessageVerifyMNCGDSPNR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to verify SSR PNR for system {string}")
    public void i_enter_TTY_message_to_verify_SSR_PNR(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage4.TTYMessageVerifySSRPNR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve tag and enter 6:LD_ TAG command")
    public void iEnterLD_TAGCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve tag and enter 6:LD_ TAG command");
            isharesPage4.enter6_TAGCmd(logInfo);
            logInfo.pass("I retrieve tag and enter 6:LD_ TAG command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ* command and display details")
    public void iEnterKJCommandToDisplayFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ* command and display details");
            isharesPage4.enterKJ_flightCommand(logInfo);
            logInfo.pass("I enter KJ* command and display details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ*MA command for remark {string}")
    public void iEnterKJMACommandForRemark(String Remark) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ*MA command for adding Remark " + Remark);
            isharesPage4.enterKJMACommandForAddingRemarks(logInfo, Remark);
            logInfo.pass("I enter KJ*MA command for adding Remark " + Remark);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJMA command to enter AAP")
    public void iEnterKJMACommandToEnterAAP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJMA command to enter AAP");
            isharesPage4.enterKJMACommandForAAP(logInfo);
            logInfo.pass("I enter KJMA command to enter AAP");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ_ multiple commands")
    public void iEnterKJ_MultipleCommands() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ_ multiple commands");
            isharesPage4.enterKJ_Commands(logInfo);
            logInfo.pass("I enter KJ_ multiple commands");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ*MX command to delete model")
    public void iEnterKJMXCommandToDeleteModel() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ_ multiple commands");
            isharesPage4.enterKJMX_todeleteModel(logInfo);
            logInfo.pass("I enter KJ_ multiple commands");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ*H_ command to display booking compartment profile history")
    public void iEnterKJH_CommandToDisplayBookingCompartmentProfileHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ*H_ command to display booking compartment profile history");
            isharesPage4.enterKJ_todisplayprofhistory(logInfo);
            logInfo.pass("I enter KJ*H_ command to display booking compartment profile history");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MX*_{string} command to display Class Connection Exception Table")
    public void iEnterMX_CommandToDisplayClassConnectionExceptionTable(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MX*_{string} command to display Class Connection Exception Table");
            isharesPage4.toDisplayClassConnectionExceptionTableForInput(logInfo, entry);
            logInfo.pass("I enter MX*_{string} command to display Class Connection Exception Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*R reverse command and verify response")
    public void iEnterARReverseCommandAndVerifyResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*R command to display the reverse available ");
            isharesPage4.reverseAvailabilityFlights(logInfo);
            logInfo.pass("I enter A*R command to see reverse availability");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A_$FN_ availability command")
    public void iEnterA_$FN_AvailabilityCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A_$FN_ availability command");
            isharesPage4.displayAvailabilityFN(logInfo);
            logInfo.pass("I enter A_$FN_ availability command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR_ {string} command and check response")
    public void iEnterKRCommandAndCheckResponse(String cmd) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR command and check response");
            isharesPage4.sendKR_Command(logInfo, cmd);
            logInfo.pass("I enter KR command and check response");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD_ command to display FQTV special function name list")
    public void iEnterLD_CommandToDisplayFQTVSpecialFunctionNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD_ command to display FQTV special function name list");
            isharesPage4.displayFQTVSpecialFunctionNameList(logInfo);
            logInfo.pass("I enter LD_ command to display FQTV special function name list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MS_Conv command and check response")
    public void iEnterMS_ConvCommandAndCheckResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MS_Conv command and check response");
            isharesPage4.sendMS_Command(logInfo);
            logInfo.pass("I enter MS_Conv command and check response");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*SEAM_{string} command to display the seamless Partner Control Table")
    public void iEnterQSEAM_CommandToDisplayTheSeamlessPartnerControlTable(String cmd) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*SEAM_ command to display the seamless Partner Control Table");
            isharesPage4.displaySeamlessAvailabilityForCommand(logInfo, cmd);
            logInfo.pass("I enter Q*SEAM_ command to display the seamless Partner Control Table");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter P_A_pax command and check response")
    public void iEnterP_A_paxCommandAndCheckResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter P_A_pax command and check response");
            isharesPage4.enterP_A_paxCommand(logInfo);
            logInfo.pass("I enter P_A_pax command and check response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD_D command to list display")
    public void iEnterLD_DCommandToListDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD_D command to list display");
            isharesPage4.ld_D_CommandToListDisplay(logInfo);
            logInfo.pass("I enter LD_D command to list display");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6MI command to verify Checkin the passenger Using 6 MI Entry Unsuccessfull")
    public void IEnter6MIcommandtoverifyCheckinthepassengerUnsuccessfull() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6M command to verify Checkin the passenger Using 6 MI Entry Unsuccessfull");
            isharesPage4.IEnter_6MI_toverify_Entry_Unsuccessfull(logInfo);
            logInfo.pass("I Enter 6M command to verify Checkin the passenger Using 6 MI Entry Unsuccessfull");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6CQA Command and 6CK")
    public void iEnter6CQACommandand6CKCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6CQA Command and 6CK");
            isharesPage4.iEnter6CQACommandand6CK(logInfo);
            logInfo.pass("I enter 6CQA Command and 6CK");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MCT to verify MCT is unsuccessfull at checkin time")
    public void iEnterMCT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MCT to verify MCT is unsuccessfull at checkin time");
            isharesPage4.IenterMCTtoverifyMCTisunsuccessfullatcheckintime(logInfo);
            logInfo.pass("I enter MCT to verify MCT is unsuccessfull at checkin time");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify fleet name display")
    public void Iverifyfleetnamedisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify fleet name display");
            isharesPage4.enter6VerifyTheSeatTaken(logInfo);
            logInfo.pass("I verify fleet name display");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6TS toverify add modify delete the standby remark text")
    public void IEnter6TScommandtoverifyaddmodifydeletethestandbyremarktext() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6TS toverify add modify delete the standby remark text");
            isharesPage4.IEnter6TScommandtoverifyaddmodifydeletethestandbyremarktext(logInfo);
            logInfo.pass("I Enter 6TS toverify add modify delete the standby remark text");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6AP")
    public void iEnter6AP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6AP");
            isharesPage4.iEnter6APCommand(logInfo);
            logInfo.pass("I enter 6AP");
        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6K With Funny number Input")
    public void iEnter6KWithFunnynumberInput() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6K With Funny number Input");
            isharesPage4.iEnter6KCommandWithFunnyNumberInput(logInfo);
            logInfo.pass("I enter 6K With Funny number Input");
        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter PADA toverify invalid messages")
    public void IEnterPADAcommandstoverifyinvalidMesaages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter PADA toverify invalid messages");
            isharesPage4.IEnterPADAcommandstoverifyinvalidMesaages(logInfo);
            logInfo.pass("I Enter PADA toverify invalid messages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Run the Load Sheet Requirements table display entries with invalid parameters")
    public void IEnterRunLoadSheetRequirementstabledisplayentrieswithinvalidparameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Run the Load Sheet Requirements table display entries with invalid parameters");
            isharesPage4.IEnterRunLoadSheetRequirementstabledisplayentrieswithinvalidparameters(logInfo);
            logInfo.pass("I Run the Load Sheet Requirements table display entries with invalid parameters");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter PAL")
    public void IEnterPAL() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter PAL");
            isharesPage4.IEnterPAL(logInfo);
            logInfo.pass("I Enter PAL");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter PAP")
    public void IEnterPAP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter PAP");
            isharesPage4.IEnterPAP(logInfo);
            logInfo.pass("I Enter PAP");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter PAU with invalid parameters")
    public void IEnterPAU() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter PAU with invalid parameters");
            isharesPage4.IEnterPAU(logInfo);
            logInfo.pass("I Enter PAU with invalid parameters");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6PR Commands with invalid parameters")
    public void IEnter6PR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6PR Commands with invalid parameters");
            isharesPage4.IEnter6PR(logInfo);
            logInfo.pass("I Enter 6PR Commands with invalid parameters");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6CRW Commands with invalid parameters")
    public void IEnter6CRW() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6CRW Commands with invalid parameters");
            isharesPage4.IEnter6CRW(logInfo);
            logInfo.pass("I Enter 6CRW Commands with invalid parameters");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*PCC1 command to place PNR on Queue")
    public void IenterOCM_PCCcommandtoPlacePnrOnQueue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*PCC1 command to place PNR on Queue");
            isharesPage4.enterOCM_PCCToPlacePNROnQueue(logInfo);
            logInfo.pass("I enter OCM*PCC1 command to place PNR on Queue");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 0TUR command to add tour segment to PNR")
    public void IenterTURcommandtoAddTourSegmentToPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0TUR command to add tour segment to PNR");
            isharesPage4.addTourSegmentToPNR(logInfo);
            logInfo.pass("I enter 0TUR command to add tour segment to PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML command to add O and D values for ESR {string} and ISA {string}")
    public void IenterVMLcommandtoDisplaySelectiveReaccommadationListEntries(String esrValue, String isaValue) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML command to add O and D values");
            isharesPage4.addOandDvalues(logInfo, esrValue, isaValue);
            logInfo.pass("I enter VML command to add O and D values");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9_P command to add phone details for the passengers")
    public void i_enter_9_P_command_to_add_phone_details_for_the_passengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9_P command to add phone details for the passengers");
            isharesPage4.enter_phone_details_with_9_P(logInfo);
            logInfo.pass("I enter 9_P command to add phone details for the passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MK_ command to display market pair entry")
    public void i_enter_MK_command_to_display_markte_pair_entry() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MK_ command to display market pair entry");
            isharesPage4.displayMarketpairEntry(logInfo);
            logInfo.pass("I enter MK_ command to display market pair entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MS_ command to display POS core table when the appSwitch is off")
    public void i_enter_MS_command_to_display_POS_core_table_when_the_appSwitch_is_off() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MS_ command to display POS core table when the appSwitch is off");
            isharesPage4.displayPOSCoreTable(logInfo);
            logInfo.pass("I enter MS_ command to display POS core table when the appSwitch is off");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIPC command to display VIPC for a particular flight and date")
    public void IenterVIPCcommandtoDisplayVIPCForAParticularFlightAndDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIPC command to display VIPC for a particular flight and date");
            isharesPage4.displayVIPC(logInfo);
            logInfo.pass("I enter VIPC command to display VIPC for a particular flight and date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIL command to display Inventory")
    public void IenterVILcommandtoDisplayInventory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIL command to display Inventory");
            isharesPage4.displayInventory(logInfo);
            logInfo.pass("I enter VIL command to display Inventory");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML command to modify Inventory with AUL {string}")
    public void IenterVMLcommandtoModifyyInventoryWithAUL(String AUL) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML command to modify Inventory with AUL");
            isharesPage4.modifyInventoryWithAUL(logInfo, AUL);
            logInfo.pass("I enter VML command to modify Inventory with AUL");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIM command to display history of the Inventory modifications")
    public void IenterVIMcommandToDisplayHistoryOfTheInventoryModifications() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIM command to display history of the Inventory modifications");
            isharesPage4.displayInventoryModificationHistory(logInfo);
            logInfo.pass("I enter VIM command to display history of the Inventory modifications");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KM*S command to display SD table")
    public void IenterKM_ScommandToDisplaySD_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KM*S command to display SD table");
            isharesPage4.displaySD_Table(logInfo);
            logInfo.pass("I enter KM*S command to display SD table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMS command to modify Inventory entry to update RDT value for {string}")
    public void IenterVMScommandtoModifyyInventoryEntryToUpdateRDTValueFor(String RDT) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMS command to modify Inventory entry to update RDT value for " + RDT);
            isharesPage4.modifyInventoryForRDT(logInfo, RDT);
            logInfo.pass("I enter VMS command to modify Inventory entry to update RDT value for " + RDT);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML command to modify Inventory entry to update ESR value {string} and ADJ value {string} and ODT value {string}")
    public void IenterVMScommandtoModifyyInventoryEntryToUpdateESRValueAndADJValueAndODTValue(String ESR, String ADJ, String ODT) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML command to modify Inventory entry to update ESR value " + ESR + " and ADJ value " + ADJ + " and ODT value " + ODT);
            isharesPage4.modifyInventoryForESRandADJandODT(logInfo, ESR, ADJ, ODT);
            logInfo.pass("I enter VML command to modify Inventory entry to update ESR value " + ESR + " and ADJ value " + ADJ + " and ODT value " + ODT);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VG command to Display Auto Block Space Translation table user")
    public void IenterVGcommandtoDisplayAutoBlockSpaceTranslationTableUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VG command to Display Auto Block Space Translation table user");
            isharesPage4.displayAutoBlockSpaceTranslationTableUser(logInfo);
            logInfo.pass("I enter VG command to Display Auto Block Space Translation table user");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIP command to Display Consolidate Flight User")
    public void IenterVIPcommandToDisplayConsolidateFlightUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIP command to Display Consolidate Flight User");
            isharesPage4.displayConsolidatedFlightUser(logInfo);
            logInfo.pass("I enter VIP command to Display Consolidate Flight User");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CM printed command for pax {string}")
    public void i_enter_enter_CM_printed_command(String paxno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CM printed command for pax " + paxno);
            isharesPage4.enter_CM_printed_command(logInfo, paxno);
            logInfo.pass("I enter CM printed command for pax " + paxno);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A command to assign seat {string} for passenger {string} in segment {string}")
    public void i_enter_6A_assignseat_SingleSurname(String seatno, String paxno, String segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A command to assign seat");
            isharesPage4.toAssignSpecificSeatForSingleSurname(logInfo, segment, paxno, seatno);
            logInfo.pass("I enter 6:A command to assign seat");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A command to cancel seat {string} for passenger {string} in segment {string}")
    public void i_enter_6A_cancelseat_SingleSurname(String seatno, String paxno, String segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A command to cancel seat");
            isharesPage4.toCancelSpecificSeatForSingleSurname(logInfo, segment, paxno, seatno);
            logInfo.pass("I enter 6:A command to cancel seat");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to verify change passenger name to existing PNR for system {string}")
    public void i_enter_TTY_message_to_verify_changePassengername_PNR(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to verify change passenger name to existing PNR for system");
            isharesPage4.TTYMessageVerifyChangePassengernamePNR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to verify change passenger name to existing PNR for system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to verify adding OA segment to existing PNR for system {string}")
    public void i_enter_TTY_message_to_verify_AddingOASegment_PNR(String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage4.TTYMessageVerifyOASegmentPNR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to verify Seat cancel request to existing PNR for system {string}")
    public void i_enter_TTY_message_to_verify_Seatcancelrequest_PNR(String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to verify Seat cancel request to existing PNR for system");
            isharesPage4.TTYMessageVerifySeatCancelPNR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to verify Seat cancel request to existing PNR for system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CA19_ command for Card identification verification with {string}, {string}, {string}and {string}")
    public void iEnterCA19_CommandForCardIdentificationVerificationWithAnd(String CardType, String CardNumber, String ExpiryDate, String Cid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA19_ command for Card identification verification");
            isharesPage4.veifyMaskedCreditcardTotalSaleAmountwithDecimals(logInfo, CardType, CardNumber, ExpiryDate, Cid);
            logInfo.pass("I enter CA19_ command for Card identification verification");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate PBR for system {string}")
    public void i_enter_TTY_message_to_generate_PBR(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage4.TTYMessagecreateRLRPBR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Sell the flight with HK status in Bundle Sell")
    public void enter_command_SelltheflightwithHKstatusinBundle() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Sell the flight with HK status in Bundle Sell");
            isharesPage4.entercommand_SelltheflightwithHKstatusinBundle(logInfo);
            logInfo.pass("I enter command to Sell the flight with HK status in Bundle Sell");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I add SSRDOCS through shares")
    public void add_SSRDOCS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add SSRDOCS through shares");
            isharesPage4.addSSRDOCS(logInfo);
            logInfo.pass("I add SSRDOCS through shares");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST command to verify TTY SA ACTION CODE USER")
    public void verify_QCOHOST_TTYSAACTIONCODEUSER() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST command to verify TTY SA ACTION CODE USER");
            isharesPage4.verifyQCOHOST_TTYSAACTIONCODEUSER(logInfo);
            logInfo.pass("I enter Q*COHOST command to verify TTY SA ACTION CODE USER");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate FQTV SSR for system {string}")
    public void i_enter_TTY_message_to_generate_FQTVSSR(String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate FQTV SSR for system");
            isharesPage4.TTYMessagecreateFQTVSSR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate FQTV SSR for system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate AD FQTV SSR for system {string}")
    public void i_enter_TTY_message_to_generate_ADFQTVSSR(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate AD FQTV SSR for system");
            isharesPage4.TTYMessagecreateADFQTVSSR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate AD FQTV SSR for system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate UP FQTV SSR for system {string}")
    public void i_enter_TTY_message_to_generate_UPFQTVSSR(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate UP FQTV SSR for system");
            isharesPage4.TTYMessagecreateUPFQTVSSR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate UP FQTV SSR for system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate SWI1G FQTR SSR for system {string}")
    public void i_enter_TTY_message_to_generate_SWI1GFQTRSSR(String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate SWI1G FQTR SSR for system");
            isharesPage4.TTYMessagecreateSWI1GFQTRSSR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate SWI1G FQTR SSR for system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate FQTR SSR for system {string}")
    public void i_enter_TTY_message_to_generate_FQTRSSR(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate FQTR SSR for system");
            isharesPage4.TTYMessagecreateFQTRSSR(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate FQTR SSR for system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ALL_ET command to display all e-ticketed passengers")
    public void i_enter_6_LD_ALL_ET_command_to_display_all_the_e_ticketed_passengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ALL/ET command to display all the e-ticketed passengers");
            isharesPage4.displayTicketedPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|ALL/ET command to display all the e-ticketed passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter invalid frequent flyer passenger with {string}")
    public void enter_ivalid_FQPassenger(String invalidValue) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid frequent flyer passenger");
            isharesPage4.enterInvalid_FQPassenger(logInfo, invalidValue);
            logInfo.pass("I enter invalid frequent flyer passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*.S_ command to display flight details")
    public void iEnterTETS_CommandToDisplayFlightDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*.S_ command to display flight details");
            isharesPage4.toRunT_ETCommand(logInfo);
            logInfo.pass("I enter T-ET*.S_ command to display flight details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for ETKT entries")
    public void iEnterCommandToVerifyErrorMessagesForETKTEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for ETKT entries");
            isharesPage4.toVerifyErrorMessagesForETKTEntries(logInfo);
            logInfo.pass("I enter command to verify error messages for ETKT entries");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add farequote and ticket PNR with record user")
    public void iEnterCommandToAddFarequoteAndTicketPNRWithRecordUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add farequote and ticket PNR with record user");
            isharesPage4.toAddFarequoteAndTicketPNRWithRecordUser(logInfo);
            logInfo.pass("I enter command to add farequote and ticket PNR with record user");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:MI_ command to verify response for Military entries")
    public void iEnterMI_CommandToVerifyResponseForMilitaryEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:MI_ command to verify response for Military entries");
            isharesPage4.toVerifyResponseForMilitaryEntries(logInfo);
            logInfo.pass("I enter 6:MI_ command to verify response for Military entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:SA_ command to verify response for Armed Passenger")
    public void iEnterSA_CommandToVerifyResponseForArmedPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:SA_ command to verify response for Armed Passenger");
            isharesPage4.toVerifyResponseForArmedPassenger(logInfo);
            logInfo.pass("I enter 6:SA_ command to verify response for Armed Passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBR_ command to run the passenger boarding recap or restrict customer Option")
    public void iEnterPBR_CommandToRunThePassengerBoardingRecapOrRestrictCustomerOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBR_ command to run the passenger boarding recap or restrict customer Option");
            isharesPage4.toEnterPBR_Command(logInfo);
            logInfo.pass("I enter PBR_ command to run the passenger boarding recap or restrict customer Option");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EMD_S command to verify EMD-S added to the GDS PNR{string}")
    public void iEnterEMD_SCommandToVerifyEMDSAddedToTheGDSPNR(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EMD_S command to verify EMD-S added to the GDS PNR");
            isharesPage4.toVerifyEMDSAddedToTheGDSPNR(logInfo, Entry);
            logInfo.pass("I enter *EMD_S command to verify EMD-S added to the GDS PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to verify response for Sine in request{string} for system type {string}")
    public void iEnterTTYMessageToVerifyResponseForSineInRequestForSystemType(String ResponseType, String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to verify response for Sine in request for system type");
            isharesPage4.TTYMessageToRequestSineIn(logInfo, ResponseType, SystemType);
            logInfo.pass("I enter TTY message to verify response for Sine in request for system type");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2P command to perform the air return events message{string}")
    public void iEnterPCommandToPerformTheAirReturnEventsMessage(String message) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform the air return events message");
            isharesPage4.ToPerformTheAirReturnEventsMessage(logInfo, message);
            logInfo.pass("I enter 2P command to perform the air return events message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Display KUT table")
    public void I_Display_KUT_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Display KUT table");
            isharesPage4.iDisplayKUTTable(logInfo);
            logInfo.pass("I Display KUT table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 0CM the links are established with Availability system")
    public void I_enter_0CM_link_are_established_with_Availability_system() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0CM the links are established with Availability system");
            isharesPage4.enter0CMTheLinksAreEstablishedwithAvailabilitySystem(logInfo);
            logInfo.pass("I enter 0CM the links are established with Availability system");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD command to display sepcific meal")
    public void I_enter_LD_command_to_display_specific_meal() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to display sepcific meal");
            isharesPage4.enterLDCommandToDisplaySpecificMeal(logInfo);
            logInfo.pass("I enter LD command to display sepcific meal");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9IAH to appswitch")
    public void I_enter_9IAH_to_appswitch() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9IAH to appswitch");
            isharesPage4.enter9IAHToAppswitch(logInfo);
            logInfo.pass("I enter 9IAH to appswitch");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KUS to Display Airline Booking Counts")
    public void I_enter_KUS_to_display_Airline_Booking_Counts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KUS to Display Airline Booking Counts");
            isharesPage4.enterKUSTODisplayAirlineBookingCounts(logInfo);
            logInfo.pass("I enter KUS to Display Airline Booking Counts");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter pre-requisites for the verify the functionalities")
    public void I_enter_pre_requisites_for_the_Verify_the_functionalities() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter pre-requisites for the verify the functionalities");
            isharesPage4.enterprerequisitesForTheVerifyTheFunctionalities(logInfo);
            logInfo.pass("I enter pre-requisites for the verify the functionalities");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter alternate Phone field format allowed")
    public void I_enter_alternate_Phone_field_format_allowed() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter alternate Phone field format allowed");
            isharesPage4.enterAlternatePhoneFieldFormatAllowed(logInfo);
            logInfo.pass("I enter alternate Phone field format allowed");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KGEQ* Display Recommandation Equipment Exchange Table")
    public void I_enter_KGEQ_Display_Recommandation_Equipment_Exchange_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KGEQ* Display Recommandation Equipment Exchange Table");
            isharesPage4.enterKGEQDisplayRecommandationEquipmentExchangeTable(logInfo);
            logInfo.pass("I enter KGEQ* Display Recommandation Equipment Exchange Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Add Phone field with different city")
    public void I_enter_add_Phone_field_with_different_city() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Add Phone field with different city");
            isharesPage4.enterAddPhoneFieldWithDifferentCity(logInfo);
            logInfo.pass("I enter Add Phone field with different city");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Create SHELL PNR")
    public void I_Create_Shell_PNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Create SHELL PNR");
            isharesPage4.iCreateShellPNR(logInfo);
            logInfo.pass("I Create SHELL PNR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Entry to Decode Airline Code")
    public void I_Entry_to_Decode_Airline_Code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Entry to Decode Airline Code");
            isharesPage4.entryToDecodeAirlineCode(logInfo);
            logInfo.pass("I Entry to Decode Airline Code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Entry to Displays with SRI information requested")
    public void I_entery_to_Display_with_SRI_information_requested() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Entry to Displays with SRI information requested");
            isharesPage4.entryToDisplaysWithSRIInformationRequested(logInfo);
            logInfo.pass("I Entry to Displays with SRI information requested");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Allow marketing reaccommodation to OA prime flights")
    public void I_enter_allow_marketing_reaccommodation_to_OA_prime_flights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Allow marketing reaccommodation to OA prime flights");
            isharesPage4.enterAllowMarketingReaccommodationToOAPrimeFlights(logInfo);
            logInfo.pass("I enter Allow marketing reaccommodation to OA prime flights");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Allow enhanced marketing reaccommodation")
    public void I_enter_allow_enhanced_marketing_reaccommodation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Allow enhanced marketing reaccommodation");
            isharesPage4.enterAllowEnhancedMarketingReaccommodation(logInfo);
            logInfo.pass("I enter Allow enhanced marketing reaccommodation");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Do not allow all flight de-indexing for COPA")
    public void I_do_not_allow_all_flight_De_Indexing_for_COPA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Do not allow all flight de-indexing for COPA");
            isharesPage4.doNotAllowAllFlightDeIndexingForCOPA(logInfo);
            logInfo.pass("I Do not allow all flight de-indexing for COPA");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KC invalid format")
    public void I_enter_KC_invalid_format() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KC invalid format");
            isharesPage4.enterKCInvalidFormat(logInfo);
            logInfo.pass("I enter KC invalid format");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Create a PNR with 7TAM ticketing field and check ER")
    public void I_create_a_PNR_with_7TAM_ticketing_field_and_check_ER() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Create a PNR with 7TAM ticketing field and check ER");
            isharesPage4.CreateaPNRWiyh7TAMTicketingFieldAndCheckER(logInfo);
            logInfo.pass("I Create a PNR with 7TAM ticketing field and check ER");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7TAE the first active HA flight")
    public void I_enter_7TAE_the_first_active_HA_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7TAE the first active HA flight");
            isharesPage4.enter7TAETheFirstActiveHAFlight(logInfo);
            logInfo.pass("I enter 7TAE the first active HA flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-$PR Do checkin and assign seat")
    public void I_enter_6_PR_do_checkin_and_assign_seat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-$PR Do checkin and assign seat");
            isharesPage4.enter6PRDoCheckinAndAssignSeat(logInfo);
            logInfo.pass("I enter 6-$PR Do checkin and assign seat");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZAFIL for controlling airline to change {string}")
    public void I_enter_ZAFIL_for_controlling_airline_to_change(String number) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL for controlling airline to change");
            isharesPage4.enterZAFILForControllingAirlineToChange(logInfo, number);
            logInfo.pass("I enter ZAFIL for controlling airline to change");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-STATS purpose of this appswitch is to make the host")
    public void I_enter_T_Stats_purpose_of_this_appswitch_is_to_make_the_host() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-STATS purpose of this apswitch is to make the host");
            isharesPage4.enterTStatsPurposeOfThisAppswitchisToMaketheHost(logInfo);
            logInfo.pass("I enter T-STATS purpose of this apswitch is to make the host");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-$#VCCM enable all the CRS functions")
    public void I_enter_T_$_VCCM_enable_all_the_CRS_functions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$#VCCM enable all the CRS functions");
            isharesPage4.enterT$VCCMEnableAllTheCRSFunctions(logInfo);
            logInfo.pass("I enter T-$#VCCM enable all the CRS functions");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FR_ALL CRS functions")
    public void I_enter_FR_ALL_CRS_functions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FR_ALL CRS functions");
            isharesPage4.enterFRALLCRSFunctions(logInfo);
            logInfo.pass("I enter FR_ALL CRS functions");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ETVOID entry to process within 24 hours")
    public void I_enter_T_ETVOID_entry_to_proces_within_24_hours() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETVOID entry to process within 24 hours");
            isharesPage4.enterTETVOIDEntryToProcessWithin24Hours(logInfo);
            logInfo.pass("I enter T-ETVOID entry to process within 24 hours");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-LD marriage indicator is gone after upgrade")
    public void I_enter_6_LD_marriage_indicator_is_gone_after_upgrade() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-LD marriage indicator is gone after upgrade");
            isharesPage4.enter6LDMarriageIndicatorIsGoneAfterupgrade(logInfo);
            logInfo.pass("I enter 6-LD marriage indicator is gone after upgrade");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-LD issue tkt")
    public void I_enter_6_LD_issue_tkt() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-LD issue  tkt");
            isharesPage4.enter6LDIssueTKT(logInfo);
            logInfo.pass("I enter 6-LD issue  tkt");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter WF to display table")
    public void I_enter_WF_to_Display_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter WF to display table");
            isharesPage4.enterWFToDisplaytable(logInfo);
            logInfo.pass("I enter WF to display table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OB2 for ETKT Eligible")
    public void I_enter_OB2_for_ETKT_Eligible() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OB2 for ETKT Eligible");
            isharesPage4.enterOB2ForETKTEligible(logInfo);
            logInfo.pass("I enter OB2 for ETKT Eligible");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PJSNR smilar Name in TR duty code")
    public void I_enter_PJNSR_smilar_Name_in_TR_duty_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PJSNR smilar Name in TR duty code");
            isharesPage4.enterPJSNRSmilarNameInTRDutyCode(logInfo);
            logInfo.pass("I enter PJSNR smilar Name in TR duty code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTC the AQP indicator is added to the CST")
    public void I_enter_BTC_the_AQP_indicator_is_added_to_the_CST() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTC the AQP indicator is added to the CST");
            isharesPage4.enterBTCTheAOPIndicatorIsAddedToTheCST(logInfo);
            logInfo.pass("I enter BTC the AQP indicator is added to the CST");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:P to work entry as expected")
    public void I_enter_6_P_to_work_entry_as_expected() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:P to work entry as expected");
            isharesPage4.enter6PToWorkEntryAsExpected(logInfo);
            logInfo.pass("I enter 6:P to work entry as expected");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMH Modify Flight Header Information")
    public void I_enter_VMH_modify_flight_Header_Information() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMH Modify Flight Header Information");
            isharesPage4.enterVMHModifyFlightHeaderInformation(logInfo);
            logInfo.pass("I enter VMH Modify Flight Header Information");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BSIB0003MD_SU_KIWI1703 Sell with group Status code")
    public void I_enter_BSIB0003MD_SU_KIWI1703_Sell_with_group_Status_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSIB0003MD_SU_KIWI1703 Sell with group Status code");
            isharesPage4.enterBSIB0003MD_SU_KIWI1703SellWithGroupStatusCode(logInfo);
            logInfo.pass("I enter BSIB0003MD_SU_KIWI1703 Sell with group Status code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_O to Run the Create or Modify a Ticket control")
    public void I_enter_T_O_to_Run_the_create_or_modify_a_Ticket_control() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_O to Run the Create or Modify a Ticket control");
            isharesPage4.enterTOtoRunTheCreateOrModifyaTicketControl(logInfo);
            logInfo.pass("I enter T_O to Run the Create or Modify a Ticket control");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_O Ticket control Record Item")
    public void I_enter_T_O_Ticket_Control_Record_Item() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_O Ticket control Record Item");
            isharesPage4.enterTOTicketControlRecordItem(logInfo);
            logInfo.pass("I enter T_O Ticket control Record Item");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-RAE1 Run the Overriding FQR Data with Ticketing ReMARks Data")
    public void I_enter_T_RAE1_Run_The_overriding_FQR_data_with_Ticketing_Remarks_data() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-RAE1 Run the Overriding FQR Data with Ticketing ReMARks Data");
            isharesPage4.enterTRAE1RunTheOverridingFQRDataWithticketingremarksData(logInfo);
            logInfo.pass("I enter T-RAE1 Run the Overriding FQR Data with Ticketing ReMARks Data");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:* Seat With Infant Seat")
    public void I_enter_6_Seat_with_Infant_seat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:* Seat With Infant Seat");
            isharesPage4.enter6SeatWithInfantSeat(logInfo);
            logInfo.pass("I enter 6:* Seat With Infant Seat");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*SAXJ to Run ACI Maps Utility SHARES")
    public void I_enter_OCM_SAXJ_To_run_aci_maps_utility_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*SAXJ to Run ACI Maps Utility SHARES");
            isharesPage4.enteroCMSAXJToRunACIMapsUtilityShares(logInfo);
            logInfo.pass("I enter OCM*SAXJ to Run ACI Maps Utility SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6CC to Verify the text Unable to close")
    public void iEnter6CCtoVerifythetextUnabletoclose() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6CC to Verify the text Unable to close");
            isharesPage4.iEnter6CCCommandtoVerifyUnableToClose(logInfo);
            logInfo.pass("I enter 6CC to Verify the text Unable to close");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify Simultaneous check in should be restricted")
    public void toVerifyrestrictSimultaneousCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify Simultaneous check in should be restricted");
            isharesPage4.toVerifyrestrictSimultaneousCheckin(logInfo);
            logInfo.pass("I verify Simultaneous check in should be restricted");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter CO Commands with invalid parameters")
    public void IEnterCO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter CO Commands with invalid parameters");
            isharesPage4.IEnterCO(logInfo);
            logInfo.pass("I Enter CO Commands with invalid parameters");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Run the entry for Customized Daily Auto List Display with invalid parameters")
    public void IRuntheentryforCustomizedDailyAutoListDisplaywithinvalidparameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter CO Commands with invalid parameters");
            isharesPage4.IRuntheentryforCustomizedDailyAutoListDisplaywithinvalidparameters(logInfo);
            logInfo.pass("I Enter CO Commands with invalid parameters");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Display PNR present in particular Queue {string} and {string}")
    public void iDisplayPNRpresentinparticularQueue(String POS, String MsgNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Display PNR present in particular Queue");
            isharesPage4.iDisplayPNRpresentinparticularQueue(logInfo, POS, MsgNumber);
            logInfo.pass("I Display PNR present in particular Queue");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Add nrsa pax with full hire date in name entry")
    public void iAddnrsapaxwithfullhiredateinnameentry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Add nrsa pax with full hire date in name entry");
            isharesPage4.iAddnrsapaxwithfullhiredateinnameentry(logInfo);
            logInfo.pass("I Add nrsa pax with full hire date in name entry");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 8TL")
    public void IEnter8TL30() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 8TL");
            isharesPage4.enter_8TL30(logInfo);
            logInfo.pass("I Enter 8TL");
        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6RS")
    public void IEnter6RS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6RS");
            isharesPage4.enter_6RS(logInfo);
            logInfo.pass("I Enter 6RS");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter CM to retrieve the Pnr with Pax name")
    public void IEnterCM() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter CM to retrieve the Pnr with Pax name");
            isharesPage4.enter_CM(logInfo);
            logInfo.pass("I Enter CM to retrieve the Pnr with Pax name");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter AOne")
    public void IEnterAOne() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter AOne");
            isharesPage4.iEnterAOne(logInfo);
            logInfo.pass("I Enter AOne");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Verify WaitListClearance")
    public void iVerifyWaitlistClearance() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify WaitListClearance");
            isharesPage4.iVerifyWaitlistClearance(logInfo);
            logInfo.pass("I Verify WaitListClearance");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Verify Convertion Start Abort")
    public void iVerifyConvertionStartAbort() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify Convertion Start Abort");
            isharesPage4.iVerifyConvertionStartAbort(logInfo);
            logInfo.pass("I Verify Convertion Start Abort");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Verify Display Pseudo City Conversion Tableb y KQ_PC")
    public void iVerifyDisplayPseudoCityConversionTablebyKQ_PC() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify Display Pseudo City Conversion Tableb y KQ_PC");
            isharesPage4.iVerifyDisplayPseudoCityConversionTablebyKQ_PC(logInfo);
            logInfo.pass("I Verify Display Pseudo City Conversion Tableb y KQ_PC");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter MKD Command")
    public void iEnterMKDCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter MKD Command");
            isharesPage4.iEnterMKDCommand(logInfo);
            logInfo.pass("I Enter MKD Command");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNL toverify Passanger NameList")
    public void enterPNLtoverifyPassangerNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNL toverify Passanger NameList");
            isharesPage4.enterPNLtoverifyPassangerNameList(logInfo);
            logInfo.pass("I enter PNL toverify Passanger NameList");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter G To Display DRS")
    public void iEnterGCommandToDisplayDRS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNL toverify Passanger NameList");
            isharesPage4.iEnterGCommandToDisplayDRS(logInfo);
            logInfo.pass("I enter PNL toverify Passanger NameList");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QEP")
    public void iEnterQEP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QEP");
            isharesPage4.iEnterQEP(logInfo);
            logInfo.pass("I enter QEP");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to  Input Overages_Shortages Amounts of Cash and Check Overage of Balancing TAR")
    public void enter_Overages_Shortages_Amounts_BalancingTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Input Overages_Shortages Amounts of Cash and Check Overage of Balancing TAR");
            isharesPage4.Overages_Shortages_Amounts_BalancingTAR(logInfo);
            logInfo.pass("I enter command to Input Overages_Shortages Amounts of Cash and Check Overage of Balancing TAR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Credit Card Overage of Balancing TAR SHARES entries")
    public void enter_CreditCardOverageofBalancingTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Input Overages_Shortages Amounts of Cash and Check Overage of Balancing TAR");
            isharesPage4.CreditCardOverageofBalancingTAR(logInfo);
            logInfo.pass("I enter command to Input Overages_Shortages Amounts of Cash and Check Overage of Balancing TAR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Cash_Check Shortage of Balancing TAR SHARES entries")
    public void enter_Cash_CheckShortageofBalancingTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Cash_Check Shortage of Balancing TAR SHARES entries");
            isharesPage4.Cash_CheckShortageofBalancingTAR(logInfo);
            logInfo.pass("I enter command to run Cash_Check Shortage of Balancing TAR SHARES entries");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check A_ACO Display Entries")
    public void enter_A_ACO_DisplayEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check A_ACO Display Entries");
            isharesPage4.A_ACO_DisplayEntries(logInfo);
            logInfo.pass("I enter command to check A_ACO Display Entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to run Display Cash_Check Transactions entries")
    public void enter_DisplayCash_CheckTransactions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to run Display Cash_Check Transactions entries");
            isharesPage4.DisplayCash_CheckTransactions(logInfo);
            logInfo.pass("I enter C:D$ command to run Display Cash_Check Transactions entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to run Government Transportation entries")
    public void enter_runGovernmentTransportationEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to run Government Transportation entries");
            isharesPage4.runGovernmentTransportationEntries(logInfo);
            logInfo.pass("I enter C:D$ command to run Government Transportation entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter C:D$ command to display Contract Bulk Transactions entries")
    public void enter_ContractBulkTransactionsentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to display Contract Bulk Transactions entries");
            isharesPage4.ContractBulkTransactionsentries(logInfo);
            logInfo.pass("I enter C:D$ command to display Contract Bulk Transactions entries");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to display Uneven PTA Transactions entries")
    public void enter_UnevenPTATransactions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to display Uneven PTA Transactions entries");
            isharesPage4.UnevenPTATransactions(logInfo);
            logInfo.pass("I enter C:D$ command to display Uneven PTA Transactions entries");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to display {string} PTA Transactions entries")
    public void enter_UnevenPTATransactions(String PTAtype) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to display" + PTAtype + "PTA Transactions entries");
            isharesPage4.UnevenPTATransactions(logInfo, PTAtype);
            logInfo.pass("I enter C:D$ command to display" + PTAtype + "PTA Transactions entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to display Free Transactions entries")
    public void enter_FreeTransactionsEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to display Free Transactions entries");
            isharesPage4.FreeTransactionsEntries(logInfo);
            logInfo.pass("I enter C:D$ command to display Free Transactions entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to display Lost Ticket Replacement Transactions entries")
    public void enter_LostTicketReplacement() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to display Lost Ticket Replacement Transactions entries");
            isharesPage4.LostTicketReplacement(logInfo);
            logInfo.pass("I enter C:D$ command to display Lost Ticket Replacement Transactions entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to display Display Full Refund Transactions entries")
    public void enter_DisplayFullRefundTransactions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to display Display Full Refund Transactions entries");
            isharesPage4.DisplayFullRefundTransactions(logInfo);
            logInfo.pass("I enter C:D$ command to display Display Full Refund Transactions entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to Display Summary of Totals entries")
    public void enter_DisplaySummaryofTotalsentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to display Summary of Totals entries");
            isharesPage4.DisplaySummaryofTotalsentries(logInfo);
            logInfo.pass("I enter C:D$ command to display Summary of Totals entries");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to Display Last Ticketing Transaction entries")
    public void enter_DisplayLastTicketingTransactionentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to Display Last Ticketing Transaction entries");
            isharesPage4.DisplayLastTicketingTransactionentries(logInfo);
            logInfo.pass("I enter C:D$ command to Display Last Ticketing Transaction entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to Display Master TAR Beginning with Specific Sequence Number entries")
    public void enter_DisplayMasterTARBeginning() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to Display Master TAR Beginning with Specific Sequence Number entries");
            isharesPage4.DisplayMasterTARBeginning(logInfo);
            logInfo.pass("I enter C:D$ command to Display Master TAR Beginning with Specific Sequence Number entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate and capture the ticket number")
    public void enter_retrieveAndCaptureTicket() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate and capture the ticket number");
            isharesPage4.retrieveAndCaptureTicket(logInfo);
            logInfo.pass("I validate and capture the ticket number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to Display Detail of Specific Ticket Number entries")
    public void enter_DisplayDetailofSpecificTicketNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to Display Detail of Specific Ticket Number entries");
            isharesPage4.DisplayDetailofSpecificTicketNumber(logInfo);
            logInfo.pass("I enter C:D$ command to Display Detail of Specific Ticket Number entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:I command to display Generic TAR is Initialized")
    public void enter_CIGenericTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:I command to display Generic TAR is Initialized");
            isharesPage4.CIGenericTAR(logInfo);
            logInfo.pass("I enter C:I command to display Generic TAR is Initialized");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:ON command for Automated Agent Check-out")
    public void enter_C_ON_ACO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:ON command for Automated Agent Check-out");
            isharesPage4.C_ON_ACO(logInfo);
            logInfo.pass("I enter C:ON command for Automated Agent Check-out");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D command for Automated Agent Check-out")
    public void enter_Enter_C_D_ACO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D command for Automated Agent Check-out");
            isharesPage4.Enter_C_D_ACO(logInfo);
            logInfo.pass("I enter C:D command for Automated Agent Check-out");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:T command to Transfer Item {string} from Generic TAR SHARES")
    public void enter_TransferItemFromGenericTAR(String item) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:T command to Transfer Item " + item + " from Generic TAR SHARES");
            isharesPage4.TransferItemFromGenericTAR(logInfo, item);
            logInfo.pass("I enter C:T command to Transfer Item " + item + " from Generic TAR SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Initiate TSSR SHARES entries entries")
    public void enter_InitiateTSSRSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Initiate TSSR SHARES entries entries");
            isharesPage4.InitiateTSSRSHARES(logInfo);
            logInfo.pass("I enter command to Initiate TSSR SHARES entries entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Display of Agents with Initialized TARS at TSSR Location")
    public void enter_AgentswithInitializedTARS561() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Display of Agents with Initialized TARS at TSSR Location");
            isharesPage4.AgentswithInitializedTARS(logInfo);
            logInfo.pass("I enter command to Display of Agents with Initialized TARS at TSSR Location");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:ON command to reconnect to an active agent TAR")
    public void CONCommandToReconnectToAnActiveTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:ON command to reconnect to an active agent TAR");
            isharesPage4.CON_reconnectToAnActiveTAR(logInfo);
            logInfo.pass("I enter C:ON command to reconnect to an active agent TAR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Indicate Overages_Shortages in TSSR - Cash_Billable Credit Card Shortages SHARES entries")
    public void enter_Cash_BillableCreditCardShortages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Indicate Overages_Shortages in TSSR - Cash_Billable Credit Card Shortages SHARES entries");
            isharesPage4.Cash_BillableCreditCardShortages(logInfo);
            logInfo.pass("I enter command to Indicate Overages_Shortages in TSSR - Cash_Billable Credit Card Shortages SHARES entries");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Void TSSR Data SHARES Indicate Overages_Shortages in TSSR")
    public void enter_VoidTSSRData() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Void TSSR Data SHARES Indicate Overages_Shortages in TSSR");
            isharesPage4.VoidTSSRData(logInfo);
            logInfo.pass("I enter command to Void TSSR Data SHARES Indicate Overages_Shortages in TSSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Reverse the Void TSSR Data SHARES Indicate Overages_Shortages in TSSR")
    public void enter_ReverseVoidTSSRData() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Reverse the Void TSSR Data SHARES Indicate Overages_Shortages in TSSR");
            isharesPage4.ReverseVoidTSSRData(logInfo);
            logInfo.pass("I enter command to Reverse the Void TSSR Data SHARES Indicate Overages_Shortages in TSSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to ILink a CRT to a Specified Location entries Overages_Shortages in TSSR")
    public void enter_ILinkaCRTtoaSpecifiedLocation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to ILink a CRT to a Specified Location entries Overages_Shortages in TSSR");
            isharesPage4.ILinkaCRTtoaSpecifiedLocation(logInfo);
            logInfo.pass("I enter command to ILink a CRT to a Specified Location entries Overages_Shortages in TSSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Cancel Remark Indicate Overages_Shortages in TSSR")
    public void enter_CancelRemarktoTSSRSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Cancel Remark Indicate Overages_Shortages in TSSR");
            isharesPage4.CancelRemarktoTSSRSHARES(logInfo);
            logInfo.pass("I enter command to Cancel Remark Indicate Overages_Shortages in TSSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I send DT_ command and verify {string} in response")
    public void iSendCommandAndVerifyInReponse(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DT_ command and check response");
            isharesPage4.sendDTCommand_VerifyRes(logInfo, entry);
            logInfo.pass("I enter DT_ command and check response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KUR* command to Run Teletype Reject Statistics Table")
    public void iEnterKUR_CommandTeletypeRejectStatisticsTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KUR* command to Run Teletype Reject Statistics Table");
            isharesPage4.enterKUR_Command(logInfo);
            logInfo.pass("I enter KUR* command to Run Teletype Reject Statistics Table");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD_S command to display pax name list")
    public void iEnterLD_SCommandToDisplayPaxNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD_S command to display pax name list");
            isharesPage4.enterLD_SCommandToDisplayPaxName(logInfo);
            logInfo.pass("I enter LD_S command to display pax name list");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_V_ALL command to display list")
    public void iEnterT_V_ALLCommandToDisplayList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_V_ALL command to display list");
            isharesPage4.enterT_V_ALL_Command(logInfo);
            logInfo.pass("I enter T_V_ALL command to display list");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_V_ command to enter the item in the list")
    public void iEnterT_V_CommandToEnterTheItemInTheList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_V_ command to enter the item in the list");
            isharesPage4.enterT_V_Command(logInfo);
            logInfo.pass("I enter T_V_ command to enter the item in the list");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *H_N command")
    public void iEnterH_NCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *H_N command");
            isharesPage4.enterHNCommand(logInfo);
            logInfo.pass("I enter *H_N command");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *H_OLD command and check response")
    public void iEnterH_OLDCommandAndCheckResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *H_OLD command and check response");
            isharesPage4.enterH_OLDCommand(logInfo);
            logInfo.pass("I enter *H_OLD command and check response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*UCT1_ command verify the {string} for the {string} entry")
    public void iEnterOCMUCT_CommandVerifyTheForTheEntry(String cmd, String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*UCT1_ command verify response");
            isharesPage4.enterOCM_UCT_Command(logInfo, cmd, entry);
            logInfo.pass("I enter OCM*UCT1_ command verify response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A_ command to check response")
    public void iEnterA_CommandToCheckResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A_ command to check response");
            isharesPage4.enterA_Command(logInfo);
            logInfo.pass("I enter A_ command to check response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FLIFO message and check the response")
    public void iEnterTTYMessageAndCheckTheResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FLIFO message and check the response");
            isharesPage4.Create_a_FLIFO_message(logInfo);
            logInfo.pass("I enter FLIFO message and check the response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2P command to perform flifo operation and verify {string}")
    public void iEnterPCommandToPerformFlifoOperationAndVerify(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform flifo operation and verify  response");
            isharesPage4.Create_2PCommandETOMsg(logInfo, Entry);
            logInfo.pass("I enter 2P command to perform flifo operation and verify response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

     @And("I enter 2P command to perform OUT flifo operation without message")
     public void iEnterPCommandToPerformOUTFlifoOperationWithoutMessage() {
         try {
             logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform OUT flifo operation without message");
             isharesPage4.Create_2PCommandOUTTimeWithoutMsg(logInfo);
             logInfo.pass("I enter 2P command to perform OUT flifo operation without message");
         } catch (AssertionError | Exception e) {
             Assert.fail("This step failed.. so stopping...");
             logInfo.fail("This step failed.. so stopping...");
         }
     }
    @And("I enter 2RCT* command and verify {string} entry")
    public void iEnterRCTCommandAndVerifyEntry(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2RCT* command and verify response");
            isharesPage4.Create_2RCTCommand(logInfo, entry);
            logInfo.pass("I enter 2RCT* command and verify response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_*Z command to get the information of a particular flight for specific date")
    public void iEnter_ZCommandToGetTheInformationOfAParticularFlightForSpecificDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_*Z command to get the information of a particular flight for specific date");
            isharesPage4.getFLIFOWithDateAndZ(logInfo);
            logInfo.pass("I enter 2_*Z command to get the information of a particular flight for specific date");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML commands with AUR details and check {string} response")
    public void iEnterVMLCommandsWithAURDetailsAndCheckResponse(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_*Z command to get the information of a particular flight for specific date");
            isharesPage4.sendVML_AURCommand(logInfo, entry);
            logInfo.pass("I enter 2_*Z command to get the information of a particular flight for specific date");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_AV command and verify {string} entry")
    public void iEnter_AVCommandAndVerifyEntry(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_AV command and verify entry");
            isharesPage4.send2_AV_Command(logInfo, entry);
            logInfo.pass("I enter 2_AV command and verify entry");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_AA command and check {string} in the response")
    public void iEnter_AACommandAndCheckInTheResponse(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_AA command and verify entry");
            isharesPage4.send2_AA_Command(logInfo, entry);
            logInfo.pass("I enter 2_AA command and verify entry");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_DL command and check {string} in the response")
    public void iEnter_DLCommandAndCheckInTheResponse(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_DL command and check the response");
            isharesPage4.send2_DL_Command(logInfo, entry);
            logInfo.pass("I enter 2_DL command and check in the response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I assign specific Seat for each passenger for seat type {string} for Economy Class")
    public void iAssignTheSpecificSeatAfterCheckIn(String seatType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign specific Seat for each passenger for seat type "+seatType+" for Economy Class");
            isharesPage4.AssignSpecificSeatForEachPassenger(logInfo,seatType);
            logInfo.pass("I assign specific Seat for each passenger for seat type "+seatType+" for Economy Class");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I create the passengers data for 2nd PNR")
    public void iGenerateDifferentPassengerDataForNewPNR()
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"),"I create the passengers data for 2nd PNR");
            isharesPage4.generateNewPassengerData(logInfo);
            logInfo.pass("I create the passengers data for 2nd PNR");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of Shares PNR for origin city {string} for multiple PNRs with different Passengers")
    public void iDoTheCheckinOfSharesPNRForOriginCityForMultiplePNRsWithDifferentPassengers(String originCity)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"),"I do the checkin of Shares PNR for origin city "+originCity+" for multiple PNRs with different Passengers");
            isharesPage4.sharesCheckinForMultiplePNRSWithDifferentPax(logInfo,originCity);
            logInfo.pass("I do the checkin of Shares PNR for origin city "+originCity+" for multiple PNRs with different Passengers");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*_ command to display the status of a flight Using Class Of Service")
    public void iEnter_CommandToDisplayTheStatusOfAFlightUsingCOS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*_ command to display the status of a flight Using Class Of Service");
            isharesPage4.displayStatusOfFlightUsingCOS(logInfo);
            logInfo.pass("I enter 6:*_ command to display the status of a flight Using Class Of Service");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform check-in of Shares PNR for origin city {string} with specific seat number {string} for Economy class")
    public void iperformCheckinOfSharesPNRwithSpecificSeatNumber(String originCity,String typeOfSeat) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform check-in of Shares PNR for origin city "+originCity+" with specific seat number");
            isharesPage4.sharesCheckinWithSpecificSeatNumber(logInfo,originCity,typeOfSeat);
            logInfo.pass("I perform check-in of Shares PNR for origin city "+originCity+" with specific seat number");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }


    @And("I enter CM voided command for pax {string}")
    public void i_enter_enter_CM_voided_command(String paxno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CM printed command for pax " + paxno);
            isharesPage4.enter_CM_voided_command(logInfo, paxno);
            logInfo.pass("I enter CM voided command for pax " + paxno);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display fare with {string}")
    public void display_farewithdate(String displayType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display fare with date");
            isharesPage4.display_farewithtype(logInfo, displayType);
            logInfo.pass("I enter command to display fare with date");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter auto fare quote for city {string}")
    public void enter_autofarequote_forCity(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter auto fare quote for city");
            isharesPage4.displayAutoFareQuoteforCity(logInfo, city);
            logInfo.pass("I enter auto fare quote for city");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CA command for Card identification verification with {string}, {string}, {string}, {string} and {string}")
    public void iEnterCA19_CommandForCardIdentificationVerificationWithAnd(String CardType, String CardNumber, String ExpiryDate, String Cid, String isValid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA command for Card identification verification");
            isharesPage4.enter_CA_verifyCreditcard(logInfo, CardType, CardNumber, ExpiryDate, Cid, isValid);
            logInfo.pass("I enter CA command for Card identification verification");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter DX Command To Verify Fare Entries")
    public void iEnterDXCommandtoVerifyFareEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter DX Command To Verify Fare Entries");
            isharesPage4.iEnterDXCommandtoVerifyFareEntry(logInfo);
            logInfo.pass("I Enter DX Command To Verify Fare Entries");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter TMTB Command To Verify Auxiliary Entrie")
    public void iEnterTMTBCommandtoVerifyFareEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter T/MTB Command To Verify Auxiliary Entrie");
            isharesPage4.iEnterTMTBCommandtoVerifyFareEntry(logInfo);
            logInfo.pass("I Enter T/MTB Command To Verify Auxiliary Entrie");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter TMTB MIL Command To Verify Auxiliary Entrie")
    public void iEnterTMTBMILCommandtoVerifyFareEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter T/MTB MIL Command To Verify Auxiliary Entrie");
            isharesPage4.iEnterTMTBMILCommandtoVerifyFareEntry(logInfo);
            logInfo.pass("I Enter T/MTB MIL Command To Verify Auxiliary Entrie");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter Value To Validate Fare {string}")
    public void iEnterValueToValidateFare(String TestCase) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "i Enter Value To Validate Fare");
            isharesPage4.iEnterValueToValidateFare(logInfo, TestCase);
            logInfo.pass("i Enter Value To Validate Fare");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6CC Command")
    public void iEnter6CCCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6CC Command");
            isharesPage4.iEnter6CCCommand(logInfo);
            logInfo.pass("I Enter 6CC Command");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter 6CCH With FR To Display Final SSR Report")
    public void iEnter6CHWithFRCommandToDisplayFinalSSRReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6CCH With FR To Display Final SSR Report");
            isharesPage4.iEnter6CHWithFRCommandToDisplayFinalSSRReport(logInfo);
            logInfo.pass("I Enter 6CCH With FR To Display Final SSR Report");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter O3M command to create PNR with {string}")
    public void iEnter03M(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter O3M command to create PNR");
            isharesPage4.Creation_of_PNR_OA_Segments(logInfo, segmentIndex);
            logInfo.pass("I enter O3M command to create PNR");
        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAOA command to add class item to the volunteer standby priority table for the {string}")
    public void iEnterPAOAcommandToAddClassItemToTheVolunteerStandbyPriorityTableForThe(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAOA command to add class item to the volunteer standby priority table for the " + COS);
            isharesPage4.addClassItemToStandByPriorityTable(logInfo, COS);
            logInfo.pass("I enter PAOA command to add class item to the volunteer standby priority table for the " + COS);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform voluntary denied boarding passengers after check-in process for no fare exclusive option")
    public void I_perform_voluntary_denied_boarding_passengers_after_check_in_process_for_exclusive_option() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform voluntary denied boarding passengers after check-in process for no fare exclusive option");
            isharesPage4.volDeniedBoarding(logInfo);
            logInfo.pass("I perform voluntary denied boarding passengers after check-in process for no fare exclusive option");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ET command to display record locator")
    public void I_enter_ET_command_to_display_record_locator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ET command to display record locator");
            isharesPage4.enter_ET(logInfo);
            logInfo.pass("I enter ET command to display record locator");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display Codeshare table entries")
    public void I_enter_command_to_display_Codeshare_table_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display Codeshare table entries");
            isharesPage4.displayCodeShareTableEntries(logInfo);
            logInfo.pass("I enter command to display Codeshare table entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to update reverse codeshare table for the carrier {string}")
    public void I_enter_command_to_update_reverse_codeshare_table_for_the_carrier(String carrier) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to update reverse codeshare table for the carrier");
            isharesPage4.updateReverseCodeshareTable(logInfo, carrier);
            logInfo.pass("I enter command to update reverse codeshare table for the carrier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add the flight to the SEGMENT profile table for the MIN Value {string}")
    public void I_enter_command_to_add_the_flight_to_the_SEGMENT_profile_table_for_the_MIN_Value(String MinValue) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add the flight to the SEGMENT profile table for the MIN Value");
            isharesPage4.addFlightToSegmentProfileTable(logInfo, MinValue);
            logInfo.pass("I enter command to add the flight to the SEGMENT profile table for the MIN Value");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add the flight to the SEGMENT profile table for the MIN Value greater than 100 {string}")
    public void I_enter_command_to_add_the_flight_to_the_SEGMENT_profile_table_for_the_MIN_Value_greater_than_100(String MinValue) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add the flight to the SEGMENT profile table for the MIN Value greater than 100");
            isharesPage4.addFlightToSegmentProfileTableForMinValueMoreThan100(logInfo, MinValue);
            logInfo.pass("I enter command to add the flight to the SEGMENT profile table for the MIN Value greater than 100");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET_TAX command to display indivisual tax user")
    public void I_enter_ET_TAX_command_to_display_indivisual_tax_user() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_TAX command to display indivisual tax user");
            isharesPage4.displayIndivisualTaxUser(logInfo);
            logInfo.pass("I enter *ET_TAX command to display indivisual tax user");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_FCF_ command to display Companion fare basis code table")
    public void I_enter_T_FCF_command_to_display_Companion_Fare_basis_code_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_FCF_ command to display Companion fare basis code table");
            isharesPage4.displayCompanionFareTable(logInfo);
            logInfo.pass("I enter T_FCF_ command to display Companion fare basis code table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_FCF_A command to add item to Companion fare basis code table for {string}")
    public void I_enter_T_FCF_A_command_to_add_item_to_Companion_Fare_basis_code_Table_For(String item) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_FCF_A command to add item to Companion fare basis code table for " + item);
            isharesPage4.addItemToCompanionFareTable(logInfo, item);
            logInfo.pass("I enter T_FCF_A command to add item to Companion fare basis code table for " + item);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_FCF_D command to delete item from Companion fare basis code table for {string}")
    public void I_enter_T_FCF_D_command_to_delete_item_from_Companion_Fare_basis_code_Table_For(String item) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_FCF_D command to delete item from Companion fare basis code table for " + item);
            isharesPage4.deleteItemFromCompanionFareTable(logInfo, item);
            logInfo.pass("I enter T_FCF_D command to delete item from Companion fare basis code table for " + item);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to restrict Invalid DOCS SSR")
    public void I_enter_command_to_restrict_Invalid_DOCS_SSR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to restrict Invalid DOCS SSR");
            isharesPage4.restrictInvalidDOCS_SSR(logInfo);
            logInfo.pass("I enter command to restrict Invalid DOCS SSR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display host airline booking counts for {string}")
    public void I_enter_command_to_display_host_airline_booking_counts_for(String airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display host airline booking counts for " + airline);
            isharesPage4.displayHostAirlineBookingCounts(logInfo, airline);
            logInfo.pass("I enter command to display host airline booking counts for " + airline);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add remarks to PNR {string}")
    public void I_enter_command_to_add_remarks_to_PNR(String remarks) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add remarks to PNR " + remarks);
            isharesPage4.addRemarksToPNR(logInfo, remarks);
            logInfo.pass("I enter command to add remarks to PNR " + remarks);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:I_ command to initiate the agent TAR")
    public void i_enter_C_I_command_to_initiate_the_agent_TAR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:I_ command to initiate the agent TAR");
            isharesPage4.enter_CI_ToInitiateAgentTAR(logInfo);
            logInfo.pass("I enter C:I_ command to initiate the agent TAR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:C_ command to Change Form of Payment to check")
    public void i_enter_C_C_command_to_Change_Form_of_Payment_to_check() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:C_ command to Change Form of Payment to check");
            isharesPage4.changeFOPtoCheck(logInfo);
            logInfo.pass("I enter C:C_ command to Change Form of Payment to check");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:C_ command to Change Form of Payment to Credit Card")
    public void i_enter_C_C_command_to_Change_Form_of_Payment_to_Credit_Card() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:C_ command to Change Form of Payment to Credit Card");
            isharesPage4.changeFOPtoCreditCard(logInfo);
            logInfo.pass("I enter C:C_ command to Change Form of Payment to Credit Card");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMH command to Modify Flight Header Information")
    public void i_enter_VMH_command_to_Modify_Flight_Header_Information() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMH command to Modify Flight Header Information");
            isharesPage4.modifyFlightHeaderInformation(logInfo);
            logInfo.pass("I enter VMH command to Modify Flight Header Information");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display MVA Table bypass option user")
    public void i_enter_command_to_display_MVA_Table_bypass_option_user() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display MVA Table bypass option user");
            isharesPage4.displayMVAtablBypassOptionUser(logInfo);
            logInfo.pass("I enter command to display MVA Table bypass option user");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Display KKUTIL USER utility")
    public void i_enter_command_to_Display_KKUTIL_USER_utility() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Display KKUTIL USER utility");
            isharesPage4.displayKKUTILuserUtility(logInfo);
            logInfo.pass("I enter command to Display KKUTIL USER utility");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add the vlu keyword with waitlist closure entry")
    public void i_enter_command_to_add_the_vlu_keyword_with_waitlist_closure_entry() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add the vlu keyword with waitlist closure entry");
            isharesPage4.addVLUKeywordWithWaitlistClosureEntry(logInfo);
            logInfo.pass("I enter command to add the vlu keyword with waitlist closure entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to update the AUL inventory field with H option")
    public void i_enter_command_to_update_the_AUL_inventory_field_with_H_option() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to update the AUL inventory field with /H option");
            isharesPage4.updateAULInventoryFieldWith_H(logInfo);
            logInfo.pass("I enter command to update the AUL inventory field with /H option");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2N_ command to cancel the flight")
    public void i_enter_2N_command_to_cancel_the_flight() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2N_ command to cancel the flight");
            isharesPage4.cancelTheFlight(logInfo);
            logInfo.pass("I enter 2N_ command to cancel the flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KM4 command to add OA carrier from SD table {string}")
    public void i_enter_KM4_command_to_add_OA_carrier_from_SD_table(String carrier) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KM4 command to add OA carrier from SD table");
            isharesPage4.addOACarrierFromSDTable(logInfo, carrier);
            logInfo.pass("I enter KM4 command to add OA carrier from SD table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KM6 command to delete OA carrier from SD table {string}")
    public void i_enter_KM6_command_to_delete_OA_carrier_from_SD_table(String carrier) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KM6 command to delete OA carrier from SD table");
            isharesPage4.deleteOACarrierFromSDTable(logInfo, carrier);
            logInfo.pass("I enter KM6 command to delete OA carrier from SD table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PITPA command to add flight to Expanded Translation Table")
    public void i_enter_PITPA_command_to_add_flight_to_Expanded_Translation_Table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PITPA command to add flight to Expanded Translation Table");
            isharesPage4.addFlightToExpandedTranslationTable(logInfo);
            logInfo.pass("I enter PITPA command to add flight to Expanded Translation Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PITPD command to delete flight from Expanded Translation Table for line {string}")
    public void i_enter_PITPD_command_to_delete_flight_from_Expanded_Translation_Table_for_line(String Line) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PITPD command to delete flight from Expanded Translation Table for line " + Line);
            isharesPage4.deleteFlightfromExpandedTranslationTable(logInfo, Line);
            logInfo.pass("I enter PITPD command to delete flight from Expanded Translation Table for line " + Line);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Display Cohost table for particular Carrier {string} and OL parameter vale {string}")
    public void iDisplayCohostTableForParticularCarrier(String carrier, String OLvalue) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Display Cohost table for particular Carrier " + carrier + "and OL parameter vale " + OLvalue);
            isharesPage4.cohostTableForParticularCarrierAndOL(logInfo, carrier, OLvalue);
            logInfo.pass("I Display Cohost table for particular Carrier " + carrier + "and OL parameter vale " + OLvalue);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Auto delete shell PNR for the days {string}")
    public void i_enter_command_to_Auto_delete_shell_PNR_for_the_days(String days) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Auto delete shell PNR for the days " + days);
            isharesPage4.autoDeleteShellPNR(logInfo, days);
            logInfo.pass("I enter command to Auto delete shell PNR for the days " + days);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter d_ command to divide the pnr for passenger index {string}")
    public void iEnterD_commandToDivideThePnrForPassengerIndex(String PaxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter d_ command to divide the pnr for passenger index " + PaxIndex);
            isharesPage4.enter_D_dividePnr(logInfo, PaxIndex);
            logInfo.pass("I enter d_ command to divide the pnr for passenger index " + PaxIndex);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_FOP command to display form of payment edit control table")
    public void iEnterT_FOPcommandToDisplayForOfPaymentEditControlTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_FOP command to display form of payment edit control table");
            isharesPage4.displayFOPEditControlTable(logInfo);
            logInfo.pass("I enter T_FOP command to display form of payment edit control table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_ETG command to change the ATO control status of a coupon")
    public void iEnterT_ETGcommandToChangeTheATOControlStatusOfACoupon() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_ETG command to change the ATO control status of a coupon");
            isharesPage4.changeATOControlStatusOfCoupon(logInfo);
            logInfo.pass("I enter T_ETG command to change the ATO control status of a coupon");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run branded fare options")
    public void iEnterCommandToRunBrandedFareOptions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run branded fare options");
            isharesPage4.runBrandedFareOptions(logInfo);
            logInfo.pass("I enter command to run branded fare options");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run branded fare options with customer option")
    public void iEnterCommandToRunBrandedFareOptionsWithCustomerOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run branded fare options with customer option");
            isharesPage4.runBrandedFareOptionsWithCustomerOption(logInfo);
            logInfo.pass("I enter command to run branded fare options with customer option");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Give large amount in CA entry")
    public void iEnterCommandToGiveLargeAmountInCAEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Give large amount in CA entry");
            isharesPage4.largeAmountInCAEntry(logInfo);
            logInfo.pass("I enter command to Give large amount in CA entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display fare between two cities {string} and {string}")
    public void iEnterCommandToDisplayfareBetweenTwoCities(String city1, String city2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display fare between two cities");
            isharesPage4.displayFareBetweenTwoCities(logInfo, city1, city2);
            logInfo.pass("I enter command to display fare between two cities");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EO- command to display the ETKT details")
    public void iEnterEOCommandToDisplayTheETKTDetails() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EO- command to display the ETKT details");
            isharesPage4.EOCommandToDisplayTheETKTDetails(logInfo);
            logInfo.pass("I enter *EO- command to display the ETKT details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter X1|0CM to Perform Rebook")
    public void I_enter_X1_0CM_To_Perform_rebook() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X1|0CM to Perform Rebook");
            isharesPage4.enterX10CMToPerformRebook(logInfo);
            logInfo.pass("I enter X1|0CM to Perform Rebook");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD to Run market ETKT coupon Unused")
    public void I_enter_6_LD_to_Run_market_ETKT_coupon_unused() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD to Run market ETKT coupon Unused");
            isharesPage4.enter6LDToRunMarketETKTCouponUnused(logInfo);
            logInfo.pass("I enter 6:LD to Run market ETKT coupon Unused");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_ command to get the info for flight {string} and for date and for carrier {string}")
    public void iEnter_CommandToGetTheInfoForFlightAndForDateAndForCarrier(String flight, String carrier) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ and verify response");
            isharesPage4.getFLIFOForAParticularFlight_Date_Carrier(logInfo, flight, carrier);
            logInfo.pass("I enter 2_ command and verify response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ETREMOVE_P_ command to remove printer request SHARES entries")
    public void enter_T_ETREMOVE_P_request() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETREMOVE/P command to remove printer request SHARES entries");
            isharesPage4.removeThePrinterStatus(logInfo);
            logInfo.pass("I enter T-ETREMOVE/P command to remove printer request SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter YINIT command to create AAA")
    public void enter_YINIT_createAAA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter YINIT command to create AAA");
            isharesPage4.command_YINIT(logInfo);
            logInfo.pass("I enter YINIT command to create AAA");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display fare by {string} carrier")
    public void display_farebyCarrier(String displayType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display fare by Carrier");
            isharesPage4.display_farebycarrier(logInfo, displayType);
            logInfo.pass("I enter command to display fare by Carrier");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter auto fare quote with rule option date {string}")
    public void enter_autofarequote_withruleoptiondate(String rule) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter auto fare quote wit rule option");
            isharesPage4.displayAutoFareQuotewithruleoptiondate(logInfo, rule);
            logInfo.pass("I enter auto fare quote wit rule option");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CA command for Universal Cardholder Authentication with {string}, {string}, {string}, {string} and {string}")
    public void iEnterCA19_CommandForUniversalCardholderAuthentication(String CardType, String CardNumber, String ExpiryDate, String Cid, String isValid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA command for Card identification verification");
            isharesPage4.enter_CA_UniversalCardholderAuthentication(logInfo, CardType, CardNumber, ExpiryDate, Cid, isValid);
            logInfo.pass("I enter CA command for Card identification verification");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CAAX command to verify missing dollar amount with {string}, {string}")
    public void enter_CAAX_verifymissingdollaramount(String CardNumber, String Cid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid frequent flyer passenger");
            isharesPage4.enterCAAX_verifymissingdollaramount(logInfo, CardNumber, Cid);
            logInfo.pass("I enter invalid frequent flyer passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for the agent to signed into ACO system")
    public void enter_AGENTS_SIGNED_INTO_ACO_SYSTEM() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for the agent to signed into ACO system");
            isharesPage4.AGENTS_SIGNED_INTO_ACO_SYSTEM(logInfo);
            logInfo.pass("I enter command for the agent to signed into ACO system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Supervisor Cashier Initiated TAR entries")
    public void enter_Supervisor_CashierInitiatedTAREntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Supervisor Cashier Initiated TAR entries");
            isharesPage4.Supervisor_CashierInitiatedTAREntries(logInfo);
            logInfo.pass("I enter command to run Supervisor Cashier Initiated TAR entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Change Date of Open TAR SHARES")
    public void enter_ChangeDateofOpenTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Change Date of Open TAR SHARES");
            isharesPage4.ChangeDateofOpenTAR(logInfo);
            logInfo.pass("I enter command to Change Date of Open TAR SHARES");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Reopen Agents TAR SHARES entries")
    public void enter_ReopenAgentsTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Reopen Agents TAR SHARES entries");
            isharesPage4.ReopenAgentsTAR(logInfo);
            logInfo.pass("I enter command to Reopen Agents TAR SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Add Items to Agent’s TAR SHARES entries")
    public void enter_AddItemstoAgentsTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Add Items to Agent’s TAR SHARES entries");
            isharesPage4.AddItemstoAgentsTAR(logInfo);
            logInfo.pass("I enter command to Add Items to Agent’s TAR SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Agent Entries for Statistics entries with dates {string}")
    public void enter_runAgentEntries(String date) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Agent Entries for Statistics entries");
            isharesPage4.runAgentEntries(logInfo, date);
            logInfo.pass("I enter command to run Agent Entries for Statistics entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Agent Entries for Statistics Seamless entries with dates {string}")
    public void enter_runAgentEntriesSeamless(String date) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Agent Entries for Statistics Seamless entries");
            isharesPage4.runAgentEntriesSeamless(logInfo, date);
            logInfo.pass("I enter command to run Agent Entries for Statistics Seamless entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:ON command to check no TAR active_perform CI entry")
    public void enter_CON_reconnectNegative() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:ON command to check no TAR active_perform CI entry");
            isharesPage4.CON_reconnectNegative(logInfo);
            logInfo.pass("I enter C:ON command to check no TAR active_perform CI entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command C:SS to confirm to set entry first")
    public void enter_C_SS_Neg() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command C:SS to confirm to set entry first");
            isharesPage4.C_SS_Neg(logInfo);
            logInfo.pass("I enter command C:SS to confirm to set entry first");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Cancel negative Remarks Indicate Overages_Shortages in TSSR")
    public void enter_CancelRemarkNegative() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Cancel negative Remarks Indicate Overages_Shortages in TSSR");
            isharesPage4.CancelRemarkNegative(logInfo);
            logInfo.pass("I enter command to Cancel negative Remarks Indicate Overages_Shortages in TSSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 0CM to check the links are established with Availability system")
    public void I_enter_0CM_to_check_links_are_established_with_Availability_system() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0CM to check the links are established with Availability system");
            isharesPage4.enter0CMTheLinksAreEstablishedwithAvailabilitySystem(logInfo);
            logInfo.pass("I enter 0CM to check the links are established with Availability system");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-* claim command to check invalid act code")
    public void I_enter_CheckInvalidACT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-* claim command to check invalid act code");
            isharesPage4.CheckInvalidACT(logInfo);
            logInfo.pass("I enter 6-* claim command to check invalid act code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check TTY line correction entries")
    public void I_CheckTTYlineCorrection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check TTY line correction entries");
            isharesPage4.CheckTTYlineCorrection(logInfo);
            logInfo.pass("I enter command to check TTY line correction entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter command for the Excess Baggage to signed into ACO system")
    public void enter_ExcessBaggageSignIn() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for the Excess Baggage to signed into ACO system");
            isharesPage4.ExcessBaggageSignIn(logInfo);
            logInfo.pass("I enter command for the Excess Baggage to signed into ACO system");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for the Multiple Forms of Payment Information in TAR")
    public void enter_MultipleFormsofPayment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for the Multiple Forms of Payment Information in TAR");
            isharesPage4.MultipleFormsofPayment(logInfo);
            logInfo.pass("I enter command for the Multiple Forms of Payment Information in TAR");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DV_DI_ command to change from Involuntary oversold_HKN to Voluntary oversold_VOL")
    public void iEnterDV_DI_CommandToChangeFromInvoluntaryOversoldToVoluntaryOversold() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV_DI_ command to change from Involuntary oversold(HKN) to Voluntary oversold(VOL)");
            isharesPage4.ToChangeFromInvoluntaryOversoldToVoluntaryOversold(logInfo);
            logInfo.pass("I enter 6:DV_DI_ command to change from Involuntary oversold(HKN) to Voluntary oversold(VOL)");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DI_DV_ command to change from Voluntary oversold_VOL to Involuntary oversold_HKN")
    public void iEnterDI_DV_CommandToChangeFromVoluntaryOversoldToInVoluntaryOversold() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DI_DV_ command to change from Voluntary oversold(VOL) to Involuntary oversold(HKN)");
            isharesPage4.toChangeFromVoluntaryOversoldToInVoluntaryOversold(logInfo);
            logInfo.pass("I enter 6:DI_DV_ command to change from Voluntary oversold(VOL) to Involuntary oversold(HKN)");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CP_ command to block the available seat")
    public void iEnterCP_CommandToBlockTheAvailableSeat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CP_ command to block the available seat");
            isharesPage4.blockTheAvailableSeats(logInfo);
            logInfo.pass("I enter 6:CP_ command to block the available seat");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2P command to perform agent entry for flight progress information")
    public void iEnterPCommandToPerformAgentEntryForFlightProgressInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform agent entry for flight progress information");
            isharesPage4.ToPerformAgentEntryForFlightProgressInformation(logInfo);
            logInfo.pass("I enter 2P command to perform agent entry for flight progress information");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate pnr for system {string} with invalid group name{string}")
    public void iEnterTTYMessageToGeneratePnrForSystemWithInvalidGroupName(String SystemType, String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment with invalid group name");
            isharesPage4.TTYMessageBasicAirlinePnrWithInvalidGroupName(logInfo, SystemType, Entry);
            logInfo.pass("I enter TTY message to generate basic airline segment with group name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate pnr for system {string} for MVT")
    public void iEnterTTYMessageToGeneratePnrForSystemForMVT(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate pnr for system for MVT");
            isharesPage4.TTYMessagePnrForMVT(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate pnr for system for MVT");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QM_ command to verify invalid messages for code{string}")
    public void iEnterQM_CommandToVerifyInvalidMessagesForEntry(String Code) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QM_ command to verify invalid messages for code");
            isharesPage4.EnterQM_CommandToVerifyInvalidMessages(logInfo, Code);
            logInfo.pass("I enter QM_ command to verify invalid messages for code");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER command to display TTY response")
    public void iEnterKTPARTNERCommandToDisplayTTYResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to display TTY response");
            isharesPage4.EnterKTPARTNERCommandToDisplayTTYResponse(logInfo);
            logInfo.pass("I enter K-T-PARTNER command to display TTY response");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T command for CRT Error messages with {string}, {string}, {string}")
    public void iEnterT_CommandForCRTErrormessages(String CardNumber, String ExpiryDate, String Cid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T$ command for Card validation");
            isharesPage4.iEnterTCommandForCRTErrormessages(logInfo, CardNumber, ExpiryDate, Cid);
            logInfo.pass("I enter T$ command for Card validation");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T$ command for Card validation with {string}, {string}, {string}, {string} and {string}")
    public void iEnterT$_CommandForCardvalidation(String CardType, String CardNumber, String ExpiryDate, String Cid, String isValid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T$ command for Card validation");
            isharesPage4.iEnterT$CommandForCardvalidation(logInfo, CardType, CardNumber, ExpiryDate, Cid, isValid);
            logInfo.pass("I enter T$ command for Card validation");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter basic entry command {string}")
    public void enter_basicentry_command(String command) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter auto fare quote wit rule option");
            isharesPage4.enterbasicentry_command(logInfo, command);
            logInfo.pass("I enter auto fare quote wit rule option");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CW Add the weight restriction in the upline flight")
    public void I_enter_6_CW_Add_the_weight_restriction_in_the_upline_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CW Add the weight restriction in the upline flight");
            isharesPage4.enter6CWAddTheWeightRestrictionInTheUplineFlight(logInfo);
            logInfo.pass("I enter 6:CW Add the weight restriction in the upline flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter SSR command Change the value keywords with parameter for particular carrier")
    public void I_enter_SSR_command_change_the_value_keywords_with_parameter_for_particular_carrier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR command Change the value keywords with parameter for particular carrier");
            isharesPage4.enterSSRCommandChnageTheValueKeywordsWithParameter(logInfo);
            logInfo.pass("I enter SSR command Change the value keywords with parameter for particular carrier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter EFABC211 not be user of this functionality")
    public void I_enter_EFABC211_not_be_user_of_this_functionality() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter EFABC211 not be user of this functionality");
            isharesPage4.enterEFABCNotBeUserOfthisFunctionality(logInfo);
            logInfo.pass("I enter EFABC211 not be user of this functionality");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the Bundle Long Sell with 2 passenger data")
    public void I_run_the_Bundle_Long_sell_with_2_passenger_data() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the Bundle Long Sell with 2 passenger data");
            isharesPage4.runTheBundleLongSellWith2PassengerData(logInfo);
            logInfo.pass("I run the Bundle Long Sell with 2 passenger data");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6RR for PNR Creation")
    public void I_enter_6RR_for_PNR_Creation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6RR for PNR Creation");
            isharesPage4.enter6RRForPNRCreation(logInfo);
            logInfo.pass("I enter 6RR for PNR Creation");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6: to Run Partial Seat Assignment")
    public void I_enter_6_to_run_partial_seat_assignment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6: to Run Partial Seat Assignment");
            isharesPage4.enter6ToRunPartialSeatAssignment(logInfo);
            logInfo.pass("I enter 6: to Run Partial Seat Assignment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 0UA display $ for codeshare marketing flight for manaul add")
    public void I_enter_0UA_display_$_for_codeshare_marketing_flight_for_manaul_add() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0UA display $ for codeshare marketing flight for manaul add");
            isharesPage4.enter0UADisplay$ForCodeshareMarketingFlightForManaulAdd(logInfo);
            logInfo.pass("I enter 0UA display $ for codeshare marketing flight for manaul add");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_PRS List display for Passenger")
    public void I_enter_6_PRS_List_display_for_Passenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_PRS List display for Passenger");
            isharesPage4.enter6PRSListDisplayForPassenger(logInfo);
            logInfo.pass("I enter 6_PRS List display for Passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*PCC1 the exact hour of TTL field")
    public void I_enter_OCM_PCC1_the_exact_hour_of_TTL_field() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*PCC1 the exact hour of TTL field");
            isharesPage4.enterOCMPCC1TheExactHourOfTTLField(logInfo);
            logInfo.pass("I enter OCM*PCC1 the exact hour of TTL field");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKDMAP* entry is used to display Muiti-airport cities")
    public void I_enter_MKDMAP_entry_is_used_to_display_Muiti_airport_cities() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKDMAP* entry is used to display Muiti-airport cities");
            isharesPage4.entryMKDMAPEntryIsUsedToDisplayMulitAirportCities(logInfo);
            logInfo.pass("I enter MKDMAP* entry is used to display Muiti-airport cities");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9_ command to add phone numbers and display them")
    public void iEnter_CommandToAddPhoneNumbersAndDisplayThem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_ command to add phone numbers and display them");
            isharesPage4.addPhoneNumbersAndDisplayThem(logInfo);
            logInfo.pass("I enter 6_ command to add phone numbers and display them");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter remarks and display them")
    public void iEnterRemarksAndDisplayThem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter remarks and display them");
            isharesPage4.enterRemarksAndDisplayThem(logInfo);
            logInfo.pass("I enter remarks and display them");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I delete the pax data and validate the same")
    public void iDeleteThePaxDataAndValidateTheSame() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the pax data and validate the same");
            isharesPage4.deletePaxDataAndValidateTheSame(logInfo);
            logInfo.pass("I delete the pax data and validate the same");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PAA*D command to display APIS Data Control Table")
    public void iEnterPAADCommandToDisplayAPISDataControlTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA*D command to display APIS Data Control Table");
            isharesPage4.toDisplayAPISDataControlTable(logInfo);
            logInfo.pass("I enter PAA*D command to display APIS Data Control Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:CGS_* command to display the active remarks with date range and boarding point and verify the error")
    public void iEnterCGS_CommandToDisplayTheActiveRemarksWithDateRangeAndBoardingPointAndVerifyTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CGS_* command to display the active remarks with date range and boarding point and verify the error");
            isharesPage4.displayActiveRemarksWithDateRangeAndBoardingPointAndVerifyError(logInfo);
            logInfo.pass("I enter 6:CGS_* command to display the active remarks with date range and boarding point and verify the error");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:OSD_ command for manual message generation")
    public void iEnterOSD_CommandForManualMessageGeneration() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:OSD_ command for manual message generation");
            isharesPage4.manualMessageGeneration(logInfo);
            logInfo.pass("I enter 6:OSD_ command for manual message generation");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LD_|SN command to display the list of passengers for a specific sequence number")
    public void iEnterLD_SNCommandToDisplayTheListOfPassengersForASpecificSequenceNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SN command to display the list of passengers for a specific sequence number");
            isharesPage4.displayListOfPassengersForASpecificSequenceNumber(logInfo);
            logInfo.pass("I enter 6:LD_|SN command to display the list of passengers for a specific sequence number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*H_ command to display meal discrepancy list")
    public void iEnterH_CommandToDisplayMealDiscrepancyList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*H_ command to display meal discrepancy list");
            isharesPage4.displayMealDiscrepancyList(logInfo);
            logInfo.pass("I enter 6:*H_ command to display meal discrepancy list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter -_@_ command to delete the APIS details of the passengers and cancel the name from the APIS market table")
    public void iEnter__CommandToDeleteTheAPISDetailsOfThePassengersAndCancelTheNameFromTheAPISMarketTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter -_@_ command to delete the APIS details of the passengers and cancel the name from the APIS market table");
            isharesPage4.deleteAPISDetailsAndCancelNameFromAPISMarketTable(logInfo);
            logInfo.pass("I enter -_@_ command to delete the APIS details of the passengers and cancel the name from the APIS market table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:APIS_ command to run the manual APIS message generation for normal passengers")
    public void iEnterAPIS_CommandToRunTheManualAPISMessageGenerationForNormalPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:APIS_ command to run the manual APIS message generation for normal passengers");
            isharesPage4.runManualAPISMessageGenerationForNormalPax(logInfo);
            logInfo.pass("I enter 6:APIS_ command to run the manual APIS message generation for normal passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZM_ command to detect seat errors")
    public void iEnterZM_CommandToDetectSeatErrors() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZM_ command to detect seat errors");
            isharesPage4.detectSeatErrors(logInfo);
            logInfo.pass("I enter 6:ZM_ command to detect seat errors");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:R_GLD command to retry entry with Upgrade Code")
    public void iEnterR_GLDCommandToRetryEntryWithUpgradeCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:R_GLD command to retry entry with Upgrade Code");
            isharesPage4.retryEntryWithUpgradeCode(logInfo);
            logInfo.pass("I enter 6:R_GLD command to retry entry with Upgrade Code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:GV_ command to perform voluntary upgrade change of the class of service to {string}")
    public void iEnterGV_CommandToPerformVoluntaryUpgradeChangeOfTheClassOfService(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:GV_ command to perform voluntary upgrade change of the class of service");
            isharesPage4.performVoluntaryUpgradeChangeOfCOS(logInfo, COS);
            logInfo.pass("I enter 6:GV_ command to perform voluntary upgrade change of the class of service");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the second PNR after dividing the already created PNR")
    public void iRetrieveTheSecondPNRAfterDividingTheAlreadyCreatedPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the second PNR after dividing the already created PNR");
            isharesPage4.retrieveSecondPNRAfterDividing(logInfo);
            logInfo.pass("I retrieve the second PNR after dividing the already created PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DV_ command to perform voluntary denied boarding passengers")
    public void iEnterDV_CommandToPerformVoluntaryDeniedBoardingPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV_ command to perform voluntary denied boarding passengers");
            isharesPage4.voluntaryDeniedBoardingPassengersAfterCheckin(logInfo);
            logInfo.pass("I enter 6:DV_ command to perform voluntary denied boarding passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:APX_ command to delete the APIS details")
    public void iEnterAPX_CommandToDeleteTheAPISDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:APX_ command to delete the APIS details");
            isharesPage4.deleteAPISDetails(logInfo);
            logInfo.pass("I enter 6:APX_ command to delete the APIS details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DV_ command to perform voluntary denied boarding passengers for exclusive option")
    public void iEnterDV_CommandToPerformVoluntaryDeniedBoardingPassengersForExclusiveOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV_ command to perform voluntary denied boarding passengers for exclusive option");
            isharesPage4.voluntaryDeniedBoardingPassengersForExclusiveOption(logInfo);
            logInfo.pass("I enter 6:DV_ command to perform voluntary denied boarding passengers for exclusive option");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I capture the first PNR value")
    public void iCaptureTheFirstPNRValue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture the first PNR value");
            isharesPage4.captureTheFirstPNRValue(logInfo);
            logInfo.pass("I capture the first PNR value");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:SA_ command to perform checkin of the armed passenger and validate the error")
    public void iPerformCheckinOfTheArmedPassengerAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:SA_ command to perform checkin of the armed passenger and validate the error");
            isharesPage4.checkinOfArmedPassengerAndValidateTheError(logInfo);
            logInfo.pass("I enter 6:SA_ command to perform checkin of the armed passenger and validate the error");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:MI_ command to perform checkin of the military passenger and validate the error")
    public void iEnterMI_CommandToPerformCheckinOfTheMilitaryPassengerAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:MI_ command to perform checkin of the military passenger and validate the error");
            isharesPage4.checkinOfMilitaryPassengerAndValidateTheError(logInfo);
            logInfo.pass("I enter 6:MI_ command to perform checkin of the military passenger and validate the error");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I open the alternate flight with the same departure date and same markets as the original segment")
    public void iOpenTheAlternateFlightWithTheSameDepartureDateAndSameMarketsAsTheOriginalSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open the alternate flight with the same departure date and same markets as the original segment");
            isharesPage4.openAlternateFlight(logInfo);
            logInfo.pass("I open the alternate flight with the same departure date and same markets as the original segment");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:LSF_ command to perform checkin of two PNRs with same details to get multiple items and then do checkin successfully for forced selectee pax")
    public void iPerformCheckinOfTwoPNRsWithSameSegmentDetailsToGetMultipleItemsErrorAndThenDoCheckinSuccessfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for forced selectee pax");
            isharesPage4.checkinOfTwoPNRsWithMultipleItemsErrorForForcedSelecteePax(logInfo);
            logInfo.pass("I perform checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for forced selectee pax");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:LSX_ command to perform checkin of two PNRs with same details to get multiple items and then do checkin successfully for exempted pax")
    public void iEnterLSX_CommandToPerformCheckinOfTwoPNRsWithSameDetailsToGetMultipleItemsAndThenDoCheckinSuccessfullyForExemptedPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for exempted pax");
            isharesPage4.checkinOfTwoPNRsWithMultipleItemsErrorForExemptedPax(logInfo);
            logInfo.pass("I perform checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for exempted pax");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 2N_LX_LANDING_CANCEL command for Landing {string} of a flight")
    public void I_enter_2N_LX_LANDING_CANCEL_command_for_Landing_cancellation_of_a_flight(String landingtype) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2N_/LX_LANDING_CANCEL command for Landing cancellation of a flight");
            System.out.println("I enter 2N_/LX_LANDING_CANCEL command for Landing cancellation of a flight");

            isharesPage4.LandingCancellationOfAFlight(logInfo, landingtype);
            logInfo.pass("I enter 2N_/LX_LANDING_CANCEL command for Landing cancellation of a flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message for OUT replace with FRI and FRO")
    public void enter_Process_FLIFO_update_message_OUT_replace_with_FRI_and_FRO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message for for OUT replace with FRI and FRO");
            isharesPage4.Process_FLIFO_update_message_OUT_replace_with_FRI_and_FRO(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message for for OUT replace with FRI and FRO");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message for ETD")
    public void enter_Process_FLIFO_update_message_ETD() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message for ETD");
            isharesPage4.Process_FLIFO_update_message_ETD(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message for ETD");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message for BOS")
    public void enter_Process_FLIFO_update_message_BOS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message for BOS");
            isharesPage4.Process_FLIFO_update_message_BOS(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message for BOS");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$_ command for payment with remarks {string}")
    public void iEnterT$_CommandForReplacingThePayment(String Remarks) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$_ command for payment with remarks");
            isharesPage4.iEnterT$_PaymentWithRemarks(logInfo, Remarks);
            logInfo.pass("I enter T-$_ command for payment with remarks");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I have done manual fare quote by using FC command")
    public void iHaveDoneManualFareQuoteByUsingFCCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done manual fare quote by using FC command");
            System.out.println("I have done manual fare quote by using FC command");
            isharesPage4.fare_Quoting_using_FC_Command(logInfo);
            logInfo.pass("I have done manual fare quote by using FC command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command T-$ to ticket by Cash")
    public void iEnterCommandT$ToTicketByCash() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command T-$ to ticket by Cash");
            isharesPage4.ticketByCash(logInfo);
            logInfo.pass("I have done ticketing by cash");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter X1 Command")
    public void iEnterXCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X1 command");
            isharesPage4.enterX1Command(logInfo);
            logInfo.pass("I enter X1 command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:PR_*UNREC command to display passenger unreconcile name list using sequence number")
    public void iEnterPR_UNRECCommandToDisplayPassengerUnreconcileNamelistUsingSequenceNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR_*UNREC command to display passenger unreconcile name list using sequence number");
            isharesPage4.unReconciliationStatus(logInfo);
            logInfo.pass("I enter 6:PR_*UNREC command to display passenger unreconcile name list using sequence number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*COHOST command to verify {string} for Entry {string}")
    public void iEnterQ_COHOST(String CarrirCode,String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST command to verify " + CarrirCode + " for Entry " +Entry);
            isharesPage4.enterQ_COHOST(logInfo,CarrirCode,Entry);
            logInfo.pass("I enter Q*COHOST command to verify " + CarrirCode + " for Entry " +Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *EB command to display ETKT passenger list for a flight using name of pax")
    public void iEnterEBCommandToDisplayETKTPassengerListForAFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter *EB command to display ETKT passenger list for a flight using name of pax");
            isharesPage4.EB_ETKTDisplayForFlight(logInfo);
            logInfo.pass("I enter *EB command to display ETKT passenger list for a flight using name of pax");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER command {string}")
    public void iEnterKTPARTNERCommand(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command " + SystemType );
            isharesPage4.enterKTPARTNERCommand(logInfo,SystemType);
            logInfo.pass("I enter K-T-PARTNER command" );

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter display queue check list {string}")
    public void idisplayQueueCheckList(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter display queue check list "  + Entry );
            isharesPage4.checkQueueList(logInfo,Entry);
            logInfo.pass("I enter display queue check list " + Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter long sell command for segment {string}")
    public void enter_longSellCommand(String SegmentIndex) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long sell command for segment " + SegmentIndex);
            isharesPage4.LongSellforMarriedSegment(logInfo,SegmentIndex);
            logInfo.pass("I enter long sell command for segment " + SegmentIndex);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter KSR command to Display detail flight schedule")
    public void enter_KSR_DisplayDetailschedule() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KSR command to Display detail flight schedule");
            isharesPage4.enterKSR_DisplayDetailschedule(logInfo);
            logInfo.pass("I enter KSR command to Display detail flight schedule");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Verify if the PNR allows to insert a new flight between the existing flight items for {string}")
    public void iVerifyIfThePNRAllowsToInsertANewFlightBetweenTheExistingFlightItemsFor(String SegmentIndex) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify if the PNR allows to insert a new flight between the existing flight items for  " + SegmentIndex);
            isharesPage4.verifyIfThePNRAllowsToInsertANewFlightBetweenTheExistingFlightItemsFor(logInfo,SegmentIndex);
            logInfo.pass("I Verify if the PNR allows to insert a new flight between the existing flight items for  " + SegmentIndex);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set date of birth {string}")
    public void iSetDateOfBirth(String DOB) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set DOB to " + DOB);
            isharesPage4.setDOB(DOB);
            logInfo.pass("I set DOB to " + DOB);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set document number {string}")
    public void iSetPassport(String DocumentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set document number to " + DocumentNumber);
            isharesPage4.setDocumentNumber(DocumentNumber);
            logInfo.pass("I set document number to " + DocumentNumber);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set country code {string}")
    public void iSetCountryCode(String CountryCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set country code to " + CountryCode);
            isharesPage4.setCountryCode(CountryCode);
            logInfo.pass("I set country code to " + CountryCode);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter JA command to display using social security name")
    public void i_enter_JA_command_display_social_security_name() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter JA command to display using social security name ");
            isharesPage4.displaySocialSecurityName(logInfo);
            logInfo.pass("I enter JA command to display using social security name ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMH Modify Flight Header Information {string}")
    public void I_enter_VMH_modify_flight_Header_Information(String Entry){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMH Modify Flight Header Information "+Entry);
            isharesPage4.enterVMHModifyFlightHeaderInformation(logInfo,Entry);
            logInfo.pass("I enter VMH Modify Flight Header Information "+Entry);

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KT command to add the class to the waitlist closure table")
    public void iEnterKTCommandToAddTheClassToTheWaitlistClosureTable() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT command to add the class to the waitlist closure table");
            isharesPage4.enterKTCommandToAddTheClassToTheWaitlistClosureTable(logInfo);
            logInfo.pass("I enter KT command to add the class to the waitlist closure table");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6RR command to save the details to create PNR {string}")
    public void iEnterRRCommandToSaveTheDetailsToCreatePNR(String Entry) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6RR command to save the details to create PNR "+Entry);
            isharesPage4.enterRRCommandToSaveTheDetailsToCreatePNR(logInfo,Entry);
            logInfo.pass("I enter 6RR command to save the details to create PNR "+Entry);

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter passenger details with same surname {string}")
    public void iEnterPassengerDetailsWithSameSurname(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details with same surname " + Entry);
            isharesPage4.enterPassengerDetailsForSameSurnamePax(logInfo,Entry);
            System.out.println("I enter passenger details with same surname");
            logInfo.pass("I enter passenger details with same surname");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE$ command to display the reverse codeshare table statistics")
    public void iEnterQCODESHARE$CommandToDisplayTheReverseCodeshareTableStatistics() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE$ command to display the reverse codeshare table statistics" );
            isharesPage4.enterQCODESHARE$CommandToDisplayTheReverseCodeshareTableStatistics(logInfo);
            logInfo.pass("I enter Q*CODESHARE$ command to display the reverse codeshare table statistics");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNBI command")
    public void iEnterPNBICommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBI command" );
            isharesPage4.enterPNBICommand(logInfo);
            logInfo.pass("I enter PNBI command");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZUDFM commands {string}")
    public void iEnterZUDFMCommands(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZUDFM commands " + Entry);
            isharesPage4.enterZUDFMCommand(logInfo,Entry);
            logInfo.pass("I enter ZUDFM commands "+ Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*TTY_CM command to verify incoming TTY message {string}")
    public void iEnterQTTYCMCommandToVerifyIncomingTTYMessage(String TTYEntry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*TTY_CM command to verify incoming TTY message " + TTYEntry);
            isharesPage4.enterQTTYCMCommandToVerifyIncomingTTYMessage(logInfo,TTYEntry);
            logInfo.pass("I enter Q*TTY_CM command to verify incoming TTY message "+ TTYEntry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9_@ command to add and remove the phone numbers {string}")
    public void iEnter_CommandToAddAndRemoveThePhoneNumbers(String Index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9_@ command to add and remove the phone numbers "+Index);
            isharesPage4.addAndRemovePhoneNumbers(logInfo,Index);
            logInfo.pass("I enter 9_@ command to add and remove the phone numbers "+Index);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KUT command to Run Teletype Automatic Processing Options {string}")
    public void enter_KUT_RunTeletypeAutomaticProcessingOptions(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KUT command to Run Teletype Automatic Processing Options " +Entry);
            isharesPage4.enterKUT_RunTeletypeAutomaticProcessingOptions(logInfo,Entry);
            logInfo.pass("I enter KUT command to Run Teletype Automatic Processing Options "+Entry);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER command to add item in table {string}")
    public void iEnterKTPARTNERCommandToAddItemInTable(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to add item in table " +Entry);
            isharesPage4.enterKTPARTNERCommandToAddItemInTable(logInfo,Entry);
            logInfo.pass("I enter K-T-PARTNER command to add item in table "+Entry);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter Share Entries to Verify BestBuy {string}")
    public void iEnterShareEntriestoVerifyBestBuy(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter Share Entries to Verify BestBuy");
            isharesPage4.iVerifyBestBuy(logInfo,entry);
            logInfo.pass("I Enter Share Entries to Verify BestBuy");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify Entries after BestBuy command")
    public void iEnterShareEntriestoVerifyBestBuyData() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify Entries after BestBuy command");
            isharesPage4.iVerifyEntriesForBestBusy(logInfo);
            logInfo.pass("I verify Entries after BestBuy command");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter Next Entry To Verify BestBuy {string}")
    public void iEnterNextEntryToVerifyBestBuy(String TestCase) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter Next Entry To Verify BestBuy");
            isharesPage4.iEnterNextEntryToVerifyBestBuy(logInfo,TestCase);
            logInfo.pass("I Enter Next Entry To Verify BestBuy");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LA_R command to INHIBIT BEST-BUY PRICING REQ FOR MM BOOKING STATUS CODE")
    public void iEnterLA_RcommandToInhibitBestBuyPricingReqForMMBookingStatusCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA_R command to INHIBIT BEST-BUY PRICING REQ FOR MM BOOKING STATUS CODE");
            isharesPage4.enterLA_R_ToInhibitBestBuy(logInfo);
            logInfo.pass("I enter LA_R command to INHIBIT BEST-BUY PRICING REQ FOR MM BOOKING STATUS CODE");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I print the boarding pass for all the passengers for error Message")
    public void iPrintBordingPass(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I print the boarding pass for all the passengers for error Message");
            isharesPage4.printBoardingPass_Error(logInfo);
            logInfo.pass("I print the boarding pass for all the passengers for error Message");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to run alternate booking code user for COS {string}")
    public void i_enter_command_to_run_alternate_booking_code_user(String COS){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run alternate booking code user");
            isharesPage4.alternateBookingCodeUser(logInfo, COS);
            logInfo.pass("I enter command to run alternate booking code user");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Verify Visanet CVV2 User")
    public void i_enter_command_to_Verify_Visanet_CVV2_user(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Verify Visanet CVV2 User");
            isharesPage4.VerifyVisanetCVV2_User(logInfo);
            logInfo.pass("I enter command to Verify Visanet CVV2 User");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Verify Real time CID User")
    public void i_enter_command_to_Verify_Real_time_CID_user(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Verify Real time CID User");
            isharesPage4.VerifyRealTimeCID_User(logInfo);
            logInfo.pass("I enter command to Verify Real time CID User");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Verify MC CVC2 AND DS CID User")
    public void i_enter_command_to_Verify_MC_CVC2_And_DS_CID_user(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Verify MC CVC2 AND DS CID User");
            isharesPage4.VerifyMC_CVC2_User(logInfo);
            logInfo.pass("I enter command to Verify MC CVC2 AND DS CID User");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Reset the LNIATA")
    public void i_enter_command_to_Reset_The_LNIATA(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Reset the LNIATA");
            isharesPage4.resetLNIATA(logInfo);
            logInfo.pass("I enter command to Reset the LNIATA");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to store a fare when priced automatically by the pricing system")
    public void i_enter_command_to_store_a_fare_when_priced_automatically_by_the_pricing_system(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to store a fare when priced automatically by the pricing system");
            isharesPage4.storeAutomaticallyPricedFare(logInfo);
            logInfo.pass("I enter command to store a fare when priced automatically by the pricing system");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to farequote a non-revenue pax with eticket")
    public void i_enter_command_to_farequote_a_non_revenue_pax_with_eticket(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to farequote a non-revenue pax with eticket");
            isharesPage4.fareQuoteNRPS_paxWithEtkt(logInfo);
            logInfo.pass("I enter command to farequote a non-revenue pax with eticket");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Verify Visanet by editing on first 4 digits of the retrieval ref nbr as Julian date")
    public void i_enter_command_to_Verify_Visanet_by_editing_on_first_4_digits_of_the_retrieval_ref_nbr_as_Julian_date (){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Verify Visanet by editing on first 4 digits of the retrieval ref nbr as Julian date");
            isharesPage4.verifyVisaNetForJulianDate(logInfo);
            logInfo.pass("I enter command to Verify Visanet by editing on first 4 digits of the retrieval ref nbr as Julian date");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTD commands to display Monitored Agent Sine {string}")
    public void iEnterBTDCommandsToDisplayMonitoredAgentSine(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTD commands to display Monitored Agent Sine " +Entry);
            isharesPage4.enterBTDCommandsToDisplayMonitoredAgentSine(logInfo,Entry);
            logInfo.pass("I enter BTD commands to display Monitored Agent Sine "+Entry);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I set the POS to TAR")
    public void i_set_the_POS_for_TAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change POS for TAR");
            isharesPage4.setPosForTAR(logInfo);
            logInfo.pass("I change POS to TAR");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_RAX_ command")
    public void iEnterT_RAX_Command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAX_ command");
            isharesPage4.enterT_RAX_Command(logInfo);
            logInfo.pass("I enter T_RAX_ command");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KA command {string}")
    public void iEnterKACommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KA command "+Entry);
            isharesPage4.enterKACommand(logInfo,Entry);
            logInfo.pass("I enter KA command "+Entry);

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C:A for Tourist FOP {string}")
    public void iEnterCAForTouristFOP(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A for Tourist Cards "+Entry);
            isharesPage4.enterCAForTouristCards(logInfo,Entry);
            logInfo.pass("I enter C:A for Tourist Cards "+Entry);

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter S_ command to display schedule information of direct flights {string}")
    public void iEnterS_CommandToDisplayScheduleInformationOfDirectFlights(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter S_ command to display schedule information of direct flights "+Entry);
            isharesPage4.displayScheduleInfoOfDirectFlights(logInfo,Entry);
            logInfo.pass("I enter S_ command to display schedule information of direct flights "+Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2D command to run agent entry for decision messages {string}")
    public void i_enter_2D_to_run_descision_messages(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2D command to run agent entry for decision messages "+Entry);
            isharesPage4.displayAgentEntryForDescisionMessage(logInfo,Entry);
            logInfo.pass("I enter 2D command to run agent entry for decision messages "+Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CND command to delete a Pass Code to The Standby Priority Table")
    public void iEnterCNDCommandToDeleteAPassCodeToTheStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CND command to delete a Pass Code to The Standby Priority Table");
            isharesPage4.enterCNDCommandToDeleteAPassCodeToTheStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6:CND command to delete a Pass Code to The Standby Priority Table");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:CNF_ command")
    public void iEnterCNF_Command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNF_ command");
            isharesPage4.enterCNF_Command(logInfo);
            logInfo.pass("I enter 6:CNF_ command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*KCT1ACT to activate LINIATA")
    public void iEnterOCMKCTACTToActivateLINIATA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*KCT1ACT to activate LINIATA");
            isharesPage4.activateAndDeactivateLANATA(logInfo);
            logInfo.pass("I enter OCM*KCT1ACT to activate LINIATA");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command {string}")
    public void iEnterKJCommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command " + Entry);
            isharesPage4.enterKJCommand(logInfo,Entry);
            logInfo.pass("I enter KJ command "+Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter long cell command {string}")
    public void iEnterLongCellCommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long cell command " + Entry);
            isharesPage4.enterLongCellCommand(logInfo,Entry);
            logInfo.pass("I enter long cell command "+Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C-C01 command")
    public void iEnterCCCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C-C01 command" );
            isharesPage4.enterCCCommand(logInfo);
            logInfo.pass("I enter C-C01 command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LK_ command to perform checkin of two PNRs to get multiple items and do checkin successfully for waitlist,NRSA,NRPS and normal pax")
    public void iEnterLK_CommandToPerformCheckinOfTwoPNRsToGetMultipleItemsAndDoCheckinSuccessfullyForWaitlistNRSANRPSAndNormalPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for waitlist,NRSA,NRPS and normal pax");
            isharesPage4.checkinOfTwoPNRsWithMultipleItemsErrorForWaitlistNRPSNRSANormalPax(logInfo);
            logInfo.pass("I perform checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for waitlist,NRSA,NRPS and normal pax");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LMI_ command to perform checkin for military pax and validate error")
    public void iEnterLMI_CommandToPerformCheckinForMilitaryPaxAndValidateError()
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LMI_ command to perform checkin for military pax and validate error");
            isharesPage4.enterLMIandValidateError(logInfo);
            logInfo.pass("I enter 6:LMI_ command to perform checkin for military pax and validate error");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:SA_NW command to change the passenger as armed passenger and validate the error")
    public void iEnterSA_NWCommandToChangeThePassengerAsArmedPassengerAndValidateTheError()
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:SA_NW command to change the passenger as armed passenger and validate the error");
            isharesPage4.changeToArmedPassengerAndValidateTheError(logInfo);
            logInfo.pass("I enter 6:SA_NW command to change the passenger as armed passenger and validate the error");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LSA_ command to perform checkin for armed pax and validate error")
    public void iEnterLSA_CommandToPerformCheckinForArmedPaxAndValidateError()
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LSA_ command to perform checkin for Armed pax and validate error");
            isharesPage4.enterLSAandValidateError(logInfo);
            logInfo.pass("I enter 6:LSA_ command to perform checkin for Armed pax and validate error");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:MI_NW command to perform checkin for military pax and validate error")
    public void iEnterMI_NWCommandToPerformCheckinForMilitaryPaxAndValidateError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:MI_NW command to perform checkin for military pax and validate error");
            isharesPage4.checkinOfMilitaryPaxWithMINWAndValidateError(logInfo);
            logInfo.pass("I enter 6:MI_NW command to perform checkin for military pax and validate error");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:DP_ and 6:LDP_ command to perform diplomat checkin of two PNRs to get multiple items and do checkin successfully")
    public void iEnterLDP_CommandToPerformDiplomatCheckinOfTwoPNRsToGetMultipleItemsAndDoCheckinSuccessfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DP_ and 6:LDP_ command to perform diplomat checkin of two PNRs to get multiple items and do checkin successfully");
            isharesPage4.diplomatPaxCheckinOfTwoPNRsWithMultipleItemsError(logInfo);
            logInfo.pass("I enter 6:DP_ and 6:LDP_ command to perform diplomat checkin of two PNRs to get multiple items and do checkin successfully");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for first segment from {string} to {string} for a specific class")
    public void iSearchForFlightAvailabilityForFirstSegmentFromToForASpecificClass(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for first segment for a specific class");
            isharesPage4.bookFlightForSpecificClass(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for first segment for a specific class");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:DI.DV_ command to change the pax status from VOL to HKN for NRSA,NRPS passenger and validate the error")
    public void iEnterDIDV_CommandToChangeThePaxStatusFromVOLToHKNForNRSANRPSPassengerAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DI.DV_ command to change the pax status from VOL to HKN for NRSA,NRPS passenger and validate the error");
            isharesPage4.changePaxStatusFromVOLToHKNForNRSANRPSPaxAndValidateTheError(logInfo);
            logInfo.pass("I enter 6:DI.DV_ command to change the pax status from VOL to HKN for NRSA,NRPS passenger and validate the error");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LDV_ command to add volunteer status after checkin")
    public void iEnterLDV_CommandToAddVolunteerStatusAfterCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LDV_ command add volunteer status after checkin");
            isharesPage4.addVolunteerStatusAfterCheckin(logInfo);
            logInfo.pass("I enter 6:LDV_ command to add volunteer status after checkin");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:LDVR_ command to remove volunteer status after checkin")
    public void iEnterLDVR_CommandToRemoveVolunteerStatusAfterCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LDVR_ command remove volunteer status after checkin");
            isharesPage4.removeVolunteerStatusAfterCheckin(logInfo);
            logInfo.pass("I enter 6:LDVR_ command to remove volunteer status after checkin");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:DV_ and 6:LDI_ command to perform involuntary denied boarding passengers after checkin process for all the passengers")
    public void iEnterDV_AndLDI_CommandToPerformInvoluntaryDeniedBoardingPassengersAfterCheckinProcessForAllThePassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV_ and 6:LDI_ command to perform involuntary denied boarding passengers after checkin process for all the passengers");
            isharesPage4.performInvoluntaryDeniedBoardingPaxAfterCheckinProcessForAllPax(logInfo);
            logInfo.pass("I enter 6:DV_ and 6:LDI_ command to perform involuntary denied boarding passengers after checkin process for all the passengers");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:SX_NW command to change the passenger to exempted passenger")
    public void iEnterSX_NWCommandToChangeThePassengerToExemptedPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:SX_NW command to change the passenger to exempted passenger");
            isharesPage4.changeThePassengerToExemptedPassenger(logInfo);
            logInfo.pass("I enter 6:SX_NW command to change the passenger to exempted passenger");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:X_ command to perform seat exchange by name item")
    public void iEnterX_CommandToPerformSeatExchangeByNameItem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:X_ command to perform seat exchange by name item");
            isharesPage4.seatExchangeByName(logInfo);
            logInfo.pass("I enter 6:X_ command to perform seat exchange by name item");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }
    @And("I enter KAFON Run the Display the Flight Ordinal Number Table")
    public void iEnterKAFONRunTheDisplayTheFlightOrdinalNumberTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KAFON Run the Display the Flight Ordinal Number Table");
            System.out.println("I enter KAFON Run the Display the Flight Ordinal Number Table");
            isharesPage4.display_flight_ordinal_number_table(logInfo);
            logInfo.pass("Flight Ordinal Number Table Displayed Successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter W* and ZAFIL commands to check the space held type shares entries")
    public void iEnterWAndZAFILCommandsToCheckTheSpaceHeldTypeSharesEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter W* and ZAFIL commands to check the space held type shares entries");
            isharesPage4.enterWAndZAFILCommands(logInfo);
            logInfo.pass("I  enter W* and ZAFIL commands to check the space held type shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter KT* command to display availability {string}")
    public void iEnterKTCommandToDisplayAllSchedules(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT*"+Entry+" command to display all schedules");
            isharesPage4.enterKTCommandToDisplayAllSchedules(logInfo,Entry);
            logInfo.pass("I enter KT*"+Entry+" command to display all schedules");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C: command {string}")
    public void iEnterCCommand(String entry) {
        try {
            //C:A44006543280*12/$FR
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the command:" +entry);
            isharesPage4.ienterCcoloncommandforLogging(logInfo,entry);
            logInfo.pass("I enter the command:" +entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Enquire for a UATP Credit card {string}")
    public void iEnquireForAUATPCreditCard(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter run the space held type shares entries");
            isharesPage4.entryUATPCreditCard(logInfo,Entry);
            logInfo.pass("I  enter run the space held type shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FF command To File Fare Quote")
    public void ienterFFcommandToFileFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FF command To File Fare Quote");
            isharesPage4.enterFFToFileFareQuote(logInfo);
            logInfo.pass("I enter FF command To File Fare Quote");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }
    @And("I enter $-$- to auto fare quote for all the passengers in the PNR without Payment Details")
    public void autofareQuoteForAllPassengersInPNRWithoutPaymentDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$- to auto fare quote for all the passengers in the PNR without Payment Details");
            isharesPage4.autoFareWithoutPayment(logInfo);
            logInfo.pass("Auto fare quote for all the passengers in the PNR without Payment Details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }
    @And("I enter *FW command for displaying the auto fare quote")
    public void ienterFW_commandForDisplayingTheAutoFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FW command for displaying the auto fare quote");
            isharesPage4.displayFareQuotes(logInfo);
            logInfo.pass("I enter *FW command for displaying the auto fare quote");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *FW1 TAX command for displaying individual tax fields")
    //Command *FW1/TAX
    public void ienterFWTAX_commandForDisplayingTheTaxFields() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FW1/TAX command for displaying individual tax fields");
            isharesPage4.displayIndividualTaxFields(logInfo);
            logInfo.pass("I enter *FW1/TAX command for displaying individual tax fields");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter the run and data retrieval command")
    public void iEnterTheRunAndDataRetrievalCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Retrieval and Data Display");
            isharesPage4.RunAndDataRetrieval(logInfo);
            logInfo.pass("I  enter Run the Retrieval and Data Display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FID command to delete the filed fare quote")
    public void iEnterFIDCommandToDeleteTheFiledFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FID command to delete the filed fare quote");
            isharesPage4.deleteFiledFareQuote(logInfo);
            logInfo.pass("I enter FID command to delete the filed fare quote");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the commands to display agent queue productivity")
    public void iEnterTheCommandsToDisplayAgentQueueProductivity() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Commands To Display Agent Queue Productivity");
            isharesPage4.CommandsToDisplayAgentQueueProductivity(logInfo);
            logInfo.pass("I enter Commands To Display Agent Queue Productivity");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *AP command to display APIS details of PNR having multi initial passengers")
    public void iEnterAPCommandToDisplayAPISDetailsOfPNRHavingMultiInitialPassengers()
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *AP command to display APIS details of PNR having multi initial passengers");
            isharesPage4.advancePaxInfoMultiInitial(logInfo);
            logInfo.pass("I enter *AP command to display APIS details of PNR having multi initial passengers");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD command to display Paper Ticketed Passengers")
    public void i_enter_6_LD_command_to_display_Paper_Ticketed_Passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to display Paper Ticketed Passengers");
            isharesPage4.displayPaperTicketedPassenger(logInfo);
            logInfo.pass("I enter 6:LD command to display Paper Ticketed Passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to add fare with {string}")
    public void i_enter_command_to_add_fare_with(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add fare with "+entry);
            isharesPage4.addFareWithEntry(logInfo,entry);
            logInfo.pass("I enter command to add fare with "+entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to run the pricing using COS")
    public void i_enter_command_to_run_the_pricing_using_COS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the pricing using COS");
            isharesPage4.runPricingWithCOS(logInfo);
            logInfo.pass("I enter command to run the pricing using COS");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Run the Fare by rule pricing")
    public void i_enter_command_to_run_the_Fare_by_rule_pricing() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run the Fare by rule pricing");
            isharesPage4.runFareByRulePricing(logInfo);
            logInfo.pass("I enter command to Run the Fare by rule pricing");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6PAX command to save the changes to PNR")
    public void i_enter_6PAX_command_to_save_the_changes_to_PNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6PAX command to save the changes to PNR");
            isharesPage4.enter_6PAX(logInfo);
            logInfo.pass("I enter 6PAX command to save the changes to PNR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to replace the existing ticketing remark for {string}")
    public void i_enter_command_to_replce_the_existing_ticketing_remark_for(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to replace the existing ticketing remark for "+Entry);
            isharesPage4.replaceExistingRemark(logInfo, Entry);
            logInfo.pass("I enter command to replace the existing ticketing remark for "+Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I verify the ticketing remarks for all pax")
    public void I_verify_the_ticketing_remarks_for_all_pax(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the ticketing remarks for all pax");
            isharesPage4.verifyTheTicketingRemarks(logInfo);
            logInfo.pass("I verify the ticketing remarks for all pax");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I verify the ticketing remarks for all pax after deleting all ticketing remarks")
    public void I_verify_the_ticketing_remarks_for_all_pax_after_deleting_all_ticketing_remarks(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the ticketing remarks for all pax after deleting all ticketing remarks");
            isharesPage4.verifyTheTicketingRemarksAfterDelete(logInfo);
            logInfo.pass("I verify the ticketing remarks for all pax after deleting all ticketing remarks");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to pay by MasterCard")
    public void i_enter_command_to_pay_by_MasterCard() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to pay by MasterCard");
            isharesPage2.payByMasterCard(logInfo);
            logInfo.pass("I enter command to pay by MasterCard");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:RG_ command to Change PNR Class of Service {string}")
    public void iEnterRG_CommandToChangePNR_ClassOfService(String COS){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:RG_ command to Change PNR Class of Service " + COS);
            isharesPage4.enterRG_CommandToChangeCOS(logInfo, COS);
            logInfo.pass("I enter 6:RG_ command to Change PNR Class of Service");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ETREFUND command to refund the tkt with penalty")
    public void iEnterTETREFUNDCommandToRefundTheTktWithPenalty() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETREFUND command to refund the tkt with penalty");
            isharesPage4.refundTktWithPenalty(logInfo);
            logInfo.pass("I enter T-ETREFUND command to refund the tkt with penalty");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I verify the passenger receipt document")
    public void iVerifyThePassengerReceiptdocument() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the passenger receipt document");
            isharesPage4.verifyPaxReceiptDocPrint(logInfo);
            logInfo.pass("I verify the passenger receipt document");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I farequote the passenger with Neutral Unit of Currency")
    public void iFareQuoteThePassengerWithNeutralUnitOfCurrency() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I farequote the passenger with Neutral Unit of Currency");
            isharesPage4.fareQuoteWithNUC(logInfo);
            logInfo.pass("I farequote the passenger with Neutral Unit of Currency");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I manual farequote the passenger with Expanded Tax and Fare Calc data")
    public void iManualFareQuoteThePassengerWithExpandedTaxAndFareCalcData() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I manual farequote the passenger with Expanded Tax and Fare Calc data");
            isharesPage4.fareQuoteWithExpandedTaxAndFareCalcData(logInfo);
            logInfo.pass("I manual farequote the passenger with Expanded Tax and Fare Calc data");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify ABR text data")
    public void iEnterCommandToVerifyABRTextData() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify ABR text data");
            isharesPage4.verifyABRTextData(logInfo);
            logInfo.pass("I enter command to verify ABR text data");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify pre auth to visanet")
    public void iEnterCommandToPreAuthToVisanet() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify pre auth to visanet");
            isharesPage4.verifyPreAuthToVisanet(logInfo);
            logInfo.pass("I enter command to verify pre auth to visanet");
            System.out.println("I enter command to verify pre auth to visanet");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to route UATP auth to SITA to display error message")
    public void iEnterCommandToRoute_UATP_authTo_SITA_ToDisplayErrorMessage () {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to route UATP auth to SITA to display error message");
            isharesPage4.routeUATP_SITA_ToDisplayErrorMsg(logInfo);
            logInfo.pass("I enter command to route UATP auth to SITA to display error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Verify Display Pseudo City Conversion Table for city {string}")
    public void iVerifyDisplayPseudoCityConversionTableForCity(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify Display Pseudo City Conversion Table for city "+city);
            isharesPage4.displayPseudoCityConversionTable(logInfo, city);
            logInfo.pass("I Verify Display Pseudo City Conversion Table for city "+city);

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I farequote the passenger with Percent Discount Pricing")
    public void iFareQuoteThePassengerWithPercentDiscountPricing() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I farequote the passenger with Percent Discount Pricing");
            isharesPage4.fareQuoteWithPercentDiscountPricing(logInfo);
            logInfo.pass("I farequote the passenger with Percent Discount Pricing");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify credit cards with account number upto 22 digits")
    public void iEnterCommandToVerifyCreditCardsWithAccountNumberUpto22Digits() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify credit cards with account number upto 22 digits");
            isharesPage4.verifyCCaccountNbrUtpto22Digits(logInfo);
            logInfo.pass("I enter command to verify credit cards with account number upto 22 digits");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Display queue Feeb Control Table")
    public void iEnterCommandToDisplayQueueFeebControlTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Display queue Feeb Control Table");
            isharesPage4.displayQueueFeebControlTable(logInfo);
            logInfo.pass("I enter command to Display queue Feeb Control Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $:S_6P command to display Global Fare")
    public void iEnter$S_PCommandToDisplayGlobalFare() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $:S_6P command to display Global Fare");
            isharesPage4.ToDisplayGlobalFare(logInfo);
            logInfo.pass("I enter $:S_6P command to display Global Fare");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I add address remarks {string}")
    public void iAddAddressRemarks(String RemarksType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add address remarks");
            isharesPage4.AddAddressRemarks(logInfo,RemarksType);
            logInfo.pass("I add address remarks");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ETREFUND_DENIED command to deny the refund")
    public void iEnterTETREFUND_DENIEDCommandToDenyTheRefund() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETREFUND_DENIED command to deny the refund");
            isharesPage4.ToDenyTheRefund(logInfo);
            logInfo.pass("I enter T-ETREFUND_DENIED command to deny the refund");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *R command to display the PNR")
    public void iEnterRCommandToDisplayThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *R command to display the PNR");
            isharesPage4.EnterRCommandToDisplayThePNR(logInfo);
            logInfo.pass("I enter *R command to display the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$_ command to display auto fare quote")
    public void iEnter$$_CommandToDisplayAutoFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$_ command to display auto fare quote");
            isharesPage4.ToDisplayAutoFareQuote(logInfo);
            logInfo.pass("I enter $-$_ command to display auto fare quote");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *FW command to store Fare amount")
    public void iEnterFWCommandToStoreFareAmount() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FW command to store Fare amount");
            isharesPage4.ToStoreFareAmount(logInfo);
            logInfo.pass("I enter *FW command to store Fare amount");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $_$N_ command to verify best buy entry")
    public void iEnter$_$N_CommandToVerifyBestBuyEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_$N_ command to verify best buy entry");
            isharesPage4.ToVerifyBestBuyEntry(logInfo);
            logInfo.pass("I enter $_$N_ command to verify best buy entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$-N_|PADT|Z command to verify best buy entry with discount percentage")
    public void iEnter$$N_PADTZCommandToVerifyBestBuyEntryWithDiscountPercentage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-N_|PADT|Z command to verify best buy entry with discount percentage");
            isharesPage4.ToVerifyBestBuyEntryWithDiscountPercentage(logInfo);
            logInfo.pass("I enter $-$-N_|PADT|Z command to verify best buy entry with discount percentage");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FF3 to display fare quote filled details")
    public void iEnterFFToDisplayFareQuoteFilledDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FF3 to display fare quote filled details");
            isharesPage4.ToDisplayFareQuoteFilledDetails(logInfo);
            logInfo.pass("I enter FF3 to display fare quote filled details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FF_ command to display fare quote filled details")
    public void iEnterFF_CommandToDisplayFareQuoteFilledDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FF_ command to display fare quote filled details");
            isharesPage4.iEnterFF_Command(logInfo);
            logInfo.pass("I enter FF_ command to display fare quote filled details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LA$R|_B command to return the lowest fare in the First, Business and Economy classes cabin for all fare components")
    public void iEnterLA$R_BCommandToReturnTheLowestFareInTheFirstBusinessAndEconomyClassesCabinForAllFareComponents() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$R|_B command to return the lowest fare in the First, Business and Economy classes cabin for all fare components");
            isharesPage4.ToReturnTheLowestFareForAllFareComponents(logInfo);
            logInfo.pass("I enter LA$R|_B command to return the lowest fare in the First, Business and Economy classes cabin for all fare components");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $_$-WT command to display fare quote without taxes")
    public void iEnter$_$WTCommandToDisplayFareQuoteWithoutTaxes() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_$-WT command to display fare quote without taxes");
            isharesPage4.Enter$_$WTCommand(logInfo);
            logInfo.pass("I enter $_$-WT command to display fare quote without taxes");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *FH_FOP command to display Fare Quote History")
    public void iEnterFH_FOPCommandToDisplayFareQuoteHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FH_FOP command to display Fare Quote History");
            isharesPage4.DisplayFareQuoteHistory(logInfo);
            logInfo.pass("I enter *FH_FOP command to display Fare Quote History");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *F Command to verify Short Display of PNR Fare Quote")
    public void iEnterFCommandToVerifyShortDisplayOfPNRFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *F Command to verify Short Display of PNR Fare Quote");
            isharesPage4.EnterFCommand(logInfo);
            logInfo.pass("I enter *F Command to verify Short Display of PNR Fare Quote");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *F_FOP command to verify Short Display of PNR Fare Quote Data")
    public void iEnterF_FOPCommandToVerifyShortDisplayOfPNRFareQuoteData() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *F_FOP command to verify Short Display of PNR Fare Quote Data");
            isharesPage4.ToVerifyShortDisplayOfPNRFareQuoteData(logInfo);
            logInfo.pass("I enter *F_FOP command to verify Short Display of PNR Fare Quote Data");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$-S_ command to display auto fare quote")
    public void iEnter$$S_CommandToDisplayAutoFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-S_ command to display auto fare quote");
            isharesPage4.Enter$_$_S_Command(logInfo);
            logInfo.pass("I enter $-$-S_ command to display auto fare quote");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FF_ command to file fare quote for segment{string}")
    public void iEnterFF_CommandToFileFareQuoteForSegment(String segmentSeq) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FF_ command to file fare quote for segment");
            isharesPage4.ToFileFareQuoteForSegment(logInfo,segmentSeq);
            logInfo.pass("I enter FF_ command to file fare quote for segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FX_ command to cancel fare quote for segment{string}")
    public void iEnterFX_CommandToCancelFareQuoteForSegment(String segmentSeq) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FX_ command to cancel fare quote for segment");
            isharesPage4.ToCancelFareQuoteForSegment(logInfo,segmentSeq);
            logInfo.pass("I enter FX_ command to cancel fare quote for segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I perform adding one Manual bag Tag number to verify error message")
    public void iPerformAddingOneManualBagTagNumberToVerifyErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform adding one Manual bag Tag number to verify error message");
            isharesPage4.ToVerifyErrorMessageForAddingOneManualBagTagNumber(logInfo);
            logInfo.pass("I perform adding one Manual bag Tag number to verify error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter SSR command to verify error message for ssr type {string}")
    public void iEnterSSRCommandToVerifyErrorMessageForSsrType(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR command to verify error message for ssr type");
            isharesPage4.ToVerifyErrorMessageForSsrType(logInfo,SSRType);
            logInfo.pass("I enter SSR command to verify error message for ssr type");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZAFIL_ command to add the SU duty code")
    public void iEnterZAFIL_CommandToAddTheSUDutyCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL_ command to add the SU duty code");
            isharesPage4.EnterZAFIL_CommandToAddTheSUDutyCode(logInfo);
            logInfo.pass("I enter ZAFIL_ command to add the SU duty code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I make adjust ETKT coupon {string} for Irregular Exchange")
    public void iMakeAdjustETKTCouponForIrregularExchange(String segmentCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make adjust ETKT coupon for Irregular Exchange");

            isharesPage4.ToAdjustETKTCoupon(logInfo,segmentCount);
            logInfo.pass("I make adjust ETKT coupon for Irregular Exchange");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter 6PAX command to save the transaction")
    public void iEnterPAXCommandToSaveTheTransaction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6PAX command to save the transaction");
            isharesPage4.Enter6Pax(logInfo);
            logInfo.pass("I enter 6PAX command to save the transaction");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I rearrange the segments with sequence {string}")
    public void iRearrangeTheSegmentsWithSequence(String segmentSeq) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rearrange the segments with sequence");
            isharesPage4.ToRearrangeTheSegments(logInfo,segmentSeq);
            logInfo.pass("I rearrange the segments with sequence");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter F*AT|N_ command to display specify priced details based on payment count{string}")
    public void iEnterFATN_CommandToDisplaySpecifyPricedDetailsBasedOnPaymentCount(String Count) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter F*AT|N_ command to display specify priced details based on payment count");

            isharesPage4.ToDisplaySpecifyPricedDetails(logInfo,Count);
            logInfo.pass("I enter F*AT|N_ command to display specify priced details based on payment count");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter LA$R|S_ command to get the best buy fare quote for specific segment")
    public void iEnterLA$RS_CommandToGetTheBestBuyFareQuoteForSpecificSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$R|S_ command to get the best buy fare quote for specific segment");

            isharesPage4.EnterLA$RS_Command(logInfo);
            logInfo.pass("I enter LA$R|S_ command to get the best buy fare quote for specific segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-ET*.F_ command to adjust ETKT change in itinerary")
    public void iEnterTETF_CommandToAdjustETKTChangeInItinerary() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*.F_ command to adjust ETKT change in itinerary");

            isharesPage4.ToAdjustETKTChangeInItinerary(logInfo);
            logInfo.pass("I enter T-ET*.F_ command to adjust ETKT change in itinerary");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter *ET_ command for first segment")
    public void iEnterET_CommandForFirstSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_ command for first segment");

            isharesPage4.EnterET_CommandForFirstSegment(logInfo);
            logInfo.pass("I enter *ET_ command for first segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-ET_|S command to do involuntary ticket adjustment")
    public void iEnterTET_SCommandToDoInvoluntaryTicketAdjustment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_|S command to do involuntary ticket adjustment");

            isharesPage4.ToDoInvoluntaryTicketAdjustmentWith_S(logInfo);
            logInfo.pass("I enter T-ET_|S command to do involuntary ticket adjustment");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-$LTR command to replace the lost ticket")
    public void iEnterT$LTRCommandToReplaceTheLostTicket() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$LTR command to replace the lost ticket");

            isharesPage4.EnterT$LTRCommand(logInfo);
            logInfo.pass("I enter T-$LTR command to replace the lost ticket");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-$OFC_ command to run out for Collection")
    public void iEnterT$OFC_CommandToRunOutForCollection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$OFC_ command to run out for Collection");

            isharesPage4.EnterT$OFC_Command(logInfo);
            logInfo.pass("I enter T-$OFC_ command to run out for Collection");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter *FW_ command to display fare quote for pax")
    public void iEnterFW_CommandToDisplayFareQuoteForPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FW_ command to display fare quote for pax");
            isharesPage4.ToDisplayFareQuoteForPax(logInfo);
            logInfo.pass("I enter *FW_ command to display fare quote for pax");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I perform adding bag tag manually")
    public void iPerformAddingBagTagManually() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform adding bag tag manually");
            isharesPage4.ToPerformAddingBagTagManually(logInfo);
            logInfo.pass("I perform adding bag tag manually");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I do the checkin of Shares PNR for origin city {string} for Multi Initial Pax with checkin type{string}")
    public void iDoTheCheckinOfSharesPNRForOriginCityForMultiInitialPaxWithCheckinType(String originCity, String checkinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of multi initial passengers");
            isharesPage2.sharesCheckinMultiInitialWithCheckinType(logInfo, originCity,checkinType);
            logInfo.pass("I do the checkin of multi initial passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:BTAG_ command to display the bag tag numbers")
    public void iEnterBTAGCommandToDisplayTheBagTagNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:BTAG_ command to display the bag tag numbers");
            isharesPage4.ToDisplayTheBagTagNumbers(logInfo);
            logInfo.pass("I enter 6:BTAG_ command to display the bag tag numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I perform seat upgrade for the passengers")
    public void iPerformSeatUpgradeForThePassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform seat upgrade for the passengers");
            isharesPage4.ToPerformSeatUpgradeForThePassengers(logInfo);
            logInfo.pass("I perform seat upgrade for the passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LA_R command to do best buy fare quote for particular segment")
    public void enter_LAR_farequoteforparticularsegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA_R command to do best buy fare quote for particular segment");
            isharesPage4.fareQuoteForAParticularSegment(logInfo);
            logInfo.pass("I enter LA_R command to do best buy fare quote for particular segment");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter UA command to view the PNR")
    public void enter_UA_viewthePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter UA command to view the PNR");
            isharesPage4.enterUA_viewthePNR(logInfo);
            logInfo.pass("I enter UA command to view the PNR");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Overriding FQR Data with System Pricing")
    public void enterTAT_OverridingFQRDatawithSystemPricing() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Overriding FQR Data with System Pricing");
            isharesPage4.enterTAT_OverridingFQRDatawithSystemPricing(logInfo);
            logInfo.pass("I enter command to Overriding FQR Data with System Pricing");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ER command and validate the error response for providing NRSA passenger to NRPS PNR")
    public void enterER_providingNRSApassengertoNRPSPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Overriding FQR Data with System Pricing");
            isharesPage4.enterERprovidingNRSApassengertoNRPSPNR(logInfo);
            logInfo.pass("I enter command to Overriding FQR Data with System Pricing");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ER command and validate the error response for {string}")
    public void enter_Priceusingfarebasis(String errorType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ER command and validate the error response");
            isharesPage4.enter_ER_ValidateError(logInfo, errorType);
            logInfo.pass("I enter ER command and validate the error response");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter invalid phone with characters")
    public void iEnterInvalidPhoneDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid phone with characters");
            isharesPage4.enter_InvalidPhone_ValidateError(logInfo);
            logInfo.pass("I enter invalid phone with characters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter invalid frequent flyer passenger with {string} of {string}")
    public void enter_ivalid_FQPassenger(String invalidValue, String type) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid frequent flyer passenger");
            isharesPage4.enterInvalid_FQTVPassenger(logInfo, type, invalidValue);
            logInfo.pass("I enter invalid frequent flyer passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command for Price using fare basis")
    public void enter_Priceusingfarebasis() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid frequent flyer passenger");
            isharesPage4.enterPriceusingfarebasis(logInfo);
            logInfo.pass("I enter invalid frequent flyer passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter incorrect format of OSI remarks")
    public void verify_incorrectformatOSIremarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter incorrect format of OSI remarks");
            isharesPage4.verifyincorrectformatOSIremarks(logInfo);
            logInfo.pass("I enter incorrect format of OSI remarks");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I verify Text Field Size is increased when form size changed")
    public void verify_formSizechange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify Text Field Size is increased when form size changed");
            isharesPage4.verify_formSizechange(logInfo);
            logInfo.pass("I verify Text Field Size is increased when form size changed");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command for Price using segment selection and open segment")
    public void enter_Priceusingsegmentselectionandopensegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Price using segment selection and open segment");
            isharesPage4.fareQuoteForAllOpenSegment(logInfo);
            logInfo.pass("I enter command for Price using segment selection and open segment");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for a specific flight passenger Data Changing")
    public void I_search_for_a_specific_flight_passenger_Data_Changing(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for a specific flight passenger Data Changing");
            isharesPage4.searchForASpecificFlightPassengerDataChanging(logInfo);
            logInfo.pass("I search for a specific flight passenger Data Changing");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 0CS entries in Transformed {string}")
    public void I_enter_0CS_entries_in_Transformed(String Airline){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0CS entries in Transformed");
            isharesPage4.enter0CSEntriesInTransformed(logInfo, Airline);
            logInfo.pass("I enter 0CS entries in Transformed");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter .1HS Space Held Type")
    public void I_enter_1HS_Space_Held_Type(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter .1HS Space Held Type");
            isharesPage4.enter1HSSpaceHeldType(logInfo);
            logInfo.pass("I enter .1HS Space Held Type");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 0CM Sell entry For Status code {string}")
    public void I_enter_0CM_Sell_entry_for_status_code(String Airline){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0CM Sell entry For Status code");
            isharesPage4.enter0CMSellEntryForStatusCode(logInfo, Airline);
            logInfo.pass("I enter 0CM Sell entry For Status code");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:* to Verify Seat Assignment for the Passenger after Check-in")
    public void I_enter_6_To_verify_seat_assignment_for_the_Passenger_after_check_in(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:* to Verify Seat Assignment for the Passenger after Check-in");
            isharesPage4.enter6ToVerifySeatAssignmentForThePassengerAfterCheckIn(logInfo);
            logInfo.pass("I enter 6:* to Verify Seat Assignment for the Passenger after Check-in");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter -7DFG can able to log the NTF notification")
    public void I_enter_7DFG_can_able_to_log_the_NTF_notification(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter -7DFG can able to log the NTF notification");
            isharesPage4.enter7DFGCanAbleToLogTheNTFNotification(logInfo);
            logInfo.pass("I enter -7DFG can able to log the NTF notification");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Create PNR with the seats")
    public void I_Create_PNR_with_the_seats(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Create PNR with the seats");
            isharesPage4.CreatePNRWithTheSeats(logInfo);
            logInfo.pass("I Create PNR with the seats");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter QM_CRC#LAST to the SDT queue")
    public void I_enter_QM_CRC_Last_to_the_SDT_queue(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QM_CRC#LAST to the SDT queue");
            isharesPage4.enterQMCRCLastToTheSDtQueue(logInfo);
            logInfo.pass("I enter QM_CRC#LAST to the SDT queue");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ETUSED_S01 to perform changing the ETKT Coupon status")
    public void I_enter_T_ETUSED_S01_to_perform_changing_the_ETKT_Coupon_status(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETUSED_S01 to perform changing the ETKT Coupon status");
            isharesPage4.enterTETUSEDToPerformChangingTheETKTCouponStatus(logInfo);
            logInfo.pass("I enter T-ETUSED_S01 to perform changing the ETKT Coupon status");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-AT for CM Stored farequote manually entered")
    public void I_enter_T_AT_for_CM_Stored_farequote_manually_entred(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-AT for CM Stored farequote manually entered");
            isharesPage4.enterTATForCMStoredFarequoteManuallyEntered(logInfo);
            logInfo.pass("I enter T-AT for CM Stored farequote manually entered");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FM Run the Add")
    public void I_enter_FM_Run_the_Add(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FM Run the Add");
            isharesPage4.enterFMRuntheAdd(logInfo);
            logInfo.pass("I enter FM Run the Add");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FI1 Ticketing Data Items SHARES")
    public void I_enter_FI1_Ticketing_Data_items_shares(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FI1 Ticketing Data Items SHARES");
            isharesPage4.enterFI1TicketingdataItemsShares(logInfo);
            logInfo.pass("I enter FI1 Ticketing Data Items SHARES");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter F*AW entries in Tranformed")
    public void I_enter_FAW_entries_in_Transformed(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter F*AW entries in Tranformed");
            isharesPage4.enterFAWEntriesInTrasnformed(logInfo);
            logInfo.pass("I enter F*AW entries in Tranformed");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I do reissue using T-$EE with even exchange {string}")
    public void I_do_reissue_suing_T_$EE_with_even_exchange(String TicketNumber){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do reissue using T-$EE with even exchange");
            isharesPage4.DoReissueUsingTEEWithEvenExchange(logInfo, TicketNumber);
            logInfo.pass("I do reissue using T-$EE with even exchange");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FF3 Workfile Item")
    public void I_enter_FF3_workfile_Item(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FF3 Workfile Item");
            isharesPage4.enterFF3WorkfileItem(logInfo);
            logInfo.pass("I enter FF3 Workfile Item");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$-WT Request for Display of Fare Quote History")
    public void I_enter_$_$_WT_request_for_Dispslay_of_Fare_Quote_History(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-WT Request for Display of Fare Quote History");
            isharesPage4.enter$$WTRequestForDisplayofFareQuoteHistory(logInfo);
            logInfo.pass("I enter $-$-WT Request for Display of Fare Quote History");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *FH_FOP Run the Request for Display")
    public void I_enter_FH_FOP_Run_the_Request_for_Display(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FH/FOP Run the Request for Display");
            isharesPage4.enterFHFOPRunTheRequestForDisplay(logInfo);
            logInfo.pass("I enter *FH/FOP Run the Request for Display");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-C|NF Run the Overriding FQR Data with Stored Ticket")
    public void I_enter_$_C_NF_run_the_Overriding_FQR_Data_with_Stored_Ticket(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-C|NF Run the Overriding FQR Data with Stored Ticket");
            isharesPage4.enter$CNFRunTheOveridingFQRDataWithStored(logInfo);
            logInfo.pass("I enter $-C|NF Run the Overriding FQR Data with Stored Ticket");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Display Mileage Surcharge Bands")
    public void I_enter_Display_mileage_surchange_Bands(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Display Mileage Surcharge Bands");
            isharesPage4.enterDisplayMileageSurchargeBands(logInfo);
            logInfo.pass("I enter Display Mileage Surcharge Bands");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter D1 to Display the Higher cabin Seat map")
    public void I_enter_D1_to_display_the_Higher_cabin_seat_map(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter D1 to Display the Higher cabin Seat map");
            isharesPage4.enterD1ToDisplayTheHigherCabinSeatMap(logInfo);
            logInfo.pass("I enter D1 to Display the Higher cabin Seat map");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Perform reservation with Alpha numeric passenger name")
    public void I_perform_reservation_with_Alpha_numeric_passenger_name(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Perform reservation with Alpha numeric passenger name");
            isharesPage4.performReservationWithAlphaNumericPassengerName(logInfo);
            logInfo.pass("I Perform reservation with Alpha numeric passenger name");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Perform reservation with phone number 0000000000")
    public void I_perform_reservation_with_phone_number_00000000(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Perform reservation with phone number 0000000000");
            isharesPage4.perfomrResrvationWithPhoneNumber0000000000(logInfo);
            logInfo.pass("I Perform reservation with phone number 0000000000");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$-PADT_INF_ADT Command")
    public void I_enter_$_$_PADT_INF_ADT_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-PADT_INF_ADT command");
            isharesPage4.enter$$PADTINFADTCommand(logInfo);
            logInfo.pass("I enter $-$-PADT_INF_ADT command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FF Fare quote")
    public void I_enter_FF_Fare_quote(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FF Fare quote");
            isharesPage4.enterFFFareQuote(logInfo);
            logInfo.pass("I enter FF Fare quote");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$-N command to Store fare Infant")
    public void I_enter_$_$_N_command_to_Store_fare_Infant(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-N command to Store fare Infant");
            isharesPage4.enter$$NCommandToStoreFareInfant(logInfo);
            logInfo.pass("I enter $-$-N command to Store fare Infant");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$-N1 to Display Stored Fare Workfile")
    public void I_enter_$_$_N1_to_display_stored_afre_workfile(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-N1 to Display Stored Fare Workfile");
            isharesPage4.enter$$N1ToDisplayStoredfareWorkfile(logInfo);
            logInfo.pass("I enter $-$-N1 to Display Stored Fare Workfile");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *FW1_FOP command")
    public void I_enter_FW1_FOP_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FW1_FOP command");
            isharesPage4.enterFWFOPCommand(logInfo);
            logInfo.pass("I enter *FW1_FOP command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *FQ_FOP Request for Full Display of Fare Quote")
    public void I_enter_FQ_FOP_request_for_full_display_of_Fare_quote(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FQ_FOP Request for Full Display of Fare Quote");
            isharesPage4.enterFQFOPRequestForFullDisplayOfFareQuote(logInfo);
            logInfo.pass("I enter *FQ_FOP Request for Full Display of Fare Quote");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-CMV Run Vertical Seat Map")
    public void I_enter_6_CMV_Run_Vertical_seat_map(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CMV Run Vertical Seat Map");
            isharesPage4.enter6CMVRunTheVerticalSeatmap(logInfo);
            logInfo.pass("I enter 6-CMV Run Vertical Seat Map");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:CQA* Run Error and Advisory Messages")
    public void I_enter_6_CQA_Run_Error_and_Advisory_Message(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CQA* Run Error and Advisory Messages");
            isharesPage4.enter6CQARunErrorAndAdvisoryMessage(logInfo);
            logInfo.pass("I enter 6:CQA* Run Error and Advisory Messages");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LD_|SEC|CI command to display the list")
    public void I_enter_6_LD_Sec_CI_command_to_display_the_list(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SEC|CI command to display the list");
            isharesPage4.enter6LDSECCICommandToDisplayTheList(logInfo);
            logInfo.pass("I enter 6:LD_|SEC|CI command to display the list");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LD_|SB_ to display the list")
    public void I_enter_6_LD_SB_to_display_the_List(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SB_ to display the list");
            isharesPage4.enter6LDSBToDisplayTheList(logInfo);
            logInfo.pass("I enter 6:LD_|SB_ to display the list");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 2@_ command to delete the APIS details")
    public void I_enter_2_command_to_delete_the_APIS_deatils(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2@_ command to delete the APIS details");
            isharesPage4.enter2CommandToDeleteTheAPISDetails(logInfo);
            logInfo.pass("I enter 2@_ command to delete the APIS details");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter W Linata command")
    public void I_enter_W_Linata_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter W Linata command");
            isharesPage4.enterWLinataCommand(logInfo);
            logInfo.pass("I enter W Linata command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter PAT*_Clear to verify the entry")
    public void I_enter_PAT_clear_to_verify_the_entry(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAT*_Clear to verify the entry");
            isharesPage4.enterPATClearToVerifyTheEntry(logInfo);
            logInfo.pass("I enter PAT*_Clear to verify the entry");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter CA Exponent Attribute In Auth Request")
    public void I_enter_CA_exponent_Attribute_In_Auth_Request(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA Exponent Attribute In Auth Request");
            isharesPage4.enterCAExpoenentAttributeInAuthRequest(logInfo);
            logInfo.pass("I enter CA Exponent Attribute In Auth Request");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter CA1234 capability to verify checking")
    public void I_enter_CA1234_Capability_to_verify_checking(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA1234 capability to verify checking");
            isharesPage4.enterCA1234CapabilityToVerifyChecking(logInfo);
            logInfo.pass("I enter CA1234 capability to verify checking");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$CC Auto Credit Validation User")
    public void I_enter_T_$CC_Auto_Credit_Validation_User(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$CC Auto Credit Validation User");
            isharesPage4.enterT$CCAutoCreditValidationUser(logInfo);
            logInfo.pass("I enter T-$CC Auto Credit Validation User");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T_OBD|$|ET Overriding Booking Date process")
    public void I_enter_T_OBD_$_ET_Overriding_Booking_Date_Process(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_OBD|$|ET Overriding Booking Date process");
            isharesPage4.enterTOBD$ETOverridingBookingDateProcess(logInfo);
            logInfo.pass("I enter T_OBD|$|ET Overriding Booking Date process");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Display availability with POS information")
    public void I_display_availability_with_POS_information(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Display availability with POS information");
            isharesPage4.displayAvailiabilityWithPOSInformation(logInfo);
            logInfo.pass("I Display availability with POS information");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ETDOC ETKT receipt display")
    public void I_enter_T_ETDOC_ETKT_Receipt_display(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETDOC ETKT receipt display");
            isharesPage4.enterTETDOCETKTReceiptDisplay(logInfo);
            logInfo.pass("I enter T-ETDOC ETKT receipt display");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T_ETREFUND* for Invalid")
    public void I_eneter_T_ETREFUND_For_Invalid(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_ETREFUND* for Invalid");
            isharesPage4.enterTETREFUNDForInvalid(logInfo);
            logInfo.pass("I enter T_ETREFUND* for Invalid");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 7TAE Cust Receipt Addr")
    public void I_enter_7TAE_Cust_receipt_Addr(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7TAE Cust Receipt Addr");
            isharesPage4.enter7TAECustReceiptAddr(logInfo);
            logInfo.pass("I enter 7TAE Cust Receipt Addr");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T_$|PADT_INF|ET Command")
    public void I_enter_T_$_PADT_INF_ET_command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_$|PADT_INF|ET command");
            isharesPage4.enterT$PADTINFETCommand(logInfo);
            logInfo.pass("I enter T_$|PADT_INF|ET command");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ET1 Print the adjusted flight information")
    public void I_enter_T_ET1_Print_the_adjusted_flight_information(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET1 Print the adjusted flight information");
            isharesPage4.enterTET1PrintTheAdjustedFlightInformation(logInfo);
            logInfo.pass("I enter T-ET1 Print the adjusted flight information");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FC|CCALC extended from pay edit user")
    public void I_enter_Fc_CCALC_Extended_from_pay_edit_user(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FC|CCALC extended from pay edit user");
            isharesPage4.enterFCCCALCExtendedFromPayEditUser(logInfo);
            logInfo.pass("I enter FC|CCALC extended from pay edit user");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Verify 6-OSD entry")
    public void I_enter_6_OSD_Entry(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify 6-OSD entry");
            isharesPage4.verify6OSDEntry(logInfo);
            logInfo.pass("I Verify 6-OSD entry");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-CR Verify flight close entry")
    public void I_enter_6_CR_Verify_flight_close_entry(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CR Verify flight close entry");
            isharesPage4.enter6CRVerifyFlightCloseEntry(logInfo);
            logInfo.pass("I enter 6-CR Verify flight close entry");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 5$CC COMMAND")
    public void I_enter_5$CC_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5$CC command");
            isharesPage4.enter5$CCCommand(logInfo);
            logInfo.pass("I enter 5$CC command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ETDOC1 auditor and all other coupon types {string}")
    public void I_enter_T_ETDOC1_auditor_and_all_other_coupon_types(String number){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETDOC1 auditor and all other coupon types");
            isharesPage4.enterTETDOCAuditorAndAllOtherCouponTypes(logInfo, number);
            logInfo.pass("I enter T-ETDOC1 auditor and all other coupon types");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZDTAP Check Outbound inventory feed")
    public void I_enter_ZDTAP_Check_Outbound_inventory_feed(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZDTAP Check Outbound inventory feed");
            isharesPage4.enterZDTAPCheckOutboundInventoryFeed(logInfo);
            logInfo.pass("I enter ZDTAP Check Outbound inventory feed");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Q*CODESHARE_*AV to Book the PNR with codeshare segment")
    public void I_enter_Q_CODESHARE_AV_to_Book_the_PNR_with_codeshare_segment(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE_*AV to Book the PNR with codeshare segment");
            isharesPage4.enterQCODESHAREAVToBookThePNRWithCodeshare(logInfo);
            logInfo.pass("I enter Q*CODESHARE_*AV to Book the PNR with codeshare segment");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter KR_AVSA_CM*AV Exception Table")
    public void I_enter_KR_AVSA_CM_AV_Exception_table(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR_AVSA_CM*AV Exception Table");
            isharesPage4.enterKRAVSACMAVExceptionTable(logInfo);
            logInfo.pass("I enter KR_AVSA_CM*AV Exception Table");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter KR_AVS_*AV Command")
    public void I_enter_KR_AVS_AV_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR/AVS/*AV command");
            isharesPage4.enterKRAVSAVCommand(logInfo);
            logInfo.pass("I enter KR/AVS/*AV command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter A_date_7A_ {string} command to display availability from {string} to {string}")
    public void iEnterA_date_A_CommandToDisplayAvailabilityFromTo(String cmd, String org, String dest) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A command with 7A and check response");
            isharesPage4.sendA_7A_Command(logInfo,cmd,org,dest);
            logInfo.pass("I enter A command with 7A and check response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter A_date_9A_ {string} command to display availability from {string} to {string}")
    public void iEnterA_date_9A_CommandToDisplayAvailabilityFromTo(String cmd, String org, String dest) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A command with 9A and check response");
            isharesPage4.sendA_9A_Command(logInfo,cmd,org,dest);
            logInfo.pass("I enter A command with 9A and check response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability from {string} to {string} with {string}")
    public void iSearchForFlightAvailabilityFromToWith(String org, String dest, String cmd) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage4.sendA_A_Command(logInfo,cmd,org,dest);
            logInfo.pass("I search for flight availability");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*YSV1_ command verify the {string} for the {string} entry")
    public void iEnterOCMYSV_CommandVerifyTheForTheEntry(String res, String cmd) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*YSV1_ command and check response");
            isharesPage4.sendOCMYSV_Command(logInfo,cmd,res);
            logInfo.pass("I enter OCM*YSV1_ command and check response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LD_|SEC|CI command to display the list of passengers")
    public void iEnterLD_SECCICommandToDisplayTheListOfPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SEC|CI command to display the list of passengers");
            isharesPage4.displaySecCiCommand(logInfo);
            logInfo.pass("I enter 6:LD_|SEC|CI command to display the list of passengers");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter A-1 command to display the availability in the backward level")
    public void iEnterACommandToDisplayTheAvailabilityInTheBackwardLevel() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A1 command to display the availability in the backward level.");
            isharesPage4.enter_A1_ForPreviousFltAvailability(logInfo);
            logInfo.pass("I enter A1 command to display the availability in the backward level.");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability from {string} to {string} at time {string} for entry {string}")
    public void iSearchForFlightAvailabilityFromToAtTimeForEntry(String org, String dest, String time, String cmd) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability with time and entry");
            isharesPage4.srchFlightWithTimeAndCmd(logInfo,org,dest,time,cmd);
            logInfo.pass("I search for flight availability with time and entry");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability for entry {string}")
    public void iSearchForFlightAvailabilityForEntry(String cmd) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for entry");
            isharesPage4.srchFlight_2PK(logInfo, cmd);
            logInfo.pass("I search for flight availability for entry");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability from {string} to {string} at time {string} for entry {string} with {string}")
    public void iSearchForFlightAvailabilityFromToAtTimeForEntryWith(String org, String dest, String time, String cmd, String resp) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability with time and entry");
            isharesPage4.srchFlightAndVerifyResp(logInfo,org,dest,time,cmd,resp);
            logInfo.pass("I search for flight availability with time and entry");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I send M$_ command and verify {string} response")
    public void iSendM$_CommandAndVerifyResponse(String entry) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I send M$_ command and verify response");
            isharesPage4.sendM$_command(logInfo,entry);
            logInfo.pass("I send M$_ command and verify response");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability from {string} to {string} and verify {string}")
    public void iSearchForFlightAvailabilityFromToAndVerify(String org, String dest, String resp) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability");
            isharesPage4.srchHostFlightAndVerifyResp(logInfo,org,dest, resp);
            logInfo.pass("I search for flight availability");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 2CS* command to display the codeshare FLIFO flight number table")
    public void iEnterCSCommandToDisplayTheCodeshareFLIFOFlightNumberTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2CS* command to display the codeshare FLIFO flight number table");
            isharesPage4.displayCodeshareFltNo(logInfo);
            logInfo.pass("I enter 2CS* command to display the codeshare FLIFO flight number table");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 2P_ command for with flight delay {string}")
    public void iEnterP_CommandForWithFlightDelay(String msg) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P_ command for with flight delay");
            isharesPage4.Create_2PCommandWithDelayMsg(logInfo,msg);
            logInfo.pass("I enter 2P_ command for with flight delay");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter A_R command to check redemption flight availability")
    public void iEnterA_RCommandToCheckRedemptionFlightAvailability() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A_R command to check redemption flight availability");
            isharesPage4.checkA_R_RedemptionAvailability(logInfo);
            logInfo.pass("I enter A_R command to check redemption flight availability");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*YSV1 * availability entry")
    public void I_enter_OCM_YSV_availability_entry(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*YSV1 * availability entry");
            isharesPage4.enterOCMYSVAvailabilityEntry(logInfo);
            logInfo.pass("I enter OCM*YSV1 * availability entry");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*YSV1 E command")
    public void I_enter_OCM_YSV_E_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*YSV1 E command");
            isharesPage4.enterOCMYSVECommand(logInfo);
            logInfo.pass("I enter OCM*YSV1 E command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*SEAM S Command")
    public void I_enter_OCM_SEAM_S_command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*SEAM S command");
            isharesPage4.enterOCMSEAMSCommand(logInfo);
            logInfo.pass("I enter OCM*SEAM S command");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter KA command for machine for validation")
    public void I_enter_KA_command_for_machine_for_validation(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KA command for machine for validation");
            isharesPage4.enterKACommandForMachineForValidation(logInfo);
            logInfo.pass("I enter KA command for machine for validation");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZZGLO CM command to display")
    public void I_enter_ZZGLO_CM_command_to_display(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZZGLO CM command to display");
            isharesPage4.enterZZGLOCMCommandToDisplay(logInfo);
            logInfo.pass("I enter ZZGLO CM command to display");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*SEAM connectivity should be established")
    public void I_enter_OCM_SEAM_connectivity_should_be_established(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*SEAM connectivity should be established");
            isharesPage4.enterOCMSEAMConnectivityShouldBeEstabilished(logInfo);
            logInfo.pass("I enter OCM*SEAM connectivity should be established");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*SEAM REF AVS to update and validate with Retail availability systems")
    public void I_enter_OCM_SEAM_REF_AVS_to_update_and_validate_with_retail_availability_system(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*SEAM REF AVS to update and validate with Retail availability systems");
            isharesPage4.enterOCMSEAMREFAVSToUpdateAndValidateWithRetail(logInfo);
            logInfo.pass("I enter OCM*SEAM REF AVS to update and validate with Retail availability systems");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*SEAM REF AVS to update and validate with Retail {string}")
    public void I_enter_OCM_SEAM_REF_AVS_to_update_and_validate_with_retail(String number){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*SEAM REF AVS to update and validate with Retail");
            isharesPage4.enterOCMSEAMREFAVSToUpdateAndValidate(logInfo, number);
            logInfo.pass("I enter OCM*SEAM REF AVS to update and validate with Retail");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*SEAM for Refresh entries")
    public void I_enter_OCM_SEAM_for_Refresh_entries(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*SEAM for Refresh entries");
            isharesPage4.enterOCMSEAMForRefreshEntries(logInfo);
            logInfo.pass("I enter OCM*SEAM for Refresh entries");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Enter LA_RCmd to Verify BestBuy")
    public void enterLA_RCmdtoVerifyBestBuy() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter LA_RCmd to Verify BestBuy");
            isharesPage4.enterLA_RCmdtoVerifyBestBuy(logInfo);
            logInfo.pass("I Enter LA_RCmd to Verify BestBuy");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Enter 6CQAC")
    public void iEnter6CQAC() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter 6CQAC");
            isharesPage4.iEnter6CQAC(logInfo);
            logInfo.pass("I Enter 6CQAC");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6_$PR1|U command to do checkin re-entry with upgrade code for NRSA")
    public void i_enter_6_PR_1_U_command_to_do_checkin_re_entry_upgrade_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_$PR1|U command to do checkin re-entry with upgrade code for NRSA");
            isharesPage4.checkInReentryWithUpgradeforNRSA(logInfo);
            logInfo.pass("I enter 6_$PR1|U command to do checkin re-entry with upgrade code for NRSA");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6ZQPDQSTART Command to Verify PostDeparture")
    public void iEnter6ZQPDQSTARTtoVerifyPostDeparture() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6ZQPDQSTART Command to Verify PostDeparture");
            isharesPage4.iEnter6ZQPDQSTARTtoVerifyPostDeparture(logInfo);
            logInfo.pass("I enter 6ZQPDQSTART Command to Verify PostDeparture");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Queue command to verify the entries validation")
    public void I_enter_Queue_command_to_verify_Entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Queue command to verify the entries");
            isharesPage4.IenterQueuecommandtoverifytheentriesValidation(logInfo);
            logInfo.pass("I enter Queue command to verify the entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter QC_ and Q_ command to Count a pnr Queue")
    public void I_enter_QC_Q_Command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I enter QC command to Count a pnr Queue");
            isharesPage4.enter_QC_Q_Command(logInfo);
//            System.out.println(" I enter QC command to Count a pnr Queue");
            logInfo.pass(" I enter QC command to Count a pnr Queue");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LQR command to remove from queue entries of PNRs")
    public void I_enter_LQR_Command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LQR command to remove from queue entries of PNRs");
            isharesPage4.enter_LQR_Command(logInfo);
            logInfo.pass("I enter LQR command to remove from queue entries of PNRs");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter GMM_ command to Move Categories with Automatic Pushdown and Renumbered with specific indexes{string}{string}")
    public void iEnterGMO_CommandToMovecategoriesWithAutomaticPushdownAndRenumberedWithSpecificIndexes(String Index1, String Index2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter GMM_ command to Move categories with Automatic Pushdown and Renumbered with specific indexes{string}{string}");
            isharesPage4.MoveCategoryAutomatic_Pushdown_And_Renumber(logInfo, Index1, Index2);
            logInfo.pass("I enter GMM_ command to Move categories with Automatic Pushdown and Renumbered with specific indexes{string}{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C:C1_ command to change the amount")
    public void iEnterCC2CommandToChangeTheAmount() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:C1_ command to change the amount");
            isharesPage4.changeTheAmountWithCC(logInfo);
            logInfo.pass("I enter C:C1_ command to change the amount");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C:C_ and C-C_ commands to Clear Entry entries in ACO")
    public void I_Enter_CC_Commands_To_Clear_Entry_Entries_In_ACO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:C_ and C-C_ commands to Clear Entry entries in ACO");
            isharesPage4.Enter_CC_Commands_To_Clear_Entry_Entries_In_ACO(logInfo);
            logInfo.pass("I enter C:C_ and C-C_ commands to Clear Entry entries in ACO");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C:DD command to display the TAR details")
    public void iEnterC_DDommandToDisplayTheTARDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:DD command to display the TAR details");
            isharesPage4.EnterC_DDommandToDisplayTheTARDetails(logInfo);
            logInfo.pass("I enter C:DD command to display the TAR details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:DU_ command to validate Segment status")
    public void iEnter6DUCommandToValidateSegmentStatus() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DU_ command to validate Segment status");
            isharesPage4.Enter6DUCommandToValidateSegmentStatus(logInfo);
            logInfo.pass("I enter 6:DU_ command to validate Segment status");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 0CM_NN_ command to book Segment")
    public void iEnter0CM_NN_Command_To_Book_Segment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0CM_NN_ command to book Segment");
            isharesPage4.Enter0CM_NN_CommandToBookSegment(logInfo);
            logInfo.pass("I enter 0CM_NN_ command to book Segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter .1RR and .2XK command to cancel class of service for the segment")
    public void iEnter_1RR_2XK_command_To_Cancel_ClassOfService_For_Segment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter .1RR and .2XK command to cancel class of service for the segment");
            isharesPage4.Enter_1RR_2XK_command_To_Cancel_ClassOfService_For_Segment(logInfo);
            logInfo.pass("I enter .1RR and .2XK command to cancel class of service for the segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C:BAL command to entry to balance TAR")
    public void iEnterC_BAL_Command_To_Entry_To_Balance_TAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:BAL command to entry to balance TAR");
            isharesPage4.Enter_CBAL_Command_To_Entry_To_Balance_TAR(logInfo);
            logInfo.pass("I enter C:BAL command to entry to balance TAR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C_RAC_ command to display Payment Codes or Sort Codes")
    public void iEnterC_RAC_Command_To_Display_PaymentCodes_Or_SortCodes() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C_RAC_ command to display Payment Codes or Sort Codes");
            isharesPage4.EnterC_RAC_Command_To_Display_PaymentCodes_Or_SortCodes(logInfo);
            logInfo.pass("I enter C_RAC_ command to display Payment Codes or Sort Codes");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 5_ commands for the Address Verification")
    public void I_Enter_5_Command_For_The_Address_Verification() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5_ commands for the Address Verification");
            isharesPage4.Enter_5_Command_For_The_Address_Verification(logInfo);
            logInfo.pass("I enter 5_ commands for the Address Verification");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C:A_ command for Even PTA Exchanges")
    public void I_EnterCA_Command_For_Even_PTA_Exchanges() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A_ command for Even PTA Exchanges");
            isharesPage4.EnterCA_Command_For_Even_PTA_Exchanges(logInfo);
            logInfo.pass("I enter C:A_ command for Even PTA Exchanges");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C:A_ for agent CheckOut Entries executed for collection")
    public void I_EnterCA_Command_For_Agent_CheckOut_Entries_Executed_For_Collection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A_ for agent CheckOut Entries executed for collection");
            isharesPage4.agentCheckOutEntriesExecutedForCollection(logInfo);
            logInfo.pass("I enter C:A_ for agent CheckOut Entries executed for collection");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *ET1_CS command to display shows operating flights")
    public void I_Enter_ET1_CS_Command_To_Display_Shows_Operating_Flights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET1/CS command to display shows operating flights");
            isharesPage4.Enter_ET1_CS_Command_To_Display_Shows_Operating_Flights(logInfo);
            logInfo.pass("I enter *ET1/CS command to display shows operating flights");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6P#ER command to save and retrive the PNR")
    public void I_Enter_6PER_Command_TO_Save_And_Retrive() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6P#ER command to save and retrive the PNR");
            isharesPage4.Enter_6PER_Command_TO_Save_And_Retrive(logInfo);
            logInfo.pass("I enter 6P#ER command to save and retrive the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *ET1 command to display first passenger segments details")
    public void I_Enter_ET1_Command_To_Display_First_Passenger_Segments_Details() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET1 command to display first passenger segments details");
            isharesPage4.enter_ET1_command(logInfo);
            logInfo.pass("I enter *ET1 command to display first passenger segments details");
            System.out.println("I enter *ET1 command to display first passenger segments details");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET1.1 command to display first passenger segments coupon details")
    public void I_Enter_ET1_1_Command_To_Display_First_Passenger_Segments_coupon_Details() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET1.1 command to display first passenger segments details");
            isharesPage4.enter_ET1_1_command(logInfo);
            logInfo.pass("I enter *ET1.1 command to display first passenger segments details");
            System.out.println("I enter *ET1.1 command to display first passenger segments details");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter manual fare quote command for cash payment")
    public void I_Enter_Manual_Fare_Quote_Command_For_Cash_Payment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter manual fare quote command for cash payment");
            isharesPage4.enterCommandToManualFareQuoteForCashPayment(logInfo);
            logInfo.pass("I enter manual fare quote command for cash payment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EH1 command to display the first Pax ETKT history")
    public void I_Enter_EH1_Command_To_Display_First_Pax_Etkt_History() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH1 command to display the first Pax ETKT history");
            isharesPage4.Enter_EH1_Command_To_Display_First_Pax_Etkt_History(logInfo);
            logInfo.pass("I enter *EH1 command to display the first Pax ETKT history");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter X commands to delete {string} segment")
    public void i_Enter_X_Commands_To_Delete_Segments(String SegmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X commands to delete segments" + SegmentIndex);
            isharesPage4.deletetheSpecificSegment(logInfo, SegmentIndex);
            logInfo.pass("I enter X commands to delete segments " + SegmentIndex);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the coupon status of OA {string} flight through shares")
    public void I_change_the_coupon_status_of_OA_flight_through_shares(String OAcarrier) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the coupon status of OA flight through shares");
            isharesPage4.changeCouponStatusOfOAFltThroughShares(logInfo,OAcarrier);
            logInfo.pass("I change the coupon status of OA flight through shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET- command to display the ETKT history for specific ticket number")
    public void iEnterETCommandToDisplayTheETKTHistoryForSpecificTicketNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET- command to display the ETKT history for specific ticket number");
            isharesPage4.ETCommandtoDisplayETKTHistoryForSpecificTicketNumber(logInfo);
            logInfo.pass("I enter *ET- command to display the ETKT history for specific ticket number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter display the higher cabin seatmap {string}")
    public void iEnterHigherCabinSeatmap(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter display the higher cabin seatmap");
            isharesPage4.iEnterDisplaytTheHigherCabinSeatmap(logInfo, COS);
            logInfo.pass("I enter display the higher cabin seatmap");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-CQA_ command for boarding pass printer")
    public void iEnterCQA_CommandForBoardingPassPrinter() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CQA_ command for boarding pass printer");
            isharesPage4.CQA_commandForboardingPassPrinter(logInfo);
            logInfo.pass("I enter 6-CQA_ command for boarding pass printer");
        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);
        }
    }

    @And("I enter XI command to Cancel the Itinerary for All passengers")
    public void iEnterXICommandToCancelTheItineraryForAllPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter XI command to Cancel the Itinerary for All passengers");
            isharesPage4.commandToCancelItineraryForAll(logInfo);
            logInfo.pass("I enter XI command to Cancel the Itinerary for All passengers");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I collect APIS for all surname passenger")
    public void iCollectAPISForAllSurnamePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I collect APIS for all surname passenger");
            isharesPage4.displayAPISGenerationForSurname(logInfo);
            logInfo.pass("I collect APIS for all surname passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZH command to display PNIS for All passengers")
    public void iEnterZHCommandToDisplayPNISForAllassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH command to display PNIS for All passengers");
            isharesPage4.displayPNISForAllPassengers(logInfo);
            logInfo.pass("I enter 6:ZH command to display PNIS for All passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD command to check pax list")
    public void iEnterLDCommandToCheckPaxList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to check pax list");
            isharesPage4.command_to_check_pax_list(logInfo);
            logInfo.pass("I enter 6:LD command to check pax list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-$EE_ command to run even exhange with cash")
    public void iEnterT$EE_CommandToRunEvenExhange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EE_ command to run even exhange with cash");
            isharesPage4.T_$EE_CommandRunEvenExchange(logInfo);
            logInfo.pass("I enter T-$EE_ command to run even exhange with cash");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FM command")
    public void i_Enter_FM_Command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FM command");
            isharesPage4.Enter_FM_Command(logInfo);
            logInfo.pass("I enter FM command");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FI_ commands to refund ticket")
    public void I_Enter_FI_Commands_To_Refund_Ticket() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FI_ commands to refund ticket");
            isharesPage4.Enter_FI_Commands(logInfo);
            logInfo.pass("I enter FI_ commands to refund ticket");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ETCKPRICE and T-$EE_ command to reissue ticket with even exchange")
    public void I_Enter_T_ETCKPRICE_And_T_$EE_Command_To_Reissue_Ticket_With_EvenExchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETCKPRICE and T-$EE_ command to reissue ticket with even exchange");
            isharesPage4.evenExchange_ReIssue_Ticket(logInfo);
            logInfo.pass("I enter T-ETCKPRICE and T-$EE_ command to reissue ticket with even exchange");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to ticketing using stored fare data")
    public void i_Enter_Command_To_Ticketing_Using_Stored_Fare_Data() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to ticketing using stored fare data");
            isharesPage4.Enter_Command_To_Ticketing_Using_Stored_Fare_Data(logInfo);
            logInfo.pass("I enter command to ticketing using stored fare data");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to use different paymentModes for ticketing")
    public void i_Enter_Command_To_Do_Different_PaymentModes_For_Ticketing() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to use different paymentModes for ticketing");
            isharesPage4.Enter_Command_To_Do_Different_PaymentModes_For_Ticketing(logInfo);
            logInfo.pass("I enter command to use different paymentModes for ticketing");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter S$_ and A$_ commands for the Fare request with options after Schedule")
    public void i_Enter_S$_And_A$_Commands_For_Fare_Request() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter S$_ and A$_ commands for the Fare request with options after Schedule");
            isharesPage4.Enter_S$_And_A$_Commands_For_Fare_Request(logInfo);
            logInfo.pass("I enter S$_ and A$_ commands for the Fare request with options after Schedule");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_HMLA F1 command to verify the input output device items already in table")
    public void iEnterT_HMLA_F1_Command_To_Verify_The_Items_Already_In_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T/HMLA F1 command to verify the input output device items already in table");
            isharesPage4.EnterT_HMLA_F1_Command_To_Verify_The_Items_Already_In_Table(logInfo);
            logInfo.pass("I enter T/HMLA F1 command to verify the input output device items already in table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter T_HMTR _REMOVE command to delete the input output device LNIATA item in the table")
    public void iEnter_T_TR_REMOVE_Command_To_Delete_The_LNIATA_In_The_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T/HMTR _/REMOVE command to delete the input output device LNIATA item in the table");
            isharesPage4.Enter_T_TR_REMOVE_Command_To_Delete_The_LNIATA_In_The_Table(logInfo);
            logInfo.pass("I enter T/HMTR _/REMOVE command to delete the input output device LNIATA item in the table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter T_HMDT command to display input output devices in the table")
    public void iEnterT_HMDT_Command_To_Display_Input_Output_Device_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T/HMDT command to display input output devices in the table");
            isharesPage4.EnterT_HMDT_Command_To_Display_Input_Output_Device_Table(logInfo);
            logInfo.pass("I enter T/HMDT command to display input output devices in the table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 5_ command to add address")
    public void iEnter_5Address_Command_To_Add_Address() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5_ command to add address");
            isharesPage4.Enter_5Address_Command_To_Add_Address(logInfo);
            logInfo.pass("I enter 5_ command to add address");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 9_N000 command to add fop")
    public void iEnter_9_N000_Command_To_Add_fop() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9_N000 command to add fop");
            isharesPage4.createAndAddFOP(logInfo);
            logInfo.pass("I enter 9_N000 command to add fop");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter auto fare quote command to file fate quote")
    public void iEnter_AutoFareQuote_To_FileFareQuote()
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter auto fare quote command to file fate quote");
            isharesPage4.Enter_AutoFareQuote_To_FileFareQuote(logInfo);
            logInfo.pass("I enter auto fare quote command to file fate quote");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_N1_1_CASH_ET command to pay by cash")
    public void i_enter_T_N1_1_CASH_ET_command_to_pay_by_Cash() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-N1.1#$CASH#ET command to pay by cash");
            System.out.println("I enter command to pay by Cash");
            isharesPage4.Enter_T_N1_1_CASH_ET_Command_To_payByCash(logInfo);
            logInfo.pass("I enter T-N1.1#$CASH#ET command to pay by cash");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T_N2_1_$_ET command for tickting")
    public void i_Enter_T_N2_1_$_ET_Command_To_payment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-N2.1#$#ET command for tickting");
            System.out.println("I enter T-N2.1#$#ET command for tickting");
            isharesPage4.Enter_T_N2_1_$_ET_Command_To_payment(logInfo);
            logInfo.pass("I enter T-N2.1#$#ET command for tickting");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T_AT_$CASH_ET command to full or partial cash payment")
    public void i_enter_T_AT_$CASH_ET_command_to_pay_by_Cash() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-AT#$CASH#ET command to full or partial cash payment");
            System.out.println("I enter command T-AT#$CASH#ET to pay by Cash");
            isharesPage4.Enter_T_AT_$CASH_ET_Command_To_payByCash(logInfo);
            logInfo.pass("I enter T-AT#$CASH#ET command to full or partial cash payment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PAA* command to display APIS timmer trigger table with agent code {string}")
    public void Enter_APIStimmertriggertable(String agency) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA* command to display APIS timmer trigger table with agent code "+agency);
            isharesPage4.APIStimmertriggertable(logInfo,agency);
            logInfo.pass("I enter PAA* command to display APIS timmer trigger table with agent code "+agency);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to check Global_Auxiliary_Entries")
    public void Enter_Global_Auxiliary_Entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check Global_Auxiliary_Entries");
            isharesPage4.Global_Auxiliary_Entries(logInfo);
            logInfo.pass("I enter command to check Global_Auxiliary_Entries");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I have done auto fare quote for specified segments {string} and {string}")
    public void Enter_APIStimmertriggertable(String seg1,String seg2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done auto fare quote for specified segments " +seg1 + "and "+ seg2);
            isharesPage4.autofarequoteforspecifiedsegments(logInfo,seg1,seg2);
            logInfo.pass("I have done auto fare quote for specified segments " +seg1 + "and "+ seg2);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter LP$ command for Segment selection {string} and {string}")
    public void Enter_Segmentselection(String seg1,String seg2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LP$ command for Segment selection " +seg1 + "and "+ seg2);
            isharesPage4.Segmentselection(logInfo,seg1,seg2);
            logInfo.pass("I enter LP$ command for Segment selection " +seg1 + "and "+ seg2);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter LA$R command with rebook option")
    public void Enter_RebookOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$R command with rebook option");
            isharesPage4.RebookOption(logInfo);
            logInfo.pass("I enter LA$R command with rebook option");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter {string} to retrieve the PNR")
    public void Enter_PNRwithIndex(String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter "+index + " to retrieve the PNR");
            isharesPage4.PNRwithIndex(logInfo,index);
            logInfo.pass("I enter "+index + " to retrieve the PNR");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter *ET_ command for checking ETKT in CRS")
    public void Enter_ETKTinCRS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_ command for checking ETKT in CRS");
            isharesPage4.ETKTinCRS(logInfo);
            logInfo.pass("I enter *ET_ command for checking ETKT in CRS");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter command to check baggage allowance")
    public void Enter_BaggageAllowance() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check baggage allowance");
            isharesPage4.BaggageAllowance(logInfo);
            logInfo.pass("I enter command to check baggage allowance");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I run the CM FProgress Messages with GMT SHARES entries")
    public void enter_FProgressMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the CM FProgress Messages with GMT SHARES entries");
            isharesPage4.FProgressMessages(logInfo);
            logInfo.pass("I I run the CM FProgress Messages with GMT SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter commands to perform flight Closure and Flight history entries")
    public void enter_performFlightClosureFlightHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter commands to perform flight Closure and Flight history entries");
            isharesPage4.performFlightClosureFlightHistory(logInfo);
            logInfo.pass("I enter commands to perform flight Closure and Flight history entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-APIS manifest command")
    public void enter_displayAPISGeneration() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-APIS manifest command");
            isharesPage4.displayAPISGeneration(logInfo);
            logInfo.pass("I enter 6-APIS manifest command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter commands to perform Flight history entries")
    public void enter_performFlightHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter commands to perform Flight history entries");
            isharesPage4.performFlightHistory(logInfo);
            logInfo.pass("I enter commands to perform Flight history entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter JA command to Display {string} passenger using {string} or {string}")
    public void enter_JA_displayPassengerusingSSN(String validType, String SSN, String Name) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter JA command to Display passenger using SSN");
            isharesPage4.enterJA_displayPassengerusingSSN(logInfo, validType,SSN, Name);
            logInfo.pass("I enter JA command to Display passenger using SSN");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability between {string} {string} with {string} for {string}")
    public void search_flightavailability(String origin, String destination, String params, String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter JA command to Display passenger using SSN");
            isharesPage4.search_flightavailability(logInfo, origin,destination, params, flight);
            logInfo.pass("I enter JA command to Display passenger using SSN");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LA_R command to do best buy fare quote by forced pricing for {string}")
    public void iEnterLA_RCommandForBestBuybyType(String bestbuyType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA_R command to do best buy fare quote by forced pricing");
            System.out.println("I enter LA_R command to do best buy fare quote by forced pricing");
            isharesPage4.enterLA_RCmdForBestBuybyType(logInfo, bestbuyType);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET command to display ETKT Baggage rules by ticket number")
    public void display_baggagerulesbyTicketnumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET command to display ETKT Baggage rules by ticket number");
            isharesPage4.baggage_rules_display_byTicketnumber(logInfo);
            logInfo.pass("I enter *ET command to display ETKT Baggage rules by ticket number");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LA$R command to get the best buy fare quote for specific segments {string}")
    public void iEnterLA$R_CommandToGetTheBestBuyFareQuoteForTheSegments(String segments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$R|P_ command to get the best buy fare quote for the passengers for specific segments");
            isharesPage4.bestBuyForSpecificSegmentswithoutPassenger(logInfo, segments);
            logInfo.pass("I enter LA$R|P_ command to get the best buy fare quote for the passengers for specific segments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET FOP for displaying coupon of ticket")
    public void I_enter_commands_for_displaying_coupon_of_ticket_fop() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for displaying coupon of ticket");
            isharesPage4.enterET1ForETKTUpdatesFOP(logInfo);
            logInfo.pass("I enter command for displaying coupon of ticket");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *FX command to cancel the quote {string}")
    public void enter_FX_cancelthequote(String farequoteIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FX command to cancel the quote");
            isharesPage4.enterFX_cancelthequote(logInfo, farequoteIndex);
            logInfo.pass("I enter *FX command to cancel the quote");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FM command for cancel fare quote all open segment")
    public void enter_FM_cancelfarequote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Price using segment selection and open segment");
            isharesPage4.enterFM_cancelfarequote(logInfo);
            logInfo.pass("I enter command for Price using segment selection and open segment");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify TEDA DRS entries")
    public void enter_verifyTEDADRSentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for the agent to signed into ACO system");
            isharesPage4.enterverifyTEDADRSentries(logInfo);
            logInfo.pass("I enter command for the agent to signed into ACO system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter MKD command {string}")
    public void iEnterMKDCommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKD command "+Entry);
            isharesPage4.enterMKDCommand(logInfo,Entry);
            logInfo.pass("I enter MKD command "+Entry);

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I change the paxtype {string} {string}")
    public void iChangeThePaxtype(String TotalPax, String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the paxtype "+Entry);
            isharesPage4.changeThePaxtype(logInfo,TotalPax,Entry);
            logInfo.pass("I change the paxtype "+Entry);

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 5_ text to add to queue")
    public void iEnter_TextToAddToQueue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5_ text to add to queue");
            isharesPage4.enter_TextToAddToQueue(logInfo);
            logInfo.pass("I enter 5_ text to add to queue");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add data to Queue {string} and type of display {string}")
    public void iAddDataToQueueAndTypeOfDisplay(String Queue, String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add data to Queue "+Queue + " " + Entry);
            isharesPage4.addDataToQueueAndTypeOfDisplay(logInfo,Queue,Entry);
            logInfo.pass("I add data to Queue "+Queue + " " + Entry);
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BPA_ command to create employee profile records")
    public void iEnterBPA_CommandToCreateEmployeeProfileRecords() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BPA_ command to create employee profile records");
            isharesPage4.enterBPA_CommandToCreateEmployeeProfileRecords(logInfo);
            logInfo.pass("I enter BPA_ command to create employee profile records");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VG multiple ABS Retrieve Deal commands and validated valid response")
    public void iEnterMultipleABSRetrieveDealCommandsAndValidatedValidResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter multiple ABS Retrieve Deal commands and validated valid response");
            isharesPage4.multipleABSCmd(logInfo);
            logInfo.pass("I enter multiple ABS Retrieve Deal commands and validated valid response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV* security {string}")
    public void iEnterMVSecurity(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV* security "+Entry);
            isharesPage4.enterMVSecurity(logInfo,Entry);
            logInfo.pass("I enter MV* security "+Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter * to display passenger details")
    public void iEnterToDisplayPassengerDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter * to display passenger details");
            isharesPage4.enterToDisplayPassengerDetails(logInfo);
            logInfo.pass("I enter * to display passenger details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_R command {string}")
    public void iEnterT_RCommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_R command " +Entry );
            isharesPage4.enterT_RCommand(logInfo,Entry);
            logInfo.pass("I enter T_R command "+Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BIGX command to add bagtag {string}")
    public void iEnterBIGXCommandToAddBagtag(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BIGX command to add bagtag " +Entry );
            isharesPage4.enterBIGXCommandToAddBagtag(logInfo,Entry);
            logInfo.pass("I enter BIGX command to add bagtag "+Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:BTAG_|OA command to display all the bag tag numbers")
    public void i_enter_6_BTAG_ALL_command_to_display_all_the_bag_tag_numbers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:BTAG_|OA command to display all the bag tag numbers");
            isharesPage4.displayBagTagNumbers(logInfo);
            logInfo.pass("I enter 6:BTAG_|OA command to display all the bag tag numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-TL command to run baggage tag flight display {string}")
    public void iEnterTLCommandToRunBaggageTagFlightDisplay(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-TL command to run baggage tag flight display " +Entry);
            isharesPage4.enterTLCommandToRunBaggageTagFlightDisplay(logInfo,Entry);
            logInfo.pass("I enter 6-TL command to run baggage tag flight display " + Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN commands to modify entry {string}")
    public void iEnterKNCommandsToModifyEntry(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN commands to modify entry " +Entry);
            isharesPage4.enterKNCommandsToModifyEntry(logInfo,Entry);
            logInfo.pass("I enter KN commands to modify entry " + Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of Shares PNR for origin city {string} for pax {string}")
    public void iDoTheCheckinOfSharesPNRForOriginCityForPax(String CheckinType, String TotalPax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of Shares PNR for origin city " +TotalPax);
            isharesPage4.doTheCheckinOfSharesPNRForOriginCityForPax(logInfo,CheckinType,TotalPax);
            logInfo.pass("I do the checkin of Shares PNR for origin city " + TotalPax);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZH_ command to check boarding zone in G variable item")
    public void iEnterZH_CommandToCheckBoardingZoneInGVariableItem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to check boarding zone in G variable item" );
            isharesPage4.enterZH_CommandToCheckBoardingZoneInGVariableItem(logInfo);
            logInfo.pass("I enter 6:ZH_ command to check boarding zone in G variable item");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter passenger details with same surname for inf")
    public void I_enter_passenger_details_for_same_surname_pax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details with same surname for inf");
            isharesPage4.enterPassengerDetailsForSameSurnamePaxInf(logInfo);
            System.out.println("I enter passenger details with same surname");
            logInfo.pass("I enter passenger details with same surname");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change pax to INF {string}")
    public void iChangePaxToINF(String PaxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change pax to INF "+PaxIndex);
            isharesPage4.changePaxToINF(logInfo,PaxIndex);
            logInfo.pass("I change pax to INF "+PaxIndex);


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter G command to display system access monitor {string}")
    public void iEnterGCommandToDisplaySystemAccessMonitor(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change pax to INF "+Entry);
            isharesPage4.enterGCommandToDisplaySystemAccessMonitor(logInfo,Entry);
            logInfo.pass("I change pax to INF "+Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T* command to run time initiated RO transfer {string}")
    public void iEnterTCommandToRunTimeInitatedROTransfer(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T* command to run time initiated RO transfer "+Entry);
            isharesPage4.enterTCommandToRunTimeInitatedROTransfer(logInfo,Entry);
            logInfo.pass("I enter T* command to run time initiated RO transfer "+Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KSIMO command to add partner to outbound SSM table {string}")
    public void iEnterKSIMOCommandToAddPartnerToOutboundSSMTable(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KSIMO command to add partner to outbound SSM table "+Entry);
            isharesPage4.enterKSIMOCommandToAddPartnerToOutboundSSMTable(logInfo,Entry);
            logInfo.pass("I enter KSIMO command to add partner to outbound SSM table "+Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter XHX command to delete segments")
    public void iEnterXHXCommandToDeleteSegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter XHX command to delete segments ");
            isharesPage4.enterXHXCommandToDeleteSegments(logInfo);
            logInfo.pass("I enter XHX command to delete segments ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter PITP_ commands to perform table display with invalid parameters and validate the error")
    public void iEnterPITP_CommandsToPerformTableDisplayWithInvalidParametersAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PITP_ commands to perform table display with invalid parameters and validate the error");
            isharesPage4.tableDisplayWithInvalidParametersAndValidateError(logInfo);
            logInfo.pass("I enter PITP_ commands to perform table display with invalid parameters and validate the error");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }


    @And("I enter PAV_ commands to modify entries with invalid parameters and validate the error")
    public void iEnterPAV_CommandsToModifyEntriesWithInvalidParametersAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAV_ commands to modify entries with invalid parameters and validate the error");
            isharesPage4.modifyEntriesWithInvalidParametersAndValidateTheError(logInfo);
            logInfo.pass("I enter PAV_ commands to modify entries with invalid parameters and validate the error");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:OSS_ command to manually generate the IATA PFS messages")
    public void iEnterOSS_CommandToManuallyGenerateTheIATAPFSMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:OSS_ command to manually generate the IATA PFS messages");
            isharesPage4.manuallyGenerateIATAPFSMessage(logInfo);
            logInfo.pass("I enter 6:OSS_ command to manually generate the IATA PFS messages");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter KB_ commands to add function errors or advisory messages entries and validate the error")
    public void iEnterKB_CommandsToAddFunctionErrorsOrAdvisoryMessagesEntriesAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KB_ commands to add function errors or advisory messages entries and validate the error");
            isharesPage4.addFunctionErrorsOrAdvisoryMessagesEntriesAndValidateTheError(logInfo);
            logInfo.pass("I enter KB_ commands to add function errors or advisory messages entries and validate the error");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:LTM_@ command to modify the message for one passenger")
    public void iEnterLTM_CommandToModifyTheMessageForOnePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LTM_@ command to modify the message for one passenger");
            isharesPage4.modifyTheMessageForOnePassenger(logInfo);
            logInfo.pass("I enter 6:LTM_@ command to modify the message for one passenger");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:LTM_|_@ command to delete the message for one passenger")
    public void iEnterLTM__CommandToDeleteTheMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LTM_|_@ command to delete the message for one passenger");
            isharesPage4.deleteTheMessageForOnePassenger(logInfo);
            logInfo.pass("I enter 6:LTM_|_@ command to delete the message for one passenger");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:TM_ command to add a message {string} to the PNR")
    public void iEnterTM_CommandToAddAMessageToThePNR(String message) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM_ command to add a message to the PNR");
            isharesPage4.addMessage(logInfo, message);
            logInfo.pass("I enter 6:TM_ command to add a message to the PNR");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:R@DV command to perform checkin re-entry with status change")
    public void iEnterRDVCommandToPerformCheckinReEntryWithStatusChange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:R@DV command to perform checkin re-entry with status change");
            isharesPage4.performCheckinReEntryWithStatusChange(logInfo);
            logInfo.pass("I enter 6:R@DV command to perform checkin re-entry with status change");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I perform checkin for waitlist passenger and validate the multiple items error and enter 6:LDP_ command to perform diplomat checkin")
    public void iPerformCheckinForWaitlistPassengerAndValidateTheMultipleItemsErrorAndPerformDiplomatCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform checkin for waitlist passenger and validate the multiple items error and enter 6:LDP_ command to perform diplomat checkin");
            isharesPage4.performWaitlistCheckinValidateMultipleItemsAndPerformDiplomatCheckin(logInfo);
            logInfo.pass("I perform checkin for waitlist passenger and validate the multiple items error and enter 6:LDP_ command to perform diplomat checkin");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:LSF_ command to perform multi initial checkin of two PNRs to get multiple items and then do checkin successfully for forced selectee pax")
    public void iEnterLSF_CommandToPerformMultiInitialCheckinOfTwoPNRsToGetMultipleItemsAndThenDoCheckinSuccessfullyForForcedSelecteePax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform multi initial checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for forced selectee pax");
            isharesPage4.multiInitialCheckinOfTwoPNRsWithMultipleItemsErrorForForcedSelecteePax(logInfo);
            logInfo.pass("I perform multi initial checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for forced selectee pax");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:LD_|CRW command to display the list of crew passengers")
    public void iEnterLD_CRWCommandToDisplayTheListOfCrewPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|CRW command to display the list of crew passengers");
            isharesPage4.displayListOfCrewPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|CRW command to display the list of crew passengers");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I change the names of the passengers in a multi initial passenger PNR with three passengers")
    public void iChangeTheNamesOfThePassengersInAMultiInitialPassengerPNRWithThreePassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the names of the passengers in a multi initial passenger PNR with three passengers");
            isharesPage4.changeNamesOfPassengersInMultiInitialPNRWithThreePax(logInfo);
            logInfo.pass("I change the names of the passengers in a multi initial passenger PNR with three passengers");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:LDP_ command to perform multi initial checkin of two PNRs to get multiple items and then do checkin successfully for diplomat pax")
    public void iEnterLDP_CommandToPerformMultiInitialCheckinOfTwoPNRsToGetMultipleItemsAndThenDoCheckinSuccessfullyForDiplomatPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform multi initial checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for diplomat pax");
            isharesPage4.multiInitialCheckinOfTwoPNRsWithMultipleItemsErrorForDiplomatPax(logInfo);
            logInfo.pass("I perform multi initial checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for diplomat pax");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:ZH command to display PNIS for multi initial passengers giving multiple items response")
    public void iEnterZHCommandToDisplayPNISForMultiInitialPassengersGivingMultipleItemsResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH command to display PNIS for multi initial passengers giving multiple items response");
            isharesPage4.displayPNISForMultiInitialPaxGivingMultipleItems(logInfo);
            logInfo.pass("I enter 6:ZH command to display PNIS for multi initial passengers giving multiple items response");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:DV_ and 6:LDV_ command to perform voluntary denied boarding passengers after checkin for exclusive option for multi initial passengers")
    public void iEnterDV_AndLDV_CommandToPerformVoluntaryDeniedBoardingPassengersAfterCheckinForExclusiveOptionForMultiInitialPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV_ command to perform voluntary denied boarding passengers for exclusive option");
            isharesPage4.voluntaryDeniedBoardingPassengersForExclusiveOptionForMultiInitialPax(logInfo);
            logInfo.pass("I enter 6:DV_ command to perform voluntary denied boarding passengers for exclusive option");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LK_ command to perform multi initial checkin of two PNRs to get multiple items and then do checkin successfully")
    public void iEnterLK_CommandToPerformMultiInitialCheckinOfTwoPNRsToGetMultipleItemsAndThenDoCheckinSuccessfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform multi initial checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully");
            isharesPage4.multiInitialCheckinOfTwoPNRsWithMultipleItemsError(logInfo);
            logInfo.pass("I perform multi initial checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I do checkin for multi initial passengers PNR with baggage for checkin type {string}")
    public void iDoCheckinForMultiInitialPassengersPNRWithBaggageForCheckinType(String checkinType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for multi initial passengers PNR with baggage for checkin type");
            isharesPage4.sharesCheckinTypesForMultiInitialPax(logInfo, checkinType);
            logInfo.pass("I do checkin for multi initial passengers PNR with baggage for checkin type");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LDV_ command to add volunteer status after checkin for multi initial passenger")
    public void iEnterLDV_CommandToAddVolunteerStatusAfterCheckinForMultiInitialPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LDV_ command to add volunteer status after checkin for multi initial passenger");
            isharesPage4.addVolunteerStatusAfterCheckinForMultiInitialPax(logInfo);
            logInfo.pass("I enter 6:LDV_ command to add volunteer status after checkin for multi initial passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LDVR_ command to remove volunteer status after checkin for multi initial passenger")
    public void iEnterLDVR_CommandToRemoveVolunteerStatusAfterCheckinForMultiInitialPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LDVR_ command to remove volunteer status after checkin for multi initial passenger");
            isharesPage4.removeVolunteerStatusAfterCheckinForMultiInitialPax(logInfo);
            logInfo.pass("I enter 6:LDVR_ command to remove volunteer status after checkin for multi initial passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DV_ and 6:LDV_ command to perform voluntary denied boarding passengers for two PNRs with same details")
    public void iEnterDV_AndLDV_CommandToPerformVoluntaryDeniedBoardingPassengersForTwoPNRsWithSameDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "6:DV_ and 6:LDV_ command to perform voluntary denied boarding passengers for two PNRs with same details");
            isharesPage4.performVolunteerDeniedBoardingPassengersForTwoPNRs(logInfo);
            logInfo.pass("I enter 6:DV_ and 6:LDV_ command to perform voluntary denied boarding passengers for two PNRs with same details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DV.DI_ command to change the pax status from HKN to VOL for multi initial passengers")
    public void iEnterDVDI_CommandToChangeThePaxStatusFromHKNToVOLforMultiInitialPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV.DI_ command to change the pax status from HKN to VOL for multi initial passengers");
            isharesPage4.changePaxStatusFromHKNToVOLForMultiInitialPassengers(logInfo);
            logInfo.pass("I enter 6:DV.DI_ command to change the pax status from HKN to VOL for multi initial passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DI.DV_ command to change the pax status from VOL to HKN for Multi initial")
    public void iEnterDIDV_CommandToChangeThePaxStatusFromVOLToHKN_Multi() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DI.DV_ command to change the pax status from VOL to HKN for Multi initial");
            isharesPage4.changePaxStatusFromVOLToHKN_MultiInitial(logInfo);
            logInfo.pass("I enter 6:DI.DV_ command to change the pax status from VOL to HKN for Multi initial");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DI.DV_ and 6:LDI.DV_ command to perform involuntary denied boarding passengers after checkin process")
    public void iEnterDIDV_AndLDIDV_CommandToPerformInvoluntaryDeniedBoardingPassengersAfterCheckinProcess() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DI.DV_ and 6:LDI.DV_ command to perform involuntary denied boarding passengers after checkin process");
            isharesPage4.enterDIDVAndLDIDVCmdToPerformInvoluntaryDeniedBoardingPax(logInfo);
            logInfo.pass("I enter 6:DI.DV_ and 6:LDI.DV_ command to perform involuntary denied boarding passengers after checkin process");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A_@|_ command to change a specific seat of a segment")
    public void iEnterA__CommandToChangeASpecificSeatOfASegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_@|_ command to change a specific seat of a segment");
            isharesPage4.changeASpecificSeatOfASegment(logInfo);
            logInfo.pass("I enter 6:A_@|_ command to change a specific seat of a segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LK_ command to perform checkin of two PNRs to get multiple items and do checkin successfully for waitlist pax")
    public void iEnterLK_CommandToPerformCheckinOfTwoPNRsToGetMultipleItemsAndDoCheckinSuccessfullyForWaitlistPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for waitlist pax");
            isharesPage4.checkinOfTwoPNRsWithMultipleItemsErrorForWaitlistPax(logInfo);
            logInfo.pass("I perform checkin of two PNRs with same segment details to get multiple items error and then do checkin successfully for waitlist pax");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter recheckin entry to perform checkin with a seat and baggage")
    public void iEnterRecheckinEntryToPerformCheckinWithASeatAndBaggage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter recheckin entry to perform checkin with a seat and baggage");
            isharesPage4.checkinWithSpecificSeatAndBaggage(logInfo);
            logInfo.pass("I enter recheckin entry to perform checkin with a seat and baggage");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:OSS_ command to initiate IATA outbound message")
    public void iEnterOSS_CommandToInitiateIATAOutboundMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:OSS_ command to initiate IATA outbound message");
            isharesPage4.ToInitiateIATAOutboundMessage(logInfo);
            logInfo.pass("I enter 6:OSS_ command to initiate IATA outbound message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I perform adding one Manual bag Tag number to verify error message with different entry{string}")
    public void iPerformAddingOneManualBagTagNumberToVerifyErrorMessageWithDifferentEntry(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform adding one Manual bag Tag number to verify error message with different entry");
            isharesPage4.VerifyErrorMessageWithDifferentEntryForAddingManualTag(logInfo,Entry);
            logInfo.pass("I perform adding one Manual bag Tag number to verify error message with different entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to add KL FQTV number{string}")
    public void iEnterCommandToAddKLFQTVNumber(String FQTVnum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 1@_ command to add KL FQTV number");
            isharesPage4.ToAddKLFQTVNumber(logInfo,FQTVnum);
            logInfo.pass("I enter 1@_ command to add KL FQTV number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *AP Command")
    public void iEnterAPCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *AP command");
            isharesPage4.EnterAPCommand(logInfo);
            logInfo.pass("I enter *AP command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 2CS*_ command to display CodeShare flight numbers in table")
    public void iEnterCS_CommandToDisplayCodeShareFlightNumbersInTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2CS*_ command to display CodeShare flight numbers in table");

            isharesPage4.ToDisplayCodeShareFlightNumbers(logInfo);
            logInfo.pass("I enter 2CS*_ command to display CodeShare flight numbers in table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-ET_ command to adjust or modify the ticket{string}")
    public void iEnterTET_CommandToAdjustOrModifyTheTicket(String SegmentSeq) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_ command adjust or modify the ticket");

            isharesPage4.ToAdjustOrModifyTheTicket(logInfo,SegmentSeq);
            logInfo.pass("I enter T-ET_ command adjust or modify the ticket");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter $-$_ command to display fare quote{string}")
    public void iEnter$$_CommandToDisplayFareQuote(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$_ command to display fare quote");
            isharesPage4.ToDisplayFareQuoteWithDifferentEntry(logInfo,Entry);
            logInfo.pass("I enter $-$_ command to display fare quote");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I add Interline bagtag")
    public void iAddInterlineBagtag() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Interline bagtag");
            isharesPage4.ToAddInterlineBagTag(logInfo);
            logInfo.pass("I add Interline bagtag");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter 6-TESTBAG_ command to print Bagtag{string}")
    public void iEnterTESTBAG_CommandToPrintBagtag(String Bagtag) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-TESTBAG_ command to print Bagtag");
            isharesPage4.ToPrintSpecifiedBagTag(logInfo,Bagtag);
            logInfo.pass("I enter 6-TESTBAG_ command to print Bagtag");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter command to allow positive rule parameter for pricing{string}")
    public void iEnterCommandToAllowPositiveRuleParameterForPricing(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to allow positive rule parameter for pricing");
            isharesPage4.ToAllowPositiveRuleParameterForPricing(logInfo,Entry);
            logInfo.pass("I enter command to allow positive rule parameter for pricing");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter command to allow negative discount amount option for pricing{string}")
    public void iEnterCommandToAllowNegativeDiscountAmountOptionForPricing(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to allow negative discount amount option for pricing");
            isharesPage4.ToAllowNegativeDiscountAmountOptionForPricing(logInfo,Entry);
            logInfo.pass("I enter command to allow negative discount amount option for pricing");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-$EI_ command to do baggage allowage in irregular exchange user")
    public void iEnterT$EI_CommandToDoBaggageAllowageInIrregularExchangeUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EI_ command to do baggage allowage in irregular exchange user");
            isharesPage4.ToDoBaggageAllowageInIrregularExchangeUser(logInfo);
            logInfo.pass("I enter T-$EI_ command to do baggage allowage in irregular exchange user");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-$EIR_ command to do irregular exchange")
    public void iEnterT$EIR_CommandToDoIrregularExchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EIR_ command to do irregular exchange user");
            isharesPage4.EnterT$EIR(logInfo);
            logInfo.pass("I enter T-$EIR_ command to do irregular exchange");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-$  payment using Visa Debit {string} and {string}")
    public void I_enter_T_$_payment_Using_Visaa_Debit(String cardNumber, String expiryDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$  payment using Visa Debit");
            isharesPage4.enterT$PaymentUsingVisaDebit(logInfo, cardNumber,  expiryDate);
            logInfo.pass("I enter T-$  payment using Visa Debit");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter to check for Redemption FAF availability from {string} to {string} for {string} with {string} and {string}")
    public void I_enter_to_check_for_redemption_FAF_availability(String OriginCity, String Destination, String redemption, String withDate, String formatType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter to check for Redemption FAF availability");
            isharesPage4.forRedemptionFAFAvailability(logInfo, OriginCity, Destination,redemption, withDate, formatType);
            logInfo.pass("I enter to check for Redemption FAF availability");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify Format Outbound Messages")
    public void enter_command_verify_FormatOutboundMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify Format Outbound Messages");
            isharesPage4.entercommand_verifyFormatOutboundMessages(logInfo);
            logInfo.pass("I enter command to verify Format Outbound Messages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FC Run the International Sales Indicator Entry SHARES")
    public void I_enter_fc_run_the_international_sales_indicator_entry_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS5828 Run the International Sales Indicator Entry SHARES");
            isharesPage4.RunTheInternationalSalesIndicatorEntryShares(logInfo);
            logInfo.pass("I enter Run the International Sales Indicator Entry Shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter PNBI command with {string}")
    public void iEnterPNBICommand(String param) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBI command" );
            isharesPage4.enterPNBICommand(logInfo, param);
            logInfo.pass("I enter PNBI command");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter JF command to verify FQTV number {string} for airlines {string}")
    public void enter_JF_FQPassengerbyAirlines(String FFNumber, String airlines) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid frequent flyer passenger");
            isharesPage4.verify_FQTVPassengerbyAirlines(logInfo, FFNumber, airlines);
            logInfo.pass("I enter invalid frequent flyer passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter PIRQL command to verify PNL message")
    public void enter_PIRQL_verifyPNLmessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIRQL command to verify PNL message");
            isharesPage4.enterPIRQL_verifyPNLmessage(logInfo);
            logInfo.pass("I enter PIRQL command to verify PNL message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command for Price auxiliary OPEN segments")
    public void enter_PriceauxiliaryOPENsegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Price auxiliary OPEN segments");
            isharesPage4.enterPriceauxiliaryOPENsegments(logInfo);
            logInfo.pass("I enter command for Price auxiliary OPEN segments");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$-FP1 command")
    public void I_enter_$_$_FP1_command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-FP1 command");
            isharesPage4.enter$$FP1Command(logInfo);
            logInfo.pass("I enter $-$-FP1 command");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ETDOC COMMAND")
    public void I_enter_T_ETDOC_command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETDOC command");
            isharesPage4.enterTETDOCCommand(logInfo);
            logInfo.pass("I enter T-ETDOC command");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$CC cardholders of certain employee-owned UATP numbers")
    public void I_enter_T_$CC_cardholders_of_certain_employee_owmned_UATP_number(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$CC cardholders of certain employee-owned UATP numbers");
            isharesPage4.enterT$CCCardholdersOfCertainEmployeeOwnedUATPNumber(logInfo);
            logInfo.pass("I enter T-$CC cardholders of certain employee-owned UATP numbers");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter CA command to Valid discover card user")
    public void I_enter_CA_command_to_valid_discover_card_user(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA command to Valid discover card user");
            isharesPage4.enterCACommandToValidDiscoverCardUser(logInfo);
            logInfo.pass("I enter CA command to Valid discover card user");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter residency requirements for proper taxation")
    public void I_enter_residency_requirements_for_proper_taxation(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter residency requirements for proper taxation");
            isharesPage4.enterResidencyRequirementsForProperTaxation(logInfo);
            logInfo.pass("I enter residency requirements for proper taxation");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Q*CODESHARE Display Codeshare Table and select the flight")
    public void I_enter_QCODESHARE_display_codeshare_Table_and_select_the_flight(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE Display Codeshare Table and select the flight");
            isharesPage4.enterQCODESHAREDisplayCodeshareTableAndSelectTheFlight(logInfo);
            logInfo.pass("I enter Q*CODESHARE Display Codeshare Table and select the flight");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$CMTU work for reward pricing users")
    public void I_enter_T_$CMTU_work_for_reward_pricing_users(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$CMTU work for reward pricing users");
            isharesPage4.enterT$CMTUWorkForRewardsPricingUsers(logInfo);
            logInfo.pass("I enter T-$CMTU work for reward pricing users");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*IMY0 to Run the IMY capture")
    public void I_enter_OCM_IMY0_to_Run_the_IMY_capture(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*IMY0 to Run the IMY capture");
            isharesPage4.enterOCMIMY0ToRunTheIMYCapture(logInfo);
            logInfo.pass("I enter OCM*IMY0 to Run the IMY capture");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*IMY0 capture when SC is running")
    public void I_enter_OCM_IMY0_capture_when_SC_is_running(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*IMY0 capture when SC is running");
            isharesPage4.enterOCMIMY0CaptureWhenSCIsRunning(logInfo);
            logInfo.pass("I enter OCM*IMY0 capture when SC is running");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-L-YAAAOY1F|$ override the system chosen fare")
    public void I_enter_T_L_YAAAOY1F_$_override_the_system_chosen_fare(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-L-YAAAOY1F|$ override the system chosen fare");
            isharesPage4.enterTLYAAAOY1F$OverrideTheSystemChosenFare(logInfo);
            logInfo.pass("I enter T-L-YAAAOY1F|$ override the system chosen fare");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$-PIIT Command")
    public void I_enter_$_$PIIT_command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-PIIT command");
            isharesPage4.enter$$PIITCommand(logInfo);
            logInfo.pass("I enter $-$-PIIT command");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-LD command to check AIS files")
    public void I_enter_6_LD_command_to_check_AIS_files(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-LD command to check AIS files");
            isharesPage4.enter6LDCommandToCheckAISFiles(logInfo);
            logInfo.pass("I enter 6-LD command to check AIS files");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZUGLO CM ** command it will process one by one")
    public void I_enter_ZUGLO_CM_command_it_will_process_one_by_one(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZUGLO CM ** command it will process one by one");
            isharesPage4.enterZUGLOCMCommandItWillProcessOneByOne(logInfo);
            logInfo.pass("I enter ZUGLO CM ** command it will process one by one");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter X1 to replace")
    public void I_enter_X1_to_Replace(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X1 to replace");
            isharesPage4.enterX1ToReplace(logInfo);
            logInfo.pass("I enter X1 to replace");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$EI to OVERLAY FARE BASIS WITH LITERAL INVOL FOR IRR EXCHANGE")
    public void I_enter_T_$EI_to_Overlay_Fare_Basis_with_literal_Invol_for_Irr_exchange(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EI to OVERLAY FARE BASIS WITH LITERAL INVOL FOR IRR EXCHANGE");
            isharesPage4.enterT$EIToOverlayFareBasisWithLiteralInvolFotIrrExchange(logInfo);
            logInfo.pass("I enter T-$EI to OVERLAY FARE BASIS WITH LITERAL INVOL FOR IRR EXCHANGE");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter CA as discover card transactions for proper routing")
    public void I_enter_CA_as_discover_card_transactions_for_proper_routing(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA as discover card transactions for proper routing");
            isharesPage4.enterCAAsDiscoverCardTransactionsForProperRouting(logInfo);
            logInfo.pass("I enter CA as discover card transactions for proper routing");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$CK CAPTURE USER")
    public void I_enter_T_$CK_Capture_User(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$CK CAPTURE USER");
            isharesPage4.enterT$CKCaptureUser(logInfo);
            logInfo.pass("I enter T-$CK CAPTURE USER");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *EV command Irregular exchange")
    public void I_enter_EV_command_Irregular_exchange(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EV command Irregular exchange");
            isharesPage4.enterEVCommandIrregularExchange(logInfo);
            logInfo.pass("I enter *EV command Irregular exchange");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter G* command to Display action code entries")
    public void iEnterG_CommandToDisplayActionCodeEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter G* command to Display action code entries");
            isharesPage4.displayG_ActionCodeEntries(logInfo);
            logInfo.pass("I enter G* command to Display action code entries");
            System.out.println("I enter G* command to Display action code entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-PIIT|$|ET command for SHC")
    public void I_enter_T_PIIT_$_ET_command_for_SHC(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-PIIT|$|ET command for SHC");
            isharesPage4.enterTPIIT$ETCommand(logInfo);
            logInfo.pass("I enter T-PIIT|$|ET command for SHC");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LA_R command to Display best buy fare quote")
    public void iEnterLA_RcommandToDisplayBestBuyFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA_R command to Display best buy fare quote");
            isharesPage4.displayBestBuyFareQuote(logInfo);
            logInfo.pass("I enter LA_R command to Display best buy fare quote");
            System.out.println("I enter LA_R command to Display best buy fare quote");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Cancel the flight")
    public void iEnterCommandToCancelTheFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Cancel the flight");
            isharesPage4.cancelFlight(logInfo);
            logInfo.pass("I enter command to Cancel the flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to process credit card approval code and expiry date with error message")
    public void iEnterCommandToProcessCreditCard() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to process credit card approval code and expiry date with error message");
            isharesPage4.processCC_codeAndDateForError(logInfo);
            logInfo.pass("I enter command to process credit card approval code and expiry date with error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to display incoming Baggage Allowance Text with error message for {string}")
    public void iEnterCommandTodisplayIncomingBaggageAllowanceText(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "display incoming Baggage Allowance Text with error message");
            isharesPage4.displayBaggageAllowanceText(logInfo, Entry);
            logInfo.pass("display incoming Baggage Allowance Text with error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to display Branded fares for {string}")
    public void iEnterCommandTodisplayBrandedFares(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display Branded fares for "+Entry);
            isharesPage4.displayBrandedFares(logInfo, Entry);
            logInfo.pass("I enter command to display Branded fares for "+Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to display SSR reject queue control table")
    public void iEnterCommandTodisplaySSRrejectQueueControlTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display SSR reject queue control table");
            isharesPage4.displaySSRrejectQueueControlTable(logInfo);
            logInfo.pass("I enter command to display SSR reject queue control table");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Display Pseudo City Conversion Table")
    public void iDisplayPseudoCityConversionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Display Pseudo City Conversion Table");
            isharesPage4.displayPseudo_CityConversionTable(logInfo);
            logInfo.pass("I Display Pseudo City Conversion Table");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to capture IMY status")
    public void iEnterCommandToCaptureIMY_status() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to capture IMY status");
            isharesPage4.captureIMY_Status(logInfo);
            logInfo.pass("I enter command to capture IMY status");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to display management control record user for {string}")
    public void iEnterCommandToDisplayManageentControlRecordUser(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display management control record user");
            isharesPage4.displayManageentControlRecordUser(logInfo, Entry);
            logInfo.pass("I enter command to display management control record user");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to get control of the ticket for segment {string} and pax {string}")
    public void iEnterCommandToGetControlOfTheTicketForSegment(String segment, String pax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to get control of the ticket for segment "+segment+ "and pax "+pax);
            isharesPage4.getControlOfTheTicket(logInfo, segment, pax);
            logInfo.pass("I enter command to get control of the ticket for segment "+segment+"and pax "+pax);

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to push control of the ticket for segment {string} and pax {string} and airline {string}")
    public void iEnterCommandToPushControlOfTheTicketForSegment(String segment, String pax, String airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to push control of the ticket for segment "+segment+ "and pax "+pax+"and airline "+airline);
            isharesPage4.pushControlOfTheTicket(logInfo, segment, pax,airline);
            logInfo.pass("I enter command to push control of the ticket for segment "+segment+"and pax "+pax+"and airline "+airline);

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to display fare with V option")
    public void iEnterCommandToDisplayfareWithV_Option() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display fare with V option");
            isharesPage4.displayFareWithV_Option(logInfo);
            logInfo.pass("I enter command to display fare with V option");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command for card acceptor info enhancement user")
    public void iEnterCommandForCardAcceptorInfoEnhancementUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for card acceptor info enhancement user");
            isharesPage4.cardAcceptorInfoEnhancementUser(logInfo);
            logInfo.pass("I enter command for card acceptor info enhancement user");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command for Amex mandatory tokenization changes with error for expiry date {string}")
    public void iEnterCommandForAmexMandatoryTokenizationChanges(String expiryDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Amex mandatory tokenization changes with error for expiry date");
            isharesPage4.amexMandatoryTokenizationChanges(logInfo, expiryDate);
            logInfo.pass("I enter command for Amex mandatory tokenization changes with error for expiry date");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to display batching record entry")
    public void iEnterCommandToDisplayBatchingRecordEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display batching record entry");
            isharesPage4.displayBatchingRecordEntry(logInfo);
            logInfo.pass("I enter command to display batching record entry");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I add the alphanum code in the blacklist Lniata authorization table")
    public void iAddTheAlphanumCodeInTheBlacklistLniataAuthorizationTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the alphanum code in the blacklist Lniata authorization table");
            isharesPage4.addAlphanumCodeInBlacklist(logInfo);
            logInfo.pass("I add the alphanum code in the blacklist Lniata authorization table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I display Reward Availability entry for OA from {string} to {string}")
    public void iDisplayRewardAvailabilityEntryForOAFrom(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display Reward Availability entry for OA from");
            isharesPage4.displayRewardAvailabilityForOA_Entry(logInfo, origin, destination);
            logInfo.pass("I display Reward Availability entry for OA from");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter invalid FQTV passenger with {string}, {string} and {string}")
    public void iEnterInvalidFQTVpassengerWith(String fName, String lName, String FFNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid FQTV passenger");
            isharesPage4.enterInvalidFQTV_Passenger(logInfo, fName, lName,FFNo);
            logInfo.pass("I enter invalid FQTV passenger");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to print the passenger receipt document")
    public void iEnterCommandToPrintThePassengerReceiptDocument() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to print the passenger receipt document");
            isharesPage4.paxReceiptPrint(logInfo);
            logInfo.pass("I enter command to print the passenger receipt document");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to bulk ticket PNR by Cash")
    public void iEnterCommandToBulkTicketPNRByCash() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to bulk ticket PNR by Cash");
            isharesPage4.bulkTicketPNRByCash(logInfo);
            logInfo.pass("I enter command to bulk ticket PNR by Cash");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to even exchange bulk ticket to Non Bulk Reissue")
    public void iEnterCommandToEvenExchageBulkTicketToNonBulkReissue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to even exchange bulk ticket to Non Bulk Reissue");
            isharesPage4.evenExchangebulkTicketToNonBulkReissue(logInfo);
            logInfo.pass("I enter command to even exchange bulk ticket to Non Bulk Reissue");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to modify segment status to printed for the segment {string}")
    public void iEnterCommandToModifySegmentStatusToPrintedForTheSegment(String Segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to modify segment status to printed for the segment");
            isharesPage4.modifySegmentStatusToPrinted(logInfo, Segment);
            logInfo.pass("I enter command to modify segment status to printed for the segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter EO command to display ETKT indexing with FQTV number")
    public void iEnterEOCommandToDisplayEtktIndexingWithFqtvSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter EO command to display ETKT indexing with FQTV number");
            isharesPage4.displayEtktIndexingWithFQTV(logInfo);
            logInfo.pass("I enter EO command to display ETKT indexing with FQTV number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *EV command to display ETKT Records")
    public void iEnterEVCommandToDisplayEtktRecords() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EV command to display ETKT Records");
            isharesPage4.displayEtktRecords(logInfo);
            logInfo.pass("I enter *EV command to display ETKT Records");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to get the point of sale information from Pricing Remarks for {string}")
    public void iEnterCommandToGetThePointOfSaleInformationFromPricingRemarksFor(String POS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to get the point of sale information from Pricing Remarks for "+POS);
            isharesPage4.getPOSInfoFromPricingRemarks(logInfo, POS);
            logInfo.pass("I enter command to get the point of sale information from Pricing Remarks for "+POS);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to add AMEX FOP")
    public void iEnterCommandToAddAmexFOP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add AMEX FOP");
            isharesPage4.addAMEX_FOP(logInfo);
            logInfo.pass("I enter command to add AMEX FOP");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter CAAV command for internal address verification messages created by end-transaction")
    public void iEnter_CAAV_CommandForInternalAddressVerificationMessagesCreatedByEndTransaction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CAAV command for internal address verification messages created by end-transaction");
            isharesPage4.enter_CAAV_ForAdressVerification(logInfo);
            logInfo.pass("I enter CAAV command for internal address verification messages created by end-transaction");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify Amex to ACF payment process user for card {string} and expiry date {string}")
    public void iEnterCommandToVerifyAmexToACFpaymentProcessUser(String cardNo, String expiryDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify Amex to ACF payment process user");
            isharesPage4.amexToACFpaymentProcessUser(logInfo, cardNo, expiryDate);
            logInfo.pass("I enter command to verify Amex to ACF payment process user");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability for multiple  segments")
    public void iSearchForFlightAvailabilityForMultipleSegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for multiple  segments");
            isharesPage4.srchFlightMultiSeg(logInfo);
            logInfo.pass("I search for flight availability for multiple  segments");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 2P_ with {string} and {string}")
    public void iEnterP_WithAnd(String cmd, String msg) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command with Message");
            isharesPage4.Create_2P_CmdWithMessage(logInfo,cmd,msg);
            logInfo.pass("I enter 2P command with Message");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter MS* command to display details")
    public void iEnterMSCommandToDisplayDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MS* command to display details");
            isharesPage4.sendCommand_MS(logInfo);
            logInfo.pass("I enter MS* command to display details");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *FQ1_BAG command after doing fare quote")
    public void iEnterFQBAGCommandAfterDoingFareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FQ1_BAG command after doing fare quote");
            isharesPage4.enterFQ1_Bag_CommandAfterFareQuote(logInfo);
            logInfo.pass("I enter *FQ1_BAG command after doing fare quote");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I rebook the segment {string} with the new {string} class of service")
    public void iRebookTheSegmentWithTheNewClassOfService(String segment, String cos) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook the segment with new COS");
            isharesPage4.rebookSegmentWithNewCOS(logInfo,segment,cos);
            logInfo.pass("I rebook the segment with new COS");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter invalid frequent flyer passenger with name {string}")
    public void iEnterInvalidFrequentFlyerPassengerWithName(String fqtvname) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid frequent flyer passenger with name");
            isharesPage4.enterInvalid_FQPassengerName(logInfo,fqtvname);
            logInfo.pass("I enter invalid frequent flyer passenger with name");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter JA command to display using invalid {string} name")
    public void iEnterJACommandToDisplayUsingInvalidName(String fqtvname) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter JA command to display using invalid fqtv name");
            isharesPage4.displayJA_InvalidSocialSecurityName(logInfo,fqtvname);
            logInfo.pass("I enter JA command to display using invalid fqtv name");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter BSIB_ command to signin")
    public void i_Retrieve_PNR_Validate_The_Text() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSIB_ command to signin");
            isharesPage4.enterBSIB_CommandToAgentSignIn(logInfo);
            logInfo.pass("I enter BSIB_ command to signin");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$_ command to verify credit card details in Etkt transaction status")
    public void i_Enter_T_$_Command_To_Verify_Transaction_Status() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$_ command to verify credit card details in Etkt transaction status");
            isharesPage4.Enter_T_$_Command_To_Verify_Transaction_Status(logInfo);
            logInfo.pass("I enter T-$_ command to verify credit card details in Etkt transaction status");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I retrieve the pnr and validate the given text {string} exist for payment {string}")
    public void i_Retrieve_PNR_Validate_The_Text(String PNRInfo, String PaymentType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the pnr and validate the given text exist");
            isharesPage4.validate_PNR_Data(logInfo,PNRInfo,PaymentType);
            logInfo.pass("I retrieve the pnr and validate the given text exist");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T_FOPR_ command to remove the payment item in table")
    public void i_Enter_T_FOPR_Command_To_Remove_The_Payment_Item_In_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_FOPR_ command to remove the payment item in table");
            isharesPage4.Enter_T_FOPR_Command_To_Remove_The_Payment_Item_In_Table(logInfo);
            logInfo.pass("I enter T_FOPR_ command to remove the payment item in table");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T_FOPA_ command to add the payment item in table")
    public void i_Enter_T_FOPA_Command_To_Add_The_Payment_Item_In_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_FOPA_ command to add the payment item in table");
            isharesPage4.Enter_T_FOPA_Command_To_Add_The_Payment_Item_In_Table(logInfo);
            logInfo.pass("I enter T_FOPA_ command to add the payment item in table");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$EI_ET command to Adjust ETKT Coupon via 2 to 1 Irregular Exchange Reaccommodation")
    public void i_Enter_T_$EI_ET_Command_To_Adjust_2_1_Irregular_Exchange_Reaccommodation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EI_ET command to Adjust ETKT Coupon via 2 to 1 Irregular Exchange Reaccommodation");
            isharesPage4.Enter_T_$EI_ET_Command_To_Adjust_2_1_Irregular_Exchange_Reaccommodation(logInfo);
            logInfo.pass("I enter T-$EI_ET command to Adjust ETKT Coupon via 2 to 1 Irregular Exchange Reaccommodation");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$EIZ_ET command to Adjust 1 to 1 Irregular Exchange")
    public void i_Enter_T_$EIZ_ET_Command_To_Adjust_1_1_Irregular_Exchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EIZ_ET command to Adjust 1 to 1 Irregular Exchange");
            isharesPage4.Enter_T_$EIZ_ET_Command_To_Adjust_1_1_Irregular_Exchange(logInfo);
            logInfo.pass("I enter T-$EIZ_ET command to Adjust 1 to 1 Irregular Exchange");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I make reissue with uneven exchange")
    public void i_Make_Reissue_With_Uneven_Exchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make reissue with uneven exchange");
            isharesPage4.unEvenExchangewithVisaCreditCard(logInfo);
            logInfo.pass("I make reissue with uneven exchange");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter BE command for signing in")
    public void i_Enter_BE_Command_For_Signing_In() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BE command for signing in");
            isharesPage4.Enter_BE_Command_For_Signing_In(logInfo);
            logInfo.pass("I enter BE command for signing in");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9_N_ command to add origin fop")
    public void i_Enter_9_N_Command_To_Add_Origin_FOP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9_N_ command to add origin fop");
            isharesPage4.AddOriginFOP(logInfo);
            logInfo.pass("I enter 9_N_ command to add origin fop");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6S command to save the transaction")
    public void i_Enter_6S_Command_To_Save_The_Transaction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6S command to save the transaction");
            isharesPage4.Enter_6S_Command_To_Save_The_Transaction(logInfo);
            logInfo.pass("I enter 6S command to save the transaction");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6 command to verify error message for code share flights")
    public void i_Enter_6_Command_Verify_Error_Message_For_Code_Share_Flights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6 command to verify error message for code share flights");
            isharesPage4.enter_6command_verify_errormessage_for_code_share_flights(logInfo);
            logInfo.pass("I enter 6 command to verify error message for code share flights");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 7T command for the ticketing command and validate error message")
    public void i_enter_7T_command_for_the_ticketing_command_validate_Error_Message() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7T command for the ticketing command and validate error message");
            isharesPage4.saveGivenDetailsAndValidateMessage(logInfo);
            logInfo.pass("I enter 7T command for the ticketing command and validate error message");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:GV_ command to verify error messages for multi passenger voluntary upgrade change of the class of service to {string}")
    public void iEnterGV_CommandToVerifyErrorMessagesForMultiPassengerVoluntaryUpgradeChangeOfTheClassOfServiceTo(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:GV_ command to verify error messages for multi passenger voluntary upgrade change of the class of service");
            isharesPage4.VerifyErrorMessagesForMultiPassengerVoluntaryUpgrade(logInfo, COS);
            logInfo.pass("I enter 6:GV_ command to verify error messages for multi passenger voluntary upgrade change of the class of service");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:BF command to validate invalid boarding pass {string}")
    public void iEnterBFCommandToValidateInvalidBoardingPass( String ErrorType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:BF command to validate invalid boarding pass");
            isharesPage4.enterBFCommandToValidateErrorMessage(logInfo, ErrorType);
            logInfo.pass("I enter 6:BF command to validate invalid boarding pass");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-ZA command to activate Reconcile")
    public void iEnter_ZACommandToActivateReconcile() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_ZA command to activate Reconcile");
            isharesPage4.enter6ZAUseractivateReconcile(logInfo);
            logInfo.pass("I enter 6_ZA command to activate Reconcile");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:* command to verify the seats allocation after checkin")
    public void iCommandToVerifyTheSeatsAllocationAfterCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:* command to verify the seats allocation after checkin");
            isharesPage4.enter6VerifyTheSeatAllocation(logInfo);
            logInfo.pass("I enter 6:* command to verify the seats allocation after checkin");
        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set SU duty code")
    public void iSetSUDutyCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set SU duty code");
            isharesPage4.setSuDutyCode(logInfo);
            logInfo.pass("I set SU duty code");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter passenger name with numeric value and validate the error message")
    public void iEnterPassengerNameWithNumericValueAndValidateTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger name with numeric value and validate the error message");
            isharesPage4.enterPassengerNameWithNumericValue(logInfo);
            logInfo.pass("I enter passenger name with numeric value and validate the error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter C:DLAST command  Display Detail of Specific Sequence Number")
    public void iEnterCDLASTCommandDisplayDetailOfSpecificSequenceNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:DLAST command  Display Detail of Specific Sequence Number");
            isharesPage4.CDLASTCommandDisplayDetailOfSpecificSequenceNumber(logInfo);
            logInfo.pass("I enter C:DLAST command  Display Detail of Specific Sequence Number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $-$-{string} command to run price for the specific segment")
    public void iEnter$$CommandToRunPriceForTheSpecificSegment(String segments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-S"+segments+" command to run price for the specific segments");
            isharesPage4.RunPriceForTheSpecificSegment(logInfo, segments);
            logInfo.pass("I enter $-$-"+segments+" command to run price for the specific segments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I have done payment after fare quoting for the {string}")
    public void iHaveDonePaymentAfterFareQuoting(String PaymentType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done payment after fare quoting");
            isharesPage4.PaymentAfterFareQuoting(logInfo, PaymentType);
            logInfo.pass("I have done payment after fare quoting");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *E{string} command to display Unflown segments")
    public void iEnterECommandToDisplayUnflownSegments(String command) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I entered the command *E"+command);
            isharesPage4.ECommandToDisplayUnflownSegments(logInfo, command);
            logInfo.pass("I entered the command *E"+command);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I Verify SequenceNumber from Display")
    public void iVerifySequenceNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify SequenceNumber from Display");
            isharesPage4.iVerifySequenceNumber(logInfo);
            logInfo.pass("I Verify SequenceNumber from Display");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Verify Run the Item Identification  inRequest for lowest Available Fare")
    public void IVerifyRuntheItemIdentificationinRequestforlowestAvailableFare() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify Run the Item Identification  inRequest for lowest Available Fare");
            isharesPage4.IVerifyRuntheItemIdentificationinRequestforlowestAvailableFare(logInfo);
            logInfo.pass("I Verify Run the Item Identification  inRequest for lowest Available Fare");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter shares login with InValid UserID and Valid Password")
    public void i_enter_shares_login_with_InValid_UserID_and_Valid_Password() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("When"), "I enter shares login with InValid UserID and Valid Password");
            isharesPage4.sharesloginWithInValidUserAndValidPassword(logInfo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
        System.out.println("User logged in with valid credentials..");
    }

    @And("I enter Run PNR itinerary changes SHARES entries executed successfully for specific segments {string}")
    public void I_enter_Run_PNR_itinerary_changes_SHARES_entries(String seq) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run PNR itinerary changes SHARES entries executed successfully");
            isharesPage4.runPNRItineraryChangesSharesEntriesForSpecificSegements(logInfo,seq);
            logInfo.pass("I enter Run PNR itinerary changes SHARES entries for segment : " +seq);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I make adjust on ETKT coupon for segment {string}")
    public void  i_make_adjust_on_ETKT_coupon_for_segment(String SegmentSeqNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make adjust on ETKT coupon for Segment : " + SegmentSeqNum);
            isharesPage4.adjustSegment(logInfo,SegmentSeqNum);
            logInfo.pass("I make adjust on ETKT coupon " + SegmentSeqNum);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Contact Button")
    public void iClickOnContactButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Contact button");
            isharesPage4.iClickContactButton(logInfo);
            logInfo.pass("I successfully clicked Contact button");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I click on Help Button")
    public void iClickOnHelpButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Help button");
            isharesPage4.iClickHelpButton(logInfo);
            logInfo.pass("I successfully clicked on Help button");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Change Password Button")
    public void iClickOnChangePasswordButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Change Password button");
            isharesPage4.iClickChangePasswordButton(logInfo);
            logInfo.pass("I successfully clicked Change Password button");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I click on i shares Administrator")
    public void iClickOnISharesAdministrator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on i-SHARES Administrator");
            isharesPage4.clickISharesAdministrator(logInfo);
            logInfo.pass("I successfully clicked on i-SHARES Administrator");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I verify the header fields present on the i-shares Administrator page")
    public void IVerifyTheHeaderFieldsPresentOnTheISharesAdministratorPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the header fields present on the i-shares Administrator page");
            isharesPage4.headerFieldsPresentInAdministratorPage(logInfo);
            logInfo.pass("I verify the header fields present on the i-shares Administrator page");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I verify the section present on the i-shares Administrator page")
    public void IVerifySectionPresentOnTheISharesAdministratorPage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the the section present on the i-shares Administrator page");
            isharesPage4.sectionPresentInAdministratorPage(logInfo);
            logInfo.pass("I verify the section present on the i-shares Administrator page");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I Verify Run Get the control from the partner on Image ETKT {string}")
    public void IVerifyRunGetthecontrolfromthepartneronImageETKT(String AirLine) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify Run Get the control from the partner on Image ETKT " + AirLine);
            isharesPage4.IVerifyRunGetthecontrolfromthepartneronImageETKT(logInfo, AirLine);
            logInfo.pass("I Verify Run Get the control from the partner on Image ETKT " + AirLine);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I print the boarding pass for all the passengers for {string} error Message")
    public void iPrintTheBoardingPassForAllThePassengersForErrorMessage(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I print the boarding pass for all the passengers for error Message");
            isharesPage4.verifyBoardingPass_Error(logInfo,entry);
            logInfo.pass("I print the boarding pass for all the passengers for error Message");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I change the name of {string} passenger to the {string} FQTV passenger")
    public void iChangeTheNameOfPassengerToTheFQTVPassenger(String index, String fqtvPassIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the name of passenger to the FQTV passenger");
            isharesPage4.changeThePassengerToFQTV(logInfo,index,fqtvPassIndex);
            logInfo.pass("I change the name of passenger to the FQTV passenger");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add {string} frequent flyer passengers with {string} name")
    public void iAddFrequentFlyerPassengersWithName(String FQTVCount, String lastNameFQTV) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add given frequent flyer passengers");
            isharesPage4.addGivenFQTV(logInfo,FQTVCount,lastNameFQTV);
            logInfo.pass("I add given frequent flyer passengers");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I capture the flight details before cancelling the segment {string}")
    public void iCaptureTheFlightDetailsBeforeCancellingTheSegment(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture the flight details before cancelling the segment");
            isharesPage4.CaptureTheFlightDetailsBeforeCancellingTheSegment(logInfo,SegmentNumber);
            logInfo.pass("I capture the flight details before cancelling the segment");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FQTV passenger details without FFNumber")
    public void iEnterFQTVPassengerDetailsWithoutFFNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FQTV passenger details without FFNumber");
            isharesPage4.enterFQTVPax_withoutFFNumber(logInfo);
            logInfo.pass("I enter FQTV passenger details without FFNumber");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve flight information along with PAX info")
    public void iRetrieveFlightInformationAlongWithPAXInfo() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve flight information along with PAX info");
            isharesPage4.retrieveFlightInfoAlongWithPaxInfo(logInfo);
            logInfo.pass("I retrieve flight information along with PAX info");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the flight timing along with PAX info")
    public void iRetrieveTheFlightTimingAlongWithPAXInfo() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve flight timing along with PAX info");
            isharesPage4.retrieveFlightTimingAlongWithPaxInfo(logInfo);
            logInfo.pass("I retrieve flight timing along with PAX info");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTO message to generate {string} for system {string}")
    public void i_enter_TTO_message_to_generate_FQTVSSR(String messageType, String SystemType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTO message to generate FQTV SSR for system");
            isharesPage4.TTOMessageBasicAirlinePnr(logInfo, messageType, SystemType);
            logInfo.pass("I enter TTO message to generate FQTV SSR for system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QM command to display items in the queue for {string}")
    public void enter_QM_todisplayItemsinQueue(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to delete partner entry");
            isharesPage4.EnterQM_CommandToVerifyTTYMessages(logInfo, SystemType);
            logInfo.pass("I enter K-T-PARTNER command to delete partner entry");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter K-T-PARTNER command to delete {string} by {string}")
    public void enter_KTPARTNER_todeletePartnerEntry(String Entry, String TTYcode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to delete partner entry");
            isharesPage4.deletePartnerEntryFromTheTable(logInfo, Entry, TTYcode);
            logInfo.pass("I enter K-T-PARTNER command to delete partner entry");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER command to add {string} by {string} of {string}")
    public void enter_KTPARTNER_toaddPartnerEntry(String Entry, String TTYcode, String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to delete partner entry");
            isharesPage4.addPartnerEntryToTheTable(logInfo, Entry, TTYcode, SystemType);
            logInfo.pass("I enter K-T-PARTNER command to delete partner entry");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LA$R command to get the best buy fare quote for open segments {string}")
    public void iEnterLA$R_CommandToGetTheBestBuyFareQuoteForOpenSegments(String segments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$R|P_ command to get the best buy fare quote for the passengers for open segments");
            isharesPage4.bestBuyForOpenSegmentswithoutPassenger(logInfo, segments);
            logInfo.pass("I enter LA$R|P_ command to get the best buy fare quote for the passengers for open segments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I search for flight availability using S between {string} {string} with {string} for {string}")
    public void search_flightavailabilityusingS(String origin, String destination, String params, String searchType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability using S command");
            isharesPage4.search_flightavailabilitywithScommand(logInfo, origin,destination, params, searchType);
            logInfo.pass("I search for flight availability using S command");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KSIMO command to Display detail flight schedule")
    public void enter_KSIMO_DisplayDetailschedule() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KSIMO command to Display detail flight schedule");
            isharesPage4.enterKSIMO_DisplayDetailschedule(logInfo);
            logInfo.pass("I enter KSIMO command to Display detail flight schedule");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PAR_ command to display Printer Attribute Record Table by {string}")
    public void i_enter_PAR_command_to_display_Printer_Attribute_Record_Table(String LNIATA) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAR_ command to display Printer Attribute Record Table");
            isharesPage4.displayPrinterAttributeRecordTablebyLNIATA(logInfo, LNIATA);
            logInfo.pass("I enter PAR_ command to display Printer Attribute Record Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter FQTV passenger details without FF number")
    public void enterPassengerswithoutFFNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FQTV passenger details without FF number");
            isharesPage4.addFQTVwithoutFFNumber(logInfo);
            logInfo.pass("I enter FQTV passenger details without FF number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6 command to update passenger details with {string} of {string}")
    public void iAddFrequentFlyerPassengerswithoutFFNumber(String FFNumber, String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6 command to update passenger details");
            isharesPage4.updateFQTVPassengerwithFFNumber(logInfo, segmentIndex, FFNumber);
            logInfo.pass("I enter 6 command to update passenger details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET for ALL carrier")
    public void I_enter_ET_for_All_Carrier(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET for ALL carrier");
            isharesPage4.enterETForAllCarrier(logInfo);
            logInfo.pass("I enter *ET for ALL carrier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*SEAM REF Command")
    public void I_enter_OCM_SEAM_REF_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*SEAM REF command");
            isharesPage4.enterOCMSEAMREFCommand(logInfo);
            logInfo.pass("I enter OCM*SEAM REF command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KKALL Run Reconcile Segment Sales")
    public void I_enter_KKALL_Run_Reconcile_segment_sales(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KKALL Run Reconcile Segment Sales");
            isharesPage4.enterKKALLRunReconcileSegmentSales(logInfo);
            logInfo.pass("I enter KKALL Run Reconcile Segment Sales");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIM with date and Origincity")
    public void I_enter_VIM_with_date_and_Origincity(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIM with date and Origincity");
            isharesPage4.enterVIMwithDateAndOrigincity(logInfo);
            logInfo.pass("I enter VIM with date and Origincity");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6-CQA Command")
    public void I_enter_6_CQA_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CQA command");
            isharesPage4.enter6CQACommand(logInfo);
            logInfo.pass("I enter 6-CQA command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6-CQA* command with Linata")
    public void I_enter_6_CQA_command_with_Linata(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CQA* command with Linata");
            isharesPage4.enter6CQACommandWithLinata(logInfo);
            logInfo.pass("I enter 6-CQA* command with Linata");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CRW_ command to add the crew passenger {string}")
    public void iEnterCRW_CommandToAddTheCrewPassenger(String crewType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CRW_ command to add the crew passenger");
            isharesPage4.addCrewPassenger(logInfo, crewType);
            logInfo.pass("I enter 6:CRW_ command to add the crew passenger");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CRW_@ command to delete the crew passenger and verify the same")
    public void iEnterCRW_CommandToDeleteTheCrewPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CRW_@ command to delete the crew passenger and verify the same");
            isharesPage4.deleteCrewPassengerAndVerify(logInfo);
            logInfo.pass("I enter 6:CRW_@ command to delete the crew passenger and verify the same");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *AP command to display APIS details of all the passengers after dividing the PNR with {string}")
    public void iEnterAPCommandToDisplayAPISDetailsOfAllThePassengersAfterDivingThePNRWith(String noOfPaxDivided) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *AP command to display APIS details of all the passengers after dividing the PNR");
            isharesPage4.displayAPISDetailsAfterDividingThePNR(logInfo, noOfPaxDivided);
            logInfo.pass("I enter *AP command to display APIS details of all the passengers after dividing the PNR");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I change the name of the FQTV passenger in the index {string} to a different FQTV passenger name")
    public void iChangeTheNameOfTheFQTVPassengerInTheIndexStringToADifferentFQTVPassengerName(String paxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the name of the FQTV passenger to a different FQTV passenger name");
            isharesPage4.changeTheFQTVPassengerName(logInfo, paxIndex);
            logInfo.pass("I change the name of the FQTV passenger to a different FQTV passenger name");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the FQTV number of a passenger in the index {string} to a different FQTV number")
    public void iChangeTheFQTVNumberOfAPassengerInTheIndexStringToADifferentFQTVNumber(String paxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the FQTV number to a different FQTV passenger number");
            isharesPage4.changeTheFQTVPassengerNumber(logInfo, paxIndex);
            logInfo.pass("I change the FQTV number to a different FQTV passenger number");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PMP_ command to perform preliminary meal count request")
    public void iEnterPMP_CommandToPerformPreliminaryMealCountRequest() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PMP_ command to perform preliminary meal count request");
            isharesPage4.performPreliminaryMealCount(logInfo);
            logInfo.pass("I enter PMP_ command to perform preliminary meal count request");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter -_@ command to delete an existing passenger in the {string} from the PNR and add a new passenger to the PNR {string}")
    public void iEnter_CommandToDeleteAnExistingPassengerInTheFromThePNRAndAddANewPassengerToThePNR(String paxIndex, String paxType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter -_@ command to delete an existing passenger from the PNR and add a new passenger to the PNR");
            isharesPage4.deleteAnExistingPaxAndAddANewPaxToThePNR(logInfo, paxIndex, paxType);
            logInfo.pass("I enter -_@ command to delete an existing passenger from the PNR and add a new passenger to the PNR");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KC_CQ_* command to check if the POS is FCB enabled")
    public void iEnterKCCQ_CommandToCheckIfThePOSIsFCBEnabled() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KC/CQ/_ command to check if the POS is FCB enabled");
            isharesPage4.checkIfThePOSISFCBEnabled(logInfo);
            logInfo.pass("I enter KC/CQ/_ command to check if the POS is FCB enabled");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter A*R command to check the return availability from {string} to {string}")
    public void iEnterARCommandToCheckTheReturnAvailabilityFromTo(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*R command to check the return availability");
            isharesPage4.enterA_RCommandToCheckReturnAvailabilty(logInfo, origin, destination);
            logInfo.pass("I enter A*R command to check the return availability");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $:_ command to verify fare display before and after availability search from {string} to {string}")
    public void iEnter$_CommandToVerifyFareDisplayBeforeAndAfterAvailabilitySearchFromTo(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $:_ command to verify fare display before and after availability search");
            isharesPage4.enter$_CommandToVerifyFareDisplay(logInfo, origin, destination);
            logInfo.pass("I enter $:_ command to verify fare display before and after availability search");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*_ command to verify redisplay original availability from {string} to {string}")
    public void iEnterA_CommandToVerifyRedisplayOriginalAvailabilityFromTo(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*_ command to verify redisplay original availability");
            isharesPage4.enterA_CommandToVerifyRedisplayOriginalAvailabilty(logInfo, origin, destination);
            logInfo.pass("I enter A*_ command to verify redisplay original availability");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter A*_ command to verify display more flights availability from {string} to {string}")
    public void iEnterA_CommandToVerifyDisplayMoreFlightsAvailabilityFromTo(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*_ command to verify display more flights availability");
            isharesPage4.enterA_CommandToVerifyDisplayMoreFlightsAvailabilty(logInfo, origin, destination);
            logInfo.pass("I enter A*_ command to verify display more flights availability");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*_ command to verify request availability from {string} to {string}")
    public void iEnterA_CommandToVerifyRequestAvailabilityFromTo(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*_ command to verify request availability");
            isharesPage4.enterA_CommandToVerifyRequestAvailabilty(logInfo, origin, destination);
            logInfo.pass("I enter A*_ command to verify request availability");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6-*FM command to run the file maintenance utility")
    public void iEnterFMCommandToRunTheFileMaintenanceUtility() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-*FM command to run the file maintenance utility");
            isharesPage4.fileMaintenanceUtility(logInfo);
            logInfo.pass("I enter 6-*FM command to run the file maintenance utility");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I initiate changing the name of the passenger in the index {string} and validate the error message and cancel the changing")
    public void iInitiateChangingTheNameOfThePassengerInTheIndexAndValidateTheErrorMessageAndCancelTheChanging(String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I initiate changing the name of the passenger and validate the error message and cancel the changing");
            isharesPage4.initiateChangingPaxNameAfterASAAndRejectTheChange(logInfo, index);
            logInfo.pass("I initiate changing the name of the passenger and validate the error message and cancel the changing");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add NRSA passenger details to NRPS passenger")
    public void iAddNRSAPassengerDetailsToNRPSPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add NRSA passenger details to NRPS passenger");
            isharesPage4.addNRSAPaxDetailsToNRPSPax(logInfo);
            logInfo.pass("I add NRSA passenger details to NRPS passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KM*F command to display the status table")
    public void iEnterKMFCommandToDisplayTheStatusTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KM*F command to display the status table");
            isharesPage4.enterKMFCommandToDisplayStatusTable(logInfo);
            logInfo.pass("I enter KM*F command to display the status table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:XP_XS command to add OSI remarks for multi initial {string}")
    public void ienterXP_XSCommandToAddOSIRemarksForMultiInitial(String RemarkType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:XP_XS command to add OSI remarks for multi initial ");
            isharesPage4.enterXP_XSCommandToAddOSIRemarksForMultiInitial(logInfo, RemarkType);
            logInfo.pass("I enter 6:XP_XS command to add OSI remarks for multi initial ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter SSR command for ssr type for multi initial {string}")
    public void ienter_addSSRMultiInitial(String SSrType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR command for ssr type for multi initial ");
            isharesPage4.addSSRMultiInitial(logInfo, SSrType);
            logInfo.pass("I enter SSR command for ssr type for multi initial  ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to adjust the flight segment for {string} and {string}")
    public void iEnterCommandToAdjustTheSegment(String Seg, String Pax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to adjust theflight segment");
            System.out.println("I enter command to adjust the flight segment");
            isharesPage4.adjustTheFlightSegment(logInfo, Seg, Pax);
            logInfo.pass("I enter command to adjust the flight segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to Issue Host ETKT with other forms of payments {string}")
    public void iEnterCommandToIssueHostEtktWithotherFormsOfPayments(String paymentType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Issue Host ETKT with other forms of payments "+paymentType);
            System.out.println("I enter command to Issue Host ETKT with other forms of payments "+paymentType);
            isharesPage4.issueHostEtktWithOtherFormsOfPayments(logInfo, paymentType);
            logInfo.pass("I enter command to Issue Host ETKT with other forms of payments "+paymentType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to replace the seat after check in")
    public void iEnterCommandToReplaceTheSeatAfterCheckIn(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to replace the seat after check in");
            isharesPage4.replaceTheSeatAfterCheckIn(logInfo);
            logInfo.pass("I enter command to replace the seat after check in");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to update FFNumber in the PNR with {string}")
    public void iEnterCommandToUpdateFFNumerInThePNRwith(String FFNumer) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to update FFNumer in the PNR with "+FFNumer );
            System.out.println("I enter command to update FFNumer in the PNR with "+FFNumer);
            isharesPage4.updateFFNumberInPNR(logInfo, FFNumer);
            logInfo.pass("I enter command to update FFNumer in the PNR with "+FFNumer );

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter *EO- command to display the ETKT indexing with FFNumber {string}")
    public void iEnterEOCommandToDisplayTheETKTIndexingWithFFNumber(String FFNumber) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EO- command to display the ETKT indexing with FFNumber "+FFNumber);
            isharesPage4.displayTheETKTIndexingwithFFNumber(logInfo,FFNumber);
            logInfo.pass("I enter *EO- command to display the ETKT indexing with FFNumber "+FFNumber);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to reissue the ticket and verify accuracy of refund andadd collect amounts by agents")
    public void iEnterCommandToReissueTheTicketAndVerifyAccuracyOfRefund(String FFNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to reissue the ticket and verify accuracy of refund andadd collect amounts by agents");
            isharesPage4.reissueTicketAndVerifyAccuracy(logInfo);
            logInfo.pass("I enter command to reissue the ticket and verify accuracy of refund andadd collect amounts by agents");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to reissue the ticket with Cash")
    public void iEnterCommandToResissueTheTicketWithCash() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to reissue the ticket with Cash");
            isharesPage4.reissueTicketWithCash(logInfo);
            logInfo.pass("I enter command to reissue the ticket with Cash");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to change segment status to {string} for {string}")
    public void iEnterCommandToChangeSegmentStatus(String status, String seg) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to change segment status to "+status+" for "+seg);
            isharesPage4.changeSegmentStatus(logInfo, status, seg);
            logInfo.pass("I enter command to change segment status to "+status+" for "+seg);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter JA command to display FF details for social security name {string} and {string} and {string}")
    public void i_enter_JA_command_display_FF_details_for_social_security_name(String fName, String lName, String isValid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter JA command to display FF details for social security name "+fName+" and "+lName);
            isharesPage4.displayFF_DetailsForSocialSecurityName(logInfo, fName,lName,isValid);
            logInfo.pass("I enter JA command to display FF details for social security name "+fName+" and "+lName);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$UE_ET command to run uneven exhange entry")
    public void iEnterT$UE_ETCommandToRunUnEvenExhangeEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$UE_ET command to run uneven exhange entry");
            isharesPage4.enterT$UE_ETCommandToRunUnEvenExhangeEntry(logInfo);
            logInfo.pass("I enter T-$UE_ET command to run uneven exhange entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *ET_TAX command to display indivisual tax for all segments")
    public void I_enter_ET_TAX_command_to_display_indivisual_tax_For_all_segments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_TAX command to display indivisual tax for all segments");
            isharesPage4.displayIndivisualTaxUserForAllSegments(logInfo);
            logInfo.pass("I enter *ET_TAX command to display indivisual tax for all segments");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to run KSIMO entry for SSM message for {string} and {string}")
    public void iEnterCommandToRun_KSIMO_EntryForSSM_Message(String flight, String messageId) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run KSIMO entry for SSM message");
            isharesPage4.runKSIMO_ForSSM_Message(logInfo, flight, messageId);
            logInfo.pass("I enter command to run KSIMO entry for SSM message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add FQTV Number {string} to index {string}")
    public void iEnterCommandToAddFqtvNumber(String FFNo,String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add FQTV Number");
            isharesPage4.addFQTV_Number(logInfo,FFNo, index);
            logInfo.pass("I enter command to add FQTV Number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to delete FQTV Number")
    public void iEnterCommandToDeleteFqtvNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to delete FQTV Number");
            isharesPage4.deleteFQTV_Number(logInfo);
            logInfo.pass("I enter command to delete FQTV Number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify pax codes defined in the  M table for {string}")
    public void iEnterCommandToVerifyPaxCodesDefinedInThe_M_Table(String passengerType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify pax codes defined in the  M table");
            isharesPage4.verifyPaxCodesInM_Table(logInfo,passengerType);
            logInfo.pass("I enter command to verify pax codes defined in the  M table");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to ticket PNR with passenger type {string} and {string} and {string}")
    public void iEnterCommandToTicketPNRwithPassengerType(String passType,String passType1,String isValid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to ticket PNR with passengers");
            isharesPage4.ticketPNRwithPassengerType(logInfo,passType, passType1, isValid);
            logInfo.pass("I enter command to ticket PNR with passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I navigate to ManageUsers in Supervisor module in Shadow Tool")
    public void i_navigate_to_ManageUsers_in_Supervisor_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to ManageUsers in Supervisor module in Shadow Tool");
            thirdPartyGUI.navigateToManageUsers(logInfo);
            logInfo.pass("I navigate to ManageUsers in Supervisor module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of Shares PNR for origin city {string} for Multi Initial Pax for Multiple PNRs")
    public void iDoTheCheckinOfSharesPNRForOriginCityForMultiInitialPaxForMultiplePNRs(String originCity)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of multi initial passengers for Multiple PNRs");
            isharesPage4.checkinOfTwoPNRsWithMultipleItemsErrorForSameSurnamePax(logInfo, originCity);
            logInfo.pass("I do the checkin of multi initial passengers for Multiple PNRs");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I do the voluntary grade of Shares PNR {string} for Multi Initial Pax for Multiple PNRs")
    public void iDoTheVoluntaryGradeOfSharesPNRForMultiInitialPax(String GradeType)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the voluntary grade of Shares PNR " +GradeType+" for Multi Initial Pax for Multiple PNRs");
            isharesPage4.doTheVoluntaryGradeOfSharesPNRForMultiInitialPaxForMultiplePNRs(logInfo, GradeType);
            logInfo.pass("I do the voluntary grade of Shares PNR "+GradeType+" for Multi Initial Pax for Multiple PNRs");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I do the checkin of Shares PNR for origin city {string} for Multiple PNRs")
    public void iDoTheCheckinOfSharesPNRForOriginCityForMultiplePNRs(String origincty)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of passengers for Multiple PNRs");
            isharesPage4.sharesCheckinForMultiplePNRs(logInfo, origincty);
            logInfo.pass("I do the checkin of passengers for Multiple PNRs");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the voluntary grade of Shares PNR {string} for Multiple PNRs")
    public void iDoTheVoluntaryGradeOfSharesPNRForMultiplePNRs(String GradeType)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the voluntary grade of Shares PNR " +GradeType+" for Multiple PNRs");
            isharesPage4.doTheVoluntaryGradeOfSharesPNRForMultiplePNRs(logInfo, GradeType);
            logInfo.pass("I do the voluntary grade of Shares PNR "+GradeType+" for Multiple PNRs");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for the availability for flights from {string} to {string} in the format {string}")
    public void iSearchForTheAvailabilityForFlightsFromToInTheFormat(String origin, String destination, String format)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability from " + origin + " to " + destination + "in different format");
            isharesPage4.searchFlightAvailabilityUsingDifferentFormat(logInfo, origin, destination, format);
            logInfo.pass("I search for flight availability from " + origin + " to " + destination + "in different format");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I save the transaction and retrieve")
    public void I_save_the_transaction_and_retrieve() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save the transaction and retrieve the PNR");
            isharesPage4.saveAndRetrieve(logInfo);
            logInfo.pass("I save the transaction and retrieve the PNR");


        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Run the CDM Remark SHARES entries in Transformed SHARES")
    public void I_enter_run_the_CDM_remarks_shares_entries_in_Transformed_shares(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the CDM Remark SHARES entries in Transformed SHARES");
            isharesPage4.theCDMRemarksSharesEntriesInTransformed(logInfo);
            logInfo.pass("I enter Run the CDM Remark SHARES entries in Transformed SHARES");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And ("I enter Run the Standard Remark SHARES entries in Transformed SHARES")
    public void I_enter_run_the_standard_remarks_shares_entries_in_transformed_shares(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Standard Remark SHARES entries in Transformed SHARES");
            isharesPage4.theStandardRemarksSharesEntries(logInfo);
            logInfo.pass("I enter Run the Standard Remark SHARES entries in Transformed SHARES");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Cancellation of Name SHARES entries in Transformed SHARES")
    public void I_enter_run_the_cancellation_of_name_shares_entries_in_transformed_shares(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Cancellation of Name SHARES entries in Transformed SHARES");
            isharesPage4.cancellationOfNameShares(logInfo);
            logInfo.pass("I enter Run the Cancellation of Name SHARES entries in Transformed SHARES");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CP Block seats in C compartment")
    public void I_enter_6_CP_Block_seats_in_C_compartment(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CP Block seats in C compartment");
            isharesPage4.enter6CPBlockSeatinCCompartment(logInfo);
            logInfo.pass("I enter 6:CP Block seats in C compartment");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-K to accommodate first class revenue passenger")
    public void I_enter_6_K_To_Accommodate_first_class_revenue_passenger(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_KT* command to do mass transfer with APIS");
            isharesPage4.enter6KToAccommodateFirstClassRevenuePassenger(logInfo);
            logInfo.pass("I enter 6_KT* command to do mass transfer with APIS");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-K* Do check in and stand by clearance")
    public void I_enter_6_K_Do_check_in_and_stand_by_clearance(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-K* Do check in and stand by clearance");
            isharesPage4.enter6KDoCheckInAndStandByClearance(logInfo);
            logInfo.pass("I enter 6-K* Do check in and stand by clearance");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZAFIL Run the Space Held Type SHARES {string} {string}")
    public void I_enter_ZAFIL_Run_the_Space_Held_Type_SHARES(String Number, String Validate){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL Run the Space Held Type SHARES");
            isharesPage4.enterZAFILRunTheSpaceHeldTypeShare(logInfo, Number, Validate);
            logInfo.pass("I enter ZAFIL Run the Space Held Type SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And ("I enter 6_LD reconcile based on seat and List display for Passenger")
    public void I_enter_6_LD_Reconcile_based_on_seat_and_List_display_for_passenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_LD reconcile based on seat and List display for Passenger");
            isharesPage4.enter6LDReconcileBasedOnSeatAndListDisplayForPassenger(logInfo);
            logInfo.pass("I enter 6_LD reconcile based on seat and List display for Passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:A command to Run total values")
    public void iEnterCACommandToRunTotalValues() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to Run total values");
            isharesPage4.iEnterCAToRunTotalValues(logInfo);
            logInfo.pass("I enter C:A command to Run total values");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter 6:CK command to perform standby clearance")
    public void iEnterCKCommandToPerformStandbyClearance() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CK command to perform standby clearance");
            isharesPage4.performStandbyClearance(logInfo);
            logInfo.pass("I enter 6:CK command to perform standby clearance");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter 6:A_ command to assign seats to all the passengers")
    public void iEnterA_CommandToAssignASeatToAllThePassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_ command to assign seats to all the passengers");
            isharesPage4.assignSeatsToAllThePassengers(logInfo);
            logInfo.pass("I enter 6:A_ command to assign seats to all the passengers");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter OCM*UGX1* command to turn off the appswitch {string} for the {string} entry")
    public void iEnterOCMUGXCommandToTurnOffTheAppswitchForTheEntry(String appSwitch, String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*UGX1* command to turn off the appswitch");
            isharesPage4.enterOCMUGXCommandToTurnOFFAppswitch(logInfo, appSwitch, entry);
            logInfo.pass("I enter OCM*UGX1* command to turn off the appswitch");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A_ command to assign seats to all the passengers and validate the error")
    public void iEnterA_CommandToAssignSeatsToAllThePassengersAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_ command to assign seats to all the passengers and validate the error");
            isharesPage4.assignSeatsToAllThePassengersAndValidateTheError(logInfo);
            logInfo.pass("I enter 6:A_ command to assign seats to all the passengers and validate the error");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter 6:CU_ command to release held seat by specifying the seat number")
    public void iEnterCU_CommandToReleaseHeldSeatBySpecifyingTheSeatNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CU_ command to release held seat by specifying the seat number");
            isharesPage4.releaseHeldSeatBySpecifyingSeatNumber(logInfo);
            logInfo.pass("I enter 6:CU_ command to release held seat by specifying the seat number");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter Run the Cancel a pending Credit Enquiry SHARES")
    public void I_enter_Run_the_Cancel_a_pending_Credit_Enquiry_SHARES(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Cancel a pending Credit Enquiry SHARES");
            isharesPage4.enterRunTheCancelaPendingCreditEnquiryShares(logInfo);
            logInfo.pass("I enter Run the Cancel a pending Credit Enquiry SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter along with the first passenger name")
    public void I_enter_along_with_the_first_passenger_name(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter along with the first passenger name");
            isharesPage4.enteralongWithTheFirstPassengerName(logInfo);
            logInfo.pass("I enter along with the first passenger name");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter formatted in record locator format")
    public void I_enter_formatted_in_record_locator_format(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter formatted in record locator format");
            isharesPage4.enterFormattedInrecordLocatorFormat(logInfo);
            logInfo.pass("I enter formatted in record locator format");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BSIB Smilar Name in TR duty code")
    public void I_enter_BSIB_smilar_Name_in_TR_duty_code(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSIB Smilar Name in TR duty code");
            isharesPage4.enterBSIBSmilarNameInTRDutyCode(logInfo);
            logInfo.pass("I enter BSIB Smilar Name in TR duty code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTD Book Bundle Sell in TR duty code")
    public void I_enter_BTD_Book_Bundle_Sell_in_TR_duty_code(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTD Book Bundle Sell in TR duty code");
            isharesPage4.enterBTDBookBundleSellinTRDutyCode(logInfo);
            logInfo.pass("I enter BTD Book Bundle Sell in TR duty code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTD Add the dupe agent intital to the city sine table")
    public void I_enter_BTD_Add_the_dupe_agent_initial_to_the_city_sine_table(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTD Add the dupe agent intital to the city sine table");
            isharesPage4.enterBTDAddTheDupeAgentInitialToTheCitySineTable(logInfo);
            logInfo.pass("I enter BTD Add the dupe agent intital to the city sine table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE Check whether the carrier exists")
    public void I_enter_Q_CODESHARE_check_wheather_the_carrier_exists(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE Check whether the carrier exists");
            isharesPage4.enterQCODESHARECheckWheatherTheCarrierExists(logInfo);
            logInfo.pass("I enter Q*CODESHARE Check whether the carrier exists");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KSSALL to display schedule change agent Table")
    public void I_enter_KSSALL_to_display_schedule_change_aganet_table(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KSSALL to display schedule change agent Table");
            isharesPage4.enterKSSALLToDisplayScheduleChangeAgentTable(logInfo);
            logInfo.pass("I enter KSSALL to display schedule change agent Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KT_CL_ {string} command and verify {string}")
    public void iEnterKT_CL_CommandAndVerify(String cmd, String res) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT_CL_command and verify response");
            isharesPage4.sendKT_CL_Command(logInfo,cmd,res);
            logInfo.pass("I enter KT_CL_command and verify response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add class conversion table entries")
    public void iAddClassConversionTableEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add class conversion table entries");
            isharesPage4.sendKT_CmdToAddEntries(logInfo);
            logInfo.pass("I add class conversion table entries");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2P command to perform OUT flifo operation")
    public void iEnterPCommandToPerformOUTFlifoOperation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform OUT flifo operation");
            isharesPage4.Create_2PCommandOUTTime(logInfo);
            logInfo.pass("I enter 2P command to perform OUT flifo operation");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 3SSR_ command to add SSR {string} for Animal")
    public void iEnterSSR_CommandToAddSSRForAnimal(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 3SSR_ command to add SSR for Animal");
            isharesPage4.ToAddSSRAVIHForAnimal(logInfo,SSR);
            logInfo.pass("I enter 3SSR_ command to add SSR for Animal");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:PRN_ command to display Reconcile Enter status")
    public void iEnterPRN_CommandToDisplayReconcileEnterStatus() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRN_ command to display Reconcile Enter status");
            isharesPage4.ToDisplayReconcileEnterStatus(logInfo);
            logInfo.pass("I enter 6:PRN_ command to display Reconcile Enter status");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EP_ command to display PNR with Phone number")
    public void iEnterEP_CommandToDisplayPNRWithPhoneNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EP_ command to display PNR with Phone number");
            isharesPage4.ToDisplayPNRWithPhoneNumber(logInfo);
            logInfo.pass("I enter *EP_ command to display PNR with Phone number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate pnr for system {string} with invalid entry{string}")
    public void iEnterTTYMessageToGeneratePnrForSystemWithInvalidEntry(String SystemType, String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment with invalid entry");
            isharesPage4.TTYMessageBasicAirlinePnrWithInvalidEntry(logInfo, SystemType,Entry);
            logInfo.pass("I enter TTY message to generate basic airline segment with invalid entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QM_|LAST command to perform AF reject msgs to special city{string}")
    public void iEnterQM_LASTCommandToPerformAFRejectMsgsToSpecialCity(String City) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QM_|LAST command to perform AF reject msgs to special city");
            isharesPage4.ToPerformAFRejectMsgsToSpecialCity(logInfo,City);
            logInfo.pass("I enter QM_|LAST command to perform AF reject msgs to special city");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QC_ command to display the PNR queue for different city")
    public void iEnterQC_CommandToDisplayThePNRQueueForDifferentCity() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QC_ command to display the PNR queue for different city");
            isharesPage4.ToEnterQC_Command(logInfo);
            logInfo.pass("I enter QC_ command to display the PNR queue for different city");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I run the flight information for consolidated flights")
    public void iRunTheFlightInformationForConsolidatedFlights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the flight information for consolidated flights");
            isharesPage4.flightInformationForConsolidatedFlights(logInfo);
            logInfo.pass("I run the flight information for consolidated flights");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for Specific Availability Display by Alliance Code {string}")
    public void iSearchForSpecificAvailabilityDisplayByAllianceCode(String allianceCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the flight information for consolidated flights");
            isharesPage4.specificAvailabilityDisplayByAllianeCode(logInfo, allianceCode);
            logInfo.pass("I run the flight information for consolidated flights");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:_ command to verify error message {string} and {string}")
    public void iEnter_CommandToVerifyErrorMessageAnd( String totalBag, String Weight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:_ command to verify error message");
            isharesPage4.enter6_CommandVerifyErrorMessage(logInfo,totalBag,Weight);
            logInfo.pass("I enter 6:_ command to verify error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *ET_ for displaying ticket coupon {string}")
    public void iEnterET_ForDisplayingTicketCoupon(String totalSegments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_ for displaying ticket coupon");
            isharesPage4.enterETForETKTUpdates(logInfo,totalSegments);
            logInfo.pass("I enter *ET_ for displaying ticket coupon");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:BF command to print boarding pass for multiinitial {string}")
    public void iEnterBFCommandToPrintBoardingPassForMultiinitial( String BoardingPassType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:BF command to print boarding pass for multiinitial");
            isharesPage4.enterBFCommandToPrintBoardingPassMultiInitial(logInfo, BoardingPassType);
            logInfo.pass("I enter 6:BF command to print boarding pass for multiinitial");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:ZH_ command to display PNIS for multiinitial passenger")
    public void iEnterZH_CommandToDisplayPNISForMultiinitialPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to display PNIS for multiinitial passenger");
            isharesPage4.displayPNISMultiInitial(logInfo);
            logInfo.pass("I enter 6:ZH_ command to display PNIS for multiinitial passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6_command to verify PNR error message")
    public void iEnter_commandToVerifyPNRErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_command to verify PNR error message");
            isharesPage4.enter6_CommandVerifyPNRErrorMessage(logInfo);
            logInfo.pass("I enter 6_command to verify PNR error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 0HTL command to run airport entries")
    public void iEnterHTLCommandToRunAirportEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0HTL command to run airport entries");
            System.out.println("I enter 0HTL command to run airport entries");
            isharesPage4.runHTLAirportEntrie(logInfo);
            logInfo.pass("I enter 0HTL command to run airport entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }
    @And("I enter Y command to create a FLIFO message")
    public void iEnterYCommandToCreateAFLIFOMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message ");
            isharesPage4.enterYCommandToCreateAFLIFOMessage(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message ");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KAN command")
    public void iEnterKANCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KAN command");
            isharesPage4.enterKANCommand(logInfo);
            logInfo.pass("I enter KAN command ");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Y command to check the outgoing message")
    public void iEnterYCommandToCheckTheOutgoingMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to check the outgoing message");
            isharesPage4.enterYCommandToCheckTheOutgoingMessage(logInfo);
            logInfo.pass("I enter Y command to check the outgoing message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ALLETOS command to display the tickets pax out of sync")
    public void iEnterLD_ALLETOSCommandToDisplayTheTickets() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ALLETOS command to display the tickets pax out of sync");
            isharesPage4.displayTKTPaxList(logInfo);
            logInfo.pass("I enter 6:LD_|ALLETOS command to display the tickets pax out of sync");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LD|PAX command to Add Message SHARES entries")
    public void iEnterLDPAXCommandToAddMessageSHARESEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD|PAX command to Add Message SHARES entries");
            isharesPage4.enter6LDPAXCommand(logInfo);
            logInfo.pass("I enter 6:LD|PAX command to Add Message SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }
    @And("I enter command T-${string} to ticket by different methods")
    public void iEnterCommandT$ToTicketByDifferentMethods(String value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command T-$" + value + " to ticket by different methods");
            isharesPage4.T$ToTicketByDifferentMethods(logInfo, value);
            logInfo.pass("I enter command T-$" + value + " to ticket by different methods");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Q*CODESHARE command with OZ {string}")
    public void I_enter_Q_CODESHARE_command_with_OZ(String Code){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE command with OZ");
            isharesPage4.enterQCODESHARECommandWithOZ(logInfo, Code);
            logInfo.pass("I enter Q*CODESHARE command with OZ");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Run PNR SYNC Option Table Display SHARES{string}")
    public void I_enter_run_PNR_sync_option_Table_display_shares(String CarrierCode){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run PNR SYNC Option Table Display SHARES");
            isharesPage3.runPNRSYNCOptionTableDisplayShares(logInfo,CarrierCode);
            logInfo.pass("I enter Run PNR SYNC Option Table Display SHARES");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T|$*|ALL command")
    public void I_enter_T_$_ALL_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T|$*|ALL command");
            isharesPage4.enterT$ALLCommand(logInfo);
            logInfo.pass("I enter T|$*|ALL command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*SAXJ_MAPS_STATUS command")
    public void I_enter_OCM_SAXJ_MAPS_Status_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*SAXJ_MAPS_STATUS command");
            isharesPage4.enterOCMSAXJMAPSStatusCommand(logInfo);
            logInfo.pass("I enter OCM*SAXJ_MAPS_STATUS command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6_ZA command for SCOREPNRS {string}")
    public void I_enter_6_ZA_command_for_Scorepnrs(String Rescore){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_ZA command for SCOREPNRS");
            isharesPage4.enter6ZACommandForSCORENRS(logInfo, Rescore);
            logInfo.pass("I enter 6_ZA command for SCOREPNRS");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LD list display with passenger details")
    public void I_enter_6_LD_list_display_with_passenger_details(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD list display with passenger details");
            isharesPage4.enter6LDListDisplayWithPassengerDetails(logInfo);
            logInfo.pass("I enter 6:LD list display with passenger details");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-CK Command")
    public void IEnter6CK() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CK command");
            isharesPage4.IEnter6CK(logInfo);
            logInfo.pass("I enter 6-CK command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_* to Display Seat Map of UA flight in CM database")
    public void I_enter_6_to_display_seat_Map_of_UA_flight_in_CM_database(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_* to Display Seat Map of UA flight in CM database");
            isharesPage4.enter6ToDisplaySeatMapOfUAFlightInCMDatabase(logInfo);
            logInfo.pass("I enter 6_* to Display Seat Map of UA flight in CM database");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:TAG| command to validate tag")
    public void I_enter_6_TAG_command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TAG| command");
            isharesPage4.enter6TAGCommand(logInfo);
            logInfo.pass("I enter 6:TAG| command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6PRER Command")
    public void iEnterPRERCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6PRER command");
            isharesPage4.Enter6PRER(logInfo);
            logInfo.pass("I enter 6PRER command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6_MT to change the flight")
    public void I_enter_6_MT_to_change_the_flight(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_MT to change the flight");
            isharesPage4.enter6_MTToChangeTheFlight(logInfo);
            logInfo.pass("I enter 6_MT to change the flight");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6_MT Change the Itinerary of the passenger {string}")
    public void I_enter_6_MT_Change_the_Itinerary_of_the_passenger(String Entry){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_MT Change the Itinerary of the passenger");
            isharesPage4.enter6MTChangeTheItineraryOfThePassenger(logInfo, Entry);
            logInfo.pass("I enter 6_MT Change the Itinerary of the passenger");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:GV_ voluntary grade of Shares PNR")
    public void I_enter_6_GV_voluntary_grade_of_shares_PNR(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:GV_ voluntary grade of Shares PNR");
            isharesPage4.enter6GVVoluntaryGradeOfSharesPNR(logInfo);
            logInfo.pass("I enter 6:GV_ voluntary grade of Shares PNR");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:_@B command to Modify the bag count {string} {string}")
    public void I_enter_6_B_command_to_modify_the_bag_count(String BaggageWeight, String BaggageCount){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:_@B command to Modify the bag count");
            isharesPage4.enter6CommandToModifyTheBagCount(logInfo, BaggageWeight, BaggageCount);
            logInfo.pass("I enter 6:_@B command to Modify the bag count");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);
        }
    }
    @And("I enter 6-CO with flight and Linata")
    public void I_enter_6_CO_with_flight_and_Linata(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CO with flight and Linata");
            isharesPage4.enter6COWithFlightAndLinata(logInfo);
            logInfo.pass("I enter 6-CO with flight and Linata");
        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:PR.INIT|SEQ Marking an ETKT LIFTED")
    public void I_enter_6_PR_INIT_SEQ_marking_an_ETKT_lifted() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR.INIT|SEQ Marking an ETKT LIFTED");
            isharesPage4.enter6PRINITSEQMarkingAnETKTLifted(logInfo);
            logInfo.pass("I enter 6:PR.INIT|SEQ Marking an ETKT LIFTED");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:PRN to update multiple entries {string}")
    public void I_enter_6_PRN_to_update_multiple_entries(String Entry){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRN to update multiple entries ");
            isharesPage4.enter6PRNToUpdateMultipleEntries(logInfo, Entry);
            logInfo.pass("I enter 6:PRN to update multiple entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:CC for ETKT Updates")
    public void I_enter_6_CC_for_ETKT_Updates(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CC for ETKT Updates");
            isharesPage4.enter6CCForETKTUpdates(logInfo);
            logInfo.pass("I enter 6:CC for ETKT Updates");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $_$_GDRW command to allow global direct rounds")
    public void I_enter_$_$_GDRW_command_to_allow_global_direct_rounds(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_$_GDRW command to allow global direct rounds");
            isharesPage4.enter$$GDRWCommandToAllowGlobalDirectRounds(logInfo);
            logInfo.pass("I enter $_$_GDRW command to allow global direct rounds");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);
        }
    }

    @And("I enter check in command to update baggage and {string} passenger {string} details")
    public void iEnterCheckInCommandToUpdateBaggageAndPassengerDetails(String Index, String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter check in command to update baggage and passenger details");
            isharesPage4.updateBagAndPaxDetailsUsingCheckinCmd(logInfo,Index, Entry);
            logInfo.pass("I enter check in command to update baggage and passenger details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LK_ command and verify response")
    public void iEnterLK_CommandAndVerifyResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LK_ command and verify response");
            isharesPage4.enter6LK_InvalidDataError(logInfo);
            logInfo.pass("I enter 6:LK_ command and verify response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:BTAG_ command to display the Bagtag numbers and passenger sequence Number for all")
    public void iEnterBTAG_CommandToDisplayTheBagtagNumbersAndPassengerSequenceNumberForAll() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:BTAG_ command to display the Bagtag numbers and passenger sequence Number for all");
            isharesPage4.displayBagtagNumber(logInfo);
            logInfo.pass("I enter 6:BTAG_ command to display the Bagtag numbers and passenger sequence Number for all");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I change the segment {string} with the new Date {string} and using PR Cmd")
    public void iChangeTheSegmentWithTheNewDateAndUsingPRCmd(String segment,String days) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the segment with the new Date and using PR Cmd");
            isharesPage4.rebookTheSegmentWithNewDate_PR(logInfo,segment,days);
            logInfo.pass("I change the segment with the new Date and using PR Cmd");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I change the segment {string} with the new Date {string} and using SU and {string}")
    public void iChangeTheSegmentWithTheNewDateAndUsingSUCmdAnd(String segment, String days, String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the segment with the new Date and using SU");
            isharesPage4.rebookTheSegmentWithNewDate_SU(logInfo,segment,days,entry);
            logInfo.pass("I change the segment with the new Date and using SU");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I clear all the pax from arraylist")
    public void iClearAllThePaxFromArraylist() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I clear all the pax from arraylist");
            isharesPage4.clearAllPaxFromArraylist(logInfo);
            logInfo.pass("I clear all the pax from arraylist");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:GV_ command to perform voluntary upgrade change of the class of service to {string} for multi initial")
    public void iEnterGV_CommandToPerformVoluntaryUpgradeChangeOfTheClassOfServiceToForMultiInitial(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:GV_ command to perform voluntary upgrade change of the class of service for multi initial");
            isharesPage4.performVoluntaryUpgradeChangeOfCOSformultiinitial(logInfo, COS);
            logInfo.pass("I enter 6:GV_ command to perform voluntary upgrade change of the class of service for multi initial");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I add the FF number to the passanger")
    public void iAddTheFFNumberToThePassanger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the FF number to the passanger");
            isharesPage4.iAddTheFFNumberToThePassanger(logInfo);
            logInfo.pass("I add the FF number to the passanger ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$EE_ET command to run even exhange entry with cash")
    public void iEnterT$EE_ETCommandToRunEvenExhangeEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EE_ET command to run even exhange entry with cash");
            isharesPage4.T_$EECommandRunEvenExchangeEntry(logInfo);
            logInfo.pass("I enter T-$EE_ET command to run even exhange entry with cash");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:DM_ command to mark the unused ETKT coupon")
    public void iEnterDM_CommandToMarkTheUnusedETKTCoupon() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DM_ command to mark the unused ETKT coupon");
            isharesPage4.getMarkUnusedETKT(logInfo);
            logInfo.pass("I enter 6:DM_ command to mark the unused ETKT coupon");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:GV command to upgrade higher cabin with COS {string}")
    public void iEnterGVCommandToUpgradeHigherCabinWithCOS(String COS1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:GV command to upgrade higher cabin with COS");
            isharesPage4.enterUpGradeCabinCommandWithCOS(logInfo, COS1);
            logInfo.pass("I enter 6:GV command to upgrade higher cabin with COS");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:*K_ command to verify standby boarding list")
    public void iEnterK_CommandToVerifyStandbyBoardingList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*K_ command to verify standby boarding list");
            isharesPage4.verifyStandbyBoardingList(logInfo);
            logInfo.pass("I enter 6:*K_ command to verify standby boarding list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:K_ command to perform seat assignment for standby processing {string}")
    public void iEnterK_CommandToPerformSeatAssignmentForStandbyProcessing(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:K_ command to perform seat assignment for standby processing");
            isharesPage4.performSeatAssignmentStandbyProcessing(logInfo,COS);
            logInfo.pass("I enter 6:K_ command to perform seat assignment for standby processing");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$- command to verify error message")
    public void iEnter$$CommandToVerifyErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$- command to verify error message" );
            isharesPage4.enter$$CommandToVerifyErrorMessage(logInfo);
            logInfo.pass("I enter $-$- command to verify error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $-$-*MXN command to autofare quote")
    public void iEnter$$MXNCommandToAutofareQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-*MXN command to autofare quote");
            isharesPage4.MXNCommandToAutofareQuote(logInfo);
            logInfo.pass("I enter $-$-*MXN command to autofare quote");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$ with MXN for payment with three forms")
    public void iEnterT$WithMXNForPaymentWithThreeForms() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$ with MXN for payment with three forms");
            isharesPage4.T$WithMXNForPaymentWithThreeForms(logInfo);
            logInfo.pass("I enter T-$ with MXN for payment with three forms");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter C:D{string} to execute different C:D commands individually")
    public void iEnterCDToExecuteDifferentCDCommandsIndividually(String value) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D"+value+" to execute different C:D commands individually");
            isharesPage4.executeCDCommandsIndividually(logInfo,value);
            logInfo.pass("I enter C:D"+value+" to execute different C:D commands individually");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);
        }
    }


    @And("I enter *EO- with start date and Year {string} command to display the ETKT details")
    public void iEnterEOWithStartDateAndYearCommandToDisplayTheETKTDetails(String Year_CC) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EO- with start date and Year");
            isharesPage4.EOCommandToDisplayTheETKTDetailsForTheStartDate(logInfo,Year_CC);
            logInfo.pass("I enter *EO- with start date and Year");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter the command T-ET{string}")
    public void iEnterTheCommandTET(String value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the command T-ET"+value);
            isharesPage4.enterTheCommandTET(logInfo,value);
            logInfo.pass("I enter the command T-ET"+value);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add FQTV passenger {string}")
    public void iAddFQTVPassenger(String FQTVType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add FQTV passenger "+FQTVType);
            isharesPage4.addFQTVPassenger(logInfo,FQTVType);
            logInfo.pass("I add FQTV passenger "+FQTVType);

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:GV_ command to perform voluntary upgrade change of the class of service using surname")
    public void iEnterGV_CommandToPerformVoluntaryUpgradeChangeOfTheClassOfServiceUsingSurname() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:GV_ command to perform voluntary upgrade change of the class of service using surname");
            isharesPage4.enterGV_CommandUsingSurname(logInfo);
            logInfo.pass("I enter 6:GV_ command to perform voluntary upgrade change of the class of service using surname");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $- entry for quick quote user {string}")
    public void iEnter$EntryForQuickQuoteUser(String QuoteType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $- entry for quick quote user "+QuoteType);
            isharesPage4.enter$EntryForQuickQuoteUser(logInfo,QuoteType);
            logInfo.pass("I enter $- entry for quick quote user "+QuoteType);

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:FE command to validate error message")
    public void iEnterFECommandToValidateErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:FE command to validate error message");
            isharesPage4.enterFECommandToValidateErrorMessage(logInfo);
            logInfo.pass("I enter 6:FE command to validate error message");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:I command {string}")
    public void iEnterICommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:I command "+Entry);
            isharesPage4.enterICommand(logInfo,Entry);
            logInfo.pass("I enter 6:I command "+Entry);

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIRQL command to validate PNL message")
    public void iEnterPIRQLCommandToValidatePNLMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIRQL command to validate PNL message ");
            isharesPage4.enterPIRQLCommandToValidatePNLMessage(logInfo);
            logInfo.pass("I enter PIRQL command to validate PNL message ");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-$ET_ command to do ticket adjustment 2 to 2 Irregular exchange")
    public void Enter_TicketAdjustment2_2() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$ET_ command to do ticket adjustment 2 to 2 Irregular exchange");
            isharesPage4.TicketAdjustment2_2(logInfo);
            logInfo.pass("I enter T-$ET_ command to do ticket adjustment 2 to 2 Irregular exchange");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CA command to mimic credit card response user")
    public void iEnterCACommandToMimicCreditCardResponseUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA command to mimic credit card response user");
            isharesPage4.enterCACommandToMimicCreditCardResponseUser(logInfo);
            logInfo.pass("I enter CA command to mimic credit card response user");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZAFIL command {string}")
    public void iEnterZAFILCommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL command "+Entry);
            isharesPage4.enterWAndZAFILCommand(logInfo,Entry);
            logInfo.pass("I enter ZAFIL command "+Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change adult passenger to FQTV pax {string}")
    public void iChangeAdultPassengerToFQTVPax(String FFNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change adult passenger to FQTV pax");
            isharesPage4.changeAdultPassengerToFQTVPax(logInfo,FFNumber);
            logInfo.pass("I change adult passenger to FQTV pax ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:Tag COMMAND")
    public void iEnterTagCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:Tag command");
            isharesPage4.enterTagCommand(logInfo);
            logInfo.pass("I enter 6:Tag command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2P command {string}")
    public void iEnterPCommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command {");
            isharesPage4.enterPCommand(logInfo,Entry);
            logInfo.pass("I enter 2P command {");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM command to modify TRUSTED DATA as NO in APIS for all Passengers")
    public void iEnterOCMCommandToModifyTRUSTEDDATAAsNOInAPISForAllPassengers() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I modify TRUSTED DATA as NO in APIS for all Passengers");
            isharesPage4.modifyAPISToNo(logInfo);
            logInfo.pass("I modify TRUSTED DATA as NO in APIS for all Passengers");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate advanced passenger information for trusted data as NO")
    public void iValidateAdvancedPassengerInformationForTrustedDataAsNO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate advanced passenger information for trusted data as NO");

            isharesPage4.advancePaxInfoNoTrusted(logInfo);
            logInfo.pass("I have validated advanced passenger information for trusted data as NO");


        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change adult passenger {string} to FQTV pax {string}")
    public void iChangeAdultPassengerToFQTVPax(String PaxIndex, String FQTVEntry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change adult passenger " +PaxIndex+ " to FQTV pax " + FQTVEntry);
            isharesPage4.changeAdultPassengerToFQTVPax(logInfo,PaxIndex,FQTVEntry);
            logInfo.pass("I change adult passenger " +PaxIndex+ " to FQTV pax " + FQTVEntry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZH_ command to display PNIS for multi initial pax")
    public void i_enter_6_ZH_command_to_display_PNIS_Multi_initial_pax() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to display PNIS for multi initial pax");
            isharesPage4.displayPNISMultiInitial(logInfo);
            logInfo.pass("I enter 6:ZH_ command to display PNIS for multi initial pax");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $-$- command for segment {string}")
    public void iEnter$$SCommandForSegment(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$- command for segment "+SegmentNumber);
            isharesPage4.enter$$CommandForSegment(logInfo,SegmentNumber);
            logInfo.pass("I enter $-$- command for segment "+SegmentNumber);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter SSR command for ssr type without 6P#ER {string}")
    public void ienter_addSSRWithout6PER(String SSrType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR command for ssr type without 6P#ER ");
            isharesPage4.addSSRWithout6PER(logInfo, SSrType);
            logInfo.pass("I enter SSR command for ssr type without 6P#ER ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD command to Display Selective reaccommadation list entries")
    public void I_enter_LD_command_to_Display_Selective_reaccommadation_list_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to Display Selective reaccommadation list entries ");
            isharesPage4.displaySelectiveReaccommadationListEntries(logInfo);
            logInfo.pass("I enter LD command to Display Selective reaccommadation list entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*CS_ command to check codeshare flight {string}")
    public void iEnterA_CS_CommandToCheckCodeshareFlight(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*CS_ command to check codeshare flight");
            isharesPage4.verifyCodeshareFlight(logInfo, flight);
            logInfo.pass("I enter A*CS_ command to check codeshare flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A- command to display the availability in the backward level {string}")
    public void iEnterA_CommandToDisplayTheAvailabilityInTheBackwardLevel(String level) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A- command to display the availability in the backward level");
            isharesPage4.enter_A_ForBackwardFltAvailability(logInfo, level);
            logInfo.pass("I enter A- command to display the availability in the backward level");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A command to display the flight availability from {string} to {string}")
    public void iEnterA_CommandToDisplayTheflightAvailability(String origin, String destination) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A command to display the flight availability");
            isharesPage4.enter_A_DisplaydFltAvailability(logInfo,origin,destination);
            logInfo.pass("I enter A command to display the flight availability");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Original Class Level Search entry {string}")
    public void iEnterOriginalClassLevelSearchEntry(String entry) {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Original Class Level Search entry");
            isharesPage4.originalClassLevelSearchEntry(logInfo,entry);
            logInfo.pass("I enter Original Class Level Search entry");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to assign the seat selected for ghost seat")
    public void iEnterCommandToAssignTheSeatSelectedForGhostSeat() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to assign the seat selected for ghost seat");
            isharesPage4.assignTheSeatSelectedForGhostSeat(logInfo);
            logInfo.pass("I enter command to assign the seat selected for ghost seat");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to perform voluntary denied boarding passengers for exclusive option")
    public void iEnterCommandToPerformVoluntaryDeniedBoardingPassengersForExclusiveOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to perform voluntary denied boarding passengers for exclusive option");
            isharesPage4.voluntaryDeniedBoardingPassengers_ExclusiveOption(logInfo);
            logInfo.pass("I enter command to perform voluntary denied boarding passengers for exclusive option");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-ZA command to activate ScorePNRs")
    public void iEnter_ZACommandToActivateScorePNRs() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-ZA command to activate ScorePNRs");
            isharesPage4.enter6ZAUseractivateScorePNRs(logInfo);
            logInfo.pass("I enter 6-ZA command to activate ScorePNRs");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LP_ and LW command to display lists of Priority and Main Waitlist Passengers")
    public void iEnterLP_AndLWCommandToDisplayListsOfPriorityAndMainWaitlistPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LP_ and LW command to display lists of Priority and Main Waitlist Passengers");
            isharesPage4.ToDisplayListsOfPriorityAndMainWaitlistPassengers(logInfo);
            logInfo.pass("I enter LP_ and LW command to display lists of Priority and Main Waitlist Passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LS command to display list of PNRs with Supplementary Information")
    public void iEnterLSCommandToDisplayListOfPNRsWithSupplementaryInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LS command to display list of PNRs with Supplementary Information");
            isharesPage4.toVerifyListOfPNRsWithSupplementaryInformation(logInfo);
            logInfo.pass("I enter LS command to display list of PNRs with Supplementary Information");


        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TETG Command")
    public void iEnterTETGCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETG_ command");
            isharesPage4.EnterTETG_Command(logInfo);
            logInfo.pass("I enter T-ETG_ command");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }

    @And("I enter T-ETG command")
    public void iEnter_TETGCommand_New() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETG_ command");

            isharesPage4.EnterTETG_Command(logInfo);
            logInfo.pass("I enter T-ETG_ command");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }

    @And("I enter TETP_ Command")
    public void iEnterTETP_Command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETP_ command");

            isharesPage4.EnterTETP_Command(logInfo);
            logInfo.pass("I enter T-ETP_ command");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }


    @And("I enter T-ETP_ command")
    public void iEnterTETP_Command_New() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETP_ command");

            isharesPage4.EnterTETP_Command(logInfo);
            logInfo.pass("I enter T-ETP_ command");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }


    @And("I enter *ET for displaying coupon of ticket after modifying the segment")
    public void iEnterETForDisplayingCouponOfTicketAfterModifyingTheSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET for displaying coupon of ticket after modifying the segment");

            isharesPage4.EnterET(logInfo);
            logInfo.pass("I enter *ET for displaying coupon of ticket after modifying the segment");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-$EIR_ET command to do irregular exchange")
    public void iEnterT$EIR_ETCommandToDoIrregularExchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EIR_ET command to do irregular exchange user");

            isharesPage4.EnterT$EIR_ET(logInfo);
            logInfo.pass("I enter T-$EIR_ET command to do irregular exchange");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter command to create PNR with details for passengers")
    public void iEnterCommandToCreatePNRWithDetailsForPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to create PNR with details for passengers");
            isharesPage4.ToCreatePNRWithDetailsForPassengers(logInfo);
            logInfo.pass("I enter command to create PNR with details for passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *FW COMMAND")
    public void iEnterFWCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FW command");
            isharesPage4.FWCommand(logInfo);
            logInfo.pass("I enter *FW command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I have done auto fare quote for passengers and segments {string} and {string} and {string} and {string}")
    public void Enter_autofarequotepricedsegments(String Seg1, String Seg2,String Seg3, String Seg4) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done auto fare quote for passengers and segments ");
            isharesPage4.autofarequotepricedsegments(logInfo,Seg1, Seg2,Seg3,Seg4);
            logInfo.pass("I have done auto fare quote for passengers and segments ");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I have done fare file quote for stored fare {string} and {string} and {string}")
    public void Enter_FareFileStored(String Seg1, String Seg2,String Seg3) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " I have done fare file quote for stored fare");
            isharesPage4.FareFileStored(logInfo,Seg1, Seg2,Seg3);
            logInfo.pass("I have done fare file quote for stored fare");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command C:D101* for Ticket agent recored")
    public void enter_TicketAgentRecored() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command C:D101* for Ticket agent recored");
            isharesPage4.TicketAgentRecored(logInfo);
            logInfo.pass("I enter command C:D101* for Ticket agent recored");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command GoShow PNR existing Ticket")
    public void enter_GoShowPNREsistingTicket() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command GoShow PNR existing Ticket");
            isharesPage4.GoShowPNREsistingTicket(logInfo);
            logInfo.pass("I enter command GoShow PNR existing Ticket");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ETCKPRICE comand to check TOTAL FARE FOR ALL ETKT")
    public void Enter_TOTALFAREFORALLETKT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETCKPRICE comand to check TOTAL FARE FOR ALL ETKT");
            isharesPage4.TOTALFAREFORALLETKT(logInfo);
            logInfo.pass("I enter T-ETCKPRICE comand to check TOTAL FARE FOR ALL ETKT");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command for uneven Exchange")
    public void Enter_UnevenExchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for uneven Exchange");
            isharesPage4.UnevenExchange(logInfo);
            logInfo.pass("I enter command for uneven Exchange");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command for TERMINAL SWITCHING-AST")
    public void Enter_TERMINALSWITCHING_AST() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for TERMINAL SWITCHING-AST");
            isharesPage4.TERMINALSWITCHING_AST(logInfo);
            logInfo.pass("I enter command for TERMINAL SWITCHING-AST");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to display FQTV number seatmap with bags seat assignment")
    public void Enter_FQTVNumberSeatmap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display FQTV number seatmap with bags seat assignment");
            isharesPage4.FQTVNumberSeatmap(logInfo);
            logInfo.pass("I enter command to display FQTV number seatmap with bags seat assignment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:TM command for undelivered message for the passengers")
    public void Enter_UndeliveredMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM command for undelivered message for the passengers");
            isharesPage4.UndeliveredMessage(logInfo);
            logInfo.pass("I enter 6:TM command for undelivered message for the passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command for addition of OSI Remark to the PNR")
    public void Enter_additionofOSIRemark() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for addition of OSI Remark to the PNR");
            isharesPage4.additionofOSIRemark(logInfo);
            logInfo.pass("I enter command for addition of OSI Remark to the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to display ESEAM2 Phase 2 records")
    public void I_enter_enterPhase2Records(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display ESEAM2 Phase 2 records");
            isharesPage4.enterPhase2Records(logInfo);
            logInfo.pass("I enter command to display ESEAM2 Phase 2 records");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZZGLO_ and ZUGLO_ commands to check the globals display")
    public void I_enter_checkGlobalsDisplay(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZZGLO_ and ZUGLO_ commands to check the globals display");
            isharesPage4.checkGlobalsDisplay(logInfo);
            logInfo.pass("I enter ZZGLO_ and ZUGLO_ commands to check the globals display");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to stop and restart creepers")
    public void I_enter_stopandrestartcreepers(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to stop and restart creepers");
            isharesPage4.stopandrestartcreepers(logInfo);
            logInfo.pass("I enter command to stop and restart creepers");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to display ETKT Baggage charges Display using ticket number")
    public void Ienter_ETKTBaggagechargesDisplaTticketnumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display ETKT Baggage charges Display using ticket number");
            isharesPage4.ETKTBaggagechargesDisplaTticketnumber(logInfo);
            logInfo.pass("I enter command to display ETKT Baggage charges Display using ticket number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter VIE command to clear waitList")
    public void Ienter_AVSmessagewithsegmentcombinedwithegs() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIE command to clear waitList");
            isharesPage4.AVSmessagewithsegmentcombinedwithegs(logInfo);
            logInfo.pass("I enter VIE command to clear waitList");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to add AVS pax details")
    public void Ienter_AVSmessagewithPaxDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add AVS pax details");
            isharesPage4.AVSmessagewithPaxDetails(logInfo);
            logInfo.pass("I enter command to add AVS pax details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I set FFno {string} for passanger")
    public void Ienter_setFFNumberForPax(String ffno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set FFno for passanger");
            isharesPage4.setFFNumberForPax(ffno);
            logInfo.pass("I set FFno for passanger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter commnad to update SSR OSI remarks")
    public void Ienter_updateSSROSIremarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter commnad to update SSR OSI remarks");
            isharesPage4.updateSSROSIremarks(logInfo);
            logInfo.pass("I enter commnad to update SSR OSI remarks");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter TTY message to create gds PNR with record locator {string}")
    public void I_enter_TTY_entry_GDSPNR(String locator){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to create gds PNR with record locator "+locator);
            isharesPage4.TTY_entry_GDSPNR(logInfo,locator);
            logInfo.pass("I enter TTY message to create gds PNR with record locator ");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to check ASA seat remarks info in PNL_ADL message")
    public void Ienter_ASAseatRemarksinfoInPNL() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check ASA seat remarks info in PNL_ADL message");
            isharesPage4.ASAseatRemarksinfoInPNL(logInfo);
            logInfo.pass("I enter command to check ASA seat remarks info in PNL_ADL message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *EH command EMD")
    public void Ienter_History_EMD() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH command EMD");
            isharesPage4.History_EMD(logInfo);
            logInfo.pass("I enter *EH command EMD");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$EI to INVOL FOR IRR EXCHANGE")
    public void I_enter_T_$EI_to_Invol_for_IRR_Exchange(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EI to INVOL FOR IRR EXCHANGE");
            isharesPage4.enterT$EIToInvolForIRRExchange(logInfo);
            logInfo.pass("I enter T-$EI to INVOL FOR IRR EXCHANGE");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *EH_ command to display specific ETKT history{string}")
    public void iEnterEH_CommandToDisplaySpecificETKTHistory(String SNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH_ command to display specific ETKT history");
            isharesPage4.ToDisplaySpecificETKTHistory(logInfo,SNo);
            logInfo.pass("I enter *EH_ command to display specific ETKT history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LD_PAX command to verify error message for Passenger List Display using marketing flight")
    public void iEnterLD_PAXCommandToVerifyErrorMessageForPassengerListDisplayUsingMarketingFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_PAX command to verify error message for Passenger List Display using marketing flight");
            isharesPage4.ToVerifyErrorMessageForPassengerListDisplayUsingMarketingFlight(logInfo);
            logInfo.pass("I enter 6:LD_PAX command to verify error message for Passenger List Display using marketing flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I replace the seat after check in and verify the response")
    public void iReplaceTheSeatAfterCheckInAndVerifyTheResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I replace the seat after check in and verify the response");
            isharesPage4.ReplaceTheSeatAfterCheckIn(logInfo);
            logInfo.pass("I replace the seat after check in and verify the response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 2_ command to get flight info for Star alliance Airline{string}")
    public void iEnter_CommandToGetFlightInfoForStarAllianceAirline(String Airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to get flight info for Star alliance Airline");
            isharesPage4.ToGetFlightInfoForStarAllianceAirline(logInfo,Airline);
            logInfo.pass("I enter 2_ command to get flight info for Star alliance Airline");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I reissue transactions with fare quote type{string}")
    public void iReissueTransactionsWithFareQuoteType(String FareQuote) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I reissue transactions with fare quote type");
            isharesPage4.EnterCommandToReissueTransactionsWithFareQuoteType(logInfo,FareQuote);
            logInfo.pass("I reissue transactions with fare quote type");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$EE_|@XFLAX command for reissuing the transaction")
    public void iEnterT$EE_XFLAXCommandForReissuingTheTransaction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EE_|@XFLAX command for reissuing the transaction");
            isharesPage4.EnterT$EE_XFLAXCommandForReissuingTheTransaction(logInfo);
            logInfo.pass("I enter T-$EE_|@XFLAX command for reissuing the transaction");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *ET_ command for specific pax{string}")
    public void iEnterET_CommandForSpecificPax(String Number) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_ command for specific pax");
            isharesPage4.EnterET_CommandForSpecificPax(logInfo,Number);
            logInfo.pass("I enter *ET_ command for specific pax");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $:$:*NUC Neutral Unit of Currency")
    public void I_enter_$_$_NUC_Neutral_Unit_of_Currency(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $:$:*NUC Neutral Unit of Currency");
            isharesPage4.enter$$NUCNeutralUnitOfCurrency(logInfo);
            logInfo.pass("I enter $:$:*NUC Neutral Unit of Currency");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:_@B command to Replace the bag count and Passenger details {string} {string}")
    public void I_enter_6_B_command_to_Replace_the_bag_count_and_passenger_details(String BaggageWeight, String BaggageCount){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:_@B command to Replace the bag count and Passenger details");
            isharesPage4.enter6BCommandToReplaceTheBagCountandPassengerDetails(logInfo, BaggageWeight, BaggageCount);
            logInfo.pass("I enter 6:_@B command to Replace the bag count and Passenger details");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);
        }
    }
    @And("I enter 6_KT* command to do mass transfer with APIS")
    public void I_enter_6_KT_command_to_do_mass_transfer_with_APIS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_KT* command to do mass transfer with APIS");
            isharesPage4.enter6KTCommandToDoMassTransferWithAPIS(logInfo);
            logInfo.pass("I enter 6_KT* command to do mass transfer with APIS");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter CA Currency user {string} {string} {string}")
    public void I_enter_CA_Currency_User(String CardNumber, String ExpiryDate, String CardType){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA Currency user");
            isharesPage4.enterCACurrencyUser(logInfo, CardNumber,ExpiryDate,CardType );
            logInfo.pass("I enter CA Currency user");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I do unchecking of baggage for {string} pax")
    public void iDoUncheckingOfBaggageForPax(String paxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do unchecking of baggage for pax");
            isharesPage4.uncheckBagAndPaxDetails(logInfo,paxIndex);
            logInfo.pass("I do unchecking of baggage for pax");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter checkin cmd for FQTV pax {string} with heavy baggage and verify error")
    public void iEnterCheckinCmdForFQTVPaxWithHeavyBaggageAndVerifyError(String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter checkin cmd for FQTV pax with heavy baggage and verify error");
            isharesPage4.verifyFQTVCheckinError(logInfo,index);
            logInfo.pass("I enter checkin cmd for FQTV pax with heavy baggage and verify error");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ETUSED command to make the status CM used")
    public void iEnterTETUSEDCommandToMakeTheStatusCMUsed() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETUSED command to make the status CM used");
            isharesPage4.changeCMStatus(logInfo);
            logInfo.pass("I enter T-ETUSED command to make the status CM used");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command for irregular exchange for single passenger single segment")
    public void iEnterCommandForIrregularExchangeForSinglePassengerSingleSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for irregular exchange for single passenger single segment");
            isharesPage4.irregularExch(logInfo);
            logInfo.pass("I enter command for irregular exchange for single passenger single segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *EH_ {string} command to display the ETKT history")
    public void iEnterEH_CommandToDisplayTheETKTHistory(String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH_ {string} command to display the ETKT history");
            isharesPage4.displayETKTHistory(logInfo,index);
            logInfo.pass("I enter *EH_ {string} command to display the ETKT history");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click on Send button")
    public void iClickOnSendButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Send button");
            isharesPage4.clickSendButton(logInfo);
            logInfo.pass("I click on Send button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I validate popup message {string}")
    public void iValidatePopupMessage(String msg) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate popup message");
            isharesPage4.verifyPopupMsg(logInfo,msg);
            logInfo.pass("I validate popup message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @Then("I enter LOGC CMRE in text field")
    public void iEnterLOGCCMREInTextField() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LOGC CMRE in text field");
            isharesPage4.enter_LOGC_CMRE_Text(logInfo);
            logInfo.pass("I enter LOGC CMRE in text field");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @Then("I click on reset button and clear input text field")
    public void iClickOnResetButtonAndClearInputTextField() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on reset button and clear input text field");
            isharesPage4.verifyResetButtonClearTextField(logInfo);
            logInfo.pass("I click on reset button and clear input text field");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter check in command to update baggage {string} passenger {string} details and verify error {string}")
    public void iEnterCheckInCommandToUpdateBaggagePassengerDetailsAndVerifyError(String paxindex, String entry, String errorMsg) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter check in command to update baggage and verify error");
            isharesPage4.updateBagAndVerifyError(logInfo,paxindex,entry,errorMsg);
            logInfo.pass("I enter check in command to update baggage and verify error");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:R*_ command to add FQTV number")
    public void iEnterR_CommandToAddFQTVNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:R*_ command to add FQTV number");
            isharesPage4.enter6R_FQTVCommand(logInfo);
            logInfo.pass("I enter 6:R*_ command to add FQTV number");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter FC|YGBP to support fare amounts up to 9 digits")
    public void I_enter_FC_YGBP_to_Support_Fare_Amount_Upto_9_Digits(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FC|YGBP to support fare amounts up to 9 digits");
            isharesPage4.enterFCYGBP_To_Support_Fare_Amount_Upto_9_Digits(logInfo);
            logInfo.pass("I enter FC|YGBP to support fare amounts up to 9 digits");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FC|CCALC COMMAND")
    public void I_enter_Fc_CCALC_Command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FC|CCALC Command");
            isharesPage4.enterFCCCALC_Command(logInfo);
            logInfo.pass("I enter FC|CCALC Command");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6PR|ER COMMAND")
    public void I_enter_6PR_ER_Command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6PR|ER command");
            isharesPage4.enter6PR_ER_Command(logInfo);
            logInfo.pass("I enter 6PR|ER command");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-$EI_ command to even exchange")
    public void I_enter_T_$EI_Command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EI_ command to even exchange");
            isharesPage4.Enter_T_$EI_Command(logInfo);
            logInfo.pass("I enter T-$EI_ command to even exchange");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QC_REF_63 Command")
    public void I_enter_QC_REF_63_Command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QC_REF_63 command");
            isharesPage4.enterQC_REF_63_Command(logInfo);
            logInfo.pass("I enter QC_REF_63 command");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$UE_FCASH_ command for ticket reissue")
    public void I_enter_T_$UE_FCASH_Command(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$UE/FCASH_ command for ticket reissue");
            isharesPage4.reissueTicket(logInfo);
            logInfo.pass("I enter T-$UE/FCASH_ command for ticket reissue");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-$_ command for credit card FOP extended payment for host issue or reissue")
    public void I_enter_T_$_Command_for_CCFOP_for_HostIssue(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$_ command for credit card FOP extended payment for host issue or reissue");
            isharesPage4.CreditCardPayment_For_HostIssueReissue(logInfo);
            logInfo.pass("I enter T-$_ command for credit card FOP extended payment for host issue or reissue");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FF Command")
    public void I_enter_FF_Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FF command");
            isharesPage4.enterFFCommand(logInfo);
            logInfo.pass("I enter FF command");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter DX*TA_ commands")
    public void I_enter_DX_TA_Commands(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DX*TA_ commands");
            isharesPage4.enterDX_TA_Commands(logInfo);
            logInfo.pass("I enter DX*TA_ commands");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter DC$B_ command to run the auxiliary entries")
    public void I_enter_DC_B_Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DC$B_ command to run the auxiliary entries");
            isharesPage4.enterDC_B_Commands(logInfo);
            logInfo.pass("I enter DC$B_ command to run the auxiliary entries");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter DX_PFC_ command to run the auxiliary entries")
    public void I_enter_DX_PFC_Commands(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DX_PFC_ command to run the auxiliary entries");
            isharesPage4.enter_DX_PFC_Command(logInfo);
            logInfo.pass("I enter DX_PFC_ command to run the auxiliary entries");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $_BFH command to run the auxiliary entries")
    public void I_enter_$_BFH_Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_BFH command to run the auxiliary entries");
            isharesPage4.enter_$_BFH_Command(logInfo);
            logInfo.pass("I enter $_BFH command to run the auxiliary entries");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter DC_I_NUC_ command to run the auxiliary entries")
    public void I_enter_DC_I_NUC__Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DC_I_NUC_ command to run the auxiliary entries");
            isharesPage4.enter_DC_I_NUC__Command(logInfo);
            logInfo.pass("I enter DC_I_NUC_ command to run the auxiliary entries");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter DX_ command to run the auxiliary entries")
    public void I_enter_DX_Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DX_ command to run the auxiliary entries");
            isharesPage4.enterDX_Commands(logInfo);
            logInfo.pass("I enter DX_ command to run the auxiliary entries");
        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter D$_ commands to run the auxiliary entries")
    public void I_enter_D$_Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter D$_ commands to run the auxiliary entries");
            isharesPage4.enterD$_Commands(logInfo);
            logInfo.pass("I enter D$_ commands to run the auxiliary entries");
        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter DN_ commands to run the auxiliary entries")
    public void I_enter_DN_Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DN_ commands to run the auxiliary entries");
            isharesPage4.enterDN_Commands(logInfo);
            logInfo.pass("I enter DN_ commands to run the auxiliary entries");
        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter $_PTYEZE commands to run the branded fares entries")
    public void I_enter_$_PTYEZE_Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_PTYEZE commands to run the branded fares entries");
            isharesPage4.enter_$_PTYEZE_Commands(logInfo);
            logInfo.pass("I enter $_PTYEZE commands to run the branded fares entries");
        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $_PTYEZE more commands to run the branded fares entries")
    public void I_enter_$_PTYEZE_More_Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_PTYEZE more commands to run the branded fares entries");
            isharesPage4.enter_$_PTYEZE_More_Commands(logInfo);
            logInfo.pass("I enter $_PTYEZE more commands to run the branded fares entries");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter D$_ more commands to run the auxiliary entries")
    public void I_enter_D$_More_Command(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter D$_ more commands to run the auxiliary entries");
            isharesPage4.enterD$_More_Commands(logInfo);
            logInfo.pass("I enter D$_ more commands to run the auxiliary entries");
        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-C* command to display Inbound connections")
    public void iEnterCCommandToDisplayInboundConnections() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-C* command to display Inbound connections");
            isharesPage4.displayInboundConnection(logInfo);
            logInfo.pass("I enter 6-C* command to display Inbound connections");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:CD_* command with Fleet Name {string}")
    public void iEnterCD_CommandWithFleetName(String fleetName) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CD_* command with Fleet Name");
            isharesPage4.enterCommandwithFleetName(logInfo, fleetName);
            logInfo.pass("I enter 6:CD_* command with Fleet Name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZAFIL commands {string}")
    public void iEnterZAFILCommands(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL commands ");
            isharesPage4.enterZAFILCommand(logInfo, Entry);
            logInfo.pass("I enter ZAFIL commands ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I do refund using T-$UE with uneven exchange {string} and {string}")
    public void iDoRefundUsingT$UEWithUnevenExchangeAnd(String SegSequence, String RefundType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make uneven exchange refund");

            isharesPage4.RefundwithExchange(logInfo, SegSequence, RefundType);
            logInfo.pass("I make uneven exchange refund");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter 6:LD command to perform checkin for oversold passenger")
    public void iEnterLDCommandToPerformCheckinForOversoldPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to perform checkin for oversold passenger");
            isharesPage4.enter6LDCommandForOversold(logInfo);
            logInfo.pass("I enter 6:LD command to perform checkin for oversold passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter check in command to update baggage and passenger details")
    public void iEnterCheckInCommandToUpdateBaggageAndPassengerDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter check in command to update baggage and passenger details");
            isharesPage4.updateBagAndPaxDetailsUsingCheckin(logInfo);
            logInfo.pass("I enter check in command to update baggage and passenger details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:R@ command for re-entry with status change")
    public void iEnterRCommandForReEntryWithStatusChange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:R@ command for re-entry with status change");
            isharesPage4.enter6RCommand_to_PerforormStatusChange(logInfo);
            logInfo.pass("I enter 6:R@ command for re-entry with status change");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter D command to divide the PNR using pax count {string}")
    public void iEnterDCommandToDivideThePNRUsingPaxCount(String PaxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I divide the pnr for passenger index " + PaxIndex);
            isharesPage4.enterDCommandTodividePnr(logInfo, PaxIndex);
            logInfo.pass("I divide the pnr for passenger index " + PaxIndex);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }
    @And("I enter 6:R$ command for check-in re-entry for upgrade seats")
    public void iEnterR$CommandForCheckInReEntryForUpgradeSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:R$ command for check-in re-entry for upgrade seats");
            isharesPage4.enterR$CommandForUpgradeSeat(logInfo);
            logInfo.pass("I enter 6:R$ command for check-in re-entry for upgrade seats");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:R|NW command for seat change")
    public void iEnterRNWCommandForSeatChange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:R|NW command for seat change");
            isharesPage4.enter6RNWCommand(logInfo);
            logInfo.pass("I enter 6:R|NW command for seat change");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:U_ command to uncheck the passenger")
    public void iEnterU_CommandToUncheckThePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:U_ command to uncheck the passenger ");
            isharesPage4.enterU_CommandToUncheckThePassenger(logInfo);
            logInfo.pass("I enter 6:U_ command to uncheck the passenger ");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6_$PR1|U command to upgrade passenger")
    public void iEnter_$PRUCommandToUpgradePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_$PR1|U command to upgrade passenger");
            isharesPage4.enter6$PRCommandWithUpgrade(logInfo);
            logInfo.pass("I enter 6_$PR1|U command to upgrade passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T- commands for different ticketing functions like {string}")
    public void iEnterTCommandsForDifferentTicketingFunctionsLike(String value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T- commands");
            isharesPage4.enterTCommands(logInfo, value);
            logInfo.pass("I enter T- commands");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-OSS command to manually generate the IATA PFS messages")
    public void iEnterOSSCommandToManuallyGenerateTheIATAPFSMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " enter 6-OSS command to manually generate the IATA PFS messages");
            isharesPage4.enter6OSSCommand(logInfo);
            logInfo.pass(" enter 6-OSS command to manually generate the IATA PFS messages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability for united airlines from {string} to {string}")
    public void iSearchForFlightAvailabilityForUnitedAirlinesFromTo(String OriginCity, String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "Search for flight availability for united airlines");
            isharesPage4.searchFlightAvailabilityForUnitedAirline(logInfo, OriginCity,Destination);
            logInfo.pass("Search for flight availability for united airlines");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LD command for United Airlines")
    public void iEnterLDCommandForUnitedAirlines() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command for United Airlines");
            isharesPage4.LDCommandForUnitedAirlines(logInfo);
            logInfo.pass("I enter LD command for United Airlines");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter L* command for united airlines")
    public void iEnterLCommandForUnitedAirlines() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter L* command for United Airlines");
            isharesPage4.enterLCommandForUnitedAirlines(logInfo);
            logInfo.pass("I enter L* command for United Airlines");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter TTY message to generate pnr for same surname passenger for system {string} with SSR {string}")
    public void iEnterTTYMessageToGeneratePnrForSameSurnamePassengerForSystemWithSSR(String SystemType, String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage4.TTYMessageSameSurnamePassengerPnrWithSSR(logInfo, SystemType, SSRType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter L_$ {string} command to verify Item Identification in Request for lowest Available Fare")
    public void iEnterL_$CommandToVerifyItemIdentificationInRequestForLowestAvailableFare(String value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter L_$ command to verify Item Identification in Request for lowest Available Fare");
            isharesPage4.LA$CommandToGetLowestAvailableFare(logInfo, value);
            logInfo.pass("I enter L_$ command to verify Item Identification in Request for lowest Available Fare");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter L_$R {string} command to verify Lower Fare is Available with Rebooking")
    public void iEnterL_$RCommandToVerifyLowerFareIsAvailableWithRebooking(String value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter L_$R command to verify Lower Fare is Available with Rebooking");
            isharesPage4.L_$RCommandToGetLowestAvailableFare(logInfo, value);
            logInfo.pass("I enter L_$R command to verify Lower Fare is Available with Rebooking");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter the command $: to display fares between two cities of {string}")
    public void iEnterTheCommand$ToDisplayFaresBetweenTwoCities(String type) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the command $: to display fares between two cities");
            isharesPage4.CommandToDisplayFaresBetweenTwoCities(logInfo, type);
            logInfo.pass("I enter the command $: to display fares between two cities");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter auto fare quote command of different type {string}")
    public void iEnterAutoFareQuoteCommandOfDifferentType(String type) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the command $: to display fares between two cities");
            isharesPage4.AutoFareQuoteCommandOfDifferentType(logInfo, type);
            logInfo.pass("I enter the command $: to display fares between two cities");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $:A_ command to check the flight availability of the format {string}")
    public void iEnter$A_CommandToCheckTheFlightAvailabilityOfTheFormat(String type) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $:A_ command to check the flight availability of the format");
            isharesPage4.A_CommandToCheckTheFlightAvailabilityOfTheFormat(logInfo,type);
            logInfo.pass("I enter $:A_ command to check the flight availability of the format");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $:S_ command to display the flight schedule with the option {string}")
    public void iEnter$S_CommandToDisplayTheFlightScheduleWithTheOption(String option) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $:S_ command to display the flight schedule with the option");
            isharesPage4.CommandToDisplayTheFlightScheduleWithTheOption(logInfo,option);
            logInfo.pass("I enter $:S_ command to display the flight schedule with the option");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter the command ._@{string} to rebook for the segment {string}")
    public void iEnterTheCommand_AToRebookForTheSegment(String cos, String segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the command to rebook for the segment");
            isharesPage4.rebookForParticularSegment(logInfo, cos, segment);
            logInfo.pass("I enter the command to rebook for the segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I replace the particular passenger {string} to Adult from the list {string}")
    public void i_replace_the_particular_passenger_to_Adult_from_the_list(String passengerToReplace, String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I replace the particular passenger to Adult from the list");
            isharesPage4.replaceParticularPassengerToADT(logInfo, passengerToReplace, index);
            logInfo.pass("I replace the particular passenger to Adult from the list");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter D_ command to divide the PNR for three passengers {string}")
    public void I_enter_D_command_to_divide_the_PNR_for_three_passengers(String noOfPaxToDivide) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter D_ command to divide the PNR using the number of passengers to divide");
            isharesPage4.dividePNRUsingPaxNumberToDividePassengers(logInfo, noOfPaxToDivide);
            logInfo.pass("I enter D_ command to divide the PNR using the number of passengers to divide");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I retrieve the third PNR after dividing the already created PNR")
    public void iRetrieveTheThirdPNRAfterDividingTheAlreadyCreatedPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the third PNR after dividing the already created PNR");
            isharesPage4.retrieveThirdPNRAfterDividing(logInfo);
            logInfo.pass("I retrieve the third PNR after dividing the already created PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD|PAX command to Add Message SHARES entries without firstname")
    public void iEnterLDPAXCommandToAddMessageSHARESEntriesWithoutFirstName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD|PAX command to Add Message SHARES entries");
            isharesPage4.enter6LDPAXCommandWithOutFN(logInfo);
            logInfo.pass("I enter 6:LD|PAX command to Add Message SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_$PR1|U command to upgrade passenger for checkin")
    public void iEnter_$PRUCommandToUpgradePassengerForCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_$PR1|U command to upgrade passenger for checkin");
            isharesPage4.checkInReentryWithUpgradeForAllPax(logInfo);
            logInfo.pass("I enter 6_$PR1|U command to upgrade passenger for checkin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:TM and 6:LTM command by adding message {string}")
    public void iEnterTMAndLTMCommandByAddingMessage(String msg) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM and 6:LTM command by adding message");
            isharesPage4.enter6TMAnd6LTMToAddMessage(logInfo, msg);
            logInfo.pass("I enter 6:TM and 6:LTM command by adding message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:R|B command to replace the baggage count")
    public void iEnterRBCommandToReplaceTheBaggageCount() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:R|B command to replace the baggage count");
            isharesPage4.replacingTheBaggageCount(logInfo);
            logInfo.pass("I enter 6:R|B command to replace the baggage count");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I change pax to INS for the index {string}")
    public void iChangePaxToINS(String PaxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change pax to INS "+PaxIndex);
            isharesPage4.changePaxToINS(logInfo,PaxIndex);
            logInfo.pass("I change pax to INS "+PaxIndex);
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I delete SSR from the PNR for SSR type {string}")
    public void iDeleteSSRFromThePNRForSSRType(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete SSR from the PNR for SSR type " + SSRType);
            isharesPage4.deleteSSRFromPnr(logInfo, SSRType);
            logInfo.pass("I delete SSR from the PNR for SSR type " + SSRType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I update OSI Remark From PNR with {string}")
    public void iUpdateOSIRemarkFromPNRWith(String updateRemark) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I update OSI Remark From PNR with " + updateRemark);
            isharesPage4.updateOSIRemarkFromPnr(logInfo, updateRemark);
            logInfo.pass("I update OSI Remark From PNR with " + updateRemark);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:*L command to display Similar Name List entries")
    public void iEnterLCommandToDisplaySimilarNameListEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*L command to display Similar Name List entries");
            isharesPage4.CommandToDisplaySimilarNameListEntries(logInfo);
            logInfo.pass("I enter 6:*L command to display Similar Name List entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I make the payment using check for the specified quote number {string}")
    public void iMakeThePaymentUsingCheckForTheSpecifiedQuoteNumber(String quotenumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the payment using check for the specified quote number");
            isharesPage4.PaymentUsingCheckForTheSpecifiedQuoteNumber(logInfo,quotenumber);
            logInfo.pass("I make the payment using check for the specified quote number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *ET{string} command to display individual coupons")
    public void iEnterETDoDisplayIndividualCoupons(String coupon_no) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ET_ command display individual coupons");
            isharesPage4.DisplayIndividualCoupons(logInfo, coupon_no);
            logInfo.pass("I enter ET_ command display individual coupons");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I perform mass transfer by specifying the number of passengers {string}")
    public void iPerformMassTransfer(String paxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform mass transfer");
            isharesPage4.performMassTransferForSpecificNumberOfPax(logInfo,paxCount);
            logInfo.pass("I perform mass transfer");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I change the passengers from normal to FQTV type for {string}")
    public void iChangeThePassengersFromNormalToFQTVType(String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details");
            isharesPage4.ChangePassengertoFQTV(logInfo,index);
            logInfo.pass("I enter passenger details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I perform Adjustment on ETKT Coupon via 1 to 1 Irregular Exchange")
    public void iPerformAdjustmentOnETKTCouponViaToIrregularExchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Adjustment on ETKT Coupon via 1 to 1 Irregular Exchange");
            isharesPage4.PerformAdjustmentOnETKTCoupon(logInfo);
            logInfo.pass("I perform Adjustment on ETKT Coupon via 1 to 1 Irregular Exchange");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:TM to add message to the passenger {string}")
    public void iEnterTMToAddMessage(String passenger) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM to add message message");
            isharesPage4.enter6TMToAddMessageToSpecificPassenger(logInfo, passenger);
            logInfo.pass("I enter 6:TM to add message message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:TM to modify the message to the passenger {string} for origin {string}")
    public void iEnterTMToModifyTheMessageToThePassenger(String passenger, String Origin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM to Modify the message");
            isharesPage4.enter6TMToModifyMessageToSpecificPassenger(logInfo, passenger,Origin);
            logInfo.pass("I enter 6:TM to Modify the message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:ZH command to display the PNIS for a particular id")
    public void iEnterZHCommandToDisplayThePNISForAParticularId() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH command to display the PNIS for a particular id");
            isharesPage4.displayPNISBasedOnID(logInfo);
            logInfo.pass("I enter 6:ZH command to display the PNIS for a particular id");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:PRN command to display Reconcile Enter status")
    public void iEnterPRNCommandToDisplayReconcileEnterStatus() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRN command to display Reconcile Enter status");
            isharesPage4.displayReconcileEnterStatusWithSequenceNumber(logInfo);
            logInfo.pass("I enter 6:PRN command to display Reconcile Enter status");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:PRN_|@_ command to cancel passenger sequence numbers")
    public void iEnterPRN__CommandToCancelPassengerSequenceNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRN_|@_ command to cancel passenger sequence number");
            isharesPage4.cancelPassengerWithSequenceNumber(logInfo);
            logInfo.pass("I enter 6:PRN_|@_ command to cancel passenger sequence number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:PR_*UNREC command to display passenger unreconcile name list and capture the sequence number and seat details")
    public void iEnter6PR_UNRECCommandToDisplayPassengerUnreconcileNameListAndCaptureTheSequenceNumberAndSeatDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR_*UNREC command to display passenger unreconcile name list");
            isharesPage4.Enter6PR_UNRECCommandToDisplayPassengerUnreconcileNameListAndCaptureTheSequenceNumberAndSeatDetails(logInfo);
            logInfo.pass("I enter 6:PR_*UNREC command to display passenger unreconcile name list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:PRS_ command to reconcile using passenger seat numbers")
    public void iEnterPRS_CommandToReconcileUsingPassengerSeatNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRS_ command to reconcile using passenger seat numbers");
            isharesPage4.EnterPRS_CommandToReconcileUsingPassengerSeatNumbers(logInfo);
            logInfo.pass("I enter 6:PRS_ command to reconcile using passenger seat numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:PRS_|@_ command to cancel reconcile using passenger seat numbers")
    public void iEnter6PRS__CommandToCancelReconcileUsingPassengerSeatNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRS_|@_ command to cancel reconcile using passenger seat numbers");
            isharesPage4.EnterPRS_CommandToCancelReconcileUsingPassengerSeatNumbers(logInfo);
            logInfo.pass("I enter 6:PRS_|@_ command to cancel reconcile using passenger seat numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZAFIL command to update BUS-ID for passenger {string}")
    public void iEnterZAFILCommandToUpdateBUSIDForPassenger(String ID) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL command to update BUS-ID for passenger");
            isharesPage4.enterZAFILForUpdatingTheBUSID(logInfo, ID);
            logInfo.pass("I enter ZAFIL command to update BUS-ID for passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I add the passenger name in different format starting with the name {string}")
    public void iAddThePassengerNameInDifferentFormatStartingWithTheName(String name) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the passenger name in different format starting with the specified name");
            isharesPage4.AddThePassengerNameInDifferentFormat(logInfo, name);
            logInfo.pass("I add the passenger name in different format starting with the specified name");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6_command to verify PNR modify message")
    public void iEnter_commandToVerifyPNRModifyMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_command to verify PNR modify message");
            isharesPage4.enter6_CommandVerifyPNRModifyMessage(logInfo);
            logInfo.pass("I enter 6_command to verify PNR modify message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Q*COHOST_ORG_RD command and verify response")
    public void iEnterQCOHOST_ORG_RDCommandAndVerifyResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*COHOST_ORG_RD command and verify response");
            isharesPage4.enterCOHOST_RD_Command(logInfo);
            logInfo.pass("I enter Q*COHOST_ORG_RD command and verify response");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 5$_ command for card")
    public void iEnter$_CommandForCard() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5$_ command for card");
            isharesPage4.runThe5_CommandCC_AX(logInfo);
            logInfo.pass("I enter 5$_ command for card");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9_N000 command to add phone numbers")
    public void iEnter_NCommandToAddPhoneNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9_N000 command to add phone numbers");
            isharesPage4.enter9_Command(logInfo);
            logInfo.pass("I enter 9_N000 command to add phone numbers");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7TAE for the flight")
    public void iEnterTAEForTheFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7TAE for the flight");
            isharesPage4.enter7TAEForFlight(logInfo);
            logInfo.pass("I enter 7TAE for the flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter different CA command {string}")
    public void iEnterDifferentCACommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter different CA command");
            isharesPage4.runDifferentCA_Entries(logInfo,Entry);
            logInfo.pass("I enter different CA command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T_HMDT command for device table display")
    public void iEnterT_HMDTCommandForDeviceTableDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_HMDT command for device table display");
            isharesPage4.runT_HMDT_Entry(logInfo);
            logInfo.pass("I enter T_HMDT command for device table display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I set invalid FF number for FQTV pax")
    public void iSetInvalidFFNumberForFQTVPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set invalid FF number for FQTV pax");
            isharesPage4.setInvalidFFNumber(logInfo);
            logInfo.pass("I set invalid FF number for FQTV pax");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter KA command to Display in Detail One Schedule of a Flight Number")
    public void iEnterKACommandToDisplayInDetailOneScheduleOfAFlightNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KA command to Display in Detail One Schedule of a Flight Number");
            isharesPage4.KACommandToDisplayInDetailOneScheduleOfAFlightNumber(logInfo);
            logInfo.pass("I enter KA command to Display in Detail One Schedule of a Flight Number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:H command to Perform held seat assignment for the passenger")
    public void iEnterHCommandToPerformHeldSeatAssignmentForThePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:H command to Perform held seat assignment for the passenger");
            isharesPage4.enter6HCommandForHeldSeat(logInfo);
            logInfo.pass("I enter 6:H command to Perform held seat assignment for the passenger");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:XP to automate formate to PNR")
    public void I_enter_6_XP_to_automate_formate_to_pnr(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:XP to automate formate to PNR");
            isharesPage4.enter6XPToAutomateFormateToPNR(logInfo);
            logInfo.pass("I enter 6:XP to automate formate to PNR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I change the name of the passenger in {string} to a different name and replace in {string} passenger list")
    public void iChangeTheNameOfThePassengerInToADifferentNameAndReplaceInPassengerList(String index, String indexPaxList) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the name of the passenger to a different name and replace in passenger list");
            isharesPage4.changeAndReplacePaxNameInPaxList(logInfo, index,indexPaxList);
            logInfo.pass("I change the name of the passenger to a different name and replace in passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to get the operating carrier from DEI50 for building the pricing")
    public void enter_command_gettheoperatingcarrier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to get the operating carrier from DEI50 for building the pricing");
            isharesPage4.entercommand_gettheoperatingcarrier(logInfo);
            logInfo.pass("I enter command to get the operating carrier from DEI50 for building the pricing");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-LD command to display the name list")
    public void iEnterLDCommandToDisplayTheNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-LD command to display the name list");
            isharesPage4.iEnterLDCommandToDisplayTheNameList(logInfo);
            logInfo.pass("I enter 6-LD command to display the name list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$CC command payment using CC")
    public void enter_TCC_paymentusingCC() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$CC command payment using CC");
            isharesPage4.enter_TCC_paymentusingCC(logInfo);
            logInfo.pass("I enter T-$CC command payment using CC");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to update the AVL option with service designator table")
    public void iEnterCommandToUpdateTheAVL_optionWithServiceDesignatorTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to update the AVL option with service designator table");
            isharesPage4.updateAVL_ServiceDesignatorTable(logInfo);
            logInfo.pass("I enter command to update the AVL option with service designator table");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I add SSR SYNCHRONIZE during etkt synch")
    public void iAddSSRSYNCHRONIZEDuringEtktSynch() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add SSR SYNCHRONIZE during etkt synch");
            isharesPage4.iAddSSRSYNCHRONIZEDuringEtktSynch(logInfo);
            logInfo.pass("I add SSR SYNCHRONIZE during etkt synch");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I run the OSI Fact SHARES entries WithoutREntries")
    public void iRunTheOSIFactSHARESEntriesWithoutREntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the OSI Fact SHARES entries WithoutREntries");
            isharesPage4.runOSIFactEntriesWithoutREntries(logInfo);
            logInfo.pass("I run the OSI Fact SHARES entries WithoutREntries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6RW")
    public void iEnterRW() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6RW");
            isharesPage4.enter6RWCommand(logInfo);
            logInfo.pass("I enter 6RW");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $-$-PADT|INF|ADT to make payment using dinners")
    public void I_enter_$_$_PADT_INF_ADT_to_make_payment_using_dinners(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-PADT|INF|ADT to make payment using dinners");
            isharesPage4.enter$$PADTINFADTtoMakePaymentTypeusingDinners(logInfo);
            logInfo.pass("I enter $-$-PADT|INF|ADT to make payment using dinners");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T_RAQ_ command to perform replace")
    public void I_enter_T_RAQ_command_to_perform_replace(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAQ_ command to perform replace");
            isharesPage4.enterTRAQCommandToPerformreplace(logInfo);
            logInfo.pass("I enter T_RAQ_ command to perform replace");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T_RAQ_ command to perform replace an Ticketing remarks")
    public void I_enter_T_RAQ_command_to_perform_replace_an_Ticketing_remarks(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAQ_ command to perform replace an Ticketing remarks");
            isharesPage4.enterTRAQCommandToPerformReplaceAnTicketingRemarks(logInfo);
            logInfo.pass("I enter T_RAQ_ command to perform replace an Ticketing remarks");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-N command to invalidate")
    public void I_enter_T_N_command_to_invalidate(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-N command to invalidate");
            isharesPage4.enterTNCommandToInvalidate(logInfo);
            logInfo.pass("I enter T-N command to invalidate");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$CC payment with card")
    public void I_enter_T_$CC_Payment_with_card(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$CC payment with card");
            isharesPage4.enterT$CCPaymentWithCard(logInfo);
            logInfo.pass("I enter T-$CC payment with card");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*|LINK command to linking the trap")
    public void iEnterOCMLINKCommandToLinkingTheTrap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*|LINK command to linking the trap");
            isharesPage4.enterOCMQLINKCommand(logInfo);
            logInfo.pass("I enter OCM*|LINK command to linking the trap");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*YSV1 CLR command to clear the trap")
    public void iEnterOCMYSVCLRCommandToClearTheTrap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*YSV1 CLR command to clear the trap");
            isharesPage4.enterOCMCLRCommand(logInfo);
            logInfo.pass("I enter OCM*YSV1 CLR command to clear the trap");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*YSV1 LNIATA command to adding the lniata to trap")
    public void iEnterOCMYSVLNIATACommandToAddingTheLniataToTrap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*YSV1 LNIATA command to adding the lniata to trap");
            isharesPage4.enterOCMLNIATACommand(logInfo);
            logInfo.pass("I enter OCM*YSV1 LNIATA command to adding the lniata to trap");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*YSV1 COUNT command to adding the count to trap")
    public void iEnterOCMYSVCOUNTCommandToAddingTheCountToTrap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*YSV1 COUNT command to adding the count to trap");
            isharesPage4.enterOCMCOUNTCommand(logInfo);
            logInfo.pass("I enter OCM*YSV1 COUNT command to adding the count to trap");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter X command for cancel the segment {string}")
    public void iEnterXCommandForCancelTheSegment(String segmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X command for cancel the segment");
            isharesPage4.enterX_ForCancelSegment(logInfo, segmentNo);
            logInfo.pass("I enter X command for cancel the segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*YSV1 * command to display the edifacts message")
    public void iEnterOCMYSVCommandToDisplayTheEdifactsMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*YSV1 * command to display the edifacts message");
            isharesPage4.enterOCM_YSV1(logInfo);
            logInfo.pass("I enter OCM*YSV1 * command to display the edifacts message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:GV command to upgrade higher cabin with each pax {string}")
    public void iEnterGVCommandToUpgradeHigherCabinWithEachPax(String COS1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:GV command to upgrade higher cabin with each pax");
            isharesPage4.enterUpGradeCabinCommandWithEachPax(logInfo, COS1);
            logInfo.pass("I enter 6:GV command to upgrade higher cabin with each pax");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter auto fare quote wit rule option {string}")
    public void enter_autofarequote_withruleoption(String rule) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter auto fare quote wit rule option");
            isharesPage4.displayAutoFareQuotewithruleoption(logInfo, rule);
            logInfo.pass("I enter auto fare quote wit rule option");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-*H command to verify error message for display History of marketing flight")
    public void iEnterHCommandToVerifyErrorMessageForDisplayHistoryOfMarketingFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-*H command to verify error message for display History of marketing flight");
            isharesPage4.ToVerifyErrorMessageForDisplayHistoryOfMarketingFlight(logInfo);
            logInfo.pass("I enter 6-*H command to verify error message for display History of marketing flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ETCKPRICE command for Uneven Exchange")
    public void i_Enter_T_ETCKPRICE_Command_For_Uneven_Exchange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETCKPRICE command for Uneven Exchange");
            isharesPage4.saveTheUnevenExchange(logInfo);
            logInfo.pass("I enter T-ETCKPRICE command for Uneven Exchange");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:BF command to print boarding pass")
    public void I_enter_6_BF_command_to_print_boarding_pass(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:BF command to print boarding pass");
            isharesPage4.enter6BFCommandToPrintBoardingPass(logInfo);
            logInfo.pass("I enter 6:BF command to print boarding pass");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EC command for Visa card")
    public void I_enter_EC_command_for_Visa_card(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EC command for Visa card");
            isharesPage4.enterEcCommandForVisaCard(logInfo);
            logInfo.pass("I enter *EC command for Visa card");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter the Post Departure Entry commands {string}")
    public void iEnterThePostDepartureEntryCommands(String value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter post departure commands");
            isharesPage4.displayPostDepartureEntryCommands(logInfo, value);
            logInfo.pass("I enter post departure commands");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter $:_@BKH command to verify fares display")
    public void iEnter$_BKHCommandToVerifyFaresDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $:_@BKH command to verify fares display");
            isharesPage4.enter$BKHToVerifyFareDisplay(logInfo);
            logInfo.pass("I enter $:_@BKH command to verify fares display");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run Image Online Bag Tag")
    public void iRunImageOnlineBagTag() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run Image Online Bag Tag");
            isharesPage4.runImageOnlineBagTag(logInfo);
            logInfo.pass("I run Image Online Bag Tag");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Enter Commands To Verify Fare Entries")
    public void iEnterCommandsToVerifyFareEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter Commands To Verify Fare Entries");
            isharesPage4.verifyFareEntries(logInfo);
            logInfo.pass("I Enter Commands To Verify Fare Entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do checkin for Shares PNR with baggage with manual bagtags and validate the error")
    public void iDoCheckinForSharesPNRWithBaggageWithManualBagtagsAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for Shares PNR with baggage with manual bagtags and validate the error");
            isharesPage4.addBagWithManualBagTagAndValidateError(logInfo);
            logInfo.pass("I do checkin for Shares PNR with baggage with manual bagtags and validate the error");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Up grade lower cabin with COS{string}")
    public void iEnterUpGradeLowerCabinWithCOS(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Up grade lower cabin with a different COS");
            isharesPage4.upgradeLowerCabinWithADifferentCOS(logInfo, COS);
            logInfo.pass("I enter Up grade lower cabin with a different COS");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$CMXD_CK|ET command to make the payment by check")
    public void iEnter$CMXD_CKETCommandToMakeThePaymentByCheck() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$CMXD_CK|ET command to make the payment by check");
            isharesPage4.commandToMakePaymentWithCheck(logInfo);
            logInfo.pass("I enter T-$CMXD_CK|ET command to make the payment by check");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $-$-O command and validate the fares entry response")
    public void iEnter$$OCommandAndValidateTheFaresEntryResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-O command and validate the fares entry response");
            isharesPage4.validateFaresEntryResponse(logInfo);
            logInfo.pass("I enter $-$-O command and validate the fares entry response");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 2P command with {string} and {string} for flifo")
    public void iEnterPCommandWithAndForFlifo(String msg, String time) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command");
            isharesPage4.Create_2PCommandWithMSg(logInfo,time, msg);
            logInfo.pass("I enter 2P command");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *FQ_BAG Allow Display to ABR Data")
    public void I_enter_FQ_BAG_Allow_Display_to_ABR_data(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *FQ_BAG Allow Display to ABR Data");
            isharesPage4.enterFQBAGAllowDisplayToABRData(logInfo);
            logInfo.pass("I enter *FQ_BAG Allow Display to ABR Data");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *EP with phone number and passenger name")
    public void I_enter_EP_With_Phone_number_and_passenger_name(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EP with phone number and passenger name");
            isharesPage4.enterEPWithPhoneNumberAndPassengerName(logInfo);
            logInfo.pass("I enter *EP with phone number and passenger name");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZAFIL_ command with entry{string}")
    public void iEnterZAFIL_CommandWithEntry(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL_ command with entry");
            isharesPage4.EnterZAFIL_CommandWithEntry(logInfo,Entry);
            logInfo.pass("I enter ZAFIL_ command with entry");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter W* command to display lniata of the session")
    public void iEnterWCommandToDisplayLniataOfTheSession() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter W* command to display lniata of the session");
            isharesPage4.ToDisplayLniataOfTheSession(logInfo);
            logInfo.pass("I enter W* command to display lniata of the session");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter auto fare quote wit NCFOP")
    public void enter_autofarequote_withNCFOP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter auto fare quote with NCFOP");
            isharesPage4.displayAutoFareQuotewithNCFOP(logInfo);
            logInfo.pass("I enter auto fare quote wit NCFOP");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I do NCFOP reissue using T-$UE with uneven exchange {string} and {string}")
    public void iMakeNCFOPUnEvenExchangeReissue(String segSequence, String RefundType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make uneven exchange reissue");

            isharesPage4.unEvenExchangeNCFOP(logInfo, segSequence, RefundType);
            logInfo.pass("I make uneven exchange reissue");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter C:A command to Run the Lost Ticket Replacement")
    public void iEnterCACommandToRunTheLostTicketReplacement() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to Run the Lost Ticket Replacement");

            isharesPage4.enterCACommandToRunLostTicketReplacement(logInfo);
            logInfo.pass("I enter C:A command to Run the Lost Ticket Replacement");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }
    @And("I enter T-$ET_ command to do ticket adjustment")
    public void Enter_delTicketAdjustment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$ET_ command to do ticket adjustment");
            isharesPage4.TicketAdjustment(logInfo);
            logInfo.pass("I enter T-$ET_ command to do ticket adjustment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }
    @And("I enter X commands to delete multiple segments {string}")
    public void Enter_deleteSpecificSegments(String Segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X commands to delete multiple segments");
            isharesPage4.deleteSpecificSegments(logInfo, Segment);
            logInfo.pass("I enter X commands to delete multiple segments");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search Flight Availability 7AR")
    public void iSearchFlightAvailabilityAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search Flight Availability 7AR");
            isharesPage4.flightAvailability7AR(logInfo);
            logInfo.pass("I search Flight Availability 7AR");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter auto fare quote with AA {string}")
    public void enter_autofarequote_withAA(String rule) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter auto fare quote with AA option");
            isharesPage4.displayAutoFareQuotewithAA(logInfo, rule);
            logInfo.pass("I enter auto fare quote with AA option");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *EB command to display ETKT passenger list")
    public void iAddETKTDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EB command to display ETKT passenger list");
            isharesPage4.ETKTDisplay(logInfo);
            logInfo.pass("I enter *EB command to display ETKT passenger list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability for second segment from {string} to {string} for waitlist pax")
    public void iSearchForFlightAvailabilityForSecondSegmentFromToForWaitlistPax(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for first segment for waitlist pax");
            isharesPage4.searchFlightAvailabilityForSecondSegForWaitlistPax(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for first segment for waitlist pax");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZAFIL command to change the status to flown for the segment {string} and value {string}")
    public void iEnterZAFILCommandToChangeTheStatusToFlownForTheSegmentAndValue(String Segment, String Value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL command to change the status to flown");
            isharesPage4.ZAFILCommandToChangeTheStatusToFlownForTheSegment(logInfo, Segment, Value);
            logInfo.pass("I enter ZAFIL command to change the status to flown");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }
    @And("I enter *H command")
    public void iEnterHCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *H command");
            isharesPage4.EnterHCommand(logInfo);
            logInfo.pass("I enter *H command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Q_POS_{string} command with the POS {string}")
    public void iEnterQ_POS_CommandWithThePOS(String number, String POS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q_POS command with the POS");
            isharesPage4.Q_POS_CommandWithThePOS(logInfo,number,POS);
            logInfo.pass("I enter Q_POS command with the POS");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6PP command")
    public void iEnter6PPCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6PP command");
            isharesPage4.Enter6PPCommand(logInfo);
            logInfo.pass("I enter 6PP command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter QXI command")
    public void iEnterQXICommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QXI command");
            isharesPage4.QXICommand(logInfo);
            logInfo.pass("I enter QXI command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I block all the seats in economy class")
    public void iBlockAllTheSeatsInEconomyClass() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I block all the seats in economy class");
            isharesPage4.iBlockAllTheSeatsInEconomyClass(logInfo);
            logInfo.pass("I block all the seats in economy class");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter TTY message to generate a pnr for UX booking with CM segment for system type {string}")
    public void iEnterTTYMessageToGenerateAPnrForUXBookingWithCMSegmentForSystemType(String systemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate a pnr for UX booking with CM segment");
            isharesPage4.TTYMessageToGenerateAPnrForUXBookingWithCMSegment(logInfo, systemType);
            logInfo.pass("I enter TTY message to generate a pnr for UX booking with CM segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter TTY meessage to modify the generated pnr for UX booking with CM segment for system type {string}")
    public void iEnterTTYMeessageToModifyTheGeneratedPnrForUXBookingWithCMSegmentForSystemType(String systemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to modify a pnr for UX booking with CM segment");
            isharesPage4.TTYMessageToModifyrForUXBookingWithCMSegment(logInfo, systemType);
            logInfo.pass("I enter TTY message to modify a pnr for UX booking with CM segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter TTY message to generate a pnr and adding auxillary service to it for system type {string}")
    public void iEnterTTYMessageToGenerateAPnrAndAddingAuxillaryServiceToIt(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate a pnr and adding auxillary service to it");
            isharesPage4.TTYMessageToGenerateAPnrAndAddingAuxillaryService(logInfo,SystemType);
            logInfo.pass("I enter TTY message to generate a pnr and adding auxillary service to it");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *EMD_SVC command to verify the added auxillary service")
    public void iEnterEMDSVCCommandToVerifyTheAddedAuxillaryService() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EMD_SVC command to verify the added auxillary service");
            isharesPage4.EMDSVCCommandToVerifyTheAddedAuxillaryService(logInfo);
            logInfo.pass("I enter *EMD_SVC command to verify the added auxillary service");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Q*CODESHARE*O_UX command to Translate function for ASC message")
    public void iEnterQCODESHAREO_UXCommandToTranslateFunctionForASCMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE*O_UX command to Translate function for ASC message");
            isharesPage4.QCODESHAREO_UXCommandToTranslateFunctionForASCMessage(logInfo);
            logInfo.pass("I enter Q*CODESHARE*O_UX command to Translate function for ASC message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Q*CODESHARE$*UX {string} to get UX class mapping with CM class")
    public void iEnterQCODESHARE$UXToGetUXClassMappingWithCMClass(String codeshareNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE$*UX number to get UX class mapping with CM class");
            isharesPage4.QCODESHARE$UXToGetUXClassMappingWithCMClas(logInfo,codeshareNumber);
            logInfo.pass("I enter Q*CODESHARE$*UX number to get UX class mapping with CM class");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter different G_ commands to Run the System Access Monitor {string}")
    public void iEnterDifferentG_CommandsToRunTheSystemAccessMonitor(String value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter different G_ commands to Run the System Access Monitor");
            isharesPage4.DifferentG_CommandsToRunTheSystemAccessMonitor(logInfo,value);
            logInfo.pass("I enter different G_ commands to Run the System Access Monitor");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-FM command with the number {string}")
    public void iEnter6FMCommandWithTheNumber(String number) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-FM command");
            isharesPage4.iEnter6FMCommand(logInfo, number);
            logInfo.pass("I enter 6-FM command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *_CommonName command to display similar name search Entry for the name value {string}")
    public void iEnter_CommonNameCommandToDisplaySimilarNameSearchEntryForTheNameValue(String name) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the passenger name in different format starting with the specified name");
            isharesPage4.CommonNameCommandToDisplaySimilarNameSearchEntryForTheNameValue(logInfo, name);
            logInfo.pass("I add the passenger name in different format starting with the specified name");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET command to display tickets and validate the error")
    public void iEnterETCommandToDisplayTicketsAndValidateTheError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET command to display tickets and validate the error");
            isharesPage4.displayEtktAndValidateError(logInfo);
            logInfo.pass("I enter *ET command to display tickets and validate the error");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $:_ command to verify fares display")
    public void iEnter$_CommandToVerifyFaresDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $:_ command to verify fares display");
            isharesPage4.verifyFareDisplay(logInfo);
            logInfo.pass("I enter $:_ command to verify fares display");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability for the segment from {string} to {string} for the segment {string}")
    public void iSearchForFlightAvailabilityForTheSegmentFromTo( String origin, String destination,String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for the mentioned segment");
            isharesPage4.searchFlightAvailabilityForRequiredSeg(logInfo,origin, destination,segmentIndex);
            logInfo.pass("I search for flight availability for the mentioned segment");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add osi remarks")
    public void iAddOsiRemarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add osi remarks");
            isharesPage4.addOSIremarks(logInfo);
            logInfo.pass("I add osi remarks");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for flight availability for third segment from {string} to {string} for waitlist pax")
    public void iSearchForFlightAvailabilityForThirdSegmentFromToForWaitlistPax(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for third segment for waitlist pax");
            isharesPage4.searchFlightAvailabilityForThirdSegForWaitlistPax(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for third segment for waitlist pax");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I delete Bulk SSR from the PNR for SSR type {string}")
    public void iDeleteBulkSSRFromThePNRForSSRType(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete SSR from the PNR for SSR type " + SSRType);
            isharesPage4.deleteSSRFromPnrForBulk(logInfo, SSRType);
            logInfo.pass("I delete SSR from the PNR for SSR type " + SSRType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CM used command for segment {string}")
    public void iEnterCMUsedCommandForSegment(String SegmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CM used command for segment " + SegmentNo);
            isharesPage4.enter_CM_used_command_Segment(logInfo, SegmentNo);
            logInfo.pass("I enter CM used command for segment " + SegmentNo);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-ED_ command to Remove Exception SSR {string}")
    public void iEnterKED_CommandToRemoveExceptionSSR(String ssr) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-ED_ command to Remove Exception SSR " + ssr);
            isharesPage4.iEnterKED_CommandToRemoveExceptionSSR(logInfo, ssr);
            logInfo.pass("I enter K-ED_ command to Remove Exception SSR" + ssr);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:CC command to close the flight or Bypassed")
    public void I_enter_6_CC_command_to_close_the_flight_or_Bypassed(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CC command to close the flight or Bypassed");
            isharesPage4.enter6CcCommandTooCloseTheFlightorBypassed(logInfo);
            logInfo.pass("I enter 6:CC command to close the flight or Bypassed");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter VIM command to display the inventory history based on segment AVS")
    public void iEnterVIMCommandToDisplayTheInventoryHistoryBasedOnSegmentAVS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIM command to display the inventory history based on segment AVS");
            isharesPage4.displayInventoryHistoryBasedOnSegmentAVS(logInfo);
            logInfo.pass("I enter VIM command to display the inventory history based on segment AVS");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I book a specific flight for a specific date from {string} to {string}")
    public void iBookASpecificFlightForASpecificDate(String Origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I book a specific flight for a specific date");
            isharesPage4.bookASpecificFlightAndForASpecificDate(logInfo, Origin, destination);
            logInfo.pass("I book a specific flight for a specific date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:TM- command to add message to the passenger without flight number with text {string}")
    public void iEnterTM_CommandToAddMessageToThePassenger( String message) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM- command to add message to the passenger without flight number with text :"+message);
            isharesPage4.addTheMessage(logInfo,message);
            logInfo.pass("I enter 6:TM- command to add message to the passenger without flight number with text :"+message);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LD command to verify the list for the Added message")
    public void iEnterLDCommandToVerifyTheListForTheAddedMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to verify the list for the Added message");
            isharesPage4.toVerifyListForAddedMessage(logInfo);
            logInfo.pass("I enter 6:LD command to verify the list for the Added message");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter QM command to display items in the queue for system type {string}")
    public void iEnterQMCommandToDisplayItemsInTheQueueForSystemType(String systemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QM command to display items in the queue for system type");
            isharesPage4.EnterQM_CommandToDisplayItemsInTheQueueForSystemType(logInfo, systemType);
            logInfo.pass("I enter QM command to display items in the queue for system type");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I add pnr to PNRs list at index {string}")
    public void iAddPnrToPNRsListAtIndex(String indexPNRsList) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add pnr to PNRs list");
            isharesPage4.saveThePNRs(logInfo,indexPNRsList);
            logInfo.pass("I add pnr to PNRs list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set the {string} to the pnr value")
    public void iSetTheToThePnrValue(String pnrIndexNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set the pnr from the pnrs value");
            isharesPage4.setPnrValueFromPNRs(logInfo,pnrIndexNo);
            logInfo.pass("I set the pnr from the pnrs value");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LDVR_ command to remove volunteer status for {string} pnr")
    public void iEnterLDVR_CommandToRemoveVolunteerStatusForPnr(String pnrIndexNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LDVR_ command to remove volunteer status");
            isharesPage4.runLDVRCommand(logInfo,pnrIndexNo);
            logInfo.pass("I enter 6:LDVR_ command to remove volunteer status");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZH_ command to display PNIS with {string}SeqNumber")
    public void iEnterZH_CommandToDisplayPNISWithSeqNumber(String pnrIndexNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to display PNIS with SeqNumber");
            isharesPage4.enterZH_CommandWithSeqNo(logInfo,pnrIndexNo);
            logInfo.pass("I enter 6:ZH_ command to display PNIS with SeqNumber");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I remove the passenger from pax list of type {string}")
    public void iRemoveThePassenger(String paxType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove the passenger from pax list of type :"+paxType);
            isharesPage4.removePaxFromPaxList(logInfo, paxType);
            logInfo.pass("I remove the passenger from pax list of type :"+paxType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I change pax child to INS")
    public void iChangePaxChildToINSForTheIndex() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change pax child to INS ");
            isharesPage4.changeChildToINS(logInfo);
            logInfo.pass("I change pax child to INS ");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do reissue and refund using T-$UE with uneven exchange for {string}")
    public void iDoReissueAndRefundUsingT$UEWithUnevenExchangeForWith(String RefundType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do reissue and refund using T-$UE with uneven exchange for "+ RefundType);
            isharesPage4.unEvenExchangeNew(logInfo, RefundType);
            logInfo.pass("I do reissue and refund using T-$UE with uneven exchange for "+ RefundType);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I delete the segment {string} details for the passengers")
    public void iDeleteTheSegmentDetailsForThePassengers(String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the segment "+segmentIndex+" details for the passengers");
            isharesPage4.removeSegmentDetailsForPax(logInfo, Integer.parseInt(segmentIndex));
            logInfo.pass("I delete the segment "+segmentIndex+" details for the passengers");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify that the Ticket has been exchanged under Add Collect Scenario from Ticket History Response")
    public void iVerifyThatTheTicketHasBeenExchangedUnderAddCollectScenarioFromTicketHistoryResponse() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify that the Ticket has been exchanged under Add Collect Scenario from Ticket History Response");
            isharesPage4.verifyAddCollectScenario(logInfo);
            logInfo.pass("I verify that the Ticket has been exchanged under Add Collect Scenario from Ticket History Response");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter manual fare quote command for pax")
    public void iEnterManualFareQuoteCommandForPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter manual fare quote command for pax");
            isharesPage4.manualFareQuoteForPax(logInfo);
            logInfo.pass("I enter manual fare quote command for pax");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }
    @And("I enter command to add farequote and ticket PNR with non refundable")
    public void iEnterCommandToAddFarequoteAndTicketPNRWithNonRefundable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add farequote and ticket PNR with non refundable");
            isharesPage4.toAddFarequoteAndTicketPNRWithNonRefundable(logInfo);
            logInfo.pass("I enter command to add farequote and ticket PNR with non refundable");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the details with name destination and record locator in reverse booking order list and perform list redisplay")
    public void I_verify_the_details_with_name_destination_and_record_locator_in_reverse_booking_order_list_and_perform_list_redisplay() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the details with name destination and record locator in reverse booking order list and perform list redisplay");

            isharesPage4.reverseBookingOrderList(logInfo);
            logInfo.pass("I verify the details with name destination and record locator in reverse booking order list and perform list redisplay");


        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I perform passenger name list display boarding at any point for all the destinations of the flight")
    public void I_perform_passenger_name_list_display_boarding_at_any_point_for_all_destinations_for_the_flight() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform passenger name list display boarding at any point for all the destinations of the flight");

            isharesPage4.passengerNameListDisplay(logInfo);
            logInfo.pass("I perform passenger name list display boarding at any point for all the destinations of the flight");


        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform ASA to all passengers for {string} Segment for {string}")
    public void iPerformASAToAllPassengersForSegmentsFor(String segmentNumber, String AssignType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform ASA to all passengers for "+segmentNumber+" Segment for "+AssignType);
            isharesPage4.performASA(logInfo,segmentNumber,AssignType);
            logInfo.pass("I perform ASA to all passengers for "+segmentNumber+" Segment for "+AssignType);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I change ASA for all passengers for {string} Segment for {string}")
    public void iChangeASAForAllPassengersForSegmentFor(String segmentNumber, String AssignType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change ASA for all passengers for "+segmentNumber+" Segment for "+AssignType);
            isharesPage4.changeASA(logInfo,segmentNumber,AssignType);
            logInfo.pass("I change ASA for all passengers for "+segmentNumber+" Segment for "+AssignType);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter passenger details with same surname in normal way")
    public void i_enter_passenger_details_with_same_surname_in_normal_way() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details with same surname in normal way");
            isharesPage4.enter_passenger_Details_with_Same_Surname_in_normal_way(logInfo);
            logInfo.pass("I enter passenger details with same surname in normal way");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I add Auxilliary Segment for Auxilliary Type {string} for segment {string}")
    public void i_Add_Auxilliary_Segment_For_Auxilliary_Type_for_particular_segment(String AuxilliaryType,String segmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Auxilliary Segment for Auxilliary Type " + AuxilliaryType + " for segment "+segmentIndex);
            System.out.println("I add Auxilliary Segment for Auxilliary Type " + AuxilliaryType + " for segment "+segmentIndex);
            isharesPage4.addAuxilliarySegmentForSegmentIndex(logInfo, AuxilliaryType,Integer.parseInt(segmentIndex));
            logInfo.pass("I add Auxilliary Segment for Auxilliary Type " + AuxilliaryType + " for segment "+segmentIndex);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I add remarks to the PNR for {string}")
    public void iAddRemarksToThePNRFor(String remarkType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + remarkType + " remarks to the PNR");

            isharesPage4.addRemarksToPnr(logInfo, remarkType);
            logInfo.pass("I add remarks to the PNR");


        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *ET_ command and verify year of issuance in ticket number")
    public void iEnterET_CommandAndVerifyYearOfIssuanceInTicketNumber() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify year of issuance in ticket number");
            isharesPage4.verifyYearOfIssuanceInTicketNumber(logInfo);
            logInfo.pass("I verify year of issuance in ticket number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the unmasking of last four digits of {string} under ticketing history")
    public void iVerifyTheUnmaskingOfLastFourDigitsOfUnderTicketingHistory(String paymentType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the unmasking of last four digits of under ticketing history");
            isharesPage4.verificationOfUnmaskingOfLastFourDigitsUnderTicketingHistory(logInfo, paymentType);
            logInfo.pass("I verify the unmasking of last four digits of under ticketing history");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*Y command to verify the availability displayed for previous day")
    public void iEnterAYCommandToVerifyTheAvailabilityDisplayedForPreviousDay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*Y command to verify the availability displayed for previous day");
            isharesPage4.verifyAvailibilityForPreviousDay(logInfo);
            logInfo.pass("I enter A*Y command to verify the availability displayed for previous day");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*T command to verify the availability displayed for next day")
    public void iEnterATCommandToVerifyTheAvailabilityDisplayedForNextDay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*T command to verify the availability displayed for next day");
            isharesPage4.verifyAvailibilityForNextDay(logInfo);
            logInfo.pass("I enter A*T command to verify the availability displayed for next day");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*KCT_ and KSSALL to activate the LNIATA as a permanent set and verify the same")
    public void iEnterOCMKCT_AndKSSALLToActivateTheLNIATAAsAPermanentSetAndVerifyTheSame() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*KCT_ and KSSALL to activate the LNIATA as a permanent set and verify the same");
            isharesPage4.activateLNIATAAsAPermanentSetAndVerifyTheSame(logInfo);
            logInfo.pass("I enter OCM*KCT_ and KSSALL to activate the LNIATA as a permanent set and verify the same");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:Z*_ command to display SSR in hexadecimal using only flight number")
    public void iEnterZ_CommandToDisplaySSRInHexadecimalUsingOnlyFlightNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:Z*_ command to display SSR in hexadecimal using only flight number");
            isharesPage4.displaySSRInHexadecimalWithFlightNumber(logInfo);
            logInfo.pass("I enter 6:Z*_ command to display SSR in Hexadecimal using only flight number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I perform crew check-in along with jump seat rider")
    public void iPerformCrewCheckInAlongWithJumpSeatRider() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform crew check-in along with jump seat rider");
            isharesPage4.performCrewCheckinWithjumpSeat(logInfo);
            logInfo.pass("I perform crew check-in along with jump seat rider");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I validate if the created PNR has child SSR in it")
    public void iValidateIfTheCreatedPNRHasChildSSRInIt() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the child SSR in the PNR");
            isharesPage4.verifyTheChildSSRInPnr(logInfo);
            logInfo.pass("I verify the child SSR in the PNR");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I validate the day of week in the PNR")
    public void iValidateTheDayOfWeekInThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate day of week in PNR segment");
            isharesPage4.validateTheDayOfWeek(logInfo);
            logInfo.pass("I validate day of week in PNR segment");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I verify the default FOP {string} in the PNR")
    public void iVerifyTheDefaultFOPInThePNR(String PaymentType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the default FOP in the PNR");
            isharesPage4.verifyTheDefaultFOP(logInfo, PaymentType);
            logInfo.pass("I verify the default FOP in the PNR");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter VML Entry to modify the booking compartment")
    public void iEnterVMLEntryToModifyTheBookingCompartment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML Entry From P C User");
            isharesPage4.enterVMLEntryToModifyTheBookingCompartment(logInfo);
            logInfo.pass("I enter VML Entry From P C User");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LA$R command to verify the error message")
    public void iEnterLA$RCommandToVerifyTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$R command to verify the error message");
            isharesPage4.enterLASRToVerifyErrorMessage(logInfo);
            logInfo.pass("I enter LA$R command to verify the error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter *ET and *EH command to verify error message for ETKT")
    public void iEnterETAndEHCommandToVerifyErrorMessageForETKT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET and *EH command to verify error message for ETKT");
            isharesPage4.displayEtktAndValidateErrorMessage(logInfo);
            logInfo.pass("I enter *ET and *EH command to verify error message for ETKT");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I retrieve the passenger record")
    public void iRetrieveThePassengerRecord() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the passenger record");
            isharesPage4.retrievePassengerRecord(logInfo);
            logInfo.pass("I retrieve the passenger record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I rebook the segment {string} for rebooking type {string}")
    public void iRebookTheSegmentForRebookingType(String SegmentNumber, String rebookType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook the segment "+SegmentNumber+" for rebooking type "+rebookType);
            isharesPage4.rebookSegmentinPNR(logInfo,SegmentNumber,rebookType);
            logInfo.pass("I rebook the segment "+SegmentNumber+" for rebooking type "+rebookType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I add meal SSR of type {string} for same surname passengers")
    public void iAddMealSSROfTypeForSameSurnamePassengers(String SSR) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add meal SSR of type "+SSR +" for same surname passengers");
            isharesPage4.addMealSSRFOrSameSurnamePax(logInfo,SSR);
            logInfo.pass("I add meal SSR of type "+SSR +" for same surname passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add meal SSR of type {string} for normal passengers")
    public void iAddMealSSROfTypeForNormalPassengers(String SSR) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add meal SSR of type "+SSR +" or normal passengers");
            isharesPage4.addMealSSRForNormalPax(logInfo,SSR);
            logInfo.pass("I add meal SSR of type "+SSR +" or normal passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate passenger details for Boarding and Meal related specific entry {string}")
    public void iValidatePassengerDetailsForBoardingAndMealRelatedSpecificEntry(String ValidationType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate passenger details for Boarding and Meal related specific entry " + ValidationType);
            isharesPage4.validateMealAndBoardingPaxDetails(logInfo,ValidationType);
            logInfo.pass("I validate passenger details for Boarding and Meal related specific entry " +ValidationType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I change the status of the segments with total pax {string} to status type {string}")
    public void iChangeTheStatusOfTheSegmentsWithTotalPaxToStatusType(String totalSegment, String statusType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the status of the segments");
            isharesPage4.ToChangeStatusTypeWithTotalpax(logInfo,totalSegment,statusType);
            logInfo.pass("I change the status of the segments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$EE_ command to run even exchange with Visa")
    public void iEnterT$EE_CommandToRunEvenExchangeWithVisa() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EE_ command to run even exhange with visa");
            isharesPage4.T_$EE_CommandRunEvenExchangeWithVisa(logInfo);
            logInfo.pass("I enter T-$EE_ command to run even exchange with visa");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EH command to show passenger history")
    public void iEnterEHCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH command to show passenger history");
            isharesPage4.enterEH(logInfo);
            logInfo.pass("I enter *EH command to show passenger history");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY Message to create codeshare PNR with TART restricted inhouse travel agency code for system {string}")
    public void iEnterTTYMessageToCreateCodesharePNRWithTARTRestrictedInhouseTravelAgencyCodeForSystem(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY Message to create codeshare PNR with TART restricted inhouse travel agency code");
            isharesPage4.TTYMessageToCreateCodesharePNRWithTARTRestrictedInhouseTravelAgencyCode(logInfo, SystemType);
            logInfo.pass("I enter TTY Message to create codeshare PNR with TART restricted inhouse travel agency code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter the command QM_MUC|LAST")
    public void iEnterTheCommandQMMUCLAST() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the command QM_MUC|LAST");
            isharesPage4.EnterTheCommandQMMUCLAST(logInfo);
            logInfo.pass("I enter the command QM_MUC|LAST");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6*_? command to initiate claim for the value {string}")
    public void iEnter6CLAIMCommandToInitiateClaimForTheValue(String Value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), " enter 6*_? command to initiate claim for the value");
            isharesPage4.Enter6CommandToInitiateClaimForTheValue(logInfo, Value);
            logInfo.pass(" enter 6*? command to initiate claim for the value");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set the {string} to the pnr2 value")
    public void iSetTheToThePnr2Value(String pnrIndexNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set the pnr2 from the pnrs value");
            isharesPage4.setPnr2ValueFromPNRs(logInfo,pnrIndexNo);
            logInfo.pass("I set the pnr2 from the pnrs value");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7T_FREEFLOW command")
    public void iEnterTIA_FREEFLOWCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7T_FREEFLOW command");
            isharesPage4.enter_7T_FREEFLOW(logInfo);
            logInfo.pass("I enter 7T_FREEFLOW command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve lniata to display address")
    public void Enter_Displaylniata() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve lniata to display address");
            isharesPage4.Displaylniata(logInfo);
            logInfo.pass("I retrieve lniata to display address");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter TTY message to perform modify flight information")
    public void Enter_TTYmessagetoperformmodifyflight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETREFUND command to refund penaltyI enter TTY message to perform modify flight information");
            isharesPage4.TTYmessagetoperformmodifyflight(logInfo);
            logInfo.pass("I enter TTY message to perform modify flight information");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to CM VIEW PARTNERS DATABASE")
    public void enter_CMVIEWPARTNERSDATABASE() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to CM VIEW PARTNERS DATABASE");
            isharesPage4.CMVIEWPARTNERSDATABASE(logInfo);
            logInfo.pass("I enter command to CM VIEW PARTNERS DATABASE");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify Visa&Health info with one destination, one transit and one visited point")
    public void I_verify_Visa_SITA_TC005() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify Visa&Health info with one destination, one transit and one visited point");
            isharesPage4.verify_Visa_SITA_TC005(logInfo);
            logInfo.pass("I enter command to verify Visa&Health info with one destination, one transit and one visited point");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to verify the Full Text for each section provided by Timatic")
    public void I_verify_Visa_SITA_TC007() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify the Full Text for each section provided by Timatic");
            isharesPage4.verify_Visa_SITA_TC007(logInfo);
            logInfo.pass("I enter command to verify the Full Text for each section provided by Timatic");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I have done auto fare quote for segments {string} and {string}")
    public void Enter_autofarequoteforsegments(String seg1, String seg2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done auto fare quote for segments");
            isharesPage4.autofarequoteforsegments(logInfo,seg1,seg2);
            logInfo.pass("I have done auto fare quote for segments");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CURRENT FARE WORK QUOTES")
    public void Enter_CURRENT_FARE_WORK_QUOTES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CURRENT FARE WORK QUOTES");
            isharesPage4.CURRENT_FARE_WORK_QUOTES(logInfo);
            logInfo.pass("I enter CURRENT FARE WORK QUOTES");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to Uneven Exchange Additional to Agent’s TAR SHARES")
    public void enter_UnevenExchangeAdditionaltoAgentsTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Uneven Exchange Additional to Agent’s TAR SHARES");
            isharesPage4.UnevenExchangeAdditionaltoAgentsTAR(logInfo);
            logInfo.pass("I enter command to Uneven Exchange Additional to Agent’s TAR SHARES");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to Miscellaneous Form of Payment to Agent’s TAR SHARES")
    public void enter_MiscellaneousFormofPaymenttoAgentsTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Miscellaneous Form of Payment to Agent’s TAR SHARES");
            isharesPage4.MiscellaneousFormofPaymenttoAgentsTAR(logInfo);
            logInfo.pass("I enter command to Miscellaneous Form of Payment to Agent’s TAR SHARES");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I enter command to add Credit Card form of payment to Agent’s TAR SHARES")
    public void enter_CreditCardformofpaymenttoAgentsTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add Credit Card form of payment to Agent’s TAR SHARES");
            isharesPage4.CreditCardformofpaymenttoAgentsTAR(logInfo);
            logInfo.pass("I enter command to add Credit Card form of payment to Agent’s TAR SHARES");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to add Cash Form of Payment to Agent’s TAR SHARES")
    public void enter_CashFormofPaymenttoAgentsTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add Cash Form of Payment to Agent’s TAR SHARES");
            isharesPage4.CashFormofPaymenttoAgentsTAR(logInfo);
            logInfo.pass("I enter command to add Cash Form of Payment to Agent’s TAR SHARES");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to detach ticket number")
    public void enter_todetachticketnumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to detach ticket number");
            isharesPage4.todetachticketnumber(logInfo);
            logInfo.pass("I enter command to detach ticket number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter X command to delete segment {string} from PNR")
    public void Enter_toDeleteSegmentsFromPNR(String Seg) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X command to delete segment from PNR ");
            isharesPage4.toDeleteSegmentsFromPNR(logInfo,Seg);
            logInfo.pass("I enter X command to delete segment from PNR ");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter XI command to delete all the segments from PNR")
    public void Enter_DeleteAllSegmentsFromPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter XI command to delete all the segments from PNR");
            isharesPage4.DeleteAllSegmentsFromPNR(logInfo);
            logInfo.pass("I enter XI command to delete all the segments from PNR");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Short Access to Rules SHARES entries")
    public void Enter_ShortAccesstoRulesSHARESentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Short Access to Rules SHARES entries");
            isharesPage4.ShortAccesstoRulesSHARESentries(logInfo);
            logInfo.pass("I enter Short Access to Rules SHARES entries");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter manual farequote command for child to display releasing locked fare Quotes")
    public void Enter_ManualFarequote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter manual farequote command for child to display releasing locked fare Quotes");
            isharesPage4.ManualFarequote(logInfo);
            logInfo.pass("I enter manual farequote command for child to display releasing locked fare Quotes");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-ET_S command to do Invol Exchange ETKT coupon through sequence{string}")
    public void iEnterTET_SCommandToDoInvolExchangeETKTCouponThroughSequence(String Sequence) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_S command to do Invol Exchange ETKT coupon through sequence");

            isharesPage4.ToDoInvolExchangeETKTCouponThroughSequence(logInfo,Sequence);
            logInfo.pass("I enter T-ET_S command to do Invol Exchange ETKT coupon through sequence");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }


    @And("I enter FM_ command to display specified fare quote workfile")
    public void iEnterFM_CommandToDisplaySpecifiedFareQuoteWorkfile() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FM_ command to display specified fare quote workfile");
            isharesPage4.EnterFM_Command(logInfo);
            logInfo.pass("I enter FM_ command to display specified fare quote workfile");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I Enter FF6PER to Verify BestBuy")
    public void iEnterFF6PER_CommandToDisplayFareQuoteFilledDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter FF6PER to Verify BestBuy");
            isharesPage4.iEnterFF_Command(logInfo);
            logInfo.pass("I Enter FF6PER to Verify BestBuy");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I rearrange the segments with pnr {string}")
    public void I_rearrange_the_segments_with_pnr(String RearrangeSegmentNo){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rearrange the segments with pnr");
            isharesPage4.rearrangeTheSegmentsWithPNR(logInfo, RearrangeSegmentNo);
            logInfo.pass("I rearrange the segments with pnr");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-ET_F_ command to adjust ETKT change in itinerary using flight details")
    public void I_enter_T_ET_F_command_to_adjust_ETKT_change_in_itinerary_using_flight_details_new() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*.F_ command to adjust ETKT change in itinerary using flight details");
            isharesPage2.involuntaryTicketAdjustment(logInfo);
            logInfo.pass("I enter T-ET*.F_ command to adjust ETKT change in itinerary using flight details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Fare End command")
    public void I_enter_Fare_End(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "And I enter Fare End command");
            isharesPage4.enterFCCCALCExtendedFromPayEditUser(logInfo);
            logInfo.pass("And I enter Fare End command");
        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter X{string} Command for Cancelling Married Segment Flights")
    public void iEnterXCommandForMarriedSegmentFlights(String segmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X"+segmentNumber +" command for Cancelling Married Segment Flights");
            isharesPage4.enterXCommandForMarriedSegments(logInfo,segmentNumber);
            logInfo.pass("I enter X"+segmentNumber +" command for Cancelling Married Segment Flights");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T*DFT_ command to read city {string} and country info on timatic in native shares")
    public void iEnter_TDFT_Commond_To_Read_City_Country_Info_On_Timatic(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T*DFT_ command to read city and country info on timatic in native shares");
            isharesPage4.Enter_TDFT_Commond_To_Read_City_Country_Info_On_Timatic(logInfo, city);
            logInfo.pass("I enter T*DFT_ command to read city and country info on timatic in native shares");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T*RA_ command to verify the {string} Respected Visa and health details will be displayed successfully")
    public void iEnter_TRA_Commond_To_Verify_Entry_Respected_Visa_And_Health_Details(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T*RA_ command to verify the Entry Respected Visa and health details will be displayed successfully");
            isharesPage4.Enter_TRA_Commond_To_Verify_Entry_Respected_Visa_And_Health_Details(logInfo, Entry);
            logInfo.pass("I enter T*RA_ command to verify the Entry Respected Visa and health details will be displayed successfully");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter $-$-{string} command to do Fare Quote for specific segments")
    public void idoFareQuoteOfSpecificSegments(String segments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$-S"+segments+" command to do Fare Quote for specific segments");
            isharesPage4.fareQuoteForSpecificSegments(logInfo, segments);
            logInfo.pass("I enter $-$-"+segments+" command to do Fare Quote for specific segments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET command to make the Segments CM used {string} and {string}")
    public void iEnterTETCommandToMakeTheSegmentsCMUsedAnd(String SegmentNo, String PaxNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter T-ET command to make the Segments CM used");
            isharesPage4.commandToMakeTheSegmentsCMUsedSinglePax(logInfo, SegmentNo, PaxNo);
            logInfo.pass("I enter T-ET command to make the Segments CM used");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of T-ET command to make the Segments CM used");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter T-ETVOID to make Ticket voided in shares {string}")
    public void I_enter_T_ETVOID_To_make_Ticket_video_in_shares(String number){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETVOID to make Ticket video in shares");
            isharesPage4.enterTETVOIDToMakeTicketVoidedInShares(logInfo, number);
            logInfo.pass("I enter T-ETVOID to make Ticket video in shares");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET command to make the Segment status removed {string} and {string}")
    public void iEnterTETCommandToMakeTheSegmentStatusRemoved(String SegmentNo, String PaxNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter T-ET command to make the Segment status removed");
            isharesPage4.commandToMakeTheSegmentStatusRemovedSinglePax(logInfo, SegmentNo, PaxNo);
            logInfo.pass("I enter T-ET command to make the Segment status removed");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screen capture of T-ET command to make the Segment status removed");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter ZAFIL command to change segment status to flown {string}")
    public void iEnterZAFILCommandToChangeSegmentStatusToFlown(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL command to change segment status to flown :"+SegmentNumber);
            isharesPage4.makeSegmentFLOWN(logInfo, SegmentNumber);
            logInfo.pass("I enter ZAFIL command to change segment status to flown :"+SegmentNumber);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter TTY message to generate pnr for the system {string}")
    public void i_enter_TTY_message_to_generate_pnr(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate pnr for the system");
            isharesPage4.TTYMessagecreateSWIRM(logInfo, SystemType);
            logInfo.pass("I enter TTY message to generate pnr for the system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BPR TTY message to generate pnr for the system {string}")
    public void i_enter_BPR_TTY_message_to_generate_pnr(String SystemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BPR TTY message to generate pnr for the system");
            isharesPage4.BPRTTYMessagecreate(logInfo, SystemType);
            logInfo.pass("I enter BPR TTY message to generate pnr for the system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ET remove command for pax {string}")
    public void iEnterETRemoveCommandForPax(String paxno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ET remove command for pax " + paxno);
            isharesPage4.enter_ET_remove_command(logInfo, paxno);
            logInfo.pass("I enter ET remove command for pax " + paxno);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter T_ET* command to perform involuntary ticket adjustment with cancelled date")
    public void iEnterT_ETCommandToPerformInvoluntaryTicketAdjustmentWithCancelledDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_ET* command to perform involuntary ticket adjustment with cancelled date");
            isharesPage4.involuntaryTicketAdjustmentWithCancelledDate(logInfo);
            logInfo.pass("I enter T_ET* command to perform involuntary ticket adjustment with cancelled date");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I enter T-$EIR_ET command to do irregular exchange with old flight date")
    public void iEnterT$EIR_ETCommandToDoIrregularExchangeWithOldFlightDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EIR_ET command to do irregular exchange with old flight date");
            isharesPage4.enterT4EIR_ETWithOldFlightDate(logInfo);
            logInfo.pass("I enter T-$EIR_ET command to do irregular exchange with old flight date");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }

    }


    @And("I enter 6:DU_command to validate Segment status for required segment {string}")
    public void iEnterDU_commandToValidateSegmentStatusForRequiredSegment(String segIndexNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DU_ command to validate Segment status for "+segIndexNum);
            isharesPage4.enter6DUCommandToValidateSegmentStatusForSpecificSegment(logInfo,segIndexNum);
            logInfo.pass("I enter 6:DU_ command to validate Segment status for "+segIndexNum);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:ZH_ command to display PNIS detail for specific segment {string}")
    public void iEnterZH_CommandToDisplayPNISDetailForSpecificSegment(String segNum) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to display PNIS detail for specific segment");
            isharesPage4.displayPNISForSpecificSegment(logInfo,segNum);
            logInfo.pass("I enter 6:ZH_ command to display PNIS detail for specific segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:DVR command to remove passenger from volunteer oversold list for multi initial passenger")
    public void iEnterDVRCommandToRemovePassengerFromVolunteerOversoldList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DVR command to remove passenger from volunteer oversold list for multi initial passenger");
            isharesPage4.removePaxFromVoluntaryOversoldList(logInfo);
            logInfo.pass("I enter 6:DVR command to remove passenger from volunteer oversold list for multi initial passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter TTY message to generate pnr {string}")
    public void iEnterTTYMessageToGeneratePnr(String systemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate pnr for the system");
            isharesPage4.ttyMessageCreate(logInfo,systemType);
            logInfo.pass("I enter TTY message to generate pnr for the system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter TTY message to change the name of adult and child passenger {string}")
    public void iEnterTTYMessageToChangeTheNameOfAdultAndChildPassenger(String systemType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to change the name of adult and child passenger");
            isharesPage4.ttyMessageToChangeName(logInfo,systemType);
            logInfo.pass("I enter TTY message to change the name of adult and child passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I want to arrange the name in alphabetical order for Adults")
    public void iWantToArrangeTheNameInAlphabeticalOrderForAdults() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I want to arrange the name in alphabetical order for Adults");
            isharesPage4.arrangingTheNameInAlphabeticalOrder(logInfo);
            logInfo.pass("I want to arrange the name in alphabetical order for Adults");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I try to change the name of the passenger")
    public void iTryToChangeTheNameOfThePassenger() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to change the name of the passenger");
            isharesPage4.changingTheName(logInfo);
            logInfo.pass("I try to change the name of the passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }

    }

    @And("I enter 6:DV command to perform voluntary status after checkin for multi initial passenger")
    public void iEnterDVCommandToPerformVoluntaryStatusAfterCheckinForMultiInitialPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV command to perform voluntary status after checkin for multi initial passenger");
            isharesPage4.addingVoluntaryStatus(logInfo);
            logInfo.pass("I enter 6:DV command to perform voluntary status after checkin for multi initial passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:TM- command to add message to the passenger with date and without flight number with text {string}")
    public void iEnterTMCommandToAddMessageToThePassengerWithDateAndWithoutFlightNumberWithText(String message) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM- command to add message to the passenger without flight number with text :"+message);
            isharesPage4.addTheMessageWithoutFlightNumber(logInfo,message);
            logInfo.pass("I enter 6:TM- command to add message to the passenger without flight number with text :"+message);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the added undelivered message")
    public void iVerifyTheAddedUndeliveredMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the add undelivered message");
            isharesPage4.verifyUndeliveredMessage(logInfo);
            logInfo.pass("I verify the add undelivered message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform involuntary upgrade of the passenger with {string}")
    public void iPerformInvoluntaryUpgradeOfThePassengerWith(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform involuntary upgrade of the passenger");
            isharesPage4.involuntaryUpgradeOfThePassengerForTheGivenCOS(logInfo, COS);
            logInfo.pass("I perform involuntary upgrade of the passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LTM_@ command to modify the message for the passenger {string}")
    public void iEnterLTM_CommandToModifyTheMessageForThePassenger(String passenger) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LTM_@ command to modify the message the specified passenger");
            isharesPage4.modifyTheMessageFortheSpecifiedPassenger(logInfo, passenger);
            logInfo.pass("I enter 6:LTM_@ command to modify the message for the specified passenger");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }

    }


    @And("I enter 6:HR command to perform held seat for all passengers")
    public void iEnterHRCommandToPerformHeldSeatForAllPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform involuntary upgrade of the passenger");
            isharesPage4.CommandToPerformHeldSeatForAllPassengers(logInfo);
            logInfo.pass("I enter 6:HR command to perform held seat for all passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I open the flight for the specified segment {string}")
    public void iOpenTheFlightForTheSpecifiedSegment(String segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open the flight");
            isharesPage4.openFlightForSpecificSegment(logInfo, segment);
            logInfo.pass("I open flight");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }

    }

    @And("I activate the terminal from semi-permanent data modification")
    public void iActivateTheTerminalFromSemiPermanentDataModification() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I activate terminal from Semi-Permanent Data modification");
            isharesPage4.activateTerminalFromSemiPermanentDataModification(logInfo);
            logInfo.pass("I activate terminal from Semi-Permanent Data modification");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I retrive the PNR and capture the seat number for the passengers")
    public void iRetriveThePNRAndCaptureTheSeatNumberForThePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrive the PNR and capture the seat number for the passenger");
            isharesPage4.retrievePNRtoCaptureSeatNumbersAfterCheckin(logInfo);
            logInfo.pass("I retrive the PNR and capture the seat number for the passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I exchange the seats for the passenger {string} with passenger {string}")
    public void iExchangeTheSeatsForThePassengerWithPassenger(String passenger1, String passenger2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I exchange the seats for the passenger: "+passenger1);
            isharesPage4.seatExchangeBetweenPassengers(logInfo,passenger1,passenger2);
            logInfo.pass("I exchange the seats for the passenger: "+passenger1);

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }

    }

    @And("I activate the terminal from semi-permanent data modification for the second time")
    public void iActivateTheTerminalFromSemiPermanentDataModificationForTheSecondTime() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I activate terminal from Semi-Permanent Data modification for the second time");
            isharesPage4.activateTerminalFromSemiPermanentDataModificationForTheSecondTime(logInfo);
            logInfo.pass("I activate terminal from Semi-Permanent Data modification for the second time");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:KV_ command to perform selective standby clearance with Voluntary Grade Change to a new class of service {string}")
    public void iEnterKV_CommandToPerformSelectiveStandbyClearanceWithVoluntaryGradeChange(String newCos) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:KV_ command to perform selective standby clearance with Voluntary Grade Change to a new class of service");
            isharesPage4.performSelectiveStandbyClearanceWithVoluntaryGradeChange(logInfo, newCos);
            logInfo.pass("I enter 6:KV_ command to perform selective standby clearance with Voluntary Grade Change to a new class of service");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the Go Show PNR and validate")
    public void iRetrieveTheGoShowPNRAndValidate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the Go Show PNR and validate");
            isharesPage4.retrieveGoShowPNRAndValidate(logInfo);
            logInfo.pass("I retrieve the Go Show PNR and validate");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify seat is returned after modifying the itinerary")
    public void iVerifySeatIsReturnedAfterModifyingTheItinerary() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify seat is returned after modifying the itinerary");
            isharesPage4.verifySeatIsReturnedAfterModifyingTheItinerary(logInfo);
            logInfo.pass("I verify seat is returned after modifying the itinerary");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter T-ETVOID1 command to perform VOID ticket and verify the error response")
    public void iEnterTETVOIDCommandToPerformVOIDTicketAndVerifyTheErrorResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETVOID1 command to perform VOID ticket and verify the error response");
            isharesPage4.performVOIDTicketAndVerifyTheErrorResponse(logInfo);
            logInfo.pass("I enter T-ETVOID1 command to perform VOID ticket and verify the error response");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I perform ASA for exit seat and verify")
    public void iPerformASAForExitSeatAndVerify() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform ASA for exit seat and verify");
            isharesPage4.performASAForExitSeat(logInfo);
            logInfo.pass("I perform ASA for exit seat and verify");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I Enter PME command to check Enhanced Meal ordering Entries")
    public void iEnterPMECommandToCheckEnhancedMealOrderingEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Enter PME command to check Enhanced Meal ordering Entries");
            isharesPage4.enterPMECheckEnhancedMealorderingEntries(logInfo);
            logInfo.pass("I Enter PME command to check Enhanced Meal ordering Entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform total boarding passenger details for a specific flight and date")
    public void iPerformTotalBoardingPassengerDetailsForASpecificFlightAndDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform total boarding passenger details for a specific flight and date");
            isharesPage4.performTotalBoardingPaxDetails(logInfo);
            logInfo.pass("I perform total boarding passenger details for a specific flight and date");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform rebook operation for segment {string}")
    public void iPerformRebookOperationForSegment(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform rebook operation for segment");
            isharesPage4.performReBookSegment(logInfo, SegmentNumber);
            logInfo.pass("I perform rebook operation for segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I perform Itinerary Re-order Function for proper arrangement of segments {string}")
    public void iPerformItineraryReOrderFunctionForProperArrangementOfSegments(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Itinerary Re-order Function for proper arrangement of segments");
            isharesPage4.changeIteneraryReOrderSegments(logInfo, SegmentNumber);
            logInfo.pass("I perform Itinerary Re-order Function for proper arrangement of segments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add Same Surname Corporate name to the PNR")
    public void iAddSameSurnameCorporateNameToThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Same Surname Corporate name to the PNR");
            isharesPage4.addSameSurnameCorporateName(logInfo);
            logInfo.pass("I add Same Surname Corporate name to the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the GUI created PNR in ishares and validate the details")
    public void iRetrieveTheGUICreatedPNRInIsharesAndValidateTheDetails() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the GUI created PNR in ishares and validate the details");
            isharesPage4.retrievePNRInIsharesAndValidateTheDetails(logInfo);
            logInfo.pass("I retrieve the GUI created PNR in ishares and validate the details");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage4.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the PNR in shares and validate the details {string}")
    public void iRetrieveThePNRInSharesAndValidateTheDetails(String validation) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the GUI created PNR in ishares and validate specific details");
            isharesPage4.retrievePNRInIsharesAndValidateSpecificDetails(logInfo, validation);
            logInfo.pass("I retrieve the GUI created PNR in ishares and validate specific details");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage4.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }



    @And("I enter command for Vertical seat map")
    public void iEnterCommandForVerticalSeatMap() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Vertical seat map");
            isharesPage4.displayVerticalSeatMap(logInfo);
            logInfo.pass("I enter command for Vertical seat map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:CS_#I command to display Indifferent Redifined {string}")
    public void iEnterCS_ICommandToDisplayIndifferentRedefined(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CS_#I command to display Indifferent Redefined status");
            isharesPage4.display_IndifferntRedefinedStatus(logInfo, Entry);
            logInfo.pass("I enter 6:CS_#I command to display Indifferent Redefined status");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CZ_ command to perform Restrict connect check-in")
    public void iEnterCZ_CommandToPerformRestrictConnectCheckIn() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CZ_ command to perform Restrict connect check-in");
            isharesPage4.ToPerformRestrictConnectCheckIn(logInfo);
            logInfo.pass("I enter 6:CZ_ command to perform Restrict connect check-in");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CZ_ command to perform Restore check-in using below command")
    public void iEnterCZ_CommandToPerformRestoreCheckInUsingBelowCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CZ_ command to perform Restrict connect check-in");
            isharesPage4.ToPerformRestoreConnectCheckIn(logInfo);
            logInfo.pass("I enter 6:CZ_ command to perform Restrict connect check-in");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZHF_ command to display Formatted FDR")
    public void iEnterZHF_CommandToDisplayFormattedFDR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZHF command to display Display Formatted FDR");
            isharesPage4.ToDisplayFormattedFDR(logInfo);
            logInfo.pass("I enter 6:ZHF command to display Display Formatted FDR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:ZH_ command to display PNIS without pax name")
    public void iEnterZH_CommandToDisplayPNISWithoutPaxName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to display PNIS without pax name");
            isharesPage4.ToDisplayPNISWithoutPaxName(logInfo);
            logInfo.pass("I enter 6:ZH_ command to display PNIS without pax name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZH_ command to verify error response for marketing flight")
    public void iEnterZH_CommandToVerifyErrorResponseForMarketingFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to verify error response for marketing flight");
            isharesPage4.ToVerifyErrorResponseForMarketingFlight(logInfo);
            logInfo.pass("I enter 6:ZH_ command to verify error response for marketing flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CP_ command to assign ghost seat")
    public void iEnterCP_CommandToAssignGhostSeat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CP_ command to assign ghost seat");
            isharesPage4.assignGhostSeat(logInfo);
            logInfo.pass("I enter 6:CP_ command to assign ghost seat");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform check-in to verify flight is open or not")
    public void iPerformCheckInToVerifyFlightIsOpenOrNot() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform check-in to verify flight is open or not");
            isharesPage4.PerformCheckInToVerifyFlightIsOpenOrNot(logInfo);
            logInfo.pass("I perform check-in to verify flight is open or not");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CI_ command to mark a seat as inoperative")
    public void iEnterCI_CommandToMarkASeatAsInoperative() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CI_ command to mark a seat as inoperative");
            isharesPage4.assignInoperativeSeat(logInfo);
            logInfo.pass("I enter 6:CI_ command to mark a seat as inoperative");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I assign a shipment of different equipment and verify {string}")
    public void iAssignAShipmentOfDifferentEquipmentAndVerify(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign a shipment of different equipment");
            isharesPage4.ToAssignAShipmentOfDifferentEquipment(logInfo,Entry);
            logInfo.pass("I assign a shipment of different equipment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:DV_ command to add passengers to Voluntary OverSold List")
    public void iEnterDV_CommandToAddPassengersToVoluntaryOverSoldList() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV_ command to add passengers to Voluntary OverSold List");
            isharesPage4.addPaxToVolOverSoldList(logInfo);
            logInfo.pass("I enter 6:DV_ command to add passengers to Voluntary OverSold List");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I reduce the pnr for party {string}")
    public void i_reduce_the_pax_for_party(String PaxPositionToReduce) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I reduce the pnr");
            isharesPage4.reducePnr(logInfo, PaxPositionToReduce);
            logInfo.pass("I reduce the pnr");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I perform changing segment status code to {string} for {string}")
    public void I_perform_changing_segment_status_code(String StatusCode, String segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform changing segment status code to " + StatusCode);
            isharesPage4.changingTheSegmentStatusCode(logInfo, StatusCode, segment);
            logInfo.pass("I perform changing segment status code");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-*H command to perform History Items Display")
    public void I_perform_History_Items_Display() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-*H command to perform History Items Display");
            isharesPage4.displayHistoryItemsDisplay(logInfo);
            logInfo.pass("I enter 6-*H command to perform History Items Display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I remove the seat after checkin")
    public void iRemoveSeatAfterCheckIn(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove the seat after checkin");
            isharesPage4.removeTheSeatAfterCheckIn(logInfo);
            logInfo.pass("I remove the seat after checkin");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I perform UnCheckin the baggage of the passenger")
    public void I_perform_UnCheckin_the_baggage() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform Uncheckin the baggage");
            isharesPage4.performUnCheckinBaggage(logInfo);
            logInfo.pass("I perform UnCheckin the baggage");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add remarks to the PNR for remarks {string}")
    public void iAddRemarks_For_the_PNR(String remarkType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + remarkType + " remarks to the PNR");
            isharesPage4.addRemarksPnr(logInfo, remarkType);
            logInfo.pass("I add remarks to the PNR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Block all the seats for the Booked Class")
    public void iBlockAllTheSeatsForTheBookedClass() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Block all the seats for the Booked Class");
            isharesPage4.blockTheAvailableSeats(logInfo);
            logInfo.pass("I Block all the seats for the Booked Class");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change first segment status {string}")
    public void iChangeFirstSegmentStatus(String StatusType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change first segment status");
            isharesPage4.changeFirstSegStatus(logInfo,StatusType);
            logInfo.pass("I change first segment status");
        } catch (AssertionError | Exception e)
        {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-RAQ_ command to add Ticketing Remarks")
    public void iEnterTRAQ_CommandToAddTicketingRemarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-RAQ_ command to add Ticketing Remarks");
            isharesPage4.EnterTRAQ_CommandToAddTicketingRemarks(logInfo);
            logInfo.pass("I enter T-RAQ_ command to add Ticketing Remarks");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *T to show Ticketing Remarks")
    public void iEnterTToShowTicketingRemarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *T to show Ticketing Remarks");
            isharesPage4.ToShowTicketingRemarks(logInfo);
            logInfo.pass("I enter *T to show Ticketing Remarks");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add the Ticketing Remarks for Original Issue with Origin")
    public void iAddTheTicketingRemarksForOriginalIssueWithOrigin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the Ticketing Remarks for Original Issue with Origin");
            isharesPage4.addRemarksForOriginalIssueWithOrigin(logInfo);
            logInfo.pass("I add the Ticketing Remarks for Original Issue with Origin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform ticketing remarks with Restrictions or Endorsements")
    public void iPerformTicketingRemarksWithRestrictionsOrEndorsements() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform ticketing remarks with Restrictions or Endorsements");
            isharesPage4.ToPerformTicketingRemarksWithRestrictionsOrEndorsements(logInfo);
            logInfo.pass("I perform ticketing remarks with Restrictions or Endorsements");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter $-$- to auto fare quote for NRPS pax")
    public void iEnter$$ToAutoFareQuoteForNRPSPax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$- to auto fare quote for NRPS pax");
            isharesPage4.autoFareForNRPSPaxWithoutPayment(logInfo);
            logInfo.pass("Auto fare quote for NRPS pax");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PBT command with PBT type {string} to display total passenger boarding SHARES entries")
    public void i_enter_PBT_command_with_PBT_type_to_display_total_passenger_boarding_SHARES_entries(String pbt) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBT command with PBT type" +pbt+ "to display total passenger boarding SHARES entries");
            isharesPage4.PBTCommand_Totals_Segment_Detail(logInfo, pbt);
            logInfo.pass("I enter PBT command with PBT type" +pbt+ "to display total passenger boarding SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I make adjust on coupon for segment {string}")
    public void  i_make_adjust_on_coupon_for_segment(String SegmentSeqNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make adjust on ETKT coupon for Segment : " + SegmentSeqNum);
            isharesPage4.RunT_ETCommand(logInfo,SegmentSeqNum);
            logInfo.pass("I make adjust on ETKT coupon " + SegmentSeqNum);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @Then("I remove the coupon status for segment01")
    public void I_remove_the_coupon_status_For_the_PNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove the coupon status");
            isharesPage4.removeCouponStatus(logInfo);
            logInfo.pass("I remove the coupon status");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter SSR command for Not Available")
    public void I_enter_SSR_command_for_Not_Available(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR command for Not Available");
            isharesPage4.enterSSRCommandForNotAvailable(logInfo);
            logInfo.pass("I enter SSR command for Not Available");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6TAG command to display bag tag numbers for all passengers")
    public void iEnter6TAGCommandToDisplayBagTagNumbersForAllPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TAG command to display bag tag numbers for all passengers");
            isharesPage4.TAGCommandToDisplayBagTagNumbersForAllPassengers(logInfo);
            logInfo.pass("I enter TAG command to display bag tag numbers for all passengers in the PNR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I try to change the name of the passenger {string}")
    public void iTryToChangeTheNameOfThePassenger(String PaxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to change the name of the passenger");
            isharesPage4.changingTheNameOfPax(logInfo, PaxCount);
            logInfo.pass("I try to change the name of the passenger");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I make the payment for specific pax using the payment type {string} and {string}")
    public void iMakeThePaymentForSpecificPaxUsingThePaymentType(String PaymentType, String QuoteIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the payment for specific pax using the payment type" +PaymentType);
            isharesPage4.makePaymentForSpecificPax(logInfo, PaymentType, QuoteIndex);
            logInfo.pass("I make the payment for specific pax using the payment type" +PaymentType);


        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I have done fare quote for the pnr totalpax without payment")
    public void iHaveDoneFareQuoteForThePnrTotalpaxWithoutPayment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I have done fare quote for the pnr totalpax without payment");
            isharesPage4.makeFareQuote(logInfo);
            logInfo.pass("I have done fare quote for the pnr totalpax without payment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LA$R command to get the best buy fare quote and verify the fare changes")
    public void iEnterLA$RCommandToGetTheBestBuyFareQuoteAndVerifyTheFareChanges() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$R command to get the best buy fare quote and verify the fare changes");
            isharesPage4.getTheBestBuyFareQuoteAndVerifyFareChanges(logInfo);
            logInfo.pass("I enter LA$R command to get the best buy fare quote and verify the fare changes");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter -_@_CHD_ command to update the passenger at the {string} to a child passenger")
    public void iEnter__CHD_CommandToUpdateThePassengerAtTheToAChildPassenger(String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter -_@_CHD_ command to update the passenger to a child passenger");
            isharesPage4.updateThePassengerToAChildPassenger(logInfo, index);
            logInfo.pass("I enter -_@_CHD_ command to update the passenger to a child passenger");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage4.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter -_@_ command to delete and add {string} with lastname {string}")
    public void iEnter_CommandToDeleteTheAPISDetailsOfThePassengersAndAddNewFQTVName(String FQTVNo, String lastnameFQTV) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter -_@_ command to delete the APIS details of the passengers and add new FQTV name");
            isharesPage4.deleteNameandAddNewFQTVPassenger(logInfo, FQTVNo, lastnameFQTV);
            logInfo.pass("I enter -_@_ command to delete the APIS details of the passengers and add new FQTV name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add Same Surname Group name to the PNR")
    public void iAddSameSurnameGroupNameToThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Same Surname Group name to the PNR");
            isharesPage4.addSameSurnameGroupName(logInfo);
            logInfo.pass("I add Same Surname Group name to the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6-CQA_C_ command and check boarding pass with baggage tag print response")
    public void iEnterCQA_C_CommandAndCheckBoardingPassWithaggageTagPrintResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CQA_C_ command and check boarding pass with baggage tag print response");
            isharesPage4.IEnter_6_CQA_C_Command(logInfo);
            logInfo.pass("I enter 6-CQA_C_ command and check boarding pass with baggage tag print response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter SSR command for multi initial pax ssr type {string}")
    public void i_enter_SSR_command(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR command for multi initial pax ssr type " + SSRType);
            isharesPage4.addSSRforMultiInitialPax(logInfo, SSRType);
            logInfo.pass("I enter SSR command for multi initial pax ssr type " + SSRType);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability of special pnr for second segment from {string} to {string} with different flight")
    public void i_search_for_flight_availability_special_pnr_for_secondsegment_different_flight(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability of special pnr for second segment from " + origin + " to " + destination);
            isharesPage4.searchFlightAvailabilityForSpecialPNRForSecondSegment(logInfo, origin, destination);
            logInfo.pass("I search for flight availability of special pnr for second segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I delete the passenger data from the Passenger Array for index {string}")
    public void iDeleteThePassengerDataFromThePassengerArrayForIndex(String paxIndex) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete the passenger data from the Passenger Array for index " + paxIndex);
            isharesPage4.removePaxDataFromArrayList(logInfo, paxIndex);
            logInfo.pass("I delete the passenger data from the Passenger Array for index " + paxIndex);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter passenger details for specific pax with index{string}")
    public void iEnterPassengerDetailsForSpecificPaxWithIndex(String paxIndex) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details for specific pax with index "+paxIndex);
            isharesPage4.enter_passenger_Details_for_specific_Pax(logInfo,paxIndex);
            logInfo.pass("I enter passenger details for specific pax with index "+paxIndex);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZH_ command to display PNIS for Infant passenger")

    public void i_enter_6_ZH_command_to_display_PNIS_for_infant_passenger() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to display PNIS for Infant passenger");
            isharesPage4.displayPNISforInfantPax(logInfo);
            logInfo.pass("I enter 6:ZH_ command to display PNIS for Infant passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter *ET command to display ETKT Baggage rules by sequence number")
    public void display_baggagerulesbysequencenumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET command to display ETKT Baggage rules by sequence number");
            isharesPage4.baggage_rules_display_bySequenceNum(logInfo);
            logInfo.pass("I enter *ET command to display ETKT Baggage rules by sequence number");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter PNBI display Restriction table")
    public void I_enter_PNBI_display_Restriction_Table(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBI display Restriction table");
            isharesPage4.enterPNBIDisplayRestrictionTable(logInfo);
            logInfo.pass("I enter PNBI display Restriction table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-$EIZ_ET command to Adjust Irregular Exchange{string}")
    public void iEnterT$EIZ_ETCommandToAdjustIrregularExchange(String Segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EIZ_ET command to Adjust Irregular Exchange");
            isharesPage4.Enter_T_$EIZ_ET_Command_To_Exchange(logInfo,Segment);
            logInfo.pass("I enter T-$EIZ_ET command to Adjust Irregular Exchange");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I change the segment {string} with the new Date")
    public void iChangeTheSegmentWithTheNewDate(String Segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the segment with the new Date");
            isharesPage4.ChangeTheSegmentWithTheNewDate(logInfo,Segment);
            logInfo.pass("I change the segment with the new Date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I perform date change for 2nd Segment {string}")
    public void I_perform_date_change_for_2nd_Segment(String Segment){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform date change for 2nd Segment");
            isharesPage4.performDateChangeFor2ndSegment(logInfo, Segment);
            logInfo.pass("I perform date change for 2nd Segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify Visa info with one destination one transit and one visited point")
    public void I_verify_Visa_SITA_TC001() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify Visa info with one destination one transit and one visited point");
            isharesPage4.verify_Visa_SITA_TC001(logInfo);
            logInfo.pass("I enter command to verify Visa info with one destination one transit and one visited point");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify Visa info with multiple destination one transit and one visited point")
    public void I_verify_Visa_SITA_TC002() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify Visa info with multiple destination one transit and one visited point");
            isharesPage4.verify_Visa_SITA_TC002(logInfo);
            logInfo.pass("I enter command to verify Visa info with multiple destination one transit and one visited point");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify Health info with one destination one transit and one visited point")
    public void I_verify_Visa_SITA_TC003() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify Health info with one destination one transit and one visited point");
            isharesPage4.verify_Visa_SITA_TC003(logInfo);
            logInfo.pass("I enter command to verify Health info with one destination one transit and one visited point");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify Health info with multiple destinations, one transit and one visited point")
    public void I_verify_Visa_SITA_TC004() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify Health info with multiple destinations, one transit and one visited point");
            isharesPage4.verify_Visa_SITA_TC004(logInfo);
            logInfo.pass("I enter command to verify Health info with multiple destinations, one transit and one visited point");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to verify Visa&Health info with multiple destinations, one transit and one visited point")
    public void I_verify_Visa_SITA_TC006() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify Visa&Health info with multiple destinations, one transit and one visited point");
            isharesPage4.verify_Visa_SITA_TC006(logInfo);
            logInfo.pass("I enter command to verify Visa&Health info with multiple destinations, one transit and one visited point");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ET_PARTNER command {string} and verify the respected response will be displayed successfully")
    public void iEnterT_ET_PARTNER_Command_And_Verify_Response(String strCommand) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_PARTNER command and verify the respected response will be displayed successfully");
            isharesPage4.EnterT_ET_PARTNER_Command_And_Verify_Response(logInfo, strCommand);
            logInfo.pass("I enter T-ET_PARTNER command and verify the respected response will be displayed successfully");
        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter ZBEVF DISPLAY for signal event user {string}")
    public void I_enter_ZBEVF_DISPLAY_for_signal_event_user(String Code){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZBEVF DISPLAY for signal event user");
            isharesPage4.enterZBEVFDisplayForSignalEventUser(logInfo, Code);
            logInfo.pass("I enter ZBEVF DISPLAY for signal event user");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command T* for read info on timatic in native shares {string}")
    public void iEnterCommandTForReadInfoOnTimaticInNativeShares(String CodeType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command T* for read info on timatic in native shares");
            isharesPage4.InfoTimatic(logInfo, CodeType);
            logInfo.pass("I enter command T* for read info on timatic in native shares");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }
    @And("I enter command T* with city {string} info on type {string} of timatic")
    public void iEntercommandTWithCityInfoOnTypeOfTimatic(String city, String Type) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command T* with city info on type of timatic");
            isharesPage4.cityInfoTimatic(logInfo, city, Type);
            logInfo.pass("I enter command T* with city info on type of timatic");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }
    @And("I enter command T* {string} with read info on timatic country {string}")
    public void iEnterCommandTWithReadInfoOnTimaticCountry(String CodeType, String Country) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command T* type with read info on timatic country");
            isharesPage4.countryInfoTimatic(logInfo, CodeType, Country);
            logInfo.pass("I enter command T* type with read info on timatic country");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }
    @And("I enter KSC command")
    public void iEnterKSCCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KSC command");
            isharesPage4.EnterKSCCommand(logInfo);
            logInfo.pass("I enter KSC command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter KSR_ command {string}")
    public void iEnterKSR_Command(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KSR command " + Entry);
            isharesPage4.enterKSRCommand(logInfo, Entry);
            logInfo.pass("I enter KSR command " + Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter the T*DFT_ command {string} {string}")
    public void I_enter_the_T_DFT_command(String passType, String code){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the T*DFT_ command");
            isharesPage4.enterTheTDFTCommand(logInfo, passType, code);
            logInfo.pass("I enter the T*DFT_ command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Timatic command for T*DFT_ {string} {string}")
    public void I_enter_Timatic_command_for_T_DFT(String passType, String code){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Timatic command for T*DFT_");
            isharesPage4.enterTimaticCommandForTDFT(logInfo, passType, code);
            logInfo.pass("I enter Timatic command for T*DFT_");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Timatic command for T*RCC {string}")
    public void I_enter_Timatic_command_for_T_RCC(String Code){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Timatic command for T*RCC");
            isharesPage4.enterTimanticCommandForTRCC(logInfo, Code);
            logInfo.pass("I enter Timatic command for T*RCC");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Timatic command for T*DFT_ {string} it should enable")
    public void I_enter_Timatic_command_for_TDFT_it_should_enable(String code){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Timatic command for T*DFT_ it should enable");
            isharesPage4.enterTimaticCommandForTDFTItShloudenable(logInfo, code);
            logInfo.pass("I enter Timatic command for T*DFT_ it should enable");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter OCM*UGX1* command Verify the error message {string}")
    public void I_enter_OCM_UGX1_command_Verify_the_error_message(String Appswitch){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*UGX1* command Verify the error message");
            isharesPage4.enterOCMUGXCommandVerifyTheErrorMessage(logInfo, Appswitch);
            logInfo.pass("I enter OCM*UGX1* command Verify the error message");


        } catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }
    @And("I enter T-ETREFUND command to refund the tk")
    public void Enter_DisplayETREFUND() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETREFUND command to refund the tk");
            isharesPage4.DisplayETREFUND(logInfo);
            logInfo.pass("I enter T-ETREFUND command to refund the tk");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter T-ETREFUND command to refund penalty")
    public void Enter_DisplayETREFUNDPanalty() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETREFUND command to refund penalty");
            isharesPage4.DisplayETREFUNDPanalty(logInfo);
            logInfo.pass("I enter T-ETREFUND command to refund penalty");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    // March Missing
    @And("I enter $-$- with the {string} Command")
    public void iEnter$$WithTheCommand(String cmd) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $-$- command");
            isharesPage4.displayAutoFareQuote_Command(logInfo,cmd);
            logInfo.pass("I enter $-$- with Command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 0_NN1 sell commmand with {string} {string} {string} {string} {string} {string} to check the Availability")
    public void iEnter_NNSellCommmandWithToCheckTheAvailability(String airline, String flight, String cos,String Date, String org, String dest) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0CM to check the Availability for segment");
            isharesPage4.enter0CMAvailabilitySellCommand(logInfo,airline,flight,Date,cos,org,dest);
            logInfo.pass("I enter 0CM to check the Availability for segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter the command QM_Message|LAST for {string}")
    public void iEnterTheCommandQMMessageLAST(String messageType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the command QM_PEK|LAST");
            isharesPage4.EnterTheCommandQMMessageLAST(logInfo, messageType);
            logInfo.pass("I enter the command QM_MUC|LAST");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EH- command to display the Inaccessible message for specific ticket number")
    public void iEnterEHCommandToDisplayInaccessiblemessageForSpecificTicketNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH- command to display the Inaccessible message for specific ticket number");
            isharesPage4.toDisplayInaccessibleErrorForSpecificTicketNumber(logInfo);
            logInfo.pass("I enter *EH- command to display the Inaccessible message for specific ticket number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }


    @And("I enter BSIB command for Similar Name in TR duty code")
    public void iEnterBSIBCommandForSmilarNameInTRDutyCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSIB command for Similar Name in TR duty code");
            isharesPage4.enterBSIBCommandForSimilarNameInTRDutyCode(logInfo);
            logInfo.pass("I enter BSIB command for Similar Name in TR duty code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter 6:DWR_ command to display and modify denied boarding flight info for the specific flight with Remark{string}")
    public void iEnterDWR_CommandToDisplayAndModifyDeniedBoardingFlightInfoForTheSpecificFlightWithRemark(String remark) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DWR_ command to display and modify denied boarding flight info for the specific flight with Remark");
            isharesPage4.ToDisplayAndModifyDeniedBoardingFlightWithRemark(logInfo,remark);
            logInfo.pass("I enter 6:DWR_ command to display and modify denied boarding flight info for the specific flight with Remark");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter LA_R command to do best buy with {string}")
    public void iEnterLA_RCommandForlowestBestBuy(String commandType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA_R command to do best buy fare quote");
            System.out.println("I enter LA_R command to do best buy fare quote");
            isharesPage4.enterLA_RCmdForBestBuy(logInfo, commandType);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KM6 command to add delete OA carrier from SD table")
    public void i_enter_KM6_command_to_add_delete_OA_carrier_from_SD_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KM6 command to add delete OA carrier from SD table");
            isharesPage4.deleteAddOACarrierFromSDTable(logInfo);
            logInfo.pass("I enter KM6 command to delete OA carrier from SD table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter TTY message to generate pnr for system {string} with invalid group name{string} and AF reject msgs to special city {string}")
    public void iEnterTTYMessageToGeneratePnrForSystemWithInvalidGroupNameWithAFrejectMsg(String SystemType, String Entry, String City) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment with invalid group name and AF reject msgs to special city");
            isharesPage4.TTYMessageBasicAirlinePnrWithInvalidGroupName_WithAFrejectMsg(logInfo, SystemType, Entry, City);
            logInfo.pass("I enter TTY message to generate basic airline segment with group name and AF reject msgs to special city");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:DVDI_ and 6:LDVDI command to perform voluntary denied boarding passengers after checkin process")
    public void iEnterDVDI_and_LDVDICommandToPerformvoluntaryDeniedBoardingPassengersAfterCheckinProcessForAllThePassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DVDI_ and 6:LDVDI command to perform voluntary denied boarding passengers after checkin process");
            isharesPage4.enterDVDIAndLDVDICmdToPerformVoluntaryDeniedBoardingPax(logInfo);
            logInfo.pass("I enter 6:DVDI_ and 6:LDVDI command to perform voluntary denied boarding passengers after checkin process");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I do checkin as Exempted passenger")
    public void iPerformcheckinAsExemptedPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin as Exempted passenger");
            isharesPage4.checkinasExemptedpassenger(logInfo);
            logInfo.pass("I do checkin as Exempted passenger ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I enter DX command to run the auxiliary entries")
    public void I_enter_DX_Commands(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DX command to run the auxiliary entries");
            isharesPage4.ienter_DX_Command(logInfo);
            logInfo.pass("I enter DX command to run the auxiliary entries");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter DXJFK command to run the auxiliary entries")
    public void I_enter_DXJFK_Commands(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DXJFK command to run the auxiliary entries");
            isharesPage4.ienter_DXJFK_Command(logInfo);
            logInfo.pass("I enter DXJFK command to run the auxiliary entries");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-ETCKPRICE command to check TOTAL FARE FOR ALL ETKT for COP Currency")
    public void Enter_TOTALFAREFORALLETKTCOP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETCKPRICE command to check TOTAL FARE FOR ALL ETKT for COP Currency");
            isharesPage4.TOTALFAREFORALLETKTCOP(logInfo);
            logInfo.pass("I enter T-ETCKPRICE command to check TOTAL FARE FOR ALL ETKT for COP Currency");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 2P command to perform IN flifo operation without message")
    public void iEnterPCommandToPerformINFlifoOperationWithoutMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform IN flifo operation without message");
            isharesPage4.Create_2PCommandINTimeWithoutMsg(logInfo);
            logInfo.pass("I enter 2P command to perform IN flifo operation without message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I add Same Surname Corporate name to the PNR in Native shares")
    public void iAddSameSurnameCorporateNameToThePNRInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Same Surname Corporate name to the PNR in Native shares");
            isharesPage4.addSameSurnameCorporateNameInNativeShares(logInfo);
            logInfo.pass("I add Same Surname Corporate name to the PNR in Native shares");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add same surname Corporate pax to {string} passengers in Native shares")
    public void iAddSameSurnameCorporatePaxToPassengersInNativeShares(String paxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add same surname Corporate pax to " + paxCount + " passengers in Native shares");
            isharesPage4.addSameSurnameCorporateToPaxInNativeShares(logInfo, paxCount);
            logInfo.pass("I add same surname Corporate pax to " + paxCount + " passengers in Native shares");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter passenger details with same surname for all passenger in Native shares")
    public void iEnterPassengerDetailsWithSameSurnameForAllPassengerInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details with same surname for all passenger in Native shares");
            isharesPage4.enterAllPassengerDetailsForSameSurnamePaxInNativeShares(logInfo);
            System.out.println("I enter passenger details with same surname for all passenger in Native shares");
            logInfo.pass("I enter passenger details with same surname for all passenger in Native shares");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add Same Surname Group name to the PNR in Native shares")
    public void iAddSameSurnameGroupNameToThePNRInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Same Surname Group name to the PNR in Native shares");
            isharesPage4.addSameSurnameGroupNameInNativeShares(logInfo);
            logInfo.pass("I add Same Surname Group name to the PNR in Native shares");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add same surname Group pax to {string} passengers in Native shares")
    public void iAddSameSurnameGroupPaxToPassengersInNativeShares(String paxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add same surname Group pax to " + paxCount + " passengers in Native shares");
            isharesPage4.addSameSurnameGroupToPaxInNativeShares(logInfo, paxCount);
            logInfo.pass("I add same surname Group pax to " + paxCount + " passengers in Native shares");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add same surname to {string} passengers in Native shares")
    public void iAddSameSurnameToPassengersInNativeShares(String paxCount) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add same surname to " + paxCount + " passengers in Native shares");
            isharesPage4.addSameSurnameToPaxInNativeShares(logInfo, paxCount);
            logInfo.pass("I add same surname to " + paxCount + " passengers in Native shares");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:CX command to perform reinstate and cancel misconnect passengers from CM flight")
    public void iEnterCXCommandToPerformReinstateAndCancelMisconnectPassengersFromCMFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CX command to perform reinstate and cancel misconnect passengers from CM flight");
            System.out.println("I enter 6:CX command to perform reinstate and cancel misconnect passengers from CM flight");
            isharesPage4.performReinstateAndCancelMisconnect(logInfo);
            logInfo.pass("I enter 6:CX command to perform reinstate and cancel misconnect passengers from CM flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I search for flight availability in Native shares for married Segment flights from {string} to {string}")
    public void iSearchForFlightAvailabilityInNativeSharesForMarriedSegmentFlightsFromTo(String OriginCity, String Destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability in Native shares for married Segment flights from "+OriginCity+" to "+Destination);
            isharesPage4.SearchForFlightAvailabilityForSelectingTheMarriedSegmentInNativeShares(logInfo,OriginCity,Destination);
            logInfo.pass("I search for flight availability in Native shares for married Segment flights from "+OriginCity+" to "+Destination);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZAFIL command to change segment status to PD {string}")
    public void iEnterZAFILCommandToChangeSegmentStatusToPD(String SegmentNumber) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL command to change segment status to PD :"+SegmentNumber);
            isharesPage4.makeSegmentPD(logInfo,SegmentNumber);
            logInfo.pass("I enter ZAFIL command to change segment status to PD :"+SegmentNumber);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I search for flight availability for first segment from {string} to {string} for waitlist pax in Native Shares")
    public void iSearchForFlightAvailabilityForFirstSegmentFromToForWaitlistPaxInNativeShares(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for first segment for waitlist pax in Native Shares");
            isharesPage4.searchFlightAvailabilityForFirstSegForWaitlistPaxInNativeShares(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for first segment for waitlist pax in Native Shares");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter CM voided command for passenger {string}")
    public void iEnterCMVoidedCommandForPassenger(String paxno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CM voided command for passenger");
            isharesPage4.enterCMVoidedCommand(logInfo,paxno);
            logInfo.pass("I enter CM voided command for passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $_PTYEZE command for brand fare entries")
    public void I_enter_$_PTYEZE_command_for_brand_fare_entries(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_PTYEZE command for brand fare entries");
            isharesPage4.enter$PTYEZECommandForBrandFreeEntries(logInfo);
            logInfo.pass("I enter $_PTYEZE command for brand fare entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$EE_ command to reissue ticket with even exchange{string}")
    public void iEnterT$EE_CommandToReissueTicketWithEvenExchange(String exchangeType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EE_ command to reissue ticket with even exchange");
            isharesPage4.ToReissueTicketWithEvenExchange(logInfo,exchangeType);
            logInfo.pass("I enter T-$EE_ command to reissue ticket with even exchange");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter $:S:_ command to Pricing using segment selection for {string}")
    public void iEnter$$_CommandFor_Pricing_Using_Segment_Selection(String strType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $:S:_ command to Pricing using segment selection for "+strType);
            isharesPage4.enter$$CommandForPricingUsingSegmentSelection(logInfo,strType);
            logInfo.pass("I enter $:S:_ command to Pricing using segment selection for "+strType);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZZGLO CM Redemption availability entry {string}")
    public void I_enter_ZZGLO_CM_command_to_display(String entry){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZZGLO CM Redemption availability entry");
            isharesPage4.enterZZGLOCMCommandToDisplay(logInfo, entry);
            logInfo.pass("I enter ZZGLO CM Redemption availability entry");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZUGLO CM Redemption availability entry {string}")
    public void I_enter_ZUGLO_CM_command_to_display(String entry){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZUGLO CM Redemption availability entry");
            isharesPage4.enterZUGLOCMCommandToDisplay(logInfo, entry);
            logInfo.pass("I enter ZUGLO CM Redemption availability entry");

        }catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$UE_ET command to run uneven exchange")
    public void iEnterT$UE_ETCommandToRunUnEvenExhange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$UE_ET command to run uneven exchange");
            isharesPage4.enterT$UE_ETCommandToRunUnEvenExhange(logInfo);
            logInfo.pass("I enter T-$UE_ET command to run uneven exchange");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I retrieve the PNR in ishares and validate the status of the passenger {string}")
    public void iRetrieveThePNRInIsharesAndValidateTheStatusOfThePassenger(String status) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the PNR in ishares and validate the status of the passenger");
            isharesPage4.retrieveThePNRInIsharesAndValidateStatusOfThePax(logInfo, status);
            logInfo.pass("I retrieve the PNR in ishares and validate the status of the passenger");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I retrieve the PNR in ishares and validate the SSR {string}")
    public void iRetrieveThePNRInIsharesAndValidateTheSSR(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the PNR in ishares and validate the SSR");
            isharesPage4.retrieveThePNRAndValidateTheSSR(logInfo, SSRType);
            logInfo.pass("I retrieve the PNR in ishares and validate the SSR");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I retrieve the PNR in ishares and validate the seat numbers assigned to all the passengers")
    public void iRetrieveThePNRInIsharesAndValidateTheSeatNumbersAssignedToAllThePassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the PNR in ishares and validate the seat numbers assigned to all the passengers");
            isharesPage4.retrieveThePNRAndValidateTheAssignedSeatsNumbers(logInfo);
            logInfo.pass("I retrieve the PNR in ishares and validate the seat numbers assigned to all the passengers");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 0A command to add ARNK in Native shares")
    public void iEnterACommandToAddARNKInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 0A command to add ARNK in Native shares");
            isharesPage4.enter0AForARNKInNativeShares(logInfo);
            logInfo.pass("I enter 0A command to add ARNK in Native shares");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I retrieve the PNR in iShares and validate that an ARNK segment is present in the PNR")
    public void iRetrieveThePNRInISharesAndValidateThatAnARNKSegmentIsPresentInThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the PNR in iShares and validate the ARNK segment is present in the PNR");
            isharesPage4.retrieveThePNRInIsharesAndValidateTheARNKSegment(logInfo);
            logInfo.pass("I retrieve the PNR in iShares and validate the ARNK segment is present in the PNR");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I enter 2_ command to check the FLIFO of a flight in ishares and validate the details")
    public void iEnter_CommandToCheckTheFLIFOOfAFlightInIsharesAndValidateTheDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to check the FLIFO of a flight in ishares and validate the details");
            isharesPage4.checkFLIFOOfAFlightInIsharesAndValidateTheDetails(logInfo);
            logInfo.pass("I enter 2_ command to check the FLIFO of a flight in ishares and validate the details");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter P_ command to update the OUT time of the flight in ishares")
    public void iEnterP_CommandToUpdateTheOUTTimeOfTheFlightInIshares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter P_ command to update the OUT time of the flight in ishares");
            isharesPage4.updateOutTimeForFLIFOInIshares(logInfo);
            logInfo.pass("I enter P_ command to update the OUT time of the flight in ishares");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I perform baggage modification with invalid flight number and verify the error message")
    public void iPerformBaggageModificationWithInvalidFlightNumberAndVerifyTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform baggage modification with invalid flight number and verify the error message");
            isharesPage4.baggageModificationWithinvalidFlightNo(logInfo);
            logInfo.pass("I perform baggage modification with invalid flight number and verify the error message");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I search for flight availability for second segment from {string} to {string} for a specific class")
    public void iSearchForFlightAvailabilityForSecondSegmentFromToForASpecificClass(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability for first segment for a specific class");
            isharesPage4.bookSecondFlightForSpecificClass(logInfo, origin, destination);
            logInfo.pass("I search for flight availability for first segment for a specific class");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:U_ command to uncheck the passenger with seat number")
    public void iEnterU_CommandToUncheckThePassenger_WithSeatNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:U_ command to uncheck the passenger with seat number");
            isharesPage4.enterU_CommandToUncheckThePassenger_WithSeatNumber(logInfo);
            logInfo.pass("I enter 6:U_ command to uncheck the passenger with seat number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter long cell command for second segment")
    public void iEnterLongCellCommandForSecondSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long cell command for second segment");
            isharesPage4.longCellCommandForSecondSegment(logInfo);
            logInfo.pass("I enter long cell command for second segment");

        } catch (AssertionError | Exception exception) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

}

























