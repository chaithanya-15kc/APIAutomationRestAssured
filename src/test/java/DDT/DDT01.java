package DDT;

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

    //for csv
    //username, password, ER, AR, name, age, phone, CSV
    //for JSON file it will different - we need to convert GSON, Jackson  you can
    //end concept for csv

    @Test(dataProvider = "getData", dataProviderClass = utilExcel.class)
    public void testLogin(String username, String password){//, String ER, String AR, String name,
        System.out.println("Username - " + username);
        System.out.println("password - " + password);


       // System.out.println("ER - " + ER);
    }

    //login to app API
    //write the code for the login POST request
}
