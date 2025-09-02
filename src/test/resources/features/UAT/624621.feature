#Description:
#Create a Booking PTY-GRU OW 1ADT
#Ticket must be "NO SHOW"
#Reissue the reservation changing dates.
#
#  Expected:
#TRR must calculate No Show penalty ($ 250 USD)

@UAT
Feature: 624621 - Verify Voluntary Reissue of a No Show booking is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624621 - Verify Voluntary Reissue of a No Show booking is happening correctly

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
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details

    #shares
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
    And I change status of segments "<SegNo>" to NoShowed status
    And I enter *ET command to display all the tickets in the PNR
    And I logout from Shares application

    #GUI
    And I navigate back to previous tab in the browser "<Tab1>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab
    And I navigate to Order tab
    And I change the date of travel for the first segment "<NewDate>"
    And I perform Voluntary Reissue
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I navigate to Order tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report
    And I logout from COPA GUI application



    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | NewDate | SegNo | PaymentType | Adult | Child | INF | INS | originClass | Tab1 | TicketStatus2 | TicketStatus |
      | PTY ATO     | USD      | PTY        | GRU         | 01 days   | 04 days | 1     | CASH        | 1     | 0     | 0   | 0   | Economy     | 1    | EXCHANGED     | NOSHOWED     |
