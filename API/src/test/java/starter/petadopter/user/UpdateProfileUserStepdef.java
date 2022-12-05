package starter.petadopter.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class UpdateProfileUserStepdef {
    @Steps
    userAPI UserAPI;
    @Given("Put update photo profile user with valid json")
    public void setPutUpdate() {
        String foto =userAPI.Photos + "/jacob.jpg";
        UserAPI.setPutUpdate(foto);
    }

    @And("Validate success update with valid json")
    public void validateSuccessUpdateWithValidJson() {
        File json = new File(userAPI.JSON_SCHEMA + "/putUpdateResponseSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
