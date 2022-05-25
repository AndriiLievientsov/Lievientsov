package ua.ithillel.chernovol.five.OOP.PartTwo;

/**
 * @author Chernovol Alexander
 */
public class UserFactory {
    static int nextId = 0;

    public static User createUser(int age, String firstName, String lastName, String city) {
        nextId++;
        User user = new User(nextId, age, firstName, lastName, city);
        return user;
    }
}
