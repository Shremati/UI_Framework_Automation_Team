#Description
#Point of sale PTY-ATO
#In the check-in screen, insert Order ID and press 'Proceed to Check In'
#Complete the ADC/APIS, press 'Submit' and 'Done'
#Press the plus (+) icon twice
#Add 2 bags of 23kg and press 'Check In
#Change the point of sale to SJO-ATO
#In the check-in screen, insert Order ID and press 'Proceed to Check In'
#Press the luggage icon
#Select the second 23kg bag, press the trash icon, and press 'Submit'


@UAT
Feature: 622984 - Validate the addition of baggage in the ADJUSTED reservation (sync)

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622984 - Validate the addition of baggage in the ADJUSTED reservation (sync)

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
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
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
    And I navigate to home screen
    And I navigate to Check-In page
    And I search for the segment "<segmentIndex>" in Check-In page
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    And I click on Return to Check-In
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight>"
    And I click on Submit and Proceed to Pay
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I navigate to home screen
    And I click the order tab
    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency>"
    And I click the order tab
    And I change the class of seat "<COS>" for the required segment "<SegNo>"
    And I click the Tickets tab
    And I click on Action drop down to Sync the ticket based on Service "<Service>" for specific segment "<SegmentNo>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I navigate to home screen
    And I navigate to Check-In page
    And I search for the segment "<segmentIndex1>" in Check-In page
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I click on check-in for the passenger
    And I click on Return to Check-In
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight>"
    And I click on Submit and Proceed to Pay
    And I click on check-in for the passenger
    And I click on Return to Check-In
    And I click add Baggage icon
    And I delete the standard baggage "<BaggageNo1>"
    And I click on Submit and Continue
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I logout from COPA GUI application


    Examples:

      | salesOffice | salesOffice1 | currency | OriginCity | Destination | StartDate | ReturnDate| PricingOption   | PaymentType | Adult | Child | INF | INS | originClass | TicketStatus | printer          | printerStatus | EMDStatus | COS | SegNo             | TicketStatus1 | TicketStatus2           | BaggageNo | BaggageWeight | BaggageNo1 | Service          |segmentIndex|segmentIndex1|searchType|SegmentNo|
      | PTY ATO     | SJO ATO      | USD      | PTY        | SJO         | 01 days   | 02 days   | Economy Full    | CASH        | 1     | 0     | 0   | 0   | Economy     | Open         | IN-5CD4316MPJ    | PrintReady    | Flown     | Y   | 2                 | CHECKED-IN    | ADJUSTED                | 1         | 23            | 2          | Class of Service |0           |1            |PNR       |2        |


