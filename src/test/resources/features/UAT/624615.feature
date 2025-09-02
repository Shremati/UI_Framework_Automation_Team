#Description:
#Create a booking in POS GIG-CTO, 1ADULT + 1INFANTE WITH SEAT
#Route: GIG-PTY RT / Economy Basic / BRL
#Make a Payment in any FOP
#Take a new segment to leave in 7 days
#Apply an involuntary reissue, and save Quote ID
#Erase old segments
#Active the Quote ID from the remarks
#Process check out
#
#Expected:
#All old tickets should appear "Exchanged" and the new ones "Open", in Ticket window.
#Actual:
@UAT
Feature: 624615 - Involuntary reissue adult with infant with seat

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624615 - Involuntary reissue adult with infant with seat

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
    And I enter Start Date "<StartDate>" and Return Date "<StartDate2>" for two way booking
    And I select infant with Seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the FOID details of the passengers
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<EMDStatus>"
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<Destination1>" and "<OriginCity1>"
    And I enter Start Date "<StartDate1>" for one way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for Origin flight
    And I select Book from Actions Dropdown and give the segment numbers as "<SegmentNum>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Involuntary Reissue for specific segment "<segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueCode>"
    And I enter the FOID details of the passengers
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application



    Examples:
      | salesOffice | currency | OriginCity | Destination | OriginCity1 | Destination1 | StartDate | StartDate1 | StartDate2 | SegmentNum | Adult | Child | INF | INS | PaymentType | originClass | SegmentDelete | segment | ReasonCode    | ReissueCode | TicketStatus1 | PricingOption | TicketStatus | EMDStatus |
      | GIG CTO     | BRL      | GIG        | PTY         | GIG         | PTY          | 05 Days   | 12 Days    | 20 Days    | 2          | 1     | 0     | 0   | 1   | Cash        | Economy     | 3             | 12      | WPEN IRROP-SC | Involuntary | EXCHD IRR     | Economy Basic | Open         | Flown     |



