package com.study.refactoring.primitiveObsession.replaceTypeCodeWithSubclasses.directInheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void employeeType() {
        assertEquals("engineer", new Employee("keesun", "engineer").getType());
        assertEquals("manager", new Employee("keesun", "manager").getType());
        assertThrows(IllegalArgumentException.class, () -> new Employee("keesun", "wrong type"));
    }
}