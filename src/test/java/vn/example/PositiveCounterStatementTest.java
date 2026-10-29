package vn.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveCounterStatementTest {
    @Test
    void countsWhenBothNumbersArePositive() {
        assertEquals(2, PositiveCounter.countPositive(4, 7));
    }

    @Test
    void countsWhenNeitherNumberIsPositive() {
        assertEquals(0, PositiveCounter.countPositive(0, -3));
    }
}
