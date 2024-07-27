package stacksandqueues.stacks.interviewproblems;

import java.util.*;

public class nextgreaterelement {
    public static Stack nextgreaterelement(int a[]) {
        Stack<Integer> st = new Stack<>();
        int n = a.length;
        for(int i=n-2;i>=2;i--){
            while(st.peek()<a[i+1] && st.size()>0){
                st.pop();
            }
           if(st.size()==0) st.push(-1);
           else st.push(a[i+1]);
           st.push(a[i]);

        }
        return st;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elemnts u w ant in a stack: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elemet in a stack");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(nextgreaterelement(a));

    }
}
