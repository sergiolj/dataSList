package list5.stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");
        stack.push("Sixth");
        
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.getSize());

        System.out.println(stack.getBottom());
        System.out.println(stack.getTop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
