package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.example.MyPetsObjects.MyPetsPage;
import org.openqa.selenium.WebDriver;

public class MyPetsPageSteps {
    private WebDriver webDriver;
    public MyPetsPageSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^User open myPets page$")
    public void userOpenMyPetsPage() throws InterruptedException {
        Thread.sleep(5000);
        MyPetsPage myPetsPage = new MyPetsPage(webDriver);
        myPetsPage.isDisplayed();
        myPetsPage.setMyPetsMenu();
    }

    @When("^User will get routed to the myPets page$")
    public void userWillGetRoutedToTheMyPetsPage() throws InterruptedException {
        MyPetsPage myPetsPage = new MyPetsPage(webDriver);
        Thread.sleep(2000);
        myPetsPage.setMyPetsCard();
        myPetsPage.setFirstPetsImage();
        myPetsPage.setFirstPetsName();
        myPetsPage.setFirstPetsCity();
        myPetsPage.setFirstPetsGender();
        myPetsPage.setFirstPetsAge();
    }

    @Then("^User click see more button for detail$")
    public void userClickSeeMoreButtonForDetail() throws InterruptedException {
        MyPetsPage myPetsPage = new MyPetsPage(webDriver);
        myPetsPage.setSeeMoreButton();
        Thread.sleep(2000);
        myPetsPage.setProfileImage();
        myPetsPage.setProfileName();
        myPetsPage.setProfileOwnerName();
//        myPetsPage.setProfileSpecies();
        myPetsPage.setProfileCity();
        myPetsPage.setProfileDetail();
        myPetsPage.setProfileTextGender();
        myPetsPage.setProfileGenders();
        myPetsPage.setProfileTextAge();
        myPetsPage.setProfileAges();
        myPetsPage.setProfileTextColor();
        myPetsPage.setProfileColors();
        myPetsPage.setProfileTextDescription();
        myPetsPage.setProfileDescriptions();
        Thread.sleep(3000);
    }

    @Then("^User click see more for delete pets$")
    public void userClickSeeMoreForDeletePets() throws InterruptedException {
        MyPetsPage myPetsPage = new MyPetsPage(webDriver);
        myPetsPage.setSeeMoreDelete();
        Thread.sleep(3000);
    }

    @And("^User click bin icon$")
    public void userClickBinIcon() throws InterruptedException {
        MyPetsPage myPetsPage = new MyPetsPage(webDriver);
        myPetsPage.setDeletePets();
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
    }
}
