package com.study.refactoring.longParameterList.removeFlagArgument;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShipmentTest {

    void deliveryDate() {
        LocalDate placedOn = LocalDate.of(2021, 12, 15);
        Order orderFromWA = new Order(placedOn, "WA");

        Shipment shipment = new Shipment();
        assertEquals(placedOn.plusDays(1), shipment.deliveryDate(orderFromWA, true));
        assertEquals(placedOn.plusDays(2), shipment.deliveryDate(orderFromWA, false));
    }
}