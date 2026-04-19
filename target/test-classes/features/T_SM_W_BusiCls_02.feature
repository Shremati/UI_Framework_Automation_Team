#Description:
#1.Log in to the application using valid credentials.
#2.Click on the tools icon to access various functions.
#3.Navigate to the Seat Map Section.
#4.Select the 'Seat Map' option from the menu.
#5.Clear Any Previous Data or
#Click on cancel to exit the funconality.
#Case : With business Class
#6.Click on the 'Carrier Code' field and enter the carrier code (e.g., 'CM').
#7.Click on the 'Flight Number' field and enter the flight number (e.g., '360').
#8.Click on the 'Departure Date' field and select the date from the date picker.
#9.Click on the 'From' field and enter the departure location code (e.g., 'PTY' for Panama).
#10.Click on the 'To' field and enter the destination location code (e.g., 'LAX').
#11.Click on the 'Class' field and Enter e.g. 'C' (Business Class-C,J,D,R).
#12.Click on the 'Display' button.
#13.Review the displayed seat map,seat map key, advanced display.
#14.Perform actions on Advanced Display by clicking on checkboxes (Seats with infants, Bulkhead, Infants not allowed, Exit row).
#15.Verify Seat Map Details.
#16.Click on the 'Home' button to exit the seat map interface.
#17.Negative Scenario: Check for errors with invalid input.


@VIR
Feature: T_SM_W_BusiCls_02 - Verify that GUI is displaying Chatbot icon from Top Header.

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: T_SM_W_BusiCls_02 - Verify that GUI is displaying Chatbot icon from Top Header.

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I click on Tools Menu in GUI application
    And I Select the Seat Map option from the menu
    And I clear Any Previous Data from Seat Map option
    And I enter the mandatory fields with "<carrierCode>" "<flightNumber>" "<departureDate>" "<from>" "<to>" "<class>" for Seat Map Option
    And I click on Display button to view the Seat Map
    And I perform actions on Advanced Display by clicking on checkboxes
    And I navigate to home screen
    And I logout from COPA GUI application


    Examples:
      | salesOffice1            | currency1 | carrierCode | flightNumber    | departureDate | from    | to      | class | Adult |
      | PTY ATO                 | USD       | CM          | 461             | 01 days       | SJO     | PTY     | C     | 01    |
