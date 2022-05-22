package ua.ithillel.natochin.four.partthree.com.company.professions;

import ua.ithillel.natochin.four.partthree.person.Person;

public class Driver extends Person {
    private int drivingExperience;

    public Driver(String name, int age, int experience){
        super(name, age);
        this.drivingExperience = experience;
    }

    @Override
    public String toString(){
        return " driver: " + this.getFullName() + "(exp. " + this.drivingExperience + " years)";
    }
}
