package ua.ithillel.part3;

public class Cat extends Animal{
    private String afraidWater;

    public Cat(String food, String location, String afraidWater) {
        super(food, location);
        this.afraidWater = afraidWater;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public String getAfraidWater() {
        return afraidWater;
    }
}
