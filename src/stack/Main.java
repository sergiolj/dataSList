package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Pilha vazia com o método empty da Stack? %b\n" + stack.empty());
        System.out.println("Pilha vazia com o método isEmpty do Vector %d\n" + stack.isEmpty());

        stack.push("Jhon Doe");
        stack.push("Maria");
        stack.push("Jane");
        stack.push("Jose");
        stack.push("Jessica");
        System.out.println("Estado da pilha: ");
        if(!stack.empty()){
            System.out.println("Pilha possui elementos");
            System.out.println("Pilha: " + stack);
            System.out.println("Pilha possui " + stack.size() + " elementos");
        }else{
            System.out.println("Pilha está vazia");
        }

        System.out.println(stack.peek());
        stack.remove(stack.peek());
    }
}
