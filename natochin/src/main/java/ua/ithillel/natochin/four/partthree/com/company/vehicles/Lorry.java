package ua.ithillel.natochin.four.partthree.com.company.vehicles;


import ua.ithillel.natochin.four.partthree.com.company.details.*;
import ua.ithillel.natochin.four.partthree.com.company.professions.Driver;

public class Lorry extends Car {
    private Double capacity;

    public Lorry(String brand, String type, Double weight, Driver driver, Engine engine, Double capacity){
        super(brand, type, weight, driver, engine);
        this.capacity = capacity;
    }

    @Override
    public void printInfo(){
        System.out.println(this.type + " " + this.brand + " (engine: " + this.engine + ")"
                +" empty weight: " + this.weight + ", cargo capacity: " + this.capacity + " mt; "
                + "operated by" + this.driver);
    }
}
