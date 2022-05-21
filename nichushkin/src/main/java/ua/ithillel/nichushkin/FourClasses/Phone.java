package ua.ithillel.nichushkin.FourClasses;

import java.util.Arrays;

//1. Класс `Phone`.
//   - Создайте класс `Phone`, который содержит поля: `number`, `model` и `weight`.
//   - Создайте три экземпляра этого класса.
//   - Выведите на консоль значения их переменных.
//   - Добавить в класс Phone методы: `receiveCall`, имеет один параметр – имя звонящего.
//   Выводит на консоль сообщение `Звонит {name}`. `getNumber` – возвращает номер телефона.
//   Вызвать эти методы для каждого из объектов.
//   - Добавить конструктор в класс `Phone`, который принимает на вход три параметра для
//   инициализации переменных класса - `number`, `model` и `weight`.
//   - Добавить конструктор, который принимает на вход два параметра для
//   инициализации переменных класса - `number`, `model`.
//   - Добавить конструктор без параметров.
//   - Вызвать из конструктора с двумя параметрами конструктор с тремя параметрами.
//   - Добавьте перегруженный метод `receiveCall`, который принимает два параметра - имя звонящего и
//   номер телефона звонящего. Вызвать этот метод.
//   - Создать метод `sendMessage` с аргументами переменной длины. Данный метод принимает на вход номера
//   телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
//---
public class Phone {

    private int number;
    private String model;
    private double weight;


    public Phone(){
    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(int number, double weight) {
        new Phone(number, model, weight);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.printf("Звонит: %s ", name);
    }

    public void receiveCall(String name, int number){
        System.out.println("Звонит: " + name + ", номер телефона: " + number);
    }

    public void getNumber(){
        System.out.println(number);
    }

    public void sendMessage(int[] number){
        System.out.println(Arrays.toString(number));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
