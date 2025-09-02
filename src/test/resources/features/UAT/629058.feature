#Description:
#Check-in all passangers in a flight from ATO PTY and delay the flight.
#Go to the compensation module
#Search by the affected flight
#Select at least 50 passangers
#Start the compensation process for iCoupon
#Display the results
#
#Expected:
#Must allow to compensate at least 50 passangers when generating an iCoupon.

@UAT
Feature: 629058 - Compensate 50 passangers in iCoupon after a flight delay

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 629058 - Compensate 50 passangers in iCoupon after a flight delay

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
    And I select the printer "<printer>" and "<printerStatus>"

    And I navigate to the User provisioning Tool page
    And I enter User Id and click on search in user provisioning page
    And I select POS and set status of the iCoupon in User Provisioning tool page "<iCouponStatus>"
    And I navigate to home screen

    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I add same surname to "<PaxCount>" passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
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
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I add free standard baggage for all the passenger "<BaggageWeight>"
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<segmentIndex>" in Gate section
    And I try to retrieve the ticket number by selecting "<searchType>" option
    And I check the flight status in gate model and delay the flight "<FlightStatus>"
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<segmentIndex>" in Gate section
    And I verify the flight status is displayed as "<FlightStatus>"
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I enter Order Id and select compensation reason for the passenger "<compensationReason>" and "<PassengerType>"
    And I select required passengers and click the issue compensation button
    And I select passengers click print button and click digital voucher button
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType1>"
    And I click the EMD Available for Print tab and click print button
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | Adult | Child | INS | INF | printer  | printerStatus | originClass | PaymentType | PaxCount | PassengerType      | PassengerType1 | iCouponStatus | FlightStatus | ticketStatus | segmentIndex | searchType | BaggageWeight | PricingOption   | compensationReason         |
      | PTY ATO     | USD      | PTY        | BOG         | 01 days   | 5     | 0     | 0   | 0   | MAHAC-NB | PrintReady    | Economy     | Cash        | 5        | All Passenger List | Print List     | Assign        | Delayed      | CHECKED-IN   | 0            | Name       | 23            | Economy Classic | Delay between 2 to 3:59hrs |


