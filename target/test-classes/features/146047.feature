#Description:
#The General Objective: Is create and issue a new order with combination of passenger's fare, and also validate GUI RES accept multiple forms of payment, and assign seat.
#
#1. Sale Agent CALL CENTER BRAZIL Sign in.
#2. Route: POA - BZE Round Trip.
#Departure 11 mar 18 Flight 290/324
#Returning 30 mar 18 Flight 292/207
#- Economic Cabin.
#3. Passengers: 1 Adult 1 Inf with out Seat.
#4. Quote: price as best buy both passenger.
#5. Passengers:
#- Fill all travelers Information (Secure Flight)
#6. Send passenger reservation confirmation.
#7. Issue PNR FOP: DINERS CLUB with 4 INSTALLMENTS
#8. Assign free Seat: Select all window seat.
#9. Send e-ticket receipt email
#10. Verify that transactions are shown in the sales report

@VIR
Feature: 146047 - Create a reservation in CALL CENTER BRAZIL and issue with the form of payment: DINERS CLUB (4 INSTALLMENTS)

  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: 146047 - Create a reservation in CALL CENTER BRAZIL and issue with the form of payment: DINERS CLUB (4 INSTALLMENTS)

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select specific class "<COS>" for Origin flight in Economy Class
    And I select pricing option as best buy
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the payment using Dinners Club with instalment option as "<count>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I click the services Tab
    And I assign seats to the passengers in Services tab
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats and store the seat numbers
    And I click the Tickets tab
    And I send email in tickets tab
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice           |currency |OriginCity   |Destination |COS  | StartDate |Adult|INF   | count | PaymentType           |
      |CALL CENTER BRAZIL    |BRL      |POA          |PTY         |Y    | 10 days   |1    |1     | 4     | MISC_BANK_TRANSFER    |


