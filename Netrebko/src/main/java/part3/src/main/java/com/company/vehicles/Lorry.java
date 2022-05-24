package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{

    private double bodyLoad;

    public Lorry(String carModel, String carСlass, double weightCar, Driver driver, Engine engine, double bodyLoad) {
        super(carModel, carСlass, weightCar, driver, engine);
        this.bodyLoad = bodyLoad;
    }

    public double getBodyLoad() {
        return bodyLoad;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "bodyLoad=" + bodyLoad +
                '}';
    }
}
