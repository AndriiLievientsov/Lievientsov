package ua.ithillel.Lievientsov.HomeworkSix.PartTwo;

/* ### Часть 2:

Создать классы - `User` и `UserFactory`:

Поля класса `User`:
- `id (int)`,
- `age (int)`,
- `firstName (String)`,
- `lastName (String)`,
- `city (String)`.
Создать один конструктор, который принимает все данные пользователя (Имеется в виду что аргументов столько,
сколько полей в классе). Поле `id` нельзя менять после создания объекта (Поле должно быть `final`
и не должно быть `setter`-а). Создать `getter`-ы и `setter`-ы для полей (Кроме поля `id`).
В классе `UserFactory` создать:
- статическое поле `nextId` типа `int` (Только статическое! `final` делать не нужно).
- метод `createUser`, который будет создавать и возвращать объект класса `User`.
Для значения поля `id` (для передачи в конструктор) в классе `User` использовать значение статического поля
в классе `UserFactory`. После каждого создания объекта класса `User` значение поля `nextId` должно быть увеличено
на **1**.
Создать пользователя, использовав статический метод `createUser` класса `UserFactory`.*/

public class Main {
    public static void main(String[] args) {
        User[] number = new User[5];
        number[0] = UserFactory.createNewUser(15, "Alex", "Nomad", "Vegas");
        number[1] = UserFactory.createNewUser(25, "Kate", "Johnston", "Vegas");
        number[2] = UserFactory.createNewUser(44, "Den", "McCoy", "Vegas");
        number[3] = UserFactory.createNewUser(71, "Franck", "Pope", "Vegas");
        number[4] = UserFactory.createNewUser(33, "Maksim", "Brown", "Vegas");
        System.out.println("Users list: \n" + "====================");
        for (User user : number) {
            System.out.println(user);
        }
    }
}