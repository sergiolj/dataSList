package avaliacao;
/*
 8 – Crie uma função recursiva que calcule a soma dos primeiros N números naturais.
 */

public class SumN {

    public int sum(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumRec(int n) {
        if (n <= 1 ){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        return sumRec(n-1) + n;
    }

    public int sumRecT(int n) {
        return n <= 0 ? 0 : n == 1 ? 1 : sumRecT(n-1) + n;
    }
}
