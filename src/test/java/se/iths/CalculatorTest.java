package se.iths;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    int[] testArray1 = new int[] {1,2,3};
    int[] testArray2 = new int[] {1,2,3};

    @BeforeEach
    void beforeEachTest() {
        System.out.println("Runs every test");
    }

    @Test
    void testException() {
        try {
            castException();
            fail("Expected exception was not occured.");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Exception was thrown!");
        }
    }

    public void castException() {
        testArray1[5] = 1;
    }


    @Test
    public void testArray() throws Exception {
        assertArrayEquals(testArray1, testArray2);
    }

    @Test
    public void testAdd2() {
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testSubtract() {
        assertEquals(10, calculator.subtract(12,2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(18,9));
    }

    @Test
    public void testMultiply() {
        assertEquals(16, calculator.multiply(4,4));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testAdd(int n) {
        assertEquals(1 + n, calculator.add(1, n));
    }


}

