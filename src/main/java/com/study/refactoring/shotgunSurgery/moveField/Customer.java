package com.study.refactoring.shotgunSurgery.moveField;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {

    private String name;

    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.contract = new CustomerContract(dateToday(), discountRate);
    }

    //TODO CustomerContract 로 옮길 수도 있다.
    public double getDiscountRate() {
        return this.contract.getDiscountRate();
    }

    public void setDiscountRate(double discountRate) {
        this.contract.setDiscountRate(discountRate);
    }

    public void becomePreferred() {
        this.setDiscountRate(this.getDiscountRate() + 0.03);
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
        return value.subtract(value.multiply(BigDecimal.valueOf(this.getDiscountRate()))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }
}
