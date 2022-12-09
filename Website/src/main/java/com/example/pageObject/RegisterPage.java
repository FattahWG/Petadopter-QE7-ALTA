package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    public static WebDriver driver;

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "inputFullName")
    private WebElement fullNameField;
    @FindBy(id = "inputFullAddress")
    private WebElement fullAddressField;
    @FindBy(id = "inputUsername")
    private WebElement userNameField;
    @FindBy(id = "inputEmail")
    private WebElement emailField;
    @FindBy(id = "inputPhoneNumber")
    private WebElement phoneNumberField;
    @FindBy(id = "inputPassword")
    private WebElement passwordField;
    @FindBy(id = "signupButton")
    private WebElement signUpButton;
    @FindBy(id = "inputCity")
    private WebElement selectCity;

    public void inputFullName(String fullName){
        fullNameField.sendKeys(fullName);
    }
    public void selectCity(String city){
        selectCity.click();
        Select select = new Select(selectCity);
        select.selectByVisibleText(city);
    }
    public void inputFullAddress(String fullAddress){
        fullAddressField.sendKeys(fullAddress);
    }
    public void inputUsername(String userName){
        userNameField.sendKeys(userName);
    }
    public void inputEmail(String email){
        emailField.sendKeys(email);
    }
    public void inputPhoneNumber(String phoneNumber){
        phoneNumberField.sendKeys(phoneNumber);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickSignUpButton(){
        signUpButton.click();
    }
}
