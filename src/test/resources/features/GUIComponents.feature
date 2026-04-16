
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
    # Feature File: 100000.feature
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I navigate to the User provisioning Tool page
    And I enter User Id and click on search in user provisioning page
    And I select POS and set status of the iCoupon in User Provisioning tool page "<iCouponStatus>"
    And I logout from COPA GUI application

# Feature File: 236656.feature
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    And I select the printer "<printer>" and "<printerStatus>"
    And I navigate to home screen
    And I navigate to Gate section
    And I select flight by flight status in gate page "<OriginCity>" and "<departureDate>" and "<flightStatus>"
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I select compensation reason and select passenger "<compensationReason>"
    And I select passenger and issue compensation
    And I select passengers and click print button
    And I select passenger and click on email button
    And I click on view icon and display the compensation additional details
    And I click the tickets tab and click ticket EMD tab verify the segment name status "<NameStatus>"

# Feature File: 236661.feature
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency1>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination1>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select child passengers
    And I select infant without seat passengers
    And I select Adult passengers and search for flights
    And I select class "<originClass>" for Origin flight
    And I select pricing option Price as Booked
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I Click on Book and FileFare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I navigate to Check-In page
    And I search for the segment "<SegmentIndex>" in Check-In page
    And I select the passengers in checkin page using "<searchType>"
    And I click on Proceed to Check-In button
    And I enter the details in Security Document Verification - ADC & APIS page
    Then I Validate APIS Complete and click on Done button
    And I click on check-in for the passenger
    Then I validate the confirmation dialog that passenger is Checked-in
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the EMD subtab and view the baggage details in tickets tab
    And I search the flight for the segment "<SegmentIndex>" in Gate section
    And I select the flight actions as "<ActionType>"
    And I select the type for mass transfer as "<transferType>"
    And I select the reason code as "<Reason>" and select the flight for mass transfer for the segment "<SegmentIndex1>"
    And I pick the passengers manually from the list from the pnr created
    And I click the button "<buttonName>" to accept or compensate
    And I try to retrieve the ticket number by selecting "<PNRText>" option
    And I navigate to Order tab to check the OSI remarks to validate the reason "<Reason>"
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus>" status in ticket tab
    And I click the services Tab to validate the seats

# Feature File: 236669.feature
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I select class "<OriginClass>" for Origin flight
    And I select pricing option as best buy
    And I select the flight actions as "<ActionType1>"
    And I assign weight restriction for the class "<OriginClass>" with number of pax "<passengers>"
    And I unassign weight restriction for the class "<OriginClass>" with number of pax "<passengers>"
    And I click on the standby tab to display the passenger list
    And I click on the oversold tab to display the passenger list
    And I validate if the passenger is added to the oversold list

# Feature File: 236672.feature
    And I change the date format for passenger DOB
    And I search the Order number in Checkin Page
    And I try to assign an agent "<ActionType>"
    And I initiate standby to the passenger
    And I validate if the passengers have been cleared

# Feature File: 236673.feature
    And I enter required passenger details for COPA GUI
    And I change the date of travel for the first segment "<NewDate1>"
    And I perform the Involuntary Reissue
    And I check to the remarks from order tab and validate the remark type "<type>"
    And I click the services Tab

# Feature File: 236675.feature
    And I search for the PNR created in Reservation Section
    And I click on Seat Icon from Services tab
    And I select Seat for all passengers
    And I click on pay button by selecting the required payment type "<PaymentType>"
    And I check the ticket in the Tickets tab
    And I check the EMDs in EMD tab
    And I select held seats to display the passenger list in Gate section
    And I select "<passengerListType>" from the passenger list options

# Feature File: 236677.feature
    And I select class "<originClass>" for the first thru flight
    And I search the flight for the segment "<SegmentIndex>" in Gate section with thru flight as origin

# Feature File: 236679.feature
    And I RECONCILE a passenger in GATE module and validate the passenger in reconciled section

# Feature File: 236680.feature
    And I select class "<originClass>" for the first segment on current day
    And I initiate boarding if boarding not initiated

# Feature File: 236681.feature
    And I click on Book and FileFare button or File Fare button
    And I enter the details in Security Document Verification page
    And I try to click Unreconciled button
    And I try to click on Abort button and try to select "<Button>" from popup
    And I click on Cancel or Reinitiate button "<Button1>" in Gate Screen
    And I click on Cancel or Reinitiate button "<Button2>" in Gate Screen

# Feature File: 236683.feature
    And I try to retrieve the ticket number by selecting "<PNRText1>" option with sequence number as "<SeqNo>"
    And I try to click on Reconcile button
    And I navigate to UnReconciled or Reconciled "<SubTab1>" subtab and check for the passengers with sequence number as "<SeqNo>"
    And I navigate to UnReconciled or Reconciled "<SubTab>" subtab and check for the passengers with sequence number as "<SeqNo1>"

# Feature File: 236684.feature
    And I select class "<originClass>" for the first connecting segment flight
    And I click on Tools Menu
    And I click on Native Shares
    And I retrieve the pnr in Native shares
    And I enter 6:LD_OC command to display outbound connection in Native Shares
    And I click on Cancel button in native shares
    And I click the order tab

# Feature File: 236686.feature
    And I select pricing option as "<PricingOption>"
    And I search the passenger in checkin page using flight number "<segmentIndex>"
    And I select the passengers in checkin page using "<searchType1>"
    And I search the flight for the segment "<segmentIndex>" in Gate section
    And I try to retrieve the ticket number by selecting "<searchType1>" option
    And I click status tab in gate page and check unreconciled pax status

