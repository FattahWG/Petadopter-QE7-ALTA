package starter.petadopter.user;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import java.io.File;

public class userAPI {
    public static final String URL = "https://beruanghoki.site";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REG_BODY = DIR + "/src/test/resources/JSON/Requestbody/user";
    public static final String JSON_SCHEMA = DIR+"/src/test/resources/JSON/JsonSchema/user";
    public static final String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJRCI6OSwiUm9sZSI6InVzZXIifQ.ohF1lbvFRzr-DGHp5Q8U70GvgFJvcbZqexJMalPi7mU";
    public static String UserAPI = URL + "/users";
    public static String Photos = DIR + "/Photo";


    @Step("Post regist new user with valid json")
    public void setPostRegistNewUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Post regist user without username parameter")
    public void setPostRegist(){
    //Blank
    }
    @Step("Post regist user without fullname parameter")
    public void setPostRegistInvalid(){
    //Blank
    }

    @Step("Put update photo profile user")
    public void setPutUpdate(String photoPath){
        SerenityRest.given().multiPart("file", new File(photoPath))
                .headers("Authorization",TOKEN);
    }

}
