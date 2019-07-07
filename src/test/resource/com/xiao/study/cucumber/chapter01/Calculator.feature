Feature: Basic Add

  Scenario: Addition
    Given x is 4 and y is 5
    And invoke add method
    When click the calculator button
    Then the result is 9

  Scenario: subtraction
    Given x is 10 and y is 2
    And invoke subtraction method
    When click the calculator button
    Then the result is 8
