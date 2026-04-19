#Description:
#Create a Ticketed PNR with the following conditions:
#PTYORD - RT - 2ADT - Any dates - Class L
#Use Passenger Reduction Type CMA and CMP
#Use Account Code BGF2X1
#Change the dates and reissue the tickets using the same PTC and AC


@Reissue
Feature: 624670 - Verify Voluntary Reissue - Promo BGF2X is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624670 - Verify Voluntary Reissue - Promo BGF2X is happening correctly

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
    And I select specific class "<Class1>" for Origin flight in Economy Class
    And I select specific class "<Class1>" for Return flight
    And I select pricing option as "<PricingOption>"
    And I add the details in the Passenger Reduction Type as "<Type1>" "<Type2>" and account code as "<AccountCode>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I navigate to Order tab
    And I change the date of travel for the first segment "<StartDate2>"
    And I change the date of travel for the second segment "<StartDate3>"
    And I perform Voluntary Reissue with Pricing option as "<PricingOption1>" with an advanced option type "<AccountCode>" and Passenger Reduction Type as "<Type1>" "<Type2>" and panelty amount as "<PenaltyAmount>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application




    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | StartDate1 | StartDate2 | StartDate3 | PricingOption | PricingOption1  | PaymentType | Adult | Child | INF | INS | Class1 | Type1 | Type2 | AccountCode | TicketStatus1 | PenaltyAmount |
      | PTY ATO     | USD      | PTY        | ORD         | 07 days   | 14 days    | 30 days    | 38 days    | Economy Basic | Economy Classic | CASH        | 2     | 0     | 0   | 0   | L      | CMA   | CMP   | BGF2X1      | EXCHANGED     | 100           |
