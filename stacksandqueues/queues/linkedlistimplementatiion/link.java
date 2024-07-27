package stacksandqueues.queues.linkedlistimplementatiion;

public class link {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class queuell {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int x) {
            Node temp = new Node(x);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int remove() {
          
            if (head == null) {
                System.out.println("queue is empty");
                return -1;
            } else {
                int val = head.val;
                head = head.next;
                size--;
                return val;
            }
        }

        int peek() {
            if (head == null) {
                System.out.println("queue is empty");
                return -1;
            } else {
                return head.val;
            }
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }

        void display() {
            if(size==0){
                System.out.println("the queue is empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queuell q1 =new queuell();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println("the elements in the queue are: ");
        q1.display();
        System.out.println(q1.peek());
        q1.remove();
        q1.remove();
        System.out.println("the elements in the queue are: ");
        q1.display();
        System.out.println(q1.peek());
        System.out.println("the size of the queue is: ");
        System.out.println(q1.size());
        System.out.println("now the queue is empty or not: ");
        System.out.println(q1.isEmpty());
        System.out.println("now the elements in the queue are: ");
        q1.display();
        q1.remove();
        q1.remove();
        q1.remove();
        System.out.println("the elements in the queue are: ");
        q1.display();
    }
}
