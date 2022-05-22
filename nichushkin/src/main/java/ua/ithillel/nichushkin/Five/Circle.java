package ua.ithillel.nichushkin.Five;

public class Circle extends Shape{
    private int center;
    private int radius;

    public Circle(int center, int radius, String color) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Круг с центром в точке ").append(center).append(" радиусом ").append(radius).append(" и цветом ");
        sb.append(getColor());

        System.out.println(sb.toString());
    }
}
