package ua.ithillel.natochin.five.partone;

public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction(int numerator, int denumerator){
        this.setNumerator(numerator);
        this.setDenumerator(denumerator);
    }

    public void setNumerator(int number){
        this.numerator = number;
    }
    public void setDenumerator(int number){
        if(number == 0){
            System.out.println(this);
        }
        this.denumerator = number;
    }

    public int getNumerator(){
        return this.numerator;
    }
    public int getDenumerator(){
        return this.denumerator;
    }

    public Fraction addition(Fraction fraction){
        int leastCommMult = leastCommonMultiply(this.getDenumerator(), fraction.getDenumerator());
        int currentMultiplicator = leastCommMult / this.getDenumerator();
        int addMultiplicator = leastCommMult / fraction.getDenumerator();

        int helperDenumerator = leastCommMult;
        int helperNumerator = this.getNumerator()* currentMultiplicator + fraction.getNumerator() * addMultiplicator;

        return new Fraction(helperNumerator,helperDenumerator);
    }

    public Fraction multiply(double multiplier){
        Fraction helper = doubleModified(multiplier);

        int multiNumerator = this.getNumerator() * helper.getNumerator();
        int multiDenumerator = this.getDenumerator() * helper.getDenumerator();

        return new Fraction(multiNumerator, multiDenumerator);
    }

    public Fraction division (double divider) {
        Fraction helper = doubleModified(divider);

        int helperTempNumer = helper.getNumerator();
        helper.setNumerator(helper.getDenumerator());
        helper.setDenumerator(helperTempNumer);

        int multiNumerator = this.getNumerator() * helper.getNumerator();
        int multiDenumerator = this.getDenumerator() * helper.getDenumerator();

        return new Fraction(multiNumerator, multiDenumerator);
    }

    @Override
    public String toString(){
        if(this.getDenumerator() == 0){
            return "Denumenator could not be ZERO";
        }
        return this.getNumerator() + "/" + this.getDenumerator();
    }

    public static int leastCommonMultiply(int num1, int num2){
        int result;
        if (num1 == 0 || num2 == 0) {
            result = 0;
        }
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;

        result = max;

        while (result % min != 0){
            result += max;
        }
        return result;
    }

    public static Fraction doubleModified(double number){
        String helpNum = String.valueOf(number);
        int decimalQty = helpNum.length() - (helpNum.indexOf('.') + 1);

        int helpDenom = 1;
        for(int i = 0; i<decimalQty; i++){
            number *= 10;
            helpDenom *= 10;
        }

        int helpNom = (int) Math.round(number);

        return new Fraction(helpNom,helpDenom);
    }

}


