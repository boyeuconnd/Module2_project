import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Decimal_Binary_testTest {

    @Test
    @DisplayName("Test convert 0")
    void decimalToBinary() {
        String expected = "0";
        String result = Decimal_Binary_test.decimalToBinary(0);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test convert 1")
    void decimalToBinary2() {
        String expected = "1";
        String result = Decimal_Binary_test.decimalToBinary(1);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test convert 2")
    void decimalToBinary3() {
        String expected = "10";
        String result = Decimal_Binary_test.decimalToBinary(2);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test convert 3")
    void decimalToBinary4() {
        String expected = "11";
        String result = Decimal_Binary_test.decimalToBinary(3);
        assertEquals(expected,result);
    }@Test
    @DisplayName("Test convert 156")
    void decimalToBinary5() {
        String expected = "10011100";
        String result = Decimal_Binary_test.decimalToBinary(156);
        assertEquals(expected,result);
    }@Test
    @DisplayName("Test convert 367")
    void decimalToBinary6() {
        String expected = "101101111";
        String result = Decimal_Binary_test.decimalToBinary(367);
        assertEquals(expected,result);
    }
}