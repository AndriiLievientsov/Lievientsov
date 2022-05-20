package ua.ithillel.chernovol.four.ClassesPartThree;
/**
 * @author Chernovol Alexander
 */

//Класс Phone.
//        Создайте класс Phone, который содержит поля: number, model и weight.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.

//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//        Выводит на консоль сообщение Звонит {name}. getNumber – возвращает номер телефона.
//        Вызвать эти методы для каждого из объектов.

//        Добавить конструктор в класс Phone, который принимает на вход три параметра
//        для инициализации переменных класса - number, model и weight.

//        Добавить конструктор, который принимает на вход два параметра
//        для инициализации переменных класса - number, model.

//        Добавить конструктор без параметров.
//        Вызвать из конструктора с двумя параметрами конструктор с тремя параметрами.

//        Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего
//        и номер телефона звонящего. Вызвать этот метод.
//        Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
//        которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.

public class Phone {
    String number;
    String model;
    double weight;

    public static void main(String[] args) {
        Phone firstMember = new Phone("0669146637","Xiaomi",206.6);
        Phone secondMember = new Phone("0681158775","Samsung");
        Phone thirdMember = new Phone();

        System.out.println(firstMember);
        System.out.println("------------------");
        System.out.println(secondMember);
        System.out.println("------------------");
        System.out.println(thirdMember);
        System.out.println("------------------");

        firstMember.receiveCall("Саня");
        System.out.println(firstMember.getNumber());

        secondMember.receiveCall("Женя");
        System.out.println(secondMember.getNumber());

        thirdMember.receiveCall("Ксюша");
        System.out.println(thirdMember.getNumber());

        firstMember.receiveCall("Андрей", "0995151065");

        firstMember.sendMessage("0669146637","0681158775","0995151065","0991051795","0955551262");


    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number,model,0);
    }

    public Phone() {
        this.number = "0000000000";
        this.model = "default";
        this.weight = 0;
    }

    public String getNumber() {
        return number;
    }

    private void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    private void receiveCall(String name, String number){
        System.out.println("Звонит: " + name + " Номер :" + number);
    }
    private void sendMessage(String ... numbers){
        String str="Отправить сообщения номерам: ";
        for (String s: numbers) {
            str += "\n" + s;
        }
        System.out.println(str);
    }

    public String toString(){
        return "Номер телефона: " + number +
                "\nМодель телефона: " + model +
                "\nВес телефона: " + weight;
    }
}
