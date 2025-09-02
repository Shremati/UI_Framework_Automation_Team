#Description
#Create a reservation
#Any class
#Fill the ADC/APIS
#Pay the reservation
#Go to check-ing module
#Add 1 carry-on 10KG
#Add 2 carry-on 10KG
#Add 3 carry-on 10KG
#
#Expected
#First bag Must be FREE
#Must appear: ITEM NOT AVAILABLE
#Must appear: ITEM NOT AVAILABLE

@UAT
Feature: 623008 - Validar que no se puede agregar mas de un carry-on (DXC engine)

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 623008 - Validar que no se puede agregar mas de un carry-on (DXC engine)

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
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I click on the accept button in checkin page to pay
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
    And I select ADC bypass and give the bypass reason "<reason>"
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click add Baggage icon
    And I add catalog baggage "<BaggageType>" and "<BaggageNo>" and "<BaggageWeight>"
    And I click add another baggage
    And I add catalog baggage "<BaggageType>" and "<BaggageNo1>" and "<BaggageWeight>"
    And I click add another baggage
    And I add catalog baggage "<BaggageType>" and "<BaggageNo2>" and "<BaggageWeight>"
    And I click on Submit and verify the Error message after adding Baggage
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | Adult | Child | INF | INS | BaggageNo | BaggageNo1 | BaggageNo2 | BaggageWeight | PaymentType | originClass | PricingOption   | printer  | printerStatus | BaggageType      | reason             |
      | PTY ATO     | USD      | PTY        | GRU         | 01 days   | 1     | 0     | 0   | 0   | 1         | 2          | 3          | 10            | CASH        | Economy     | Price as Booked | MAHAC-NB | PrintReady    | CARRY ON CHECKED | DOUBLE NATIONALITY |


