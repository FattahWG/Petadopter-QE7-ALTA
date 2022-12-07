package starter.petadopter.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class UserSteps {
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
    @Given("Post regist new user with valid json")
    public void postRegistNewUserWithValidJson() {
        File json = new File(userAPI.JSON_REG_BODY + "/postRegistValidUser.json");
        UserAPI.setPostRegistNewUser(json);
    }
    @When("Send post regist new user")
    public void sendPostRegistNewUser() {
        SerenityRest.when().post(userAPI.UserAPI);
    }

    @Then("Status code should be {int} {string}")
    public void statusCodeShouldBe(int value, String response) {
        SerenityRest.then().statusCode(value)
                .body(userResponse.MESSAGE, equalTo(response));
    }
    @And("Validate regist success with valid json")
    public void validateRegistSuccessWithValidJson() {
        File json = new File(userAPI.JSON_SCHEMA + "/postResponseSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Put update photo profile user with multipart")
    public void setPutUpdat() {
        UserAPI.setPut();
    }
    @When("Send post regist update photo")
    public void sendPostRegistUpdatePhoto() {
        SerenityRest.when().put(userAPI.UserAPI);
    }

    @And("Validate success update with valid json")
    public void validateSuccessUpdateWithValidJson() {
        File json = new File(userAPI.JSON_SCHEMA + "/putUpdateResponseSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get user data")
    public void getUserData() {
        UserAPI.userdata();
    }

    @When("Send Get user data request")
    public void sendGetUserDataRequest() {
        SerenityRest.when().get(userAPI.UserAPI);
    }

    @Given("Delete User")
    public void deleteUser() {
        UserAPI.deleteuser();
    }

    @When("Send delete user request")
    public void sendDeleteUserRequest() {
        SerenityRest.when().delete(userAPI.UserAPI);
    }

    @And("Validate get user success with valid json")
    public void validateGetUserSuccessWithValidJson() {
        File json = new File(userAPI.JSON_SCHEMA + "/getdataValidUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Validate delete success with valid json")
    public void validateDeleteSuccessWithValidJson() {
        File json = new File(userAPI.JSON_SCHEMA + "/DeleteResponseSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }


}
