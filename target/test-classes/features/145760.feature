#Description:
#Steps to Reproduce: Display Fliflo Search Options:
#
#1. Display Flifo Search Tab options
#Enter flight mandatory information
#Flight
#Departure From
#Departure Date
#
#2. Display UTC time
#Flifo Search Tab options
#Enter flight mandatory information
#Flight
#Departure From
#Departure Date
#Check UTC Time
#
#3. Display Fliflo Search Help menu
#Enter flight mandatory information
#Flight
#Departure From
#Departure Date


@VIR
Feature: 145760 - Display Flifo options and find a flight. Validate that GUI request all mandatory field completed
  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: 145760 - Display Flifo options and find a flight. Validate that GUI request all mandatory field completed


    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I navigate to Flifo Search Tab option
    And I enter the mandatory fields with "<flight number>" "<OriginCity>" and "<departureDate>" in Flifo Search Option
    And I click on search button in Flifo Search option
    And I check the UTC time checkbox in Flifo Search option
    And I click on search button in Flifo Search option
    And I navigate to home screen
    And I click on Tools Menu in GUI application
    And I click on FLIFO SEARCH under Tools menu
    And I enter the mandatory fields with "<flight number>" "<OriginCity>" and "<departureDate>" in Flifo Search Option
    And I click on search icon in flifo search option
    And I verify flight details and click on close button in Flifo Search option


    Examples:
      | salesOffice | currency |  Adult | OriginCity | flight number | departureDate |
      | PTY ATO     | USD      |  1     | LAX        | 306           | 01 days       |
