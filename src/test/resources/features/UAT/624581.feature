#Description:
#1. Sign in with sales agent
#
#- Select currency USD
#2. Go to Create New Order Screen and Search availability:
#- Route: from PTY to Central America
#- Trip: Round trip
#- Dates: departing next month and returning within 2 weeks
#- Departure class: E
#- Returning class: E
#- Traveler type: 1ADT
#3. Quote:
#- Confirm sequence and Dsegments for pricing
#- Pricing option: Price as booked
#4. Enter traveler details:
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#5. Issue the reservation:
#- Form of payment:
#
#- Payment 1: CASH
#6. Print ETKT from payment screen:
#- Validate that the ETKT replace "ITINERARY NOT VALID FOR TRAVEL" by "ITINERARY BASIC ECONOMY"
#7. Search the availability of new flights for the Reissue of the reservation and book:
#- Route: Same Route
#- Dates: original dates of the reservation
#- Departure class: D
#- Returning class: D
#8. Execute Voluntary Manual Reissue:
#- Calculate new fare, taxes and add to order (farebasis must be PROMO BUSINESS)
#9. Pay reissue manual quote:
#- Payment 1: Credit card MASTER CARD
#10. Print ETKT from payment screen:
#- Validate that the ETKT replace "ITINERARY BASIC ECONOMY" by "ITINERARY PROMO BUSINESS"

@UAT
Feature: 624581 - 148111 - Validate ETKT when make a manual reissue

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624581 - 148111 - Validate ETKT when make a manual reissue

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
    And I select pricing option as "<pricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click on View button and check the Ticket details
    And I navigate to Order tab
    And I click the Tickets tab
    And I navigate to Order tab
    And I change the class of seat "<class>" for the required segment "<Segment>"
    And I change the class of seat "<class>" for the required segment "<Segment1>"
    And I perform Voluntary Reissue with Circle trip and Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I send email in tickets tab
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | ReturnDate | Adult | Child | INS | INF | originClass | ReturnClass | PaymentType | class | pricingOption   | Segment1 | Segment | PricingOption1 | PaymentType1 | ticketStatus |
      | PTY ATO     | USD      | PTY        | MDE         | 30 days   | 45 days    | 1     | 0     | 0   | 0   | E           | E           | Cash        | D     | Price as Booked | 2        | 1       | Business Promo | MASTERCARD   | EXCHANGED    |
