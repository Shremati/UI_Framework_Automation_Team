#Description
#Sign in JFKCTO CURRENCY USD
#create a reservation RT, JFKCTG, 2 ADULT , ANY DAYS, Economy Classic Flex
#Verify that the administrative fee is correctly with the POS
#Fill the passenger information and click on book and file fare.
#CHECK OUT PAY with UATP , complete the FOID detTails
#Book new segments POS JFKATO USD , any days, Business PROMO , Quote the Involuntary Reissue: save and quote to order
#  Expected:
#The system should process the change correctly, and the EMD should be emited.


@UAT
Feature: 624608 - Verify the system should process the change correctly by performing Involuntary Reissue

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624608 - Verify the system should process the change correctly by performing Involuntary Reissue

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
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency>"
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate2>" and Return Date "<StartDate3>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass1>" for Origin flight for the newly added segments via availability
    And I select class "<originClass1>" for Return flight for the newly added segments via availability
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Involuntary Reissue for specific segment "<Segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueReasonCode>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab
    And I navigate to Order tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report
    And I logout from COPA GUI application


    Examples:

      | salesOffice | salesOffice1 | currency | OriginCity | Destination | StartDate3 | StartDate2 | StartDate | StartDate1 | PaymentType | Adult | Child | INF | INS | originClass | PricingOption        | Segment | TicketStatus | ReasonCode    | ReissueReasonCode |  originClass1 | SegmentDelete |
      | JFK CTO     | JFK ATO      | USD      | PTY        | MIA         | 33 days    | 29 days    | 06 days   | 13 days    | UATP        | 2     | 0     | 0   | 0   | Economy     | Economy Classic Flex | 12       | EXCHD IRR    | WPEN IRROP-SC | Involuntary       | Business     | 1             |
