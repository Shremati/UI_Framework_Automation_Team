#Description:
#Create PNR in Business Promo , departure 10 August
#POS: BOG-ATO / COP
#ROUTE: BOGASU RT / 2 ADT
#FAREBASIS: BAAAOZ2Q
#Make a purchase with CC Visa
#Then make a involuntary reissue (only change days not fare)
#assign seating for all passengers
#
#  Expected:
#Must be show Manual Reissue

@UAT
Feature: 624596 - Verify Involuntary Reissue of a Dual RBD booking is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624596 - Verify Involuntary Reissue of a Dual RBD booking is happening correctly

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
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I navigate to Order tab
    And I change the date of travel for the second connecting segment "<NewDate>"
    And I perform the Involuntary Reissue
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab
    And I navigate to Order tab
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | PricingOption | PaymentType | Adult | Child | INF | INS | originClass | NewDate | StartDate1 |  TicketStatus |
      | BOG ATO     | COP      | BOG        | ASU         | 30 days   | Business Full | VISA        | 2     | 0     | 0   | 0   | Business    | 40 days | 36 days    |  EXCHD IRR    |
