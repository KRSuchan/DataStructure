import utils.stack.ListStack;

public class Main {
    public static void main(String[] args) {
        ListStack<String> stack = new ListStack<String>();
        stack.push("apple");
        System.out.println(stack.peek());
        System.out.println(stack.getSize());
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
    }
}