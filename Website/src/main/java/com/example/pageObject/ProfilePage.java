package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public static WebDriver driver;

    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    @FindBy(xpath = "//button[@class='w-72 text-primary font-Poppins text-md md:text-xl py-1 md:py-2 mb-4 rounded-lg font-bold border-2 border-primary']")
    private WebElement editProfileButton;
    @FindBy(css = ".bg-red-500")
    private WebElement deleteButton;

    public void clickEditProfileButton(){
        editProfileButton.click();
    }
    public void DeleteProfile(){deleteButton.click();}
}
