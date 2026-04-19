#Description:
#Title : ISSUE/REISSUE - Create reservation for 1ADT + 1CHD + 1INF in MEXICO CTO MEX (MXN), pay with COMPENSATION EMD, perform voluntary Reissue in COLOMBIA CTO MDE (COP) and pay as Residual Value.
#
#Step 0: 1. Sign in with sales agent user in MEXICO CTO MEX, select the currency MXN and search availability for booking:
#- Route: MEX to MDE
#- Trip: Round trip
#- Dates: leaving any day (today, tomorrow, within 3 days, 1 week)
#- Class: Y
#- Traveler type: 1ADT + 1CHD + 1INF
#2. Quote:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BOOKED
#- Verify that the administrative fee is according with the point of sale
#3. Enter traveler details:
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#4. PAY ISSUE:
#- Form of payment: COMPENSATION EMD
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#5. REISSUE. Change POS to COLOMBIA CTO MDE , select the currency COP, search the availability of new flights for the Reissue:
#- Type of change: Change dates to leave 2 months later and select the most economical classes W, L, T, A
#- Book new segments or flights.
#6. Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BEST BUY (result must be a REFUND)
#- Save and add quote to order
#7. PAY REISSUE:
#- Form of payment: as Residual Value
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Validate that the reissue ticket has zero (0.00) value Total Amount with the Original Currency (MXN)
#- Validate the final residual EMD generated:
#- A residual EMD per passenger was generated
#- Currency of EMD is equal to original currency ticket (MXN)
#- Value of EMD match with the reissue quote
#- Residual EMD has the status OPEN with RFIC code 99i
#8. Sales Report:
#- Verify that the tickets and RESIDUAL EMD created in the transaction are displayed correctly in SALES REPORT
#- Reissue ticket with value 0.00 and original currency ticket (MXN)
#- First EMD residual with value 0.00 and original currency ticket (MXN)
#- Final EMD residual with value 0.00 and original currency ticket (MXN)
#9. Use the Residual EMD generated as form of payment for PETC service.
#- Validate the GUI allow use the EMD as FOP
#
#Expected:
#1.All Test steps should be completed without any issues
#2.GUI/Reports/Backend validations should be completed successfully
#
#
#Actual:

@Reissue
Feature: 624657 - 146892:ISSUE/REISSUE - Create reservation for 1ADT + 1CHD + 1INF in MEXICO CTO MEX (MXN), pay with COMPENSATION EMD, perform voluntary Reissue in COLOMBIA CTO MDE (COP) and pay as Residual Value.

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624657 - 146892:ISSUE/REISSUE - Create reservation for 1ADT + 1CHD + 1INF in MEXICO CTO MEX (MXN), pay with COMPENSATION EMD, perform voluntary Reissue in COLOMBIA CTO MDE (COP) and pay as Residual Value.

#   #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login

    #to get the compensation EMD
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
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType2>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency2>"
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I search the Order number in Travel compensation model
    And I select the Order number and click on continue button in compensation model
    And I issue the compensation for selected passengers with amount "<Amount>" and "<compensationReason>"
    And I select passengers and view compensation details
    And I navigate to home screen

   #Retrieve PNR and pay with residual emd
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination1>"
    And I enter Start Date "<StartDate>" and Return Date "<StartDate1>" for two way booking
    And I select infant without seat passengers
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
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType11>"
    #And I make the last payment if required by selecting the payment type as "<PaymentType2>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details

    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination1>"
    And I enter Start Date "<StartDate2>" and Return Date "<StartDate3>" for two way booking
    And I click search button in flight search availability
    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in first connecting segment flight
    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in second connecting segment flight
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I navigate to home screen
    And I click the order tab
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I store the residual emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab to check the residual emd name and RFISC value as "<RFISC>" and store the residual emd value
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes

    And I navigate to home screen
    And I click the order tab
    And I add SSR "<SSRType>" through Services tab with "<SSRDescription>"
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType4>"
    And I enter Passport FOID details
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
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | salesOffice1    |salesOffice2|currency2| currency1 | OriginCity | Destination1 |Destination|  PaymentType     | StartDate | StartDate1 | StartDate2 | StartDate3 | PaymentType1 | Adult | Child | INF | INS | PricingOption   | PricingOption1    | TicketStatus1 | SegmentDelete | PaymentType2 | Class | Class2 |originClass|Amount|compensationReason|PaymentType11 |SSRDescription     |SSRType|RFISC|PaymentType4    |
      | MEX CTO     | MXN      |MDE CTO POBLADO  |MEX ATO     | MXN     | COP       | MEX        | MDE          |PTY        | COMPENSATION_EMD | 10 days   | 12 days    | 60 days    | 75 days    | CASH         | 1     | 1     | 1   | 0   | Price as Booked | Price as Best Buy | EXCHANGED     | 1             | Cash         | Y     | A      |Economy    |400   |Baggage Delay     |CASH_AFTER_EMD|PET IN CABIN - 0BT |PETC   |99I  |VOL_RESIDUAL_EMD|

