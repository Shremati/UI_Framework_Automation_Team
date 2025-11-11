#Description:
#1. POSPTY ROUTE PTYMEX ANY FLIGHT, Remove status check in
#2. book new segments, same country, different route
#3. reprice involuntary
#4. verifed the EMD in the sales Report

#Expected:
#The system should process the change correctly
#Actual:
@Reissue
Feature: 624614 - Involuntary Reissue the same day

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624614 - Involuntary Reissue the same day

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
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight with departure time within "<hours>" from current time
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<EMDStatus>"
    And I navigate to home screen
    And I click the order tab

    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I navigate to home screen
    And I click the order tab

    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate>" for one way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for Origin flight with departure time within "<hours1>" from current time
    And I select Book from Actions Dropdown and give the segment numbers as "<SegmentNum>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Involuntary Reissue for specific segment "<segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueCode>"
    And I enter the details in the email recipients page
#    And I validate if the payment is successful
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I navigate to Order tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
#    And I validate Ticket and EMD values in Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I logout from COPA GUI application



    Examples:
      | salesOffice | currency | OriginCity | Destination | OriginCity1 | Destination1 | StartDate | PricingOption   | TicketStatus | EMDStatus | Adult | Child | INF | INS | PaymentType | originClass | SegmentNum | SegmentDelete | segment | ReasonCode     | ReissueCode | TicketStatus1 | hours | hours1 |
      | PTY ATO     | USD      | PTY        | MEX         | PTY         | MIA          | 00 Days   | Price as Booked | Open         | Flown     | 1     | 0     | 0   | 0   | Cash        | Economy     | 2          | 1             | 1       | WPEN INAD/DEPU | Involuntary | EXCHD IRR     | 10    | 12     |


