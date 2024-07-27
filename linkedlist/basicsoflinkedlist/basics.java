package linkedlist.basicsoflinkedlist;

import java.util.Scanner;

public class basics {
    public static class Link {
        int data;
        Link next;

        public Link(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        Link x = new Link(5);
        Link y = new Link(10);
        Link z = new Link(15);
        System.out.println("linked list without linking data sets");
        System.out.println(x.data);
        System.out.println(x.next);
        System.out.println(y.data);
        System.out.println(y.next);
        System.out.println(z.data);
        System.out.println(z.next);
        x.next = y;
        y.next = z;
        z.next=x;
        System.out.println("linked list with linking data sets");
        System.out.println(x.data);
        System.out.println(x.next);
        System.out.println(y.data);
        System.out.println(y.next);
        System.out.println(z.data);
        System.out.println(z.next);
    }
}
