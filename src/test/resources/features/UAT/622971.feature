


@UAT
Feature: 622971 - Validate that in the case of  affectation due to change of aircraft, an iCoupon must be created

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622971 - Validate that in the case of  affectation due to change of aircraft, an iCoupon must be created

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
    And I add same surname to "<PaxCount>" passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
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
    And I check the ticket in the Tickets tab
    And I check the EMDs in EMD tab


    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
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
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I enter Order Id and select compensation reason for the passenger "<compensationReason>" and "<PassengerType>"
    And I select required passengers and click the issue compensation button
    And I select passengers click print button and click digital voucher button
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I check the EMDs in EMD tab

    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType1>"
    And I click the EMD Available for Print tab and click print button
    And I validate the names in the Icoupon
    And I validate the amounts in the Icoupon with "<currency>"

    And I navigate to home screen
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate |compensationReason        |Adult|Child|INS|INF|PassengerType     |printer    |printerStatus|flightIndex|originClass|PaymentType|PaxCount|PassengerType1|Amount|SegmentIndex|searchType|ticketStatus1|
      |PTY ATO    |USD     |PTY          |MDZ         |01 days   |Delay between 4 to 7:59hrs|2    |0    |0  |0  |All Passenger List|IN-PF2ST1T4|PrintReady   |0          |Economy    |Cash       |2       |Print List    |15    |0           |PNR       |CHECKED-IN   |
