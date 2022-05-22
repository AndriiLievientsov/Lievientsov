package ua.ithillel.nichushkin.Five;

//        В классе `UserFactory` создать:
//        - статическое поле `nextId` типа `int` (Только статическое! `final` делать не нужно).
//        - метод `createUser`, который будет создавать и возвращать объект класса `User`.
//
//        Для значения поля `id` (для передачи в конструктор) в классе `User` использовать значение статического поля
//        в классе `UserFactory`.
//        После каждого создания объекта класса `User` значение поля `nextId` должно быть увеличено на **1**.
//
//        Создать пользователя, использовав статический метод `createUser` класса `UserFactory`.
public class UserFactory {
    private static int nextId;

    public void setNextId(int nextId) {
        UserFactory.nextId = nextId;
    }

    public static int getNextId() {
        return nextId;
    }

    public User createUser(int age, String firstName, String lastName, String city) {
        setNextId(getNextId() + 1);
        return new User(age, firstName, lastName, city);
    }

}
