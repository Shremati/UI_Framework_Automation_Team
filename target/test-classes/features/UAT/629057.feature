#Description:
#Generate a new booking from another STATION flight with destination PTY
#Make sure the passanger is checked-in
#Compensate and apply the iCoupon by searching the flight from compensation module home page
#Display the Results.
#
#Expected:
#The Remaks will display the iCoupon generated

@IcouponAssign
Feature: 629057 - Generate a new booking from another STATION flight with destination PTY

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629057 - Generate a new booking from another STATION flight with destination PTY

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

    And I navigate to the User provisioning Tool page
    And I enter User Id and click on search in user provisioning page
    And I select POS and set status of the iCoupon in User Provisioning tool page "<iCouponStatus>"
    And I navigate to home screen

    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
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
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab present in Tickets tab
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select passenger and click proceed to Checkin button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I set total baggage count "<BagCount>"
    And I set baggage weight "<BaggageWeight>"
    And I click on bag icon in checkin page for all passengers and select the type of baggage as standard and add bags and do payment
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I enter Order Id and select compensation reason for the passenger "<compensationReason>" and "<PassengerType>"
    And I select required passengers and click the issue compensation button
    And I select passengers generate digital voucher and view compensation details
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType1>"
    And I click the EMD Available for Print tab and click print button
    And I navigate to home screen
    And I click the tickets tab and click ticket EMD tab verify the segment name status "<NameStatus>"
    And I select Sales Report and Agent Sales Report
    And I validate EMD ticket number in Agent sales report
    And I navigate to home screen
    And I click on Tools Menu
    And I click on Native Shares
    And I retrieve the pnr in Native shares
    And I click on Cancel button in native shares
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate |compensationReason        |Adult|Child|INS|INF|PassengerType     |printer    |printerStatus|originClass|PaymentType|PassengerType1|BagCount|BaggageWeight|ticketStatus|NameStatus|segmentIndex|iCouponStatus|
      |PTY ATO    |USD     |SJO          |PTY         |01 days   |Delay between 4 to 7:59hrs|1    |0    |0  |0  |All Passenger List|US-5CD4377SFF|PrintReady   |Economy    |Cash       |Print List    |1       |23           |CHECKED-IN  |MEAL DLY FLTS|0        |Assign     |
