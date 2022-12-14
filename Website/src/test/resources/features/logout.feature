@logout
Feature: User logout

  Background:
    Given User open the web page
    When User input "test" as userName and "test" as password
    And User click on pop up alert success login
    Then User go to home page

  @positive
  Scenario: User logout
    Given User open the kebab menu
    Then user click logout