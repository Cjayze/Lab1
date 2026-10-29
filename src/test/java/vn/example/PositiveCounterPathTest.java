package vn.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveCounterPathTest {
    @Test
    void firstPositiveSecondNotPositive() {
        assertEquals(1, PositiveCounter.countPositive(5, 0));
    }

    @Test
    void firstNotPositiveSecondPositive() {
        assertEquals(1, PositiveCounter.countPositive(-2, 8));
    }
}
