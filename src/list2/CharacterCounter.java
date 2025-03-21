package list2;

/*
 * 13 – Escreva um método recursivo que determine quantas vezes um determinado caractere aparece em uma string.
 */

public class CharacterCounter {
    private int counter = 0;

    public int countChar(String word, char character) {
        word = word.toLowerCase();
        character = Character.toLowerCase(character);
        for(Character c : word.toCharArray()) {
            if(c == character) {
                counter++;
            }
        }
        countCharResponse(word, character);
        return counter;
    }

    private void countCharResponse(String word, char character) {
        System.out.println("In the word/sentence ['" + word +"'] the character "+ "['"+ character +
                "'] appears " + counter + " times.");
    }

    private int countCharRec(String word, int n, char character) {
        if(n < 0) {
            countCharResponse(word, character);
            return counter;
        }
        if(word.charAt(n) == character) counter++;
        return countCharRec(word, (n-1), character);
    }

    public int getCharacterCount(String word, char character) {
        counter = 0;
        int n = word.length()-1;
        word = word.toLowerCase();
        character = Character.toLowerCase(character);
        return countCharRec(word,n, character);
    }

    private int countCharRecSimple(String word, int n, char character) {
        if(n < 0) return 0;
        int count = (word.charAt(n) == character) ? 1 : 0;
        return count + countCharRecSimple(word, n-1, character);
    }

    public int getCharacterCountSimple(String word, char character) {
        word = word.toLowerCase();
        String cleanedWord = word.replaceAll("\\s+", "");
        int n = cleanedWord.length()-1;
        character = Character.toLowerCase(character);
        return countCharRecSimple(cleanedWord,n, character);
    }

}
