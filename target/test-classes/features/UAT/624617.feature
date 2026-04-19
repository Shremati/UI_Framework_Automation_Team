#Description:
#Create a PNR in POS PTY-ATO, 2ADT, 1 CHD
#Route: PTYMDZ RT / Economy Classic / USD
#Process the payment in Cash
#Add seats with cost (5,6,7, ABC) for all passengers
#Make a involuntary reissue to leave 2 days later
#save Quote ID
#Delete old segments, procces check out from the Store Quote ID
#Add similar seats and pay with the EMDs of seats
#

@Reissue
Feature: 624617 - Involuntary reissue in the same class when seats are paid

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624617 - Involuntary reissue in the same class when seats are paid

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
    And I enter Start Date "<StartDate>" and Return Date "<returnDate>" for two way booking
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option as "<PricingOption>"
#    And I select pricing option as Economy Classic
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
#    And I click the Tickets tab
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I navigate to home screen
    And I click the order tab
#    And I navigate to Order tab
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I check the EMDs in EMD tab
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate1>" and Return Date "<returnDate1>" for two way booking
    And I click search button in flight search availability
    And I select the booked class for the origin flight
    And I select the booked class for the return flight
    And I select Book from Actions Dropdown
    And I Delete All the Old Segments
    And I perform the Involuntary Reissue for new segment
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I check the EMDs in EMD tab
    And I navigate to Order tab
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I choose two mode of payments
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I make the second payment by selecting the payment type as "<PaymentType2>"
    And I enter the details in the email recipients page
#    And I validate if the payment is successful
    And I store the updated emd and ticket details and validate if payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I select Sales Report and Agent Sales Report
#    And I validate EMD values in Agent Sales Report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I logout from COPA GUI application

    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | returnDate | StartDate1 | returnDate1 | Adult | Child | INF | INS | PaymentType | originClass | PaymentType1 |PaymentType2  |PricingOption|
      | PTY ATO     | USD      | PTY        | MDZ         | 05 Days   | 06 Days    | 08 Days    | 09 days     | 2     | 1     | 0   | 0   | Cash        | Economy     | EMD          |CASH_AFTER_EMD|Economy Classic|