package stacksandqueues.stacks.basicsofstack;
import java.util.*;
public class reversestack {
    public static void insertatbottom(Stack<Integer> st, int top) {
        if (st.isEmpty()) {
            st.push(top);
            return;
        }
        int top1 = st.pop();
        insertatbottom(st, top);
        st.push(top1);
    }
    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1)
            return;
        int top = st.pop();
        reverse(st);
        insertatbottom(st, top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of elements u want in a stack: ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.println("enter the elements: ");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
