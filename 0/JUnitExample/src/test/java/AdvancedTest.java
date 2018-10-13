import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

public class AdvancedTest {
    private int firstNumber;
    private int secondNumber;

    @Before
    public void setUp() {
        firstNumber = 2;
        secondNumber = 4;
        System.out.println("test started");
    }

    @After
    public void TearDown() {
        System.out.println("test finished");
    }

    @Test
    public void checkValue() {
        assertEquals(firstNumber, 2);
        assertEquals(secondNumber, 4);
    }

    @Test
    public void checkResult() {
        assertEquals(4, 2+2);
    }

    @Test
    public void checkFalse() {
        assertFalse(false);

    }

    @Test
    public void checkCount() {
        assertEquals(6, firstNumber+secondNumber);
        fail();
    }

    @Test
    public void failTest() {
        fail();
    }

}
