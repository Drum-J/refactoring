package com.study.refactoring.shotgunSurgery.inlineFunction;

public class Rating {

    public int rating(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5 ? 2 : 1;
    }
}
