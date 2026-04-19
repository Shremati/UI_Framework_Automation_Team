#Description:
#Issue an ETKT in PYG currency - POS ASU CTO - Any flights, dates and fare family. 3ADT
#Change to POS MEX CALL CENTER
#Change the itinerary to a new date, same O&D
#Voluntary Reissue priced as Economy Classic

@Reissue
Feature: 624639 - Verify Voluntary Reissue - Original ticket in PYG currency (Paraguay currency) is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624639 - Verify Voluntary Reissue - Original ticket in PYG currency (Paraguay currency) is happening correctly

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
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
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
    And I navigate to home screen
    And I click the order tab
    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I navigate to home screen
    And I click the order tab
    And I change the date of travel for the first connecting segment "<NewDate>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:

      | salesOffice | salesOffice1       | currency | currency1 | OriginCity | Destination | StartDate |  NewDate | PaymentType | PaymentType1 | Adult | Child | INF | INS | TicketStatus1 | PricingOption   | PricingOption1  | originClass |
      | ASU CTO     | CALL CENTER MEXICO | PYG      | MXN       | ASU        | MIA         | 10 days   |  20 days | CASH        | VISA         | 3     | 0     | 0   | 0   | EXCHANGED     | Price as Booked | Economy Classic | Economy     |

