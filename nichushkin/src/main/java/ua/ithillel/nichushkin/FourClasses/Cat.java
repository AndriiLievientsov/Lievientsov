package ua.ithillel.nichushkin.FourClasses;


public class Cat extends Animal {
    private String meowTone;

    public Cat(String food, String location, String meowTone) {
        super(food, location);
        this.meowTone = meowTone;
    }

    public String getMeowTone() {
        return meowTone;
    }

    public void setMeowTone(String meowTone) {
        this.meowTone = meowTone;
    }

    public void makeNoise() {
        System.out.println("Кот издает звук");
    }

    public void eat() {
        System.out.println("Кот ест");
    }
}
