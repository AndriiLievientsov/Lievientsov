package ua.ithillel.chernovol.five.OOP.PartThree;

/**
 * @author Chernovol Alexander
 */
public class Circle extends Shape {
    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Нарисован круг, его радиус: " + radius + " его цвет: " + color);
    }
}
