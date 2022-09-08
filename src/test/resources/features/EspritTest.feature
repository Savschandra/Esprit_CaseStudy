Feature: Esprit Case Study

  Background:
    When User navigates to Esprit URL
    And User clicks on Login button
    Then User enters valid "<username>" and "<password>"
    And User clicks on Submit button

    #This is the actual test case file written in gherkin language
  @Regression
  Scenario Outline: Test01 >> User should login and add dress to cart
    Then User navigates to Women collection
    Then User selects a "<category>" category
    Then User Adds a dress to cart
    Examples:
      | category |
      | dress    |
      | Tshirt   |

  @Sprint
  Scenario: Test02 >> User should navigate to cart and perform checkout flow
    Then User navigates to cart and selects checkout
    When User click on Continue to Payment
    Then User should click on Credit Card and click on Buy now
    When User enters valid credit card data and performs Buy now
    Then User should observe a order placed successfully
