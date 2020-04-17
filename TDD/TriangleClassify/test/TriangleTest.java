import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    @DisplayName("Equilateral test")
    void equilateralTest(){
        setSide(3, 3, 3);
//        String expected = "equilateral";
//        String result = Triangle.TriangleClassify();
//        assertEquals(expected,result);
        assertEquals(Triangle.getSide1(),Triangle.getSide2(),Triangle.getSide3());
    }


    @Test
    @DisplayName("Non-Triangle test 1side=peri/2")
    void non_triangleTest(){
        setSide(2, 4, 6);
//        String expected = "non-triangle";
//        String result = Triangle.TriangleClassify();
        assertTrue(Triangle.isNonTriangle());
    }
    @Test
    @DisplayName("Non-Triangle test 1side>peri/2")
    void non_triangleTest2(){
        setSide(2, 4, 10);
//        String expected = "non-triangle";
//        String result = Triangle.TriangleClassify();
//        assertEquals(expected,result);
        assertTrue(Triangle.isNonTriangle());
    }
    @Test
    @DisplayName("Minus side test")
    void non_triangleTest3(){
        setSide(-2, 4, 5);
//        String expected = "non-triangle";
//        String result = Triangle.TriangleClassify();
//        assertEquals(expected,result);
        assertTrue(Triangle.isNonTriangle());
    }
    @Test
    @DisplayName("Zero side test")
    void non_triangleTest4(){
        setSide(0, 4, 5);
//        String expected = "non-triangle";
//        String result = Triangle.TriangleClassify();
//        assertEquals(expected,result);
        assertTrue(Triangle.isNonTriangle());
    }
    @Test
    @DisplayName("Isosceles Triangle test1")
    void isoscelesTriangleTest1(){
        setSide(4, 4, 6);
//        String expected = "isosceles";
//        String result = Triangle.TriangleClassify();
//        assertEquals(expected,result);
        assertTrue(Triangle.isIsoscelesTriangle());
    }
    @Test
    @DisplayName("Isosceles Triangle test2")
    void isoscelesTriangleTest2(){
        setSide(6, 4, 4);
//        String expected = "isosceles";
//        String result = Triangle.TriangleClassify();
//        assertEquals(expected,result);
        assertTrue(Triangle.isIsoscelesTriangle());
    }
    @Test
    @DisplayName("Normal Triangle test")
    void normalTriangleTest(){
        setSide(3, 4, 6);
//        String expected = "normal";
//        String result = Triangle.TriangleClassify();
//        assertEquals(expected,result);
        assertTrue(Triangle.isNormalTriangle());
    }
    private void setSide(int side1, int side2, int side3) {
        Triangle.setSide1(side1);
        Triangle.setSide2(side2);
        Triangle.setSide3(side3);
    }
}