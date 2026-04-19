#Description:
#Generate an EMD for LUGGAGE DAMAGE
#Create a new booking in POS Costa Del Este CTO
#Pay the booking with any FOP
#Add COPA CLUB SSR
#Check-out the SSR with the generated EMD

@UAT
Feature: 629199 - Pay an service with an EMD for LUGGAGE DAMAGE

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629199 - Pay an service with an EMD for LUGGAGE DAMAGE

    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I search the Order number in Travel compensation model
    And I select the Order number and click on continue button in compensation model
    And I issue the compensation for selected passengers with amount "<Amount>" and "<compensationReason>"
    And I select passengers and view compensation details

    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate1>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
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
    And I add a service "<serviceType>" in cabin
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice            |salesOffice1              |currency|OriginCity   |Destination |StartDate |StartDate1 |compensationReason|Adult|Amount |printer      |printerStatus|PaymentType|serviceType|originClass|PaymentType1      |
      |PTY ATO                |PTY CTO COSTA DEL ESTE    |USD     |PTY          |MEX         |01 days   |03 days    |Baggage Damage    |1    |150    |IN-5CD4316MPJ|PrintReady   |CASH       |COPA CLUB  |Economy    |EMD               |
