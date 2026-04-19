#Description:
#Create a reservation 2 ADT, Route (DAV-PTY) IN DAV
#Select the classic class
#Fill the passengers information
#Pay with cash
#Go to chceck-in module , complete the APIS
#Add 2 carry on
#
#Expected:
#The system does not allow to add more than one carry on


@UAT
Feature: 629933 - Validate that the system does not allow to add more that one carry on in a domestic flight

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629933 - Validate that the system does not allow to add more that one carry on in a domestic flight

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
    And I add same surname to "<PaxCount>" passengers
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
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I click add Baggage icon
    And I add catalog baggage "<BaggageType>" and "<BaggageNo>" and "<BaggageWeight>"
    And I click add another baggage
    And I add catalog baggage "<BaggageType>" and "<BaggageNo1>" and "<BaggageWeight>"
    And I click on Submit and verify the Error message after adding Baggage
    And I click add Baggage icon for second passenger
    And I add catalog baggage "<BaggageType>" and "<BaggageNo>" and "<BaggageWeight>"
    And I click add another baggage
    And I add catalog baggage "<BaggageType>" and "<BaggageNo1>" and "<BaggageWeight>"
    And I click on Submit and verify the Error message after adding Baggage
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | PaxCount | Adult | Child | INF | INS | BaggageNo | BaggageNo1 | BaggageWeight | PaymentType | originClass | PricingOption   | printer  | printerStatus | BaggageType      |
      | DAV ATO     | USD      | DAV        | PTY         | 01 days   | 2        | 2     | 0     | 0   | 0   | 1         | 2          | 10            | CASH        | Economy     | Economy Classic | MAHAC-NB | PrintReady    | CARRY ON CHECKED |


