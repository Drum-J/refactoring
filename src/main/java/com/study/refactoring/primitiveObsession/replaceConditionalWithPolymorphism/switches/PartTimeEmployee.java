package com.study.refactoring.primitiveObsession.replaceConditionalWithPolymorphism.switches;

import java.util.List;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(List<String> availableProjects) {
        super(availableProjects);
    }

    @Override
    public int vacationHours() {
        return 80;
    }
}
