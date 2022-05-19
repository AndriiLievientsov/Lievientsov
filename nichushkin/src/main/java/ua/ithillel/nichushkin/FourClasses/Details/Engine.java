package ua.ithillel.nichushkin.FourClasses.Details;

public class Engine {
    private int power;
    private int productivity;

    public Engine(int power, int productivity){
        this.power = power;
        this.productivity = productivity;
    }

    @Override
    public String toString() {
        return "мощность: " + power +
                ", продуктивность: " + productivity;
    }
}
