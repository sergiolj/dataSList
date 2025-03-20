package list2;

/**
 * 3 – Escreva em java um método recursivo que receba um número inteiro na base decimal e realize a
 * conversão deste número para base binária.
 */

public class BinaryConverter {

    /*
    Method that converts a decimal to binary using a simple String. The binary number is constructed in reverse order,
    as it happens when performing the conversion manually.
    Although converting 'n%2' to String using String.valueOf(n%2) is possible, the + operator automatically handles the
    concatenation, converting the values to String as needed.
    However, this method is not recommended, as Strings in Java are immutable,  each concatenation with the `+`
    operator creates a new `String` object in every iteration, which can lead to performance issues when the
    number of iterations is large and the resulting String is long.

    The recommended practice is to use StringBuilder, which allows modifying the string content efficiently without
    creating new objects with each concatenation operation.
    */
    public String decimalToBinary(int n) {
        String binary = "";
        while (n>0){
            binary += n%2;
            n=n/2;
        }
        return inverterString(binary);
    }

    /*
    Non-recursive method using insert method from StringBuilder to create the binary number in the correct order.
    The insert method allows inserting a string at a specific position and supports a wide range of data types,
    such as char, int, strings and others.
     */
    public String decimalToBinaryStb(int n) {
        StringBuilder sb = new StringBuilder();
        while (n>0){
            sb.insert(0,n%2); // Method insert puts
            n=n/2;
        }
        return sb.toString();
    }
    /*
    Recursive method with case base equals to zero. In Java, when integers are divided, the result
    is truncated, and the decimal part is discarded. That way when the recursive method are called with zero it stops.
    The return method is a String concatenation which the new division and the binary result of 0 or 1, already in
    reverse order from the manual method point of view.
     */
    public String decimalToBinaryRec(int n) {
        if (n == 0){
            return "";
        }
        return decimalToBinaryRec(n/2) + (n%2);
    }

    /*
    Recursive method used to inverse the string.
    In each new recursive method the CPU try to solve the first part of the problem, launching another recursive method
    with substring 1 to the end of the String and wait for the solution (return call) to do the next part
    (the concatenation string), the first solution to the problem occurs only when the String is empty.
    Therefore, the new String begins with "" (nothing) and concatenate the next String part with the character 0 from
    the initial String.
     */
    private String inverterString(String string) {
        if(string.isEmpty()){
            return "";
        }
        return inverterString(string.substring(1)) + string.charAt(0);
    }
}
