package com.study.refactoring.shotgunSurgery.inlineFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatingTest {
    @Test
    void rating() {
        Rating rating = new Rating();
        assertEquals(2, rating.rating(new Driver(15)));
        assertEquals(1, rating.rating(new Driver(3)));
    }
}