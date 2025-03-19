package list2;

public class RecursiveTest {
    public static void main(String[] args) {

        var f = new Factorial();

        System.out.println(f.factorial(4));
        System.out.println(f.factorialRec(4));

        var b = new BinaryConverter();

        System.out.println(b.decimalToBinary(25));
        System.out.println(b.decimalToBinaryRec(25));
        System.out.println(b.decimalToBinaryStb(25));

        var s = new SumDigitNumber();

        System.out.println(s.sumDigits(1234));
        System.out.println(s.recursiveSum(1234));
        s.recursiveSumSimplerCode(1234);

        var c = new Count();

        c.printList(10);
        System.out.println(c.getList(10));

        var cd = new Countdown();
        System.out.println(cd.countDown(10, Countdown.Method.FOR));
        System.out.println(cd.countDown(10, Countdown.Method.RECURSIVE));
        System.out.println(cd.countDown(10, Countdown.Method.RTERNARY));

        var pl = new PalindromeDetector();
        System.out.println(pl.isPalindrome("osso"));
        System.out.println(pl.isPalindrome("russo"));

    }
}
