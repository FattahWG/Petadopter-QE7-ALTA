package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import com.example.MyPetsObjects.ViewApplierPage;
import org.openqa.selenium.WebDriver;

public class ViewAppliersPageSteps {
    private WebDriver webDriver;
    public ViewAppliersPageSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("^User click view applier button$")
    public void userClickViewApplierButton() throws InterruptedException {
        ViewApplierPage viewApplierPage = new ViewApplierPage(webDriver);
        viewApplierPage.isDisplayed();
        viewApplierPage.setViewAppliers();
        Thread.sleep(3000);
    }

    @Then("^User will get routed to the appliers list page$")
    public void userWillGetRoutedToTheAppliersListPage() throws InterruptedException {
        ViewApplierPage viewApplierPage = new ViewApplierPage(webDriver);
        viewApplierPage.setAppliersCard();
        viewApplierPage.setAppliersImage();
        viewApplierPage.setAppliersName();
        viewApplierPage.setAppliersMessage();
        Thread.sleep(3000);
    }

    @And("^User accept applier request$")
    public void userAcceptApplierRequest() throws InterruptedException {
        ViewApplierPage viewApplierPage = new ViewApplierPage(webDriver);
        viewApplierPage.setAcceptButton();
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
    }

    @And("^User reject applier request$")
    public void userRejectApplierRequest() throws InterruptedException {
        ViewApplierPage viewApplierPage = new ViewApplierPage(webDriver);
        viewApplierPage.setDeclineButton();
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
    }
}
