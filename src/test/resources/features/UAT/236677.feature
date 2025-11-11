#Description:
#Open Gate module
#Display list-  Thru Pax
#
#Expected:
#
#Actual:

@UAT
Feature: 236677 - Display list- Thru Pax

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236677 - Display list- Thru Pax

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
    And I select class "<originClass>" for the first thru flight
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
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section with thru flight as origin
    And I select "<passengerListType>" from the passenger list options
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency |OriginCity   |Destination |StartDate |Adult|Child|INF|INS|SegmentIndex|SegmentIndex|PaymentType|passengerListType|originClass|PNRText|
      |PTY ATO    |USD      |GUA          |PTY         |01 days   |1    |0    |0  |0  |0           |1           |Cash       |Thru Pax         |Economy    |PNR    |
