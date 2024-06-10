package org.example.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyleGET {
    //GET Request is done in 2 styles
    //BDD style and Non BDD style

    //given, when, then - builder pattern - BDD style

    //non BDD style
    public static void main(String[] args) {

        //URL - https://restful-booker.herokuapp.com/booking/2

        RequestSpecification r = RestAssured.given();

        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/2428").log().all();
        r.when().get();
        r.then().log().all().statusCode(200);

        //Testing Framework - Allow us to execute the testcases
        // 1 main function - will execute all the TC's that we have mentioned.
    }
}
