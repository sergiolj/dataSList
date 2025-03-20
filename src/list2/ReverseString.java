package list2;

/*
 * 11 – Escreva um método recursivo que inverta uma string.
 */
public class ReverseString {

    public String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String reverseRec(String str) {
        if(str.isEmpty()) return str;
        return reverseRec(str.substring(1)) + str.charAt(0);
    }
}
