package org.example.TestNG_Examples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG003 {

    String token;
    Integer bookingID;
    public String getToken() {
        token = "123";
        return token;
    }
    @BeforeTest
    public void getTokenAndBookingID(){
        //put request -
        token = getToken();
        //POST request and get the Booking ID
        bookingID = 123;
    }

    @Test
    public void testPUTReq(){
        System.out.println(token);
        System.out.println(bookingID);
    }

    @Test
    public void testPUTReq2() {
        System.out.println(token);
        System.out.println(bookingID);
    }

    @Test
    public void testPUTReq3() {
        System.out.println(token);
        System.out.println(bookingID);
    }
}
