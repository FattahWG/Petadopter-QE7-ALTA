package starter.petadopter.meeting;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class MeetingAPI {
    public static final String URL = "https://beruanghoki.site";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REG_BODY = DIR + "/src/test/resources/JSON/Requestbody/meeting";
    public static final String JSON_SCHEMA = DIR+"/src/test/resources/JSON/JsonSchema/meeting";
    public static final String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJRCI6MTAsIlJvbGUiOiJ1c2VyIn0.cgvLaPv1JI57YzJf0Le_T8Y4aH9e6PjupaZygTBW2zA";
    public static final String POST_CREATE_MEETING = URL+"/meetings";
    public static final String GET_MEETINGS = URL+"/meetings?page={page}";
    public static final String GET_MYMEETINGS = URL+"/mymeetings?page={page}";
    public static final String GET_SINGLE_MEETING = URL+"/meetings/{meetingid}";
    public static final String PUT_UPDATE_MEETING = URL+"/meetings/{meetingid}";
    public static final String DELETE_MEETING = URL+"/meetings/{meetingid}";

    @Step("Post create meeting")
    public void postCreateMeeting(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .headers("Authorization",TOKEN);
    }
    @Step("Get meeting with valid page")
    public void getMeetingWithValidPage(int page){
        SerenityRest.given()
                .pathParam("page",page)
                .headers("Authorization",TOKEN);
    }
    @Step("Get meeting with invalid page")
    public void getMeetingWithInvalidPage(String page){
        SerenityRest.given()
                .pathParam("page",page)
                .headers("Authorization",TOKEN);
    }
    @Step("Get mymeeting with valid page")
    public void getMymeetingWithValidPage(int page){
        SerenityRest.given()
                .pathParam("page",page)
                .headers("Authorization",TOKEN);
    }
    @Step("Get mymeeting with Invalid page")
    public void getMymeetingWithInvalidPage(String page){
        SerenityRest.given()
                .pathParam("page",page)
                .headers("Authorization",TOKEN);
    }
    @Step("Get meeting with valid id")
    public void getMeetingWithValidId(int meetingid){
        SerenityRest.given()
                .pathParam("meetingid",meetingid)
                .headers("Authorization",TOKEN);
    }
    @Step("Get meeting with Invalid id")
    public void getMeetingWithInvalidId(String meetingid){
        SerenityRest.given()
                .pathParam("meetingid",meetingid)
                .headers("Authorization",TOKEN);
    }
    @Step("Put update meeting with valid id")
    public void putUpdateMeetingWithValidId(File json,int meetingid){
        SerenityRest.given()
                .pathParam("meetingid",meetingid)
                .contentType(ContentType.JSON)
                .body(json)
                .headers("Authorization",TOKEN);
    }
    @Step("Put update meeting with Invalid id")
    public void putUpdateMeetingWithInvalidId(File json,String meetingid){
        SerenityRest.given()
                .pathParam("meetingid",meetingid)
                .contentType(ContentType.JSON)
                .body(json)
                .headers("Authorization",TOKEN);
    }
    @Step("Delete meeting with valid id")
    public void deleteMeetingWithValidId(int meetingid){
        SerenityRest.given()
                .pathParam("meetingid",meetingid)
                .headers("Authorization",TOKEN);
    }
    @Step("Delete meeting with Invalid id")
    public void deleteMeetingWithInvalidId(String meetingid){
        SerenityRest.given()
                .pathParam("meetingid",meetingid)
                .headers("Authorization",TOKEN);
    }
}