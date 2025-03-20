package list2;
/*
 * 10 – Desenvolva um método recursivo para calcular o número de Fibonacci de índice N.
 */

public class Fibonacci {
    private int counter=0;

    public String generateFibonacciUpTo(int n) {
        if(n<0) throw new IllegalArgumentException("Invalid number. Must be an natural number");
        if(n == 0) return "[0]";

        int x = 0, y = 1, fib=0;
        StringBuilder str = new StringBuilder("[0,1");
        while((x+y) < n) {
            str.append(",");
            fib = x + y;
            str.append(fib);
            x=y;
            y=fib;
        }
        str.append("]");
        return str.toString();
    }

    public String fibonacciRec(int n, int x, int y) {
        counter++;
        int fib = x + y;
        if(fib >= n) return "";
        return "," + fib + fibonacciRec(n, y ,fib);
    }

    public String generateFibonacciUpToRec(int n) {
        counter = 0;
        if(n<0) throw new IllegalArgumentException("Invalid number. Must be an natural number");
        if(n == 0) return "[0]";
        String result = "[0,1" + fibonacciRec(n, 0, 1) + "]";
        System.out.println("Total recursive calls: " + counter);
        return result;
    }
}
