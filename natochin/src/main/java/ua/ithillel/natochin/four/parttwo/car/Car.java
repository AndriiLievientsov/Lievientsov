package ua.ithillel.natochin.four.parttwo.car;

import ua.ithillel.natochin.four.parttwo.car.parts.*;


public class Car {
    private Body body;
    private Engine engine;
    private Transmission transmission;

    public Car(Body body, Engine engine, Transmission transmission){
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Body getBody(){
        return this.body;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Transmission getTransmission(){
        return this.transmission;
    }

    @Override
    public String toString(){
        return "The car is " + this.getBody() + "; " + this.getEngine() + ", it's " + this.getTransmission();
    }
}
