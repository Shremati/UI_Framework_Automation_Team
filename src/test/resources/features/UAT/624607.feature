#Description:
#Sign in UIOATO CURRENCY USD
#create a reservation RT, UIOCUN 2 ADULT, 1 CHILD , ANY DAYS, economy flex
#Verify that the administrative fee is correctly with the POS
#Fill the passenger information and click on book and file fare.
#CHECK OUT PAY with CASH, complete the FOID detTails
#Book new segments POS CUNATO MXN , 1 month later, economy classic , Quote the Involuntary Reissue: save and process the changes
#
#  Expected:
#The system should process the change correctly


@Reissue
Feature: 624607 - Involuntary Reissue Economy Classic Flex to Economy Classic

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624607 - Involuntary Reissue Economy Classic Flex to Economy Classic

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<StartDate1>" for two way booking
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select pricing option as "<Pricingoption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the FOID details of the passengers
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I check the ticket in the Tickets tab
    And I check the EMDs in EMD tab
    And I click on Order Tab to view the Itinerary Details
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate2>" and Return Date "<StartDate3>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select Book from Actions Dropdown
    And I select and delete the segment "<segmentNo>"
    And I select and delete the segment "<segmentNo>"
    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I click the order tab
    And I perform Reissue For All Segments Booked on New Date
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I check the ticket in the Tickets tab
    And I check the EMDs in EMD tab
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | salesOffice1 | currency1 | OriginCity | Destination | StartDate | Pricingoption        | segmentNo | StartDate1 | StartDate2 | StartDate3 | Adult | Child | INF | INS | originClass | PaymentType |
      | UIO ATO     | USD      | CUN CTO      | MXN       | UIO        | CUN         | 07 days   | Economy Classic Flex | 1         | 14 days    | 21 days    | 28 days    | 2     | 1     | 0   | 0   | Economy     | Cash        |
