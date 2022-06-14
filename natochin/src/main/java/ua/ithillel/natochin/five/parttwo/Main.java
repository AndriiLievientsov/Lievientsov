package ua.ithillel.natochin.five.parttwo;

public class Main {
    public static void main(String[] args) {
        /*
        Создать классы - `User` и `UserFactory`:

        Поля класса `User`:
        - `id (int)`,
        - `age (int)`,
        - `firstName (String)`,
        - `lastName (String)`,
        - `city (String)`.

        Создать один конструктор, который принимает все данные пользователя (Имеется в виду что аргументов столько,
        сколько полей в классе).
        Поле `id` нельзя менять после создания объекта (Поле должно быть `final` и не должно быть `setter`-а).
        Создать `getter`-ы и `setter`-ы для полей (Кроме поля `id`).

        В классе `UserFactory` создать:
        - статическое поле `nextId` типа `int` (Только статическое! `final` делать не нужно).
        - метод `createUser`, который будет создавать и возвращать объект класса `User`.

        Для значения поля `id` (для передачи в конструктор) в классе `User` использовать значение статического
        поля в классе `UserFactory`.
        После каждого создания объекта класса `User` значение поля `nextId` должно быть увеличено на **1**.

        Создать пользователя, использовав статический метод `createUser` класса `UserFactory`.
         */
        UserFactory userFactory= new UserFactory();
        User user = userFactory.createUser(20,"test","test", "test");
        User user1 = userFactory.createUser(20,"test1","test1", "test1");
        User user2 = userFactory.createUser(20,"test2","test2", "test2");
        User user3 = userFactory.createUser(26,"test3","test3", "test3");

        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

    }
}
