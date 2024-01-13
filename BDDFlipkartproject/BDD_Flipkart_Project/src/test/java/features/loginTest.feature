Feature: Flipkart Login Feature

  Scenario Outline: Validating login with multiple username and password
    Given User should be on Login page
    When User enters username as <uname> and <pass>
    And User clicks on Login Button
    Then HomePage should be displayed for only valid login

    Examples: 
      | uname      | pass     |
      | 6282104008 | admin    |
      | Dummy      | Dummy123 |
