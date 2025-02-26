package com.study.refactoring.primitiveObsession.replaceTypeCodeWithSubclasses.directInheritance;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "manager";
    }
}
