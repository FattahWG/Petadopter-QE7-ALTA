@NewPetsPage
  Feature: Create New Pets
    Background: Login Scenario As Pet Owner
      Given User open the web page
      When User input "thuk" as userName and "thuk" as password
      And User click on pop up alert success login

    Scenario: Create New Pets As Pet Owner
      Given User click icon plus for create new pets
      When User input "Daniel" as petName on Pet Name field
      Then User choose pet category and gender new pets
      And User input "10" as new pets age on Age field
      Then User input "White Ash" as new pets color on Color field
      And User input "He is cute" as new pets description on Description field
      And User upload photo for new pets
      Then User click save button for new pets

    Scenario: Cancel Create New Pets
      Given User click icon plus for create new pets
      And User click cancel button
