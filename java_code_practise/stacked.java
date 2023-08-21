package java_code_practise;

import java.util.Stack;

public class stacked {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(25);
        stack.push(30);
        stack.push(445);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
