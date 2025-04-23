package com.tax.service.impl;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tax.model.TaxSlab;
import com.tax.service.TaxService;

public class TaxServiceImplTest {

    private TaxService taxService;

    @BeforeEach
    public void setup() {
        List<TaxSlab> slabs = Arrays.asList(
            new TaxSlab(0, 350000, 0),
            new TaxSlab(350001, 625000, 9),
            new TaxSlab(625001, 1200000, 18),
            new TaxSlab(1200001, Double.MAX_VALUE, 35)
        );
        taxService = new TaxServiceImpl(slabs);
    }

    @Test
    public void testTaxForLowIncome() {
        assertEquals(0.0, taxService.calculateTax(300000), 0.01);
    }

    @Test
    public void testTaxForMiddleIncome() {
        double expected = (625000 - 350001) * 0.09;
        assertEquals(expected, taxService.calculateTax(625000), 0.01);
    }

    @Test
    public void testTaxForHighIncome() {
        // Expected tax for income = 2,500,000
        // 0% on 0-350000 => 0
        // 9% on 274999 => 24749.91
        // 18% on 574999 => 103499.82
        // 35% on 1300000 => 455000
        double expectedTax = 0 + (274999 * 0.09) + (574999 * 0.18) + (1300000 * 0.35);
        assertEquals(expectedTax, taxService.calculateTax(2500000), 1.0);
    }

    @Test
    public void testTaxExactOnSlabEdges() {
        double tax = taxService.calculateTax(350000);
        assertEquals(0.0, tax, 0.01);
    }
}
