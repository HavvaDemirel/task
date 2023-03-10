package automationExercise.step_definitions;

import automationExercise.pages.AutomationGetInTouchPage;
import automationExercise.pages.AutomationPracticePage;
import automationExercise.pages.AutomationPracticePage2;
import automationExercise.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC5_StepDefinitions {


    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    AutomationPracticePage2 automationPracticePage2 = new AutomationPracticePage2();
    AutomationGetInTouchPage automationGetInTouchPage = new AutomationGetInTouchPage();

    @Given("I am on the homepage of the Automation Exercise website")
    public void i_am_on_the_homepage_of_the_automation_exercise_website() {

        Driver.getDriver().get("https://www.automationexercise.com");

    }

    @When("I click on the Signup  Login button")
    public void i_click_on_the_signup_login_button() {
        automationPracticePage.signupLoginButton.click();



    }

    @Then("I should see the New User Signup! message")
    public void i_should_see_the_new_user_signup_message() {
        Assert.assertTrue(automationPracticePage.newUserSignup.isDisplayed());

    }

    @When("I enter my name and an already registered email address")
    public void i_enter_my_name_and_an_already_registered_email_address() {

        automationPracticePage.nameBox.sendKeys("Name");
        automationPracticePage.newUserEmailBox.sendKeys("my11@email.com");

    }

    @When("I click the Signup button")
    public void i_click_the_signup_button() {
        automationPracticePage.signupButton.click();

    }

    @Then("I should see the error message Email Address already exist!")
    public void i_should_see_the_error_message_email_address_already_exist() {

        Assert.assertTrue(automationPracticePage.emailAlreadyExistMessage.isDisplayed());

    }




}
