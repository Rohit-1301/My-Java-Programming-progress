package linkedlist.basicsoflinkedlist;

import java.util.*;

public class implement {
    public static class link {
        int data;
        link next;

        public link(int data) {
            this.data = data;
        }
    }

    public static class ll {
        link head = null;
        link tail = null;
        int size = 0;

        void insertatEnd(int data) {
            link temp = new link(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertatHead(int data) {
            link temp = new link(data);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertelement(int idx, int data) {
            link t = new link(data);
            link temp = head;
            if (idx == size) {
                insertatEnd(data);
                return;
            } else if (idx == 0) {
                insertatHead(data);
                return;
            }

            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;

            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getelement(int idx) {
            link temp = head;

            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteelement(int idx) {
            link temp = head;
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        void display() {
            link temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll linkedlist = new ll();
        linkedlist.insertatEnd(98);
        linkedlist.insertatEnd(99);
        linkedlist.insertatEnd(100);
        linkedlist.insertatEnd(894);
        linkedlist.insertatHead(784);
        linkedlist.display();
        System.out.println("the size of the linked list which I created is: " + linkedlist.size);
        linkedlist.insertelement(3, 789);
        linkedlist.display();
        System.out.println("the size of the array after inserting the element is:" + linkedlist.size);

        System.out.println(linkedlist.getelement(3));
        System.out.println("the size of the linked list which I created is: " + linkedlist.size);
        System.out.println("the element at index is" + linkedlist.getelement(4));
        linkedlist.deleteelement(0);
        linkedlist.display();
        System.out.println("the size of the linked list which I created is: " + linkedlist.size);
    }

}
