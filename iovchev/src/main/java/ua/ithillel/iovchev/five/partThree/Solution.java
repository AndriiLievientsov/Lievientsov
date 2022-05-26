package ua.ithillel.iovchev.five.partThree;

/*
Создайте `superclass` `Shape` и его наследников `Circle`, `Rectangle`.
Класс Shape содержит абстрактный метод draw() и поле хранящее цвет.
Классы `Circle`, `Rectangle` содержат координаты точек.
Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
Нарисовать значит вывод в консоль сообщения об фигуре.
 */

public class Solution {
    public static void main(String[] args) {
        int[][] arrayCircle = new int[][]{{1, 2, 3, 4, 5, 6}, {7, 8, 9, 7, 4, 1,}};
        int[][] arrayRectangle = new int[][]{{5, 8, 3, 4, 5, 5}, {3, 8, 1, 7, 4, 9,}};

        Shape circle = new Circle("red", arrayCircle);
        Shape rectangle = new Rectangle("yellow", arrayRectangle);

        Shape[] arrayShape = new Shape[2];
        arrayShape[0] = circle;
        arrayShape[1] = rectangle;
        for (Shape shape : arrayShape) {
            shape.draw();
        }
    }
}
