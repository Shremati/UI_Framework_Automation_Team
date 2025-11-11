#Description: Create a Reservation in Economy Bassic, departure in one month
#ROUTE: SJO-EZE MDZ-SJO / 1 ADT 2 CHD
#Make a reservation
#POS: SJO CTO TORRE MERCEDES / USD
#Make a payment with CC AMEX
#Generate a involuntary change in the dates, to leave within a month later
#process check out
#Assign seating for all passengers
#The system should process the change correctly
@Reissue
Feature: 624662 - Voluntary Reissue with open jaw ticket

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624662 - Voluntary Reissue with open jaw ticket

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
    And Select from and to City "<OriginCity>" and "<Destination1>"
    And I add segment from and to City "<OriginCity2>" and "<OriginCity>"
    And I enter Start Date "<StartDate>" for one way booking
    And I enter Start Date "<returnDate>" for 2nd Segment
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select pricing option as "<PricingOption1>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I navigate to Order tab
    And I change the date of travel for the first connecting segment "<NewDate1>"
    And I change the date of travel for the second connecting segment "<NewDate2>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
#    And I click on Ticket tab and check the "<TicketStatus>" status
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab
    And I navigate to Order tab
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes
    And I logout from COPA GUI application

    Examples:
      | salesOffice            | currency | OriginCity | Destination1 | OriginCity2 | StartDate | returnDate | Adult | Child | INF | INS | PaymentType | originClass | NewDate1 | NewDate2 | PaymentType1 | PricingOption   | TicketStatus |PricingOption1|
      | SJO CTO TORRE MERCEDES | USD      | SJO        | EZE          | MDZ         | 03 Days   | 10 Days    | 1     | 2     | 0   | 0   | AMEX        | Economy     | 20 Days  | 25 Days  | Cash         | Economy Classic | EXCHANGED    |Economy Basic |
