package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carModel;
    private String carСlass;
    private double weightCar;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("Go");
    }
    public  void stop(){
        System.out.println("Stop");
    }
    public void turnRight(){
        System.out.println("Turn Right");
    }
    public  void turnLeft(){
        System.out.println("Turn Left");
    }

    public Car(String carModel, String carСlass, double weightCar, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carСlass = carСlass;
        this.weightCar = weightCar;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carСlass='" + carСlass + '\'' +
                ", weightCar=" + weightCar +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void printInfo(){
        System.out.println(driver.toString());
        System.out.println(engine.toString());
        System.out.println(carModel);
        System.out.println(carСlass);
        System.out.println(weightCar);
    }



}
