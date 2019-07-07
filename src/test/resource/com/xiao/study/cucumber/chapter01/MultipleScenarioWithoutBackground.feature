Feature: Multiple Scenario without background


  Scenario: Addition
    Given x and y value
    And invoke and method
    When click the calculator button
    Then the result is x+y

  Scenario: subtraction
    Given x and y value
    And invoke sub method
    When click the calculator button
    Then the result is x-y
