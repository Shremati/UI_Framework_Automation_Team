#Description:
#Create a ticketed PNR with the following conditions:
#2ADT - OD: ROS-GYE - 10OCT to 17OCT - Class L (In the availability, class F must also be available).
#Fare basis LLAAGZ1N
#Change the dates to 11-Nov and 18-Nov
#Complete the Voluntary Reissue

@UAT
Feature: 624647 - Verify Voluntary Reissue - Dual RBD is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624647 - Verify Voluntary Reissue - Dual RBD is happening correctly

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
    And I click the EMD subtab present in Tickets tab
    And I navigate to Order tab
    And I change the date of travel for the first connecting segment "<NewDate>"
    And I perform Voluntary Reissue
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I navigate to Order tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | PricingOption   | NewDate | PaymentType | Adult | Child | INF | INS | originClass | TicketStatus2 |
      | PTY ATO     | USD      | ROS        | GYE         | 30 days   | Economy Classic | 60 days | CASH        | 2     | 0     | 0   | 0   | Economy     | EXCHANGED     |
