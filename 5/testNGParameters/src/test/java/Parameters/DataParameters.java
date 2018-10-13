package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameters {

    @Parameters({"email","name"})
    @Test
    public void LogIn(String email, String name){
        System.out.println("Login test running...");
        System.out.println(email + " " + name);
    }

}
