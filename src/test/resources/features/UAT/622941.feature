#Description:
#Step Name 	Description 	Expected Result
#1 	Search passenger by surname and Flight #, press "Proceed to Check In"
#2 	Complete ADC/APIS -swipe pspt and press "Done"
#3 	Select Passenger type: Adult
#4 	Go to Standard Check In drop down menu and select "PREFER UPGRADE"
#5 	Click in radio button like primary
#6 	Select GLC from drop down menu and press "OK"	Expected result 1: Pax identified like GLY below the passenger type
#Expected result 2: FFP # must be prompted automatically
#7 	Press Check in	Expected result 3: Boarding Pass must be printed with PREFER status
#
#Expected result 4: in passenger details screen passenger must be identified with gold status
#
#Expected result 5: Passenger must be enlisted in Sby list (waiting list) for Upgrade.



@UAT
Feature: 622941 - 134421-Prefer Upgrade  (Primary Passenger)

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622941 - 134421-Prefer Upgrade  (Primary Passenger)

    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I add "<FQTV>" frequent flyer gold passengers
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
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab present in Tickets tab
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I select the prefer upgrade to upgrade the passenger in checkin page
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I verify the passenger added into the Cabin STBY list checkin page
    And I select the passengers in checkin page using "<searchType>"
    And I click on the Boarding pass icon to print the Boarding pass
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I verify the passenger added into the Cabin STBY list in passenger details screen

    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the services Tab

    And I navigate to home screen
    And I click on Tools Menu
    And I click on Native Shares
#    And I retrieve the pnr in Native shares
    And I enter 6:LD_SB command to display standby list for passenger in Native shares
    And I click on Cancel button in native shares
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity   |Destination |StartDate|Adult|Child|INS|INF|FQTV|printer    |printerStatus|originClass|PaymentType|PaxCount|PassengerType1|iCouponStatus|searchType1|Tab|ticketStatus|segmentIndex|searchType|BaggageWeight|PricingOption  |NameStatus   |Segment|Tab1|Index|
      |PTY ATO    |USD     |PTY          |BOG         |01 days  |0    |0    |0  |0  |1   |IN-PF2ST1T4|PrintReady   |Economy    |Cash       |3       |Print List    |Assign       |PNR        |1  |CHECKED-IN  |0           |Name      |23           |Economy Classic|MEAL DLY FLTS|1      |0   |1    |


