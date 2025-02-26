package com.study.refactoring.primitiveObsession.replaceConditionalWithPolymorphism.switches;

import java.util.List;

public abstract class Employee {

    protected List<String> availableProjects;

    public Employee(List<String> availableProjects) {
        this.availableProjects = availableProjects;
    }

    public Employee() {
    }

    public abstract int vacationHours();

    public boolean canAccessTo(String project) {
        return this.availableProjects.contains(project);
    }
}
