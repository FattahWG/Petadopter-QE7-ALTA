package com.example.MyPetsObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditMyPetsPage {
    public static WebDriver driver;
    public EditMyPetsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static final String DIR = System.getProperty("user.dir");
    public static final String PHOTO = DIR + "/src/test/resources/photo/";

    @FindBy(xpath = "//button[@class='mx-2']")
    private WebElement editButton;
    @FindBy(css = "[placeholder='Type your pet names here...']")
    private WebElement petNameField;
    @FindBy(css = ".select")
    private WebElement petCategory;
    @FindBy(xpath = "//option[.='Cat']")
    private WebElement catCategory;
    @FindBy(xpath = "//option[.='Dog']")
    private WebElement dogCategory;
    @FindBy(xpath = "//input[@value='1']")
    private WebElement maleGender;
    @FindBy(xpath = "//input[@value='2']")
    private WebElement femaleGender;
    @FindBy(css = "[placeholder='Enter a number...']")
    private WebElement petAgeField;
    @FindBy(css = "[placeholder='Type your pet colors here...']")
    private WebElement petColorField;
    @FindBy(css = ".textarea")
    private WebElement petDescription;
    @FindBy(xpath = "//button[@class='my-2 btn btn-primary text-white rounded-full']")
    private WebElement uploadPhoto;
    @FindBy(css = "[type='submit']")
    private WebElement saveButton;
    @FindBy(css = ".btn-accent")
    private WebElement cancelButton;
    @FindBy(xpath = "//div[@class='my-4 grid md:grid-cols-2 lg:grid-cols-3 gap-4 md:gap-8 lg:gap-12']/div[1]//button[@class='w-full my-1 rounded-full bg-[#D98481] dark:bg-[#AF6C6A] text-white font-medium text-xs p-1']")
    private WebElement cancelRequestButton;

    public boolean isDisplayed(){
        editButton.isDisplayed();
        return true;
    }
    public void setEditButton(){
        editButton.click();
    }
    public void setPetNameField(String name){
        petNameField.clear();
        petNameField.sendKeys(name);
    }
    public void setPetCategory(){
        petCategory.click();
    }
    public void setCatCategory(){
        catCategory.isDisplayed();
    }
    public void setDogCategory(){
        dogCategory.click();
    }
    public void setMaleGender(){
        maleGender.isDisplayed();
    }
    public void setFemaleGender(){
        femaleGender.click();
    }
    public void setPetAgeField(String age){
        petAgeField.clear();
        petAgeField.sendKeys(age);
    }
    public void setPetColorField(String color){
        petColorField.clear();
        petColorField.sendKeys(color);
    }
    public void setPetDescription(String description){
        petDescription.clear();
        petDescription.sendKeys(description);
    }
    public void setUploadPhoto(){
        uploadPhoto.sendKeys(PHOTO+"lion.jpg");
    }
    public void setSaveButton(){
        saveButton.click();
    }
    public void setCancelButton(){
        cancelButton.click();
    }
    public void cancelRequest(){cancelRequestButton.click();}
}
