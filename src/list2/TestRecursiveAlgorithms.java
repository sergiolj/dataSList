package list2;

import list2.util.ArrayInt;

public class TestRecursiveAlgorithms {
    public static void main(String[] args) {

        var gcd = new GreatestCommonDivisor();
        System.out.println("\nExercício 1 - Maior divisor comum");

        System.out.println(gcd.GCDCalc(12,18));
        gcd.CGDCalcRec(12,18);
        System.out.println(gcd.GCDCalc(12,18));


        var f = new Factorial();
        System.out.println("\nExercício 2 - Fatorial de um número");

        System.out.println(f.factorial(4));
        System.out.println(f.factorialRec(4));

        var b = new BinaryConverter();
        System.out.println("\nExercício 3 - Conversão Decimal - Binário");

        System.out.println(b.decimalToBinary(25));
        System.out.println(b.decimalToBinaryRec(25));
        System.out.println(b.decimalToBinaryStb(25));

        var s = new SumDigitNumber();
        System.out.println("\nExercício 4 - Soma de algarismos");

        System.out.println(s.sumDigits(1234));
        System.out.println(s.recursiveSum(1234));
        s.recursiveSumSimplerCode(1234);

        var c = new Count();
        System.out.println("\nExercício 5 - Inteiros de 1 à n");

        c.printList(10);
        System.out.println(c.getList(10));

        var cd = new Countdown();
        System.out.println("\nExercício 6 - Contagem regressiva");

        System.out.println(cd.countDown(10, Countdown.Method.FOR));
        System.out.println(cd.countDown(10, Countdown.Method.RECURSIVE));
        System.out.println(cd.countDown(10, Countdown.Method.RTERNARY));

        var pl = new PalindromeDetector();
        System.out.println("\nExercício 7 - Verificador de Palíndromos em String e Int");

        System.out.println(pl.isPalindrome("osso"));
        System.out.println(pl.isPalindrome("russo"));

        System.out.println(pl.isPalindromeConvertingMethod("Osso"));
        System.out.println(pl.isPalindromeConvertingMethod("Russo"));

        System.out.println(pl.isPalindromeRec("Osso"));
        System.out.println(pl.isPalindromeRec("Russo"));

        System.out.println(pl.isPalindromeRec(12121));
        System.out.println(pl.isPalindromeRec(123));

        var sn = new SumN();
        System.out.println("\nExercício 8 - Soma de números naturais");

        System.out.println(sn.sum(3));
        System.out.println(sn.sumRec(3));

        var mp = new MathPow();
        System.out.println("\nExercício 9 - Calcular potência sem multiplicação");

        System.out.println(mp.multiply(2,3));
        System.out.println(mp.pow(3,2));

        System.out.println(mp.multiplyRec(2,3));
        System.out.println(mp.powRec(3,2));

        var fib = new Fibonacci();
        System.out.println("\nExercício 10 - Fibonacci");

        System.out.println(fib.generateFibonacciUpTo(10));
        System.out.println(fib.generateFibonacciUpToRec(10));

        var rev = new ReverseString();
        System.out.println("\nExercício 11 - Reverse String");

        System.out.println(rev.reverse("Sauron"));
        System.out.println(rev.reverseRec("Sauron"));

        var list = new ArrayInt(5,10);
        var sum = new SumArrayInt(list);
        System.out.println("\nExercício 12 - Soma de elementos de array");
        System.out.println(list.toString());
        System.out.println(sum.sum());
        System.out.println(sum.sumRec());

        var word = new CharacterCounter();
        System.out.println("\nExercício 13 - Conta quantas vezes determinado caractere aparece na palavra");
        System.out.println(word.countChar("O rato roeu a roupa do Rei de Roma", 'R'));
        System.out.println(word.getCharacterCount("O rato roeu a roupa do Rei de Roma", 'R'));
        System.out.println(word.getCharacterCountSimple("O rato roeu a roupa do Rei de Roma", 'R'));

        var list2 = new ArrayInt(9,100);
        var higher  = new HigherNumber(list2);
        System.out.println("\nExercício 14 - Encontra o maior número do vetor");
        System.out.println(list2.toString());
        System.out.println(higher.getHigherNumber());
        System.out.println(higher.getHigherNumberRec());
        System.out.println(higher.getHigherNumberGPT());

        var calc = new LeastCommonMultiple();
        System.out.println("\nExercício 15 -Mínimo múltiplo comum MMC");
        System.out.println(calc.getLCM(12,23));
    }
}
