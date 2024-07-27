package stacksandqueues.queues.basicsofqueues;
import java.util.*;
public class printqueue {
    public static void insertatbottom(Queue<Integer> st, int top) {
        if (st.isEmpty()) {
            st.add(top);
            return;
        }
        int top1 = st.remove();
        insertatbottom(st, top);
        st.add(top1);
    }
    public static void reverse(Queue<Integer> st) {
        if (st.size() == 1)
            return;
        int top = st.remove();
        reverse(st);
        insertatbottom(st, top);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        Queue<Integer> p = new LinkedList<>();
        while(!q.isEmpty()){
            p.add(q.remove());
        }
        System.out.println("the reverse of the queue is: ");
        reverse(p);
    }
}
