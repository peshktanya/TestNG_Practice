package Parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProviderClass=DataProviderTest.class,dataProvider="data")
    public void registerUser(String name,
                             String lastName,
                             String email,
                             String password){
        System.out.println("    Registered users are: ");
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(password);

    }

    @Test(dataProvider = "data")
    public void logInUser(String name,
                             String lastName,
                             String email,
                             String password){
        System.out.println(name + " " + lastName + " " + email + " " + password);
        System.out.println("Login user data\n");
    }


    @DataProvider(name = "data")
    public Object[][] testData(){
        Object[][] data = { {"John", "Smith", "John@Smith.com", "JohnPass"},
                            {"Helen", "Black", "Helen@Black.com", "BlackPass"},
                            {"Olga", "Brown", "Olga@Brown.com", "BrownPass"}};

        return data;
    }
}
