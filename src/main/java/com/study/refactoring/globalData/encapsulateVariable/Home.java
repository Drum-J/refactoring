package com.study.refactoring.globalData.encapsulateVariable;

public class Home {

    public static void main(String[] args) {
        System.out.println(Thermostats.targetTemperature);
        Thermostats.targetTemperature = 68;
        Thermostats.readInFahrenheit = false;
    }
}
