import utils.stack.ArrayStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>();
        stack.push("apple");
        System.out.println(stack.peek());
        System.out.println(stack.getSize());
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
    }
}