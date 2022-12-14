package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import com.example.MyPetsObjects.EditMyPetsPage;
import org.openqa.selenium.WebDriver;

public class EditMyPetsPageSteps {
    private WebDriver webDriver;
    public EditMyPetsPageSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("^User click edit myPets$")
    public void userClickEditMyPets() throws InterruptedException {
        EditMyPetsPage editMyPetsPage = new EditMyPetsPage(webDriver);
        editMyPetsPage.isDisplayed();
        editMyPetsPage.setEditButton();
        Thread.sleep(3000);
    }

    @Then("^User input \"([^\"]*)\" as petName on petName field$")
    public void userInputAsPetNameOnPetNameField(String petName) throws InterruptedException {
       EditMyPetsPage editMyPetsPage = new EditMyPetsPage(webDriver);
       editMyPetsPage.setPetNameField(petName);
       Thread.sleep(3000);
    }

    @And("^User choose pet category and gender$")
    public void userChoosePetCategoryAndGender() throws InterruptedException {
        EditMyPetsPage editMyPetsPage = new EditMyPetsPage(webDriver);
        editMyPetsPage.setPetCategory();
        Thread.sleep(3000);
        editMyPetsPage.setCatCategory();
        editMyPetsPage.setDogCategory();
        Thread.sleep(3000);
        editMyPetsPage.setMaleGender();
        editMyPetsPage.setFemaleGender();
        Thread.sleep(3000);
    }

    @Then("^User input \"([^\"]*)\" as petAges on Age field$")
    public void userInputAsPetAgesOnAgeField(String ages) throws InterruptedException {
        EditMyPetsPage editMyPetsPage = new EditMyPetsPage(webDriver);
        editMyPetsPage.setPetAgeField(ages);
        Thread.sleep(3000);
    }

    @And("^User input \"([^\"]*)\" as pet color on Color field$")
    public void userInputAsPetColorOnColorField(String colors) throws InterruptedException {
        EditMyPetsPage editMyPetsPage = new EditMyPetsPage(webDriver);
        editMyPetsPage.setPetColorField(colors);
        Thread.sleep(3000);
    }

    @And("^User input \"([^\"]*)\" as pet description on Description Box$")
    public void userInputAsPetDescriptionOnDescriptionBox(String word) throws InterruptedException {
        EditMyPetsPage editMyPetsPage = new EditMyPetsPage(webDriver);
        editMyPetsPage.setPetDescription(word);
        Thread.sleep(3000);
    }

    @Then("^User upload photo of the pets$")
    public void userUploadPhotoOfThePets() throws InterruptedException {
        EditMyPetsPage editMyPetsPage = new EditMyPetsPage(webDriver);
        editMyPetsPage.setUploadPhoto();
        Thread.sleep(3000);
    }

    @And("^User click save button$")
    public void userClickSaveButton() throws InterruptedException {
        EditMyPetsPage editMyPetsPage = new EditMyPetsPage(webDriver);
        Thread.sleep(5000);
        editMyPetsPage.setSaveButton();
        Thread.sleep(3000);
    }

    @And("^User click cancel myPets$")
    public void userClickCancelMyPets() {
        EditMyPetsPage editMyPetsPage = new EditMyPetsPage(webDriver);
        editMyPetsPage.setCancelButton();
    }

}
