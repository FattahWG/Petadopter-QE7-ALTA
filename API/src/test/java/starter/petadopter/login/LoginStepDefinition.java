package starter.petadopter.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class LoginStepDefinition {
    @Steps
    LoginAPI loginAPI;
    @Given("Post login with valid body json")
    public void postLoginWithValidBodyJson(){
        File json = new File(LoginAPI.JSON_REG_BODY+"/LoginWithValidJson.json");
        loginAPI.postLoginUser(json);
    }

    @When("Send post login request")
    public void sendPostLoginRequest() {
        SerenityRest.when().post(LoginAPI.POST_LOGIN);
    }

    @And("Validate post login json schema")
    public void validatePostLoginJsonSchema() {
        File json = new File(LoginAPI.JSON_SCHEMA+"/LoginJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Post login with invalid username")
    public void postLoginWithInvalidUsername() {
        File json = new File(LoginAPI.JSON_REG_BODY+"/LoginWithInvalidUsername.json");
        loginAPI.postLoginUser(json);
    }

    @Given("Post login with invalid password")
    public void postLoginWithInvalidPassword() {
        File json = new File(LoginAPI.JSON_REG_BODY+"/LoginWithInvalidPassword.json");
        loginAPI.postLoginUser(json);
    }

    @Given("Post login with invalid username and password")
    public void postLoginWithInvalidUsernameAndPassword() {
        File json = new File(LoginAPI.JSON_REG_BODY+"/LoginInvalid.json");
        loginAPI.postLoginUser(json);
    }
}
