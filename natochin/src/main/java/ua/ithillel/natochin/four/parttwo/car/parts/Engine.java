package ua.ithillel.natochin.four.parttwo.car.parts;

import java.util.Arrays;

public class Engine {
    private char[] fuel;
    private char[] coolingMethod;
    private int cylindersAmount;
    private char[] cylindersArrangement;
    private char[] combustibleMixtureIgnition;

    public Engine(String fuel, String coolingMethod, int cylindersAmount, String cylindersArrangement,
                  String combustibleMixtureIgnition){
        this.fuel = fuel.toCharArray();
        this.coolingMethod = coolingMethod.toCharArray();
        this.cylindersAmount = cylindersAmount;
        this.cylindersArrangement = cylindersArrangement.toCharArray();
        this.combustibleMixtureIgnition = combustibleMixtureIgnition.toCharArray();
    }

    public char[] getFuel() {
        return this.fuel;
    }

    public char[] getCoolingMethod() {
        return this.coolingMethod;
    }

    public int getCylindersAmount() {
        return this.cylindersAmount;
    }

    public char[] getCylindersArrangement() {
        return this.cylindersArrangement;
    }

    public char[] getCombustibleMixtureIgnition() {
        return this.combustibleMixtureIgnition;
    }

    @Override
    public String toString(){
        return "Engine is " + Arrays.toString(this.getFuel());
    }
}
