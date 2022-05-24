package ua.ithillel.iovchev.four.partThree.itemSix.com.company.vehicles;

import TasksHillel.four.partThree.itemSix.com.company.details.Engine;
import TasksHillel.four.partThree.itemSix.com.company.professions.Driver;

public class Lorry extends Car{
    private double loadCapacity;


    public Lorry(String carBrand, String carClass, double weight, Driver driver, Engine engine, double loadCapacity) {
        super(carBrand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printInfo() {
        System.out.println("Характеристики автомобиля: " +
                "{ марка: " + getCarBrand() + "; класс: " + getCarClass() + "; вес: " + getWeight() + " }");
        System.out.println("Водитель: " +
                "{ Имя: " + getDriver().getName() + "; стаж вождения: " + getDriver().getDrivingExperience() + " }");
        System.out.println("Характеристики двигателя: " +
                "{ мощность: " + getEngine().getPower() + "; производитель: " + getEngine().getManufacture()+ " }");
        System.out.println("Грузоподъемность кузова: " + loadCapacity);
        System.out.println("------------------------------------------");

    }
}
