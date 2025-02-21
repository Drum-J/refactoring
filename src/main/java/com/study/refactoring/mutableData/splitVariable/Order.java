package com.study.refactoring.mutableData.splitVariable;

public class Order {

    public double discount(double inputValue, int quantity) {
        if (inputValue > 50) inputValue = inputValue - 2;
        if (quantity > 100) inputValue = inputValue - 1;
        return inputValue;
    }
}
