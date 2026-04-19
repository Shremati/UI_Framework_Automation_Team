#Description :
#Open Gate module
#Display Final List


@UAT
Feature: 236680 - Display Final List

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236680 - Display Final List

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
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first segment on current day
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
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I select the flight actions as "<ActionType>"
    And I try to assign an agent "<ActionType>"
    And I initiate boarding if boarding not initiated
    And I select "<passengerListType>" from the passenger list options
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I logout from COPA GUI application


    Examples:
      |salesOffice            |currency |OriginCity |Destination |StartDate |Adult |Child |INF |INS |originClass |SegmentIndex |PaymentType|hours|ActionType                    |PNRText|passengerListType|
      |PTY CTO COSTA DEL ESTE |USD      |PTY        |MEX         |00 days   |1     |0     |0   |0   |Economy     |0            |CASH       |5    |View/Assign Controlling Agents|PNR    |Final Pax List   |


