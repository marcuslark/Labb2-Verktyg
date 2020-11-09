package se.iths;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

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

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testAdd(int n) {
        Calculator calculator = new Calculator();
        assertEquals(1 + n, calculator.add(1, n));
    }


}

