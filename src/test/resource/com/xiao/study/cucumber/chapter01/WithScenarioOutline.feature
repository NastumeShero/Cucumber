Feature: With Scenario outline
  Background: open login page
    Given open the login page testing scenario outline

    Scenario Outline: username or password is wrong
      When user "<userName>" with password "<Password>" testing scenario outline
      Then the user or password is invalid
      Examples:
        | userName | Password |
        |xiao      |123456    |
        |Tami      |234567    |

      Scenario: username and password is correct
        When user "Tami" with password "123456" testing scenario outline
        Then the username and password is correct
