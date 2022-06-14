package ua.ithillel.iovchev.four.partThree.itemSeven;

public class Cat extends Animal {
    private double maxJumpHeight;

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает.");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }

    public Cat(String food, String location, double maxJumpHeight) {
        super(food, location);
        this.maxJumpHeight = maxJumpHeight;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }
}
