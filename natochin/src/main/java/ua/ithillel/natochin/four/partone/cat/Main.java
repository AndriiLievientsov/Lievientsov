package ua.ithillel.natochin.four.partone.cat;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать пустой класс `Cat`.
        2. В класс `Cat` добавь поля: `age` (int), `name` (char[]).
        3. В класс `Cat` добавить конструкторы:
        - конструктор по умолчанию.
        - конструктор принимающий один аргумент `age`.
        - конструктор принимающий один аргумент `name`.
        - конструктор принимающий два аргумента `age` и `name`.
        4. В класс `Cat` добавить методы:
        -  `getters` для всех полей.
        -  `setters` для всех полей.
         */

        Cat tom = new Cat(75,"Tom");
        System.out.println(tom);

        Cat ben = new Cat("Ben");
        System.out.println(ben);

        Cat unknown = new Cat();
        System.out.println(unknown);
    }
}
