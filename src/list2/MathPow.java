package list2;

/*
 9 – Escreva um método recursivo que calcule a potência de um número, ou seja, dado dois números inteiros base
 e expoente, retorne base^expoente sem usar operadores de multiplicação direta.
 Potência é multiplicação repetida e multiplicação é soma repetida.
 */

public class MathPow {

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public int pow(int a, int b) {
        if (b == 0) return 1;
        int result = a;
        for (int i = 1; i < b; i++) {
            result = multiply(result, a);
        }
        return result;
    }

    public int multiplyRec(int a, int b) {
        if (a == 0 || b == 0) return 0;
        if (b == 1) return a;

        return a + multiplyRec(a , b - 1);
    }

    public int powRec(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;

        return multiplyRec(a,powRec(a , b-1));
        }
    }
