@EditMyPetsPage
  Feature: Edit MyPets Page
    Background: Login Scenario As Pet Owner
      Given User open the web page
      When User input "12fattah" as userName and "12345abcde" as password
      And User click on pop up alert success login

    @positive
    Scenario: Edit My Pets As Pet Owner
      Given User open myPets page
      When User will get routed to the myPets page
      Then User click see more button for detail
      And User click edit myPets
      Then User input "Flamingo" as petName on petName field
      And User choose pet category and gender
      Then User input "9" as petAges on Age field
      And User input "Black Iris" as pet color on Color field
      And User input "Nothing" as pet description on Description Box
      Then User upload photo of the pets
      And User click save button

    @positive
    Scenario: Cancel Edit My Pets
      Given User open myPets page
      When User will get routed to the myPets page
      Then User click see more button for detail
      And User click edit myPets
      And User click cancel myPets
