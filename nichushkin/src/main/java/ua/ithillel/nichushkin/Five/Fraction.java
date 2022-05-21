package ua.ithillel.nichushkin.Five;
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
        Fraction fractionTemp;
        int valueDenumeratorFirst = getDenumerator();
        int valueDenumeratorSecond = fraction.getDenumerator();
        int counterFirst = 2;
        int counterSecond = 2;
        if (getDenumerator() != fraction.getDenumerator()) {
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

            fractionTemp = reduction(resaultAddNumerator, resaultAddDenumerator);
        } else {
            resaultAddNumerator = getNumerator() + fraction.getNumerator();
            fractionTemp = new Fraction(resaultAddNumerator, getDenumerator());
        }
        return fractionTemp;
    }

//        - Метод `multiply`. Метод принимает число типа `double` и производит умножение текущей дроби (та, у которой
//        был вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`, в котором находится результат
//        умножения.

    public Fraction multiply(double valueDouble) {
        double valueNumerator = valueDouble;
        int valueDenumerator = 1;
        int[] arrayTemp = realFractional(valueNumerator, valueDenumerator);
        int resaultMultiplyNumerator = arrayTemp[0] * getNumerator();
        int resaultAddDenumerator = arrayTemp[1] * getDenumerator();
        return reduction(resaultMultiplyNumerator, resaultAddDenumerator);
    }

    //        - Метод `division`. Метод принимает число типа `double` и производит деление текущей дроби (та, у которой был
//        вызван метод) на число. Метод должен вернуть новый объект класса `Fraction`, в котором находится результат
//        деления.
    public Fraction division(double valueDouble) {
        double valueNumerator = valueDouble;
        int valueDenumerator = 1;
        int[] arrayTemp = realFractional(valueNumerator, valueDenumerator);
        int resaultDivisionNumerator = getNumerator() * arrayTemp[1];
        int resaultDivisionDenumerator = getDenumerator() * arrayTemp[0];
        return reduction(resaultDivisionNumerator, resaultDivisionDenumerator);
    }

    public Fraction reduction(int resaultNumerator, int resaultDenumerator) {
        if (resaultDenumerator != 0) {
            while (resaultNumerator % 5 == 0 && resaultDenumerator % 5 == 0 ||
                    (resaultNumerator % 2 == 0 && resaultDenumerator % 2 == 0) ||
                    (resaultNumerator % 10 == 0 && resaultDenumerator % 10 == 0) ||
                    (resaultNumerator % 3 == 0 && resaultDenumerator % 3 == 0)) {
                if (resaultNumerator % 5 == 0 && resaultDenumerator % 5 == 0) {
                    resaultNumerator /= 5;
                    resaultDenumerator /= 5;
                } else if (resaultNumerator % 2 == 0 && resaultDenumerator % 2 == 0) {
                    resaultNumerator /= 2;
                    resaultDenumerator /= 2;
                } else if (resaultNumerator % 10 == 0 && resaultDenumerator % 10 == 0) {
                    resaultNumerator /= 10;
                    resaultDenumerator /= 10;
                } else if (resaultNumerator % 3 == 0 && resaultDenumerator % 3 == 0) {
                    resaultNumerator /= 3;
                    resaultDenumerator /= 3;
                }
            }
        } else {
            System.out.println("На ноль делить нельзя");
        }
        return new Fraction(resaultNumerator, resaultDenumerator);
    }

    public int[] realFractional(double valueNumerator, int valueDenumerator) {
        int[] arrayTemp;
        while (valueNumerator % 1 != 0) {
            int tempValue = 10;
            valueDenumerator *= tempValue;
            valueNumerator *= tempValue;
        }
        return new int[]{(int) valueNumerator, valueDenumerator};
    }

    @Override
    public String toString() {
        return "numerator = " + numerator +
                ", denumerator = " + denumerator;
    }
}
