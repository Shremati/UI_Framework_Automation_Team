#| Step Name       | Description                                                                                                                                                             | Expected Result
#| 1               | POS: GIG-ATO  /  USD                                                                                                                                                    |
#|                 |                                                                                                                                                                         |
#| 2               | PNR: 1 ADT  /  Prefer Presidential  /   GIG-GYE  /  Any date  /  OW   /  Business Full                                                                                  |
#|                 |                                                                                                                                                                         |
#| 3               | Enter the "Check-In" module                                                                                                                                             |
#|                 |                                                                                                                                                                         |
#| 4               | Enter flight number, date and click "Search"                                                                                                                            |
#|                 |                                                                                                                                                                         |
#| 5               | Perform a search by name, select the passenger and click "Proceed to Check In"                                                                                          |
#|                 |                                                                                                                                                                         |
#| 6               | Complete ADC/APIS, click "Submit" and then "Done"                                                                                                                       | After clicking "Done", the system should return to the Check-In screen. -Check that the "Doc Check" icon is green -Check that the passenger data and PNR are correct
#|                 |                                                                                                                                                                         |
#| 7               | Select the passenger and click on "Check In"                                                                                                                            |
#|                 |                                                                                                                                                                         |
#| 8               | In the confirmation pop-up window, click "Return to Check In"                                                                                                           |
#|                 |                                                                                                                                                                         |
#| 9               | Click on the baggage icon                                                                                                                                               |
#|                 |                                                                                                                                                                         |
#| 10              | Add baggage in the following order: 1. Standard 32kg 2. Standard 32kg 3. Standard 32kg 4. Standard 32kg 5. Standard 35kg + Oversized (Select the Oversized baggage box) | The system should display: 1. Free 2. Free 3. Free 4. 200 usd (additional bag) + 100 usd (overweight) + tax 5. 200 usd (additional bag) + 200 usd (overweight) + 150 usd (oversize) + tax
#|                 |                                                                                                                                                                         |
#| 11              | Proceed to pay (FOP: Cash) and complete Check in                                                                                                                        |
#|                 |                                                                                                                                                                         |
#| 1               | POS: GIG-ATO  /  BRL                                                                                                                                                    |
#|                 |                                                                                                                                                                         |
#| 2               | PNR: 1 ADT  /  Prefer Presidential  /   MAO-SJO  /  Any date  /  RT   /  Economy Classic Flex                                                                           |
#|                 |                                                                                                                                                                         |
#| 3               | Enter the "Check-In" module                                                                                                                                             |
#|                 |                                                                                                                                                                         |
#| 4               | Enter flight number, date and click "Search"                                                                                                                            |
#|                 |                                                                                                                                                                         |
#| 5               | Perform a search by name, select the passenger and click "Proceed to Check In"                                                                                          |
#|                 |                                                                                                                                                                         |
#| 6               | Complete ADC/APIS, click "Submit" and then "Done"                                                                                                                       | After clicking "Done", the system should return to the Check-In screen. -Check that the "Doc Check" icon is green -Check that the passenger data and PNR are correct
#|                 |                                                                                                                                                                         |
#| 7               | Select the passenger and click on "Check In"                                                                                                                            |
#|                 |                                                                                                                                                                         |
#| 8               | In the confirmation pop-up window, click "Return to Check In"                                                                                                           |
#|                 |                                                                                                                                                                         |
#| 9               | Click on the baggage icon                                                                                                                                               |
#|                 |                                                                                                                                                                         |
#| 10              | Add baggage in the following order: 1. Standard 23kg 2. Standard 32kg 3. Standard 35kg + Oversized (Select the Oversized baggage box) 4. Standard 23kg                  | The system should display: 1. Free 2. 150 usd (additional bag) + 100 usd (overweight) + tax 3. 150 usd (additional bag) + 200 usd (overweight) + 150 usd (oversize) + tax 4. 150 usd (additional bag)
#|                 |                                                                                                                                                                         |
#| 11              | Proceed to pay (FOP: Cash) and complete Check in                                                                                                                        |
#|                 |                                                                                                                                                                         |
#| 12              | Verify that all EMDs have been generated correctly.                                                                                                                     |
#|                 |                                                                                                                                                                         |
#| 12              | Verify that all EMDs have been generated correctly.                                                                                                                     |
#|                 |                                                                                                                                                                         |

@UAT
Feature: 630795 - EQP-030 Validation of baggage calculation according to "ConnectMiles Presidential" status and "Business Full" fare

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 630795 - EQP-030 Validation of baggage calculation according to "ConnectMiles Presidential" status and "Business Full" fare

#GUI
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I add "<FQTV>" frequent flyer Presidential passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for the first connecting segment flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter Passport FOID details
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I select ADC bypass and give the bypass reason "<reason>"
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    And I click on Return to Check-In
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage "<BaggageNo2>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage "<BaggageNo3>" and  "<BaggageWeight>"
    And I click add another baggage
    And I add standard baggage with Overweight for fifth bag "<BaggageNo4>" and  "<BaggageWeight1>"
    And I click on Submit and Proceed to Pay with Foid details
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I select the passengers in checkin page using "<searchType1>"
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the EMD subtab and view the baggage details in tickets tab
    And I select sales report and select Agent sales report
    And I validate EMD values and validate baggage details in Agent sales report
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency |OriginCity   |Destination |StartDate|Adult|Child|INF|INS|FQTV|BaggageNo |BaggageNo1|BaggageNo2|BaggageNo3|BaggageNo4|ticketStatus|BaggageWeight|BaggageWeight1|PaymentType|originClass|searchType|searchType1|segmentIndex|reason            |PricingOption |printer      |printerStatus|
      |GIG ATO    |BRL      |GIG          |GYE         |01 days  |0    |0    |0  |0  |1   |1         |2         |3         |4         |5         |CHECKED-IN  |32           |35            |CASH       |Business   |Name      |PNR        |0           |DOUBLE NATIONALITY|Business Full |US-5CD4377SFF|PrintReady   |
