package ua.ithillel.Lievientsov.HomeworkEight.PartTwo;
/*
* **Часть 3:**
3.1 Создайте класс `User` со следующими полями: `id`, `name`, `email`, `password`. напишите утилитный (`static`)
*  метод
`public static List<User> findDuplicates(List<User> collA, List<User> collB)`;
который возвращает дубликаты пользователей, которые есть в обеих коллекциях. Одинаковыми считаем пользователей,
* у которых совпадают 2 поля: `id`, `email`.
* */

import java.util.ArrayList;
import java.util.List;

public class ListThree {
    public static void main(String[] args) {
        List<User> collA = new ArrayList<>();
        List<User> collB = new ArrayList<>();

        collA.add(new User(1, "James", "email@1", "pass1"));
        collA.add(new User(0, "Robert", "email@1", "pass2"));
        collA.add(new User(1, "John", "email@2", "pass3"));
        collA.add(new User(0, "Michael", "email@3", "pass4"));
        collA.add(new User(1, "Tomas", "email@4", "pass5"));

        collB.add(new User(1, "Andrew", "email@1", "pass1"));
        collB.add(new User(0, "Joshua", "email@3", "pas123"));
        collB.add(new User(1, "Kenneth", "email@2", "pass2"));
        collB.add(new User(0, "Brian", "email@4", "pass72"));
        collB.add(new User(1, "Jason", "email@5", "pass5"));

        System.out.println("Duplicate user: \n");
        for (User user : findDuplicates(collA, collB)) {
            System.out.print("Id: " + user.getId() +
                    ", Name: " + user.getName() +
                    ", Email: " + user.getEmail() +
                    ", Password: " + user.getPassword() +
                    "\n");
        }
    }

    //метод который возвращает дубликаты пользователей
    public static List<User> findDuplicates(List<User> collA, List<User> collB) {
        List<User> duplicateUsers = new ArrayList<>();
        for (User user : collA) {
            for (User value : collB) {
                if (user.getId() == value.getId() && user.getEmail().equals(value.getEmail())) {
                    duplicateUsers.add(user);
                    duplicateUsers.add(value);
                }
            }
        }
        return duplicateUsers;
    }
}


