Feature: Regex example
  Scenario: cucumber case 1
    Given the number 1 and number 2
    When take the add action
#    此处描述为the result number is 3时，且stepdefs文件中描述为the result number is 3时，会出现ambiguous异常
    Then the result number 3

  Scenario: cucumber case 2
    Given the number is 3 and number 4
    When take the add action
    Then the result number is 7

  Scenario: cucumber case 3
    Given the number is 2 and number 3
    When take the add action
    Then the result number is 5

#  Scenario: cucumber case 4
#    Given the number 4 and number is 5
#    When take the add action
#    Then the result number is 9

  Scenario: cucumber case 5
    Given the number is 4 and number -3
    When take the add action
    Then the result number is 1


  Scenario: cucumber case 6
    Given the number is 4 and number is 3.2
    When take the add action

  Scenario: cucumber case 7
    Given the number is 4 and number is 3
    When take the add action
