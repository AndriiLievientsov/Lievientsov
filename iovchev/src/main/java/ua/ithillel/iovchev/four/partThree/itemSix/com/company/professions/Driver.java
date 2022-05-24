package ua.ithillel.iovchev.four.partThree.itemSix.com.company.professions;

import TasksHillel.four.partThree.itemTwo.Person;

public class Driver extends Person {
    private String name;
    private double drivingExperience;

    public Driver(String name, double drivingExperience) {
        this.name = name;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public double getDrivingExperience() {
        return drivingExperience;
    }
}
