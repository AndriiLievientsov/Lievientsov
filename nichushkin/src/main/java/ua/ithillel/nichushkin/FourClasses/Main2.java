package ua.ithillel.nichushkin.FourClasses;
//### Часть 2:
//
//        1. Создать класс `Body`.
//        2. В класс `Body` добавить:
//        -  Поля: `type (char[])`, `material (char[])`.
//        -  Конструктор, который принимает все свойства класса.
//        -  `getter`-ы для всех полей.
//        3. Создать класс `Engine`.
//        4. В класс `Engine` добавить:
//        -  Поля: `fuel (char[])`, `coolingMethod (char[])`, `cylindersAmount (int)`, `cylindersArrangement
//        (char[])`, `combustibleMixtureIgnition (char[])`.
//        -  Конструктор, который принимает все свойства класса.
//        -  `getter`-ы для всех полей.
//        5. Создать класс `Transmission`.
//        6. В класс `Transmission` добавить:
//        - Поля: `driveType (char[])`, `gearboxType (char[])`.
//        - Конструктор, который принимает все свойства класса.
//        -  `getter`-ы для всех полей.
//        7. Создать класс `Car`.
//        8. В класс `Car` добавить:
//        - Поля: `body (Body)`, `engine (Engine)`, `transmission (Transmission)`.
//        - Конструктор, который принимает все свойства класса.
//        -  `getter`-ы для всех полей.
//        9. В `main` создать объект класса `Car` при этом необходимо создать объекты всех полей, из
//        которых состоит `Car`.

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Body body = new Body(new char[]{'v', 'e', 'h', 'e', 'l'}, new char[]{'i', 'r', 'o', 'n'});
        System.out.println(body.getType());
        System.out.println(body.getMaterial());
        Engine engine = new Engine(new char[]{'e', 'l', 'e', 'k', 't', 'r', 'o'}, new char[]{'w', 'a', 't', 'e', 'r'},
                16, new char[]{'n', 'o', 'n', 'e'}, new char[]{'w', 'i', 't', 'h', 'o', 'u', 't'});
        System.out.println(engine.getFuel());
        System.out.println(engine.getCoolingMethod());
        System.out.println(engine.getCylindersAmount());
        System.out.println(engine.getCylindersArrangement());
        System.out.println(engine.getCombustibleMixtureIgnition());
        Transmission transmission = new Transmission(new char[]{'b', 'o', 't', 'h'}, new char[]{'r', 'e', 'd', 'u',
                'c', 't', 'e', 'r'});
        System.out.println(transmission.getDriveType());
        System.out.println(transmission.getGearboxType());
        Car tesla = new Car(body, engine, transmission);
        System.out.println(tesla.toString());
    }
}
