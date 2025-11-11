#Description:
#1. Create a new reservation in the GUI
#- PTY - SJO round
#-type: trip route
#- Passengers: 2
#- Economy Class:
#- Classic Economy fare family (V).
#2. Quote:
#- Confirm sequence and segments for pricing
#- Pricing option: AS BOOK
#3. Enter traveler details:
#- Fill all travelers Informations (Name, email, gender, nationality and personal/emergency contacts)
#5. Show fare families in availability display
#- Validate that the families of rates appear in the order, summary display and services.
#6. Add a SSR:
#- WCHR for 1 ADT in all segments
#7. Payment:
#MASTERCARD
#8. Assign premium seats to all passengers in all segments
#10. Reissue ticket to new route
#- PTYGRU (new dates)
#- Select Classic fare family
#11. Validate penalty for change and add collect if apply
#12. Resissue ticket with Visa FOP

@Reissue
Feature: 624653 - Validate the system calculate correctly penalty for change with add collect

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624653 - Validate the system calculate correctly penalty for change with add collect

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
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    And I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I add a service "<ServiceType>" in cabin for specific passenger "<PaxNo>"
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to Order tab
    And I click the services Tab
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I navigate to Order tab
    And I click the services Tab
    And I click on seat icon from services tab
    And I select Seat for all passengers
    And I Click on CheckOut button for payment
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I navigate to Order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate>" and Return Date "<returnDate>" for two way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for Origin flight
    And I select class "<originClass>" for Return flight
    And I select Book from Actions Dropdown
    And I Delete All the Old Segments
    And I click on Action drp dwn for Vol reissue
    And I click on CheckOut button and Reissue for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
#    And I click on Ticket tab and check the "<ticketStatus>" status
#    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I logout from COPA GUI application

    Examples:
      |salesOffice               |currency|OriginCity  |Destination  |OriginCity1|Destination1|StartDate|returnDate|Adult|Child|INF|INS|PaymentType      |originClass|PaymentType1|PaxNo          |ticketStatus|ticketStatus1|ServiceType           |
      |PTY COPA CLUB             |USD     |PTY         |SJO          |PTY        |GRU         |02 Days  |05 Days   |2    |0    |0  |0  |MASTERCARD       |Economy    |VISA        |1              |Open        |EXCHANGED    |WCHR                  |
