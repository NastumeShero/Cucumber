Feature: test Multiple condition&action with And&But
  with And and But keywords

  Scenario: simple scenario
  multiple condition
  multiple user action
  multiple expected output

    And alex open the url of Jenkins
    Given alex open the url of git

    When alex click build job link
    Then the job will be start
    When alex click the job id link
    And alex choice the job console
    And alex goto the console page
    Then  alex the job building log will be print
    And alex the last job can see successfully state
    But alex the job will not running at current
