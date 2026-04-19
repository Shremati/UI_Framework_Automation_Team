#Description:
#1. Ticket Issuance:
#- Login in POS: MEX CTO and MXN Currency
#- Route: round trip PTY-MEX
#- Class: Economy Price as booked
#- Pax: 2 ADLT- Do Best buy
#- Enter Traveler Information and email for both passenger and click Book & File Fare
#- Use FOP: CC amex
#- Click Pay
#- Enter valid Email for both passenger
#2. InVoluntary refund
#- Select InVoluntary refund ,update process Refund and reason code
#-Click add to order proceed to checkout
#- Enter valid Email for both pax and click Email
#-Validate the Email is sent to both Recipients
#–validate the ticket status is refund

@VIR
Feature: 14954_02 - Verify the refund notification sent to all email recipients
  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: 14954_02 - Verify the refund notification sent to all email recipients
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
    And I select pricing option as best buy
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page for both passengers
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I navigate to home screen
    And I click the order tab
    And I perform Involuntary Refund for specific segment "<segment>" with Reason Code as "<ReasonCode>" and Refund Reason Code as "<ReissueCode>"
    And I enter the details in the email recipients page for both passengers
    And I validate if the payment is successful
    And I click and view the Tickets tab for residual emd refund
    And I check the EMDs in EMD tab


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | Adult | ReturnDate   | PaymentType   |  COS | segment | ReasonCode     | ReissueCode |
      | MEX CTO     | MXN      | PTY        | MEX         | 02 days   | 2     | 03 days      | AMEX          |  Y   | 12      | WPEN INAD/DEPU | Involuntary |