# Feature File: 236687.feature
    And I click on seat icon from services tab
    And I click the services Tab to validate the seats and store the seat numbers
    And I click on release and offload button release the "<passengerListType>" passengers
    And I validate if the held seats are released
    And I open the seat map to check if the held seats are released

# Feature File: 236688.feature
    And I select pricing option as Economy full
    And I navigate to iShares Page from COPA GUI Application
    And I enter valid shares credentials
    And I click on the shares Login Button
    And I click on terminal emulation
    Then I validate successful shares login
    Then I enter LOGC CMRE command for logging in
    And I enter BSIA command for signing in
    And I enter BSO command for sign out
    And I enter W* command to check lniata of the session
    And I retrieve the pnr
    And I enter *ET command to display all the tickets in the PNR
    And I remove SSR "<SSRType>" from the PSC Exception Table
    And I logout from Shares application
    And I navigate back to previous tab in the browser "<Tab>"
    And I add SSR "<SSRType>" through Services tab in GUI
    And I validate the SSR "<SSRType>" for the segment "<SegmentIndex>" in native shares

# Feature File: 236689.feature
    And I validate the Sequence number for the segment "<SegmentIndex>" in native shares

# Feature File: 236690.feature
    And I add "<NRSA>" NRSA passengers
    And I set Class Of Service to "<COS>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex>"
    And I set startdate to "<StartDate>" for Segment "<SegmentIndex>"
    And I set PNR Type to "<PNRType>"
    And I search for flight availability in Native shares of special pnr for first segment from "<Origin>" to "<Destination>" and "<StartDate>"
    And I enter the passenger details in Native shares
    And I enter the passenger phone details for "<POS>"
    And I save the details of the passenger
    And I end and retrieve the PNR in Native shares
    And I select the Quote Options and click on Next retrieving PNR from shares
    And I select pricing option Price as Best Buy retrieving PNR from shares
    And I display the standby list for the segment "<SegmentIndex>" in native shares


# Feature File: 236694.feature
    And I change the Sales Office and Currency "<salesOffice>" and "<currency1>"
    And I click search button in flight search availability
    And I store all the flight numbers after flight search
    And I click on FLIFO SEARCH under Tools menu
    And I perform flifo search with required details for selected flight
    And I verify the flight is not assigned with any gate number for Origin or Destination "<city1>"
    And I verify the flight is not assigned with any gate number for Origin or Destination "<city2>"
    And I try to close the FLIFO search
    And I try to assign the gate number "<GateNo>" for Arrival or Departure flights "<DepartureTime>" in Native Share
    And I change the Sales Office and Currency "<salesOffice1>" and "<currency>"
    And I try to assign the gate number "<GateNo1>" for Arrival or Departure flights "<ArrivalTime>" in Native Share
    And I perform flifo search with required details for current date
    And I verify the Gate number of the flight for OriginCity in FLIFO
    And I verify the Gate number of the flight for DestinationCity in FLIFO
    And I try to assign the gate number "<GateNo2>" for Arrival or Departure flights "<DepartureTime>" in Native Share
    And I try to assign the gate number "<GateNo3>" for Arrival or Departure flights "<ArrivalTime>" in Native Share

# Feature File: 236695.feature
    And I add "<NRPS>" NRPS passengers
    And I search for flight availability in Native shares of special pnr for first segment from "<OriginCity>" to "<Destination>" and "<StartDate>"
    And I perform flifo search with required details
    And I verify the Status of the flight at the origin in FLIFO in GUI is "<Status>"
    And I enter 2_ command to know the details of the flight in Native Shares
    And I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares using OUT command
    And I verify the Status of the flight at the origin in FLIFO in GUI is "<FlightStatus>"
    And I verify the flight status is displayed as "<FlightStatus>"

# Feature File: 236697.feature
    And I search for the flight in Gate section with Destination as "<Destination>"
    And I verify the flight status is displayed in gate section with specific destination as "<Destination>"
    And I verify the flight status is displayed as "<FlightStatus1>"

# Feature File: 622936.feature
    And I search for flight availability in Native shares from "<OriginCity>" to "<Destination>"
    And I enter 2_ command to perform Delayed Operation in FLIFO in Native Shares
    And I select the flight in Gate section with Destination as "<Destination>"
    And I try to assign the gate number "<GateNo>" in Native Shares
    And I verify the Gate number for a flight in Gate section

# Feature File: 622937.feature
    And I set the POS to "<POS>"
    And I search for flight availability from "<OriginCity>" to "<Destination>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex1>"
    And I set startdate to "<StartDate1>" for Segment "<SegmentIndex1>"
    And I search for flight availability for second segment from "<OriginCity1>" to "<Destination1>"
    And I enter passenger details
    And I enter phone details for the passengers
    And I enter 6P command to save the transaction
    And I enter 7T command for the ticketing command
    And I enter ER command to save and retrieve
    And I have done auto fare quote for all the passengers in the PNR with "<PaymentType>"
    And I enter *ET for displaying coupon of ticket
    And I enter *EH command to display the ETKT history
    And I do short checkin for Shares PNR with baggage for check in type "<TypeOfCheckin>"
    And I do checkin for Shares PNR with baggage for check in type "<TypeOfCheckin>" for required segment "<SegNo>"
    And I enter 6:LD_|CHD command for displaying child pax for all segments
    And I navigate back to previous tab in the browser "<tab>"

# Feature File: 622939.feature
    And I add segment from and to City "<Destination>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" for 2nd Segment
    And I add same firstname to "<PaxCount>" passenger
    And I select class "<originClass>" for Return flight
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<EMDStatus>"
    And I try to update the passenger in Checkin Page "<PaxType>"
    And I try to add the Infant Without seat passenger from Order Screen
    And I click the Tickets tab and verify INF is present
    And I try to click on Back button
    And I verify infant icon is displayed and passenger type is displayed as "<PaxType>"
    And I click on the Boarding pass icon to print the Boarding pass

