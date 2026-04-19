#Description:
#
#
#
#
#
#Title :REISSUE-Retrieve CSS reservation departure from Haiti with status No SHOW in Colombia ATO (BOG) and perform Voluntary Reissue.
#
#Description : 1. Sign in ATO of Colombia
#2. Retrieve a reservation with following characteristic:
#- Status Tickets: No Show
#- Reservation issued in: CSS
#3. Book new segments for reissue
#4. Execute voluntary reissue
#5. Pay with Credit Card + Cash
#6. Send e-ticket and EMD receipt
#7. Old ticket has status Exchanged and new ticket OPEN
#8. Add PETC service and pay with CASH
#9. View all transactions in sales report.
#
#Step 1: TRR allows reissuing reservations with NO SHOW status



@Reissue
Feature: 624579 - 144437-REISSUE-Retrieve CSS reservation departure from BOG with status No SHOW in Colombia ATO (BOG) and perform Voluntary Reissue.

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624579 - 144437-REISSUE-Retrieve CSS reservation departure from BOG with status No SHOW in Colombia ATO (BOG) and perform Voluntary Reissue.

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
#    And I select class "<originClass>" for the first connecting segment flight
#    And I select class "<originClass>" for the first segment on current day
    And I select class "<originClass>" for the first connecting segment on current day
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the FOID details for the passengers with document type as "<DocumentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details

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
    And I change status of segments "<TotalSegments>" to status type "<StatusType>"
    And I enter *ET command to display all the tickets in the PNR
    And I enter *ET for displaying coupon of ticket
    And I enter *EH command to display the ETKT history
    And I logout from Shares application

    And I navigate back to previous tab in the browser "<Tab>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus2>" status in ticket tab
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate2>" for one way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for the first connecting segment flight
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes

    And I navigate to home screen
    And I click the order tab
    And I add SSR "<SSRType>" through Services tab with "<SSRDescription>"
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I click the order tab
    And I click the services Tab to validate added SSR "<SSRType>"
    And I navigate to home screen
    And I click the order tab
    And I click the Tickets tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after SSR addition
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate |  StartDate2 | SSRType | PaymentType | PaymentType1 | Adult | Child | INF | INS | originClass | DocumentType | PricingOption   | ticketStatus2 | TicketStatus1 | SegmentDelete | StatusType | TotalSegments | Tab | SSRDescription     |
      | BOG ATO     | COP      | BOG        | SJO         | 00 days   |  07 days    | PETC    | CASH        | VISA         | 1     | 0     | 0   | 0   | Economy     | Passport     | Price as Booked | NOSHOWED      | EXCHANGED     | 1             | NO_SHOWED  | 2             | 1   | PET IN CABIN - 0BT |



