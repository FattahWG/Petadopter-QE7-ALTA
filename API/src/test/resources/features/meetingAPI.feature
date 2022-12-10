@meeting
Feature: API for endpoint meetings
  @post
  Scenario: Post create meeting with valid body json
    Given Post create meeting with valid body json
    When Send post meeting request
    Then API response code should be 200 Bad Request
    And Response body should contain messages "post meeting success"
    And Validate post meeting json schema

  @post
  Scenario: Post create meeting with invalid token on body json
    Given Post create meeting with invalid token
    When Send post meeting request
    Then API response code should be 400 Bad Request

  @post
  Scenario: Post create meeting with invalid adoption_id on body json
    Given Post create meeting with invalid adoption_id
    When Send post meeting request
    Then API response code should be 400 Bad Request

  @post
  Scenario: Post create meeting with invalid time on body json
    Given Post create meeting with invalid time
    When Send post meeting request
    Then API response code should be 400 Bad Request

  @post
  Scenario: Post create meeting with invalid date on body json
    Given Post create meeting with invalid date
    When Send post meeting request
    Then API response code should be 400 Bad Request

  @get
  Scenario Outline: Get owner meetings with valid page
    Given Get owner meetings with valid page <page>
    When Send get meeting request
    Then API response code should be 200 OK
    And Validate get owner meetings json schema
    Examples:
      | page |
      | 1    |
      | 2    |

  @get
  Scenario Outline: Get owner meetings with invalid page
    Given Get owner meetings with invalid page "<page>"
    When Send get meeting request
    Then API response code should be 404 Not Found
    Examples:
      | page |
      | abc  |
      | @@@  |

  @get
  Scenario Outline: Get seeker meetings with valid page
    Given Get seeker meetings with valid page <page>
    When Send get seeker meeting request
    Then API response code should be 200 OK
    And Validate get seeker meeting json schema
    Examples:
      | page |
      | 1    |
      | 2    |

  @get
  Scenario Outline: Get seeker meetings with invalid page
    Given Get seeker meetings with invalid page "<page>"
    When Send get seeker meeting request
    Then API response code should be 404 Not Found
    Examples:
      | page |
      | abc  |
      | @@@  |

  @get
  Scenario Outline: Get owner meetings with valid id
    Given Get single meetings with valid id <meeting_id>
    When Send get single meeting request
    Then API response code should be 200 OK
    And Response body should contain meeting_id <meeting_id>
    And Validate get single meeting json schema
    Examples:
      | meeting_id |
      | 73         |
      | 74         |

  @get
  Scenario Outline: Get owner meetings with invalid id
    Given Get single meetings with invalid id "<meeting_id>"
    When Send get single meeting request
    Then API response code should be 400 Bad Request
    Examples:
      | meeting_id |
      | abc        |
      | @@@        |

  @put
  Scenario: Put update meeting with valid body json and valid id
    Given Put update meeting with valid body json and valid id 11
    When Send put update meeting request
    Then API response code should be 200 OK
    And Response body should contain messages "success update data"
    And Validate update meeting json schema

  @put
  Scenario: Put update meeting with valid body json and invalid id
    Given Put update meeting with valid body json and invalid id "abc"
    When Send put update meeting request
    Then API response code should be 400 Bad Request

  @put
  Scenario: Put update meeting with invalid time on body json
    Given Put update meeting with invalid time on body json and valid id 11
    When Send put update meeting request
    Then API response code should be 400 Bad Request

  @put
  Scenario: Put update meeting with invalid date on body json
    Given Put update meeting with invalid date on body json and valid id 11
    When Send put update meeting request
    Then API response code should be 400 Bad Request

  @delete
  Scenario: Delete meeting with valid id
    Given Delete meeting with valid id 4
    When Send delete meeting request
    Then API response code should be 200 OK

  @delete
  Scenario: Delete meeting with invalid id
    Given Delete meeting with valid id "abc"
    When Send delete meeting request
    Then API response code should be 400 Bad Request