package com.example.MyPetsObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPetsPage {
    public static WebDriver driver;
    public NewPetsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static final String DIR = System.getProperty("user.dir");
    public static final String FILEPATH = DIR + "\\src\\test\\resources\\photo\\";

    @FindBy(css = ".right-4 > div:nth-of-type(3) > [stroke='currentColor']")
    private WebElement newPets;
    @FindBy(css = "[placeholder='Type your pet names here...']")
    private WebElement newPetNameField;
    @FindBy(css = ".select")
    private WebElement newPetsCategory;
    @FindBy(xpath = "//option[.='Cat']")
    private WebElement newPetsCat;
    @FindBy(xpath = "//option[.='Dog']")
    private WebElement newPetsDog;
    @FindBy(xpath = "//input[@value='1']")
    private WebElement newPetsMale;
    @FindBy(xpath = "//input[@value='2']")
    private WebElement newPetsFemale;
    @FindBy(css = "[placeholder='Enter a number...']")
    private WebElement newPetsAge;
    @FindBy(css = "[placeholder='Type your pet colors here...']")
    private WebElement newPetsColor;
    @FindBy(css = ".textarea")
    private WebElement newPetsDescription;
    @FindBy(xpath = "//button[@class='my-2 btn btn-primary text-white rounded-full']")
    private WebElement uploadNewPets;
    @FindBy(css = "[type='submit']")
    private WebElement saveNewPets;
    @FindBy(css = ".btn-accent")
    private WebElement cancelNewPets;

    public boolean isDisplayed(){
        newPets.isDisplayed();
        return true;
    }
    public void setNewPets(){
        newPets.click();
    }
    public void setNewPetNameField(String name){
        newPetNameField.sendKeys(name);
    }
    public void setNewPetsCategory(){
        newPetsCategory.click();
    }
    public void setNewPetsCat(){
        newPetsCat.click();
    }
    public void setNewPetsDog(){
        newPetsDog.isDisplayed();
    }
    public void setNewPetsMale(){
        newPetsMale.click();
    }
    public void setNewPetsFemale(){
        newPetsFemale.isDisplayed();
    }
    public void setNewPetsAge(String age){
        newPetsAge.sendKeys(age);
    }
    public void setNewPetsColor(String color){
        newPetsColor.sendKeys(color);
    }
    public void setNewPetsDescription(String description){
        newPetsDescription.sendKeys(description);
    }
    public void setUploadNewPets(){
        uploadNewPets.sendKeys(FILEPATH+"saltwater-crocodile.jpg");
    }
    public void setSaveNewPets(){
        saveNewPets.click();
    }
    public void setCancelNewPets(){
        cancelNewPets.click();
    }
}
