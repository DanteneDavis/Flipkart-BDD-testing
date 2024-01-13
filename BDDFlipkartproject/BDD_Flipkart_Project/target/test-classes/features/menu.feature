Feature: Flipkart menu Feature

  Scenario: Validating the menu option
    Given User should be logged into the homepage7
    When User clicks on Mobiles symbol Button
    And User clicks on desired model here we are clicking Samsung model Button
    And User selects desired model here we are selecting SAMSUNG Galaxy F12 model
    And The new Child Window opens
    And User clicks on add to cart Button
    And User clicks on Buy now Button 
    Then The the Buy now Product page is displayed
