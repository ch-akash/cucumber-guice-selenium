Feature: This a sample run

  Scenario: To check if we can place an order
    Given user is on home page
    When we select Tea collection to view
    Then we extract green tea description
    And we just log it