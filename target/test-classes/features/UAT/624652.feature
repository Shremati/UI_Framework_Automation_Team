#Description:
# Validate the system calculate correctly penalty that for this case should not have penalty for change .
#
#1. Sign in with USD currency
#- Display a historical reservation
#- Round trip flight from PTY to south america
#- Fare with penalty for change
#2. New Segments for reissue
#- Display Availability
#- Search the same route and booking class of the original return segment
#- Change the date to 1 week after
#3. Quote Voluntary Reissue
#- Book new segment
#- Price the new segment as Price as booked and confirm for the quotes
#- Get the new quote for the Fare Difference and there is a penalty amount for this reissue.
#4. Proceed to Reissue

@Reissue
Feature: 624652 - Even Exchange with Add Collect-with  Penalty

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624652 - Even Exchange with Add Collect-with  Penalty

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
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
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
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab present in Tickets tab
    And I click on Quotes subtab
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<NewDate1>" and Return Date "<NewDate2>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select Book from Actions Dropdown
    And I Delete All the Old Segments
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
#    And I click on Ticket tab and check the "<ticketStatus>" status
#    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes
    And I logout from COPA GUI application

    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | ReturnDate | Adult | Child | INF | INS | PaymentType | originClass | NewDate1 | NewDate2 | ticketStatus1 | ticketStatus | PricingOption   | Pricingoption1  |
      | PTY ATO     | USD      | PTY        | EZE         | 06 Days   | 10 Days    | 1     | 0     | 0   | 0   | Cash        | Economy     | 13 days  | 18 days  | EXCHANGED     | Open         | Price as Booked | Economy Classic |
