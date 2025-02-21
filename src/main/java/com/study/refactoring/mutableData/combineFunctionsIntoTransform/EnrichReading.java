package com.study.refactoring.mutableData.combineFunctionsIntoTransform;

public record EnrichReading(Reading reading, double baseCharge, double taxableCharge) {

}
