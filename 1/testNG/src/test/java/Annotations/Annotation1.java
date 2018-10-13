package Annotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class Annotation1 {

    @BeforeTest
    public void BeforeTest(){    System.out.println("Before Test");}
    @BeforeClass
    public void BeforeClass(){    System.out.println("Before Class");}
    @BeforeMethod
    public void BeforeMethod(){    System.out.println(" Before Method");}

    @AfterTest
    public void AfterTest(){    System.out.println("After Test");}
    @AfterClass
    public void AfterClass(){    System.out.println("After Class");}
    @AfterMethod
    public void AfterMethod(){    System.out.println("  After Method");}

    @Test
    public void Test1(){
        System.out.println("        Test1 is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void Test2(){
        System.out.println("        Test2 is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void Test3(){
        System.out.println("    Test3 is running...");
        Assert.assertTrue(true);
    }
}
