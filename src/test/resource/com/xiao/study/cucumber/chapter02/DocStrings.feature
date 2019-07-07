Feature: Doc Strings

  Scenario: Doc String use scenario
    Given the book is about Concurrency
    """
    Title:Java Concurrency Programming
    Abstract:this book is about the java concurrency,contains the thread/thread group api and concurrency design pattern
    Author:Alex Wang
    """

  Scenario Outline: Doc String use scenario outline data
    Given my name is <user>
      """
      my description:<details>
      """
    Examples:
      | user | details              |
      | Alex | author author author |
      | xiao | reader reader reader |


