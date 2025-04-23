package com.tax;

import java.util.Arrays;
import java.util.List;

import com.tax.controller.TaxController;
import com.tax.model.TaxSlab;
import com.tax.service.TaxService;
import com.tax.service.impl.TaxServiceImpl;

public class Main {
    public static void main(String[] args) {
        List<TaxSlab> slabs = Arrays.asList(
            new TaxSlab(0, 350000, 0),
            new TaxSlab(350001, 625000, 9),
            new TaxSlab(625001, 1200000, 18),
            new TaxSlab(1200001, Double.MAX_VALUE, 35)
        );

        TaxService taxService = new TaxServiceImpl(slabs);
        TaxController controller = new TaxController(taxService);
        controller.start();
    }
}