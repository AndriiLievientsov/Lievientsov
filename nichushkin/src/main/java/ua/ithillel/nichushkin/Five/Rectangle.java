package ua.ithillel.nichushkin.Five;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int weidth, int height, String color) {
        super(color);
        this.width = weidth;
        this.height = height;
    }

    @Override

    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Прямоугольник со сторонами ").append(width).append(" и ").append(height).append(", цветом ");
        sb.append(getColor());

        System.out.println(sb.toString());
    }
}
