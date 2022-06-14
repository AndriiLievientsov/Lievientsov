package ua.ithillel.iovchev.five.partTwo;
/*
Создать классы - `User` и `UserFactory`:
Поля класса `User`:
- `id (int)`,
- `age (int)`,
- `firstName (String)`,
- `lastName (String)`,
- `city (String)`.
Создать один конструктор, который принимает все данные пользователя (Имеется в виду что аргументов столько, сколько полей в классе).
Поле `id` нельзя менять после создания объекта (Поле должно быть `final` и не должно быть `setter`-а).
Создать `getter`-ы и `setter`-ы для полей (Кроме поля `id`).
В классе `UserFactory` создать:
- статическое поле `nextId` типа `int` (Только статическое! `final` делать не нужно).
- метод `createUser`, который будет создавать и возвращать объект класса `User`.
Для значения поля `id` (для передачи в конструктор) в классе `User` использовать значение статического поля в классе `UserFactory`.
После каждого создания объекта класса `User` значение поля `nextId` должно быть увеличено на **1**.
Создать пользователя, использовав статический метод `createUser` класса `UserFactory`.
 */

public class Solution {
    public static void main(String[] args) {
        User user1 = new UserFactory().createUser(22, "John", "Travolta", "New-York");
        User user2 = new UserFactory().createUser(45, "Jonny", "Depth", "LosAngeles");
        User user3 = new UserFactory().createUser(37, "Tom", "Cruz", "Washington");

        System.out.println(String.format("Создан пользователь: \n { id: %d, age: %d, firstName: %s, lastName: %s, city: %s }",
                user1.getId(), user1.getAge(), user1.getFirstName(), user1.getLastName(), user1.getCity()));

        System.out.println(String.format("Создан пользователь: \n { id: %d, age: %d, firstName: %s, lastName: %s, city: %s }",
                user2.getId(), user2.getAge(), user2.getFirstName(), user2.getLastName(), user2.getCity()));

        System.out.println(String.format("Создан пользователь: \n { id: %d, age: %d, firstName: %s, lastName: %s, city: %s }",
                user3.getId(), user3.getAge(), user3.getFirstName(), user3.getLastName(), user3.getCity()));
    }
}
