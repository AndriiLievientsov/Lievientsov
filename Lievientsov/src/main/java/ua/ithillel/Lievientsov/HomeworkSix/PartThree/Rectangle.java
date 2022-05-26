package ua.ithillel.Lievientsov.HomeworkSix.PartThree;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println(color + " rectangle: \n" +
                "height - " + height + "\n" +
                "width - " + width +
                "\nis draw");
    }
}
