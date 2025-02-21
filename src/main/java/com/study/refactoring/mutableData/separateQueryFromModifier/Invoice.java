package com.study.refactoring.mutableData.separateQueryFromModifier;

public class Invoice {

    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
