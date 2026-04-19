#Description:
#Title : ISSUE/REISSUE-Create reservation for 4ADT in PANAMA ATO PTY (USD), Issue in PANAMA ATO PTY (USD), pay with MISC ACCOUNT + MASTER CARD and perform voluntary Reissue in PANAMA ATO PTY (USD), pay reissue with REFUND original FOP
#
#Step 0: 1. Sign in with sales agent user in PANAMA ATO PTY, select the currency USD and search availability for booking:
#- Route: PTY to Caribbean
#- Trip: ONE WAY
#- Dates: select any dates (departure or arrival: today, tomorrow, within 3 days, 1 week, 1 month, 9 month)
#- Class: BUSINESS CABIN
#- Traveler type: 4ADT
#2. Quote:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BEST BUY
#- Discount: NO
#- Verify that the administrative fee is according with the point of sale
#3. Enter traveler details:
#- ConnectMiles: ENROLL
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#4. PAY ISSUE: Sign in with sales agent user in PANAMA ATO PTY, select the currency USD and retrieve the reservation:
#- Form of payment: MISC ACCOUNT + MASTER CARD
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#5. REISSUE: Sign in with sales agent user in PANAMA ATO PTY, select the currency USD and retrieve the reservation.
#- Search the availability of new flights for the Reissue.
#- Type of change: BUSINESS TO ECONOMIC CABIN
#- Book new segments or flights
#6. Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BEST BUY
#- Discount: NO
#- Penalty Waiver Code: NO
#- Save and add quote to order
#7. PAY REISSUE:
#- Form of payment: REFUND original FOP
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT

@Reissue
Feature: 624654 - 146101:ISSUE/REISSUE-Create reservation for 4ADT in PANAMA ATO PTY (USD), Issue in PANAMA ATO PTY (USD), pay with MISC ACCOUNT + MASTER CARD and perform voluntary Reissue in PANAMA ATO PTY (USD), pay reissue with REFUND original FOP

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624654 - 146101:ISSUE/REISSUE-Create reservation for 4ADT in PANAMA ATO PTY (USD), Issue in PANAMA ATO PTY (USD), pay with MISC ACCOUNT + MASTER CARD and perform voluntary Reissue in PANAMA ATO PTY (USD), pay reissue with REFUND original FOP

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
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I enroll connect mile to all the passengers
    And I Click on CheckOut button for payment
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click on View button and check the Ticket details
    And I click the EMD subtab and view the EMD details
    And I click the EMD subtab present in Tickets tab
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report

    And I navigate to home screen
    And I click the order tab
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I click search button in flight search availability
    And I select class "<originClass1>" for Origin flight
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on pay button by selecting the required payment type "<PaymentType2>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I navigate to home screen
    And I click the order tab
    And I click the Tickets tab and store the ticket number
    And I click on View button and check the Ticket details
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate |  originClass1 | PaymentType | PaymentType1| Adult | Child | INF | INS | TicketStatus1 | PricingOption     | originClass | PaymentType2 | SegmentDelete |
      | PTY ATO     | USD      | PTY        | HAV         | 10 days   |  Economy     | MISC_SST    | MASTERCARD  |4      | 0     | 0   | 0   | EXCHANGED     | Price as Best Buy | Business    | CASH         | 1             |


