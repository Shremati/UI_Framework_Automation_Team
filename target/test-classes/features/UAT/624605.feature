#Description
#Create a RT booking 2ADT. POS GRU Call Center. GIG-CUN RT
#Issue the ETKTs
#From POS GRU Call Center, change the itinerary to a GIG-MEX OW
#Make a involuntary reissue
#
#Expected:
#The system should process the change correctly

@Reissue
Feature: 624605 - Verify Involuntary Reissue from a RT booking to a OW booking has happened correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624605 - Verify Involuntary Reissue from a RT booking to a OW booking has happened correctly

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
#    And I click the Tickets tab
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details

    And I navigate to home screen
    And I click the order tab
#    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate2>" for one way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for the first connecting segment flight
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Involuntary Reissue for specific segment "<Segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueReasonCode>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
#    And I validate if the payment is successful
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab
    And I navigate to Order tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
#    And I validate Ticket and EMD values in Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I logout from COPA GUI application


    Examples:

      | salesOffice        | currency | OriginCity | Destination | OriginCity1 | Destination1 | StartDate2 | StartDate | StartDate1 | PaymentType | Adult | Child | INF | INS | originClass | PricingOption   | Segment | TicketStatus | ReasonCode        | ReissueReasonCode | SegmentDelete |
      | CALL CENTER BRAZIL | BRL      | GIG        | CUN         | GIG         | MEX          | 12 days    | 02 days   | 07 days    | VISA        | 2     | 0     | 0   | 0   | Economy     | Price as Booked | 12      | EXCHD IRR    | WPEN IRROP-STRIKE | Involuntary       | 1             |