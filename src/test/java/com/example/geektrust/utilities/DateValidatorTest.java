package com.example.geektrust.utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateValidatorTest {
    @Test
    void isValidDate1() {
        boolean isValidDate = DateValidator.isValidDate("20-07-2022");
        assertTrue(isValidDate);
    }

    @Test
    void isValidDate2() {
        boolean isValidDate = DateValidator.isValidDate("07-20-2022");
        assertFalse(isValidDate);
    }
}
