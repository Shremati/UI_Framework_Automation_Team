#Description:
#On the NATIVE SHARES option, enter the following command changing flight, date and time (1000P) to the corresponding values ​​2Pflight/15AUG OUT PTY 1000P
#
#
#Expected:
#Expected Result: This display provides the flight time estimate updates

@UAT
Feature: 236695 - Verify the changing of flight ,date and time are updated correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236695 - Verify the changing of flight ,date and time are updated correctly

   #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I add "<NRPS>" NRPS passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on Tools Menu
    And I click on Native Shares
    And I set Class Of Service to "<COS>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex>"
    And I set startdate to "<StartDate>" for Segment "<SegmentIndex>"
    And I set PNR Type to "<PNRType>"
    And I search for flight availability in Native shares of special pnr for first segment from "<OriginCity>" to "<Destination>" and "<StartDate>"
    And I click on Cancel button in native shares
    And I click on Tools Menu
    And I click on FLIFO SEARCH under Tools menu
    And I perform flifo search with required details
    And I verify the Status of the flight at the origin in FLIFO in GUI is "<Status>"
    And I try to close the FLIFO search
    And I click on Tools Menu
    And I click on Native Shares
    And I enter 2_ command to know the details of the flight in Native Shares
    And I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares using OUT command
    And I click on Cancel button in native shares
    And I click on Tools Menu
    And I click on FLIFO SEARCH under Tools menu
    And I perform flifo search with required details
    And I verify the Status of the flight at the origin in FLIFO in GUI is "<FlightStatus>"
    And I try to close the FLIFO search
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I verify the flight status is displayed as "<FlightStatus>"
    And I logout from COPA GUI application



    Examples:
      |salesOffice |currency|OriginCity  |Destination  |StartDate|Adult|Child|INF|INS|COS|Airline|SegmentIndex|NRPS|PNRType|FlightStatus|Status|
      |PTY ATO     |USD     |PTY         |MDE          |00 Days  |0    |0    |0  |0  |Y  |CM     |0           |1   |NRPS   |Delayed     |OnTime|


