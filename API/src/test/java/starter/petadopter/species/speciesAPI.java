package starter.petadopter.species;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.units.qual.C;

import java.io.File;
public class speciesAPI {
    public static final String URL = "https://beruanghoki.site";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REG_BODY = DIR + "/src/test/resources/JSON/Requestbody/species";
    public static final String JSON_SCHEMA = DIR+"/src/test/resources/JSON/JsonSchema/species";
    public static final String TOKEN_POST = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJRCI6MiwiUm9sZSI6ImFkbWluIn0.4aB0MzVLHkiNz5-wGk1fBK1koI3_2ZD05RXYN9pixVI";
    public static final String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJRCI6MTAsIlJvbGUiOiJ1c2VyIn0.cgvLaPv1JI57YzJf0Le_T8Y4aH9e6PjupaZygTBW2zA";

    public static final String POST_SPECIES = URL + "/species";
    public static final String POST_SPECIES_MULTIPART = URL + "/species";
    public static final String GET_SPECIES = URL + "/species";
    public static final String GET_SPECIES_PARAMETER_ID = URL + "/species?id={id}";
    public static final String PUT_SPECIES_MULTIPART = URL + "/species/{id}";
    public static final String PUT_SPECIES = URL + "/species/{id}";
    public static final String DELETE_SPECIES = URL + "/species/{id}";

    @Step("Post Species")
    public void setPostSpecies(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .header("Authorization", TOKEN_POST);
    }

    @Step("Post Species Multipart")
    public void setPostSpeciesMultipart(){
        SerenityRest.given()
                .multiPart("species", "Ant")
                .header("Authorization", TOKEN_POST);
    }

    @Step("Get Species")
    public void setGetSpecies(){
        SerenityRest.given()
                .header("Authorization", TOKEN);
    }

    @Step("Get Species Parameter ID")
    public void setGetSpeciesParameterId(int id){
        SerenityRest.given()
                .pathParam("id", id)
                .header("Authorization", TOKEN);
    }

    @Step("Put Species Multipart")
    public void setPutSpeciesMultipart(int id){
        SerenityRest.given()
                .pathParam("id", id)
                .multiPart("species", "Ant")
                .header("Authorization", TOKEN_POST);
    }

    @Step("Put Update Species")
    public void setPutSpecies(int id, File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .pathParam("id", id)
                .header("Authorization", TOKEN_POST);
    }

    @Step("Delete Species")
    public void setDeleteSpecies(int id){
        SerenityRest.given()
                .pathParam("id", id)
                .header("Authorization", TOKEN_POST);
    }


}
