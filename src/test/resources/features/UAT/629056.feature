#Description
#Generate a new booking starting from EZE-MIA, 3ADT and ONE WAY.
#Check-in all passangers.
#Change the first segment to CMUSED and proceed to affect the passanger in PTY.
#Go to COMPENSATION MODULE and proceed with the iCoupon compensation by clicking on search flights from compensation module home screen
#Display results results
#
#Expected
#Must display the GREEN CHECK MARK

@UAT
Feature: 629056 - Generate an iCoupon compensation for a ONE WAY flight with affectation in PTY

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629056 - Generate an iCoupon compensation for a ONE WAY flight with affectation in PTY

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
    And I select class "<originClass>" for the first connecting segment flight
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
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab present in Tickets tab

    #iShares
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
    And I enter T_ET|USED command to change the specific segment to CM-USED status "<segNumber>"
    And I enter *ET command to display all the tickets in the PNR
    And I retrieve the pnr
    And I enter ZAFIL command to change segment status to flown "<Segment>"
    And I retrieve the pnr
    And I logout from Shares application

    #GUI
    And I navigate back to previous tab in the browser "<Tab>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I navigate to home screen
    And I click the order tab
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I add free standard baggage for all the passenger "<BaggageWeight>"
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I select the passengers in checkin page using "<searchType>"
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>" and "<Index>"
    And I enter Order Id and select compensation reason for the passenger "<compensationReason>" and "<PassengerType>"
    And I select required passengers and click the issue compensation button
#    And I select passengers click print button and click digital voucher button
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType1>" and "<Index>"
    And I click the EMD Available for Print tab and click print button
    And I click on view icon and display the compensation additional details
    #And I select passengers generate digital voucher and view compensation details

    And I navigate to home screen
    And I click the tickets tab and click ticket EMD tab verify the segment name status "<NameStatus>"
    And I select sales report and select Agent sales report
    And I validate EMD values and validate baggage details in Agent sales report
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate |compensationReason        |Adult|Child|INS|INF|PassengerType     |printer      |printerStatus|originClass|PaymentType|PaxCount|PassengerType1|iCouponStatus|segNumber|Tab|ticketStatus|segmentIndex|searchType|BaggageWeight|PricingOption  |NameStatus   |Segment|Tab1|Index|
      |PTY ATO    |USD     |EZE          |MIA         |01 days   |Delay between 2 to 3:59hrs|3    |0    |0  |0  |All Passenger List|US-5CD4377SFF|PrintReady   |Economy    |Cash       |3       |Print List    |Assign       |1        |1  |CM USED     |1           |PNR       |23           |Economy Classic|MEAL DLY FLTS|1      |0   |1    |


