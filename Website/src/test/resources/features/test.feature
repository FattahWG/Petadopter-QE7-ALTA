@test
Feature: Login

  @test
  Scenario: Login with username and password
    Given User open the web page
    When User input "12fattah" as userName and "12345abcde" as password
    And User click on pop up alert success login
    Then User go to home page
