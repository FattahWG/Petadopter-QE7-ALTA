@MyPetsPage
  Feature: My Pets Page
    Background: Login Scenario As Pet Owner
      Given User open the web page
      When User input "thuk" as userName and "thuk" as password
      And User click on pop up alert success login

      @profilemypets
    Scenario: MyPets Page As Pet Owner
      Given User open myPets page
      When User will get routed to the myPets page
      Then User click see more button for detail

    Scenario: Delete MyPets
      Given User open myPets page
      When User will get routed to the myPets page
      Then User click see more for delete pets
      And User click bin icon