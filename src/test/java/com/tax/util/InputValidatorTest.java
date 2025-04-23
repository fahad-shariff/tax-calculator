package com.tax.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.tax.exception.TaxValidationException;

public class InputValidatorTest {

    @Test
    public void testValidInput() throws TaxValidationException {
        assertEquals(500000, InputValidator.parseIncome("500000"));
    }

    @Test
    public void testNegativeIncome() {
        Exception exception = assertThrows(TaxValidationException.class, () -> {
            InputValidator.parseIncome("-500");
        });
        assertEquals("Income must be a non-negative whole number.", exception.getMessage());
    }

    @Test
    public void testDecimalIncome() {
        Exception exception = assertThrows(TaxValidationException.class, () -> {
            InputValidator.parseIncome("50000.55");
        });
        assertEquals("Income must be a whole number without decimal places.", exception.getMessage());
    }

    @Test
    public void testNonNumericInput() {
        Exception exception = assertThrows(TaxValidationException.class, () -> {
            InputValidator.parseIncome("abc123");
        });
        assertEquals("Invalid input. Please enter a valid whole number.", exception.getMessage());
    }
}
