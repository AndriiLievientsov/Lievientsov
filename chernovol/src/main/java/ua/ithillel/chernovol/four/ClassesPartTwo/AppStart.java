package ua.ithillel.chernovol.four.ClassesPartTwo;

//        1. Создать класс `Body`.
//        2. В класс `Body` добавить:
//        -  Поля: `type (char[])`, `material (char[])`.
//        -  Конструктор, который принимает все свойства класса.
//        -  `getter`-ы для всех полей.
//        3. Создать класс `Engine`.
//        4. В класс `Engine` добавить:
//        -  Поля: `fuel (char[])`, `coolingMethod (char[])`, `cylindersAmount (int)`, `cylindersArrangement (char[])`, `combustibleMixtureIgnition (char[])`.
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
//        9. В `main` создать объект класса `Car` при этом необходимо создать объекты всех полей, из которых состоит `Car`.

/**
 * @author Chernovol Alexander
 */
public class AppStart {
    public static void main(String[] args) {
        Body body = new Body("Coupe", "Aluminium");
        Engine engine = new Engine("Gasoline", "Water", 6,
                "V-figurative", "Injector");
        Transmission transmission = new Transmission("Automat", "Hydromatic");

        Car car = new Car(body, engine, transmission);

        System.out.println(car);
    }
}
