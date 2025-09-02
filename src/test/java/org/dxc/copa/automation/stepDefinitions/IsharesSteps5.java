package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.java.en.And;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.testng.Assert;

public class IsharesSteps5 extends StepManager {

    ExtentTest logInfo = null;


    @And("I generate the ticket document numbers for passengers")
    public void iGenerateTheTicketDocumentNumbersForPassengers() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I generate the ticket document numbers for passengers");
            isharesPage5.generateTicketDocumentNos(logInfo);
            logInfo.pass("I generate the ticket document numbers for passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD for displaying pax information")
    public void Enter_6LDpaxinfo() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD for displaying pax information");
            isharesPage5.paxinfodisplay(logInfo);
            logInfo.pass("I enter 6:LD for displaying pax information");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares")
    public void iEnter_CommandToPerformDelayedOperationInFLIFOInNativeShares( ) {

        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares");
            isharesPage5.toUpdateTimeForFLIFOInNativeShares(logInfo);
            logInfo.pass("I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter 2_ command to know the details of the flight in Native Shares")
    public void iEnter_CommandToKnowTheDetailsOfTheFlightInNativeShares( ) {

        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to know the details of the flight");
            isharesPage5.toGetDetailsOfFlightInNativeShares(logInfo);
            logInfo.pass("I enter 2_ command to know the details of the flight");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares using OUT command")
    public void iEnter_CommandToPerformDelayedOperationInFLIFOInNativeSharesUsingOUTCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares using OUT command");
            isharesPage5.enterOUTCommandINNativeShares(logInfo);
            logInfo.pass("I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares using OUT command");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I try to assign the gate number {string} for Arrival or Departure flights {string} in Native Share")
    public void iTryToAssignTheGateNumberForArrivalOrDepartureFlightsInNativeShare(String gateNo, String country) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to assign the Gate number: "+gateNo);
            isharesPage5.assignGateNumberForArrivalOrDepartureInNativeShares(logInfo,gateNo,country);
            logInfo.pass("I try to assign the Gate number: "+gateNo);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to delete reverse codeshare table for the carrier {string}")
    public void I_enter_command_to_delete_reverse_codeshare_table_for_the_carrier(String carrier) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to update reverse codeshare table for the carrier");
            isharesPage5.deleteReverseCodeshareTable(logInfo, carrier);
            logInfo.pass("I enter command to update reverse codeshare table for the carrier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I retrieve the pnr in native shares and validate that the SSR is added {string}")
    public void iRetrieveThePnrInNativeSharesAndValidateThatTheSSRIsAdded(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the pnr in native shares and validate that the SSR is added");
            isharesPage5.retrievePNRInNativeSharesAndValidateSSRIsAdded(logInfo, SSR);
            logInfo.pass("I retrieve the pnr in native shares and validate that the SSR is added");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add {string} frequent flyer gold passengers")
    public void iAddFrequentFlyerGoldPassengers(String noOfFQTVPax ) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + noOfFQTVPax + " frequent flyer passengers");
            isharesPage5.addFQTV_Gold(noOfFQTVPax);
            logInfo.pass("I add " + noOfFQTVPax + " frequent flyer passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DV.DI_ command to change the pax status from HKN to VOL for Adult passengers")
    public void iEnterDVDI_CommandToChangeThePaxStatusFromHKNToVOLforAdultPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV.DI_ command to change the pax status from HKN to VOL for adult passengers");
            isharesPage5.changePaxStatusFromHKNToVOLForAdultPassengers(logInfo);
            logInfo.pass("I enter 6:DV.DI_ command to change the pax status from HKN to VOL for adult passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I do the voluntary grade of Shares PNR {string} for multi initial")
    public void iDoTheVoluntaryGradeOfSharesPNRmulti(String GradeType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the voluntary grade of Shares PNR " +GradeType);
            isharesPage5.doTheVoluntaryGradeOfSharesPNRMultiInitial(logInfo, GradeType);
            logInfo.pass("I do the voluntary grade of Shares PNR "+GradeType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the voluntary grade of multiple Shares PNRs {string} for normal Pax")
    public void iDoTheVoluntaryGradeOfMultipleSharesPNRsNormalPax(String GradeType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the voluntary grade of multiple Shares PNRs for " +GradeType);
            isharesPage5.doTheVoluntaryGradeOfMultipleSharesPNRForNormalPax(logInfo, GradeType);
            logInfo.pass("I do the voluntary grade of multiple Shares PNRs for "+GradeType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DV_ and 6:LDI_ command to perform involuntary denied boarding passengers after checkin process for all the passengers for multi initial")
    public void iEnterDV_AndLDI_CommandToPerformInvoluntaryDeniedBoardingPassengersAfterCheckinProcessForAllThePassengersformultiinitial() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DV_ and 6:LDI_ command to perform involuntary denied boarding passengers after checkin process for all the passengers for multi initial");
            isharesPage5.performInvoluntaryDeniedBoardingPaxAfterCheckinProcessForAllPaxMultiInitial(logInfo);
            logInfo.pass("I enter 6:DV_ and 6:LDI_ command to perform involuntary denied boarding passengers after checkin process for all the passengers for multi initial");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I search for flight availability without booking segment from {string} to {string}")
    public void iSearchForFlightAvailabilityWithoutBookingSegmentFromTo(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability without booking segment from " + origin + " to " + destination);
            isharesPage5.searchFlightAvailabilityWithoutBookSeg(logInfo, origin, destination);
            logInfo.pass("I search for flight availability without booking segment from " + origin + " to " + destination);
            System.out.println("I search for flight availability without booking segment from " + origin + " to " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of Multiple Shares PNRs for origin city {string} for Multi Initial Pax")
    public void iDoTheCheckinOfMultipleSharesPNRForOriginCityForMultiInitialPax(String originCity)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of multi initial passengers");
            isharesPage5.sharesCheckinMultiInitial_MultiplePNRs(logInfo, originCity);
            logInfo.pass("I do the checkin of multi initial passengers for Multiple Shares PNRs");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do checkin for Shares GO SHOW PNR with Eticket for {string}")
    public void iDoCheckinForSharesGOSHOWPNRWithEticket(String checkinType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for Shares GO SHOW PNR with Eticket");
            isharesPage5.sharesGOSHOW_PNR_CheckinForMultiplePNRs(logInfo,checkinType);
            logInfo.pass("I do checkin for Shares GO SHOW PNR with Eticket");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add {string} frequent flyer Presidential passengers")
    public void iAddFrequentFlyerPresidentialPassengers(String noOfFQTVPax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + noOfFQTVPax + " frequent flyer platinum passengers");
            isharesPage5.addPresidentialFQTV(logInfo, noOfFQTVPax);
            logInfo.pass("I add " + noOfFQTVPax + " frequent flyer platinum passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add {string} frequent flyer platinum passengers")
    public void iAddFrequentFlyerPlatinumPassengers(String noOfFQTVPax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + noOfFQTVPax + " frequent flyer platinum passengers");
            isharesPage5.addPlatinumFQTV(logInfo, noOfFQTVPax);
            logInfo.pass("I add " + noOfFQTVPax + " frequent flyer platinum passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add {string} silver frequent flyer passengers")
    public void iAddSilverFrequentFlyerPassengers(String noOfFQTVPax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + noOfFQTVPax + " silver frequent flyer passengers");
            isharesPage5.addSilverFQTV(noOfFQTVPax);
            logInfo.pass("I add " + noOfFQTVPax + " silver frequent flyer passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T_ET|USED command to change the specific segment to CM-USED status {string}")
    public void iEnterT_ETUSEDCommandToChangeTheSpecificSegmentToCMUSEDStatus(String segNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_ET|USED command to change the specific segment to CM-USED status - "+ segNumber);
            isharesPage5.changeSpecificSegmentStatusToCMUSED(logInfo, segNumber);
            logInfo.pass("I enter T_ET|USED command to change the specific segment to CM-USED status - "+ segNumber);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }
    @And("I store the old segment flight details for segment {string} for {string}")
    public void iStoreTheOldSegmentFlightDetailsForSegment(String segno, String index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I store the old segment flight details for segment "+ segno);
            isharesPage5.storeSegmentDetails(logInfo,segno,index);
            logInfo.pass("I store the old segment flight details for segment "+ segno);

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }
    @And("I enter *{string} command to display invalid entry")
    public void i_enter_type_QC_command_to_display_invalid_entry(String type) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *"+type+" command to display invalid entry");
            isharesPage5.displayInvalidentry(logInfo, type);
            logInfo.pass("I enter *"+type+" command to display invalid entry");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter EMD_SSR command")
    public void iEnterEMD_SSRCommand() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter EMD_SSR command");
            isharesPage5.enterEMD_SSR_Command(logInfo);
            logInfo.pass("I enter EMD_SSR command");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I try to assign the gate number {string} in Native Shares")
    public void iTryToAssignTheGateNumber(String gateNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to assign the Gate number: "+gateNo);
            isharesPage5.assignGateNumberInNativeShares(logInfo,gateNo);
            logInfo.pass("I try to assign the Gate number: "+gateNo);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", maeGUI.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter 6:LD_OC command to display outbound connection in Native Shares")
    public void iEnterLD_OCCommandToDisplayOutboundConnectionInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_OC command to display outbound connection in Native Shares");
            isharesPage5.ToDisplayOutboudConnectionListInNativeShares(logInfo);
            logInfo.pass("I enter 6:LD_OC command to display outbound connection in Native Shares");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I retrieve the pnr in native shares and validate that the all the SSR's are added")
    public void iRetrieveThePnrInNativeSharesAndValidateThatTheAllTheSSRSAreAdded() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the pnr in native shares and validate that the SSR is added");
            isharesPage5.retrievePNRInNativeSharesAndValidateAllSSRIsAdded(logInfo);
            logInfo.pass("I retrieve the pnr in native shares and validate that the SSR is added");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I retrieve the pnr in Native shares")
    public void iRetrieveThePnrInNativeShares() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I retrieve the pnr in Native shares");
            isharesPage5.retrievePNRInNativeShares(logInfo);
            logInfo.pass("I retrieve the pnr in Native shares");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:LD_SB command to display standby list for passenger in Native shares")
    public void iEnterLD_SBCommandToDisplayStandbyListForPassengerInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_SB command to display standby list for passenger in Native shares");
            isharesPage5.enter6LDCommandForStandByListPaxInNativeShares(logInfo);
            logInfo.pass("I enter 6:LD_SB command to display standby list for passenger in Native shares");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I cancel the flight in Native shares")
    public void iCancelTheFlightInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I cancel the flight in Native shares");
            isharesPage5.cancelTheFlightInNativeShares(logInfo);
            logInfo.pass("I cancel the flight in Native shares");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");

        }
    }


    @And("I add {string} frequent flyer passengers for airlines {string}")
    public void iAddFrequentFlyerPassengers(String noOfFQTVPax, String airlines) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + noOfFQTVPax + " frequent flyer passengers");
            isharesPage5.addFQTV_Airlines(noOfFQTVPax, airlines);
            logInfo.pass("I add " + noOfFQTVPax + " frequent flyer passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KE command to run he IBPR SC")
    public void iEnterKE_CommandToruntheIBPRSC() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KE command to run he IBPR SC");
            isharesPage5.iEnterKECommandToruntheIBPRSC(logInfo);
            logInfo.pass("I enter KE command to run he IBPR SC");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$EI_ET command to Adjust ETKT Coupon via 2 to 2 Irregular Exchange Reaccommodation")
    public void i_Enter_T_$EI_ET_Command_To_Adjust_2_2_Irregular_Exchange_Reaccommodation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EI_ET command to Adjust ETKT Coupon via 2 to 2 Irregular Exchange Reaccommodation");
            isharesPage5.Enter_T_$EI_ET_Command_To_Adjust_2_2_Irregular_Exchange_Reaccommodation(logInfo);
            logInfo.pass("I enter T-$EI_ET command to Adjust ETKT Coupon via 2 to 2 Irregular Exchange Reaccommodation");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter long cell command for booking multi leg flight")
    public void i_enter_long_cell_command_for_booking_multi_leg_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long cell command for booking multi leg flight");
            isharesPage5.Run_long_cell_command_for_multiLeg_flight(logInfo);
            logInfo.pass("I enter long cell command for booking multi leg flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LD_|CHD command for displaying child pax for all segments")
    public void iEnterLD_CHDCommandForDisplayingChildPaxForAllSegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|CHD command for displaying child pax for all segments");
            isharesPage5.childPaxinfodisplayForAllSeg(logInfo);
            logInfo.pass("I enter 6:LD_|CHD command for displaying child pax for all segments");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter *EH command to show passenger history in Native shares")
    public void iEnterEHCommandToShowPassengerHistoryInNativeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH command to show passenger history in Native shares");
            isharesPage5.enterEHCommandInNativeShares(logInfo);
            logInfo.pass("I enter *EH command to show passenger history in Native shares");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 2_ command to know the gate number for an flight in Native Shares")
    public void iEnter_CommandToKnowTheGateNumberForAnFlightInNativeShares() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ command to know the details of the flight");
            isharesPage5.toGetDetailsOfFlightInNativeShares(logInfo);
            logInfo.pass("I enter 2_ command to know the details of the flight");

        }catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


}
