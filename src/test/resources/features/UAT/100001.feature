
@UnAssignIcoupon
Feature: 100001 - UnAssign Icoupon for PTY ATO POS

  Background:
    Given COPA GUI Application is launched in the browser

  Scenario Outline: 10001 - UnAssign Icoupon for PTY ATO POS

   #GUI
    Then I enter valid credentials to log into COPA GUI application
    Then I validate successful login
    And I create the passengers data
    And I add "<Adult>" adult passengers
    And I change the Sales Office and Currency "<salesOffice>" and "<currency>"
    And I navigate to the User provisioning Tool page
    And I enter User Id and click on search in user provisioning page
    And I select POS and set status of the iCoupon in User Provisioning tool page "<iCouponStatus>"
    And I logout from COPA GUI application



    Examples:
      |salesOffice |currency|Adult|iCouponStatus|
      |PTY ATO     |USD     |1    |UnAssign     |


