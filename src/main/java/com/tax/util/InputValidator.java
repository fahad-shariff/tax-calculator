package com.tax.util;

import com.tax.exception.TaxValidationException;

public class InputValidator {

    public static double parseIncome(String input) throws TaxValidationException {
        
        try {
            if (input.contains(".")) {
                throw new TaxValidationException("Income must be a whole number without decimal places.");
            }

            int income = Integer.parseInt(input);

            if (income < 0) {
                throw new TaxValidationException("Income must be a non-negative whole number.");
            }

            return income;
        } catch (NumberFormatException e) {
            throw new TaxValidationException("Invalid input. Please enter a valid whole number.");
        }
    }
}
