package stacksandqueues.stacks.interviewproblems;
import java.util.*;
public class nexxtgreater {
    public static Stack<Integer> nextGreaterElement(int a[]) {
        Stack<Integer> st = new Stack<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean foundGreater = false;
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    st.push(a[j]);
                    foundGreater = true;
                    break;
                }
            }
            if (!foundGreater) {
                st.push(-1);
            }
        }
        return st;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in a stack: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in a stack:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(nextGreaterElement(a));
    }
}
