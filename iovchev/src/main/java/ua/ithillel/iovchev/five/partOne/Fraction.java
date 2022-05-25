package ua.ithillel.iovchev.five.partOne;

public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    public Fraction addition(Fraction fraction) {
        int newNumerator = numerator * fraction.getDenumerator() + denumerator * fraction.getNumerator();
        int newDenumerator = denumerator * fraction.getDenumerator();
        Fraction newFraction = new Fraction(newNumerator, newDenumerator);
        return newFraction;
    }

    public Fraction multiply(double number) {
        int intNumber = (int) number;
        double decimalPart = number - intNumber;
        String[] str = ("" + number).split("\\.");
        int denumenatorNumber = (int) Math.pow(10, str[1].length());
        int decimalToInt = (int) Math.round(decimalPart * denumenatorNumber);
        int numeratorNumber = intNumber * denumenatorNumber + decimalToInt;

        Fraction newFraction = new Fraction(numerator * numeratorNumber, denumerator * denumenatorNumber);
        return newFraction;
    }

    public Fraction division(double number) {
        int intNumber = (int) number;
        double decimalPart = number - intNumber;
        String[] str = ("" + number).split("\\.");
        int denumenatorNumber = (int) Math.pow(10, str[1].length());
        int decimalToInt = (int) Math.round(decimalPart * denumenatorNumber);
        int numeratorNumber = intNumber * denumenatorNumber + decimalToInt;
        Fraction newFraction = new Fraction(numerator * denumenatorNumber, denumerator * numeratorNumber);
        return newFraction;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenumerator() {
        return denumerator;
    }
}
