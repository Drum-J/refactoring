package com.study.refactoring.primitiveObsession.replaceTypeCodeWithSubclasses.directInheritance;

public class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "engineer";
    }
}
