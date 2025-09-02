#Description:
#Validate the addition of baggage in the EXCHANGED reservation (voluntary or involuntary)

@UAT
Feature: 622985 - Validate the addition of baggage in the EXCHANGED reservation (voluntary or involuntary)

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622985 - Validate the addition of baggage in the EXCHANGED reservation (voluntary or involuntary)

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
    And I select class "<originClass>" for Origin flight
    And I select pricing option as Economy Basic
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I check the ticket in the Tickets tab
    And I check the EMDs in EMD tab
    And I navigate to Order tab
    And I click on Action drp dwn for Vol reissue
    And I click on CheckOut button and Reissue for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I check the ticket in the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report
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
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight1>"
    And I click on Submit and Proceed to Pay
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I click add Baggage icon
    And I delete the standard baggage "<BaggageNo>"
    And I click on Submit and Continue
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice     |currency |OriginCity   |Destination |StartDate  |SegmentIndex1|Adult|Child|INF|INS|BaggageNo |BaggageNo1|BaggageNo2|BaggageNo3|BaggageNo4|BaggageWeight|BaggageWeight1|BaggageWeight2|PaymentType|originClass|searchType|ticketStatus|Printer      |PrinterStatus|
      |PTY ATO         |USD      |PTY          |BOG         |01 days    |0            |1    |0    |0  |0  |1         |2         |3         |4         |5         |23           |32            |35            |CASH       |Economy    |Name      |CHECKED-IN  |IN-5CD4316MPJ|PrintReady   |







