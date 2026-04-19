#Description:
#  Create a PNR with ADT
#  1 Connecting segment
# Then do the payment - any mode
#  Navigate to Gate Module, search with the departure date and origin city
#  Click on flight actions, choose mass transfer
#

@UAT
Feature: 236672 - Give seats to involuntary passengers
  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236672 - Give seats to involuntary passengers
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
    And I navigate to Check-In page
    And I change the date format for passenger DOB
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I select the flight actions as "<ActionType1>"
    And I assign weight restriction for the class "<OriginClass>" with number of pax "<passengers>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I select the flight actions as "<ActionType1>"
    And I unassign weight restriction for the class "<OriginClass>" with number of pax "<passengers>"
    And I select the passengers in checkin page using "<searchType>"

    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I select the flight actions as "<ActionType>"
    And I try to assign an agent "<ActionType>"
    And I click on the standby tab to display the passenger list
    And I initiate standby to the passenger
    And I validate if the passengers have been cleared
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I navigate to home screen
    And I logout from COPA GUI application

    Examples:
      |salesOffice              |currency |OriginCity  |Destination |StartDate |Adult|Child|INF|INS|PaymentType|ActionType                    |SegmentIndex|ActionType1                     |OriginClass|passengers    |searchType|printer      |printerStatus|PNRText|
      |PTY ATO                  |USD      |PTY         |SCL         |01 days   |1    |0    |0  |0  |Cash       |View/Assign Controlling Agents|0           |Weight and Balance Restriction  |Economy    |1             |PNR       |IN-PF2ST1T4  |PrintReady    |PNR|
