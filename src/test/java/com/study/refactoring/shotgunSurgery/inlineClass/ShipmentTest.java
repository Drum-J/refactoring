package com.study.refactoring.shotgunSurgery.inlineClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipmentTest {
    @Test
    void trackingInfo() {
        Shipment shipment = new Shipment("UPS", "12345");
        assertEquals("UPS: 12345", shipment.getTrackingInfo());
    }
}