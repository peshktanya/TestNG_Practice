import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.Test;

public class TestSuiteExample {

    TestSuite testSuite = new TestSuite(ExampleTest.class, AdvancedTest.class);
    TestResult result = new TestResult();

    @Test
    public void testSuiteInAction() {
        testSuite.run(result);
        System.out.println("Amount of test cases: " + testSuite.countTestCases());
        testSuite.setName("SimpleTestSuite");
        System.out.println("Name of Test Suite: " + testSuite.getName());

    }

}
