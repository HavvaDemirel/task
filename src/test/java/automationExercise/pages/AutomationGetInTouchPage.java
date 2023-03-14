package automationExercise.pages;

import automationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationGetInTouchPage {
    public AutomationGetInTouchPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h2)[2]")
    public WebElement getInTouchHeader;

    @FindBy (xpath = "(//input[@type='email'])[1]")
    public WebElement getInTouchEmailBox;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectBox;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement messageBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement chooseFile;


    //------------ below locators may be in a different page---------

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;

    @FindBy(xpath = "//i[@class='fa fa-angle-double-left']")
    public WebElement homeButton;

}
