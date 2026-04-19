#Description:

#Step Name	Description  	Expected Result
#1	Title :REGATO-Validate offload passenger after the flight is restricted.
#
#Description : Use two different user Airport: 1. Airport ROSAMANIEGO agent, AHOU.
#
#Step 1: Create one Order ID and check in the passenger Log in LVALENZUELA in PTY-ATO Airport as an agent.
#Step 2: In GATE MODULE, XXX input CM and press 'search'.
#Step 3: In the top header select view / ASSIGN controlling agent from the actions dropdown flight.
#Step 4: Controlling Agent In Assign screen input controlling agent as LVALENZUELA press 'add' then 'save'
#Step 5: In the top header select flight from the flight restrict actions dropdown.
#Step 6: Expected Result 1: CMXXX is restricted for Flight Check-In
#Step 7: Log in JOCONCEPCION in PTY-ATO Airport as an agent.
#Step 8: In GATE MODULE, XXX input CM and press 'search'.
#Step 9: Search on passenger list and select That the passenger.
#Step 10: Press 'Load Off'.
#Step 11: Expected result 2: Function message restricted to controlling agents.
#Step 12: Expected result 3: Passenger cannot be off loaded.	1.All Test steps should be completed without any issues
#2.GUI/Reports/Backend validations should be comp
#
#Step 1: Create one Order ID and check in the passenger Log in DXCPSSTEST2 in PTY-ATO Airport as an agent.
#Step 2: In GATE MODULE, XXX input CM and press 'search'.
#Step 3: In the top header select view / ASSIGN controlling agent from the actions dropdown flight.
#Step 4: Controlling Agent In Assign screen input controlling agent as DXCPSSTEST2 press 'add' then 'save'
#Step 5: In the top header select flight from the flight restrict actions dropdown.
#Step 6: Expected Result 1: CMXXX is restricted for Flight Check-In
#Step 7: Log in DXCPSSTEST3 in PTY-ATO Airport as an agent.
#Step 8: In GATE MODULE, XXX input CM and press 'search'.
#Step 9: Search on passenger list and select That the passenger.
#Step 10: Press 'Load Off'.
#Step 11: Expected result 2: Function message restricted to controlling agents.
#Step 12: Expected result 3: Passenger cannot be off loaded.


@UAT
Feature: 622940 - 144996:Verify REGATO-Validate offload passenger after the flight is restricted

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622940 - 144996:Verify REGATO-Validate offload passenger after the flight is restricted

#GUI
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight with departure time within "<hours>" from current time
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<CouponControl>"
    And I open flight for the segment "<SegmentIndex>" in native shares
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I verify the flight status is displayed as "<FlightStatus>"
    And I select the flight actions as "<ActionType>"
    And I try to assign an agent "<ActionType>"
    And I select the flight actions as "<ActionType1>"
    And I verify the flight status is displayed as "<FlightStatus1>"
    And I logout from COPA GUI application

    And I click on COPA GUI application login button
    And I enter the alternate credentials "<userName>" and "<password>" to log into COPA GUI application
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I verify the flight status is displayed as "<FlightStatus1>"
    And I select the flight actions as "<ActionType>"
    And I validate if the new user is not the controlling agent "<userName>"
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I click on off load button and validate the error message
    And I logout from COPA GUI application


    Examples:
      |salesOffice |currency |OriginCity |Destination |CouponControl |TicketStatus |StartDate |PaymentType |Adult |Child |INF |INS |originClass |PNRText |SegmentIndex |ActionType                     |ActionType1     |FlightStatus |FlightStatus1 |userName   |password|hours|printer      |printerStatus|
      |PTY ATO     |USD      |PTY        |GRU         |Flown         |Open         |00 days   |Cash        |1     |0     |0   |0   |Economy     |PNR     |0            |View/Assign Controlling Agents |Restrict flight |OnTime       |Restricted    |dxcpsstest3|Copa    |3    |IN-PF2ST1T4  |PrintReady   |