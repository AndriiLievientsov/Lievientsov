package ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.vehicles;

import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.details.Engine;
import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.professions.Driver;

public class Lorry extends Car {
    private int BodyLoadCapacity;

    public Lorry(String carBrand, String vehicleClass, double weight, Driver driver, Engine engine,
                 int bodyLoadCapacity) {
        super(carBrand, vehicleClass, weight, driver, engine);
        BodyLoadCapacity = bodyLoadCapacity;
    }

    public int getBodyLoadCapacity() {
        return BodyLoadCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Body load capacity: " + getBodyLoadCapacity() + "\n");
    }
}
