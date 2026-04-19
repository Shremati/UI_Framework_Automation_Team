#Description:
#Title : ISSUE/REISSUE-Create reservation for 1ADT in BRAZIL ATO GRU (BRL), Issue in BRAZIL CTO GRU (BRL), pay with EMD RESIDUAL and perform voluntary Reissue in BRAZIL CTO GRU (BRL), pay reissue with MASTER CARD
#
#Step 0: 1. Sign in with sales agent user in BRAZIL ATO GRU, select the currency BRL and search availability for booking:
#- Route: GRU to Central America
#- Trip: ROUND TRIP
#- Dates: select any dates (departure or arrival: today, tomorrow, within 3 days, 1 week, 1 month, 9 month)
#- Class: Y,B or M
#- Traveler type: 1ADT
#2. Quote:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BOOKED
#- Discount: CONGRESS or CONVENTIONS
#- Verify that the administrative fee is according with the point of sale
#3. Enter traveler details:
#- ConnectMiles: NO
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#4. PAY ISSUE: Sign in with sales agent user in BRAZIL CTO GRU, select the currency BRL and retrieve the reservation:
#- Form of payment: EMD RESIDUAL
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#5. REISSUE: Sign in with sales agent user in BRAZIL CTO GRU, select the currency BRL and retrieve the reservation.
#- Search the availability of new flights for the Reissue.
#- Type of change: ROUTE
#- Book new segments or flights
#6. Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BEST BUY
#- Discount: CONGRESS or CONVENTIONS
#- Penalty Waiver Code: YES, CORPORATE
#- Save and add quote to order
#7. PAY REISSUE:
#- Form of payment: MASTER CARD
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#8. Add SSR:
#- Copa Club
#9. Add free seats
#10. Pay seats : AMEX


@Reissue
Feature: 624673 - 145952:ISSUE/REISSUE-Create reservation for 1ADT in BRAZIL ATO GRU (BRL), Issue in BRAZIL CTO GRU (BRL), pay with EMD RESIDUAL and perform voluntary Reissue in BRAZIL CTO GRU (BRL), pay reissue with MASTER CARD

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624673 - 145952:ISSUE/REISSUE-Create reservation for 1ADT in BRAZIL ATO GRU (BRL), Issue in BRAZIL CTO GRU (BRL), pay with EMD RESIDUAL and perform voluntary Reissue in BRAZIL CTO GRU (BRL), pay reissue with MASTER CARD

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
#    And I validate the Price Quote and click on Next
    And I click the Price Quote button and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType2>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I want to pay using residual emd
    And I perform voluntary manual refund
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I check the EMDs in EMD tab

    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate>" and Return Date "<StartDate1>" for two way booking
    And I select Adult passengers and search for flights
    And I select class "<Class>" for the first segment and "<Class>" for the second segment in first connecting segment flight
    And I select class "<Class>" for the first segment and "<Class>" for the second segment in second connecting segment flight
    And I select pricing option as "<PricingOption>"
    And I add advanced option "<optionType>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency2>"
    And I navigate to home screen
    And I click the order tab
    And I Click on CheckOut button for payment
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType3>"
    And I enter the FOID details for the passengers with document type as "<documentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details

    And I navigate to home screen
    And I click the order tab
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination2>"
    And I enter Start Date "<StartDate2>" and Return Date "<StartDate3>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select Book from Actions Dropdown and give the segment numbers as "<segments>"
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>" with an advanced option type  "<optionType1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes

    And I navigate to home screen
    And I click the order tab
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

    And I navigate to home screen
    And I search for the PNR created in Reservation Section
    And I click on Seat Icon from Services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
#    And I choose one mode of payment
#    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats
    And I logout from COPA GUI application



    Examples:
      |salesOffice  |currency |salesOffice1   |currency1|salesOffice2|currency2|OriginCity  |Destination  |OriginCity1|Destination1|Destination2|StartDate|StartDate1|StartDate2|StartDate3|PaymentType|PaymentType2|PaymentType3           |SSRType   |SSRDescription  |Adult|Child|INF|INS|Class|originClass|segments|SegmentDelete| PricingOption   |PaymentType1|ticketStatus1|PricingOption1   |optionType|documentType|optionType1                     |
      |PTY ATO      |USD      |GRU ATO        |BRL      |GRU CTO     |BRL      |PTY         |BOG          |GRU        |SAL         |PUJ         |07 Days  |10 Days   |12 Days   |16 Days   |EMD        |CASH        |SECOND_CASH_AFTER_EMD  |COPA CLUB |COPA CLUB       |1    |0    |0  |0  |Y    |Economy    |5678    |1            | Price as Booked |AMEX        |EXCHANGED    |Price as Best Buy|Discount  |Passport    |DiscountAndPenaltyWaiverGoodWill|



