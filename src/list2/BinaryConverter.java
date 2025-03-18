package list2;

public class BinaryConverter {

    /*
    Method that converts a decimal to binary using a simple String. The binary number is constructed in reverse order,
    as it happens when performing the conversion manually.
    Although converting 'n%2' to String using String.valueOf(n%2) is possible, the + operator automatically handles the
    concatenation, converting the values to String as needed.
    
    However, this method is not recommended, as Strings in Java are immutable. Each concatenation with the `+`
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
    Method using insert method from StringBuilder to create the binary number in the right order.
     */
    public String decimalToBinaryStb(int n) {
        StringBuilder sb = new StringBuilder();
        while (n>0){
            sb.insert(0,n%2); // Method insert puts
            n=n/2;
        }
        return sb.toString();
    }

    public String decimalToBinaryRec(int n) {
        String binary = "";
        if (n == 0){
            return "";
        }
        return decimalToBinaryRec(n/2) + (n%2);
    }

    private String inverterString(String string) {
        if(string.isEmpty()){
            return string;
        }
        return inverterString(string.substring(1))+ string.charAt(0);
    }
}
