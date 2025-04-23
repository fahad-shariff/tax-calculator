package com.tax.model;

public class TaxPayer {
    
    private final double income;

    public TaxPayer(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }
}
