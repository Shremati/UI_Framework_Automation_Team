#Description:
#Involuntary Reissue of NR booking (P04B)
#
#Expected:
#
#Actual:
@Reissue
Feature: 624619 - Involuntary Reissue of NR booking  (P04B)

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 624619 - Involuntary Reissue of NR booking (P04B)

    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I add "<NRPS>" NRPS passengers
    And I want to display all the passengers
    #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on Tools Menu
    And I click on Native Shares
    And I set Class Of Service to "<COS>"
    And I set Airline to "<Airline>" for Segment "<SegmentIndex>"
    And I set startdate to "<StartDate>" for Segment "<SegmentIndex>"
    And I set PNR Type to "<pnrType>"
    And I search for flight availability in Native shares of special pnr for first segment from "<OriginCity>" to "<Destination>" and "<StartDate>"
    And I enter the passenger details in Native shares
    And I enter the passenger phone details for "<POS>"
    And I save the details of the passenger
    And I end and retrieve the PNR in Native shares
    And I click on Cancel button in native shares
    And I click the order tab
    And I select the Quote Options and click on Next retrieving PNR from shares
    And I select pricing option Price as Best Buy retrieving PNR from shares
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
#    And I click on Ticket tab and check the "<ticketStatus>" status
    And I click the Tickets tab and try to click the Coupon number and verify the details
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I navigate to home screen
    And I click the order tab
#    And I navigate to Order tab
    And I change first segment date "<StartDate1>"
    And I perform the Involuntary Reissue
    And I enter the details in the email recipients page
#    And I validate if the payment is successful
    And I store the updated emd and ticket details and validate if payment is successful
#    And I click on Ticket tab and check the "<ticketStatus>" status
#    And I click on Ticket tab and check the "<ticketStatus1>" status
    And I navigate to home screen
    And I try to retrieve the pnr from Order Screen to check the "<ticketStatus1>" status in ticket tab
    And I click the Tickets tab and store the ticket number
    And I click the EMD subtab and view the EMD details
    And I select sales report and select Agent sales report
#    And I validate Ticket and EMD values in Agent sales report
    And I validate Ticket and EMD values in Agent sales report and view tax details
    And I logout from COPA GUI application

    Examples:
      |salesOffice   |currency|OriginCity  |Destination  |StartDate|StartDate1|Adult|Child|INF|INS|PaymentType     |COS|Airline|NRPS|pnrType|POS  |SegmentIndex|ticketStatus|ticketStatus1|
      |PTY ATO       |USD     |PTY         |MEX          |01 Days  |02 Days   |0    |0    |0  |0  |MASTERCARD      |Y  |CM     |1   |NRPS   |PTY  |0           |Open        |EXCHD IRR    |



