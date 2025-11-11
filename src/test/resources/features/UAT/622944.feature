#Description:
#  Create a PNR with 2ADT,
#  Minumum 2 segments, any markets
# Then do the payment - any mode
#  Navigate to Gate Module, search with the departure date and origin city
#  Click on flight actions, choose mass transfer
#

@UAT
Feature: 622944 - Perform Mass Transfer to Heald Seats of Flights with CANCELLED Status in the OUTBOUND option (any connection)

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622944 - Perform Mass Transfer to Heald Seats of Flights with CANCELLED Status in the OUTBOUND option (any connection)

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
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option as Economy Classic
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I click the services Tab
    And I navigate to home screen
    And I open flight for the segment "<SegmentIndex>" in native shares

    And I navigate to home screen
    And I navigate to Check-In page
    And I search for the segment "<SegmentIndex>" in Check-In page
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on Seat Icon from Checkin page
    And I select the seats from checkin page for passengers for the given segment "<SegmentIndex>"

    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the services Tab to validate the seats
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I select held seats to display the passenger list in Gate section
    And I select "<passengerListType>" from the passenger list options
    And I try to retrieve the ticket number by selecting "<PNRText>" option

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
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the services Tab
    And I navigate to home screen
    And I validate the reason "<Reason>" and capture the OSI remarks in shares after retrieving the PNR from GUI
    And I logout from COPA GUI application

    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | ReturnDate | Adult | Child | INF | INS | originClass | PaymentType | ActionType    | SegmentIndex | PNRText | transferType | Reason      | buttonName | SegmentIndex1 | searchType | ticketStatus | passengerListType | ticketStatus1 |
      | PTY ATO     | USD      | PTY        | SFO         | 01 days   | 02 Days    | 5     | 0     | 0   | 0   | Economy     | Cash        | Mass Transfer | 0            | PNR     | Outbound     | CANCELATION | accept     | 1             | PNR        | ADJUSTED     | Held Seat Pax     | Open          |
