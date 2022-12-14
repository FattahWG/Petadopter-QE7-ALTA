@MeetingInvitationPage
Feature: Create Meeting Invitation
    Background: Login Scenario As Pet Owner
      Given User open the web page
      When User input "owner1" as userName and "123" as password
      And User click on pop up alert success login

    @positive
    Scenario: Create Meeting Invitation As Pet Owner
      Given User open myPets page
      When User will get routed to the myPets page
      Then User click see more button for detail
      And User click view applier button
      Then User will get routed to the appliers list page
      And User click create meeting button
      Then User set the date on "21" and the month "12" and the year on "2022"
      And User set the time on "09" and the minute on "19"
      Then User click add button

    @positive
    Scenario: Cancel create Invitation As Pet Owner
      Given User open myPets page
      When User will get routed to the myPets page
      Then User click see more button for detail
      And User click view applier button
      Then User will get routed to the appliers list page
      And User click create meeting button
      Then User click cancel button for meeting invitation
