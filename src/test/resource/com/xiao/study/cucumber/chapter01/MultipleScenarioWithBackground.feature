Feature: Multiple Scenario with background

  Background:
    Given x and y value

  Scenario: Add
    And invoke and method
    When click the calculator button
    Then the result is x+y
    
  Scenario: sub
      And invoke sub method
      When click the calculator button
      Then the result is x-y


