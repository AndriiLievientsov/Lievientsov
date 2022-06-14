package ua.ithillel.iovchev.four.partTwo;

    /*3. Создать класс `Engine`.
    4. В класс `Engine` добавить:
        -  Поля: `fuel (char[])`, `coolingMethod (char[])`, `cylindersAmount (int)`,
            `cylindersArrangement (char[])`, `combustibleMixtureIgnition (char[])`.
        -  Конструктор, который принимает все свойства класса.
        -  `getter`-ы для всех полей.*/

public class Engine {
    private char[] fuel;
    private char[] coolingMethod;
    private char[] cylindersArrangement;
    private char[] combustibleMixtureIgnition;
    private int cylindersAmount;

    public Engine(char[] fuel, char[] coolingMethod, char[] cylindersArrangement, char[] combustibleMixtureIgnition, int cylindersAmount) {
        this.fuel = fuel;
        this.coolingMethod = coolingMethod;
        this.cylindersArrangement = cylindersArrangement;
        this.combustibleMixtureIgnition = combustibleMixtureIgnition;
        this.cylindersAmount = cylindersAmount;
    }

    public char[] getFuel() {
        return fuel;
    }

    public char[] getCoolingMethod() {
        return coolingMethod;
    }

    public char[] getCylindersArrangement() {
        return cylindersArrangement;
    }

    public char[] getCombustibleMixtureIgnition() {
        return combustibleMixtureIgnition;
    }

    public int getCylindersAmount() {
        return cylindersAmount;
    }
}
