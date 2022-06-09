Feature: Coding Module -- These test cases are created for Regression testing on Horreum Web app.

  Background:
    Given Navigate to Horreum Test server
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    Then User should navigate to Coding Module
    When User selects a branch and searches for the Articles

  Scenario: 001 >> Verify Search Articles is working for a specific branch.
    Then User should see articles respectively

  Scenario: 002 >> Verify Search Articles with date and source provider for a branch.
    When User enters a valid From and To Date
    When User enters a valid source provider
    Then User clicks Search button
    Then User should observe the related articles

  Scenario: 003 >> Verify whether user is able to delete the selected article.
    When User clicks on a article for a branch
    When User deletes the selected article and no error should be observed

  Scenario: 004 >> Verify whether user is able to refresh the documents.
    When User refreshes the article page and no error should be observed

  Scenario: 005 >> Print Articles Menu should not be available under Configuration in Coding Module.
    Then User should notice configuration and click on to open drop down
    Then User should observe that there is not Print Article Menu

  Scenario: 006 >> Error validation should be displayed when navigating to page beyond the pagination set.
    Then User clicks on Last page and should observe a validation

  Scenario: 007 >> Highlighting of text under Articles should be done only after user enables Highlighting.
    Then User should select Enable Highlighting under Configuration
    And User should observe the new pop up
    When User enters user text under query and clicks search
    Then User should observe that there text highlighted under Articles

  Scenario: 008 >> User should navigate to new tab when clicked on go to post
    Then User should click on Go to Post option and navigate to new tab

  Scenario: 009 >> User should navigate to new tab when clicked on show fulltext
    Then User should click on Show Fulltext option and navigate to new tab

  Scenario: 010 >> User should navigate to new tab when clicked on show rawdata
    Then User should click on Show rawdata option and navigate to new tab
