#144832
#
#REGATO-Validate charges for additional 3 suitcases
#
#Description:
#
#Title :REGATO-Validate charges for additional 3 suitcases
#
#Description : Order ID: ADT Class: Y Route: PTY PVR - PVR PTY (5 days later)
#
#Step 1: In the module Insert Check In Order ID and press 'Proceed to Check-In'
#Step 2: Complete ADC / APIS, press 'Submit' and then 'Done'
#Step 3: Select the passenger and press 'Check In'
#Step 4: Press 'Return to Check In' Press the icon luggage Expected Result 1: FBA-1 piece
#Step 5: Add 1 bag of 23 KG and press 'Submit'
#Step 6: Expected Result 1: The case 'FREE' shown
#Step 7: Add 2 bags 23kg and 32kg 1 bag, press 'Submit'
#Step 8: Expected result 2: 2nd. 23KG suitcase should charge $ 40.003ra. 23KG suitcase should charge $ 175.004ta. 32KG suitcase should charge $ 275.00
#Step 9: Proceed to Pay 'and complete Check In
#Step 10: In the confirmation window, press' Return to In'En Check In Check screen, press the icon luggage
#Step 11: Tap the trash in the third and fourth maletaLuego press' Submit'
#
#Resultado Waited 3: two suitcases should be deleted
#
#
#
#Expected:
#
#1.All Test steps should be completed without any issues
#2.GUI/Reports/Backend validations should be completed successfully


@UAT
Feature: 622988 - 144832-Verify the GUI and SHARES matched the PNR details

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622988 - 144832-Validate charges for additional 3 suitcases

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
    And I select the printer "<Printer>" and "<PrinterStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate1>" for two way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<returnClass>" for Return flight
    And I select pricing option as Economy Classic
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    And I click on Return to Check-In
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage "<BaggageNo2>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage "<BaggageNo3>" and  "<BaggageWeight3>"
    And I click on Submit and Proceed to Pay
    And I click on check-in for the passenger
    And I click on Return to Check-In
    And I click add Baggage icon
    And I delete the standard baggage "<BaggageNo2>"
    And I delete the standard baggage "<BaggageNo3>"
    And I click on Submit and Continue
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the EMD subtab and view the baggage details in tickets tab
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice     |currency |OriginCity   |Destination |StartDate  |ReturnDate1|Adult|Child|INF|INS|BaggageNo |BaggageNo1|BaggageNo2|BaggageNo3|BaggageWeight|BaggageWeight3|PaymentType|originClass|returnClass| Printer       | PrinterStatus |ticketStatus|
      |PTY ATO         |USD      |PTY          |MEX         |01 days    |05 days    |1    |0    |0  |0  |1         |2         |3         |4         |23           |  32          |CASH       |Economy    |Economy    | IN-5CD4316MPJ | PrintReady    |CHECKED-IN  |







