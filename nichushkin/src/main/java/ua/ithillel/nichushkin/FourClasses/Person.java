package ua.ithillel.nichushkin.FourClasses;

public class Person {
    //2. Создать класс `Person`, который содержит:
    //   - поля `fullName`, `age`.
    //   - методы `move()` и `talk()`, в которых просто вывести на консоль сообщение -
    //   `Такой-то  Person говорит`.
    //   - Добавьте два конструктора  - `Person()` и `Person(fullName, age)`.
    //Создайте два объекта этого класса. Один объект инициализируется конструктором `Person()`,
    // другой - `Person(fullName, age)`.
    //---

    private String fullName;
    private int age;

    public Person(){
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println("Такой-то  Person говорит");
    }

    public void talk(){
        System.out.println("Такой-то  Person говорит");
    }
}
