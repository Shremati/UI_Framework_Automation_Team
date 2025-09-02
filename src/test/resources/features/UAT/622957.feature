#Description
#Open a reservation with NR's passengers in compensation module
#Try to compensate passengers (any reason to get ICoupon)
#
#Expected
#The system does not display compensation for NR's passengers

@UAT
Feature: 622957 - IC1005 - Validate that the system does not allow generating an ICoupon for NR passengers

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622957 - IC1005 - Validate that the system does not allow generating an ICoupon for NR passengers


  #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I add "<NRSA>" NRSA passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"

    And I navigate to the User provisioning Tool page
    And I enter User Id and click on search in user provisioning page
    And I select POS and set status of the iCoupon in User Provisioning tool page "<iCouponStatus>"
    And I navigate to home screen

    And I click on Tools Menu
    And I click on Native Shares
    And I set Class Of Service to "<COS>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex>"
    And I set startdate to "<StartDate>" for Segment "<SegmentIndex>"
    And I set PNR Type to "<PNRType>"
    And I search for flight availability in Native shares of special pnr for first segment from "<Origin>" to "<Destination>" and "<StartDate>"
    And I enter the passenger details in Native shares
    And I enter the passenger phone details for "<POS>"
    And I save the details of the passenger
    And I end and retrieve the PNR in Native shares
    And I click on Cancel button in native shares
    And I click the order tab
    And I select the Quote Options and click on Next retrieving PNR from Native shares
    And I select pricing option Price as Best Buy retrieving PNR from Native shares
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I change the date format for passenger DOB
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
    And I select the passengers and click the issue compensation button and validate the error message
    And I logout from COPA GUI application


    Examples:
      |salesOffice |currency  |Adult|Child|INF|INS|NRSA|PaymentType|Origin|Destination|iCouponStatus|Airline|POS|PNRType|COS|SegmentIndex|PassengerType     |StartDate|compensationReason        |printer      |printerStatus|
      |PTY ATO     |USD       | 0   |0    |0  |0  |1   |  Cash     |PTY   |MDE        |Assign       |CM     |PTY|NRSA   |Y  |0           |All Passenger List|01 Days  |Delay between 2 to 3:59hrs|US-5CD4377SFF|PrintReady   |
