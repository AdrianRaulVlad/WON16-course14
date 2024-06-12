package org.example.exerciseTwo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfFirstNEvenTest {
    private final SumOfFirstNEven sumOfFirstNEven = new SumOfFirstNEven();

    @Test
    public void testSumOfFirst5Even() {
        assertEquals(30, sumOfFirstNEven.sumEven(5));
    }

    @Test
    public void testSumOfFirst10Even() {
        assertEquals(110, sumOfFirstNEven.sumEven(10));
    }

    @Test
    public void testSumOfFirst1Even() {
        assertEquals(2, sumOfFirstNEven.sumEven(1));
    }

    @Test
    public void testSumOfFirst0Even() {
        assertEquals(0, sumOfFirstNEven.sumEven(0));
    }

    @Test
    public void testSumOfFirst2Even() {
        assertEquals(6, sumOfFirstNEven.sumEven(2));
    }

    @Test
    public void testSumOfFirst3Even() {
        assertEquals(12, sumOfFirstNEven.sumEven(3));
    }

    @Test
    public void testSumOfFirst4Even() {
        assertEquals(20, sumOfFirstNEven.sumEven(4));
    }
}
