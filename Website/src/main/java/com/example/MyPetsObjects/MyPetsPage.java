package com.example.MyPetsObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPetsPage {
    public static WebDriver driver;
    public MyPetsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static final String name = "";
    public static final String gender = "";
    public static final String age = "";
    public static final String color = "";

    @FindBy(xpath = "//h3[.='My Pets']")
    private WebElement myPetsMenu;

//    Identity Card Pets
    @FindBy(css = ".my-4 > div:nth-of-type(1) > .flex")
    private WebElement myPetsCard;
    @FindBy(css = "[alt='"+name+"']")
    private WebElement firstPetsImage;
    @FindBy(css = ".my-4 > div:nth-of-type(1) .font-bold")
    private WebElement firstPetsName;
    @FindBy(css = ".my-4 > div:nth-of-type(1) .break-words")
    private WebElement firstPetsCity;
    @FindBy(css = ".my-4 > div:nth-of-type(1) h2:nth-of-type(2)")
    private WebElement firstPetsGender;
    @FindBy(css = ".my-4 > div:nth-of-type(1) h2:nth-of-type(3)")
    private WebElement firstPetsAge;

//    Profile Pets
    @FindBy(css = ".my-4 > div:nth-of-type(1) .w-full > .w-full")
    private WebElement seeMoreButton;
    @FindBy(css = ".rounded-md")
    private WebElement profileImage;
    @FindBy(css = ".text-xl")
    private WebElement profileName;
    @FindBy(css = "h2")
    private WebElement profileOwnerName;
    @FindBy(css = ".italic")
    private WebElement profileSpecies;
    @FindBy(xpath = "//p[@class='md:text-lg']")
    private WebElement profileCity;
    @FindBy(xpath = "//h3[.='Detail']")
    private WebElement profileDetail;
    @FindBy(xpath = "//h4[.='Gender']")
    private WebElement profileTextGender;
    @FindBy(css = ".my-4 div:nth-of-type(1) > .font-medium")
    private WebElement profileGenders;
    @FindBy(xpath = "//h4[.='Age']")
    private WebElement profileTextAge;
    @FindBy(css = ".my-4 div:nth-of-type(2) > .font-medium")
    private WebElement profileAges;
    @FindBy(xpath = "//h4[.='Color']")
    private WebElement profileTextColor;
    @FindBy(css = ".my-4 div:nth-of-type(3) > .font-medium")
    private WebElement profileColors;
    @FindBy(xpath = "//h3[.='Description']")
    private WebElement profileTextDescription;
    @FindBy(css = ".h-52")
    private WebElement profileDescriptions;

//    Delete Pets
    @FindBy(css = "div:nth-of-type(9) .w-full > .w-full")
    private WebElement seeMoreDelete;
    @FindBy(css = ".mx-1 > [stroke='currentColor']")
    private WebElement deletePets;

    public boolean isDisplayed(){
        myPetsMenu.isDisplayed();
        return true;
    }
    public void setMyPetsMenu(){
        myPetsMenu.click();
    }

//    Identity Card Pets
    public void setMyPetsCard(){
        myPetsCard.isDisplayed();
    }
    public void setFirstPetsImage(){
        firstPetsImage.isDisplayed();
    }
    public void setFirstPetsName(){
        firstPetsName.isDisplayed();
    }
    public void setFirstPetsCity(){
        firstPetsCity.isDisplayed();
    }
    public void setFirstPetsGender(){
        firstPetsGender.isDisplayed();
    }
    public void setFirstPetsAge(){
        firstPetsAge.isDisplayed();
    }

//    Profile Pets
    public void setSeeMoreButton(){
        seeMoreButton.click();
    }
    public void setProfileImage(){
        profileImage.isDisplayed();
    }
    public void setProfileName(){
        profileName.isDisplayed();
    }
    public void setProfileOwnerName(){
        profileOwnerName.isDisplayed();
    }
    public void setProfileSpecies(){
        profileSpecies.isDisplayed();
    }
    public void setProfileCity(){
        profileCity.isDisplayed();
    }
    public void setProfileDetail(){
        profileDetail.isDisplayed();
    }
    public void setProfileTextGender(){
        profileTextGender.isDisplayed();
    }
    public void setProfileGenders(){
        profileGenders.isDisplayed();
    }
    public void setProfileTextAge(){
        profileTextAge.isDisplayed();
    }
    public void setProfileAges(){
        profileAges.isDisplayed();
    }
    public void setProfileTextColor(){
        profileTextColor.isDisplayed();
    }
    public void setProfileColors(){
        profileColors.isDisplayed();
    }
    public void setProfileTextDescription(){
        profileTextDescription.isDisplayed();
    }
    public void setProfileDescriptions(){
        profileDescriptions.isDisplayed();
    }

//    Delete Pets
    public void setSeeMoreDelete(){
        seeMoreDelete.click();
    }
    public void setDeletePets(){
        deletePets.click();
    }
}
