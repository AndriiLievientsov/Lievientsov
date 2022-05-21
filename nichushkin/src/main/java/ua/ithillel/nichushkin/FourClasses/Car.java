package ua.ithillel.nichushkin.FourClasses;

import java.util.Arrays;

public class Car {
    Body body;
    Engine engine;
    Transmission transmission;

    public Car(Body body, Engine engine, Transmission transmission){
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Body body(){
        return body;
    }

    public Engine engine(){
        return engine;
    };

    public Transmission transmission(){
        return transmission;
    }



    @Override
    public String toString() {
        return "Car: \n" +
                body.toString() + "\n" +
                engine.toString() + "\n" +
                transmission.toString();
    }
}