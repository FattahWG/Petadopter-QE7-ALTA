package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "/home/fattah/Documents/GitHub/Petadopter-QE7-ALTA/Website/driver/chromedriver");
        webDriver= new ChromeDriver();
        String URL = "https://pet-adopter-frontend.vercel.app/";
        webDriver.get(URL);
        webDriver.manage().window().maximize();
    }
    @After
    public void closeBrowser(){
    }
}
