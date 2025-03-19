package list2.recursive.tests;

import list2.recursive.GreatestCommonDivisor;

public class TestGCD {
    public static void main(String[] args) {

        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        System.out.println(gcd.GCDCalc(8,16));

        gcd.CGDCalcRec(8,16);

        System.out.println(gcd.GCDCalc(8,16));

    }
}