# Feature File: 622940.feature
    And I select class "<originClass>" for Origin flight with departure time within "<hours>" from current time
    And I click the Tickets tab and verify the Ticket Status as "<TicketStatus>" and verify the EMD Coupon control status as "<CouponControl>"
    And I open flight for the segment "<SegmentIndex>" in native shares
    And I click on COPA GUI application login button
    And I enter the alternate credentials "<userName>" and "<password>" to log into COPA GUI application
    And I validate if the new user is not the controlling agent "<userName>"
    And I click on off load button and validate the error message

# Feature File: 622941.feature
    And I add "<FQTV>" frequent flyer gold passengers
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I select the prefer upgrade to upgrade the passenger in checkin page
    And I verify the passenger added into the Cabin STBY list checkin page
    And I verify the passenger added into the Cabin STBY list in passenger details screen
    And I enter 6:LD_SB command to display standby list for passenger in Native shares

# Feature File: 622942.feature
    And I click on Return to Check-In
    And I click add Baggage icon
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight1>"
    And I click on Submit and Proceed to Pay
    And I select the flight for outbound mass transfer with outbound segment "<SegmentIndex1>"
    And I validate the reason "<Reason>" and capture the OSI remarks in shares after retrieving the PNR from GUI

# Feature File: 622944.feature
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate>" for two way booking
    And I select pricing option as Economy Classic
    And I click on Seat Icon from Checkin page
    And I select the seats from checkin page for passengers for the given segment "<SegmentIndex>"

# Feature File: 622945.feature
    And I add segment from and to City "<OriginCity1>" and "<Destination1>"
    And I enter the FOID details for the passengers with document type as "<documentType>"
    And I select the offpoint as "<Destination>" in Mass Transfer page

# Feature File: 622946.feature
    And I search the flight for the segment "<SegmentIndex1>" in Gate section

# Feature File: 622948.feature
    And I set total baggage count "<bagCount>"
    And I set baggage weight "<BaggageWeight>"
    And I click on bag icon in checkin page for all passengers and select the type of baggage as standard and add bags and do payment

# Feature File: 622949.feature
    And I select the offpoint as "<Destination1>" in Mass Transfer page

# Feature File: 622950.feature
    And I open flight for the segment "<SegmentIndex1>" in native shares


    And I select the type for mass transfer as "<transferType1>"
    And I select the reason code as "<Reason>" and select the flight for mass transfer for the segment "<SegmentIndex>"

# Feature File: 622952.feature
    And I select passengers using flight numbers in Compensation model "<OriginCity>" and "<StartDate>" and "<PassengerType>" and "<flightIndex>"
    And I select passengers and issue compensation "<Amount>" and "<PassengerType>" and "<compensationReason>" and "<StartDate>"

# Feature File: 622957.feature
    And I select the Quote Options and click on Next retrieving PNR from Native shares
    And I select pricing option Price as Best Buy retrieving PNR from Native shares
    And I select ADC bypass and give the bypass reason "<reason>"
    And I enter Order Id and select compensation reason for the passenger "<compensationReason>" and "<PassengerType>"
    And I select the passengers and click the issue compensation button and validate the error message

# Feature File: 622969.feature
    And I add same surname to "<PaxCount>" passengers
    And I select passengers and click the issue compensation button "<PassengerType>" and "<compensationReason>" and "<StartDate>"
    And I select passengers click print button and click digital voucher button
    And I select passengers using flight numbers in Compensation model "<OriginCity>" and "<StartDate>" and "<PassengerType1>" and "<flightIndex>"
    And I click the EMD Available for Print tab and click print button

# Feature File: 622970.feature
    And I verify the Status of the flight at the origin in FLIFO in GUI is OnTime
    And I select required passengers and click the issue compensation button
    And I select passengers using flight numbers in Compensation model "<PassengerType1>"

# Feature File: 622971.feature
    And I validate the names in the Icoupon
    And I validate the amounts in the Icoupon with "<currency>"

# Feature File: 622972.feature
    And I click the EMD Available for Print tab and click print button verify the amount "<Amount>"

# Feature File: 622973.feature
    And I select class "<ReturnClass>" for Return flight

# Feature File: 622974.feature
    And I select one passenger with PNR and select compensation reason "<compensationReason>"
    And I select passengers click print button and click continue printing button
    And I click on view icon for both paper and Icoupon generated passengers to display compensation details

# Feature File: 622975.feature
    And I add "<FQTV>" frequent flyer passengers
    And I enter the details in the email recipients page for FQTV passengers

# Feature File: 622981.feature
    And I select infant with Seat passengers
    And I click the Price Quote button and click on Next
    And I want to pay using residual emd
    And I perform voluntary manual refund
    And I select class "<originClass1>" for Origin flight
    And I enter the FOID details of the passengers
    And I add SSR "<SSR>" through Services tab in GUI
    And I make the first payment by selecting the payment type as "<PaymentType1>"

# Feature File: 622983.feature
    And I select specific child passenger in checkin page using "<searchType>"
    And I try to select or unselect the checkbox
    And I try to click baggage for required passenger "<PaxType>"
    And I add catalog baggage "<BaggageType>" and "<baggageNo>" and "<baggageWeight>"
    And I try to click submit and continue button
    And I try to click baggage for required passenger "<PaxType1>"
    And I click add another baggage
    And I add catalog baggage "<BaggageType1>" and "<baggageNo1>" and "<baggageWeight>"

