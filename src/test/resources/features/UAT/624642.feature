#Description:
#POS Call Center Global
#Create an ETKT CCS-CUN RT, any date, priced as Economy Basic. 2ADT
#Change the date, same route
#Voluntary Reissue priced as Economy Classic
#  Expected:
#All the taxes and the YN tax has to apply to the penalty

@UAT
Feature: 624642 - Verify Voluntary Reissue - Original ticket issued in USD is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624642 - Verify Voluntary Reissue - Original ticket issued in USD is happening correctly

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
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select pricing option as "<PricingOption>"
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
    And I change the date of travel for the first connecting segment "<NewDate>"
    And I change date of travel for second connecting segment "<NewDate1>" after the first connecting segment booked
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the Tickets tab and try to verify the tax details after reissue
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the Tax Details in Agent Sales Report after changes
    And I logout from COPA GUI application



    Examples:

      | salesOffice            | currency | OriginCity | Destination | StartDate | StartDate1 | PaymentType | Adult | Child | INF | INS | TicketStatus1 | PricingOption | PricingOption1  | originClass | NewDate | NewDate1 |
      | CALL CENTER GLOBAL USD | USD      | CCS        | CUN         | 10 days   | 17 days    | MISC_SST    | 2     | 0     | 0   | 0   | EXCHANGED     | Economy Basic | Economy Classic | Economy     | 27 days | 04 days  |
