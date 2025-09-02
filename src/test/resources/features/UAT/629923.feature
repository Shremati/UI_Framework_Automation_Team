#Description
#Create a reservation 1ADT, route (PTY-DAV) RT IN ATO PTY
#In basic class
#Add passenger information
#pay with MASTERCARD
#change dates in 60 days in the same class
#the system must process the change correctly
#
#Expected
#The system must charge $42.80

@UAT
Feature: 629923 - Validate that the penalty amount for change dates is correct in domestic flights with 60 or more days in basic class

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629923 - Validate that the penalty amount for change dates is correct in domestic flights with 60 or more days in basic class

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<ReturnClass>" for Return flight
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
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I navigate to home screen
    And I click the order tab
    And I change the date of travel for the first segment "<NewDate1>"
    And I change the date of travel for the second segment "<NewDate2>"
    And I perform Voluntary Reissue
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | NewDate1 | ReturnDate | NewDate2 | Adult | Child | INF | INS | PaymentType | originClass | ReturnClass | PricingOption | printer  | printerStatus | PaymentType1 | ticketStatus |
      | PTY ATO     | USD      | PTY        | DAV         | 01 days   | 60 days  | 03 days    | 63 days  | 1     | 0     | 0   | 0   | MASTERCARD  | Economy     | Economy     | Economy Basic | MAHAC-NB | PrintReady    | CASH         | EXCHANGED    |

