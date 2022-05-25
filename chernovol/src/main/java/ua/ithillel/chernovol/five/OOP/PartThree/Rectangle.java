package ua.ithillel.chernovol.five.OOP.PartThree;

/**
 * @author Chernovol Alexander
 */
public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        if (width == height)
            System.out.println("Нарисован квадрат, его стороны равны: " + height + " его цвет: " + color);
        else
            System.out.println("Нарисован прямоугольник, его высота: " + height + " его ширина: " + width +
                    " его цвет: " + color);
    }
}
