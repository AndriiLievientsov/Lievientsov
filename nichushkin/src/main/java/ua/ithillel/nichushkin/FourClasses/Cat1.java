package ua.ithillel.nichushkin.FourClasses;

import java.util.Arrays;

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
public class Cat1 {

    int age;
    char[] name;

    public Cat1() {
    }

    public Cat1(int age) {
        this.age = age;
    }

    public Cat1(char[] name) {
        this.name = name;
    }

    public Cat1(int age, char[] name) {
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

    public void printName(){
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }
    }
}
