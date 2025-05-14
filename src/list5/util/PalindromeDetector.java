package list5.util;

/**
 * 7 – Escreva uma função recursiva que determine se uma string é um palíndromo. A função deve ignorar espaços
 * e diferenças entre maiúsculas e minúsculas.
 * Palíndromos são palavras ou frases iguais se lidas em ordem inversa: osso, arara, radar
 * "A torre da derrota", "Anotaram a data da maratona"
 * Números também podem ser palíndromos; 121, 1001, 12321.
 */

public class PalindromeDetector {

    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt((word.length() - 1) - i)) {
                    return false;
            }
        }
        return true;
    }

    public boolean isPalindromeConvertingMethod(String word) {
        word = word.toLowerCase();
        StringBuilder stb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0 ; i--) {
            stb.append(word.charAt(i));
        }
        return word.contentEquals(stb);
    }

    private boolean isPalindromeRec(int i, int f, String word) {
        if (i>=f){
            return true;
        }
        if (word.charAt(i) != word.charAt(f)) {
            return false;
        }
            return isPalindromeRec(i+1 , f-1, word);
    }

    private boolean isPalindromeRecT(int i, int f, String word) {
        return i >= f ? true: word.charAt(i) != word.charAt(f) ? false: isPalindromeRecT(i+1 , f-1, word);
    }

    public String isPalindromeRec(String word) {
        word = word.toLowerCase();
        return isPalindromeRecT(0, word.length() -1, word)?
                "The Word [" + word + "] is a palindrome." : "The Word [" + word + "] is not a palindrome.";
    }

    public String isPalindromeRec(int n) {
        String word = String.valueOf(n);
        return isPalindromeRecT(0, word.length() -1, word)?
                "The Number [" + word + "] is a palindrome." : "The Number [" + word + "] is not a palindrome.";
    }

}
