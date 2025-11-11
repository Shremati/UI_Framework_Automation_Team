#Description:
#| Step Name       | Description                                                           | Expected Result
#| 1               | Create a reservation in POS PTY-ATO PTY-MIA, OW 1ADT                  |
#|                 |                                                                       |
#| 2               | Ticket must be displayed in "NO SHOW" status                          |
#|                 |                                                                       |
#| 3               | Go to Compensation Module                                             |
#|                 |                                                                       |
#| 4               | Enter Flight Number                                                   |
#|                 |                                                                       |
#| 5               | Select Passenger and compensation reason (Delay Between 4 to 7:59hrs) |
#|                 |                                                                       |
#| 6               | Issue Compensation                                                    | Verify that the iCoupon has been generated correctly
#|                 |                                                                       |



@UAT_NoRun
Feature: 629730 - Validate that the iCoupon apply correctly for a reservation in "NO SHOW" status

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629730 - Validate that the iCoupon apply correctly for a reservation in "NO SHOW" status

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
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab


    And I navigate to home screen
    And I navigate to Shares Application
    And I enter valid shares credentials
    And I click on the shares Login Button
    And I click on terminal emulation
    Then I validate successful shares login
    Then I enter LOGC CMRE command for logging in
    And I enter BSIA command for signing in
    And I enter BSO command for sign out
    And I enter BSIA command for signing in
    And I enter W* command to check lniata of the session
    And I enter BSIA command for signing in
    And I retrieve the pnr
    And I enter *ET command to display all the tickets in the PNR
    And I change status of segments "<TotalSegments>" to status type "<StatusType>"
    And I enter *ET command to display all the tickets in the PNR
    And I enter *ET for displaying coupon of ticket
    And I enter *EH command to display the ETKT history
    And I logout from Shares application

    And I navigate back to previous tab in the browser "<Tab>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus2>" status in ticket tab
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
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate|Adult|Child|INS|INF|printer      |printerStatus|originClass|PaymentType|PassengerType     |PassengerType1 |iCouponStatus|ticketStatus1|PricingOption  |compensationReason        |ticketStatus2|StatusType|TotalSegments|Tab|
      |PTY ATO    |USD     |PTY          |MIA         |00 days  |1    |0    |0  |0  |IN-PF2ST1T4  |PrintReady   |Economy    |Cash       |All Passenger List|Price as Booked|Assign       |CHECKED-IN   |Economy Classic|Delay between 4 to 7:59hrs|NOSHOWED     |NO_SHOWED |1            |1  |


