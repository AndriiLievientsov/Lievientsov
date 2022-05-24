package ua.ithillel.natochin.five.partthree;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте `superclass` `Shape` и его наследников `Circle`, `Rectangle`.
        Класс Shape содержит абстрактный метод draw() и поле хранящее цвет.
        Классы `Circle`, `Rectangle` содержат координаты точек.
        Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
        Нарисовать значит вывод в консоль сообщения об фигуре.
         */

        Shape [] figures = {
                new Circle("green", 1,2,13),
                new Rectangle("white", 1,1,1,3,5,3,5,1),
                new Rectangle("red", 2,-1,2,5,4,5,4,-1),
                new Circle("blue", 5,5,5),};

        for(Shape figure : figures){
            figure.draw();
        }
    }
}
