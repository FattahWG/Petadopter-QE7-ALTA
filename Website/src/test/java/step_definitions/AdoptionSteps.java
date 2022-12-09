package step_definitions;

import com.example.pageObject.AdoptionPage;
import com.example.pageObject.HomePage;
import com.example.pageObject.PetDetailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AdoptionSteps {

    public WebDriver webDriver;

    public AdoptionSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("user choose a pet to adopt")
    public void userChooseAPetToAdopt()throws InterruptedException{
        HomePage homePage = new HomePage(webDriver);
        PetDetailPage petDetailPage = new PetDetailPage(webDriver);
        homePage.clickSeeMoreButton();
        Thread.sleep(5000);
        petDetailPage.clickApplyAdoptButton();
        Thread.sleep(5000);
        webDriver.switchTo().alert().accept();
        Thread.sleep(5000);
    }

    @Then("in adoption history will appeared a pet that user choose")
    public void inAdoptionHistoryWillAppearedAPetThatUserChoose()throws InterruptedException {
        AdoptionPage adoptionPage = new AdoptionPage(webDriver);
        adoptionPage.clickAdoptionMenu();
        Thread.sleep(5000);
        adoptionPage.petNameIsDisplayed();
        Thread.sleep(3000);
    }

    @When("user go to adoption history")
    public void userGoToAdoptionHistory()throws InterruptedException {
        AdoptionPage adoptionPage = new AdoptionPage(webDriver);
        adoptionPage.clickAdoptionMenu();
        Thread.sleep(5000);
    }

    @Then("user could see pet adoption status is \"(.*)\"")
    public void userCouldSeePetAdoptionStatusIs(String accepted) throws InterruptedException {
        AdoptionPage adoptionPage = new AdoptionPage(webDriver);
        Assert.assertEquals(accepted,adoptionPage.getTextAccepted());
        Thread.sleep(3000);
    }

    @Then("user can see adoption status is still \"(.*)\"")
    public void userCanSeeAdoptionStatusIsStill(String requested) throws InterruptedException {
        AdoptionPage adoptionPage = new AdoptionPage(webDriver);
        Assert.assertEquals(requested,adoptionPage.getTextRequested());
        Thread.sleep(3000);
    }

    @Then("user will see the adoption status is \"(.*)\"")
    public void userWillSeeTheAdoptionStatusIs(String rejected) throws InterruptedException {
        AdoptionPage adoptionPage = new AdoptionPage(webDriver);
        Assert.assertEquals(rejected,adoptionPage.getTextRejected());
        Thread.sleep(3000);
    }

    @When("user go to My Invitations page")
    public void userGoToMyInvitationsPage()throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickHamburgerButton();
        Thread.sleep(3000);
    }

    @Then("user will see invitation meeting from owner pet")
    public void userWillSeeInvitationMeetingFromOwnerPet()throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.invitationIsDisplayed();
        Thread.sleep(5000);
    }

    @Then("^user cancel their adoption request$")
    public void userCancelTheirAdoptionRequest() {
        AdoptionPage adoptionPage = new AdoptionPage(webDriver);
        adoptionPage.clickCancelRequest();
    }
}
