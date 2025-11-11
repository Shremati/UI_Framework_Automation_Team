#Description:
#REGATO-Scenario # 051.1 Change from the Passenger Type Adult Child in to display the SHARES and then a passenger in the CSS GUI
#
#Step 1: Log in in SHARES
#Step 2: Complete the check-in of the passenger With This transaction6- [Flight] / [Origin] / [Date] - [Lastname] / [givenname] C1B0
#Step 3: Make the entry in SHARES 6-LD [FlightNumber] / [Origin] / [T] -CHD
#Step 4: Expected Result: Passenger must be checked-in Reflected
#Step 5: Log in as DAV Airport Agent
#Step 6: Input the Order ID and press 'Search'
#Step 7: Expected Result: Passenger Type must it appears as Child
#Step 8: Press 'Proceed to check-in'
#Step 9: Expected Result: Passenger Type must it appears as Child (and it must be uneditable)

#Expected:
#REGATO-Scenario # 051.1 Change from the Passenger Type Adult Child in to display the SHARES and then a passenger in the CSS GUI
#

@UAT
Feature: 622937 - 145066-REGATO-Scenario #051.1 Change the Passenger Type from Adult to Child and display the passenger in the CSS GUI

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622937 - 145066-REGATO-Scenario #051.1 Change the Passenger Type from Adult to Child and display the passenger in the CSS GUI

    #iShares
    And I navigate to iShares Page from COPA GUI Application
    And I enter valid shares credentials
    And I click on the shares Login Button
    And I click on terminal emulation
    Then I validate successful shares login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    Then I enter LOGC CMRE command for logging in
    And I enter BSIA command for signing in
    And I enter BSO command for sign out
    And I enter BSIA command for signing in
    And I enter W* command to check lniata of the session
    And I enter BSIA command for signing in
    And I set the POS to "<POS>"
    And I enter BSIA command for signing in
    And I set Class Of Service to "<COS>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex>"
    And I set startdate to "<StartDate>" for Segment "<SegmentIndex>"
    And I search for flight availability from "<OriginCity>" to "<Destination>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex1>"
    And I set startdate to "<StartDate1>" for Segment "<SegmentIndex1>"
    And I search for flight availability for second segment from "<OriginCity1>" to "<Destination1>"
    And I enter passenger details
    And I enter phone details for the passengers
    And I enter 6P command to save the transaction
    And I enter 7T command for the ticketing command
    And I enter ER command to save and retrieve
    And I have done auto fare quote for all the passengers in the PNR with "<PaymentType>"
    And I enter *ET for displaying coupon of ticket
    And I enter *EH command to display the ETKT history
    And I do short checkin for Shares PNR with baggage for check in type "<TypeOfCheckin>"
    And I do checkin for Shares PNR with baggage for check in type "<TypeOfCheckin>" for required segment "<SegNo>"
    And I retrieve the pnr
    And I enter 6:LD_|CHD command for displaying child pax for all segments
    And I logout from Shares application

    #GUI
    And I navigate back to previous tab in the browser "<tab>"
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click the order tab
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button

    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |OriginCity1|Destination1|StartDate |StartDate1|SegmentIndex1|Adult|Child|INS|INF|PaymentType|tab|SegNo|SegmentIndex|POS|COS|Airline|TypeOfCheckin|
      |DAV ATO    |USD     |DAV          |PTY         |PTY        |SJO         |01 days   |02 days   |1            |1    |0    |0  |0  |Cash       |1  |1    |0           |DAV|Y  |CM     |ADT_CHD      |


