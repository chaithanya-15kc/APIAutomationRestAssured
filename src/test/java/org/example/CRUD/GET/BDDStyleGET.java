package org.example.CRUD.GET;

import io.restassured.RestAssured;

public class BDDStyleGET {
    public static void main(String[] args) {
        //get Request -https://api.zippopotam.us/IN/560072
        //URL
        //Headers ? no
        //Get Method
        //base url - https://api.zippopotam.us
        //base Path - IN/560072
        //Payload ? no
        //Auth - Basic, Digest, JWT, Beareer token, OAuth etc.

        //Validate
        //status code
        //Response body
        //headers,cookies

        //403

        //RestAssured.given().when().then();
        //pm.test - DSL Language

        //given ->pre condition
            //URL
            //Headers ? no
            //base url - https://api.zippopotam.us
            //base Path - IN/560072
            //Auth - Basic, Digest, JWT, Beareer token, OAuth etc.

        //when - >making the request / condition
        //body/Payload ? no/yes
        //GET Method

        //then -> after the request / post request
        //Response
        //validation
        //status code
        //Response body
        //timer, headers, cookies

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us").basePath("IN/560072")

                .when().log().all()
                .get()

                .then().log().all().statusCode(200);



    }
}