# Feature File: 622984.feature
    And I search for the segment "<segmentIndex>" in Check-In page
    And I add standard baggage "<BaggageNo>" and  "<BaggageWeight>"
    And I add standard baggage "<BaggageNo1>" and  "<BaggageWeight>"
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status in ticket tab
    And I change the class of seat "<COS>" for the required segment "<SegNo>"
    And I click on Action drop down to Sync the ticket based on Service "<Service>" for specific segment "<SegmentNo>"
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus2>" status in ticket tab
    And I search for the segment "<segmentIndex1>" in Check-In page
    And I delete the standard baggage "<BaggageNo1>"
    And I click on Submit and Continue

# Feature File: 622985.feature
    And I select the printer "<Printer>" and "<PrinterStatus>"
    And I select pricing option as Economy Basic
    And I navigate to Order tab
    And I click on Action drp dwn for Vol reissue
    And I click on CheckOut button and Reissue for payment
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report
    And I delete the standard baggage "<BaggageNo>"

# Feature File: 622988.feature
    And I enter Start Date "<StartDate>" and Return Date "<ReturnDate1>" for two way booking
    And I select class "<returnClass>" for Return flight
    And I add standard baggage "<BaggageNo2>" and  "<BaggageWeight>"
    And I add standard baggage "<BaggageNo3>" and  "<BaggageWeight3>"
    And I delete the standard baggage "<BaggageNo2>"
    And I delete the standard baggage "<BaggageNo3>"


# Feature File: 622991.feature
    And I select specific class "<COS>" for Origin flight in Economy Class
    And I search for the segment "<SegmentIndex1>" in Check-In page
    And I enter the details in Security Document Verification page for double Nationality
    And I add standard baggage with Overweight for second bag "<BaggageNo1>" and  "<BaggageWeight1>"

# Feature File: 623007.feature
    And I select pricing option as Business Promo
    And I add standard baggage "<BaggageNo3>" and  "<BaggageWeight1>"
    And I add standard baggage "<BaggageNo4>" and  "<BaggageWeight1>"

# Feature File: 623008.feature
    And I click on the accept button in checkin page to pay
    And I click the EMD subtab and view the EMD details
    And I add catalog baggage "<BaggageType>" and "<BaggageNo>" and "<BaggageWeight>"
    And I add catalog baggage "<BaggageType>" and "<BaggageNo1>" and "<BaggageWeight>"
    And I add catalog baggage "<BaggageType>" and "<BaggageNo2>" and "<BaggageWeight>"
    And I click on Submit and verify the Error message after adding Baggage

# Feature File: 624570.feature
    And I enroll connect mile to all the passengers
    And I add a service "<ServiceType>" in cabin
    And I choose two mode of payments
    And I make the second payment by selecting the payment type as "<PaymentType2>"
    And I change first segment date "<StartDate1>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>"
    And I click on View button and check the Ticket details
    And I validate the EMD values in Agent Sales Report after changes

# Feature File: 624576.feature
    And I select class "<originClass1>" for the first connecting segment flight
    And I select class "<ReturnClass1>" for the second connecting segment flights
    And I click and view the Tickets tab for residual emd refund
    And I add "<Adult1>" adult passengers
    And I add "<Child1>" child passengers
    And I add "<INS1>" infant with seat passengers
    And I add "<INF1>" infant without seat passengers
    And I select class "<firstSegmentClass>" for the first segment and "<secondSegmentClass>" for the second segment in first connecting segment flight
    And I select class "<firstSegmentClass>" for the first segment and "<secondSegmentClass>" for the second segment in second connecting segment flight
    And I make the second payment by selecting the payment type as "<PaymentType3>"
    And I store the updated emd and ticket details and validate if payment is successful
    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I click on Order Availability
    And I enter Start Date "<NewDate1>" and Return Date "<NewDate2>" for two way booking
    And I select Book from Actions Dropdown
    And I select and delete the segment "<segmentNo>"
    And I validate the Tax Details in Agent Sales Report after changes
    And I add SSR "<SSRType>" through Services tab with "<SSRDescription>"
    And I make the first payment by selecting the payment type as "<PaymentType2>"
    And I validate the EMD values in Agent Sales Report after SSR addition

# Feature File: 624579.feature
    And I select class "<originClass>" for the first connecting segment on current day
    And I enter the FOID details for the passengers with document type as "<DocumentType>"
    And I change status of segments "<TotalSegments>" to status type "<StatusType>"
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus2>" status in ticket tab
    And I enter Start Date "<StartDate2>" for one way booking
    And I select and delete the segment "<SegmentDelete>"
    And I make the second payment by selecting the payment type as "<PaymentType1>"
    And I click the Tickets tab and store the ticket number
    And I click the services Tab to validate added SSR "<SSRType>"

# Feature File: 624581.feature
    And I select specific class "<originClass>" for Origin flight in Economy Class
    And I select specific class "<ReturnClass>" for Return flight
    And I select pricing option as "<pricingOption>"
    And I change the class of seat "<class>" for the required segment "<Segment>"
    And I change the class of seat "<class>" for the required segment "<Segment1>"
    And I perform Voluntary Reissue with Circle trip and Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType1>"
    And I send email in tickets tab

# Feature File: 624586.feature
    And I enter Start Date "<StartDate>" and Return Date "<returnDate>" for two way booking
    And I select class "<originClass>" for the second connecting segment flights
    And I change the class of seat "<cos>" for required connecting segment "<SegNo>"
    And I change the class of seat "<cos>" for required connecting segment "<SegNo1>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>"
    And I click on pay button by selecting the required payment type "<PaymentType2>"
    And I perform voluntary refund
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus3>" status in ticket tab
    And I click and view the Tickets tab after refund
    And I validate the Refunded ticket in Agent Sales Report

