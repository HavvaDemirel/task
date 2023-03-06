Feature: testing deleting account function

  @second
  Scenario: verify user can delete account

    Given user on the home page of Automation exercise
    When user click on Signup  Login button
    Then user should see Login to your account page
    When user enter my email and password
    And user click on login button
    Then user should see Logged in as username message
    When user click on Delete Account button
    Then user should see the ACCOUNT DELETED! message






