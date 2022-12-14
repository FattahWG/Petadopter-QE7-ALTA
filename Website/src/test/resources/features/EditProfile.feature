@editProfile
Feature: Edit Profile
  as user i want to edit my profile

  @positive
  Scenario Outline: edit profile with fill on all field
    Given User open the web page
    When User input "dummy11" as userName and "dummy2" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see message "Update success"
    Examples:
      | fullName            | city   | fullAddress | userName | email               | phoneNumber  | password |
      | dummydummay testing | Malang | Malang kota | 11dummy  | 11dummy11@gmail.com | 083987654321 | dummy2   |

  @negative
  Scenario Outline: edit profile with registered username
    Given User open the web page
    When User input "dummy70" as userName and "dummy2" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Cant input existing data"
    Examples:
      | fullName           | city   | fullAddress | userName | email                 | phoneNumber  | password |
      | dummydummy testing | Malang | Malang kota | 11dummy   | testingting@gmail.com | 083987654321 | dummy2   |

  @negative
  Scenario Outline: edit profile with registered email
    Given User open the web page
    When User input "dummy70" as userName and "dummy2" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Cant input existing data"
    Examples:
      | fullName      | city   | fullAddress | userName | email              | phoneNumber  | password |
      | dummy testing | Malang | Malang kota | dummy81  | 11dummy11@gmail.com | 083987654321 | dummy    |

  @negative
  Scenario Outline: edit profile without combination number on password
    Given User open the web page
    When User input "dummy14" as userName and "dummy" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Password must combination alphabet and number"
    Examples:
      | fullName       | city   | fullAddress | userName  | email               | phoneNumber  | password |
      | dummy tujuhdua | Malang | Malang kota | 14dummy14 | 14dummy14@gmail.com | 083987654321 | dummy    |

  @negative
  Scenario Outline: edit profile without combination alphabet on password
    Given User open the web page
    When User input "dummy15" as userName and "12345678" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Password must combination alphabet and number"
    Examples:
      | fullName       | city   | fullAddress | userName  | email               | phoneNumber  | password |
      | dumma testingt | Malang | Malang kota | 15dummy15 | 15dummy15@gmail.com | 083987654321 | 12345678 |

  @negative
  Scenario Outline: edit profile with password less than 8 character
    Given User open the web page
    When User input "dummy16" as userName and "test12" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Password must have at least 8 character"
    Examples:
      | fullName     | city   | fullAddress | userName  | email               | phoneNumber  | password |
      | dumy testing | Malang | Malang kota | 16dummy16 | 16dummy16@gmail.com | 083987654321 | test12   |

  @negative
  Scenario Outline: edit profile with phone number less than 10 digit
    Given User open the web page
    When User input "dummy17" as userName and "dummy2" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Invalid phone number"
    Examples:
      | fullName    | city   | fullAddress | userName  | email               | phoneNumber | password |
      | dummy teing | Malang | Malang kota | 17dummy17 | 17dummy17@gmail.com | 08398765    | dummy2   |

  @negative
  Scenario Outline: edit profile with phone number more than 13 digit
    Given User open the web page
    When User input "dummy18" as userName and "dummy2" as password
    And User click on pop up alert success login
    And User click go to edit profile page
    When user select file photo as photo profile
    And user edit full name with "<fullName>" and edit city with "<city>"
    When user edit full address with "<fullAddress>" and edit username with "<userName>"
    And user edit email with "<email>" and edit phone number with "<phoneNumber>"
    And user edit password with "<password>" and click edit button
    Then user will see error alert with message "Invalid phone number"
    Examples:
      | fullName       | city   | fullAddress | userName  | email              | phoneNumber    | password |
      | dumamy testing | Malang | Malang kota | 18dummy18 | 18dummy18@gmail.com | 08398765432112 | dummy2   |
