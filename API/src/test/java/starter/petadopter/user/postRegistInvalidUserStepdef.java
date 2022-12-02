package starter.petadopter.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class postRegistInvalidUserStepdef {
    @Steps
    userAPI UserAPI;


    @Given("Post regist new user without username json")
    public void setPostRegistInvalid() {
        File json = new File(userAPI.JSON_REG_BODY + "/postRegistUserwithoutUsername.json");
        UserAPI.setPostRegistNewUser(json);
    }

    @And("Validate regist fail with valid json")
    public void validateRegistFailWithValidJson() {
        File json = new File(userAPI.JSON_SCHEMA + "/postResponseSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Post regist new user without fullname json")
    public void postRegistNewUserWithoutFullnameJson() {
        File json = new File(userAPI.JSON_REG_BODY + "/postRegistUserWithoutFullname.json");
        UserAPI.setPostRegistNewUser(json);
    }

    @Given("Post regist new user without email json")
    public void postRegistNewUserWithoutEmailJson() {
        File json = new File(userAPI.JSON_REG_BODY + "/postRegistUserWithoutEmail.json");
        UserAPI.setPostRegistNewUser(json);
    }

    @Given("Post regist new user without address json")
    public void postRegistNewUserWithoutAddressJson() {
        File json = new File(userAPI.JSON_REG_BODY + "/postRegistUserWithoutAddress.json");
        UserAPI.setPostRegistNewUser(json);
    }

    @Given("Post Regist new user without city json")
    public void postRegistNewUserWithoutCityJson() {
        File json = new File(userAPI.JSON_REG_BODY + "/postRegistUserWithoutCity.json");
        UserAPI.setPostRegistNewUser(json);
    }

    @Given("Post Regist new user without password json")
    public void postRegistNewUserWithoutPasswordJson() {
        File json = new File(userAPI.JSON_REG_BODY + "/postRegistUserWithoutPassword.json");
        UserAPI.setPostRegistNewUser(json);
    }

    @Given("Post Regist new user without phonenumber json")
    public void postRegistNewUserWithoutPhonenumberJson() {
        File json = new File(userAPI.JSON_REG_BODY + "/postRegistUserWithoutPhonenumber.json");
        UserAPI.setPostRegistNewUser(json);
    }

    @Given("Post Regist new user with exist user json")
    public void postRegistNewUserWithExistUserJson() {
        File json = new File(userAPI.JSON_REG_BODY + "/postRegistValidUser.json");
        UserAPI.setPostRegistNewUser(json);
    }

    @Given("Put update photo profile user with valid json")
    public void putUpdatePhotoProfileUserWithValidJson() {

    }
}
