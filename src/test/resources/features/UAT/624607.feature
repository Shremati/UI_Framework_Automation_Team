@UAT
Feature: 624607 - Involuntary Reissue Economy Classic Flex to Economy Classic

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624607 - Involuntary Reissue Economy Classic Flex to Economy Classic

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I add segment from and to City "<Destination>" and "<OriginCity1>"
    And I add third segment from and to City "<OriginCity1>" and "<Destination1>"
    And I add fourth segment from and to City "<Destination1>" and "<OriginCity>"
    And I enter Start Date "<StartDate>" for one way booking
    And I enter Start Date "<StartDate1>" for 2nd Segment
    And I enter Start Date "<StartDate2>" for 3rd Segment
    And I enter Start Date "<StartDate3>" for 4th Segment
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<ReturnClass>" for Return flight
    And I select pricing option as Economy Classic Flex
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the FOID details of the passengers
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I check the ticket in the Tickets tab
    And I check the EMDs in EMD tab
    And I click on Order Tab to view the Itinerary Details
    And I rebook All the Segments on New Date
    And I Delete All the Old Segments
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I perform Reissue For All Segments Booked on New Date
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I check the ticket in the Tickets tab
    And I check the EMDs in EMD tab
    And I logout from COPA GUI application


    Examples:
      |salesOffice |currency |salesOffice1 |currency1 |OriginCity   |Destination |StartDate |OriginCity1 |Destination1 |StartDate1|StartDate2|StartDate3|Adult|Child|INF|INS|originClass |ReturnClass|PaymentType|
      |UIO ATO     |USD      |CUN CTO      |MXN       |UIO          |PTY         |07 days   |CUN         |PTY          |09 days   |11 days   |12 days   |2    |1    |0  |0  |Economy     |Economy    |Cash       |
