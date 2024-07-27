package linkedlist.doublylinkedlist;

public class sumtarget {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
        }
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
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(9);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
       System.out.println(target(a, e, 19));
    }
}
