#Description:
#  Create a PNR with ADT,
#Navigate to native Shares
#  Enter a 6-LD416#OC and press SUBMIT button
# Display Outbound connection

@UAT
Feature: 236684 - Display List- Outbound connections

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236684 - Display List- Outbound connections

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
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select child passengers
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
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
    And I check the ticket in the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I navigate to home screen
    And I click on Tools Menu
    And I click on Native Shares
    And I retrieve the pnr in Native shares
    And I enter 6:LD_OC command to display outbound connection in Native Shares
    And I click on Cancel button in native shares
    And I navigate to home screen
    And I click the order tab
    And I logout from COPA GUI application

    Examples:
      |salesOffice                |currency |OriginCity   |Destination|Destination1 |StartDate |returnDate|Adult|Child|INF|INS|originClass |PaymentType|ActionType   |SegmentIndex|PNRText|transferType|Reason     |buttonName|SegmentIndex1|
      |PTY ATO                    |USD      |GYE          |MIA        |MIA          |01 days   |02 Days   |1    |0    |0  |0  |Economy     |Cash       |Mass Transfer|0           |PNR    |Outbound    |CANCELATION|accept    |1            |
