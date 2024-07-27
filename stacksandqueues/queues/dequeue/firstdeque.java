package stacksandqueues.queues.dequeue;
import java.util.*;
public class firstdeque {
    public static void main(String[] args) {
        Deque q=new LinkedList();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println(q);
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
        q.removeFirst();
        q.removeLast();
        System.out.println(q);
    }
}
