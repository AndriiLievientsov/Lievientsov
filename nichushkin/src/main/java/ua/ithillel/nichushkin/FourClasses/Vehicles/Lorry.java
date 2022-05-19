package ua.ithillel.nichushkin.FourClasses.Vehicles;


import ua.ithillel.nichushkin.FourClasses.Details.Engine;
import ua.ithillel.nichushkin.FourClasses.Professions.Driver;

public class Lorry extends Car{
    int loadCapacity;

    public Lorry(String brandCar, String classCar, int weightCar, Driver driver, Engine engine, int loadCapacity) {
        super(brandCar, classCar, weightCar, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
