package com.study.refactoring.primitiveObsession.replaceTypeCodeWithSubclasses.indirectInheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void capitalizedType() {
        assertEquals("Manager", new FullTimeEmployee("keesun", "manager").capitalizedType());
        assertEquals("Engineer", new PartTimeEmployee("keesun", "engineer").capitalizedType());
        assertThrows(IllegalArgumentException.class, () -> new Employee("keesun", "wrong type"));
    }
}