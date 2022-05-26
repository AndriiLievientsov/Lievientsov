package ua.ithillel.Lievientsov.HomeworkSix.PartTwo;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Age: " + age + " years" + "\n" +
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "City: " + city + "\n";
    }
}
