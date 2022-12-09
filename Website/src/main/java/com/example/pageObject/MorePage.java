package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MorePage {

    public static WebDriver driver;

    public MorePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css = ".my-4 > [stroke='currentColor']")
    private WebElement myProfileButton;

    public void clickMyProfileButton(){
        myProfileButton.click();
    }
}
