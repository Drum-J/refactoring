package com.study.refactoring.mutableData.removeSettingMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void person() {
        Person person = new Person(10);
        assertEquals(10, person.getId());
        assertEquals("keesun", person.getName());
        person.setName("whiteship");
        assertEquals("whiteship", person.getName());
    }
}