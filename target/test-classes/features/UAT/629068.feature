#Description:
#  Create a PNR with ADT
#  1 Connecting segment
# Then do the payment - any mode
#  Navigate to Gate Module, search with the departure date and origin city
#  Click on flight actions, choose mass transfer
#

@IcouponAssign
Feature: 629068 - Mass Transfer flight status canceled and Icoupon compensation
  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629068 - Mass Transfer flight status canceled and Icoupon compensation

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
    And I enter Start Date "<StartDate>" for one way booking
    And I select child passengers
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select pricing option as best buy
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I check the ticket in the Tickets tab
    And I check the EMDs in EMD tab


    And I navigate to home screen
    And I navigate to Check-In page
    And I search for the segment "<SegmentIndex>" in Check-In page
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    And I click on Return to Check-In
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight1>"
    And I click on Submit and Proceed to Pay
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen

    And I navigate to Check-In page
    And I search for the segment "<SegmentIndex>" in Check-In page
    And I select the passengers in checkin page using "<searchType>"

    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I check the EMDs in EMD tab

    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I select the flight actions as "<ActionType>"
    And I select the type for mass transfer as "<transferType>"
    And I select the flight for outbound mass transfer with outbound segment "<SegmentIndex1>"
    And I select the reason code as "<Reason>" and select the flight for mass transfer for the segment "<SegmentIndex1>"
    And I pick the passengers manually from the list from the pnr created
    And I click the button "<buttonName>" to accept or compensate
    And I navigate to home screen
    And I navigate to Order tab to check the OSI remarks to validate the reason "<Reason>"
    And I navigate to home screen
    And I check to the remarks from order tab and validate the remark type "<type>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the EMD subtab and view the baggage details in tickets tab
    And I click the services Tab to validate the seats
    And I navigate to home screen
    And I validate the reason "<Reason>" and capture the OSI remarks in shares after retrieving the PNR from GUI

    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I enter Order Id and select compensation reason for the passenger "<compensationReason>" and "<PassengerType>"
    And I select required passengers and click the issue compensation button
    And I select passengers click print button and click digital voucher button
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I check the EMDs in EMD tab

    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType1>"
    And I click the EMD Available for Print tab and click print button

    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the Tickets tab
    And I click the EMD subtab and view the baggage details in tickets tab
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice              |currency |OriginCity   |Destination |StartDate |Adult|Child|INF|INS|originClass |PaymentType|ActionType   |SegmentIndex|searchType|transferType|Reason     |buttonName|SegmentIndex1|BaggageNo1|BaggageWeight1|printer      |printerStatus|ticketStatus1|ticketStatus|type            |PassengerType     |compensationReason        |PassengerType1|
      |PTY ATO                  |USD      |SCL          |MDE         |01 days   |1    |0    |0  |0  |Economy     |Cash       |Mass Transfer|0           |PNR       |Outbound    |CANCELATION|accept    |1            |1         |30            |IN-PF2ST1T4  |PrintReady   |CHECKED-IN    |ADJUSTED    |baggageTransfer|All Passenger List|Delay between 4 to 7:59hrs|Print List    |
