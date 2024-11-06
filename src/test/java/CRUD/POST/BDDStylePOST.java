package CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BDDStylePOST {

    @Test
    public void testBDDStylePOSTPositive(){
        //POST request
        //URL
        //Body - Payload -JSON
        //HEADERS - Content-type
        //

        //payload as a string method here
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";


        //another 2 methods are Hashmap, Class - in Automation - Class will be using 60-70%.

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth").contentType(ContentType.JSON).log().all()

                .body(payload).when().post()

                .then().log().all().statusCode(200);
    }
}
