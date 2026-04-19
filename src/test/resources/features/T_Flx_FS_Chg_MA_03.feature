#Description:
#Login to the application with FLX
#1. Click on tools symbol
#2. Click on Fee Service & Other Charges
#3. Select Mileage Auxiliary Display
#4. Enter From as "PTY" and To filed as "MEX" and Global Direction as "WH"
#5. Click on Search view available Distance Information and Further additional Information information.
#Distance Information-
#-City,TPM Mileage,Cumulative TPM Mileage,MPM Mileage,GD,Surcharge Level
#6. Click on cancel to exit from the functionality
#7. Repeat Step 2 to 6 with DXC Fares

@VIR
Feature: T_Flx_FS_Chg_MA_03 - Verify Mileage Auxiliary Display ,Mileage Auxiliary Display/PTY-MEX/GlobalDirection-WH, Mileage Auxiliary Display/PTY-MEX

  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: T_Flx_FS_Chg_MA_03 - Verify Mileage Auxiliary Display ,Mileage Auxiliary Display/PTY-MEX/GlobalDirection-WH, Mileage Auxiliary Display/PTY-MEX

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on Tools Menu in GUI application
    And I click on Fee Service & Other Charges under Tools menu
    And I select Mileage Auxiliary Display option under Fee Service & Other Charges
    And I enter the mandatory fields with "<from>" and "<to>" and "<date>" and "<globalDirection>" for Mileage Auxiliary Display Option
    And I click on Search button to view available Distance Information and Further additional Information
    And I click on cancel to exit from the functionality
    And I logout from COPA GUI application



    Examples:
      | salesOffice | currency |  Adult | from       | to            | date           | globalDirection |
      | PTY ATO     | USD      |  1     | PTY        | LAX           | 01 days        | WH              |
