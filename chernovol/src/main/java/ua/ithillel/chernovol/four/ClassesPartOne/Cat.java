package ua.ithillel.chernovol.four.ClassesPartOne;

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

/**
 * @author Chernovol Alexander
 */

public class Cat {
    private int age;
    private char[] name;

    public Cat(int age) {
        this.age = age;
    }

    public Cat(char[] name) {
        this.name = name;
    }

    public Cat(int age, char[] name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }
}
