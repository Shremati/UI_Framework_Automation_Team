#Description:
#  POS : CDE-PTY CTO-USD
#  Book and itinerary for round trip travel from PTY to MIA where the stay is Miami for 1 week in Y Class
#  Select the pricing option as Booked
#  Add the account code as AIN2910
#  Select the check box for private fares only
#  Verify the pricing response returns the expected amount code fare
#  Issue the ticket with Credit Card or Cash as FOP
#  Make a voluntary reissue by adding the account code AIN2910
#  Expected:
#  TRR must auto populatethe account code during reissue code

@Reissue
Feature: 624625 - Verify TRR must auto populate the account code during reissue code

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624625 - Verify TRR must auto populate the account code during reissue code

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
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<StartDate1>" for two way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option Price as Booked
    And I enter Account code as "<AccountCode>"
    And I select Private Fares Only checkbox
    And I select the Quote Options and click on Next
    And I validate the Price Quote and verify Account code "<AccountCode>" is displaying or not and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I navigate to Order tab
    And I perform Voluntary Reissue by adding Account code as "<AccountCode>"
    And I try to click and store the Quote ID from Voluntary Reissue options page
    And I try to click the "<Reissue>" link from Order Page under Remarks sub tab to verify "<AccountCode>"
    And I try to close the popup
    And I logout from COPA GUI application


    Examples:

      | salesOffice            | currency | OriginCity | Destination | AccountCode | StartDate | StartDate1 | PaymentType | Adult | Child | INF | INS | originClass | Reissue     |
      | PTY CTO COSTA DEL ESTE | USD      | PTY        | MIA         | AIN2910     | 06 days   | 13 days    | Cash        | 1     | 0     | 0   | 0   | Economy     | VOL REISSUE |