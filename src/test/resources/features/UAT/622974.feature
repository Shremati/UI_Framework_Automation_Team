#Description:
#Go to compensation module
#Select the flight # and the passengers 2ADT
#Select the compensation reason
#Select compensation reason and create Icoupon for 1st passenger
#Select compensation reason and create paper for 2nd passenger
#Verify that both amounts are correct
#Verify that the Icoupon is correctly created
#
#Expected:
#Display the Icoupon it must have the correct amount and the passenger names

@IcouponAssign
Feature: 622974 - validate the case with one passenger applying for an Icoupon and the other for an EMD Meal

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622974 - validate the case with one passenger applying for an Icoupon and the other for an EMD Meal

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
    And I select pricing option as "<PricingOption>"
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
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen

    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I select one passenger with PNR and select compensation reason "<compensationReason>"
    And I select required passengers and click the issue compensation button
    And I select passengers click print button and click digital voucher button
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I select one passenger with PNR and select compensation reason "<compensationReason>"
    And I select required passengers and click the issue compensation button
    And I select passengers click print button and click continue printing button
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType1>"
    And I click on view icon for both paper and Icoupon generated passengers to display compensation details
    And I click the EMD Available for Print tab and click print button verify the amount "<Amount>"
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | Adult | Child | INS | INF | printer       | printerStatus | originClass | PaymentType | PaxCount | PassengerType      | PassengerType1 | iCouponStatus | Amount | segmentIndex | searchType | PricingOption   | compensationReason         |
      | PTY ATO     | USD      | PTY        | GYE         | 02 days   | 2     | 0     | 0   | 0   | US-5CD4377SFF | PrintReady    | Economy     | Cash        | 2        | All Passenger List | Print List     | Assign        | 15     | 0            | Name       | Economy Classic | Delay between 4 to 7:59hrs |


