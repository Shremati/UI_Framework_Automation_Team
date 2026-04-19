#Description:
#Pre-Condition:
#Order ID with one adult Passenger - international segment (FBA – 1).
#L class – Silver status passenger.
#Check-in Passenger with three 23 KG standard bags from Kiosk.
#
#Steps:
#1. Login to GUI and go to Check-in module
#2. Enter order ID and click on Proceed to check-in
#3. Complete ADC/APIS and click on done.
#4. In Check-in screen -> click on baggage icon.
#5. In Baggage calculator screen -> add one 23KG standard bag
#6. Click Submit.
#7. Validate price for the bag
#8. Complete payment and check-in process.

@VIR
Feature: 15658_01 - GUI must match the existing EMD with the previously checked in bag and show the price for the newly added bag.
  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: 15658_01 - GUI must match the existing EMD with the previously checked in bag and show the price for the newly added bag.

    Then I enter valid credentials to log into COPA GUI application
Then I validate successful login
And I create the passengers data
    And I add "<FQTV>" silver frequent flyer passengers
And I want to display all the passengers
And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
And I select the printer "<printer>" and "<printerStatus>"
And I click on the Reservation section
And I click on New Order for creating new PNR in GUI
And Select from and to City "<OriginCity>" and "<Destination>"
And I enter Start Date "<StartDate>" for one way booking
And I select Adult passengers and search for flights
    And I select specific class "<COS>" for Origin flight in Economy Class
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
And I click the Tickets tab and try to click the Coupon number and verify the details
And I click the EMD subtab and view the EMD details
And I navigate to home screen
And I navigate to Check-In page
And I search the Order number in Checkin Page
And I click on Proceed to Check-In button
And I enter the details in Security Document Verification page
Then I Validate APIS Complete and click on Done button
And I click add Baggage icon
And I add standard baggage "<BaggageNo>" and  "<BaggageWeight>"
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight>"
    And I click on Submit and Proceed to Pay
    And I click on check-in for the passenger
    And I click on OKAY button in the confirmation popup
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I click add Baggage icon
    And I click add another baggage
    And I add standard baggage "<BaggageNo2>" and  "<BaggageWeight>"
    And I click on Submit and Proceed to Pay
    And I click on check-in for the passenger
    And I click on OKAY button in the confirmation popup
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I navigate to Order tab
    And I click on remarks link in order page
    And I click the services Tab
    And I logout from COPA GUI application


Examples:
| salesOffice | currency | OriginCity | Destination | StartDate | FQTV | BaggageNo1  | BaggageNo      | BaggageWeight | PaymentType | BaggageNo2  |  TicketStatus1  |  PricingOption   |  COS | printer      | printerStatus |
| PTY ATO     | USD      | PTY        | MDE         | 02 days   | 1    | 2           | 1              | 30            | CASH        | 3           | CHECKED-IN     |  Price as Booked |  V   | IN-PF2ST1T4  | PrintReady    |