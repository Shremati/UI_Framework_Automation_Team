#Description:
#New order in Call Center Global XRS USD and reissue ticket
# Create a new order with basic fare family for two adults and reissue ticket with same route but different dates
#1.1 Route: GYEMIA RT Select 2 ADT
#1.2 Select any booking class but the fare should be basic economy
#2. Quote and create the order
#3. Issue ticket with VISA CC
#4. Reissue ticket with new travel date for all the order
#5. Issue new ticket


@UAT
Feature: 624592 - New order in Call Center Global XRS USD and reissue ticket

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624592 - New order in Call Center Global XRS USD and reissue ticket

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
    And I change the date of travel for the first connecting segment "<NewDate>"
    And I change date of travel for second connecting segment "<NewDate1>" after the first connecting segment booked
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on CheckOut button and Reissue for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click on Ticket tab and check the "<ticketStatus>" status
    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I logout from COPA GUI application


    Examples:

      | salesOffice                | currency | OriginCity | Destination | StartDate | PricingOption  | PaymentType | Adult | Child | INF | INS | originClass | NewDate | NewDate1            | StartDate1 | ticketStatus | ticketStatus1 | PaymentType1      |SegmentNum|
      | GYE ATO                    | USD      | GYE        | MIA         | 02 days   | Economy Basic  | VISA        | 2     | 0     | 0   | 0   | Economy     | 06 days | 09 days             | 05 days    | Open         | EXCHANGED     | Cash              |    34      |
