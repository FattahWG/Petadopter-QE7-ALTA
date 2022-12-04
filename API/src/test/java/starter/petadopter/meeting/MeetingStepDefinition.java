package starter.petadopter.meeting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import static org.hamcrest.Matchers.equalTo;
import java.io.File;

public class MeetingStepDefinition {
    @Steps
    MeetingAPI meetingAPI;

    @Given("Post create meeting with valid body json")
    public void postCreateMeetingWithValidBodyJson(){
        File json = new File(MeetingAPI.JSON_REG_BODY+"/PostMeetingValidJson.json");
        meetingAPI.postCreateMeeting(json);
    }

    @When("Send post meeting request")
    public void sendPostMeetingRequest() {
        SerenityRest.when().post(MeetingAPI.POST_CREATE_MEETING);
    }

    @And("Validate post meeting json schema")
    public void validatePostMeetingJsonSchema() {
        File json = new File(MeetingAPI.JSON_SCHEMA+"/PostMeetingJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Post create meeting with invalid token")
    public void postCreateMeetingWithInvalidToken() {
        File json = new File(MeetingAPI.JSON_REG_BODY+"/PostMeetingInvalidToken.json");
        meetingAPI.postCreateMeeting(json);
    }

    @Given("Post create meeting with invalid adoption_id")
    public void postCreateMeetingWithInvalidAdoption_id() {
        File json = new File(MeetingAPI.JSON_REG_BODY+"/PostMeetingInvalidAdoptionId.json");
        meetingAPI.postCreateMeeting(json);
    }

    @Given("Post create meeting with invalid time")
    public void postCreateMeetingWithInvalidTime() {
        File json = new File(MeetingAPI.JSON_REG_BODY+"/PostMeetingInvalidTime.json");
        meetingAPI.postCreateMeeting(json);
    }

    @Given("Post create meeting with invalid date")
    public void postCreateMeetingWithInvalidDate() {
        File json = new File(MeetingAPI.JSON_REG_BODY+"/PostMeetingInvalidDate.json");
        meetingAPI.postCreateMeeting(json);
    }

    @Given("Get owner meetings with valid page {int}")
    public void getOwnerMeetingsWithValidPage(int page) {
        meetingAPI.getMeetingWithValidPage(page);
    }

    @When("Send get meeting request")
    public void sendGetMeetingRequest() {
        SerenityRest.when().get(MeetingAPI.GET_MEETINGS);
    }

    @And("Validate get owner meetings json schema")
    public void validateGetOwnerMeetingsJsonSchema() {
        File json = new File(MeetingAPI.JSON_SCHEMA+"/GetOwnerMeetingJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get owner meetings with invalid page {string}")
    public void getOwnerMeetingsWithInvalidPage(String page) {
        meetingAPI.getMeetingWithInvalidPage(page);
    }

    @Given("Get seeker meetings with valid page {int}")
    public void getSeekerMeetingsWithValidPagePage(int page) {
        meetingAPI.getMymeetingWithValidPage(page);
    }

    @When("Send get seeker meeting request")
    public void sendGetSeekerMeetingRequest() {
        SerenityRest.when().get(MeetingAPI.GET_MYMEETINGS);
    }

    @And("Validate get seeker meeting json schema")
    public void validateGetSeekerMeetingJsonSchema() {
        File json = new File(MeetingAPI.JSON_SCHEMA+"/GetSeekerMeetingJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get seeker meetings with invalid page {string}")
    public void getSeekerMeetingsWithInvalidPage(String page) {
        meetingAPI.getMymeetingWithInvalidPage(page);
    }

    @Given("Get single meetings with valid id {int}")
    public void getSingleMeetingsWithValidIdMeeting_id(int meetingid) {
        meetingAPI.getMeetingWithValidId(meetingid);
    }

    @When("Send get single meeting request")
    public void sendGetSingleMeetingRequest() {
        SerenityRest.when().get(MeetingAPI.GET_SINGLE_MEETING);
    }

    @And("Validate get single meeting json schema")
    public void validateGetSingleMeetingJsonSchema() {
        File json = new File(MeetingAPI.JSON_SCHEMA+"/GetSingleMeetingJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Response body should contain meeting_id {int}")
    public void responseBodyShouldContainMeeting_idMeeting_id(int meetingid) {
        SerenityRest.then()
                .body(MeetingResponse.MEETING_ID,equalTo(meetingid));
    }

    @Given("Get single meetings with invalid id {string}")
    public void getSingleMeetingsWithInvalidId(String meetingid) {
        meetingAPI.getMeetingWithInvalidId(meetingid);
    }

    @Given("Put update meeting with valid body json and valid id {int}")
    public void putUpdateMeetingWithValidBodyJsonAndValidId(int meetingid) {
        File json = new File(MeetingAPI.JSON_REG_BODY+"/PutUpdateMeetingValidJson.json");
        meetingAPI.putUpdateMeetingWithValidId(json,meetingid);
    }

    @When("Send put update meeting request")
    public void sendPutUpdateMeetingRequest() {
        SerenityRest.when().put(MeetingAPI.PUT_UPDATE_MEETING);
    }

    @And("Validate update meeting json schema")
    public void validateUpdateMeetingJsonSchema() {
        File json = new File(MeetingAPI.JSON_SCHEMA+"/PutUpdateMeetingJsonSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Put update meeting with valid body json and invalid id {string}")
    public void putUpdateMeetingWithValidBodyJsonAndInvalidId(String meetingid) {
        File json = new File(MeetingAPI.JSON_REG_BODY+"/PutUpdateMeetingValidJson.json");
        meetingAPI.putUpdateMeetingWithInvalidId(json,meetingid);
    }

    @Given("Put update meeting with invalid time on body json and valid id {int}")
    public void putUpdateMeetingWithInvalidTimeOnBodyJson(int meetingid) {
        File json = new File(MeetingAPI.JSON_REG_BODY+"/PutUpdateMeetingInvalidTime.json");
        meetingAPI.putUpdateMeetingWithValidId(json,meetingid);
    }

    @Given("Put update meeting with invalid date on body json and valid id {int}")
    public void putUpdateMeetingWithInvalidDateOnBodyJsonAndValidId(int meetingid) {
        File json = new File(MeetingAPI.JSON_REG_BODY+"/PutUpdateMeetingInvalidDate.json");
        meetingAPI.putUpdateMeetingWithValidId(json,meetingid);
    }

    @Given("Delete meeting with valid id {int}")
    public void deleteMeetingWithValidId(int meetingid) {
        meetingAPI.deleteMeetingWithValidId(meetingid);
    }

    @When("Send delete meeting request")
    public void sendDeleteMeetingRequest() {
        SerenityRest.when().delete(MeetingAPI.DELETE_MEETING);
    }

    @Given("Delete meeting with valid id {string}")
    public void deleteMeetingWithValidId(String meetingid) {
        meetingAPI.deleteMeetingWithInvalidId(meetingid);
    }
}
