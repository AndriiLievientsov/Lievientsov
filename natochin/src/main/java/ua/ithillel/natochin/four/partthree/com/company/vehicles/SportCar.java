package ua.ithillel.natochin.four.partthree.com.company.vehicles;


import ua.ithillel.natochin.four.partthree.com.company.details.*;
import ua.ithillel.natochin.four.partthree.com.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String brand, String type, Double weight, Driver driver, Engine engine, int maxSpeed){
        super(brand, type, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printInfo(){
        System.out.println(this.type + " " + this.brand + " (engine: " + this.engine + ")"
                + " max. speed: " + this.maxSpeed +"mph., weight: " + this.weight + "; "
                + "operated by" + this.driver);
    }
}
