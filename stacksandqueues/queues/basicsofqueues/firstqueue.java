package stacksandqueues.queues.basicsofqueues;

import java.util.*;

public class firstqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println("the queue which I implemented is: "+q);
        System.out.println("the size of the queue is: "+q.size());
        System.out.println("the first element of the queue is: "+q.peek());
        System.out.println("the first element of the queue is: "+q.element());
        System.out.println("the first element of the queue is: "+q.remove());
        System.out.println("the first element of the queue is: "+q.poll());
        System.out.println("the first element of the queue is: "+q.element());
        System.out.println("now queue is empty or not: "+q.isEmpty());
       System.out.println(q.size());
    }
}
