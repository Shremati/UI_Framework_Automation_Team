#Description:
#DO NOT assign the iCoupon role
#Go to compensation module
#Compensate the affected booking
#Display the results
#
#Expected:
#It must display an error message showing it does not have the iCoupon role

@IcouponUnAssign
Feature: 622978 - Validate that the GUI cannot compensate without the iCoupon role

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622978 - Validate that the GUI cannot compensate without the iCoupon role

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
#    And I select the printer "<printer>" and "<printerStatus>"
#
#    And I navigate to the User provisioning Tool page
#    And I enter User Id and click on search in user provisioning page
#    And I select POS and set status of the iCoupon in User Provisioning tool page "<iCouponStatus>"

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
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I enter Order Id and select compensation reason for the passenger "<compensationReason>" and "<PassengerType>"
    And I select required passengers and click the issue compensation button
    And I select passengers and click print button
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType1>"
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate |compensationReason        |Adult|Child|INS|INF|PassengerType     |printer      |printerStatus|originClass|PaymentType|PaxCount|PassengerType1|iCouponStatus|OriginCity1|Destination1|OriginCity2|Destination2|StartDate1|StartDate2|OriginCity3|OriginCity4|Destination3|Destination4|StartDate3|StartDate4|
      |PTY ATO    |USD     |PTY          |SCL         |05 days   |Delay between 2 to 3:59hrs|2    |0    |0  |0  |All Passenger List|US-5CD4377SFF|PrintReady   |Economy    |Cash       |2       |Print List    |UnAssign     |SCL        |PTY         |PTY        |BOG         |10 days   |15 days   |BOG        |PTY        |PTY         |MEX         |20 days   |25 days   |
