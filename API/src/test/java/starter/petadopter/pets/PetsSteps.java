package starter.petadopter.pets;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.et.Ja;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import okhttp3.MultipartBody;

import static org.hamcrest.Matchers.equalTo;

import java.io.File;

public class PetsSteps {
    @Steps
    petsAPI PetsAPI;

//    GET Steps
    @Given("get all pets")
    public void getAllPets() {
        PetsAPI.setGetAllPets();
    }

    @When("Send get all pets request")
    public void sendGetAllPetsRequest() {
        SerenityRest.when().get(petsAPI.GET_ALL_PETS);
    }

    @Then("Status code should response {int} OK")
    public void statusCodeShouldResponseOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }
    @And("Validate get pets data json schema")
    public void validateGetPetsDataJsonSchema() {
        File json = new File(petsAPI.JSON_SCHEMA + "/GetPetsJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get pets data by parameter id {int}")
    public void getPetsDataByParameterIdId(int id) {
        PetsAPI.setGetPetsDataById(id);
    }

    @When("Send get pets data by id request")
    public void sendGetPetsDataByIdRequest() {
        SerenityRest.when().get(petsAPI.GET_PETS_DATA_BY_ID);
    }
    @And("Validate get pets data by id json schema")
    public void validateGetPetsDataByIdJsonSchema() {
        File json = new File(petsAPI.JSON_SCHEMA + "/GetPetsIdJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get pets data by parameter invalid id {int}")
    public void getPetsDataByParameterInvalidIdId(int id) {
        PetsAPI.setGetPetsDataById(id);
    }

    @Then("Status code should response {int} Not Found")
    public void statusCodeShouldResponseNotFound(int NotFound) {
        SerenityRest.then().statusCode(NotFound);
    }
    @And("Validate get pets data by invalid id json schema")
    public void validateGetPetsDataByInvalidIdJsonSchema() {
        File json = new File(petsAPI.JSON_SCHEMA + "/GetPetsInvalidIdJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get all user pets data")
    public void getAllUserPetsData() {
        PetsAPI.setGetAllUserPetsData();
    }

    @When("Send get all user pets data request")
    public void sendGetAllUserPetsDataRequest() {
        SerenityRest.when().get(petsAPI.GET_ALL_USER_PETS_DATA);
    }
    @And("Validate get all user pets data json schema")
    public void validateGetAllUserPetsDataJsonSchema() {
        File json = new File(petsAPI.JSON_SCHEMA + "/GetAllUserPetsJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

//    POST Steps
    @Given("Post create pets data with multipart")
    public void postCreatePetsDataWithMultipart() {
        PetsAPI.setPostPets();
    }

    @When("Send post create pets request")
    public void sendPostCreatePetsRequest() {
        SerenityRest.when().post(petsAPI.POST_PETS);
    }

    @And("Validate post create pets data json schema")
    public void validatePostCreatePetsDataJsonSchema() {
        File json = new File(petsAPI.JSON_SCHEMA + "/PostPetsJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Post create pets data with invalid json")
    public void postCreatePetsDataWithInvalidJson() {
        File json = new File(petsAPI.JSON_REG_BODY + "/InvalidPostBodyPets.json");
        PetsAPI.setPostPet(json);
    }
    @When("Send post create pets invalid json request")
    public void sendPostCreatePetsInvalidJsonRequest() {
        SerenityRest.when().post(petsAPI.POST_PET);
    }

    @Then("Status code should response {int} Bad Request")
    public void statusCodeShouldResponseBadRequest(int BadRequest) {
        SerenityRest.then().statusCode(BadRequest);
    }

    @Given("Put update pets data with multipart with id {int}")
    public void putUpdatePetsDataWithMultipartWithIdId(int id) {
        PetsAPI.setPutUpdatePets(id);
    }

    @When("Send put update data request")
    public void sendPutUpdateDataRequest() {
        SerenityRest.when().put(petsAPI.PUT_UPDATE_PETS);
    }
    @And("Validate put update pets data json schema")
    public void validatePutUpdatePetsDataJsonSchema() {
        File json = new File(petsAPI.JSON_SCHEMA + "/UpdatePetsJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Delete pets data with valid id {int}")
    public void deletePetsDataWithValidIdId(int id) {
        PetsAPI.setDeletePets(id);
    }

    @When("Send delete pets request")
    public void sendDeletePetsRequest() {
        SerenityRest.when().delete(petsAPI.DELETE_PETS);
    }
    @And("Validate delete pets data json schema")
    public void validateDeletePetsDataJsonSchema() {
        File json = new File(petsAPI.JSON_SCHEMA + "/DeletePetsJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Delete pets data with invalid id {int}")
    public void deletePetsDataWithInvalidIdId(int id) {
        PetsAPI.setDeletePets(id);
    }

    @Then("Status code should response {int} Html")
    public void statusCodeShouldResponseHtml(int Html) {
        SerenityRest.then().statusCode(Html);
    }
}
