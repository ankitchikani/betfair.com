Feature: verify registration page
  As a end user
  I should be able to redirected to registration page
  So that i can register the account in order to place the Bets

  Scenario: verify the registration page through placing Bets.
    Given I am homepage
    When I Hoover on main and select "Cricket"
    And I select an "Test Matches"
    And I select match with South Africa and  "Australia"
    And I select  "4/1" match odds
    And I enter £"10" bet and select to "Place Bets"
    And I click on  join now
    Then I should see page for "Register for a Betfair Account"




