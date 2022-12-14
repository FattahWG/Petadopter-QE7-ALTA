package com.example.MyPetsObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeetingAppointmentPage {
    public static WebDriver driver;
    public MeetingAppointmentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = ".ml-6 > [stroke='currentColor']")
    private WebElement kebabMenu;
    @FindBy(xpath = "//a[contains(.,'My Meeting Appointment')]")
    private WebElement myMeetingAppointment;
    @FindBy(css = ".py-4 div:nth-of-type(1) > .w-72")
    private WebElement meetingCard;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(1) > .font-medium")
    private WebElement textDate;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(1) > td:nth-of-type(2)")
    private WebElement dateMeeting;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(2) > .font-medium")
    private WebElement textTime;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(2) > td:nth-of-type(2)")
    private WebElement timeMeeting;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(3) > .font-medium")
    private WebElement textPlace;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(3) > td:nth-of-type(2)")
    private WebElement placeMeeting;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(4) > .font-medium")
    private WebElement textStatus;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) .text-primary")
    private WebElement statusMeeting;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(5) > .font-medium")
    private WebElement textPetName;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(5) > td:nth-of-type(2)")
    private WebElement petName;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(6) > .font-medium")
    private WebElement textSeeker;
    @FindBy(css = ".py-4 > .grid > div:nth-of-type(1) tr:nth-of-type(6) > td:nth-of-type(2)")
    private WebElement seekerName;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-5']/div[1]//button[.='Edit']")
    private WebElement editMeeting;
    @FindBy(id = "inputDate")
    private WebElement updateDate;
    @FindBy(id = "inputTime")
    private WebElement updateTime;
    @FindBy(css = ".bg-primary")
    private WebElement updateButton;
    @FindBy(css = ".bg-accent")
    private WebElement cancelUpdate;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-5']/div[2]//button[.='Done']")
    private WebElement doneMeeting;

    @FindBy(xpath = "//div[16]//button[.='Done']")
    private WebElement doneMeeting1;
    @FindBy(xpath = "//div[3]//button[@class='w-16 md:w-20 text-md md:text-lg rounded-lg font-Poppins bg-red-500']")
    private WebElement cancelMeeting;
    @FindBy(xpath = "//div[12]//button[@class='w-16 md:w-20 text-md md:text-lg rounded-lg font-Poppins bg-red-500']")
    private WebElement cancelMeeting1;

    public boolean isDisplayed(){
        kebabMenu.isDisplayed();
        return true;
    }
    public void setKebabMenu(){
        kebabMenu.click();
    }
    public void setMyMeetingAppointment(){
        myMeetingAppointment.click();
    }
    public void setMeetingCard(){
        meetingCard.isDisplayed();
    }
    public void setTextDate(){
        textDate.isDisplayed();
    }
    public void setDateMeeting(){
        dateMeeting.isDisplayed();
    }
    public void setTextTime(){
        textTime.isDisplayed();
    }
    public void setTimeMeeting(){
        timeMeeting.isDisplayed();
    }
    public void setTextPlace(){
        textPlace.isDisplayed();
    }
    public void setPlaceMeeting(){
        placeMeeting.isDisplayed();
    }
    public void setTextStatus(){
        textStatus.isDisplayed();
    }
    public void setStatusMeeting(){
        statusMeeting.isDisplayed();
    }
    public void setTextPetName(){
        textPetName.isDisplayed();
    }
    public void setPetName(){
        petName.isDisplayed();
    }
    public void setTextSeeker(){
        textSeeker.isDisplayed();
    }
    public void setSeekerName(){
        seekerName.isDisplayed();
    }
    public void setEditMeeting(){
        editMeeting.click();
    }
    public void setUpdateDate(String date, String month, String year){
        updateDate.sendKeys(date, month, year);
    }
    public void setUpdateTime(String hour, String minute){
        updateTime.sendKeys(hour, minute);
    }
    public void setUpdateButton(){
        updateButton.click();
    }
    public void setCancelUpdate(){
        cancelUpdate.click();
    }
    public void setDoneMeeting(){
        doneMeeting.click();
    }
    public void setDoneMeeting1(){
        doneMeeting1.click();
    }
    public void setCancelMeeting(){
        cancelMeeting.click();
    }
    public void setCancelMeeting1(){
        cancelMeeting1.click();
    }
}
