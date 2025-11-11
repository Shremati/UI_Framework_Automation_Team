 #Description:
#1. POSPTY ROUTE PTYMEX ANY FLIGHT, Remove status check in
#2. book new segments, same country, different route
#3. reprice in class Y Ecomoy full, Route PTYMTY, pays with EMD
#4. verify the EMD in the sales Report

#Expected
 #The system should process the change correctly


@Reissue
Feature: 624633 - Voluntary Reissue the same day

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624633 - Voluntary Reissue the same day

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
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
#    And I validate the Price Quote and click on Next
    And I click the Price Quote button and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I want to pay using residual emd
    And I perform voluntary manual refund
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I check the EMDs in EMD tab

    And I navigate to home screen
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass1>" for Origin flight
    And I select pricing option as "<Pricingoption1>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination2>"
    And I enter Start Date "<StartDate>" for one way booking
    And I click search button in flight search availability
    #And I select class "<originClass1>" for Origin flight
    And I select class "<originClass1>" for Origin flight For Same Day Booking
    And I select Book from Actions Dropdown
    And I Delete All the Old Segments
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
#    And I click on Ticket tab and check the "<ticketStatus>" status
#    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the Tax Details in Agent Sales Report after changes
    And I logout from COPA GUI application



    Examples:
      | salesOffice | currency | OriginCity1 | Destination1 | OriginCity | Destination | Destination2 | StartDate | PaymentType1 | Adult | Child | INF | INS | PaymentType | originClass | originClass1 | PricingOption | Pricingoption1  | ticketStatus | ticketStatus1 |
      | PTY ATO     | USD      | PTY         | MEX          | PTY        | BOG         | MDE          | 14 Days   | EMD          | 1     | 0     | 0   | 0   | Cash        | Business    | Economy      | Economy Full  | Price as Booked | Open         | EXCHANGED     |



