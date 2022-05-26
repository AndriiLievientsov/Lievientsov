package ua.ithillel.iovchev.five.partTwo;

public class UserFactory {
    static int nextId;

    public User createUser(int age, String firstName, String lastName, String city) {
        nextId++;
        return new User(nextId, age, firstName, lastName, city);
    }
}
