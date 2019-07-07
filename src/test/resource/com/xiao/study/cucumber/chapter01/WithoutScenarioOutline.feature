Feature: Without Scenario outline

  Background : open login page
    Given open the login page

  Scenario: username or password is wrong
    When user "xiao" with password "123456"
    Then the user login failed

  Scenario: username and password is wrong
    When user "Tami" with password "234567"
    Then the user login failed


  Scenario: username and password is correct
    When user "Tami" with password "123456"
    Then the user login success
