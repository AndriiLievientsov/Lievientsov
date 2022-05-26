package ua.ithillel.Lievientsov.HomeworkSix.PartThree;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println(color + " circle: \n" +
                "Radius - " + radius + "\nis draw\n" +
                "===============");
    }
}
