package ua.ithillel.chernovol.five.OOP.PartTwo;

/**
 * @author Chernovol Alexander
 */
public class App {

    //    Создать классы - User и UserFactory:
//
//    Поля класса User:
//
//    id (int),
//    age (int),
//    firstName (String),
//    lastName (String),
//    city (String).
//    Создать один конструктор, который принимает все данные пользователя (Имеется в виду что аргументов столько,
//    сколько полей в классе). Поле id нельзя менять после создания объекта (Поле должно быть final и не должно
//    быть setter-а). Создать getter-ы и setter-ы для полей (Кроме поля id).
//
//    В классе UserFactory создать:
//
//    статическое поле nextId типа int (Только статическое! final делать не нужно).
//    метод createUser, который будет создавать и возвращать объект класса User.
//    Для значения поля id (для передачи в конструктор) в классе User использовать значение статического поля в
//    классе UserFactory. После каждого создания объекта класса User значение поля nextId должно быть увеличено на 1.
//
//    Создать пользователя, использовав статический метод createUser класса UserFactory.
    public static void main(String[] args) {

        User userV = UserFactory.createUser(10, "Vasya", "Pupa", "Dnipro");
        User userP = UserFactory.createUser(12, "Petya", "Pyatkin", "Kharkiv");
        User userA = UserFactory.createUser(30, "Sasha", "Chernovol", "Lugansk");

        System.out.println(userV);
        System.out.println(userP);
        System.out.println(userA);
    }
}
