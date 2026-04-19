#Description:
#REGATO-Validate in Gate Module, Gate Return status for a Delayed flight.
#
#
#Expected:
#REGATO-Validate in Gate Module, Gate Return status for a Delayed flight.

@UAT
Feature: 622936 - Verify REGATO-Validate in Gate Module and Gate Return status for a Delayed flight

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622936 - Verify REGATO-Validate in Gate Module and Gate Return status for a Delayed flight

   #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on Tools Menu
    And I click on Native Shares
    And I set Class Of Service to "<COS>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex>"
    And I set startdate to "<StartDate>" for Segment "<SegmentIndex>"
    And I search for flight availability in Native shares from "<OriginCity>" to "<Destination>"
    And I click on Cancel button in native shares
    And I click on Tools Menu
    And I click on FLIFO SEARCH under Tools menu
    And I perform flifo search with required details
    And I verify the Status of the flight at the origin in FLIFO in GUI is "<Status>"
    And I try to close the FLIFO search
    And I click on Tools Menu
    And I click on Native Shares
    And I enter 2_ command to know the details of the flight in Native Shares
    And I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares
    And I click on Cancel button in native shares
    And I click on Tools Menu
    And I click on FLIFO SEARCH under Tools menu
    And I perform flifo search with required details
    And I verify the Status of the flight at the origin in FLIFO in GUI is "<FlightStatus>"
    And I try to close the FLIFO search
    And I navigate to Gate section
    #And I search for the flight in Gate section with Destination as "<Destination>"
    And I select the flight in Gate section with Destination as "<Destination>"
    And I verify the flight status is displayed as "<FlightStatus>"
    And I navigate to home screen
    And I click on Tools Menu
    And I click on Native Shares
    And I try to assign the gate number "<GateNo>" in Native Shares
    And I click on Cancel button in native shares
    And I navigate to Gate section
    #And I search for the flight in Gate section with Destination as "<Destination>"
    And I select the flight in Gate section with Destination as "<Destination>"
    And I verify the Gate number for a flight in Gate section
    And I navigate to home screen
    And I click on Tools Menu
    And I click on FLIFO SEARCH under Tools menu
    And I perform flifo search with required details
    And I verify the Gate number of the flight for OriginCity in FLIFO
    And I try to close the FLIFO search
    And I logout from COPA GUI application



    Examples:
      |salesOffice |currency|OriginCity  |Destination  |StartDate|Adult|Child|INF|INS|COS|Airline|SegmentIndex|FlightStatus|GateNo|Status|
      |PTY ATO     |USD     |PTY         |BOG          |00 Days  |1    |0    |0  |0  |Y  |CM     |0           |Delayed     |22A   |OnTime|


