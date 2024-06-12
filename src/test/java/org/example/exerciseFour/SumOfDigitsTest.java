package org.example.exerciseFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {

    private final SumOfDigits sumOfDigits = new SumOfDigits();

    @Test
    public void testSumOfDigitsPositiveNumber() {

        assertEquals(15, sumOfDigits.sumOfDigits(12345));
    }

    @Test
    public void testSumOfDigitsSingleDigit() {
        assertEquals(5, sumOfDigits.sumOfDigits(5));
    }

    @Test
    public void testSumOfDigitsNegativeNumber() {
        assertEquals(-15, sumOfDigits.sumOfDigits(-12345));
    }

    @Test
    public void testSumOfDigitsZero() {
        assertEquals(0, sumOfDigits.sumOfDigits(0));
    }

    @Test
    public void testSumOfDigitsNegativeSingleDigit() {
        assertEquals(-5, sumOfDigits.sumOfDigits(-5));
    }

    @Test
    public void testSumOfDigitsLargeNumber() {
        assertEquals(39, sumOfDigits.sumOfDigits(987654));

    }
}
