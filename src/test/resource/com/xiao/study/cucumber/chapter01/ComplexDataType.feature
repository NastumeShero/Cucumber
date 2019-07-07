Feature: complex Data Type

  Scenario: Multiple then keywords
    Given the user account information
    Then We can found the user "xiao" with password is "12345",phone is "111111" exists
    Then We can found the user "catalina" with password is "12345",phone is "111111" exists
    Then We can found the user "Tami" with password is "12345",phone is "111111" exists


  Scenario: Use complex Data Type
    Given the user account information
    Then we verify following user exists
      | name     | password | phone  |
      | xiao     | 12345    | 111111 |
      | catalina | 12345    | 111111 |
      | Tami     | 12345    | 111111 |
