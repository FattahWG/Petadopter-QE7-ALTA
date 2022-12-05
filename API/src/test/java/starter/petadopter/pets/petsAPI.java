package starter.petadopter.pets;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.units.qual.C;

import java.io.File;
public class petsAPI {
    public static final String URL = "https://beruanghoki.site";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REG_BODY = DIR + "/src/test/resources/JSON/Requestbody/pets";
    public static final String JSON_SCHEMA = DIR+"/src/test/resources/JSON/JsonSchema/pets";
    public static final String PHOTO = DIR + "/src/test/resources/Photo/pets";
    public static final String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJRCI6MiwiUm9sZSI6ImFkbWluIn0.4aB0MzVLHkiNz5-wGk1fBK1koI3_2ZD05RXYN9pixVI";
    public static final String TOKEN_PUT = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJRCI6MTAsIlJvbGUiOiJ1c2VyIn0.cgvLaPv1JI57YzJf0Le_T8Y4aH9e6PjupaZygTBW2zA";


    public static String GET_ALL_PETS = URL + "/pets";
    public static String GET_PETS_DATA_BY_ID = URL + "/pets/{id}";
    public static String GET_ALL_USER_PETS_DATA = URL + "/mypets";
    public static String POST_PETS = URL + "/pets";
    public static String POST_PET = URL + "/pets";
    public static String PUT_UPDATE_PETS = URL + "/pets/{id}";
    public static String DELETE_PETS = URL + "/pets/{id}";



    @Step("Get All Pets")
    public void setGetAllPets(){
        SerenityRest.given();
    }

    @Step("Get Pets Data By ID")
    public void setGetPetsDataById(int id){
        SerenityRest.given().pathParam("id", id)
                .header("Authorization", TOKEN_PUT);
    }

    @Step("Get All User Pets Data")
    public void setGetAllUserPetsData(){
        SerenityRest.given()
                .header("Authorization", TOKEN);
    }

    @Step("Post Pets")
    public void setPostPets(){
        SerenityRest.given()
                .multiPart("petname", "Rhionci")
                .multiPart("petphoto", new File(PHOTO + "/lion.jpg"))
                .multiPart("speciesid", "10")
                .multiPart("gender", "1")
                .multiPart("age", "10")
                .multiPart("color", "brown")
                .multiPart("description", "ambitious")
                .header("Authorization", TOKEN);
    }

    @Step("Post Pet")
    public void setPostPet(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .header("Authorization", TOKEN);

    }

    @Step("Put Update Pets")
    public void setPutUpdatePets(int id){
        SerenityRest.given()
                .pathParam("id", id)
                .multiPart("petname", "fiona")
                .multiPart("petphoto", new File(PHOTO + "/red-ant.jpg"))
                .multiPart("speciesid", "9")
                .multiPart("gender", "1")
                .multiPart("age", "9")
                .multiPart("color", "red")
                .multiPart("description", "already mature")
                .header("Authorization", TOKEN_PUT);
    }

    @Step("Delete Pets Data")
    public void setDeletePets(int id){
        SerenityRest.given().pathParam("id", id)
                .header("Authorization", TOKEN);
    }
}
