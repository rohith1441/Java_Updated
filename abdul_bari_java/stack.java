package abdul_bari_java;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
       Stack s1 = new Stack();
       Stack<Integer> s2 = new Stack<>();
       s2.push(2);;
       s2.pop();
       s2.push(2);
       s2.push(3);
       System.out.println(s2.peek());
       System.out.println(s2);

    }
}
