#Description:
#Title :REGATO-Display [SSR-CHLD-Child] from smart search.
#
#Description : Create a reservation in Shares
#passenger type: 2Adult 1 CHILD
#-Fernandez / Jose
#-Fernandez / Maria
#-Fernandez / Ana (CHD)
#Status: HK
#Class: C
#ETKT: OK
#Check in: NO
#ADD: SSR-CHLD-Child through RES for Fernandez passenger / Ana
#
#Step 1: Agent Log in as Airport in PTY-ATO.
#Step 2: In GATE MODULE input [flight number] Flight Search option on the press 'search'.
#Step 3: In All Passenger List screen, look for the smart search (Passenger list options).
#Step 4: Input: SSR-CHLD-Child.
#Step 5: Expected result: REGATO- the list of passengers With SSR-CHLD-Child, passenger Fernandez / ANA must Appear in list screen.


@VIR
Feature: 144998 - REGATO-Display [SSR-CHLD-Child] from smart search.
  Background:
    Given COPA GUI Application is launched in the browser
  Scenario Outline: 144998 - REGATO-Display [SSR-CHLD-Child] from smart search.

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on Tools Menu
    And I click on Native Shares
    And I create a PNR in NATIVE SHARES for "<Adult>" adult passengers ans "<Child>" child passengers using "<Origin>" to "<Destination>" and "<StartDate>"
    And I click the order tab
    And I select the Quote Options and click on Next retrieving PNR from shares
    And I select pricing option Price as booked after retrieving PNR from shares
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I navigate to home screen
    And I navigate to Gate section
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I search for the smart search with "<OPTION>"
    And I validate the passenger in All passenger list in gate module by PNR
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency |Origin       |Destination |OPTION             | StartDate |Adult|Child|SegmentIndex|SegmentIndex|PaymentType|
      |PTY ATO    |USD      |PTY          |MDE         |SSR - CHLD - Child | 01 days   |2    |1    |0           |1           |Cash       |

