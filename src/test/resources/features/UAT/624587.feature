#Description:
#Title : ISSUE/REISSUE-Create reservation for 1ADT + 1INF in CANADA ATO YYZ (CAD), Issue in CANADA ATO (CAD), pay with CASH + DINERS CLUB + MAESTRO and perform voluntary Reissue in CANADA ATO YUL (CAD), pay reissue with DEBIT CARD + EMD COMPENSATION
#
#Step 0: 1. Sign in with sales agent user in CANADA ATO YYZ, select the currency CAD and search availability for booking:
#- Route: YYZ to Caribbean
#- Trip: ROUND TRIP
#- Dates: select any dates (departure or arrival: today, tomorrow, within 3 days, 1 week, 1 month, 9 month)
#- Class: BUSINESS CABIN
#- Traveler type: 1ADT + 1INF
#2. Quote:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BEST BUY
#- Discount: NO
#- Verify that the administrative fee is according with the point of sale
#3. Enter traveler details:
#- ConnectMiles: PRESIDENTIAL PLATINUM
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#4. PAY ISSUE: Sign in with sales agent user in CANADA ATO YUL, select the currency CAD and retrieve the reservation:
#- Form of payment: CASH + UATP+ MAESTRO
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#5. REISSUE: Sign in with sales agent user in CANADA ATO YUL, select the currency CAD and retrieve the reservation.
#- Search the availability of new flights for the Reissue.
#- Type of change: BUSINESS TO ECONOMIC CABIN.
#- Book new segments or flights
#6. Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BOOKED
#- Discount: NO
#- Penalty Waiver Code: YES, PRESIDENTIAL
#- Save and add quote to order
#7. PAY REISSUE:
#- Form of payment: DEBIT CARD + EMD COMPENSATION
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#8.Add Seats to order:
#- Premium seat for ADT
#9.Pay Seats
#- MAESTRO
#
#Some steps was edited because when the passenger buy in Bussiness class the downgrade is not allowed.
#
#Expected:
#1.All Test steps should be completed without any issues
#2.GUI/Reports/Backend validations should be completed successfully

@Reissue
Feature: 624587 - ISSUE/REISSUE-Create reservation for 1ADT + 1INF in CANADA ATO YYZ (CAD), Issue in CANADA ATO (CAD), pay with CASH + DINERS CLUB + MAESTRO and
                  perform voluntary Reissue in CANADA ATO YUL (CAD), pay reissue with DEBIT CARD + EMD COMPENSATION

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624587 - ISSUE/REISSUE-Create reservation for 1ADT + 1INF in CANADA ATO YYZ (CAD), Issue in CANADA ATO (CAD), pay with CASH + DINERS CLUB + MAESTRO and
                    perform voluntary Reissue in CANADA ATO YUL (CAD), pay reissue with DEBIT CARD + EMD COMPENSATION

    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I add "<FQTV>" frequent flyer platinum passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<ReturnClass>" for the second connecting segment flights
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button

    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency>"
    And I navigate to home screen
    And I click the order tab
    And I Click on CheckOut button for payment
    And I choose three mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType1>"
    And I make the third payment by selecting the payment type as "<PaymentType2>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I search the Order number in Travel compensation model
    And I select the Order number and click on continue button in compensation model
    And I issue the compensation for selected passengers with amount "<Amount>" and "<compensationReason>"
    And I select passengers and view compensation details

    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" and Return Date "<ReturnDate1>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass1>" for the first connecting segment flight
    And I select class "<ReturnClass1>" for the second connecting segment flights
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary reissue with penalty waiver and pricing option as "<PricingOption1>"
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType3>"
    And I make the second payment by selecting the payment type as "<PaymentType4>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
#    And I choose one mode of payment
#    And I make the first payment by selecting the payment type as "<PaymentType2>"
    And I click on pay button by selecting the required payment type "<PaymentType2>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes
    And I logout from COPA GUI application


    Examples:
      |salesOffice|salesOffice1|currency|OriginCity   |Destination |OriginCity1|Destination1|originClass1|ReturnClass1|StartDate|ReturnDate|StartDate1|ReturnDate1|Adult|Child|INS|INF|FQTV|SegmentDelete|PricingOption1 |originClass|ReturnClass|PaymentType|PaymentType1|PaymentType3|ticketStatus |PricingOption    |PaymentType2|PaymentType4     |printer      |printerStatus|Amount|compensationReason|
      |YYZ ATO    |YUL ATO     |CAD     |YYZ          |SJU         |YUL        |SJU         |Economy     |Economy     |10 days  |17 days   |13 days   |25 days    |0    |0    |0  |1  |1   |1            |Price as Booked|Business   |Business   |CASH       |UATP        |EMD         |EXCHANGED    |Price as Best Buy| MAESTRO    |SECOND_MAESTRO_AFTER_EMD|US-5CD4377SFF|PrintReady   |400   |Baggage Delay     |


