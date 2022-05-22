package ua.ithillel.Lievientsov.HomeworkFive.PartThree;

//### Часть 3:
//
//1. Класс `Phone`.
//   - Создайте класс `Phone`, который содержит поля: `number`, `model` и `weight`.
//   - Создайте три экземпляра этого класса.
//   - Выведите на консоль значения их переменных.
//   - Добавить в класс Phone методы: `receiveCall`, имеет один параметр – имя звонящего.
//   Выводит на консоль сообщение `Звонит {name}`. `getNumber` – возвращает номер телефона.
//   Вызвать эти методы для каждого из объектов.
//   - Добавить конструктор в класс `Phone`, который принимает на вход три параметра
//   для инициализации переменных класса - `number`, `model` и `weight`.
//   - Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
//   `number`, `model`.
//   - Добавить конструктор без параметров.
//   - Вызвать из конструктора с двумя параметрами конструктор с тремя параметрами.
//   - Добавьте перегруженный метод `receiveCall`, который принимает два параметра -
//   имя звонящего и номер телефона звонящего. Вызвать этот метод.
//   - Создать метод `sendMessage` с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
//   которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
//---

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public static void main(String[] args) {
        Phone phoneOne = new Phone("0958889511", "IPhone", 185.1);
        Phone phoneTwo = new Phone("759633", "Disk");
        Phone phoneThree = new Phone();
        System.out.println(phoneOne);
        System.out.println(phoneTwo);
        System.out.println(phoneThree);

        phoneOne.receiveCall("Max");
        System.out.println(phoneOne.getNumber() + "\n");
        phoneTwo.receiveCall("Cally");
        System.out.println(phoneTwo.getNumber() + "\n");
        phoneThree.receiveCall("Den");
        System.out.println(phoneThree.getNumber() + "\n");

        phoneTwo.receiveCall("Mark", "55557");
        phoneOne.sendMessage("05154", "545456", "75", "565566999", "55557");
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = "no number";
        this.model = "no model";
        this.weight = 0;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Calling: " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calling: " + name + "\n" +
                "Number: " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("\n" + "Send messages to the numbers: " +
                Arrays.toString(numbers));
    }

    @Override
    public String toString() {
        return "Phone number: " + number + "\n" +
                "Phone model: " + model + "\n" +
                "Phone weight: " + weight + "\n";
    }

}
