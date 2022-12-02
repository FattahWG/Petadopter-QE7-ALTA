package starter.petadopter.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import static org.hamcrest.Matchers.equalTo;
import java.io.File;

public class postRegistValidUserStepdef {
    @Steps
    userAPI UserAPI;
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

}
