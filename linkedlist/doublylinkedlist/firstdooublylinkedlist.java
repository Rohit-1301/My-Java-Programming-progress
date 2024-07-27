package linkedlist.doublylinkedlist;

public class firstdooublylinkedlist {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;

        }
    }

    public static void displaynode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static Node insertathead(Node x, Node head) {
        x.prev = null;
        x.next = head;
        head.prev = x;
        head = x;
        return head;

    }

    public static Node insertatend(Node y, Node tail) {
        y.next = null;
        y.prev = tail;
        tail.next = y;
        tail = y;
        return tail;
    }

    public static Node deleteat(Node head, int idx) {
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        return head;
    }

    public static int size(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static Node insertatanyindex(Node head, int idx, Node z) {
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next.prev = z;
        z.prev = temp;
        z.next = temp.next;
        temp.next = z;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(89);
        Node b = new Node(97);
        Node c = new Node(45);
        Node d = new Node(54);
        Node e = new Node(63);
        Node f = new Node(10);
        Node g = new Node(32);
        Node h = new Node(99);
        Node i = new Node(81);
        Node j = new Node(75);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = h;
        h.prev = g;
        h.next = i;
        i.prev = h;
        i.next = j;
        j.prev = i;
        displaynode(a);
        System.out.println();
        displayrev(j);
        System.out.println();
        Node x = new Node(100);
        Node head = insertathead(x, a);
        displaynode(head);
        System.out.println();
        Node y = new Node(200);
        Node tail = insertatend(y, j);
        displaynode(tail);
        System.out.println();
        System.out.println("the size of the linked list is: " + size(head));
        Node z = new Node(300);
        head = insertatanyindex(head, 3, z);
        displaynode(head);
        System.out.println();
        Node t = new Node(65);
        head = deleteat(a, 2);
        displaynode(head);
    }
}
