#Description:
#Title : Voluntary Refund-Issue reservation for 1 ADT + 1 CHD in CTO ASUNCION PARAGUAY (USD), enroll ConnectMiles, pay with CASH + VISA, perform voluntary reissue (change class), pay reissue with AMEX and process voluntary refund.
#
#Step 0: 1. Sign in with sales agent CTO ASUNCION PARAGUAY and create new Booking:
#- Select currency USD
#- Route: ASU - MIA Round Trip.
#- Economic Cabin.
#- Passangers: 1 Adult, 1 Chd 10 years.
#- Quote: price as best buy both passenger.
#- Fill all travelers Informations
#(Secure Flight)
#- Enroll all passenger.
#- Send passenger reservation confirmation.
#- Issue PNR FOP: CASH + CreditCard (Visa)
#
#
#- Print passenger receipt and Send Eticket Receipt.
#- Voluntary class change.
#2. Change all segment from economy to bussines class "C" same dates.
#- Quote Voluntary change and reissue.
#- Reissue reservation: FOP Use credit card AMEX
#- Print passenger receipt and Send Eticket Receipt.
#3. Voluntary refund over an voluntary change
#- verify the refund amount is matching with the original FOP of the ticket. FOP: CASH + CreditCard (Visa)
#4. - Send Eticket Receipt to all emails
#- Print all Eticket with EMD's

@Reissue
Feature: 624586 - Voluntary Refund-Issue reservation for 1 ADT + 1 CHD in CTO ASUNCION PARAGUAY (USD), enroll ConnectMiles, pay with CASH + VISA, perform voluntary reissue (change class), pay reissue with AMEX and process voluntary refund.

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624586 - Voluntary Refund-Issue reservation for 1 ADT + 1 CHD in CTO ASUNCION PARAGUAY (USD), enroll ConnectMiles, pay with CASH + VISA, perform voluntary reissue (change class), pay reissue with AMEX and process voluntary refund.


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
    And I select the printer "<Printer>" and "<PrinterStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<returnDate>" for two way booking
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
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I navigate to home screen
    And I click the order tab
    And I change the class of seat "<cos>" for required connecting segment "<SegNo>"
    And I change the class of seat "<cos>" for required connecting segment "<SegNo1>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType2>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report

    And I validate the Tax Details in Agent Sales Report after changes
    And I navigate to home screen
    And I click the order tab
    And I perform voluntary refund
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus3>" status in ticket tab
    And I click and view the Tickets tab after refund
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the Tax Details in Agent Sales Report after changes
    And I validate the Refunded ticket in Agent Sales Report
    And I logout from COPA GUI application

    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | returnDate | Adult | Child | INF | INS | PaymentType | originClass | PaymentType1 | PricingOption     | PricingOption1 | PaymentType2 | Printer  | PrinterStatus | SegNo | SegNo1 | cos | TicketStatus2 | TicketStatus3 |
      | ASU CTO     | USD      | ASU        | MIA         | 25 Days   | 40 Days    | 1     | 1     | 0   | 0   | CASH        | Economy     | VISA         | Price as Best Buy | Business Full  | AMEX         | MAHAC-NB | PrintReady    | 1     | 2      | C   | EXCHANGED     | REFUNDED      |
