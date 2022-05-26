package ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.professions;


import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.Person;

public class Driver extends Person {
    private String fullName;
    private int driverExperience;

    public Driver(int age, String fullName, int driverExperience) {
        super(age);
        this.fullName = fullName;
        this.driverExperience = driverExperience;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDriverExperience() {
        return driverExperience;
    }


}
