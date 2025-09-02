#Description:
#On the NATIVE SHARES option, enter the following command, changing flight and gate to the corresponding values: 6-FM3@flightGTDgate
#
#
#Expected:
#Expected Result: This display provides door updates

@UAT
Feature: 236694 - Verify by entering the following command, changing flight and gate to the corresponding values are updated correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236694 - Verify by entering the following command, changing flight and gate to the corresponding values are updated correctly

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
    And I verify the flight is not assigned with any gate number for Origin or Destination "<city1>"
    And I verify the flight is not assigned with any gate number for Origin or Destination "<city2>"
    And I try to close the FLIFO search
    And I click on Tools Menu
    And I click on Native Shares
    And I try to assign the gate number "<GateNo>" for Arrival or Departure flights "<DepartureTime>" in Native Share
    And I click on Cancel button in native shares
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency>"
    And I click on Tools Menu
    And I click on Native Shares
    And I try to assign the gate number "<GateNo1>" for Arrival or Departure flights "<ArrivalTime>" in Native Share
    And I click on Cancel button in native shares
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on Tools Menu
    And I click on FLIFO SEARCH under Tools menu
    And I perform flifo search with required details



    And I verify the Gate number of the flight for OriginCity in FLIFO
    And I verify the Gate number of the flight for DestinationCity in FLIFO
    And I try to close the FLIFO search
    And I click on Tools Menu
    And I click on Native Shares
    And I try to assign the gate number "<GateNo2>" for Arrival or Departure flights "<DepartureTime>" in Native Share
    And I click on Cancel button in native shares
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency>"
    And I click on Tools Menu
    And I click on Native Shares
    And I try to assign the gate number "<GateNo3>" for Arrival or Departure flights "<ArrivalTime>" in Native Share
    And I click on Cancel button in native shares
    And I click on Tools Menu
    And I click on FLIFO SEARCH under Tools menu
    And I perform flifo search with required details
    And I verify the Gate number of the flight for OriginCity in FLIFO
    And I verify the Gate number of the flight for DestinationCity in FLIFO
    And I try to close the FLIFO search
    And I logout from COPA GUI application


    Examples:
      | salesOffice1 | salesOffice | currency | OriginCity | Destination | StartDate | Adult | Child | INF | INS | COS | Airline | SegmentIndex | DepartureTime | GateNo | ArrivalTime | GateNo1 | GateNo2 | GateNo3 | city1  | city2       |
      | PTY ATO      | LAX ATO     | USD      | LAX        | PTY         | 00 days   | 1     | 0     | 0   | 0   | Y   | CM      | 0            | DepartureTime | 005    | ArrivalTime | 006     | 007     | 008     | origin | destination |