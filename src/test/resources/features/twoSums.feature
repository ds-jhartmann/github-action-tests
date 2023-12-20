Feature: TwoSums Story

  Scenario: Test Cucumber Test Story
    Given a list of integers:
      | 2  |
      | 7  |
      | 11 |
      | 15 |
    And The target result 9
    When the method is executed
    Then the result should be:
      | 0 |
      | 1 |

  Scenario: Failing Test Scenario
    Given a list of integers:
      | 2  |
      | 7  |
      | 11 |
      | 15 |
    And The target result 9
    When the method is executed
    Then the result should be:
      | 0 |
      | 2 |