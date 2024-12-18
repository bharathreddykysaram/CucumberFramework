@login
Feature: login
  login to page
@valid_cred
  Scenario: login
    Given user is login to page
    When user enters a valid username "standard_user"
    And user enters a valid password "secret_sauce"
    And user clicks on the login button
    Then user navigates to the dashboard page
  @invalid_cred
  Scenario: invalid_login
    Given user is login to page
    When user enters a valid username "invalid_user"
    And user enters a valid password "invalid_password"
    And user clicks on the login button
    Then user navigates to the dashboard page
