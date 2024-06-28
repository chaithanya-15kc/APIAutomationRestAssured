package TestNG;

import org.testng.annotations.*;

public class TestNG001 {

    @BeforeSuite
    void demo01(){
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    void demo1(){
        System.out.println("BeforeTest");
    }
    @BeforeClass
    void demo2(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    void demo3(){
        // Why -> To read the Excel file /or/ a JSON file /or/ a Text file / CSV files/ read databases
        //configurations, load, extra
        System.out.println("BeforeMethod");
    }
    @Test
    void demo4(){
        //This is the Real testcases
        System.out.println("Testcase1");
    }
    @Test
    void demo5(){
        //This is the Real testcases
        System.out.println("Testcase2");
    }

    @AfterMethod
    void demo6(){
        //we can close the files  - here write the code.
        System.out.println("AfterMethod");
    }

    @AfterClass
    void demo7(){
        System.out.println("AfterClass");
    }

    @AfterTest
    void demo8(){
        System.out.println("AfterTest");
    }

    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
    }
}
