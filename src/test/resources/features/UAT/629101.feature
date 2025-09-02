#Description:
#  Log into any point of sale
#  Navigate to Gate module
#  Select a flight that does not yet have an assigned gate
#  Got to tools menu and select native shares option
#  enter command 6:FM3@flightGTDgate
#  enter command 2flight
#
# Expected:
#  Must display flight check details information and added gate number
#  The gate assignment is reflected correctly in all relevant locations

@UAT
Feature: 629101 - Verify the assigned gate number is displayed correctly in all relevant locations

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629101 - Verify the assigned gate number is displayed correctly in all relevant locations

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
    And I click on Native Shares
    And I try to assign the gate number "<GateNo>" in Native Shares
    And I enter 2_ command to know the gate number for an flight in Native Shares
    And I click on Cancel button in native shares
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I verify the Gate number for a flight in Gate section
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | Adult | Child | INF | INS | COS | Airline | SegmentIndex |   GateNo |
      | PTY ATO     | USD      | PTY        | BOG         | 00 Days   | 1     | 0     | 0   | 0   | Y   | CM      | 0            |   001    |
