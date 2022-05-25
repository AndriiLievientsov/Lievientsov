package ua.ithillel.chernovol.five.OOP.PartThree;

/**
 * @author Chernovol Alexander
 */
public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract void draw();
}
