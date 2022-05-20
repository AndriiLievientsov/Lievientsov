package ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company;

import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.details.Engine;
import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.professions.Driver;
import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.vehicles.Lorry;
import ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.vehicles.Sportcar;

public class Main {
    public static void main(String[] args) {
        Driver lorryDriver = new Driver(47,"Вася Грузовой", 29);
        Driver sportCarDriver = new Driver(30,"Петя быстрый",11);
        Engine sportEngine = new Engine(770,"Fiat");
        Engine lorryEngine = new Engine(400,"Scania");

        Sportcar sportcar = new Sportcar("Феррари","Купе",1570,
                sportCarDriver,sportEngine, 340);
        Lorry lorry = new Lorry("Скания","Грузовик",3200,lorryDriver,lorryEngine,12000);

        sportcar.printInfo();
        lorry.printInfo();

    }
}
