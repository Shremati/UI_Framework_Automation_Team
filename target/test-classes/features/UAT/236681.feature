#Description:
#Click UNRECONCILIED
#Clic Abort
#From popup select Reinitiate boarding button
#Expected:

@UAT
Feature: 236681 - Verify user can able to Abort and Reinitiate boarding from Gate module

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236681 - Verify user can able to Abort and Reinitiate boarding from Gate module

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
    And I enter Start Date "<StartDate>" for one way booking
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I try to click Unreconciled button
    And I try to click on Abort button and try to select "<Button>" from popup
    And I click on Cancel or Reinitiate button "<Button1>" in Gate Screen
    And I try to click Unreconciled button
    And I try to click on Abort button and try to select "<Button>" from popup
    And I click on Cancel or Reinitiate button "<Button2>" in Gate Screen
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I logout from COPA GUI application



    Examples:

      | salesOffice | currency | OriginCity | Destination | Button1 | Button2    | StartDate | PaymentType | Adult | Child | INF | INS | originClass | PNRText | SegmentIndex | Button |
      | PTY ATO     | USD      | PTY        | BOG         | Cancel  | ReInitiate | 02 days   | Cash        | 1     | 0     | 0   | 0   | Economy     | PNR     | 0            | OK     |

