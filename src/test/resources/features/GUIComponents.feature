
@SampleGUI
Feature: GUIComponents - A feature file containing all GUI components

  Background:
    Given Shares Application is launched in the browser
  Scenario Outline: GUIComponents - A feature file containing all GUI components

    And I enter valid shares credentials
    And I click on the shares Login Button
    And I click on terminal emulation
    Then I validate successful shares login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I add "<FQTV>" frequent flyer passengers
    And I want to display all the passengers

    And I retrieve the GUI created PNR in ishares and validate the details
    And I retrieve the PNR in shares and validate the details "<Validation>"
#--------------------------------------------- GUI PART --------------------------------------------------------------
#    Navigating to GUI application
    And I navigate to COPA GUI Application from iShares Page
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"

#    For Searching PNR created in iShares/GUI (Use only if you want to search for a created PNR)
    And I search for the PNR created in Reservation Section


    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI

#    Adding Origin and Destination for Segment1
    And Select from and to City "<OriginCity>" and "<Destination>"
#    Adding Origin and Destination for Segment2
    And I add segment from and to City "<OriginCity1>" and "<Destination1>"
#    Adding Origin and Destination for Segment3
    And I add third segment from and to City "<OriginCity1>" and "<Destination1>"
#    Adding Origin and Destination for Segment4
    And I add fourth segment from and to City "<OriginCity1>" and "<Destination1>"

#    Adding StartDate for one way booking/Segment1
    And I enter Start Date "<StartDate>" for one way booking
#    Adding StartDate for Segment2
    And I enter Start Date "<ReturnDate>" for 2nd Segment
#    Adding StartDate for Segment3
    And I enter Start Date "<ReturnDate>" for 3rd Segment
#    Adding StartDate for Segment4
    And I enter Start Date "<StartDate3>" for 4th Segment
#   Adding StartDate and Return Date for 2 way booking(Return Flight)
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking

#    Entering Passenger Counts for different Pax types (Note: Always Adult need to come last)
    And I select infant without seat passengers
    And I select infant with Seat passengers
    And I select child passengers
    And I select Adult passengers and search for flights

#    Flight booking for 1st Segment
    And I select class "<originClass>" for Origin flight
#    Flight booking for all Other Segments
    And I select class "<ReturnClass>" for Return flight

#    Selecting Pricing Options  BestBuy/Price As Booked
    And I select pricing option as best buy
    And I select pricing option Price as Booked

    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next

#    For Entering Passenger Details
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment

#    Mode Of Payments
    And I choose one mode of payment
    And I choose two mode of payments
    And I choose three mode of payments

#    First Form of Payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
#    Second Form of Payment
    And I make the second payment by selecting the payment type as "<PaymentType2>"
#    Third Form of Payment (Note: Only Miscellaneous and Cash works for 3rd Type. Its GUI limitation )
    And I make the third payment by selecting the payment type as "<PaymentType3>"

    And I enter the details in the email recipients page
    And I validate if the payment is successful

    And I click the order tab
    And I click the Tickets tab
    And I click the services Tab
    And I click the Passengers tab

    And I modify the INS passenger to Child passenger in passenger tab
    And I try to retrieve the pnr from Order and Summary screen
    And I try to retrieve the pnr from Order Screen to check the "<Ticketstatus>" status

    And I edit passenger details
    And I select the availability type as "<AvailabilityType>"
    And I try to add the OSI remark as "<OSIRemark>"
    And I try to delete the OSI remark from the pnr "<OSIValue>"

#    ARNK
    And I add ARNK after to the itinerary "<Segment>"

#    Checkin Part
    And I navigate to home screen
    And I navigate to Check-In page
    And I search the Order number in Checkin Page
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in

#    Logging Out of GUI Application
    And I logout from COPA GUI application

 #    Navigating back to iShares
    And I navigate back to previous tab in the browser
