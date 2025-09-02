#Description:
#Log in to PTYATO point of sale
#Navigate to the gate module
#Select a flight that already has an assigned gate
#Go to tools menu and select NATIVE SHARES option
#Enter command: 6:FM3@flightGTDgate
#Enter command: 2flight
#
#Expected:
#Must display flight check details information
#The updated gate number is displayed in all relevant locations (internal system, new passenger boarding passes, airport screens.).

@UAT
Feature: 629079 - Validated a gate change is reflected during the boarding process

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629079 - Validated a gate change is reflected during the boarding process

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
    And I navigate to Gate section
    And I select a flight that already has assigned gate No "<OriginCity>" and "<departureDate>" and "<gateNo>" and "<time>"
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<index>" in Gate section
    And I verify the Gate number for a flight in Gate section
    And I navigate to home screen
    And I click on Tools Menu
    And I click on Native Shares
    And I try to assign the gate number "<gateNo1>" for Arrival or Departure flights "<time1>" in Native Share
    And I enter 2_ command to know the details of the flight in Native Shares
    And I click on Cancel button in native shares
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | index | time          | departureDate | gateNo | gateNo1 | time1         | Adult | Child | INS | INF |
      | PTY ATO     | USD      | PTY        | 0     | DepartureTime | 00 days       | 12     | 14      | DepartureTime | 1     | 0     | 0   | 0   |




