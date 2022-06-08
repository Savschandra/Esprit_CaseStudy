Feature: Coding Module -- These test cases verifies the frontend features on Horreum.

  Background:
    Given Navigate to Horreum Test server
    Then User enters valid "<username>" and "<password>"
    And User clicks on Login button
    When User clicks on Content Upload Module

  Scenario: 001 >> Enter Content and save the document successfully.
    Then User enters valid data to fill the content
    And User clicks save and continue for valid document creation

  Scenario: 002 >> Enter Content and click reset to clear all the fields.
    Then User enters valid data to fill the fields
    And User clicks reset to clear all the fields

  Scenario: 003 >> Content Upload Module set data should be displayed on start up
    Then Current Day Date should be displayed in the Date field

  Scenario: 004 >> User should be able to Add Author under Content Upload Module
    When User clicks on Add Author
    Then User enters Author and Username
    Then User clicks on Update successfully

  Scenario: 005 >> Editing Field under Content Upload module should be accessible by opening a new window when Expand is clicked.
    Then User should click Expand text fields, enter text and save it successfully