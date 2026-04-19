#Description:
#Title :Display Chatbot icon from Top Header.
#
#Step 1.Login Application
#Step 2:Select POS : BOG CTO
#Step 3.Verify that GUI is displaying Chatbot icon from Top Header from Reservation module
#Step 4.Click on Biosecurity Chatbot icon
#Step 5.In the Chatbot enter country name: PANAMA

@VIR
Feature: 21SHR1549311_8 - Verify that GUI is displaying Chatbot icon from Top Header.

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 21SHR1549311_8 - Verify that GUI is displaying Chatbot icon from Top Header.

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I click on Biosecurity Chatbot in GUI application
    And I enter the "<country name>" in the Chatbot
    And I logout from COPA GUI application

    Examples:
      | salesOffice1            | currency1 | OriginCity | country name    | StartDate | Adult |
      | BOG CTO                 | COP       | PTY        | PANAMA          | 03 days   | 1     |