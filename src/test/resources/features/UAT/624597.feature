#Description: Create a Reservation in Economy Bassic, departure in one month
#ROUTE: SJO-EZE MDZ-SJO / 1 ADT 2 CHD
#Make a reservation
#POS: SJO CTO TORRE MERCEDES / USD
#Make a payment with CC AMEX
#Generate a involuntary change in the dates, to leave within a month later
#process check out
#Assign seating for all passengers
#The system should process the change correctly
@UAT
Feature: 624597 - Involuntary Reissue with open jaw ticket

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624597 - Involuntary Reissue with open jaw ticket

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I add segment from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" for 2nd Segment
    And I add third segment from and to City "<OriginCity2>" and "<Destination2>"
    And I enter Start Date "<StartDate2>" for 3rd Segment
    And I add fourth segment from and to City "<OriginCity3>" and "<Destination3>"
    And I enter Start Date "<StartDate3>" for 4th Segment
    And I select infant without seat passengers
    And I select infant with Seat passengers
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<ReturnClass>" for Return flight
    And I select pricing option as best buy
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I navigate to Order tab
    And I change the date of travel for the first segment "<NewDate1>"
    And I change date of travel for second segment "<NewDate2>"
    And I change date of travel for third segment "<NewDate3>"
    And I change date of travel for fourth segment "<NewDate4>"
    And I perform the Involuntary Reissue
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details


#    And I click the Tickets tab
    And I navigate to home screen
    And I search for the PNR created in Reservation Section
    And I click on Seat Icon from Services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats
    And I logout from COPA GUI application

    Examples:
      |salesOffice               |currency|OriginCity  |Destination  |OriginCity1|Destination1|OriginCity2|Destination2|OriginCity3|Destination3|StartDate|StartDate1|StartDate2|StartDate3|Adult|Child|INF|INS|PaymentType|PaymentType1|originClass|ReturnClass|NewDate1|NewDate2|NewDate3|NewDate4|TicketStatus1|
      |SJO CTO TORRE MERCEDES    |USD     |SJO         |PTY          |PTY        |EZE         |MDZ        |PTY         |PTY        |SJO         |20 Days  |21 Days   |24 Days   |25 days   |1    |2    |0  |0  |AMEX       |CASH        |Economy    |Economy    |52 days |01 days |02 days |01 days |EXCHD IRR    |
