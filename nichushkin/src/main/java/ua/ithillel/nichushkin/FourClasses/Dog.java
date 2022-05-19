package ua.ithillel.nichushkin.FourClasses;

public class Dog extends Animal {
    private String barkingTone;

    public Dog(String food, String location, String barkingTone) {
        super(food, location);
        this.barkingTone = barkingTone;
    }

    public String getBarkingTone() {
        return barkingTone;
    }

    public void setBarkingTone(String barkingTone) {
        this.barkingTone = barkingTone;
    }

    public void makeNoise() {
        System.out.println("Собака издает звук");
    }

    public void eat() {
        System.out.println("Собака ест");
    }
}
