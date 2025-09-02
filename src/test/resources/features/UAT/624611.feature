#Description:
#Create a PNR, Economy Full, 2ADT, 2CHD, PTYMIA, RT, leaving on monday OCT and returning 5 days later
#Segments with CM and codeshare operated by OA.
#price as best buy
#Enter pax details
#Issue reservation, Pay with mastercard
#Involuntary Reissue arrival flight to 3 days later
#Share the results
#Expected:
#The system should process the change correctly


@UAT
Feature: 624611 - Verify the system should process the change correctly by performing Involuntary Reissue by changing the date

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624611 - Verify the system should process the change correctly by performing Involuntary Reissue by changing the date

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
    And I enter Start Date "<StartDate>" and Return Date "<StartDate1>" for two way booking
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
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
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I navigate to Order tab
    And I change the date of travel for the second segment "<NewDate1>"
    And I perform Involuntary Reissue for specific segment "<Segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueReasonCode>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab
    And I navigate to Order tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report
    And I logout from COPA GUI application

    Examples:

      | salesOffice   | currency | OriginCity | Destination | NewDate1 | StartDate | StartDate1 | PaymentType | Adult | Child | INF | INS | originClass | PricingOption     | Segment | TicketStatus | ReasonCode            | ReissueReasonCode |
      | PTY COPA CLUB | USD      | PTY        | MIA         | 12 days  | 03 days   | 08 days    | MASTERCARD  | 2     | 2     | 0   | 0   | Economy     | Price as Best Buy | 2       | EXCHD IRR    | WPEN IRROP-EARTHQUAKE | Involuntary       |