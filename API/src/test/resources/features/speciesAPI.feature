@species
  Feature: Species Data

    @post
    Scenario: Post Species Data With Valid Json By Bearer Token
      Given Post create species data with valid json
      When Send post create species request
      Then Status code should return 200 OK
      And Validate post species json schema

    @post
    Scenario: Post Species Data With Multipart
      Given Post create species data with multipart
      When Send post create species data multipart request
      Then Status code should return 200 OK
      And Validate post species json schema

    @get
    Scenario: Get Species Data With Valid Path
      Given Get species data with valid path
      When Send get species request
      Then Status code should return 200 OK
      And Validate get species json schema

    @get
    Scenario Outline: Get Species Data With Parameter ID
      Given Get species data with parameter id <id>
      When Send get species with parameter id request
      Then Status code should return 200 OK
      And Validate get species parameter id json schema
      Examples:
      |id|
      |1 |

    @put
    Scenario Outline: Put Update Species Data With Multipart
      Given Put Update species data with multipart by id <id>
      When Send put update species multipart request
      Then Status code should return 200 OK
      And Validate update species valid id json schema
      Examples:
      |id|
      |4 |

    @put
    Scenario Outline: Put Update Species Data With Valid Json
      Given Put update species data with valid json by id <id>
      When Send put update species request
      Then Status code should return 200 OK
      And Validate update species valid id json schema
      Examples:
      |id|
      |5 |
      |16|

    @put
    Scenario Outline: Put Update Species Data With valid Json by invalid id
      Given Put update species data with valid json by invalid id <id>
      When Send put update species request
      Then Status code should return 500 Internal Server Error
      And Validate update species invalid id json schema
      Examples:
        |id|
        |87 |
        |100|

    @delete
    Scenario Outline: Delete Species Data With Valid Id
      Given Delete species data with valid id <id>
      When Send delete species request
      Then Status code should return 200 OK
      And Delete species json schema
      Examples:
        |id|
        |13 |

    @delete
    Scenario Outline: Delete Species Data With Invalid Id
      Given Delete species data with invalid id <id>
      When Send delete species request
      Then Status code should return 520 HTML
      Examples:
        |id|
        |100 |