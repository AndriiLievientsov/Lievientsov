package ua.ithillel.iovchev.five.partOne;

/*
        Создайте класс с именем `Fraction`, содержащий два поля типа `int` - `numerator`(числитель) и
        `denumerator` (знаменатель) обыкновенной дроби. Создать один конструктор. Он должен принимать значения для обоих полей класса.
     Создайте:
     - Метод `addition`. Метод принимает объект класса `Fraction` и складывает числитель и знаменатель с соответствующими
        данными того объекта, у которого был вызван этот метод (согласно формуле сложения двух дробей). Метод должен
        вернуть новый объект класса `Fraction`, в котором находится результат сложения.
   - Метод `multiply`. Метод принимает число типа `double` и производит умножение текущей дроби
        (та, у которой был вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`,
        в котором находится результат умножения.
   - Метод `division`. Метод принимает число типа `double` и производит деление текущей дроби
        (та, у которой был вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`,
        в котором находится результат умножения.
 */

public class Solution {
    public static void main(String[] args) {
        Fraction fractionOne = new Fraction(2, 5);
        Fraction fractionTwo = new Fraction(3, 5);
        double number = 3.5;

        Fraction fractionAddition = fractionOne.addition(fractionTwo);

        System.out.println(String.format("Результат сложения дробей %d/%d и %d/%d это дробь %d/%d.",
                fractionOne.getNumerator(), fractionOne.getDenumerator(), fractionTwo.getNumerator(), fractionTwo.getDenumerator(),
                fractionAddition.getNumerator(), fractionAddition.getDenumerator()));
        System.out.println("-------------------------------------------------------");

        Fraction fractionMultiplyNumber = fractionOne.multiply(number);

        System.out.println(String.format("Результат умножения дроби %d/%d на число %f это дробь %d/%d.",
                fractionOne.getNumerator(), fractionOne.getDenumerator(), number,
                fractionMultiplyNumber.getNumerator(), fractionMultiplyNumber.getDenumerator()));
        System.out.println("-------------------------------------------------------");

        Fraction fractiondivisionNumber = fractionOne.division(number);

        System.out.println(String.format("Результат умножения дроби %d/%d на число %,.1f это дробь %d/%d.",
                fractionOne.getNumerator(), fractionOne.getDenumerator(), number,
                fractiondivisionNumber.getNumerator(), fractiondivisionNumber.getDenumerator()));
        System.out.println("-------------------------------------------------------");
    }
}
