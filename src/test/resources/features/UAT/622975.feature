#Description:
#| Step Name       | Description                                                      | Expected Result
#| 1               | Go to compensation module                                        |
#|                 |                                                                  |
#| 2               | Select the flight # and the passengers 2ADT Prefer Member Silver |
#|                 |                                                                  |
#| 3               | Select the compensation reason                                   |
#|                 |                                                                  |
#| 4               | Select compensation reason and create Icoupon for 1st passenger  |
#|                 |                                                                  |
#| 5               | Select compensation reason and create paper for 2nd passenger    |
#|                 |                                                                  |
#| 6               | Verify that both amounts are correct                             |
#|                 |                                                                  |
#| 7               | Verify that the Icoupon is correctly created                     | Display the Icoupon it must have the correct amount and the passenger names
#|                 |                                                                  |

@UAT
Feature: 622975 - Validate compensation to passengers with prefer status

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622975 - Validate compensation to passengers with prefer status

    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I add "<FQTV>" frequent flyer passengers
#    And I add "<FQTV>" silver frequent flyer passengers
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
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page for FQTV passengers
    And I validate if the payment is successful
    And I click the Tickets tab


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
      |salesOffice|currency|OriginCity   |Destination |StartDate|Adult|FQTV|Child|INS|INF|printer      |printerStatus|originClass|PaymentType|PassengerType     |PassengerType1|iCouponStatus|Amount|segmentIndex|searchType|PricingOption  |compensationReason        |
      |PTY ATO    |USD     |PTY          |GYE         |02 days  |0    |2   |0    |0  |0  |IN-PF2ST1T4  |PrintReady   |Economy    |Cash       |All Passenger List|Print List    |Assign       |15    |0           |pnr       |Economy Classic|Delay between 4 to 7:59hrs|


