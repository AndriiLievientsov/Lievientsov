package ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.vehicles;

import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.details.Engine;
import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.professions.Driver;

public class SportCar extends Car {
    private int SpeedLimit;

    public SportCar(String carBrand, String vehicleClass, double weight, Driver driver, Engine engine,
                    int speedLimit) {
        super(carBrand, vehicleClass, weight, driver, engine);
        SpeedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return SpeedLimit;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Speed limit: " + getSpeedLimit());
    }
}
