#Description:
#Create a brooking ORD-PTY RT. 2 ADT, 1 CHD, 1INF Economy Basic
#Days, it must be less than 7 days. Make sure it’s flight CM236
#Surcharge of USD (75.00) is applied.
#Issue the ETKT
#Change the itinerary for travel Any day. Same RBD
#Voluntary Reissue - Price as booked
#Validate the Surcharge of USD (100.00)



@Reissue
Feature: 624638 - Voluntary Reissue - Validation of Surcharges

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624638 - Voluntary Reissue - Validation of Surcharges


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
    And I enter Start Date "<StartDate>" and Return Date "<returnDate>" for two way booking
    And I select infant without seat passengers
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option as "<PricingOption>"
    And I add advanced option "<optionType>"
    And I select the Quote Options and click on Next
    And I add process and reason code in Quote Waiver page
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I navigate to home screen
    And I click the order tab
    And I change the date of travel for the first segment "<NewDate>"
    And I change the date of travel for the second segment "<NewDate1>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>" with an advanced option type  "<optionType1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
#    And I click on Ticket tab and check the "<ticketStatus>" status
#    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes
    And I logout from COPA GUI application

    Examples:
      | salesOffice            | currency | OriginCity | Destination | StartDate | returnDate | NewDate | NewDate1 | Adult | Adult | Child | INF | INS | PaymentType | originClass | PricingOption | PricingOption1  | optionType    | optionType1    | ticketStatus | ticketStatus1 |
      | PTY CTO COSTA DEL ESTE | USD      | ORD        | PTY         | 02 Days   | 04 Days    | 12 Days | 34 Days  | 2     | 1     | 1     | 1   | 0   | CASH        | Economy     | Economy Basic | Price as Booked | Surcharges_75 | Surcharges_100 | Open         | EXCHANGED     |
