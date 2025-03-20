package list2;

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

    public void CGDCalcRec(int m, int n){
        int r;
        r = m%n;
        if(r == 0){
            System.out.println("GCD is: " + n);
            return;
        }
        CGDCalcRec(n,r);
    }

    public int GCDCalcRec(int m, int n){
        if (n==0) return n; // Stop condition
        return GCDCalcRec(n,m%n); //Recursive condition
    }
}
