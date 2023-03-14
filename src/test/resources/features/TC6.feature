Feature: Verify that user can send message using contact us form and upload a file.

  Agile User Story: As a user, when I am on the home and when I  Click on 'Contact Us' button,
  I should see 'GET IN TOUCH' is message. When I Enter name, email, subject and message and upload
  file, click 'Ok' and Click 'submit' button, I should see 'Success! Your details have been
  submitted successfully.' message. When I click 'Home' button I should see  home page successfully.

  Feature: Submit Contact Form and upload file
  @case6
  Scenario: Submit contact form successfully
    Given I am on the home page of Automation exercise
    When I click on the Contact Us button
    Then I should see  GET IN TOUCH header is visible
    When I enter my name, email, subject, and message
    And I upload a file
    And I click the Submit button
    And I click the OK button
    Then I should see the  message Success! Your details have been submitted successfully is visible
    When I click the Home button
    Then I am navigated back to home page