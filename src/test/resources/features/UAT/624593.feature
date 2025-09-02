#Description:
#Reissue ticket to validate a partically used ticket.
#
#Voluntary Change (Partially used coupons in the order)
#1. Sign in with USD
#2.1 Select local currency (USD)
#3. Display a partially used order from (Shares)
#4. Make sure the reservation have 4 segments in the coupon level information
#4.1 Make sure the order have partially used coupons
#5. Modify the open segments
#5.1 Request C booking class for the return segments
#6. Request best buy re-pricing quote
#6.1 Store quote ID
#7. Open store quote ID
#8. Re issue the ticket with 2 form of payment
#8.1 Credit card form of payment
#i.e.:VISA - 4444333322221111/APRV555
#8.2 Cash
#9. Re-display the booking
#10. Assign seat for new itinerary
#i.e.: 20A, 31B, 22C, etc
#11. Open the sales reporting

@UAT
Feature: 624593 - Voluntary Change (Partially used coupon)

  Background:

    Given Shares Application is launched in the browser

  Scenario Outline: 624593 - Voluntary Change (Partially used coupon)

    #shares
    And I enter valid shares credentials
    And I click on the shares Login Button
    And I click on terminal emulation
    Then I validate successful shares login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers

    Then I enter LOGC CMRE command for logging in
    And I enter BSIA command for signing in
    And I enter BSO command for sign out
    And I enter BSIA command for signing in
    And I enter W* command to check lniata of the session
    And I enter BSIA command for signing in
    And I set the POS to "<POS>"
    And I enter BSIA command for signing in
    And I set Class Of Service to "<COS>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex>"
    And I set startdate to "<StartDate>" for Segment "<SegmentIndex>"
    And I search for flight availability for first married segment flights from "<OriginCity>" to "<Destination>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex1>"
    And I set startdate to "<ReturnDate>" for Segment "<SegmentIndex1>"
    And I search for flight availability for second married Segment flights from "<Destination>" to "<OriginCity>"
    And I enter passenger details
    And I enter phone details for the passengers
    And I enter 6P command to save the transaction
    And I enter 7T command for the ticketing command
    And I enter ER command to save and retrieve
    And I have done auto fare quote for all the passengers in the PNR with "<PaymentType>"
    And I enter *ET command to display all the tickets in the PNR
    And I enter *EH command to display the ETKT history
    And I enter T_ET|USED command to change the specific segment to CM-USED status "<segNumber>"
    And I enter T_ET|USED command to change the specific segment to CM-USED status "<segNumber1>"
    And I enter *ET command to display all the tickets in the PNR
    And I enter ZAFIL command to change segment status to flown "<Segment>"
    And I enter ZAFIL command to change segment status to flown "<Segment1>"
    And I retrieve the pnr
    And I enter *ET command to display all the tickets in the PNR
    And I enter *EH command to display the ETKT history
    And I logout from Shares application

    #GUI
    And I navigate to COPA GUI Application from iShares Page
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click the order tab
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I navigate to home screen
    And I click the order tab
    And I change the class of seat "<class>" for required connecting segment "<Segment>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I make the second payment by selecting the payment type as "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I navigate to home screen
    And I click the order tab
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes
    And I logout from COPA GUI application


    Examples:
      | POS | salesOffice | currency | OriginCity | Destination | StartDate | ReturnDate | class | Adult | Child | INS | INF | PaymentType | PaymentType1 | segNumber | segNumber1 | ticketStatus | ticketStatus1 | PricingOption     | Segment | COS | Segment1 | Airline | SegmentIndex | SegmentIndex1 |
      | PTY | PTY ATO     | USD      | SCL        | BOG         | 20 days   | 30 days    | C     | 1     | 0     | 0   | 0   | Cash        | VISA         | 1         | 2          | CM USED      | EXCHANGED     | Price as Best Buy | 1       | Y   | 2        | CM      | 0            | 2             |


