#Description:
#Open Gate module
#Display list-  Thru Pax
#
#Expected:
#
#Actual:

@UAT
Feature: 236688 - Display List- Special Service by specific SSR code

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236688 - Display List- Special Service by specific SSR code

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
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select child passengers
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option as Economy full
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

    And I navigate to iShares Page from COPA GUI Application
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
    And I remove SSR "<SSRType>" from the PSC Exception Table
    And I retrieve the pnr
    And I logout from Shares application

    And I navigate back to previous tab in the browser "<Tab>"
    And I click the order tab
    And I add SSR "<SSRType>" through Services tab in GUI
    And I navigate to home screen
    And I validate the SSR "<SSRType>" for the segment "<SegmentIndex>" in native shares
    And I logout from COPA GUI application

    Examples:
      |salesOffice|currency |OriginCity   |Destination |StartDate |Adult|Child|INF|INS|SegmentIndex|SegmentIndex|PaymentType|originClass|SSRType|Tab|
      |PTY ATO    |USD      |PTY          |LAX         |01 days   |1    |0    |0  |0  |0           |1           |Cash       |Economy    |BULK   |1  |
