package stacksandqueues.stacks.basicsofstack;

import java.util.*;

public class displaystackusingarray {
    public static void displayrecursivelyreverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");
        displayrecursivelyreverse(st);
        st.push(top);
    }

    public static void displayrecursively(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        displayrecursively(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void insertatbottom(Stack<Integer> st, int idx) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        System.out.print(idx + " ");
        displayrecursively(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void insertatend(Stack<Integer> st, int idx) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        displayrecursively(st);
        System.out.print(top + " ");
        st.push(top);
        System.out.print(idx + " ");
    }

    public static void popfromanyindex(Stack<Integer> st, int idx) {
        if (st.isEmpty()) {
            return;
        }
        Stack<Integer> rt = new Stack<>();
        while (st.size() != idx) {
            rt.push(st.pop());
        }
        int top = st.pop();
        System.out.println("the elemment which u remove from index " + idx + " is: " + top);
        while (!rt.isEmpty()) {
            st.push(rt.pop());
        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of elements u want in a stack");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.println("enter the elements in the stack");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        System.out.println("printing stack using an array: ");
        int a[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            a[i] = st.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
            st.push(a[i]);
        }
        System.out.println();
        System.out.println("printing stack in a veverse order using recusrsion: ");
        displayrecursivelyreverse(st);
        System.out.println();
        System.out.println("printing stack in a normal order using recursion: ");
        displayrecursively(st);
        System.out.println();
        System.out.println("the element which u want to insert at the bottom is: ");
        int idx = sc.nextInt();
        insertatbottom(st, idx);
        System.out.println();
        System.out.println("the element which u want to insert at the end is: ");
        int idx1 = sc.nextInt();
        insertatend(st, idx1);
        System.out.println();
        System.out.println("enter the index by whiich u want to remove an element");
        int idx2 = sc.nextInt();
        popfromanyindex(st, idx2);
    }
}
