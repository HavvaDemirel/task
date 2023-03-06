Feature: Log in log out functionality


@TC1
  Scenario: verify user can register
    Given user on the home page of Automation exercise
   When user click on Signup  Login button
    Then user see New User Signup! button
    And user enter name and email address
    And user click Signup button
    Then user should see that ENTER ACCOUNT INFORMATION text
    When user fills details as Title, Name, Email, Password, Date of birth
    And user selects checkbox Sign up for our newsletter!
    And user selects checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And user Clicks Create Account button
    Then user should see that ACCOUNT CREATED! is visible text
    When user clicks Continue button
    Then user should see that Logged in as username text
    When user clicks Delete Account button
    Then user should see that ACCOUNT DELETED! text
     When and click Continue button



