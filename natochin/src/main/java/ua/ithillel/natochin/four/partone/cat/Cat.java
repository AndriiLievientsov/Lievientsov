package ua.ithillel.natochin.four.partone.cat;

import java.util.Arrays;

public class Cat {
    private int age;
    private char [] name;

    public Cat(){
        this(0,"Unnamed");
    }
    public Cat(int age){
        this(age,"Unnamed");
    }
    public Cat(String name){
        this(0,name);
    }
    public Cat (int age, String name){
        this.setAge(age);
        this.name = name.toCharArray();
    }
    public int getAge(){
        return this.age;
    }
    public char[] getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = (age >= 0) ? age : 0;
    }
    public void setName(String name){
        this.name = name.toCharArray();
    }

    @Override
    public String toString(){
        return "Cat " + Arrays.toString(this.getName()) + ", age " + this.getAge();
    }
}
