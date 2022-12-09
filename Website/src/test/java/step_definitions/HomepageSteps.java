package step_definitions;

import com.example.MyPetsObjects.MyPetsPage;
import com.example.pageObject.AdoptionPage;
import com.example.pageObject.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomepageSteps {
    public WebDriver webDriver;
    public HomepageSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @When("^user click adoption menu$")
    public void userClickAdoptionMenu() {
        //blank
    }

    @When("^user click my pets menu$")
    public void userClickMyPetsMenu() throws InterruptedException{
        Thread.sleep(5000);
        MyPetsPage myPetsPage = new MyPetsPage(webDriver);
        myPetsPage.isDisplayed();
        myPetsPage.setMyPetsMenu();
    }

    @Then("^user go to My pets page$")
    public void userGoToMyPetsPage() {
        //blank
    }

    @When("^user click thema button$")
    public void userClickThemaButton() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickThema();
    }

    @Then("^thema will change$")
    public void themaWillChange() {
        //blank
    }

    @When("^user click hamburger button as my invitation menu$")
    public void userClickHamburgerButtonAsMyInvitationMenu() {
        //blank
    }

    @When("^user click see more button$")
    public void userClickSeeMoreButton() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickSeeMoreButton();
    }

    @Then("^user go to see more page$")
    public void userGoToSeeMorePage() {
        //blank
    }
}
