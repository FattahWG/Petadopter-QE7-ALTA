package starter.petadopter.species;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lv.Ja;
import io.cucumber.java.lv.Un;
import io.cucumber.java.zh_cn.假定;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.text.similarity.JaccardSimilarity;
import starter.petadopter.pets.PetsSteps;

import java.io.File;

public class SpeciesSteps {
    @Steps
    speciesAPI SpeciesAPI;

    @Given("Post create species data with valid json")
    public void postCreateSpeciesDataWithValidJson() {
        File json = new File(speciesAPI.JSON_REG_BODY + "/PostBodySpecies.json");
        SpeciesAPI.setPostSpecies(json);
    }

    @When("Send post create species request")
    public void sendPostCreateSpeciesRequest() {
        SerenityRest.when().post(speciesAPI.POST_SPECIES);
    }

    @Then("Status code should return {int} OK")
    public void statusCodeShouldReturnOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }

    @And("Validate post species json schema")
    public void validatePostSpeciesJsonSchema() {
        File json = new File(speciesAPI.JSON_SCHEMA + "/PostSpeciesJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    @Given("Post create species data with multipart")
    public void postCreateSpeciesDataWithMultipart() {
        SpeciesAPI.setPostSpeciesMultipart();
    }

    @When("Send post create species data multipart request")
    public void sendPostCreateSpeciesDataMultipartRequest() {
        SerenityRest.when().post(speciesAPI.POST_SPECIES_MULTIPART);
    }

    @Given("Get species data with valid path")
    public void getSpeciesDataWithValidPath() {
        SpeciesAPI.setGetSpecies();
    }

    @When("Send get species request")
    public void sendGetSpeciesRequest() {
        SerenityRest.when().get(speciesAPI.GET_SPECIES);
    }
    @And("Validate get species json schema")
    public void validateGetSpeciesJsonSchema() {
        File json = new File(speciesAPI.JSON_SCHEMA + "/GetSpeciesValidPathJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get species data with parameter id {int}")
    public void getSpeciesDataWithParameterIdId(int id) {
        SpeciesAPI.setGetSpeciesParameterId(id);
    }

    @When("Send get species with parameter id request")
    public void sendGetSpeciesWithParameterIdRequest() {
        SerenityRest.when().get(speciesAPI.GET_SPECIES_PARAMETER_ID);
    }
    @And("Validate get species parameter id json schema")
    public void validateGetSpeciesParameterIdJsonSchema() {
        File json = new File(speciesAPI.JSON_SCHEMA + "/GetSpeciesParameterIdJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    @Given("Put Update species data with multipart by id {int}")
    public void putUpdateSpeciesDataWithMultipartByIdId(int id) {
        SpeciesAPI.setPutSpeciesMultipart(id);
    }

    @When("Send put update species multipart request")
    public void sendPutUpdateSpeciesMultipartRequest() {
        SerenityRest.when().put(speciesAPI.PUT_SPECIES_MULTIPART);
    }

    @Given("Put update species data with valid json by id {int}")
    public void putUpdateSpeciesDataWithValidJsonByIdId(int id) {
        File json = new File(speciesAPI.JSON_REG_BODY + "/UpdateBodySpecies.json");
        SpeciesAPI.setPutSpecies(id, json);
    }

    @When("Send put update species request")
    public void sendPutUpdateSpeciesRequest() {
        SerenityRest.when().put(speciesAPI.PUT_SPECIES);
    }
    @And("Validate update species valid id json schema")
    public void validateUpdateSpeciesValidIdJsonSchema() {
        File json = new File(speciesAPI.JSON_SCHEMA + "/UpdateSpeciesValidIdJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Put update species data with valid json by invalid id {int}")
    public void putUpdateSpeciesDataWithValidJsonByInvalidIdId(int id) {
        File json = new File(speciesAPI.JSON_REG_BODY + "/UpdateBodySpecies.json");
        SpeciesAPI.setPutSpecies(id, json);
    }

    @Then("Status code should return {int} Internal Server Error")
    public void statusCodeShouldReturnInternalServerError(int internalServerError) {
        SerenityRest.then().statusCode(internalServerError);
    }

    @And("Validate update species invalid id json schema")
    public void validateUpdateSpeciesInvalidIdJsonSchema() {
        File json = new File(speciesAPI.JSON_SCHEMA + "/UpdateSpeciesInvalidIdJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Delete species data with valid id {int}")
    public void deleteSpeciesDataWithValidIdId(int id) {
        SpeciesAPI.setDeleteSpecies(id);
    }

    @When("Send delete species request")
    public void sendDeleteSpeciesRequest() {
        SerenityRest.when().delete(speciesAPI.DELETE_SPECIES);
    }
    @And("Delete species json schema")
    public void deleteSpeciesJsonSchema() {
        File json = new File(speciesAPI.JSON_SCHEMA + "/DeleteSpeciesValidIdJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Delete species data with invalid id {int}")
    public void deleteSpeciesDataWithInvalidIdId(int id) {
        SpeciesAPI.setDeleteSpecies(id);
    }

    @Then("Status code should return {int} HTML")
    public void statusCodeShouldReturnHTML(int html) {
        SerenityRest.then().statusCode(html);
    }
}
