Feature: Coding Module -- These test cases are created for Regression testing on Horreum Web app.

  /*Field  -- Modules
  Administration -- User Management
  Media Management -- Influencer Manager, Label Manager, Label Manager Changes, Label Manager Coding, Label Manager Import, Media Logos
                      Online Media Manager, Print Media Manager, Scope Manager, Stream Manager, Stream Validator, TV Media Managar.
  Data Upload -- Content Upload, E-Paper(CCS)
  Data Processing -- Article Editor, Coding / PMCD, Coding / PMCD Configuration, Impact Push, Dictionary / Stream Test, PCD / NLT Push.*/

  Background:
    Given Navigate to Horreum Test server
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    When User navigates to User Management Module

  Scenario: 001 >> All the above mentioned modules should be displayed under every legend
    Then Related module should be displayed under Administration
    Then Related module should be displayed under Media Management
    Then Related module should be displayed under Data Upload
    Then Related module should be displayed under Data Processing

  Scenario: 002 >> User should be able to create a New User
    When User clicks on Add User
    Then User enters valid credentials for a new user
    Then User clicks on Save User

  Scenario: 003 >> User should be able to delete the created user
    When User selects a created user
    Then User should click on delete user

  Scenario: 004 >> User should be able to Export a selected user
    When User clicks on an available user
    Then User clicks on Export User