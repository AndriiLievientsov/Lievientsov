package ua.ithillel.natochin.five.partone;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте класс с именем `Fraction`,
        содержащий два поля типа `int` - `numerator`(числитель) и `denumerator` (знаменатель) обыкновенной дроби.
        Создать один конструктор. Он должен принимать значения для обоих полей класса.
         */

        Fraction fraction1 = new Fraction(2,3);
        System.out.println(fraction1);
        Fraction fraction2 = new Fraction(3,4);
        System.out.println(fraction2);

        /*
        Создайте:
        - Метод `addition`. Метод принимает объект класса `Fraction` и складывает числитель и знаменатель
        с соответствующими данными того объекта,
        у которого был вызван этот метод (согласно формуле сложения двух дробей).
        Метод должен вернуть новый объект класса `Fraction`,
        в котором находится результат сложения.
         */

        Fraction fraction3 = fraction1.addition(fraction2);
        System.out.println(fraction3);

        /*
        - Метод `multiply`. Метод принимает число типа `double` и производит умножение текущей
        дроби (та, у которой был вызван метод) на число.
        Метод должен вернуть новый объект класса `Fraction`, в котором находится результат умножения.
         */

        double num = 1.2;
        Fraction fraction4 = fraction1.multiply(num);
        System.out.println(fraction4);

        /*
        - Метод `division`. Метод принимает число типа `double` и производит деление текущей
        дроби (та, у которой был вызван метод) на число.
        Метод должен вернуть новый объект класса `Fraction`, в котором находится результат умножения.
         */
        Fraction fraction5 = fraction4.division(num);
        System.out.println(fraction5);
    }
}
