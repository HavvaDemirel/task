Feature: Testing user can not login with invalid credential
  @TC3
  Scenario: verify user can see Your email or password is incorrect! when credential is invalid
    Given user on the home page of Automation exercise
    When user click on Signup  Login button
    Then user should see Login to your account page
    When user enter invalid email and password
    And user click on login button
    Then user should see Your email or password is incorrect message













