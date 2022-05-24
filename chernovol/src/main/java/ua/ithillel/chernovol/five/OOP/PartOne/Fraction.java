package ua.ithillel.chernovol.five.OOP.PartOne;
/**
 * @author Chernovol Alexander
 */
public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }
    //Метод сложения дробей
    public Fraction addition(Fraction fraction) {

        Fraction fr = new Fraction(0, 0);

        if (this.denumerator == fraction.denumerator) {
            fr.numerator = this.numerator + fraction.numerator;
            fr.denumerator = this.denumerator;
        } else {
            int lcd = (this.denumerator > fraction.denumerator) ? this.denumerator : fraction.denumerator;
            int increaseLcd = lcd;
            while (true) {
                if (lcd % this.denumerator == 0 && lcd % fraction.denumerator == 0) {
                    fr.numerator = (this.numerator * (lcd / this.denumerator)) +
                            (fraction.numerator * (lcd / fraction.denumerator));
                    fr.denumerator = lcd;
                    break;
                } else {
                    lcd = lcd + increaseLcd;
                }
            }
            fr.cutFraction();
        }
        return fr;
    }
    //Метод сокращения дроби
    public Fraction cutFraction() {
        int commonDivisor = (this.numerator > this.denumerator) ? this.numerator : this.denumerator;
        while (true) {
            if (this.numerator % commonDivisor == 0 && this.denumerator % commonDivisor == 0) {
                this.numerator = this.numerator / commonDivisor;
                this.denumerator = this.denumerator / commonDivisor;
                break;
            } else {
                commonDivisor--;
            }
        }
        return this;
    }
    //Метод умножения дроби на число
    public Fraction multiplay(double value){
        Fraction fr = new Fraction(0,0);
        fr.numerator = (int) (this.numerator * value);
        fr.denumerator = this.denumerator;
        return fr;
    }
    //Метод деления дроби на число
    public Fraction division(double value){
        Fraction fr = new Fraction(0,0);
        fr.numerator = (int) (this.numerator / value);
        fr.denumerator = this.denumerator;
        return fr;
    }

    @Override
    public String toString() {
        return numerator + "\n--\n" + denumerator;
    }
}
