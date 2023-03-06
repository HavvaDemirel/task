Feature: Log in log out functionality


 @TC4
  Scenario: verify user can login and logout
    Given user on the home page of Automation exercise
    When user click on Signup  Login button
    Then user should see Login to your account page
    When user enter my email and password
    And user click on login button
    Then user should see Logged in as username message
    When user click on Logout button
    Then user should see the Login to your account page