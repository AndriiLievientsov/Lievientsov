package ua.ithillel.natochin.five.partthree;

public class Circle extends Shape {
    private int centerX;
    private int centerY;
    private int radius;

    public Circle(String color, int x, int y, int r){
        super(color);
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
    }

    public int getCenterX(){
        return this.centerX;
    }

    public int getCenterY(){
        return this.centerY;
    }

    public int getRadius(){
        return this.radius;
    }

    public void draw(){
        System.out.println(this.getColor() +" circle, center coordinates: x=" + this.getCenterX() + ", y=" + this.getCenterY()
                + ", radius: " + this.getRadius());
    }

}
