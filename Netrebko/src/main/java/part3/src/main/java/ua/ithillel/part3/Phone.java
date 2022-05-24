//1. Класс `Phone`.
//        - Создайте класс `Phone`, который содержит поля: `number`, `model` и `weight`.
//        - Создайте три экземпляра этого класса.
//        - Выведите на консоль значения их переменных.
//        - Добавить в класс Phone методы: `receiveCall`, имеет один параметр – имя звонящего. Выводит на консоль
//        сообщение `Звонит {name}`. `getNumber` – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//        - Добавить конструктор в класс `Phone`, который принимает на вход три параметра для инициализации переменных
//        класса - `number`, `model` и `weight`.
//        - Добавить конструктор, который принимает на вход два параметра для инициализации переменных
//        класса - `number`, `model`.
//        - Добавить конструктор без параметров.
//        - Вызвать из конструктора с двумя параметрами конструктор с тремя параметрами.
//        - Добавьте перегруженный метод `receiveCall`, который принимает два параметра - имя звонящего и номер
//        телефона звонящего. Вызвать этот метод.
//        - Создать метод `sendMessage` с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
//        которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
        package ua.ithillel.part3;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public Phone(int number , int weight){
        this(number , "sony" , weight);

    }
    public void  receiveCall(){
           System.out.println("Calling {name}");
    }
    public int getNumber(int number){
        return number;
    }
    public void  receiveCall(int number, String name){
    System.out.println(number + name ) ;

    }
    public void sendMessage(int number){
        System.out.println(number);
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
