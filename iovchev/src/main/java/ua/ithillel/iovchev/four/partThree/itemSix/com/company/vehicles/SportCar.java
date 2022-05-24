package ua.ithillel.iovchev.four.partThree.itemSix.com.company.vehicles;

import TasksHillel.four.partThree.itemSix.com.company.details.Engine;
import TasksHillel.four.partThree.itemSix.com.company.professions.Driver;

public class SportCar extends Car{
    private int speedLimit;

    public SportCar(String carBrand, String carClass, double weight, Driver driver, Engine engine, int speedLimit) {
        super(carBrand, carClass, weight, driver, engine);
        this.speedLimit = speedLimit;
    }

    @Override
    public void printInfo() {
        System.out.println("Характеристики автомобиля: " +
                "{ марка: " + getCarBrand() + "; класс: " + getCarClass() + "; вес: " + getWeight() + " }");
        System.out.println("Водитель: " +
                "{ Имя: " + getDriver().getName() + "; стаж вождения: " + getDriver().getDrivingExperience() + " }");
        System.out.println("Характеристики двигателя: " +
                "{ мощность:" + getEngine().getPower() + "; производитель: " + getEngine().getManufacture()+ " }");
        System.out.println("Предельная скорость: " + speedLimit);
        System.out.println("------------------------------------------");

    }
}
