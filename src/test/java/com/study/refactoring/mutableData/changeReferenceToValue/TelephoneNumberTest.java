package com.study.refactoring.mutableData.changeReferenceToValue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneNumberTest {
    @Test
    void testEquals() {
        //given
        TelephoneNumber number1 = new TelephoneNumber("123", "1234");
        TelephoneNumber number2 = new TelephoneNumber("123", "1234");

        //when
        
        //then
        assertEquals(number1, number2);
    }
}