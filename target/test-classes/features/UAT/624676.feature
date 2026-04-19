#Description:
#Sign in with sales agent user in CALL CENTER BRASIL, select the currency BRL
#search availability for booking:
#- Route: GIG to YYZ- Trip: Round trip- Dates: leaving any day (today, tomorrow, within 3 days, 1 week) (any dates)
#- Class: H (Economy Classic)
#- Traveler type: 1ADT + 1CHD + 1INF
#
#Quote:- Confirm sequence and segments for pricing- Pricing option: AS BOOKED (Economy Classic)
#Enter traveler details
#PAY ISSUE:- Form of payment: DINERS
#REISSUE. Change POS to CALL CENTER CANADA , select the currenc CAD
#search the availability of new flights for the Reissue:- Type of change: Change dates to leave 2 months later and select the most economical classes W, L, T, A (economica basic)
#
#Quote the Voluntary Reissue:- Confirm sequence and segments for pricing- Pricing option: AS BEST BUY (Economy Basic)(result must be a REFUND)
#- Save and add quote to order
#PAY REISSUE:- Form of payment: as Residual Value
#Validate that the reissue ticket has zero (0.00) value Total Amount with the Original Currency (BRL) - A residual EMD per passenger was generated
#
#Sales Report:- Verify that the tickets and RESIDUAL EMD created in the transaction are displayed correctly in SALES REPORT
#Use the Residual EMD generated as form of payment for PETC service.

#

@Reissue
Feature: 624676 - ISSUE/REISSUE - Create reservation for 1ADT + 1CHD + 1INF in CALL CENTER BRASIL (BRL), pay with DINERS, perform voluntary Reissue in CALL CENTER CANADA (CAD) and pay as Residual Value.

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624676 - ISSUE/REISSUE - Create reservation for 1ADT + 1CHD + 1INF in CALL CENTER BRASIL (BRL), pay with DINERS, perform voluntary Reissue in CALL CENTER CANADA (CAD) and pay as Residual Value.

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select infant without seat passengers
    And I select child passengers
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


    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers

    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate>" and Return Date "<returnDate>" for two way booking
    And I select infant without seat passengers
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the FOID details of the passengers
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I navigate to Order tab
    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency2>"
    And I navigate to home screen
    And I click the order tab
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" and Return Date "<returnDate1>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select Book from Actions Dropdown
    And I select and delete the segment "<segNo>"
    And I select and delete the segment "<segNo>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
#    And I click on Ticket tab and check the "<ticketStatus>" status
#    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the Tax Details in Agent Sales Report after changes
    And I logout from COPA GUI application



    Examples:
      |salesOffice1                    |currency1 |salesOffice   |currency|salesOffice2 |currency2|OriginCity1  |Destination1  |OriginCity|Destination|StartDate|returnDate|PaymentType1|StartDate1|returnDate1|Adult|Child|INF|INS|PaymentType|originClass      |PricingOption  |ticketStatus|ticketStatus1|PricingOption1   |PaymentType2|segNo|
      |GRU - CALL CENTER WEB CTO       |BRL       |PTY ATO       |USD     |YUL ATO      |CAD      |GIG           |YYZ          |PTY       |BOG        |02 Days  |06 Days   |EMD         |50 Days   |54 Days    |1    |1    |1  |0  |DINERS     |Economy          |Price as Booked|Open        |EXCHANGED    |Price as Best Buy|Cash        |1    |



