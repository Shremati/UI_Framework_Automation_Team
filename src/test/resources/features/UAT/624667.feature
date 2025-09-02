#Description:
#POS: MIA-ATO / USD
#PNR: 2 ADT + 2 CHD / MIA-PTY / 2 day later PTY-SJO / 7 day later SJO-MIA / Economy Full
#Pay the reservation With CC AMEX
#Select new segments to leave 3 month later (with 2 days stop over)
#Quote the change as voluntary reissue and Save Quote ID
#Delete old segments and active the Quote ID from remarks
#Process check out with the same CC Amex
#
#  Expected:
#The system should process the change correctly

@UAT
Feature: 624667 - Verify Voluntary Reissue of an ETKT with stopovers is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624667 - Verify Voluntary Reissue of an ETKT with stopovers is happening correctly

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
    And I add segment from and to City "<Destination>" and "<Destination1>"
    And I enter Start Date "<ReturnDate>" for 2nd Segment
    And I add third segment from and to City "<Destination1>" and "<Destination2>"
    And I enter Start Date "<ReturnDate1>" for 3rd Segment
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for second segment
    And I select class "<originClass>" for third segment with connecting flights
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
    And I enter Start Date "<StartDate3>" for one way booking
    And I add segment from and to City "<Destination>" and "<Destination1>"
    And I enter Start Date "<ReturnDate3>" for 2nd Segment
    And I add third segment from and to City "<Destination1>" and "<Destination2>"
    And I enter Start Date "<ReturnDate4>" for 3rd Segment
    And I click search button in flight search availability
    And I select class "<originClass>" for Origin flight for the newly added segments via availability after the Connecting segments
    And I select class "<originClass>" for second segment for the newly added segments via availability after the Connecting segments
    And I select class "<originClass>" for third segment with connecting flights
    And I select Book from Actions Dropdown and give the segment numbers as "<Segments1>"
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab
    And I logout from COPA GUI application



    Examples:

      | salesOffice | currency | OriginCity | Destination | Destination1 | Destination2 | StartDate | ReturnDate | ReturnDate1 | PricingOption | PricingOption1  | PaymentType | Segments1 | Adult | Child | INF | INS | originClass | TicketStatus | SegmentDelete | StartDate3 | ReturnDate3 | ReturnDate4 |
      | MIA ATO     | USD      | MIA        | PTY         | SJO          | MIA          | 10 days   | 13 days    | 20 days     | Economy Full  | Price as Booked | AMEX        | 5678      | 2     | 2     | 0   | 0   | Economy     | EXCHANGED    | 1             | 90         | 92 days     | 99 days     |

