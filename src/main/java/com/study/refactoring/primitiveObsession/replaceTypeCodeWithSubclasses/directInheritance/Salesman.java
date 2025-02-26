package com.study.refactoring.primitiveObsession.replaceTypeCodeWithSubclasses.directInheritance;

public class Salesman extends Employee {
    public Salesman(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "salesman";
    }
}
