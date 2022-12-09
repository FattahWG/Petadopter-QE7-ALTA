package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdoptionPage {

    public static WebDriver driver;
    public AdoptionPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }
    @FindBy(xpath = "//div[@class='flex justify-between items-center p-6 font-medium text-lg lg:text-xl']//h3[.='Adoption']")
    private WebElement adoptionMenu;
    @FindBy(xpath = "//h1[.='kilian']")
    private WebElement textPetName;
    @FindBy(xpath = "//span[@class='text-[#FFC700] dark:text-[#CDA000]']")
    private WebElement textAccepted;
    @FindBy(xpath = "//div[5]//span[@class='text-black dark:text-white']")
    private WebElement textRequested;
    @FindBy(xpath = "//span[@class='text-[#D98481] dark:text-[#AF6C6A]']")
    private WebElement textRejected;

    public void clickAdoptionMenu(){
        adoptionMenu.click();
    }
    public boolean petNameIsDisplayed(){
        textPetName.isDisplayed();
        return true;
    }
    public String getTextAccepted(){
        return textAccepted.getText();
    }
    public String getTextRequested(){
        return textRequested.getText();
    }
    public String getTextRejected(){
        return textRejected.getText();
    }
}
