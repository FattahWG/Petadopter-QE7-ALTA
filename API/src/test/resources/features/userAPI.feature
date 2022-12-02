@API
Feature: user API testing

  @API @userAPI
  Scenario: Post regist new user with valid json
    Given Post regist new user with valid json
    When Send post regist new user
    Then Status code should be 200 "Register success"
    And Validate regist success with valid json

  @API @userAPI
  Scenario: Post regist user without username parameter
    Given Post regist new user without username json
    When Send post regist new user
    Then Status code should be 400 "Wrong input"
    And Validate regist fail with valid json

  @API @UserAPI
  Scenario: Post regist user without fullname parameter
    Given Post regist new user without fullname json
    When Send post regist new user
    Then Status code should be 400 "Wrong input"
    And Validate regist fail with valid json

  @API @UserAPI
  Scenario: Post Regist user without email parameter
    Given Post regist new user without email json
    When Send post regist new user
    Then Status code should be 400 "Wrong input"
    And Validate regist fail with valid json

  @API @UserAPI
  Scenario: Post Regist user without address parameter
    Given Post regist new user without address json
    When Send post regist new user
    Then Status code should be 400 "Wrong input"
    And Validate regist fail with valid json

  @API @UserAPI
  Scenario: Post regist user without city parameter
    Given Post Regist new user without city json
    When Send post regist new user
    Then Status code should be 400 "Wrong input"
    And Validate regist fail with valid json

  @API @UserAPI
  Scenario: Post regist user without password parameter
    Given Post Regist new user without password json
    When Send post regist new user
    Then Status code should be 400 "Wrong input"
    And Validate regist fail with valid json

  @API @UserAPI
  Scenario: Post regist user without phonenumber parameter
    Given Post Regist new user without phonenumber json
    When Send post regist new user
    Then Status code should be 400 "Wrong input"
    And Validate regist fail with valid json

  @API @UserAPI
  Scenario: Post regist user with exist user data
    Given Post Regist new user with exist user json
    When Send post regist new user
    Then Status code should be 409 "Cant input existing data"
    And Validate regist fail with valid json

  @API @UserAPI
  Scenario: Put update photo profile user
    Given Put update photo profile user with valid json
    When Send post regist new user
    Then Status code should be 400 "missing or malformed jwt"
    And Validate success update with valid json


