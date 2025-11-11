#Description:
#1.Sign in with sales agent user in COLOMBIA CALL CENTER, select the currency COP and search availability for booking:
#- Route: BOG to Caribbean
#- Trip: ROUND TRIP
#- Dates: select any dates
#- Class: ECONOMY BASIC
#- Traveler type: 4 ADT
#2.Quote:
#- Confirm sequence and segments for pricing
#- Pricing option: ECONOMY BASIC
#- Discount: CORPORATE CODE
#- Verify that the administrative fee is according with the point of sale
#3.Enter traveler details:
#- ConnectMiles: NO
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#4.PAY ISSUE: Sign in with sales agent user in COLOMBIA CTO BOG, select the currency COP and retrieve the reservation:
#- Form of payment: CASH + CHECK + AMEX
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#5.REISSUE: Sign in with sales agent user in COLOMBIA ATO BOG, select the currency COP and retrieve the reservation.
#- Search the availability of new flights for the Reissue.
#- Type of change: If the original date is soon change to a distant date.
#- Book new segments or flights
#6.Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: ECONOMY FULL
#- Discount: CORPORATE CODE
#- Penalty Waiver Code: NO
#- Save and add quote to order
#7.PAY REISSUE:
#- Form of payment: EMD RESIDUAL + EMD COMPENSATION
#- Enter details of the passenger identification (FOID details)
#- Send Eticket Receipt to all emails
#- Print all Boarding Pass with EMD's
#- Verify that the tickets and EMD created in the transaction are displayed correctly in SALES REPORT
#8.Add seats
#9.Add SSR:
#- Bicycle for 2 ADT
#10.Pay SSR:
#- CASH

@Reissue
Feature: 624589 - ISSUE/REISSUE-Create reservation for 4 ADT in COLOMBIA CALL CENTER (COP), Issue in COLOMBIA CTO BOG (COP), pay with CASH + CHECK + AMEX and perform voluntary Reissue in COLOMBIA ATO BOG (COP), pay reissue with EMD RESIDUAL + EMD COMPENSATION

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624589 - ISSUE/REISSUE-Create reservation for 4 ADT in COLOMBIA CALL CENTER (COP), Issue in COLOMBIA CTO BOG (COP), pay with CASH + CHECK + AMEX and perform voluntary Reissue in COLOMBIA ATO BOG (COP), pay reissue with EMD RESIDUAL + EMD COMPENSATION

    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult1>" adult passengers
    And I add "<Child1>" child passengers
    And I add "<INS1>" infant with seat passengers
    And I add "<INF1>" infant without seat passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Origin1>"
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
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I want to pay using residual emd
    And I perform voluntary manual refund
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I check the EMDs in EMD tab


    #to get the compensation EMD
    And I navigate to home screen
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Origin1>"
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
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I search the Order number in Travel compensation model
    And I select the Order number and click on continue button in compensation model
    And I issue the compensation for selected passengers with amount "<Amount>" and "<compensationReason>"
    And I select passengers and view compensation details
    And I navigate to home screen

    #2nd PNR
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
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<ReturnClass>" for the second connecting segment flights
    And I select pricing option as "<PricingOption1>"
    And I enter Account code as "<AccountCode>"
    And I add advanced option "<optionType>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
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
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report

    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency>"
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<NewDate1>" and Return Date "<ReturnDate1>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<ReturnClass>" for the second connecting segment flights
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>" with an advanced option type  "<optionType>"
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType3>"
    And I make the second payment by selecting the payment type as "<PaymentType4>"
    And I make the last payment if required by selecting the payment type as "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful

    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes

    And I navigate to home screen
    And I search for the PNR created in Reservation Section
    And I click on Seat Icon from Services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab

    And I navigate to home screen
    And I click the order tab
    And I add SSR "<SSRType>" through Services Tab for the passenger "<PaxIndex>"
    And I add SSR "<SSRType>" through Services Tab for the passenger "<PaxIndex1>"
    And I click on checkout and pay button by selecting the required payment type "<PaymentType>"
    And I enter the FOID details if required with document type as "<DocumentType>"
    And I enter the details in the email recipients page if required and validate payment
    And I validate if the payment is successful
    And I logout from COPA GUI application


    Examples:
      |salesOffice         |salesOffice1          |salesOffice2|currency|OriginCity   |Destination |OriginCity1|Destination1|Origin1|StartDate|ReturnDate|NewDate1|ReturnDate1|Adult|Child|INS|INF|Adult1|Child1|INS1|INF1|printer      |printerStatus|originClass|ReturnClass|PaymentType|PaymentType1|PaymentType2|PricingOption1|PaymentType3|PaymentType4    |ticketStatus|PricingOption    |compensationReason|Amount|AccountCode|optionType                     |SegmentDelete|PaxIndex|SSRType|PaxIndex1|Amount|DocumentType|
      |CALL CENTER COLOMBIA|BOG City Ticket Office|BOG ATO     |COP     |BOG          |SJU         |BOG        |MEX         |PTY    |09 days  |15 days   |19 days |27 days    |4    |0    |0  |0  |1     |0     |0   |0   |US-5CD4377SFF|PrintReady   |Economy    |Economy    |CASH       |MISC_CHECK   |AMEX        |Economy Basic |RESIDUAL_EMD|COMPENSATION_EMD|EXCHANGED   |Economy Full     |Baggage Delay     |400   |AIN332     |Discount_BeforeTax_CORPC_Amount|1            |1       |BIKE   |2        |NA    |Passport   |


