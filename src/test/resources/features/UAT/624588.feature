#Description:
#ISSUE/REISSUE-Create reservation for 2ADT + 1CHD + 1INF in PANAMA CALL CENTER (USD), Issue in PANAMA ATO PTY (USD), pay with CASH + DEBIT CARD and perform voluntary Reissue in PANAMA CTO CDE (USD), pay reissue with VISA + EMD RESIDUAL
#
#Step 0: 1. Sign in with sales agent user in PANAMA CALL CENTER, select the currency USD and search availability for booking:
#- Route: PTY to Central America
#- Trip: ROUND TRIP
#- Dates: select any dates (departure or arrival: today, tomorrow, within 3 days, 1 week, 1 month, 9 month)
#- Class: ECONOMIC CABIN
#- Traveler type: 2ADT + 1CHD + 1INF
#2. Quote:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BEST BUY
#- Discount: SRC SENIOR CITIZEN
#- Verify that the administrative fee is according with the point of sale
#3. Enter traveler details:
#- ConnectMiles: NO
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#4. PAY ISSUE: Sign in with sales agent user in PANAMA ATO PTY, select the currency USD and retrieve the reservation:
#- Form of payment: CASH + DEBIT CARD
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#5. REISSUE: Sign in with sales agent user in PANAMA CTO CDE, select the currency USD and retrieve the reservation.
#- Search the availability of new flights for the Reissue.
#- Type of change: ROUTE AND DATES
#- Book new segments or flights
#6. Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BEST BUY
#- Discount: SRC SENIOR CITIZEN
#- Penalty Waiver Code: NO
#- Save and add quote to order
#7. PAY REISSUE:
#- Form of payment: VISA + EMD RESIDUAL
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT



@Reissue
Feature: 624588 - 146079 - ISSUE/REISSUE-Create reservation for 2ADT + 1CHD + 1INF in PANAMA CALL CENTER (USD), Issue in PANAMA ATO PTY (USD), pay with CASH + DEBIT CARD and perform voluntary Reissue in PANAMA CTO CDE (USD), pay reissue with VISA + EMD RESIDUAL

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624588 - 146079 - ISSUE/REISSUE-Create reservation for 2ADT + 1CHD + 1INF in PANAMA CALL CENTER (USD), Issue in PANAMA ATO PTY (USD), pay with CASH + DEBIT CARD and perform voluntary Reissue in PANAMA CTO CDE (USD), pay reissue with VISA + EMD RESIDUAL

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency>"
    And I select the printer "<Printer>" and "<PrinterStatus>"
    And I click on the Reservation section
    And I create PNR to get Residual EMD value
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination1>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option as "<PricingOption>"
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
    And I click and view the Tickets tab for residual emd refund
    And I check the EMDs in EMD tab
    And I created Residual EMD successfully

    And I create the passengers data
    And I add "<Adult1>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    #And I add "<SeniorAdult>" senior adult passengers
    And I want to display all the passengers

    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<returnDate>" for two way booking
    And I select infant without seat passengers
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option as "<PricingOption>"
    And I add advanced option "<optionType2>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details with Senior Citizen for COPA GUI
    And I Click on Book and FileFare button
    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency>"
    And I navigate to home screen
    And I click the order tab
    And I Click on CheckOut button for payment
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I make the second payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
#    And I click the Tickets tab
#    And I click on Ticket tab and check the "<ticketStatus>" status
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click on View button and check the Ticket details
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the tickets and EMD values in Agent Sales Report
    And I navigate to home screen
    And I click the order tab
    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency>"
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination2>"
    And I enter Start Date "<StartDate1>" and Return Date "<returnDate1>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass1>" for Origin flight for the newly added segments via availability
    And I select class "<originClass1>" for Return flight for the newly added segments via availability
    And I select Book from Actions Dropdown
    And I select and delete the segment "<segmentNo>"
    And I select and delete the segment "<segmentNo>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>" with an advanced option type  "<optionType>"
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType3>"
    And I make the second payment by selecting the payment type as "<PaymentType2>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report after changes
    And I logout from COPA GUI application

    Examples:
      |salesOffice               |salesOffice1                          |salesOffice2               |currency|OriginCity  |Destination  |Destination1|Destination2|StartDate|returnDate|StartDate1|returnDate1|Adult1          |Adult|Child|INF|INS|PaymentType     |originClass|originClass1|PaymentType1|PricingOption      |PricingOption1         |PaymentType4|PaymentType2                    |PaymentType3|Printer      |PrinterStatus|optionType1|segmentNo|ticketStatus|ticketStatus1 |optionType                 |optionType2                           |
      |PTY - CC                  |PTY ATO                               |PTY CTO COSTA DEL ESTE     |USD     |PTY         |GUA          |MEX         |MDE         |90 Days  |93 Days   |95 Days   |99 Days    |2               |1    |1    |1  |0  |DEBITCARD1      |Economy    |Business    |CASH        |Price as Best Buy  |Price as Best Buy      |CASH        |VISA_AFTER_EMD                  |EMD         |IN-5CD4316MPJ |PrintReady   |Discount  |1        |Open        |EXCHANGED     |Discount                   |PAX_REDUCTION_TYPE_SRC                |
