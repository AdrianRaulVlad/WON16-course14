package org.example.exerciseOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfFirstNTest {

    private final SumOfFirstN sumOfFirstN = new SumOfFirstN();

    @Test
    public void testSumOfFirst5() {
        assertEquals(15, sumOfFirstN.sum(5));
    }

    @Test
    public void testSumOfFirst10() {
        assertEquals(55, sumOfFirstN.sum(10));
    }

    @Test
    public void testSumOfFirst1() {
        assertEquals(1, sumOfFirstN.sum(1));
    }

    @Test
    public void testSumOfFirst0() {
        assertEquals(0, sumOfFirstN.sum(0));
    }

    @Test
    public void testSumOfFirst2() {
        assertEquals(3, sumOfFirstN.sum(2));
    }

    @Test
    public void testSumOfFirst3() {
        assertEquals(6, sumOfFirstN.sum(3));
    }

    @Test
    public void testSumOfFirst4() {
        assertEquals(10, sumOfFirstN.sum(4));
    }
}
