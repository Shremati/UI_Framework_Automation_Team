#Description:
#1. Sign in with sales agent user in BRASIL CTO GIG, select the currency BRL and search availability for booking:
#- Route: GIG to BOG
#- Trip: Round trip
#- Dates: leaving any day (today, tomorrow, within 3 days, 1 week)
#- Class: C
#- Traveler type: 1ADT + 1CHD
#2. Quote:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BOOKED
#- Verify that the administrative fee is according with the point of sale
#3. Enter traveler details:
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#4. PAY ISSUE:
#- Form of payment: MISC ACCOUNT
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#5. REISSUE. Change POS to COLOMBIA CTO BOG , select the currency COP, search the availability of new flights for the Reissue:
#- Type of change: Change dates to leave 1 week later and select economic class
#- Book new segments or flights.
#6. Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BEST BUY (result must be a REFUND)
#- Save and add quote to order
#7. PAY REISSUE:
#- Form of payment: as Residual Value
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Validate that the reissue ticket has zero (0.00) value Total Amount with the Original Currency (BRL)
#- Validate the final residual EMD generated:
#- A residual EMD per passenger was generated
#- Currency of EMD is equal to original currency ticket (BRL)
#- Value of EMD match with the reissue quote
#- Residual EMD has the status OPEN with RFIC code 99i
#8. Sales Report:
#- Verify that the tickets and RESIDUAL EMD created in the transaction are displayed correctly in SALES REPORT
#- Reissue ticket with value 0.00 and original currency ticket (BRL)
#- First EMD residual with value 0.00 and original currency ticket (BRL)
#- Final EMD residual with value 0.00 and original currency ticket (BRL)
#9. Use the Residual EMD generated as form of payment for PETC service.
#- Validate the GUI allow use the EMD as FOP
#
#
#
#Expected:
#
#
#Actual:


@UAT
Feature: 624672 - ISSUE/REISSUE - Create reservation for 1ADT + 1CHD in BRASIL CTO GIG (BRL), pay with MISC ACCOUNT, perform voluntary Reissue in COLOMBIA CTO BOG (COP) and pay as Residual Value.

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624672 - ISSUE/REISSUE - Create reservation for 1ADT + 1CHD in BRASIL CTO GIG (BRL), pay with MISC ACCOUNT, perform voluntary Reissue in COLOMBIA CTO BOG (COP) and pay as Residual Value.

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<StartDate1>" for two way booking
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<Class>" for the first segment and "<Class>" for the second segment in first connecting segment flight
    And I select class "<Class>" for the first segment and "<Class>" for the second segment in second connecting segment flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the FOID details for the passengers with document type as "<documentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report

    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency2>"
    And I click the order tab
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<Destination1>" and "<OriginCity1>"
    And I enter Start Date "<StartDate2>" and Return Date "<StartDate3>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select Book from Actions Dropdown and give the segment numbers as "<segments>"
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes

#    And I navigate to home screen
#    And I click the order tab
#    And I click the Tickets tab
#    And I click the EMD subtab to check the residual emd name and RFISC value as "<RFISC>" and store the residual emd value
#
    And I navigate to home screen
    And I click the order tab
#    And I add SSR "<SSRType>" with "<SSRDescription>" through Services Tab for the passenger "<PaxIndex>"
    And I click the services Tab
    And I add SSR "<SSRType>" through Services tab with "<SSRDescription>"
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I click the order tab
    And I click the Tickets tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application



    Examples:
      |salesOffice1  |currency1 |salesOffice   |currency|salesOffice2          |currency2|OriginCity  |Destination  |OriginCity1|Destination1|StartDate|StartDate1|StartDate2|StartDate3|PaymentType|SSRType|SSRDescription     |PaymentType1          |Adult|Child|INF|INS|Class|originClass|segments|SegmentDelete| PricingOption   |ticketStatus|ticketStatus1|PricingOption1   |RFISC|PaxIndex|documentType|
      |GIG CTO       |BRL       |PTY ATO       |USD     |BOG City Ticket Office|COP      |GIG         |BOG          |PTY        |BOG         |07 Days  |10 Days   |12 Days   |16 Days   |MISC_SST   |PETC   |PET IN CABIN - 0BT |VOLRISSUE_RESIDUAL_EMD|1    |1    |0  |0  |C    |Economy    |56      |1            | Price as Booked |Open        |EXCHANGED    |Price as Best Buy|99I	   |1       |Passport  |