# Feature File: 624587.feature
    And I add "<FQTV>" frequent flyer platinum passengers
    And I select class "<ReturnClass>" for the second connecting segment flights
    And I choose three mode of payments
    And I make the third payment by selecting the payment type as "<PaymentType2>"
    And I search the Order number in Travel compensation model
    And I select the Order number and click on continue button in compensation model
    And I issue the compensation for selected passengers with amount "<Amount>" and "<compensationReason>"
    And I select passengers and view compensation details
    And Select from and to City "<OriginCity1>" and "<Destination1>"
    And I enter Start Date "<StartDate1>" and Return Date "<ReturnDate1>" for two way booking
    And I perform Voluntary reissue with penalty waiver and pricing option as "<PricingOption1>"
    And I make the first payment by selecting the payment type as "<PaymentType3>"
    And I make the second payment by selecting the payment type as "<PaymentType4>"

# Feature File: 624588.feature
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency>"
    And I create PNR to get Residual EMD value
    And I created Residual EMD successfully
    And I add advanced option "<optionType2>"
    And I enter required passenger details with Senior Citizen for COPA GUI
    And I make the second payment by selecting the payment type as "<PaymentType>"
    And I validate the tickets and EMD values in Agent Sales Report
    And Select from and to City "<OriginCity>" and "<Destination2>"
    And I enter Start Date "<StartDate1>" and Return Date "<returnDate1>" for two way booking
    And I select class "<originClass1>" for Origin flight for the newly added segments via availability
    And I select class "<originClass1>" for Return flight for the newly added segments via availability
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>" with an advanced option type  "<optionType>"
    And I validate Ticket and EMD values in Agent sales report after changes

# Feature File: 624589.feature
    And Select from and to City "<OriginCity>" and "<Origin1>"
    And I enter Passport FOID details
    And I select pricing option as "<PricingOption1>"
    And I enter Account code as "<AccountCode>"
    And I add advanced option "<optionType>"
    And I enter Start Date "<NewDate1>" and Return Date "<ReturnDate1>" for two way booking
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption>" with an advanced option type  "<optionType>"
    And I make the last payment if required by selecting the payment type as "<PaymentType>"
    And I add SSR "<SSRType>" through Services Tab for the passenger "<PaxIndex>"
    And I add SSR "<SSRType>" through Services Tab for the passenger "<PaxIndex1>"
    And I click on checkout and pay button by selecting the required payment type "<PaymentType>"
    And I enter the FOID details if required with document type as "<DocumentType>"
    And I enter the details in the email recipients page if required and validate payment

# Feature File: 624590.feature
    And I change the date of travel for the first connecting segment "<NewDate1>"
    And I change the date of travel for the second connecting segment "<NewDate2>"
    And I search the passenger in checkin page after Reissue using flight number "<segmentIndex>"
    And I click on Proceed to check-in button after reissue
    And I click on check-in for the passenger after reissue

# Feature File: 624591.feature
    And I enter Start Date "<StartDate>" and Return Date "<StartDate1>" for two way booking
    And I select Book from Actions Dropdown and give the segment numbers as "<segments>"

# Feature File: 624592.feature
    And I change the date of travel for the first connecting segment "<NewDate>"
    And I change date of travel for second connecting segment "<NewDate1>" after the first connecting segment booked

# Feature File: 624593.feature
    And I search for flight availability for first married segment flights from "<OriginCity>" to "<Destination>"
    And I set startdate to "<ReturnDate>" for Segment "<SegmentIndex1>"
    And I search for flight availability for second married Segment flights from "<Destination>" to "<OriginCity>"
    And I enter T_ET|USED command to change the specific segment to CM-USED status "<segNumber>"
    And I enter T_ET|USED command to change the specific segment to CM-USED status "<segNumber1>"
    And I enter ZAFIL command to change segment status to flown "<Segment>"
    And I enter ZAFIL command to change segment status to flown "<Segment1>"
    And I navigate to COPA GUI Application from iShares Page
    And I change the class of seat "<class>" for required connecting segment "<Segment>"

# Feature File: 624594.feature
    And I perform Voluntary Reissue
    And I enter *EH command to show passenger history in Native shares

# Feature File: 624595.feature
    And Select from and to City "<Destination>" and "<OriginCity>"
    And I enter Start Date "<StartDate1>" for one way booking
    And I perform Voluntary reissue with penalty and pricing option as "<PricingOption>" and "<penalty>"
    And I navigate back to previous tab in the browser "<Tab1>"

# Feature File: 624596.feature
    And I change the date of travel for the second connecting segment "<NewDate>"
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus>" status in ticket tab

# Feature File: 624597.feature
    And I add third segment from and to City "<OriginCity2>" and "<Destination2>"
    And I enter Start Date "<StartDate2>" for 3rd Segment
    And I add fourth segment from and to City "<OriginCity3>" and "<Destination3>"
    And I enter Start Date "<StartDate3>" for 4th Segment
    And I change date of travel for second segment "<NewDate2>"
    And I change date of travel for third segment "<NewDate3>"
    And I change date of travel for fourth segment "<NewDate4>"

# Feature File: 624598.feature
    And I perform Involuntary Reissue for specific segment "<Segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueReasonCode>"
    And I click on seat icon from services tab for required segment "<Segment>"

# Feature File: 624599.feature
    And I change status of segments "<SegNo>" to NoShowed status
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus1>" status
    And I select class "<originClass>" for Origin flight for the newly added segments via availability

