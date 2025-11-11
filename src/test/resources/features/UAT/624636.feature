#Description:
#GARS4Q
#1. Sign in with sales agent user in COLOMBIA - BAQ CTO, select the currency COP and search availability for booking:
#- Route: from BAQ to MEX
#- Trip: ROUND TRIP
#- Dates: departing today, returning within 5 days
#- Class: L
#- Traveler type: 1ADT
#2. Quote:
#- Confirm sequence and segments for pricing
#- Pricing option: Price as booked
#3. Enter traveler details:
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#- Save the reservation quote
#4. Issue the reservation:
#- Form of payment:
#- Payment 1: MASTER CARD
#- Enter details of the passenger identification form (FOID details)
#- Send Eticket Receipt to all emails
#5. Wait 3 days for the flight status to be updated to USED

#6. Sign in MEXICO - MEX CTO, select the currency MXN and search the availability of new flights for the Reissue of the reservation and book:
#- Route: departure MEX-BAQ
#- Class: E.
#7. Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: Price as booked
#- Save and add quote to order
#8. Issue the reservation:
#- Form of payment:
#- Payment 1: VISA
#- Send Eticket Receipt to all emails

#9. Sign in MEXICO - MTY CTO, select the currency MXN and search the availability of new flights for the Reissue of the reservation and book:
#- Route: departure MTY-BAQ
#- Class: E.
#10. Quote the Voluntary Reissue:
#- Confirm sequence and segments for pricing
#- Pricing option: Price as booked
#- Validate the fare difference, save and add quote to order
#11. Issue the reservation:
#- Form of payment:
#- Payment 1: VISA
#- Send Eticket Receipt to all emails
#12. Display agent sale report:
#- Verify that the tickets and EMD created in the transaction are displayed correctly

@Reissue
Feature: 624636 - Verify ISSUE/REISSUE/OVER REISSUE - Create and issue reservation for 1ADT in COLOMBIA BAQ CTO (COP), pay with MASTER CARD, perform voluntary Reissue in MEXICO CTO MEX (MXN) pay reissue with VISA and perform Reissue over Reissue CTO MTY (MXN) pay reissue VISA is happening correctly

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624636 - Verify ISSUE/REISSUE/OVER REISSUE - Create and issue reservation for 1ADT in COLOMBIA BAQ CTO (COP), pay with MASTER CARD, perform voluntary Reissue in MEXICO CTO MEX (MXN) pay reissue with VISA and perform Reissue over Reissue CTO MTY (MXN) pay reissue VISA is happening correctly

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
    And I enter Start Date "<StartDate>" and Return Date "<StartDate1>" for two way booking
    And I select Adult passengers and search for flights
#    And I select class "<Class1>" for the first segment and "<Class1>" for the second segment in first connecting segment flight
#    And I select class "<Class1>" for the first segment and "<Class1>" for the second segment in second connecting segment flight

    And I select class "<Class1>" for the first segment and "<Class1>" for the second segment in first connecting segment non codeshare flight
    And I select class "<Class1>" for the first segment and "<Class1>" for the second segment in second connecting segment non codeshare flight
#    And I select class "<originClass>" for the first connecting segment non codeshare flight
#    And I select class "<originClass>" for the second connecting segment non codeshare flight
#    And I select class "<Class1>" for the first segment and "<Class1>" for the second segment in first connecting segment flight
#    And I select class "<Class1>" for the first segment and "<Class1>" for the second segment in second connecting segment flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<EMDStatus>"

#    #shares
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
    And I change all the segments status to "<TicketStatus1>" for the passengers "<NoOfPax>" "<Segments>"
    And I enter *ET command to display all the tickets in the PNR
    And I retrieve the pnr
    And I enter ZAFIL command to change segment status to flown "<Segment>"
    And I enter ZAFIL command to change segment status to flown "<Segments>"
    And I retrieve the pnr
    And I logout from Shares application

  #    #GUI
    And I navigate back to previous tab in the browser "<Tab1>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus3>" status
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details

    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<Destination>" and "<OriginCity>"
    And I enter Start Date "<StartDate2>" for one way booking
    And I click search button in flight search availability
#    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in first connecting segment flight
    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in first connecting segment non codeshare flight
    And I select Book from Actions Dropdown and give the segment numbers as "<Segments1>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary reissue with penalty and pricing option as "<PricingOption>" and "<PenaltyAmount>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab


    And I change the Sales Office and Currency "<salesOffice2>" and "<currency1>"
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate3>" for one way booking
    And I click search button in flight search availability
    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in first connecting segment flight
    And I select Book from Actions Dropdown and give the segment numbers as "<Segments1>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary reissue with penalty and pricing option as "<PricingOption>" and "<PenaltyAmount>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I validate the Tax Details in Agent sales report by checking the issued currency
    And I logout from COPA GUI application



    Examples:

      | salesOffice | currency | salesOffice1 | currency1 | salesOffice2 | OriginCity | Destination | OriginCity1 | Destination1 | StartDate | StartDate1 | StartDate2 | StartDate3 | PricingOption   | PaymentType | PaymentType1 | Adult | Child | INF | INS | TicketStatus | EMDStatus | SegmentDelete | TicketStatus1 | TicketStatus2 | TicketStatus3 | NoOfPax | Segments | Segment | Class1 | Class2 | Tab1 | Segments1 | PenaltyAmount |originClass|
      | BAQ CTO     | COP      | MEX CTO      | MXN       | MTY CTO      | BAQ        | MEX         | MTY         | BAQ          | 01 days   | 09 days    | 35 days    | 61 days    | Price as Booked | MASTERCARD  | VISA         | 1     | 0     | 0   | 0   | Open         | Flown     | 2             | CM USED       | EXCHANGED     | FLOWN         | 1       | 2        | 1       | L      | E      | 1    | 34        | 100           |Economy    |