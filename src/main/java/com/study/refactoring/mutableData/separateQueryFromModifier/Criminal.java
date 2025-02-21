package com.study.refactoring.mutableData.separateQueryFromModifier;

import java.util.List;

public class Criminal {

    public String alertForMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                setOffAlarms();
                return "Don";
            }

            if (p.getName().equals("John")) {
                setOffAlarms();
                return "John";
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
