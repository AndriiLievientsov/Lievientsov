package ua.ithillel.Lievientsov.HomeworkSix.PartTwo;

public class UserFactory {
    private static int nextId = 0;

    public static User createNewUser(int age, String firstName, String lastName, String city) {
        nextId++;
        User user;
        user = new User(nextId, age, firstName, lastName, city);
        return user;
    }
}
