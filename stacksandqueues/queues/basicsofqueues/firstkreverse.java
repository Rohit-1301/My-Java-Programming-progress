package stacksandqueues.queues.basicsofqueues;

import java.util.*;

public class firstkreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.println("enter the length of the queue");
        int n = sc.nextInt();
        System.out.println("enter the value of k");
        int k = sc.nextInt();
        System.out.println("enter the elemnts in a queue");
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());

        }
        Queue<Integer> p = new LinkedList<>();
        for (int i = 0; i < n - k; i++) {
            p.add(q.remove());
        }
        while (!p.isEmpty()) {
            q.add(p.remove());
        }
        System.out.println("after implementing the first k reverse element in a queue is: ");
        System.out.println(q);

    }
}