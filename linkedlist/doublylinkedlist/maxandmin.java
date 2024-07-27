package linkedlist.doublylinkedlist;
import java.util.*;
public class maxandmin {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
        }
    }
    public static int min(Node head){
        Node temp=head;
        Node max=head;
        Node min=head;
        while(temp.next!=null){
            temp=temp.next;
            if(temp.data>temp.prev.data&&temp.data>temp.next.data){
                max=temp;
                break;
            }
           
        }
        while(temp.next!=null){
            temp=temp.next;
            if(temp.data<temp.prev.data&&temp.data<temp.next.data){
                min=temp;
                break;
            }
        }
        int mindistance=0;
        while(max!=min){
            mindistance++;
            max=max.next;

        }
        return mindistance;
    }
    public static int max(Node head,Node tail){
        Node t=head;
        Node h=tail;
        Node max=head;
        Node min=tail;
        int maxdistance=0;
        while(t.next!=null){
            t=t.next;
            if(t.data>t.prev.data&&t.data>t.next.data){
                max=t;
                break;
            }
        }
        while(h.prev!=null){
            h=h.prev;
            if(h.data<h.prev.data&&h.data<h.next.data){
                min=h;
                break;
            }
        }
        while(t!=h){
            maxdistance++;
            t=t.next;
            
        }
        return maxdistance;
    }
    public static boolean isPalindrome(Node head,Node tail){
        while(head!=tail){
            if(head.data!=tail.data){
                return false;
            }
            head=head.next;
            tail=tail.prev;
        }
        return true;
    }
    public static boolean target(Node head,Node tail,int target){
        while(head.data<tail.data){
            if(head.data+tail.data==target){
                return true;
                
            }
            if(head.data+tail.data>target){
                tail=tail.prev;
            }
            if(head.data+tail.data<target){
                head=head.next;
            }

        }
        return false;
       
  }
    public static void main(String[] args) {
        
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(5);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(7);
        Node g=new Node(8);
        Node h=new Node(9);
        Node i=new Node(1);
        Node j=new Node(10);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=g;
        g.prev=f;
        g.next=h;
        h.prev=g;
        h.next=i;
        i.prev=h;
        i.next=j;
        j.prev=i;
        System.out.println("the minimum distance between two critical maxima and minima is: "+min(a));
        System.out.println("the maximum distance between two critical maxima and minima is: "+max(a,j));
        System.out.println("enter the target which u want to check in ana linked list");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        if(target(a, j, target)==true){
            System.out.println("the target is present in the linked list");
        }
        else{
            System.out.println("the target is not present in the linked list");
        }
        Node x=new Node(1);
        Node y=new Node(0);
        Node z=new Node(1);
        x.next=y;
        y.prev=x;
        y.next=z;
        z.prev=y;
        if(isPalindrome(x, z)==true){
            System.out.println("the given doubly linked list is a palindrome");
        }
        else{
            System.out.println("the given doubly linked list is not a palindrome");
        }
}
}
