package ua.ithillel.nichushkin.FourClasses.Vehicles;


import ua.ithillel.nichushkin.FourClasses.Details.Engine;
import ua.ithillel.nichushkin.FourClasses.Professions.Driver;

public class Car {
    //6. Создать класс `Car` в пакете `com.company.vehicles`, `Engine` в пакете `com.company.details` и `Driver`
    // в пакете `com.company.professions`. Класс `Driver` содержит поля - `ФИО`, `стаж вождения`. Класс `Engine`
    // содержит поля - `мощность`, `производитель`. Класс `Car` содержит поля - `марка автомобиля`,
    // `класс автомобиля`, `вес`, водитель типа `Driver`, мотор типа `Engine`.
    //Методы `start()`, `stop()`, `turnRight()`, `turnLeft()`, которые выводят на печать: "Поехали",
    // "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод `printInfo()`, который выводит
    // полную информацию об автомобиле, ее водителе и моторе.
    //Создать производный от `Car` класс  - `Lorry` (грузовик), характеризуемый также грузоподъемностью кузова.
    //Создать производный от `Car` класс - `SportCar`, характеризуемый также предельной скоростью. Пусть класс
    // `Driver` расширяет класс `Person`.
    //---

    private String brandCar;
    private String classCar;
    private int weightCar;
    private Driver driver;
    private Engine engine;

    public Car(String brandCar, String classCar, int weightCar, Driver driver, Engine engine) {
        this.brandCar = brandCar;
        this.classCar = classCar;
        this.weightCar = weightCar;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public String getClassCar() {
        return classCar;
    }

    public int getWeightCar() {
        return weightCar;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public void setWeightCar(int weightCar) {
        this.weightCar = weightCar;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void printInfo(){
        System.out.printf("Модель автомобиля: %s, класс автомобиля: %s, вес автомобиля: %d, водитель: %s, " +
                "двигатель: %s", getBrandCar(), getClassCar(), getWeightCar(), getDriver().toString(), getEngine());
    }
}
