package list2;

public class Factorial {

    public int factorial(int n) {
        verify(n);
        int result = n;
        if (n == 0 || n == 1) {
            return 1;
        }
        while (n > 1) {
            result = result * (n-1);
            n--;
        }
        return result;
    }

    public int factorialRec(int n) {
        verify(n);
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRec(n-1);
    }

    private void verify(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid input. Only positive integers allowed.");
        }
    }
}
