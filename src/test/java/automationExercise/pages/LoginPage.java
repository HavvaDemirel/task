package automationExercise.pages;

import automationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(tagName = "h1")
    public WebElement pageTitle;

    @FindBy(xpath = "/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")
    public WebElement signUpLoginButton;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedYourAccountText;

    @FindBy(xpath = "/html/body/header/div/div/div/div[2]/div/ul/li[5]/a")
    public WebElement deleteAccount;

    @FindBy(tagName = "h2")
    public WebElement loginToYourAccount;


    @FindBy(tagName = "h2")
    public WebElement accountDeleteText;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement accountDeletedContinueButton;

    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement wrongEmailOrPasswordMessage;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement LogOutButton;

    @FindBy(xpath = "//h2[.=\"Login to your account\"]")
    public WebElement loginToYourAccountText;
}
