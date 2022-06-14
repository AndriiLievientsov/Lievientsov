package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{

    private double topSpeed;

    public SportCar(String carModel, String carСlass, double weightCar, Driver driver, Engine engine, double topSpeed) {
        super(carModel, carСlass, weightCar, driver, engine);
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "topSpeed=" + topSpeed +
                '}';
    }
}
