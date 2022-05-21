package ua.ithillel.nichushkin.Third;
//### Часть 1:
//
//        Создайте класс с именем `Fraction`, содержащий два поля типа `int` - `numerator`(числитель) и `denumerator`
//        (знаменатель) обыкновенной дроби.
//        Создать один конструктор. Он должен принимать значения для обоих полей класса.
//
//        Создайте:
//
//        - Метод `addition`. Метод принимает объект класса `Fraction` и складывает числитель и знаменатель с
//        соответствующими данными того объекта, у которого был вызван этот метод (согласно формуле сложения двух
//        дробей). Метод должен вернуть новый объект класса `Fraction`, в котором находится результат сложения.
//        - Метод `multiply`. Метод принимает число типа `double` и производит умножение текущей дроби (та, у которой
//        был вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`, в котором находится результат
//        умножения.
//        - Метод `division`. Метод принимает число типа `double` и производит деление текущей дроби (та, у которой был
//        вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`, в котором находится результат
//        умножения.

public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenumerator() {
        return denumerator;
    }

    public void setDenumerator(int denumerator) {
        this.denumerator = denumerator;
    }

    //        - Метод `addition`. Метод принимает объект класса `Fraction` и складывает числитель и знаменатель с
//        соответствующими данными того объекта, у которого был вызван этот метод (согласно формуле сложения двух
//        дробей). Метод должен вернуть новый объект класса `Fraction`, в котором находится результат сложения.
    public Fraction addition(Fraction fraction) {
        int resaultAddDenumerator = 0;
        int resaultAddNumerator = 0;
        Fraction fractionTemp = new Fraction(resaultAddNumerator, resaultAddDenumerator);
        if (getDenumerator() != fraction.getDenumerator()) {
            int valueDenumeratorFirst = getDenumerator();
            int valueDenumeratorSecond = fraction.getDenumerator();
            int counterFirst = 2;
            int counterSecond = 2;
            while (valueDenumeratorFirst != valueDenumeratorSecond) {
                if (valueDenumeratorFirst > valueDenumeratorSecond) {
                    valueDenumeratorSecond = fraction.getDenumerator() * counterFirst;
                    counterFirst++;
                } else if (valueDenumeratorFirst < valueDenumeratorSecond) {
                    valueDenumeratorFirst = getDenumerator() * counterSecond;
                    counterSecond++;
                }
            }
            resaultAddDenumerator = valueDenumeratorSecond;
            resaultAddNumerator = (getNumerator() * (valueDenumeratorFirst / getDenumerator())) +
                    (fraction.getNumerator() * (valueDenumeratorSecond / fraction.getDenumerator()));
            while (resaultAddNumerator % 5 == 0 && resaultAddDenumerator % 5 == 0 ||
                    (resaultAddNumerator % 2 == 0 && resaultAddDenumerator % 2 == 0) ||
                    (resaultAddNumerator % 10 == 0 && resaultAddDenumerator % 10 == 0) ||
                    (resaultAddNumerator % 3 == 0 && resaultAddDenumerator % 3 == 0)) {
                if (resaultAddNumerator % 5 == 0 && resaultAddDenumerator % 5 == 0) {
                    resaultAddNumerator /= 5;
                    resaultAddDenumerator /= 5;
                } else if (resaultAddNumerator % 2 == 0 && resaultAddDenumerator % 2 == 0) {
                    resaultAddNumerator /= 2;
                    resaultAddDenumerator /= 2;
                } else if (resaultAddNumerator % 10 == 0 && resaultAddDenumerator % 10 == 0) {
                    resaultAddNumerator /= 10;
                    resaultAddDenumerator /= 10;
                } else if (resaultAddNumerator % 3 == 0 && resaultAddDenumerator % 3 == 0) {
                    resaultAddNumerator /= 3;
                    resaultAddDenumerator /= 3;
                }
            }

            fractionTemp = new Fraction(resaultAddNumerator, resaultAddDenumerator);
        } else {
            resaultAddNumerator = getNumerator() + fraction.getNumerator();
            fractionTemp = new Fraction(resaultAddNumerator, getDenumerator());
        }
        return fractionTemp;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denumerator=" + denumerator +
                '}';
    }
}
