package ua.ithillel.chernovol.five.OOP.PartTwo;

/**
 * @author Chernovol Alexander
 */
public class User {

    final int id;
    int age;
    String firstName;
    String lastName;
    String city;

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

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nAge: " + age + "\nFirst name: " + firstName + "\nLast name: " + lastName +
                "\nCity: " + city;
    }
}
