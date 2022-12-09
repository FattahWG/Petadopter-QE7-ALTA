package step_definitions;

import com.example.pageObject.EditProfilePage;
import com.example.pageObject.HomePage;
import com.example.pageObject.MorePage;
import com.example.pageObject.ProfilePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EditProfileSteps {

    public WebDriver webDriver;

    public EditProfileSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click go to edit profile page")
    public void goToEditProfilePage()throws InterruptedException{
        HomePage homePage = new HomePage(webDriver);
        MorePage morePage = new MorePage(webDriver);
        ProfilePage profilePage = new ProfilePage(webDriver);
        Thread.sleep(3000);
        homePage.clickMoreButton();
        Thread.sleep(3000);
        morePage.clickMyProfileButton();
        Thread.sleep(3000);
        profilePage.clickEditProfileButton();
        Thread.sleep(3000);
    }

    @When("user select file photo as photo profile")
    public void userSelectFilePhotoAsPhotoProfile()throws InterruptedException {
        EditProfilePage editProfilePage = new EditProfilePage(webDriver);
        editProfilePage.clickChooseFileField();
        Thread.sleep(2000);
    }

    @And("user edit full name with \"(.*)\" and edit city with \"(.*)\"")
    public void userInputAsFullName(String editFullName,String editCity)throws InterruptedException{
        EditProfilePage editProfilePage = new EditProfilePage(webDriver);
        editProfilePage.editFullName(editFullName);
        Thread.sleep(2000);
        editProfilePage.editCity(editCity);
        Thread.sleep(2000);
    }

    @When("user edit full address with \"(.*)\" and edit username with \"(.*)\"")
    public void userEditFullAddressWithAndEditUsernameWith(String editAddress, String editName)throws InterruptedException{
        EditProfilePage editProfilePage = new EditProfilePage(webDriver);
        editProfilePage.editFullAddress(editAddress);
        Thread.sleep(2000);
        editProfilePage.editUserName(editName);
        Thread.sleep(2000);
    }

    @And("user edit email with \"(.*)\" and edit phone number with \"(.*)\"")
    public void userEditEmailWithAndEditPhoneNumberWith(String editEmail, String editNumber)throws InterruptedException{
        EditProfilePage editProfilePage = new EditProfilePage(webDriver);
        editProfilePage.editEmail(editEmail);
        Thread.sleep(2000);
        editProfilePage.editPhoneNumber(editNumber);
        Thread.sleep(2000);
    }

    @And("user edit password with \"(.*)\" and click edit button")
    public void userEditPasswordWithAndClickEditButton(String editPassword)throws InterruptedException{
        EditProfilePage editProfilePage = new EditProfilePage(webDriver);
        editProfilePage.editPassword(editPassword);
        Thread.sleep(2000);
        editProfilePage.clickEditButton();
        Thread.sleep(3000);
    }

    @Then("user will see message \"(.*)\"")
    public void userWillSeeMessage(String successMsg)throws InterruptedException{
        Assert.assertEquals(successMsg,webDriver.switchTo().alert().getText());
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
        Thread.sleep(1000);
    }

    @Then("user will see error alert with message \"(.*)\"")
    public void userWillSeeErrorAlertWithMessageCantInputExistingData(String alertMessage)throws InterruptedException{
        Assert.assertEquals(alertMessage,webDriver.switchTo().alert().getText());
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
        Thread.sleep(1000);
    }
}
