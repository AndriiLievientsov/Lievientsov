package ua.ithillel.chernovol.four.ClassesPartThree.taskSix.com.company.details;

public class Engine {
    private int Power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        Power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return Power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
