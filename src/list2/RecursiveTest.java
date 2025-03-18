package list2;

public class RecursiveTest {
    public static void main(String[] args) {
        var n = new Factorial();

        System.out.println(n.factorial(4));
        System.out.println(n.factorialRec(4));

        var b = new BinaryConverter();
        System.out.println(b.decimalToBinary(25));
        System.out.println(b.decimalToBinaryRec(25));
        System.out.println(b.decimalToBinaryStb(25));
    }
}
