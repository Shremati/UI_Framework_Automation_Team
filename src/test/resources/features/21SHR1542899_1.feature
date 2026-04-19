#Description:
#Prerequisite
#1. Create a booking for round-trip travel using non-stop flights.
#2. Price using the Best Buy
#3. Then issue the ticket
#
#Steps
#1. Retrieve the PNR and Change the outbound segment to a different flight for the same day.
#2.From the action dropdown select Involuntary Reissue.
#3.In the Process dropdown select “CHANGES”, in the Reason Code dropdown select “WPEN IRROPEARTHQUAKE” and in the Reissue Reason select “Involuntary”, then select price quote.
#4.Review the quote information
#5.From the reservations screen select the remarks tab and select the Saved Quote ID number
#6.From the reservations screen select the “Check Out” button
#7.From the payment screen select the “Pay” button
#8.Fill in the required email address and select the
#preferred language for the receipt, once completed
#select the “Email” button.
#9.Select the “Done” button.
#10.From the reservations screen select the “Tickets” tab.
#11.Verify the PNR in Shares for INVOL


@VIR
Feature: 21SHR1542899_1 - Verify Involuntary Reissue for Non-Stop flights with using a Round-trip fare with reason code “involuntary" has "INVOL" in endorsements
  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: 21SHR1542899_1 - Verify Involuntary Reissue for Non-Stop flights with using a Round-trip fare with reason code “involuntary" has "INVOL" in endorsements

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
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I click search button in flight search availability
    And I select specific class "<COS>" for Origin flight in Economy Class
    And I select Book from Actions Dropdown
    And I select and delete the segment "<segmentNo>"
    And I perform Involuntary Reissue for specific segment "<Segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueReasonCode>"
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I navigate to home screen
    And I click on Tools Menu in GUI application
    And I click on Native Shares
    And I retrieve the pnr in native shares
    And I check the ticket deatils and History in Native shares


    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate | Adult | ReturnDate   | PaymentType   |  COS | segmentNo | Segment | ReasonCode            | ReissueReasonCode | ticketStatus1 |
      | PTY ATO     | USD      | PTY        | MEX         | 02 days   | 1     | 03 days      | CASH          |  Y   | 1         | 1       | WPEN IRROP-EARTHQUAKE | Involuntary       | EXCHD IRR     |