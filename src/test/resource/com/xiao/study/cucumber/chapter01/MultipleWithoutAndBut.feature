Feature: test Multiple condition&action without And&But;
  simple test
  without And and But keywords

  Scenario: simple scenario
    multiple condition
    multiple user action
    multiple expected output

    Given user open the url of git
    Given user open the url of Jenkins
    When click build job link
    Then the job will be started
    When click the job id link
    When choice the job console
    When goto the console page
    Then the job building log will be print
    Then the last job can see successfully state
