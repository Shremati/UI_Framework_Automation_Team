#| Step Name       | Description                                            | Expected Result
#| 1               | POS: SJO-ATO  SJO-MIA RT Price as Book 1 adult 2 child |
#|                 |                                                        |
#| 2               | Quote New tickets                                      |
#|                 |                                                        |
#| 3               | Enter Passenger Details                                |
#|                 |                                                        |
#| 4               | Issue reservation FOP:CASH                             |
#|                 |                                                        |
#| 5               | Reissue Segments : SJO-MIA in different dates          |
#|                 |                                                        |
#| 6               | Issue New Quote                                        |
#|                 |                                                        |
#| 7               | Select "Store Quote ID"                                |
#|                 |                                                        |
#| 8               | Erase Old segments, and Select "Vol Re-Issue"          |
#|                 |                                                        |
#| 9               | Complete the payment with FOP: VISA                    |
#|                 |                                                        |
#| 10              | Check the New Tkt info and the EMD information.        |
#|                 |                                                        |
#| 11              | Log in as FLX User and repeat all steps.               |
#|                 |                                                        |


@Reissue
Feature: 624591 - Reissue reservation 1ADT, 2CHD, SJO-MIA RT

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624591 - Reissue reservation 1ADT, 2CHD, SJO-MIA RT

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
    And I select child passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select class "<originClass>" for the second connecting segment flights
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
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details
    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate2>" for one way booking
    And I click search button in flight search availability
    And I select class "<originClass>" for the first connecting segment flight
    And I select Book from Actions Dropdown and give the segment numbers as "<segments>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I store the updated emd and ticket details and validate if payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate the EMD values in Agent Sales Report after changes
    And I logout from COPA GUI application


    Examples:

      | salesOffice | currency | OriginCity | Destination | StartDate | StartDate1 | StartDate2 | PaymentType | PaymentType1 | Adult | Child | INF | INS | originClass | segments | PricingOption   | TicketStatus1 | SegmentDelete |
      | SJO ATO     | USD      | SJO        | MIA         | 07 days   | 09 days    | 05 days    | CASH        | AMEX         | 1     | 2     | 0   | 0   | Economy     | 34       | Price as Booked | EXCHANGED     | 1             |



