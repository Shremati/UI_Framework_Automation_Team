#Description:
#Open GUI and select POS PTY ATO currency USD.
#Create a new reservation 1ADT in an international flight (PTYBOG) OW in economy class (Y). Price as book.
#Retrieve quote and verify that the taxes are the correct based on the POS.
#Fill the passenger information and click on book and file fare.
#Click on check out and pay in "CASH".
#Check for availability and search for return flight with same route.
#Book segment and on the action menu select "Involuntary Reissue".
#Verify that the ticket are updated correctly
#
#  Executed:
#The system should process the change correctly

@UAT
Feature: 624604 - Verify Involuntary Reissue from a OW booking to a RT booking has happened correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624604 - Verify Involuntary Reissue from a OW booking to a RT booking has happened correctly

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
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate1>" and Return Date "<StartDate2>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for Origin flight for the newly added segments via availability
    And I select class "<originClass>" for Return flight for the newly added segments via availability
    And I select Book from Actions Dropdown
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

      | salesOffice | currency | OriginCity | Destination | StartDate | StartDate1 | StartDate2 | PaymentType | Adult | Child | INF | INS | originClass | PricingOption   | Segment | TicketStatus | ReasonCode     | ReissueReasonCode | SegmentDelete |
      | PTY ATO     | USD      | PTY        | BOG         | 04 days   | 07 days    | 10 days    | CASH        | 1     | 0     | 0   | 0   | Economy     | Price as Booked | 12      | EXCHD IRR    | WPEN INAD/DEPU | Involuntary       | 1             |