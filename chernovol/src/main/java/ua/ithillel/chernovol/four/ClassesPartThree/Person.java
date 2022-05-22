package ua.ithillel.chernovol.four.ClassesPartThree;
/**
 * @author Chernovol Alexander
 */

//Создать класс Person, который содержит:
//        поля fullName, age.
//        методы move() и talk(), в которых просто вывести на консоль сообщение -Такой-то Person говорит.
//        Добавьте два конструктора - Person() и Person(fullName, age).
//        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
//        другой - Person(fullName, age).

public class Person {
    String fullName;
    int age;

    public static void main(String[] args) {
        Person alex = new Person("Александр Черновол", 31);
        Person defaultPerson = new Person();

        alex.move();
        alex.talk();
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(){
        this.fullName = "Default name";
        this.age = 0;
    }

    private void move(){
        System.out.println(fullName + " начал идти");
    }
    private void talk(){
        System.out.println(fullName + " говорит: ");
    }
}
