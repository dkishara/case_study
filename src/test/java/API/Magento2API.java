package API;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
public class Magento2API {

    @Test
    public void outh(){

            String oauth_token = given().auth().basic("username", "password")
                     .queryParams("client_id", "client_id_value")
                    .queryParams("client_secret", "client_secret_value")
                    .queryParams("grant_type", "authorization_code")
                    .queryParams("redirect_uri", "https://someuritoredirect")
                    .queryParams("otherparams", "sampleparam")
                    .when().get("https://m2.leanscale.com/oauth2/access_token")
                    .then()
                    .statusCode(200)
                    .extract().header("access_token");

    }



    @Test(priority=1)
    public void test1() {
        baseURI = "https://m2.leanscale.com/";
        given().
                header("Authorization", "Bearer "+"6bl9knzqjdrh9c2rxwwqfx3zbgmlvjf7").
                get("/rest/V1/categories/").
                then().
                //statusCode(200).
                log().all();
    }

}
