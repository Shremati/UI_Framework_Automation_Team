#Description:
#EQP-018 Validation of baggage calculation according to "ConnectMiles Gold" status and "Business Full" fare


@UAT
Feature: 630771 - EQP-018 Validation of baggage calculation according to "ConnectMiles Gold" status and "Business Full" fare

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 630771 - EQP-018 Validation of baggage calculation according to "ConnectMiles Gold" status and "Business Full" fare

#GUI
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I add "<FQTV>" frequent flyer gold passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<Printer>" and "<PrinterStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination1>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I select Sales Report and Agent Sales Report
    And I store all the flight numbers after flight search
    And I navigate to home screen
    And I navigate to Check-In page
    And I search for the segment "<SegmentIndex>" in Check-In page
    And I select the passengers in checkin page using "<searchType>"
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
    And I add standard baggage "<BaggageNo3>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage with Overweight for fifth bag "<BaggageNo4>" and  "<BaggageWeight1>"
    And I click on Submit and Proceed to Pay with Foid details
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I navigate to Check-In page
    And I search for the segment "<SegmentIndex1>" in Check-In page
    And I select the passengers in checkin page using "<searchType>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the EMD subtab and view the baggage details in tickets tab
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice     |currency |OriginCity   |Destination1 |StartDate  |SegmentIndex|Adult|Child|INF|INS|BaggageNo |BaggageNo1|BaggageNo2|BaggageNo3|BaggageNo4|BaggageWeight|BaggageWeight1|PaymentType|originClass|searchType    |SegmentIndex1|ticketStatus|Printer      |PrinterStatus|PricingOption|FQTV|
      |MDE ATO         |COP      |MDE          |SJO          |01 days    |0           |0    |0    |0  |0  |1         |2         |3         |4         |5         |32           |35            |CASH       |Economy    |Name          |1            |CHECKED-IN  |IN-5CD4316MPJ|PrintReady   |Business Full|1   |







