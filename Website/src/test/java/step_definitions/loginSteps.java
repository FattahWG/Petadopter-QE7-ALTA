package step_definitions;

import com.example.pageObject.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;


public class loginSteps {
    private WebDriver webDriver;

    public loginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the web page")
    public void verifyLoginPage(){

    }


    @Then("user will see")
    public void userWillSee() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogin1();
    }

    @Given("User open the web pag")
    public void userOpenTheWebPag() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
    }

    @When("User input \"([^\"]*)\" as userName and \"([^\"]*)\" as passwordd")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsername(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
        loginPage.clickLogin1();
    }
}