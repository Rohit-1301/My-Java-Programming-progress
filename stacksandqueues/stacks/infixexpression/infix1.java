package stacksandqueues.stacks.infixexpression;

import java.util.Stack;

public class infix1 {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else if (op.size() == 0) {
                op.push(ch);
            } else {
                if (ch == '+' || ch == '-') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    if (op.peek() == '*')
                        val.push(v1 * v2);
                    if (op.peek() == '/')
                        val.push(v1 / v2);
                    
                }
                if (ch == '*' || ch == '/') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    if (op.peek() == '*' || op.peek() == '/') {
                        if (op.peek() == '*')
                            val.push(v1 * v2);
                        if (op.peek() == '/')
                            val.push(v1 / v2);
                        
                    }
                } 
            }
        }
        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek() == '+')
                val.push(v1 + v2);
            if (op.peek() == '-')
                val.push(v1 - v2);
            if (op.peek() == '*')
                val.push(v1 * v2);
            if (op.peek() == '/')
                val.push(v1 / v2);
            
        }
        System.out.println("the value of the given expression is: ");
        System.out.println(val.peek());
    }
}
