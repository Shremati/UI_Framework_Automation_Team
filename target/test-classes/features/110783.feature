#Description:
#Display SSR Inventory Database
#1- Display SSR Inventory Database2- K-I/SSR*/ALL/316/10JAN
#Display SSR Inventory Database

@VIR
Feature: 110783 - Display SSR Inventory Database

  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: 110783 - Display SSR Inventory Database

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on Tools Menu in GUI application
    And I click on Native Shares
    And I enter SSRDetails command to display outbound connection in Native Shares with "<Flight Number>" and "<Travel date>"
    And I click on Cancel button in native shares
    And I click on Tools Menu in GUI application
    And I navigate to SSR Inventory Database option under Tools menu
    And I enter the mandatory fields with "<Flight Number>" "<From>" "<To>" "<Travel date>" in SSR Inventory Database option
    And I verify SSR details and click on cancel button in SSR Inventory Database option
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency |  Adult | Flight Number | Travel date | From | To  |
      | PTY ATO     | USD      |  1     | 360           | 00 days     | PTY  | LAX |