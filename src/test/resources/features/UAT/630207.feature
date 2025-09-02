#630207
#
#Description:
#
#Validated that the system make the correct process with unaccompanied minor
#
#Create a reservation 1 unaccompanied minor , in Classic class, route (PTY-SJO) in PTY ATO
#Fill the pax information
#Pay the reservation with Cash
#Add the service of Unnacompained minor
#Pay the service
#Check that system make the reservation correctly


@UAT
Feature: 630207 - Validated that the system make the correct process with unaccompanied minor

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 630207 - Validated that the system make the correct process with unaccompanied minor

#GUI
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I add "<Child>" child passengers
    And I add "<INS>" infant with seat passengers
    And I add "<INF>" infant without seat passengers
    And I want to display all the passengers
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I click on the Reservation section
    And I click on New Order for creating new PNR in GUI
    And I click on New Order for creating new PNR in GUI
    And Select from and to City "<OriginCity>" and "<Destination>"
    And I enter Start Date "<StartDate>" for one way booking
    And I select child passengers
    And I select class "<originClass>" for Origin flight
    And I select pricing option as Economy Classic
    And I select the Quote Options and click on Next
    And I validate the Price Quote and click on Next
    Then I enter required passenger details for COPA GUI
    And I click on Book and FileFare button or File Fare button
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I add a service "<ServiceType>" in cabin
    And I Click on CheckOut button for payment
    And I choose one mode of payment
    And I make the first payment by selecting the payment type as "<PaymentType>"
    And I enter the details in the email recipients page
    And I validate if the payment is successful
    And I click the Tickets tab
    And I click the EMD subtab present in Tickets tab
    And I select Sales Report and Agent Sales Report
    And I validate EMD values in Agent Sales Report
    And I logout from COPA GUI application


    Examples:
      |salesOffice     |currency |OriginCity   |Destination |StartDate  |ServiceType|Adult|Child|INF|INS|BaggageNo |BaggageNo1|BaggageNo2|BaggageNo3|BaggageWeight|BaggageWeight3|PaymentType|originClass|returnClass|
      |PTY ATO         |USD      |PTY          |SJO         |01 days    |UMNR       |0    |1    |0  |0  |1         |2         |3         |4         |23           |  32          |Cash       |Economy    |Economy    |







