#Description:
#Create a booking PTYAUA RT
#Dates of the reservation must be before 31DEC24
#Fare: TAA4TY2S
#Change the flight dates after 31DEC24
#Make a Voluntary Reissue

@Reissue
Feature: 624646 - Verify Voluntary Reissue with Travel Restrictions is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624646 - Verify Voluntary Reissue with Travel Restrictions is happening correctly

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
    And I change the date of travel for the first segment "<NewDate>"
    And I change date of travel for second segment "<NewDate1>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application



    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | StartDate1 | PaymentType | Adult | Child | INF | INS | TicketStatus1 | PricingOption   | originClass | NewDate  | NewDate1 |
      | PTY ATO     | USD      | PTY        | AUA         | 10 days   | 17 days    | CASH        | 1     | 0     | 0   | 0   | EXCHANGED     | Price as Booked | Economy     | 300 days | 07 days  |


