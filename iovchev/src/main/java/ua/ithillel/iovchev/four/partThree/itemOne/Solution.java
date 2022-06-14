package ua.ithillel.iovchev.four.partThree.itemOne;

    /* 1. Класс `Phone`.
   - Создайте класс `Phone`, который содержит поля: `number`, `model` и `weight`.
   - Создайте три экземпляра этого класса.
   - Выведите на консоль значения их переменных.
   - Добавить в класс Phone методы: `receiveCall`, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение `Звонит {name}`. `getNumber` – возвращает номер телефона.
        Вызвать эти методы для каждого из объектов.
   - Добавить конструктор в класс `Phone`, который принимает на вход три параметра
        для инициализации переменных класса - `number`, `model` и `weight`.
   - Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - `number`, `model`.
   - Добавить конструктор без параметров.
   - Вызвать из конструктора с двумя параметрами конструктор с тремя параметрами.
   - Добавьте перегруженный метод `receiveCall`, который принимает два параметра - имя звонящего и номер телефона звонящего.
         Вызвать этот метод.
   - Создать метод `sendMessage` с аргументами переменной длины.
        Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
        Метод выводит на консоль номера этих телефонов.*/

public class Solution {
    public static void main(String[] args) {
        Phone phone1 = new Phone("0962568947", "Nokia", 200);
        Phone phone2 = new Phone("0635841236", "Samsung", 150);
        Phone phone3 = new Phone("0502568451", "Motorola", 170);

        System.out.println("First phone model: " + phone1.getModel() + "; number: " + phone1.getNumber() + "; weight: " + phone1.getWeight());
        System.out.println("Second phone model: " + phone2.getModel() + "; number: " + phone2.getNumber() + "; weight: " + phone2.getWeight());
        System.out.println("Third phone model: " + phone3.getModel() + "; number: " + phone3.getNumber() + "; weight: " + phone3.getWeight());

        phone1.receiveCall("Ivanov");
        System.out.println("Number: " + phone1.getNumber());

        phone2.receiveCall("Petrov");
        System.out.println("Number: " + phone2.getNumber());

        phone3.receiveCall("Sidorov");
        System.out.println("Number: " + phone3.getNumber());

        phone1.receiveCall("Ivanov", "0962568947");
        phone2.receiveCall("Petrov", "0635841236");
        phone3.receiveCall("Sidorov", "0502568451");

        phone1.sendMessage("0635841236", "0502568451");

    }
}
