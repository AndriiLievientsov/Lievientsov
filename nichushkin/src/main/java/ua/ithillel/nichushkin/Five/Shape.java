package ua.ithillel.nichushkin.Five;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }


    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw();
}
