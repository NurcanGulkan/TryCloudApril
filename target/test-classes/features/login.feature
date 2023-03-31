@login
Feature:As a user,I should be able to login TryCloud app

  Scenario: Verify user login successfully
    Given use on the login page
    When user enter valid "username" and "password"
    And user click login button
    Then user should be at dashboard page