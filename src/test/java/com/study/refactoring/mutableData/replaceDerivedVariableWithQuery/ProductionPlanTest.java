package com.study.refactoring.mutableData.replaceDerivedVariableWithQuery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductionPlanTest {

    @Test
    void production() {
        ProductionPlan productionPlan = new ProductionPlan();
        productionPlan.applyAdjustment(10);
        productionPlan.applyAdjustment(20);
        assertEquals(30, productionPlan.getProduction());
    }
}