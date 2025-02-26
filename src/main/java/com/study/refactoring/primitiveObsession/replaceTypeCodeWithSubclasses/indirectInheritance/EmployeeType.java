package com.study.refactoring.primitiveObsession.replaceTypeCodeWithSubclasses.indirectInheritance;

public class EmployeeType {
    public String capitalizedType() {
        return toString().substring(0, 1).toUpperCase() + toString().substring(1).toLowerCase();
    }
}
