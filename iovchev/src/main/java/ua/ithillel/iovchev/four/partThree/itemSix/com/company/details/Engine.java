package ua.ithillel.iovchev.four.partThree.itemSix.com.company.details;

public class Engine {
    private double power;
    private String manufacture;

    public Engine(double power, String manufacture) {
        this.power = power;
        this.manufacture = manufacture;
    }

    public double getPower() {
        return power;
    }

    public String getManufacture() {
        return manufacture;
    }
}
