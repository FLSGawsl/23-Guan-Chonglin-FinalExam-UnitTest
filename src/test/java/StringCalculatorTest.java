import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator calculatedString;

    @BeforeEach
    public void setUp() {
        calculatedString = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        calculatedString = null;
    }

    @Test
    public void test1() {
        int value = calculatedString.add("1, 500");
        assertEquals(501, value);
    }

    @Test
    public void test2() {
        int value = calculatedString.add("1, 1000");
        assertEquals(501, value);
    }

    @Test
    public void test3() {
        int value = calculatedString.add("1, -1");
        assertEquals(0, value);
    }
}
