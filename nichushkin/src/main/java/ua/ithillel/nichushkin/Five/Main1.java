package ua.ithillel.nichushkin.Five;
//### Часть 1:
//
//        Создайте класс с именем `Fraction`, содержащий два поля типа `int` - `numerator`(числитель) и
//        `denumerator` (знаменатель) обыкновенной дроби.
//        Создать один конструктор. Он должен принимать значения для обоих полей класса.
//
//        Создайте:
//
//        - Метод `addition`. Метод принимает объект класса `Fraction` и складывает числитель и знаменатель с
//        соответствующими данными того объекта, у которого был вызван этот метод (согласно формуле сложения двух
//        дробей). Метод должен вернуть новый объект класса `Fraction`, в котором находится результат сложения.
//        - Метод `multiply`. Метод принимает число типа `double` и производит умножение текущей дроби (та, у которой
//        был вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`, в котором находится
//        результат умножения.
//        - Метод `division`. Метод принимает число типа `double` и производит деление текущей дроби (та, у которой
//        был вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`, в котором находится
//        результат умножения.

public class Main1 {
    public static void main(String[] args) {
        double randomDouble = 0.75;

        Fraction fraction1 = new Fraction(29, 30);
        Fraction fraction2 = new Fraction(44, 45);
        System.out.println("Результат метода `addition`");
        Fraction fractionAdd = fraction2.addition(fraction1);
        System.out.println(fractionAdd);
        System.out.println("Результат метода `multiply`");
        Fraction fractionMultiplyValue = fraction1.multiply(randomDouble);
        System.out.println(randomDouble);
        System.out.println(fractionMultiplyValue);
        System.out.println("Результат метода `division`");
        Fraction fractionDividion = fraction1.division(randomDouble);
        System.out.println(fractionDividion);


//        System.out.println(fraction2.addition(fraction1).toString());
//        Fraction fraction3 = new Fraction(4, 6);
//        Fraction fraction4 = new Fraction(2, 4);
//        System.out.println(fraction4.addition(fraction3));
//        Fraction fraction5 = new Fraction(6000, 60000);
//        Fraction fraction6 = new Fraction(9000, 90000);
//        System.out.println(fraction6.addition(fraction5));
    }
}
