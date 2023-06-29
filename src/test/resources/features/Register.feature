Feature: Test Register

  Scenario Outline: To test Register To Nedbank
    Given Browser is open
    When User enters <passport> and <country>

    Examples:
      | passport | country |