package ua.ithillel.natochin.four.partthree.person;

public class Person {
    private String fullName;
    private int age;

    public Person(){
        this ("John Doe", 0);
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = (age < 0) ? 0 : age;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getAge(){
        return this.age;
    }

    public void move(){
        System.out.println(this + " is moving.");
    }

    public void talk(){
        System.out.println(this + " is talking.");
    }

    @Override
    public String toString(){
        return this.fullName + " (" + this.getAge() + " y.o.)";
    }
}
