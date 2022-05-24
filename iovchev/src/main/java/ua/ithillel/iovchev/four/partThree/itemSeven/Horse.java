package ua.ithillel.iovchev.four.partThree.itemSeven;

public class Horse extends Animal{
    private double maxSpeed;

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет.");
    }

    @Override
    public void eat() {
        System.out.println("Лощадь ест");
    }

    public Horse(String food, String location, double maxSpeed) {
        super(food, location);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
