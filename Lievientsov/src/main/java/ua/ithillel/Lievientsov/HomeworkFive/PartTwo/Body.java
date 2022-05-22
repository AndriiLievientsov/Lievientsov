package ua.ithillel.Lievientsov.HomeworkFive.PartTwo;

//### Часть 2:
//
//1. Создать класс `Body`.
//2. В класс `Body` добавить:
//   -  Поля: `type (char[])`, `material (char[])`.
//   -  Конструктор, который принимает все свойства класса.
//   -  `getter`-ы для всех полей.

public class Body {
    private String type;
    private  String material;

    public Body(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }
}
