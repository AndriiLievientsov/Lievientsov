package ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.vehicles;


import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.details.Engine;
import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.professions.Driver;

public class Car {
    private String carBrand;
    private String vehicleClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String carBrand, String vehicleClass, double weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.vehicleClass = vehicleClass;
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
        System.out.println("Driver: " + driver.getFullName() + "\n" +
                "Driver Experience: " + driver.getDriverExperience() + "\n" +
                "Age: " + driver.getAge());
        System.out.println("Car Brand: " + carBrand + "\n" +
                "Vehicle Class: " + vehicleClass + "\n" +
                "Weight: " + weight);
        System.out.println("Manufacturer: " + engine.getManufacturer() + "\n" +
                "Power: " + engine.getPower());
    }

    public void testCar() {
        System.out.println("\n" + "Sport car, car test: ");
        start();
        turnLeft();
        turnRight();
        stop();
        System.out.println("End of test car.");
    }

    public void testCar2() {
        System.out.println("\n" + "Lorry car test: ");
        start();
        turnLeft();
        turnRight();
        stop();
        System.out.println("End of test car.");
    }
}
