#Description:
#Select affected flight in compensation mask, by flight number and date
#Them select one passengers for compensate list, add amount of compensation
#Be able to emit and send by e-mail
#
#Expected Result:
#Associate EMD and add auto load OSI in reservation with amount and reason (Cancellation)

@IcouponUnAssign
Feature: 236656 - Make a voucher of compensation for cancel flight for one passenger

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: 236656 - Make a voucher of compensation for cancel flight for one passenger

    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I select the printer "<printer>" and "<printerStatus>"

    And I navigate to the User provisioning Tool page
    And I enter User Id and click on search in user provisioning page
    And I select POS and set status of the iCoupon in User Provisioning tool page "<iCouponStatus>"
    And I navigate to home screen

    And I navigate to Gate section
    And I select flight by flight status in gate page "<OriginCity>" and "<departureDate>" and "<flightStatus>"
    And I navigate to home screen
    And I navigate to travel Compensation page
    And I select passengers using flight numbers in Compensation model "<PassengerType>"
    And I select compensation reason and select passenger "<compensationReason>"
    And I select passenger and issue compensation
    And I select passengers and click print button
    And I select passenger and click on email button
    And I click on view icon and display the compensation additional details
    And I navigate to home screen
    And I click the tickets tab and click ticket EMD tab verify the segment name status "<NameStatus>"
    And I logout from COPA GUI application


    Examples:
      |salesOffice|currency|OriginCity|departureDate|compensationReason|Adult|Child|INS|INF|PassengerType     |printer      |printerStatus|iCouponStatus|flightStatus|NameStatus      |
      |PTY ATO    |USD     |PTY       |01 days      |Baggage Damage    |1    |0    |0  |0  |All Passenger List|US-5CD4377SFF|PrintReady   |UnAssign     |CANCELLED   |BGGE DAMAGE COMP|


