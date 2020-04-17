import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Test number divide 3")
    void getFizzBuzz() {
        int number =3;
        String expectd = "Fizz";

        String result = FizzBuzz.getFizzBuzz(number);
        assertEquals(expectd,result);
    }
    @Test
    @DisplayName("Test number not divide 3 & 5")
    void testNum4(){
        int number =4;
        String expected = "bon ";

        String result = FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number divide 5")
    void testNum5(){
        int number =5;
        String expected = "Buzz";

        String result = FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number divide 3 & 5")
    void testNum15(){
        int number =15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number have char 3 inside")
    void testNum236(){
        int number =236;
        String expected = "Fizz";

        String result = FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number have char 5 inside")
    void testNum259(){
        int number =259;
        String expected = "Buzz";

        String result = FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number1 non dividable and non char 3,5 inside")
    void testNum1247(){
        int number =1247;
        String expected = "mot hai bon bay ";

        String result = FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number2 non dividable and non char 3,5 inside")
    void testNum216748(){
        int number =216748;
        String expected = "hai mot sau bay bon tam ";

        String result = FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
}