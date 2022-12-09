@MeetingAppointmentPage
  Feature: Create Meeting Appointment
    Background: Login Scenario As Pet Owner
      Given User open the web page
      When User input "thuk" as userName and "thuk" as password
      And User click on pop up alert success login

    Scenario: Create Meeting Appointment
      Given User open the kebab menu
      When User click meeting appointment
      Then User will get routed to the meeting appointment list page
      And User click edit meeting appointment
      Then User set the date meeting on "19" and the month on "09" and the year on "2023"
      And User set the time meeting on "21" and the minute on "21"
      Then User click update button

    Scenario: Cancel Update Meeting Appointment
      Given User open the kebab menu
      When User click meeting appointment
      Then User will get routed to the meeting appointment list page
      And User click edit meeting appointment
      Then User click cancel button for meeting appointment

    Scenario: Done Meeting Appointment
      Given User open the kebab menu
      When User click meeting appointment
      Then User will get routed to the meeting appointment list page
      And User click done button for meeting appointment

    Scenario: Cancel Meeting Appointment
      Given User open the kebab menu
      When User click meeting appointment
      Then User will get routed to the meeting appointment list page
      And User click cancel meeting for meeting appointment
