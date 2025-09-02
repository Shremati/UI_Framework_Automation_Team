#Description:
#Generate a reservation of 4ADT
#Check in all the passengers
#Go to compensation module
#Start the process of compensate the passengers through Search by Flights
#Select each passenger in the Icoupon
#Complete the compensation with the correct amount
#verify that the Icoupon is correctly created and check for the green icon
#
#Expected:
#Selected passengers for iCoupon generation should display the green IC icon.

@UAT
Feature: 622969 - Create an iCoupon for a reservation of 4ADT

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622969 - Create an iCoupon for a reservation of 4ADT

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
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab present in Tickets tab
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<OriginCity>" and "<StartDate>" and "<PassengerType>" and "<flightIndex>"
    And I enter Order Id and select compensation reason for the passenger "<compensationReason>" and "<PassengerType>"
    And I select passengers and click the issue compensation button "<PassengerType>" and "<compensationReason>" and "<StartDate>"
    And I select passengers click print button and click digital voucher button
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<OriginCity>" and "<StartDate>" and "<PassengerType1>" and "<flightIndex>"
    And I click the EMD Available for Print tab and click print button
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate |compensationReason        |Adult|Child|INS|INF|PassengerType     |printer   |printerStatus|flightIndex|originClass|PaymentType|PaxCount|PassengerType1|iCouponStatus|
      |PTY ATO    |USD     |PTY          |MEX         |00 days   |Delay between 4 to 7:59hrs|4    |0    |0  |0  |All Passenger List|US-5CD4377SFF|PrintReady   |0          |Economy    |Cash       |4       |Print List    |Assign    |
