#Description:
#Open Gate module
#Release All Held Seat
#
#Expected:
#
#Actual:

@UAT
Feature: 236687 - Release All Held Seat

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236687 - Release All Held Seat

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
    And I select child passengers
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I click the order tab
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
#    And I choose one mode of payment
#    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I check the ticket in the Tickets tab
    And I check the EMDs in EMD tab
    And I click the services Tab to validate the seats and store the seat numbers
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I select held seats to display the passenger list in Gate section
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I click on release and offload button release the "<passengerListType>" passengers
    And I validate if the held seats are released
    And I navigate to home screen
    And I click the order tab
    And I click the Tickets tab
    And I click the services Tab
    And I open the seat map to check if the held seats are released
    And I navigate to home screen
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency |OriginCity   |Destination |StartDate |Adult|Child|INF|INS|originClass|SegmentIndex|passengerListType|PaymentType|PNRText|
      |PTY ATO    |USD      |PTY          |MEX         |01 days   |2    |0    |0  |0  |Economy    |0           |Held Seat Pax    |CASH       |PNR    |
