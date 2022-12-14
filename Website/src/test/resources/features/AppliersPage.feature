@AppliersPage
  Feature: View Appliers Page
    Background: Login Scenario As Pet Owner
      Given User open the web page
      When User input "1owner" as userName and "123" as password
      And User click on pop up alert success login

    @positive
    Scenario: Accept Appliers My Pets As Pet Owner
      Given User open myPets page
      When User will get routed to the myPets page
      Then User click see more button for detail
      And User click view applier button
      Then User will get routed to the appliers list page
      And User accept applier request

    @positive
    Scenario: Reject Applier Request
      Given User open myPets page
      When User will get routed to the myPets page
      Then User click see more button for detail
      And User click view applier button
      Then User will get routed to the appliers list page
      And User reject applier request

