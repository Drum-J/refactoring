package com.study.refactoring.mutableData.replaceDerivedVariableWithQuery;

public class Discount {

    private double discountedTotal;
    private double discount;

    private double baseTotal;

    public Discount(double baseTotal) {
        this.baseTotal = baseTotal;
    }

    public double getDiscountedTotal() {
        return this.discountedTotal;
    }

    public void setDiscount(double number) {
        this.discount = number;
        this.discountedTotal = this.baseTotal - this.discount;
    }
}
