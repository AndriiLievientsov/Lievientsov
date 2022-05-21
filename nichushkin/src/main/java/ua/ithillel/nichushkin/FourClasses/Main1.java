package ua.ithillel.nichushkin.FourClasses;
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
public class Main1 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        Cat1 cat2 = new Cat1(7);
        Cat1 cat3 = new Cat1(new char[]{'V', 'a', 's', 'y', 'a'});
        Cat1 cat4 = new Cat1(8,new char[]{'C','h','e','r','n','e','s','h'});
        System.out.println(cat1.getAge());
        System.out.println(cat2.getAge());
        System.out.println(cat3.getName());
        System.out.println(cat4.getAge());
        cat4.printName();


    }
}
