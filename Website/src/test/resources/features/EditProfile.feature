@editProfile
Feature: Edit Profile
  as user i want to edit my profile

  @positive
  Scenario Outline: edit profile with fill on all field
    Given User open the web page
    When User input "testing10" as userName and "testing1" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see message "Update success"
    Examples:
      | fullName      | city   | fullAddress | userName        | email             | phoneNumber  | password |
      | dummy testing | Malang | Malang kota | dummy testing10 | dummy10@gmail.com | 083987654321 | dummy2   |

  @negative
  Scenario Outline: edit profile with registered username
    Given User open the web page
    When User input "testing11" as userName and "testing1" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Cant input existing data"
    Examples:
      | fullName      | city   | fullAddress | userName | email            | phoneNumber  | password |
      | dummy testing | Malang | Malang kota | test     | dummy11@gmail.com | 083987654321 | dummy2   |

  @negative
  Scenario Outline: edit profile with registered email
    Given User open the web page
    When User input "testing12" as userName and "testing1" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Cant input existing data"
    Examples:
      | fullName      | city   | fullAddress | userName       | email          | phoneNumber  | password |
      | dummy testing | Malang | Malang kota | dummy testing12 | test@gmail.com | 083987654321 | dummy2   |

  @negative
  Scenario Outline: edit profile without combination number on password
    Given User open the web page
    When User input "testing13" as userName and "testing1" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Password must combination alphabet and number"
    Examples:
      | fullName      | city   | fullAddress | userName        | email               | phoneNumber  | password |
      | dummy testing | Malang | Malang kota | dummy testing13 | testing13@gmail.com | 083987654321 | dummy    |

  @negative
  Scenario Outline: edit profile without combination alphabet on password
    Given User open the web page
    When User input "testing14" as userName and "testing1" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Password must combination alphabet and number"
    Examples:
      | fullName      | city   | fullAddress | userName        | email              | phoneNumber  | password |
      | dummy testing | Malang | Malang kota | dummy testing14 | testing14@gmail.com | 083987654321 | 12345678 |

  @negative
  Scenario Outline: edit profile with password less than 8 character
    Given User open the web page
    When User input "testing15" as userName and "testing1" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Password must have at least 8 character"
    Examples:
      | fullName      | city   | fullAddress | userName       | email               | phoneNumber  | password |
      | dummy testing | Malang | Malang kota | dummy testing15 | testing15@gmail.com | 083987654321 | test12   |

  @negative
  Scenario Outline: edit profile with phone number less than 10 digit
    Given User open the web page
    When User input "testing16" as userName and "testing1" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Invalid phone number"
    Examples:
      | fullName      | city   | fullAddress | userName        | email              | phoneNumber | password |
      | dummy testing | Malang | Malang kota | dummy testing16 | testing16@gmail.com | 08398765    | dummy2   |

  @negative
  Scenario Outline: edit profile with phone number more than 13 digit
    Given User open the web page
    When User input "testing17" as userName and "testing1" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Invalid phone number"
    Examples:
      | fullName      | city   | fullAddress | userName       | email               | phoneNumber    | password |
      | dummy testing | Malang | Malang kota | dummy testing17 | testing17@gmail.com | 08398765432112 | dummy2   |
