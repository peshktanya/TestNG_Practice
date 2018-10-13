package Dependency;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Example2 {


    @Test
    public void Test1(){
        System.out.println("    Test1 Example2 is running...");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"Test3"})
    public void Test2(){
        System.out.println("    Test2 Example2 is running...");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"Test1"})
    public void Test3(){
        System.out.println("    Test3 Example2 is running...");
        Assert.assertTrue(true);
    }
}
