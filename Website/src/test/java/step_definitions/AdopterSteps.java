package step_definitions;

import org.openqa.selenium.WebDriver;
import com.example.pageObject.AdoptionPage;
import com.example.pageObject.HomePage;
import com.example.pageObject.PetDetailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AdopterSteps {
    public WebDriver webDriver;
    public AdopterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
}
