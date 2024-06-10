package org.example.ddt;

import org.testng.annotations.Test;

public class DDT01 {
    // Test Data - from the Excel File - Data Provider
    // Read the Excel File
    // Apache POI, - 60-70% - little difficult to understand first time.
    // Fillo Library - 30% - Super Easy!


    // Test case  login where we will inject the username and password

    //Excel - There is no support directly in Java to Read Excel file
    //we need to use "Apache- POI library"
    //Excel-2007 - format is xls, after2007 - xlsx, CSV- comma Separated Values.

    @Test(dataProvider = "getData", dataProviderClass = utilExcel.class)
    public void testLogin(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }

    //login to app API
    //write the code for the login POST request
}
