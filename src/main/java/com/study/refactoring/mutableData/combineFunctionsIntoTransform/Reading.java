package com.study.refactoring.mutableData.combineFunctionsIntoTransform;

import java.time.Month;
import java.time.Year;

public record Reading(String customer, double quantity, Month month, Year year) {
}
