package org.example.exerciseFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciCalculatorTest {
    private final FibonacciCalculator calculator = new FibonacciCalculator();

    @Test
    public void testFibonacci0() {
        assertEquals(0, calculator.getFibonacci(0));
    }

    @Test
    public void testFibonacci1() {
        assertEquals(1, calculator.getFibonacci(1));
    }

    @Test
    public void testFibonacci2() {
        assertEquals(1, calculator.getFibonacci(2));
    }

    @Test
    public void testFibonacci3() {
        assertEquals(2, calculator.getFibonacci(3));
    }

    @Test
    public void testFibonacci4() {
        assertEquals(3, calculator.getFibonacci(4));
    }

    @Test
    public void testFibonacci5() {
        assertEquals(5, calculator.getFibonacci(5));
    }

    @Test
    public void testFibonacci6() {
        assertEquals(8, calculator.getFibonacci(6));
    }

    @Test
    public void testFibonacci7() {
        assertEquals(13, calculator.getFibonacci(7));
    }

    @Test
    public void testFibonacci8() {
        assertEquals(21, calculator.getFibonacci(8));
    }

    @Test
    public void testFibonacci9() {
        assertEquals(34, calculator.getFibonacci(9));
    }

    @Test
    public void testFibonacci10() {
        assertEquals(55, calculator.getFibonacci(10));
    }

    @Test
    public void testNegativeIndex() {
        assertThrows(IllegalArgumentException.class, () -> calculator.getFibonacci(-1));
    }
}
