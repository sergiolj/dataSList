package list2;
/*
 8 – Crie uma função recursiva que calcule a soma dos primeiros N números naturais.
 */

public class SumN {

    public int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumRec(int n) {
        if (n <= 0 ){
            return 0;
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
