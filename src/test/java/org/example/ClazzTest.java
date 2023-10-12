package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClazzTest {

    @Test
    public void testFunction1_case1() {
        int expected_result = 10;
        Clazz clazz = new Clazz();
        int result = clazz.function1(5, 4, 9);
        assertEquals(expected_result, result);
    }

    @Test
    public void testFunction1_case2() {
        int expected_result = -10;
        Clazz clazz = new Clazz();
        int result = clazz.function1(3, 4, 9);
        assertEquals( expected_result, result);
    }

    @Test
    public void testFunction1_case3() {
        int expected_result = -10;
        Clazz clazz = new Clazz();
        int result = clazz.function1(3, 15, 20);
        assertEquals( expected_result, result);
    }

    @Test
    public void testFunction1_case4() {
        int expected_result = -2;
        Clazz clazz = new Clazz();
        int result = clazz.function1(1, 2, 3);
        assertEquals( expected_result, result);
    }
}