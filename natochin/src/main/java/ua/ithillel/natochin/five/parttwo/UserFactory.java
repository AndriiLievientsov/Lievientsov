package ua.ithillel.natochin.five.parttwo;

public class UserFactory {
    static int nextId;

    public User createUser(int age, String firstName, String lastName, String city){
        User user = new User(nextId,age,firstName,lastName,city);
        nextId++;
        return user;
    }
}
