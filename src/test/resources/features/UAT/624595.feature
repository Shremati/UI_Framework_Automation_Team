#Description:
#Validate the system reissue the ticket correctly .
#
#Even Exchange - with Penalty
#1. Agent Sign In- POS:USD
#2. Create a new reservation:
#2.1. Route: (International) PTY- Any South America destination (Round Trip)
#2.2. Departure: Tomorrow | Arrival: 2 weeks after departure
#2.3. Pax: 1 ADT
#2.4. Public Fare: Use a Class with penalty (i.a.: Q, K, V, U, S, O, W, E, L, T)
#2.5. Issue the reservation: FOP: Cash
#2.6. Wait till the first leg have status FLOWN (Ticket should be Partially Used)
#3. Search Availability and add a new segment for arrival with a different date
#3.1. Must be Same Class and same route
#4. Book the new segment
#5. Select new segment and make a voluntary reissue
#6. Display the Reissue Quote
#7. Store the Quote IdEven Exchange - with Penalty
#8. Reissue ticket

@Reissue
Feature: 624595 - Even Exchange-with Penalty

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624595 - Even Exchange-with Penalty

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
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select Adult passengers and search for flights
    And I select specific class "<originClass>" for Origin flight in Economy Class
    And I select specific class "<ReturnClass>" for Return flight
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

    #iShares
    And I navigate to Shares Application
    And I enter valid shares credentials
    And I click on the shares Login Button
    And I click on terminal emulation
    Then I validate successful shares login
    Then I enter LOGC CMRE command for logging in
    And I enter BSIA command for signing in
    And I enter BSO command for sign out
    And I enter BSIA command for signing in
    And I enter W* command to check lniata of the session
    And I enter BSIA command for signing in
    And I retrieve the pnr
    And I enter *ET command to display all the tickets in the PNR
    And I enter T_ET|USED command to change the specific segment to CM-USED status "<segNumber>"
    And I enter *ET command to display all the tickets in the PNR
    And I retrieve the pnr
    And I enter ZAFIL command to change segment status to flown "<Segment>"
    And I retrieve the pnr

    #GUI
    And I navigate back to previous tab in the browser "<Tab>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<Destination>" and "<OriginCity>"
    And I enter Start Date "<StartDate1>" for one way booking
    And I click search button in flight search availability
    And I select specific class "<originClass>" for Origin flight in Economy Class
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary reissue with penalty and pricing option as "<PricingOption>" and "<penalty>"
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab

    #iShares
    And I navigate back to previous tab in the browser "<Tab1>"
    And I retrieve the pnr
    And I enter *ET command to display all the tickets in the PNR
    And I enter *EH command to display the ETKT history
    And I logout from Shares application

    #GUI
    And I navigate back to previous tab in the browser "<Tab>"
    And I navigate to home screen
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | ReturnDate | StartDate1 | SegmentDelete | Adult | Child | INS | INF | originClass | PaymentType | ReturnClass | segNumber | Tab | ticketStatus | ticketStatus1 | PricingOption   | Segment | Tab1 | Tab1 | penalty |
      | PTY ATO     | USD      | PTY        | BOG         | 01 days   | 14 days    | 17 days    | 1             | 1     | 0     | 0   | 0   | Q           | Cash        | Q           | 1         | 1   | CM USED      | EXCHANGED     | Price as Booked | 1       | 0    | 1    | 120     |


