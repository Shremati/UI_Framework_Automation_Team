#Description :
#Validate that multiple SSRs appear in the final report


@UAT
Feature: 629051 - Validate that multiple SSRs appear in the final report

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629051 - Validate that multiple SSRs appear in the final report

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    And I click on Return to Check-In

    And I click on PNR hyperlink in checkin page
    And I add SSR "<SSRType>" with "<SSRDescription>" through Services Tab for the passenger "<PaxIndex>"
    And I add SSR "<SSRType1>" with "<SSRDescription1>" through Services Tab for the passenger "<PaxIndex1>"
    And I add SSR "<SSRType2>" with "<SSRDescription2>" through Services Tab for the passenger "<PaxIndex2>"
    And I add SSR "<SSRType3>" with "<SSRDescription2>" through Services Tab for the passenger "<PaxIndex3>"
    And I navigate back to the previous page in GUI


    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I search for the passenger in the all passengers list in GATE module
    And I click on final report and validate the SSR added for the passenger

    And I click on Tools Menu
    And I click on Native Shares
    And I retrieve the pnr in native shares
    And I validate the SSR "<SSRType>" in native shares after PNR Retrieval
    And I validate the SSR "<SSRType1>" in native shares after PNR Retrieval
    And I validate the SSR "<SSRType2>" in native shares after PNR Retrieval
    And I validate the SSR "<SSRType3>" in native shares after PNR Retrieval
    And I click on Cancel button in native shares
    And I logout from COPA GUI application


    Examples:
      |salesOffice |currency |OriginCity |Destination |StartDate |Adult |Child |INF |INS |originClass |SegmentIndex |PaymentType |SSRType|SSRDescription                   |PNRText |printer      |printerStatus|PaxIndex|SSRType1|SSRDescription1                             |PaxIndex1|PaxIndex3|PaxIndex2|SSRType2|SSRType3|SSRDescription2|
      |PTY ATO     |USD      |PTY        |GYE         |02 days   |4     |0     |0   |0   |Economy     |0            |Cash        |WCHR   |WHEELCHAIR  GATE CHECKIN WCHR    |PNR   |IN-PF2ST1T4  |PrintReady   |1       |WCHS    |Wheelchair - passenger can ascend stairs    |2        |4        |3        |DEAF    |BLND    |NA             |
