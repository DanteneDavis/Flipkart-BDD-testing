Feature: Flipkart search Feature


Scenario: Validating the searchItem option
    Given User should be logged into the homepage6
    When User clicks on Search option
    And User enters items as their wish
    And User clicks on Search Button 	
    Then The desired item page is displayed
