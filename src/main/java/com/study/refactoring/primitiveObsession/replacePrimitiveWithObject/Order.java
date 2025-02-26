package com.study.refactoring.primitiveObsession.replacePrimitiveWithObject;

public class Order {

    private String priority;

    public Order(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }
}
