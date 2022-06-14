package ua.ithillel.iovchev.four.partThree.itemSix.com.company.vehicles;

import TasksHillel.four.partThree.itemSix.com.company.details.Engine;
import TasksHillel.four.partThree.itemSix.com.company.professions.Driver;


public class Car {
    private String carBrand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Характеристики автомобиля: " +
                "{ марка: " + carBrand + "; класс: " + carClass + "; вес: " + weight + " }");
        System.out.println("Водитель: " +
                "{ Имя: " + driver.getName() + "; стаж вождения: " + driver.getDrivingExperience() + " }");
        System.out.println("Характеристики двигателя: " +
                "{ мощность: " + engine.getPower() + "; производитель: " + engine.getManufacture() + " }");
        System.out.println("------------------------------------------");
    }

    public Car(String carBrand, String carClass, double weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }
}
