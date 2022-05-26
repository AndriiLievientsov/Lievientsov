package ua.ithillel.Lievientsov.HomeworkFive.PartOne;

//### Часть 1:
//
//        1. Создать пустой класс `Cat`.
//        2. В класс `Cat` добавь поля: `age` (int), `name` (char[]).
//        3. В класс `Cat` добавить конструкторы:
//        - конструктор по умолчанию.
//        - конструктор принимающий один аргумент `age`.
//        - конструктор принимающий один аргумент `name`.
//        - конструктор принимающий два аргумента `age` и `name`.
//        4. В класс `Cat` добавить методы:
//        -  `getters` для всех полей.
//        -  `setters` для всех полей.

public class Cat {
    private int age;
    private String name;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
