package com.study.refactoring.primitiveObsession.replaceConditionalWithPolymorphism.switches;

public class FullTimeEmployee extends Employee {
    @Override
    public int vacationHours() {
        return 120;
    }

    @Override
    public boolean canAccessTo(String project) {
        return true;
    }
}