# Feature File: 624602.feature
    And I select Private Fares Only checkbox
    And I validate the Price Quote and verify Account code "<AccountCode>" is displaying or not and click on Next
    And I click on Quotes subtab and verify Account code "<AccountCode>" is displaying or not
    And I change the date of travel for the second segment "<NewDate1>"

# Feature File: 624604.feature
    And I enter Start Date "<StartDate1>" and Return Date "<StartDate2>" for two way booking
    And I select class "<originClass>" for Return flight for the newly added segments via availability

# Feature File: 624606.feature
    And I enter Start Date "<StartDate2>" and Return Date "<StartDate3>" for two way booking
    And I click on seat icon from services tab for required segment "<SegmentNum>"
    And I select seats for passengers and add to order

# Feature File: 624607.feature
    And I select pricing option as "<Pricingoption>"
    And I click on Order Tab to view the Itinerary Details
    And I perform Reissue For All Segments Booked on New Date

# Feature File: 624612.feature
    And I select class "<ReturnClass>" for Origin flight for the newly added segments via availability
    And I select class "<ReturnClass>" for Return flight for the newly added segments via availability

# Feature File: 624613.feature
    And I add third segment from and to City "<Destination1>" and "<Destination2>"
    And I select class "<originClass>" for second segment
    And I select class "<originClass>" for third segment with connecting flights
    And I enter Start Date "<StartDate3>" for one way booking
    And I enter Start Date "<StartDate4>" for 2nd Segment
    And I enter Start Date "<StartDate5>" for 3rd Segment
    And I select class "<originClass>" for Origin flight for the newly added segments via availability after the Connecting segments
    And I select class "<originClass>" for second segment for the newly added segments via availability after the Connecting segments
    And I select Book from Actions Dropdown and give the segment numbers as "<SegmentNum>"


# Feature File: 624614.feature
    And I select class "<originClass>" for Origin flight with departure time within "<hours1>" from current time
    And I perform Involuntary Reissue for specific segment "<segment>" with Reason Code as "<ReasonCode>" and Reissue Reason Code as "<ReissueCode>"

# Feature File: 624615.feature
    And I enter Start Date "<StartDate>" and Return Date "<StartDate2>" for two way booking
    And Select from and to City "<Destination1>" and "<OriginCity1>"

# Feature File: 624616.feature
    And I validate Ticket and EMD values in Agent sales report

# Feature File: 624617.feature
    And I select the booked class for the origin flight
    And I select the booked class for the return flight
    And I Delete All the Old Segments
    And I perform the Involuntary Reissue for new segment

# Feature File: 624618.feature
    And I set PNR Type to "<pnrType>"

# Feature File: 624621.feature
    And I change the date of travel for the first segment "<NewDate>"

# Feature File: 624625.feature
    And I perform Voluntary Reissue by adding Account code as "<AccountCode>"
    And I try to click and store the Quote ID from Voluntary Reissue options page
    And I try to click the "<Reissue>" link from Order Page under Remarks sub tab to verify "<AccountCode>"
    And I try to close the popup

# Feature File: 624628.feature
    And I click the EMD subtab and verify administrative fees
    And I select class "<originClass1>" for the second connecting segment flights
    And I perform Voluntary Reissue with Pricing Option as "<PricinOption1>"

# Feature File: 624631.feature
    And I change the class of seat "<Seat>" for the required segment "<Segment>"
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>" with an advanced option type  "<AdvancedOptions>"

# Feature File: 624633.feature
    And I select pricing option as "<Pricingoption1>"
    And Select from and to City "<OriginCity1>" and "<Destination2>"
    And I select class "<originClass1>" for Origin flight For Same Day Booking

# Feature File: 624635.feature
    And I select class "<firstSegmentClass1>" for the first segment and "<secondSegmentClass1>" for the second segment in first connecting segment flight
    And I select class "<firstSegmentClass1>" for the first segment and "<secondSegmentClass1>" for the second segment in second connecting segment flight
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>" and pay as residual reissue

# Feature File: 624636.feature
    And I select class "<Class1>" for the first segment and "<Class1>" for the second segment in first connecting segment non codeshare flight
    And I select class "<Class1>" for the first segment and "<Class1>" for the second segment in second connecting segment non codeshare flight
    And I change all the segments status to "<TicketStatus1>" for the passengers "<NoOfPax>" "<Segments>"
    And I enter ZAFIL command to change segment status to flown "<Segments>"
    And I try to retrieve the pnr from Order Screen to check the "<TicketStatus3>" status
    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in first connecting segment non codeshare flight
    And I select Book from Actions Dropdown and give the segment numbers as "<Segments1>"
    And I perform Voluntary reissue with penalty and pricing option as "<PricingOption>" and "<PenaltyAmount>"
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency1>"
    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in first connecting segment flight
    And I validate the Tax Details in Agent sales report by checking the issued currency

# Feature File: 624638.feature
    And I add process and reason code in Quote Waiver page
    And I perform Voluntary Reissue with Pricing Option as "<PricingOption1>" with an advanced option type  "<optionType1>"

# Feature File: 624640.feature
    And I change the date of travel for the first segment "<NewDate2>"

# Feature File: 624642.feature
    And I click the Tickets tab and try to verify the tax details after reissue

# Feature File: 624645.feature
    And I enter Start Date "<StartDate2>" to select flight on "<dayToBook>"

# Feature File: 624646.feature
    And I change date of travel for second segment "<NewDate1>"

# Feature File: 624648.feature
    And I select specific class "<Class1>" for Origin flight and check the seats are available in "<Class2>" aswell
    And I select specific class "<Class1>" for Return flight and check the seats are available in "<Class2>" aswell

