package ua.ithillel.nichushkin.FourClasses;

import java.util.Arrays;

public class Engine {
    char[] fuel;
    char[] coolingMethod;
    int cylindersAmount;
    char[] cylindersArrangement;
    char[] combustibleMixtureIgnition;

    public Engine(char[] fuel, char[] coolingMethod, int cylindersAmount, char[] cylindersArrangement,
                  char[] combustibleMixtureIgnition){
        this.fuel = fuel;
        this.coolingMethod = coolingMethod;
        this.cylindersAmount = cylindersAmount;
        this.cylindersArrangement = cylindersArrangement;
        this.combustibleMixtureIgnition = combustibleMixtureIgnition;
    }

    public char[] getFuel(){
        return fuel;
    }

    public char[] getCoolingMethod(){
        return coolingMethod;
    }

    public int getCylindersAmount(){
        return cylindersAmount;
    }

    public char[] getCylindersArrangement(){
        return cylindersArrangement;
    }

    public char[] getCombustibleMixtureIgnition(){
        return combustibleMixtureIgnition;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuel=" + Arrays.toString(fuel) +
                ", coolingMethod=" + Arrays.toString(coolingMethod) +
                ", cylindersAmount=" + cylindersAmount +
                ", cylindersArrangement=" + Arrays.toString(cylindersArrangement) +
                ", combustibleMixtureIgnition=" + Arrays.toString(combustibleMixtureIgnition) +
                '}';
    }
}
