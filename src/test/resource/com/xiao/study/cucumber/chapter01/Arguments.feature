Feature: Arguments
  Scenario: Arguments test
    Given the name is "xiao" and the age is 29
    When format the input
    Then the format output is "xiao-29"