# Feature File: 624649.feature
    And I select specific class "<Class1>" for the first connecting segment flight and check the seats are available in "<Class2>" aswell
    And I select specific class "<Class1>" for the second connecting segment flight and check the seats are available in "<Class2>" aswell
    And I change date of travel for second connecting segment "<NewDate2>" after the first connecting segment booked

# Feature File: 624652.feature
    And I click on Quotes subtab

# Feature File: 624653.feature
    And I add a service "<ServiceType>" in cabin for specific passenger "<PaxNo>"

# Feature File: 624657.feature
    And I change the Sales Office and Currency "<salesOffice2>" and "<currency2>"
    And I select class "<Class>" for the first segment and "<Class>" for the second segment in first connecting segment flight
    And I select class "<Class>" for the first segment and "<Class>" for the second segment in second connecting segment flight
    And I make the second payment by selecting the payment type as "<PaymentType11>"
    And I select class "<Class2>" for the first segment and "<Class2>" for the second segment in second connecting segment flight
    And I store the residual emd and ticket details and validate if payment is successful
    And I click the EMD subtab to check the residual emd name and RFISC value as "<RFISC>" and store the residual emd value
    And I make the first payment by selecting the payment type as "<PaymentType4>"

# Feature File: 624659.feature
    And I perform Voluntary Reissue to validate Manual Reissue required error message

# Feature File: 624661.feature
    And I select class "<Class>" for the first segment and "<Class1>" for the second segment in first connecting segment flight
    And I select class "<Class1>" for the first segment and "<Class>" for the second segment in second connecting segment flight

# Feature File: 624662.feature
    And I add segment from and to City "<OriginCity2>" and "<OriginCity>"
    And I enter Start Date "<returnDate>" for 2nd Segment

# Feature File: 624663.feature
    And I change the date of travel for the first connecting segment "<StartDate2>"

# Feature File: 624665.feature
    And I select class "<Class>" for the first segment and "<Class>" for the second segment in first connecting segment codeshare flight
    And I select class "<Class>" for the first segment and "<Class>" for the second segment in second connecting segment codeshare flight
    And I change the date of travel for the second connecting segment "<newDate>"
    And I try to retrieve the pnr from Order and Summary screen

# Feature File: 624666.feature
    And I enter Start Date "<StartDate>" to select flight on Monday and select the Return Date "<StartDate1>" for two way booking
    And I change the class of seat "<COS>" for the required segment "<Segment>"
    And I change the class of seat "<COS>" for the required segment "<Segment1>"

# Feature File: 624667.feature
    And I enter Start Date "<ReturnDate>" for 2nd Segment
    And I enter Start Date "<ReturnDate1>" for 3rd Segment
    And I enter Start Date "<ReturnDate3>" for 2nd Segment
    And I enter Start Date "<ReturnDate4>" for 3rd Segment

# Feature File: 624670.feature
    And I select specific class "<Class1>" for Origin flight in Economy Class
    And I select specific class "<Class1>" for Return flight
    And I add the details in the Passenger Reduction Type as "<Type1>" "<Type2>" and account code as "<AccountCode>"
    And I change the date of travel for the first segment "<StartDate2>"
    And I change the date of travel for the second segment "<StartDate3>"
    And I perform Voluntary Reissue with Pricing option as "<PricingOption1>" with an advanced option type "<AccountCode>" and Passenger Reduction Type as "<Type1>" "<Type2>" and panelty amount as "<PenaltyAmount>"

# Feature File: 624671.feature
    And I select class "<firstSegmentClass>" for the first segment and "<firstSegmentClass>" for the second segment in first connecting segment flight
    And I select class "<secondSegmentClass>" for the first segment and "<secondSegmentClass>" for the second segment in second connecting segment flight
    And I change date of travel for second connecting segment "<StartDate3>" after the first connecting segment booked

# Feature File: 624675.feature
    And I click BulkTicket option
    And I perform Voluntary reissue with penalty and pricing option as "<PricingOption1>" and "<penalty>" and "<taxCode>"
    And I add OSI remarks in order tab "<OSIRemark>"
    And I add OSI remarks in order tab "<OSIRemark1>"

# Feature File: 624676.feature
    And I select and delete the segment "<segNo>"

# Feature File: 629048.feature
    And I click on PNR hyperlink in checkin page
    And I navigate back to the previous page in GUI
    And I search for the passenger in the all passengers list in GATE module
    And I click on the passenger name in GATE page and validate that the added SSR "<SSRKeyword>" is present
    And I click on final report and validate the SSR added for the passenger

# Feature File: 629049.feature
    And I validate if the SSR "<SSRKeyword>" added is displayed in the confirmation dialog
    And I validate if the added SSR "<SSRType>" is available after checkin
    And I retrieve the pnr in native shares and validate that the SSR is added "<SSRType>"

# Feature File: 629051.feature
    And I add SSR "<SSRType>" with "<SSRDescription>" through Services Tab for the passenger "<PaxIndex>"
    And I add SSR "<SSRType1>" with "<SSRDescription1>" through Services Tab for the passenger "<PaxIndex1>"
    And I add SSR "<SSRType2>" with "<SSRDescription2>" through Services Tab for the passenger "<PaxIndex2>"
    And I add SSR "<SSRType3>" with "<SSRDescription2>" through Services Tab for the passenger "<PaxIndex3>"
    And I retrieve the pnr in native shares
    And I validate the SSR "<SSRType>" in native shares after PNR Retrieval
    And I validate the SSR "<SSRType1>" in native shares after PNR Retrieval
    And I validate the SSR "<SSRType2>" in native shares after PNR Retrieval
    And I validate the SSR "<SSRType3>" in native shares after PNR Retrieval

