#Description:
#Check in pass in oversale flight no seats available or held seat for the passenger.
#After check in process passenger will enter in standby list with HKN status.
#Expected:
#Expected Result 1: Display passenger in standby list.
#Expected Result 2: In the seat field of the boarding pass must appear the SBY status.


@UAT
Feature: 236669 - Add HKN passenger in standby list for OVS (Oversold) flight
  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236669 - Add HKN passenger in standby list for OVS (Oversold) flight

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
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select child passengers
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<OriginClass>" for Origin flight
    And I select pricing option as best buy
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
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I select the flight actions as "<ActionType1>"
    And I assign weight restriction for the class "<OriginClass>" with number of pax "<passengers>"
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I select the flight actions as "<ActionType1>"
    And I unassign weight restriction for the class "<OriginClass>" with number of pax "<passengers>"
    And I click on the standby tab to display the passenger list
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I click on the oversold tab to display the passenger list
    And I validate if the passenger is added to the oversold list
    And I navigate to home screen
    And I logout from COPA GUI application

    Examples:
      |salesOffice              |currency |OriginCity  |Destination |StartDate |Adult|Child|INF|INS|PaymentType|SegmentIndex|ActionType1                     |OriginClass|passengers    |printer      |printerStatus|PNRText|
      |PTY ATO                  |USD      |PTY         |GYE         |01 days   |1    |0    |0  |0  |Cash       |0           |Weight and Balance Restriction  |Economy    |1             |IN-PF2ST1T4  |PrintReady    |PNR|
