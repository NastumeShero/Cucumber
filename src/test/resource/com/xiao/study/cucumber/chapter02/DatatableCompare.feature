Feature: Data table compare

  Scenario: Data table compare
    Given open the db connection pool
    When insert the batch of data
      | User     | Password |
      | xiao     | 123456   |
      | Tami     | 234567   |
      | catalina | 123455   |
    Then validation the data is insert
      | User     | Password |
      | xiao     | 123456   |
      | Tami     | 234567   |
      | catalina | 123455   |
    When Delete the user xiao
    Then validation the data after delete
      | User     | Password |
      | Tami     | 234567   |
      | catalina | 123455   |
