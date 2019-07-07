Feature: Data table transformation

  Scenario:transform to raw data
    Given the user open the login page
    When let's validate the following user account and password
      | name | password |
      | xiao | 12345    |
      | Tami | 12345    |

  Scenario:transform to user-defined
    Given the user open the login page
    When let's validate the following user account and password user-defined
      | Username | Password |
      | xiao     | 123456   |
      | Tami     | 234567   |

  Scenario:transform to listMap
    Given the user open the login page
    When let's validate the following user account and password listMap
      | username | password |
      | xiao     | 123456   |
      | Tami     | 234567   |

  Scenario:transform to listlist
    Given the user open the login page
    When let's validate the following user account and password listlist
      | username | password |
      | xiao     | 123456   |
      | Tami     | 234567   |

#  Scenario:transform to
#    Given the user open the login page
#    When let's validate the following user account and password user-defined-class
#      | username | password |
#      | xiao     | 123456   |
#      | Tami     | 234567   |

