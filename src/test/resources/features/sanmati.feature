@VIR
Feature: 236690 - Display List-Stand By for all revenue, non revenue positive space, stand by for flight.

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236690 - Display List-Stand By for all revenue, non revenue positive space, stand by for flight.

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the payment using Dinners Club with instalment option as "<count>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I click the services Tab
    And I assign seats to the passengers in Services tab
    And I click the services Tab to validate the seats and store the seat numbers
    And I send email in tickets tab
#    And I Send Email Ticket receipt email for the passengers
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice           |currency |OriginCity   |Destination |originClass  | StartDate |Adult|PaymentType| count |
      |CALL CENTER BRAZIL    |BRL      |PTY          |MDE         |ECONOMY      | 01 days   |1    |DINERS     | 4     |
