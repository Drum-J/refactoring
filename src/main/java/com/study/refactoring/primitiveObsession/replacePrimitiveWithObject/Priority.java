package com.study.refactoring.primitiveObsession.replacePrimitiveWithObject;

import java.util.List;

public class Priority {

    private final String value;

    private List<String> legalValue = List.of("low", "normal", "high", "rush");

    public Priority(String value) {
        if (legalValue.contains(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("illegal value for priority " + value);
        }

    }

    @Override
    public String toString() {
        return value;
    }

    public boolean higherThen(Priority other) {
        return this.index() > other.index();
    }

    private int index() {
        return legalValue.indexOf(value);
    }
}
