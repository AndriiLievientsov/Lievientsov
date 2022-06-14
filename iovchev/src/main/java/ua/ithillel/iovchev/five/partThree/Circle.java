package ua.ithillel.iovchev.five.partThree;

public class Circle extends Shape {
    private int[][] array;

    @Override
    void draw() {
        System.out.println("Drawn " + color + " circle with coordinates");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("x: ");
            } else {
                System.out.print("y: ");
            }
            System.out.print(array[i][0]);
            for (int j = 1; j < array[i].length; j++) {
                System.out.print(", " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }

    public Circle(String color, int[][] array) {
        super(color);
        this.array = array;
    }
}
