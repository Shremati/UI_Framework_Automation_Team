package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.testng.Assert;

import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;

public class IsharesSteps3 extends StepManager {

    ExtentTest logInfo = null;

    @And("I enter T_PF*_PR command to display negotiated fare user access table with Duty code")
    public void iEnterT_PF_PRCommandToDisplayNegotiatedFareUserAccessTableWithDutyCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_PF*_PR command to display negotiated fare user access table with Duty code");
            isharesPage3.displayNegotiatedFareUserTablewithDutyCode(logInfo);
            logInfo.pass("I enter T_PF*_PR command to display negotiated fare user access table with Duty code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_PF* command to display negotiated fare user access table with Agent ID{string}")
    public void iEnterT_PFCommandToDisplayNegotiatedFareUserAccessTableWithAgentID(String agentID) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_PF* command to display negotiated fare user access table with Agent ID{string}");
            isharesPage3.displayNegotiatedFareUserTablewithAgentID(logInfo, agentID);
            logInfo.pass("I enter T_PF* command to display negotiated fare user access table with Agent ID{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:CSN_#@S command to display Override Smoking Leg Status")
    public void iEnterCSN_SCommandToDisplayOverrideSmokingLegStatus() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CSN_#@S command to display Override Smoking Leg Status");
            isharesPage3.displayOverrideSmokingStatus(logInfo);
            logInfo.pass("I enter 6:CSN_#@S command to display Override Smoking Leg Status");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CSN_#@N command to display Non-Smoking Leg Status")
    public void iEnterCSN_NCommandToDisplayNonSmokingLegStatus() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CSN_#@N command to display Non-Smoking Leg Status");
            isharesPage3.displayNon_SmokingStatus(logInfo);
            logInfo.pass("I enter 6:CSN_#@N command to display  Non-Smoking Leg Status");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET|CDS|A|90|F4_ command to replace an item{string} with SequenceNumber{string} in ARC_CDS Sequence Number Range Table")
    public void iEnterTETCDSAF_CommandToReplaceAnItemWithSequenceNumberInARC_CDSSequenceNumberRangeTable(String Item, String SequenceNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET|CDS|A|90|F4_ command to replace an item{string} with SequenceNumber{string} in ARC_CDS Sequence Number Range Table");
            isharesPage3.toReplaceiteminARC_CDS_SequenceNumberRangeTable(logInfo, Item, SequenceNum);
            logInfo.pass("I enter T-ET|CDS|A|90|F4_ command to replace an item{string} with SequenceNumber{string} in ARC_CDS Sequence Number Range Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET|CDS|A|90|F4_ command to add item{string} with SequenceNumber{string} in ARC_CDS Sequence Number Range Table")
    public void iEnterTETCDSAF_CommandToAddItemWithSequenceNumber(String Item, String SequenceNum) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET|CDS|A|90|F4_ command to add item{string} with SequenceNumber{string} in ARC_CDS Sequence Number Range Table");
            isharesPage3.toAdditeminARC_CDS_SequenceNumberRangeTable(logInfo, Item, SequenceNum);
            logInfo.pass("I enter T-ET|CDS|A|90|F4_ command to add item{string} with SequenceNumber{string} in ARC_CDS Sequence Number Range Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability to verify First Available Flight Search SHARES entries in Transformed SHARES")
    public void iSearchForFlightAvailabilityToVerifyFirstAvailableFlightSearchSHARESEntriesInTransformedSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability to verify First Available Flight Search SHARES entries in Transformed SHARES");
            isharesPage3.toVerifyFirstAvailableFlight(logInfo);
            logInfo.pass("I search for flight availability to verify First Available Flight Search SHARES entries in Transformed SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTA_GS*Q*_AgentName to add an AQP monitored agent sine to CST shares entries")
    public void iEnterBTA_SJ_GSQ_AgentNameToAddAnAQPMonitoredAgentSineToCSTSharesEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTA_GS*Q*_AgentName to add an AQP monitored agent sine to CST shares entries");
            isharesPage3.addAQPMonitoredAgentSinewithAgentName(logInfo);
            logInfo.pass("I enter BTA_GS*Q*_AgentName to add an AQP monitored agent sine to CST shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter KR|OAC|* command for Display by Flight or Flight Range entries")
    public void iEnterKROACCommandForDisplayByFlightOrFlightRangeEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR|OAC|* command for Display by Flight or Flight Range entries");
            isharesPage3.displayFlightDetails(logInfo);
            logInfo.pass("I enter KR|OAC|* command for Display by Flight or Flight Range entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR|OAC|*|_ command with Class{string} and Airline{string} for Display by Flight or Flight Range entries")
    public void iEnterKROAC_CommandWithClassAndAirlineForDisplayByFlightOrFlightRangeEntries(String COS, String Airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR|OAC|*|_ command with Class{string} and Airline{string} for Display by Flight or Flight Range entries");
            isharesPage3.displayFlightDetailsWithCOSAndAirline(logInfo, COS, Airline);
            logInfo.pass("I enter KR|OAC|*|_ command with Class{string} and Airline{string} for Display by Flight or Flight Range entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR|OAC|*|_ command with Host{string} without Flight number for Display by Flight or Flight Range entries")
    public void iEnterKROAC_CommandWithHostWithoutFlightNumberForDisplayByFlightOrFlightRangeEntries(String Host) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR|OAC|*|_ command with Host{string} without Flight number for Display by Flight or Flight Range entries");
            isharesPage3.displayFlightDetailsWithHostOnly(logInfo, Host);
            logInfo.pass("I enter KR|OAC|*|_ command with Host{string} without Flight number for Display by Flight or Flight Range entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KR|OAC|*|_ command to add with Host{string},Class{string} and Airline{string} in Flight or Flight Range entries")
    public void iEnterKROAC_CommandWithHostClassAndAirlineForDisplayByFlightOrFlightRangeEntries(String Host, String COS, String Airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR|OAC|*|_ command to add with Host{string},Class{string} and Airline{string} in Flight or Flight Range entries");
            isharesPage3.entertoAddanddisplayFlightDetailsWithHost_COSAndAirline(logInfo, Host, COS, Airline);
            logInfo.pass("I enter KR|OAC|*|_ command to add with Host{string},Class{string} and Airline{string} in Flight or Flight Range entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR|OAC|*|_ command with Host{string},Class{string} for Display by Flight or Flight Range entries")
    public void iEnterKROAC_CommandWithHostClassForDisplayByFlightOrFlightRangeEntries(String Host, String COS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR|OAC|*|_ command with Host{string},Class{string} for Display by Flight or Flight Range entries");
            isharesPage3.displayFlightDetailsWithHostAndClass(logInfo, Host, COS);
            logInfo.pass("I enter KR|OAC|*|_ command with Host{string},Class{string}  for Display by Flight or Flight Range entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter GCC_ command to copy categories with Automatic Pushdown and Renumber with specific indexes{string}{string}")
    public void iEnterGCC_CommandToCopyCategoriesWithAutomaticPushdownAndRenumberWithSpecificIndexes(String Index1, String Index2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter GCC_ command to copy categories with Automatic Pushdown and Renumber with specific indexes{string}{string}");
            isharesPage3.displayCategoryListforCopy(logInfo, Index1, Index2);
            logInfo.pass("I enter GCC_ command to copy categories with Automatic Pushdown and Renumber with specific indexes{string}{string}");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter GCO_ command to Copy and Overlay Existing Categories with specific indexes{string}{string}")
    public void iEnterGCO_CommandToCopyAndOverlayExistingCategoriesWithSpecificIndexes(String Index1, String Index2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter GCO_ command to Copy and Overlay Existing Categories with specific indexes{string}{string}");
            isharesPage3.displayCategoryListforCopy_Overlay(logInfo, Index1, Index2);
            logInfo.pass("I enter GCO_ command to Copy and Overlay Existing Categories with specific indexes{string}{string}");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter GMO_ command to Move and Overlay Existing Categories with specific indexes{string}{string}")
    public void iEnterGMO_CommandToMoveAndOverlayExistingCategoriesWithSpecificIndexes(String Index1, String Index2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter GMO_ command to Move and Overlay Existing Categories with specific indexes{string}{string}");
            isharesPage3.displayCategoryListforMove_Overlay(logInfo, Index1, Index2);
            logInfo.pass("I enter GMO_ command to Move and Overlay Existing Categories with specific indexes{string}{string}");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAA*M#_ command to display APIS CONTROL TABLE and Market table for specified Agency")
    public void iEnterPAAM_CommandToDisplayAPISCONTROLTABLEAndMarketTableForSpecifiedAgency() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA*M#_ command to display APIS CONTROL TABLE and Market table for specified Agency");
            isharesPage3.displayAPISControlTableandMarketTableForSpecifiedAgency(logInfo);
            logInfo.pass("I enter PAA*M#_ command to display APIS CONTROL TABLE and Market table for specified Agency");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:I*IF739-A command to display SEAT DIAGRAM -Aisle Seats for Internal configuration")
    public void iEnterIIFACommandToDisplaySEATDIAGRAMAisleSeatsForInternalConfiguration() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:I*IF739-A command to display SEAT DIAGRAM -Aisle Seats for Internal configuration");
            isharesPage3.displaySeatDiagram_AisleSeatsForInternalConfiguration(logInfo);
            logInfo.pass("I enter 6:I*IF739-A command to display SEAT DIAGRAM -Aisle Seats for Internal configuration");
        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:MT_ command to perform mass transfer based on Origin and Destination City")
    public void iEnterMT_CommandToPerformMassTransferBasedOnOriginAndDestinationCity() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:MT_ command to perform mass transfer based on Origin and Destination City");
            isharesPage3.performMassTransferBasedOnOriginAndDestination(logInfo);
            logInfo.pass("I enter 6:MT_ command to perform mass transfer based on Origin and Destination City");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:CQA|C_ to restrict POS{string}")
    public void iEnterCQAC_ToRestrictPOS(String POS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CQA|C_ to restrict POS "+POS);
            isharesPage3.enterCQAC_ToRestrictPOS(logInfo, POS);
            logInfo.pass("I enter 6:CQA|C_ to restrict POS "+POS);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:C_ON command to display Stand by ON flights")
    public void iEnterC_ONCommandToDisplayStandByONFlights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C_ON command to display Stand by ON flights");
            isharesPage3.displayStandBYON_Flights(logInfo);
            logInfo.pass("I enter 6:C_ON command to display Stand by ON flights");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:C_OFF command to display Stand by OFF flights")
    public void iEnterC_OFFCommandToDisplayStandByOFFFlights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C_OFF command to display Stand by OFF flights");
            isharesPage3.displayStandBYOFF_Flights(logInfo);
            logInfo.pass("I enter 6:C_OFF command to display Stand by OFF flights");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PICS* command to display outbound for different Airline{string}")
    public void iEnterPICSCommandToDisplayOutboundForDifferentAirline(String Airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PICS* command to display outbound for different Airline{string}");
            isharesPage3.displayOutboundForDifferentAirline(logInfo, Airline);
            logInfo.pass("I enter PICS* command to display outbound for different Airline{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PICS* command to display inbound for different Airline{string}")
    public void iEnterPICSCommandToDisplayInboundForDifferentAirline(String Airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PICS* command to display inbound for different Airline{string}");
            isharesPage3.displayInboundForDifferentAirline(logInfo, Airline);
            logInfo.pass("I enter PICS* command to display inbound for different Airline{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_ command to Verify T- transfer of Meal Counts")
    public void iEnterT_CommandToVerifyTTransferOfMealCounts() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_ command to Verify T- transfer of Meal Counts");
            isharesPage3.toVerifyT_MealCountTransfer(logInfo);
            logInfo.pass("I enter T_ command to Verify T- transfer of Meal Counts");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBT_command to display error messages in central processor action for invalid Flight number,invalid date,invalid Origin city and invalid Act code")
    public void iEnterPBT_commandToDisplayErrorMessagesInCentralProcessorActionForInvalidFlightNumberInvalidDateInvalidOriginCityAndInvalidActCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBT_command to display error messages in central processor action for invalid Flight number,invalid date,invalid Origin city and invalid Act code");
            isharesPage3.toVerifyInvalidResponseForPBTCommand_centralProcessorAction(logInfo);
            logInfo.pass("I enter PBT_command to display error messages in central processor action for invalid Flight number,invalid date,invalid Origin city and invalid Act code");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KL_  command to display Prioritization for different Airline code{string}")
    public void iEnterKL_CommandToDisplayPrioritizationForDifferentAirlineCode(String Airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KL_  command to display Prioritization for different Airline code{string}");
            isharesPage3.displayPrioritizationForDifferentAirlineCode(logInfo, Airline);
            logInfo.pass("I enter KL_  command to display Prioritization for different Airline code{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KL command to change the Prioritization Code Assignment with item number{string} and Entry{string}")
    public void iEnterKLCommandToChangeThePrioritizationCodeAssignmentWithItemNumber(String Item, String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KL command to change the Prioritization Code Assignment with item number1{string} and Entry{string}");
            isharesPage3.displayPrioritizationCodeAssignmentWithItemNum(logInfo, Item, Entry);
            logInfo.pass("I enter KL command to change the Prioritization Code Assignment with item number1{string} and Entry{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KL command to change the Prioritization Code Assignment for different flight with item number2{string} and Entry{string}")
    public void iEnterKLCommandToChangeThePrioritizationCodeAssignmentForDifferentFlightWithItemNumber(String Item2, String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KL command to change the Prioritization Code Assignment for differnt flight with item number2{string} and Entry{string}");
            isharesPage3.displayPrioritizationCodeAssignmentForDifferentFlightWithItemNum2(logInfo, Item2, Entry);
            logInfo.pass("I enter KL command to change the Prioritization Code Assignment for different flight with item number2{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for Specific Flight Availability {string}")
    public void i_search_for_specific_flight_availability(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for Specific Flight Availability");
            isharesPage3.specificFlightAvailability(logInfo, entry);
            logInfo.pass("I search for Specific Flight Availability");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QLMTC")
    public void i_enter_command_command_QLMTC() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QLMTC");
            isharesPage3.command_QLMTC(logInfo);
            logInfo.pass("I enter QLMTC");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter EMD-A entries with invalid parameters for {string}")
    public void i_enter_command_EMDA_entries_with_invalid_parameters(String paXSeg) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter EMD-A entries with invalid parameters for " + paXSeg);
            isharesPage3.command_EMDA_entries_with_invalid_parameters(logInfo, paXSeg);
            logInfo.pass("I enter EMD-A entries with invalid parameters for " + paXSeg);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKC_MKG command to Create_Modify Direct Service from {string} to {string}")
    public void i_enter_command_for_MKC_MKG_command(String org, String dest) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKC_MKG command to Create_Modify Direct Service from " + org + "to" + dest);
            isharesPage3.command_for_MKC_MKG_command(logInfo, org, dest);
            logInfo.pass("I enter MKC_MKG command to Create_Modify Direct Service from " + org + "to" + dest);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CM used command for pax {string}")
    public void i_enter_enter_CM_used_command(String paxno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CM used command for pax " + paxno);
            isharesPage3.enter_CM_used_command(logInfo, paxno);
            logInfo.pass("I enter CM used command for pax " + paxno);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for coupon unused")
    public void i_enter_DM_command_for_coupon_unused() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for coupon unused");
            isharesPage3.DM_command_for_coupon_unused(logInfo);
            logInfo.pass("I enter command for coupon unused");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for List Display of Oversells With Seats for entry {string}")
    public void i_enter_command_for_List_Display_of_Oversells_With_Seats(String sellscode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for List Display of Oversells With Seats for entry " + sellscode);
            isharesPage3.list_Display_For_Oversells_With_Seats(logInfo, sellscode);
            logInfo.pass("I enter command for List Display of Oversells With Seats for entry " + sellscode);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD command to check Voluntary Oversells With Seats")
    public void i_enter_command_6LD_Voluntary_Oversells() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to check Voluntary Oversells With Seats");
            isharesPage3.command_6LD_Voluntary_Oversells(logInfo);
            logInfo.pass("I enter 6:LD command to check Voluntary Oversells With Seats");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD command to check final list")
    public void i_enter_command_to_check_final_list() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to check final list");
            isharesPage3.command_to_check_final_list(logInfo);
            logInfo.pass("I enter 6:LD command to check final list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display DAILY AUTO LIST ENTRIES for the month of {string}")
    public void i_enter_command_HISTORY_DISPLAY_OF_DAILY_AUTO_LIST_ENTRIES(String month) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display DAILY AUTO LIST ENTRIES for the month of " + month);
            isharesPage3.command_HISTORY_DISPLAY_OF_DAILY_AUTO_LIST_ENTRIES(logInfo, month);
            logInfo.pass("I enter command to display DAILY AUTO LIST ENTRIES for the month of " + month);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Advisory Messages and Error Responses")
    public void i_enter_command_Advisory_Messages_and_Error_Responses() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Advisory Messages and Error Responses");
            isharesPage3.command_Advisory_Messages_and_Error_Responses(logInfo);
            logInfo.pass("I enter command to Run Advisory Messages and Error Responses");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add Time Initiated Function Table SHARES entries with action code {string} and {string} and {string}")
    public void i_enter_command_add_Time_Initiated_Function(String actioncode, String nextActivation, String timeInterval) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Time Initiated Function Table SHARES entries with action code " + actioncode + "and" + nextActivation + "and" + timeInterval);
            isharesPage3.command_add_Time_Initiated_Function(logInfo, actioncode, nextActivation, timeInterval);
            logInfo.pass("I add Time Initiated Function Table SHARES entries with action code " + actioncode + "and" + nextActivation + "and" + timeInterval);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I delete Time Initiated Function Table SHARES entries with action code {string}")
    public void i_enter_command_delete_Time_Initiated_Function(String actioncode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete Time Initiated Function Table SHARES entries with action code " + actioncode);
            isharesPage3.command_delete_Time_Initiated_Function(logInfo, actioncode);
            logInfo.pass("I delete Time Initiated Function Table SHARES entries with action code " + actioncode);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ABP command to check final list")
    public void i_enter_command_to_check_final_list_ABP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to check final list");
            isharesPage3.command_to_check_final_list_ABP(logInfo);
            logInfo.pass("I enter 6:LD command to check final list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD commands for passenger type {string}")
    public void i_enter_command_6_LD(String paxType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD commands for passenger type " + paxType);
            isharesPage3.commands_6LD(logInfo, paxType);
            logInfo.pass("I enter 6:LD commands for passenger type " + paxType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BP entries executed successfully")
    public void I_enter_BP_entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BP entries executed successfully");
            isharesPage3.bpEntriesExectuedSuccessfully(logInfo);
            logInfo.pass("I enter BP entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BPD entries executed successfully")
    public void I_enter_BPD_entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BPD entries executed successfully");
            isharesPage3.bpdEntriesExectuedSuccessfully(logInfo);
            logInfo.pass("I enter BPD entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VISA entries executed successfully")
    public void I_enter_VISA_entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VISA entries executed successfully");
            isharesPage3.visaEntriesExecutedSuccessfully(logInfo);
            logInfo.pass("I enter VISA entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIS entries executed successfully")
    public void I_enter_VIS_entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIS entries executed successfully");
            isharesPage3.visEntriesExecutedSuccessfully(logInfo);
            logInfo.pass("I enter VIS entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter EDS Switching Terminals SHARES entries executed successfully")
    public void I_enter_EDS_Switching_Terminals_SHARES_entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter EDS Switching Terminals SHARES entries executed successfully");
            isharesPage3.edsSwitchingTerminalSharesEntriesExecutedSuccessfully(logInfo);
            logInfo.pass("I enter EDS Switching Terminals SHARES entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Inventory Seat Allocation Modification")
    public void I_enter_Inventory_Seat_Allocation_Modification() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Inventory Seat Allocation Modification");
            isharesPage3.inventorySeatAllocationModification(logInfo);
            logInfo.pass("I enter Inventory Seat Allocation Modification");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Seat Allocation Profile Item Validation SHARES entries executed successfully")
    public void I_enter_Seat_Allocation_Profile_Item_Validation_SHARES_entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Seat Allocation Profile Item Validation SHARES entries executed successfully");
            isharesPage3.validationSharesEntriesExecutedSuccessfully(logInfo);
            logInfo.pass("I enter Seat Allocation Profile Item Validation SHARES entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter run Agent Check Out entries executed successfully")
    public void I_enter_run_Agent_Check_Out_entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter run Agent Check Out entries executed successfully");
            isharesPage3.agentCheckOutEntriesExecutedSuccessfully(logInfo);
            logInfo.pass("I enter run Agent Check Out entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter run Input Overages_Shortages Amounts of Cash and Check Overage of Balancing TAR SHARES entries executed successfully")
    public void I_enter_run_Input_Overages_Shortages_Amounts_of_Cash_and_Check_Overage_of_Balancing_TAR_SHARES_entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter run Input Overages/Shortages Amounts of Cash and Check Overage of Balancing TAR SHARES entries executed successfully");
            isharesPage3.amountOfCashCheckOverageOfBalanceTARSharesEntriesExecutedSuccessfully(logInfo);
            logInfo.pass("I enter run Input Overages/Shortages Amounts of Cash and Check Overage of Balancing TAR SHARES entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ACO entries Shares Entries executed successfully")
    public void I_enter_ACO_entries_Shares_Entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ACO entries Shares Entries executed successfully");
            isharesPage3.entriesSharesEntriesExecutedSuccessfully(logInfo);
            logInfo.pass("I enter ACO entries Shares Entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LX command to list display")
    public void I_enter_LX_command_to_List_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LX command to list display");
            isharesPage3.lxCommandToListDisplay(logInfo);
            logInfo.pass("I enter LX command to list display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD command to list display {string}")
    public void I_enter_LD_command_to_List_display(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to list display "+entry);
            isharesPage3.accessToSharesGDSSystem(logInfo, entry);
            logInfo.pass("I enter LD command to list display "+entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Run the Display all table items for City code LHR SHARES entries")
    public void I_enter_run_the_display_all_table_items_for_City_code_LHR_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Display all table items for City code LHR SHARES entries");
            isharesPage3.displayAllTableItemsForCityCodeLHRShares(logInfo);
            logInfo.pass("I enter Run the Display all table items for City code LHR SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Display all table items for lniata SHARES entries")
    public void I_enter_run_the_display_all_table_items_for_lniate_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Display all table items for lniata SHARES entries");
            isharesPage3.displayAllTableItemsForLniatesSharesEntries(logInfo);
            logInfo.pass("I enter Run the Display all table items for lniata SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter run the display all table items starting from rule number 10 shares entries")
    public void I_enter_run_the_display_all_table_items_starting_from_rule_number_10_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter run the display all table items starting from rule number 10 shares entries");
            isharesPage3.displayAllTableItemsStartingFromRuleNumber(logInfo);
            logInfo.pass("I enter run the display all table items starting from rule number 10 shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to list display")
    public void I_enter_command_to_List_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to list display");
            isharesPage3.CommandToListDisplay(logInfo);
            logInfo.pass("I enter command to list display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:* command to verify the seat taken in seat map")
    public void I_enter_command_to_verify_the_seat_taken_in_seat_map() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:* command to verify the seat taken in seat map");
            isharesPage3.verifyTheSeatTakenInSeatMap(logInfo);
            logInfo.pass("I enter 6:* command to verify the seat taken in seat map");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD Reverse Booking Order List are Verified Successfully")
    public void I_enter_LD_Reverse_Booking_Order_List_are_Verified_Successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD Reverse Booking Order List are Verified Successfully");
            isharesPage3.orderListAreVerifiedSuccessfully(logInfo);
            logInfo.pass("I enter LD Reverse Booking Order List are Verified Successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_* Verify the Seat taken in Seat Map")
    public void I_enter_6_Verify_the_Seat_taken_in_Seat_Map() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_* Verify the Seat taken in Seat Map");
            isharesPage3.enter6VerifyTheSeatTakenInSeatMap(logInfo);
            logInfo.pass("I enter 6_* Verify the Seat taken in Seat Map");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_* Perform History Items Display by Item Number {string}")
    public void I_enter_6_Perform_History_Items_Display_By_Item_Number(String ItemNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_* Perform History Items Display by Item Number");
            isharesPage3.performHistoryItemsDisplayByItemNumber(logInfo, ItemNumber);
            logInfo.pass("I enter 6_* Perform History Items Display by Item Number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LCA Perform Passenger name list Display having AUX Segments")
    public void I_enter_LCA_Perform_Passenger_name_list_Display_having_AUX_Segments_having_AUX_Segments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LCA Perform Passenger name list Display having AUX Segments");
            isharesPage3.listDisplayHavingAUXSegments(logInfo);
            logInfo.pass("I enter LCA Perform Passenger name list Display having AUX Segments");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter down grade lower cabin")
    public void I_enter_down_grade_lower_cabin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter down grade lower cabin");
            isharesPage3.downGradeLowerCabin(logInfo);
            logInfo.pass("I enter down grade lower cabin");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Agent Set Action in passenger")
    public void I_enter_run_the_Agent_Set_Action_in_Passenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Agent Set Action in passenger");
            isharesPage3.theAgentSetActionInPassenger(logInfo);
            logInfo.pass("I enter Run the Agent Set Action in passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Adding Equipment Codest SHARES{string}")
    public void I_enter_Run_Adding_Equipment_Codest_SHARES(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Adding Equipment Codest SHARES");
            isharesPage3.addingEquipmentCodestShares(logInfo, entry);
            logInfo.pass("I enter Run Adding Equipment Codest SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Passenger Name List in Notification of passengers{string}")
    public void I_enter_Run_the_Passenger_Name_List_in_Notification_of_passengers(String number) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Passenger Name List in Notification of passengers");
            isharesPage3.listInNotificationOfPassengers(logInfo, number);
            logInfo.pass("I enter Run the Passenger Name List in Notification of passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Encode Airline Code Shares entries")
    public void I_enter_Run_the_Encode_Airline_code_Shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Encode Airline Code Shares entries");
            isharesPage3.encodeAirlineCodeSharesEntries(logInfo);
            logInfo.pass("I enter Run the Encode Airline Code Shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Run the Decode Airline Code Shares entries")
    public void I_enter_Run_the_Decode_Airline_code_Shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Decode Airline Code Shares entries");
            isharesPage3.decodeairlineCodeSharesEntries(logInfo);
            logInfo.pass("I enter Run the Decode Airline Code Shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Run the Availability Status Agreements for OA flights")
    public void I_enter_Run_the_Availability_Status_Agreements_for_OA_flights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Availability Status Agreements for OA flights");
            isharesPage3.statusAgreementsforOAFlight(logInfo);
            logInfo.pass("I enter Run the Availability Status Agreements for OA flights");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CM PASSENGER SERVICE CODE{string}")
    public void I_enter_CM_Passenger_Service_Code(String Number) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CM PASSENGER SERVICE CODE");
            isharesPage3.CMPassengerServiceCode(logInfo, Number);
            logInfo.pass("I enter CM PASSENGER SERVICE CODE");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LG Passenger name list display having AUX Segments{string}")
    public void I_enter_LG_Passenger_Name_list_display_having_AUX_Segments(String Number) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LG Passenger name list display having AUX Segments");
            isharesPage3.LGPassengerNameListdisplayHavingAUXSegments(logInfo, Number);
            logInfo.pass("I enter LG Passenger name list display having AUX Segments");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Run  CM market value Adjustment")
    public void I_enter_Run_CM_market_value_Adjustment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run  CM market value Adjustment");
            isharesPage3.CmMarketValueAdjustment(logInfo);
            logInfo.pass("I enter Run  CM market value Adjustment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Paper ticketed destination passenger list")
    public void enter_Paperticketeddestination_Passengerlist() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Paper ticketed destination passenger list");
            isharesPage3.allPaperticketeddestinationPassengersList(logInfo);
            logInfo.pass("I enter Paper ticketed destination passenger list");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Paper ticketed not checkedin passenger list")
    public void enter_Paperticketednotcheckedin_Passengerlist() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Paper ticketed not checkedin passenger list");
            isharesPage3.allPaperticketednotcheckedinPassengersList(logInfo);
            logInfo.pass("I enter Paper ticketed not checked in passenger list");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_BUMP command to display NON-REV BUMP passenger list")
    public void iEnter6LD_BUMPCommandToDisplayNonRevBUMPPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_BUMP command to display NON-REV BUMP passenger list");
            isharesPage3.displayNonRevenueBumpPassengerList(logInfo);
            logInfo.pass("I enter 6:LD_BUMP command to display Non Rev Bump passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_DV command to display VOL Oversell passenger list")
    public void iEnter6LD_DVCommandToDisplayVOLOversellsPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_DV command to display VOL oversell passenger list");
            isharesPage3.displayVolOversellPassengerList(logInfo);
            logInfo.pass("I enter 6:LD_DV command to display VOL oversell passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_DVRS command to display voluntary require seats passenger list")
    public void iEnter6LD_DVRSCommandToDisplayVoluntaryRequireSeatsPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_DV/RS command to display voluntary require seats passenger list");
            isharesPage3.displayVoluntaryRequireSeatsPassengerList(logInfo);
            logInfo.pass("I enter 6:LD_DV/RS command to display voluntary require seats passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_DIWS command to display HKN With seats passenger list")
    public void iEnter6LD_DIWSCommandToDisplayHknWithSeatsPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_DI/WS command to display hkn With seats passenger list");
            isharesPage3.displayHknWithSeatsPassengerList(logInfo);
            logInfo.pass("I enter 6:LD_DI/WS command to display hkn With seats passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LD_WEB command to display WEB CHECK IN passenger list")
    public void iEnter6LD_WEBCommandTodisplayWebCheckinsPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_WEB command to display web checkin passenger list");
            isharesPage3.displayWebCheckinPassengerList(logInfo);
            logInfo.pass("I enter 6:LD_WEB command to display web checkin passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_DI command to display HKN Oversell passenger list")
    public void iEnter6LD_DICommandToDisplayHknOversellsPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_DI command to display hkn oversell passenger list");
            isharesPage3.displayHknOversellPassengerList(logInfo);
            logInfo.pass("I enter 6:LD_DI command to display hkn oversell passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_DIRS command to display HKN require seats passenger list")
    public void iEnter6LD_DIRSCommandToDisplayHknRequireSeatsPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_DI/RS command to display hkn require seats passenger list");
            isharesPage3.displayHknRequireSeatsPassengerList(logInfo);
            logInfo.pass("I enter 6:LD_DI/RS command to display hkn require seats passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*KO command for displaying oversold working summary list")
    public void iEnterKOCommandForDisplayingOversoldWorkingSummaryList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*KO command for displaying oversold working summary list");
            isharesPage3.OversoldWorkingSummaryList(logInfo);
            logInfo.pass("I enter 6:*KO command for displaying oversold working summary list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|UNAP command to display all the Checked-in No APIS passengers")
    public void iEnter6LD_UNAP_command_to_display_all_the_Checked_in_No_APIS_passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|UNAP command to display all the Checked-in No APIS passengers");
            isharesPage3.displayCheckedinNoAPIS(logInfo);
            logInfo.pass("I enter 6:LD_|UNAP command to display all the Checked-in No APIS passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command QUTR to file the PNR in the UTR delay list")
    public void i_enter_command_QUTR_to_file_the_PNR_in_the_UTR_delay_list() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command QUTR to file the PNR in the UTR delay list");
            isharesPage3.enterQUTRToFilePNRinUTRList(logInfo);
            logInfo.pass("I enter command QUTR to file the PNR in the UTR delay list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command QEP_ to place PNR on queue for market {string} and queue number {string}")
    public void i_enter_command_QEP_to_place_on_queue_for_market(String market, String queueNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command QEP_ to place PNR on queue for market " + market + " and " + queueNo);
            isharesPage3.enterQEP_ToplacePNRonQueue(logInfo, market, queueNo);
            logInfo.pass("I enter command QEP_ to place PNR on queue for market " + market + " and " + queueNo);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T_MTB* command Run the Full Table Display SHARES entries")
    public void I_enter_T_MTB_command_to_RuntheFullTableDisplaySHARESentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_MTB* command Run the Full Table Display SHARES entries");
            isharesPage3.fullTableDisplay(logInfo);
            logInfo.pass("I enter T_MTB* command Run the Full Table Display SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter F*AT command to display Priced details")
    public void I_enter_FAT_command_to_display_Priced_details() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter F*AT command to display Auto Priced details");
            isharesPage3.enterFATCommandToDisplayPricedDetails(logInfo);
            logInfo.pass("I enter F*AT command to display Priced details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKE* command to display Market Maintenance entry Control Record")
    public void iEnterMKE_command_to_display_MarketMaintenance_entryControlRecord() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKE* command to display Market Maintenance entry Control Record");
            isharesPage3.displayMarketMaintenanceEntryControlRecord(logInfo);
            logInfo.pass("I enter MKE* command to display Market Maintenance entry Control Record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-* command to display the seatmap with {string}")
    public void I_enter_Command_to_display_the_seatmap_with(String COS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-* command to display the seatmap with");
            isharesPage3.displaySeatMapWithCOS(logInfo, COS);
            logInfo.pass("I enter 6-* command to display the seatmap with" + COS);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //OCM*UGI1/D
    @And("I enter the command to Display the Time Initiated Function Table SHARES entries")
    public void IenterthecommandtoDisplaytheTimeInitiatedFunctionTableSHARESentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the command to Display the Time Initiated Function Table SHARES entries");
            isharesPage3.displayTimeInitiatedFunctionTable(logInfo);
            logInfo.pass("I enter the command to Display the Time Initiated Function Table SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I downgrade Lower cabin 6-GI for multiple surname with {string}")
    public void I_downgrade_lower_cabin_6GI_multiple_surname_with(String COS2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I downgrade Lower cabin 6-GI for multiple surname");
            isharesPage3.downGradeLowerCabin6GIForMultipleSurname(logInfo, COS2);
            logInfo.pass("I downgrade Lower cabin 6-GI for multiple surname");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-RA_ command to Run the CM KEYED IN TICKET FIELDS TKT REMARKS entries")
    public void i_enter_T_RA_command_to_Run_the_CM_KEYED_IN_TICKET_FIELDS_TKT_REMARKS_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-RA_ command to Run the CM KEYED IN TICKET FIELDS TKT REMARKS entries");
            isharesPage3.cmKeyedInTicketFieldsAndRemarks(logInfo);
            logInfo.pass("I enter T-RA_ command to Run the CM KEYED IN TICKET FIELDS TKT REMARKS entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I Run the PTA Data SHARES entries in Transformed SHARES")
    public void i_Run_the_PTA_Data_SHARES_entries_in_TransformedSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Run the PTA Data SHARES entries in Transformed SHARES");
            isharesPage3.runPTADataSharesEntries(logInfo);
            logInfo.pass("I Run the PTA Data SHARES entries in Transformed SHARES");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //6-FM3*0360FCD
    //6:FM3/09APRPTY*0360FCD
    @And("I enter 6-FM command to display Catering Information CAT SHARES entries with {string}")
    public void i_enter_6_FM_command_to_display_Catering_Information_CAT_SHARES_entries_with(String displayType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-FM command to display Catering Information (CAT) SHARES entries with " + displayType);
            isharesPage3.displayCateringInformationSharesEntries(logInfo, displayType);
            logInfo.pass("I enter 6-FM command to display Catering Information (CAT) SHARES entries with " + displayType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display PNR from Queue {string}")
    public void i_enter_command_to_display_PNR_from_Queue(String QNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display PNR from Queue " + QNo);
            isharesPage3.displayPNRfromQueue(logInfo, QNo);
            logInfo.pass("I enter command to display PNR from Queue " + QNo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to display Totaling Option SHARES entries for the SSR {string} and {string}")
    public void IentercommandtodisplayTotalingOptionSHARESentriesfortheSSR(String SSR, String displayOption) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display Totaling Option SHARES entries for the SSR");
            isharesPage3.displayTotalOptionForSSR(logInfo, SSR, displayOption);
            logInfo.pass("I enter command to display Totaling Option SHARES entries for the SSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //6:K0302/09APRPTY
    @And("I enter command to run Voluntary Involuntary Seat Swap")
    public void IentercommandtoVoluntaryInvoluntarySeatSwap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Voluntary Involuntary Seat Swap");
            isharesPage3.voluntaryInvoluntarySeatSwap(logInfo);
            logInfo.pass("I enter command to run Voluntary Involuntary Seat Swap");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display Third Party table")
    public void I_enter_command_toDisplayThirdPartyTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display Third Party table");
            isharesPage3.displayThirdPartyTable(logInfo);
            logInfo.pass("I enter command to display Third Party table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //6:LACDT/10DEC/PTY/0600-1500#WCHR-@IC/@OC.@TB
    @And("I enter command to run optional fields shares entries for time range {string} and {string}")
    public void I_enter_command_toRun_Optional_fields_Shares_Entries_for_TimeRange(String timeRange, String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command run optional fields shares entries for time range");
            isharesPage3.optionalFieldsforTimeRange(logInfo, timeRange, SSR);
            logInfo.pass("I enter command to run optional fields shares entries for time range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run relational Connectors")
    public void I_enter_command_to_run_Relational_Connectors() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run relational Connectors");
            isharesPage3.relationalConnectors(logInfo);
            logInfo.pass("I enter command to run relational Connectors");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    //6-CQA/C-PTY
    @And("I enter command to enable Controlling agent for {string}")
    public void I_enter_command_to_enable_Controlling_Agent_for(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to enable Controlling agent for");
            isharesPage3.enableControllingAgent(logInfo, city);
            logInfo.pass("I enter command to enable Controlling agent for");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter MKI command to Complete Or Ignore Transaction SHARES entries")
    public void i_enter_MKI_command_to_Complete_Or_Ignore_Transaction_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKI command to Complete Or Ignore Transaction SHARES entries");
            isharesPage3.MKIcommandtoCompleteORIgnoreTransaction(logInfo);
            logInfo.pass("I enter MKI command to Complete Or Ignore Transaction SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV_ command to display Market Value table")
    public void iEnterMV_CommandToDisplayMarketValueTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV_ command to display Market Value table");
            isharesPage3.displayMarketValueTable(logInfo);
            logInfo.pass("I enter MV_ command to display Market Value table");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CH_|PL command for verify First Class Passenger List")
    public void iEnterCH_PLCommandForVerifyFirstClassPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CH_|PL command for verify First Class Passenger List");
            isharesPage3.toVerifyFirstClassPassengerList(logInfo);
            logInfo.pass("I enter 6:CH_|PL command for verify First Class Passenger List");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CH_|SM command for verify Passenger Seat Map")
    public void iEnterCH_SMCommandForVerifyPassengerSeatMap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CH_|SM command for verify Passenger Seat Map");
            isharesPage3.toVerifyPassengerSeatMap(logInfo);
            logInfo.pass("I enter 6:CH_|SM command for verify Passenger Seat Map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter SSR_command for Special Meal Orders count{string} with ssr type{string}")
    public void iEnterSSR_commandForSpecialMealOrdersCountWithSsrType(String Count, String SsrType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR_command for Special Meal Orders count{string} with ssr type{string}");
            isharesPage3.toPlaceSpecialMealOrderwithCountAndSsrType(logInfo, Count, SsrType);
            logInfo.pass("I enter SSR_command for Special Meal Orders count{string} with ssr type{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*_ command to display infant seat map")
    public void iEnter_CommandToDisplayInfantSeatMap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*_ command to display infant seat map");
            isharesPage3.toViewInfantSeatMap(logInfo);
            logInfo.pass("I enter 6:*_ command to display infant seat map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run delete support fields in Agent Assembly Area Profile TableSHARES entries")
    public void i_enter_command_to_Run_Delete_Support_Fields() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "And I enter command to run delete support fields in Agent Assembly Area Profile TableSHARES entries");
            isharesPage3.command_to_Run_Delete_Support_Fields(logInfo);
            logInfo.pass("And I enter command to run delete support fields in Agent Assembly Area Profile TableSHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter C:A command to Run the Basic Add Entry of Primary action code")
    public void i_enter_command_CA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to Run the Basic Add Entry of Primary action code");
            isharesPage3.command_CA(logInfo);
            logInfo.pass("I enter C:A command to Run the Basic Add Entry of Primary action code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add General Facts Data SHARES")
    public void i_enter_command_to_add_General_Facts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add General Facts Data SHARES");
            isharesPage3.command_to_add_General_Facts(logInfo);
            logInfo.pass("I enter command to add General Facts Data SHARES");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Run Order Options SHARES entries in Transformed SHARES for SSR type{string}")
    public void i_enter_command_to_Run_Order_Options(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Run Order Options SHARES entries in Transformed SHARES for SSR type " + SSR);
            isharesPage3.command_to_Run_Order_Options(logInfo, SSR);
            logInfo.pass("I Run Order Options SHARES entries in Transformed SHARES for SSR type " + SSR);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run add_change_delete alliance record with designator and name")
    public void i_run_the_alliance_record_with_designator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run add_change_delete alliance record with designator and name");
            isharesPage3.run_the_alliance_record_with_designator(logInfo);
            logInfo.pass("I enter command to run add_change_delete alliance record with designator and name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKI command to Run the City Pair Update Utility SHARES entries")
    public void i_enter_MKI_command_to_Run_the_City_Pair_Update() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKI command to Run the City Pair Update Utility SHARES entries");
            isharesPage3.MKI_command_to_Run_the_City_Pair_Update(logInfo);
            logInfo.pass("I enter MKI command to Run the City Pair Update Utility SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Add_change alliance carrier sequence SHARES entries")
    public void i_run_the_Add_change_alliance_carrier_sequence() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Add_change alliance carrier sequence SHARES entries");
            isharesPage3.run_the_Add_change_alliance_carrier_sequence(logInfo);
            logInfo.pass("I enter command to run the Add_change alliance carrier sequence SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Add_change_delete partner carrier record SHARES entries")
    public void i_enter_Add_change_delete_partner_carrier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Add_change_delete partner carrier record SHARES entries");
            isharesPage3.Add_change_delete_partner_carrier(logInfo);
            logInfo.pass("I enter command to run the Add_change_delete partner carrier record SHARES entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Add_change alliance Tier character")
    public void i_enter_Add_change_alliance_Tier_character() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Add_change alliance Tier character");
            isharesPage3.Add_change_alliance_Tier_character(logInfo);
            logInfo.pass("I enter command to run the Add_change alliance Tier character");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I remove assigned seat after check in")
    public void i_Remove_assigned_SeatAfterCheckIn() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove assigned seat after check in");
            isharesPage3.removeTheSeatAfterCheckIn(logInfo);
            logInfo.pass("I remove assigned seat after check in");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VM command to run the modify inventory display")
    public void I_enter_VMS_command_to_run_the_inventory_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VM command to run the modify inventory display ");
            isharesPage3.modifyInventoryDisplay(logInfo);
            logInfo.pass("I enter VM command to run the modify inventory display ");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN commands for Segment Profile Tables")
    public void iEnterKNCommandsForSegmentProfileTables() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN commands for Segment Profile Tables");
            isharesPage3.enterKNCommandsForSegmentProfileTables(logInfo);
            logInfo.pass("I enter KN commands for Segment Profile Tables");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PMP command to display Preliminary Meal Counts")
    public void iEnterPMPCommandToDisplayPreliminaryMealCounts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PMP command to display Preliminary Meal Counts");
            isharesPage3.enterPMPCommand(logInfo);
            logInfo.pass("I enter PMP command to display Preliminary Meal Counts");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PICS commands to display and modification of Through Check-In Table with invalid parameters")
    public void iEnterPICSCommandsToDisplayAndModificationOfThroughCheckInTableWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PICS commands to display and modification of Through Check-In Table with invalid parameters");
            isharesPage3.enterPICSCommands(logInfo);
            logInfo.pass("I enter PICS commands to display and modification of Through Check-In Table with invalid parameters");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 3@ command to delete all SSR from the PNR")
    public void iEnterCommandToDeleteAllSSRFromThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 3@ command to delete all SSR from the PNR");
            isharesPage3.deleteAllSSR(logInfo);
            logInfo.pass("I enter 3@ command to delete all SSR from the PNR");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML commands to Modify Booking Compartment Legs for {string}")
    public void iEnterVMLCommandsToModifyBookingCompartmentLegsFor(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML commands to Modify Booking Compartment Legs for " + Entry);
            isharesPage3.enterVMLCommands(logInfo, Entry);
            logInfo.pass("I enter VML commands to Modify Booking Compartment Legs for " + Entry);

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6: command for Ship Assignment Prior to Completion of The PNL with invalid parameters")
    public void iEnterCommandForShipAssignmentPriorToCompletionOfThePNLWithInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6: command for Ship Assignment Prior to Completion of The PNL with invalid parameters");
            isharesPage3.enterInvalidShipCommand(logInfo);
            logInfo.pass("I enter 6: command for Ship Assignment Prior to Completion of The PNL with invalid parameters");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I display Error Messages for create an extra section")
    public void iDisplayErrorMessagesForCreateAnExtraSection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display Error Messages for create an extra section");
            isharesPage3.displayErrorMessagesForCreateAnExtraSection(logInfo);
            logInfo.pass("I display Error Messages for create an extra section");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:A command to display out for collection")
    public void iEnterCACommandToDisplayOutForCollection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to display out for collection");
            isharesPage3.enterCACommandToDisplayOutForCollection(logInfo);
            logInfo.pass("I enter C:A command to display out for collection");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CC command to display conversation of parameters {string}")
    public void iEnterCCCommandToDisplayConversationOfParameters(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CC command to display conversation of parameters");
            isharesPage3.enterCCCommand(logInfo, Entry);
            logInfo.pass("I enter CC command to display conversation of parameters");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LU_Q_ command for Verify Selective name of Unticketed List with queue number{string}")
    public void iEnterLU_QCommandForVerifySelectiveNameOfUnticketedListWithQueueNumber(String Number) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LU_Q17 command for Verify Selective name of Unticketed List with queue number");
            isharesPage3.toVerifySelectiveNameOfUnticketedList(logInfo,Number);
            logInfo.pass("I enter LU_Q17 command for Verify Selective name of Unticketed List with queue number");


        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter invalid passenger name while performing check in and validate the error message")
    public void iEnterInvalidPassengerNameWhilePerformingCheckInAndValidateTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid passenger name while performing check in and validate the error message");
            isharesPage3.enterInvalidPassenger(logInfo);
            logInfo.pass("I enter invalid passenger name while performing check in and validate the error message");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter invalid flight number while performing check in and validate the error message")
    public void iEnterInvalidFlightNumberWhilePerformingCheckInAndValidateTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid flight number while performing check in and validate the error message");
            isharesPage3.enterInvalidFlightNumber(logInfo);
            logInfo.pass("I enter invalid flight number while performing check in and validate the error message");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter invalid baggage number while performing check in and validate the error message")
    public void iEnterInvalidBaggageNumberWhilePerformingCheckInAndValidateTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid Baggage number while performing check in and validate the error message");
            isharesPage3.enterInvalidBaggage(logInfo);
            logInfo.pass("I enter invalid Baggage number while performing check in and validate the error message");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I assign Seat for {string} after check in")
    public void iReplaceTheSeatAfterCheckInWithSpecificSeat(String AssignSeatType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign Seat for " + AssignSeatType + " after check in");
            isharesPage3.AssignSeatAfterCheckin(logInfo, AssignSeatType);
            logInfo.pass("I assign Seat for " + AssignSeatType + " after check in");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform ASA for specific segments {string} for seat type {string}")
    public void iPerformASATospecificPassenger(String totalSegments, String AssignType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform ASA to all passengers");
            isharesPage3.performASAForSpecificPax(logInfo, totalSegments, AssignType);
            logInfo.pass("I perform ASA to all passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_ETMAPH command to display ETKT common city table history")
    public void iEnterT_ETMAPHCommandToDisplayETKTCommonCityTableHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_ETMAPH command to display ETKT common city table history");
            isharesPage3.enterT_ETMAPHCommand(logInfo);
            logInfo.pass("I enter T_ETMAPH command to display ETKT common city table history");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I save the pnr in setpnr2 variable")
    public void iSaveThePnrInSetpnrVariable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save the pnr in setpnr2 variable");
            isharesPage3.captureOrderIdToVariable(logInfo);
            logInfo.pass("I save the pnr in setpnr2 variable");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I save the pnr from setpnr2 to setpnr variable")
    public void iSaveThePnrFromSetpnrToSetpnrVariable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save the pnr from setpnr2 to setpnr variable");
            isharesPage3.rollBackCaptureOrderIdToVariable(logInfo);
            logInfo.pass("I save the pnr from setpnr2 to setpnr variable");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*H_All command for displaying all seated assign history")
    public void iEnter6HAllCommandForDisplayingSeatedAssignHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*H_All command for displaying all seated assign history");
            isharesPage3.displayAllSeatedAssignHistory(logInfo);
            logInfo.pass("I enter 6:*H_All command for displaying all seated assign history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CX command to perform cancel misconnect passengers from inbound CM flight")
    public void I_perform_cancel_misconnect_passengers_from_inbound_CM_flight() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CX command to perform cancel misconnect passengers from inbound CM flight");
            System.out.println("I enter 6:CX command to perform cancel misconnect passengers from inbound CM flight");
            isharesPage3.cancelMisconnect(logInfo);
            logInfo.pass("I enter 6:CX command to perform cancel misconnect passengers from inbound CM flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PDX command")
    public void iEnterPDXCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PDX command");
            isharesPage3.enterPDXCommand(logInfo);
            logInfo.pass("I enter PDX");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*CS command to check flight info")
    public void iEnterACS_CommandToCheckFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A*CS command to check flight info");
            isharesPage3.enterA_CSCommand(logInfo);
            logInfo.pass("I enter A*CS command to check flight info");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A*E command to display Subsequent Class Level early Search")
    public void iEnterAECommandToDisplaySubsequentClassLevelEarlySearch() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A* E command to display Subsequent Class Level early Search");
            isharesPage3.enterAECommand(logInfo);
            logInfo.pass("I enter A* E command to display Subsequent Class Level early Search");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *D command to display Itinerary For Retrieved")
    public void iEnterDCommandToDisplayItineraryForRetrieved() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *D command to display Itinerary For Retrieved");
            isharesPage3.enterDCommandToDisplayItineraryForRetrieved(logInfo);
            logInfo.pass("I enter *D command to display Itinerary For Retrieved");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add Corporate name to the PNR")
    public void i_add_Corporate_name() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Corporate name to the PNR");
            isharesPage3.addCorporateName(logInfo);
            logInfo.pass("I add Corporate name to the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter k_T command to display Regional Carrier support")
    public void iEnterK_TCommandToDisplayRegionalCarrierSupport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter k_T command to display Regional Carrier support");
            isharesPage3.enterKTPARTNERCommandToDisplayRegionalCarrierSupport(logInfo);
            logInfo.pass("I enter k_T command to display Regional Carrier support");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER command to display replace partner carrier’s redemption Class")
    public void iEnterKTPARTNERCommandToDisplayReplacePartnerCarrierSRedemptionClass() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to display replace partner carrier’s redemption Class");
            isharesPage3.enterKTPARTNERCommand(logInfo);
            logInfo.pass("I enter K-T-PARTNER command to display replace partner carrier’s redemption Class");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PMO command for Cancellation of Meal service")
    public void iEnterPMOCommandForCancellationOfMealService() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PMO command for Cancellation of Meal service");
            isharesPage3.enterPMOCommandToMealSerice(logInfo);
            logInfo.pass("I enter PMO command for Cancellation of Meal service");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the Bundle Long Sell with incorrect passenger data {string}")
    public void Bundle_Long_Sell_for_Married_Segment_Incorrect_Pax_Data(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the Bundle Long Sell with incorrect passenger data");
            isharesPage3.BundleLongSellWithInvalidPaxData(logInfo, Entry);
            logInfo.pass("I run the Bundle Long Sell with incorrect passenger data");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 8TL command to run the no Check-In time limit less departure time {string}")
    public void iEnterTLCommandToRunTheNoCheckInTimeLimitLessDepartureTime(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 8TL command to run the no Check-In time limit less departure time  " + Entry);
            isharesPage3.enterTLCommandToRunLessDepartureTime(logInfo, Entry);
            logInfo.pass("I enter 8TL command to run the no Check-In time limit less departure time " + Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KDPL1030 command to Convert Input Local time to Equivalent GMT time")
    public void iEnterKDPLCommandToConvertInputLocalTimeToEquivalentGMTTime() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KDPL1030 command to Convert Input Local time to Equivalent GMT time");
            isharesPage3.enterKDPLCommand(logInfo);
            logInfo.pass("I enter KDPL1030 command to Convert Input Local time to Equivalent GMT time");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter invalid phone details")
    public void iEnterInvalidPhoneDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid phone details");
            isharesPage3.enterInvalidPhoneDetails(logInfo);
            logInfo.pass("I enter invalid phone details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QZ command to display from Queues in PNR Data Suppress Mode")
    public void iEnterQZCommandToDisplayFromQueuesInPNRDataSuppressMode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QZ command to display from Queues in PNR Data Suppress Mode");
            isharesPage3.enterQZCommand(logInfo);
            logInfo.pass("I enter QZ command to display from Queues in PNR Data Suppress Mode");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter invalid passenger name with numeric number and validate error response")
    public void iEnterInvalidPassengerNameWithNumericNumberAndValidateErrorResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid passenger name with numeric number and validate error response");
            isharesPage3.enterInvalidPassengerNameWithNumeric(logInfo);
            logInfo.pass("I enter invalid passenger name with numeric number and validate error response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter TC_RC command to display system report")
    public void iEnterTC_RCCommandToDisplaySystemReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TC_RC command to display system report");
            isharesPage3.enterTC_RCCommand(logInfo);
            logInfo.pass("I enter TC_RC command to display system report");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PXS* command to display system Status")
    public void iEnterPXSCommandToDisplaySystemStatus() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PXS* command to display system Status");
            isharesPage3.enterPXSCommandToDisplaySystemStatus(logInfo);
            logInfo.pass("I enter TC_RC command to display system report");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $_ command to initiate reduce pnr for pax {string}")
    public void iEnter$_CommandToInitiateReducePnr(String TotalPaxToReduce) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_ command to initiate reduce pnr");
            isharesPage3.enter$_CommandToInitiateReducePnr(logInfo, TotalPaxToReduce);
            logInfo.pass("I enter $_ command to initiate reduce pnr");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform reject mass transfer")
    public void iPerformRejectMassTransfer() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform reject mass transfer");
            isharesPage3.rejectMassTransfer(logInfo);
            logInfo.pass("I perform reject mass transfer");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add different contact numbers and email {string}")
    public void iAddDifferentContactNumbersAndEmail(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add different contact numbers and email " + Entry);
            isharesPage3.addDifferentContactNumbersAndEmail(logInfo, Entry);
            logInfo.pass("I add different contact numbers and email " + Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate pnr for system {string} with SSR {string}")
    public void iEnterTTYMessageToGeneratePnrForSystemWithSSR(String SystemType, String SSRType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage3.TTYMessageBasicAirlinePnrWithSSR(logInfo, SystemType, SSRType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add Auxilliary Segment for Auxilliary Type {string}")
    public void i_Add_Auxilliary_Segment_For_Origin_For_Auxilliary_Type(String AuxilliaryType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Auxilliary Segment for Auxilliary Type " + AuxilliaryType);
            System.out.println("I add Auxilliary Segment for Auxilliary Type " + AuxilliaryType);
            isharesPage3.addAuxilliarySegment(logInfo, AuxilliaryType);
            logInfo.pass("I add Auxilliary Segment for Auxilliary Type " + AuxilliaryType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @Then("I validate successful shares login")
    public void iValidateSuccessfulSharesLogin() {
        System.out.println("Validate Login: ");

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate successful login");
            isharesPage3.validateSuccessfulLogin(logInfo);
            logInfo.pass("Validated: Login is successful");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add Auxilary Segment for Auxilary Type {string}")
    public void iAddAuxilarySegmentForOriginForAuxilaryType(String AuxilaryType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Auxilary Segment for Auxilary Type " + AuxilaryType);
            System.out.println("I add Auxilary Segment for Auxilary Type " + AuxilaryType);

            isharesPage3.addAuxilarySegment(logInfo, AuxilaryType);
            logInfo.pass("I add Auxilary Segment for Auxilary Type " + AuxilaryType);

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, e);
        }
    }

    @And("I store the old flight details")
    public void iStoreTheOldFlightDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I store the old flight details");
            isharesPage3.storeOldFlightDetails(logInfo);
            logInfo.pass("I store the old flight details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter -W_ command as the name convention for jump seat passengers")
    public void iEnterW_CommandAsTheNameConventionForJumpSeatPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter -W_ command as the name convention for jump seat passengers");
            isharesPage3.nameConventionForJumpSeatPassengers(logInfo);
            logInfo.pass("I enter -W_ command as the name convention for jump seat passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:_|@ command to cancel checkin")
    public void iEnter_6_CommandToCancelCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:_|@ command to cancel checkin");
            isharesPage3.cancelCheckin(logInfo);
            logInfo.pass("I enter 6:_|@ command to cancel checkin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_DU command to display desiring through passenger list")
    public void iEnter6LD_DUCommandToDisplayDesiringThroughPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_DU command to display desiring through passenger list");
            isharesPage3.displayDesiredThroughPassengerList(logInfo);
            logInfo.pass("I enter 6:LD_DU command to display desiring through passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ALL_ETCI command to display all the e-ticketed passengers that are checkedin")
    public void iEnter6LD_ALL_ETCICommandToDisplayAllTheETicketedPassengersThatAreCheckedin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ALL_ETCI command to display all the e-ticketed passengers that are checkedin");
            isharesPage3.displayETKTPassengersCheckedin(logInfo);
            logInfo.pass("I enter 6:LD_|ALL_ETCI command to display all the e-ticketed passengers that are checkedin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ALL_ETUN command to display all the e-ticketed passengers that are not checkedin")
    public void iEnter6LD_ALL_ETUNCommandToDisplayAllTheETicketedPassengersThatAreNotCheckedin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ALL_ETCI command to display all the e-ticketed passengers that are not checkedin");
            isharesPage3.displayETKTPassengersNotCheckedin(logInfo);
            logInfo.pass("I enter 6:LD_|ALL_ETCI command to display all the e-ticketed passengers that are not checkedin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LD_MTU command to display unseated passengers after transferring from one flight to another flight")
    public void iEnter6LD_MTUCommandToDisplayUnseatedPassengersAfterTransferringFromOneFlightToAnotherFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_MTU command to display unseated passengers after transferring from one flight to another flight");
            isharesPage3.displayUnseatedPassengersMassTransferred(logInfo);
            logInfo.pass("I enter 6:LD_MTU command to display unseated passengers after transferring from one flight to another flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_F command to display list of passenger who were checked in with force sell entry")
    public void iEnter6LD_FCommandToDisplayListOfPassengerWhoWereCheckedInWithForceSellEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_F command to display list of passenger who were checked in with force sell entry");
            isharesPage3.displayPassengersCheckedinWithForceSell(logInfo);
            logInfo.pass("I enter 6:LD_F command to display list of passenger who were checked in with force sell entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|G command to display the list of passengers whose grade has been changed")
    public void iEnter6LD_GCommandToDisplayTheListOfPassengersWhoseGradeHasBeenChanged() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|G command to display the list of passengers whose grade has been changed");
            isharesPage3.displayGradeChangePassengers(logInfo);
            logInfo.pass("I enter 6:LD_|G command to display the list of passengers whose grade has been changed");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|HS command to display the list of passengers with held seats")
    public void iEnter6LD_HSCommandToDisplayTheListOfPassengersWithHeldSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|HS command to display the list of passengers with held seats");
            isharesPage3.displayHeldSeatsPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|HS command to display the list of passengers with held seats");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|IC command to display the list of inbound connect passengers")
    public void iEnter6LD_ICCommandToDisplayTheListOfInboundConnectPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|IC command to display the list of inbound connect passengers");
            isharesPage3.displayInboundConnectPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|IC command to display the list of inbound connect passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|IC_ command to display the list of inbound connect passengers connecting to a specific flight")
    public void iEnter6LD_IC_CommandToDisplayTheListOfInboundConnectPassengersConnectingToASpecificFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|IC command to display the list of inbound connect passengers connecting to a specific flight");
            isharesPage3.displayInboundConnectPaxConnectingToSpecificFlt(logInfo);
            logInfo.pass("I enter 6:LD_|IC command to display the list of inbound connect passengers connecting to a specific flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|LP command to display a list of five or more passengers booked in the same PNR")
    public void iEnter6LD_LPCommandToDisplayAListOfFiveOrMorePassengersBookedInTheSamePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|LP command to display a list of five or more passengers booked in the same PNR");
            isharesPage3.displayListOfFiveOrMorePassengers(logInfo);
            logInfo.pass("I enter 6:LD_|LP command to display a list of five or more passengers booked in the same PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|NM command to display the list of passengers with no meal")
    public void iEnter6LD_NMCommandToDisplayTheListOfPassengersWithNoMeal() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|NM command to display the list of passengers with no meal");
            isharesPage3.displayPassengersWithNoMeal(logInfo);
            logInfo.pass("I enter 6:LD_|NM command to display the list of passengers with no meal");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|NS command to display the list of passengers with no shows")
    public void iEnter6LD_NSCommandToDisplayTheListOfPassengersWithNoShows() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|NM command to display the list of passengers with no shows");
            isharesPage3.displayPassengersWithNoShows(logInfo);
            logInfo.pass("I enter 6:LD_|NM command to display the list of passengers with no shows");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|OA_CI command to display the list of checkedin other airline passengers")
    public void iEnter6LD_OA_CICommandToDisplayTheListOfCheckedinOtherAirlinePassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|OA_CI command to display the list of checkedin other airline passengers");
            isharesPage3.displayListOfOtherAirlinePassengersCheckedin(logInfo);
            logInfo.pass("I enter 6:LD_|OA_CI command to display the list of checkedin other airline passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|OC command to display the list of outbound connect passengers")
    public void iEnter6LD_OCCommandToDisplayTheListOfOutboundConnectPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|OC command to display the list of outbound connect passengers");
            isharesPage3.displayListOfOutboundConnectPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|OC command to display the list of outbound connect passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|OS command to display the list of oversold passengers")
    public void iEnter6LD_OSCommandToDisplayTheListOfOversoldPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|OS command to display the list of oversold passengers");
            isharesPage3.displayListOfOversoldPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|OS command to display the list of oversold passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_| command to display the passenger by a specific passenger ID number")
    public void iEnter6LD_CommandToDisplayThePassengerByASpecificPassengerIDNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_| command to display the passenger by a specific passenger ID number");
            isharesPage3.displayPassengerByASpecificPassengerIDNumber(logInfo);
            logInfo.pass("I enter 6:LD_| command to display the passenger by a specific passenger ID number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_REAC_CHG command for displaying reaccommodated passengers with changed seat")
    public void iEnter6LD_REAC_CHGCommandForDisplayingReaccommodatedPassengersWithChangedSeat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_REAC_CHG command for displaying reaccommodated passengers with changed seat");
            isharesPage3.displayReaccommodatedPassengersWithChangedSeat(logInfo);
            logInfo.pass("I enter 6:LD_REAC_CHG command for displaying reaccommodated passengers with changed seat");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|REIN command to display the list of passengers who needs to do re-checkin")
    public void iEnter6LD_REINCommandToDisplayTheListOfPassengersWhoNeedsToDoReCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|REIN command to display the list of passengers who needs to do re-checkin");
            isharesPage3.displayPassengersWhoNeedsToDoRecheckin(logInfo);
            logInfo.pass("I enter 6:LD_|REIN command to display the list of passengers who needs to do re-checkin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|RS command to display the list of passengers requiring seat assignment")
    public void iEnter6LD_RSCommandToDisplayTheListOfPassengersRequiringSeatAssignment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|RS command to display the list of passengers requiring seat assignment");
            isharesPage3.displayPassengersRequiringSeatAssigment(logInfo);
            logInfo.pass("I enter 6:LD_|RS command to display the list of passengers requiring seat assignment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|S@ command to display the list of passengers requiring an enroute seat change")
    public void iEnter6LD_SCommandToDisplayTheListOfPassengersRequiringAnEnrouteSeatChange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|S@ command to display the list of passengers requiring an enroute seat change");
            isharesPage3.displayPassengersRequiringEnrouteSeatChange(logInfo);
            logInfo.pass("I enter 6:LD_|S@ command to display the list of passengers requiring an enroute seat change");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|SEC command to display the list of security profile selectees")
    public void iEnter6LD_SECCommandToDisplayTheListOfSecurityProfileSelectees() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SEC command to display the list of security profile selectees");
            isharesPage3.displaySecurityProfileSelectees(logInfo);
            logInfo.pass("I enter 6:LD_|SEC command to display the list of security profile selectees");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|SN command to display the list of passengers in sequence number")
    public void iEnter6LD_SNCommandToDisplayTheListOfPassengersInSequenceNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SN command to display the list of passengers in sequence number");
            isharesPage3.displayListOfPassengersInSequenceNumber(logInfo);
            logInfo.pass("I enter 6:LD_|SN command to display the list of passengers in sequence number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|_ command to display passenger with a specific seat assigned")
    public void iEnter6LD__CommandToDisplayPassengerWithASpecificSeatAssigned() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|_ command to display passenger with a specific seat assigned");
            isharesPage3.displayPassengerWithASpecificSeatAssigned(logInfo);
            logInfo.pass("I enter 6:LD_|_ command to display passenger with a specific seat assigned");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LD_|SL_CI command to display standby list by checkedin priority")
    public void iEnter6LD_SL_CICommandToDisplayStandbyListByCheckedinPriority() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SL_CI command to display standby list by checkedin priority");
            isharesPage3.displayStandbyListByCheckedinPriority(logInfo);
            logInfo.pass("I enter 6:LD_|SL_CI command to display standby list by checkedin priority");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|SL_CI command to display standby requiring seats")
    public void iEnter6LD_SL_CICommandToDisplayStandbyRequiringSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SL_CI command to display standby requiring seats");
            isharesPage3.displayStandbyRequiringSeats(logInfo);
            logInfo.pass("I enter 6:LD_|SL_CI command to display standby requiring seats");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|WS command to display passengers with seat")
    public void iEnter6LD_WSCommandToDisplayPassengersWithSeat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SL_CI command to display passengers with seat");
            isharesPage3.displayPassengersWithSeat(logInfo);
            logInfo.pass("I enter 6:LD_|SL_CI command to display passengers with seat");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|XI_SN command to display list of all passengers who canceled their itinerary after receiving a sequence number")
    public void iEnter6LD_XI_SNCommandToDisplayListOfAllPassengersWhoCanceledTheirItineraryAfterReceivingASequenceNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|XI_SN command to display list of all passengers who canceled their itinerary after receiving a sequence number");
            isharesPage3.displayPaxCanceledIntinAfterReceivingSeqNum(logInfo);
            logInfo.pass("I enter 6:LD_|XI_SN command to display list of all passengers who canceled their itinerary after receiving a sequence number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|XI_DB command to display list of all passengers whose itinerary was canceled due to an oversold flight condition")
    public void iEnter6LD_XI_DBCommandToDisplayListOfAllPassengersWhoseItineraryWasCanceledDueToAnOversoldFlightCondition() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|XI_DB command to display list of all passengers whose itinerary was canceled due to an oversold flight condition");
            isharesPage3.displayPaxCanceledDueToOversoldFlight(logInfo);
            logInfo.pass("I enter 6:LD_|XI_DB command to display list of all passengers whose itinerary was canceled due to an oversold flight condition");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|XM command to display list of cancelled misconnect passengers")
    public void iEnter6LD_XMCommandToDisplayListOfCancelledMisconnectPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|XM command to display list of cancelled misconnect passengers");
            isharesPage3.displayListOfCancelledMisconnectPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|XM command to display list of cancelled misconnect passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|XI command to display list of cancelled passengers")
    public void iEnter6LD_XICommandToDisplayListOfCancelledPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|XI command to display list of cancelled passengers");
            isharesPage3.displayListOfCancelledPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|XI command to display list of cancelled passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|X command to display list of cancelled thru passengers")
    public void iEnter6LD_XCommandToDisplayListOfCancelledThruPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|X command to display list of cancelled thru passengers");
            isharesPage3.displayListOfCancelledThruPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|X command to display list of cancelled thru passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|TB command to display list of all frequent traveller numbers")
    public void iEnter6LD_TBCommandToDisplayListOfAllFrequentTravellerNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|TB command to display list of all frequent traveller numbers");
            isharesPage3.displayListOfAllFrequentTravellerNumbers(logInfo);
            logInfo.pass("I enter 6:LD_|TB command to display list of all frequent traveller numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:*_ command to display checkin information")
    public void iEnter_6CommandToDisplayCheckinInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*_ command to display checkin information");
            isharesPage3.displayCheckinInformation(logInfo);
            logInfo.pass("I enter 6:*_ command to display checkin information");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:IACCC_ command to associate fleet name with a common map")
    public void iEnter6IACCC_CommandToAssociateFleetNameWithACommonMap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:IACCC_ command to associate fleet name with a common map");
            isharesPage3.associateFleetNameWithACommonMap(logInfo);
            logInfo.pass("I enter 6:IACCC_ command to associate fleet name with a common map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ICICR-CCC-COMMON command to start the creation of a common map ICR")
    public void iEnter6ICICRCCCCOMMONCommandToStartTheCreationOfACommonMapICR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ICICR-CCC-COMMON command to start the creation of a common map ICR");
            isharesPage3.startTheCreationOfACommonMapICR(logInfo);
            logInfo.pass("I enter 6:ICICR-CCC-COMMON command to start the creation of a common map ICR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ICICR_ command to start the creation of an ICR and have it associated to a common map for {string}")
    public void iEnter6ICICR_CommandToStartTheCreationOfAnICRAndHaveItAssociatedToACommonMap(String segmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ICICR_ command to start the creation of an ICR and have it associated to a common map");
            isharesPage3.startCreationOfAnICRAndAssociateToACommonMap(logInfo, segmentNo);
            logInfo.pass("I enter 6:ICICR_ command to start the creation of an ICR and have it associated to a common map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:I*IF_ command to display the ICR for any fleet name defined in the fleet List")
    public void iEnter6IIF_CommandToDisplayTheICRForAnyFleetNameDefinedInTheFleetList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:I*IF_ command to display the ICR for any fleet name defined in the fleet List");
            isharesPage3.displayTheICRForAnyFleetNameDefined(logInfo);
            logInfo.pass("I enter 6:I*IF_ command to display the ICR for any fleet name defined in the fleet List");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ICICR-_-CCC command to start the creation of a common map ICR")
    public void iEnter6ICICR_CCC_command_to_start_the_creation_of_a_common_mp_ICR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ICICR-CCC-COMMON command to start the creation of a common map ICR");
            isharesPage3.startTheCreationOfACommonMapICR(logInfo);
            logInfo.pass("I enter 6:ICICR-CCC-COMMON command to start the creation of a common map ICR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I capture the equipment number of a flight for segment number {string}")
    public void iCaptureTheEquipmentNumberOfAFlight(String segmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture the equipment number of a flight");
            isharesPage3.captureEquipmentNumberOfAFlight(logInfo, segmentNo);
            logInfo.pass("I capture the equipment number of a flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAEI|_ commands to initialize table updates")
    public void iEnterPAEI_CommandsToInitializeTableUpdates() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAEI|_ commands to initialize table updates");
            isharesPage3.initializeTableUpdates(logInfo);
            logInfo.pass("I enter PAEI|_ commands to initialize table updates");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAEX_ command to cancel or abort updates made in the table and exit the initialize mode")
    public void iEnterPAEX_CommandToCancelOrAbortUpdatesMadeOnTheWorkRecordAndExitTheInitializeMode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAEX_ command to cancel or abort updates made in the table and exit the initialize mode");
            isharesPage3.cancelOrAbortUpdatesMadeOnTheTable(logInfo);
            logInfo.pass("I enter PAEX_ command to cancel or abort updates made in the table and exit the initialize mode");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAEF_ command to finalize updates made in the table")
    public void iEnterPAEF_CommandToFinalizeUpdatesMadeInTheTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAEF_ command to finalize updates made in the table");
            isharesPage3.finalizeUpdatesMadeInTheTable(logInfo);
            logInfo.pass("I enter PAEF_ command to finalize updates made in the table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for double availability of flights from {string} to {string} with {string} and {string}")
    public void iSearchForDoubleAvailabilityOfFlightsFromTo(String originCity, String destinationCity, String connectingCity1, String connectingCity2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for double availability of flights");
            isharesPage3.doubleAvailabilityOfFlightsSearch(logInfo, originCity, destinationCity, connectingCity1, connectingCity2);
            logInfo.pass("I search for double availability of flights");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ER command and validate the error response")
    public void iEnterERCommandAndValidateTheErrorResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ER command and validate the error response");
            isharesPage3.enter_ER_ValidateError(logInfo);
            logInfo.pass("I enter ER command and validate the error response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter $_ command to reduce the passenger in the {string} from the PNR")
    public void iEnter$_CommandToReduceThePassengerInTheFromThePNR(String paxPositionToReduce) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter $_ command to reduce the passenger");
            isharesPage3.reduceThePNR(logInfo, paxPositionToReduce);
            logInfo.pass("I enter $_ command to reduce the passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KAOFI_ command to display list of the table of flights for a specific carrier")
    public void iEnterKAOFI_CommandToDisplayListOfTheTableOfFlightsForASpecificCarrier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KAOFI_ command to display list the table of flights for a specific carrier");
            isharesPage3.displayListOfTableOfFltsForASpecificCarrier(logInfo);
            logInfo.pass("I enter KAOFI_ command to display list the table of flights for a specific carrier");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BA command to do sine in")
    public void iEnterBACommandToDoSineIn() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BA command to do sine in");
            isharesPage3.enter_BA_ToDoSineIn(logInfo);
            logInfo.pass("I enter BA command to do sine in");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BB command to do sine in")
    public void iEnterBBCommandToDoSineIn() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BB command to do sine in");
            isharesPage3.enter_BB_ToDoSineIn(logInfo);
            logInfo.pass("I enter BB command to do sine in");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTSC_ command to run the alien sine table entry controller password")
    public void iEnterBTSC_CommandToRunTheAlienSineTableEntryControllerPassword() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTSC_ command to run the alien sine table entry controller password");
            isharesPage3.runAlienSineTableEntryControllerPassword(logInfo);
            logInfo.pass("I enter BTSC_ command to run the alien sine table entry controller password");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_A_RAS_ command to add flight range")
    public void iEnterKTPARTNERARAS_CommandToAddFlightRange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER/A/RAS_ command to add flight range");
            isharesPage3.addFlightRange(logInfo);
            logInfo.pass("I enter K-T-PARTNER/A/RAS_ command to add flight range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_A_RAS_ command to delete flight range")
    public void iEnterKTPARTNERARAS_CommandToDeleteFlightRange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER/A/RAS_ command to delete flight range");
            isharesPage3.deleteFlightRange(logInfo);
            logInfo.pass("I enter K-T-PARTNER/A/RAS_ command to delete flight range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_A_RAS_ command to replace partner carrier’s redemption class codes")
    public void iEnterKTPARTNERRRAS_CommandToReplacePartnerCarrierSRedemptionClassCodes() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_A_RAS_ command to replace partner carrier’s redemption class codes");
            isharesPage3.replacePartnerCarrierRedemptionClassCodes(logInfo);
            logInfo.pass("I enter K-T-PARTNER_A_RAS_ command to replace partner carrier’s redemption class codes");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTSD command to display alien sine table")
    public void iEnterBTSDCommandToDisplayAlienSineTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTSD command to display alien sine table");
            isharesPage3.displayAlienSineTable(logInfo);
            logInfo.pass("I enter BTSD command to display alien sine table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:ZT_ command to manually assign a score to a specified passenger")
    public void iEnter6ZT_CommandToManuallyAssignAScoreToASpecifiedPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZT_ command to manually assign a score to a specified passenger");
            isharesPage3.manuallyAssignAScoreToASpecifiedPax(logInfo);
            logInfo.pass("I enter 6:ZT_ command to manually assign a score to a specified passenger");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I remove {string} passengers from the arraylist")
    public void iRemovePassengersFromTheArraylist(String noOfPax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I remove passengers from the arraylist");
            isharesPage3.removePaxFromArraylist(logInfo, noOfPax);
            logInfo.pass("I remove passengers from the arraylist");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Paper ticketed passenger list")
    public void enter_Paperticketed_Passengerlist() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Paper ticketed passenger list");
            isharesPage3.allPaperTicketedPassengersList(logInfo);
            logInfo.pass("I enter Paper ticketed passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate Denied Boarding Worksheets")
    public void validate_Denied_BoardingWorksheets() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate Denied Boarding Worksheets");
            isharesPage3.validateDeniedBoardingWorksheets(logInfo);
            logInfo.pass("I validate Denied Boarding Worksheets");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate Positive Space Pass Riders")
    public void validate_Positive_SpacePassRiders() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate Positive Space Pass Riders");
            isharesPage3.validatePositiveSpacePassRiders(logInfo);
            logInfo.pass("I validate Positive Space Pass Riders");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate advance seat assignment")
    public void validate_advanceSeat_assignment() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6P command to display advance seat assignment");
            isharesPage3.validate_AdvanceSeatAssignment(logInfo);
            logInfo.pass("I enter 6P command to display advance seat assignment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6P command to display advance seat assignment")
    public void enter_6P_display_advanceSeat() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6P command to display advance seat assignment");
            isharesPage3.enter6ACommand_to_ASAAdvanceSeat(logInfo);
            logInfo.pass("I enter 6P command to display advance seat assignment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for Horizontal seat map")
    public void enter_command_HorizontalSeatMap() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Horizontal seat map");
            isharesPage3.displayHorizontalSeatMap(logInfo);
            logInfo.pass("I enter command for Horizontal seat map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Verify Passenger List Display")
    public void Verify_passengerListDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify Passenger List Display");
            isharesPage3.verifyPassengerListDisplay(logInfo);
            logInfo.pass("I Verify Passenger List Display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for Boarding Pass Reprint")
    public void enter_BoardingPassReprint_command() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Boarding Pass Reprint");
            isharesPage3.enterBoardingPassReprint(logInfo);
            logInfo.pass("I enter command for Boarding Pass Reprint");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate space available industry discount pass riders")
    public void validate_spaceAvailable_industryDiscountPassRiders() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate space available industry discount pass riders");
            isharesPage3.validate_spaceAvailableIndustryDiscountPassRiders(logInfo);
            logInfo.pass("I validate space available industry discount pass riders");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Verify Display Seat Status Map")
    public void verify_Display_SeatStatusMap() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify Display Seat Status Map");
            isharesPage3.verify_displaySeatStatusMap(logInfo);
            logInfo.pass("I Verify Display Seat Status Map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify Temporary block seat and seat is not assigned")
    public void verify_Temporaryblockseat() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify Temporary block seat and seat is not assigned");
            isharesPage3.verifyTemporaryblockseat(logInfo);
            logInfo.pass("I verify Temporary block seat and seat is not assigned");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify cancel checkin for CM segment")
    public void verify_cancelcheckinforCMsegment() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify cancel checkin for CM segment");
            isharesPage3.cancelCheckin(logInfo);
            logInfo.pass("I verify cancel checkin for CM segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I cancel checkin for CM segment for Multi Initial Pax")
    public void cancelcheckinforCMsegmentForMultiInitial() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I cancel checkin for CM segment for Multi Initial Pax");
            isharesPage3.cancelCheckinMultiInitial(logInfo);
            logInfo.pass("I cancel checkin for CM segment for Multi Initial Pax");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I verify change the seat for CM segment")
    public void verify_changeSeatforCMsegment() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify change the seat for CM segment");
            isharesPage3.verifyChangeSeat(logInfo);
            logInfo.pass("I verify change the seat for CM segment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Securing and finalizing the Market Value Table for {string} and {string}")
    public void enter_SecuringandfinalizingMVTable(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Securing and finalizing the Market Value Table");
            isharesPage3.enterSecuringandfinalizingMVTable(logInfo, origin, destination);
            logInfo.pass("I enter Securing and finalizing the Market Value Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter long sell command")
    public void enter_longSellCommand() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long sell command");
            isharesPage3.LongSellforMarriedSegment(logInfo);
            logInfo.pass("I enter long sell command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PTA THIRD PARTY TABLE")
    public void enter_PTA_ThirdPartyTable() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PTA THIRD PARTY TABLE");
            isharesPage3.enter_PTAThirdPartyTable(logInfo);
            logInfo.pass("I enter PTA THIRD PARTY TABLE");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ABS AMR list")
    public void enter_ABSAMRlist() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ABS AMR list");
            isharesPage3.enterABSAMRlist(logInfo);
            logInfo.pass("I enter ABS AMR list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter control name list entry")
    public void enter_controlName_listEntry() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter control name list entry");
            isharesPage3.enterPNXCommand(logInfo);
            logInfo.pass("I enter control name list entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify ETKT Coupon Reservation status")
    public void verify_ETKTCouponReservation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify ETKT Coupon Reservation status");
            isharesPage3.verifyETKTCouponReservation(logInfo);
            logInfo.pass("I verify ETKT Coupon Reservation status");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify Display of Image ETKT")
    public void verify_DisplayofImageETKT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify Display of Image ETKT");
            isharesPage3.verifyDisplayofImageETKT(logInfo);
            logInfo.pass("I verify Display of Image ETKT");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify Display of PNR and Image ETKT")
    public void verify_DisplayofPNRandImageETKT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify Display of PNR and Image ETKT");
            isharesPage3.verifyDisplayofPNRandImageETKT(logInfo);
            logInfo.pass("I verify Display of PNR and Image ETKT");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I verify receipt document for ticket")
    public void verify_receiptDocumentforTicket() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify receipt document for ticket");
            isharesPage3.verify_receiptDocumentforTicket(logInfo);
            logInfo.pass("I verify receipt document for ticket");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify receipt document for group ticket")
    public void verify_receiptDocumentforGroupTicket() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify receipt document for group ticket");
            isharesPage3.verify_receiptDocumentforTicket(logInfo);
            logInfo.pass("I verify receipt document for group ticket");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify receipt document for group ticket with adjusted names")
    public void verify_receiptDocumentforGroupTicketwithAdjustednames() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify receipt document for group ticket with adjusted names");
            isharesPage3.verifyreceiptDocumentforGroupTicketwithAdjustednames(logInfo);
            logInfo.pass("I verify receipt document for group ticket with adjusted names");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Preliminary Reports for {string}")
    public void enter_PreliminaryReports(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Preliminary Reports for " + flight);
            isharesPage3.enterPreliminaryReports(logInfo, flight);
            logInfo.pass("I enter Preliminary Reports for " + flight);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Final Reports command for {string}")
    public void enter_FinalReports(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Final Reports command for " + flight);
            isharesPage3.enterFinalReports(logInfo, flight);
            logInfo.pass("I enter Final Reports command for " + flight);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Update Request command for {string}")
    public void enter_UpdateRequestcommand(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Update Request command for " + flight);
            isharesPage3.enterUpdateRequestcommand(logInfo, flight);
            logInfo.pass("I enter Update Request command for " + flight);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Region Code Table used by MCT")
    public void enter_MCTRegionCodeTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Region Code Table used by MCT");
            isharesPage3.enterMCTRegionCodeTable(logInfo);
            logInfo.pass("I enter Region Code Table used by MCT");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter AAA Security Table entries")
    public void enter_AAASecurityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter AAA Security Table entries");
            isharesPage3.enterAAASecurityTable(logInfo);
            logInfo.pass("I enter AAA Security Table entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter market value table display for {string} {string} {string}")
    public void enter_MVTableDisplay(String origin, String destination1, String destination2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Securing and finalizing the Market Value Table");
            isharesPage3.enterMVTableDisplay(logInfo, origin, destination1, destination2);
            logInfo.pass("I enter Securing and finalizing the Market Value Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Display Fallback Table Copy entries for {string} and {string}")
    public void display_FallbackTable(String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Display Fallback Table Copy entries");
            isharesPage3.displayFallbackTable(logInfo, origin, destination);
            logInfo.pass("I Display Fallback Table Copy entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Security Sine INOUT")
    public void enter_SecuritySineINOUT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Security Sine INOUT");
            isharesPage3.enterSecuritySineINOUT(logInfo);
            logInfo.pass("I enter Security Sine INOUT");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV command to Display Entries-Full Table Display")
    public void enter_display_mARKET_VALUE_Full_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV command to Display Entries-Full Table Display");
            isharesPage3.display_mARKET_VALUE_Full_Table(logInfo);
            logInfo.pass("I enter MV command to Display Entries-Full Table Display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV command to Display Entries-Full Table Display with COS")
    public void enter_display_mARKET_VALUE_Table_cos() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV command to Display Entries-Full Table Display with COS");
            isharesPage3.display_mARKET_VALUE_Table_cos(logInfo);
            logInfo.pass("I enter MV command to Display Entries-Full Table Display with COS");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV command to Display Entries-Full Table Display by item number {string}")
    public void enter_display_mARKET_VALUE_Table_itemNo(String itemno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV command to Display Entries-Full Table Display by item number " + itemno);
            isharesPage3.display_mARKET_VALUE_Table_itemNo(logInfo, itemno);
            logInfo.pass("I enter MV command to Display Entries-Full Table Display by item number " + itemno);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV command to Display Fallback Table Display")
    public void enter_display_Table_flbk() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV command to Display Fallback Table Display");
            isharesPage3.display_Table_flbk(logInfo);
            logInfo.pass("I enter MV command to Display Fallback Table Display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV command to Display Market Value Table-Ignore")
    public void enter_display_MV_Table_Ignore() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV command to Display Market Value Table-Ignore");
            isharesPage3.display_MV_Table_Ignore(logInfo);
            logInfo.pass("I enter MV command to Display Market Value Table-Ignore");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV command to Market Value Table Re-Display")
    public void enter_display_MV_Table_Re_Display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV command to Market Value Table Re-Display");
            isharesPage3.display_MV_Table_Re_Display(logInfo);
            logInfo.pass("I enter MV command to Market Value Table Re-Display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Create_Modify_Display_Cancel Market Service SHARES entries")
    public void enter_display_Create_Modify_Display_Cancel_Market_Service() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Create_Modify_Display_Cancel Market Service SHARES entries");
            isharesPage3.display_Create_Modify_Display_Cancel_Market_Service(logInfo);
            logInfo.pass("I enter Create_Modify_Display_Cancel Market Service SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Add_Change_Delete City Pair Remark Service")
    public void enter_display_Add_Change_Delete_City_Pair_Remark() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Add_Change_Delete City Pair Remark Service");
            isharesPage3.display_Add_Change_Delete_City_Pair_Remark(logInfo);
            logInfo.pass("I enter command to Add_Change_Delete City Pair Remark Service");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKD_ command to run time Increment Factor Shares entries")
    public void iEnterMKD_CommandToRunTimeIncrementFactorSharesEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKD_ command to run time Increment Factor Shares entries");
            isharesPage3.toVerifyTimeIncrementFactorSharesEntries(logInfo);
            logInfo.pass("I enter MKD_ command to run time Increment Factor Shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter MKD_ command to run Map record Shares entries")
    public void iEnterMKD_CommandToRunMapRecordSharesEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKD_ command to run Map record Shares entries");
            isharesPage3.toRunMapRecordEntries(logInfo);
            logInfo.pass("I enter MKD_ command to run Map record Shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter MKG_ command to run the Modify Default Marketing Record Shares entries")
    public void iEnterMKG_CommandToRunTheModifyDefaultMarketingRecordSharesEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKG_ command to run the Modify Default Marketing Record Shares entries");
            isharesPage3.toRunModifyDefaultRecordSharesEntries(logInfo);
            logInfo.pass("I enter MKG_ command to run the Modify Default Marketing Record Shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter BO command to run the Agent Out share entries")
    public void iEnterBOCommandToRunTheAgentOutShareEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BO command to run the Agent Out share entries");
            isharesPage3.toRunAgentOutSharesEntries(logInfo);
            logInfo.pass("I enter BO command to run the Agent Out share entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter Q*LINK$_ command to display Link Error Control Table SHARES")
    public void iEnterQLINK$_CommandToDisplayLinkErrorControlTableSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*LINK$_ command to display Link Error Control Table SHARES");
            isharesPage3.toDisplayLinkErrorControlTable(logInfo);
            logInfo.pass("I enter Q*LINK$_ command to display Link Error Control Table SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*LINK$_ command to add, modify and delete in item{string} from Link Error Control Table SHARES")
    public void iEnterQLINK$_CommandToAddModifyAndDeleteInItemFromLinkErrorControlTableSHARES(String Item) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*LINK$_ command to add, modify and delete in item{string} from Link Error Control Table SHARES");
            isharesPage3.toModifyLinkErrorControlTable(logInfo, Item);
            logInfo.pass("I enter Q*LINK$_ command to add, modify and delete in item{string} from Link Error Control Table SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter KMSB_ command to perform the Turn S-AVS Batching {string} Entries")
    public void iEnterKMSB_CommandToPerformTheTurnSAVSBatchingEntries(String Action) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KMSB_ command  to perform the Turn S-AVS Batching{string} Entries");
            isharesPage3.toPerformTurnS_AVSBatching(logInfo, Action);
            logInfo.pass("I enter KMBS_ command  to perform the Turn S-AVS Batching{string} Entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter MVS command to Run the Market Value Table-Secure A Table SHARES entries")
    public void i_enter_MVS_command_to_Run_the_Market_Value_Table_Secure_A_Table_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVS command to Run the Market Value Table-Secure A Table SHARES entries");
            isharesPage3.MVScommandToRunMarketValueTable(logInfo);
            logInfo.pass("I enter MVS command to Run the Market Value Table-Secure A Table SHARES entries");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage3.getDriver(), logInfo, e);
        }
    }

    @And("I enter MVF command to Run the Market Value Table-Finalize Table SHARES entries")
    public void i_enter_MVF_command_to_Run_the_Market_Value_Finalize_Table_Table_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVF command to Run the Market Value Table-Finalize Table SHARES entries");
            isharesPage3.MVFcommandToFinalizeTable(logInfo);
            logInfo.pass("I enter MVF command to Run the Market Value Table-Finalize Table SHARES entries");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage3.getDriver(), logInfo, e);
        }
    }

    @And("I enter MKG command to Run the Automatic Marketing Record Creation")
    public void i_enter_MKG_command_to_Run_the_Automatic_Marketing_Record_Creation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKG command to Run the Automatic Marketing Record Creation");
            isharesPage3.MKGcommandToAutomaticMarketingRecordCreation(logInfo);
            logInfo.pass("I enter MKG command to Run the Automatic Marketing Record Creation");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage3.getDriver(), logInfo, e);
        }
    }

    @And("I enter MVPR command to Deactivate A Table SHARES entries")
    public void i_enter_MVPR_command_to_Deactivate_A_Table_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVPR command to Deactivate A Table SHARES entries");
            isharesPage3.MVPRcommandToDeactivateTable(logInfo);
            logInfo.pass("I enter MVPR command to Deactivate A Table SHARES entries");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage3.getDriver(), logInfo, e);
        }
    }

    @And("I enter K-T-PARTNER command to display flifo query response")
    public void iEnterKTPARTNERCommandToDisplayFlifoQueryResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to display flifo query response");
            isharesPage3.enterKTPARTNERCommand_FQR(logInfo);
            logInfo.pass("I enter K-T-PARTNER command to display flifo query response");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to add item in BCP profile table")
    public void iEnterKJCommandToAddItemInBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to add item in BCP profile table");
            isharesPage3.enterKJCommandToAddItemInBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to add item in BCP profile table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to change BCP Profile Table")
    public void iEnterKJCommandToChangeBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to change BCP Profile Table");
            isharesPage3.iEnterKJCommandToChangeBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to change BCP Profile Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to remove BCP Profile Table")
    public void iEnterKJCommandToRemoveBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to remove BCP Profile Table");
            isharesPage3.iEnterKJCommandToRemoveBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to remove BCP Profile Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to remove AUL and ADP in BCP Profile Table")
    public void iEnterKJCommandToRemoveAULAndADPInBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to remove AUL and ADP in BCP Profile Table");
            isharesPage3.enterKJCommandToRemoveAULAndADPInBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to remove AUL and ADP in BCP Profile Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to remove range of items in BCP Profile Table")
    public void iEnterKJCommandToRemoveRangeOfItemsInBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to remove range of items in BCP Profile Table");
            isharesPage3.enterKJCommandToRemoveRangeOfItemsInBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to remove range of items in BCP Profile Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to remove all Items in BCP profile table")
    public void iEnterKJCommandToRemoveAllItemsInBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to remove all Items in BCP profile table");
            isharesPage3.enterKJCommandToRemoveAllItemsInBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to remove all Items in BCP profile table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter KJ command to remove a single Step in BCP profile table")
    public void iEnterKJCommandToRemoveASingleStepInBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to remove a single Step  in BCP profile table");
            isharesPage3.enterKJCommandToRemoveASingleStepInBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to remove a single Step  in BCP profile table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter KJ command to remove Cancel a range of Steps in BCP profile table")
    public void iEnterKJCommandToRemoveCancelARangeOfStepsInBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to remove Cancel a range of Steps in BCP profile table");
            isharesPage3.enterKJCommandToRemoveCancelARangeOfStepsInBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to remove Cancel a range of Steps in BCP profile table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to remove all Steps within an Item in BCP profile table")
    public void iEnterKJCommandToRemoveAllStepsWithinAnItemInBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to remove all Steps within an Item in BCP profile table");
            isharesPage3.enterKJCommandToRemoveAllStepsWithinAnItemInBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to remove all Steps within an Item in BCP profile table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to add duplicate a single item in BCP profile table")
    public void iEnterKJCommandToAddDuplicateASingleItemInBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to remove all Steps within an Item in BCP profile table");
            isharesPage3.enterKJCommandToAddDuplicateASingleItemInBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to remove all Steps within an Item in BCP profile table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ command to add duplicate a range of items in BCP profile table")
    public void iEnterKJCommandToAddDuplicateARangeOfItemsInBCPProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to add duplicate a range of items in BCP profile table");
            isharesPage3.enterKJCommandToAddDuplicateARangeOfItemsInBCPProfileTable(logInfo);
            logInfo.pass("I enter KJ command to add duplicate a range of items in BCP profile table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TCRC command to display teletype transfer for system schedule facts")
    public void iEnterTCRCCommandToDisplayTeletypeTransferForSystemScheduleFacts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TCRC command to display teletype transfer for system schedule facts");
            isharesPage3.enterTCRCCommandToDisplayTeletypeTransferForSystemScheduleFacts(logInfo);
            logInfo.pass("I enter TCRC command to display teletype transfer for system schedule facts");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TCRC command to display teletype transfer for model master inventory records")
    public void iEnterTCRCCommandToDisplayTeletypeTransferForModelMasterInventoryRecords() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TCRC command to display teletype transfer for model master inventory records");
            isharesPage3.enterTCRCCommandToDisplayTeletypeTransferForModelMasterInventoryRecords(logInfo);
            logInfo.pass("I enter TCRC command to display teletype transfer for model master inventory records");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KA_FON command to display the flight original number table")
    public void iEnterKA_FONCommandToDisplayTheFlightOriginalNumberTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KA_FON command to display the flight original number table");
            isharesPage3.enterKA_FONCommandToDisplayTheFlightOriginalNumberTable(logInfo);
            logInfo.pass("I enter KA_FON command to display the flight original number table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the passenger receipt document for all the pax")
    public void iVerifyThePassengerReceiptForAllThePax() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the passenger receipt document for all the pax");
            isharesPage3.verifyPaxReceiptPrint(logInfo);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER command to add carrier {string}")
    public void iEnterKTPARTNERCommandToAddCarrier(String CarrierCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER command to add carrier " + CarrierCode);
            isharesPage3.enterKTPARTNERCommandToAddCarrier(logInfo, CarrierCode);
            logInfo.pass("I enter K-T-PARTNER command to add carrier " + CarrierCode);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter KC command related to Marketing Options table {string}")
    public void iEnterKCCommandRelatedToMarketingOptionsTable(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KC command related to Marketing Options table " + Entry);
            isharesPage3.enterKCCommandRelatedToMarketingOptionsTable(logInfo, Entry);
            logInfo.pass("I enter KC command related to Marketing Options table " + Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability to {string} without specifying the origin city and for departure time {string}")
    public void iSearchForFlightAvailabilityToWithoutSpecifyingTheOriginCity(String destinationCity, String departureTime) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability without specifying the origin city");
            isharesPage3.flightAvailabilityWithoutSpecifyingOrigin(logInfo, destinationCity, departureTime);
            logInfo.pass("I search for flight availability without specifying the origin city");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVR_ command to activate a table")
    public void iEnterMVR_CommandToActivateATable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVR_ command to activate a table");
            isharesPage3.enter_MVRCommandToActivateATable(logInfo);
            logInfo.pass("I enter MVR_ command to activate a table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVR_ command to deactivate a table")
    public void iEnterMVR_CommandToDeactivateATable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVR_ command to deactivate a table");
            isharesPage3.enter_MVRCommandToDeactivateATable(logInfo);
            logInfo.pass("I enter MVR_ command to deactivate a table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_D_FQR command to delete a carrier entry from the table")
    public void iEnterKTPARTNER_D_FQRCommandToDeleteACarrierEntryFromTheTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_D_FQR command to delete a carrier entry from the table");
            isharesPage3.deleteACarrierEntryFromTheTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER_D_FQR command to delete a carrier entry from the table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_R_RAS_ command to update table event and EDI time-out value")
    public void iEnterKTPARTNER_R_RAS_CommandToUpdateTableEventAndEDITimeOutValue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_R_RAS_ command to update table event and EDI time-out value");
            isharesPage3.updateTableEventAndEDITimeOutValue(logInfo);
            logInfo.pass("I enter K-T-PARTNER_R_RAS_ command to update table event and EDI time-out value");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MK_GMT command to display Greenwich Mean Time")
    public void iEnterMK_GMTCommandToDisplayGreenwichMeanTime() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MK_GMT command to display Greenwich Mean Time");
            isharesPage3.displayGreenwichMeanTime(logInfo);
            logInfo.pass("I enter MK_GMT command to display Greenwich Mean Time");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKD ITM command to display City Pair Remark")
    public void iEnterMKDITMCommandToDisplayCityPairRemark() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MK_GMT command to display City Pair Remark");
            isharesPage3.displayCityPairRemark(logInfo);
            logInfo.pass("I enter MK_GMT command to display City Pair Remark");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKD_D*HA command to display carrier or flight specific city pair for host flights")
    public void iEnterMKD_DHACommandToDisplayCarrierOrFlightSpecificCityPairForHostFlights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKD_D*HA command to display carrier or flight specific city pair for host flights");
            isharesPage3.displayCityPairItemsForHostFlights(logInfo);
            logInfo.pass("I enter MKD_D*HA command to display carrier or flight specific city pair for host flights");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKD_D*CS command to display carrier or flight specific city pair for codeshare flights")
    public void iEnterMKD_DCSCommandToDisplayCarrierOrFlightSpecificCityPairForCodeshareFlights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKD_D*CS command to display carrier or flight specific city pair for codeshare flights");
            isharesPage3.displayCityPairItemsForCodeshareFlights(logInfo);
            logInfo.pass("I enter MKD_D*CS command to display carrier or flight specific city pair for codeshare flights");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Q*CODESHARE_R command to display the reverse codeshare table")
    public void iEnterQCODESHARE_RCommandToDisplayTheReverseCodeshareTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE_R command to display the reverse codeshare table");
            isharesPage3.displayTheReverseCodeshareTable(logInfo);
            logInfo.pass("I enter Q*CODESHARE_R command to display the reverse codeshare table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter Q*CODESHARE$STATS command to display the reverse codeshare table statistics")
    public void iEnterQCODESHARE$STATSCommandToDisplayTheReverseCodeshareTableStatistics() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE$STATS command to display the reverse codeshare table statistics");
            isharesPage3.displayTheReverseCodeshareTableStatistics(logInfo);
            logInfo.pass("I enter Q*CODESHARE$STATS command to display the reverse codeshare table statistics");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE$O command to display carrier options table")
    public void iEnterQCODESHARE$OCommandToDisplayCarrierOptionsTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE$O command to display carrier options table");
            isharesPage3.displayCarrierOptionsTable(logInfo);
            logInfo.pass("I enter Q*CODESHARE$O command to display carrier options table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE*O command to display codeshare options table")
    public void iEnterQCODESHAREOCommandToDisplayCodeshareOptionsTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE*O command to display codeshare options table");
            isharesPage3.displayCodeshareOptionsTable(logInfo);
            logInfo.pass("I enter Q*CODESHARE*O command to display codeshare options table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*SEAM-* command to display the seamless availability Partner Control Table")
    public void iEnterQSEAMCommandToDisplayTheSeamlessAvailabilityPartnerControlTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*SEAM-* command to display the seamless availability Partner Control Table");
            isharesPage3.displaySeamlessAvailabilityPartnerControlTable(logInfo);
            logInfo.pass("I enter Q*SEAM-* command to display the seamless availability Partner Control Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*SELL_ command to display the Edifact Statistics for Query System")
    public void iEnterQSELL_CommandToDisplayTheEdifactStatisticsForQuerySystem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*SELL_ command to display the Edifact Statistics for Query System");
            isharesPage3.displayEdifactStatisticsForQuerySystem(logInfo);
            logInfo.pass("I enter Q*SELL_ command to display the Edifact Statistics for Query System");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVD_ command to duplicate a class item")
    public void iEnterMVD_CommandToDuplicateAClassItem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVD_ command to duplicate a class item");
            isharesPage3.duplicateAClassItem(logInfo);
            logInfo.pass("I enter MVD_ command to duplicate a class item");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE command to display codeshare table entries")
    public void iEnterQCODESHARECommandToDisplayCodeshareTableEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE command to display codeshare table entries");
            isharesPage3.displayCodeshareTableEntries(logInfo);
            logInfo.pass("I enter Q*CODESHARE command to display codeshare table entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAF_ command to display IATA inbound message")
    public void iEnterPIAF_CommandToDisplayIATAInboundMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAF_ command to display IATA inbound message");
            isharesPage3.displayIATAInboundMessage(logInfo);
            logInfo.pass("I enter PIAF_ command to display IATA inbound message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR_AVS_* command to display table for all HA items")
    public void iEnterKR_AVS_CommandToDisplayTableForAllHAItems() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR_AVS_* command to display table for all HA items");
            isharesPage3.displayTableForAllHAItems(logInfo);
            logInfo.pass("I enter KR_AVS_* command to display table for all HA items");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIBM command to display the IATA PNL board point master table")
    public void iEnterPIBMCommandToDisplayTheIATAPNLBoardPointMasterTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIBM command to display the IATA PNL board point master table");
            isharesPage3.displayIATAPNLBoardPointMasterTable(logInfo);
            logInfo.pass("I enter PIBM command to display the IATA PNL board point master table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIMC command to display IATA PNL master configuration table")
    public void iEnterPIMCCommandToDisplayIATAPNLMasterConfigurationTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIMC command to display IATA PNL master configuration table");
            isharesPage3.displayIATAPNLBoardMasterConfigurationTable(logInfo);
            logInfo.pass("I enter PIMC command to display IATA PNL master configuration table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAFA_ command to add flight information to the inbound IATA message table")
    public void iEnterPIAFA_CommandToAddFlightInformationToTheInboundIATAMessageTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAFA_ command to add flight information to the inbound IATA message table");
            isharesPage3.addFlightInfoToTheInboundIATAMessageTable(logInfo);
            logInfo.pass("I enter PIAFA_ command to add flight information to the inbound IATA message table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_ command to display Partner Indicator Table by indicator name")
    public void iEnterKTPARTNER_CommandToDisplayPartnerIndicatorTableByIndicatorName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_ command to display Partner Indicator Table by indicator name");
            isharesPage3.displayPartnerIndicatorTableByIndicatorName(logInfo);
            logInfo.pass("I enter K-T-PARTNER_ command to display Partner Indicator Table by indicator name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_XX_1 command to display Partner Indicator Table")
    public void iEnterKTPARTNER_XX_CommandToDisplayPartnerIndicatorTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_XX_1 command to display Partner Indicator Table");
            isharesPage3.enter_K_T_PARTNER_XX_1_displayPartnerIndicatorTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER_XX_1 command to display Partner Indicator Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_XX_* command to display Partner Indicator Table")
    public void iEnterKTPARTNER_XXCommandToDisplayPartnerIndicatorTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_XX_* command to display Partner Indicator Table");
            isharesPage3.enter_K_T_PARTNER_XX_displayPartnerIndicatorTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER_XX_* command to display Partner Indicator Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_ command to display all Partner Application Tables that contain Specified Partner")
    public void iEnterKTPARTNER_CommandToDisplayAllPartnerApplicationTablesThatContainSpecifiedPartner() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_ command to display all Partner Application Tables that contain Specified Partner");
            isharesPage3.enter_K_T_PARTNER_displayPartnerApplicationTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER_ command to display all Partner Application Tables that contain Specified Partner");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_*_PNV_** command to display the PNR view table")
    public void iEnterKTPARTNER__PNV_CommandToDisplayThePNRViewTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_*_PNV_** command to display the PNR view table");
            isharesPage3.displayPNRViewTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER_*_PNV_** command to display the PNR view table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_A_PNV_ command to add partner data to the PNR view table")
    public void iEnterKTPARTNER_A_PNV_CommandToAddPartnerDataToThePNRViewTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_A_PNV_ command to add partner data to the PNR view table");
            isharesPage3.addPartnerDataToPNRViewTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER_A_PNV_ command to add partner data to the PNR view table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_R_PNV_ command to replace partner data in the PNR view table")
    public void iEnterKTPARTNER_R_PNV_CommandToReplacePartnerDataInThePNRViewTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_R_PNV_ command to replace partner data in the PNR view table");
            isharesPage3.replacePartnerDataInPNRViewTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER_R_PNV_ command to replace partner data in the PNR view table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-PARTNER_D_PNV_ command to delete partner data from the PNR view table")
    public void iEnterKTPARTNER_D_PNV_CommandToDeletePartnerDataFromThePNRViewTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_D_PNV_ command to delete partner data from the PNR view table");
            isharesPage3.deletePartnerDataFromPNRViewTable(logInfo);
            logInfo.pass("I enter K-T-PARTNER_D_PNV_ command to delete partner data from the PNR view table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter S_ command to display schedule information of direct flights")
    public void iEnterS_CommandToDisplayScheduleInformationOfDirectFlights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter S_ command to display schedule information of direct flights");
            isharesPage3.displayScheduleInfoOfDirectFlights(logInfo);
            logInfo.pass("I enter S_ command to display schedule information of direct flights");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I K-T-PARTNER to get EDI Time-out Values and Update RAS Table Event")
    public void iKTCOmmand_to_Update_RAS_Table_Event() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I K-T-PARTNER to get EDI Time-out Values and Update RAS Table Even");
            isharesPage3.updateRASTableEvent(logInfo);
            logInfo.pass("I K-T-PARTNER to get EDI Time-out Values and Update RAS Table Even");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVP command to run Market Value Prorate Table-Display Entries")
    public void enter_to_run_Market_Value_Prorate_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVP command to run Market Value Prorate Table-Display Entries");
            isharesPage3.run_Market_Value_Prorate_Table(logInfo);
            logInfo.pass("I enter MVP command to run Market Value Prorate Table-Display Entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to activate A Table SHARES entries")
    public void enter_activate_A_table_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to activate A Table SHARES entries");
            isharesPage3.activate_A_table_SHARES_entries(logInfo);
            logInfo.pass("I enter command to activate A Table SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT command to execute IATA City Code Address to add by frequency {string} and address {string}")
    public void enter_display_City_Code_add_Address_Table_Display_FRQ_Address(String frq, String address) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT command to execute IATA City Code Address to add by frequency " + frq + "and address " + address);
            isharesPage3.display_City_Code_add_Address_Table_Display_FRQ_Address(logInfo, frq, address);
            logInfo.pass("I enter PIAT command to execute IATA City Code Address to add by frequency " + frq + " and address " + address);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVR command to activate A New Table SHARES")
    public void enter_to_run_the_activate_A_table_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVR command to activate A New Table SHARES");
            isharesPage3.run_the_activate_A_table_shares(logInfo);
            logInfo.pass("I enter MVR command to activate A New Table SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVA command to Add Class Item SHARES entries with frequency {string}")
    public void enter_display_Add_Class_Item(String frq) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVA command to Add Class Item SHARES entries with frequency " + frq);
            isharesPage3.display_Add_Class_Item(logInfo, frq);
            logInfo.pass("I enter MVA command to Add Class Item SHARES entries with frequency " + frq);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVC command to Change Class Item SHARES entries with itemno {string} and frequency {string}")
    public void enter_display_Change_Class_Item(String frq, String item) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVC command to Change Class Item SHARES entries with itemno " + item + "and frequency " + frq);
            isharesPage3.display_Change_Class_Item(logInfo, frq, item);
            logInfo.pass("I enter MVC command to Change Class Item SHARES entries with itemno " + item + "and frequency " + frq);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVA command to delete Class Item SHARES entries with itemno {string}")
    public void enter_display_delete_Class_Item(String itemno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVA command to delete Class Item SHARES entries with itemno " + itemno);
            isharesPage3.display_delete_Class_Items_Single(logInfo, itemno);
            logInfo.pass("I enter MVA command to delete Class Item SHARES entries with itemno " + itemno);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVA command for duplicate A Class Item SHARES entries with itemno {string}")
    public void enter_display_Duplicate_A_Class_Item(String itemno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVA command for duplicate A Class Item SHARES entries with itemno " + itemno);
            isharesPage3.display_Duplicate_A_Class_Item(logInfo, itemno);
            logInfo.pass("I enter MVA command for duplicate A Class Item SHARES entries with itemno " + itemno);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVM command to move A Class Item SHARES entries with itemno {string} by {string}")
    public void enter_display_Move_A_Class_Item(String itemno1, String itemno2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVM command to move A Class Item SHARES entries with itemno " + itemno1 + " by " + itemno2);
            isharesPage3.display_Move_A_Class_Item(logInfo, itemno1, itemno2);
            logInfo.pass("I enter MVM command to move A Class Item SHARES entries with itemno " + itemno1 + " by " + itemno2);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVG command to Create A New Table SHARES")
    public void enter_display_A_New_table_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVG command to Create A New Table SHARES");
            isharesPage3.display_A_New_table_shares(logInfo);
            logInfo.pass("I enter MVG command to Create A New Table SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVR command to deactivate A New Table SHARES")
    public void enter_to_run_the_deactivate_A_table_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVR command to deactivate A New Table SHARES");
            isharesPage3.run_the_deactivate_A_table_shares(logInfo);
            logInfo.pass("I enter MVR command to deactivate A New Table SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter passenger handling PCH")
    public void enter_passangerhandlingPCH() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passanger hangdling PCH");
            isharesPage3.enterpassangerhangdlingPCH(logInfo);
            logInfo.pass("I enter passanger hangdling PCH");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify Automatic schedule display")
    public void verify_Automaticscheduledisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Security Sine INOUT");
            isharesPage3.verifyAutomaticscheduledisplay(logInfo);
            logInfo.pass("I enter Security Sine INOUT");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to split the frequency range")
    public void enter_splitFrequencyrange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to split the frequency range");
            isharesPage3.entersplitFrequencyrange(logInfo);
            logInfo.pass("I enter command to split the frequency range");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Sliding booking compartment entries")
    public void enter_Slidingbookingcompartmententries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Sliding booking compartment entries");
            isharesPage3.enter_KTEQCommand_EquipmentConfigurationTable(logInfo);
            logInfo.pass("I enter Sliding booking compartment entries");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter tier cabin crew report text")
    public void enter_tierCabincrewReporttext() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter tier cabin crew report text");
            isharesPage3.entertierCabincrewReporttext(logInfo);
            logInfo.pass("I enter tier cabin crew report text");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify BCP items and modify for {string}")
    public void verify_BCPitemsandModify(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify BCP items and modify");
            isharesPage3.verifyBCPitemsandModify(logInfo, flight);
            logInfo.pass("I verify BCP items and modify");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TCRC command related to Segment Profile Control Records with Corresponding Profile Table Values {string}")
    public void iEnterTCRCCommandRelatedToSegmentProfileControlRecordsWithCorrespondingProfileTableValues(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TCRC command related to Segment Profile Control Records with Corresponding Profile Table Values " + Entry);
            isharesPage3.enterTCRCCommandRelatedToSegmentProfileControl(logInfo, Entry);
            logInfo.pass("I enter TCRC command related to Segment Profile Control Records with Corresponding Profile Table Values " + Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN* command to display All Items with profile table values")
    public void iEnterKNCommandToDisplayAllItemsWithProfileTableValues() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN* command to display All Items with profile table values");
            isharesPage3.enterKNCommandToDisplayAllItemsWithProfileTableValues(logInfo);
            logInfo.pass("I enter KN* command to display All Items with profile table values");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN* command to display all items containing some part of a date range and frequency")
    public void iEnterKNCommandToDisplayAllItemsContainingSomePartOfADateRangeAndFrequency() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN* command to display All Items with profile table values");
            isharesPage3.displayItemsInRangeWithFrequency(logInfo);
            logInfo.pass("I enter KN* command to display all items containing some part of a date range and frequency");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN* command to display a segment profile table {string}")
    public void iEnterKNCommandToDisplayASegmentProfileTable(String Index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN* command to display a segment profile table " + Index);
            isharesPage3.enterKNCommandToDisplayASegmentProfileTable(logInfo, Index);
            logInfo.pass("I enter KN* command to display a segment profile table " + Index);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN* command to display List the active segment profile tables and their remarks")
    public void iEnterKNCommandToDisplayListTheActiveSegmentProfileTablesAndTheirRemarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN* command to display List the active segment profile tables and their remarks");
            isharesPage3.enterKNCommandToDisplayListRemarks(logInfo);
            logInfo.pass("I enter KN* command to display List the active segment profile tables and their remarks");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN* command to display change a MIN_MAX level within a segment profile table")
    public void iEnterKNCommandToDisplayChangeAMINMAXLevelWithinASegmentProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN* command to display change a MIN\\/MAX level within a segment profile table");
            isharesPage3.enterKNCommandToDisplayChangeAMINMAXLevelWithinASegmentProfileTable(logInfo);
            logInfo.pass("I enter KN* command to display change a MIN\\/MAX level within a segment profile table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter OCML* command to display link member table")
    public void iEnterOCMLCommandToDisplayLinkMemberTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCML* command to display link member table");
            isharesPage3.enterOCMLCommandToDisplayLinkMemberTable(logInfo);
            logInfo.pass("I enter OCML* command to display link member table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TES* command to display terminal emulation security table {string}")
    public void iEnterTESCommandToDisplayTerminalEmulationSecurityTable(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TES* command to display terminal emulation security table " + Entry);
            isharesPage3.enterTESCommandToDisplayTerminalEmulationSecurityTable(logInfo, Entry);
            logInfo.pass("I enter TES* command to display terminal emulation security table" + Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MCT command to display items from the core table")
    public void iEnterMCTCommandToDisplayItemsFromTheCoreTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MCT command to display items from the core table");
            isharesPage3.enterMCTCommandToDisplayItemsFromTheCoreTable(logInfo);
            logInfo.pass("I enter MCT command to display items from the core table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCML* command to display partner information {string}")
    public void iEnterOCMLCommandToDisplayPartnerInformation(String CarrierCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCML* command to display partner information");
            isharesPage3.enterOCMLCommandToDisplayPartnerInformation(logInfo, CarrierCode);
            logInfo.pass("I enter OCML* command to display partner information");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I block all the seats in business class")
    public void iBlockAllTheSeatsInBusinessClass() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I block all the seats in business class");
            isharesPage3.iBlockAllTheSeatsInBusinessClass(logInfo);
            logInfo.pass("I block all the seats in business class");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KT|CF|* command to verify invalid response for CFD User")
    public void iEnterKTCFCommandToVerifyInvalidResponseForCFDUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT|CF|* command to verify invalid response for CFD User");
            isharesPage3.toVerifyInvalidResponseForCFDUSer(logInfo);
            logInfo.pass("I enter KT|CF|* command to verify invalid response for CFD User");


        } catch (AssertionError | Exception e) {

            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EH- command to display the ETKT history for specific ticket number")
    public void iEnterEHCommandToDisplayTheETKTHistoryForSpecificTicketNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH- command to display the ETKT history for specific ticket number");
            isharesPage3.toDisplayETKTHistoryForSpecificTicketNumber(logInfo);
            logInfo.pass("I enter *EH- command to display the ETKT history for specific ticket number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter C:SS_ commands to verify Indicate Overages or Shortages in TSSR as the cashier or supervisor entries with action type{string}")
    public void iEnterCSS_CommandsToVerifyIndicateOveragesOrShortagesInTSSRAsTheCashierOrSupervisorEntriesWithActionType(String Action) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:SS_ commands to verify Indicate Overages or Shortages in TSSR as the cashier or supervisor entries with action type{string}");
            isharesPage3.toVerifyIndicateOveragesOrShortagesInTSSR(logInfo, Action);
            logInfo.pass("I enter C:SS_ commands to verify Indicate Overages or Shortages in TSSR as the cashier or supervisor entries with action type{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter C:A command to verify Credit Card Shortage of Balancing TAR in SHARES")
    public void iEnterCACommandToVerifyCreditCardShortageOfBalancingTARInSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to verify Credit Card Shortage of Balancing TAR in SHARES");
            isharesPage3.toVerifyCreditCardShortageOfBalancingTARInSHARES(logInfo);
            logInfo.pass("I enter C:A command to verify Credit Card Shortage of Balancing TAR in SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter C:SS_ commands to Set the date in TSSR - Indicate Overages or Shortages")
    public void iEnterCSS_CommandsToSetTheDateInTSSRIndicateOveragesOrShortages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:SS_ commands to Set the date in TSSR - Indicate Overages or Shortages");
            isharesPage3.toSetTheDateInTSSR(logInfo);
            logInfo.pass("I enter C:SS_ commands to Set the date in TSSR - Indicate Overages or Shortages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter C:SS_ commands to Verify Indicate Overages or Shortages in TSSR - Billable Credit Card Overages")
    public void iEnterCSS_CommandsToVerifyIndicateOveragesOrShortagesInTSSRBillableCreditCardOverages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:SS_ commands to Verify Indicate Overages or Shortages in TSSR - Billable Credit Card Overages");
            isharesPage3.toVerifyBillableCreditCardOveragesInTSSR(logInfo);
            logInfo.pass("I enter C:SS_ commands to Verify Indicate Overages or Shortages in TSSR - Billable Credit Card Overages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6-CLR*TME command to display Cut-off Time SHARES entries")
    public void iEnterCLRTMECommandToDisplayCutOffTimeSHARESEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CLR*TME command to display Cut-off Time SHARES entries");
            isharesPage3.toDisplayCutOffTime(logInfo);
            logInfo.pass("I enter 6-CLR*TME command to display Cut-off Time SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter C:SS_ commands to add or display or delete the remarks with index{string} in TSSR")
    public void iEnterCSS_CommandsToAddOrDisplayOrDeleteTheRemarksWithIndexInTSSR(String Index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:SS_ commands to add or display or delete the remarks with index{string} in TSSR");
            isharesPage3.toAdd_Display_Delete_RemarksInTSSR(logInfo, Index);
            logInfo.pass("I enter C:SS_ commands to add or display or delete the remarks with index{string} in TSSR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter MX*_ command to display Class Connection Exception Table")
    public void iEnterMX_CommandToDisplayClassConnectionExceptionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MX*_ command to display Class Connection Exception Table");
            isharesPage3.toDisplayClassConnectionExceptionTable(logInfo);
            logInfo.pass("I enter MX*_ command to display Class Connection Exception Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter MXX_ command to display mandatory fields in Class Connection Exception Table")
    public void iEnterMXX_CommandToDisplayMandatoryFieldsInClassConnectionExceptionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MXX_ command to display mandatory fields in Class Connection Exception Table");
            isharesPage3.toDisplayMandatoryFieldsInClassConnectionExceptionTable(logInfo);
            logInfo.pass("I enter MXX_ command to display mandatory fields in Class Connection Exception Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter PAA*M command to display APIS CONTROL TABLE and Market table")
    public void iEnterPAAMCommandToDisplayAPISCONTROLTABLEAndMarketTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA*M command to display APIS CONTROL TABLE and Market table");
            isharesPage3.toDisplayAPISCONTROLTABLEAndMarketTable(logInfo);
            logInfo.pass("I enter PAA*M command to display APIS CONTROL TABLE and Market table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter PAAX|M command to cancel the update in APIS CONTROL Table")
    public void iEnterPAAXMCommandToCancelTheUpdateInAPISCONTROLTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAX|M command to cancel the update in APIS CONTROL Table");
            isharesPage3.toCancelTheUpdateInAPISCONTROLTable(logInfo);
            logInfo.pass("I enter PAAX|M command to cancel the update in APIS CONTROL Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter PAAI#M#_ command to initiate APIS CONTROL Table")
    public void iEnterPAAIM_CommandToInitiateAPISCONTROLTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAI#M#_ command to initiate APIS CONTROL Table");
            isharesPage3.toInitiateAPISCONTROLTable(logInfo);
            logInfo.pass("I enter PAAI#M#_ command to initiate APIS CONTROL Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter PAAF|M command to finalize modification in APIS Control Table with Status{string}")
    public void iEnterPAAFMCommandToFinalizeModificationInAPISControlTableWithStatus(String Status) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAF|M command to finalize modification in APIS Control Table with Status{string}");
            isharesPage3.toFinalizeModificationInAPISCONTROLTable(logInfo, Status);
            logInfo.pass("I enter PAAF|M command to finalize modification in APIS Control Table with Status{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:CQA|C_ to restrict default POS")
    public void iEnterCQAC_ToRestrictDefaultPOS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CQA|C_ to restrict default POS");
            isharesPage3.toRestrictDefaultPOS(logInfo);
            logInfo.pass("I enter 6:CQA|C_ to restrict default POS");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:CR_ command to restrict check-in entries to control sets")
    public void iEnterCR_CommandToRestrictCheckInEntriesToControlSets() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CR_ command to restrict check-in entries to control sets");
            isharesPage3.toRestrictCheckInEntriesToControlSets(logInfo);
            logInfo.pass("I enter 6:CR_ command to restrict check-in entries to control sets");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6-CC_ command to verify automatic post departure processing with no APIS message")
    public void iEnterCC_CommandToVerifyAutomaticPostDepartureProcessingWithNoAPISMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CC_ command to verify automatic post departure processing with no APIS message");
            isharesPage3.toVerifyAutomaticPostDepartureProcessingWithNoAPISMessage(logInfo);
            logInfo.pass("I enter 6-CC_ command to verify automatic post departure processing with no APIS message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter KJ command to display Profile Table Without AUC")
    public void iEnterKJCommandToDisplayProfileTableWithoutAUC() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ command to display Profile Table Without AUC");
            isharesPage3.enterKJCommandToDisplayProfileTableWithoutAUC(logInfo);
            logInfo.pass("I enter KJ command to display Profile Table Without AUC");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PASN command to display Entire Table Smoking and Non Smoking Leg Exception Table")
    public void iEnterPASNCommandToDisplayEntireTableSmokingAndNonSmokingLegExceptionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PSAN command to display Entire Table Smoking and Non Smoking Leg Exception Table");
            isharesPage3.enterPASNCommand(logInfo);
            logInfo.pass("I enter PSAN command to display Entire Table Smoking and Non Smoking Leg Exception Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ* command to display all Items which are included in some part of a date range")
    public void iEnterKJCommandToDisplayAllItemsWhichAreIncludedInSomePartOfADateRange() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ* command to display all Items which are included in some part of a date range");
            isharesPage3.iEnterKJCommand(logInfo);
            logInfo.pass("I enter KJ* command to display all Items which are included in some part of a date range");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ*S command to display BCP Table for flight on Inventory RTP List")
    public void iEnterKJSCommandToDisplayBCPTableForFlightOnInventoryRTPList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ*S command to display BCP Table for flight on Inventory RTP List");
            isharesPage3.enterKJSCommandToDisplayBCPTableForFlightOnInventoryRTPList(logInfo);
            logInfo.pass("I enter KJ*S command to display BCP Table for flight on Inventory RTP List");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ * M command to display model with AUL")
    public void iEnterKJMCommandToDisplayModelWithAUL() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ * M command to display model with AUL");
            isharesPage3.enterKJMCommandToDisplayModelWithAUL(logInfo);
            logInfo.pass("I enter KJ * M command to display model with AUL");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ*MA command for adding Market Field with remark {string}")
    public void iEnterKJMACommandForAddingMarketField(String Remark) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ*MA command for adding Market Field " + Remark);
            isharesPage3.enterKJMACommandForAddingMarketField(logInfo, Remark);
            logInfo.pass("I enter KJ*MA command for adding Market Field " + Remark);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9HNL command to add phone details")
    public void iEnterHNLCommandToAddPhoneDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9HNL command to add phone details");
            isharesPage3.enterHNLCommandToAddPhoneDetails(logInfo);
            logInfo.pass("I enter 9HNL command to add phone details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ* command to display by Date Range and Frequency")
    public void iEnterKJCommandToDisplayByDateRangeAndFrequency() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ* command to display by Date Range and Frequency");
            isharesPage3.enterKJCommandToDisplayByDateRangeAndFrequency(logInfo);
            logInfo.pass("I enter KJ* command to display by Date Range and Frequency");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KJ_F command to split an Item by Frequency")
    public void iEnterKJ_FCommandToSplitAnItemByFrequency() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KJ* command to display by Date Range and Frequency");
            isharesPage3.enterKJ_FCommandToSplitAnItemByFrequency(logInfo);
            logInfo.pass("I enter KJ* command to display by Date Range and Frequency");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter RATS* with lniata to display process Historical and Forecast Reports")
    public void iEnterRATSWithLniataToDisplayProcessHistoricalAndForecastReports() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter RATS* with lniata to display process Historical and Forecast Reports");
            isharesPage3.enterRATSWithLniataToDisplayProcessHistoricalAndForecastReports(logInfo);
            logInfo.pass("I enter RATS* with lniata to display process Historical and Forecast Reports");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIMU command display flight details info")
    public void iEnterPIMUCommandDisplayFlightDetailsInfo() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIMU command display flight details info");
            isharesPage3.enterPIMUCommandDisplayFlightDetailsInfo(logInfo);
            logInfo.pass("I enter PIMU command display flight details info");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT command IATA City Code Address Table for {string}")
    public void iEnterPIATCommandIATACityCodeAddressTableFor(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT command IATA City Code Address Table for " + Entry);
            isharesPage3.enterPIATCommandIATACityCodeAddressTableFor(logInfo, Entry);
            logInfo.pass("I enter PIAT command IATA City Code Address Table for " + Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAVI command Initialize CCT SHARES")
    public void iEnterPAVICommandInitializeCCTSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAVI command Initialize CCT SHARES");
            isharesPage3.iEnterPAVICommandInitializeCCTSHARES(logInfo);
            logInfo.pass("I enter PAVI command Initialize CCT SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PSAN command to display Items by Specific Flight Number")
    public void iEnterPSANCommandToDisplayItemsBySpecificFlightNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PSAN command to display Items by Specific Flight Number");
            isharesPage3.enterPSANCommandToDisplayItemsBySpecificFlightNumber(logInfo);
            logInfo.pass("I enter PSAN command to display Items by Specific Flight Number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADW* command display Standard Weights Table")
    public void iEnterPADWCommandDisplayStandardWeightsTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADW* command display Standard Weights Table");
            isharesPage3.enterPADWCommandDisplayStandardWeightsTable(logInfo);
            logInfo.pass("I enter PADW* command display Standard Weights Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PASN command to display default status Smoking and Non Smoking Leg Exception Table")
    public void iEnterPASNCommandToDisplayDefaultStatusSmokingAndNonSmokingLegExceptionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PASN command to display default status Smoking and Non Smoking Leg Exception Table");
            isharesPage3.enterPASNCommandDisplayDomesticTable(logInfo);
            logInfo.pass("I enter PASN command to display default status Smoking and Non Smoking Leg Exception Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PITP* command to run Third Party Translate Table {string}")
    public void iEnterPITPCommandToRunThirdPartyTranslateTable(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PASN command to display default status Smoking and Non Smoking Leg Exception Table");
            isharesPage3.enterPITPCommandToRunThirdPartyTranslateTable(logInfo, Entry);
            logInfo.pass("I enter PASN command to display default status Smoking and Non Smoking Leg Exception Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_CI command in invalid format to get validate the error response {string}")
    public void iEnterLD_CICommandInInvalidFormatToGetValidateTheErrorResponse(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_CI command in invalid format to get validate the error response");
            isharesPage3.enterLD_CICommand(logInfo, Entry);
            logInfo.pass("I enter 6:LD_CI command in invalid format to get validate the error response");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter RC command to display System report")
    public void iEnterRCToDisplaySystemReportForOrigin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter RC Command to display System report for origin");
            isharesPage3.SystemReportDisplay(logInfo);
            logInfo.pass("I enter RC Command to display System report for origin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TES* command to display terminal emulation security table")
    public void iEnterTESCommandToDisplayTerminalEmulationSecurityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TES* command to display terminal emulation security table");
            isharesPage3.enterTESCommandToDisplayTerminalEmulationSecurityTable(logInfo);
            logInfo.pass("I enter TES* command to display terminal emulation security table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:*H command Flight History and Then perform History search by Character {string}")
    public void iEnterHCommandFlightHistoryAndThenPerformHistorySearchByCharacter(String Code) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*H command Flight History and Then perform History search by Character");
            isharesPage3.enterHCommandFlightHistoryAndThenPerformHistorySearchByCharacter(logInfo, Code);
            logInfo.pass("I enter 6:*H command Flight History and Then perform History search by Character");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LGA command to display passenger name list having AUX Segments")
    public void iEnterLGACommandToDisplayPassengerNameListHavingAUXSegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LGA command to display passenger name list having AUX Segments");
            isharesPage3.enterLGACommand(logInfo);
            logInfo.pass("I enter LGA command to display passenger name list having AUX Segments");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LCN command to display Passenger name list")
    public void iEnterLCNCommandToDisplayPassengerNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LCN command to display Passenger name list");
            isharesPage3.enterLCNCommandToDisplayPassengerNameList(logInfo);
            logInfo.pass("I enter LCN command to display Passenger name list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT*_ command to display IATA PNL Flight Master Table")
    public void iEnterPIAT_CommandToDisplayIATAPNLFlightMasterTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT*_ command to display IATA PNL Flight Master Table");
            isharesPage3.displayIATAPNLFlightMasterTable(logInfo);
            logInfo.pass("I enter PIAT*_ command to display IATA PNL Flight Master Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIATUM_ command to add an address to PNL message type")
    public void iEnterPIATUM_CommandToAddAnAddressToPNLMessageType() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIATUM_ command to add an address to PNL message type");
            isharesPage3.addAnAddressToPNLMessageType(logInfo);
            logInfo.pass("I enter PIATUM_ command to add an address to PNL message type");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2CS* command to display the codeshare FLIFO flight number table and also display specific flight number in table")
    public void iEnterCSCommandToDisplayTheCodeshareFLIFOFlightNumberTableAndAlsoDisplaySpecificFlightNumberInTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2CS* command to display the codeshare FLIFO flight number table and also display specific flight number in table");
            isharesPage3.displayCodeshareFltNoAndDisplaySpecificFltNoInTable(logInfo);
            logInfo.pass("I enter 2CS* command to display the codeshare FLIFO flight number table and also display specific flight number in table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2CS* command to display a flight number that is not present in the table and validate error message")
    public void iEnterCSCommandToDisplayAFlightNumberThatIsNotPresentInTheTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2CS* command to display a flight number that is not present in the table and validate error message");
            isharesPage3.displayAFltNumberThatIsNotInTableAndValidateError(logInfo);
            logInfo.pass("I enter 2CS* command to display a flight number that is not present in the table and validate error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2CSA_ command to add an entry to a flight number that is not present in the table")
    public void iEnterCSA_CommandToAddAnEntryToAFlightNumberAndValidateTheAddedEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2CSA_ command to add an entry to a flight number that is not present in the table");
            isharesPage3.addAnEntryToAFlightNumberThatIsNotInTheTable(logInfo);
            logInfo.pass("I enter 2CSA_ command to add an entry to a flight number that is not present in the table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2CSR_ command to replace the outbound routing address and partner carrier code for a flight item")
    public void iEnterCSR_CommandToReplaceTheOutboundRoutingAddressAndPartnerCarrierCodeForAFlightItem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2CSR_ command to replace the outbound routing address and partner carrier code for a flight item");
            isharesPage3.replaceOutboundRoutingAddressAndPartnerCCForAFlt(logInfo);
            logInfo.pass("I enter 2CSR_ command to replace the outbound routing address and partner carrier code for a flight item");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2CSD_ command to delete the flight information")
    public void iEnterCSD_CommandToDeleteTheFlightInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2CSD_ command to delete the flight information");
            isharesPage3.deleteFlightInformation(logInfo);
            logInfo.pass("I enter 2CSD_ command to delete the flight information");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KT_WC_* command to display waitlist closure table")
    public void iEnterKT_WC_CommandToDisplayWaitlistClosureTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT_WC_* command to display waitlist closure table");
            isharesPage3.displayWaitlistClosureTable(logInfo);
            logInfo.pass("I enter KT_WC_* command to display waitlist closure table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KT_WC_AC_ command to add equipment number, date range, frequency and other details to the waitlist closure table")
    public void iEnterKT_WC_AC_CommandToAddEquipmentNumberDateRangeFrequencyAndOtherDetailsToTheWaitlistClosureTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT_WC_AC_ command to add equipment number, date range, frequency and other details to the waitlist closure table");
            isharesPage3.addDetailsToWaitlistClosureTable(logInfo);
            logInfo.pass("I enter KT_WC_AC_ command to add equipment number, date range, frequency and other details to the waitlist closure table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KT_WC_C1_BIDTRAV command and check the waitlist closure table")
    public void iEnterKT_WC_C1_BIDTRAVCommandAndCheckTheWaitlistClosureTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT_WC_C1_BIDTRAV command and check the waitlist closure table");
            isharesPage3.enter_KT_W_C_BIDTRAV(logInfo);
            logInfo.pass("I enter KT_WC_C1_BIDTRAV command and check the waitlist closure table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KT_WC_D command and delete the item {string} from the waitlist closure table")
    public void iEnterKT_WC_DCommandAndDeleteTheItemInTheWaitlistClosureTable(String itemNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT_WC_D command and delete the item {string} from the waitlist closure table");
            isharesPage3.deleteItemFromWaitlistClosureTable(logInfo, itemNumber);
            logInfo.pass("I enter KT_WC_D command and delete the item {string} from the waitlist closure table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-RAE_ command to add or replace a ticketing remark item with restrictions or endorsements identifier")
    public void iEnterTRAE_CommandToAddOrReplaceATicketingRemarkItemWithRestrictionsOrEndorsementsIdentifier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-RAE_ command to add or replace a ticketing remark item with restrictions or endorsements identifier");
            isharesPage3.addOrReplaceTktingRemarkWithRestrictionOrEndorsement(logInfo);
            logInfo.pass("I enter T-RAE_ command to add or replace a ticketing remark item with restrictions or endorsements identifier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_RAX_ command to add or replace a ticketing remark item with issued in exchange identifier")
    public void iEnterT_RAX_CommandToAddOrReplaceATicketingRemarkItemWithIssuedInExchangeIdentifier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAX_ command to add or replace a ticketing remark item with issued in exchange identifier");
            isharesPage3.addOrReplaceTktingRemarkWithIssuedInExchange(logInfo);
            logInfo.pass("I enter T_RAX_ command to add or replace a ticketing remark item with issued in exchange identifier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_RAX_ command to add or replace a ticketing remark item with issued in exchange identifier for pax {string}")
    public void iEnterT_RAX_CommandToAddOrReplaceATicketingRemarkItemWithIssuedInExchangeIdentifierForSpecificPax(String paxNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAX_ command to add or replace a ticketing remark item with issued in exchange identifier");
            isharesPage3.addOrReplaceTktingRemarkWithIssuedInExchangeForSpecificPax(logInfo,paxNumber);
            logInfo.pass("I enter T_RAX_ command to add or replace a ticketing remark item with issued in exchange identifier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I enter T_RAB_ command to add or replace a ticketing remark item with baggage allowance identifier")
    public void iEnterT_RAB_CommandToAddOrReplaceATicketingRemarkItemWithBaggageAllowanceIdentifier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAB_ command to add or replace a ticketing remark item with baggage allowance identifier");
            isharesPage3.addOrReplaceTktingRemarkWithBaggageAllowance(logInfo);
            logInfo.pass("I enter T_RAB_ command to add or replace a ticketing remark item with baggage allowance identifier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_RAY_ command to add or replace a ticketing remark item with fare identifier")
    public void iEnterT_RAY_CommandToAddOrReplaceATicketingRemarkItemWithFareIdentifier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAY_ command to add or replace a ticketing remark item with fare identifier");
            isharesPage3.addOrReplaceTktingRemarkWithFareIdentifier(logInfo);
            logInfo.pass("I enter T_RAY_ command to add or replace a ticketing remark item with fare identifier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_RAO_ command to add or replace a ticketing remark item with original issue identifier")
    public void iEnterT_RAO_CommandToAddOrReplaceATicketingRemarkItemWithOriginalIssueIdentifier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAO_ command to add or replace a ticketing remark item with original issue identifier");
            isharesPage3.addOrReplaceTktingRemarkWithOriginalIssueIdentifier(logInfo);
            logInfo.pass("I enter T_RAO_ command to add or replace a ticketing remark item with original issue identifier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_RAS_ command to add or replace a ticketing remark item with international sales indicator identifier")
    public void iEnterT_RAS_CommandToAddOrReplaceATicketingRemarkItemWithInternationalSalesIndicatorIdentifier() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAS_ command to add or replace a ticketing remark item with international sales indicator identifier");
            isharesPage3.addOrReplaceTktingRemarkWithOriginalIssueIdentifier(logInfo);
            logInfo.pass("I enter T_RAS_ command to add or replace a ticketing remark item with international sales indicator identifier");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_RAQ_ command to add more than one data item")
    public void iEnterT_RAQ_CommandToAddMoreThanOneDataItem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAQ_ command to add more than one data item");
            isharesPage3.addMoreThanOneDataItem(logInfo);
            logInfo.pass("I enter T_RAQ_ command to add more than one data item");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_RAN_ command to add data items for a specific name")
    public void iEnterT_RAN_CommandToAddDataItemsForASpecificName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAN_ command to add data items for a specific name");
            isharesPage3.addDataItemsForASpecificName(logInfo);
            logInfo.pass("I enter T_RAN_ command to add data items for a specific name");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_RAQ_ command to replace an existing item with blanks")
    public void iEnterT_RAQ_CommandToReplaceAnExistingItemWithBlanks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_RAQ_ command to replace an existing item with blanks");
            isharesPage3.replaceAnExistingItemWithBlanks(logInfo);
            logInfo.pass("I enter T_RAQ_ command to replace an existing item with blanks");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAF*_ command to display IATA city code address table")
    public void iEnterPIAF_CommandToDisplayIATACityCodeAddressTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAF*_ command to display IATA city code address table");
            isharesPage3.displayIATACityCodeAddressTable(logInfo);
            logInfo.pass("I enter PIAF*_ command to display IATA city code address table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAFA_ command to add a header to the inbound IATA message table")
    public void iEnterPIAFA_CommandToAddAHeaderToTheInboundIATAMessageTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAFA_ command to add a header to the inbound IATA message table");
            isharesPage3.addAHeaderToTheInboundIATAMessageTable(logInfo);
            logInfo.pass("I enter PIAFA_ command to add a header to the inbound IATA message table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to sort")
    public void enter_command_to_sort() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to sort");
            isharesPage3.table_sort(logInfo);
            logInfo.pass("I enter command to sort");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PASN* command")
    public void enter_table_display_of_smoking_NonSmoking() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PASN* command");
            isharesPage3.table_display_of_smoking_NonSmoking(logInfo);
            logInfo.pass("I enter PASN* command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add passenger with flight range {string} and frequency {string}")
    public void enter_table_PA_with_FT_FRQ_of_smoking_NonSmoking(String fltRange, String frq) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add passenger with flight range " + fltRange + "and frequency " + frq);
            isharesPage3.table_PA_with_FT_FRQ_of_smoking_NonSmoking(logInfo, fltRange, frq);
            logInfo.pass("I enter command to add passenger with flight range " + fltRange + "and frequency " + frq);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to alter table with flight range {string} and frequency {string}")
    public void enter_table_alter_fltRange_frq_smoking_NonSmoking(String fltRange, String frq) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to alter table with flight range " + fltRange + "and frequency " + frq);
            isharesPage3.table_alter_fltRange_frq_smoking_NonSmoking(logInfo, fltRange, frq);
            logInfo.pass("I enter command to alter table with flight range " + fltRange + "and frequency " + frq);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run the BTM GenerationSHARES entries")
    public void enter_command_to_run_BTM_GenerationSHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run the BTM GenerationSHARES entries");
            isharesPage3.command_to_run_BTM_GenerationSHARES_entries(logInfo);
            logInfo.pass("I enter command to Run the BTM GenerationSHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display Append Action_Advisory Messages")
    public void enter_command_to_display_Append_Action_Advisory_Messages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display Append Action_Advisory Messages");
            isharesPage3.command_to_display_Append_Action_Advisory_Messages(logInfo);
            logInfo.pass("I enter command to display Append Action_Advisory Messages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Replace CCT Item SHARES entries")
    public void enter_command_to_Replace_CCT_Item_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Replace CCT Item SHARES entries");
            isharesPage3.command_to_Replace_CCT_Item_SHARES_entries(logInfo);
            logInfo.pass("I enter command to Replace CCT Item SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PASNI command to initialize table modifications of smoking_NonSmoking leg exception")
    public void enter_table_modifications_of_smoking_NonSmoking() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PASNI command to initialize table modifications of smoking_NonSmoking leg exception");
            isharesPage3.table_modifications_of_smoking_NonSmoking(logInfo);
            logInfo.pass("I enter PASNI command to initialize table modifications of smoking_NonSmoking leg exception");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PASNX command to cancelled table modifications of smoking_NonSmoking leg exception")
    public void enter_table_cancelled_of_smoking_NonSmoking() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PASNX command to cancelled table modifications of smoking_NonSmoking leg exception");
            isharesPage3.table_cancelled_of_smoking_NonSmoking(logInfo);
            logInfo.pass("I enter PASNX command to cancelled table modifications of smoking_NonSmoking leg exception");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-LD command with ETKTs that have not checked-in for a specific flight, date and board point for passenger type {string}")
    public void enter_ETKTs_that_have_not_checked_in(String passType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-LD command with ETKTs that have not checked-in for a specific flight, date and board point for passenger type " + passType);
            isharesPage3.ETKTs_that_have_not_checked_in(logInfo, passType);
            logInfo.pass("I enter 6-LD command with ETKTs that have not checked-in for a specific flight, date and board point for passenger type " + passType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check Summmary of passenger and bag counts by destination city and seating compartment")
    public void enter_Summary_of_passenger_and_bag_counts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check Summmary of passenger and bag counts by destination city and seating compartment");
            isharesPage3.Summary_of_passenger_and_bag_counts(logInfo);
            logInfo.pass("I enter command to check Summmary of passenger and bag counts by destination city and seating compartment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check passenger counts by class of service,local boarding,connecting and standby with seats")
    public void enter_summary_passenger_counts_by_class_of_service() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check passenger counts by class of service,local boarding,connecting and standby with seats");
            isharesPage3.summary_passenger_counts_by_class_of_service(logInfo);
            logInfo.pass("I enter command to check passenger counts by class of service,local boarding,connecting and standby with seats");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE command to check the entire Code Sharing Table")
    public void i_check_Codeshare_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "Q*CODESHARE command to check the entire Code Sharing Table");
            isharesPage3.displayCODESHAREentry(logInfo);
            logInfo.pass("I enter Q*CODESHARE command to check the entire Code Sharing Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_PFDcommand to display invalid negotiated fare user access table")
    public void iEnterT_PFD_CommandToDisplayNegotiatedFareUserAccessTableWithDutyCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_PFD command to display invalid negotiated fare user access table");
            isharesPage3.displayInvalidNegotiatedFareUserTable(logInfo);
            logInfo.pass("I enter T_PFD command to display invalid negotiated fare user access table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNBI command to display invalid parameters")
    public void iEnterPNBICommandToDisplayInvalidParameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBI command to display invalid parameters");
            isharesPage3.enterPNBICommand(logInfo);
            logInfo.pass("I enter PNBI command to display invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR command to display OA Class table")
    public void iEnterKRcommandtodisplayOAclasstable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR command to display OA Class table");
            isharesPage3.enterKRCommand(logInfo);
            logInfo.pass("I enter KR command to display OA Class table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter MV* command to display market value table")
    public void iEnterMVcommandtodisplaymarketvaluetable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV* command to display market value table");
            isharesPage3.enterMVCommand(logInfo);
            logInfo.pass("I enter MV* command to display market value table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q* command to display Control Table")
    public void iEnterQCommandToDisplayControlTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q* command to display Control Table");
            isharesPage3.enterQCommandToDisplayControlTable(logInfo);
            logInfo.pass("I enter Q* command to display Control Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Indicate Overages_Shortages in TSSR - Cash Shortages")
    public void I_enter_Run_the_Indicate_Overages_Shortages_in_TSSR_Cash_Shortages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Indicate Overages_Shortages in TSSR - Cash Shortages");
            isharesPage3.indicateOverageShortagesInTSSRCashShortages(logInfo);
            logInfo.pass("I enter Run the Indicate Overages_Shortages in TSSR - Cash Shortages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run ETKT Connect Check-In Name Initial Selection")
    public void I_enter_run_ETKT_connect_check_In_Name_Initial_Selection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run ETKT Connect Check-In Name Initial Selection");
            isharesPage3.connectCheckInNameIntitialSelection(logInfo);
            logInfo.pass("I enter Run ETKT Connect Check-In Name Initial Selection");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FS5899 display a selected type code")
    public void I_enter_FS5899_display_a_selected_type_code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS5899 display a selected type code");
            isharesPage3.fs5899DisplayASelectedTypeCode(logInfo);
            logInfo.pass("I enter FS5899 display a selected type code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Delete an Equipment Type Code SHARES entries")
    public void I_enter_run_delete_an_equipment_type_code_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Delete an Equipment Type Code SHARES entries");
            isharesPage3.deleteAnEquipmentTypeCodeSharesEntries(logInfo);
            logInfo.pass("I enter Run Delete an Equipment Type Code SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FS5899 Run Delete an Equipment Type Code Shares entries")
    public void I_enter_fs5899_run_delete_an_equipment_type_code_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS5899 Run Delete an Equipment Type Code Shares entries");
            isharesPage3.fs5899deleteAnEquipmentTypeCodeSharesEntries(logInfo);
            logInfo.pass("I enter FS5899 Run Delete an Equipment Type Code Shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FS5899 Table modified will be displayed")
    public void I_enter_fs5899_table_modified_will_be_displayed() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS5899 Table modified will be displayed");
            isharesPage3.fs5899TableModifiedWillBeDisplayed(logInfo);
            logInfo.pass("I enter FS5899 Table modified will be displayed");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Generating Reports For Host Stock Control SHARES entries")
    public void I_enter_run_the_generating_reports_for_host_stock_control_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Generating Reports For Host Stock Control SHARES entries");
            isharesPage3.generatingReportsForHostStockControlSharesEntries(logInfo);
            logInfo.pass("I enter Run the Generating Reports For Host Stock Control SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter run the FS61 display third party translator")
    public void I_enter_run_the_FS61_display_third_party_translator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter run the FS61 display third party translator");
            isharesPage3.runTheFS61DsiplayThirdPartyTranslator(logInfo);
            logInfo.pass("I enter run the FS61 display third party translator");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the TPT Display Entry With Specific Flight Number")
    public void I_enter_run_the_TPT_display_entry_with_specific_flight_number() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the TPT Display Entry With Specific Flight Number");
            isharesPage3.theTPTDsiplayEntryWithSpecificFlightNumber(logInfo);
            logInfo.pass("I enter Run the TPT Display Entry With Specific Flight Number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the TPT Select Display Entry Third Party SHARES")
    public void I_enter_run_the_TPT_select_display_entry_third_party_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the TPT Select Display Entry Third Party SHARES");
            isharesPage3.theTPTSelectDisplayEntryThirdPartyShares(logInfo);
            logInfo.pass("I enter Run the TPT Select Display Entry Third Party SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FS6108 Run the Display CCT SHARES entries")
    public void I_enter_FS6108_run_the_display_cct_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS6108 Run the Display CCT SHARES entries");
            isharesPage3.theFS6108TPTDisplayCCTSharesEntries(logInfo);
            logInfo.pass("I enter FS6108 Run the Display CCT SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Abort Table Modifications SHARES entries")
    public void I_enter_run_the_abort_table_modification_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Abort Table Modifications SHARES entries");
            isharesPage3.abortTableModificationSharesEntries(logInfo);
            logInfo.pass("I enter Run the Abort Table Modifications SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FS6107 TPT add entry shares")
    public void I_enter_FS6107_tpt_add_entry_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS6107 TPT add entry shares");
            isharesPage3.f6107TPTAddEntryShares(logInfo);
            logInfo.pass("I enter FS6107 TPT add entry shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR command to perform Operational Services Functions")
    public void iEnterKRCommandToPerformOperationalServicesFunctions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR command to perform Operational Services Functions");
            isharesPage3.enterKRCommandToPerformOperationalServicesFunctions(logInfo);
            logInfo.pass("I enter KR command to perform Operational Services Functions");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PICS*|SK command to display CODE SHARE CITY or FLIGHT TABLE")
    public void iEnterPICSSKCommandToDisplayCODESHARECITYOrFLIGHTTABLE() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PICS*|SK command to display CODE SHARE CITY or FLIGHT TABLE");
            isharesPage3.toDisplayCodeShareOrFlightTable(logInfo);
            logInfo.pass("I enter PICS*|SK command to display CODE SHARE CITY or FLIGHT TABLE");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter PAL_ command to display Append Action_Advisory Messages")
    public void iEnterPAL_CommandToDisplayAppendAction_AdvisoryMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAL_ command to display Append Action_Advisory Messages");
            isharesPage3.toDisplayAppendAction_AdvisoryMessages(logInfo);
            logInfo.pass("I enter PAL_ command to display Append Action_Advisory Messages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter KM*L command to display Outbound step down levels in Special AVS Subscriber record")
    public void iEnterKMLCommandToDisplayOutboundStepDownLevelsInSpecialAVSSubscriberRecord() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KM*L command to display Outbound step down levels in Special AVS Subscriber record");
            isharesPage3.toDisplayOutboundStepDownLevelsInSpecialAVSSubscriberRecord(logInfo);
            logInfo.pass("I enter KM*L command to display Outbound step down levels in Special AVS Subscriber record");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter MKD_D*WA command to display City Pair Record with Agreement Carriers")
    public void iEnterMKD_DWACommandToDisplayCityPairRecordWithAgreementCarriers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKD_D*WA command to display City Pair Record with Agreement Carriers");
            isharesPage3.toDisplayCityPairRecordWithAgreementCarriers(logInfo);
            logInfo.pass("I enter MKD_D*WA command to display City Pair Record with Agreement Carriers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADX*_ command to display Flight Exception Table")
    public void iEnterPADX_CommandToDisplayFlightExceptionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADX*_ command to display Flight Exception Table");
            isharesPage3.toDisplayFlightExceptionTable(logInfo);
            logInfo.pass("I enter PADX*_ command to display Flight Exception Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter RLD_ command to display Res-Set Table")
    public void iEnterRLD_CommandToDisplayResSetTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter RLD_ command to display Res-Set Table");
            isharesPage3.toDisplayDisplayResSetTable(logInfo);
            logInfo.pass("I enter RLD_ command to display Res-Set Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter PAO* Run the table display shares")
    public void ienterPAOrunTheTableDisplayShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAO* Run the table display shares");
            isharesPage3.enterPAORunTheTableDisplayShares(logInfo);
            logInfo.pass("I enter PAO* Run the table display shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter modify Interline Agreement Table {string}")
    public void I_enter_modify_interline_Agreement_table(String ItemNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter modify Interline Agreement Table");
            isharesPage3.modifyInterlineAgreementTable(logInfo, ItemNumber);
            logInfo.pass("I enter modify Interline Agreement Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADA* Run the Attribute Table Display")
    public void I_enter_PADA_run_the_attribute_table_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADA* Run the Attribute Table Displays");
            isharesPage3.enterPADARunTheAttributeTableDisplay(logInfo);
            logInfo.pass("I enter PADA* Run the Attribute Table Displays");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MCT_ command to verify invalid response for MCT record")
    public void iEnterMCT_CommandToVerifyInvalidResponseForMCTRecord() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MCT_ command to verify invalid response for MCT record");
            isharesPage3.toVerifyInvalidResponseForMCTRecord(logInfo);
            logInfo.pass("I enter MCT_ command to verify invalid response for MCT record");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command KT_ command to verify invalid response for TTY RO table")
    public void iEnterCommandKT_CommandToVerifyInvalidResponseForTTYROTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command KT_ command to verify invalid response for TTY RO table");
            isharesPage3.toVerifyInvalidResponseForTTYROTable(logInfo);
            logInfo.pass("I enter command KT_ command to verify invalid response for TTY RO table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter K-T-FLBK-HIS_ command to display the fallback history record of updates in Scratch Pad")
    public void iEnterKTFLBKHISCommandToDisplayTheFallbackHistoryRecordOfUpdatesInScratchPad() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-FLBK-HIS_ command to display the fallback history record of updates in Scratch Pad");
            isharesPage3.toDisplayTheFallbackHistoryRecordOfUpdatesInScratchPad(logInfo);
            logInfo.pass("I enter K-T-FLBK-HIS_ command to display the fallback history record of updates in Scratch Pad");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter K-T-CLEAR-SPAD command to verify Clear Scratch Pad and LnIaTa Updating in SHARES entries")
    public void iEnterKTCLEARSPADCommandToVerifyClearScratchPadAndLnIaTaUpdatingInSHARESEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-CLEAR-SPAD command to verify Clear Scratch Pad and LnIaTa Updating in SHARES entries");
            isharesPage3.toVerifyClearScratchPadAndLnIaTaUpdating(logInfo);
            logInfo.pass("I enter K-T-CLEAR-SPAD command to verify Clear Scratch Pad and LnIaTa Updating in SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-OVERLAY command to verify the Overlay Scratch Pad to Prime PCH Table and Update PCH History")
    public void iEnterKTOVERLAYCommandToVerifyTheOverlayScratchPadToPrimePCHTableAndUpdatePCHHistory() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-OVERLAY command to verify the Overlay Scratch Pad to Prime PCH Table and Update PCH History");
            isharesPage3.toVerifyTheOverlayScratchPadToPrimePCHTable(logInfo);
            logInfo.pass("I enter K-T-OVERLAY command to verify the Overlay Scratch Pad to Prime PCH Table and Update PCH History");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FS6101 run the flight exception table")
    public void I_enter_FS6101_run_the_flight_exception_table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS6101 run the flight exception table");
            isharesPage3.fs6101RunTheFlightExceptionTable(logInfo);
            logInfo.pass("I enter FS6101 run the flight exception table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter fs3003 Run Display by Specific Flight Number entries")
    public void I_enter_fs3003_run_display_by_specific_flight_number_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter fs3003 Run Display by Specific Flight Number entries");
            isharesPage3.fs3003RunDisplayBySpecificFlightNumberEntries(logInfo);
            logInfo.pass("I enter fs3003 Run Display by Specific Flight Number entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FS6101 Run Flight Exception Table Maintenance SHARES")
    public void I_enter_fs6101_Run_flight_exception_table_maintenance_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS6101 Run Flight Exception Table Maintenance SHARES");
            isharesPage3.fs6101RunFlightExceptionTableMaintenance(logInfo);
            logInfo.pass("I enter FS6101 Run Flight Exception Table Maintenance SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Errors_Advisory Messages in APIS Function entries")
    public void I_enter_run_error_advisory_messages_in_apis_function_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Errors_Advisory Messages in APIS Function entries");
            isharesPage3.errorAdvisoryMessagesInAPISFunctionEntries(logInfo);
            logInfo.pass("I enter Run Errors_Advisory Messages in APIS Function entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run PNR SYNC Option Table Display SHARES {string}")
    public void I_enter_run_PNR_sync_option_Table_display_shares(String CarrierCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run PNR SYNC Option Table Display SHARES");
            isharesPage3.runPNRSYNCOptionTableDisplayShares(logInfo, CarrierCode);
            logInfo.pass("I enter Run PNR SYNC Option Table Display SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the TCI Table Section Indicator SHARES entries")
    public void enter_command_to_run_TCI_Table_Section_Indicator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the TCI Table Section Indicator SHARES entries");
            isharesPage3.command_to_run_TCI_Table_Section_Indicator(logInfo);
            logInfo.pass("I enter command to run the TCI Table Section Indicator SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Restrict TCI By Connection City")
    public void enter_command_Restrict_TCI_By_Connection_City() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Restrict TCI By Connection City");
            isharesPage3.command_Restrict_TCI_By_Connection_City(logInfo);
            logInfo.pass("I enter command to run Restrict TCI By Connection City");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run statistics record")
    public void enter_command_to_run_Statistics_Record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run statistics record");
            isharesPage3.command_to_run_Statistics_Record(logInfo);
            logInfo.pass("I enter command to run statistics record");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the SSR code {string} table shares entries")
    public void enter_command_to_run_the_SSR_code(String ssr) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the SSR code " + ssr + " table shares entries");
            isharesPage3.command_to_run_the_SSR_code(logInfo, ssr);
            logInfo.pass("I enter command to run the SSR code " + ssr + " table shares entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Add an Equipment Type Code SHARES entries")
    public void enter_command_to_run_Add_an_Equipment_Type_Code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Add an Equipment Type Code SHARES entries");
            isharesPage3.command_to_run_Add_an_Equipment_Type_Code(logInfo);
            logInfo.pass("I enter command to run the Add an Equipment Type Code SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Delete an Equipment Type Code SHARES entries")
    public void enter_command_to_delete_an_Equipment_Type_Code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Delete an Equipment Type Code SHARES entries");
            isharesPage3.command_to_delete_an_Equipment_Type_Code(logInfo);
            logInfo.pass("I enter command to run the Delete an Equipment Type Code SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the change an Equipment Type Code SHARES entries")
    public void enter_command_to_modify_an_Equipment_Type_Code() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the change an Equipment Type Code SHARES entries");
            isharesPage3.command_to_modify_an_Equipment_Type_Code(logInfo);
            logInfo.pass("I enter command to run the change an Equipment Type Code SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display addition modification and Deletion Entries with {string}")
    public void enter_command_to_display__addition_modification_deletion_entries(String segno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display Append Action_Advisory Messages");
            isharesPage3.command_to_display_addition_modification_deletion_entries(logInfo, segno);
            logInfo.pass("I enter command to display Append Action_Advisory Messages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the command to Display Customer Option SHARES entries")
    public void enter_command_DisplayCustomerOptionSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the command to Display Customer Option SHARES entries");
            isharesPage3.entercommand_DisplayCustomerOptionSHARES(logInfo);
            logInfo.pass("I run the command to Display Customer Option SHARES entries");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the command Run to Display Sorted Restriction Table")
    public void enter_command_DisplaySortedRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the command Run to Display Sorted Restriction Table");
            isharesPage3.entercommand_DisplaySortedRestrictionTable(logInfo);
            logInfo.pass("I run the command Run to Display Sorted Restriction Table");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the command to Display the System Default Elite Percentage")
    public void enter_command_DisplaySystemDefaultElite() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the command to Display the System Default Elite Percentage");
            isharesPage3.entercommand_DisplaySystemDefaultElite(logInfo);
            logInfo.pass("I run the command to Display the System Default Elite Percentage");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I Run the Modify Customer OptionsDefault ASA or ABP Booking Periods")
    public void enter_command_ModifyCustomerOptionsASA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Run the Modify Customer Options/Default ASA or ABP Booking Periods");
            isharesPage3.entercommand_ModifyCustomerOptionsASA(logInfo);
            logInfo.pass("I Run the Modify Customer Options/Default ASA or ABP Booking Periods");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the command to AddModify Cut Off Time")
    public void enter_command_AddModifyCutOffTime() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the command to AddModify Cut Off Time");
            isharesPage3.entercommand_AddModifyCutOffTime(logInfo);
            logInfo.pass("I run the command to AddModify Cut Off Time");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the command to Display Specific Category SHARES")
    public void enter_command_DisplaySpecificCategorySHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the command to Display Specific Category SHARES");
            isharesPage3.entercommand_DisplaySpecificCategorySHARES(logInfo);
            logInfo.pass("I run the command to Display Specific Category SHARES");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KF* to Displaying the Flight Control Table entries")
    public void enter_command_DisplayFlightControlTableentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KF* to Displaying the Flight Control Table entries");
            isharesPage3.entercommand_DisplayFlightControlTableentries(logInfo, "");
            logInfo.pass("I enter KF* to Displaying the Flight Control Table entries");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Adding a Control Point entries for {string}")
    public void enter_command_AddingaControlPointentries(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Adding a Control Point entries");
            isharesPage3.entercommand_AddingaControlPointentries(logInfo, flight);
            logInfo.pass("I enter command to Adding a Control Point entries");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNBIA_ command to add an item {string} and store by IATA number {string} in the travel agency restriction table")
    public void iEnterPNBIA_CommandToAddAnItemAndStoreByIATANumberInTheTravelAgencyRestrictionTable(String entry, String IATANo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBIA_ command to add an item " + entry + " and store by IATA number " + IATANo + " in the travel agency restriction table");
            isharesPage3.enterIATAAndStoreByCRS(logInfo, IATANo, entry);
            logInfo.pass("I enter PNBIA_ command to add an item " + entry + " and store by IATA number " + IATANo + " in the travel agency restriction table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QM_ command to display the items in the queue for city {string}")
    public void iEnterQM_CommandToDisplayTheItemsInTheQueueForCity(String cityCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QM_ command to display the items in the queue");
            isharesPage3.displayItemsInTheQueue(logInfo, cityCode);
            logInfo.pass("I enter QM_ command to display the items in the queue");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN*S A command to display items on the inventory ready to process index list")
    public void iEnterKNSACommandToDisplayItemsOnTheInventoryReadyToProcessIndexList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN*S A command to display items on the inventory ready to process index list");
            isharesPage3.displayItemsOnTheinventoryReadyToProcessIndexList(logInfo);
            logInfo.pass("I enter KN*S A command to display items on the inventory ready to process index list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2CS*_ command to display specific flight numbers in table")
    public void iEnterCS_CommandToDisplaySpecificFlightNumbersInTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2CS*_ command to display specific flight numbers in table");
            isharesPage3.displaySpecificFlightNumbersInTable(logInfo);
            logInfo.pass("I enter 2CS*_ command to display specific flight numbers in table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the booking compartment profile table entries")
    public void iRunTheBookingCompartmentProfileTableEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the booking compartment profile table entries");
            isharesPage3.enterCommandKJandTCRToShowBookingCompartmentProfileTable(logInfo);
            logInfo.pass("I run the booking compartment profile table entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KT_SV_ commands to display Service Designator Table")
    public void iEnterKT_SV_CommandToDisplayServiceDesignatorTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT/SV/_ commands to display Service Designator Table");
            isharesPage3.enterKT_SV_CommandToDisplayServiceDesignatorTable(logInfo);
            logInfo.pass("I enter KT/SV/_ commands to display Service Designator Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV $_ command to display all of the VLA items in the MVA table")
    public void iEnterMV$_CommandToDisplayAllOfTheVLAItemsInTheMVATable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV $_ command to display all of the VLA items in the MVA table");
            isharesPage3.enterMV$toDisplayAllVLAItems(logInfo);
            logInfo.pass("I enter MV $_ command to display all of the VLA items in the MVA table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV $ A_ command to add VLA items to the table")
    public void iEnterMV$A_CommandToAddVLAItemsToTheTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV $ A_ command to add VLA items to the table");
            isharesPage3.enterMV$AtoAddVLAItems(logInfo);
            logInfo.pass("I enter MV $ A_ command to add VLA items to the table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV$CB_ command to change an added item in the table")
    public void iEnterMV$CB_CommandToChangeAnAddedItemInTheTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV$CB_ command to change an added item in the table");
            isharesPage3.enterMV$CB_commandToChangeAnAddedItemInTheTable(logInfo);
            logInfo.pass("I enter MV$CB_ command to change an added item in the table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV$X_ command to delete an item in the table")
    public void iEnterMV$X_CommandToDeleteAnItemInTheTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV$X_ command to delete an item in the table");
            isharesPage3.enterMV$X_Command_To_DeleteAnItemInTheTable(logInfo);
            logInfo.pass("I enter MV$X_ command to delete an item in the table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV N A_ command to add a source item to the table")
    public void iEnterMVNA_CommandToAddASourceItemToTheTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV N A_ command to add a source item to the table");
            isharesPage3.enterMVNA_commandToAddSourceItemToTheTable(logInfo);
            logInfo.pass("I enter MV N A_ command to add a source item to the table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MVN C_ command to add a country code to the table at index {string}")
    public void iEnterMVNC_CommandToAddACountryCodeToTheTableAtIndex(String indexNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MVN C_ command to add a country code to the table");
            isharesPage3.enterMVNC_CommandToAddCountryCodeToTheTableAtIndex(logInfo, indexNumber);
            logInfo.pass("I enter MVN C_ command to add a country code to the table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV X_ command to delete a source item from the table")
    public void iEnterMVX_CommandToDeleteASourceItemFromTheTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV X_ command to delete a source item from the table");
            isharesPage3.enterMVXCommandToDeleteSourceItemFromTheTable(logInfo);
            logInfo.pass("I enter MV X_ command to delete a source item from the table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9_ command to add phone details with {string} city code")
    public void iEnter_CommandToAddPhoneDetailsWithCityCode(String cityCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9_ command to add phone details");
            isharesPage3.enter9CommandToAddPhoneDetailsWithSpecificCityCode(logInfo, cityCode);
            logInfo.pass("I enter 9_ command to add phone details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter VIX_ command to display the classes of a flight and choose a class so as to waitlist the passenger")
    public void iEnterVIX_CommandToDisplayTheClassesOfAFlightAndChooseAClassSoAsToWaitlistThePassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIX_ command to display the classes of a flight and choose a class so as to waitlist the passenger");
            isharesPage3.chooseAClassSoAsToMakeAPassengerWaitlisted(logInfo);
            logInfo.pass("I enter VIX_ command to display the classes of a flight and choose a class so as to waitlist the passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*LINK command to display partner control table")
    public void iEnterQLINKCommandToDisplayPartnerControlTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q* command to display Control Table");
            isharesPage3.checkingTheCarrierInPartnerCtrlTable(logInfo);
            logInfo.pass("I enter Q* command to display Control Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter COHOST TABLE SHARES entry for carrier code {string}")
    public void iEnterCOHOSTTABLESHARESEntryForCarrierCode(String CarrierCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter COHOST TABLE SHARES entry for carrier code " + CarrierCode);
            isharesPage3.enterCOHOSTTABLESHARESEntryForCarrierCode(logInfo, CarrierCode);
            logInfo.pass("I enter COHOST TABLE SHARES entry for carrier code " + CarrierCode);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter invalid TTY message to generate pnr with SSR {string}")
    public void iEnterInvalidTTYMessageToGeneratePnrForSystemWithSSR(String SSRType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid TTY message to generate basic airline segment");
            isharesPage3.invalidTTYMessage(logInfo, SSRType);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I display primary and secondary queue after creating pnr")
    public void iDisplayPrimaryAndSecondaryQueueAfterCreatingPnr() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display primary and secondary queue after creating pnr");
            isharesPage3.displayPrimaruSecondaryQueueAfterCreatingPnr(logInfo);
            logInfo.pass("I display primary and secondary queue after creating pnr");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAV commands to Add CCT Item")
    public void iEnterPAVCommandsToAddCCTItem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAV commands to Add CCT Item");
            isharesPage3.enterPAVCommandsToAddCCTItem(logInfo);
            logInfo.pass("I enter PAV commands to Add CCT Item");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIFMA command")
    public void iEnterPIFMACommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAV commands to Add CCT Item");
            isharesPage3.enterPIFMACommand(logInfo);
            logInfo.pass("I enter PAV commands to Add CCT Item");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter PIFM command to display the IATA PNL Flight info {string}")
    public void iEnterPIFMCommandToDisplayTheIATAPNLFlightInfo(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIFM command to display the IATA PNL Flight info ");
            isharesPage3.enterPIFMCommandToDisplayTheIATAPNLFlightInfo(logInfo, Entry);
            logInfo.pass("I enter PIFM command to display the IATA PNL Flight info ");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set flight number to {string} for Segment {string}")
    public void iSetFlightNumberToForSegment(String FlightNumber, String FlightIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set flight number to " + FlightNumber);
            isharesPage3.setFlightNumber(FlightNumber, FlightIndex);
            logInfo.pass("I set flight number to " + FlightNumber);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I open the flight for married segment")
    public void iOpenTheFlightForMarriedSegment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open the flight for married segment");
            isharesPage3.openFlightMarriedSegments(logInfo);
            logInfo.pass("I open the flight for married segment");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I assign a shipment of different equipment for married segments and verify {string} of pending ship assignment")
    public void I_assign_a_shipment_of_different_equipment_and_verify_of_pending_ship_assignment_entries(String status) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I assign a shipment of different equipment and verify");

            isharesPage3.assignShipmentOfDifferentEquipmentForMarriedSegment(logInfo, status);
            logInfo.pass("I assign a shipment of different equipment and verify");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ER command to validate name space error")
    public void iEnterERCommandToValidateNameSpaceError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ER command to validate name space error");

            isharesPage3.enterERCommandToValidateNameSpaceError(logInfo);
            logInfo.pass("I enter ER command to validate name space error");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-STATS_ET command to display Airline combination message function")
    public void iEnterTSTATSETCommandToDisplayAirlineCombinationMessageFunction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-STATS_ET command to display Airline combination message function");

            isharesPage3.enterTSTATSETCommandToDisplayAirlineCombinationMessageFunction(logInfo);
            logInfo.pass("I enter T-STATS_ET command to display Airline combination message function");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-STATS_EXC command to display ticket and EDIFACT message counts for all the available message function codes for {string}")
    public void iEnterTSTATS_EXCCommandToDisplayTicketAndEDIFACTMessageCountsForAllTheAvailableMessageFunctionCodes(String CarrierCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-STATS_EXC command to display ticket and EDIFACT message counts for all the available message function codes");

            isharesPage3.enterTSTATS_EXCCommand(logInfo, CarrierCode);
            logInfo.pass("I enter T-STATS_EXC command to display ticket and EDIFACT message counts for all the available message function codes");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EB command to display ETKT passenger list for a flight")
    public void iEnterEBCommandToDisplayETKTPassengerListForAFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter *EB command to display ETKT passenger list for a flight");
            isharesPage3.ETKTDisplayForFlight(logInfo);
            logInfo.pass("I enter *EB command to display ETKT passenger list for a flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-ECA command add entry specifying SSR code Flight Range and Carrier code")
    public void iEnterKECACommandAddEntrySpecifyingSSRCodeFlightRangeAndCarrierCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("AND"), "I enter K-ECA command add entry specifying SSR code Flight Range and Carrier code");
            isharesPage3.enterKECACommand(logInfo);
            logInfo.pass("I enter K-ECA command add entry specifying SSR code Flight Range and Carrier code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Agent Set Request in Table Display SHARES entries in Transformed SHARES")
    public void IenterPAORuntheTableBuildandMaintenanceentriesinTranformedSHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Agent Set Request in Table Display SHARES entries in Transformed SHARES");
            isharesPage3.EnterRunAgentSetRequestinTableDisplayShares(logInfo);
            logInfo.pass("I enter Run Agent Set Request in Table Display SHARES entries in Transformed SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run COHOST Table Display SHARES entries in Transformed Shares")
    public void IenterRunCOHOSTTableDisplaySHARESentriesinTransformedShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run COHOST Table Display SHARES entries in Transformed Shares");
            isharesPage3.IenterRunCOHOSTTableDisplaySHARESentriesinTransformedShares(logInfo);
            logInfo.pass("I enter Run COHOST Table Display SHARES entries in Transformed Shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Full Table Display in APIS Function entries in Transformed Shares")
    public void IenterRunFullTableDisplayinAPISFunctionentriesinTransformedShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Full Table Display in APIS Function entries in Transformed Shares");
            isharesPage3.EnterRunFullTableDisplayinAPISFunctionentries(logInfo);
            logInfo.pass("I enter Run Full Table Display in APIS Function entries in Transformed Shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Bag tag Lead Digit Table SHARES entries in Transformed SHARES {string}")
    public void IenterRunBagtagLeadDigitTableSHARES(String itemNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAO Run the Table Build and Maintenance entries in Tranformed SHARES");
            isharesPage3.IenterRunBagtagLeadDigitTableSHARES(logInfo, itemNo);
            logInfo.pass("I enter PAO Run the Table Build and Maintenance entries in Tranformed SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to SDS Tools Page")
    public void i_navigate_to_sds_tools_page() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to SDS Tools Page");
            isharesPage3.navigateToSDSPage(logInfo);
            logInfo.pass("I navigate to SDS Tools Page");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate back to iShares Page")
    public void I_navigate_back_to_iShares_Page() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate back to iShares Page");
            isharesPage3.navigateBackToiSharesPage(logInfo);
            logInfo.pass("I navigate back to iShares Page");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on PNR 5 SDS button in SDS Tools Menu and enter details")
    public void I_click_on_PNR_5_SDS_button_in_SDS_Tools_Menu() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on PNR 5 SDS button in SDS Tools Menu and enter details");
            isharesPage3.enterPNRDetailsInPNR5SDSPage(logInfo);
            logInfo.pass("I click on PNR 5 SDS button in SDS Tools Menu and enter details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on Ticket Retrieval 6 SDS button in SDS Tools Menu and enter details")
    public void I_click_on_Ticket_Retrieval_6_SDS_button_in_SDS_Tools_Menu() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Ticket Retrieval 6 SDS button in SDS Tools Menu and enter details");
            isharesPage3.enterTicketDetailsInTicketRetrievalSDSPage(logInfo);
            logInfo.pass("I click on Ticket Retrieval 6 SDS button in SDS Tools Menu and enter details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run APIS Generation SHARES entries for flight {string}")
    public void enter_command_APISGenerationentries(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run APIS Generation SHARES entries");
            isharesPage3.displayAPISGenerationEntries(logInfo, flight);
            logInfo.pass("I run APIS Generation SHARES entries");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run the Mass Group Code")
    public void enter_command_toRunMassGroupCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run the Mass Group Code");
            isharesPage3.entercommand_toRunMassGroupCode(logInfo);
            logInfo.pass("I enter command to Run the Mass Group Code");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Replace a LSR Item")
    public void enter_command_toReplaceLSRItem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADR for semi permanent data Table");
            isharesPage3.entercommand_toReplaceLSRItem(logInfo);
            logInfo.pass("I enter PADR for semi permanent data Table");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Entry Format - Teletype Transfer for {string} from {string} to {string}")
    public void enter_command_EntryFormatTeletypeTransfer(String itemNum, String flight1, String flight2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Entry Format - Teletype Transfer");
            isharesPage3.entercommand_EntryFormatTeletypeTransfer(logInfo, itemNum, flight1, flight2);
            logInfo.pass("I enter command to Run Entry Format - Teletype Transfer");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I run K9 Request")
    public void enter_command_K9Request() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run K9 Request");
            isharesPage3.verifyK9Request(logInfo);
            logInfo.pass("I run K9 Request");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I run Add an item with timeframe")
    public void enter_command_Addanitemwithtimeframe() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run Add an item with timeframe");
            isharesPage3.entercommand_Addanitemwithtimeframe(logInfo);
            logInfo.pass("I run Add an item with timeframe");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KRVR command to Run RVR Request")
    public void enter_KRVR_RunRVRRequest() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KRVR command to Run RVR Request");
            isharesPage3.enterKRVR_RunRVRRequest(logInfo);
            logInfo.pass("I enter KRVR command to Run RVR Request");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KUT command to Run Teletype Automatic Processing Options")
    public void enter_KUT_RunTeletypeAutomaticProcessingOptions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KUT command to Run Teletype Automatic Processing Options");
            isharesPage3.enterKUT_RunTeletypeAutomaticProcessingOptions(logInfo);
            logInfo.pass("I enter KUT command to Run Teletype Automatic Processing Options");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KMS command to Set the Batching Target in the S-AVS Batching Record")
    public void enter_KMS_SettheBatchingTarget() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KMS command to Set the Batching Target in the S-AVS Batching Record");
            isharesPage3.enterKMS_SettheBatchingTarget(logInfo);
            logInfo.pass("I enter KMS command to Set the Batching Target in the S-AVS Batching Record");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KUR command to Run Teletype Reject Statistics Table")
    public void enter_KUR_RunTeletypeRejectStatisticsTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KUR command to Run Teletype Reject Statistics Table");
            isharesPage3.enterKUR_RunTeletypeRejectStatisticsTable(logInfo);
            logInfo.pass("I enter KUR command to Run Teletype Reject Statistics Table");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KBA command to Run With No Date Range entries")
    public void enter_KBA_RunWithNoDateRangeentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KBA command to Run With No Date Range entries");
            isharesPage3.enterKBA_RunWithNoDateRangeentries(logInfo);
            logInfo.pass("I enter KBA command to Run With No Date Range entries");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KFC command for Changing a Control Point entries")
    public void enter_KFC_ChangingControlPointentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KFC command for Changing a Control Point entries");
            isharesPage3.enterKFC_ChangingControlPointentries(logInfo);
            logInfo.pass("I enter KFC command for Changing a Control Point entries");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAHK command to Display cabin text table")
    public void enter_PAHK_Displaycabintexttable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAHK command to Display cabin text table");
            isharesPage3.enterPAHK_Displaycabintexttable(logInfo);
            logInfo.pass("I enter PAHK command to Display cabin text table");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I initialize the city code table")
    public void iInitializeTheCityCodeTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I initialize the city code table");
            isharesPage3.initializeTheCityCodeTable(logInfo);
            logInfo.pass("I initialize the city code table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add {string} to the city code table")
    public void iAddCityToTheCityCodeTable(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add city to the city code table");
            isharesPage3.addCityCodeToTable(logInfo, city);
            logInfo.pass("I add city to the city code table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I display all the city and validate {string} is present")
    public void iDisplayAllTheCityAndValidateResponse(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display cities and validate response");
            isharesPage3.displayCityTableAndValidateResponse(logInfo, city);
            logInfo.pass("I display cities and validate response");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I finalize the table modifications and validate response")
    public void iFinalizeTheTableModificationsAndValidateResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I finalize the table modifications and validate response");
            isharesPage3.finalizeTableModificationAndValidate(logInfo);
            logInfo.pass("I finalize the table modifications and validate response");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run PASSENGER TYPE M-TABLE SHARES entries")
    public void enter_command_Passenger_Type_Code_M_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run PASSENGER TYPE M-TABLE SHARES entries");
            isharesPage3.command_Passenger_Type_Code_M_Table(logInfo);
            logInfo.pass("I enter command to run PASSENGER TYPE M-TABLE SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run for PASSENGER TYPE {string} M-TABLE SHARES entries")
    public void enter_command_Passenger_Type_ACC_Code_M_Table(String passType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run for PASSENGER TYPE " + passType + "  M-TABLE SHARES entries");
            isharesPage3.command_Passenger_Type_ACC_Code_M_Table(logInfo, passType);
            logInfo.pass("I enter command to run for PASSENGER TYPE " + passType + "  M-TABLE SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run add PASSENGER TYPE {string} M-TABLE SHARES entries")
    public void enter_command_ADD_Passenger_Type_Code_M_Table(String passType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run add PASSENGER TYPE " + passType + "  M-TABLE SHARES entries");
            isharesPage3.command_ADD_Passenger_Type_Code_M_Table(logInfo, passType);
            logInfo.pass("I enter command to run add PASSENGER TYPE " + passType + "  M-TABLE SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run delete PASSENGER TYPE {string} M-TABLE SHARES entries")
    public void enter_command_DEL_Passenger_Type_Code_M_Table(String passType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run delete PASSENGER TYPE " + passType + "  M-TABLE SHARES entries");
            isharesPage3.command_DEL_Passenger_Type_Code_M_Table(logInfo, passType);
            logInfo.pass("I enter command to run delete PASSENGER TYPE " + passType + "  M-TABLE SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run change PASSENGER TYPE {string} M-TABLE SHARES entries")
    public void enter_command_Run_Change_Passenger_Type_Code_M_Table(String passType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run change PASSENGER TYPE " + passType + "  M-TABLE SHARES entries");
            isharesPage3.command_Run_Change_Passenger_Type_Code_M_Table(logInfo, passType);
            logInfo.pass("I enter command to run change PASSENGER TYPE " + passType + "  M-TABLE SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run to modify standby Priority Table")
    public void enter_command_to_run_to_modify_standby_Priority_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run to modify standby Priority Table");
            isharesPage3.command_to_run_to_modify_standby_Priority_Table(logInfo);
            logInfo.pass("I enter command to run to modify standby Priority Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run City_Market Restriction Table SHARES")
    public void enter_command_to_run_City_Market_Restriction_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run City/Market Restriction Table SHARES");
            isharesPage3.command_to_run_City_Market_Restriction_Table(logInfo);
            logInfo.pass("I enter command to run City/Market Restriction Table SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Initialize_Finalize_Cancel Restriction Table Modifications")
    public void enter_command_to_run_Initialize_Finalize_Cancel_Restriction_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Initialize_Finalize_Cancel Restriction Table Modifications");
            isharesPage3.command_to_run_Initialize_Finalize_Cancel_Restriction_Table(logInfo);
            logInfo.pass("I enter command to run Initialize_Finalize_Cancel Restriction Table Modifications");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-BF command to display advice message for No-Smoke message")
    public void iEnter6BFCommandToDisplayAdviceMessageForNoSmokeMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-BF command to display advice message for No-Smoke message");
            isharesPage3.enter6BFCommand(logInfo);
            logInfo.pass("I enter 6-BF command to display advice message for No-Smoke message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CEN_ command to decode the flight")
    public void iEnterCEN_CommandToDecodeTheFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CEN_ command to decode the flight");
            isharesPage3.ToDecodeTheFlight(logInfo);
            logInfo.pass("I enter CEN_ command to decode the flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LGN command to display PNR Passenger name list")
    public void iEnterLGNCommandToDisplayPNRPassengerNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LGN command to display PNR Passenger name list");
            isharesPage3.enterLGNCommand(logInfo);
            logInfo.pass("I enter LGN command to display PNR Passenger name list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LGA command to display passenger name list with AUX Segments")
    public void iEnterLGACommandToDisplayPassengerNameListWithAUXSegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LGA command to display passenger name list with AUX Segments");
            isharesPage3.ToDisplayPassengerNameListWithAUXSegments(logInfo);
            logInfo.pass("I enter LGA command to display passenger name list with AUX Segments");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *S_ command to display advance seat selection")
    public void iEnterS_CommandToDisplayAdvanceSeatSelection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *S_ command to display advance seat selection");
            isharesPage3.toDisplayAdvanceSeatSelection(logInfo);
            logInfo.pass("I enter *S_ command to display advance seat selection");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *S_ command to display advance seat selection with segment{string}")
    public void iEnterS_CommandToDisplayAdvanceSeatSelectionWithSegment(String Segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *S_ command to display advance seat selection with segment{string}");
            isharesPage3.toDisplayAdvanceSeatSelectionwithSegment(logInfo, Segment);
            logInfo.pass("I enter *S_ command to display advance seat selection with segment{string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A_ command to cancel advanced seats for all passengers in the PNR starting at the segment{string} specified")
    public void iEnterA_CommandToCancelAdvancedSeatsForAllPassengersInThePNRStartingAtTheSegmentSpecified(String Segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_ command to cancel advanced seats for all passengers in the PNR starting at the segment{string} specified");
            isharesPage3.toCancelAdvancedSeatsfromSpecifedSegment(logInfo, Segment);
            logInfo.pass("I enter 6:A_ command to cancel advanced seats for all passengers in the PNR starting at the segment{string} specified");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A_ command to assign advanced seats for a particular segment {string}")
    public void iEnterA_CommandToAssignAdvancedSeatsForAParticularSegment(String Segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_ command to assign advanced seats for a particular segment {string}");
            isharesPage3.toAssignAdvancedSeatsForAParticularSegment(logInfo, Segment);
            logInfo.pass("I enter 6:A_ command to assign advanced seats for a particular segment {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-A_ command to assign the seats by name")
    public void iEnterA_CommandToAssignTheSeatsByName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-A_ command to assign the seats by name");
            isharesPage3.toAssignTheSeatsByName(logInfo);
            logInfo.pass("I enter 6-A_ command to assign the seats by name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-A_ command to display advance seat assignment for all HA segments")
    public void iEnterA_CommandToDisplayAdvanceSeatAssignmentForAllHASegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-A_ command to display advance seat assignment for all HA segments");
            isharesPage3.toDisplayAdvanceSeatAssignmentForAllHASegments(logInfo);
            logInfo.pass("I enter 6-A_ command to display advance seat assignment for all HA segments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAU command to Add or Modify Table Items of ACI Upgrade Class Table for {string}")
    public void i_enter_PAU_command_to_Add_or_Modify_Table_Items_of_ACI_Upgrade_Class_Table(String COS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAU command to Add or Modify Table Items of ACI Upgrade Class Table");
            isharesPage3.addOrModifyACIUpgradeTable(logInfo, COS);
            logInfo.pass("I enter PAU command to Add or Modify Table Items of ACI Upgrade Class Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAU command to Delete an Item of ACI Upgrade Class Table for {string}")
    public void i_enter_PAU_command_to_Delete_an_Item_of_ACI_Upgrade_Class_Table(String COS) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAU command to Delete an Item of ACI Upgrade Class Table for" + COS);
            isharesPage3.deleteACIUpgradeTable(logInfo, COS);
            logInfo.pass("I enter PAU command to Delete an Item of ACI Upgrade Class Table for" + COS);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAPA command to Add an Item of ASA or ACI Preferred Seating Table for {string}")
    public void i_enter_PAPA_command_to_Add_an_Item_of_ASA_ACI_Preferred_Seating_Table(String bookingCode) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAPA command to Add an Item of ASA or ACI Preferred Seating Table for" + bookingCode);
            isharesPage3.addAnItemToASAorACItable(logInfo, bookingCode);
            logInfo.pass("I enter PAPA command to Add an Item of ASA or ACI Preferred Seating Table for" + bookingCode);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAA* command to Display APIS table")
    public void i_enter_PAA_command_to_Display_APIS_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA* command to Display APIS table");
            isharesPage3.display_APIS_table(logInfo);
            logInfo.pass("I enter PAA* command to Display APIS table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAA*M command to Display APIS Market table")
    public void i_enter_PAA_M_command_to_Display_APIS_Market_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA*M command to Display APIS Market table");
            isharesPage3.display_APIS_Market_table(logInfo);
            logInfo.pass("I enter PAA*M command to Display APIS Market table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAA*M command to Display APIS Market table for {string}")
    public void i_enter_PAA_M_command_to_Display_APIS_Market_table_for(String agency) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA*M command to Display APIS Market table for " + agency);
            isharesPage3.displayAPISMarketTableForAgency(logInfo, agency);
            logInfo.pass("I enter PAA*M command to Display APIS Market table for " + agency);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAI command to Initialize APIS Market table")
    public void i_enter_PAAI_command_to_Initialize_APIS_Market_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAI command to Initialize APIS Market table");
            isharesPage3.initialize_APIS_Market_table(logInfo);
            logInfo.pass("I enter PAAI command to Initialize APIS Market table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAX command to Cancel APIS Market table")
    public void i_enter_PAAX_command_to_Cancel_APIS_Market_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAX command to Cancel APIS Market table");
            isharesPage3.cancel_APIS_Market_table(logInfo);
            logInfo.pass("I enter PAAX command to Cancel APIS Market table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAA command to Add item to APIS Market Table for {string} and {string}")
    public void i_enter_PAAA_command_to_Add_item_to_APIS_Market_table_for(String agency, String market) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAA command to Add item to APIS Market Table for " + agency + " and " + market);
            isharesPage3.addItemToAPISMarketTableForAgency(logInfo, agency, market);
            logInfo.pass("I enter PAAA command to Add item to APIS Market Table for " + agency + " and " + market);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAF command to Finalize APIS Market table")
    public void i_enter_PAAF_command_to_Finalize_APIS_Market_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAX command to Finalize APIS Market table");
            isharesPage3.finalize_APIS_Market_table(logInfo);
            logInfo.pass("I enter PAAF command to Finalize APIS Market table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MXA command to Add An Item to the Class Connection Exception Table for {string} and {string} and {string}")
    public void i_enter_MXA_command_to_Add_An_Item_to_the_Class_Connection_Exception_Table_for(String marketPair, String frequency, String relativeDateRange) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MXA command to Add An Item to the Class Connection Exception Table");
            isharesPage3.addItemToClassConnectionExceptionTable(logInfo, marketPair, frequency, relativeDateRange);
            logInfo.pass("I enter MXA command to Add An Item to the Class Connection Exception Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MCD command to display Record Usage")
    public void i_enter_MCD_command_to_display_Record_Usage() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MCD command to display Record Usage");
            isharesPage3.displayRecordUsage(logInfo);
            logInfo.pass("I enter MCD command to display Record Usage");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A- command to display previous flights in the availability")
    public void iEnterACommandToDisplayPreviousFlightsInTheAvailability() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A- command to display previous flights in the availability");
            isharesPage3.enter_A_ForPreviousFltAvailability(logInfo);
            logInfo.pass("I enter A- command to display previous flights in the availability");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*UGX1* command verify the appswitch {string} for the {string} entry")
    public void iEnterOCMUGXCommandVerifyTheAppswitchForTheEntry(String AppSwitch, String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*UGX1* command verify the appswitch");
            isharesPage3.enterOCMUGXCommand(logInfo, AppSwitch, Entry);
            logInfo.pass("I enter OCM*UGX1* command verify the appswitch");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*RESTRICT command to perfrom restriction Table for Specified Carrier {string}")
    public void iEnterTETRESTRICTCommandToPerfromRestrictionTableForSpecifiedCarrier(String CarrierCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*RESTRICT command to perfrom restriction Table for Specified Carrier");
            isharesPage3.enterTETRESTRICTCommand(logInfo, CarrierCode);
            logInfo.pass("I enter T-ET*RESTRICT command to perfrom restriction Table for Specified Carrier");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A command to assign particular seat {string}")
    public void iEnterACommandToAssignParticularSeat(String TotalPax) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A command to assign particular seat ");
            isharesPage3.ASAWithSeat(logInfo, TotalPax);
            logInfo.pass("I enter 6:A command to assign particular seat ");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QM_FCF#LAST command to TTY should be rejected with INV Notification CD message")
    public void iEnterQMFCFLASTCommandToTTYShouldBeRejectedWithINVNotificationCDMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QM_FCF#LAST command to TTY should be rejected with INV Notification CD message");
            isharesPage3.enterQMFCFLASTCommand(logInfo);
            logInfo.pass("I enter QM_FCF#LAST command to TTY should be rejected with INV Notification CD message");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter invalid passenger name with single letter as fname and validate the error message")
    public void iEnterInvalidPassengerNameWithSingleLetterAsFnameAndValidateTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter invalid passenger name with single letter as fname and validate the error message");
            isharesPage3.enterInvalidPassengerName(logInfo);
            logInfo.pass("I enter invalid passenger name with single letter as fname and validate the error message");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CH_|SS command for Display Cabin Crew Report with SSR")
    public void iEnterCH_SMCommandForDisplayCabinCrewReportwithSSR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CH_|SM command for Displaying Cabin Crew report with SSR");
            isharesPage3.toDisplayCabinCrewReportWithSSR(logInfo);
            logInfo.pass("I enter 6:CH_|SS command for Displaying Cabin Crew report with SSR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KA command to display OA flight records")
    public void I_enter_KA_command_to_display_OA_flight_records() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KA command to display OA flight records");
            isharesPage3.DisplayOAFlightRecord(logInfo);
            logInfo.pass("I enter KA command to display OA flight records");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KDEI command to display update DEI information")
    public void iEnterKDEIAD_ToVerifyDEIItemNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KDEI command to display update DEI information");
            isharesPage3.EnterKDEICommand(logInfo);
            logInfo.pass("I enter KDEI command to display update DEI information");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MV* security entries {string}")
    public void I_enter_MV_security_entries(String ItemNumberFromList) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MV* security entries");
            isharesPage3.EnterMVCommand(logInfo, ItemNumberFromList);
            logInfo.pass("I enter MV* security entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PICS* command to Verify Y 4 NEW IATCI STATISTICS RECORD USER for {string}")
    public void iEnterPICSCommandToVerifyY4NEWIATCISTATISTICSRECORDUSER(String Airline) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PICS* command to Verify Y 4 NEW IATCI STATISTICS RECORD USER for {string}");
            isharesPage3.verifyNewIatciStatisticsRecordUser(logInfo, Airline);
            logInfo.pass("I enter PICS* command to Verify Y 4 NEW IATCI STATISTICS RECORD USER for {string}");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *AP command to display APIS details after deleting APIS for the pax {string}")
    public void I_enter_AP_Command_to_display_APIS_details_after_deleting_APIS_for_the_pax(String paxNo) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *AP command to display APIS details after deleting APIS for the pax " + paxNo);
            isharesPage3.displayApisAfterDeletingAPIS(logInfo, paxNo);
            logInfo.pass("I enter *AP command to display APIS details after deleting APIS for the pax " + paxNo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *S_ALL command to display seat assignment")
    public void I_enter_S_ALL_Command_to_display_seat_Assignment() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *S_ALL command to display seat assignment");
            isharesPage3.displaySeatAssignment(logInfo);
            logInfo.pass("I enter *S_ALL command to display seat assignment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change the name of the passenger in the index {string} to a different name after ASA")
    public void I_change_the_name_of_the_passenger_in_the_index_to_a_different_name_after_ASA(String index) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change the name of the passenger in the index " + index + " to a different name after ASA");
            isharesPage3.changeThePassengerNameAfterASA(logInfo, index);
            logInfo.pass("I change the name of the passenger in the index " + index + " to a different name after ASA");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAR_ command to display Printer Attribute Record Table")
    public void i_enter_PAR_command_to_display_Printer_Attribute_Record_Table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAR_ command to display Printer Attribute Record Table");
            isharesPage3.displayPrinterAttributeRecordTable(logInfo);
            logInfo.pass("I enter PAR_ command to display Printer Attribute Record Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAR_ command for Printer Record Table Maintenance")
    public void i_enter_PAR_command_for_Printer_Record_Table_Maintenance() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAR_ command for Printer Record Table Maintenance");
            isharesPage3.printerRecordTableMaintenance(logInfo);
            logInfo.pass("I enter PAR_ command for Printer Record Table Maintenance");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAR_ command to Delete entry in Printer Record Table")
    public void i_enter_PAR_command_to_Delete_entry_in_Printer_Record_Table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAR_ command to Delete entry in Printer Record Table");
            isharesPage3.DeleteAnEntryInPrinterRecordTable(logInfo);
            logInfo.pass("I enter PAR_ command to Delete entry in Printer Record Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KA command to Display List of All Schedules")
    public void i_enter_KA_command_to_Display_List_of_All_Schedules() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KA command to Display List of All Schedules with");
            isharesPage3.displayListOfAllSchedules(logInfo);
            logInfo.pass("I enter KA command to Display List of All Schedules");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter run the display entry with specific flight number")
    public void I_enter_run_the_display_entry_with_specific_flight_number() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run PNR SYNC Option Table Display SHARES");
            isharesPage3.runTheDisplayEntryWithSpecificFlightNumber(logInfo);
            logInfo.pass("I enter Run PNR SYNC Option Table Display SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Agent Set Requests SHARES entries")
    public void I_enter_run_agent_set_request_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Agent Set Requests SHARES entries");
            isharesPage3.runAgentSetRequestsSharesEntries(logInfo);
            logInfo.pass("I enter Run Agent Set Requests SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter fs3007 Run Delete Entry in Ticket Airline Name Table Maintenance")
    public void I_enter_fs3007_run_delete_entry_in_ticket_airline_name_table_maintenance() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter fs3007 Run Delete Entry in Ticket Airline Name Table Maintenance");
            isharesPage3.fs3007RunDeleteEntryInTicketAirlineName(logInfo);
            logInfo.pass("I enter fs3007 Run Delete Entry in Ticket Airline Name Table Maintenance");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Original Origin_Destination City SHARES entries")
    public void I_enter_run_the_original_origin_destination_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Original Origin_Destination City SHARES entries");
            isharesPage3.theOriginalOriginDestinationCitySharesEntries(logInfo);
            logInfo.pass("I enter Run the Original Origin_Destination City SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CO_ command to check the status of a flight")
    public void iEnterCO_CommandToCheckTheStatusOfAFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CO_ command to check the status of a flight");
            isharesPage3.enter6CO_toCheckStatusOfAFlight(logInfo);
            logInfo.pass("I enter 6:CO_ command to check the status of a flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CR_ command to restrict a flight")
    public void iEnterCR_CommandToRestrictAFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CR_ command to restrict a flight");
            isharesPage3.enter6CR_toRestrictAFlight(logInfo);
            logInfo.pass("I enter 6:CR_ command to restrict a flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LR_ command to create internal work list")
    public void iEnterLR_CommandToCreateInternalWorkList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LR_ command to create internal work list");
            isharesPage3.enter6LR_toCreateInternalWorkList(logInfo);
            logInfo.pass("I enter 6:LR_ command to create internal work list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-L* command to display unseated pax list")
    public void iEnterLCommandToDisplayUnseatedPaxList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-L* command to display unseated pax list");
            isharesPage3.enter6L_toDisplayUnseatedPaxList(logInfo);
            logInfo.pass("I enter 6-L* command to display unseated pax list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LK_ command to perform checkin of a specific sequence number")
    public void iEnterLK_CommandToPerformCheckinOfASpecificSequenceNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LK_ command to perform checkin of a specific sequence number");
            isharesPage3.enter6LK_toPerformCheckinOfASpecificSequenceNumber(logInfo);
            logInfo.pass("I enter 6:LK_ command to perform checkin of a specific sequence number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PR_INIT|SEQ command to initiate reconcile using sequence option")
    public void iEnterPR_INITSEQCommandToInitiateReconcileUsingSequenceOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR_INIT|SEQ command to initiate reconcile using sequence option");
            isharesPage3.enter6PR_toInitiateReconcileUsingSequenceOption(logInfo);
            logInfo.pass("I enter 6:PR_INIT|SEQ command to initiate reconcile using sequence option");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PR_*UNREC command to display passenger unreconcile name list")
    public void iEnterPR_UNRECCommandToDisplayPassengerUnreconcileNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR_*UNREC command to display passenger unreconcile name list");
            isharesPage3.enter6PR_toDisplayPassengerUnreconcileNameList(logInfo);
            logInfo.pass("I enter 6:PR_*UNREC command to display passenger unreconcile name list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:FM_ command to display multiple flight monitoring for level 1, level 2 and level 3")
    public void iEnterFM_CommandToDisplayMultipleFlightMonitoringForLevelLevelAndLevel() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:FM_ command to display multiple flight monitoring for level 1, level 2 and level 3");
            isharesPage3.enter6FM_toDisplayMultipleFlightMonitoring(logInfo);
            logInfo.pass("I enter 6:FM_ command to display multiple flight monitoring for level 1, level 2 and level 3");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PR_INIT|SEAT command to initiate reconcile using seat option")
    public void iEnterPR_INITSEATCommandToInitiateReconcileUsingSeatOption() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR_INIT|SEAT command to initiate reconcile using seat option");
            isharesPage3.enter6PR_toInitiateReconcileUsingSeatOption(logInfo);
            logInfo.pass("I enter 6:PR_INIT|SEAT command to initiate reconcile using seat option");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PRS_ command to enter passenger seat numbers")
    public void iEnterPRS_CommandToEnterPassengerSeatNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRS_ command to enter passenger seat numbers");
            isharesPage3.enter6PRS_toEnterPassengerSeatNumbers(logInfo);
            logInfo.pass("I enter 6:PRS_ command to enter passenger seat numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PR_*REC command to display passenger reconcile name list")
    public void iEnterPR_RECCommandToDisplayPassengerReconcileNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR_*REC command to display passenger reconcile name list");
            isharesPage3.enter6PR_toDisplayPassengerReconcileNameList(logInfo);
            logInfo.pass("I enter 6:PR_*REC command to display passenger reconcile name list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Inbound Messages SHARES entries")
    public void enter_command_to_run_the_Inbound_Messages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Inbound Messages SHARES entries");
            isharesPage3.command_to_run_the_Inbound_Messages(logInfo);
            logInfo.pass("I enter command to run the Inbound Messages SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Display Specific Fleet SHARES entries")
    public void enter_Display_Specific_Fleet() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Display Specific Fleet SHARES entries");
            isharesPage3.Display_Specific_Fleet(logInfo);
            logInfo.pass("I enter command to run Display Specific Fleet SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter command to run the Modify Entry-APIS Transmission Control Table")
    public void enter_command_Modify_Entry_APIS_Transmission_Control_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Modify Entry-APIS Transmission Control Table");
            isharesPage3.command_Modify_Entry_APIS_Transmission_Control_Table(logInfo);
            logInfo.pass("I enter command to run the Modify Entry-APIS Transmission Control Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run display PICS Addition Modification and Deletion")
    public void enter_Display_PICS_Addition_Modification_and_Deletion() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run display PICS Addition Modification and Deletion");
            isharesPage3.Display_PICS_Addition_Modification_and_Deletion(logInfo);
            logInfo.pass("I enter command to run display PICS Addition Modification and Deletion");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Deleting Table Items SHARES entries")
    public void enter_Deleting_Table_Items_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Deleting Table Items SHARES entries");
            isharesPage3.Deleting_Table_Items_SHARES_entries(logInfo);
            logInfo.pass("I enter command to run the Deleting Table Items SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Delete Multiple AAA Profile Table SHARES entries")
    public void enter_Delete_Multiple_AAA_Profile_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Delete Multiple AAA Profile Table SHARES entries");
            isharesPage3.Delete_Multiple_AAA_Profile_Table(logInfo);
            logInfo.pass("I enter command to run the Delete Multiple AAA Profile Table SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the Bag Allowance Table SHARES entries")
    public void enter_Bag_Allowance_Table_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the Bag Allowance Table SHARES entries");
            isharesPage3.Bag_Allowance_Table_SHARES_entries(logInfo);
            logInfo.pass("I enter command to run the Bag Allowance Table SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Preferred Customer Seating Table_Air Services")
    public void enter_Preferred_Customer_Seating_Table_Air_Services() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Preferred Customer Seating Table_Air Services");
            isharesPage3.Preferred_Customer_Seating_Table_Air_Services(logInfo);
            logInfo.pass("I enter command to run Preferred Customer Seating Table_Air Services");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FS5828 Run the International Sales Indicator Entry SHARES{string}")
    public void I_enter_fs5838_run_the_international_sales_indicator_entry_shares(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS5828 Run the International Sales Indicator Entry SHARES");
            isharesPage3.fs5838RunTheInternationalSalesIndicatorEntryShares(logInfo, Entry);
            logInfo.pass("I enter Run the International Sales Indicator Entry Shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Entry Format for Extended FOP users SHARES entries")
    public void I_enter_run_the_entry_format_for_extended_FOP_users_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Entry Format for Extended FOP users SHARES entries");
            isharesPage3.theEntryFormateForExtendedFOPUsersSharesEntries(logInfo);
            logInfo.pass("I enter Run the Entry Format for Extended FOP users SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Workfile Ticket Display SHARES entries")
    public void I_enter_run_the_workfile_Ticket_display_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Workfile Ticket Display SHARES entries");
            isharesPage3.runTheWorkfileTicketDisplaySharesEntries(logInfo);
            logInfo.pass("I enter Run the Workfile Ticket Display SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the FQR Ticket Display SHARES entries in Transformed")
    public void I_enter_run_the_FQR_Ticket_display_shares_entries_in_Transformed() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the FQR Ticket Display SHARES entries in Tranformed");
            isharesPage3.theFQRTicketDisplaySharesEntriesInTranformed(logInfo);
            logInfo.pass("I enter Run the FQR Ticket Display SHARES entries in Tranformed");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Last Date to Ticket L Entry SHARES")
    public void I_enter_run_the_last_date_to_Ticket_L_Entry_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Last Date to Ticket L Entry SHARES");
            isharesPage3.runtheLastdateToTicketLEntryShares(logInfo);
            logInfo.pass("I enter Run the Last Date to Ticket L Entry SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Bankers Rate Entry SHARES entries in Transformed SHARES")
    public void I_enter_run_the_Bankers_rate_entry_shares_entries_in_transformed_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Bankers Rate Entry SHARES entries in Tranformed SHARES");
            isharesPage3.theBankersrateEntrySharesEntriesInTransformedShares(logInfo);
            logInfo.pass("I enter Run the Bankers Rate Entry SHARES entries in Tranformed SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ should display Standby list passengers withSpecialChar {string}")
    public void iEnterLD_ShouldDisplayHereWithDetailsWithSpecialChar(String OriginCity) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_ should display Standby list passengers withSpecialChar {string}");
            isharesPage3.displayStandbyListWithSpecialChar(logInfo, OriginCity);
            logInfo.pass("I enter 6:LD_ should display Standby list passengers withSpecialChar {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter InvalidSSR 4SSRWCHRUANN")
    public void IenterInvalidSSR4SSRWCHRUANN() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter InvalidSSR 4SSRWCHRUANN");
            isharesPage3.IenterInvalidSSR4SSRWCHRUANN(logInfo);
            logInfo.pass("I enter InvalidSSR 4SSRWCHRUANN");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter InvalidSSR 4OSI YY SPEAKS SPANISH ONLY")
    public void IenterInvalidSSR4OSIYYSPEAKSSPANISHONLY() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter InvalidSSR 4OSI YY SPEAKS SPANISH ONLY");
            isharesPage3.IenterInvalidSSR4OSIYYSPEAKSSPANISHONLY(logInfo);
            logInfo.pass("I enter InvalidSSR 4OSI YY SPEAKS SPANISH ONLY");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-* to display basic PSC Exception Table")
    public void iEnterKToDisplayBasicPSCExceptionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-* to display basic PSC Exception Table");
            isharesPage3.displayBasicPSCExceptionTable(logInfo);
            logInfo.pass("I enter K-* to display basic PSC Exception Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KEA_ command to add SSR VGML to PSC Exception Table")
    public void I_enter_KEA_command_to_add_SSR_VGML_to_PSC_Exception_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KEA_ command to add SSR VGML to PSC Exception Table");
            isharesPage3.enterKEA_CommandToAddSSRToPSCExceptionTable(logInfo);
            logInfo.pass("I enter KEA_ command to add SSR VGML to PSC Exception Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I search for SSR and validate error message")
    public void I_search_for_SSR_and_validate_error_message() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for SSR and validate error message");
            isharesPage3.searchForSSRAndValidateErrorMsg(logInfo);
            logInfo.pass("I search for SSR and validate error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNBT* command to display travel agency blacklist table and validate the error message")
    public void iEnterPNBTCommandToDisplayTravelAgencyBlacklistTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBT* command to display travel agency blacklist table and validate the error message");
            isharesPage3.displayTravelAgencyBlacklistTableValidateErrorMessage(logInfo);
            logInfo.pass("I enter PNBT* command to display travel agency blacklist table and validate the error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNBSA_ command to add LNIATA to the system")
    public void iEnterPNBSA_CommandToAddLNIATAToTheSystem() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBSA_ command to add LNIATA to the system");
            isharesPage3.addLNIATAToTheSystem(logInfo);
            logInfo.pass("I enter PNBSA_ command to add LNIATA to the system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PNBT* command to display travel agency blacklist table and validate the table displayed")
    public void iEnterPNBTCommandToDisplayTravelAgencyBlacklistTableAndValidateTheTableDisplayed() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PNBT* command to display travel agency blacklist table and validate the table displayed");
            isharesPage3.displayTravelAgencyBlacklistTablelogInfo(logInfo);
            logInfo.pass("I enter PNBT* command to display travel agency blacklist table and validate the table displayed");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:LE_ALL command to display expanded ACI passenger name list")
    public void iEnterLE_ALLCommandToDisplayExpandedACIPassengerNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LE_ALL command to display expanded ACI passenger name list");
            isharesPage3.displayExpandedACIPassengerNameList(logInfo);
            logInfo.pass("I enter 6:LE_ALL command to display expanded ACI passenger name list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET_ command adjust or modify the passenger name by associating the ticket {string} to the surname with index {string}")
    public void iEnerTET_CommandAdjustOrModifyThePassengerByAssociatingTheTicketToTheSurnameWithIndex(String tktNumberIndex, String paxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_ command adjust or modify the passenger name");
            isharesPage3.enterT_ET_toAdjustOrModifyPassengerName(logInfo, tktNumberIndex, paxIndex);
            logInfo.pass("I enter T-ET_ command adjust or modify the passenger name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIATUT_ command to run the third party add entry to add two airline codes")
    public void iEnterPIATUT_CommandToRunTheThirdPartyAddEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIATUT_ command to run the third party add entry to add two airline codes");
            isharesPage3.runTheSingleThirdPartyDeleteEntry(logInfo, isharesPage3.runThirdPartyAddEntryForTwoAirlineCodes(logInfo));
            logInfo.pass("I enter PIATUT_ command to run the third party add entry to add two airline codes");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PIAT*_ command to Run the City Display Entry in IATA City Code Addressee Table")
    public void iEnterPIAT_CommandToRunTheCityDisplayEntryInIATACityCodeAddresseeTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT*_ command to Run the City Display Entry in IATA City Code Addressee Table");
            isharesPage3.runCityDisplayEntryInIATACityCodeAddressTable(logInfo);
            logInfo.pass("I enter PIAT*_ command to Run the City Display Entry in IATA City Code Addressee Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT*_|BTM command for expanded IATA city code address table for BTM messages")
    public void iEnterPIAT_BTMCommandForExpandedIATACityCodeAddressTableTwoForBTMMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT*_|BTM command for expanded IATA city code address table for BTM messages");
            isharesPage3.expandedIATACityCodeAddressTableForBTMMessages(logInfo);
            logInfo.pass("I enter PIAT*_|BTM command for expanded IATA city code address table for BTM messages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT*_|BSM command for expanded IATA city code address table for BSM messages")
    public void iEnterPIAT_BSMCommandForExpandedIATACityCodeAddressTableTwoForBSMMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT*_|BSM command for expanded IATA city code address table for BSM messages");
            isharesPage3.expandedIATACityCodeAddressTableForBSMMessages(logInfo);
            logInfo.pass("I enter PIAT*_|BSM command for expanded IATA city code address table for BSM messages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT*_|PSM command for expanded IATA city code address table for PSM format")
    public void iEnterPIAT_PSMCommandForExpandedIATACityCodeAddressTableForPSMFormat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT*_|PSM command for expanded IATA city code address table for PSM format");
            isharesPage3.expandedIATACityCodeAddressTableForPSMFormat(logInfo);
            logInfo.pass("I enter PIAT*_|PSM command for expanded IATA city code address table for PSM format");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAT*_|FTL command to display single message type entry")
    public void iEnterPIAT_FTLCommandToDisplaySingleMessageTypeEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAT*_|FTL command to display single message type entry");
            isharesPage3.displaySingleMessageTypeEntry(logInfo);
            logInfo.pass("I enter PIAT*_|FTL command to display single message type entry");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CLR*_ command to display all items for requested flight")
    public void iEnterCLR_CommandToDisplayAllItemsForRequestedFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CLR*_ command to display all items for requested flight");
            isharesPage3.displayAllItemsForRequestedFlight(logInfo);
            logInfo.pass("I enter 6:CLR*_ command to display all items for requested flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CLR*DEF command to display default values for ASA ABP booking periods")
    public void iEnterCLRDEFCommandToDisplayDefaultValuesForASAABPBookingPeriods() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CLR*DEF command to display default values for ASA ABP booking periods");
            isharesPage3.displayDefaultValuesForASAABPBookingPeriods(logInfo);
            logInfo.pass("I enter 6:CLR*DEF command to display default values for ASA ABP booking periods");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-OVERLAY command only to verify the Overlay Scratch Pad to Prime PCH Table and Update PCH History")
    public void iEnterKTOVERLAYCommandOnlyToVerifyTheOverlayScratchPadToPrimePCHTableAndUpdatePCHHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-OVERLAY command only to verify the Overlay Scratch Pad to Prime PCH Table and Update PCH History");
            isharesPage3.verifyOverlayScratchPadToPrimePCHTable(logInfo);
            logInfo.pass("I enter K-T-OVERLAY command only to verify the Overlay Scratch Pad to Prime PCH Table and Update PCH History");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CNI command to initialize standby priority table modification")
    public void iEnterCNICommandToInitializeStandbyPriorityTableModification() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNI command to initialize standby priority table modification");
            isharesPage3.initializeStandbyPriorityTableModification(logInfo);
            logInfo.pass("I enter 6:CNI command to initialize standby priority table modification");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CNX command to cancel standby priority table modification")
    public void iEnterCNXCommandToCancelStandbyPriorityTableModification() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNX command to cancel standby priority table modification");
            isharesPage3.cancelStandbyPriorityTableModification(logInfo);
            logInfo.pass("I enter 6:CNX command to cancel standby priority table modification");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-CNI command to initialize Standby Priority Table")
    public void iEnterCNICommandToInitializeStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CNI command to initialize Standby Priority Table");
            isharesPage3.toInitializeStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6-CNI command to initialize Standby Priority Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter PAEZ|PASSWORD command to display baggage control table maintenance and verify the error message")
    public void iEnterPAEZPASSWORDCommandToDisplayBaggageControlTableMaintenanceAndVerifyTheErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAEZ|PASSWORD command to display baggage control table maintenance and verify the error message");
            isharesPage3.displayBaggageControlTableMaintenanceAndVerifyErrorMsg(logInfo);
            logInfo.pass("I enter PAEZ|PASSWORD command to display baggage control table maintenance and verify the error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAF command to Modify Header Information in IATA City Code Addressee Table")
    public void enter_PIAF_ModifyHeaderInformationIATACityCodeAddresseeTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAF command to Modify Header Information in IATA City Code Addressee Table");
            isharesPage3.enterPIAF_ModifyHeaderInformationIATACityCodeAddresseeTable(logInfo);
            logInfo.pass("I enter PIAF command to Modify Header Information in IATA City Code Addressee Table");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAF command to Add Flight Information in IATA City Code Addressee Table")
    public void enter_PIAF_AddFlightInformationIATACityCodeAddresseeTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAF command to Add Flight Information in IATA City Code Addressee Table");
            isharesPage3.enterPIAF_AddFlightInformationIATACityCodeAddresseeTable(logInfo);
            logInfo.pass("I enter PIAF command to Add Flight Information in IATA City Code Addressee Table");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAF command to Modify Flight Information in IATA City Code Addressee Table")
    public void enter_PIAF_ModifyFlightInformationIATACityCodeAddresseeTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAF command to Modify Flight Information in IATA City Code Addressee Table");
            isharesPage3.enterPIAF_ModifyFlightInformationIATACityCodeAddresseeTable(logInfo);
            logInfo.pass("I enter PIAF command to Modify Flight Information in IATA City Code Addressee Table");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAA*O command to Flight Affected List")
    public void enter_PAAO_DisplayFlightAffectedList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA*O command to Flight Affected List");
            isharesPage3.enterPAAO_DisplayFlightAffectedList(logInfo);
            logInfo.pass("I enter PAA*O command to Flight Affected List");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-ISSR command to Display SSR Inventory Database")
    public void enter_KISSR_DisplaySSRInventoryDatabase() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-I/SSR* command to Display SSR Inventory Database");
            isharesPage3.enterKISSR_DisplaySSRInventoryDatabase(logInfo);
            logInfo.pass("I enter K-I/SSR* command to Display SSR Inventory Database");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-ISSR command to Display SSR inventory database for all SSR codes for a flightdate")
    public void enter_KISSR_DisplaySSRInventoryDatabaseforSSRCodesFlightDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-ISSR command to Display SSR inventory database for all SSR codes for a flight/date");
            isharesPage3.enterKISSR_DisplaySSRInventoryDatabaseforSSRCodesFlightDate(logInfo);
            logInfo.pass("I enter K-ISSR command to Display SSR inventory database for all SSR codes for a flight/date");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-ISSR command to Display SSR inventory database for specific SSR code for a flightdate")
    public void enter_KISSR_DisplaySSRInventoryDatabaseforspecificSSRCodeFlightDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-ISSR command to Display SSR inventory database for specific SSR code for a flight/date");
            isharesPage3.enterKISSR_DisplaySSRInventoryDatabaseforspecificSSRCodeFlightDate(logInfo);
            logInfo.pass("I enter K-ISSR command to Display SSR inventory database for specific SSR code for a flight/date");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KRDFS command to Add item with GDSOA code and its BUSID and GDS OA BUSID FCB AVAIL TABLE")
    public void enter_KRDFS_AdditemGDSCodeandBusId() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KRDFS command to Add item with GDS/OA code and its BUSID and GDS OA BUSID FCB AVAIL TABLE");
            isharesPage3.enterKRDFS_AdditemGDSCodeandBusId(logInfo);
            logInfo.pass("I enter KRDFS command to Add item with GDS/OA code and its BUSID and GDS OA BUSID FCB AVAIL TABLE");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-CQA command to Clear and Reinitiate ACI AAA Profile Information")
    public void enter_6CQA_ClearACIAAAProfileInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CQA command to Clear and Reinitiate ACI AAA Profile Information");
            isharesPage3.enter6CQA_ClearandReinitiateACIAAAProfileInformation(logInfo);
            logInfo.pass("I enter 6-CQA command to Clear and Reinitiate ACI AAA Profile Information");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:FM command to {string} Shares entries")
    public void enter_6FM_verifySharesentries(String transactionType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:FM command to " + transactionType + " Shares entries");
            isharesPage3.enter6FM_verifySharesentries(logInfo, transactionType);
            logInfo.pass("I enter 6:FM command to " + transactionType + " Shares entries");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CG command to Display {string}")
    public void enter_6CG_DisplayRemarks(String remarkType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CG command to Display All Active Remarks " + remarkType);
            isharesPage3.enter6CG_DisplayRemarks(logInfo, remarkType);
            logInfo.pass("I enter 6:CG command to Display All Active Remarks " + remarkType);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run APIS SCREEN IDENTIFIER TABLE entries")
    public void enter_Run_APIS_SCREEN_IDENTIFIER_TABLEs() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run APIS SCREEN IDENTIFIER TABLE entries");
            isharesPage3.Run_APIS_SCREEN_IDENTIFIER_TABLE(logInfo);
            logInfo.pass("I enter command to Run APIS SCREEN IDENTIFIER TABLE entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Run Finalize Table Modifications SHARES entries")
    public void enter_RunFinalizeTableModifications() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Run Finalize Table Modifications SHARES entries");
            isharesPage3.RunFinalizeTableModifications(logInfo);
            logInfo.pass("I enter command to run Run Finalize Table Modifications SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Delete Table Items in Agent Assembly Area Profile Table SHARES entries")
    public void enter_AgentAssemblyAreaProfileTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Delete Table Items in Agent Assembly Area Profile Table SHARES entries");
            isharesPage3.AgentAssemblyAreaProfileTable(logInfo);
            logInfo.pass("I enter command to Run Delete Table Items in Agent Assembly Area Profile Table SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Add new market with USIN_no {string} and USOU_no {string} in PDC agency SHARES")
    public void enter_AddnewMarketWithZZZPDCagency(String Usinno, String Usonno) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Add new market with USIN_no " + Usinno + "and USOU_no " + Usonno + "in PDC agency SHARES");
            isharesPage3.AddnewMarketWithZZZPDCagency(logInfo, Usinno, Usonno);
            logInfo.pass("I enter command to Run Add new market with USIN_no " + Usinno + "and USOU_no " + Usonno + "in PDC agency SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run MARk refund request SHARES entries")
    public void enter_run_MARk_refund_request() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run MARk refund request SHARES entries");
            isharesPage3.run_MARk_refund_request(logInfo);
            logInfo.pass("I enter command to run MARk refund request SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Terminate Automatic Seat Selection SHARES entries")
    public void enter_TerminateAutomaticSeatSelection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Terminate Automatic Seat Selection SHARES entries");
            isharesPage3.TerminateAutomaticSeatSelection(logInfo);
            logInfo.pass("I enter command to Run Terminate Automatic Seat Selection SHARES entriess");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Add Tail Number to Fleet Name Record-User Option")
    public void enter_RunAddTailNumbertoFleetNameRecord() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Add Tail Number to Fleet Name Record-User Option");
            isharesPage3.RunAddTailNumbertoFleetNameRecord(logInfo);
            logInfo.pass("I enter command to Run Add Tail Number to Fleet Name Record-User Option");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Modify IATA Level of Detail SHARES entries")
    public void enter_ModifyIATALevelofDetail() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Modify IATA Level of Detail SHARES entries");
            isharesPage3.ModifyIATALevelofDetail(logInfo);
            logInfo.pass("I enter command to Run Modify IATA Level of Detail SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Add_Delete Bulkhead Seats SHARES entries")
    public void enter_AddDeleteBulkheadSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Add_Delete Bulkhead Seats SHARES entries");
            isharesPage3.AddDeleteBulkheadSeats(logInfo);
            logInfo.pass("I enter command to Run Add_Delete Bulkhead Seats SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Modify Overwing Rowsp SHARES entries")
    public void enter_ModifyOverwingRowsp() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Modify Overwing Rowsp SHARES entries");
            isharesPage3.ModifyOverwingRowsp(logInfo);
            logInfo.pass("I enter command to Run Modify Overwing Rowsp SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command 6-I* to check ICR active CRT")
    public void enter_DefineOxygenatedRowsSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command 6-I* to check ICR active CRT");
            isharesPage3.DefineOxygenatedRowsSeats(logInfo);
            logInfo.pass("I enter command 6-I* to check ICR active CRT");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Define Ticketed Baggage Seats SHARES entries")
    public void enter_DefineTicketedBaggageSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Define Ticketed Baggage Seats SHARES entries");
            isharesPage3.DefineTicketedBaggageSeats(logInfo);
            logInfo.pass("I enter command to Run Define Ticketed Baggage Seats SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Meal Discrepancy Report SHARES entries")
    public void enter_MealDiscrepancyReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Meal Discrepancy Report SHARES entries");
            isharesPage3.MealDiscrepancyReport(logInfo);
            logInfo.pass("I enter command to Run Meal Discrepancy Report SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CR_ command to restrict check-in entries to control sets Without lnIata")
    public void iEnterCR_CommandToRestrictCheckInEntriesToControlSetsWithoutlnIata() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CR_ command to restrict check-in entries to control sets");
            isharesPage3.toRestrictCheckInEntriesToControlSetsWithoutlniata(logInfo);
            logInfo.pass("I enter 6:CR_ command to restrict check-in entries to control sets");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:C*_ command to display inbound connects With {string}")
    public void i_enter_6C_command_to_display_inbound_connects(String Entry) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C*_ command to display inbound connects");
            isharesPage3.displayInboundConnectsWithHashA(logInfo, Entry);
            logInfo.pass("I enter 6:C*_ command to display inbound connects");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate Positive Space Pass Riders with lnIata")
    public void validate_Positive_SpacePassRidersWithlnIata() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate Positive Space Pass Riders");
            isharesPage3.validatePositiveSpacePassRidersWithlnIata(logInfo);
            logInfo.pass("I validate Positive Space Pass Riders");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-BTAG command to display list of active bags for all passengers out of a board point {string}")
    public void Ienter6BTAGcommandtodisplaylistofactivebags(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-BTAG command to display list of active bags for all passengers out of a board point" + Entry);
            isharesPage3.enter6BTAGCommandRelatedTodisplaylistofactivebagsforallpassengers(logInfo, Entry);
            logInfo.pass("I enter 6-BTAG command to display list of active bags for all passengers out of a board point" + Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Displaying PNR Stored Fare Data in Ticket Format")
    public void I_enter_run_the_displaying_PNR_stored_fare_data_in_Ticket_format() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Displaying PNR Stored Fare Data in Ticket Format");
            isharesPage3.displayingPNRStoredFareDataInTicketFormat(logInfo);
            logInfo.pass("I enter Run the Displaying PNR Stored Fare Data in Ticket Format");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Move Previously Filed Fare Quote to Work File for Changes SHARES")
    public void I_enter_run_the_move_previously_filed_fare_quote_to_work_file_for_changes_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Move Previously Filed Fare Quote to Work File for Changes SHARES");
            isharesPage3.movePreviouslyFiledFareQuoteToWorkFileForChangesShares(logInfo);
            logInfo.pass("I enter Run the Move Previously Filed Fare Quote to Work File for Changes SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Fare Basis Validity dates Connection Indicator Entry SHARES")
    public void I_enter_run_the_fare_basis_validity_dates_connection_indicator_entry_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Fare Basis Validity dates Connection Indicator Entry SHARES");
            isharesPage3.theFareBasisValidityDatesConnectionIndicatorEntryShares(logInfo);
            logInfo.pass("I enter Run the Fare Basis Validity dates Connection Indicator Entry SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Passenger Type entry SHARES entries in Tranformed")
    public void I_enter_Run_the_Passenger_Type_entry_SHARES_entries_in_Tranformed() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Passenger Type entry SHARES entries in Tranformed");
            isharesPage3.thePassengerTypeEntrySharesEntriesInTranformed(logInfo);
            logInfo.pass("I enter Run the Passenger Type entry SHARES entries in Tranformed");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Fare Calculation entry SHARES")
    public void I_enter_run_the_fare_calculation_entry_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Fare Calculation entry SHARES");
            isharesPage3.theFareCalculationEntryShares(logInfo);
            logInfo.pass("I enter Run the Fare Calculation entry SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A_ command to change advanced assign seats{string}")
    public void iEnterA_CommandToChangeAdvancedAssignSeats(String seatNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_ command to change advanced assign seats{string}");
            isharesPage3.toChangeAdvancedAssignSeats(logInfo, seatNo);
            logInfo.pass("I enter 6:A_ command to change advanced assign seats{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CP_ command to mark the available seat as taken or unavailable")
    public void iEnterCP_CommandToMarkTheAvailableSeatAsTakenOrUnavailable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CP_ command to mark the available seat as taken or unavailable");
            isharesPage3.toMarkTheAvailableSeatAsTakenOrUnavailable(logInfo);
            logInfo.pass("I enter 6:CP_ command to mark the available seat as taken or unavailable");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZH_ command to check SSR record with overflow record address under OFL field")
    public void iEnterZH_CommandToCheckSSRRecordWithOverflowRecordAddressUnderOFLField() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH_ command to check SSR record with overflow record address under OFL field");
            isharesPage3.toEnterZH_CommandToCheckSSRRecord(logInfo);
            logInfo.pass("I enter 6:ZH_ command to check SSR record with overflow record address under OFL field");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A_W command to perform ASA for window seat")
    public void iEnterA_WCommandToPerformASAForWindowSeat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_W command to perform ASA for window seat");
            isharesPage3.toPerformASAForWindowSeat(logInfo);
            logInfo.pass("I enter 6:A_W command to perform ASA for window seat");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-A_ command to cancel ASA for specified segment{string}")
    public void iEnterA_CommandToCancelASAForSpecifiedSegment(String Segment) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-A_ command to cancel ASA for specified segment{string}");
            isharesPage3.toCancelASAForSpecifiedSegment(logInfo, Segment);
            logInfo.pass("I enter 6-A_ command to cancel ASA for specified segment{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ZAFIL command to add the SU duty code for the POS used")
    public void iEnterZAFILCommandToAddTheSUDutyCodeForThePOSUsed() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ZAFIL command to add the SU duty code for the POS used");
            isharesPage3.enterZAFILCommandToAddTheSUDutyCodeForThePOSUsed(logInfo);
            logInfo.pass("I enter ZAFIL command to add the SU duty code for the POS used");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BSIW_ command to expanded AAA agent Sign In")
    public void iEnterBSIW_CommandToExpandedAAAAgentSignIn() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSIW_ command to expanded AAA agent Sign In");
            isharesPage3.enterBSIW_CommandToExpandedAAAAgentSignIn(logInfo);
            logInfo.pass("I enter BSIW_ command to expanded AAA agent Sign In");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *R_ command to display CC number")
    public void iEnterR_CommandToDisplayCCNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *R_ command to display CC number");
            isharesPage3.toDisplayCCNumber(logInfo);
            logInfo.pass("I enter *R_ command to display CC number");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *HS command to display PNR Security History Record")
    public void iEnterHSCommandToDisplayPNRSecurityHistoryRecord() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *HS command to display PNR Security History Record");
            isharesPage3.toDisplayPNRSecurityHistoryRecord(logInfo);
            logInfo.pass("I enter *HS command to display PNR Security History Record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ICICR_ command to associate Fleet Name with a Common Map with Segment number{string}")
    public void iEnterICICR_CommandToAssociateFleetNameWithACommonMap(String segmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ICICR_ command to associate Fleet Name with a Common Map with Segment number{string}");
            isharesPage3.enterICICR_CommandToAssociateFleetNameWithACommonMap(logInfo, segmentNo);
            logInfo.pass("I enter 6:ICICR_ command to associate Fleet Name with a Common Map with Segment number{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CUA_ command to release Held Seats in ASA")
    public void iEnterCUA_CommandToReleaseHeldSeatsInASA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CUA_ command to release Held Seats in ASA");
            isharesPage3.toReleaseHeldSeatsInASA(logInfo);
            logInfo.pass("I enter 6:CUA_ command to release Held Seats in ASA");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZRA_ command to run Processing Action in ASA")
    public void iEnterZRA_CommandToRunProcessingActionInASA() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZRA_ command to run Processing Action in ASA");
            isharesPage3.toRunProcessingActionInASA(logInfo);
            logInfo.pass("I enter 6:ZRA_ command to run Processing Action in ASA");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A1 command to cancel specific seat for single surname")
    public void iEnterACommandToCancelSpecificSeatForSingleSurname() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A1 command to cancel specific seat for single surname");
            isharesPage3.toCancelSpecificSeatForSingleSurname(logInfo);
            logInfo.pass("I enter 6:A1 command to cancel specific seat for single surname");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A_ command to change advanced assign seat for specified segment{string}")
    public void iEnterA_CommandToChangeAdvancedAssignSeatForSpecifiedSegment(String segmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_ command to change advanced assign seat for specified segment{string}");
            isharesPage3.toChangeAdvancedAssignSeatForSpecifiedSegment(logInfo, segmentNo);
            logInfo.pass("I enter 6:A_ command to change advanced assign seat for specified segment{string} and seat number{seatNo}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A_ command to cancel specific seat for multiple surname with specified segment{string}")
    public void iEnterA_CommandToCancelSpecificSeatForMultipleSurnameWithSpecifiedSegment(String segmentNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A_ command to cancel specific seat for multiple surname with specified segment{string}");
            isharesPage3.toCancelSpecificSeatForMultipleSurname(logInfo, segmentNo);
            logInfo.pass("I enter 6:A_ command to cancel specific seat for multiple surname with specified segment{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KC_CQ_* command to display new DST indicator in the City Queue")
    public void iEnterKCCQCommandToDisplayNewDSTIndicatorInTheCityQueue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KC_CQ_* command to display new DST indicator in the City Queue");
            isharesPage3.enterKCCQCommand(logInfo);
            logInfo.pass("I enter KC_CQ_* command to display new DST indicator in the City Queue");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|Pax command to display the list of passengers")
    public void iEnterLD_PaxCommandToDisplayTheListOfPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KC_CQ_* command to display new DST indicator in the City Queue");
            isharesPage3.enterLD_PaxCommand(logInfo);
            logInfo.pass("I enter KC_CQ_* command to display new DST indicator in the City Queue");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:LD_|SSR command to display the list of passengers who having SSRs")
    public void iEnterLD_SSRCommandToDisplayTheListOfPassengersWhoHavingSSRs() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KC_CQ_* command to display new DST indicator in the City Queue");
            isharesPage3.enterLD_SSRCommand(logInfo);
            logInfo.pass("I enter KC_CQ_* command to display new DST indicator in the City Queue");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add {string} remarks to pnr")
    public void iAddRemarksToPnr(String NoofRemarks) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + NoofRemarks + " remarks to pnr");
            isharesPage3.addRemarksToPnr(logInfo, NoofRemarks);
            logInfo.pass("I add " + NoofRemarks + " remarks to pnr");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q**CODESHARE command to display of Standard Secondary Codeshare table {string}")
    public void iEnterQCODESHARECommandToDisplayOfStandardSecondaryCodeshareTable(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q**CODESHARE command to display of Standard Secondary Codeshare table");
            isharesPage3.enterQCODESHARECommand(logInfo, Entry);
            logInfo.pass("I enter Q**CODESHARE command to display of Standard Secondary Codeshare table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *D_ command to display Itinerary For Retrieved for all the segments")
    public void iEnterD_CommandToDisplayItineraryForRetrievedForAllTheSegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q**CODESHARE command to display of Standard Secondary Codeshare table");
            isharesPage3.enterD_Command(logInfo);
            logInfo.pass("I enter Q**CODESHARE command to display of Standard Secondary Codeshare table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2P command to perform flifo operation to the host operating flight")
    public void iEnterPCommandToPerformFlifoOperationToTheHostOperatingFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to perform flifo operation to the host operating flight");
            isharesPage3.enterPCommand(logInfo);
            logInfo.pass("I enter 2P command to perform flifo operation to the host operating flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter A* command to display availability {string}")
    public void iEnterACommandToDisplayAvailability(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter A* command to display availability");
            isharesPage3.enterACommandToDisplayAvailability(logInfo, Entry);
            logInfo.pass("I enter A* command to display availability");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter L* command with index {string}")
    public void iEnterLCommandWithIndex(String Index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter L* command with index " + Index);
            isharesPage3.enterLCommandWithIndex(logInfo, Index);
            logInfo.pass("I enter L* command with index " + Index);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CF command to make the flight as default")
    public void I_make_the_flight_as_default() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I make the flight as default");
            isharesPage3.makeFlightAsDefault(logInfo);
            logInfo.pass("I make the flight as default");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAF*_ command to display PFS display {string}")
    public void iEnterPIAF_CommandToDisplayPFSDisplay(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAF*_ command to display PFS display");

            isharesPage3.enterPIAF_CommandToDisplayPFSDisplay(logInfo, Entry);
            logInfo.pass("I enter PIAF*_ command to display PFS display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7@ command to perform changing the ticketing transaction commands {string}")
    public void iEnterCommandToPerformChangingTheTicketingTransactionCommands(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7@ command to perform changing the ticketing transaction commands");

            isharesPage3.enterCommandToPerformChangingTheTicketingTransactionCommands(logInfo, Entry);
            logInfo.pass("I enter PIAF*_ command to display PFS display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAG* command to display the group zone table {string}")
    public void iEnterPAGCommandToDisplayTheGroupZoneTable(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAG* command to display the group zone table " + Entry);

            isharesPage3.enterPAGCommandToDisplayTheGroupZoneTable(logInfo, Entry);
            logInfo.pass("I enter PIAF*_ command to display PFS display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAP command to perform modification on Table {string}")
    public void iEnterPAPCommandToPerformModificationOnTable(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAP command to perform modification on Table");
            isharesPage3.enterPAPCommandToPerformModificationOnTable(logInfo, Entry);
            logInfo.pass("I enter PAP command to perform modification on Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD command to passenger displays queue {string}")
    public void iEnterLDCommandToPassengerDisplaysQueue(String QueueNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to passenger displays queue");
            isharesPage3.enterLDCommandToPassengerDisplaysQueue(logInfo, QueueNumber);
            logInfo.pass("I enter 6:LD command to passenger displays queue");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|UNS command to display passengers without seat")
    public void iEnter6LD_UNSCommandToDisplayPassengersWithoutSeat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|UNS command to display passengers without seat");
            isharesPage3.displayPassengersWithoutSeat(logInfo);
            logInfo.pass("I enter 6:LD_|UNS command to display passengers without seat");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|TB*P command to display Specific Elite Level Frequent Travelers")
    public void iEnterLD_TBPCommandToDisplaySpecificEliteLevelFrequentTravelerss() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|TB*P command to display Specific Elite Level Frequent Travelerss");
            isharesPage3.enterLD_TBPCommand(logInfo);
            logInfo.pass("I enter 6:LD_|TB*P command to display Specific Elite Level Frequent Travelerss");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*C_ command to display seated passenger counts")
    public void iEnterC_CommandToDisplaySeatetdPassengerCounts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*C_ command to display seatetd passenger counts");
            isharesPage3.enterC_CommandToDisplaySeatetdPassengerCounts(logInfo);
            logInfo.pass("I enter 6:*C_ command to display seatetd passenger counts");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CO command to display flight status")
    public void iEnterCOCommandToDisplayFlightStatus() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CO command to display flight status");
            isharesPage3.enterCOCommandToDisplayFlightStatus(logInfo);
            logInfo.pass("I enter 6:CO command to display flight status");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:CC command to close the flight")
    public void iEnterCCCommandToCloseTheFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CC command to close the flight");
            isharesPage3.closeTheFlight(logInfo);
            logInfo.pass("I enter 6:CC command to close the flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:LD_|SN command to display the list of passengers in sequence number {string}")
    public void iEnterLD_SNCommandToDisplayTheListOfPassengersInSequenceNumber(String SeqNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SN command to display the list of passengers in sequence numbert");
            isharesPage3.enterLD_SNCommand(logInfo, SeqNumber);
            logInfo.pass("I enter 6:LD_|SN command to display the list of passengers in sequence number");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:LD command to display category of passenger displays queue {string} {string}")
    public void iEnterLDCommandToDisplayCategoryOfPassengerDisplaysQueue(String QueueNumber, String CategoryType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to display category of passenger displays queue");
            isharesPage3.enterLDCommandToDisplayCategoryOfPassengerDisplaysQueue(logInfo, QueueNumber, CategoryType);
            logInfo.pass("I enter 6:LD command to display category of passenger displays queue");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|SSR command to display the list of passengers who having SSRs {string}")
    public void iEnterLD_SSRCommandToDisplayTheListOfPassengersWhoHavingSSRsType(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SSR command to display the list of passengers who having SSRs ");
            isharesPage3.enterLD_SSRCommandToDisplayTheListOfPassengersWhoHavingSSRsType(logInfo, SSRType);
            logInfo.pass("I enter 6:LD_|SSR command to display the list of passengers who having SSRs ");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|TB* command to display Elite Frequent Travelers")
    public void iEnterLD_TBCommandToDisplayEliteFrequentTravelers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|TB* command to display Elite Frequent Travelers");
            isharesPage3.enterLD_TBCommandToDisplayEliteFrequentTravelers(logInfo);
            logInfo.pass("I enter 6:LD_|TB* command to display Elite Frequent Travelers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|XI_T command to cancelled Item by Time")
    public void iEnterLD_XITCommandToCancelledItemByTime() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|XI_T command to cancelled Item by Time");
            isharesPage3.enterLD_XITCommandToCancelledItemByTime(logInfo);
            logInfo.pass("I enter 6:LD_|XI_T command to cancelled Item by Time");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|SA command to display list of Armed Passengers")
    public void iEnterLD_SACommandToDisplayListOfArmedPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SA command to display list of Armed Passengers");
            isharesPage3.enterLD_SACommandToDisplayListOfArmedPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|SA command to display list of Armed Passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the codeshare table entries for OA")
    public void iRunTheCodeshareTableEntriesForOA() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the codeshare table entries for OA");
            System.out.println("I run the codeshare table entries for OA");

            isharesPage3.runCodeshareTableEntriesCommandsForOA(logInfo);
            logInfo.pass("I run the codeshare table entries for OA");


        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for {string} flight availability from {string} to {string} without date")
    public void i_search_for_flight_availability_without_date(String OAAirline, String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for " + OAAirline + " flight availability from " + origin + " to " + destination + "without date");
            isharesPage3.verifySeatsAvailabilityForOAAirline(logInfo, OAAirline, origin, destination);
            logInfo.pass("I search for " + OAAirline + " flight availability from " + origin + " to " + destination + "without date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ ALL_CI command and verify response")
    public void iEnterLD_ALL_CICommandAndVerifyResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD ALL_CI command and verify response");
            isharesPage3.verify6_LD_AllCICommand(logInfo);
            logInfo.pass("I enter 6:LD ALL_CI command and verify response");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KCCQ Flag Stop Restrictions SHARES entry {string}")
    public void i_KCCQ_enter_Flag_Stop_Restrictions_SHARES_entry(String newOrigin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KCCQ Flag Stop Restrictions SHARES entry");
            isharesPage3.flag_Stop_KCCQ_Restrictions_SHARES_entry(logInfo, newOrigin);
            logInfo.pass("I enter KCCQ Flag Stop Restrictions SHARES entry");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of shares for a marketing flight to verify error message")
    public void iDoTheCheckinOfSharesForAMarketingFlightToVerifyErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of shares for a marketing flight to verify error message");
            isharesPage3.toVerifyErrorMessageForMarketFlightCheckin(logInfo);
            logInfo.pass("I do the checkin of shares for a marketing flight to verify error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:TESTBAG_ command to perform test print of a baggage tag")
    public void iEnterTESTBAG_CommandToPerformTestPrintOfABaggageTag() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TESTBAG_ command to perform test print of a baggage tag");
            isharesPage3.toPerformTestPrintOfABaggageTag(logInfo);
            logInfo.pass("I enter 6:TESTBAG_ command to perform test print of a baggage tag");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do the checkin of shares for a marketing flight with bag count{int} and weight{string} to verify error message")
    public void iDoTheCheckinOfSharesForAMarketingFlightWithBagCountAndWeightToVerifyErrorMessage(int BaggageCount, String BaggageWeight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do the checkin of shares for a marketing flight with bag count "+BaggageCount+" and weight "+BaggageWeight+" to verify error message");
            isharesPage3.toVerifyErrorMessageForAMarketingFlightWithBagCountAndWeight(logInfo, BaggageCount, BaggageWeight);
            logInfo.pass("I do the checkin of shares for a marketing flight with bag count "+BaggageCount+" and weight "+BaggageWeight+" to verify error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:_UNC|@ command to verify error message for canceling the marketing flight")
    public void iEnter_UNCCommandToVerifyErrorMessageForCancelingTheMarketingFlight() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:_UNC|@ command to verify error message for canceling the marketing flight");
            isharesPage3.toVerifyErrorMessageForCancelingTheMarketingFlight(logInfo);
            logInfo.pass("I enter 6:_UNC|@ command to verify error message for canceling the marketing flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:_@B command to verify the error message of modification of Baggage using Incorrect Format")
    public void iEnter_BCommandToVerifyTheErrorMessageOfModificationOfBaggageUsingIncorrectFormat() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:_@B command to verify the error message of modification of Baggage using Incorrect Format");
            isharesPage3.toVerifyTheErrorMessageUsingIncorrectFormat(logInfo);
            logInfo.pass("I enter 6:_@B command to verify the error message of modification of Baggage using Incorrect Format");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:_@B command to verify the error message of modification of Baggage using invalid format{string}")
    public void iEnter_BCommandToVerifyTheErrorMessageOfModificationOfBaggageUsingInvalidFormat(String errorType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:_@B command to verify the error message of modification of Baggage using invalid format{string}");
            isharesPage3.toVerifyTheErrorMessageUsingInvalidFormat(logInfo, errorType);
            logInfo.pass("I enter 6:_@B command to verify the error message of modification of Baggage using invalid format{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6-* command to display the seatmap with default seat type{string}")
    public void iEnterCommandToDisplayTheSeatmapWithDefaultSeatType(String seatType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-* command to display the seatmap with default seat type{string}");
            isharesPage3.toDisplayTheSeatmapWithDefaultSeatType(logInfo, seatType);
            logInfo.pass("I enter 6-* command to display the seatmap with default seat type{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I rebook the segment using invalid segment number{string} with the new class of service to verify error message")
    public void iRebookTheSegmentUsingInvalidSegmentNumberWithTheNewClassOfServiceToVerifyErrorMessage(String segmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook the segment using invalid segment number{string} with the new class of service to verify error message");
            isharesPage3.toVerifyErrorMessageForRebookingTheSegmentUsingInvalidSegmentNumber(logInfo, segmentNumber);
            logInfo.pass("I rebook the segment using invalid segment number{string} with the new class of service to verify error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter RS_ and RC_ command to display Agent and System reports")
    public void iEnterRS_AndRC_CommandToDisplayAgentAndSystemReports() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter RS_ and RC_ command to display Agent and System reports");
            isharesPage3.toDisplayAgentAndSystemReports(logInfo);
            logInfo.pass("I enter RS_ and RC_ command to display Agent and System reports");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:FCB command to Requested from A Downline City")
    public void enter_6FCB_RequestedfromADownlineCity() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:FCB command to Requested from A Downline City");
            isharesPage3.enter6FCB_RequestedfromADownlineCity(logInfo);
            logInfo.pass("I enter 6:FCB command to Requested from A Downline City");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CNR* command to display Display Rev Standby Priority Table")
    public void enter_6CNR_DisplayRevStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNR* command to display Display Rev Standby Priority Table");
            isharesPage3.enter6CNR_DisplayRevStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6:CNR* command to display Display Rev Standby Priority Table");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|OA command to display the list of other airline passengers")
    public void iEnterLD_OACommandToDisplayTheListOfOtherAirlinePassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|OA command to display the list of other airline passengers");
            isharesPage3.displayListOfOtherAirlinePassengers(logInfo);
            logInfo.pass("I enter 6:LD_|OA command to display the list of other airline passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|OC {string} {string} {string} command to display the list of outbound connect passengers")
    public void iEnterLD_OCCommandToDisplayTheListOfOutboundConnectPassengers(String OA_FlightNo1, String Origin, String OA_FlightNo2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|OA_FlightNo command to display the list of other airline passengers");
            isharesPage3.displayListOfOCPassengers(logInfo, OA_FlightNo1, Origin, OA_FlightNo2);
            logInfo.pass("I enter 6:LD_|OA_FlightNo command to display the list of other airline passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|OLD {string} {string} command to display the list of old seats")
    public void iEnterLD_OLDCommandToDisplayTheListOfOldSeats(String FlightNo1, String Origin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|OLD command to display the list of old seats");
            isharesPage3.displayListOfOldSeats(logInfo, FlightNo1, Origin);
            logInfo.pass("I enter 6:LD_|OLD command to display the list of old seats");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KSA command to Test Reseating options")
    public void enter_KSA_TestReseatingoptions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KSA command to Test Reseating options");
            isharesPage3.enterKSA_TestReseatingoptions(logInfo);
            logInfo.pass("I enter KSA command to Test Reseating options");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-Z command to Identify Dupe Seats")
    public void enter_6Z_IdentifyDupeSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-Z command to Identify Dupe Seats");
            isharesPage3.enter6Z_IdentifyDupeSeats(logInfo);
            logInfo.pass("I enter 6-Z command to Identify Dupe Seats");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for Delete Message From Multiple Items List")
    public void enter_command_DeleteMessageFromMultipleItemsList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Delete Message From Multiple Items List");
            isharesPage3.entercommand_DeleteMessageFromMultipleItemsList(logInfo);
            logInfo.pass("I enter command for Delete Message From Multiple Items List");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAHK command to Display {string}")
    public void enter_PAHK_Displaytable(String tableType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAHK command to Display " + tableType);
            isharesPage3.enterPAHK_Displaytable(logInfo, tableType);
            logInfo.pass("I enter PAHK command to Display " + tableType);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Miscellaneous Entries SHARES entries in Transformed")
    public void I_enter_run_the_miscellaneous_Entries_shares_entries_in_Transformed() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Miscellaneous Entries SHARES entries in Transformed");
            isharesPage3.miscellaneousEntriesShares(logInfo);
            logInfo.pass("I enter Run the Miscellaneous Entries SHARES entries in Transformed");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run ACI Control Functions-Release Specific Seats SHARES entries")
    public void I_enter_run_ACI_control_function_Release_Specific_seats_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run ACI Control Functions-Release Specific Seats SHARES entries");
            isharesPage3.runACIControlFunctionReleaseSpecificSeat(logInfo);
            logInfo.pass("I enter Run ACI Control Functions-Release Specific Seats SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run A Display notification of FQTV or other SSR sent SHARES")
    public void I_enter_run_a_display_notification_of_FQTV_or_other_SSR_sent_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run A Display notification of FQTV or other SSR sent SHARES");
            isharesPage3.aDisplayNotificationOfFQTV(logInfo);
            logInfo.pass("I enter Run A Display notification of FQTV or other SSR sent SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Collection of APIS Jumpseat Passenger details SHARES")
    public void I_enter_run_the_collection_of_APIS_jumpseat_Passenger_deatils_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Collection of APIS Jumpseat Passenger details SHARES");
            isharesPage3.theCollectionOfAPISJumpseatPassenger(logInfo);
            logInfo.pass("I enter Run the Collection of APIS Jumpseat Passenger details SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-CRW collection of APIs jumpseat")
    public void I_enter_6_CRW_collection_of_APIs_Jumpseat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CRW collection of APIs jumpseat");
            isharesPage3.enter6CRWColletionOfAPIs(logInfo);
            logInfo.pass("I enter 6-CRW collection of APIs jumpseat");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Modify ACI Status Remarks SHARES entries")
    public void I_enter_run_modify_ACI_Status_remarks_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Modify ACI Status Remarks SHARES entries");
            isharesPage3.modifyACIStatusRemarksSharesEntries(logInfo);
            logInfo.pass("I enter Run Modify ACI Status Remarks SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run PNR itinerary changes SHARES entries executed successfully")
    public void I_enter_Run_PNR_itinerary_changes_SHARES_entries_execute_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run PNR itinerary changes SHARES entries executed successfully");
            isharesPage3.runPNRItineraryChangesSharesEntries(logInfo);
            logInfo.pass("I enter Run PNR itinerary changes SHARES entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Cancel Advanced Seat Assignment SHARES entries executed successfully")
    public void I_enter_Run_Cancel_Advanced_Seat_Assignment_SHARES_entries_executed_successfully() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Cancel Advanced Seat Assignment SHARES entries executed successfully");
            isharesPage3.runCancelAdvancedSeatAssignmentShares(logInfo);
            logInfo.pass("I enter Run Cancel Advanced Seat Assignment SHARES entries executed successfully");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter run initiate stand by processing shares entries Transformed shares")
    public void I_enter_run_Initiate_stand_by_processing_shares_entries_Transformed_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter run initiate stand by processing shares entries Transformed shares");
            isharesPage3.initiateStandByProcessingShares(logInfo);
            logInfo.pass("I enter run initiate stand by processing shares entries Transformed shares");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Printer Attribute Record Table SHARES entries")
    public void I_enter_Run_the_Printer_Attribute_Record_Table_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Printer Attribute Record Table SHARES entries");
            isharesPage3.printerAttributeRecordTable(logInfo);
            logInfo.pass("I enter Run the Printer Attribute Record Table SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run ACI Control Functions Restore Connect Check_In SHARES")
    public void I_enter_Run_ACI_Control_Functions_Restore_Connect_Check_In_SHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run ACI Control Functions Restore Connect Check_In SHARES");
            isharesPage3.runACIControlFunctionRestoreConnect(logInfo);
            logInfo.pass("I enter Run ACI Control Functions Restore Connect Check_In SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run ACI Control Functions-Remove Restrict Boarding SHARES entries")
    public void I_enter_Run_ACI_Control_Functions_Remove_Restrict_Boarding_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run ACI Control Functions-Remove Restrict Boarding SHARES entries");
            isharesPage3.controlFunctionRemoveRestrictBoarding(logInfo);
            logInfo.pass("I enter Run ACI Control Functions-Remove Restrict Boarding SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run ACI Control Functions Cancel_Non Confirmed Pax to Standby List SHARES")
    public void I_enter_Run_ACI_Control_Functions_Cancel_Non_Confirmed_Pax_to_Standby_List_SHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run ACI Control Functions Cancel_Non Confirmed Pax to Standby List SHARES");
            isharesPage3.controlFunctionCancelNonConfimedPax(logInfo);
            logInfo.pass("I enter Run ACI Control Functions Cancel_Non Confirmed Pax to Standby List SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Baggage Control Table Updates SHARES entries")
    public void I_enter_Run_the_Baggage_Control_Table_Updates_SHARES_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Baggage Control Table Updates SHARES entries");
            isharesPage3.baggageControlTableUpdate(logInfo);
            logInfo.pass("I enter Run the Baggage Control Table Updates SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Default Record Processing Not Desired Indicator SHARES")
    public void I_enter_Run_Default_Record_Processing_Not_Desired_Indicator_SHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Default Record Processing Not Desired Indicator SHARES");
            isharesPage3.defaultRecordProcessingNotDesired(logInfo);
            logInfo.pass("I enter Run Default Record Processing Not Desired Indicator SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KN N Run Default Record Processing Desired")
    public void I_enter_KN_N_Run_Default_Record_Processing_Desired() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KN N Run Default Record Processing Desired");
            isharesPage3.enterKNNRunDefaultRecord(logInfo);
            logInfo.pass("I enter KN N Run Default Record Processing Desired");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run ACI Control Functions-Block Unblock Seats List SHARES")
    public void I_enter_Run_ACI_Control_Functions_Block_Unblock_Seats_List_SHARES() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run ACI Control Functions-Block Unblock Seats List SHARES");
            isharesPage3.runACIControlFunctionBlockUnblockSeats(logInfo);
            logInfo.pass("I enter Run ACI Control Functions-Block Unblock Seats List SHARES");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Inventory Control entries in Transformed SHARES")
    public void enter_RunInventoryControlentries445() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Inventory Control entries in Transformed SHARES");
            isharesPage3.RunInventoryControlentries445(logInfo);
            logInfo.pass("I enter command to Run Inventory Control entries in Transformed SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Reconcile Segment Sales for Entire Flight entries")
    public void enter_RunReconcileSegmentSales446() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Reconcile Segment Sales for Entire Flight entries");
            isharesPage3.RunReconcileSegmentSales446(logInfo);
            logInfo.pass("I enter command to Run Reconcile Segment Sales for Entire Flight entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Reconcile Segment Sales for One Flight All Days entries")
    public void enter_ReconcileSegmentSalesforOneFlight448() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Reconcile Segment Sales for One Flight All Days entries");
            isharesPage3.ReconcileSegmentSalesforOneFlight448(logInfo);
            logInfo.pass("I enter command to Run Reconcile Segment Sales for One Flight All Days entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run KKUTIL Inventory Discrepancies Auto-Fix Utility Maintenance entries {string}")
    public void KKUTILInventoryDiscrepancies449(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run KKUTIL Inventory Discrepancies Auto-Fix Utility Maintenance entries " + entry);
            isharesPage3.KKUTILInventoryDiscrepancies449(logInfo, entry);
            logInfo.pass("I enter command to Run KKUTIL Inventory Discrepancies Auto-Fix Utility Maintenance entries " + entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Updating OA Flight Status in HA Data Base entries")
    public void enter_UpdatingOAFlightStatusinHADataBaseentries450() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Updating OA Flight Status in HA Data Base entries");
            isharesPage3.UpdatingOAFlightStatusinHADataBaseentries450(logInfo);
            logInfo.pass("I enter command to Run Updating OA Flight Status in HA Data Base entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Standard Format Reverse AVS Recap entries")
    public void enter_StandardFormatReverseAVSRecapentries453() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Standard Format Reverse AVS Recap entries");
            isharesPage3.StandardFormatReverseAVSRecapentries453(logInfo);
            logInfo.pass("I enter command to Run Standard Format Reverse AVS Recap entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Enhanced Format Regular AVS Recap entries")
    public void enter_EnhancedFormatRegularAVSRecap454() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Enhanced Format Regular AVS Recap entries");
            isharesPage3.EnhancedFormatRegularAVSRecap454(logInfo);
            logInfo.pass("I enter command to Run Enhanced Format Regular AVS Recap entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Enhanced Format Reverse AVS Recap entries")
    public void enter_EnhancedFormatReverseAVSRecap456() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Enhanced Format Reverse AVS Recap entries");
            isharesPage3.EnhancedFormatReverseAVSRecap456(logInfo);
            logInfo.pass("I enter command to Run Enhanced Format Reverse AVS Recap entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Enhanced Format Reverse AVS Recap With Multiple Addresses entries")
    public void enter_EnhancedFormatReverseAVS_RecapWithMultipleAddresses() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Enhanced Format Reverse AVS Recap With Multiple Addresses entries");
            isharesPage3.EnhancedFormatReverseAVS_RecapWithMultipleAddresses(logInfo);
            logInfo.pass("I enter command to Run Enhanced Format Reverse AVS Recap With Multiple Addresses entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Error Responses for Enhanced AVS Recaps entries")
    public void enter_RunErrorResponsesforEnhancedAVS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Error Responses for Enhanced AVS Recaps entries");
            isharesPage3.RunErrorResponsesforEnhancedAVS(logInfo);
            logInfo.pass("I enter command to Run Error Responses for Enhanced AVS Recaps entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run K9 Request RAS for OA AVS Recap Of Availability Status Messages entries")
    public void enter_RunK9Request() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run K9 Request (RAS)for OA AVS Recap Of Availability Status Messages entries");
            isharesPage3.RunK9Request(logInfo);
            logInfo.pass("I enter command to Run K9 Request (RAS)for OA AVS Recap Of Availability Status Messages entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run RVR Request to OA for OA AVA Recap of Numeric AVA Messages entries")
    public void enter_RunRVRRequesttoOAforOAAVARecap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run RVR Request to OA for OA AVA Recap of Numeric AVA Messages entries");
            isharesPage3.RunRVRRequesttoOAforOAAVARecap(logInfo);
            logInfo.pass("I enter command to Run RVR Request to OA for OA AVA Recap of Numeric AVA Messages entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Add an item with timeframe as DOF entries")
    public void enter_AddanitemwithtimeframeasDOF() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Add an item with timeframe as DOF entries");
            isharesPage3.AddanitemwithtimeframeasDOF(logInfo);
            logInfo.pass("I enter command to Run Add an item with timeframe as DOF entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Add an item with timeframe as numeric entries")
    public void enter_Addanitemwithtimeframeasnumericentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Add an item with timeframe as numeric entries");
            isharesPage3.Addanitemwithtimeframeasnumericentries(logInfo);
            logInfo.pass("I enter command to Run Add an item with timeframe as numeric entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Change an item with timeframe as DOF entries")
    public void enter_ChangeanitemwithtimeframeasDOF() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Change an item with timeframe as DOF entries");
            isharesPage3.ChangeanitemwithtimeframeasDOF(logInfo);
            logInfo.pass("I enter command to Run Change an item with timeframe as DOF entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Add Change and delete an item with timeframe as numeric entries")
    public void enter_AddChangeDeleteanitemwithtimeframeasnumericentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Add Change and delete an item with timeframe as numeric entries");
            isharesPage3.Addanitemwithtimeframeasnumericentries(logInfo);
            logInfo.pass("I enter command to Run Add Change and delete an item with timeframe as numeric entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Define Scattered Desirable Seating SHARES entries")
    public void enter_DefineScatteredDesirableSeating() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Define Scattered Desirable Seating SHARES entries");
            isharesPage3.DefineScatteredDesirableSeating(logInfo);
            logInfo.pass("I enter command to Run Define Scattered Desirable Seating SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Define Permanently Blocked Seats SHARES entries")
    public void enter_DefinePermanentlyBlockedSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Define Permanently Blocked Seats SHARES entries");
            isharesPage3.DefinePermanentlyBlockedSeats(logInfo);
            logInfo.pass("I enter command to Run Define Permanently Blocked Seats SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Define Undesirable Seats SHA SHARES entries")
    public void enter_DefineUndesirableSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Define Undesirable Seats SHA SHARES entries");
            isharesPage3.DefineUndesirableSeats(logInfo);
            logInfo.pass("I enter command to Run Define Undesirable Seats SHA SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Modify Smoking_Non-Smoking Seats_Rows SHARES entries")
    public void enter_ModifySmoking_NonSmokingSeats_Rows() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Modify Smoking_Non-Smoking Seats_Rows SHARES entries");
            isharesPage3.ModifySmoking_NonSmokingSeats_Rows(logInfo);
            logInfo.pass("I enter command to Run Modify Smoking_Non-Smoking Seats_Rows SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Modify Infant Seats SHARES entries")
    public void enter_ModifyInfantSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Modify Infant Seats SHARES entries");
            isharesPage3.ModifyInfantSeats(logInfo);
            logInfo.pass("I enter command to Run Modify Infant Seats SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Modify Incapacitated Seats SHARES entries")
    public void enter_ModifyIncapacitatedSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Modify Incapacitated Seats SHARES entries");
            isharesPage3.ModifyIncapacitatedSeats(logInfo);
            logInfo.pass("I enter command to Run Modify Incapacitated Seats SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Modify Preferred Seats SHARES entries")
    public void enter_ModifyPreferredSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Modify Preferred Seats SHARES entries");
            isharesPage3.ModifyPreferredSeats(logInfo);
            logInfo.pass("I enter command to Run Modify Preferred Seats SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run Modify Trim Bays SHARES entries")
    public void enter_ModifyTrimBays() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Modify Trim Bays SHARES entries");
            isharesPage3.ModifyTrimBays(logInfo);
            logInfo.pass("I enter command to Run Modify Trim Bays SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run command to Add Split Party Processing SHARES entries")
    public void enter_AddSplitPartyProcessing() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run command to Add Split Party Processing SHARES entries");
            isharesPage3.AddSplitPartyProcessing(logInfo);
            logInfo.pass("I run command to Add Split Party Processing SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run command to Add Message SHA SHARES entries")
    public void enter_AddMessageSHASHARESentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run command to Add Message SHA SHARES entries");
            isharesPage3.AddMessageSHASHARESentries(logInfo);
            logInfo.pass("I run command to Add Message SHA SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run add item with GDS_OA code {string} and its BUSID {string} entries in DFS table")
    public void enter_additemwithGDS_OAcodeBUSID_DFS(String gdsoa, String busid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run add item with GDS_OA code " + gdsoa + " and its BUSID " + busid + " entries in DFS table");
            isharesPage3.additemwithGDS_OAcodeBUSID_DFS(logInfo, gdsoa, busid);
            logInfo.pass("I enter command to run add item with GDS_OA code " + gdsoa + " and its BUSID " + busid + " entries in DFS table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run add item with GDS_OA code {string} and its BUSID {string} entries in FCB table")
    public void enter_additemwithGDS_OAcodeBUSID_FCB(String gdsoa, String busid) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run add item with GDS_OA code " + gdsoa + " and its BUSID " + busid + " entries in FCB table");
            isharesPage3.additemwithGDS_OAcodeBUSID_FCB(logInfo, gdsoa, busid);
            logInfo.pass("I enter command to run add item with GDS_OA code " + gdsoa + " and its BUSID " + busid + " entries in FCB table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run Add Modify delete Cancel Abort Finalize item to APIS Country Code Table")
    public void enter_AddModifydeleteCancelAbortFinalizeitemtoAPISCountryCodeTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run Add Modify delete Cancel Abort Finalize item to APIS Country Code Table");
            isharesPage3.AddModifydeleteCancelAbortFinalizeitemtoAPISCountryCodeTable(logInfo);
            logInfo.pass("I enter command to run Add Modify delete Cancel Abort Finalize item to APIS Country Code Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run List the Flight Numbers of Segment{string}")
    public void I_enter_Run_List_the_Flight_Numbers_of_Segment(String ItemNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run List the Flight Numbers of Segment");
            isharesPage3.runListTheFlightNumbers(logInfo, ItemNo);
            logInfo.pass("I enter Run List the Flight Numbers of Segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the MISCELLANEOUS ONLINE CODES SHARES {string} {string}")
    public void I_enter_Run_the_MISCELLANEOUS_ONLINE_CODES_SHARES(String COS, String COS1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the MISCELLANEOUS ONLINE CODES SHARES");
            isharesPage3.enterRunTheMiscellaneousOnlineCode(logInfo, COS, COS1);
            logInfo.pass("I enter Run the MISCELLANEOUS ONLINE CODES SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the NEW SPACE REPLY TYPE SHARES {string}")
    public void I_enter_Run_the_NEW_SPACE_REPLY_TYPE_SHARES(String COS) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the NEW SPACE REPLY TYPE SHARES");
            isharesPage3.runTheNewSpaceReplyType(logInfo, COS);
            logInfo.pass("I enter Run the NEW SPACE REPLY TYPE SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Verify AppSwitch SCOP6 bit 5 functionality")
    public void I_enter_Verify_AppSwitch_bit_5_functionality() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Verify AppSwitch SCOP6 bit 5 functionality");
            isharesPage3.verifyAppSwitchSCOP6Bit5Functionality(logInfo);
            logInfo.pass("I enter Verify AppSwitch SCOP6 bit 5 functionality");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter verify AppSwitch ASWP")
    public void I_enter_verify_AppSwitch_ASWP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter verify AppSwitch ASWP");
            isharesPage3.enterVerifyAppSwitchASWP(logInfo);
            logInfo.pass("I enter verify AppSwitch ASWP");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-CH command Display final Crew report")
    public void iEnter6_CHcommandToDisplayFinalCrewReport() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CH command Display final Crew report");
            isharesPage3.displayFinalCrewReport(logInfo);
            logInfo.pass("I enter 6-CH command Display final Crew report");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command create PNR and add FOP")
    public void iEntercommandsToCreatePNRandAddFOP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command create PNR and add FOP");
            isharesPage3.createPNRAndAddFOP(logInfo);
            logInfo.pass("I enter command create PNR and add FOP");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7TAM command to display Ticketing Information entries")
    public void iEnterTAMCommandToDisplayTicketingInformationEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7TAM command to display Ticketing Information entries");

            isharesPage3.displayTicketingInformation(logInfo);
            logInfo.pass("I enter 7TAM command to display Ticketing Information entries");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QF command to display special routing user for {string}")
    public void iEnterTAMCommandToDisplaySpecialRoutingUser(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QF command to display special routing user for " + city);

            isharesPage3.displaySpecialRoutingUser(logInfo, city);
            logInfo.pass("I enter QF command to display special routing user for " + city);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-I command to display SSR Inventory Control Table")
    public void iEnterK_ICommandToDisplaySSRInventoryControlTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-I command to display SSR Inventory Control Table");

            isharesPage3.displaySSRInventoryControlTable(logInfo);
            logInfo.pass("I enter K-I command to display SSR Inventory Control Table");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-DWC command to Create Denied Boarding Pass Worksheet With Passenger Name")
    public void iEnter6_DWCommandToCreateDeniedBoardingPassWorksheetWithPassengerName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-DWC command to Create Denied Boarding Pass Worksheet With Passenger Name");
            isharesPage3.createDeniedBoardingPassWorksheetWithPassengerName(logInfo);
            logInfo.pass("I enter 6-DWC command to Create Denied Boarding Pass Worksheet With Passenger Name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-DW command to display Denied Boarding Pass Worksheet")
    public void iEnter6_DWCommandToDisplayDeniedBoardingPassWorksheet() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-DW command to display Denied Boarding Pass Worksheet");
            isharesPage3.displayDeniedBoardingPassWorksheet(logInfo);
            logInfo.pass("I enter 6-DW command to display Denied Boarding Pass Worksheet");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-DW command to Create Denied Boarding Pass Worksheet")
    public void iEnter6_DWommandToCreateDeniedBoardingPassWorksheet() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-DWC command to Create Denied Boarding Pass Worksheet");
            isharesPage3.createDeniedBoardingPassWorksheet(logInfo);
            logInfo.pass("I enter 6-DW command to Create Denied Boarding Pass Worksheet");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-*H command to display flight history")
    public void iEnter6_HcommandToDisplayFlightHistory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-*H command to display flight history");
            isharesPage3.displayFlightHistory(logInfo);
            logInfo.pass("I enter 6-*H command to display flight history");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-ZH command to display PNIS Record of flight")
    public void iEnter6_ZHcommandToDisplayPNISRecordOfFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-ZH command to display PNIS Record of flight");
            isharesPage3.displayPNISRecordOfFlight(logInfo);
            logInfo.pass("I enter 6-ZH command to display PNIS Record of flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EB command to add newly created ETKT index items")
    public void iEnterEBcommandToAddNewlyCreatedETKTIndexItems() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EB command to add newly created ETKT index items");
            isharesPage3.addNewlyCreatedETKTIndexItems(logInfo);
            logInfo.pass("I enter *EB command to add newly created ETKT index items");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter commands to create PNR")
    public void iEntercommandsToCreatePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter commands to create PNR");
            isharesPage3.commandToCreatePNR(logInfo);
            logInfo.pass("I enter commands to create PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET command for OA ETKT Eligibility")
    public void iEnterTETcommandForOAETKTEligibility() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET command for OA ETKT Eligibility");
            isharesPage3.oAETKTEligibility(logInfo);
            logInfo.pass("I enter T-ET command for OA ETKT Eligibility");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6AA command to create PNR")
    public void iEnter6AAcommandToCreatePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6AA commands to create PNR");
            isharesPage3.enter6AAToCreatePNR(logInfo);
            logInfo.pass("I enter 6AA commands to create PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter commands to run ETKT out of sync to Queue user")
    public void iEntercommandsToRunETKTOutOfSyncToQueueUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter commands to run ETKT out of sync to Queue user");
            isharesPage3.runETKTOutOfSyncToQueueUser(logInfo);
            logInfo.pass("I enter commands to run ETKT out of sync to Queue user");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-AMAA_ to add entries to PCH Table")
    public void I_enter_K_T_AMAA_to_add_entries_to_PCH_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-AMAA_ to add entries to PCH Table");
            isharesPage3.enterKTAMAA(logInfo);
            logInfo.pass("I enter K-T-AMAA_ to add entries to PCH Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I run the command to display cut off time and initialize restriction table modifications")
    public void iRunTheCommandToDisplayCutOffTimeAndInitializeRestrictionTableModifications() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the command to display cut off time and initialize restriction table modifications");
            isharesPage3.displayCutOffTimeAndInitialiseRestrictionTableModification(logInfo);
            logInfo.pass("I run the command to display cut off time and initialize restriction table modifications");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CLR*CLS command to display system default class percentage")
    public void iEnterCLRCLSCommandToDisplaySystemDefaultClassPercentage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CLR*CLS command to display system default class percentage");
            isharesPage3.displaySystemDefaultClassPercentage(logInfo);
            logInfo.pass("I enter 6:CLR*CLS command to display system default class percentage");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR_AVS_*_ command to display Inbound AVS Exception table for OA carrier code")
    public void iEnterKR_AVS__CommandToDisplayInboundAVSExceptionTableForOACarrierCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR_AVS_*_ command to display Inbound AVS Exception table for OA carrier code");
            isharesPage3.displayInbounAVSExceptionTableForOACarrierCode(logInfo);
            logInfo.pass("I enter KR_AVS_*_ command to display Inbound AVS Exception table for OA carrier code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIAFR_ command to restart PFS processing for Inbound IATA messages display table")
    public void iEnterPIAFR_CommandToRestartPFSProcessingForInboundIATAMessagesDisplayTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIAFR_ command to restart PFS processing for Inbound IATA messages display table");
            isharesPage3.restartPFSProcessingForInboundIATAMessagesDisplayTable(logInfo);
            logInfo.pass("I enter PIAFR_ command to restart PFS processing for Inbound IATA messages display table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR_DFS_* command to run table display function entries in GDS or OA BUSID DFS AVAIL Table")
    public void iEnterKR_DFS_CommandToRunTableDisplayFunctionEntriesInGDSOrOABUSIDDFSAVAILTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR_DFS_* command to run table display function entries in GDS or OA BUSID DFS AVAIL Table");
            isharesPage3.displayFunctionEntriesInGDSOrOABUSIDDFSAVAILTable(logInfo);
            logInfo.pass("I enter KR_DFS_* command to run table display function entries in GDS or OA BUSID DFS AVAIL Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIATUT_|@_ command to run the single third party delete entry")
    public void iEnterPIATUT__CommandToRunTheSingleThirdPartyDeleteEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIATUT_|@_ command to run the single third party delete entry");
            isharesPage3.runTheSingleThirdPartyDeleteEntry(logInfo, isharesPage3.runThirdPartyAddEntryForTwoAirlineCodes(logInfo));
            logInfo.pass("I enter PIATUT_|@_ command to run the single third party delete entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIATUT_|@_ command to run the multiple third party delete entry")
    public void iEnterPIATUT__CommandToRunTheMultipleThirdPartyDeleteEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIATUT_|@_ command to run the multiple third party delete entry");
            isharesPage3.runTheMultipleThirdPartyDeleteEntry(logInfo, isharesPage3.runThirdPartyAddEntryForThreeAirlineCodes(logInfo));
            logInfo.pass("I enter PIATUT_|@_ command to run the multiple third party delete entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR_FCB_* command to run table display function entries in GDS or OA BUSID FCB AVAIL Table")
    public void iEnterKR_FCB_CommandToRunTableDisplayFunctionEntriesInGDSOrOABUSIDFCBAVAILTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR_FCB_* command to run table display function entries in GDS or OA BUSID FCB AVAIL Table");
            isharesPage3.displayFunctionEntriesInGDSOrOABusidFCBAvailTable(logInfo);
            logInfo.pass("I enter KR_FCB_* command to run table display function entries in GDS or OA BUSID FCB AVAIL Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAA*P command to display APIS Timer Trigger table")
    public void iEnterPAAPCommandToDisplayAPISTimerTriggerTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA*P command to display APIS Timer Trigger table");
            isharesPage3.displayAPISTimerTriggerTable(logInfo);
            logInfo.pass("I enter PAA*P command to display APIS Timer Trigger table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAI|P|XXXX command to initialise the APIS Timer Trigger table")
    public void iEnterPAAIPXXXXCommandToInitialiseTheTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAI|P|XXXX command to initialise the APIS Timer Trigger table");
            isharesPage3.initialiseAPISTimerTriggerTable(logInfo);
            logInfo.pass("I enter PAAI|P|XXXX command to initialise the APIS Timer Trigger table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAX|P command to cancel the APIS Timer Trigger table update")
    public void iEnterPAAXPCommandToCancelTheAPISTimerTriggerTableUpdate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAX|P command to cancel the APIS Timer Trigger table update");
            isharesPage3.cancelAPISTimerTriggerTableUpdate(logInfo);
            logInfo.pass("I enter PAAX|P command to cancel the APIS Timer Trigger table update");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAF|P command to finalize the updates on the APIS Timer Trigger table update")
    public void iEnterPAAFPCommandToFinalizeTheUpdatesOnTheAPISTimerTriggerTableUpdate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAF|P command to finalize the updates on the APIS Timer Trigger table update");
            isharesPage3.finalizeTheUpdatesOnAPISTimerTriggerTable(logInfo);
            logInfo.pass("I enter PAAF|P command to finalize the updates on the APIS Timer Trigger table update");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CNR* command to display revenue standby priority table")
    public void iEnterCNRCommandToDisplayRevenueStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNR* command to display revenue standby priority table");
            isharesPage3.displayRevenueStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6:CNR* command to display revenue standby priority table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CNRI command to initialize revenue standby priority table")
    public void iEnterCNRICommandToInitializeRevenueStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNRI command to initialize revenue standby priority table");
            isharesPage3.initializeRevenueStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6:CNRI command to initialize revenue standby priority table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CNRA_ command to add upgrade code to revenue standby priority table")
    public void iEnterCNRA_CommandToAddUpgradeCodeToRevenueStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNRA_ command to add upgrade code to revenue standby priority table");
            isharesPage3.addUpgradeCodeToRevenueStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6:CNRA_ command to add upgrade code to revenue standby priority table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CNRF command to finalize the revenue standby priority table")
    public void iEnterCNRFCommandToFinalizeTheRevenueStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNRF command to finalize the revenue standby priority table");
            isharesPage3.finalizeTheRevenueStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6:CNRF command to finalize the revenue standby priority table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CNRX command to cancel revenue standby priority table table modifications")
    public void iEnterCNRXCommandToCancelRevenueStandbyPriorityTableTableModifications() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNRX command to cancel revenue standby priority table table modifications");
            isharesPage3.cancelRevenueStandbyPriorityTableModifications(logInfo);
            logInfo.pass("I enter 6:CNRX command to cancel revenue standby priority table table modifications");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CN* command to display standby priority table")
    public void iEnterCNCommandToDisplayStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CN* command to display standby priority table");
            isharesPage3.displayStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6:CN* command to display standby priority table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:CNA_ command to add a Pass Code to The Standby Priority Table")
    public void iEnterCNA_CommandToAddAPassCodeToTheStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CN* command to display standby priority table");
            isharesPage3.addAPassCodeToStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6:CN* command to display standby priority table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIATUT_ command to run the third party add entry to add three airline codes")
    public void iEnterPIATUT_CommandToRunTheThirdPartyAddEntryForThreeAirlineCodes() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIATUT_ command to run the third party add entry to add three airline codes");
            isharesPage3.runTheMultipleThirdPartyDeleteEntry(logInfo, isharesPage3.runThirdPartyAddEntryForThreeAirlineCodes(logInfo));
            logInfo.pass("I enter PIATUT_ command to run the third party add entry to add three airline codes");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAM|M|_TRUY command to modify the item number {string} in the APIS Market Table using THRU indicator")
    public void iEnterPAAMMTRUYCommandToModifyTheItemNumberInAPISMarketTableUsingTHRUIndicator(String itemNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAM|M|_TRUY command to modify the item number in APIS Market Table using THRU indicator");
            isharesPage3.modifyAPISMarketTableUsingTHRUIndicator(logInfo, itemNumber);
            logInfo.pass("I enter PAAM|M|_TRUY command to modify the item number in APIS Market Table using THRU indicator");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAD|M|_ to delete the item number {string} in the APIS Market Table")
    public void iEnterPAADM_ToDeleteTheItemNumberInTheAPISMarketTable(String itemNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAD|M|_ to delete the item number in the APIS Market Table");
            isharesPage3.deleteItemNumberInAPISMarketTable(logInfo, itemNumber);
            logInfo.pass("I enter PAAD|M|_ to delete the item number in the APIS Market Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:K_ command to perform standby clearance for a flight")
    public void iEnterK_CommandToPerformStandbyClearanceForAFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:K_ command to perform standby clearance for a flight");
            isharesPage3.performStandbyClearanceForAFlight(logInfo);
            logInfo.pass("I enter 6:K_ command to perform standby clearance for a flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*K_ command to enable standby boarding")
    public void iEnterK_CommandToEnableStandbyBoarding() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*K_ command to enable standby boarding");
            isharesPage3.enableStandbyBoarding(logInfo);
            logInfo.pass("I enter 6:*K_ command to enable standby boarding");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-EA_ command to add SSR {string} to the PSC Exception Table")
    public void I_enter_KEA_command_to_add_SSR_to_PSC_Exception_Table(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KEA_ command to add SSR to PSC Exception Table");
            isharesPage3.addSSRToPSCExceptionTable(logInfo, SSR);
            logInfo.pass("I enter KEA_ command to add SSR to PSC Exception Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add {string} to get error response as SSR not available")
    public void iAddToGetErrorResponseAsSSRNotAvailable(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add " + SSR + " to get error response as SSR not available");
            isharesPage3.enterSSRToShowNotAvailable(logInfo, SSR);
            logInfo.pass("I add " + SSR + " to get error response as SSR not available");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-EA_ command to add SSR {string} to the PSC Exception Table for a specific board and off point")
    public void iEnterKEA_CommandToAddSSRForASpecificBoardAndOffPoint(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KEA_ command to add SSR to PSC Exception Table for a specific board and off point");
            isharesPage3.addSSRToPSCExceptionTableForASpecificBoardAndOFFPoint(logInfo, SSR);
            logInfo.pass("I enter KEA_ command to add SSR to PSC Exception Table for a specific board and off point");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I capture the class of service to which the standby is added after checkin")
    public void iCaptureTheClassOfServiceToWhichTheStandbyIsAddedAfterCheckin() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture the class of service to which the standby is added after checkin");
            isharesPage3.captureTheCOSToWhichTheStandbyIsAddedAfterCheckin(logInfo);
            logInfo.pass("I capture the class of service to which the standby is added after checkin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-TESTATB_ command to enter diagnostic print entry")
    public void iEnterTTESTATB_CommandToEnterDiagnosticPrintEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-TESTATB_ command to enter diagnostic print entry");
            isharesPage3.enterDiagnosticPrintEntry(logInfo);
            logInfo.pass("I enter T-TESTATB_ command to enter diagnostic print entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAE*D command to display Special Bag Tag Print table")
    public void iEnterPAEDCommandToDisplaySpecialBagTagPrintTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAE*D command to display Special Bag Tag Print table");
            isharesPage3.displaySpecialBagTagPrintTable(logInfo);
            logInfo.pass("I enter PAE*D command to display Special Bag Tag Print table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EI-_ command to run the ETKT re-index function")
    public void iEnterEI_CommandToRunTheETKTReIndexFunction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EI-_ command to run the ETKT re-index function");
            isharesPage3.reIndexETKT(logInfo);
            logInfo.pass("I enter *EI-_ command to run the ETKT re-index function");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T_MTB_A_, T_MTB* and T_MTB_D_ commands to add, display and delete passenger type code from the passenger type code table")
    public void iEnterT_MTB_A_AndT_MTB_D_CommandsToAddAndDeletePassengerTypeCodeFromThePassengerTypeCodeTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_MTB_A_, T_MTB* and T_MTB_D_ commands to add, display and delete passenger type code from the passenger type code table");
            isharesPage3.addDisplayAndDeletePassengerTypeCodeFromTheTable(logInfo);
            logInfo.pass("I enter T_MTB_A_, T_MTB* and T_MTB_D_ commands to add, display and delete passenger type code from the passenger type code table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 9_@ command to add and remove the phone numbers")
    public void iEnter_CommandToAddAndRemoveThePhoneNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 9_@ command to add and remove the phone numbers");
            isharesPage3.addAndRemovePhoneNumbers(logInfo);
            logInfo.pass("I enter 9_@ command to add and remove the phone numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T- command to run the add partner carrier Input FQTV field Separator")
    public void iEnterKTPARTNER_CommandToRunTheAddPartnerCarrierInputFQTVFieldSeparator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-PARTNER_ command to run the add partner carrier Input FQTV field Separator");
            isharesPage3.enterKTCommandToAddPartnerCarrierInputFQTVSeparator(logInfo);
            logInfo.pass("I enter K-T-PARTNER_ command to run the add partner carrier Input FQTV field Separator");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-EA_ to add {string} to PSC  Exception Table")
    public void iEnterKEA_ToAddToPSCExceptionTable(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-EA_ to add " + SSR + " to PSC  Exception Table");
            isharesPage3.enterKEAToAddSSRToPSCExceptionTable(logInfo, SSR);
            logInfo.pass("I enter K-EA_ to add " + SSR + " to PSC  Exception Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I delete {string} in PSC Exception Table")
    public void iDeleteInPSCExceptionTable(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete " + SSR + " in PSC Exception Table");
            isharesPage3.enterK_EDToDeleteSSRFromPSCExceptionTable(logInfo, SSR);
            logInfo.pass("I delete " + SSR + " in PSC Exception Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run form of payment Shares entry")
    public void iRunFormOfPaymentSharesEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run form of payment Shares entry");
            isharesPage3.enterFormOfPaymentSharesEntries(logInfo);
            logInfo.pass("I run form of payment Shares entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I run formatted REMARKS Shares entries")
    public void iRunFormattedREMARKSSharesEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run formatted REMARKS Shares entries");
            isharesPage3.enterFormattedREMARKSSharesEntries(logInfo);
            logInfo.pass("I run formatted REMARKS Shares entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I add the Ticketing Remarks for Original Issue")
    public void iAddTheTicketingRemarksForOriginalIssue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add the Ticketing Remarks for Original Issue");
            isharesPage3.addRemarksForOriginalIssue(logInfo);
            logInfo.pass("I add the Ticketing Remarks for Original Issue");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *T to show Ticketing Remarks in Original Issue")
    public void iEnterTToShowTicketingRemarksInOriginalIssue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *T to show Ticketing Remarks in Original Issue");
            isharesPage3.enterTToShowRemarksForOriginalIssue(logInfo);
            logInfo.pass("I enter *T to show Ticketing Remarks in Original Issue");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-RA command to add REMARKS {string} in original issue")
    public void iEnterTRACommandToAddREMARKSInOriginalIssue(String remarks) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-RA command to add REMARKS " + remarks + " in original issue");
            isharesPage3.enterRemarks(logInfo, remarks);
            logInfo.pass("I enter T-RA command to add REMARK " + remarks + " in original issue");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I delete all the Remarks added")
    public void iDeleteAllTheRemarksAdded() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I delete all the Remarks added");
            isharesPage3.deleteRemarks(logInfo);
            logInfo.pass("I delete all the Remarks added");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:TM to add message {string}")
    public void iEnterTMToAddMessage(String msg) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM to add message");
            isharesPage3.enter6TMToAddMessage(logInfo, msg);
            logInfo.pass("I enter 6:TM to add message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:TM_#1@ to delete the messages")
    public void i_enter6TM_ToDeleteTheMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:TM_#1@ to delete the messages");
            isharesPage3.deleteMessages(logInfo);
            logInfo.pass("I enter 6:TM_#1@ to delete the messages");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Paper ticketed destination passenger list with alternate flight and advancedSeat {string}")
    public void enter_Paperticketeddestination_Passengerlist_withalternateFlight_advancedSeat(String Entry1) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Paper ticketed destination passenger list with alternate flight and advancedSeat" + Entry1);
            isharesPage3.list_of_passengers_holding_alternateF_AdvancedSeat(logInfo, Entry1);
            logInfo.pass("I enter Paper ticketed destination passenger list with alternate flight and advancedSeat" + Entry1);

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CS_#NS command to display Smoking and NonSmoking Redefined {string}")
    public void iEnterCSN_SCommandToDisplaySmokingAndNonSmokingRedefined(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C command to display Smoking and Non-Smoking Redefined Status");
            isharesPage3.display_SmokingREDEFINEDStatus(logInfo, Entry);
            logInfo.pass("I enter 6:C command to display Smoking and Non-Smoking Redefined Status");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CW command to perform Boarding restriction {string}")
    public void Ienter6CWcommandtoperformBoardingrestriction(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CW command to perform Boarding restriction" + Entry);
            isharesPage3.toPerformBoardingRestriction(logInfo, Entry);
            logInfo.pass("I enter 6:CW command to perform Boarding restriction" + Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:* command to display the Vertical seatmap")
    public void I_enter_Command_to_display_the_Vertical_seatmap() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:* command to display the Vertical seatmap");
            isharesPage3.displayVerticalSeatMap(logInfo);
            logInfo.pass("I enter 6:* command to display the Vertical seatmap");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6- command to display status of the flight")
    public void iEnterCommandToDisplayStatusOfTheFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6- command to display status of the flight");
            isharesPage3.toDisplayStatusOfTheFlight(logInfo);
            logInfo.pass("I enter 6- command to display status of the flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter XI command to delete all segments from PNR")
    public void iEnterXICommandToDeleteAllSegmentsFromPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter XI command to delete all segments from PNR");
            isharesPage3.toDeleteAllSegmentsFromPNR(logInfo);
            logInfo.pass("I enter XI command to delete all segments from PNR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter D_ command to divide the PNR using the passengers count {string}")
    public void iEnterD_CommandToDivideThePNRUsingThePassengersCount(String Count) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter D_ command to divide the PNR using the passengers count {string}");
            isharesPage3.toDivideThePNRUsingThePassengersCount(logInfo, Count);
            logInfo.pass("I enter D_ command to divide the PNR using the passengers count {string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CX_ command to perform cancel and reinstate misconnect passengers from inbound CM flight")
    public void iEnterCX_CommandToPerformCancelAndReinstateMisconnectPassengersFromInboundCMFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CX_ command to perform cancel and reinstate misconnect passengers from inbound CM flight");
            isharesPage3.toCancelAndReinstateMisconnectPassengersFromInboundCMFlight(logInfo);
            logInfo.pass("I enter 6:CX_ command to perform cancel and reinstate misconnect passengers from inbound CM flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:I*F_ command to display Fleet Name Record By Tail Number{string} with seatmap type{string}")
    public void iEnterIF_CommandToDisplayFleetNameRecordByTailNumber(String segmentNo, String SeatMaptype) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:I*F_ command to display Fleet Name Record By Tail Number{string} with seatmap type{string}");
            isharesPage3.toDisplayFleetNameRecordByTailNumber(logInfo, segmentNo, SeatMaptype);
            logInfo.pass("I enter 6:I*F_ command to display Fleet Name Record By Tail Number{string} with seatmap type{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:I*IF_B command to display Ticket Baggage seat map")
    public void iEnterIIF_BCommandToDisplayTicketBaggageSeatMap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:I*IF_B command to display Ticket Baggage seat map");
            isharesPage3.toDisplayTicketBaggageSeatMap(logInfo);
            logInfo.pass("I enter 6:I*IF_B command to display Ticket Baggage seat map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to display Bag tag number and passenger sequence number")
    public void iEnterCommandToDisplayBagtagNumberAndPassengerSequenceNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display Bag tag number and passenger sequence number");

            isharesPage3.DisplayBagtagNumberAndPassengerSequenceNumber(logInfo);
            logInfo.pass("I enter command to display Bag tag number and passenger sequence number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to specify Total Fare in the ADD function of ACO")
    public void iEnterCommandToSpecifyTotalFareInTheAddFucntionOfACO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to specify Total Fare in the ADD fucntion of ACO");

            isharesPage3.addFunctionACO(logInfo);
            logInfo.pass("I enter command to specify Total Fare in the ADD fucntion of ACO");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add farequote and ticket PNR")
    public void iEnterCommandToAddFarequoteAndTicketPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add farequote and ticket PNR");

            isharesPage3.addFarequoteAndTicketPNR(logInfo);
            logInfo.pass("I enter command to add farequote and ticket PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Print auditor’s coupon when using other than OP or CC FOP")
    public void iEnterCommandToPrintAuditorsCouponWhenUsingOtherThanOPorCCFOP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Print auditor’s coupon when using other than OP or CC FOP");

            isharesPage3.printAuditorsCoupon(logInfo);
            logInfo.pass("I enter command to Print auditor’s coupon when using other than OP or CC FOP");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to ticket PNR by Cash")
    public void iEnterCommandToTicketPNRByCash() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to ticket PNR by Cash");

            isharesPage3.ticketPNRByCash(logInfo);
            logInfo.pass("I enter command to ticket PNR by Cash");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6PR command to save the transaction")
    public void iEnter6PRCommandToSaveTheTransaction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6PR command to save the transaction");

            isharesPage3.enter6PRCommandToSaveTheTransaction(logInfo);
            logInfo.pass("I enter 6PR command to save the transaction");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C-RMR command to display ACO RMR Master Record Table")
    public void iEnterC_RMRommandToDisplayAcoRMRmasterRecordTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C-RMR command to display ACO RMR Master Record Table");

            isharesPage3.displayAcoRMRMasterRecordTable(logInfo);
            logInfo.pass("I enter C-RMR command to display ACO RMR Master Record Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CA command to add the form of payment with Credit card and expiration date in ACO")
    public void iEnterCAommandToAdaTheFormOfPaymentWithCreditCardAndExpirationDateInACO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA command to add the form of payment with Credit card and expiration date in ACO");

            isharesPage3.addFopWithCreditCardAndExpirationDate(logInfo);
            logInfo.pass("I enter CA command to add the form of payment with Credit card and expiration date in ACO");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CD command to display the ticketing details in ACO")
    public void iEnterCDommandToDisplayTheTicketingDetailsInACO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CD command to display the ticketing details in ACO");

            isharesPage3.displayTicketingDetailsInACO(logInfo);
            logInfo.pass("I enter CD command to display the ticketing details in ACO");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C-C_VO command to void the ticket in ACO ticketing table for the sequence {string}")
    public void iEnterCC_VOcommandToVoidTheTicketInACOTicketingTableForTheSequence(String SEQ) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C-C_VO command to void the ticket in ACO ticketing table for the sequence " + SEQ);

            isharesPage3.voidTicketInACO(logInfo, SEQ);
            logInfo.pass("I enter C-C_VO command to void the ticket in ACO ticketing table for the sequence " + SEQ);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add printer item in table")
    public void iEntercommandToAddPrinterItemInTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add printer item in table");

            isharesPage3.addPrinterItemInTable(logInfo);
            logInfo.pass("I enter command to add printer item in table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter long sell command for PD")
    public void iEnterLongSellcommandToForPD() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long sell command for PD");

            isharesPage3.longSellCmdForPD(logInfo);
            logInfo.pass("I enter long sell command for PD");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter commands to create PNR with DBC Voucher User")
    public void iEntercommandToCreatePNRWithDBCVoucherUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter commands to create PNR with DBC Voucher User");

            isharesPage3.createPNRWithDBCVoucherUser(logInfo);
            logInfo.pass("I enter commands to create PNR with DBC Voucher User");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML commands to Change the ESR Expected Marginal Seat Revenue in inventory")
    public void iEnterVMLcommandToChangeTheESRExpectedMarginalSeatRevenueInInventory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML commands to Change the ESR Expected Marginal Seat Revenue in inventory");

            isharesPage3.changeTheESRInInventory(logInfo);
            logInfo.pass("I enter VML commands to Change the ESR Expected Marginal Seat Revenue in inventory");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CLR commands to enable class percentage restriction during advance seat assignment")
    public void iEnter6_CLRcommandToEnableClassPercentageRestrictionDuringAdvanceSeatAssignment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CLR commands to enable class percentage restriction during advance seat assignment");

            isharesPage3.classPercentageRestricyionASA(logInfo);
            logInfo.pass("I enter 6:CLR commands to enable class percentage restriction during advance seat assignment");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A command to validate ASA Restriction")
    public void iEnter6AcommandToValidateASARestriction() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A command to validate ASA Restriction");

            isharesPage3.validateASARestriction(logInfo);
            logInfo.pass("I enter 6:A command to validate ASA Restriction");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-C command to display OA Inbound connections")
    public void iEnter6_CcommandToDisplayOAInboundConnections() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-C command to display OA Inbound connections");
            isharesPage3.displayOAInboundConnections(logInfo);
            logInfo.pass("I enter 6-C command to display OA Inbound connections");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-C command to display OA Outbound connections")
    public void iEnter6_CcommandToDisplayOAOutboundConnections() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-C command to display OA Outbound connections");
            isharesPage3.displayOAOutboundConnections(logInfo);
            logInfo.pass("I enter 6-C command to display OA Outbound connections");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-$EE command to run even exhange entry")
    public void iEntercommandToRunEvenExchangeEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EE command to run even exhange entry");
            isharesPage3.runEvenExchangeEntry(logInfo);
            logInfo.pass("I enter T-$EE command to run even exhange entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C-BAL command to update TAR item as Zero amount for even exhange entry")
    public void iEnterC_BALcommandToUpdateTARItemAsZeroAmountForEvenExchangeEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C-BAL command to update TAR item as Zero amount for even exhange entry");
            isharesPage3.updateTARItemAsZeroAmount(logInfo);
            logInfo.pass("I enter C-BAL command to update TAR item as Zero amount for even exhange entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-FM command to assign Gate for Departure with gate number {string}")
    public void iEnter6_FMcommandToAssignGateForDepartureWithGateNumber(String gateNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-FM command to assign Gate for Departure with gate number " + gateNo);
            isharesPage3.assignGateForDeparture(logInfo, gateNo);
            logInfo.pass("I enter 6-FM command to assign Gate for Departure with gate number " + gateNo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-FM command to assign Gate for Arrival with gate number {string}")
    public void iEnter6_FMcommandToAssignGateForArrivalWithGateNumber(String gateNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-FM command to assign Gate for Arrival with gate number " + gateNo);
            isharesPage3.assignGateForArrival(logInfo, gateNo);
            logInfo.pass("I enter 6-FM command to assign Gate for Arrival with gate number " + gateNo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET command to adjust name of passenger for coupon {string} and pax {string}")
    public void iEnterT_ETcommandToAdjustThenameOfPassenger(String coupon, String paxNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET command to adjust name of passenger");
            isharesPage3.adjustNameOfPassenger(logInfo, coupon, paxNo);
            logInfo.pass("I enter T-ET command to adjust name of passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET* to perform ticket adjustment for segment")
    public void iEnterTETToPerformTicketAdjustment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET* to perform ticket adjustment");
            isharesPage3.performTicketAdjustment(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage2.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|SL command to display standby list by checkedin Transfer Passengers")
    public void iEnter6LD_SL_CICommandToDisplayStandbyListByCheckedinTransferPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SL command to display standby list by checkedin Transfer Passengers");
            isharesPage3.displayStandbyListByCheckedinTransferpassengers(logInfo);
            logInfo.pass("I enter 6:LD_|SL command to display standby list by checkedin Transfer Passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-KT command to Transfer Passengers")
    public void iEnter6KTCommandtoTransferPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-KT command to Transfer Passengers");
            isharesPage3.enter6KTCommandToTransferallpassengers(logInfo);
            logInfo.pass("I enter 6-KT command to Transfer Passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAV* command to display compartment table")
    public void iEnterPAVCommandToDisplayCompartmentTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAV* command to display compartment table");
            isharesPage3.enterPAVCommandToDisplayCompartmentTable(logInfo);
            logInfo.pass("I enter PAV* command to display compartment table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAA* command to display APIS Collection Screen {string}")
    public void iEnterPAACommandToDisplayAPISCollectionScreen(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA* command to display APIS Collection Screen ");
            isharesPage3.enterPAACommandToDisplayAPISCollectionScreen(logInfo, Entry);
            logInfo.pass("I enter PAA* command to display APIS Collection Screen ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KC_CQ_* command to display CITY QUEUE TABLE {string}")
    public void iEnterKCCQCommandToDisplayCITYQUEUETABLE(String City) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KC_CQ_* command to display CITY QUEUE TABLE ");
            isharesPage3.enterKCCQCommandToDisplayCITYQUEUETABLE(logInfo, City);
            logInfo.pass("I enter KC_CQ_* command to display CITY QUEUE TABLE ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:BF command to print boarding pass {string}")
    public void iEnterBFCommandToPrintBoardingPass(String BoardingPassType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:BF command to print boarding pass");
            isharesPage3.enterBFCommandToPrintBoardingPass(logInfo, BoardingPassType);
            logInfo.pass("I enter 6:BF command to print boarding pass");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CG command {string} remarks for board point")
    public void iAddRemarksForBoardPoint(String remarkType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I " + remarkType + " for board point");

            isharesPage3.RemarkToBoardPoint(logInfo, remarkType);
            logInfo.pass("I " + remarkType + " for board point");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:CG command {string} remarks for flight")
    public void iAddRemarksForflight(String remarkType) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I " + remarkType + " for flight");

            isharesPage3.RemarkToFlight(logInfo, remarkType);
            logInfo.pass("I " + remarkType + " for flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6-FM command to display Catering Information CAT")
    public void iEnterFMCommandToDisplayCateringInformationCAT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-FM command to display Catering Information CAT");

            isharesPage3.enterFMCommandToDisplayCateringInformationCAT(logInfo);
            logInfo.pass("I enter 6-FM command to display Catering Information CAT");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:FM command to perform Boarding Time Adjustment Factor for STD")
    public void iEnterFMCommandToPerformBoardingTimeAdjustmentFactor() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:FM command to perform Boarding Time Adjustment Factor");

            isharesPage3.enterFMCommandToPerformBoardingTimeAdjustmentFactor(logInfo);
            logInfo.pass("I enter 6:FM command to perform Boarding Time Adjustment Factor");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:FM command to perform Boarding Time Adjustment Factor for ETD")
    public void iEnterFMCommandToPerformBoardingTimeAdjustmentFactorForETD() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:FM command to perform Boarding Time Adjustment Factor for ETD");

            isharesPage3.iEnterFMCommandToPerformBoardingTimeAdjustmentFactorForETD(logInfo);
            logInfo.pass("I enter 6:FM command to perform Boarding Time Adjustment Factor for ETD");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:FM command to perform Perform airport information in flight check-in display for {string}")
    public void iEnterFMCommandToPerformPerformAirportInformationInFlightCheckInDisplayFor(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:FM command to perform Perform airport information in flight check-in display ");

            isharesPage3.enterFMCommandToPerformPerformAirportInformationInFlightCheckInDisplayFor(logInfo, Entry);
            logInfo.pass("I enter 6:FM command to perform Perform airport information in flight check-in display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_O command to display all TCR item associated to a LINATA {string}")
    public void iEnterTOCommandToDisplayAllTCRItemAssociatedToALINATA(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:FM command to perform Perform airport information in flight check-in display ");

            isharesPage3.enterTOCommandToDisplayAllTCRItemAssociatedToALINATA(logInfo, Entry);
            logInfo.pass("I enter 6:FM command to perform Perform airport information in flight check-in display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CA command {string}")
    public void iEnterCACommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CA command "+Entry);

            isharesPage3.enterCACommand(logInfo, Entry);
            logInfo.pass("I enter CA command "+Entry);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T_EQP command to display a selected Equipment Type Code {string}")
    public void iEnterTEQPCommandToDisplayASelectedEquipmentTypeCode(String EqpCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_EQP command to display a selected Equipment Type Code ");

            isharesPage3.enterTEQPCommandToDisplayASelectedEquipmentTypeCode(logInfo, EqpCode);
            logInfo.pass("I enter T_EQP command to display a selected Equipment Type Code ");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CK command to host standby passengers on hard block flights")
    public void iEnter6CKCommandTohoststandbypassengersonhardblockflights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CK command to host standby passengers on hard block flights");
            isharesPage3.hoststandbypassengersonhardblockflights(logInfo);
            logInfo.pass("I enter 6:CK command to host standby passengers on hard block flights");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CC command to restrict")
    public void iEnter6CCcommandtorestrict() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CC command to restrict");
            isharesPage3.toFltRestrict(logInfo);
            logInfo.pass("I enter 6:CC command to restrict");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:PR command to display Reconcile Initiated")
    public void iEnter6PRcommandtodisplayReconcileInitiated() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PR command to display Reconcile Initiated");
            isharesPage3.displayReconcileInitiated(logInfo);
            logInfo.pass("I enter 6:PR command to display Reconcile Initiated");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6ZQPDQSTART command")
    public void Ienter6ZQPDQSTART() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6ZQPDQSTART command");
            isharesPage3.Ienter6ZQPDQSTART(logInfo);
            logInfo.pass("I enter 6ZQPDQSTART command");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:LD_|SB_ {string} command to display standby list for passenger")
    public void iEnterLD_SB_CommandToDisplayStandbyListForPassenger(String CmdCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SB command to display standby list for passenger");
            isharesPage3.displayStandByList_SB_CmdCode(logInfo, CmdCode);
            logInfo.pass("I enter 6:LD_|SB command to display standby list for passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|SEC command to display the list of match passengers")
    public void iEnterLD_SECCommandToDisplayTheListOfMatchPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SEC command to display the list of match passengers");
            isharesPage3.displaySEC_MatchPassengers(logInfo);
            logInfo.pass("I enter 6:LD_|SEC command to display the list of match passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|6A command to display passenger with a specific seat")
    public void iEnterLD_6ACommandToDisplayPassengerWithASpecificSeat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|6A command to display the specific seats");
            isharesPage3.displayPassengerWithASpecificSeat_6A(logInfo);
            logInfo.pass("I enter 6:LD_|6A command to display the specific seats");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|_SL command to display standby list")
    public void iEnterLD__SLCommandToDisplayStandbyList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SL command to display the specific seats");
            isharesPage3.displayStandByListSL(logInfo);
            logInfo.pass("I enter 6:LD_|SL command to display the specific seats");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|_SL_HK command to display standby list")
    public void iEnterLD__SLHKCommandToDisplayStandbyList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SL_HK command to display the seats");
            isharesPage3.displayStandbyHKSeats(logInfo);
            logInfo.pass("I enter 6:LD_|SL_HK command to display the seats");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CAAV COMMAND")
    public void enter_accesstoSHARESGDSSystemCVVcommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CAAV command");
            isharesPage3.accesstoSHARESGDSSystemCVVcommand(logInfo);
            logInfo.pass("I enter CAAV command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LD_|TB*PP command to display Presidential Elite Level Frequent Travelers")
    public void iEnterLD_TBPPCommandToDisplayPresidentialEliteLevelFrequentTravelers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|TB*PP command to display Presidential Elite Level Frequent Travelers");
            isharesPage3.enterLD_TBPPCommand(logInfo);
            logInfo.pass("I enter 6:LD_|TB*PP command to display Presidential Elite LevelFrequent  Travelers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check error messages for Encode Decode Flight Numbers")
    public void enter_accesstoSHARESGDSNegativeScn() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check error messages for Encode Decode Flight Numbers");
            isharesPage3.accesstoSHARESGDSNegativeScn(logInfo);
            logInfo.pass("I enter command to check error messages for Encode Decode Flight Numbers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check error messages for Credit Inquiries American Express")
    public void enter_errormessagesforCreditInquiries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check error messages for Credit Inquiries American Express");
            isharesPage3.errormessagesforCreditInquiries(logInfo);
            logInfo.pass("I enter command to check error messages for Credit Inquiries American Express");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check error messages for Credit Verification - CHASE")
    public void enter_errormessagesforCreditVerification() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check error messages for Credit Verification - CHASE");
            isharesPage3.errormessagesforCreditVerification(logInfo);
            logInfo.pass("I enter command to check error messages for Credit Verification - CHASE");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Add entry specifying all optional parameters SHARES entries")
    public void enter_Addentryspecifyingalloptionalparameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Add entry specifying all optional parameters SHARES entries");
            isharesPage3.Addentryspecifyingalloptionalparameters(logInfo);
            logInfo.pass("I enter command to Add entry specifying all optional parameters SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Add entry specifying only flight number parameter SHARES entries")
    public void enter_Addentryspecifyingonlyflightnumber_flightRange_parameter() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Add entry specifying only flight number Range parameter SHARES entries");
            isharesPage3.Addentryspecifyingonlyflightnumber_flightRange_parameter(logInfo);
            logInfo.pass("I enter command to Add entry specifying only flight number Range parameter SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Notification Via Supervisory QueueSHARES entries")
    public void I_enter_run_the_Notification_Via_Supervisory_QueueShares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Notification Via Supervisory QueueSHARES entries");
            isharesPage3.runTheNotificationViaSupervisory(logInfo);
            logInfo.pass("I enter Run the Notification Via Supervisory QueueSHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K7 Run the Availability Status Recap SHARES entries")
    public void I_enter_k7_run_the_Availability_Status_Recap_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K7 Run the Availability Status Recap SHARES entries");
            isharesPage3.enterK7RunTheAvailabilityStatusRecap(logInfo);
            logInfo.pass("I enter K7 Run the Availability Status Recap SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the IATA PNL Flight Detail Information Display SHARES")
    public void I_enter_run_the_IATA_PNL_Flight_Detail_information_Display_Shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the IATA PNL Flight Detail Information Display SHARES");
            isharesPage3.runTheIATAPNLFlightDeatilInformationDsiplay(logInfo);
            logInfo.pass("I enter Run the IATA PNL Flight Detail Information Display SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TC Run the Teletype Transfer for System Schedule Facts")
    public void I_enter_TC_Run_the_Teletype_Transfer_for_System_Schedule_Facts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TC Run the Teletype Transfer for System Schedule Facts");
            isharesPage3.enterTCRunTheTeletypeTransferForSystem(logInfo);
            logInfo.pass("I enter TC Run the Teletype Transfer for System Schedule Facts");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAO Run the Table Build and Maintenance entries in Tranformed SHARES {string}")
    public void IenterPAORuntheTableBuildandMaintenanceentriesinTranformedSHARES(String itemNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAO Run the Table Build and Maintenance entries in Tranformed SHARES");
            isharesPage3.PAORuntheTableBuildandMaintenance(logInfo, itemNo);
            logInfo.pass("I enter PAO Run the Table Build and Maintenance entries in Tranformed SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:I*F command to display Fleet Name List")
    public void iEnterIFCommandToDisplayFleetNameList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:I*F command to display Fleet Name List");
            isharesPage3.toDisplayFleetNameList(logInfo);
            logInfo.pass("I enter 6:I*F command to display Fleet Name List");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CD_ command to display flight or date the seat selection records using a given name")
    public void iEnterCD_CommandToDisplayFlightOrDateTheSeatSelectionRecordsUsingAGivenName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CD_ command to display flight or date the seat selection records using a given name");
            isharesPage3.toDisplayFlightOrDateTheSeatSelectionRecordsUsingAGivenName(logInfo);
            logInfo.pass("I enter 6:CD_ command to display flight or date the seat selection records using a given name");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CD_ command to add Fleet Name to Fleet Name List{string}")
    public void iEnterIF_CommandToAddFleetNameToFleetNameList(String fleetName) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CD_ command to add Fleet Name to Fleet Name List{string}");
            isharesPage3.toAddFleetNameToFleetNameList(logInfo, fleetName);
            logInfo.pass("I enter 6:CD_ command to add Fleet Name to Fleet Name List{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CD_ command to cancel Fleet Name to Fleet Name List{string}")
    public void iEnterIF_CommandToCancelFleetNameToFleetNameList(String fleetName) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CD_ command to cancel Fleet Name to Fleet Name List{string}");
            isharesPage3.toCancelFleetNameToFleetNameList(logInfo, fleetName);
            logInfo.pass("I enter 6:CD_ command to cancel Fleet Name to Fleet Name List{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CD_ command to add descriptive name to any Fleet Name item{string}")
    public void iEnterCD_CommandToAddDescriptiveNameToAnyFleetNameItem(String fleetName) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CD_ command to add descriptive name to any Fleet Name item{string}");
            isharesPage3.toAddDescriptiveNameToAnyFleetNameItem(logInfo, fleetName);
            logInfo.pass("I enter 6:CD_ command to add descriptive name to any Fleet Name item{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:KM command to run Standby Processing- Mass Seat Assignment")
    public void iEnterKMCommandToRunStandbyProcessingMassSeatAssignment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:KM command to run Standby Processing- Mass Seat Assignment");
            isharesPage3.toRunStandbyProcessingMassSeatAssignment(logInfo);
            logInfo.pass("I enter 6:KM command to run Standby Processing- Mass Seat Assignment");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-* command to verify error message for seatmap display with default seat type{string}")
    public void iEnterCommandToVerifyErrorMessageForSeatmapDisplayWithDefaultSeatType(String seatType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-* command to verify error message for seatmap display with default seat type{string}");
            isharesPage3.toVerifyErrorMessageForSeatmapDisplayWithDefaultSeatType(logInfo, seatType);
            logInfo.pass("I enter 6-* command to verify error message for seatmap display with default seat type{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for Specialized Copy and Move Functions")
    public void iEnterCommandToVerifyErrorMessagesForSpecializedCopyAndMoveFunctions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for Specialized Copy and Move Functions");
            isharesPage3.toVerifyErrorMessagesForSpecializedCopyAndMoveFunctions(logInfo);
            logInfo.pass("I enter command to verify error messages for Specialized Copy and Move Functions");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for DSP quick path entries")
    public void iEnterCommandToVerifyErrorMessagesForDSPQuickPathEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for DSP quick path entries");
            isharesPage3.toVerifyErrorMessagesForDSPQuickPathEntries(logInfo);
            logInfo.pass("I enter command to verify error messages for DSP quick path entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I do checkin for Shares PNR with baggage for Forced Sell check in with invalid format")
    public void iDoCheckinForSharesPNRWithBaggageForForcedSellCheckInWithInvalidFormat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I do checkin for Shares PNR with baggage for Forced Sell check in with invalid format");
            isharesPage3.toAddForcedSellCheckInWithInvalidFormat(logInfo);
            logInfo.pass("I do checkin for Shares PNR with baggage for Forced Sell check in with invalid format");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter X_ command to cancel multiple segments")
    public void iEnterX_CommandToCancelMultipleSegments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter X_ command to cancel multiple segments");
            isharesPage3.toCancelMultipleSegments(logInfo);
            logInfo.pass("I enter X_ command to cancel multiple segments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET_ command to display coupon for conjuctive tickets")
    public void iEnterET_CommandToDisplayCouponForConjuctiveTickets() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_ command to display coupon for conjuctive tickets");
            isharesPage3.toDisplayCouponForConjuctiveTickets(logInfo);
            logInfo.pass("I enter *ET_ command to display coupon for conjuctive tickets");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter down grade lower cabin with COS{string}")
    public void iEnterDownGradeLowerCabinWithCOS(String COS1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter down grade lower cabin with COS");
            isharesPage3.EnterDownGradeLowerCabinCommandWithCOS(logInfo, COS1);
            logInfo.pass("I enter down grade lower cabin with COS");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:MT_ command to reject mass transfer based on class of service")
    public void iEnterMT_CommandToRejectMassTransferBasedOnClassOfService() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:MT_ command to reject mass transfer based on class of service");
            isharesPage3.ToRejectMassTransferBasedOnClassOfService(logInfo);
            logInfo.pass("I enter 6:MT_ command to reject mass transfer based on class of service");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Semi-Permanent Data Password Recovery SHARES")
    public void I_enter_run_the_semi_Permanent_data_Password_Recovery_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Semi-Permanent Data Password Recovery SHARES");
            isharesPage3.enterRunTheSemiPermanentDataPasswordRecovery(logInfo);
            logInfo.pass("I enter Run the Semi-Permanent Data Password Recovery SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAA Run the Display APIS Screen Identifier Table")
    public void I_enter_PAA_run_the_display_APIS_Screen_Identifier_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAA Run the Display APIS Screen Identifier Table");
            isharesPage3.enterPAARunTheDisplayAPISScreenIdentifier(logInfo);
            logInfo.pass("I enter PAA Run the Display APIS Screen Identifier Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Update APIS Screen Identifier Table")
    public void I_enter_run_the_update_APIs_Screen_Identifier_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Update APIS Screen Identifier Table");
            isharesPage3.enterRunTheUpdateAPIsScreen(logInfo);
            logInfo.pass("I enter Run the Update APIS Screen Identifier Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAAA Run the Modify item in APIS Data Control Table")
    public void I_enter_PAAA_Run_the_modify_Item_In_APIs_Data_Control_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAAA Run the Modify item in APIS Data Control Table");
            isharesPage3.enterPAAATheModifyItemInAPISData(logInfo);
            logInfo.pass("I enter PAAA Run the Modify item in APIS Data Control Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KAFON* Run the Display the Flight Ordinal Number Table")
    public void I_enter_KAFON_Run_the_Display_the_Flight_Ordinal_Number_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KAFON* Run the Display the Flight Ordinal Number Table");
            isharesPage3.enterKAFONRunTheDisplayTheFlightOrdinal(logInfo);
            logInfo.pass("I enter KAFON* Run the Display the Flight Ordinal Number Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Set or Reset Overbooking allowed indicator in SSR Inventory")
    public void enter_SetorResetOverbookingallowedindicator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Set or Reset Overbooking allowed indicator in SSR Inventory");
            isharesPage3.SetorResetOverbookingallowedindicator(logInfo);
            logInfo.pass("I enter command to Set or Reset Overbooking allowed indicator in SSR Inventory");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check error messages for ASA ABP Restriction Table")
    public void enter_errormessagesforASA_ABPRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check error messages for ASA ABP Restriction Table");
            isharesPage3.errormessagesforASA_ABPRestrictionTable(logInfo);
            logInfo.pass("I enter command to check error messages for ASA ABP Restriction Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check error messages for messages for ATB Ticketing")
    public void enter_errormessagesforATBTicketing() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check error messages for messages for ATB Ticketing");
            isharesPage3.errormessagesforATBTicketing(logInfo);
            logInfo.pass("I enter command to check error messages for messages for ATB Ticketing");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the entry for Credit Verification with invalid parameter")
    public void enter_CreditVerificationwithinvalidParameter() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the entry for Credit Verification with invalid parameter");
            isharesPage3.CreditVerificationwithinvalidParameter(logInfo);
            logInfo.pass("I enter command to run the entry for Credit Verification with invalid parameter");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check error messages for E-Ticket Flight Table entries")
    public void enter_errormessagesforE_TicketFlightTableentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check error messages for E-Ticket Flight Table entries");
            isharesPage3.errormessagesforE_TicketFlightTableentries(logInfo);
            logInfo.pass("I enter command to check error messages for E-Ticket Flight Table entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run the ETKT GO-SHOW Check-In entries")
    public void enter_ETKT_GO_SHOW_CheckIn_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run the ETKT GO-SHOW Check-In entries");
            isharesPage3.ETKT_GO_SHOW_CheckIn_entries(logInfo);
            logInfo.pass("I enter command to run the ETKT GO-SHOW Check-In entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to run ETKT Security Table entries with invalid parameters")
    public void enter_ETKTSecurityTableentries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to run ETKT Security Table entries with invalid parameters");
            isharesPage3.ETKTSecurityTableentries(logInfo);
            logInfo.pass("I enter command to run ETKT Security Table entries with invalid parameters");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2_ command to get the info for flight {string} and for date {string}")
    public void iEnter_CommandToGetTheInfoForFlightAndForDate(String flight, String days) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2_ and verify response");
            isharesPage3.getFLIFOForAParticularFlight_Date(logInfo, flight, days);
            logInfo.pass("I enter 2_ command and verify response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2R {string} {string} command for flifo restricted conditions")
    public void iEnterRCommandForFlifoRestrictedConditions(String flight, String days) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2R_ and verify response");
            isharesPage3.flifo2RFlightRestrict(logInfo, flight, days);
            logInfo.pass("I enter 2R_ command and verify response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CH_|CF command for verify final passenger count")
    public void iEnterCH_CFCommandForVerifyFinalPassengerCount() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CH_|CF command for verify final passenger count");
            isharesPage3.toVerifyFinalPassengerCount(logInfo);
            logInfo.pass("I enter 6:CH_|CF command for verify final passenger count");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7J {string} command and verify response")
    public void iEnterJCommandAndVerifyResponse(String flag) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7J_ and verify response");
            isharesPage3.run7J_ON_OFF(logInfo, flag);
            logInfo.pass("I enter 7J_ command and verify response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter IR command")
    public void iEnterIRCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter IR command and verify response");
            isharesPage3.runIRCommand(logInfo);
            logInfo.pass("I enter IR command and verify response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LN_ -D command to display")
    public void iEnterLN_DCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LN_ -D to display");
            isharesPage3.lnCommandToDisplay(logInfo);
            logInfo.pass("I enter LN_ -D command to display");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LV_ -D command to display")
    public void iEnterLV_DCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LV_ -D to display");
            isharesPage3.lvCommandToDisplay(logInfo);
            logInfo.pass("I enter LV_ -D command to display");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LZ_ -D command to display")
    public void iEnterLZ_DCommandToDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LZ_ -D to display");
            isharesPage3.lzCommandToDisplay(logInfo);
            logInfo.pass("I enter LZ_ -D command to display");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VMS_ALLMAX {string} {string} command for inventory")
    public void iEnterVMS_ALLMAXCommandForInventory(String Ct, String Opt) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VMS_ALLMAX command for inventory");
            isharesPage3.inventoryDisplayVMS(logInfo, Ct, Opt);
            logInfo.pass("I enter VMS_ALLMAX command for inventory");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CV command and verify {string} in response")
    public void iEnterCVCommandAndVerifyInResponse(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CV command and verify response");
            isharesPage3.toVerifyNotAuthUser(logInfo, Entry);
            logInfo.pass("I enter 6:CV command and verify response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CC_ command and verify response")
    public void iEnterCC_CommandAndVerifyResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CC command and verify response");
            isharesPage3.toVerify6CCResponse(logInfo);
            logInfo.pass("I enter 6:CC command and verify response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter GAL_ command to search text")
    public void iEnterGAL_CommandToSearchText() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter GAL_ command and check response");
            isharesPage3.toSendGAL_Cmd(logInfo);
            logInfo.pass("I enter GAL_ command and check response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE command to verify Reverse codeshare table functions")
    public void iEnterQ_CODESHARECommandToVerifyReverseCodeshareTableFunctions() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE command to verify Reverse codeshare table functions");
            isharesPage3.verifyReverseCodeshareTableFunc(logInfo);
            logInfo.pass("I enter Q*CODESHARE command to verify Reverse codeshare table functions");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter passenger details for Infant Surname Different than Parent Surname")
    public void i_enter_passenger_details_For_Infant_Surname_different_than_parent_Surname() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter passenger details for Infant Surname Different than Parent Surname");
            isharesPage3.enter_passenger_Details_For_different_INF_Surname(logInfo);
            logInfo.pass("I enter passenger details for Infant Surname Different than Parent Surname");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I manual quote the fare for the Infant pax")
    public void I_manual_quote_the_fare_for_the_Infant_pax() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I manual quote the fare for the Infant pax");
            isharesPage3.manualQuoteINF(logInfo);
            logInfo.pass("I manual quote the fare for the Infant pax");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter K-C-SSR command to add item SSR Cutoff Time Limit Table for ssr {string} and time {string}")
    public void iEnterK_C_SSRcommandToAddItemSSRCutoffTimeLimitTable(String SSR, String time) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-C-SSR command to add item SSR Cutoff Time Limit Table");
            isharesPage3.enterK_C_SSR_ToAddTimeLimitTable(logInfo, SSR, time);
            logInfo.pass("I enter K-C-SSR command to add item SSR Cutoff Time Limit Table");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-C-SSR command to change item in SSR Cutoff Time Limit Table for ssr {string} and time {string}")
    public void iEnterK_C_SSRcommandToChangeItemSSRCutoffTimeLimitTable(String SSR, String time) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-C-SSR command to Change item in SSR Cutoff Time Limit Table");
            isharesPage3.enterK_C_SSR_ToChangeTimeLimitTable(logInfo, SSR, time);
            logInfo.pass("I enter K-C-SSR command to Change item in SSR Cutoff Time Limit Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-C-SSR command to Delete item in SSR Cutoff Time Limit Table for ssr {string}")
    public void iEnterK_C_SSRcommandToDeleteItemSSRCutoffTimeLimitTable(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-C-SSR command to Delete item in SSR Cutoff Time Limit Table");
            isharesPage3.enterK_C_SSR_ToDeleteTimeLimitTable(logInfo, SSR);
            logInfo.pass("I enter K-C-SSR command to Delete item in SSR Cutoff Time Limit Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LX command to Perform Reverse Cancellation Order List")
    public void I_enter_LX_command_to_Perform_Reverse_Cancellation_Order_List() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LX command to Perform Reverse Cancellation Order List");
            isharesPage3.performReverseCancellationOrderList(logInfo);
            logInfo.pass("I enter LX command to Perform Reverse Cancellation Order List");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD command to display Special Function Name List By Class of Service")
    public void I_enter_LD_command_to_display_Special_Function_Name_List_By_Class_of_Service() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to display Special Function Name List By Class of Service");
            isharesPage3.displaySpecialFunctionNameListByCOS(logInfo);
            logInfo.pass("I enter LD command to display Special Function Name List By Class of Service");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ command to display the list of infant passengers")
    public void iEnter6LD_CommandToDisplayTheListOfInfantPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_ command to display the list of infant passengers");
            isharesPage3.displayInfantPassengers(logInfo);
            logInfo.pass("I enter 6:LD_ command to display the list of infant passengers");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ command to display the list of child passengers")
    public void iEnter6LD_CommandToDisplayTheListOfChildPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_ command to display the list of child passengers");
            isharesPage3.displayChildPassengers(logInfo);
            logInfo.pass("I enter 6:LD_ command to display the list of child passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ command to display the list of Elite Frequent Travellers")
    public void iEnter6LD_CommandToDisplayTheListOfEliteFrequentTravellers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_ command to display the list of Elite Frequent Travellers");
            isharesPage3.displayEliteFrequentTravellers(logInfo);
            logInfo.pass("I enter 6:LD_ command to display the list of Elite Frequent Travellers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:BTAG_ command to display the Bagtag numbers and passenger sequence Number")
    public void iEnter6BTAG_CommandToDisplayTheBagtagNumberAndPassengerSequenceNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:BTAG_ command to display the Bagtag numbers and passenger sequence Number");
            isharesPage3.displayBagtagNumberAndPassengerSequenceNumber(logInfo);
            logInfo.pass("I enter 6:BTAG_ command to display the Bagtag numbers and passenger sequence Number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-EA_ command to Add Exception for the SSR {string}")
    public void iEnterK_EA_CommandToAddExceptionForTheSSR(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-EA_ command to Add Exception for the SSR " + SSR);
            isharesPage3.addExceptionForSSR(logInfo, SSR);
            logInfo.pass("I enter K-EA_ command to Add Exception for the SSR " + SSR);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-ED_ command to Remove Exception for the SSR {string}")
    public void iEnterK_ED_CommandToRemoveExceptionForTheSSR(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-ED_ command to Remove Exception for the SSR " + SSR);
            isharesPage3.removeExceptionForSSR(logInfo, SSR);
            logInfo.pass("I enter K-ED_ command to Remove Exception for the SSR " + SSR);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter SSR command for ssr type {string} for SSR restriction")
    public void i_enter_SSR_command(String SSRType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter SSR command for ssr type " + SSRType + "SSR restriction");
            isharesPage3.addSSRForSSRRestriction(logInfo, SSRType);
            logInfo.pass("I enter SSR command for ssr type " + SSRType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Run the List Display entry with D*M for Current date")
    public void iRunTheListDisplayEntryWithD_MForCurrentDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Run the List Display entry with D*M for Current date");
            isharesPage3.runListDisplayWithD_MForCurrentDate(logInfo);
            logInfo.pass("I Run the List Display entry with D*M for Current date");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Run the List Display entry with D*M for Previous date")
    public void iRunTheListDisplayEntryWithD_MForPreviousDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Run the List Display entry with D*M for Previous date");
            isharesPage3.runListDisplayWithD_MForPreviousDate(logInfo);
            logInfo.pass("I Run the List Display entry with D*M for Previous date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Run the Code share table entries for flight {string} and item {string}")
    public void iRunTheCodeShareTableEntriesFor(String flight, String item) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Run the Code share table entries for flight " + flight + " and item " + item);
            isharesPage3.runCodeShareTableEntries(logInfo, flight, item);
            logInfo.pass("I Run the Code share table entries for flight " + flight + " and item " + item);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-*HIS_ command to Display PCH Table History Record for {string}")
    public void iEnterK_T_HIS_CommandToDisplayPCHTableHistoryRecordFor(String recordNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-*HIS_ command to Display PCH Table History Record for " + recordNo);
            isharesPage3.displayPCHTableHistoryRecord(logInfo, recordNo);
            logInfo.pass("I enter K-T-*HIS_ command to Display PCH Table History Record for " + recordNo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-* command to display PCH table for carrier {string}")
    public void i_enter_K_T_command_to_display_PCH_table_for_carrie(String Carrier) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-* command to display PCH table for carrier");
            isharesPage3.displayPCHTableForCarrier(logInfo, Carrier);
            logInfo.pass("I enter K-T-* command to display PCH table for carrier");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C-A command to Run the refund to ACO system")
    public void i_enter_C_A_command_to_Run_The_Refun_ACO_System() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C-A command to Run the refund to ACO system");
            isharesPage3.runRefundToACOSystem(logInfo);
            logInfo.pass("I enter C-A command to Run the refund to ACO system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C-D_ command to Run the Direct refund to ACO system")
    public void i_enter_C_D_command_to_Run_The_Direct_Refund_ACO_System() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C-D_ command to Run the Direct refund to ACO system");
            isharesPage3.runDirectRefundToACOSystem(logInfo);
            logInfo.pass("I enter C-D_ command to Run the Direct refund to ACO system");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I fare quote and ticket the PNR")
    public void i_enter_fare_quote_and_ticket_the_PNR() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I fare quote and ticket the PNR");
            isharesPage3.fareQuoteAndTicketPNR(logInfo);
            logInfo.pass("I fare quote and ticket the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_*N command to display CNR Record")
    public void i_enter_T_N_Command_to_Display_CNR_Record() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_*N command to display CNR Record");
            isharesPage3.displayCNRRecord(logInfo);
            logInfo.pass("I enter T_*N command to display CNR Record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ticketing command for item not in table")
    public void i_enter_ticketing_command_for_item_not_in_table() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ticketing command for item not in table");
            isharesPage3.enterTicketingCommand(logInfo);
            logInfo.pass("I enter ticketing command for item not in table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-D command to delete CNR Record")
    public void i_enter_T_D_Command_to_Delete_CNR_Record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-D command to delete CNR Record");
            isharesPage3.deleteCNRRecord(logInfo);
            logInfo.pass("I enter T-D command to delete CNR Record");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I manual fare quote the Passenger")
    public void i_enter_manual_fare_quote_the_PNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I manual fare quote the Passenger");
            isharesPage3.manualFareQuoteThePassenger(logInfo);
            logInfo.pass("I manual fare quote the Passenger");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Verify PNR changes are not allowed during PNR divide")
    public void iVerifyPNRchangesAreNotAllowedDuringPNRDivide() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Verify PNR changes are not allowed during PNR divide");
            isharesPage3.doNotAllowPNRChagesDuringPNRDivide(logInfo);
            logInfo.pass("I Verify PNR changes are not allowed during PNR divide");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CEA command to search IATA number in CEA entries for carrier code {string} and IATA Number {string}")
    public void iEnterCEAcommandToSearchIATANumberInCEAEntriesForCarrierCode(String carrierCode, String IATANumber) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CEA command to search IATA number in CEA entries for carrier code");
            isharesPage3.searchIATANumberInCEAEntries(logInfo, carrierCode, IATANumber);
            logInfo.pass("I enter CEA command to search IATA number in CEA entries for carrier code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE command to display code share class mapping table for item {string}")
    public void iEnterQ_CODESHAREcommandToDisplayCodeShareClassMappingTableForItem(String item) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE command to display code share class mapping table for item " + item);
            isharesPage3.displayCodeShareClassMappingTable(logInfo, item);
            logInfo.pass("I enter Q*CODESHARE command to display code share class mapping table for item " + item);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE command to add item to code share class mapping table for item {string} and model {string}")
    public void iEnterQ_CODESHAREcommandToAddItemToCodeShareClassMappingTableForItem(String item, String model) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE command to add item to code share class mapping table for item " + item);
            isharesPage3.addItemToCodeShareClassMappingTable(logInfo, item, model);
            logInfo.pass("I enter Q*CODESHARE command to add item to code share class mapping table for item " + item);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE command to change item in code share class mapping table for item {string} and model {string}")
    public void iEnterQ_CODESHAREcommandToChangeItemInCodeShareClassMappingTableForItem(String item, String model) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE command to change item in code share class mapping table for item " + item);
            isharesPage3.changeItemInCodeShareClassMappingTable(logInfo, item, model);
            logInfo.pass("I enter Q*CODESHARE command to change item in code share class mapping table for item " + item);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*CODESHARE command to delete item in code share class mapping table for item {string} and model {string}")
    public void iEnterQ_CODESHAREcommandToDeleteItemInCodeShareClassMappingTableForItem(String item, String model) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*CODESHARE command to delete item in code share class mapping table for item " + item);
            isharesPage3.deleteItemInCodeShareClassMappingTable(logInfo, item, model);
            logInfo.pass("I enter Q*CODESHARE command to delete item in code share class mapping table for item " + item);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Book the PNR for TAD date between first segment date and ER date")
    public void iBookThePNRForTADDateBetweenFirstSegmentDateAndERDate() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Book the PNR for TAD date between first segment date and ER date");
            isharesPage3.bookThePNRBetweenFirstSegmentDateAndERDate(logInfo);
            logInfo.pass("I Book the PNR for TAD date between first segment date and ER date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to add the AV option in reverse codeshare table")
    public void iEnterCommandToAddTheAVOptionInReverseCodeshareTable() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to add the AV option in reverse codeshare table");
            isharesPage3.addAVOptionInReverseCodeShareTable(logInfo);
            logInfo.pass("I enter command to add the AV option in reverse codeshare table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM*UGX1* command turnoff the appswitch {string} for the {string} entry")
    public void iEnterOCMUGXCommandTurnoffTheAppswitchForTheEntry(String AppSwitch, String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM*UGX1* command turnoff the appswitch");
            isharesPage3.enterOCMUGXCommandToTurnoffTheAppswitch(logInfo, AppSwitch, Entry);
            logInfo.pass("I enter OCM*UGX1* command turnoff the appswitch");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-CH command to Collect Cabin Crew report with SSR list")
    public void iEnter6_CHcommandToCollectCabinCrewReportWithSSRList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CH command to Collect Cabin Crew report with SSR list");
            isharesPage3.collectCabinCrewReportWithSSrList(logInfo);
            logInfo.pass("I enter 6-CH command to Collect Cabin Crew report with SSR list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CU command to identify And Release Held Seats")
    public void iEnter6CUCommandtoidentifyAndReleaseHeldSeats() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CU command to identify And Rlease Held Seats");
            isharesPage3.identifyAndReleaseHeldSeats(logInfo);
            logInfo.pass("I enter 6:CU command to identify And Rlease Held Seats");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_ ALL_CI {string} command and verify response")
    public void iEnterLD_ALL_CICommandAndVerifyResponse(String QueueName) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD ALL_CI command and verify response");

            isharesPage3.verify6_LD_AllCI_QueueCommand(logInfo,QueueName);
            logInfo.pass("I enter 6:LD ALL_CI command and verify response");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KM command to Display the Status Table entries for {string}")
    public void enter_KM_DisplayStatusTableentries(String flight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KM command to Display the Status Table entries");
            isharesPage3.enterKM_DisplayStatusTableentries(logInfo, flight);
            logInfo.pass("I enter KM command to Display the Status Table entries");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-LA command to Display Customized Daily Auto List")
    public void enter_6LA_DisplayCustomizedDailyAutoList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-LA command to Display Customized Daily Auto List");
            isharesPage3.enter6LA_DisplayCustomizedDailyAutoList(logInfo);
            logInfo.pass("I enter 6-LA command to Display Customized Daily Auto List");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TETMAP command to Display ETKT_Common_City_Table for airport {string}")
    public void enter_TETMAP_ETKT_Common_City_Table_For_Airport(String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TETMAP command to Display ETKT_Common_City_Table for airport " + destination);
            isharesPage3.enterTETMAP_ETKT_Common_City_Table_For_Airport(logInfo, destination);
            logInfo.pass("I enter TETMAP command to Display ETKT_Common_City_Table for airport " + destination);

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TETMAP command to Display ETKT_Common_City_Table for airport citycode")
    public void enter_TETMAP_ETKT_Common_City_Table_For_AirportCitycode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TETMAP command to Display ETKT_Common_City_Table for airport citycode");
            isharesPage3.enterTETMAP_ETKT_Common_City_Table_For_AirportCitycode(logInfo);
            logInfo.pass("I enter TETMAP command to Display ETKT_Common_City_Table for airport citycode");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TETMAP command to Display ETKT_Common_City_Table")
    public void enter_TETMAP_ETKT_Common_City_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T/ETMAP command to Display ETKT_Common_City_Table");
            isharesPage3.enterTETMAP_ETKT_Common_City_Table(logInfo);
            logInfo.pass("I enter T/ETMAP command to Display ETKT_Common_City_Table");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KROC command to Display OCI TABLE")
    public void enter_KROC_DisplayOCITABLE() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KROC command to Display OCI TABLE");
            isharesPage3.enterKROC_DisplayOCITABLE(logInfo);
            logInfo.pass("I enter KROC command to Display OCI TABLE");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KROG command to Display OGI TABLE")
    public void enter_KROG_DisplayOGITABLE() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KROG command to Display OGI TABLE");
            isharesPage3.enterKROG_DisplayOGITABLE(logInfo);
            logInfo.pass("I enter KROG command to Display OGI TABLE");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KCCQ command to Display CITY QUEUE TABLE")
    public void enter_KCCQ_DisplayCITYQUEUETABLE() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KCCQ command to Display CITY QUEUE TABLE");
            isharesPage3.enterKCCQ_DisplayCITYQUEUETABLE(logInfo);
            logInfo.pass("I enter KCCQ command to Display CITY QUEUE TABLE");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message to update the IN_Out_ETA time {string}")
    public void enter_Create_a_FLIFO_message_In_out_ETA_Time(String time) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message to update the IN/Out/ETA time " + time);
            isharesPage3.Create_a_FLIFO_message_IN_OutTime_ETA(logInfo, time);
            logInfo.pass("I enter Y command to create a FLIFO message to update the IN/Out/ETA time " + time);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message to update the ETA time {string}")
    public void enter_Create_a_FLIFO_message_UpdataETA(String time) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message to update the ETA time " + time);
            isharesPage3.Create_a_FLIFO_message_UpdataETA(logInfo, time);
            logInfo.pass("I enter Y command to create a FLIFO message to update the ETA time " + time);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message for Landing cancellation of a flight")
    public void enter_Create_a_FLIFO_message_LandingCancel() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message for Landing cancellation of a flight");
            isharesPage3.Create_a_FLIFO_message_LandingCancel(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message for Landing cancellation of a flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message for Flight cancellation")
    public void enter_Create_a_FLIFO_message_FlightCancel() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message for Flight cancellation");
            isharesPage3.Create_a_FLIFO_message_FlightCancel(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message for Flight cancellation");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message for ETA replace with PRE")
    public void enter_Create_ETA_FLIFO_updateMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message for ETA replace with PRE");
            isharesPage3.Create_ETA_FLIFO_updateMessage(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message for ETA replace with PRE");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message for PRE replace with IN")
    public void enter_Process_PRE_replace_with_IN() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message for PRE replace with IN");
            isharesPage3.Process_PRE_replace_with_IN(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message for PRE replace with IN");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message for for ETD replace with OUT")
    public void enter_Process_FLIFO_update_message_ETD_replace_with_OUT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message for for ETD replace with OUT");
            isharesPage3.Process_FLIFO_update_message_ETD_replace_with_OUT(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message for for ETD replace with OUT");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message to update the IN time")
    public void enter_Create_update_the_IN_time() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message to update the IN time");
            isharesPage3.Create_update_the_IN_time(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message to update the IN time");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I perform update the seats with bag count{int} and weight{string} to verify error message")
    public void iPerformUpdateTheSeatsWithBagCountAndWeightToVerifyErrorMessage(int BaggageCount, String BaggageWeight) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform update the seats with bag count{int} and weight{string} to verify error message");
            isharesPage3.toVerifyErrorMessageForUpdatingSeatinMarketingFlight(logInfo, BaggageCount, BaggageWeight);
            logInfo.pass("I perform update the seats with bag count{int} and weight{string} to verify error message");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for Printer Attribute Record Table")
    public void iEnterCommandToVerifyErrorMessagesForPrinterAttributeRecordTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for Printer Attribute Record Table");
            isharesPage3.toVerifyErrorMessageForPrinterAttributeRecordTable(logInfo);
            logInfo.pass("I enter command to verify error messages for Printer Attribute Record Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for Volunteer Booking Priority Table entries")
    public void iEnterCommandToVerifyErrorMessagesForVolunteerBookingPriorityTableEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for Volunteer Booking Priority Table entries");
            isharesPage3.toVerifyErrorMessageForVolunteerBookingPriorityTableEntries(logInfo);
            logInfo.pass("I enter command to verify error messages for Volunteer Booking Priority Table entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for ACI Cabin Text Table")
    public void iEnterCommandToVerifyErrorMessagesForACICabinTextTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for ACI Cabin Text Table");
            isharesPage3.toVerifyErrorMessageForACICabinTextTable(logInfo);
            logInfo.pass("I enter command to verify error messages for ACI Cabin Text Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for Group Zone and Row Number Table entries")
    public void iEnterCommandToVerifyErrorMessagesForGroupZoneAndRowNumberTableEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for Group Zone and Row Number Table entries");
            isharesPage3.toVerifyErrorMessagesForGroupZoneAndRowNumberTableEntries(logInfo);
            logInfo.pass("I enter command to verify error messages for Group Zone and Row Number Table entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error message for ETKT")
    public void iEnterCommandToVerifyErrorMessageForETKT() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error message for ETKT");
            isharesPage3.toVerifyErrorMessagesForETKT(logInfo);
            logInfo.pass("I enter command to verify error message for ETKT");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error message for ETKT coupon")
    public void iEnterCommandToVerifyErrorMessageForETKTCoupon() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error message for ETKT coupon");
            isharesPage3.toVerifyErrorMessagesForETKTCoupon(logInfo);
            logInfo.pass("I enter command to verify error message for ETKT coupon");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for Codeshare and Interline Electronic Ticketing")
    public void iEnterCommandToVerifyErrorMessagesForCodeshareInterlineElectronicTicketing() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for Codeshare and Interline Electronic Ticketing");
            isharesPage3.toVerifyErrorMessagesForCodeshareInterlineElectronicTicketing(logInfo);
            logInfo.pass("I enter command to verify error messages for Codeshare and Interline Electronic Ticketing");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Perform display for Old Seats entries")
    public void I_Perform_dispaly_for_Old_Seats_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Perform display for Old Seats entries");
            isharesPage3.performDsiplayForOldSeats(logInfo);
            logInfo.pass("I Perform display for Old Seats entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Close Flight And Bypass Post Departure Processing SHARES")
    public void I_enter_run_close_flight_And_Bypass_post_departure_Processing_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Close Flight And Bypass Post Departure Processing SHARES");
            isharesPage3.enterRunCloseFlightAndByPassPost(logInfo);
            logInfo.pass("I enter Run Close Flight And Bypass Post Departure Processing SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Teletype Transfer for System Schedules")
    public void I_enter_run_the_teletype_Transfer_for_system_schedules() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Teletype Transfer for System Schedules");
            isharesPage3.enterRunTheTeletransferSystem(logInfo);
            logInfo.pass("I enter Run the Teletype Transfer for System Schedules");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KA Run the Full Flight Record")
    public void I_enter_KA_Run_the_Full_Flight_Record() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KA Run the Full Flight Record");
            isharesPage3.enterKARunTheFullFlightRecord(logInfo);
            logInfo.pass("I enter KA Run the Full Flight Record");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Valid Response One Segment SHARES entries")
    public void I_enter_run_the_Valid_Response_One_Segment_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Valid Response One Segment SHARES entries");
            isharesPage3.enterRunTheValiResponseOneSegmentShares(logInfo);
            logInfo.pass("I enter Run the Valid Response One Segment SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run the Display Advance Seat assignment from PNR in Surname")
    public void I_enter_run_the_Display_Advance_Seat_assignment_from_PNR_in_Surname() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run the Display Advance Seat assignment from PNR in Surname");
            isharesPage3.enterRunTheDisplayAdvanceSeatAssignment(logInfo);
            logInfo.pass("I enter Run the Display Advance Seat assignment from PNR in Surname");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Identify Non-Revenue No Meal Passengers SHARES")
    public void I_enter_Run_Identify_Non_Revenue_No_Meal_Passengers_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Identify Non-Revenue No Meal Passengers SHARES");
            isharesPage3.enterRunidentifyNonRevenueNoMealPassengers(logInfo);
            logInfo.pass("I enter Run Identify Non-Revenue No Meal Passengers SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Display Advanced Seat Assignment Index Record SHARES")
    public void I_enter_run_Display_Advanced_seat_Assignment_Index_record_Shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Display Advanced Seat Assignment Index Record SHARES");
            isharesPage3.enterRunDsiplayAdvancedSeatAssignmentIndex(logInfo);
            logInfo.pass("I enter Run Display Advanced Seat Assignment Index Record SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:A Run Common Error Messages for ASA SHARES entries")
    public void I_enter_6A_Run_Common_error_Messages_for_ASA_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:A Run Common Error Messages for ASA SHARES entries");
            isharesPage3.enter6ARunCommonErrorMessageForASAShares(logInfo);
            logInfo.pass("I enter 6:A Run Common Error Messages for ASA SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CY Run Restrict Control Functions To Universal Control")
    public void I_enter_6CY_Run_Restrict_Control_Functions_To_Universal_Control() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CY Run Restrict Control Functions To Universal Control");
            isharesPage3.enter6CYRunRestrictControlFunctionsToUniversal(logInfo);
            logInfo.pass("I enter 6:CY Run Restrict Control Functions To Universal Control");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run error responses for display seat status map SHARES")
    public void I_enter_Run_error_responses_for_display_seat_status_map_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run error responses for display seat status map SHARES");
            isharesPage3.enterRunErrorResponsesForDisplaySeatStatusMap(logInfo);
            logInfo.pass("I enter Run error responses for display seat status map SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_* Run display by segments SHARES entries")
    public void I_enter_6_Run_display_by_Segments_Shares_Entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_* Run display by segments SHARES entries");
            isharesPage3.enter6RunDisplayBySegmentsSharesEntries(logInfo);
            logInfo.pass("I enter 6_* Run display by segments SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:* Run the Update for PDC XML")
    public void I_enter_6_Run_the_Update_for_PDC_XML() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:* Run the Update for PDC XML");
            isharesPage3.enter6RunTheUpdateForPDCXML(logInfo);
            logInfo.pass("I enter 6:* Run the Update for PDC XML");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_CU Run Release Specific Held ASA Seats")
    public void I_enter_6_CU_Run_Release_Specific_Held_ASA_Sets() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_CU Run Release Specific Held ASA Seats");
            isharesPage3.enter6CURunReleaseSpecificHeldASA(logInfo);
            logInfo.pass("I enter 6_CU Run Release Specific Held ASA Seats");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Enable_Restrict Immediate Standby Boarding SHARES")
    public void I_enter_run_Enable_Restrict_immediate_standby_Boarding_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Enable_Restrict Immediate Standby Boarding SHARES");
            isharesPage3.enterRunEnableRestrictImmediate(logInfo);
            logInfo.pass("I enter Run Enable_Restrict Immediate Standby Boarding SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run Process Downgrades Grade Change")
    public void I_enter_Run_Process_Downgrades_Grade_Change() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run Process Downgrades Grade Change");
            isharesPage3.enterRunProcessDowngradesGradeChange(logInfo);
            logInfo.pass("I enter Run Process Downgrades Grade Change");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZA User has access to SHARES CM System")
    public void I_enter_6_ZA_User_has_access_to_shares_CM_System() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZA User has access to SHARES CM System");
            isharesPage3.enter6ZAUserHasAccessToShareCMSystem(logInfo);
            logInfo.pass("I enter 6:ZA User has access to SHARES CM System");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZS User has access to SHARES CM System")
    public void I_enter_6_ZS_User_has_access_to_Shares_CM_System() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZS User has access to SHARES CM System");
            isharesPage3.enter6ZSUserHasAccessToShareCMSystem(logInfo);
            logInfo.pass("I enter 6:ZS User has access to SHARES CM System");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD SSR is created for the flight")
    public void I_enter_6_LD_SSR_is_Created_for_the_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD SSR is created for the flight");
            isharesPage3.enter6LDSSRIsCreatedFortheFlight(logInfo);
            logInfo.pass("I enter 6:LD SSR is created for the flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-IA Run Associate Fleet Name With a Common Map SHARES")
    public void I_enter_6_IA_Run_Associate_Fleet_name_With_a_common_Map_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-IA Run Associate Fleet Name With a Common Map SHARES");
            isharesPage3.enter6IARunAssociateFleetNameWithaCommonMap(logInfo);
            logInfo.pass("I enter 6-IA Run Associate Fleet Name With a Common Map SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:C Run Gate Pass Printing SHARES entries")
    public void I_enter_6_C_Run_Gate_pass_Printing_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C Run Gate Pass Printing SHARES entries");
            isharesPage3.enter6LCRunGatePassPrintingShares(logInfo);
            logInfo.pass("I enter 6:C Run Gate Pass Printing SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I search for flight availability from {string} to {string} with invalid carrier code and validate the error")
    public void iSearchForFlightAvailabilityFromToWithInvalidCarrierCodeAndValidateTheError(String originCity, String destinationCity) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for flight availability with invalid carrier code and validate the error");
            isharesPage3.searchAvailabilityWithInvalidCarrierCode(logInfo, originCity, destinationCity);
            logInfo.pass("I search for flight availability with invalid carrier code and validate the error");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KR_OC_* command to display the OCI table")
    public void iEnterKR_OC_CommandToDisplayTheOCITable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR_OC_* command to display the OCI table");
            isharesPage3.displayOCITable(logInfo);
            logInfo.pass("I enter KR_OC_* command to display the OCI table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-EA_ command to add SSR {string} to the PSC Exception Table for a specific boarding point")
    public void iEnterKEA_CommandToAddSSRToThePSCExceptionTableForASpecificBoardingPoint(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KEA_ command to add SSR to PSC Exception Table for a specific boarding point");
            isharesPage3.addSSRToPSCExceptionTableForASpecificBoardingPoint(logInfo, SSR);
            logInfo.pass("I enter KEA_ command to add SSR to PSC Exception Table for a specific boarding point");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-EA_ command to add SSR {string} to the PSC Exception Table for a specific board and off point and for a specific date range")
    public void iEnterKEA_CommandToAddSSRToThePSCExceptionTableForASpecificBoardAndOffPointAndForASpecificDateRange(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KEA_ command to add SSR to PSC Exception Table for a specific board and off point and for a specific date range");
            isharesPage3.addSSRToPSCExceptionTableForASpecificBoardAndOffPointAndForADateRange(logInfo, SSR);
            logInfo.pass("I enter KEA_ command to add SSR to PSC Exception Table for a specific board and off point and for a specific date range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CNF command to finalize standby priority table modification")
    public void iEnterCNFCommandToFinalizeStandbyPriorityTableModification() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CNF command to finalize standby priority table modification");
            isharesPage3.finalizeStandbyPriorityTableModification(logInfo);
            logInfo.pass("I enter 6:CNF command to finalize standby priority table modification");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CH_|UM command to request the list of undelivered messages")
    public void iEnterCH_UMCommandToRequestTheListOfUndeliveredMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CH_|UM command to request the list of undelivered messages");
            isharesPage3.requestTheListOfUndeliveredMessage(logInfo);
            logInfo.pass("I enter 6:CH_|UM command to request the list of undelivered messages");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-EA_ command to add SSR {string} to the PSC Exception Table without segments and date range")
    public void iEnterKEA_CommandToAddSSRToThePSCExceptionTableWithoutSegmentsAndDateRange(String SSR) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KEA_ command to add SSR to PSC Exception Table without segments and date range");
            isharesPage3.addSSRToPSCExceptionTableWithoutSegmentsAndDateRange(logInfo, SSR);
            logInfo.pass("I enter KEA_ command to add SSR to PSC Exception Table without segments and date range");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CH_|FC command to display the list of final passengers or meal count")
    public void iEnterCH_FCCommandToDisplayTheListOfFinalPassengersOrMealCount() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CH_|FC command to display the list of final passengers or meal count");
            isharesPage3.displayTheListOfFinalPassengersOrMealCount(logInfo);
            logInfo.pass("I enter 6:CH_|FC command to display the list of final passengers or meal count");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:C_.UNRESTRICT command to allow seating to exceed HA and OA seat allotments")
    public void iEnterC_UNRESTRICTCommandToAllowSeatingToExceedHAAndOASeatAllotments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C_.UNRESTRICT command to allow seating to exceed HA and OA seat allotments");
            isharesPage3.allowSeatingToExceedHAAndOASeatAllotments(logInfo);
            logInfo.pass("I enter 6:C_.UNRESTRICT command to allow seating to exceed HA and OA seat allotments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:C_.RESTRICT command to disallow seating from exceeding HA and OA seat allotments")
    public void iEnterC_RESTRICTCommandToDisallowSeatingFromExceedingHAAndOASeatAllotments() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C_.RESTRICT command to disallow seating from exceeding HA and OA seat allotments");
            isharesPage3.disallowSeatingFromExceedHAAndOASeatAllotments(logInfo);
            logInfo.pass("I enter 6:C_.RESTRICT command to disallow seating from exceeding HA and OA seat allotments");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CY_ command to enable master restricting to control centre")
    public void iEnterCY_CommandToEnableMasterRestrictingToControlCentre() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CY_ command to enable master restricting to control centre");
            isharesPage3.enableMasterRestrictingToControlCentre(logInfo);
            logInfo.pass("I enter 6:CY_ command to enable master restricting to control centre");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CY_|@ command to reverse master restricting to control centre")
    public void iEnterCY_CommandToReverseMasterRestrictingToControlCentre() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CY_|@ command to reverse master restricting to control centre");
            isharesPage3.reverseMasterRestrictingToControlCentre(logInfo);
            logInfo.pass("I enter 6:CY_|@ command to reverse master restricting to control centre");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADZACT_ command to activate terminal for semi-permanent data modification access")
    public void iEnterPADZACT_CommandToActivateTerminalForSemiPermanentDataModificationAccess() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADZACT_ command to activate terminal for semi-permanent data modification access");
            isharesPage3.activateTerminalForSemiPermanentDataModificationAccess(logInfo);
            logInfo.pass("I enter PADZACT_ command to activate terminal for semi-permanent data modification access");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADZDAC_ command to deactivate terminal from semi-permanent data modification access")
    public void iEnterPADZDAC_CommandToDeactivateTerminalFromSemiPermanentDataModificationAccess() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADZDAC_ command to deactivate terminal from semi-permanent data modification access");
            isharesPage3.deactivateTerminalForSemiPermanentDataModificationAccess(logInfo);
            logInfo.pass("I enter PADZDAC_ command to deactivate terminal from semi-permanent data modification access");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADZCHG_ command to change the password for gaining access to semi-permanent data security")
    public void iEnterPADZCHG_CommandToChangeThePasswordForGainingAccessToSemiPermanentDataSecurity() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADZCHG_ command to change the password for gaining access to semi-permanent data security");
            isharesPage3.changeThePasswordForGainingAccessToSemiPermanentDataSecurity(logInfo);
            logInfo.pass("I enter PADZCHG_ command to change the password for gaining access to semi-permanent data security");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADD*_ command requesting to preview the activity settings and values, which will be applied to a specific flight,origin,date")
    public void iEnterPADD_CommandRequestingToPreviewTheActivitySettingsAndValuesWhichWillBeAppliedToASpecificFlightOriginDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADD*_ command requesting to preview the activity settings and values, which will be applied to a specific flight,origin,date");
            isharesPage3.previewTheActivitySettingsAndValuesApplied(logInfo);
            logInfo.pass("I enter PADD*_ command requesting to preview the activity settings and values, which will be applied to a specific flight,origin,date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBT_command to display error messages in central processor action for invalid details")
    public void iEnterPBT_commandToDisplayErrorMessagesInCentralProcessorActionForInvalidDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBT_command to display error messages in central processor action for invalid details");
            isharesPage3.displayErrorMessagesInCentralProcessorAction(logInfo);
            logInfo.pass("I enter PBT_command to display error messages in central processor action for invalid details");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *S1_ALL command and validate response for schedule change seat reaccommodation users")
    public void iEnterS_ALLCommandAndValidateResponseForScheduleChangeSeatReaccommodationUsers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *S1_ALL command and validate response for schedule change seat reaccommodation users");
            isharesPage3.validateResponseForScheduleChangeSeatReaccommodationUsers(logInfo);
            logInfo.pass("I enter *S1_ALL command and validate response for schedule change seat reaccommodation users");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*_ command to display the status of a flight")
    public void iEnter_CommandToDisplayTheStatusOfAFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*_ command to display the status of a flight");
            isharesPage3.displayStatusOfAFlight(logInfo);
            logInfo.pass("I enter 6:*_ command to display the status of a flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CP_ command to remove or replace a seat from the seat map")
    public void iEnterCP_CommandToRemoveOrReplaceASeatForTheSeatMap() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CP_ command to remove or replace a seat from the seat map");
            isharesPage3.removeOrReplaceASeatFromTheSeatMap(logInfo);
            logInfo.pass("I enter 6:CP_ command to remove or replace a seat from the seat map");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*_ command to assign or change seat status map format")
    public void iEnter_CommandToAssignOrChangeSeatStatusMapFormat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*_ command to assign or change seat status map format");
            isharesPage3.assignOrChangeSeatStatusMapFormat(logInfo);
            logInfo.pass("I enter 6:*_ command to assign or change seat status map format");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*_ command to assign or change seat status map format for UA carrier code")
    public void iEnter_CommandToAssignOrChangeSeatStatusMapFormatForUACarrierCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*_ command to assign or change seat status map format for UA carrier code");
            isharesPage3.assignOrChangeSeatStatusMapFormatForUACarrierCode(logInfo);
            logInfo.pass("I enter 6:*_ command to assign or change seat status map format for UA carrier code");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:XP_ command to divide the PNR with ACI entry")
    public void iEnterXP_CommandToDivideThePNRWithACIEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:XP_ command to divide the PNR with ACI entry");
            isharesPage3.divideThePNRUsingACIEntry(logInfo);
            logInfo.pass("I enter 6:XP_ command to divide the PNR with ACI entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:APIM_ON|AQQ command to turn on the APIS indicator")
    public void iEnterAPIM_ONAQQCommandToTurnOnTheAPISIndicator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:APIM_ON|AQQ command to turn on the APIS indicator");
            isharesPage3.turnOnTheAPISIndicator(logInfo);
            logInfo.pass("I enter 6:APIM_ON|AQQ command to turn on the APIS indicator");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:APIM_OFF|AQQ command to turn off the APIS indicator")
    public void iEnterAPIM_OFFAQQCommandToTurnOnTheAPISIndicator() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:APIM_OFF|AQQ command to turn off the APIS indicator");
            isharesPage3.turnOffTheAPISIndicator(logInfo);
            logInfo.pass("I enter 6:APIM_OFF|AQQ command to turn off the APIS indicator");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:UG command to grade change to upper class at downline station {string}")
    public void iEnterUGCommandToGradeChangeToUpperClassAtDownlineStation(String UpgradeClass) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:UG command to grade change to upper class at downline station");
            isharesPage3.enterUGCommandToGradeChangeToUpperClassAtDownlineStation(logInfo, UpgradeClass);
            logInfo.pass("I enter 6:UG command to grade change to upper class at downline station");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:R command for changing seat after checkin {string}")
    public void iEnterRCommandForChangingSeatAfterCheckin(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:R command for changing seat after checkin");
            isharesPage3.changeSeat(logInfo, COS);
            logInfo.pass("I enter 6:R command for changing seat after checkin");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_DV command to perform VOL Oversell passenger list")
    public void iEnter6LD_DVCommandToPerformVOLOversellsPassengerList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_DV command to perform VOL oversell passenger list");
            isharesPage3.addPaxToVoluntaryOversoldList(logInfo);
            logInfo.pass("I enter 6:LD_DV command to perform VOL oversell passenger list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|OC command to display the list of outbound connect passengers specific flight")
    public void iEnter6LD_OCCommandToDisplayTheListOfOutboundConnectPassengersSpecificFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|OC command to display the list of outbound connect passengers specific flight");
            isharesPage3.displayListOfOutboundConnectPassengersSpecificFlight(logInfo);
            logInfo.pass("I enter 6:LD_|OC command to display the list of outbound connect passengers specific flight");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|Pax command to display the specific passenger")
    public void iEnterLD_PaxCommandToDisplayTheSpecificPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|Pax command to display the specific passenger");
            isharesPage3.enterLD_PaxCommandForSpecificPax(logInfo);
            logInfo.pass("I enter 6:LD_|Pax command to display the specific passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:LD_|Pax command to display all pax in pnr using group name")
    public void iEnterLD_PaxCommandToDisplayGroupName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|Pax command to display all pax in pnr using group name");
            isharesPage3.enterLD_PaxCommandForGroupName(logInfo);
            logInfo.pass("I enter 6:LD_|Pax command to display all pax in pnr using group name");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:PRS_ command to check the status of passenger seat numbers")
    public void iEnterPRSCommandToCheckTheStatusOfPassengerSeatNumbers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:PRS_ command to check the status of passenger seat numbers");
            isharesPage3.enter6PRSToCheckTheStatusOfPassengerSeatNumbers(logInfo);
            logInfo.pass("I enter 6:PRS_ command to check the status of passenger seat numbers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|Pax command to display the specific passenger with full name")
    public void iEnterLD_PaxCommandToDisplayTheSpecificPassengerWithFullName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|Pax command to display the specific passenger");
            isharesPage3.enterLD_PaxCommandForSpecificPaxFullName(logInfo);
            logInfo.pass("I enter 6:LD_|Pax command to display the specific passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:U command to uncheck the passenger {string}")
    public void iEnterUCommandToUncheckThePassenger(String Origin) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:U command to uncheck the passenger ");
            isharesPage3.enterUCommandToUncheckThePassenger(logInfo, Origin);
            logInfo.pass("I enter 6:U command to uncheck the passenger ");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I turn on AQQ for the flight")
    public void iTurnOnAQQForTheFlight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I turn on AQQ for the flight");
            isharesPage3.turnOnAQQForFlight(logInfo);
            logInfo.pass("I turn on AQQ for the flight");
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage1.getDriver()), "Screenshot");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:ZHO command to display old SSR")
    public void iEnterZHOCommandToDisplayOldSSR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZHO command to display old SSR ");
            isharesPage3.enterZHOCommandToDisplayOldSSR(logInfo);
            logInfo.pass("I enter 6:ZHO command to display old SSR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:ZHF command to display Display Formatted FDR")
    public void iEnterZHFCommandToDisplayDisplayFormattedFDR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZHF command to display Display Formatted FDR");
            isharesPage3.verifyDisplayOfFormattedFDR(logInfo);
            logInfo.pass("I enter 6:ZHF command to display Display Formatted FDR");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:ZH to perform action on PNIS {string}")
    public void iEnterZHToPerformActionOnPNIS(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH to perform action on PNIS ");
            isharesPage3.enterZHToPerformActionOnPNIS(logInfo, Entry);
            logInfo.pass("I enter 6:ZH to perform action on PNIS ");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:ZD command to display PNIS")
    public void iEnterZDCommandToDisplayPNIS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZH to perform action on PNIS ");
            isharesPage3.enterZDCommandToDisplayPNIS(logInfo);
            logInfo.pass("I enter 6:ZH to perform action on PNIS ");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter 6:ZRA_ command to recreate seat selection record")
    public void iEnterZRA_CommandToRecreateSeatSelectionRecord() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZRA_ command to recreate seat selection record");
            isharesPage3.enterZRA_CommandToRecreateSeatSelectionRecord(logInfo);
            logInfo.pass("I enter 6:ZRA_ command to recreate seat selection record");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");

        }
    }

    @And("I enter long sell command for NRPS")
    public void iEnterLongSellcommandToForNRPS() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long sell command for NRPS");

            isharesPage3.longSellCmdForNRPS(logInfo);
            logInfo.pass("I enter long sell command for NRPS");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-CQA_C_ command and check response")
    public void iEnterCQA_C_CommandAndCheckResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CQA_C_ command and check response");
            isharesPage3.toSend6_CQA(logInfo);
            logInfo.pass("I enter 6-CQA_C_ command and check response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CR_ command to display status")
    public void iEnterCR_Command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CR_ command and check response");
            isharesPage3.toSend6_CR(logInfo);
            logInfo.pass("I enter 6:CR_ command and check response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:PR_Cmd {string} to validate {string}")
    public void iEnterPR_CmdToValidate(String cmd, String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CR_ command and check response");
            isharesPage3.toSend6_PR(logInfo, cmd, entry);
            logInfo.pass("I enter 6:CR_ command and check response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:C*_ command to display inbound connections")
    public void i_enter_6C_command_to_display_inbound_connects() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:C*_ command to display inbound connects");
            isharesPage3.displayConnectionDetails(logInfo);
            logInfo.pass("I enter 6:C*_ command to display inbound connects");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:CO_ command to display flight status")
    public void iEnterCO_CommandToDisplayFlightStatus() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CO_ command to display flight status");
            isharesPage3.toSend6_CO_Command(logInfo);
            logInfo.pass("I enter 6:CO_ command to display flight status");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*K_ command to display list")
    public void iEnterK_CommandToDisplayList() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*K_ command to display list");
            isharesPage3.toSend6K_Command(logInfo);
            logInfo.pass("I enter 6:*K_ command to display list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:K_ {string} command to display standby list")
    public void iEnterK_CommandToDisplayStandbyList(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform 6:K to display list");
            isharesPage3.toSend6K_COSCommand(logInfo, COS);
            logInfo.pass("I perform 6:K to display list");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-FCB_ command to verify flight closure breakdown with Invalid parameters")
    public void i_enter_6_FCB_command_to_verify_flight_closure_breakdown_withInvalidparameters() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-FCB_ command to verify flight closure breakdown with Invalid parameters");
            isharesPage3.flightClosureBreakdownWithInvalidValue(logInfo);
            logInfo.pass("I enter 6-FCB_ command to verify flight closure breakdown with Invalid parameters");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter inValidFleet_command to display error messages")
    public void iEnterinValidFleet_commandToDisplayErrorMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter inValidFleet_command to display error messages");
            isharesPage3.toVerifyInvalidResponseForFleet(logInfo);
            logInfo.pass("I enter inValidFleet_command to display error messages");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter inValid_command to display inValid Act Code error messages")
    public void iEnterinValid_commandToDisplayinValidActCodeErrorMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter inValid_command to display inValid Act Code error messages");
            isharesPage3.verifyInvalidActCode(logInfo);
            logInfo.pass("I enter inValid_command to display inValid Act Code error messages");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter inValid_command_Activationof_Waitlist_Clearance_ToDisplayErrorMessages")
    public void iEnterinValid_command_ActivationofWaitlistClearanceToDisplayErrorMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter inValid_command_Activationof_Waitlist_Clearance_ToDisplayErrorMessages");
            isharesPage3.toVerifyInvalidResponseForActivationofWaitlistClearance(logInfo);
            logInfo.pass("I enter inValid_command_Activationof_Waitlist_Clearance_ToDisplayErrorMessages");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBT_command to display error messages for invalid Flight")
    public void iEnterPBT_commandToDisplayErrorMessagesForInvalidFlightNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBT_command to display error messages for invalid Flight");
            isharesPage3.toVerifyInvalidResponseForPBTCommand(logInfo);
            logInfo.pass("I enter PBT_command to display error messages for invalid Flight");

        } catch (AssertionError | Exception e) {


            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter inValid_command to display error message for ASA ABP Restriction Table")
    public void iEnterinValid_commandToDisplayErrorMsgForASAABPRestrictionTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter inValid_command to display error message for ASA/ABP Restriction Table");
            isharesPage3.verifyInvalidmessageforASAABPRestrictionTable(logInfo);
            logInfo.pass("I enter inValid_command to display error message for ASA/ABP Restriction Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter inValid_command to display error message for for Advance Seat Assignment")
    public void iEnterinValid_commandToDisplayErrorMsgForforAdvanceSeatAssignment() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter inValid_command to display error message for for Advance Seat Assignment");
            isharesPage3.verifyInvalidmessageforforAdvanceSeatAssignment(logInfo);
            logInfo.pass("I enter inValid_command to display error message for for Advance Seat Assignment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter inValid_command to display error message for for Advance Seat Assignment after PNT Retrival")
    public void iEnterinValid_commandToDisplayErrorMsgForforAdvanceSeatAssignmentAfterPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter inValid_command to display error message for for Advance Seat Assignment after PNT Retrival");
            isharesPage3.verifyInvalidmessageforforAdvanceSeatAssignmentAfterPNR(logInfo);
            logInfo.pass("I enter inValid_command to display error message for for Advance Seat Assignment after PNT Retrival");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LDD command to list display")
    public void I_enter_LDD_command_to_List_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I LDD command to list display");
            isharesPage3.enterLDCommand(logInfo);
            logInfo.pass("I enter LDD command to list display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter L*1 command")
    public void iEnterLStar1Command() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter L* command");
            isharesPage3.enterLStarOneCommand(logInfo);
            logInfo.pass("I enter L* command");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter DD1 command to list display")
    public void I_enter_DD1_command_to_List_display() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DD1 command to list display");
            isharesPage3.enterDD1CommandsToDisplayItineraryForRetrieved(logInfo);
            logInfo.pass("I enter DD1 command to list display");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 2P command to verify FLIFO")
    public void I_enter_2P_command_to_verify_FLIFO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 2P command to verify FLIFO");
            isharesPage3.FLIFOOperation(logInfo);
            logInfo.pass("I enter 2P command to verify FLIFO");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 5Remarks uptp the limit")
    public void verify_MaxLimitOf5Remarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 5Remarks uptp the limit");
            isharesPage3.EnterMax5RemarksUptoTheMaxLimit(logInfo);
            logInfo.pass("I enter 5Remarks uptp the limit");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify the error msg for 5Remarks when beyond the limit")
    public void verify_errorMaxLimitOf5Remarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the error msg for 5Remarks when beyond the limit");
            isharesPage3.VerifyErrorMsgbeyodMax5RemarksLimit(logInfo);
            logInfo.pass("I verify the error msg for 5Remarks when beyond the limit");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K8 command to verify the RECAP")
    public void I_enter_K8_command_to_verify_RECAP() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K8 command to verify the RECAP");
            isharesPage3.K8ToVerifyRecap(logInfo);
            logInfo.pass("I enter K8 command to verify the RECAP");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7P command to verify error message while changing name")
    public void I_enter_7Pcommand_toverifyerrormessage_whilechangingname() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7P command to verify error message while changing name");
            isharesPage3.enter7PCommandtoVerifyErrorMsg(logInfo);
            logInfo.pass("I enter 7P command to verify error message while changing name");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Queue command to verify the entries")
    public void I_enter_Queue_command_to_verify_Entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Queue command to verify the entries");
            isharesPage3.IenterQueuecommandtoverifytheentries(logInfo);
            logInfo.pass("I enter Queue command to verify the entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6PER")
    public void iEnter6PER() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6PER");
            isharesPage3.enter6PER(logInfo);
            logInfo.pass("I enter 6PER");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD command to verify the same name")
    public void I_enter_6LD_command_to_verify_SameName() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD command to verify the same name");
            isharesPage3.verifyPassengerListDisplaytoVerifySimilarName(logInfo);
            logInfo.pass("I enter 6:LD command to verify the same name");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6Name command to verify Adult CheckIn")
    public void I_enter_6LD_command_to_verify_AdultCheckIn() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6Name command to verify Adult CheckIn");
            isharesPage3.iEnter6NametoCheckInAdudlt(logInfo);
            logInfo.pass("I enter 6Name command to verify Adult CheckIn");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6LD ALL CI")
    public void iEnter6LDAllCI() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6LD ALL CI");
            isharesPage3.iEnter6LDALLCI(logInfo);
            logInfo.pass("I enter 6LD ALL CI");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6GD")
    public void iEnter6GD() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6GD");
            isharesPage3.downGradePassenger(logInfo);
            logInfo.pass("I enter 6GD");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6GO")
    public void iEnter6GO() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6GO");
            isharesPage3.assignSeatsToTheOverSold(logInfo);
            logInfo.pass("I enter 6GO");

        } catch (AssertionError | Exception exception) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6: command to verify error message for code share flights")
    public void enter_command_verifyerrormessageforcodeshareflights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6: command to verify error message for code share flights");
            isharesPage3.entercommand_verifyerrormessageforcodeshareflights(logInfo);
            logInfo.pass("I enter 6: command to verify error message for code share flights");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I save the changes of group pnr after modifying the segment")
    public void iMakeAdjustOnGroupETKTIrregularExchange() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save the changes of group pnr after modifying the segment");
            isharesPage3.saveAfterGroupModifyingSegment(logInfo);
            logInfo.pass("I save the changes of pnr after modifying the segment");


        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter 6:KM command to Run Individual Standby list promotion")
    public void enter_6KM_RunIndividualStandbylistpromotion() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:KM command to Run Individual Standby list promotion");
            isharesPage3.enter6KM_RunIndividualStandbylistpromotion(logInfo);
            logInfo.pass("I enter 6:KM command to Run Individual Standby list promotion");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run the Agent Entry Notification to Flight Control")
    public void enter_command_RuntheAgentEntryNotificationtoFlightControl() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run the Agent Entry Notification to Flight Control");
            isharesPage3.entercommand_RuntheAgentEntryNotificationtoFlightControl(logInfo);
            logInfo.pass("I enter command to Run the Agent Entry Notification to Flight Control");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Run the Obtaining Auxiliary Services")
    public void enter_command_RuntheObtainingAuxiliaryServices() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run the Obtaining Auxiliary Services");
            isharesPage3.entercommand_RuntheObtainingAuxiliaryServices(logInfo);
            logInfo.pass("I enter command to Run the Obtaining Auxiliary Services");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6: access to SHARES CM System")
    public void I_enter_6_access_to_shares_CM_system() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6: access to SHARES CM System");
            isharesPage3.enter6accessToSharesCMSystem(logInfo);
            logInfo.pass("I enter 6: access to SHARES CM System");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6: Marketing Flight has Access to share")
    public void I_enter_6_Marketing_Flight_has_Access_to_share() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6: Marketing Flight has Access to share");
            isharesPage3.enter6MarkeingFlightHasAccessToShare(logInfo);
            logInfo.pass("I enter 6: Marketing Flight has Access to share");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD ACI Flight History after Check-in passengers")
    public void I_enter_6_LD_ACI_Flight_History_after_Check_in_passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD ACI Flight History after Check-in passengers");
            isharesPage3.enter6LDACIFlightHistoryAfterChechInPassengers(logInfo);
            logInfo.pass("I enter 6:LD ACI Flight History after Check-in passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:*H ACI Flight History after Check-in passengers")
    public void I_enter_6_H_ACI_flight_History_after_check_in_passengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:*H ACI Flight History after Check-in passengers");
            isharesPage3.enter6HACIFlightHistoryAfterChechInPassengers(logInfo);
            logInfo.pass("I enter 6:*H ACI Flight History after Check-in passengers");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADW* the Standard Weights Table display entries with invalid parameters")
    public void I_enter_PADW_the_Standard_Weights_Table_display_entries_with_invalid_parameters() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADW* the Standard Weights Table display entries with invalid parameters");
            isharesPage3.PADWTheStandardWeightdTableDisplayEntriesInvalidParameters(logInfo);
            logInfo.pass("I enter PADW* the Standard Weights Table display entries with invalid parameters");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADW Standard Weights Table display entries")
    public void I_enter_PADW_Standard_Weights_Table_display_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADW Standard Weights Table display entries");
            isharesPage3.enterPADWStandardWeightTableDisplayEntires(logInfo);
            logInfo.pass("I enter PADW Standard Weights Table display entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PADP Veify below error messages")
    public void I_enter_PADP_Verfy_below_error_messages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADP Veify below error messages");
            isharesPage3.enterPADPVerifyBelowErrorMessages(logInfo);
            logInfo.pass("I enter PADP Veify below error messages");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:P Run Protect From Post Departure SHA SHARES")
    public void I_enter_6_P_Run_Protect_From_post_Departure_Sha_Shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:P Run Protect From Post Departure SHA SHARES");
            isharesPage3.enter6PRunProtectFromPostDepartureShares(logInfo);
            logInfo.pass("I enter 6:P Run Protect From Post Departure SHA SHARES");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6: Reassign Fleet Name SHARES entries")
    public void I_enter_6_reassign_Fleet_Name_shares_entries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6: Reassign Fleet Name SHARES entries");
            isharesPage3.enter6ReassignFleetNameSharesEntries(logInfo);
            logInfo.pass("I enter 6: Reassign Fleet Name SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DW*H Denied Boarding History")
    public void I_enter_6_DW_H_Denied_Boarding_History() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DW*H Denied Boarding History");
            isharesPage3.enter6DWHDeniedBoardingHistory(logInfo);
            logInfo.pass("I enter 6:DW*H Denied Boarding History");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DW Denied Boarding Worksheet")
    public void I_enter_6_DW_Denied_Boarding_Worksheet() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DW Denied Boarding History");
            isharesPage3.enter6DWDeniedBoardingHistory(logInfo);
            logInfo.pass("I enter 6:DW Denied Boarding History");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIL Check the host flight")
    public void I_enter_VIL_Check_the_host_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIL Check the host flight");
            isharesPage3.enterVILCheckTheHostFlight(logInfo);
            logInfo.pass("I enter VIL Check the host flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML Modify leg details in inventory")
    public void I_enter_VML_Modify_leg_Details_in_inventory() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML Modify leg details in inventory");
            isharesPage3.enterVMLModifyLegdetailsInInventory(logInfo);
            logInfo.pass("I enter VML Modify leg details in inventory");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIL inventory detail of the flight")
    public void I_enter_VIL_inventory_detail_of_the_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIL inventory detail of the flight");
            isharesPage3.enterVILInventoryDetailOfTheFlight(logInfo);
            logInfo.pass("I enter VIL inventory detail of the flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KT|SV Item in The Service Designator Table")
    public void I_enter_KT_SV_Item_in_The_Service_Designator_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KT|SV Item in The Service Designator Table");
            isharesPage3.enterKTSVItemInTheServiceDesignatorTable(logInfo);
            logInfo.pass("I enter KT|SV Item in The Service Designator Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VIE modify inventory with WML entry")
    public void I_enter_VIE_Modify_Inventory_With_WML_entry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VIE modify inventory with WML entry");
            isharesPage3.entryVIEModifyInventoryWithWMLEntry(logInfo);
            logInfo.pass("I enter VIE modify inventory with WML entry");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter VML Modify the inventory VML to update")
    public void I_enter_VML_Modify_the_inventory_VML_to_update() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter VML Modify the inventory VML to update");
            isharesPage3.enterVMLModifyTheInventoryVMLToUpdate(logInfo);
            logInfo.pass("I enter VML Modify the inventory VML to update");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DWR addition of Input Denied Boarding Flight")
    public void I_enter_6_DWR_addition_of_Input_Denied_Boarding_Flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DWR addition of Input Denied Boarding Flight");
            isharesPage3.enter6DWRAdditionOfInputDeniedBoardingFlight(logInfo);
            logInfo.pass("I enter 6:DWR addition of Input Denied Boarding Flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DWR  Denied boarding flight info for the specific flight")
    public void I_enter_6_DWR_Denied_boarding_flight_info_for_the_specific_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DWR  Denied boarding flight info for the specific flight");
            isharesPage3.enter6DWRDeniedBoardingFlightInfoFortheSpecificFlight(logInfo);
            logInfo.pass("I enter 6:DWR  Denied boarding flight info for the specific flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-$  payment using Visa Debit")
    public void I_enter_T_$_payment_Using_Visaa_Debit() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$  payment using Visa Debit");
            isharesPage3.enterT$PaymentUsingVisaDebit(logInfo);
            logInfo.pass("I enter T-$  payment using Visa Debit");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DWR addition of Input Denied Boarding Flight Remarks")
    public void I_enter_6_DWR_addition_of_Input_Denied_Boarding_flight_remarks() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DWR addition of Input Denied Boarding Flight Remarks");
            isharesPage3.enter6DWRAdditionOfInputDeniedBoardingFlightRemarks(logInfo);
            logInfo.pass("I enter 6:DWR addition of Input Denied Boarding Flight Remarks");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DWR info for the specific flight")
    public void I_enter_6_DWR_info_for_the_specific_flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DWR info for the specific flight");
            isharesPage3.enter6DWRinfoForTheSpecificFlight(logInfo);
            logInfo.pass("I enter 6:DWR info for the specific flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:DWR modification of Input Denied Boarding Flight")
    public void I_enter_6_DWR_modification_of_Input_Denied_Boarding_Flight() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DWR modification of Input Denied Boarding Flight");
            isharesPage3.enter6DWRModificationofInputDeniedBoardingFlight(logInfo);
            logInfo.pass("I enter 6:DWR modification of Input Denied Boarding Flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I capture the seat number after assigning seat")
    public void iCaptureTheSeatNumberAfterAssigningSeat() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I capture the seat number after assigning seat");

            isharesPage3.captureTheSeatNumberAfterAssigningSeat(logInfo);
            logInfo.pass("I capture the seat number after assigning seat");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EH_EMD command to display EMDs in the PNR")
    public void iEnterEH_EMDCommandToDisplayEMDsInThePNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH_EMD command to display EMDs in the PNR");
            isharesPage3.enterEH_EMDCommandToDisplayEMDsInThePNR(logInfo);
            logInfo.pass("I enter *EH_EMD command to display EMDs in the PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EHn_EMD command to display EMDs in the PNR for specific passengers")
    public void iEnterEHn_EMDCommandToDisplayEMDsInThePNRForSpecificPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EHn_EMD command to display EMDs in the PNR for specific passengers");

            isharesPage3.enterEHn_EMDCommandToDisplayEMDsInThePNRForSpecificPassengers(logInfo);
            logInfo.pass("I enter *EHn_EMD command to display EMDs in the PNR for specific passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *EMD command to display EMDs in the PNR for specific EMD {string}")
    public void iEnterEH_EMDCommandToDisplayEMDsInThePNRForSpecificEMD(String EMD) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *EH_EMD command to display EMDs in the PNR for specific EMD");

            isharesPage3.enterEH_EMDCommandToDisplayEMDsInThePNRForSpecificEMD(logInfo, EMD);
            logInfo.pass("I enter *EH_EMD command to display EMDs in the PNR for specific EMD");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET_CRS command to run the CRS ETKT updates")
    public void iEnterTET_CRSCommandToRunTheCRSETKTUpdates() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_CRS command to run the CRS ETKT updates");

            isharesPage3.enterTET_CRSCommandToRunTheCRSETKTUpdates(logInfo);
            logInfo.pass("I enter T-ET_CRS command to run the CRS ETKT updates");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET_ALL command to display ETKT data")
    public void iEnterET_ALLCommandToDisplayETKTData() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET_ALL command to display ETKT data");

            isharesPage3.enterET_ALLCommandToDisplayETKTData(logInfo);
            logInfo.pass("I enter *ET_ALL command to display ETKT data");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ALL_ET_Q command to display Display ETKT Passengers with Queue Placement")
    public void iEnterLD_ALL_ET_QCommandToDisplayDisplayETKTPassengersWithQueuePlacement() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ALL_ET_Q command to display Display ETKT Passengers with Queue Placement\"");

            isharesPage3.enterLD_ALL_ET_QCommandToDisplayDisplayETKTPassengersWithQueuePlacement(logInfo);
            logInfo.pass("I enter 6:LD_|ALL_ET_Q command to display Display ETKT Passengers with Queue Placement");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T-$ command to validate invalid response {string}")
    public void iEnterT$ETCommandToValidateInvalidResponse(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$ command to validate invalid response");
            isharesPage3.enterT$ETCommandToValidateInvalidResponse(logInfo,Entry);
            logInfo.pass("I enter T-$ command to validate invalid response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I enter T-ET_SECURITY_REORG command")
    public void iEnterTET_SECURITY_REORGCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET_SECURITY_REORG command");

            isharesPage3.enterTET_SECURITY_REORGCommand(logInfo);
            logInfo.pass("I enter T-ET_SECURITY_REORG command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter FQ_TAX command")
    public void iEnterFQ_TAXCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FQ_TAX command");

            isharesPage3.enterFQ_TAXCommand(logInfo);
            logInfo.pass("I enter FQ_TAX command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter DX_PFC command")
    public void iEnterDX_PFCCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DX_PFC command");

            isharesPage3.enterDX_PFCCommand(logInfo);
            logInfo.pass("I enter DX_PFC command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ED command to display past date Unflown segments List")
    public void iEnterEDCommandToDisplayPastDateUnflownSegmentsList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter DX_PFC command");

            isharesPage3.enterEDCommandToDisplayPastDateUnflownSegmentsList(logInfo);
            logInfo.pass("I enter DX_PFC command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *ET-DOC command to display the passenger receipts and validated {string}")
    public void iEnterETDOCCommandToDisplayThePassengerReceiptsAndValidated(String ValdateText) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *ET-DOC command to display the passenger receipts and validated " + ValdateText);

            isharesPage3.enterETDOCCommandToDisplayThePassengerReceiptsAndValidated(logInfo, ValdateText);
            logInfo.pass("I enter *ET-DOC command to display the passenger receipts and validated " + ValdateText);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ET_TAX command")
    public void iEnterET_TAXCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ET_TAX command");

            isharesPage3.enterET_TAXCommand(logInfo);
            logInfo.pass("I enter ET_TAX command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-$EE_ET command to run even exhange entry")
    public void iEnterT$EE_ETCommandToRunEvenExhangeEntry() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-$EE_ET command to run even exhange entry");

            isharesPage3.enterT$EE_ETCommandToRunEvenExhangeEntry(logInfo);
            logInfo.pass("I enter T-$EE_ET command to run even exhange entry");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set fname {string} for pax index {string}")
    public void iSetFnameForSegment(String Fname, String paxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set fname " + Fname);

            isharesPage3.setfnameForSpecificPax(Fname, paxIndex);
            logInfo.pass("I set fname " + Fname);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter 6:P command to perform protected pax by name and display protected pax {string}")
    public void iEnterPCommandToPerformProtectedPaxByNameAndDisplayProtectedPax(String ProtectedType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:P command to perform protected pax by name and display protected pax");

            isharesPage3.passengerSpaceProtection(logInfo, ProtectedType);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6_DN command to perform seat change in downline station")
    public void iEnter_DNCommandToPerformSeatChangeInDownlineStation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6_DN command to perform seat change in downline station");

            isharesPage3.enter_DNCommandToPerformSeatChangeInDownlineStation(logInfo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:U command to assign Seat for the passenger {string}")
    public void iEnterUCommandToAssignSeatForThePassenger(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:U command to assign Seat for the passenger");
            isharesPage3.enterUCommandToAssignSeatForThePassenger(logInfo, COS);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PEFLI command to get invalid response {string}")
    public void iEnterPEFLICommandToGetInvalidResponse(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PEFLI command to get invalid response");

            isharesPage3.enterPEFLICommandToGetInvalidResponse(logInfo, Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_CUR command")
    public void iEnterT_CURCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_CUR command");

            isharesPage3.enterT_CURCommand(logInfo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ETFIM command for total Segments {string}")
    public void iEnterTETFIMCommandForTotalSegments(String TotalSegments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETFIM command for total Segments ");

            isharesPage3.enterTETFIMCommandForTotalSegments(logInfo, TotalSegments);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *E command to validate invalid response")
    public void iEnterECommandToValidateInvalidResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *E command to validate invalid response");

            isharesPage3.enterECommandToValidateInvalidResponse(logInfo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ETPRINT command to print the ticket number to display error response")
    public void iEnterTETPRINTCommandToPrintTheTicketNumberToDisplayErrorResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ETPRINT command to print the ticket number to display error response");

            isharesPage3.enterET_PrintToPrintTicket(logInfo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter long sell command for Group")
    public void iEnterLongSellcommandToForGroup() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long sell command for Group");

            isharesPage3.longSellCmdForGROUP(logInfo);
            logInfo.pass("I enter long sell command for Group");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *QH_ETK Command")
    public void iEnterQH_ETKCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *QH_ETK command");

            isharesPage3.enterQH_ETKCommand(logInfo);
            logInfo.pass("I enter *QH_ETK command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:R command for changing seat after checkin with bag {string}")
    public void iEnterRCommandForChangingSeatAfterCheckinWIthBag(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:R command for changing seat after checkin with bag");
            isharesPage3.changeSeatWithBag(logInfo, COS);
            logInfo.pass("I enter 6:R command for changing seat after checkin with bag");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a TTY entry for an intermediate Flag stop")
    public void enter_Create_a_TTY_entry_intermediateFlagStop() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a TTY entry for an intermediate Flag stop");
            isharesPage3.Create_a_TTY_entry_intermediateFlagStop(logInfo);
            logInfo.pass("I enter Y command to create a TTY entry for an intermediate Flag stop");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a TTY entry for an New Termination Flag stop")
    public void enter_Create_a_TTY_entry_NewTerminationFlagStop() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a TTY entry for an New Termination Flag stop");
            isharesPage3.Create_a_TTY_entry_NewTerminationFlagStop(logInfo);
            logInfo.pass("I enter Y command to create a TTY entry for an New Termination Flag stop");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a TTY entry for adding ETO Information")
    public void enter_Create_a_TTY_entry_addingETOInformation() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a TTY entry for adding ETO Information");
            isharesPage3.Create_a_TTY_entry_addingETOInformation(logInfo);
            logInfo.pass("I enter Y command to create a TTY entry for adding ETO Information");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I create a TTY Booking message with GDS_PassengerType_Segment details")
    public void enter_Create_a_TTYBookingMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I create a TTY Booking message with GDS_PassengerType_Segment details");
            isharesPage3.Create_a_TTYBookingMessage(logInfo);
            logInfo.pass("I create a TTY Booking message with GDS_PassengerType_Segment details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I create a TTY Booking message with GDS_PassengerType Multi-initial_Segment details")
    public void enter_Create_a_TTYBookingMessageMulti_initial() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I create a TTY Booking message with GDS_PassengerType Multi-initial_Segment details");
            isharesPage3.Create_a_TTYBookingMessageMulti_initial(logInfo);
            logInfo.pass("I create a TTY Booking message with GDS_PassengerType Multi-initial_Segment details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I create a TTY Booking message with GDS_PassengerType Multi-initial_Segment details with SSRType {string}")
    public void enter_Create_a_TTYBookingMessageMulti_initial026(String ssrType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I create a TTY Booking message with GDS_PassengerType Multi-initial_Segment details with SSRType " + ssrType);
            isharesPage3.Create_a_TTYBookingMessageMulti_initial026(logInfo, ssrType);
            logInfo.pass("I create a TTY Booking message with GDS_PassengerType Multi-initial_Segment details with SSRType " + ssrType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I create a TTY Booking message with GDS_Passenger 01 Adult + 01 Infant Segment details with SSRType {string}")
    public void enter_Create_a_TTYBookingMessage004(String ssrType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I create a TTY Booking message with GDS_Passenger 01 Adult + 01 Infant Segment details with SSRType " + ssrType);
            isharesPage3.Create_a_TTYBookingMessage004(logInfo, ssrType);
            logInfo.pass("I create a TTY Booking message with GDS_Passenger 01 Adult + 01 Infant Segment details with SSRType " + ssrType);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command C:BAL0 to Balance TAR SHARES entries")
    public void enter_checkBalanceTAR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command C:BAL0 to Balance TAR SHARES entries");
            isharesPage3.checkBalanceTAR(logInfo);
            logInfo.pass("I enter command C:BAL0 to Balance TAR SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check both Cash and Billable Credit Cards of Balancing TAR SHARES entries")
    public void enter_CashChecksBillableCreditCardsOfBalancing() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check both Cash and Billable Credit Cards of Balancing TAR SHARES entries");
            isharesPage3.CashChecksBillableCreditCardsOfBalancing(logInfo);
            logInfo.pass("I enter command to check both Cash and Billable Credit Cards of Balancing TAR SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check Cash_Checks only of Balancing TAR SHARES entries")
    public void enter_CashChecksBalancingOnly() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check Cash_Checks only of Balancing TAR SHARES entries");
            isharesPage3.CashChecksBalancingOnly(logInfo);
            logInfo.pass("I enter command to check Cash_Checks only of Balancing TAR SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check Billable Credit Cards only of Balancing TAR SHARES entries")
    public void enter_BillableCreditCardsOnly() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check Billable Credit Cards only of Balancing TAR SHARES entries");
            isharesPage3.BillableCreditCardsOnly(logInfo);
            logInfo.pass("I enter command to check Billable Credit Cards only of Balancing TAR SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to check No Cash_Checks or Billable Credit Cards of Balancing TAR SHARES entries")
    public void enter_NoCash_ChecksorBillableCreditCards() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to check No Cash_Checks or Billable Credit Cards of Balancing TAR SHARES entries");
            isharesPage3.BillableCreditCardsOnly(logInfo);
            logInfo.pass("I enter command to check No Cash_Checks or Billable Credit Cards of Balancing TAR SHARES entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error message for ETKT updates")
    public void iEnterCommandToVerifyErrorMessageForETKTUpdates() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error message for ETKT updates");
            isharesPage3.toVerifyErrorMessageForETKTUpdates(logInfo);
            logInfo.pass("I enter command to verify error message for ETKT updates");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:OUI_ command to inhibit or enable the IATA outbound messages for message type {string}")
    public void iEnterOUI_CommandToInhibitOrEnableTheIATAOutboundMessagesForMessageType(String messageType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:OUI_ command to inhibit or enable the IATA outbound messages");
            isharesPage3.inhibitOrEnableIATAOutboundMessages(logInfo, messageType);
            logInfo.pass("I enter 6:OUI_ command to inhibit or enable the IATA outbound messages");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:OSD_ command to generate the IATA outbound messages")
    public void iEnterOSD_CommandToGenerateTheIATAOutboundMessages() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:OSD_ command to generate the IATA outbound messages");
            isharesPage3.generateIATAOutboundMessages(logInfo);
            logInfo.pass("I enter 6:OSD_ command to generate the IATA outbound messages");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_Q_ command to perform queue placement of ACI")
    public void iEnterLD_Q_CommandToPerformQueuePlacementOfACI() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_Q_ command to perform queue placement of ACI");
            isharesPage3.ACIQueuePlacement(logInfo);
            logInfo.pass("I enter 6:LD_Q_ command to perform queue placement of ACI");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|U to display U-thru passengers list")
    public void iEnterLD_UToDisplayUThruPassengersList() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|U to display U-thru passengers list");
            isharesPage3.displayUThruPassengersList(logInfo);
            logInfo.pass("I enter 6:LD_|U to display U-thru passengers list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:MT|CLEAR command to clear the mass transfer")
    public void iEnterMTCLEARCommandToClearTheMassTransfer() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:MT|CLEAR command to clear the mass transfer");
            isharesPage3.clearMassTranfer(logInfo);
            logInfo.pass("I enter 6:MT|CLEAR command to clear the mass transfer");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:MT|RESTART command to restart flight to flight mass transfer")
    public void iEnterMTRESTARTCommandToRestartFlightToFlightMassTransfer() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:MT|RESTART command to restart flight to flight mass transfer");
            isharesPage3.restartMassTranfer(logInfo);
            logInfo.pass("I enter 6:MT|RESTART command to restart flight to flight mass transfer");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|ALLETOS command to display the tickets that are out of sync without creating a PNR")
    public void iEnterLD_ALLETOSCommandToDisplayTheTicketsThatAreOutOfSyncWithoutCreatingAPNR() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|ALL/ETOS command to display the tickets that are out of sync without creating a PNR");
            isharesPage3.displayTKTOutOfSyncListWithoutCreatingAPNR(logInfo);
            logInfo.pass("I enter 6:LD_|ALL/ETOS command to display the tickets that are out of sync without creating a PNR");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Activate Master Control set")
    public void iEnterCommandToActivateMasterControlSet() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Activate Master Control set");
            isharesPage3.activateMasterControlSet(logInfo);
            logInfo.pass("I enter command to Activate Master Control set");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Deactivate Master Control set")
    public void iEnterCommandToDeactivateMasterControlSet() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Deactivate Master Control set");
            isharesPage3.deactivateMasterControlSet(logInfo);
            logInfo.pass("I enter command to Deactivate Master Control set");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_PF command to display negotiated fare pf user")
    public void iEnterT_PFCommandToDisplayNegotiatedFarePfUser() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_PF command to display negotiated fare pf user");
            isharesPage3.displayNegotiatedFarePfUserTable(logInfo);
            logInfo.pass("I enter T_PF command to display negotiated fare pf user");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_PF command to display negotiated fare pf user for {string}")
    public void iEnterT_PFCommandToDisplayNegotiatedFarePfUserFor(String PFNumber) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_PF command to display negotiated fare pf user for " + PFNumber);
            isharesPage3.displayNegotiatedFarePfUser(logInfo, PFNumber);
            logInfo.pass("I enter T_PF command to display negotiated fare pf user for " + PFNumber);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter longsell command for NRSA passenger with pax {string}")
    public void iEnterLongsellCommandForNRSAPassengerwith(String paxNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter longsell command for NRSA passenger with pax " + paxNo);
            isharesPage3.longsellCommandForNRSApax(logInfo, paxNo);
            logInfo.pass("I enter longsell command for NRSA passenger with pax " + paxNo);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to inhibit ticket when the fare ladder is too long")
    public void iEnterCommandToInhibitTicketWhenTheFareLadderIsTooLong() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to inhibit ticket when the fare ladder is too long");
            isharesPage3.inhibitTicket(logInfo);
            logInfo.pass("I enter command to inhibit ticket when the fare ladder is too long");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Allows carrier to add statements to a Fare Display for the {string} and {string}")
    public void iAllowsCarrierToAddStatementsToAFareDisplayForThe(String origin, String destination) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Allows carrier to add statements to a Fare Display for the " + origin + " and " + destination);
            isharesPage3.addStatementToFareDisplay(logInfo, origin, destination);
            logInfo.pass("I Allows carrier to add statements to a Fare Display for the " + origin + " and " + destination);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I display AVS exception table")
    public void idisplayAVSExceptionTable() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display AVS exception table");
            isharesPage3.displayAVSExceptionTable(logInfo);
            logInfo.pass("I display AVS exception table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I print the boarding pass for codeshare flights")
    public void iPrintBordingPassForCodeshareFlights() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I print the boarding pass for codeshare flights");
            isharesPage3.printBoardingPassForCodeshareFlights(logInfo);
            logInfo.pass("I print the boarding pass for codeshare flights");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6-FCB command to display flight closer breakdown")
    public void iEnter6_FCBCommandToDisplayFlightCloserBreakdown() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-FCB command to display flight closer breakdown");
            isharesPage3.displayFlightCloserBreakdown(logInfo);
            logInfo.pass("I enter 6-FCB command to display flight closer breakdown");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6-FM command to display CAT entry when the Appswith is off")
    public void iEnter6_FMCommandToDisplayCATentryWhenTheAppswitchIsOff() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-FM command to display CAT entry when the Appswith is off");
            isharesPage3.displayCATentryAppSwitchOff(logInfo);
            logInfo.pass("I enter 6-FM command to display CAT entry when the Appswith is off");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter PEFLI command to display fill in format display")
    public void iEnterPEFLICommandToDisplayFillInFormatDisplay() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PEFLI command to display fill in format display");
            isharesPage3.displayFillInFormatDisplay(logInfo);
            logInfo.pass("I enter PEFLI command to display fill in format display");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter FS* command to display IFS Fare quote USR for city {string}")
    public void iEnterFSCommandToDisplayIFSFarequoteUSRForCity(String city) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter FS* command to display IFS Fare quote USR for city");
            isharesPage3.displayIFSFarequoteUSR(logInfo, city);
            logInfo.pass("I enter FS* command to display IFS Fare quote USR for city");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter command to ticket PNR by credit card")
    public void iEnterCommandToTicketPNRByCreditCard() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to ticket PNR by credit card");
            isharesPage3.ticketPNRByCreditCard(logInfo);
            logInfo.pass("I enter command to ticket PNR by credit card");
        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter command to display ticketing validation table")
    public void iEnterCommandToDisplayTicketingValidationTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to display ticketing validation table");
            isharesPage3.ticketingValidationTable(logInfo);
            logInfo.pass("I enter command to display ticketing validation table");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I display fare date using number of lines in agent set")
    public void i_display_fare_data_using_number_of_lines_in_agent_set() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I display fare date using number of lines in agent set");
            isharesPage3.displayFareData(logInfo);
            logInfo.pass("I display fare date using number of lines in agent set");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to Automate the printing of multi-purpose codocs for the pectabes {string} and {string}")
    public void iEnterCommandToAutomateThePrintingOfMultiPurposeCodocsForThePectabes(String bpPectab, String tkPectab) {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Automate the printing of multi-purpose codocs for the pectabes");
            isharesPage3.printingOfMultiPurposeCodocs(logInfo, bpPectab, tkPectab);
            logInfo.pass("I enter command to Automate the printing of multi-purpose codocs for the pectabes");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I change status of segments {string} to NoShowed status")
    public void I_change_all_the_segments_status_to_NOSHOWED_for_the_passengers(String noOfSegments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I change status of segments " + noOfSegments + "to NoShowed status");
            isharesPage3.changeSegmentsStatusToNoShowed(logInfo, noOfSegments);
            logInfo.pass("I change status of segments " + noOfSegments + "to NoShowed status");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET*COS command to remain sync when COS change is made")
    public void IEnterT_ET_COS_CommandToRemainSyncWhenCOSchangeIsMade() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET*COS command to remain sync when COS change is made");
            isharesPage3.eTKTPNRToRemainSyncWhenCOSchangeIsMade(logInfo);
            logInfo.pass("I enter T-ET*COS command to remain sync when COS change is made");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to expand fare and tax limit for host tickets with SFD quote")
    public void IEnterCommandToExpandFareAndTaxLimitForHostTicketsWithSFDQuote() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to expand fare and tax limit for host tickets with SFD quote");
            isharesPage3.expandFareAndTaxLimitForHostWithSFDQuote(logInfo);
            logInfo.pass("I enter command to expand fare and tax limit for host tickets with SFD quote");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to apply purge date sync on the exchanged tickets")
    public void IEnterCommandToApplypurgeDateSyncOnTheExchangedTickets() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to apply purge date sync on the exchanged tickets");
            isharesPage3.ApplypurgeDateSyncOnTheExchangedTickets(logInfo);
            logInfo.pass("I enter command to apply purge date sync on the exchanged tickets");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TKN_SSR command to sync SSR during ticket flight adjustment process")
    public void IEnterTKN_SSR_CommandToSyncDuringTicketFlightAdjustmentProcess() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TKN_SSR command to sync SSR during ticket flight adjustment process");
            isharesPage3.syncSSRDuringTicketFlightadjustment(logInfo);
            logInfo.pass("I enter TKN_SSR command to sync SSR during ticket flight adjustment process");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to expand fare and tax limit for host tickets with SFD quote for ARS currency")
    public void IEnterCommandToExpandFareAndTaxLimitForHostTicketsWithSFDQuoteForARSCurrency() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to expand fare and tax limit for host tickets with SFD quote for ARS currency");
            isharesPage3.expandFareAndTaxLimitForHostWithSFDQuoteforARSCurrency(logInfo);
            logInfo.pass("I enter command to expand fare and tax limit for host tickets with SFD quote for ARS currency");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to select etkt when PNR has pseudo flight for error message")
    public void IEnterCommandToSelectEtktWhenPNRHasPseudoFlightForErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to select etkt when PNR has pseudo flight for error message");
            isharesPage3.selectEtktWhenPnrHasPseudoFlight(logInfo);
            logInfo.pass("I enter command to select etkt when PNR has pseudo flight for error message");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 7TAW command for the ticketing command")
    public void IEnter7TAWCommandForTheTicketingCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 7TAW command for the ticketing command");
            isharesPage3.enter_7TAW(logInfo);
            logInfo.pass("I enter 7TAW command for the ticketing command");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ER command To validate No FQ error")
    public void IEnterERCommandToValidateNoFQError() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ER command To validate No FQ error");
            isharesPage3.enterERToValidateNoFQError(logInfo);
            logInfo.pass("I enter ER command To validate No FQ error");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6AA_ command To save the details")
    public void IEnter6AA_CommandToSaveTheDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6AA_ command To save the details");
            isharesPage3.enter6AA_ToSaveTheDetails(logInfo);
            logInfo.pass("I enter 6AA_ command To save the details");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter long sell command for other airline")
    public void enter_longSellCommand_for_other_arline() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter long sell command for other airline");
            isharesPage3.longSellforOtherAirine(logInfo);
            logInfo.pass("I enter long sell command for other airline");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD command to display codeshare max 20 class")
    public void enter_LDCommand_To_display_codeshare_max_20_class() {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to display codeshare max 20 class");
            isharesPage3.displayCodeshareMax20Class(logInfo);
            logInfo.pass("I enter LD command to display codeshare max 20 class");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to delete the passenger from PNR for pax index {string}")
    public void I_enter_command_to_delete_the_passenger_from_PNR_for_pax_index(String Index) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to delete the passenger from PNR for pax index");
            isharesPage3.deleteThePassengerForIndex(logInfo, Index);
            logInfo.pass("I enter command to delete the passenger from PNR for pax index");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM* command to run the Auto upgrade utility entry for Invalid User")
    public void I_enter_OCM_command_to_run_the_Auto_upgrade_utility_entry_for_invalid_user() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM* command to run the Auto upgrade utility entry for Invalid User");
            isharesPage3.runAutoUpgradeUtilityEntryForInvalidUser(logInfo);
            logInfo.pass("I enter OCM* command to run the Auto upgrade utility entry for Invalid User");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM* command to run the SSRDOCX PNR conversion for Invalid User")
    public void I_enter_OCM_command_to_run_the_SSRDOCX_PNR_conversion_for_invalid_user() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM* command to run the SSRDOCX PNR conversion for Invalid User");
            isharesPage3.runSsrdocxPnrConversionForInvalidUser(logInfo);
            logInfo.pass("I enter OCM* command to run the SSRDOCX PNR conversion for Invalid User");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCM command to Display Vet process status")
    public void I_enter_OCM_command_to_Display_Vet_process_status() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCM command to Display Vet process status");
            isharesPage3.displayVETProcessStatus(logInfo);
            logInfo.pass("I enter OCM command to Display Vet process status");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter ER command for error response when attempted to Create a PNR with name and itinerary only")
    public void I_enter_ER_command_for_error_response_when_attempted_to_Create_a_PNR_with_name_and_itinerary_only() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter ER command for error response when attempted to Create a PNR with name and itinerary only");
            isharesPage3.createPNRWithNameAndItineraryOnly(logInfo);
            logInfo.pass("I enter ER command for error response when attempted to Create a PNR with name and itinerary only");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter QEP command to place the PNR on Queue with remarks for the Queue number {string}")
    public void I_enter_QEP_command_to_place_the_PNR_on_Queue_with_remarks_for_the_Queue_number(String queueNo) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter QEP command to place the PNR on Queue with remarks for the Queue number");
            isharesPage3.enterQEP_ToplacePNRonQueueWithRemarks(logInfo, queueNo);
            logInfo.pass("I enter QEP command to place the PNR on Queue with remarks for the Queue number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*SEAM_ALL command to display the seam count")
    public void I_enter_Q_SEAM_ALL_command_to_display_the_seam_count() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*SEAM_ALL command to display the seam count");
            isharesPage3.enterQ_SEAM_ALL_ToDisplayTheSeamCount(logInfo);
            logInfo.pass("I enter Q*SEAM_ALL command to display the seam count");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*AOG command to display Aircraft on ground flight table")
    public void iEnterQ_AOG_commandToDisplayAircraftOnGroundFlightTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*AOG command to display Aircraft on ground flight table");
            isharesPage3.displayAircraftOnGroundFlightTable(logInfo);
            logInfo.pass("I enter Q*AOG command to display Aircraft on ground flight table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*AOG command to Add item in Aircraft on ground flight table")
    public void iEnterQ_AOG_commandToAddItemInAircraftOnGroundFlightTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*AOG command to Add item in Aircraft on ground flight table");
            isharesPage3.addItemInAircraftOnGroundFlightTable(logInfo);
            logInfo.pass("I enter Q*AOG command to Add item in Aircraft on ground flight table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Q*AOG command to delete an item from Aircraft on ground flight table {string}")
    public void iEnterQ_AOG_commandToDeleteAnItemFromAircraftOnGroundFlightTable(String item) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*AOG command to delete an item from Aircraft on ground flight table");
            isharesPage3.deleteAnItemFromAircraftOnGroundFlightTable(logInfo, item);
            logInfo.pass("I enter Q*AOG command to delete an item from Aircraft on ground flight table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter verify the ticketing perform history item display{string}")
    public void iEnterVerifyTheTicketingPerformHistoryItemDisplay(String entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter verify the ticketing perform history item display{string}");

            isharesPage3.verifyTheTicketingPerformHistoryItemDisplay(logInfo, entry);
            logInfo.pass("I enter verify the ticketing perform history item display{string}");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|CI command to verify the List Display with incorrect flight number")
    public void iEnterLD_CICommandToVerifyTheListDisplayWithIncorrectFlightNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|CI command to verify the List Display with incorrect flight number");

            isharesPage3.ToVerifyTheListDisplayWithIncorrectFlightNumber(logInfo);
            logInfo.pass("I enter 6:LD_|CI command to verify the List Display with incorrect flight number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I downgrade Lower cabin 6-GI for multiple surname with Segment Index {string}")
    public void I_downgrade_lower_cabin_6GI_multiple_surname_with_SegIndex(String SegIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I downgrade Lower cabin 6-GI for multiple surname Segment Index ");
            isharesPage3.downGradeLowerCabin6GIForMultipleSurnameWithSegIndex(logInfo, SegIndex);
            logInfo.pass("I downgrade Lower cabin 6-GI for multiple surname Segment Index ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I open the flight for segment {string}")
    public void iOpenTheFlightFordSegment(String SegmentIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open the flight for segment");
            isharesPage3.openFlightForSeg(logInfo, SegmentIndex);
            logInfo.pass("I open the flight for segment");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:SA command to Perform Special Handling Seating for the Armed passengers")
    public void iEnterSACommandToPerformSpecialHandlingSeatingForTheArmedPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:SA command to Perform Special Handling Seating for the Armed passengers");
            isharesPage3.enterSACommandToPerformSpecialHandlingSeatingForTheArmedPassengers(logInfo);
            logInfo.pass("I enter 6:SA command to Perform Special Handling Seating for the Armed passengers");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter down grade lower cabin with COS {string} to validate error response")
    public void iEnterDownGradeLowerCabinWithCOSToValidateErrorResponse(String COS1) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter down grade lower cabin with COS to validate error response");
            isharesPage3.enterDownGradeLowerCabinWithCOSToValidateErrorResponse(logInfo, COS1);
            logInfo.pass("I enter down grade lower cabin with COS to validate error response");

        } catch (AssertionError | Exception exception) {
            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6-GI command to downgrade to Lower cabin with {string} with ListType {string} for Multiple PNRs")
    public void I_downgrade_lower_cabin_6GI_multiple_PNRs_with(String SegmentIndex, String ListType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-GI command to downgrade to Lower cabin for Multiple PNRS");
            isharesPage3.downgrade_lower_cabin_6GI_multiple_surname_withList(logInfo, SegmentIndex, ListType);
            logInfo.pass("I enter 6-GI command to downgrade to Lower cabin for Multiple PNRS");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I downgrade Lower cabin 6-GV for multiple surname with {string} with ListType {string}")
    public void I_downgrade_lower_cabin_6GV_multiple_surname_with(String SegmentIndex, String ListType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I downgrade Lower cabin 6-GV for multiple surname");
            isharesPage3.downgrade_lower_cabin_6GV_multiple_surname_withList(logInfo, SegmentIndex, ListType);
            logInfo.pass("I downgrade Lower cabin 6-GI for multiple surname");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:XP_XS command to add OSI remarks {string}")
    public void iEnterXP_XSCommandToAddOSIRemarks(String RemarkType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:XP_XS command to add OSI remarks ");
            isharesPage3.enterXP_XSCommandToAddOSIRemarks(logInfo, RemarkType);
            logInfo.pass("I enter 6:XP_XS command to add OSI remarks ");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-_DESG_NAME to perform Change Alliance Record with Designator and Name for the PCH table {string}")
    public void iEnterKT_DESG_NAMEToPerformChangeAllianceRecordWithDesignatorAndNameForThePCHTable(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-_DESG_NAME to perform Change Alliance Record with Designator and Name for the PCH table");
            isharesPage3.enterKT_DESG_NAME(logInfo, Entry);
            logInfo.pass("I enter K-T-_DESG_NAME to perform Change Alliance Record with Designator and Name for the PCH table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-CM command {string}")
    public void iEnterKTCMCommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-CM command");
            isharesPage3.enterKTCMCommand(logInfo, Entry);
            logInfo.pass("I enter K-T-CM command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter K-T-COACA command {string}")
    public void iEnterKTCOACACommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter K-T-COACA command");
            isharesPage3.enterKTCOACACommand(logInfo, Entry);
            logInfo.pass("I enter K-T-COACA command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I downgrade Lower cabin 6-GI for multiple surname with NA {string} with ListType {string}")
    public void I_downgrade_lower_cabin_6GI_multiple_surname_with_NA(String SegmentIndex, String ListType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I downgrade Lower cabin 6-GI for multiple surname");
            isharesPage3.downgrade_lower_cabin_6GI_multiple_surname_withListWithNA(logInfo, SegmentIndex, ListType);
            logInfo.pass("I downgrade Lower cabin 6-GI for multiple surname");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PIPRM command and validated error response")
    public void iEnterPIPRMCommandAndValidatedErrorResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PIPRM command and validated error response");
            isharesPage3.enterPIPRMCommandAndValidatedErrorResponse(logInfo);
            logInfo.pass("I enter PIPRM command and validated error response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 8CHIAATL30 command")
    public void iEnterCHIAATLCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 8CHIAATL30 command");
            isharesPage3.enterCHIAATLCommand(logInfo);
            logInfo.pass("I enter 8CHIAATL30 command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter CVV2TRUNCATION command to validate error response")
    public void iEnterCVVTRUNCATIONCommandToValidateErrorResponse() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter CVV2TRUNCATION command to validate error response");
            isharesPage3.enterCVVTRUNCATIONCommandToValidateErrorResponse(logInfo);
            logInfo.pass("I enter CVV2TRUNCATION command to validate error response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTY message to generate pnr for system {string} and modify pnr {string}")
    public void iEnterTTYMessageToGeneratePnrAndModifyPnr(String SystemType, String ModifyType) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate pnr and modify pnr");
            isharesPage3.enterTTYMessageToGeneratePnrAndModifyPnr(logInfo, SystemType, ModifyType);
            logInfo.pass("I enter TTY message to generate pnr and modify pnr");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I rebook the segment {string} with the new class of service and date")
    public void iRebookTheSegmentWithTheNewClassOfServiceAndDate(String TotalSegments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I rebook the segment " + TotalSegments + " with the new class of service and date");
            isharesPage3.rebookTheSegmentWithTheNewClassOfServiceAndDate(logInfo, TotalSegments);
            logInfo.pass("I rebook the segment " + TotalSegments + " with the new class of service and date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TKN_SSR command")
    public void iEnterTKN_SSRCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TKN_SSR command");
            isharesPage3.enterTKN_SSRCommand(logInfo);
            logInfo.pass("I enter TKN_SSR command");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_ command to verify FSB statistics function {string}")
    public void iEnterT_CommandToVerifyFSBStatisticsFunction(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T_ command to verify FSB statistics function " + Entry);
            isharesPage3.enterT_CommandToVerifyFSBStatisticsFunction(logInfo, Entry);
            logInfo.pass("I enter T_ command to verify FSB statistics function " + Entry);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-ET* to perform ticket adjustment for segment {string}")
    public void iEnterTETToPerformTicketAdjustment(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-ET* to perform ticket adjustment");
            isharesPage3.performTicketAdjustment(logInfo, SegmentNumber);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter -_@ command to delete the passenger in the {string}")
    public void iEnter_CommandToDeleteThePassengerInThe(String SegmentNumber) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter -_@ command to delete the passenger in the ");
            isharesPage3.enter_CommandToDeleteThePassengerInThe(logInfo, SegmentNumber);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter OCMAUTH command {string}")
    public void iEnterOCMAUTHCommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter OCMAUTH command  " + Entry);
            isharesPage3.enterOCMAUTHCommand(logInfo, Entry);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MKDMAP command")
    public void iEnterMKDMAPCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MKDMAP command");
            isharesPage3.enterMKDMAPCommand(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:RG_ command to validate error response {string}")
    public void iEnterRG_CommandToValidateErrorResponse(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:RG_ command to validate error response " + Entry);
            isharesPage3.enterRG_CommandToValidateErrorResponse(logInfo, Entry);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I perform exchange Seat From Similar Name List using command 6:LX")
    public void iPerformExchangeSeatFromSimilarNameListUsingCommandLX() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I perform exchange Seat From Similar Name List using command 6:LX");
            isharesPage3.performExchangeSeatFromSimilarNameListUsingCommandLX(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6AA Command")
    public void iEnterAACommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6AA command");
            isharesPage3.enterAACommand(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-* command {string}")
    public void iEnterTCommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-* command " + Entry);
            isharesPage3.enterTCommand(logInfo,Entry);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BSI command to sign in as agent {string}")
    public void iEnterBSICommandToSignInAsAgent(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BSI command to sign in as agent " + Entry);
            isharesPage3.enterBSICommandToSignInAsAgent(logInfo,Entry);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter final command to create pnr {string}")
    public void iEnterFinalCommandToCreatePnr(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter final command to create pnr " + Entry);
            isharesPage3.enterFinalCommandToCreatePnr(logInfo,Entry);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T-RAX command")
    public void iEnterTRAXCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T-RAX command");
            isharesPage3.enterTRAXCommand(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter *T Command")
    public void iEnterTCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter *T command");
            isharesPage3.enterTCommand(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6- command to display passenger details")
    public void iEnterCommandToDisplayPassengerDetails() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6- command to display passenger details");
            isharesPage3.enterCommandToDisplayPassengerDetails(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTC and BTX to add and remove duty code")
    public void iEnterBTCAndBTXToAddAndRemoveDutyCode() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTC and BTX to add and remove duty code");
            isharesPage3.enterBTCAndBTXToAddAndRemoveDutyCode(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter BTR and BTA to remove and add sine")
    public void iEnterBTRAndBTAToRemoveAndAddSine() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter BTR and BTA to remove and add sine");
            isharesPage3.enterBTRAndBTAToRemoveAndAddSine(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-I*F Command")
    public void iEnterIFCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-I*F command");
            isharesPage3.enterIFCommand(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAOA command {string}")
    public void iEnterPAOACommand(String Entry) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAOA command " +Entry);
            isharesPage3.enterPAOACommand(logInfo,Entry);
            logInfo.addScreenCaptureFromBase64String(getBase64(isharesPage3.getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I set lname {string} for pax index {string}")
    public void iSetLnameForSegment(String Lname, String paxIndex) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I set lname " + Lname);

            isharesPage3.setlnameForSpecificPax(Lname,paxIndex);
            logInfo.pass("I set lname " + Lname);

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PAST command")
    public void iEnterPASTCommand() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PAST command" );

            isharesPage3.enterPASTCommand(logInfo);
            logInfo.pass("I enter PAST command" );

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:A command to run RDocument Numbers and Check Digit Verification")
    public void iEnterCACommandToRunRDocumentNumbersAndCheckDigitVerification() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A command to run RDocument Numbers and Check Digit Verification" );

            isharesPage3.enterCACommandToRunRDocumentNumbersAndCheckDigitVerification(logInfo);
            logInfo.pass("I enter C:A command to run RDocument Numbers and Check Digit Verification" );

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:ZQPDQ_START command to Perform Restart of Post Departure Queue")
    public void iEnterZQPDQ_STARTCommandToPerformRestartOfPostDepartureQueue() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:ZQPDQ_START command to Perform Restart of Post Departure Queue" );

            isharesPage3.enterZQPDQ_STARTCommandToPerformRestartOfPostDepartureQueue(logInfo);
            logInfo.pass("I enter 6:ZQPDQ_START command to Perform Restart of Post Departure Queue" );

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:LD Passenger List Display Error message")
    public void iEnterLDPassengerListDisplayErrorMessage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD Passenger List Display Error message");
            isharesPage3.enter6LDPassengerListDisplayErrormessage(logInfo);
            logInfo.pass("I enter 6:LD Passenger List Display Error message");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:D$ command to run Even Odd Exchange Transactions entries")
    public void enter_EvenExchangeTransactionsEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:D$ command to run Even Odd Exchange Transactions entries");
            isharesPage3.EvenExchangeTransactionsEntries(logInfo );
            logInfo.pass("I enter C:D$ command to run Even Odd Exchange Transactions entries");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I enter T_V* {string} command and verify {string} the response")
    public void iEnterTVCommandAndVerifyTheResponse(String cmd, String text) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T/V command verify the response");
            isharesPage3.enterTVCommand(logInfo,cmd,text);
            logInfo.pass("I enter T/V command verify the response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_VA {string} {string} {string} {string} {string} command to add item")
    public void iEnterT_VACommandToAddItem(String LNIATA, String Location, String City, String Country, String APT) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T/VA command and verify item added");
            isharesPage3.enterTVACommandToAddItem(logInfo,LNIATA,Location,City,Country,APT);
            logInfo.pass("I enter T/VA command and verify item added");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter T_VD {string} command to remove the item")
    public void iEnterT_VDCommandToRemoveTheItem(String LNIATA) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter T/VD command and verify item removed response");
            isharesPage3.enterTVDCommandToRemoveItem(logInfo,LNIATA);
            logInfo.pass("I enter T/VD command and verify item removed response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_|PD command to display the Protected Post Dep")
    public void iEnterLD_PDCommandToDisplayTheProtectedPostDep() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|PD command to display the Protected Post Dep");
            isharesPage3.displayPassengersProtectedPostDep(logInfo);
            logInfo.pass("I enter 6:LD_|PD command to display the Protected Post Dep");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6:LD_SB command to display standby list for passenger")
    public void iEnterLD_SBCommandToDisplayStandbyListForPassenger() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:LD_|SB command to display standby list for passenger");
            isharesPage3.displayStandByList_SB(logInfo);
            logInfo.pass("I enter 6:LD_|SB command to display standby list for passenger");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message to update the IN time {string}")
    public void enter_Create_a_FLIFO_message_In_ETA_Time(String time ) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message to update the IN/Out/ETA time "+time);
            isharesPage3.Create_a_FLIFO_message_IN_OutTime_ETA(logInfo,time);
            logInfo.pass("I enter Y command to create a FLIFO message to update the IN/Out/ETA time "+time);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message to update the OUT time {string}")
    public void enter_Create_a_FLIFO_message_out_ETA_Time(String time ) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message to update the IN/Out/ETA time "+time);
            isharesPage3.Create_a_FLIFO_message_IN_OutTime_ETA(logInfo,time);
            logInfo.pass("I enter Y command to create a FLIFO message to update the IN/Out/ETA time "+time);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter LD command to display ADJUSTED NAME USER")
    public void I_enter_LD_command_to_display_ADJUSTED_NAME_USER() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LD command to display ADJUSTED NAME USER");
            isharesPage3.displayAdjustedNameUser(logInfo);
            logInfo.pass("I enter LD command to display ADJUSTED NAME USER");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the 7TAE_ commands to obtain TKT BY MAIL INVOICE ADDRSSNG")
    public void I_run_the_7TAE_commands_to_obtain_TKT_BY_MAIL_INVOICE_ADDRSSNG() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the 7TAE_ commands to obtain TKT BY MAIL INVOICE ADDRSSNG");
            isharesPage3.obtainTicketByMailInvoiceAddressing(logInfo);
            logInfo.pass("I run the 7TAE_ commands to obtain TKT BY MAIL INVOICE ADDRSSNG");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the OCM_ command to obtain INCL CLASS MAPPING FROM MODEL IN CDSH FLT ITEM CAPTURE")
    public void I_run_the_OCM_commands_to_obtain_INCL_CLASS_MAPPING_FROM_MODEL_IN_CDSH_FLT_ITEM_CAPTURE() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the OCM_ command to obtain INCL CLASS MAPPING FROM MODEL IN CDSH FLT ITEM CAPTURE");
            isharesPage3.obtainInclClassMappingInCodeshareFlt(logInfo);
            logInfo.pass("I run the OCM_ command to obtain INCL CLASS MAPPING FROM MODEL IN CDSH FLT ITEM CAPTURE");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I manual quote the fare and Ticket for the Infant pax")
    public void I_manual_quote_the_fare_and_Ticket_for_the_Infant_pax(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I manual quote the fare and Ticket for the Infant pax");
            isharesPage3.manualQuoteForINF(logInfo);
            logInfo.pass("I manual quote the fare and Ticket for the Infant pax");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }

    @And("I enter 6:GV_ command to change grade for COS {string}")
    public void iEnterGV_CommandToChangeGradeForCOS(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:GV_ command to change grade for COS and verify response");
            isharesPage3.runChangeGrade(logInfo,COS);
            logInfo.pass("I enter 6:GV_ command to change grade for COS and verify response");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify {string} and {string} carrier schedule between {string} and {string}")
    public void verify_CarrierSchedule(String carrier1, String carrier2, String origin, String destination) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify carrier schedule");
            isharesPage3.verifyCarrierSchedule(logInfo, carrier1, carrier2, origin, destination);
            logInfo.pass("I verify carrier schedule");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I run the PNB entries for record checks {string}")
    public void i_run_PNB_entries_for_record_checks(String entry) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I run the PNB entries for record checks");
            isharesPage3.enterPNBCommands(logInfo, entry);
            logInfo.pass("I run the PNB entries for record checks");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", isharesPage2.getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command to verify error messages for PAY Post Departure Control Table entries")
    public void iEnterCommandToVerifyErrorMessagesForPAYPostDepartureControlTableEntries() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to verify error messages for PAY Post Departure Control Table entries");
            isharesPage3.toVerifyErrorMessagesForPAYPostDepartureControlTableEntries(logInfo);
            logInfo.pass("I enter command to verify error messages for PAY Post Departure Control Table entries");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter C:A_$EP_ command to display even PTA exchange Shares")
    public void iEnterCA_$EP_CommandToDisplayEvenPTAExchangeShares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter C:A_$EP_ command to display even PTA exchange Shares");
            isharesPage3.toDisplayEvenPTAExchangeShares(logInfo);
            logInfo.pass("I enter C:A_$EP_ command to display even PTA exchange Shares");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Run CM ACI Control Functions Open Flight SHARES")
    public void I_enter_Run_CM_ACI_Control_Functions_Open_Flight_SHARES(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Run CM ACI Control Functions Open Flight SHARES" );
            isharesPage3.enterRunCMACIControlFunctionsOpenFlightShares(logInfo);
            logInfo.pass("I enter Run CM ACI Control Functions Open Flight SHARES" );

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter command for Boarding Pass Reprint Delete for the passenger {string}")
    public void enter_BoardingPassReprintDelete_command(String PaxNo) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command for Boarding Pass Reprint Delete for the passenger");
            isharesPage3.enterBoardingPassReprintDelete(logInfo, PaxNo);
            logInfo.pass("I enter command for Boarding Pass Reprint Delete for the passenger");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter PBI_command to display agent request reports")
    public void iEnterPBI_commandToDisplayAgentRequestReports() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PBI_command to display agent request reports city and invalid Act code");
            isharesPage3.enterPBIcommandToDisplayAgentRequestReports(logInfo);
            logInfo.pass("I enter PBI_command to display agent request reports city and invalid Act code");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter KREJ command to display reject queue control table")
    public void iEnterKREJCommandToDisplayRejectQueueControlTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KREJ command to display reject queue control table");
            isharesPage3.enterKREJCommandToDisplayRejectQueueControlTable(logInfo);
            logInfo.pass("I enter KREJ command to display reject queue control table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6:DWR of Input Denied Boarding Flight Remarks")
    public void I_enter_6_DWR_of_Input_Denied_boarding_flight_remarks(){
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:DWR of Input Denied Boarding Flight Remarks" );
            isharesPage3.enter6DWROfInputDeniedBoardingFlightRemarks(logInfo);
            logInfo.pass("I enter 6:DWR of Input Denied Boarding Flight Remarks" );

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Q*HSX command to Display entries in Central Reservations Control")
    public void enter_QHSX_DisplayentriesinCentralReservationsControl() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Q*HSX command to Display entries in Central Reservations Control");
            isharesPage3.enterQHSX_DisplayentriesinCentralReservationsControl(logInfo);
            logInfo.pass("I enter Q*HSX command to Display entries in Central Reservations Control");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter KR command to Display table for all HA items")
    public void enter_KR_DisplaytableforHAitems() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KR command to Display table for all HA items");
            isharesPage3.enterKR_DisplaytableforHAitems(logInfo);
            logInfo.pass("I enter KR command to Display table for all HA items");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter command to Run Entry Format - Teletype Transfer for System Schedules Facts {string} from {string} to {string}")
    public void enter_command_EntryFormatTeletypeTransferSystemSchedulesFacts(String itemNum, String flight1, String flight2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter command to Run Entry Format - Teletype Transfer for System Schedules Facts");
            isharesPage3.entercommand_EntryFormatTeletypeTransferSystemSchedulesFacts(logInfo, itemNum, flight1, flight2);
            logInfo.pass("I enter command to Run Entry Format - Teletype Transfer for System Schedules Facts");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter KA command to Display specific schedule for OA or HA codeshare flight")
    public void enter_KA_EntryFormatTeletypeTransferSystemSchedulesFacts() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter KA command to Display specific schedule for OA or HA codeshare flight");
            isharesPage3.enterKA_DisplayspecificscheduleOAHAFlight(logInfo);
            logInfo.pass("I enter KA command to Display specific schedule for OA or HA codeshare flight");

        } catch (AssertionError | Exception e) {
            logInfo.fail("This step failed.. so stopping...");
            Assert.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-GV to do Voluntary Downgrade to Lower Cabin")
    public void I_enter_6GI_to_do_VoluntaryDowngrade() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-GV to do Voluntary Downgrade to Lower Cabin");
            isharesPage3.voluntaryDownGradeToLowerCabin(logInfo);
            logInfo.pass("I enter 6-GV to do Voluntary Downgrade to Lower Cabin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter 6-GI to do In-Voluntary Downgrade to Lower Cabin")
    public void I_enter_6GI_to_do_InVoluntaryDowngrade() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-GI to do In-Voluntary Downgrade to Lower Cabin");
            isharesPage3.involuntaryDownGradeToLowerCabin(logInfo);
            logInfo.pass("I enter 6-GI to do In-Voluntary Downgrade to Lower Cabin");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-*_ to display Seat Status Map by PNR segment number")
    public void iEnter_ToDisplaySeatStatusMapByPNRSegmentNumber() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-*_ to display Seat Status Map by PNR segment number");
            isharesPage3.toDisplaySeatStatusMapByPNRSegmentNumber(logInfo);
            logInfo.pass("I enter 6-*_ to display Seat Status Map by PNR segment number");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-CN* to display Standby Priority Table")
    public void iEnterCNToDisplayStandbyPriorityTable() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CN* to display Standby Priority Table");
            isharesPage3.toDisplayStandbyPriorityTable(logInfo);
            logInfo.pass("I enter 6-CN* to display Standby Priority Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter PADD* command to display SPD action code with flight and date")
    public void iEnterPADDCommandToDisplaySPDActionCodeWithFlightAndDate() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter PADD* command to display SPD action code with flight and date");
            isharesPage3.toDisplaySPDActionCodeWithFlightAndDate(logInfo);
            logInfo.pass("I enter PADD* command to display SPD action code with flight and date");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter 6-CNA command to add passcode{string} in Standby Priority Table")
    public void iEnterCNACommandToAddPasscodeInStandbyPriorityTable(String passCode) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6-CNA command to add passcode{string} in Standby Priority Table");
            isharesPage3.toAddPasscodeInStandbyPriorityTable(logInfo,passCode);
            logInfo.pass("I enter 6-CNA command to add passcode{string} in Standby Priority Table");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter LA$B-{string} command to do the fare quote for class")
    public void iEnterLA$BCommandToDoTheFareQuoteForClass(String COS) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter LA$B command to do the fare quote for class");
            isharesPage3.FareQuoteforClass(logInfo, COS);
            logInfo.pass("I enter LA$B command to do the fare quote for class");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I add Corporate name to the PNR in Native shares")
    public void i_add_Corporate_name_In_Native_shares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add Corporate name to the PNR in Native shares");
            isharesPage3.addCorporateNameInNativeShares(logInfo);
            logInfo.pass("I add Corporate name to the PNR in Native shares");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



    @And("I enter 6PER command in Native shares")
    public void I_enter_6PER_Command_in_Native_shares(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6PER command in Native shares");
            isharesPage3.enter6PERCommandInNativeShares(logInfo);
            logInfo.pass("I enter 6PER command in Native shares");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage1.getDriver(), logInfo, exception);
        }
    }


    @And("I enter TTY message to generate the pnr and cancel the segment in the pnr using WHCR SSR {string}")
    public void iEnterTTYMessageToGenerateThePnrAndCancelTheSegmentInThePnrUsingWHCRSSR(String segments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTY message to generate basic airline segment");
            isharesPage3.tTYMessageForWHCRSSR(logInfo,segments);
            logInfo.pass("I enter TTY message to generate basic airline segment");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I enter Y command to create a FLIFO message to update the IN time alone")
    public void iEnterYCommandToCreateAFLIFOMessageToUpdateTheINTimeAlone() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message to update the IN time");
            isharesPage3.updateTheInTime(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message to update the IN time");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter Y command to create a FLIFO message for PRE")
    public void iEnterYCommandToCreateAFLIFOMessageForPRE() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Y command to create a FLIFO message to update the PRE time");
            isharesPage3.updateThePRETime(logInfo);
            logInfo.pass("I enter Y command to create a FLIFO message to update the PRE time");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I try to rebook the segment with different flight {string}")
    public void iTryToRebookTheSegmentWithDifferentFlight(String segments) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to rebook the segment with different flight");
            isharesPage3.rebookTheSegmentUsingTTY(logInfo,segments);
            logInfo.pass("I try to rebook the segment with different flight");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I enter 6:CX_ command to reinstate misconnect passengers")
    public void iEnterCX_CommandToReinstateMisconnectPassengers() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter 6:CX_ command to reinstate misconnect passengers");
            isharesPage3.toReinstateMisconnectPassengers(logInfo);
            logInfo.pass("I enter 6:CX_ command to reinstate misconnect passengers");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }



}
