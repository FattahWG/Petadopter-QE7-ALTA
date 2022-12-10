@adoptions
Feature: API for endpoint adoptions
  @post
  Scenario: Post create applier with valid body json
    Given Set path to appliers with valid body json
    When Send post appliers request
    Then API response code should be 200 OK
    And Response body should contain messages "Post pets success"
    And Validate post applier json schema

  @post
  Scenario: Post create applier with string
    Given Set path to appliers with string
    When Send post appliers request
    Then API response code should be 400 Bad Request

  @post
  Scenario: Post create applier without fill on body json
    Given Set path to appliers without fill on body json
    When Send post appliers request
    Then API response code should be 400 Bad Request

  @get
  Scenario: Get all appliers with valid page
    Given Get all appliers with valid page 1
    When Send get appliers request
    Then API response code should be 200 OK
    And Validate get applier json schema

  @get
  Scenario: Get all appliers with invalid page
    Given Get all appliers with invalid page "abc"
    When Send get appliers request
    Then API response code should be 404 Not Found

  @get
  Scenario: Get all adoptions with valid page
    Given Get all adoptions with valid page 1
    When Send get adoptions request
    Then API response code should be 200 OK
    And Validate get adoption json schema

  @get
  Scenario: Get all adoptions with invalid page
    Given Get all adoptions with invalid page "abc"
    When Send get adoptions request
    Then API response code should be 404 Not Found

  @get
  Scenario Outline: Get single applier with valid id
    Given Get single applier with valid adoption_id <adoption_id>
    When Send get single applier request
    Then API response code should be 200 OK
    And Response body should contain adoption_id <adoption_id>
    And Validate get single applier json schema
    Examples:
      | adoption_id |
      | 14          |
      | 15          |

  @get
  Scenario Outline: Get single applier with invalid id
    Given Get single with invalid id "<adoption_id>"
    When Send get single applier request
    Then API response code should be 404 Not Found
    Examples:
      | adoption_id |
      | abc         |
      | @@@         |

  @put
  Scenario Outline: Put update adoption with valid body json and valid id
    Given Put update adoption with valid body json and valid id <adoption_id>
    When Send put update request
    Then API response code should be 200 OK
    And Response body should contain messages "Success update data"
    And Validate put update json schema
    Examples:
      | adoption_id |
      | 11          |
      | 14          |

  @put
  Scenario Outline: Put update adoption with valid body json and invalid id
    Given Put update adoption with valid body json and invalid id "<adoption_id>"
    When Send put update request
    Then API response code should be 404 Not Found
    Examples:
      | adoption_id |
      | abc         |
      | @@@         |

  @put
  Scenario: Put update adoption with invalid body json and valid id
    Given Put update adoption with invalid body json and valid id 11
    When Send put update request
    Then API response code should be 400 Bad Request

  @delete
  Scenario: Delete pet data with valid pet_id
    Given Delete pet data with valid pet_id 26
    When Send delete pet data request
    Then API response code should be 200 OK

  @delete
  Scenario Outline: Delete pet data with invalid pet_id
    Given Delete pet data with invalid pet_id "<pet_id>"
    When Send delete pet data request
    Then API response code should be 404 Not Found
    Examples:
      | pet_id |
      | abc    |
      | @@@    |