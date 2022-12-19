Feature: Logout

  @debug
  Scenario:Successful logout
    Given Enter a valid login
    Given click the signout button
    Then User should be logged out
