#Description:
#Select affected flight in compensation mask, by flight number and date
#Them select one passengers for compensate list, add amount of compensation
#Be able to emit and send by e-mail
#
#Expected Result:
#Associate EMD and add auto load OSI in reservation with amount and reason (Cancellation)


@VIR
Feature: sample - A Sample feature

  Background:

    Given COPA GUI Application is launched in the browser

  Scenario Outline: sample - A Sample feature
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I want to print Hello World in the Console
#    And I want to print Hello World2 in the Console
#     I want to print Hello World in the Console




    Examples:
      |salesOffice|currency|OriginCity|departureDate|compensationReason|Adult|Child|INS|INF|PassengerType     |printer      |printerStatus|iCouponStatus|flightStatus|NameStatus      |
      |PTY ATO    |USD     |PTY       |01 days      |Baggage Damage    |1    |0    |0  |0  |All Passenger List|US-5CD4377SFF|PrintReady   |UnAssign     |CANCELLED   |BGGE DAMAGE COMP|

