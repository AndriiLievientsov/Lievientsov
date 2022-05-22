package ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.vehicles;

import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.details.Engine;
import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.professions.Driver;

public class Sportcar extends Car {
    private int maxSpeed;

    public Sportcar(String brand, String type, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, type, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Максимальная скорость: " + maxSpeed + " Км/ч");
    }
}
