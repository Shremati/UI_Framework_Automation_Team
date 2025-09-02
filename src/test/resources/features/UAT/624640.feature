#Description:
#Create an ETKT in any dates, and fare family. 2ADT, 1CHD
#Change the dates and make an Involuntary Reissue
#Change the dates and make a Voluntary Reissue in Economy Classic
#
#  Expected:
#The system must correctly process the new change

@UAT
Feature: 624640 - Verify Voluntary Reissue in Economy Classic is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624640 - Verify Voluntary Reissue in Economy Classic is happening correctly

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
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
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
    And I change the date of travel for the first segment "<NewDate1>"
    And I perform Involuntary Reissue for specific segment "<Segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueReasonCode>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I change the date of travel for the first segment "<NewDate2>"
    And I perform Voluntary Reissue with Pricing Option as "<PricinOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I logout from COPA GUI application



    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate |  NewDate1 | NewDate2 | PaymentType | Adult | Child | INF | INS | TicketStatus2 | TicketStatus1 |  PricingOption   | PricinOption1   | originClass | Segment | ReasonCode                 | ReissueReasonCode |
      | PTY ATO     | USD      | MTY        | PTY         | 10 days   |  15 days  | 20 days  | CASH        | 2     | 1     | 0   | 0   | EXCHANGED     | EXCHD IRR     |  Price as Booked | Economy Classic | Economy     | 1       | WPEN IRROP-HURRICANE/STORM | Involuntary       |
