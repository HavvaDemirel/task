package automationExercise.step_definitions;

import automationExercise.pages.LoginPage;
import automationExercise.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class TC2_StepDefinitions {

    LoginPage logInPage;


    @Then("user should see the Login to your account page")
    public void userShouldSeeTheLoginToYourAccountPage() {
        Assert.assertTrue(logInPage.loginToYourAccountText.isDisplayed());
    }
    @When("user enter my email and password")
    public void user_enter_my_email_and_password() {
        logInPage.emailInputBox.sendKeys("havseymeldemirel@gmail.com");
        logInPage.emailInputBox.sendKeys("1234567");

    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        logInPage.loginButton.click();

    }
    @Then("user should see Logged in as username message")
    public void user_should_see_logged_in_as_username_message() {
       Assert.assertTrue(logInPage.loggedYourAccountText.isDisplayed());

    }
    @When("user click on Delete Account button")
    public void user_click_on_delete_account_button() {
        logInPage.deleteAccount.click();

    }
    @Then("user should see the ACCOUNT DELETED! message")
    public void user_should_see_the_account_deleted_message() {
        Assert.assertTrue(logInPage.accountDeleteText.isDisplayed());

    }




}





