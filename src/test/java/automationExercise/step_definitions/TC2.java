package automationExercise.step_definitions;

import automationExercise.pages.RegisterUserPage;
import automationExercise.pages.loginPage;
import automationExercise.utilities.BrowserUtils;
import automationExercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 {

    loginPage logInPage;
    RegisterUserPage registerUserPage;

    @BeforeMethod
    public void setUpMethod() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        logInPage = new loginPage();
    }
    @Test
    public void loginTest() {
        //3. Verify that home page is visible successfully
        Assert.assertTrue(logInPage.pageTitle.isDisplayed());
        //4. Click on 'Signup / Login' button
        BrowserUtils.sleep(2);
        logInPage.signUpLoginButton.click();
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(logInPage.loginToYourAccount.isDisplayed());
        //6. Enter correct email address and password
        logInPage.emailInputBox.sendKeys("weatargar@gmail.com");
        logInPage.passwordBox.sendKeys("11111");
        //7. Click 'login' button
        logInPage.loginButton.click();
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().frame("google_esf");
        Driver.getDriver().switchTo().frame("ad_iframe");
        registerUserPage.dismisButton.click();
        //8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(logInPage.loggedYourAccountText.isDisplayed());
        logInPage.deleteAccount.click();
        //9. Click 'Delete Account' button
        BrowserUtils.sleep(2);
        Assert.assertTrue(logInPage.accountDeleteText.isDisplayed());
        //10. Verify that 'ACCOUNT DELETED!' is visible
        logInPage.accountDeletedContinueButton.click();
    }
}





