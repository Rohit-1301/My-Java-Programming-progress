package linkedlist.impoflinkedlist;



public class nthnodefromend {
    //finding nth node from the end without using fast slow approach
    // public static Node findnth(Node head,int n){
        
    //     Node temp=head;
    //     int count=0;
    //     while(temp!=null){
    //         count++;
    //         temp=temp.next;
         
    //     }
    //     temp=head;
    //     int m=count-n+1;
    //     for(int i=1;i<=m-1;i++){
    //         temp=temp.next;
    //     }
    //     return temp;
    // }
    // this is the fast slow approach for traversing in a linked list and it is the template for me to understand it
    public static Node findnth(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            
        }

    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        
        Node x=findnth(a,3);
        System.out.println(x.data);

    }
}
