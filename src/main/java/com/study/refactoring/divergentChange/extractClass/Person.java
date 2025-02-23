package com.study.refactoring.divergentChange.extractClass;

public class Person {

    private String name;

    private String officeAreaCode;

    private String officeNumber;

    public String telephoneNumber() {
        return this.officeAreaCode + " " + this.officeNumber;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String officeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String officeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
