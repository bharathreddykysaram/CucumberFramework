Feature: login
  login to page

  Scenario: login
    Given user is login to page
    When user enters a valid username
    And user enters a valid password
    And user clicks on the login button
    Then user navigates to the dashboard page

