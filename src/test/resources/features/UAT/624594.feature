#date the system calculate correctly penalty for change with add collect.Create and issue new ORDER, then change route and class.
#Apply voluntary reissue with additional collect.
#Step No 1. Create and issue ORDER.
#1. Sign in Sales agent with USD currency- Currency USD.
#- Travel: Round Trip.- Flight: Departing next thursday returning 19 days after departure.
#- Departing from JFK to UIO- economic cabin
#- Passenger: 1 Adt.
#2. Quote.
#- Select a fare that has penalty for change.
#- Price as best buy option.
#3. Traveler informations:
#- Passenger Last name smith, first name: Adulto.
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#4. Issue the reservations.
#- Form of payment: One credit card.
#- Master Card 5555555555554444 exp 1220 approval 4321.
#5. Assign Seat:- Select free seat window for all segments.
#6. Sale report.- Verify sales report display the same form of payment selected and amount.
#Step No 2. Change route and class voluntary reissue.
#7. Display order previous created.
#8. Modifications:-
#Change route (IAD to EZE round trip), class and date.
#- Departing next Tuesday returning 19 days after departure.
#9. Quote.- Price as best buy.
#10. Reissue the reservations.
#- Form of payment: one credit card.
#- Amex 343434343434343 exp 1219 CVV 6666.
#11.Assign Seat:- Select free seat window for all segments.
#12. Sale report.
#- Open sales report display transaction with new ticket and ticket exchanged.

@Reissue
Feature: 624594 - Even Exchange with Add Collect-without Penalty

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624594 - Even Exchange with Add Collect-without Penalty

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
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<ReturnClass>" for the second connecting segment flights
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
    And I click the EMD subtab and view the EMD details
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<NewDate1>" and Return Date "<ReturnDate1>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<ReturnClass>" for the second connecting segment flights
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue
    And I click on pay button by selecting the required payment type "<PaymentType2>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I navigate to home screen
    And I click the tickets tab and click ticket EMD tab verify the segment name status "<NameStatus>"
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
#    And I choose one mode of payment
#    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the services Tab to validate the seats
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I navigate to home screen
    And I click on Tools Menu
    And I click on Native Shares
    And I retrieve the pnr in Native shares
    And I enter *EH command to show passenger history in Native shares
    And I click on Cancel button in native shares
    And I logout from COPA GUI application


    Examples:
      | salesOffice | currency | OriginCity | Destination | OriginCity1 | Destination1 | StartDate | ReturnDate | NewDate1 | ReturnDate1 | Adult | Child | INS | INF | printer  | printerStatus | originClass | ReturnClass | PaymentType | PaymentType1 | PaymentType2 | SegmentDelete | ticketStatus | NameStatus             | PricingOption     |
      | JFK ATO     | USD      | JFK        | UIO         | IAD         | EZE          | 08 days   | 27 days    | 09 days  | 28 days     | 1     | 0     | 0   | 0   | MAHAC-NB | PrintReady    | Economy     | Economy     | MASTERCARD  | Cash         | AMEX         | 1             | EXCHANGED    | DOCUMENT AMENDMENT FEE | Price as Best Buy |


