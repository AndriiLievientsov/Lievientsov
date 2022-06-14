package com.company.professions;

import com.company.vehicles.Person;

public class Driver extends Person {
    private String fullName;
    private int drivingExperience;

    public Driver(int ageDriver, String fullName, int drivingExperience) {
        super(ageDriver);
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", drivingExperience='" + drivingExperience + '\'' +
                '}';
    }
}
