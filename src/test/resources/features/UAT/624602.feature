#Description:
#1.POS: CDE – PTY CTO – USD
#2.Book an itinerary for roundtrip travel from PTY to MIA where the stay is Miami is for 1 week in Y class of service.
#3.Select the pricing options of Priced as Booked
#4.Add the Account Code of AIN2910 (Check valid code)
#5.Select the check box for private fares only.
#6.Verify the pricing response returns the expected account code fare
#7.Issue the ticket with Credit Card or Cash as FOP
#8.Involuntary Reissue automated and the account code is autopopulated
#
#  Expected:
#TRR must auto populate the account code during reissue quote

@UAT
Feature: 624602 - Verify Involuntary Reissue of Private Fares has happened correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624602 - Verify Involuntary Reissue of Private Fares has happened correctly

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
    And I enter Start Date "<StartDate>" and Return Date "<StartDate1>" for two way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option Price as Booked
    And I enter Account code as "<AccountCode>"
    And I select Private Fares Only checkbox
    And I select the Quote Options and click on Next
    And I validate the Price Quote and verify Account code "<AccountCode>" is displaying or not and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I click on Quotes subtab and verify Account code "<AccountCode>" is displaying or not
    And I navigate to Order tab
    And I change the date of travel for the second segment "<NewDate1>"
    And I perform Involuntary Reissue for specific segment "<Segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueReasonCode>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab
    And I navigate to Order tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:

      | salesOffice            | currency | OriginCity | Destination | StartDate | StartDate1 | PaymentType | Adult | Child | INF | INS | originClass | Segment | TicketStatus | ReasonCode        | ReissueReasonCode | AccountCode |  NewDate1 |
      | PTY CTO COSTA DEL ESTE | USD      | PTY        | MIA         | 04 days   | 11 days    | CASH        | 1     | 0     | 0   | 0   | Economy     | 2       | EXCHD IRR    | WPEN IRROP-STRIKE | Involuntary       | AIN2910     |  13 days  |