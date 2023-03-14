package automationExercise.step_definitions;

import automationExercise.pages.LoginPage;
import automationExercise.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC4_StepDefinitions {


    LoginPage logInPage;


  /*  @Then("user should see Logged in as username message")
    public void i_should_see_logged_in_as_username_message() {
        Assert.assertTrue(logInPage.loggedYourAccountText.isDisplayed());



    }*/

    @When("user click on Logout button")
    public void i_click_on_logout_button() {
        BrowserUtils.sleep(2);
        //9. Click 'Logout' button
        logInPage.LogOutButton.click();

    }



}
