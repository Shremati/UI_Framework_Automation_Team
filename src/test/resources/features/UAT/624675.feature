#Description:
#1. Sign in Sales agent
#- Search for BULK order issued.
#- Trip: Round Trip.
#- Economic cabin
#- Passenger: 1 Adt or +.
#2. Modifications:
#- Change flight and date. (note: Bulk fare maximo stay is 21 days if issued central or south america).
#- Same class booked.
#3. Quote.
#- Select Price as Business Promo.
#- Note: Result of this action must be Manual reissue.
#4. Add service fee D98 PENALTY FEE 125.00 USD.
#- Charge each passenger with the penalty fee.
#5. Pay for the voluntary change.
#- Form of payment: two credit card.
#- Visa 4444333322221111 exp 1219 approval 12324 for 50.00 USD.
#- Master Card 5555555555554444 exp 1220 approval 4321 for rest of the amount.
#6. Synchronize the order.
#- Add OSI "Passenger request change date and flight"
#- Add OSI "Adv pax pnlty 125.00 usd."
#7. Assign Seat:
#- Select free seat middle and aisle for all segments.
#8. Sale report.
#- Verify sales report display the same form of payment selected and amount.
#9. Send a etkt receipt for penalty fee.

@Reissue
Feature: 624675 - Reissue ticket with new date and flights for bulk ticket (BT)

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624675 - Reissue ticket with new date and flights for bulk ticket (BT)

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
    And I select class "<originClass>" for Origin flight
    And I select class "<ReturnClass>" for Return flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I click BulkTicket option
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination2>"
    And I enter Start Date "<NewDate1>" and Return Date "<ReturnDate1>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for Origin flight
    And I select class "<ReturnClass>" for Return flight
    And I select Book from Actions Dropdown and give the segment numbers as "<segments>"
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary reissue with penalty and pricing option as "<PricingOption1>" and "<penalty>" and "<taxCode>"
    And I click on pay button by selecting the required payment type "<PaymentType2>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful

    And I add OSI remarks in order tab "<OSIRemark>"
    And I add OSI remarks in order tab "<OSIRemark1>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I navigate to home screen
    And I click the tickets tab and click ticket EMD tab verify the segment name status "<NameStatus>"


    And I navigate to home screen
    And I click the order tab
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
#    And I assign seats to the passengers in Services tab
#    And I Click on CheckOut button for payment
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | Destination2 | penalty | taxCode | StartDate | ReturnDate | NewDate1 | ReturnDate1 | Adult | Child | INS | INF | segments | originClass | ReturnClass | PaymentType | PaymentType2 | SegmentDelete | OSIRemark                                | OSIRemark1               | ticketStatus | NameStatus             | PricingOption   | PricingOption1 |
      | JFK ATO     | USD      | PTY        | BOG         | GYE          | 125     | D98     | 10 days   | 20 days    | 13 days  | 18 days     | 1     | 0     | 0   | 0   | 34       | Economy     | Economy     | Cash        | VISA         | 1             | Passenger request change date and flight | Adv pax pnlty 125.00 usd | EXCHANGED    | DOCUMENT AMENDMENT FEE | Price as Booked | Business Promo |


