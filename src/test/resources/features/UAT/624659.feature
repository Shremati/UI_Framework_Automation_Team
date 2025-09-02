#Description:
#1. ETKT is issued in POS Call Center Global
#2. ETKT is reissued in POS CCS CTO
#3. Result should be a Manual Reissue as tickets cannot be issued in Venezuela
#
@UAT
Feature: 624659 - Voluntary Reissue with Sales Restriction

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624659 - Voluntary Reissue with Sales Restriction

    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    #And I select the printer "<printer>" and "<printerStatus>"
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
    And I click the Tickets tab
    And I check the EMDs in EMD tab
    And I navigate to Order tab
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency>"
    And I perform Voluntary Reissue to validate Manual Reissue required error message
    And I logout from COPA GUI application


    Examples:
      |salesOffice                           |salesOffice1            |currency|OriginCity   |Destination |Destination1 |StartDate |StartDate1 |compensationReason|Adult|PassengerType     |Amount |printer      |printerStatus|flightIndex|PaymentType     |serviceType|originClass|PricingOption|
      |CALL CENTER GLOBAL USD                |CCS CTO                 |USD     |PTY          |LAX         |MIA          |01 days   |03 days    |Baggage Damage    |1    |All Passenger List|150    |IN-5CD4316MPJ|PrintReady   |0          |MISC_SST        |COPA CLUB  |Economy    |Price as Booked         |
