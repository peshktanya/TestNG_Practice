package Features;

import org.testng.Assert;
import org.testng.annotations.*;

public class GroupingTests {



    @Test(groups = "performance")
    public void Check1PerformanceTest(){
        System.out.println("Check1PerformanceTest");
        Assert.assertTrue(true);
    }

    @Test(groups = "performance")
    public void Check2PerformanceTest(){
        System.out.println("Check2PerformanceTest");
        Assert.assertTrue(true);
    }

    @Test(groups = "performance")
    public void Check3PerformanceTest(){
        System.out.println("Check3PerformanceTest");
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void Check1RegressionTest(){
        System.out.println("Check1 Regression Test");
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void Check2RegressionTest(){
        System.out.println("Check2 Regression Test");
        Assert.assertTrue(true);
    }

    @Test(groups = {"regression", "performance", "smoke"})
    public void Check3RegressionPerformanceSmokeTest(){
        System.out.println("Check3 Regression Performance Smoke Test");
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void CheckSmokeTest(){
        System.out.println("Check Smoke Test");
        Assert.assertTrue(true);
    }
}
