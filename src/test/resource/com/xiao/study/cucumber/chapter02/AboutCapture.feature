Feature:Group Capture
  Scenario: capture
    Given the number is 1
    Given the number is 2
    Given the number is 3

  Scenario: no capture
    Given no capture the number is 1
    Given no capture the number is 2
    Given no capture the number is 3

    Scenario: Capture multiple string
      Given I have 200 RMB in my package
      Given I not have 200 RMB in my package

  Scenario: no capture multiple string
    Given I have 200 Dollar in my package
    Given I not have 200 Dollar in my package
    Given I put 200 Dollar in my package

