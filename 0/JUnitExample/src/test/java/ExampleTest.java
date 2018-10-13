import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void checkNotNull() {
        assertNotNull("Not null string");
    }

    @Test
    public void shouldReturnCorrectSum() {
        assertEquals(30, 10+20);
    }

    @Ignore
    @Test
    public void assertThatNull() {
        assertNull(null);
    }

    @Test
    public void assertThatFalse() {
        assertFalse("String".contains("s t r i n g"));
    }
}