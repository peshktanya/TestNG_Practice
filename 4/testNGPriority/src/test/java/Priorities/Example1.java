package Priorities;

import org.testng.Assert;
import org.testng.annotations.*;

public class Example1 {


    @Test(priority =2)
    public void Test1(){
        System.out.println("   Test1 is running...");
        Assert.assertTrue(true);
    }

    @Test(priority =3)
    public void Test2(){
        System.out.println("   Test2 is running...");
        Assert.assertTrue(true);
    }

    @Test(priority =1)
    public void Test3(){
        System.out.println("   Test3 is running...");
        Assert.assertTrue(true);
    }
}
