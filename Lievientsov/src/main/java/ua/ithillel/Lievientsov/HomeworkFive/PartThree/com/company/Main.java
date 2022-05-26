package ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company;
//6. Создать класс `Car` в пакете `com.company.vehicles`, `Engine` в пакете `com.company.details` и `Driver` в пакете
// `com.company.professions`.
//Класс `Driver` содержит поля - `ФИО`, `стаж вождения`.
//Класс `Engine` содержит поля - `мощность`, `производитель`.
//Класс `Car` содержит поля - `марка автомобиля`, `класс автомобиля`, `вес`, водитель типа `Driver`,
// мотор типа `Engine`.
//Методы `start()`, `stop()`, `turnRight()`, `turnLeft()`, которые выводят на печать: "Поехали", "Останавливаемся",
// "Поворот направо" или "Поворот налево". А также метод `printInfo()`, который выводит полную информацию об автомобиле, ее водителе и моторе.
//Создать производный от `Car` класс  - `Lorry` (грузовик), характеризуемый также грузоподъемностью кузова.
//Создать производный от `Car` класс - `SportCar`, характеризуемый также предельной скоростью.
// Пусть класс `Driver` расширяет класс `Person`.

import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.details.Engine;
import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.professions.Driver;
import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.vehicles.Lorry;
import ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver lorryDriver = new Driver(75, "Kevin Rivera", 30);
        Driver sportDriver = new Driver(30, "James Vaughn", 7);
        Engine sportEngine = new Engine(89, "Mercedes");
        Engine lorryEngine = new Engine(58, "Toyota");

        SportCar sportCar = new SportCar("Chery", "Sedan", 252.4, sportDriver, sportEngine,
                100);
        Lorry lorry = new Lorry("Dodge", "Hatchback", 655.4, lorryDriver,
                lorryEngine, 25);

        lorry.printInfo();
        sportCar.printInfo();

        sportCar.testCar();
        lorry.testCar2();


    }
}
