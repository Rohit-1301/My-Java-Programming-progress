package linkedlist.doublylinkedlist;

public class palindromell {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
        }
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

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(0);
        Node c=new Node(0);
        Node d=new Node(1);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        if(isPalindrome(a, d)==true){
            System.out.println("the given doubly linked list is a palindrome");
        }
        else{
            System.out.println("the given doubly linked list is not a palindrome");
        }
    }
}
