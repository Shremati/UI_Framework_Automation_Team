#Description:
#On the NATIVE SHARES option, enter the following command changing flight, date and time (1000P) to the corresponding values ​​2Pflight/15AUG OUT PTY 1000P
#
#
#Expected:
#Expected Result: This display provides the flight time estimate updates

@UAT
Feature: 236697 - Verify the status has been changed to Restricted of flight ,date and time are updated correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236697 - Verify the changing of flight ,date and time are updated correctly

   #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I navigate to Gate section
    And I search for the flight in Gate section with Destination as "<Destination>"
    And I verify the flight status is displayed as "<FlightStatus>"
    And I select the flight actions as "<ActionType>"
    And I try to assign an agent "<ActionType>"
    And I select the flight actions as "<ActionType1>"
    And I verify the flight status is displayed as "<FlightStatus1>"
    And I logout from COPA GUI application


    Examples:

      |salesOffice |currency |Destination |ActionType                     |ActionType1     |FlightStatus |FlightStatus1 |
      |PTY ATO     |USD      |HAV         |View/Assign Controlling Agents |Restrict flight |OnTime       |Restricted    |