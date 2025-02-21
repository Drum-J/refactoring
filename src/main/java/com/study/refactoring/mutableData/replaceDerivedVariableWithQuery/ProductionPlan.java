package com.study.refactoring.mutableData.replaceDerivedVariableWithQuery;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
    }

    public double getProduction() {
        return this.adjustments.stream().mapToDouble(Double::valueOf).sum();
    }
}
