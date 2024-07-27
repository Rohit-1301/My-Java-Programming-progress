package stacksandqueues.stacks.interviewproblems;

import java.util.*;

public class balancedbrackets {
    public static boolean isbalanced(String str) {
        int n = str.length();
        boolean flag = true;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == '('|| c=='{' || c=='[') {
                st.push(c);
            } else if (c == ')' || c=='}' || c==']') {
                if (st.isEmpty()) {
                    flag = false;
                    return flag;
                }
                if (st.peek() == null) {
                    flag = false;
                    return flag;
                }
                if (st.peek() == '(' || st.peek()=='{' || c=='[') {
                    st.pop();
                }
            }

        }
        if (st.size() > 0) {
            flag = false;
            return flag;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elemnts in a stack: ");
        String str = sc.nextLine();
        System.out.println("the elements in a stack is: ");
        System.out.println(str);
        if (isbalanced(str) == true) {
            System.out.println("the given stack of string  is balanced");
        } else {
            System.out.println("the given stack of string is not balanced");
        }
    }
}
