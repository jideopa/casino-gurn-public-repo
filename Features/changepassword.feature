Feature: Change password

  Scenario: Unsuccessful change password
    Given Enter a valid login
    And user is on the change password page
    When player change password with a invalid
    Then "Incorrect." error message is displayed