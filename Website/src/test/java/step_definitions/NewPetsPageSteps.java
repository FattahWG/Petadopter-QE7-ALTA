package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.example.MyPetsObjects.NewPetsPage;
import org.openqa.selenium.WebDriver;

public class NewPetsPageSteps {
    private WebDriver webDriver;
    public NewPetsPageSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^User click icon plus for create new pets$")
    public void userClickIconPlusForCreateNewPets() throws InterruptedException {
        NewPetsPage newPetsPage = new NewPetsPage(webDriver);
        newPetsPage.isDisplayed();
        newPetsPage.setNewPets();
        Thread.sleep(5000);
    }

    @When("^User input \"([^\"]*)\" as petName on Pet Name field$")
    public void userInputAsPetNameOnPetNameField(String petName) throws InterruptedException {
        NewPetsPage newPetsPage = new NewPetsPage(webDriver);
        newPetsPage.setNewPetNameField(petName);
        Thread.sleep(3000);
    }

    @Then("^User choose pet category and gender new pets$")
    public void userChoosePetCategoryAndGenderNewPets() throws InterruptedException {
        NewPetsPage newPetsPage = new NewPetsPage(webDriver);
        newPetsPage.setNewPetsCategory();
        Thread.sleep(3000);
        newPetsPage.setNewPetsCat();
        newPetsPage.setNewPetsDog();
        Thread.sleep(3000);
        newPetsPage.setNewPetsMale();
        newPetsPage.setNewPetsFemale();
    }

    @And("^User input \"([^\"]*)\" as new pets age on Age field$")
    public void userInputAsNewPetsAgeOnAgeField(String ages) throws InterruptedException {
        NewPetsPage newPetsPage = new NewPetsPage(webDriver);
        newPetsPage.setNewPetsAge(ages);
        Thread.sleep(3000);
    }

    @Then("^User input \"([^\"]*)\" as new pets color on Color field$")
    public void userInputAsNewPetsColorOnColorField(String colors) throws InterruptedException {
        NewPetsPage newPetsPage = new NewPetsPage(webDriver);
        newPetsPage.setNewPetsColor(colors);
        Thread.sleep(3000);
    }

    @And("^User input \"([^\"]*)\" as new pets description on Description field$")
    public void userInputAsNewPetsDescriptionOnDescriptionField(String word) throws InterruptedException {
        NewPetsPage newPetsPage = new NewPetsPage(webDriver);
        newPetsPage.setNewPetsDescription(word);
        Thread.sleep(3000);
    }

    @And("^User upload photo for new pets$")
    public void userUploadPhotoForNewPets() throws InterruptedException {
        NewPetsPage newPetsPage = new NewPetsPage(webDriver);
        newPetsPage.setUploadNewPets();
        Thread.sleep(3000);
    }

    @Then("^User click save button for new pets$")
    public void userClickSaveButtonForNewPets() throws InterruptedException {
        NewPetsPage newPetsPage = new NewPetsPage(webDriver);
        newPetsPage.setSaveNewPets();
        Thread.sleep(5000);
    }

    @And("^User click cancel button$")
    public void userClickCancelButton() throws InterruptedException {
        NewPetsPage newPetsPage = new NewPetsPage(webDriver);
        newPetsPage.setCancelNewPets();
        Thread.sleep(3000);
    }
}
