#Description:
#Click Unreconcilied
#Click Initiate Boarding
#
#Expected:
#Expected Result: See All the Check in Passengers in the UNRECONCILIED List


@UAT
Feature: 236686 - Run Boarding Process

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236686 - Run Boarding Process

#GUI
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
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
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I select the passengers in checkin page using "<searchType1>"
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<segmentIndex>" in Gate section
    And I try to click Unreconciled button
    And I try to retrieve the ticket number by selecting "<searchType1>" option
    And I click status tab in gate page and check unreconciled pax status
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | Adult | Child | INF | INS | searchType1 | PaymentType | originClass | searchType | segmentIndex | PricingOption   | printer  | printerStatus |
      | PTY ATO     | USD      | PTY        | CUN         | 01 days   | 2     | 0     | 0   | 0   | PNR         | CASH        | Economy     | Name       | 0            | Economy Classic | MAHAC-NB | PrintReady    |


