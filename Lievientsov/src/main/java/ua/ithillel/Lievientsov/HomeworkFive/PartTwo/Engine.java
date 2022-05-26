package ua.ithillel.Lievientsov.HomeworkFive.PartTwo;

//3. Создать класс `Engine`.
//4. В класс `Engine` добавить:
//   -  Поля: `fuel (char[])`, `coolingMethod (char[])`, `cylindersAmount (int)`, `cylindersArrangement (char[])`
//   , `combustibleMixtureIgnition (char[])`.
//   -  Конструктор, который принимает все свойства класса.
//   -  `getter`-ы для всех полей.

public class Engine {
    private String fuel;
    private String coolingMethod;
    private int cylindersAmount;
    private String cylindersArrangement;
    private String combustibleMixtureIgnition;

    public Engine(String fuel, String coolingMethod, int cylindersAmount, String cylindersArrangement,
                  String combustibleMixtureIgnition) {
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
