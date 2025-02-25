package com.study.refactoring.featureEnvy;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public double calculateBill() {
        return electricityUsage.getElectricityBill() + gasUsage.getGasBill();
    }
}
