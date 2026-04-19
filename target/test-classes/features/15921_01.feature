#Description:
#Verify the PDF document attached on the E-tkt refund receipt.
#
#Pre conditions:
#• POS SET: PTY CTO COSTA DEL ESTE
#• Any Route.
#Steps:
#1. Book a flight 1 ADT.
#2. Proceed to ticketing, using CASH as a Form of Payment.
#3. Refund the E-tkt as “Voluntary Refund”.
#4. Once at the “Refund” screen, select “CreditCard” from the “Select Override” dropdown.
#5. Add a valid email address, in order to check the E-tkt refund receipt.
#6. Continue with the refund flow and add any credit card number as a refund payment.
#7. Check the “Form of Payment” at the PDF document attached on the E-tkt refund receipt
#
#Expected result:
#The PDF document on the E-tkt refund receipt e-mail, should display the “Masked Card Number” on the “Form of Payment” field at the “ETKT REFUND DETAILS” section. e.g., “xxxxxxxxxxxx1111”.

@VIR
Feature: 15921_01 - Verify the PDF document attached on the E-tkt refund receipt.

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 15921_01 - Verify the PDF document attached on the E-tkt refund receipt.
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
#    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination1>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I perform voluntary refund using CreditCard override option
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details

    Examples:
      | salesOffice1            | currency1 | OriginCity | Destination1 | StartDate | Adult | Child | INF | INS | originClass | PaymentType | ActionType    | SegmentIndex | PNRText | transferType | Reason | buttonName | SegmentIndex1 | ticketStatus | ticketStatus1 | searchType | printer     | printerStatus |CountryOfResidence|
      | PTY CTO COSTA DEL ESTE  | USD       | PTY        | MIA          | 03 days   | 1     | 0     | 0   | 0   | Economy     | Cash        | Mass Transfer | 0            | PNR     | Current      | STRIKE | accept     | 0             | ADJUSTED     | CHECKED-IN    | Name       | IN-PF2ST1T4 | PrintReady    |IN                |