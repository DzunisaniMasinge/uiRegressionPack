Feature: Test Fikile

  Scenario Outline: To test Makondo
    Given Browser is open
    When User enters <username> and <password>
    #And User clicks login
    #Then User should be redirected to Home page

    Examples:
      | username  | password |
      | Dzunisani | Masinge  |
      | Test      | Engineer |