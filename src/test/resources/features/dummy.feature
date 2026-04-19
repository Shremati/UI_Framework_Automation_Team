#Description:

#Display List-Stand By for all revenue, non revenue positive space, stand by for flight.
#
#Expected:
#
#Actual:

@VIR
Feature: 236690 - Display List-Stand By for all revenue, non revenue positive space, stand by for flight.

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236690 - Display List-Stand By for all revenue, non revenue positive space, stand by for flight.

     #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on Tools Menu
    And I click on Native Shares
    And I set Class Of Service to "<COS>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex>"
    And I set startdate to "<StartDate>" for Segment "<SegmentIndex>"
    And I search for flight availability in Native shares of special pnr for first segment from "<Origin>" to "<Destination>" and "<StartDate>"
    And I enter the passenger details in Native shares
    And I enter the passenger phone details for "<POS>"
    And I save the details of the passenger
    And I end and retrieve the PNR in Native shares
    And I click on Cancel button in native shares
    And I click the order tab
    And I select the Quote Options and click on Next retrieving PNR from shares
    And I select pricing option Price as Best Buy retrieving PNR from shares
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I display the standby list for the segment "<SegmentIndex>" in native shares
    And I logout from COPA GUI application

    Examples:
      |salesOffice|currency |Origin       |Destination |POS|StartDate |Adult|Child|INF|INS|NRSA|Airline|COS|SegmentIndex|SegmentIndex|PaymentType|PNRType|
      |PTY ATO    |USD      |PTY          |LAX         |PTY|01 days   |2    |1    |0  |0  |1   |CM     |Y  |0           |1           |Cash       |NRSA   |
