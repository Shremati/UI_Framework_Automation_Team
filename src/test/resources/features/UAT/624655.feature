#Description:
#Create a reservation GRU-PTY RT (1 adult y 1 child) Economy Basic
#Payment: with any form of payment
#Make a change (only on dates,keep the same route) economy Classic
#Review the Tickets tab
#Check if the change was made correctly

@UAT
Feature: 624655 - Verify by Creating a reservation with 1 adult, 1 child, GRU-PTY, make reissue (date) is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624655 - Verify by Creating a reservation with 1 adult, 1 child, GRU-PTY, make reissue (date) is happening correctly

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
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate2>" and Return Date "<StartDate3>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for Origin flight for the newly added segments via availability
    And I select class "<originClass>" for Return flight for the newly added segments via availability
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue with Pricing Option as "<PricinOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I navigate to Order tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | StartDate1 | StartDate2 | StartDate3 | PaymentType | Adult | Child | INF | INS | TicketStatus1 | PricingOption | originClass | PricinOption1   | SegmentDelete |
      | GRU ATO     | BRL      | GRU        | PTY         | 10 days   | 17 days    | 47 days    | 54 days    | CASH        | 1     | 1     | 0   | 0   | EXCHANGED     | Economy Basic | Economy     | Economy Classic | 1             |


