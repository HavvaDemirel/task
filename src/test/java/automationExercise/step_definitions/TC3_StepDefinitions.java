package automationExercise.step_definitions;

import automationExercise.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class TC3_StepDefinitions {
    LoginPage logInPage;

    @Then("user should see Login to your account page")
    public void user_should_see_login_to_your_account_page() {
        Assert.assertTrue(logInPage.loginToYourAccountText.isDisplayed());
    }

    @When("user enter invalid email and password")
    public void user_enter_invalid_email_and_password() {
        logInPage.emailInputBox.sendKeys("weatargar@gmail.com");
        logInPage.passwordBox.sendKeys("11111");


    }
    @Then("user should see Your email or password is incorrect message")
    public void user_should_see_your_email_or_password_is_incorrect_message() {
        //8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue( logInPage.wrongEmailOrPasswordMessage.isDisplayed());



     }






}
