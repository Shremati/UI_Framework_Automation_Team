#Description:
#1. Search the flight from Gate landing screen
#2. System will redirect to All passenger list screen
#3. click on eTKT Not Sync button

@VIR
Feature: CR 19SHR1464125_007 - Verify ETKT out of sync Pax list is displayed in Gate - All passenger list screen when agent clicks on - "eTKT Not Sync" tab

  Background:

    Given COPA GUI Application is launched in the browser
  Scenario Outline: CR 19SHR1464125_007 - Verify ETKT out of sync Pax list is displayed in Gate - All passenger list screen when agent clicks on - "eTKT Not Sync" tab

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I navigate to Gate section
    And I search flight by "<flight number>" "<OriginCity>" and "<departureDate>" in gate page
    And I click on eTKT Not Sync tab in Gate - All passenger list screen
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency |  Adult | OriginCity | flight number | departureDate |
      | PTY ATO     | USD      |  1     | LAX        | 306           | 01 days       |
