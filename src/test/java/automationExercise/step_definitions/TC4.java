package automationExercise.step_definitions;

import automationExercise.pages.loginPage;
import automationExercise.utilities.BrowserUtils;
import automationExercise.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 {


    loginPage logInPage;
    @BeforeMethod
    public void setUpMethod() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        logInPage = new loginPage();
    }

    @Test
    public void loginTest(){
        //3. Verify that home page is visible successfully
        Assert.assertTrue(logInPage.pageTitle.isDisplayed());
        //4. Click on 'Signup / Login' button
        BrowserUtils.sleep(2);
        logInPage.signUpLoginButton.click();
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(logInPage.loginToYourAccount.isDisplayed());
        //6. Enter incorrect email address and password
        logInPage.emailInputBox.sendKeys("efrsyhdfiuk@gmail.com");
        logInPage.passwordBox.sendKeys("11111");
        //7. Click 'login' button
        logInPage.loginButton.click();
        BrowserUtils.sleep(2);
        //9. Click 'Logout' button
        logInPage.LogOutButton.click();
        BrowserUtils.sleep(2);
        //10. Verify that user is navigated to login page
        Assert.assertTrue(logInPage.loginToYourAccount.isDisplayed());



    }

    @Given("I am on the home page of Automation exercise")
    public void i_am_on_the_home_page_of_automation_exercise() {

    }
    @When("I click on Signup  Login button")
    public void i_click_on_signup_login_button() {

    }
    @Then("I should see Login to your account page")
    public void i_should_see_login_to_your_account_page() {

    }
    @When("I enter my email and password")
    public void i_enter_my_email_and_password() {

    }
    @When("I click on login button")
    public void i_click_on_login_button() {

    }
    @Then("I should see Logged in as username message")
    public void i_should_see_logged_in_as_username_message() {

    }
    @When("I click on Logout button")
    public void i_click_on_logout_button() {

    }
    @Then("I should see the \"Login to your account page")
    public void i_should_see_the_login_to_your_account_page() {
      ;
    }



}
