#Description:
#Log in to PTYATO POS
#Search for the passenger’s booking using PNR in check-in module
#Enter passenger´s information
#Press bag icon
#Add an extra bag of 15KG
#
#  Expected:
#The system correctly identifies excess baggage based on the domestic policy.



@UAT
Feature: 629423 - Calculate Extra Baggage Fee for a Domestic Flight

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629423 - Calculate Extra Baggage Fee for a Domestic Flight

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
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab present in Tickets tab
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
#
    And I click on check-in for the passenger
    And I click on Return to Check-In
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight1>"
    And I click add another baggage
    And I add standard baggage "<BaggageNo2>" and  "<BaggageWeight2>"
    And I click on Submit and Proceed to Pay
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
#
    And I navigate to home screen
    And I search for the PNR created in Reservation Section
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I check the EMDs in EMD tab
    And I expand and check the "<Field>" EMDs in EMD tab

    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate |Adult|Child|INS|INF|originClass|PaymentType|BaggageNo1|BaggageNo2|BaggageWeight1|BaggageWeight2|printer    |printerStatus|Field    |
      |PTY ATO    |USD     |PTY          |SCL         |01 days   |1    |0    |0  |0  |Economy    |Cash       |1         |  2       |23            |15            |IN-PF2N9WQW|PrintReady   |Baggage  |
