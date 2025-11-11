#Description:
#Title :CR-166 COLOMBIA Voluntary Change Currency (USD)-YS 19% TAX-One Way Reservation
#
#Description : 1. Sign in with sales agent CTO COLOMBIA and create new Booking:
#- Select currency USD
#- Route: (One WAY).
#- Departure: Next week.
#- Passangers: 3 ADT.
#- Economic Class.
#- Quote: Price as best buy.
#- Add traveler details. Enroll all passenger.
#- Add wheel chair.
#3. Issue PNR FOP:
#- MASTER CARD + CASH
#- Send passenger reservation confirmation.
#4. Make a Voluntary Change.
#- Send Eticket Receipt to all emails
#- Print all Eticket with EMD's
#

@Reissue
Feature: 624570 - CR-166 COLOMBIA Voluntary Change Currency (USD)One Way Reservation

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624570 - CR-166 COLOMBIA Voluntary Change Currency (USD)One Way Reservation

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option as best buy
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I enroll connect mile to all the passengers
    And I add a service "<ServiceType>" in cabin
    And I Click on CheckOut button for payment
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType2>"
    And I enter the FOID details of the passengers
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I click the Tickets tab
    And I navigate to Order tab
    And I change first segment date "<StartDate1>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType2>"
    And I enter the FOID details of the passengers
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click on View button and check the Ticket details
    And I select Sales Report and Agent Sales Report
    And I validate the EMD values in Agent Sales Report after changes
    And I logout from COPA GUI application


    Examples:
      |salesOffice                  |currency |OriginCity |Destination |StartDate |StartDate1 |Adult |Child |INF |INS |originClass |ServiceType |PaymentType |PaymentType2 |PricingOption|
      |BOG CTO                      |COP      |BOG        |PTY         |05 days   |22 days   |3     |0     |0   |0   |Economy     |WCHR         |MASTERCARD  |Cash         |Price as Booked |
