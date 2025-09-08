Feature: Amazon

  Scenario: Login with valid credentials
    Given I open Amazon login page
    When I enter valid email and password
    And I click on login button
    Then I should be redirected to my account page
