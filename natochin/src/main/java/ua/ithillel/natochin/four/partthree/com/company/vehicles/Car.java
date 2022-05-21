package ua.ithillel.natochin.four.partthree.com.company.vehicles;

import ua.ithillel.natochin.four.partthree.com.company.details.*;
import ua.ithillel.natochin.four.partthree.com.company.professions.Driver;

public class Car {
    protected String brand;
    protected String type;
    protected Double weight;
    protected Driver driver;
    protected Engine engine;

    public Car(String brand, String type, Double weight, Driver driver, Engine engine){
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Go");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void turnRight(){
        System.out.println("Right");
    }

    public void turnLeft(){
        System.out.println("Left");
    }

    public void printInfo(){
        System.out.println(this.type + " " + this.brand + " (engine: " + this.engine + ")"  +" weight: " + this.weight + "; "
                + "operated by" + this.driver);
    }

}
