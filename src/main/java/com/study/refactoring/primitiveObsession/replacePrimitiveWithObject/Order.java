package com.study.refactoring.primitiveObsession.replacePrimitiveWithObject;

public class Order {

    private Priority priority;

    public Order(Priority priority) {
        this.priority = priority;
    }

    public Order(String priorityValue) {
        this(new Priority(priorityValue));
    }

    public Priority getPriority() {
        return priority;
    }
}
