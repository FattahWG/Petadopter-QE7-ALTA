package starter.petadopter.adoption;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import static org.hamcrest.Matchers.equalTo;
import java.io.File;

public class AdoptionStepDefinition {
    @Steps
    AdoptionAPI adoptionAPI;

    @Given("Set path to appliers with valid body json")
    public void setPathToAppliersWithValidBodyJson() {
        File json = new File(AdoptionAPI.JSON_REG_BODY+"/PostAppliersValidJson.json");
        adoptionAPI.postCreateAppliers(json);
    }

    @Given("Set path to appliers with string")
    public void setPathToAppliersWithString() {
        File json = new File(AdoptionAPI.JSON_REG_BODY+"/PostAppliersString.json");
        adoptionAPI.postCreateAppliers(json);
    }

    @Given("Set path to appliers without fill on body json")
    public void setPathToAppliersWithoutFillOnBodyJson() {
        File json = new File(AdoptionAPI.JSON_REG_BODY+"/PostAppliersBlank.json");
        adoptionAPI.postCreateAppliers(json);
    }

    @Given("Get all appliers with valid page {int}")
    public void getAllAppliersWithValidPage(int page) {
        adoptionAPI.getListAppliers(page);
    }

    @Given("Get all appliers with invalid page {string}")
    public void getAllAppliersWithInvalidPage(String page) {
        adoptionAPI.getListAppliersWithInvalidPage(page);
    }

    @Given("Get all adoptions with valid page {int}")
    public void getAllAdoptionsWithValidPage(int page) {
        adoptionAPI.getListAdoptions(page);
    }

    @Given("Get all adoptions with invalid page {string}")
    public void getAllAdoptionsWithInvalidPage(String page) {
        adoptionAPI.getListAdoptionsWithInvalidPage(page);
    }

    @When("Send post appliers request")
    public void sendPostAppliersRequest() {
        SerenityRest.when().post(AdoptionAPI.POST_CREATE_APPLIERS);
    }

    @When("Send get appliers request")
    public void sendGetAppliersRequest() {
        SerenityRest.when().get(AdoptionAPI.GET_LIST_APPLIERS);
    }

    @When("Send get adoptions request")
    public void sendGetAdoptionsRequest() {
        SerenityRest.when().get(AdoptionAPI.GET_LIST_ADOPTIONS);
    }

    @Then("API response code should be {int} OK")
    public void apiResponseCodeShouldBeOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }

    @Then("API response code should be {int} Bad Request")
    public void apiResponseCodeShouldBeBadRequest(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }

    @Then("API response code should be {int} Not Found")
    public void apiResponseCodeShouldBeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }

    @And("Validate post applier json schema")
    public void apiShouldReturnBodyDataContain() {
        File json = new File(AdoptionAPI.JSON_SCHEMA+"/PostApplierJsonSchema.json");
        SerenityRest.then()
                    .assertThat()
                    .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Validate get applier json schema")
    public void validateGetApplierJsonSchema() {
        File json = new File(AdoptionAPI.JSON_SCHEMA+"/GetApplierJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Validate get adoption json schema")
    public void validateGetAdoptionJsonSchema() {
        File json = new File(AdoptionAPI.JSON_SCHEMA+"/GetAdoptionJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get single applier with valid adoption_id {int}")
    public void getSingleApplierWithValidAdoption_id(int adoptionid) {
        adoptionAPI.getSingleApplier(adoptionid);
    }

    @When("Send get single applier request")
    public void sendGetSingleApplierRequest() {
        SerenityRest.when().get(AdoptionAPI.GET_SINGLE_APPLIER);
    }

    @And("Validate get single applier json schema")
    public void validateGetSingleApplierJsonSchema() {
        File json = new File(AdoptionAPI.JSON_SCHEMA+"/GetSingleApplierJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Response body should contain adoption_id {int}")
    public void responseBodyShouldContainAdoption_id(int adoptionid) {
        SerenityRest.then()
                .body(AdoptionResponse.ADOPTION_ID,equalTo(adoptionid));
    }

    @Given("Get single with invalid id {string}")
    public void getSingleWithInvalidId(String adoptionid) {
        adoptionAPI.getSingleApplierWithInvalidAdoptionid(adoptionid);
    }

    @Given("Put update adoption with valid body json and valid id {int}")
    public void putUpdateAdoptionWithValidBodyJsonAndValidId(int adoptionid) {
        File json = new File(AdoptionAPI.JSON_REG_BODY+"/PutUpdateAdoptionValidJson.json");
        adoptionAPI.putUpdateAdoption(json,adoptionid);
    }

    @When("Send put update request")
    public void sendPutUpdateRequest() {
        SerenityRest.when().put(AdoptionAPI.PUT_UPDATE_ADOPTION);
    }

    @And("Validate put update json schema")
    public void validatePutUpdateJsonSchema() {
        File json = new File(AdoptionAPI.JSON_SCHEMA+"/PutUpdateAdoptionJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Response body should contain messages {string}")
    public void responseBodyShouldContainMessages(String messages) {
        SerenityRest.then()
                .body(AdoptionResponse.MESSAGE,equalTo(messages));
    }

    @Given("Put update adoption with valid body json and invalid id {string}")
    public void putUpdateAdoptionWithValidBodyJsonAndInvalidId(String adoptionid) {
        File json = new File(AdoptionAPI.JSON_REG_BODY+"/PutUpdateAdoptionValidJson.json");
        adoptionAPI.putUpdateAdoptionWithInvalidPetid(json,adoptionid);
    }

    @Given("Put update adoption with invalid body json and valid id {int}")
    public void putUpdateAdoptionWithInvalidBodyJsonAndValidId(int adoptionid) {
        File json = new File(AdoptionAPI.JSON_REG_BODY+"/PutUpdateAdoptionInvalidJson.json");
        adoptionAPI.putUpdateAdoption(json,adoptionid);
    }

    @Given("Delete pet data with valid pet_id {int}")
    public void deletePetDataWithValidPet_id(int petid) {
        adoptionAPI.deletePetData(petid);
    }

    @When("Send delete pet data request")
    public void sendDeletePetDataRequest() {
        SerenityRest.when().delete(AdoptionAPI.DELETE_PET_DATA);
    }

    @Given("Delete pet data with invalid pet_id {string}")
    public void deletePetDataWithInvalidPet_idPet_id(String petid) {
        adoptionAPI.deletePetDataInvalidPetid(petid);
    }
}
