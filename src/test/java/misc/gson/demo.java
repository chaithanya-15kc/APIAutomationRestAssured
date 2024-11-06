package misc.gson;

public class demo {

    // Payload
    // String -> Not recommended
    // Hashmap -> Not recommended
    // Class - Which class?

    // POJO Class
    // ?
    // 1 - diffcult
    // 2. easy!

    //{
    //            "firstname" : "Jim",
    //                "lastname" : "Brown",
    //                "totalprice" : 111,
    //                "depositpaid" : true,
    //                "bookingdates" : {
    //            "checkin" : "2018-01-01",
    //                    "checkout" : "2019-01-01"
    //        },
    //            "additionalneeds" : "Breakfast"
    //        }


    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private Bookingdates bookingdates;
    private Boolean additionalneeds;



    //        requestSpecification = RestAssured.given();
//        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
//        requestSpecification.basePath("booking");
//        requestSpecification.contentType(ContentType.JSON);
//        requestSpecification.body(payload).log().all();
//
//        Response response = requestSpecification.when().post();
//
//        Integer bookingId = response.then().extract().path("bookingid");
//
//        // Get Validatable response to perform validation
//        validatableResponse = response.then().log().all();
//        validatableResponse.statusCode(200);
//        System.out.println("Your Booking Id is -> " + bookingId);



}
