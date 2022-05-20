package ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company;
/**
 * @author Chernovol Alexander
 */

//        Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете
//        com.company.professions. Класс Driver содержит поля - ФИО, стаж вождения. Класс Engine содержит поля -
//        мощность, производитель. Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа
//        Driver, мотор типа Engine.
//        Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
//        "Поворот направо" или "Поворот налево". А также метод printInfo(), который выводит полную информацию об
//        автомобиле, ее водителе и моторе. Создать производный от Car класс - Lorry (грузовик), характеризуемый также
//        грузоподъемностью кузова.
//        Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью. Пусть класс Driver
//        расширяет класс Person.

import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.details.Engine;
import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.professions.Driver;
import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.vehicles.Lorry;
import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.vehicles.Sportcar;

public class Main {
    public static void main(String[] args) {
        Driver lorryDriver = new Driver(47,"Вася Грузовой", 29);
        Driver sportCarDriver = new Driver(30,"Петя Быстрый",11);
        Engine sportEngine = new Engine(770,"Fiat");
        Engine lorryEngine = new Engine(400,"Scania");

        Sportcar sportcar = new Sportcar("Феррари","Купе",1570,
                sportCarDriver,sportEngine, 340);
        Lorry lorry = new Lorry("Скания","Грузовик",3200,lorryDriver,lorryEngine,12000);

        sportcar.printInfo();
        lorry.printInfo();

    }
}
