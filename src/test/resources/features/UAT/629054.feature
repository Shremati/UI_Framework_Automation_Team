#Description:
#Generate a new booking with an EMD RESIDUAL. POS: BOG ATO with currency COP for a family of 2ADT and 1CHD
#Pay issue with RESIDUAL EMD
#Check-in the passangers in the CHECK-IN MODULE
#Go to the COMPENSATION MODULE and generate the iCoupon compensation
#Display the results
#
#Expected:
#Should display a green checkmark confirming that is checked.in
#Should generate the iCoupon correctly.


@IcouponAssign
Feature: 629054 - Create a REISSUE and iCoupon reservation. With a payment method in EMD (Residual)

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629054 - Create a REISSUE and iCoupon reservation. With a payment method in EMD (Residual)

    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult1>" adult passengers
    And I add "<Child1>" child passengers
    And I add "<INS1>" infant with seat passengers
    And I add "<INF1>" infant without seat passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
#    And I validate the Price Quote and click on Next
    And I click the Price Quote button and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I want to pay using residual emd
    And I perform voluntary manual refund
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I check the EMDs in EMD tab

    #2nd PNR
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    And I navigate to home screen
    And I navigate to the User provisioning Tool page
    And I enter User Id and click on search in user provisioning page
    And I select POS and set status of the iCoupon in User Provisioning tool page "<iCouponStatus>"
    And I navigate to home screen

    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I select the passengers in checkin page using "<searchType>"
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I enter Order Id and select compensation reason for the passenger "<compensationReason>" and "<PassengerType>"
    And I select required passengers and click the issue compensation button
    And I select passengers click print button and click digital voucher button
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType1>"
    And I click the EMD Available for Print tab and click print button
    And I navigate to home screen
    And I click the tickets tab and click ticket EMD tab verify the segment name status "<NameStatus>"
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate|Adult|Child|INS|INF|Adult1|Child1|INS1|INF1|printer      |printerStatus|originClass|PaymentType|PaymentType1|PassengerType     |PassengerType1|iCouponStatus|NameStatus   |segmentIndex|searchType|PricingOption    |compensationReason        |
      |PTY ATO    |USD     |PTY          |MDE         |01 days  |2    |1    |0  |0  |1     |0     |0   |0   |US-5CD4377SFF|PrintReady   |Economy    |Cash       |EMD         |All Passenger List|Print List    |Assign       |MEAL DLY FLTS|0           |PNR       |Price as Best Buy|Delay between 2 to 3:59hrs|


