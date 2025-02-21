package com.study.refactoring.mutableData.separateQueryFromModifier;

import java.util.List;

public class Criminal {

    public void alertForMiscreant(List<Person> people) {
        if (!findMiscreant(people).isBlank()) {
            setOffAlarms();
        }
    }

    public String findMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                return "Don";
            }

            if (p.getName().equals("John")) {
                return "John";
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
