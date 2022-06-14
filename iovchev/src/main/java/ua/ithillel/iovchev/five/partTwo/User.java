package ua.ithillel.iovchev.five.partTwo;

public class User {
    private final int id;
    private int age;
    private String firstName;
    private String lastName;
    private String city;

    public User(int id, int age, String firstName, String lastName, String city) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

}
