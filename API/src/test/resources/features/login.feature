@login
Feature: Login feature
  @positive
  Scenario: Post login user with valid body json
    Given Post login with valid body json
    When Send post login request
    Then API response code should be 200 OK
    And Response body should contain messages "Login success"
    And Validate post login json schema

  @negative
  Scenario: Post login user with invalid username on body json
    Given Post login with invalid username
    When Send post login request
    Then API response code should be 400 Bad Request
    And Response body should contain messages "Wrong username or password"

  @negative
  Scenario: Post login user with invalid password on body json
    Given Post login with invalid password
    When Send post login request
    Then API response code should be 400 Bad Request
    And Response body should contain messages "Wrong username or password"

  @negative
  Scenario: Post login user with invalid username and password
    Given Post login with invalid username and password
    When Send post login request
    Then API response code should be 400 Bad Request
    And Response body should contain messages "Wrong username or password"