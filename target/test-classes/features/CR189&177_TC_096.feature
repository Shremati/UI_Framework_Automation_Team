#Description:
#Create a New Booking
#POS: GRU currency: BRL Sign in Role: Agent and Sale Channel: CC
#1. Route:
#PTY- BOG
#BOG - PTY
#PTY-MEX
#MEX-PTY
#PTY-LAX
#LAX-PTY
#Round Trip .
#- Economic Cabin: Q, if not any other.
#-Do price quote without pax 2 Adt
#-Enter traveler information
#- Click Book&FileFare
#-In the payment page select payment type - Credit card + EMD
#-Select MASTER CARD
#-Click Pay
#2. Payment Type-Ticket:
#-Go To Tickets Tab and click Ticket Hyper link
#-Go To Payment - Type
#3. Change the POS to USD
#4. Change the class to Y or J
#5. Perform Involuntary reissue
#6. Validate the quote has penalty
#7. Pay for the add collect using Credit card
#8. Validate the sales reporting


@VIR
Feature: CR189&177_TC_096 - Conjunctive Involuntary ETKT EXCHANGE in USD - Different POS
  Background:

    Given COPA GUI Application is launched in the browser
  Scenario Outline: CR189&177_TC_096 - Conjunctive Involuntary ETKT EXCHANGE in USD - Different POS
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I create PNR to get Residual EMD value
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select Adult passengers and search for flights
    And I select specific class "<COS>" for Origin flight in Economy Class
    And I select specific class "<COS>" for Return flight in Economy Class
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
    And I want to pay using residual emd
    And I perform Involuntary Refund for specific segment "<segment>" with Reason Code as "<ReasonCode>" and Refund Reason Code as "<ReissueCode>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click and view the Tickets tab for residual emd refund
    And I check the EMDs in EMD tab
    And I created Residual EMD successfully

    And I create the passengers data
    And I add "<Adult1>" adult passengers
    And I want to display all the passengers
    And I navigate to home screen
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" for one way booking
    And I add segment from and to City "<OriginCity2>" and "<Destination2>"
    And I enter Start Date "<StartDate2>" for 2nd Segment
    And I add third segment from and to City "<OriginCity3>" and "<Destination3>"
    And I enter Start Date "<StartDate3>" for 3rd Segment
    And I add fourth segment from and to City "<OriginCity4>" and "<Destination4>"
    And I enter Start Date "<StartDate4>" for 4th Segment
    And I add fifth segment from and to City "<OriginCity5>" and "<Destination5>"
    And I enter Start Date "<StartDate5>" for 5th Segment
    And I add sixth segment from and to City "<OriginCity6>" and "<Destination6>"
    And I enter Start Date "<StartDate6>" for 6th Segment
    And I select Adult passengers and search for flights
    And I select specific class "<originClass>" for Origin flight in Economy Class
    And I select specific class "<ReturnClass>" for Return flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose two modes of payment where the first payment is 20% and the second payment is 80%
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I make the second payment by selecting the payment type as "<PaymentType2>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I navigate to home screen
    And I click the order tab
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I change the class of seat "<COS1>" for the multiple segment "<Segment>"
    And I change the class of seat "<COS1>" for the multiple segment "<Segment1>"
    And I change the class of seat "<COS1>" for the multiple segment "<Segment2>"
    And I change the class of seat "<COS1>" for the multiple segment "<Segment3>"
    And I change the class of seat "<COS1>" for the multiple segment "<Segment4>"
    And I change the class of seat "<COS1>" for the multiple segment "<Segment5>"
    And I perform Involuntary Reissue for multiple segments "<segment6>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueCode>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus2>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report


    Examples:
      | salesOffice                   | currency | salesOffice1 | currency1 | Adult | Adult1 | COS | OriginCity | Destination   | OriginCity1 | Destination1 | OriginCity2 | Destination2 | OriginCity3 | Destination3 | OriginCity4 | Destination4 | OriginCity5 | Destination5 | OriginCity6 | Destination6 |StartDate |ReturnDate | StartDate1 | StartDate2 | StartDate3 | StartDate4 | StartDate5 | StartDate6 | originClass | PricingOption    | PaymentType | PaymentType1 | PaymentType2 | ReturnClass | segment | ReasonCode     | ReissueCode | COS1 | Segment | Segment1 | Segment2 | Segment3 | Segment4 | Segment5 | segment6 | ticketStatus2 | TicketStatus1 |
      | GRU - CALL CENTER WEB CTO     | BRL      | PTY ATO      | USD       | 1     | 2      | C   | PTY        | BOG           | PTY         | BOG          | BOG         | PTY          | PTY         | MEX          | MEX         | PTY          | PTY         | LAX          | LAX         | PTY          |06 days   | 07 days   | 06 days    | 07 days    | 08 days    | 09 days    | 10 days    | 11 days    | Q           | Price as Booked  | CASH        | EMD          | MASTERCARD   | Q           | 12      | WPEN INAD/DEPU | Involuntary | Y    | 1       | 2        | 3        | 4        | 5        | 6        | 123456   | EXCHD IRR     | OPEN          |