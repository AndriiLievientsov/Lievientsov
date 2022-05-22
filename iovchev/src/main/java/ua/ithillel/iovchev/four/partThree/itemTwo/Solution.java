package ua.ithillel.iovchev.four.partThree.itemTwo;

    /* 2. Создать класс `Person`, который содержит:
        - поля `fullName`, `age`.
        - методы `move()` и `talk()`, в которых просто вывести на консоль сообщение -`Такой-то  Person говорит`.
        - Добавьте два конструктора  - `Person()` и `Person(fullName, age)`.
       Создайте два объекта этого класса. Один объект инициализируется конструктором `Person()`, другой - `Person(fullName, age)`. */

public class Solution {
    public static void main(String[] args) {
        Person person1 = new Person();

        Person person2 = new Person("Ivanov Ivan Ivanovich", 27);
        person2.move();
        person2.talk();
    }
}
