#144842
#
#REGATO-REGATO-Validate that the free luggage allowance of 23kg is free
#
#Description:
#
#Title :REGATO-Validate that the free luggage allowance of 23kg is free
#
#Description : : Creates a PNR from RES. Segment 1: PVR-BOG CLASS: V STATUS: HK
#
#Step Step 1: Enter the number of flight search and press 'Search'.
#Step 2: Enter the name of the passenger and press 'procced to Check In'
#Step 3: Complete ADC / APIS press 'Submit' and 'Done'
#Step 4: Tap the luggage
#Step 5: Expected result: FBA - 1 pieces
#Step 6: Add a Standard 23kg suitcase with oversize Press 'Add Another Bag' Standard 25kg
#Step 7: Pressure 'Submit'
#Step 8: Expected result: The 23kg luggage must exit cost 197.60El 25kg luggage must leave 'FREE'
#
#
#
#Expected:
#
#1.All Test steps should be completed without any issues
#2.GUI/Reports/Backend validations should be completed successfully


@UAT
Feature: 144842 - Validate that the free luggage allowance of 23kg is free
  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 144842 - Validate that the free luggage allowance of 23kg is free

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
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select specific class "<COS>" for Origin flight in Economy Class
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
    And I search for the segment "<SegmentIndex1>" in Check-In page
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification page for double Nationality
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    And I click on Return to Check-In
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage with Overweight for second bag "<BaggageNo1>" and  "<BaggageWeight1>"
    And I click on Submit and Proceed to Pay
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the EMD subtab and view the baggage details in tickets tab
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice     |currency |OriginCity   |Destination |StartDate  |ReturnDate1|Adult|Child|INF|INS|BaggageNo |BaggageNo1|BaggageNo2|BaggageWeight|BaggageWeight1|SegmentIndex1|PaymentType|originClass|searchType|Printer      |PrinterStatus|ticketStatus    |COS      |COS1|
      |PTY ATO         |USD      |PTY          |BOG         |01 days    |05 days    |1    |0    |0  |0  |1         |2         |3         |23            |25           |0            |Cash       |Economy    |Name      |IN-5CD4316MPJ|PrintReady   |CHECKED-IN       |V       |Y   |







