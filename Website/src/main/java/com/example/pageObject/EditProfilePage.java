package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class EditProfilePage {

    public static WebDriver driver;

    public EditProfilePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    public static final String DIR = System.getProperty("user.dir");
    public static final String FILEPATH = DIR+"/src/test/resources/photo/";

    @FindBy(id = "inputFile")
    private WebElement chooseFileField;
    @FindBy(id = "inputFullName")
    private WebElement editFullNameField;
    @FindBy(id = "inputCity")
    private WebElement selectCityField;
    @FindBy(id = "inputFullAddress")
    private WebElement editFullAddressField;
    @FindBy(id = "inputUsername")
    private WebElement editUsernameField;
    @FindBy(id = "inputEmail")
    private WebElement editEmailField;
    @FindBy(id = "inputPhoneNumber")
    private WebElement editPhoneNumberField;
    @FindBy(id = "inputPassword")
    private WebElement editPasswordField;
    @FindBy(xpath = "//button[@class='text-md md:text-2xl py-1 md:py-2 w-24 md:w-32 rounded-lg font-Poppins bg-primary']")
    private WebElement editButton;

    public void clickChooseFileField(){
        chooseFileField.clear();
        chooseFileField.sendKeys(FILEPATH+"cat.jpg");
    }
    public void editFullName(String fullName){
        editFullNameField.clear();
        editFullNameField.sendKeys(fullName);
    }
    public void editCity(String city){
        selectCityField.click();
        Select select = new Select(selectCityField);
        select.selectByVisibleText(city);
    }
    public void editFullAddress(String fullAddress){
        editFullAddressField.clear();
        editFullAddressField.sendKeys(fullAddress);
    }
    public void editUserName(String userName){
        editUsernameField.clear();
        editUsernameField.sendKeys(userName);
    }
    public void editEmail(String email){
        editEmailField.clear();
        editEmailField.sendKeys(email);
    }
    public void editPhoneNumber(String phoneNumber){
        editPhoneNumberField.clear();
        editPhoneNumberField.sendKeys(phoneNumber);
    }
    public void editPassword(String password){
        editPasswordField.clear();
        editPasswordField.sendKeys(password);
    }
    public void clickEditButton(){
        editButton.click();
    }
}
