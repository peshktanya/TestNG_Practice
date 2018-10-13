package Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example1 {


    @Test(priority =2, dependsOnMethods = {"Test3", "Test1"})
    public void Test1(){
        System.out.println("   Test1 Example1 is running...");
        Assert.assertTrue(true);
    }

    @Test(priority =1, dependsOnMethods = {"Test3"})
    public void Test2(){
        System.out.println("   Test2 Example1 is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void Test3(){
        System.out.println("   Test3 Example1 is running...");
        Assert.assertTrue(true);
    }
}
