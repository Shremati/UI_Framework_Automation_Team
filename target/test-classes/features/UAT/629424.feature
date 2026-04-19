#Description:
#  Create a PNR with 2ADT,
#  Minumum 2 segments, any markets
# Then do the payment - any mode
#  Navigate to Gate Module, search with the departure date and origin city
#  Click on flight actions, choose mass transfer
#

@UAT
Feature: 629424 - Calculate Overweight and Oversize Baggage Fees for a Domestic Flight

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629424 - Calculate Overweight and Oversize Baggage Fees for a Domestic Flight

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
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select child passengers
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
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
    And I click the EMD subtab present in Tickets tab
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I click add Baggage icon
    And I add standard baggage with Overweight for first bag "<BaggageNo>" and  "<BaggageWeight>"
    And I click on submit button
    And I validate the error message on addition of baggage for domestic flights
    And I logout from COPA GUI application

    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | Adult | Child | INF | INS | originClass | PaymentType | BaggageNo | BaggageWeight |
      | DAV ATO     | USD      | DAV        | PTY         | 01 days   | 1     | 0     | 0   | 0   | Economy     | Cash        | 1         | 32            |
