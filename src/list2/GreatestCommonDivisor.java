package list2;
/*
 * 1 – O método a seguir, executa o cálculo do MDC (máximo divisor comum) de dois inteiros positivos m e n.
 * Escreva um método recursivo equivalente.
 *
public static int CalculaMDC(int m, int n){
    int r;
    do{
        r = m%n;
        m = n;
        n = r;
    } while (r != 0);
    return m;
}
 */
public class GreatestCommonDivisor {

    public int GCDCalc(int m, int n){
        int r;
        do{
            r = m%n;
            m = n;
            n = r;
        } while (r != 0);
        return m;
    }

    public void GCDCalcRecPrint(int m, int n){
        int r;
        r = m%n;
        if(r == 0){
            System.out.println("GCD is: " + n);
            return;
        }
        GCDCalcRecPrint(n,r);
    }

    public int GCDCalcRec(int m, int n){
        if (m%n==0) return n; // Stop condition
        return GCDCalcRec(n,m%n); //Recursive condition
    }
}
