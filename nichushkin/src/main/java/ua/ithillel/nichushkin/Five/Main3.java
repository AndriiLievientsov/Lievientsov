package ua.ithillel.nichushkin.Five;

import java.util.Arrays;

//### Часть 3:
//
//        Создайте `superclass` `Shape` и его наследников `Circle`, `Rectangle`. Класс Shape содержит абстрактный
//        метод draw() и поле хранящее цвет. Классы `Circle`, `Rectangle` содержат координаты точек. Создать массив
//        содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw). Нарисовать значит вывод в консоль сообщения
//        об фигуре.
public class Main3 {
    public static void main(String[] args) {
        Shape[] shape = new Shape[6];
        shape[0] = new Rectangle(1, 2);
        shape[1] = new Rectangle(2,4);
        shape[3] = new Circle(9, 9);
        shape[4] = new Circle(4,1);
        shape[5] = new Rectangle(3,6);
s
        for (int i = 0; i < shape.length; i++) {

        }

    }
}
