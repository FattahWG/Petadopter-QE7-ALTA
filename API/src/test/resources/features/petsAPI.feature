@pets
  Feature: Pets Data

    @get
    Scenario: Get All Pets Data
      Given get all pets
      When Send get all pets request
      Then Status code should response 200 OK
      And Validate get pets data json schema

    @get
    Scenario Outline: Get Pets Data By ID
      Given Get pets data by parameter id <id>
      When Send get pets data by id request
      Then Status code should response 200 OK
      And Validate get pets data by id json schema
      Examples:
        | id |
        | 15 |
        | 55 |

    @get
    Scenario Outline: Get Pets Data By Invalid ID
      Given Get pets data by parameter invalid id <id>
      When Send get pets data by id request
      Then Status code should response 404 Not Found
      And Validate get pets data by invalid id json schema
      Examples:
        | id |
        | 21 |
        | 31 |
        | 41 |

    @get
    Scenario: Get All User Pets Data
      Given Get all user pets data
      When Send get all user pets data request
      Then Status code should response 200 OK
      And Validate get all user pets data json schema

    @post
    Scenario: Post Create Pets Data With Multipart
      Given Post create pets data with multipart
      When Send post create pets request
      Then Status code should response 200 OK
      And Validate post create pets data json schema

    @post
    Scenario: Post Create Pets Data With Invalid Json
      Given Post create pets data with invalid json
      When Send post create pets invalid json request
      Then Status code should response 400 Bad Request
      And Validate post create pets data json schema

    @put
    Scenario Outline: Put Update Pets Data With Multipart
      Given Put update pets data with multipart with id <id>
      When Send put update data request
      Then Status code should response 200 OK
      And Validate put update pets data json schema
      Examples:
        | id |
        | 48 |
        | 58 |

    @delete
    Scenario Outline: Delete Pets Data
      Given Delete pets data with valid id <id>
      When Send delete pets request
      Then Status code should response 200 OK
      And Validate delete pets data json schema
      Examples:
        | id |
        | 25 |

    @delete
    Scenario Outline: Delete Pets Data With Invalid Id
      Given Delete pets data with invalid id <id>
      When Send delete pets request
      Then Status code should response 520 Html
      Examples:
        | id |
        | 88 |
