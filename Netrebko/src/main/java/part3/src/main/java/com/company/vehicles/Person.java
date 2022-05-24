package com.company.vehicles;

public class Person {

    private int ageDriver;

    public Person(int ageDriver) {
        this.ageDriver = ageDriver;
    }

    public int getAgeDriver() {
        return ageDriver;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ageDriver=" + ageDriver +
                '}';
    }
}
