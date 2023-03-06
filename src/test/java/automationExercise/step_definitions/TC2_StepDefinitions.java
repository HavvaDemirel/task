package automationExercise.step_definitions;

import automationExercise.pages.loginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class TC2_StepDefinitions {

    loginPage logInPage;

    @When("user click on Delete Account button")
    public void user_click_on_delete_account_button() {
        logInPage.deleteAccount.click();
        Assert.assertTrue(logInPage.accountDeleteText.isDisplayed());

    }
    @Then("user should see the ACCOUNT DELETED! message")
    public void user_should_see_the_account_deleted_message() {
        //10. Verify that 'ACCOUNT DELETED!' is visible
        logInPage.accountDeletedContinueButton.click();
    }






}





