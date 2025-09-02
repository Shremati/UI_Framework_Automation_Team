#Description:
#Go to the CSS GUI - COMPENSATION MODULE
#Fill in the following data: Date, Flight Number, City of Origin.
#Select the "All Passenger List" option
#Click on the button "Search"
#Select all passengers
#Select the Reason Code to compensate.
#Select the Reason Code to compensate.
#Click on the Continue Button
#Modify the amount of compensation enabled according to the reason code selected.
#Click on the "Issue Compensation" button
#Click on the OK button in the pop-up window.
#Select compensated passengers.
#Click on the Print button
#
#
#Expected:
#The compensation module should be enabled.
#The passenger list of the indicated flight will be displayed.
#The options to be compensated (Amount, Hotel, Meals, Transport) will be shown with their respective amounts and the Additional Details option.
#A pop-up window will appear to confirm the compensation.
#The list of compensated passengers is shown.
#The Email and Print options are enabled.
#The GUI will start the printing process of the issued Vouchers.

@UAT
Feature: 622952 - Mass Compensation Voucher Generation for Flights with 100 or More Passengers

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622952 - Mass Compensation Voucher Generation for Flights with 100 or More Passengers

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"

    And I navigate to the User provisioning Tool page
    And I enter User Id and click on search in user provisioning page
    And I select POS and set status of the iCoupon in User Provisioning tool page "<iCouponStatus>"
    And I navigate to home screen

    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I click search button in flight search availability
    And I store all the flight numbers after flight search
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<OriginCity>" and "<StartDate>" and "<PassengerType>" and "<flightIndex>"
    And I select compensation reason and select passenger "<compensationReason>"
    And I select passengers and issue compensation "<Amount>" and "<PassengerType>" and "<compensationReason>" and "<StartDate>"
    And I select passengers and click print button
    And I logout from COPA GUI application


    Examples:
      |salesOffice  |currency|OriginCity   |Destination |StartDate |compensationReason|Adult|PassengerType     |Amount|printer   |printerStatus|flightIndex|iCouponStatus|
      |PTY COPA CLUB|USD     |PTY          |MEX         |01 days   |Baggage Delay     |1    |All Passenger List|100   |US-5CD4377SFF|PrintReady   |0          |UnAssign  |
