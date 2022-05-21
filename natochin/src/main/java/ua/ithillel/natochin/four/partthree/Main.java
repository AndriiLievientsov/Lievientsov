package ua.ithillel.natochin.four.partthree;

import ua.ithillel.natochin.four.partthree.animal.*;
import ua.ithillel.natochin.four.partthree.com.company.vehicles.*;
import ua.ithillel.natochin.four.partthree.com.company.professions.*;
import ua.ithillel.natochin.four.partthree.com.company.details.*;
import ua.ithillel.natochin.four.partthree.phone.matrix.Matrix;
import ua.ithillel.natochin.four.partthree.person.*;
import ua.ithillel.natochin.four.partthree.phone.*;
import ua.ithillel.natochin.four.partthree.reader.*;
import ua.ithillel.natochin.four.partthree.student.*;
import ua.ithillel.natochin.four.partthree.veterinarian.Veterinarian;



public class Main {
    public static void main(String[] args) {

        /*
        Class Phone instances and methods
        1. Класс `Phone`.
            - Создайте класс `Phone`, который содержит поля: `number`, `model` и `weight`.
            - Создайте три экземпляра этого класса.
            - Выведите на консоль значения их переменных.
            - Добавить в класс Phone методы: `receiveCall`, имеет один параметр – имя звонящего.
            Выводит на консоль сообщение `Звонит {name}`.
	        `getNumber` – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
            - Добавить конструктор в класс `Phone`, который принимает на вход три параметра для
            инициализации переменных класса - `number`, `model` и `weight`.
            - Добавить конструктор, который принимает на вход два параметра для инициализации
            переменных класса - `number`, `model`.
            - Добавить конструктор без параметров.
            - Вызвать из конструктора с двумя параметрами конструктор с тремя параметрами.
            - Добавьте перегруженный метод `receiveCall`, который принимает два параметра - имя звонящего
            и номер телефона звонящего. Вызвать этот метод.
            - Создать метод `sendMessage` с аргументами переменной длины. Данный метод принимает на вход
            номера телефонов, которым будет отправлено сообщение.
	         Метод выводит на консоль номера этих телефонов.
         */
        Phone phone = new Phone();
        Phone phone2 = new Phone("555-555-444", "samsung");
        Phone phone3 = new Phone("444-555-555","siemens", 110.5);

        System.out.println(phone);
        System.out.println(phone2);
        System.out.println(phone3);

        phone.receiveCall("John", "+55 555 5555");

        phone.sendMessage("11111111","65465465","1565843");

        System.out.println("=========================");

        /*
        Person class instances
        2.Создать класс `Person`, который содержит:
        - поля `fullName`, `age`.
        - методы `move()` и `talk()`, в которых просто вывести на консоль сообщение -`Такой-то  Person говорит`.
        - Добавьте два конструктора  - `Person()` и `Person(fullName, age)`.
        Создайте два объекта этого класса. Один объект инициализируется конструктором `Person()`,
        другой - `Person(fullName, age)`.
         */
        Person johnDoe = new Person();
        johnDoe.move();

        Person JackDaniels = new Person("Jack Daniels", 100);
        JackDaniels.talk();

        System.out.println("=========================");

        /*
        Matrix example
        3. Создать класс `Matrix`. Класс должен иметь следующие поля:
        - двумерный массив вещественных чисел;
        - количество строк и столбцов в матрице.
        - Добавить следующие методы:
            1) сложение с другой матрицей;
            2) умножение на число;
            3) вывод на печать;
         */
        Matrix matrix = new Matrix(2,3);
        Matrix matrix2 = new Matrix(2,3);

        matrix.fillMatrixRandomly();
        matrix2.fillMatrixRandomly();
        System.out.println("==Matrix 1==");
        matrix.printMatrix();
        System.out.println("==Matrix 2==");
        matrix2.printMatrix();
        System.out.println("==Matrix 1 multiplied==");
        Matrix multiplyRes = matrix.multiplyMatrix(3);
        multiplyRes.printMatrix();
        System.out.println("==Matrix 1 + Matrix2==");
        Matrix addRes = matrix.addMatrix(matrix2);
        addRes .printMatrix();

        System.out.println("=========================");


        /*
        Reader class instances and methods
        4. Определить класс `Reader`, хранящий такую информацию о пользователе
        библиотеки: `ФИО`, `номер читательского билета`, `факультет`, `дата рождения`, `телефон`.
	    Методы `takeBook()`, `returnBook()`.
        - Перегрузить методы `takeBook()`, `returnBook()`:
        - `takeBook`, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
        - `takeBook`, который будет принимать переменное количество названий книг.
	    Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
        - `takeBook`, который будет принимать переменное количество объектов класса `Book` (создать
        новый класс, содержащий имя и автора книги).
	    Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 	    Аналогичным образом перегрузить метод `returnBook()`.
 	    Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
	    Или  "Петров В. В. вернул 3 книги".
         */
        Reader first = new Reader("Jack Black","R111", "philosophy",
                "01.01.1980","+555 55 5555");

        System.out.println(first);

        first.takeBook(3);
        System.out.println();
        first.takeBook("History", "Chemistry", "Detective", "Comics");
        System.out.println();
        first.takeBook(new Book("History","W.Churchill"),new Book("Iliad","Homer"));

        System.out.println();

        first.returnBook(3);
        System.out.println();
        first.returnBook("History", "Chemistry", "Detective", "Comics");
        System.out.println();
        first.returnBook(new Book("History","W.Churchill"),new Book("Iliad","Homer"));
        System.out.println();
        System.out.println("=========================");

        /*
        Student class instances and methods
        5. Создайте пример наследования, реализуйте класс `Student` и класс `Aspirant`,
        аспирант отличается от студента наличием некой научной работы.
        - Класс Student содержит переменные: `String firstName`, `lastName`, `group`.
        А также `double averageMark`, содержащую среднюю оценку.
        - Создать переменную типа `Student`, которая ссылается на объект типа Aspirant`.
        - Создать метод `getScholarship()` для класса `Student`, который возвращает сумму стипендии.
        Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80.
	     Переопределить этот метод в классе `Aspirant`.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
        - Создать массив типа `Student`, содержащий объекты класса `Student` и `Aspirant`.
        Вызвать метод `getScholarship()` для каждого элемента массива.
         */
        Student homer = new Aspirant("Homer","Simpson","1psy",3.85,"radiation is not scary");
        System.out.println(homer);

        Student[] students = {
                new Student("first","first","1A", 4.85),
                new Aspirant("fAspir", "lAspir", "ASP",5.0,"smth"),
                new Student("second","second","STUD",5.0)
        };

        for(Student student : students){
            System.out.println(student.getScholarship());
        }

        System.out.println("=========================");

        /*
        Car class instances.
        6. Создать класс `Car` в пакете `com.company.vehicles`,`Engine` в пакете `com.company.details`
        и `Driver` в пакете `com.company.professions`.
        Класс `Driver` содержит поля - `ФИО`, `стаж вождения`.
        Класс `Engine` содержит поля - `мощность`, `производитель`.
        Класс `Car` содержит поля - `марка автомобиля`, `класс автомобиля`, `вес`, водитель типа `Driver`, мотор типа `Engine`.
        Методы `start()`, `stop()`, `turnRight()`, `turnLeft()`,
        которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
        А также метод `printInfo()`, который выводит полную информацию об автомобиле, ее водителе и моторе.
        Создать производный от `Car` класс  - `Lorry` (грузовик), характеризуемый также грузоподъемностью кузова.
        Создать производный от `Car` класс - `SportCar`, характеризуемый также предельной скоростью.
        Пусть класс `Driver` расширяет класс `Person`.
         */

        Lorry man = new Lorry("MAN","Truck",10.5,
                new Driver("J.J.", 25, 5),
                new Engine(430, "MAN"),20.0);

        man.printInfo();

        SportCar porshe = new SportCar("Porshe","sport car",1.5,
                new Driver("J.J.", 25, 5),
                new Engine(250,"VW"),230);

        porshe.printInfo();

        System.out.println("=========================");
        /*
        Animals + Vet doc instances and methods
        7. Создать класс `Animal` и расширяющие его классы `Dog`, `Cat`, `Horse`.
        Класс `Animal` содержит переменные `food`, `location` и методы `makeNoise`, `eat`, `sleep`.
        Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
        `Dog`, `Cat`, `Horse` переопределяют методы `makeNoise`, `eat`.
        Добавьте переменные в классы `Dog`, `Cat`, `Horse`, характеризующие только этих животных.
        Создайте класс Ветеринар, в котором определите метод `void treatAnimal(Animal animal)`.
        Пусть этот метод распечатывает `food` и `location` пришедшего на прием животного.
        В методе main создайте массив типа `Animal`, в который запишите животных всех имеющихся у вас типов.
        В цикле отправляйте их на прием к ветеринару.
         */

        Animal []animals = {
            new Cat("tuna","home","Thomas",20),
            new Dog("meat","garden","Snoopy",true),
            new Horse("barley","field","Horse","cargo")};

        Veterinarian vetDoc = new Veterinarian();

        for(Animal animal : animals){
            vetDoc.treatAnimal(animal);
        }
    }
}
