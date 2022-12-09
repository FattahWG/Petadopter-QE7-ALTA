package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public static WebDriver driver;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }
    @FindBy(xpath = "//h1[@class='font-bold text-xl md:text-2xl lg:text-3xl']")
    private WebElement discoverWord;
    @FindBy(css = ".ml-6 > [stroke='currentColor']")
    private WebElement moreButton;
    @FindBy(xpath = "//div[@class='my-4 grid md:grid-cols-2 lg:grid-cols-3 gap-4 md:gap-8 lg:gap-12']/div[1]//button[@class='w-full rounded-full bg-[#FFC700] dark:bg-[#CDA000] text-white font-medium text-xs p-1']")
    private WebElement seeMoreButton;
    @FindBy(css = "[height='35']")
    private WebElement hamburgerButton;
    @FindBy(css = ".w-72")
    private WebElement invitationBox;

    public boolean discoverWordIsDisplayed(){
        discoverWord.isDisplayed();
        return true;
    }
    public void clickMoreButton(){
        moreButton.click();
    }
    public void clickSeeMoreButton(){
        seeMoreButton.click();
    }
    public void clickHamburgerButton(){
        hamburgerButton.click();
    }
    public boolean invitationIsDisplayed(){
        invitationBox.isDisplayed();
        return true;
    }
}
