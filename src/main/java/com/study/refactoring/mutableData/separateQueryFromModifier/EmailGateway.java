package com.study.refactoring.mutableData.separateQueryFromModifier;

public class EmailGateway {
    public void send(String bill) {
        System.out.println(bill);
    }
}
