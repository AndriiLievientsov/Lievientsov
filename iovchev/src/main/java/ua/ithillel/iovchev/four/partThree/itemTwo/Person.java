package ua.ithillel.iovchev.four.partThree.itemTwo;

public class Person {
    private String fullName;
    private int age;

    public void move() {
        System.out.println(fullName + " идет.");
    }

    public void talk() {
        System.out.println(fullName + " говорит.");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