#    For navigating to the required Tab by giving the Tab Number
    And I navigate back to previous tab in the browser "<Tab>"

    And I select the Quote Options and click on Next retrieving PNR from shares

    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab present in Tickets tab
    And I select the passenger from Ticket Tab
    And I click BulkTicket option
    And I try to retrieve the pnr after cancelling the segment "<RemainingSegments>"
    And I click on book button after adding the segments
    And I add an INF without seat passenger to the PNR
    And I add an INS passenger to the PNR
    And I click on Tools Menu in GUI application

    And I search for the PNR created in Reservation Section and verify the cancelled "<NoOfSegments>" segments
    And I search for the PNR created in Reservation Section and validate the newly added passenger "<PassengerType>"
    And I search for the PNR created in Reservation Section and validate the status of the passenger "<Status>"
    And I retrieve the PNR in ishares and validate the status of the passenger "<Status>"
    And I search for the PNR created in Reservation Section and validate that the SSR is added "<SSRType>"
    And I add SSR "<SSRType>" through Services tab in GUI
    And I retrieve the PNR in ishares and validate the SSR "<SSRType>"
    And I remove SSR "<SSRType>" from the PSC Exception Table
    And I assign seats to the passengers in Services tab
    And I retrieve the PNR in ishares and validate the seat numbers assigned to all the passengers

    And I navigate to tickets tab and save the ticket numbers

    And I search for the PNR created in Reservation Section and validate that the class of service is changed
    And I enter 0A command to add ARNK in Native shares
    And I click on add the passenger details for the Group or Corporate PNR in orders tab in GUI
    And I retrieve the PNR in iShares and validate that an ARNK segment is present in the PNR
    And I click on Add Name to Order button
    And I retrieve the PNR in GUI after splitting the PNR
    And I capture the status of the flight at the origin in FLIFO in GUI
    And I enter 2_ command to check the FLIFO of a flight in ishares and validate the details
    And I validate the FLIFO details shown in GUI is matching with the ishares
    And I click on PAY button when the amount is zero in GUI
    And I click on the passenger arrow to validate that the seats are assigned in GUI
    And I enter P_ command to update the OUT time of the flight in ishares
    And I validate the FLIFO ON-TIME status of the flight in the DELAY row in GUI
    And I validate the text present in the Delay row under the Origin column for a flight in FLIFO
    And I search for the PNR created in Reservation Section and verify the cancelled "<NoOfSegments>" segments
    And I search for the PNR created in Reservation Section and validate the newly added passenger "<PassengerType>"
    And I search for the PNR created in Reservation Section and validate the status of the passenger "<Status>"
    And I retrieve the PNR in ishares and validate the status of the passenger "<Status>"
    And I search for the PNR created in Reservation Section and validate that the SSR is added "<SSRType>"
    And I add SSR "<SSRType>" through Services tab in GUI
    And I retrieve the PNR in ishares and validate the SSR "<SSRType>"
    And I remove SSR "<SSRType>" from the PSC Exception Table
    And I assign seats to the passengers in Services tab
    And I retrieve the PNR in ishares and validate the seat numbers assigned to all the passengers

    And I navigate to tickets tab and save the ticket numbers

    And I search for the PNR created in Reservation Section and validate that the class of service is changed
    And I enter 0A command to add ARNK in Native shares
    And I click on add the passenger details for the Group or Corporate PNR in orders tab in GUI
    And I retrieve the PNR in iShares and validate that an ARNK segment is present in the PNR
    And I click on Add Name to Order button
    And I retrieve the PNR in GUI after splitting the PNR
    And I capture the status of the flight at the origin in FLIFO in GUI
    And I enter 2_ command to check the FLIFO of a flight in ishares and validate the details
    And I validate the FLIFO details shown in GUI is matching with the ishares
    And I click on PAY button when the amount is zero in GUI
    And I click on the passenger arrow to validate that the seats are assigned in GUI
    And I enter P_ command to update the OUT time of the flight in ishares
    And I validate the FLIFO ON-TIME status of the flight in the DELAY row in GUI
    And I validate the text present in the Delay row under the Origin column for a flight in FLIFO

    And I validate that the list of passengers is displayed in GATE module
    And I RECONCILE a passenger in GATE module and validate the passenger in reconciled section
    And I click on PNR hyperlink in checkin page
    And I navigate back to the previous page in GUI
    And I search for the passenger in the all passengers list in GATE module
    And I click on the passenger name in GATE page and validate that the added SSR "<SSRKeyword>" is present
    And I click on final report and validate the SSR added for the passenger
    And I click on seats icon and assign seats to the passengers in CHECKIN page
    And I retrieve the pnr in native shares and validate that the SSR is added "<SSR>"
    And I validate that the flight is cancelled in FLIFO in GUI for "<StartDate>"
    And I search for the PNR created in Reservation Section and validate that the date of travel is changed
    And I click on the dropdown to select special passenger "<PassengerType>" in checkin page


    And I logout from Shares application


    Examples:
      |salesOffice              |currency |OriginCity   |Destination |StartDate |ReturnDate |OriginCity1 |Destination1 |FQTV|Adult|Child|INF|INS|originClass |ReturnClass|PaymentType|PaymentType2|PaymentType3 |Ticketstatus|Tab |Segment      | AvailabilityType        |OSIRemark |OSIValue |
      |PTY - City Ticket Office |USD      |PTY          |SAL         |02 days   |07 days    |MEX         |PTY          |1   |1    |0    |1  |0  |Economy     |Economy    |Debit      |Amex        |Cash         |PD/FLOWN    |0/1 |FIRST_SEGMENT| Redemption Availability |TEST      |PAX VIP  |

#    Tested Payment Methods
#    Cash+Visa (working fine)
#    Visa+Amex (working fine)
#    Visa+Debit (working fine)
#    Debit+Visa (working fine)
#    Debit+Amex (working fine)
#    Debit+Amex+Cash (working fine)
#    Amex+Visa+Cash( working fine)