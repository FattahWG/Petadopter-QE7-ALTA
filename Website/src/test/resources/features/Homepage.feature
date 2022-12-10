@Homepage
Feature: User can interact with available menu in home page

  Background:
    Given User open the web page
    When User input "12fattah" as userName and "12345abcde" as password
    And User click on pop up alert success login
    Then User go to home page

  @positive
  Scenario: User can open Adoption page
    When user click adoption menu
    Then user go to adoption history

  @positive
  Scenario: User can open My Pets page
    When user click my pets menu
    Then user go to My pets page

  @positive
  Scenario: User can toggle thema in home page
    When user click thema button
    Then thema will change

  @positive
  Scenario: User can open my invitation page
    When user click hamburger button as my invitation menu
    Then user go to My Invitations page

  @positive
  Scenario: User can open see more page
    When user click see more button
    Then user go to see more page
