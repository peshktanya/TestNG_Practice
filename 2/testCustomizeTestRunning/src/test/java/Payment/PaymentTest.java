package Payment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest {

    @Test
    public void PaymentInUSD(){
        System.out.println("PaymentInUSD");
        Assert.assertTrue(true);
    }

    @Test
    public void PaymentInEuro(){
        System.out.println("PaymentInEuro");
        Assert.assertTrue(true);
    }

    @Test
    public void PaymentInUAH(){
        System.out.println("PaymentInUAH");
        Assert.assertTrue(true);
    }
}
