package ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.vehicles;

import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.details.Engine;
import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.professions.Driver;

public class Lorry extends Car {
    private int maxCapacity;

    public Lorry(String brand, String type, double weight, Driver driver, Engine engine, int maxCapacity) {
        super(brand, type, weight, driver, engine);
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Максимальная грузоподъёмность: " + maxCapacity + " Кг");
    }
}
