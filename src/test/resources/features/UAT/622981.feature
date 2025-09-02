#Description:
#Open the reservations module from the POS point of sale BOG (ATO) currency COP
#
#Expected:
#
#Actual:

@UAT
Feature: 622981 - Open the reservations module from the POS point of sale BOG (ATO) currency COP

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622981 - Open the reservations module from the POS point of sale BOG (ATO) currency COP

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I add segment from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" for 2nd Segment
    And I select infant without seat passengers
    And I select infant with Seat passengers
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<ReturnClass>" for Return flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I want to pay using residual emd
    And I perform voluntary manual refund
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I check the EMDs in EMD tab

    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select infant without seat passengers
    And I select infant with Seat passengers
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass1>" for Origin flight
    And I select pricing option as best buy
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the FOID details of the passengers
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I add SSR "<SSR>" through Services tab in GUI
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I enter the FOID details of the passengers
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab
    And I logout from COPA GUI application

    Examples:
      | salesOffice1 | currency1 | salesOffice | currency | OriginCity | Destination | OriginCity1 | Destination1 | SSR       | StartDate | StartDate1 | PaymentType1 | Adult | Child | INF | INS | PaymentType | originClass | ReturnClass | originClass1 |
      | BOG ATO      | COP       | PTY ATO     | USD      | BOG        | PTY         | PTY         | BOG          | COPA CLUB | 03 Days   | 04 Days    | EMD          | 1     | 0     | 0   | 0   | Cash        | Business    | Business    | Economy      |
