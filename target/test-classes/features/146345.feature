#Description:
#1. Sign in with sales agent user in CTO CDE select the currency USD and search availability for booking:
#- Route: SJO to LIM
#- Trip: ROUND TRIP
#- Dates: select any dates (departure or arrival: today, tomorrow, within 3 days, 1 week, 1 month, 9 month)
#- Class: Y
#- Traveler type: 1ADT
#2. Quote: AS BOOKED
#- Confirm sequence and segments for pricing
#- Pricing option: AS BOOKED
#- Verify Baggage allowance information for ALL Segment
#3. Quote: BEST BUY
#- Confirm sequence and segments for pricing
#- Pricing option: BEST BUY
#- Verify Baggage allowance information for ALL Segment


@VIR
Feature: 146345 - Validate-Baggage allowance information
  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: 146345 - Validate-Baggage allowance information

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select Adult passengers and search for flights
    And I select specific class "<COS>" for Origin flight in Economy Class
    And I select specific class "<COS>" for Return flight in Economy Class
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I Verify Baggage allowance information for All Segments along with Price Quote
    And I try to click on Back button
    And I select pricing option as best buy after clicking back button
    And I select the Quote Options and click on Next
    And I Verify Baggage allowance information for All Segments along with Price Quote


    Examples:
      | salesOffice                | currency | OriginCity | Destination | StartDate |  ReturnDate  |  Adult |  PricingOption    |  PricingOption1 | ReturnClass    | COS  |
      | PTY CTO COSTA DEL ESTE     | USD      | SJO        | LIM         | 01 days   |  05 days     |  1     |  Price as Booked  |  Best buy       | Economy        | Y    |
