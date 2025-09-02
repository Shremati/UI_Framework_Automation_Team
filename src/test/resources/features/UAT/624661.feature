#Description:
#Sign in JFKCTO CURRENCY USD
#create a reservation RT, JFKCTG, 2 ADULT , ANY DAYS, Economy Classic Flex
#Verify that the administrative fee is correctly with the POS
#Fill the passenger information and click on book and file fare.
#CHECK OUT PAY with UATP , complete the FOID detTails
#Book new segments POS JFKATO USD , any days, Business PROMO , Voluntary Reissue should make it correctly
#PAY with cash, verify the EMD in the sales reports
#
#Expected:
#The system should process the change correctly, and the EMD should be emited.

@UAT
Feature: 624661 - Voluntary Reissue of a End on End ticket

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624661 - Voluntary Reissue of a End on End ticket

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
    And I select class "<Class>" for the first segment and "<Class1>" for the second segment in first connecting segment flight
    And I select class "<Class1>" for the first segment and "<Class>" for the second segment in second connecting segment flight
    And I select pricing option as "<PricingOption>"
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the FOID details for the passengers with document type as "<DocumentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab and view the EMD details

    And I navigate to home screen
    And I click the order tab
    And I click on Order Availability
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate2>" and Return Date "<StartDate3>" for two way booking
    And I click search button in flight search availability
    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in first connecting segment flight
    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in second connecting segment flight
    And I select Book from Actions Dropdown
    And I select and delete the segment "<SegmentDelete>"
    And I select and delete the segment "<SegmentDelete>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:

      | salesOffice                          | currency | OriginCity | Destination | StartDate | StartDate1 | StartDate2 | StartDate3 | PaymentType       | PaymentType1 | Adult | Child | INF | INS | originClass | originClass1 | PricingOption  | PricingOption1  | TicketStatus1 | SegmentDelete |DocumentType|Class|Class1|Class2|
      | MDE CTO CENTRO COMERCIAL MOLINOS     | COP      | MDE        | GUA         | 10 days   | 12 days    | 15 days    | 17 days    | MISC_BANK_TRANSFER| MISC_SST     | 0     | 2     | 0   | 0   | Economy     | Business     | Economy Classic| Price as Booked | EXCHANGED     | 1             |Passport    |A    |T     |Y     |



