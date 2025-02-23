package list1.tadExerc.models;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator can not be zero!");
        }else{
            this.numerator = numerator;
            this.denominator= denominator;
        }
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator +"/"+ denominator;
    }
}
