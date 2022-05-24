package ua.ithillel.iovchev.four.partThree.itemSeven;

public class Dog extends Animal{
    private double maxJumpDistance;


    @Override
    public void makeNoise() {
        System.out.println("Собака лает.");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    public Dog(String food, String location, double maxJumpDistance) {
        super(food, location);
        this.maxJumpDistance = maxJumpDistance;
    }

    public double getMaxJumpDistance() {
        return maxJumpDistance;
    }
}
