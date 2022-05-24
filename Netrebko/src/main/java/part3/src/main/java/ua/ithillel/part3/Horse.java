package ua.ithillel.part3;

public class Horse extends Animal{
    private String hooves;

    public Horse(String food, String location, String hooves) {
        super(food, location);
        this.hooves = hooves;
    }

    public String getHooves() {
        return hooves;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Horse{" +
                "hooves='" + hooves + '\'' +
                '}';
    }
}
