Feature: Change password

  @debug
  Scenario: Unsuccessful change password
    Given Enter a valid login
    And user is on the change password page
    When player change password with a invalid
    Then "Incorrect password." error message is displayed