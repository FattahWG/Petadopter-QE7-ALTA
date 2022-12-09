@adoption
Feature: Adoption pet
  as user i want to adopt a pet

  Background:
    Given User open the web page
    When User input "test" as userName and "test" as password
    And User click on pop up alert success login

  @positive
  Scenario: Verify selected pet to adopt by user will appeared on adoption history
    When user choose a pet to adopt
    Then in adoption history will appeared a pet that user choose

  @positive
  Scenario: Verify pet status request when pet owner accepted the adoption
    When user go to adoption history
    Then user could see pet adoption status is "Accepted"

  @positive
  Scenario: Verify pet status request when pet owner doesn't answer the adoption
    When user go to adoption history
    Then user can see adoption status is still "Requested"

  @positive
  Scenario: Verify pet status request when pet owner rejected the adoption
    When user go to adoption history
    Then user will see the adoption status is "Rejected"

  @positive
  Scenario: Verify user able to see invitation meeting from owner
    When user go to My Invitations page
    Then user will see invitation meeting from owner pet