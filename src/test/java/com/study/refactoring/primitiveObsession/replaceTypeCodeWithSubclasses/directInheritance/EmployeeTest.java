package com.study.refactoring.primitiveObsession.replaceTypeCodeWithSubclasses.directInheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void employeeType() {
        assertEquals("engineer", Employee.createEmployee("keesun", "engineer").getType());
        assertEquals("manager", Employee.createEmployee("keesun", "manager").getType());
        assertThrows(IllegalArgumentException.class, () -> Employee.createEmployee("keesun", "wrong type"));
    }
}