#Description:
#Generate a new booking in BOG ATO and pay it.
#Go to the COMPENSATION MODULE and generate the iCoupon compensation by searching for flights from compensation module
#Apply the compensation reason. (Make sure is the authorize reason for MEAL compensation.
#Display the results.
#
#Expected:
#Must be able to generate correctly.


@IcouponAssign
Feature: 629055 - Go to the COMPENSATION MODULE and generate the iCoupon compensation by searching for flights from compensation module

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629055 - Go to the COMPENSATION MODULE and generate the iCoupon compensation by searching for flights from compensation module

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
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
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
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType2>"
    And I issue the compensation for selected passengers
    And I select passengers click print button and click digital voucher button
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType1>"
    And I click the EMD Available for Print tab and click print button
    And I navigate to home screen
    And I click the tickets tab and click ticket EMD tab verify the segment name status "<NameStatus>"
    And I select Sales Report and Agent Sales Report
    And I validate EMD ticket number in Agent sales report
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate |compensationReason        |Adult|Child|INS|INF|PassengerType     |printer   |printerStatus|originClass|PaymentType|PassengerType1|ticketStatus|PassengerType2|BagCount|BaggageWeight|NameStatus|iCouponStatus|
      |PTY ATO    |USD     |PTY          |MDE         |01 days   |Delay between 2 to 3:59hrs|1    |0    |0  |0  |All Passenger List|US-5CD4377SFF|PrintReady   |Economy    |Cash       |Print List    |CHECKED-IN  |Compensation List|1    |23           |MEAL DLY FLTS|Assign |
