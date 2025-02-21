package com.study.refactoring.mutableData.replaceDerivedVariableWithQuery;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private double production;
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
        this.production += adjustment;
    }

    public double getProduction() {
        return this.production;
    }
}
