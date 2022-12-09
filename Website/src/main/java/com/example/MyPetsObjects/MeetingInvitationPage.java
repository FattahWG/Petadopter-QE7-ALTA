package com.example.MyPetsObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeetingInvitationPage {
    public static WebDriver driver;
    public MeetingInvitationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='my-4 grid md:grid-cols-2 lg:grid-cols-3 gap-4 md:gap-8 lg:gap-12']/div[1]//button[@class='w-full rounded-full bg-[#DDFFF9] dark:bg-[#9EC8C1] text-black dark:text-white font-medium text-xs p-1']")
    private WebElement createMeeting;
    @FindBy(id = "inputDate")
    private WebElement inputDate;
    @FindBy(id = "inputTime")
    private WebElement inputTime;
    @FindBy(css = ".bg-primary")
    private WebElement addButton;
    @FindBy(css = ".bg-accent")
    private WebElement cancelButton;

    public boolean isDisplayed(){
        createMeeting.isDisplayed();
        return true;
    }
    public void setCreateMeeting(){
        createMeeting.click();
    }
    public void setInputDate(String date, String month, String year){
        inputDate.sendKeys(date, month, year);
    }
    public void setInputTime(String hour, String minute){
        inputTime.sendKeys(hour, minute);
    }
    public void setAddButton(){
        addButton.click();
    }
    public void setCancelButton(){
        cancelButton.click();
    }
}
