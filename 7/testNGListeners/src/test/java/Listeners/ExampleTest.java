package Listeners;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ExampleTest {

    @Test
    public void loginwithEmail(){
        System.out.println("Inside test login with email");
    }

    @Test
    public void loginwithFacebook(){
        System.out.println("Inside test login with Facebook");
        Assert.assertEquals("testString", "testString1", "Wrong value!");
    }


    @Test (dependsOnMethods = "loginwithFacebook")
    public void loginwithTwitter(){
        System.out.println("Inside test login with Twitter");
    }
}
