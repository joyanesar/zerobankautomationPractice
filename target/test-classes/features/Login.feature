Feature: Online Banking Login Feature
  Agile Story:authorized users should be able to Login so that they can do online Banking
@wip
  Scenario: Only authorized users should be able to Login to the application
    Given the user is on the Login page
    And User logins with the username "username" and password "password"
    Then the "Account Summary" page should be displayed