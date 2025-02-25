package com.study.refactoring.dataClumps;

public class Office {

    private String location;

    private TelephoneNumber officePhoneNumber;

    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
        return officePhoneNumber.toString();
    }

    public TelephoneNumber getOfficePhoneNumber() {
        return officePhoneNumber;
    }
}
