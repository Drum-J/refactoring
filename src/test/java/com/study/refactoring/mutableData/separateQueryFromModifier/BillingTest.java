package com.study.refactoring.mutableData.separateQueryFromModifier;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {

    @Test
    void totalOutstanding() {
        Billing billing = new Billing(new Customer("keesun", List.of(new Invoice(20), new Invoice(30))),
                new EmailGateway());
        assertEquals(50d, billing.totalOutstanding());

        //추가 호출
        billing.sendBill();
    }
}