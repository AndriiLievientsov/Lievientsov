package ua.ithillel.iovchev.four.partThree.itemSix.com.company;

    /*6. Создать класс `Car` в пакете `com.company.vehicles`, `Engine` в пакете `com.company.details`
    и `Driver` в пакете `com.company.professions`. Класс `Driver` содержит поля - `ФИО`, `стаж вождения`.
    Класс `Engine` содержит поля - `мощность`, `производитель`. Класс `Car` содержит поля - `марка автомобиля`,
    `класс автомобиля`, `вес`, водитель типа `Driver`, мотор типа `Engine`. Методы `start()`, `stop()`, `turnRight()`,
    `turnLeft()`, которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
    А также метод `printInfo()`, который выводит полную информацию об автомобиле, ее водителе и моторе.
     Создать производный от `Car` класс  - `Lorry` (грузовик), характеризуемый также грузоподъемностью кузова.
     Создать производный от `Car` класс - `SportCar`, характеризуемый также предельной скоростью.
     Пусть класс `Driver` расширяет класс `Person`.*/

import TasksHillel.four.partThree.itemSix.com.company.details.Engine;
import TasksHillel.four.partThree.itemSix.com.company.professions.Driver;
import TasksHillel.four.partThree.itemSix.com.company.vehicles.Car;
import TasksHillel.four.partThree.itemSix.com.company.vehicles.Lorry;
import TasksHillel.four.partThree.itemSix.com.company.vehicles.SportCar;

public class Solution {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Carlson", 1.5);
        Engine engine1 = new Engine(2.7, "Mercedes-Benz");
        Car car1 = new Car("Mercedes", "A", 1.5, driver1, engine1);
        car1.printInfo();

        Driver driver2 = new Driver("Ivanov", 1.5);
        Engine engine2 = new Engine(2.7, "Lada");
        Car car2 = new Lorry("Lada-Kalina", "C", 1.2, driver2, engine2, 10.7);
        car2.printInfo();

        Driver driver3 = new Driver("Tomagochi", 1.5);
        Engine engine3 = new Engine(2.9, "Toyota");
        Car car3 = new SportCar("Toyota-Avensise", "C", 1.3, driver3, engine3, 300);
        car3.printInfo();
    }
}
