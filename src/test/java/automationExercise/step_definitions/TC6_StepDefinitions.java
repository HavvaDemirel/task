package automationExercise.step_definitions;

import automationExercise.pages.AutomationGetInTouchPage;
import automationExercise.pages.AutomationPracticePage;
import automationExercise.utilities.BrowserUtils;
import automationExercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class TC6_StepDefinitions {


    AutomationGetInTouchPage automationGetInTouchPage = new AutomationGetInTouchPage();
    AutomationPracticePage automationPracticePage = new AutomationPracticePage();



    @When("I click on the Contact Us button")
    public void iClickOnTheContactUsButton() {

        automationPracticePage.contactUsButton.click();


    }

    @Then("I should see  GET IN TOUCH header is visible")
    public void iShouldSeeGETINTOUCHHeaderIsVisible() {

        Assert.assertTrue(automationGetInTouchPage.getInTouchHeader.isDisplayed());

    }

    @When("I enter my name, email, subject, and message")
    public void iEnterMyNameEmailSubjectAndMessage() {

        automationPracticePage.nameBox.sendKeys("Name");
        automationGetInTouchPage.getInTouchEmailBox.sendKeys("my11@email.com");
        automationGetInTouchPage.subjectBox.sendKeys("Subject");
        automationGetInTouchPage.messageBox.sendKeys("Have hopes, be happy!");
        BrowserUtils.sleep(2);

    }

    @And("I upload a file")
    public void iUploadAFile() {

        String filePath = "C:\\Users\\sel20\\OneDrive\\Desktop\\file.txt.txt";
        automationGetInTouchPage.chooseFile.sendKeys(filePath);
        BrowserUtils.sleep(2);

    }

    @And("I click the Submit button")
    public void iClickTheSubmitButton() {

        automationGetInTouchPage.submitButton.click();
        BrowserUtils.sleep(2);

    }



    @And("I click the OK button")
    public void iClickTheOKButton() {

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(2);


    }

    @Then("I should see the  message Success! Your details have been submitted successfully is visible")
    public void iShouldSeeTheMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(automationGetInTouchPage.successMessage.isDisplayed());


    }

    @When("I click the Home button")
    public void iClickTheHomeButton() {

        automationGetInTouchPage.homeButton.click();
        BrowserUtils.sleep(2);

        Actions actions = new Actions(Driver.getDriver());
        actions.click();


    }




    @Then("I am navigated back to home page")
    public void iAmNavigatedBackToHomePage() {
        automationPracticePage.pageTitle.isDisplayed();

        Actions actions = new Actions(Driver.getDriver());
        actions.click();
    }



}
