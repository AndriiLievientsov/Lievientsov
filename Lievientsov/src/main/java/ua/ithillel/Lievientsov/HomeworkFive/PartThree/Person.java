package ua.ithillel.Lievientsov.HomeworkFive.PartThree;

//2. Создать класс `Person`, который содержит:
//   - поля `fullName`, `age`.
//   - методы `move()` и `talk()`, в которых просто вывести на консоль сообщение
//   -`Такой-то  Person говорит`.
//   - Добавьте два конструктора  - `Person()` и `Person(fullName, age)`.
//Создайте два объекта этого класса. Один объект инициализируется конструктором `Person()`,
// другой - `Person(fullName, age)`.

public class Person {
    private String fullName;
    private int age;

    public static void main(String[] args) {
        Person person1 = new Person("Gordon", 45);
        Person person2 = new Person();
        person1.move();
        person1.talk();

    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " goes");
    }

    public void talk() {
        System.out.println(fullName + " says");
    }
}
