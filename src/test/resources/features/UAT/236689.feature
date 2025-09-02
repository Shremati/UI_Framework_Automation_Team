#Description:
#Open Gate module
#Display List- passenger by sequence number
#
#Expected:
#
#Actual:

@UAT
Feature: 236689 - Display List- Display List- passenger by sequence number

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236689 - Display List- Display List- passenger by sequence number

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
    And I select child passengers
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option as Economy full
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
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in

    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the services Tab to validate the seats

    And I navigate to home screen

    And I validate the Sequence number for the segment "<SegmentIndex>" in native shares
    And I logout from COPA GUI application

    Examples:
      |salesOffice|currency |OriginCity   |Destination |POS|StartDate |Adult|Child|INF|INS|Airline|COS|SegmentIndex|SegmentIndex|PaymentType|ticketStatus1|originClass|SSRType|
      |PTY ATO    |USD      |PTY          |LAX         |PTY|01 days   |1    |0    |0  |0  |CM     |Y  |0           |1           |Cash       |CHECKED-IN |Economy    |BULK   |
