#Description:
#1.Check in E-TKT with cpn status "EXCH INVOL"
#Expected:
#Check-in must be allowed
#E-TKT status must change as CHKD-IN


@VIR
Feature: PLOG77027_TC_05 - COUPON STATUS - EXCH INVOL (CHECK IN SCREEN)
  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: PLOG77027_TC_05 - COUPON STATUS - EXCH INVOL (CHECK IN SCREEN)
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
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
    And I navigate to Order tab
    And I change the date of travel for the first segment "<NewDate1>"
    And I perform Involuntary Reissue for specific segment "<Segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueReasonCode>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the EMD subtab and view the EMD details
    And I navigate to home screen
    And I open flight in native shares using the updated date
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification page
    Then I Validate APIS Complete and click on Done button
    And  I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus2>" status in ticket tab
    And I logout from COPA GUI application

    Examples:
      | salesOffice | currency | OriginCity | Destination | StartDate |  COS  | NewDate1 | PaymentType | Adult | printer          | printerStatus  | ticketStatus2 | ticketStatus1 |  PricingOption   |  originClass | Segment | ReasonCode                 | ReissueReasonCode | SegmentIndex |
      | PTY ATO     | USD      | PTY        | MEX         | 01 days   |  C    | 02 days  | CASH        | 1     | IN-PF2ST1T4      | PrintReady     | CHECKED-IN    | EXCHD IRR     |  Price as Booked | Economy      | 1       | WPEN IRROP-HURRICANE/STORM | Involuntary       | 0            |

