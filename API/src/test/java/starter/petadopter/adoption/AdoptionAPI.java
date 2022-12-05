package starter.petadopter.adoption;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class AdoptionAPI {
    public static final String URL = "https://beruanghoki.site";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REG_BODY = DIR + "/src/test/resources/JSON/Requestbody/adoption";
    public static final String JSON_SCHEMA = DIR+"/src/test/resources/JSON/JsonSchema/adoption";
    public static final String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJRCI6MTAsIlJvbGUiOiJ1c2VyIn0.cgvLaPv1JI57YzJf0Le_T8Y4aH9e6PjupaZygTBW2zA";
    public static String POST_CREATE_APPLIERS = URL+"/appliers";
    public static String GET_LIST_APPLIERS = URL+"/appliers?page={page}";
    public static String GET_LIST_ADOPTIONS = URL+"/adoptions?page={page}";
    public static String GET_SINGLE_APPLIER = URL+"/adoptions/{adoptionid}";
    public static String PUT_UPDATE_ADOPTION = URL+"/appliers/{petid}";
    public static String DELETE_PET_DATA = URL+"/appliers/{petid}";

    @Step("Post create appliers")
    public void postCreateAppliers(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json).headers("Authorization",TOKEN);
    }
    @Step("Get list appliers")
    public void getListAppliers(int page){
        SerenityRest.given()
                .pathParam("page",page)
                .headers("Authorization",TOKEN);
    }
    @Step("Get list appliers with invalid page")
    public void getListAppliersWithInvalidPage(String page){
        SerenityRest.given()
                .pathParam("page",page)
                .headers("Authorization",TOKEN);
    }
    @Step("Get list adoptions")
    public void getListAdoptions(int page){
        SerenityRest.given()
                .pathParam("page",page).headers("Authorization",TOKEN);
    }
    @Step("Get list adoptions with invalid page")
    public void getListAdoptionsWithInvalidPage(String page){
        SerenityRest.given()
                .pathParam("page",page)
                .headers("Authorization",TOKEN);
    }
    @Step("Get single applier")
    public void getSingleApplier(int adoptionid){
        SerenityRest.given()
                .pathParam("adoptionid",adoptionid)
                .headers("Authorization",TOKEN);
    }
    @Step("Get single applier with invalid adoptionid")
    public void getSingleApplierWithInvalidAdoptionid(String adoptionid){
        SerenityRest.given()
                .pathParam("adoptionid",adoptionid)
                .headers("Authorization",TOKEN);
    }
    @Step("Put update adoption")
    public void putUpdateAdoption(File json,int petid){
        SerenityRest.given()
                .pathParam("petid",petid)
                .contentType(ContentType.JSON)
                .body(json)
                .headers("Authorization",TOKEN);
    }
    @Step("Put update adoption with invalid petid")
    public void putUpdateAdoptionWithInvalidPetid(File json,String petid){
        SerenityRest.given()
                .pathParam("petid",petid)
                .contentType(ContentType.JSON)
                .body(json)
                .headers("Authorization",TOKEN);
    }
    @Step("Delete pet data")
    public void deletePetData(int petid){
        SerenityRest.given()
                .pathParam("petid",petid)
                .headers("Authorization",TOKEN);
    }
    @Step("Delete pet data invalid petid")
    public void deletePetDataInvalidPetid(String petid){
        SerenityRest.given()
                .pathParam("petid",petid)
                .headers("Authorization",TOKEN);}
}
