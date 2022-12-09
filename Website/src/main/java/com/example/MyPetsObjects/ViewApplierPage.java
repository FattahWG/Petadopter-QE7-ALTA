package com.example.MyPetsObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewApplierPage {
    public static WebDriver driver;
    public ViewApplierPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static final String name = "";

    @FindBy(css = ".text-white")
    private WebElement viewAppliers;
    @FindBy(xpath = "//div[@class='my-4 grid md:grid-cols-2 lg:grid-cols-3 gap-4 md:gap-8 lg:gap-12']/div[1]/div[@class='flex items-center']")
    private WebElement appliersCard;
    @FindBy(css = ".my-4 > div:nth-of-type(1) [alt='"+name+"']")
    private WebElement appliersImage;
    @FindBy(css = ".my-4 > div:nth-of-type(1) .w-full > .font-bold")
    private WebElement appliersName;
    @FindBy(css = ".my-4 > div:nth-of-type(1) p")
    private WebElement appliersMessage;
    @FindBy(xpath = "//div[3]//button[@class='w-1/2 rounded-full bg-[#FFC700] dark:bg-[#CDA000] text-white font-medium text-xs p-1']")
    private WebElement acceptButton;
    @FindBy(xpath = "//div[4]//button[@class='w-1/2 ml-4 rounded-full bg-[#D98481] dark:bg-[#AF6C6A] text-white font-medium text-xs p-1']")
    private WebElement declineButton;

    public boolean isDisplayed(){
        viewAppliers.isDisplayed();
        return true;
    }
    public void setViewAppliers(){
        viewAppliers.click();
    }
    public void setAppliersCard(){
        appliersCard.isDisplayed();
    }
    public void setAppliersImage(){
        appliersImage.isDisplayed();
    }
    public void setAppliersName(){
        appliersName.isDisplayed();
    }
    public void setAppliersMessage(){
        appliersMessage.isDisplayed();
    }
    public void setAcceptButton(){
        acceptButton.click();
    }
    public void setDeclineButton(){
        declineButton.click();
    }
}
