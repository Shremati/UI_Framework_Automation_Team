@VIR
Feature: CR 19SHR1464125_009 - Verify ETKT out of sync Pax list is displayed in Gate - All passenger list screen when agent clicks on - "eTKT Not Sync" tab

  Background:

    Given COPA GUI Application is launched in the browser
Scenario Outline: CR 19SHR1464125_009 - Verify ETKT out of sync Pax list is displayed in Gate - All passenger list screen when agent clicks on - "eTKT Not Sync" tab

Then I enter valid credentials to log into COPA GUI application
Then I validate successful login
And I create the passengers data
And I add "<Adult>" adult passengers
And I want to display all the passengers
And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
  And I click on the Reservation section
  And I click on New Order for creating new PNR in GUI
  And Select from and to City "<OriginCity>" and "<Destination>"
  And I enter Start Date "<StartDate>" for one way booking
  And I select Adult passengers and search for flights
  And I select class "<originClass>" for Origin flight
  And I select pricing option as "<PricingOption>"
  And I select the Quote Options and click on Next
  And I validate the Price Quote and click on Next
  Then I enter required passenger details for COPA GUI
  And I click on Book and FileFare button or File Fare button
  And I open flight in native shares using the updated date


  Examples:
    | salesOffice | currency |  Adult | OriginCity | Destination | StartDate     | originClass   | PricingOption   |
    | PTY ATO     | USD      |  1     | PTY        | MDE         | 01 days       | Economy       | Price as Booked |