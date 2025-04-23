package com.tax.controller;

import java.util.Scanner;

import com.tax.exception.TaxValidationException;
import com.tax.service.TaxService;
import com.tax.util.InputValidator;

public class TaxController {
    private final TaxService taxService;
    private final Scanner scanner;

    public TaxController(TaxService taxService) {
        this.taxService = taxService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Enter your total income: ");
        String input = scanner.nextLine();

        try {
            double income = InputValidator.parseIncome(input);
            double tax = taxService.calculateTax(income);
            System.out.printf("Total tax to be paid in rupees: %.2f%n", tax);
        } catch (TaxValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}