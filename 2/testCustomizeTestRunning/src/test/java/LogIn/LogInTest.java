package LogIn;

import org.testng.Assert;
import org.testng.annotations.*;

public class LogInTest {

    @Test
    public void LogInViaFacebook(){
        System.out.println(LogInTest.class + "LogInViaFacebook");
        Assert.assertTrue(true);
    }

    @Test
    public void LogInViaEmail(){
        System.out.println(LogInTest.class + "LogInViaEmail");
        try{
            Assert.assertTrue(false);
        }
        catch (Throwable ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Test Continuation");

    }

    @Test
    public void LogInViaIstagram(){
        System.out.println(LogInTest.class + "LogInViaIstagram");
        Assert.assertTrue(true);
    }
}
