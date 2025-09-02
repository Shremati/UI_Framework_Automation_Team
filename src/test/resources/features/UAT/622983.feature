#Description:
#Open the flight, search for the CHD passenger, and press 'Proceed to Check In' (Check-In Module)
#Complete ADC/APIS, press 'Submit' and 'Done
#Press the luggage icon
#In 'Select Product', choose 'Catalog
#Select 'STROLLER OR PUSHCHAIR' and enter a weight of 10kg
#Press 'Submit'
#Press 'Continue'
#Select the ADT + INF
#Select the luggage icon again
#In 'Select Product', choose 'Catalog'
#Select 'INFANT CAR SEAT' and 'STROLLER OR PUSHCHAIR', and enter a weight of 10kg
#Press 'Submit'
#
#  Expected:
#The stroller should be displayed as FREE
#The car seat and stroller should be displayed as FREE

@UAT
Feature: 622983 - Verify Validate the addition of an infant's car in the ADT+INF/CHD reservation is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 622983 - Verify Validate the addition of an infant's car in the ADT+INF/CHD reservation is happening correctly

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
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select infant without seat passengers
    And I select child passengers
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
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<EMDStatus>"
    And I navigate to home screen
    And I navigate to Check-In page
    And I search for the segment "<SegmentIndex>" in Check-In page
    And I select specific child passenger in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I try to select or unselect the checkbox
    And I try to click baggage for required passenger "<PaxType>"
    And I add catalog baggage "<BaggageType>" and "<baggageNo>" and "<baggageWeight>"
    And I try to click submit and continue button
    And I try to select or unselect the checkbox
    And I try to click baggage for required passenger "<PaxType1>"
    And I add catalog baggage "<BaggageType>" and "<baggageNo>" and "<baggageWeight>"
    And I click add another baggage
    And I add catalog baggage "<BaggageType1>" and "<baggageNo1>" and "<baggageWeight>"
    And I try to click submit and continue button
    And I try to select or unselect the checkbox
    And I try to select or unselect the checkbox
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the EMD subtab and view the baggage details in tickets tab
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | PricingOption   | PaymentType | Adult | Child | INF | INS | originClass | TicketStatus | printer     | printerStatus | EMDStatus | PaxType | PaxType1          | ticketStatus | BaggageType           | baggageNo | baggageWeight | baggageNo1 | BaggageType1    |SegmentIndex|searchType|
      | PTY ATO     | USD      | PTY        | MDE         | 01 days   | Price as Booked | CASH        | 1     | 1     | 1   | 0   | Economy     | Open         | MAHAC-NB    | PrintReady    | Flown     | Child   | Adult With Infant | CHECKED-IN   | STROLLER OR PUSHCHAIR | 1         | 10            | 2          | INFANT CAR SEAT |0           |Name      |
