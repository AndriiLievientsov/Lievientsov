package ua.ithillel.nichushkin.Five;

public class Circle extends Shape{
    private int center;
    private int radius;

    public Circle(int center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Круг");
    }
}
