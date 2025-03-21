package list2;
/*
 * 15 – Escreva um método recursivo para calcular o mínimo múltiplo comum (MMC) de dois números inteiros positivos.
 */

public class LeastCommonMultiple {

    private GreatestCommonDivisor gcd = new GreatestCommonDivisor();

    public int getLeastCommonMultiple(int x, int y){
        if (x == 0 || y == 0) return 0;
        return Math.abs(x * y) / gcd.GCDCalc(x, y);
    }

    public int getLeastCommonMultipleRec(int x, int y) {
        if (x == 0 || y == 0) return 0;
        int gcdResult = gcd.GCDCalcRec(x, y);
        return Math.abs(x * y) / gcdResult;
    }

}
