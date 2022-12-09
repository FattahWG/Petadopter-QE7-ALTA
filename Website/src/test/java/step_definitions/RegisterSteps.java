package step_definitions;

import com.example.pageObject.LoginPage;
import com.example.pageObject.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {

    public WebDriver webDriver;

    public RegisterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User go to signup page")
    public void userGoToSignupPage()throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickSignUp();
        Thread.sleep(3000);
    }

    @When("User input \"(.*)\" as fullName and select \"(.*)\" on city field")
    public void userInputAsFullNameAndSelectOnCityField(String fullName, String city){
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.inputFullName(fullName);
        registerPage.selectCity(city);
    }

    @And("User input \"(.*)\" as fullAddress and new username \"(.*)\"")
    public void userInputAsFullAddressAndNewUsername(String fullAddress, String userNameRegister)throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.inputFullAddress(fullAddress);
        registerPage.inputUsername(userNameRegister);
    }

    @When("User input \"(.*)\" as email and input \"(.*)\" as phoneNumber")
    public void userInputAsEmailAndInputAsPhoneNumber(String email, String phoneNumber){
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.inputEmail(email);
        registerPage.inputPhoneNumber(phoneNumber);
    }

    @And("User register password \"(.*)\"")
    public void userRegisterPassword(String passwordRegister)throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.inputPassword(passwordRegister);
        registerPage.clickSignUpButton();
        Thread.sleep(5000);
    }

    @Then("User can see success alert with message \"(.*)\"")
    public void userCanSeeSuccessAlertWithMessage(String message)throws InterruptedException{
        Assert.assertEquals(message,webDriver.switchTo().alert().getText());
        Thread.sleep(5000);
        webDriver.switchTo().alert().accept();
    }

    @Then("User can see alert with message \"(.*)\"")
    public void userCanSeeAlertWithMessage(String errorMessage)throws InterruptedException{
        Assert.assertEquals(errorMessage,webDriver.switchTo().alert().getText());
        Thread.sleep(5000);
        webDriver.switchTo().alert().accept();
    }
}
