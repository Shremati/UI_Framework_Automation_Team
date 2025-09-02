#Description:
#Create a booking in POS EC CTO, 1ADT, bussiness economy, OW, UIOPTY
#Price as best buy
#Enter pax details
#Issue reservation, Pay Visa card
#Reissue reservartion from ADT to SRC
#Present the results
#
#  Expected:
#The system should process the change correctly

@UAT
Feature: 64631 - Voluntary Reissue from a PTC ADT to PTC SRC (Adult to Senior Citizen)

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624631 - Voluntary Reissue from a PTC ADT to PTC SRC (Adult to Senior Citizen)

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
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
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
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<EMDStatus>"
    And I navigate to Order tab
    And I change the date of travel for the first segment "<NewDate>"
    And I change the class of seat "<Seat>" for the required segment "<Segment>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>" with an advanced option type  "<AdvancedOptions>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | PricingOption     | PricingOption1  | PaymentType | PaymentType1 | Adult | Child | INF | INS | originClass | TicketStatus | EMDStatus | NewDate | Seat | Segment | AdvancedOptions          |TicketStatus1|
      | REC CTO     | BRL      | UIO        | PTY         | 07 days   | Price as Best Buy | Price as Booked | VISA        | CASH         | 1     | 0     | 0   | 0   | Business    | Open         | Flown     | 14 days | B    | 1       | Passenger Reduction Type |EXCHANGED    |
