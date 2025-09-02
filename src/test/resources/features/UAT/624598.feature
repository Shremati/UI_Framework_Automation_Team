#Description:
#Create a Reservation in Economy Classic to departure in 15 days
#POS: GRU-CTO / BRL
#ROUTE: GIG-MIA MCO-GRU / 2 ADT 1 CHD 1 INF
#Make a reservation
#Make a payment with CC Master Card
#Generate a involuntary change in depature day, to leave within 3 days later later in Economy Full
#process check out
#Assign seating for all passengers
#
#  Expected:
#Must be Display Manual Reissue



@UAT
Feature: 624598 - Verify Involuntary Reissue of a double open jaw ticket is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624598 - Verify Involuntary Reissue of a double open jaw ticket is happening correctly

   #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I add segment from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" for 2nd Segment
    And I select child passengers
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I navigate to Order tab
    And I change the date of travel for the first connecting segment "<NewDate>"
    And I perform Involuntary Reissue for specific segment "<Segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueReasonCode>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab
    And I navigate to Order tab
    And I click the services Tab
    And I click on seat icon from services tab for required segment "<Segment>"
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | OriginCity1 | Destination1 | StartDate | PricingOption   | PaymentType | Adult | Child | INF | INS | originClass | NewDate | ReasonCode            | StartDate1 | Segment | TicketStatus | ReissueReasonCode |
      | GRU CTO     | BRL      | GIG        | MIA         | MCO         | GRU          | 15 days   | Economy Classic | MASTERCARD  | 2     | 1     | 1   | 0   | Economy     | 18 days | WPEN IRROP-EARTHQUAKE | 30 days    | 34      | EXCHD IRR    | Involuntary       |
