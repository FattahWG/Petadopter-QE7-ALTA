package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetDetailPage {

    public static WebDriver driver;
    public PetDetailPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    @FindBy(css = ".text-white")
    private WebElement applyAdoptButton;

    public void clickApplyAdoptButton(){
        applyAdoptButton.click();
    }
}
