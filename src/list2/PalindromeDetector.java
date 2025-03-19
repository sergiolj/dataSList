package list2;

/**
 * 7 – Escreva uma função recursiva que determine se uma string é um palíndromo. A função deve ignorar espaços
 * e diferenças entre maiúsculas e minúsculas.
 * Palíndromos são palavras ou frases iguais se lidas em ordem inversa: osso, arara, radar
 * "A torre da derrota", "Anotaram a data da maratona"
 * Números também podem ser palíndromos; 121, 1001, 12321.
 */

public class PalindromeDetector {

    public boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt((word.length() - 1) - i)) {
                    return false;
            }
        }
        return true;
    }

    public boolean isPalindromeRec(String word) {
        int len = word.length();
        if (len <= word.length()/2){
            return true;
        }else{
            return isEqual(word.charAt(0) , word.charAt(len));
        }
    }

    private boolean isEqual(char a, char b) {
        return a == b;
    }
}
