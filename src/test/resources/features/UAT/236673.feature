#Description:
#Select passenger and press Order ID
#Select Involuntary Reissue
#Select the Irrop reason code.
#Assign the reason to the affected flight.
#Select waiver of the drop down menu.
#Reroute to the passenger without penalty per change.
#
#  Expected:
#Expected Result: Show OSI in the ORDER ID with the reason code and waiver.

@UAT
Feature: 236673 - Rerout passenger and allow to use a waiver control for this case.

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236673 - Rerout passenger and allow to use a waiver control for this case.

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option as best buy
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I change the date of travel for the first segment "<NewDate1>"


    And I perform the Involuntary Reissue
    And I enter the details in the email recipients page
    And I validate if the payment is successful

    And I navigate to home screen
    And I check to the remarks from order tab and validate the remark type "<type>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the EMD subtab present in Tickets tab
    And I click the services Tab
    And I logout from COPA GUI application

    Examples:
      |salesOffice      |currency|OriginCity  |Destination  |StartDate|Adult|Child|INF|INS|PaymentType|originClass|type              |NewDate1|ticketStatus|
      |PTY ATO          |USD     |PTY         |MEX          |01 Days  |1    |0    |0  |0  |CASH       |Economy    |InvoluntaryReissue|02 days |EXCHD IRR   |
