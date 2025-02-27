package com.study.refactoring.primitiveObsession.replacePrimitiveWithObject;

import java.util.List;

public class OrderProcessor {

    public long numberOfHighPriorityOrders(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getPriority().higherThen(new Priority("normal")))
                .count();
    }
}
