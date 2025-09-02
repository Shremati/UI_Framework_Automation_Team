#Description:
#POS: SJO CTO
#PNR: 1 ADT / Any route from SJO / RT / Bussiness full / Leaving next Monday
#Price as book
#Enter pax details
#Reissue reservartion from BC to Economy classic
#Share the results

@UAT
Feature: 624666 - Verify Voluntary Reissue from a Business Full a Economy Classic is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624666 - Verify Voluntary Reissue from a Business Full a Economy Classic is happening correctly

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
    And I enter Start Date "<StartDate>" to select flight on Monday and select the Return Date "<StartDate1>" for two way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<EMDStatus>"
    And I click the EMD subtab and view the EMD details
    And I navigate to Order tab
    And I change the class of seat "<COS>" for the required segment "<Segment>"
    And I change the class of seat "<COS>" for the required segment "<Segment1>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I navigate to Order tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | PricingOption | PricingOption1  | StartDate | StartDate1 | TicketStatus1 | PaymentType | Adult | Child | INF | INS | originClass | COS | Segment | Segment1 | TicketStatus | EMDStatus |
      | SJO-CTO     | USD      | SJO        | PTY         | Business Full | Economy Classic | 00 days   | 02 days    | EXCHANGED     | CASH        | 1     | 0     | 0   | 0   | Business    | B   | 1       | 2        | Open         | Flown     |



