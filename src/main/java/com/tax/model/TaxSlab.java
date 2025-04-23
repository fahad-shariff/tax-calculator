package com.tax.model;

public class TaxSlab {

    private final double lowerLimit;
    private final double upperLimit;
    private final double taxRate; 

    public TaxSlab(double lowerLimit, double upperLimit, double taxRate){
        this.lowerLimit=lowerLimit;
        this.upperLimit=upperLimit;
        this.taxRate=taxRate;
    }

    public double getLowerLimit(){
        return lowerLimit;
    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public double getTaxRate() {
        return taxRate;
    }

}
