package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "inputUsername")
    private WebElement userNameField;
    @FindBy(id = "inputPassword")
    private WebElement passwordField;
    @FindBy(id = "loginButton")
    private WebElement loginButton;
    @FindBy(xpath = "//a[.='Sign up here']")
    private WebElement SignUpButton;

    public void inputUserName(String username){
        userNameField.sendKeys(username);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public boolean userNameIsDisplayed(){
        userNameField.isDisplayed();
        return true;
    }
    public void clickSignUp(){SignUpButton.click();}
    public String getTextUserNameField(){
        return userNameField.getText();
    }
}
