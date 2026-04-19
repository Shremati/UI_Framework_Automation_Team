#Select any passenger where ADC/APIS completes from any screen
#Click on baggage indicator
#Add any paid bag and submit
#Click on Proceed to pay button
#Select
#Any Process:
#EXCESS
#CHANGES
#Any Reason Code:
#WBAG XBAG
#WBAG WAAGIXXX
#WBAG EBAWIN318
#WBAG AUTHB073-ATPCO File Error
#WBAG STOPOVER WSOACCXXX
#and click on Next button
#Click on Issue EMD button
#Click Done button in the Payment screen
#Click on Continue button
#Click on the Order ID in the passenger details screen
#Verify the OSI remarks in the Order ID screen

@VIR
Feature: TC_Misc_12 - Verify OSI Remarks for the waived bag for any passenger and the length of the OSI remark is exceed more than 64 Characters

  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: TC_Misc_12 - Verify OSI Remarks for the waived bag for any passenger and the length of the OSI remark is exceed more than 64 Characters

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification page
    Then I Validate APIS Complete and click on Done button
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo>" and  "<BaggageWeight>"
    And I click on Submit and Proceed to Pay using Waiver Option as "<Process>" and "<Reasoncode>"
    And I click on check-in button for the passenger
    And I click on OKAY button in the confirmation popup
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I navigate to Order tab
    And I click on remarks link in order page
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I click add Baggage icon
    And I click add another baggage
    And I add standard baggage "<BaggageNo>" and  "<BaggageWeight>"
    And I click on Submit and Proceed to Pay using Waiver Option as "<Process1>" and "<Reasoncode1>"
    And I click on check-in button for the passenger
    And I click on OKAY button in the confirmation popup
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I navigate to Order tab
    And I click on remarks link in order page
    And I logout from COPA GUI application

    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | BaggageNo1  | BaggageNo      | BaggageWeight | PaymentType | Adult | Process     | Reasoncode        | Process1 | Reasoncode1                      | TicketStatus1  |  PricingOption   |  originClass | printer      | printerStatus |
      | PTY ATO     | USD      | PTY        | MDE         | 02 days   | 2           | 1              | 30            | CASH        | 1     | EXCESS      | WBAG XBAG         | EXCESS   | WBAG AUTHB073-ATPCO File Error   | CHECKED-IN     |  Price as Booked |  Economy     | IN-PF2ST1T4  | PrintReady    |