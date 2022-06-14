package com.company;
//6. Создать класс `Car` в пакете `com.company.vehicles`, `Engine` в пакете `com.company.details` и `Driver`
//        в пакете `com.company.professions`. Класс `Driver` содержит поля - `ФИО`, `стаж вождения`.
//        Класс `Engine` содержит поля - `мощность`, `производитель`. Класс `Car` содержит поля - `марка автомобиля`,
//        `класс автомобиля`, `вес`, водитель типа `Driver`, мотор типа `Engine`.
//        Методы `start()`, `stop()`, `turnRight()`, `turnLeft()`, которые выводят
//        на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
//        А также метод `printInfo()`, который выводит полную информацию об автомобиле, ее водителе и моторе.
//        Создать производный от `Car` класс  - `Lorry` (грузовик), характеризуемый также грузоподъемностью кузова.
//        Создать производный от `Car` класс - `SportCar`, характеризуемый также предельной скоростью.
//        Пусть класс `Driver` расширяет класс `Person`.

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver d = new Driver(33, "Den",10);
        Engine e = new Engine(300, "WW");
        Lorry l = new Lorry("WW", "A", 2500, d, e, 1900);
        SportCar s = new SportCar("Bugatti", "Prime", 2500, d, e, 550);

        l.printInfo();
        s.printInfo();
    }
}
