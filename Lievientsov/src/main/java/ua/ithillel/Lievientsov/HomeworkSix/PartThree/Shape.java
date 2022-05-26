package ua.ithillel.Lievientsov.HomeworkSix.PartThree;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract void draw();
}
