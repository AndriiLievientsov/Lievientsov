package ua.ithillel.Lievientsov.HomeworkSix.PartOne;
//### Часть 1:
//
//Создайте класс с именем `Fraction`, содержащий два поля типа `int` - `numerator`(числитель)
// и `denominator` (знаменатель) обыкновенной дроби.
//Создать один конструктор. Он должен принимать значения для обоих полей класса.
//
//   Создайте:
//   - Метод `addition`. Метод принимает объект класса `Fraction` и складывает числитель и
//   знаменатель с соответствующими данными того объекта, у которого был вызван этот метод
//   (согласно формуле сложения двух дробей). Метод должен вернуть новый объект класса `Fraction`,
//   в котором находится результат сложения.
//   - Метод `multiply`. Метод принимает число типа `double` и производит умножение текущей дроби
//   (та, у которой был вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`,
//   в котором находится результат умножения.
//   - Метод `division`. Метод принимает число типа `double` и производит деление текущей дроби
//   (та, у которой был вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`,
//   в котором находится результат умножения.

public class Fraction {
    private int numerator;
    private int denominator;

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(12, 28);
        Fraction fraction2 = new Fraction(3, 10);
        Fraction fraction3 = fraction1.addition(fraction2);
        System.out.println("Fraction after addition: " + fraction3);
        System.out.println("Fraction after reductions: " + fraction1.multiply(3));
        System.out.println("Fraction after division by a number: " + fraction2.division(2));
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public Fraction addition(Fraction fraction) {
        Fraction fractionOne = new Fraction(0, 0);
        if (this.denominator == fraction.denominator) {
            fractionOne.numerator = this.numerator + fraction.numerator;
            fractionOne.denominator = this.denominator;
        } else {
            int sum = Math.max(this.denominator, fraction.denominator);
            int fsum = sum;
            while (true) {
                if (sum % this.denominator == 0 && sum % fraction.denominator == 0) {
                    fractionOne.numerator = (this.numerator * (sum / this.denominator)) + (fraction.numerator * (sum / fraction.denominator));
                    fractionOne.denominator = sum;
                    break;
                } else {
                    sum = sum + fsum;
                }
            }
            fractionOne.shortenFraction();
        }
        return fractionOne;
    }

    public Fraction multiply(double value) {
        Fraction fractionTwo = new Fraction(0, 0);
        fractionTwo.numerator = (int) (this.numerator * value);
        fractionTwo.denominator = this.denominator;
        return fractionTwo;
    }

    //Метод деления дроби на число
    public Fraction division(double value) {
        Fraction fractionThree = new Fraction(0, 0);
        fractionThree.numerator = (int) (this.numerator / value);
        fractionThree.denominator = this.denominator;
        return fractionThree;
    }

    public void shortenFraction() {
        int commonDenominator = Math.max(this.numerator, this.denominator);
        while (true) {
            if (this.numerator % commonDenominator == 0 && this.denominator % commonDenominator == 0) {
                this.numerator = this.numerator / commonDenominator;
                this.denominator = this.denominator / commonDenominator;
                break;
            } else {
                commonDenominator--;
            }
        }
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
}
