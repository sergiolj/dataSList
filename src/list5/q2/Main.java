package list5.q2;

import list5.stack.Stack;
import list5.util.PalindromeDetector;

public class Main {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("a");
        pilha.push("osso");
        pilha.push("russo");

        PalindromeDetector pd = new PalindromeDetector();
        while(!pilha.isEmpty()){
            System.out.println(pilha.peek() + " é um palíndromo? [" + pd.isPalindrome(pilha.pop()) + "]");
        }
    }
}
