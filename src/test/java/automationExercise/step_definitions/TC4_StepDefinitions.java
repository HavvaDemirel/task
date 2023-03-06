package automationExercise.step_definitions;

import automationExercise.pages.loginPage;
import automationExercise.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC4_StepDefinitions {


    loginPage logInPage;



  /*  @Given("user on the home page of Automation exercise")
    public void i_am_on_the_home_page_of_automation_exercise() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        logInPage = new loginPage();

        //3. Verify that home page is visible successfully
        Assert.assertTrue(logInPage.pageTitle.isDisplayed());


    }*/
  /*  @When("user click on Signup  Login button")
    public void i_click_on_signup_login_button() {
        //4. Click on 'Signup / Login' button
        BrowserUtils.sleep(2);
        logInPage.signUpLoginButton.click();
    }*/
    @Then("user should see Login to your account page")
    public void i_should_see_login_to_your_account_page() {
        BrowserUtils.sleep(4);
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(logInPage.loginToYourAccount.isDisplayed());

    }
    @When("user enter my email and password")
    public void i_enter_my_email_and_password() {
        //6. Enter incorrect email address and password
        logInPage.emailInputBox.sendKeys("efrsyhdfiuk@gmail.com");
        logInPage.passwordBox.sendKeys("11111");

    }
    @When("user click on login button")
    public void i_click_on_login_button() {
        //7. Click 'login' button
        logInPage.loginButton.click();

    }
    @Then("user should see Logged in as username message")
    public void i_should_see_logged_in_as_username_message() {
        Assert.assertTrue(logInPage.loggedYourAccountText.isDisplayed());



    }
    @When("user click on Logout button")
    public void i_click_on_logout_button() {
        BrowserUtils.sleep(2);
        //9. Click 'Logout' button
        logInPage.LogOutButton.click();

    }
    @Then("user should see the Login to your account page")
    public void i_should_see_the_login_to_your_account_page() {
        BrowserUtils.sleep(2);
        //10. Verify that user is navigated to login page
        Assert.assertTrue(logInPage.loginToYourAccount.isDisplayed());

    }



}
