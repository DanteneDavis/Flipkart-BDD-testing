Feature: Flipkart mycart Feature

  Scenario: Validating the mycart option
    Given User should be logged into the homepage5
    When User clicks on cart symbol Button
    Then The cart is displayed
