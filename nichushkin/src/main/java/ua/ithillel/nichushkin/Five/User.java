package ua.ithillel.nichushkin.Five;
//        Поля класса `User`:
//        - `id (int)`,
//        - `age (int)`,
//        - `firstName (String)`,
//        - `lastName (String)`,
//        - `city (String)`.
//
//        Создать один конструктор, который принимает все данные пользователя
//        (Имеется в виду что аргументов столько, сколько полей в классе).
//        Поле `id` нельзя менять после создания объекта (Поле должно быть `final` и не должно быть `setter`-а).
//        Создать `getter`-ы и `setter`-ы для полей (Кроме поля `id`).

//        Для значения поля `id` (для передачи в конструктор) в классе `User` использовать значение статического поля
//        в классе `UserFactory`.
//        После каждого создания объекта класса `User` значение поля `nextId` должно быть увеличено на **1**.
public class User {
    private final int id;
    private int age;
    private String firstName;
    private String lastName;
    private String city;


    public User(int age, String firstName, String lastName, String city) {
        this.id = UserFactory.getNextId();
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
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
