package Priorities;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class Example2 {


    @Test
    public void Test1(){
        System.out.println("    Test1 Example2 is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void Test2(){
        System.out.println("    Test2 is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void Test3(){
        System.out.println("    Test3 is running...");
        Assert.assertTrue(true);
    }
}
