//2. Создать класс `Person`, который содержит:
//        - поля `fullName`, `age`.
//        - методы `move()` и `talk()`, в которых просто вывести на консоль сообщение -`Такой-то  Person говорит`.
//        - Добавьте два конструктора  - `Person()` и `Person(fullName, age)`.
//        Создайте два объекта этого класса. Один объект инициализируется конструктором `Person()`,
//        другой - `Person(fullName, age)`.
        package ua.ithillel.part3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void move(){
        System.out.println(fullName + "move");
    }
    public void talk(){
        System.out.println(fullName + "talk");
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
