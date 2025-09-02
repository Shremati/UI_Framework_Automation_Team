#Description:
#Create an Order ID With the following: Passenger Name: Sima / Maria / Rosa Passenger type: Adults Segment 1: DAVPTY / Today Segment 2: PTYSJO / Today Class: Y Status Code: HK Adult ETKT: OK Checked-in: Yes Checked -in Through: CSS GUI
#Step 1: Log in as DAV Airport Agent
#Step 2: Input the Order ID and press 'Search'
#Step 3: Press the Passenger Type
#Step 4: Input 1 in the Infant without seat and press 'OK'
#Step 5: Press 'OK' and press the '+' next to the INF label
#Step 6: Input the surname 'War' and Given Name as 'Eduardo' then must be DOB 01/01/2018
#Step 7: Select the Adult in 'Travels with' then select a Gender and press 'Next'
#Step 8: Press 'Book & File Fare' then press 'Check out' and 'Pay'
#Step 9: 'Done' Press Then press 'Back'
#Step 10: Expected Result: ADC / APIS for adults must be uneditable and the ADC / APIS for Infant must be in blank
#Step 11: Expected Result: 'Next' Must Appear in the ADC / APIS screen
#Step 12: Select the Infant and complete ADC / APIS Then press 'Submit' then press 'Done'
#Step 13: Expected Result: Passenger Type 'Adult' must Appear for the second passenger
#Step 13: Expected Result: Infant icon Appear must, with the Passenger Type as Adult and Infant for the first passenger
#Step 15: Expected Result: 2 Boarding passes must be printed for the INF and 4 Boarding Passes must be printed for Both adults

#  Expected:
#1.All Test steps should be completed without any issues
#2.GUI/Reports/Backend validations should be completed successfully


@UAT
Feature: 622939 - Verify REGATO-Scenario #059.1 Update the Passenger Type for a Multinitial Order ID already checked-in the Passenger Detail Screen is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622939 - Verify REGATO-Scenario #059.1 Update the Passenger Type for a Multinitial Order ID already checked-in the Passenger Detail Screen is happening correctly

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
    And I add segment from and to City "<Destination>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" for 2nd Segment
    And I add same firstname to "<PaxCount>" passenger
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
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
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<EMDStatus>"
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I try to update the passenger in Checkin Page "<PaxType>"
    And I try to add the Infant Without seat passenger from Order Screen
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and verify INF is present
    And I try to click on Back button
    And I click on Proceed to Check-In button
    And I verify infant icon is displayed and passenger type is displayed as "<PaxType>"
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I click on the Boarding pass icon to print the Boarding pass
    And I logout from COPA GUI application



    Examples:

      | salesOffice | currency | OriginCity | Destination | Destination1 | StartDate | StartDate1 | PaxCount | PaymentType | Adult | Child | INF | INS | originClass | TicketStatus | printer  | printerStatus | EMDStatus | PaxType           |
      | DAV ATO     | USD      | DAV        | PTY         | SJO          | 01 days   | 02 days    | 2        | CASH        | 2     | 0     | 0   | 0   | Economy     | Open         | MAHAC-NB | PrintReady    | Flown     | Adult With Infant |