# Feature File: 629055.feature
    And I set total baggage count "<BagCount>"
    And I select passengers using flight numbers in Compensation model "<PassengerType2>"
    And I issue the compensation for selected passengers
    And I validate EMD ticket number in Agent sales report

# Feature File: 629056.feature
    And I add free standard baggage for all the passenger "<BaggageWeight>"
    And I select passengers using flight numbers in Compensation model "<PassengerType>" and "<Index>"
    And I select passengers using flight numbers in Compensation model "<PassengerType1>" and "<Index>"
    And I validate EMD values and validate baggage details in Agent sales report

# Feature File: 629057.feature
    And I select passenger and click proceed to Checkin button
    And I select passengers generate digital voucher and view compensation details

# Feature File: 629058.feature
    And I try to retrieve the ticket number by selecting "<searchType>" option
    And I check the flight status in gate model and delay the flight "<FlightStatus>"

# Feature File: 629069.feature
    And I select passengers using flight numbers in Compensation model "<PassengerType>" for the segment "<SegmentIndex1>"
    And I select passengers using flight numbers in Compensation model "<PassengerType1>" for the segment "<SegmentIndex1>"

# Feature File: 629079.feature
    And I select a flight that already has assigned gate No "<OriginCity>" and "<departureDate>" and "<gateNo>" and "<time>"
    And I search the flight for the segment "<index>" in Gate section
    And I try to assign the gate number "<gateNo1>" for Arrival or Departure flights "<time>" in Native Share

# Feature File: 629101.feature
    And I enter 2_ command to know the gate number for an flight in Native Shares

# Feature File: 629199.feature
    And I add a service "<serviceType>" in cabin

# Feature File: 629423.feature
    And I add standard baggage "<BaggageNo2>" and  "<BaggageWeight2>"
    And I expand and check the "<Field>" EMDs in EMD tab

# Feature File: 629424.feature
    And I add standard baggage with Overweight for first bag "<BaggageNo>" and  "<BaggageWeight>"
    And I click on submit button
    And I validate the error message on addition of baggage for domestic flights

# Feature File: 629933.feature
    And I click add Baggage icon for second passenger

# Feature File: 630721.feature
    And I add standard baggage with Overweight for third bag "<BaggageNo2>" and  "<BaggageWeight2>"

# Feature File: 630722.feature
    And I click on Submit and Proceed to Pay with Foid details

# Feature File: 630723.feature
    And I add standard baggage "<BaggageNo2>" and  "<BaggageWeight1>"
    And I add standard baggage with Overweight for fourth bag "<BaggageNo3>" and  "<BaggageWeight2>"

# Feature File: 630724.feature
    And I select pricing option as Economy Classic Flex
    And I add standard baggage with Overweight for third bag "<BaggageNo3>" and  "<BaggageWeight2>"

# Feature File: 630725.feature
    And I select value from the Short Checkin dropdown
    And I add standard baggage with Overweight for fourth bag "<BaggageNo3>" and  "<BaggageWeight3>"

# Feature File: 630726.feature
    And I add standard baggage with Overweight for fourth bag "<BaggageNo3>" and  "<BaggageWeight1>"

# Feature File: 630727.feature
    And I add "<FQTV>" silver frequent flyer passengers
    And I add segment from and to City "<Destination>" and "<OriginCity>"

# Feature File: 630728.feature
    And I search for the segment "<SegmentIndex2>" in Check-In page

# Feature File: 630730.feature
    And I add standard baggage with Overweight for third bag "<BaggageNo3>" and  "<BaggageWeight3>"

# Feature File: 630731.feature
    And I store the baggage count
    And I click on check-in for the passenger after adding baggage
    And I validate the confirmation dialog that passenger is Checked-in

# Feature File: 630732.feature
    And I click on Submit and Proceed to Pay with Foid details if needed and Capture the Baggage EMD details
    And I validate the Baggage EMD values in Agent Sales Report

# Feature File: 630766.feature
    And I add standard baggage with Overweight for fourth bag "<BaggageNo4>" and  "<BaggageWeight4>"

# Feature File: 630767.feature
    And I add standard baggage "<BaggageNo4>" and  "<BaggageWeight4>"
    And I add standard baggage with Overweight for fifth bag "<BaggageNo5>" and  "<BaggageWeight5>"

# Feature File: 630770.feature
    And I enter the details in Security Document Verification page with all details
    And I add standard baggage with Overweight for fifth bag "<BaggageNo4>" and  "<BaggageWeight4>"

# Feature File: 630771.feature
    And I add standard baggage "<BaggageNo3>" and  "<BaggageWeight>"
    And I add standard baggage with Overweight for fifth bag "<BaggageNo4>" and  "<BaggageWeight1>"

# Feature File: 630786.feature
    And I validate EMD values in Agent Sales Report and view tax details
    And I click on Submit and Proceed to Pay after adding baggage

# Feature File: 630787.feature
    And I select value from the Short Checkin dropdown "<checkinDestination>"
    And I add standard baggage "<BaggageNo>" and  "<BaggageWeight2>"
    And I add standard baggage with Overweight for third bag "<BaggageNo2>" and  "<BaggageWeight1>"
    And I add standard baggage "<BaggageNo3>" and  "<BaggageWeight2>"
    And I add standard baggage "<BaggageNo4>" and  "<BaggageWeight2>"

# Feature File: 630788.feature
    And I click add Baggage icon for the specific pax "<PaxType>"
    And I click add Baggage icon for the specific pax "<PaxType1>"

# Feature File: 630789.feature
    And I search the passenger in checkin page using flight number "<segmentIndex1>"

# Feature File: 630790.feature
    And I add "<FQTV>" frequent flyer Presidential passengers
    And I add standard baggage "<BaggageNo4>" and  "<BaggageWeight>"




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