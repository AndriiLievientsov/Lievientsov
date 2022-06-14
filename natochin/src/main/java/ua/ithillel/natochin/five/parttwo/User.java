package ua.ithillel.natochin.five.parttwo;

public class User {
    final private int id;
    private int age;
    private String firstName;
    private String lastName;
    private String city;

    public User (int id, int age, String firstName, String lastName, String city){
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public int getId(){
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getCity(){
        return this.city;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setCity(String city){
        this.city = city;
    }

    @Override
    public String toString(){
        return this.getFirstName() + " " + this.lastName + " (ID " + this.getId() + ")";
    }





}
