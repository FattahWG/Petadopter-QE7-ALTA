@register
Feature: Register User
  As user i want to register account

  @positive
  Scenario Outline: Register user with valid fill on the field
    Given User open the web page
    And User go to signup page
    When User input "<fullName>" as fullName and select "<city>" on city field
    And User input "<fullAddress>" as fullAddress and new username "<userName>"
    When User input "<email>" as email and input "<number>" as phoneNumber
    And User register password "<password>"
    Then User can see success alert with message "Register success"
    Examples:
      | fullName | city     | fullAddress   | userName | email          | number       | password  |
      | testing  | Semarang | Semarang kota | tet40    | te40@gmail.com | 081123456789 | testing12 |

  @negative
  Scenario Outline: Register user without combination alphabet and number on password
    Given User open the web page
    And User go to signup page
    When User input "<fullName>" as fullName and select "<city>" on city field
    And User input "<fullAddress>" as fullAddress and new username "<userName>"
    When User input "<email>" as email and input "<number>" as phoneNumber
    And User register password "<password>"
    Then User can see alert with message "Password must combination alphabet and number"
    Examples:
      | fullName | city     | fullAddress   | userName | email           | number       | password |
      | testing  | Semarang | Semarang kota | tet31    | tet31@gmail.com | 081123456789 | testings |
      | testing  | Semarang | Semarang kota | teti32   | tet32@gmail.com | 081123456789 | 12345678 |

  @negative
  Scenario Outline: Register user with password less than 8 character
    Given User open the web page
    And User go to signup page
    When User input "<fullName>" as fullName and select "<city>" on city field
    And User input "<fullAddress>" as fullAddress and new username "<userName>"
    When User input "<email>" as email and input "<number>" as phoneNumber
    And User register password "<password>"
    Then User can see alert with message "Password must have at least 8 character"
    Examples:
      | fullName | city     | fullAddress   | userName | email           | number       | password |
      | testing  | Semarang | Semarang kota | tet19    | tet19@gmail.com | 081123456789 | tes12    |

  @negative
  Scenario Outline: Register user with registered username
    Given User open the web page
    And User go to signup page
    When User input "<fullName>" as fullName and select "<city>" on city field
    And User input "<fullAddress>" as fullAddress and new username "<userName>"
    When User input "<email>" as email and input "<number>" as phoneNumber
    And User register password "<password>"
    Then User can see alert with message "Cant input existing data"
    Examples:
      | fullName | city     | fullAddress   | userName   | email           | number       | password |
      | testing  | Semarang | Semarang kota | tetig61111 | tet20@gmail.com | 081123456789 | tes12    |

  @negative
  Scenario Outline: Register user with phone number less than 10 digit
    Given User open the web page
    And User go to signup page
    When User input "<fullName>" as fullName and select "<city>" on city field
    And User input "<fullAddress>" as fullAddress and new username "<userName>"
    When User input "<email>" as email and input "<number>" as phoneNumber
    And User register password "<password>"
    Then User can see alert with message "Invalid phone number"
    Examples:
      | fullName | city     | fullAddress   | userName | email        | number    | password |
      | testing  | Semarang | Semarang kota | tet10    | tet10@gmail.com | 081123456 | tes12    |

  @negative
  Scenario Outline: Register user with phone number more than 13 digit
    Given User open the web page
    And User go to signup page
    When User input "<fullName>" as fullName and select "<city>" on city field
    And User input "<fullAddress>" as fullAddress and new username "<userName>"
    When User input "<email>" as email and input "<number>" as phoneNumber
    And User register password "<password>"
    Then User can see alert with message "Invalid phone number"
    Examples:
      | fullName | city     | fullAddress   | userName | email           | number         | password |
      | testing  | Semarang | Semarang kota | tet11    | tet11@gmail.com | 08112345678912 | tes12    |