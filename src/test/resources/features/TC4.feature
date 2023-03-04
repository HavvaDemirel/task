Feature: Log in log out functionality

  Agile User Story: As a user, when I am on the home page and click on 'Signup / Login' button
  I should see Login to your account page. When I enter my email and password and click on
  login button, I should be able to login and see  Logged in as username message is displayed.
  As a user, when i click on logout button I should be navigated to Login to your account page.


  Scenario: verify user can login and logout
    Given user is
    When I click on Signup  Login button
    Then I should see Login to your account page
    When I enter my email and password
    And I click on login button
    Then I should see Logged in as username message
    When I click on Logout button
    Then I should see the "Login to your account page