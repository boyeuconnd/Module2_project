import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolindormeTest {

    @Test
    @DisplayName("Test polindrome with up and lower char")
    void polindromeCheck() {
        String input = "Able was I ere I saw Elba";
        assertTrue(Polindorme.polindromeCheck(input));
    }
    @Test
    @DisplayName("Test polindrome without up and lower char")
    void polindromeCheck1() {
        String input = "madam";
        assertTrue(Polindorme.polindromeCheck(input));
    }
    @Test
    @DisplayName("Test polindrome without up and lower char")
    void polindromeCheck2() {
        String input = "madam1";
        assertFalse(Polindorme.polindromeCheck(input));
    }
}