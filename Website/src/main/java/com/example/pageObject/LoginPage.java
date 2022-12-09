package com.example.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import javax.xml.xpath.XPath;

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

    @FindBy(id = "inputUsername")
    private WebElement username;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement password;

    @FindBy(xpath = "//h3")
    private WebElement errorMessage;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(xpath ="//a[@class='bs-alert-close']")
    private WebElement LogOk;


    public void setUsername(String user){
        username.sendKeys(user);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLogin(){
        loginButton.click();
    }
    public void clickLogin1(){
    }

    public boolean isDisplayed(){
        username.isDisplayed();
        return true;
    }
}