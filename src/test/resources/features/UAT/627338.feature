#Description:
#Create a PNR, POS: SJO CTO USD. Route SJO-MCO RT, more than 7 days, 1 adult, Economy Classic fare
#Enter Passenger Details
#Form of Payment: Visa and Cash
#Reissue all the segments (only days, same route and fare)
#Issue New Quote
#Select "Store Quote ID“
#Erase Old segments, and Select "Vol Re-Issue"

#Complete the payment with FOP: Master Card
#Check the New Ticket information and the EMD information.

@UAT
Feature: 627338 - Classic fare booking made more than 7 days in advance, the system should allow the first change without penalty, but a possible price difference may apply

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 627338 - Classic fare booking made more than 7 days in advance, the system should allow the first change without penalty, but a possible price difference may apply

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
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
    And I select pricing option as Economy Classic
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I navigate to Order tab
    And I change the date of travel for the first connecting segment "<NewDate1>"
    And I change date of travel for second connecting segment "<NewDate1>" after the first connecting segment booked
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    #And I validate if the payment is successful
    And I store the updated emd and ticket details and validate if payment is successful
#    And I click on Ticket tab and check the "<ticketStatus>" status
#    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the Tax Details in Agent Sales Report after changes
    #And I validate Ticket and EMD values in Agent sales report and view tax details
    And I logout from COPA GUI application

    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | ReturnDate | Adult | Child | INF | INS | PaymentType | originClass | NewDate1 | ticketStatus1 | ticketStatus | PaymentType1 | PricingOption   |
      | SJO-CTO     | USD      | SJO        | MCO         | 07 Days   | 14 Days    | 1     | 0     | 0   | 0   | Cash        | Economy     | 10 days  | EXCHANGED     | Open         | VISA         | Economy Classic |
