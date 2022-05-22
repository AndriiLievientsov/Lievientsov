package ua.ithillel.Lievientsov.HomeworkFive.PartThree.com.company.details;

public class Engine {
    private int Power;
    private String Manufacturer;

    public Engine(int power, String manufacturer) {
        Power = power;
        Manufacturer = manufacturer;
    }

    public int getPower() {
        return Power;
    }

    public String getManufacturer() {
        return Manufacturer;
    }
}
