package com.study.refactoring.mutableData.combineFunctionsIntoTransform;

import java.time.Month;
import java.time.Year;

public class Client1 extends ReadingClient {

    double baseCharge;

    public Client1(Reading reading) {
        this.baseCharge = enrichReading(reading).baseCharge();
    }

    public double getBaseCharge() {
        return baseCharge;
    }
}
