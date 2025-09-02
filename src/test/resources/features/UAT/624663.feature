#Description:
#POS: GRU-CTO / BRL
#ROUTE: GIG-MIA / MCO-GRU / 2 ADT + 1 CHD + 1 INF / Economy Classic / departure in 15 days
#Make a payment with CC Master Card
#REISSUE: Generate a change in depature day, to leave within 3 days later later in Economy Full
#Make payment of the changes in cash
#Assign seating for all passengers
#
#  Expected:
#Must be Display Manual Reissue


@UAT
Feature: 624663 - Verify Voluntary Reissue of a double open jaw ticket is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624663 - Verify Voluntary Reissue of a double open jaw ticket is happening correctly

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
    And I add segment from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" for 2nd Segment
    And I select infant without seat passengers
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<EMDStatus>"
    And I navigate to Order tab
    And I change the date of travel for the first connecting segment "<StartDate2>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I click the services Tab
    And I click on Seat Icon from Services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | OriginCity1 | Destination1 | StartDate | StartDate1 | StartDate2 | PricingOption   | PricingOption1 | PaymentType | PaymentType1 | Adult | Child | INF | INS | originClass | TicketStatus | EMDStatus | TicketStatus2 |
      | GRU CTO     | BRL      | GIG        | MIA         | MCO         | GRU          | 15 days   | 30 days    | 18 days    | Economy Classic | Economy Full   | MASTERCARD  | CASH         | 2     | 1     | 1   | 0   | Economy     | Open         | Flown     | EXCHANGED     |