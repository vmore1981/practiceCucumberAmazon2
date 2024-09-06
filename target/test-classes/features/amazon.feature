@regression @login_tests
Feature: Amazon Scenario Outline HW

  Background: 
    Given go to amazon.com

  @smoke_test
  Scenario Outline: Different search phrases
    When verify that you are on the home page
    And search "<testdata>" and click search
    And wait for the element "<testdata>" to be visible - this could be any searched item or any text unique to the search page.
    And get text of the search_criteria text element verify search_criteria matches the search input "<testdata>"

    Examples: 
      | testdata          |
      | coffee mug        |
      | pretty coffee mug |
      | cool coffee mug   |
      | cute coffee mug   |
