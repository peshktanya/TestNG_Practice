package Reports;

import org.testng.Assert;
import org.testng.annotations.*;

public class ReportExampleTest {

    @Test
    public void LogInTest(){
        System.out.println("LogIn test is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void LogOutTest(){
        System.out.println("LogOut test is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void RegisterTest(){
        System.out.println("RegisterTest is running...");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "RegisterTest")
    public void AddToCartTest(){
        System.out.println("AddToCart Test is running...");
        Assert.assertTrue(true);
    }


    @Test
    public void UpdateUserTest(){
        System.out.println("UpdateUser Test is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void RemoveFromCartTest(){
        System.out.println("RemoveFromCart Test is running...");
        Assert.assertTrue(true);
    }

    @Test
    public void DeleteAccountTest(){
        System.out.println("DeleteAccount Test is running...");
        Assert.assertTrue(true);
    }

}
