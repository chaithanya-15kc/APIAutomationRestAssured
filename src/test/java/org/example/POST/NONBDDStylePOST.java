package org.example.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NONBDDStylePOST {

    @Test
    public void testNonBDDStylePOSTPositive(){

        RequestSpecification r = RestAssured.given();

        //payload as a string method here
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth").log().all();
        r.contentType(ContentType.JSON);
        r.when().get();
        r.then().log().all().statusCode(404);

    }
}
