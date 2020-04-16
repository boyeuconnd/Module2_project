import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Test with 0")
    void testNumber0(){
        int number =0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName("Test with positive numbers")
    void testNumberPositive(){
        int number = 4;
        int expected = 4;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);

    }

    @Test
    @DisplayName("Test with negative numbers")
    void testNumberNegative(){
        int number = -8;
        int expected = 8;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

}