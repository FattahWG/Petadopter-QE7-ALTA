@Delete
Feature: Deleting user

  Background:
    Given User open the web page
    When User input "delete" as userName and "123" as password
    And User click on pop up alert success login
    Then User go to home page

  @positive
  Scenario: User delete their account
    Given user go to profile page
    Then user click delete account button