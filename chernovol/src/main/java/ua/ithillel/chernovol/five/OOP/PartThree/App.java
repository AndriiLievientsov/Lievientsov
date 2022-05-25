package ua.ithillel.chernovol.five.OOP.PartThree;

/**
 * @author Chernovol Alexander
 */
//Создайте superclass Shape и его наследников Circle, Rectangle. Класс Shape содержит абстрактный метод draw() и
// поле хранящее цвет. Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
// В цикле нарисовать их (вызвать метод draw). Нарисовать значит вывод в консоль сообщения об фигуре.
public class App {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Красный", 4);
        shapes[1] = new Rectangle("Зеленый", 5, 5);
        shapes[2] = new Circle("Чёрный", 7);
        shapes[3] = new Rectangle("Белый", 8, 2);

        for (Shape s : shapes)
            s.draw();
    }
}
