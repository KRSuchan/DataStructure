package quiz;

import utils.stack.ListStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketMatch {
    // {(){()}}
    public void solution() throws IOException {
        ListStack<Character> stack = new ListStack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(') stack.push(c);
            else if (c == '}' || c == ')') {
                if (stack.isEmpty()) {
                    System.err.println("Match Error : Extra closing bracket");
                    return;
                }
                char top = stack.pop();
                if ((top == '{' && c != '}') || (top == '(' && c != ')')) {
                    System.err.println("Match Error : Mismatched bracket");
                    return;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.err.println("Match Error : Extra bracket exist");
            System.out.println(stack.peek());
        } else {
            System.out.println("Brackets are all matched!");
        }
    }
}
