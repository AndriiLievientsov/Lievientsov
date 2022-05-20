package ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.vehicles;

import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.details.Engine;
import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.professions.Driver;

public class Car {
    private String brand;
    private String type;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String type, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    private void start() {
        System.out.println("Поехали");
    }

    private void stop() {
        System.out.println("Остановиться");
    }

    private void turnLeft() {
        System.out.println("Повернуть налево");
    }

    private void turnRight() {
        System.out.println("Повернуть направо");
    }

    public void printInfo() {
        System.out.println("Имя водителя: " + driver.getFullName() + ". Стаж водителя: " + driver.getDriverExperience()
                + " лет. Возраст водителя: " + driver.getAge() + " лет");
        System.out.println("Брэнд авто: " + brand + ". Тип авто: " + type + ". Вес авто: " + weight + " Кг");
        System.out.println("Производитель двигателя: " + engine.getManufacturer() + ". Мощность двигателя: "
                + engine.getPower() + " Л.С.");
    }
}
