#Description:
#1.Log in to the Application.
#2.Click on the tools icon to access various functions.
#3.Navigate to the Customer search menu.
#4.Navigate to the section for entering passenger information in the system.
#5.Search by Frequent Flyer Program Details:
#i) if,Enter the passenger's FF program details, including the FF number, into the designated fields.
#Click on the "search" button.
#ii)else, Enter an invalid or non-existent FF number, into the designated fields.Click on the "search" button.
#6.Either Click on the "Back" button to return to the search criteria page or "Cancel" button-
#i)if Click on the "Back" button to return to the search criteria page, Repeat steps 5,6.
#ii)else, Click on Cancel button.

@VIR
Feature: T_CS_FF_04 - Verify the functionality and accuracy of the passenger information fields in the system

  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: T_CS_FF_04 - Verify the functionality and accuracy of the passenger information fields in the system


    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on Tools Menu in GUI application
    And I click on Customer Search under Tools menu
    And I enter the "<VALID_FF_Number>" and click on search in Frequent Flyer Program Details
    And I enter the "<INVALID_FF_Number>" and click on search in Frequent Flyer Program Details
    And I click on Cancel button to exit from the functionality
    And I logout from COPA GUI application

    Examples:
      | salesOffice | currency |  Adult | VALID_FF_Number | INVALID_FF_Number |
      | PTY ATO     | USD      |  1     | 230028398       | 230028399         |

