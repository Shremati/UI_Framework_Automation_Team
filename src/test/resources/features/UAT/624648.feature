#Description:
#Create a ticketed PNR with the following conditions:
#1 ADT - PTY-MEX RT - 01Oct to 07Oct - Class R (make sure that in the flight availability class O is also available).
#Fare OAA4MY2Q
#Change the dates to 22Oct and 29Oct
#Select class J
#Voluntary Reissue priced as Business Full

@Reissue
Feature: 624648 - Verify Voluntary Reissue - Dual RBD is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624648 - Verify Voluntary Reissue - Dual RBD is happening correctly

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
    And I select specific class "<Class1>" for Origin flight and check the seats are available in "<Class2>" aswell
    And I select specific class "<Class1>" for Return flight and check the seats are available in "<Class2>" aswell
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
    And I change the date of travel for the first segment "<NewDate1>"
    And I change date of travel for second segment "<NewDate2>"
    And I change the class of seat "<class>" for the required segment "<Segment>"
    And I change the class of seat "<class>" for the required segment "<Segment1>"
    And I perform Voluntary Reissue with Pricing Option as "<PricinOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I logout from COPA GUI application



    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | StartDate1 | NewDate1 | NewDate2 | PaymentType | Adult | Child | INF | INS | TicketStatus2 | Class1 | Class2 | PricingOption  | class | Segment | Segment1 | PricinOption1 |
      | PTY ATO     | USD      | PTY        | MEX         | 60 days   | 65 days    | 80 days  | 03 days  | CASH        | 1     | 0     | 0   | 0   | EXCHANGED     | O      | R      | Business Promo | J     | 1       | 2        | Business Full |

