package ua.ithillel.natochin.four.parttwo.car;

import ua.ithillel.natochin.four.parttwo.car.parts.*;


public class Main {
    public static void main(String[] args) {

        /*
        1. Создать класс `Body`.
        2. В класс `Body` добавить:
            -  Поля: `type (char[])`, `material (char[])`.
            -  Конструктор, который принимает все свойства класса.
            -  `getter`-ы для всех полей.
            3. Создать класс `Engine`.
            4. В класс `Engine` добавить:
            -  Поля: `fuel (char[])`, `coolingMethod (char[])`, `cylindersAmount (int)`, `cylindersArrangement (char[])`, `combustibleMixtureIgnition (char[])`.
            -  Конструктор, который принимает все свойства класса.
            -  `getter`-ы для всех полей.
            5. Создать класс `Transmission`.
            6. В класс `Transmission` добавить:
            - Поля: `driveType (char[])`, `gearboxType (char[])`.
            - Конструктор, который принимает все свойства класса.
            -  `getter`-ы для всех полей.
            7. Создать класс `Car`.
            8. В класс `Car` добавить:
            - Поля: `body (Body)`, `engine (Engine)`, `transmission (Transmission)`.
            - Конструктор, который принимает все свойства класса.
            -  `getter`-ы для всех полей.
            9. В `main` создать объект класса `Car` при этом необходимо создать объекты всех полей, из которых состоит `Car`.
         */

        Body hatchbackBody = new Body("hatchback", "plastic");

        Engine electricEngine = new Engine("electro","air",0, "no", "no");

        Transmission automaticTransmission = new Transmission("full","automatic");

        Car electricCar = new Car(hatchbackBody,electricEngine,automaticTransmission);
        System.out.println(electricCar);
    }
}
