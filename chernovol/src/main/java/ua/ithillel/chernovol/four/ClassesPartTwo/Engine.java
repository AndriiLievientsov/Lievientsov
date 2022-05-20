package ua.ithillel.chernovol.four.ClassesPartTwo;

/**
 * @author Chernovol Alexander
 */

public class Engine {
    String fuel;
    String coolingMethod;
    int cylindersAmount;
    String cylindersArrangement;
    String combustibleMixtureIgnition;

    public Engine(String fuel, String coolingMethod, int cylindersAmount,
                  String cylindersArrangement, String combustibleMixtureIgnition) {
        this.fuel = fuel;
        this.coolingMethod = coolingMethod;
        this.cylindersAmount = cylindersAmount;
        this.cylindersArrangement = cylindersArrangement;
        this.combustibleMixtureIgnition = combustibleMixtureIgnition;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getCoolingMethod() {
        return coolingMethod;
    }

    public void setCoolingMethod(String coolingMethod) {
        this.coolingMethod = coolingMethod;
    }

    public int getCylindersAmount() {
        return cylindersAmount;
    }

    public void setCylindersAmount(int cylindersAmount) {
        this.cylindersAmount = cylindersAmount;
    }

    public String getCylindersArrangement() {
        return cylindersArrangement;
    }

    public void setCylindersArrangement(String cylindersArrangement) {
        this.cylindersArrangement = cylindersArrangement;
    }

    public String getCombustibleMixtureIgnition() {
        return combustibleMixtureIgnition;
    }

    public void setCombustibleMixtureIgnition(String combustibleMixtureIgnition) {
        this.combustibleMixtureIgnition = combustibleMixtureIgnition;
    }
}
