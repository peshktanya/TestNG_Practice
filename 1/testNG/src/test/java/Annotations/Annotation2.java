package Annotations;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("TestNG started...");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("TestNG finished...");
    }

    @Test
    public void Test1(){
        System.out.println("    Test1 in Annotation2 is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void Test2(){
        System.out.println("    Test2 in Annotation2 is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void Test3(){
        System.out.println("    Test3 in Annotation2 is running...");
        Assert.assertTrue(true);
    }
}
