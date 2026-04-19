#Description:
#Create a ticketed PNR with the following conditions:
#1 ADT - LAS-CLO RT - 01-Oct to 07-Oct - Class H (make sure that in the availability, class F is also available).
#Fare basis HLAAGZ1N
#Change the dates
#Voluntary Reissue priced as Economy Classic


@Reissue
Feature: 624649 - Verify Voluntary Reissue - Dual RBD is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624649 - Verify Voluntary Reissue - Dual RBD is happening correctly

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
    And I select specific class "<Class1>" for the first connecting segment flight and check the seats are available in "<Class2>" aswell
    And I select specific class "<Class1>" for the second connecting segment flight and check the seats are available in "<Class2>" aswell
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
    And I navigate to Order tab
    And I change the date of travel for the first connecting segment "<NewDate1>"
    And I change date of travel for second connecting segment "<NewDate2>" after the first connecting segment booked
    And I perform Voluntary Reissue with Pricing Option as "<PricinOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I logout from COPA GUI application



    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | StartDate1 | NewDate1 | NewDate2 | PaymentType | Adult | Child | INF | INS | TicketStatus2 | Class1 | Class2 | PricingOption   | PricinOption1   |
      | PTY ATO     | USD      | LAS        | CLO         | 60 days   | 65 days    | 85 days  | 03 days  | CASH        | 1     | 0     | 0   | 0   | EXCHANGED     | H      | F      | Price as Booked | Economy Classic |

