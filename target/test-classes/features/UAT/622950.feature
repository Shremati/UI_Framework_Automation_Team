#Description:
#  Create a PNR with ADT+CHD+INF,
#  Minumum 2 segments, any markets
# Then do the payment - any mode
#  Navigate to Gate Module, search with the departure date and origin city
#  Click on flight actions, choose mass transfer
#

@UAT
Feature: 622950 - Mass Transfer for ADT

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622950 - Mass Transfer for 1ADT

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
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I open flight for the segment "<SegmentIndex>" in native shares
    And I open flight for the segment "<SegmentIndex1>" in native shares

    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I set total baggage count "<bagCount>"
    And I set baggage weight "<BaggageWeight>"
    And I click on bag icon in checkin page for all passengers and select the type of baggage as standard and add bags and do payment
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I navigate to Gate section

    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I select the flight actions as "<ActionType>"
    And I select the type for mass transfer as "<transferType1>"
    And I select the reason code as "<Reason>" and select the flight for mass transfer for the segment "<SegmentIndex>"
    And I pick the passengers manually from the list from the pnr created
    And I click the button "<buttonName>" to accept or compensate
    And I navigate to home screen
    And I click the order tab
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the services Tab

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
    And I click the order tab
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the services Tab
    And I logout from COPA GUI application

    Examples:
      |salesOffice              |currency |OriginCity   |Destination |StartDate |Adult|Child|INF|INS|originClass |PaymentType|ActionType   |SegmentIndex|transferType|Reason    |buttonName|SegmentIndex1|transferType1|ticketStatus|BaggageWeight|bagCount|printer    |printerStatus|
      |PTY ATO                  |USD      |GYE          |SCL         |01 days   |1    |0    |0  |0  |Economy     |Cash       |Mass Transfer|0           |Outbound   |DELAY      |accept    |1            |Current      |ADJUSTED    |23           |2       |IN-PF2ST1T4|PrintReady   |
