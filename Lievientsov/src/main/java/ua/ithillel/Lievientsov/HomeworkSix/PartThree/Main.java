package ua.ithillel.Lievientsov.HomeworkSix.PartThree;

/*### Часть 3:
Создайте `superclass` `Shape` и его наследников `Circle`, `Rectangle`. Класс Shape содержит абстрактный метод draw()
и поле хранящее цвет. Классы `Circle`, `Rectangle` содержат координаты точек. Создать массив содержащий эти фигуры.
В цикле нарисовать их (вызвать метод draw). Нарисовать значит вывод в консоль сообщения об фигуре.*/
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("Green", 7);
        shapes[1] = new Rectangle("Black", 10, 36);
        for (Shape a : shapes)
            a.draw();
    }
}

