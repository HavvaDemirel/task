package automationExercise.step_definitions;

import automationExercise.pages.RegisterUserPage;
import automationExercise.pages.loginPage;
import automationExercise.utilities.BrowserUtils;
import automationExercise.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC1_StepDefinitions {
    RegisterUserPage registerUserPage;
    Faker faker = new Faker();
    loginPage logInPage;


   @Given("user on the home page of Automation exercise")
    public void i_am_on_the_home_page_of_automation_exercise() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("https://www.automationexercise.com/");
        registerUserPage = new RegisterUserPage();

        //3. Verify that home page is visible successfully
        Assert.assertTrue(registerUserPage.pageTitle.isDisplayed());


    }
    @When("user click on Signup  Login button")
    public void i_click_on_signup_login_button() {
        //4. Click on 'Signup / Login' button
        BrowserUtils.sleep(2);
        //4. Click on 'Signup / Login' button
        registerUserPage.SignupLoginButton.click();
    }


    @Then("user see New User Signup! button")
    public void user_see_new_user_signup_button() {
        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(registerUserPage.newUserSignup.isDisplayed());
        //System.out.println(registerUserPage.NewUserSignup.getText());

         }

    @Then("user enter name and email address")
    public void user_enter_name_and_email_address() {
        //6. Enter name and email address
        registerUserPage.nameBox.sendKeys(faker.name().fullName());
        registerUserPage.emailBox.sendKeys(faker.letterify("???????????@gmail.com"));
        }

    @Then("user click Signup button")
    public void user_click_signup_button() {
        BrowserUtils.sleep(2);

        //7. Click 'Signup' button
        registerUserPage.signupButton.click();
    }

    @Then("user should see that ENTER ACCOUNT INFORMATION text")
    public void user_should_see_that_enter_account_information_text() {
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(registerUserPage.enterAccountInformation.isDisplayed());
        //System.out.println(registerUserPage.enterAccountInformation.getText());
    }

    @When("user fills details as Title, Name, Email, Password, Date of birth")
    public void user_fills_details_as_title_name_email_password_date_of_birth() {
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
    }

    @When("user selects checkbox Sign up for our newsletter!")
    public void user_selects_checkbox_sign_up_for_our_newsletter() {

        //10. Select checkbox 'Sign up for our newsletter!
        registerUserPage.newsLetterBox.click();


    }

    @When("user selects checkbox Receive special offers from our partners!")
    public void user_selects_checkbox_receive_special_offers_from_our_partners() {
        //11. Select checkbox 'Receive special offers from our partners!
        registerUserPage.specialOffersBox.click();
    }

    @When("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
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


    }

    @When("user Clicks Create Account button")
    public void user_clicks_create_account_button() {
        BrowserUtils.sleep(4);

        //13. Click 'Create Account button
        registerUserPage.createAccountButton.click();

    }

    @Then("user should see that ACCOUNT CREATED! is visible text")
    public void user_should_see_that_account_created_is_visible_text() {
        //14. Verify that 'ACCOUNT CREATED!' is visible

        System.out.println(registerUserPage.accountCreatedMessage.getText());
        Assert.assertTrue(registerUserPage.accountCreatedMessage.isDisplayed());
    }

    @When("user clicks Continue button")
    public void user_clicks_continue_button() {
        //15. Click 'Continue' button
        registerUserPage.continueButton.click();
        BrowserUtils.sleep(5);

    }

    @Then("user should see that Logged in as username text")
    public void user_should_see_that_logged_in_as_username_text() {
        Driver.getDriver().switchTo().frame("aswift_1");
        Driver.getDriver().switchTo().frame("ad_iframe");
        registerUserPage.dismisButton.click();
        Assert.assertTrue(registerUserPage.loggedInText.isDisplayed());


    }

    @When("user clicks Delete Account button")
    public void user_clicks_delete_account_button() {
        registerUserPage.deleteAccount.click();
    }

    @Then("user should see that ACCOUNT DELETED! text")
    public void user_should_see_that_account_deleted_text() {
        System.out.println("registerUserPage.accountCreatedMessage.getText() = " + registerUserPage.accountCreatedMessage.getText());
        Assert.assertTrue(registerUserPage.accountCreatedMessage.isDisplayed());
    }

    @When("and click Continue button")
    public void and_click_continue_button() {

        registerUserPage.accountCreatedContinueButton.click();

    }

}
