package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.example.pageObject.HomePage;
import com.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    public WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("User open the web page")
    public void userOpenTheWebPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.userNameIsDisplayed();
    }

    @When("User input \"(.*)\" as userName and \"(.*)\" as password")
    public void userInputAsUserNameAndAsPassword(String userName, String password)throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.inputUserName(userName);
        loginPage.inputPassword(password);
        loginPage.clickLoginButton();
        Thread.sleep(7000);
    }

    @And("User click on pop up alert success login")
    public void userClickOnPopUpAlertSuccessLogin()throws InterruptedException {
        Thread.sleep(5000);
        webDriver.switchTo().alert().accept();
    }

    @Then("User go to home page")
    public void userGoToHomePage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.discoverWordIsDisplayed();
    }

    @Then("User will see alert with message \"(.*)\"")
    public void userWillSeeAlertWithMessage(String alert)throws InterruptedException{
        Assert.assertEquals(alert,webDriver.switchTo().alert().getText());
        Thread.sleep(3000);
    }

    @Then("User will see error on field with message \"(.*)\"")
    public void userWillSeeErrorOnFieldWithMessage(String errorMsg)throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(errorMsg,loginPage.getTextUserNameField());
        Thread.sleep(1000);
    }

    @Then("^user click logout$")
    public void userClickLogout() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogoutButton();

    }
}
