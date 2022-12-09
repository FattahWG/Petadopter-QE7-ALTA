@login
Feature: Login feature
  as user i want to login to web

  @positive
  Scenario: Login with username and password
    Given User open the web page
    When User input "a" as userName and "a" as password
    And User click on pop up alert success login
    Then User go to home page

  @negative
  Scenario Outline: Login with unregistered username and password
    Given User open the web page
    When User input "<userName>" as userName and "<password>" as password
    Then User will see alert with message "Wrong username or password"
    Examples:
      | userName | password   |
      | testing  | asd        |
      | asd      | testing123 |
      | asd      | asd        |