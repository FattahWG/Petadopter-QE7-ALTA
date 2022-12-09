package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
//        System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        webDriver= new ChromeDriver();
        String URL = "https://pet-adopter-frontend.vercel.app/";
        webDriver.get(URL);
        webDriver.manage().window().maximize();
    }
    @After
    public void closeBrowser(){
        webDriver.quit();
    }
}
