package ua.ithillel.natochin.five.partthree;

public class Rectangle extends Shape {
    private int abscissaA;
    private int ordinateA;
    private int abscissaB;
    private int ordinateB;
    private int abscissaC;
    private int ordinateC;
    private int abscissaD;
    private int ordinateD;

    public Rectangle(String color, int xA, int yA, int xB,int yB, int xC, int yC, int xD, int yD){
        super(color);
        this.abscissaA = xA;
        this.ordinateA = yA;
        this.abscissaB = xB;
        this.ordinateB = yB;
        this.abscissaC = xC;
        this.ordinateC = yC;
        this.abscissaD = xD;
        this.ordinateD = yD;
    }

    public void draw(){
        System.out.println(this.getColor() + " rectangle ABCD; coordinates: "
                + "A(" + this.abscissaA + "," + this.ordinateA + "), "
                + "B(" + this.abscissaB + "," + this.ordinateB + "), "
                + "C(" + this.abscissaC + "," + this.ordinateC + "), "
                + "D(" + this.abscissaD + "," + this.ordinateD + ")"
        );
    }
}
