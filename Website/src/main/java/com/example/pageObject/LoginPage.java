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
    @FindBy(xpath = "//a[.='Sign up here']")
    private WebElement SignUpButton;
    @FindBy(css = ".text-left")
    private WebElement logOut;
    @FindBy(id = "loginButton")
    private WebElement loginButton;

    public void inputUserName(String username){
        userNameField.sendKeys(username);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void clickLogoutButton(){
        logOut.click();
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