#Description:
#Title :ISSUE/REISSUE-Create reservation for 1CHD in CTO Mini-Cuba Issue in CTO Mini-Cuba, pay with EMD RESIDUAL and perform voluntary Reissue in CTO Mini-Cuba, pay reissue with VISA
#
#Description : 1. Sign in with sales agent user in CTO Mini - Cuba, select the currency CUP and search availability for booking:
#- Route: HAVL to South America
#- Trip: ROUND TRIP
#- Dates: select any dates (departure or arrival: today, tomorrow, within 3 days, 1 week, 1 month, 9 month)
#- Class: B or M
#- Traveler type: 3 ADT 1CHD
#2. Quote:
#- Confirm sequence and segments for pricing
#
#- Pricing option: AS BOOKED
#- Discount: NO
#- Verify that the administrative fee is according with the point of sale
#3. Enter traveler details:
#- ConnectMiles: NO
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#4. PAY ISSUE: Sign in with sales agent user in CTO Mini - Cuba, select the currency CUP and retrieve the reservation:
#- Form of payment: EMD RESIDUAL
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#5. REISSUE: Sign in with sales agent user in CTO Mini - Cuba, select the currency CUP and retrieve the reservation.
#- Search the availability of new flights for the Reissue.
#- Type of change: If the original date is soon change to a distant date. Otherwise, do the opposite.
#- Book new segments or flights
#6. Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BOOKED
#- Discount: NO
#- Penalty Waiver Code: NO
#- Save and add quote to order
#
#7. PAY REISSUE:
#- Form of payment: VISA
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#8.Add SSR: (Couldnt be validated)
#-PETC in all segments
#9.PAY WITH CASH
#
#Expected:
#1.All Test steps should be completed without any issues
#2.GUI/Reports/Backend validations should be completed successfully
#


@Reissue
Feature: 624590 - 145392-ISSUE/REISSUE-Create reservation for 1CHD in CTO Mini-Cuba Issue in CTO Mini-Cuba, pay with EMD RESIDUAL and
                  perform voluntary Reissue in CTO Mini-Cuba, pay reissue with VISA

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624590 - 145392-ISSUE/REISSUE-Create reservation for 1CHD in CTO Mini-Cuba Issue in CTO Mini-Cuba, pay with EMD RESIDUAL and
                              perform voluntary Reissue in CTO Mini-Cuba, pay reissue with VISA

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
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass1>" for the first connecting segment flight
    And I select class "<ReturnClass1>" for the second connecting segment flights
    And I select pricing option Price as Booked
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
    And I click the Tickets tab
    And I check the EMDs in EMD tab

    #2nd PNR
    And I navigate to home screen
    And I create the passengers data
    And I add "<Adult1>" adult passengers
    And I add "<Child1>" child passengers
    And I add "<INS1>" infant with seat passengers
    And I add "<INF1>" infant without seat passengers
    And I want to display all the passengers
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<firstSegmentClass>" for the first segment and "<secondSegmentClass>" for the second segment in first connecting segment flight
    And I select class "<firstSegmentClass>" for the first segment and "<secondSegmentClass>" for the second segment in second connecting segment flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I make the second payment by selecting the payment type as "<PaymentType3>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I select ADC bypass and give the bypass reason "<reason>"
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I select the passengers in checkin page using "<searchType>"
    And I click on the Boarding pass icon to print the Boarding pass
    And I navigate to home screen
    And I click the order tab
    And I change the date of travel for the first connecting segment "<NewDate1>"
    And I change the date of travel for the second connecting segment "<NewDate2>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes

    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page after Reissue using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to check-in button after reissue
    And I click on check-in for the passenger after reissue
    Then I validate the confirmation dialog that passenger is Checked-in
    And I select the passengers in checkin page using "<searchType>"
    And I click on the Boarding pass icon to print the Boarding pass

    And I navigate to home screen
    And I click the order tab
    And I add SSR "<SSRType>" through Services tab with "<SSRDescription>"
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType2>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|searchType|OriginCity   |Destination |firstSegmentClass|secondSegmentClass|SSRType|StartDate|ReturnDate|NewDate1|NewDate2|Adult|Child|INS|INF|Adult1|Child1|INS1|INF1|printer       |printerStatus|reason            |segmentIndex|originClass1|ReturnClass1|PaymentType|PaymentType1|ticketStatus |PricingOption  |PaymentType2|SSRDescription    |PaymentType3  |
      |HAV CTO    |CUP     |PNR       |HAV          |GRU         |M                |M                 |PETC   |01 days  |02 days   |02 days |03 days |1    |0    |0  |0  |3     |1     |0   |0   |IN-5CD4316MPJ |PrintReady   |DOUBLE NATIONALITY|0           |Business    |Business    |VISA       |EMD         |EXCHANGED    |Price as Booked| CASH       |PET IN CABIN - 0BT|CASH_AFTER_EMD|


