package linkedlist.basicsoflinkedlist;

import java.util.Scanner;

public class displaylist {
    static void display(linked head){
        if(head==null) return;
        System.out.println(head.data);
        display(head.next);
    }
    static void diplayinreverse(linked head){
        if(head==null) return;
        diplayinreverse(head.next);
        System.out.println(head.data);
    }
    static int length(linked head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;

    }
    public static class linked{
        int data;
        linked next;
        public linked(int data){
            this.data=data;
          
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements of the linked list");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
    linked x=new linked(a);
    linked y=new linked(b);
    linked z=new linked(c);
    x.next=y;
    y.next=z;
    System.out.println("linked list in normal order");
        display(x);
        System.out.println("linked lis in reverse order");
        diplayinreverse(x);
        System.out.println("the length of a linked list is: "+length(x));
    }
}
