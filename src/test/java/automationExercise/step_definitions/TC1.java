package automationExercise.step_definitions;

import automationExercise.pages.RegisterUserPage;
import automationExercise.utilities.BrowserUtils;
import automationExercise.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class TC1 {
    RegisterUserPage registerUserPage;


    @BeforeMethod
    public void setupMethod() {

        Driver.getDriver().get("https://www.automationexercise.com/");
        registerUserPage = new RegisterUserPage();
    }

    @Test
    public void register_user() {




        //3. Verify that home page is visible successfully
        Assert.assertTrue(registerUserPage.pageTitle.isDisplayed());

        //4. Click on 'Signup / Login' button
        registerUserPage.SignupLoginButton.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(registerUserPage.newUserSignup.isDisplayed());
        //System.out.println(registerUserPage.NewUserSignup.getText());
        Faker faker = new Faker();


        //6. Enter name and email address
        registerUserPage.nameBox.sendKeys(faker.name().fullName());
        registerUserPage.emailBox.sendKeys(faker.letterify("???????????@gmail.com"));

        BrowserUtils.sleep(2);

        //7. Click 'Signup' button
        registerUserPage.signupButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(registerUserPage.enterAccountInformation.isDisplayed());
        //System.out.println(registerUserPage.enterAccountInformation.getText());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        registerUserPage.titleMr.click();


        registerUserPage.password.sendKeys("password");

        BrowserUtils.sleep(2);

        Select day = new Select(Driver.getDriver().findElement
                (By.xpath("//select[@id='days']")));
        day.selectByIndex(4);

        BrowserUtils.sleep(2);
        Select month = new Select(Driver.getDriver().findElement
                (By.xpath("//select[@id='months']")));
        month.selectByVisibleText("February");
        BrowserUtils.sleep(2);

        Select year = new Select(Driver.getDriver().findElement
                (By.xpath("//select[@id='years']")));

        year.selectByVisibleText("2000");
        BrowserUtils.sleep(5);

        //10. Select checkbox 'Sign up for our newsletter!
        registerUserPage.newsLetterBox.click();

        //11. Select checkbox 'Receive special offers from our partners!
        registerUserPage.specialOffersBox.click();

        //12. Fill details: First name, Last name, Company, Address, Address2,
        // Country, State, City, Zipcode, Mobile Number
        BrowserUtils.sleep(2);

        registerUserPage.firstNameBox.sendKeys(faker.name().fullName());
        registerUserPage.lastNameBox.sendKeys(faker.name().lastName());
        registerUserPage.companyBox.sendKeys(faker.name().nameWithMiddle());
        registerUserPage.address1Box.sendKeys(faker.address().fullAddress());
        registerUserPage.address2Box.sendKeys(faker.address().fullAddress());

        Select country = new Select(Driver.getDriver().findElement
                (By.xpath("//select[@id='country']")));

        country.selectByVisibleText("Canada");

        registerUserPage.stateBox.sendKeys("State");

        registerUserPage.cityBox.sendKeys(faker.address().city());
        registerUserPage.zipCodeBox.sendKeys(faker.address().zipCode());
        registerUserPage.mobileNumberBox.sendKeys("01223456456");

        BrowserUtils.sleep(4);

        //13. Click 'Create Account button
        registerUserPage.createAccountButton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible

        System.out.println(registerUserPage.accountCreatedMessage.getText());
        Assert.assertTrue(registerUserPage.accountCreatedMessage.isDisplayed());

        //15. Click 'Continue' button
        registerUserPage.continueButton.click();
        BrowserUtils.sleep(5);


        Driver.getDriver().switchTo().frame("aswift_1");
        Driver.getDriver().switchTo().frame("ad_iframe");
        registerUserPage.dismisButton.click();




        Assert.assertTrue(registerUserPage.loggedInText.isDisplayed());


        registerUserPage.deleteAccount.click();

        System.out.println("registerUserPage.accountCreatedMessage.getText() = " + registerUserPage.accountCreatedMessage.getText());
        Assert.assertTrue(registerUserPage.accountCreatedMessage.isDisplayed());

        registerUserPage.accountCreatedContinueButton.click();




}

}
