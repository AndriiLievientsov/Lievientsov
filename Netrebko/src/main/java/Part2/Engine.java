package Part2;

public class Engine {
   private String fuel;
   private String coolingMethod;
    private int cylindersAmount;
    private String cylindersArrangement;
    private String combustibleMixtureIgnition;

    public Engine(String fuel, String coolingMethod, int cylindersAmount, String cylindersArrangement, String combustibleMixtureIgnition) {
        this.fuel = fuel;
        this.coolingMethod = coolingMethod;
        this.cylindersAmount = cylindersAmount;
        this.cylindersArrangement = cylindersArrangement;
        this.combustibleMixtureIgnition = combustibleMixtureIgnition;
    }

    public String getFuel() {
        return fuel;
    }

    public String getCoolingMethod() {
        return coolingMethod;
    }

    public int getCylindersAmount() {
        return cylindersAmount;
    }

    public String getCylindersArrangement() {
        return cylindersArrangement;
    }

    public String getCombustibleMixtureIgnition() {
        return combustibleMixtureIgnition;
    }
}
