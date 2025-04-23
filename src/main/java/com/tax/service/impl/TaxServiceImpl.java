package com.tax.service.impl;

import java.util.List;

import com.tax.model.TaxSlab;
import com.tax.service.TaxService;

public class TaxServiceImpl implements TaxService {

    private final List<TaxSlab> taxSlabs;

    public TaxServiceImpl(List<TaxSlab> taxSlabs) {
        this.taxSlabs = taxSlabs;
    }

    @Override
    public double calculateTax(double income) {
        double tax = 0.0;
        for (TaxSlab slab : taxSlabs) {
            if (income > slab.getLowerLimit()) {
                double taxableAmount = Math.min(income, slab.getUpperLimit()) - slab.getLowerLimit();
                tax += taxableAmount * (slab.getTaxRate() / 100);
            }
        }
        return tax;
    }
}